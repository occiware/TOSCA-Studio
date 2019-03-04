package org.eclipse.cmf.occi.tosca.config;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.management.MXBean;
import javax.sound.midi.Soundbank;

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
@SuppressWarnings("unchecked")
public class Main extends AbstractHandler {

	// TODO To be configured MUST END WITH a /
	public static final String ROOT_WORKSPACE = "C:/Users/schallit/workspace-tosca2/plugins/";

	public static ApplicationAndComponentManager applicationAndComponentManger;

	public static LinkManager linkManager = new LinkManager();
	
	public static Map<String, Exception> errors = new HashMap<>();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String pathOfDirectory = ROOT_WORKSPACE + "org.eclipse.cmf.occi.tosca.examples/tosca-topologies/";
		String[] yamlFilesPath = new File(pathOfDirectory).list();
		for (String yamlFilePath : yamlFilesPath) {
			if (!yamlFilePath.equals("Example16-UsingSubstitutionMappingsToExportADatabaseImplementation.yml")
					&& !yamlFilePath.equals("Example3-SimpleMySQLInstallationOnATOSCAComputeNode.yml")
					&& !yamlFilePath.equals("Example4-NodeTemplateOverridingItsNodeTypeConfigureInterface.yml")
					&& !yamlFilePath.equals("Example5-TemplateForDeployingDatabaseContentOnTopOfMySQLDBMSMiddleware.yml")
					&& !yamlFilePath.equals("Example9-DefiningACustomRelationshipType.yml")
					&& !yamlFilePath.equals("Multi-Tier1-ElasticsearchLogstashKibana.yml")
					&& !yamlFilePath.equals("BlockStorage2.yml")) {
				System.out.println("Reading " + yamlFilePath + " ....");
				try {
					readYamlFile(pathOfDirectory + "/" + yamlFilePath);
				} catch (Exception e) {
					errors.put(yamlFilePath, e);
				}
			}
		}
		
		System.out.println("Printout the rrors...");
		for (String yamlFile : errors.keySet()) {
			System.out.println(yamlFile + ":");
			errors.get(yamlFile).printStackTrace();
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

			Main.applicationAndComponentManger = new ApplicationAndComponentManager(configuration);

			Map<String, ?> topology_template = (Map<String, ?>) yamlFileAsMap.get("topology_template");
			if (topology_template.get("inputs") != null && topology_template.get("inputs") instanceof Map) {
				InputsReader.read(ConfigManager.convertPathToConfigName(path),
						(Map<String, ?>) topology_template.get("inputs"));
			}
			if (topology_template.get("description") != null) {
				configuration.setDescription((String) topology_template.get("description"));
			}
			Main.applicationAndComponentManger.createNewApplication();
			readNodeTemplates(configuration, (Map<String, ?>) topology_template.get("node_templates"));
			Main.linkManager.linksToDo.forEach(LinkManager.LinkToDo::apply);
			ConfigManager.save();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * @param configuration
	 * @param node_templates
	 * @throws Exception
	 */
	private static void readNodeTemplates(Configuration configuration, Map<String, ?> node_templates) throws Exception {
		NodeTemplateReader nodeTemplateReader = new NodeTemplateReader(configuration);
		for (String key : node_templates.keySet()) {
			System.out.println(key);
			System.out.println(node_templates);
			nodeTemplateReader.read(key, (Map<String, ?>) node_templates);
		}
	}

	public static MixinBase instanciateCorrectMixinBaseFromTypeName(String typeName) throws Exception {
		System.out.print("Trying to instanciate " + typeName);
		String methodNameToCreate = "create" + Character.toUpperCase(typeName.charAt(0))
				+ typeName.substring(1).replaceAll("\\.", "_").toLowerCase();
		System.out.println(" using " + methodNameToCreate);
		MixinBase node = null;
		try {
			node = (MixinBase) ExtendedtoscaFactory.class.getMethod(methodNameToCreate)
					.invoke(ExtendedtoscaFactory.eINSTANCE);
		} catch (NoSuchMethodException e1) {
			try {
				return (MixinBase) ToscaFactory.class.getMethod(methodNameToCreate).invoke(ToscaFactory.eINSTANCE);
			} catch (NoSuchMethodException e2) {
				System.err.println("Could not find the method " + methodNameToCreate + " in the TOSCA Factory");
				MappingToCreateType mapping = Mapper.mappingOfType.get(typeName);
				if (mapping == null) {
					System.err.println("Must add a mapping for " + typeName);
					return null;
				}
				node = (MixinBase) mapping.invoke();
			}
		}
		System.out.println("Successfully instanciate " + typeName + " using " + methodNameToCreate);
		return node;
	}

}
