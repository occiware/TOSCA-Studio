package org.eclipse.cmf.occi.tosca.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Annotation;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.tosca.ToscaFactory;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_compute;
import org.eclipse.cmf.occi.tosca.config.LinkManager.LinkToDo;
import org.modmacao.placement.Placementlink;

import extendedtosca.Tosca_nodes_apache;
import extendedtosca.impl.Tosca_nodes_apacheImpl;

public class NodeTemplateReader {

	private Configuration configuration;

	private List<String> alreadyDefinedMixinBase; // we use the key of the yml file

	public NodeTemplateReader(Configuration configuration) {
		this.configuration = configuration;
		this.alreadyDefinedMixinBase = new ArrayList<>();
	}

	@SuppressWarnings("all")
	public void read(String key, Map<String, ?> node_templates) throws Exception {
		Map<String, ?> node_map = (Map<String, ?>) node_templates.get(key);
		String typeName = (String) node_map.get("type");
		if (typeName == null) {
			return;
		}

		MixinBase node = Main.instanciateCorrectMixinBaseFromTypeName(typeName);
		if (this.alreadyDefinedMixinBase.contains(key)) {
			System.out.println(key + " is already defined, skipping...");
			return;
		} else if (node == null) {
			System.out.println("Something went wrong with " + typeName + "...");
			return;
		} else {
			this.alreadyDefinedMixinBase.add(key);
		}
		IsAppliedToComponentChecker manager = new IsAppliedToComponentChecker(node);
		if (manager.check() && !(node instanceof Tosca_nodes_compute)) {
			Resource component = Main.applicationAndComponentManger.createComponentAndLinks(key);
			component.getParts().add(node);
			component.setTitle(key);
			if (node_map.get("requirements") != null && node_map.get("requirements") instanceof List) {
				for (Map<String, ?> requirement : (List<Map>) node_map.get("requirements")) {
					if (requirement.containsKey("host")) {
						String nameOfTheHost = (String) requirement.get("host");
						if (!node_templates.containsKey(nameOfTheHost)) {
							throw new RuntimeException(nameOfTheHost + " is not defined in the templates map!");
						}
						this.read(nameOfTheHost, node_templates);
						Resource hostResource = Main.applicationAndComponentManger.getComponent(nameOfTheHost);
						if (hostResource != null) {
							// in this case, the host is a mixin applied to a component.
							// we then applied the current Mixin to the same component
							Main.applicationAndComponentManger.linkComponentsAndGivenMixin(component, hostResource,
									ToscaFactory.eINSTANCE.createTosca_relationships_hostedon());
							Main.linkManager.linksToDo
									.add(new LinkToDo(key, Main.applicationAndComponentManger.getComponentByName(),
											nameOfTheHost, Main.linkManager.targetOfPlacementByNameOfSource,
											(Link) OcciHelper.createEntity(OcciHelper.getKindByTerm(
													OcciHelper.loadExtension("http://schemas.modmacao.org/placement#"),
													"placementlink"))));
						} else {
							Link placementLink = (Link) OcciHelper.createEntity(OcciHelper.getKindByTerm(
									OcciHelper.loadExtension("http://schemas.modmacao.org/placement#"),
									"placementlink"));
							placementLink.setSource(component);
							placementLink.setTarget(this.resourcesByKey.get(nameOfTheHost));
							Main.linkManager.targetOfPlacementByNameOfSource.put(key,
									this.resourcesByKey.get(nameOfTheHost));
						}
					}
				}
			}
		}
		if (node_map.get("requirements") != null && node_map.get("requirements") instanceof List) {
			for (Map<String, ?> requirement : (List<Map>) node_map.get("requirements")) {
				if (requirement.containsKey("database")) {
					Main.linkManager.addLinkToDo((String) ((Map<String, ?>) requirement.get("database")).get("node"),
							key);
				} else if (requirement.containsKey("php")) {
					Main.linkManager.addLinkToDo((String) ((Map<String, ?>) requirement.get("php")).get("node"), key);
				}
			}
		}
		if (node == null) {
			System.err.println("Something bad happenned when we tried to instanciate " + typeName);
			return;
		}
		List<Entity> entities = readApplies(node.getMixin());
		if (entities.size() > 1) {
			System.out.println("More than one resource for " + node.getMixin().getName());
		}
		if (entities.isEmpty()) {
			System.err.println("Should not happen! No applies found for " + node.getMixin().getName());
		} else {
			entities.get(0).getParts().add(node);
		}
		for (Entity entity : entities) {
			if (entity instanceof Resource
					&& (((Resource) entity).getKind().getTerm().equals("resource") && !entity.getParts().isEmpty()
							|| !((Resource) entity).getKind().getTerm().equals("resource"))) {
				configuration.getResources().add((Resource) entity);
				((Resource) entity).setTitle(key);
				this.resourcesByKey.put(key, (Resource) entity);
			}
		}

		// setting default value using annotations, if so
		System.out.println(node.getMixin().getName());
		System.out.println(node.getMixin().getAnnotations());
		System.out.println(
				Main.instanciateCorrectMixinBaseFromTypeName(node.getMixin().getName()).getMixin().getAnnotations());
		for (Annotation annotation : node.getMixin().getAnnotations()) {
			if (annotation.getKey().startsWith("default-value")) {
				try {
					PropertyReader.invokeRightMethod(node.getClass(), 
							PropertyReader.buildCorrectSetterName(
									annotation.getKey().substring("default-value".length() + 1)
							),
							annotation.getValue(), node
					);
					System.out.println("Using Annotation to set a default");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		if (node_map.get("properties") != null && node_map.get("properties") instanceof Map) {
			PropertyReader.readProperties(node, (Map<String, ?>) node_map.get("properties"));
		}
		if (node_map.get("capabilities") != null && node_map.get("capabilities") instanceof Map) {
			readCapabilities(node, (Map<String, ?>) node_map.get("capabilities"));
		}
	}

	private Attribute findAttribute(String attributeNameToFind, Mixin currentMixin) throws Exception {
		for (Attribute attribute : currentMixin.getAttributes()) {
			if (attributeNameToFind.equals(attribute.getName())) {
				return attribute;
			}
		}
		for (Mixin depend : currentMixin.getDepends()) {
			return findAttribute(attributeNameToFind,
					Main.instanciateCorrectMixinBaseFromTypeName(depend.getName()).getMixin());
		}
		return null;
	}

	private Map<String, Resource> resourcesByKey = new HashMap<String, Resource>();

	@SuppressWarnings("unchecked")
	private void readCapabilities(MixinBase node, Map<String, ?> capabilities) throws Exception {
		for (String capability : capabilities.keySet()) {
			if (!(capabilities.get(capability) instanceof Map)) {
				continue;// it is equals to null
			}
			Map<String, ?> capabilityMap = (Map<String, ?>) capabilities.get(capability);
			if (!(capabilityMap.get("properties") instanceof Map)) {
				continue;// it is equals to null
			}
			Map<String, ?> properties = (Map<String, ?>) capabilityMap.get("properties");
			if (properties != null) {
				PropertyReader.readProperties(node, properties);
			}
		}
	}

	private List<Entity> readApplies(Mixin mixin) throws Exception {
		List<Entity> entities = new ArrayList<>();
		for (Kind kind : mixin.getApplies()) {
			Entity entity = OcciHelper.createEntity(kind);
			entity.setKind(kind);
			entities.add(entity);
		}
		return entities;
	}

}
