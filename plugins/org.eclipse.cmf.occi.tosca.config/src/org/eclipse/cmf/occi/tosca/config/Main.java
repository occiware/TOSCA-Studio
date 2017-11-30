package org.eclipse.cmf.occi.tosca.config;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sound.midi.Soundbank;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
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
		String pathOfDirectory = "C:/Users/schallit/workspace-tosca2/plugins/org.eclipse.cmf.occi.tosca.examples/tosca-topologies/";
		String[] yamlFilesPath = new File(pathOfDirectory).list();
		for (String yamlFilePath : yamlFilesPath) {
			if (!yamlFilePath.equals("Example16-UsingSubstitutionMappingsToExportADatabaseImplementation.yml")
					&& !yamlFilePath.equals("Example3-SimpleMySQLInstallationOnATOSCAComputeNode.yml")
					&& !yamlFilePath.equals("Example4-NodeTemplateOverridingItsNodeTypeConfigureInterface.yml")
					&& !yamlFilePath
							.equals("Example5-TemplateForDeployingDatabaseContentOnTopOfMySQLDBMSMiddleware.yml")
					&& !yamlFilePath.equals("Example9-DefiningACustomRelationshipType.yml")
					&& !yamlFilePath.equals("Multi-Tier1-ElasticsearchLogstashKibana.yml")
					&& !yamlFilePath.equals("BlockStorage2.yml")) {
				readYamlFile(pathOfDirectory + "/" + yamlFilePath);
			}
		}
		return null;
	}

	private static void readYamlFile(String path) {
		try {
			YamlReader reader = new YamlReader(new FileReader(path));
			System.out.println(path);
			Map<String, ?> yamlFileAsMap = (Map<String, ?>) reader.read();
			ConfigManager.createConfiguration(path);
			Configuration configuration = ConfigManager.currentConfiguration;
			Map<String, ?> topology_template = (Map<String, ?>) yamlFileAsMap.get("topology_template");
			if (topology_template.get("inputs") != null && topology_template.get("inputs") instanceof Map) {
				InputsReader.read(ConfigManager.convertPathToConfigName(path),
						(Map<String, ?>) topology_template.get("inputs"));
			}
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

			List<Entity> entities = readApplies(configuration, node.getMixin());
			if (entities.size() > 1) {
				System.out.println("More than one resource for " + node.getMixin().getName());
			}
			entities.get(0).getParts().add(node);
			for (Entity entity : entities) {
				if (entity instanceof Resource) {
					configuration.getResources().add((Resource) entity);
				}
			}

			if (node_map.get("properties") != null && node_map.get("properties") instanceof Map) {
				PropertyReader.readProperties(node, (Map<String, ?>) node_map.get("properties"));
			}

			if (node_map.get("capabilities") != null) {
				readCapabilities(node, (Map<String, ?>) node_map.get("capabilities"));
			}
		}
	}

	private static void readCapabilities(MixinBase node, Map<String, ?> capabilities) throws Exception {
		for (String capability : capabilities.keySet()) {
			Map<String, ?> capabilityMap = (Map<String, ?>) capabilities.get(capability);
			Map<String, ?> properties = (Map<String, ?>) capabilityMap.get("properties");
			if (properties != null) {
				PropertyReader.readProperties(node, properties);
			}
		}
	}

	private static List<Entity> readApplies(Configuration configuration, Mixin mixin) {
		List<Entity> entities = new ArrayList<>();
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
				entity.setKind(kind);
			}
			entities.add(entity);
		}
		for (Mixin depend : mixin.getDepends()) {
			entities.addAll(readApplies(configuration, depend));
		}
		return entities;
	}

}
