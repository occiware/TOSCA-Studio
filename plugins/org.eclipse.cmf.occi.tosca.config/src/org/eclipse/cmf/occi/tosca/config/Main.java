package org.eclipse.cmf.occi.tosca.config;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.tosca.ToscaFactory;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.esotericsoftware.yamlbeans.YamlReader;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class Main extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String pathOfDirectory = "C:/Users/schallit/workspace-tosca/plugins/org.eclipse.cmf.occi.tosca.examples/tosca-topologies/";
		String [] yamlFilesPath = new File(pathOfDirectory).list();
		for (String yamlFilePath : yamlFilesPath) {
			readYamlFile(pathOfDirectory + "/" + yamlFilePath);
		}
		return null;
	}
	
	private static void readYamlFile(String path) {
		try {
			YamlReader reader = new YamlReader(new FileReader(path));
			Map<String, ?> yamlFileAsMap = (Map<String, ?>) reader.read();
			Configuration configuration = ConfigManager.createConfiguration(path);
			Map<String, ?> topology_template = (Map<String, ?>) yamlFileAsMap.get("topology_template");
			if (topology_template.get("description") != null) {
				configuration.setDescription((String) topology_template.get("description"));
			}
			readNodeTemplate(configuration, (Map<String, ?>)topology_template.get("node_templates"));
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
			
			String methodNameToCreate = "create" + 
					Character.toUpperCase(typeName.charAt(0)) + typeName.substring(1).replaceAll("\\.", "_").toLowerCase();
			MixinBase node = null;
			try {
				node = (MixinBase)ToscaFactory.class.getMethod(methodNameToCreate).invoke(ToscaFactory.eINSTANCE);
			} catch (NoSuchMethodException e) {
				System.err.println("Could not find the method " + methodNameToCreate + " in the TOSCA Factory");
				Method m = Mapper.mappingOfType.get(typeName);
				if (m == null) {
					System.err.println("Must add a mapping for " + typeName);
					return;
				}
				node = (MixinBase) m.invoke(ToscaFactory.eINSTANCE);
			}
			
			// parsing capabilities
			if (node_map.get("capabilities") != null) {
				readCapabilities(node, (Map<String, ?> ) node_map.get("capabilities"));
			} else {
				System.err.println("WARNING no capabilities in " + configuration.toString());
			}
			
			List<Kind> kinds = node.getMixin().getApplies();
			for (Kind kind : kinds) {
				Entity entity = OcciHelper.createEntity(kind);
				entity.setKind(kind);
				entity.getParts().add(node);
				if (entity instanceof Resource) {
					configuration.getResources().add((Resource)entity);	
				}
			}
		}
	}
	
	private static void readCapabilities(MixinBase node, Map<String, ?> capabilities) throws Exception {
		for (String capability : capabilities.keySet()) {
			Map<String, ?> capabilityMap = (Map<String, ?>) capabilities.get(capability);
			Map<String, ?> properties = (Map<String, ?>) capabilityMap.get("properties");
			for (String property : properties.keySet()) {
				if (! (properties.get(property) instanceof String)) {
					System.err.println(property + " skipped (" +  properties.get(property).getClass());
					continue;
				}
				String[] splittedProperty = property.split("_");
				String setterNameMethod = "set";
				for (String partProperty : splittedProperty) {
					setterNameMethod += Character.toUpperCase(partProperty.charAt(0)) + partProperty.substring(1);
				}
				Method m = getRightMethod(node.getClass(), setterNameMethod, (String)properties.get(property));

				/* TODO remove
				 * Mapping mapping = Mapper.mappingOfCapabilities.get(property);
				if (mapping != null) {
					if (mapping.argumentClasses[0] != String.class) {
						mapping.method.invoke(node, Integer.parseInt(((String)properties.get(property)).split(" ")[0]));
					} else {
						mapping.method.invoke(node,(String)properties.get(property));
					}
				} else {
					System.err.println(property);
				}*/
			}
		}
	}
	
	private static Method getRightMethod(Class<?> classOfNode, String methodName, String propertyValue) {
		try {
			if (propertyValue.matches("-?\\d+") ||
					propertyValue.split(" ")[0].matches("-?\\d+")) {
				return classOfNode.getMethod(methodName, Integer.class);
			} else if (propertyValue.matches("-?\\d+") ||
					propertyValue.split(" ")[0].matches("-?\\d+(\\.\\d+)?")) {
				return classOfNode.getMethod(methodName, Double.class);
			} else {
				return classOfNode.getMethod(methodName, String.class);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	
}
