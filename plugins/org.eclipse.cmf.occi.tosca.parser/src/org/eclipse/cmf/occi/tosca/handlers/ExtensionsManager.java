package org.eclipse.cmf.occi.tosca.handlers;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ExtensionsManager {

	public static final String OUTPUT_PATH_TOSCA = Main.PATH_TO_ROOT_PROJECT + "org.eclipse.cmf.occi.tosca/model/" + "tosca.occie";
	
	public static final String OUTPUT_PATH_EXTENDED_TOSCA = Main.PATH_TO_ROOT_PROJECT + "org.eclipse.cmf.occi.tosca.extended/model/" + "extendedTosca.occie";
	
	public static final String PREFIX_FILE = "file:";
	
	//public static final String SCHEME_TOSCA = PREFIX_FILE + OUTPUT_PATH_TOSCA + "#";
	public static final String SCHEME_TOSCA = "http://schemas.ogf.org/tosca/core#";
	
	//public static final String SCHEME_EXTENDED_TOSCA = PREFIX_FILE + OUTPUT_PATH_EXTENDED_TOSCA + "#";
	public static final String SCHEME_EXTENDED_TOSCA = "http://schemas.ogf.org/tosca/extended#";
	
	/** 
	 * Contains all extension indexed by their name
	 */
	private static Map<String, Extension> extensionsPerName;
	
	private static Resource resource;
	
	public static Extension currentExtensionToBeBuild;
	
	private static String toCorrectURI(final String toBeFormatted) {
		return new File(toBeFormatted).toURI().toString();
	}
	
	static {
		extensionsPerName = new HashMap<>();
		extensionsPerName.put("core", OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#"));
		extensionsPerName.put("infrastructure", OcciHelper.loadExtension("http://schemas.ogf.org/occi/infrastructure#"));
		extensionsPerName.put("platform", OcciHelper.loadExtension("http://schemas.ogf.org/occi/platform#"));
		extensionsPerName.put("sla", OcciHelper.loadExtension("http://schemas.ogf.org/occi/sla#"));

		extensionsPerName.put("modmacao-core", OcciHelper.loadExtension("http://schemas.modmacao.org/modmacao#"));
		extensionsPerName.put("modmacao-platform", OcciHelper.loadExtension("http://schemas.modmacao.org/occi/platform#"));
		extensionsPerName.put("modmacao-placement", OcciHelper.loadExtension("http://schemas.modmacao.org/placement#"));
		
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI.createURI(toCorrectURI(OUTPUT_PATH_TOSCA));
		resource = resSet.createResource(modelURI);
		Extension extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription("Mon extension TOSCA");
		extension.setScheme(SCHEME_TOSCA);
		extension.setName("tosca");
		extension.getImport().add(extensionsPerName.get("core"));
		extension.getImport().add(extensionsPerName.get("infrastructure"));
		//extension.getImport().add(extensionsPerName.get("platform")); we will use now platform from modmacao
		extension.getImport().add(extensionsPerName.get("sla"));
		// MODMACAO
		extension.getImport().add(extensionsPerName.get("modmacao-core"));
		extension.getImport().add(extensionsPerName.get("modmacao-platform"));
		extension.getImport().add(extensionsPerName.get("modmacao-placement"));
		resource.getContents().add(extension);
		
		extensionsPerName.put("tosca", extension);
		currentExtensionToBeBuild = extension;
	}
		
	public static void createExtendedTosca() {
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI.createURI(toCorrectURI(OUTPUT_PATH_EXTENDED_TOSCA));
		resource = resSet.createResource(modelURI);
		Extension extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription("Extended TOSCA");
		extension.setScheme(SCHEME_EXTENDED_TOSCA);
		extension.setName("extendedTosca");
		//Extension toscaExtension = OcciHelper.loadExtension(SCHEME_TOSCA);
		extension.getImport().add(extensionsPerName.get("core"));
		extension.getImport().add(extensionsPerName.get("infrastructure"));
		//extension.getImport().add(extensionsPerName.get("platform"));
		extension.getImport().add(extensionsPerName.get("sla"));
		extension.getImport().add(currentExtensionToBeBuild);
		
		// MODMACAO
		extension.getImport().add(extensionsPerName.get("modmacao-core"));
		extension.getImport().add(extensionsPerName.get("modmacao-platform"));
		extension.getImport().add(extensionsPerName.get("modmacao-placement"));
		
		//copy(toscaExtension);
		//extensionsPerName.replace("tosca", toscaExtension);
		resource.getContents().add(extension);
		extensionsPerName.put("extendedTosca", extension);
		System.out.println(extension.getImport());
		System.out.println(currentExtensionToBeBuild.getImport());
		currentExtensionToBeBuild = extension;
		System.out.println(extension.getImport());
		System.out.println(currentExtensionToBeBuild.getImport());
	}
	
	private static void copy(Extension newTosca) {
		Extension oldTosca = extensionsPerName.get("tosca");
		for (String key : StringToDataType.map.keySet()) {
			StringToDataType.map.replace(key, 
					newTosca.getTypes().get(oldTosca.getTypes().indexOf(StringToDataType.map.get(key))));
		}
	}
	
	public static Extension getExtension(String extension) {
		return extensionsPerName.get(extension);
	}
	
	public static Mixin getMixinFromItsTerm(String extension, String termOfTheMixin) {
		List<Mixin> mixins = extensionsPerName.get(extension).getMixins();
		for (Mixin mixin : mixins ) {
			if (mixin.getTerm().equals(termOfTheMixin)) {
				return mixin;
			}
		}
		throw new RuntimeException("Mixin with term: " + termOfTheMixin + " not found in the extension:" + extension);
	}
	
	public static Kind getKindFromItsTerm(String extension, String termOfTheKind) {
		List<Kind> kinds = extensionsPerName.get(extension).getKinds();
		for (Kind kind : kinds) {
			if (kind.getTerm().equals(termOfTheKind)) {
				return kind;
			}
		}
		throw new RuntimeException("Kind with term: " + termOfTheKind + " not found in the extension:" + extension);
	}
	
	public static DataType getDataTypeFromItsName(String datatypeName) {
		List<DataType> types = extensionsPerName.get("tosca").getTypes();
		for (DataType type : types) {
			if (type.getName().equals(datatypeName)) {
				return type;
			}
		}
		types = extensionsPerName.get("extendedTosca").getTypes();
		for (DataType type : types) {
			if (type.getName().equals(datatypeName)) {
				return type;
			}
		}
		throw new RuntimeException("Type with name: " + datatypeName + " not found");
	}
	
	public static void save() {
		System.out.println("Saving...");
		try {
			System.out.println(OcciRegistry.getInstance().getRegisteredExtensions());
			resource.save(Collections.emptyMap());
			OcciRegistry.getInstance().registerExtension(currentExtensionToBeBuild.getScheme(), resource.getURI().toFileString());
			System.out.println(OcciRegistry.getInstance().getRegisteredExtensions());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}