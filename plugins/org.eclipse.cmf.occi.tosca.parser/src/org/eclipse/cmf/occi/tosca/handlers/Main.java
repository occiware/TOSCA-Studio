package org.eclipse.cmf.occi.tosca.handlers;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class Main extends AbstractHandler {

	// TODO must be configured
	public static final String PATH_TO_WORKSPACE = "";
	
	public static final String  PATH_TO_ROOT_PROJECT = PATH_TO_WORKSPACE + "plugins/";
	
	public static final String PATH_TO_TYPES_FILE = "org.eclipse.cmf.occi.tosca.parser/tosca-types/";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		try {
			YamlReader reader = new YamlReader(new FileReader(
					PATH_TO_ROOT_PROJECT + "org.eclipse.cmf.occi.tosca.parser/tosca-types/normative-types.yml")
			);
			Map<String, ?> normativeTypesMap = (Map<String, ?>) reader.read();
			readYamlFile(normativeTypesMap);
			executeMapping();
			ExtensionsManager.save();

			ExtensionsManager.createExtendedTosca();
			Map<String, ?> customTypesMap = concatCustomAndAddedTypes();
			readYamlFile(customTypesMap);
			ExtensionsManager.save();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	private void readYamlFile(Map<String, ?> map) {
		// datatypes <=> record
		Map<String, ?> dataTypes = (Map<String, ?>) map.get("data_types");
		if (dataTypes != null) {
			for (String datatype : dataTypes.keySet()) {
				if (!"tosca.datatypes.Root".equals(datatype) && // the datatype Root is omitted because it does not have
																// any record fields, and it is not allowed in OCCI meta
																// model
						((Map<String, ?>) dataTypes.get(datatype)).get("properties") != null) {// tosca.datatypes.network.PortDef
																								// is also omitted and
																								// considered as a type
					DataTypeReader.read(datatype, (Map<String, ?>) dataTypes.get(datatype));
				}
			}
		}

		// capabilities
		Map<String, ?> capabilites = (Map<String, ?>) map.get("capability_types");
		MixinReader mixinReader = new MixinReader(capabilites);
		for (String capability : capabilites.keySet()) {
			mixinReader.readMixin(capability, (Map<String, ?>) capabilites.get(capability));
		}

		for (String collection : map.keySet()) {
			if (collection.endsWith("_types") && !"relationship_types".equals(collection)
					&& !"data_types".equals(collection) && !"artifact_types".equals(collection)
					&& !"capability_types".equals(collection)) {
				Map<String, ?> mixins = (Map<String, ?>) map.get(collection);
				mixinReader = new MixinReader(mixins);
				for (String mixinStr : mixins.keySet()) {
					mixinReader.readMixin(mixinStr, (Map<String, ?>) mixins.get(mixinStr));
				}
			}
		}

		// links / relationship
		Map<String, ?> links = (Map<String, ?>) map.get("relationship_types");
		mixinReader = new MixinReader(links);
		for (String link : links.keySet()) {
			mixinReader.readMixin(link, (Map<String, ?>) links.get(link));
		}
	}

	private void executeMapping() {
		Extension extension = ExtensionsManager.currentExtensionToBeBuild;
		Mapper mapper = new TypeMapper();
		for (Kind kind : extension.getKinds()) {
			mapper.map(kind);
		}

		for (Mixin mixin : extension.getMixins()) {
			mapper.map(mixin);
		}

		mapper = new AttributeMapper();
		for (Kind kind : extension.getKinds()) {
			mapper.map(kind);
		}
		for (Mixin mixin : extension.getMixins()) {
			mapper.map(mixin);
		}
	}

	private Map<String, ?> concatCustomAndAddedTypes() throws Exception {
		Map customTypesMap = new LinkedHashMap<>(); // LinkedHashMap keeps the insertion order 
		Map nodes = new HashMap<>();
		Map capabilities = new HashMap<>();
		Map relationships = new HashMap<>();
		Map policies = new HashMap<>();
		readCustomAndAddedTypesInGivenDirectory(PATH_TO_ROOT_PROJECT + PATH_TO_TYPES_FILE + "custom-types/", 
				nodes, capabilities, relationships, policies);
		readCustomAndAddedTypesInGivenDirectory(PATH_TO_ROOT_PROJECT + PATH_TO_TYPES_FILE + "added-types/", 
				nodes, capabilities, relationships, policies);
		customTypesMap.put("tosca_definitions_version", "tosca_simple_yaml_1_0");
		customTypesMap.put("description",
				"This TOSCA definitions document contains the custom types definitions as expressed in the TOSCA specification document. It is composed by the files in the directory custom-types");
		customTypesMap.put("node_types", nodes);
		customTypesMap.put("capability_types", capabilities);
		customTypesMap.put("relationship_types", relationships);
		customTypesMap.put("policy_types", policies);
		YamlWriter writerNodes = new YamlWriter(new FileWriter(PATH_TO_ROOT_PROJECT + PATH_TO_TYPES_FILE + "custom-types.yml"));
		writerNodes.write(customTypesMap);
		writerNodes.close();
		return customTypesMap;
	}
	
	private static void readCustomAndAddedTypesInGivenDirectory(String directoryPath, 
			Map nodes, Map capabilities, Map relationships, Map policies) throws Exception {
		File[] yamlFiles = new File(directoryPath).listFiles();
		if (yamlFiles == null) {
			return;
		}
		for (File path : yamlFiles) {
			YamlReader reader = new YamlReader(new FileReader(path));
			System.out.println("Reading " + path + " ...."); 
			Map<String, ?> map = (Map<String, ?>) reader.read();
			if (map.containsKey("node_types")) {
				nodes.putAll((Map) map.get("node_types"));
			}
			if (map.containsKey("capability_types")) {
				capabilities.putAll((Map) map.get("capability_types"));
			}
			if (map.containsKey("relationship_types")) {
				relationships.putAll((Map) map.get("relationship_types"));
			}
			if (map.containsKey("policy_types")) {
				policies.putAll((Map) map.get("policy_types"));
			}
			reader.close();
		}
	}
}