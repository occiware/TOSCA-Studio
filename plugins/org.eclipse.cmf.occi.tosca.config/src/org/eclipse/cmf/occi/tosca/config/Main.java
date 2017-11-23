package org.eclipse.cmf.occi.tosca.config;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.tosca.ToscaFactory;
import org.eclipse.cmf.occi.tosca.config.Mapper.Mapping;
import org.eclipse.cmf.occi.tosca.config.Mapper.MappingToCreateType;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.esotericsoftware.yamlbeans.YamlReader;
import extendedtosca.ExtendedtoscaFactory;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class Main extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String pathOfDirectory = "C:/Users/schallit/workspace-tosca/plugins/org.eclipse.cmf.occi.tosca.examples/tosca-topologies/";
		String[] yamlFilesPath = new File(pathOfDirectory).list();
		for (String yamlFilePath : yamlFilesPath) {
			readYamlFile(pathOfDirectory + "/" + yamlFilePath);
		}
		return null;
	}

	private static void readYamlFile(String path) {
		try {
			YamlReader reader = new YamlReader(new FileReader(path));
			System.out.println(path);
			Map<String, ?> yamlFileAsMap = (Map<String, ?>) reader.read();
			Configuration configuration = ConfigManager.createConfiguration(path);
			Map<String, ?> topology_template = (Map<String, ?>) yamlFileAsMap.get("topology_template");
			if (topology_template.get("description") != null) {
				configuration.setDescription((String) topology_template.get("description"));
			}
			readNodeTemplate(configuration, (Map<String, ?>) topology_template.get("node_templates"));
			ConfigManager.save();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static void readNodeTemplate(Configuration configuration, Map<String, ?> node_templates) throws Exception {
		for (String key : node_templates.keySet()) {
			Map<String, ?> node_map = (Map<String, ?>) node_templates.get(key);

			// setting type, using Mapper.mappingOfType
			String typeName = (String) node_map.get("type");

			String methodNameToCreate = "create" + Character.toUpperCase(typeName.charAt(0))
					+ typeName.substring(1).replaceAll("\\.", "_").toLowerCase();
			MixinBase node = null;
			try {
				node = (MixinBase) ExtendedtoscaFactory.class.getMethod(methodNameToCreate)
						.invoke(ExtendedtoscaFactory.eINSTANCE);
			} catch (NoSuchMethodException e1) {
				try {
					node = (MixinBase) ToscaFactory.class.getMethod(methodNameToCreate).invoke(ToscaFactory.eINSTANCE);
				} catch (NoSuchMethodException e2) {
					System.err.println("Could not find the method " + methodNameToCreate + " in the TOSCA Factory");
					MappingToCreateType mapping = Mapper.mappingOfType.get(typeName);
					if (mapping == null) {
						System.err.println("Must add a mapping for " + typeName);
						return;
					}
					node = (MixinBase) mapping.invoke();
				}
			}

			// parsing capabilities
			if (node_map.get("capabilities") != null) {
				readCapabilities(node, (Map<String, ?>) node_map.get("capabilities"));
			}

			List<Entity> entities = readApplies(configuration, node.getMixin(), new ArrayList<>());
			entities.get(0).getParts().add(node);
			for (Entity entity : entities) {
				if (entity instanceof Resource) {
					configuration.getResources().add((Resource) entity);
				}
			}
		}
	}

	private static List<Entity> readApplies(Configuration configuration, Mixin mixin,
			List<Mixin> mixinsToBeAddedToResource) {
		for (Kind kind : mixin.getApplies()) {
			Entity entity = null;
			for (Resource resource : configuration.getResources()) {
				if (kind.getTerm().equals(resource.getKind().getTerm())) {
					entity = resource;
					break;
				}
			}
			if (entity == null) {
				entity = OcciHelper.createEntity(kind);
			}
			entity.setKind(kind);
			for (Mixin mixinToBeAdded : mixinsToBeAddedToResource) {
				List<MixinBase> copy = entity.getParts();
				boolean alreadyInParts = false;
				for (MixinBase part : copy) {
					if (part.getMixin().getTerm().equals(mixinToBeAdded.getTerm())) {
						alreadyInParts = true;
					}
				}
				if (!alreadyInParts) {
					entity.getParts().add(OcciHelper.createMixinBase(entity, mixinToBeAdded));
				}
			}
			return Collections.singletonList(entity);
		}
		List<Entity> entities = new ArrayList<>();
		for (Mixin depend : mixin.getDepends()) {
			List<Mixin> copy = new ArrayList<>(mixinsToBeAddedToResource);
			copy.add(depend);
			entities.addAll(readApplies(configuration, depend, copy));
		}
		return entities;
	}

	private static void readCapabilities(MixinBase node, Map<String, ?> capabilities) throws Exception {
		for (String capability : capabilities.keySet()) {
			Map<String, ?> capabilityMap = (Map<String, ?>) capabilities.get(capability);
			Map<String, ?> properties = (Map<String, ?>) capabilityMap.get("properties");
			for (String property : properties.keySet()) {
				if (!(properties.get(property) instanceof String)) {
					System.err.println(property + " skipped (" + properties.get(property).getClass() + ")");
					continue;
				}
				String[] splittedProperty = property.split("_");
				String setterNameMethod = "set";
				for (String partProperty : splittedProperty) {
					setterNameMethod += Character.toUpperCase(partProperty.charAt(0)) + partProperty.substring(1);
				}
				invokeRightMethod(node.getClass(), setterNameMethod, (String) properties.get(property), node);
			}
		}
	}

	private static void invokeRightMethod(Class<?> classOfNode, String methodName, String propertyValue,
			MixinBase node) {
		try {
			if (propertyValue.matches("-?\\d+") || propertyValue.split(" ")[0].matches("-?\\d+")) {
				classOfNode.getMethod(methodName, Integer.class).invoke(node, Integer.parseInt(propertyValue));
			} else if (propertyValue.matches("-?\\d+") || propertyValue.split(" ")[0].matches("-?\\d+(\\.\\d+)?")) {
				classOfNode.getMethod(methodName, Double.class).invoke(node, Double.parseDouble(propertyValue));
			} else {
				classOfNode.getMethod(methodName, String.class).invoke(node, propertyValue);
			}
		} catch (Exception e) {
			Mapping mapping = Mapper.mappingOfCapabilities.get(methodName);
			if (mapping != null) {
				try {
					if (mapping.argumentClass == Integer.class) {
						mapping.getMethod().invoke(node, Integer.parseInt(propertyValue));
					} else if (mapping.argumentClass == Double.class) {
						mapping.getMethod().invoke(node, Double.parseDouble(propertyValue));
					} else {
						mapping.getMethod().invoke(node, propertyValue);
					}
				} catch (Exception e2) {
					boolean invokedCorrectly = false;
					for (Kind kind : node.getMixin().getApplies()) {
						try {
							if (mapping.argumentClass == Integer.class) {
								mapping.getMethod().invoke(kind, Integer.parseInt(propertyValue));
								invokedCorrectly = true;
							} else if (mapping.argumentClass == Double.class) {
								mapping.getMethod().invoke(kind, Double.parseDouble(propertyValue));
								invokedCorrectly = true;
							} else {
								mapping.getMethod().invoke(kind, propertyValue);
								invokedCorrectly = true;
							}
						} catch (Exception ignored) {
							continue;
						}
					}
					if (!invokedCorrectly) {
						System.err.println("Error during mapping of " + methodName + " in "
								+ classOfNode.getSimpleName() + " for property value " + propertyValue);
					}
				}
			} else {
				System.err.println("Error could not find mapping for " + methodName + " in "
						+ classOfNode.getSimpleName() + " for property value " + propertyValue);
			}
		}
	}

}
