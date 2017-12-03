package org.eclipse.cmf.occi.tosca.handlers;

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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ExtensionsManager {
	
	/** 
	 * Contains all extension indexed by their name
	 */
	private static Map<String, Extension> extensionsPerName;
	
	private static Resource resource;
	
	public static Extension currentExtensionToBeBuild;
	
	static {
		extensionsPerName = new HashMap<>();
		extensionsPerName.put("core", OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#"));
		extensionsPerName.put("infrastructure", OcciHelper.loadExtension("http://schemas.ogf.org/occi/infrastructure#"));
		extensionsPerName.put("platform", OcciHelper.loadExtension("http://schemas.ogf.org/occi/platform#"));
		extensionsPerName.put("sla", OcciHelper.loadExtension("http://schemas.ogf.org/occi/sla#"));
		
		ResourceSet resSet = new ResourceSetImpl();
		
		URI modelURI = URI
				.createURI("file:/C:/Users/schallit/workspace-tosca2/plugins/org.eclipse.cmf.occi.tosca/model/tosca.occie");
		resource = resSet.createResource(modelURI);
		Extension extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription("Mon extension TOSCA");
		extension.setScheme("http://org.occi/tosca#");
		extension.setName("tosca");
		extension.getImport().add(extensionsPerName.get("core"));
		extension.getImport().add(extensionsPerName.get("infrastructure"));
		extension.getImport().add(extensionsPerName.get("platform"));
		extension.getImport().add(extensionsPerName.get("sla"));
		resource.getContents().add(extension);
		
		extensionsPerName.put("tosca", extension);
		currentExtensionToBeBuild = extension;
	}
		
	public static void createExtendedTosca() {
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI
				.createURI("file:/C:/Users/schallit/workspace-tosca2/plugins/org.eclipse.cmf.occi.tosca.extended/model/extendedTosca.occie");
		resource = resSet.createResource(modelURI);
		Extension extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription("Extended TOSCA");
		extension.setScheme("http://org.occi/extendedTosca#");
		extension.setName("extendedTosca");
		Extension toscaExtension = OcciHelper.loadExtension("http://org.occi/tosca#");
		extension.getImport().add(extensionsPerName.get("core"));
		extension.getImport().add(extensionsPerName.get("infrastructure"));
		extension.getImport().add(extensionsPerName.get("platform"));
		extension.getImport().add(extensionsPerName.get("sla"));
		extension.getImport().add(toscaExtension);
		copy(toscaExtension);
		extensionsPerName.replace("tosca", toscaExtension);
		resource.getContents().add(extension);
		extensionsPerName.put("extendedTosca", extension);
		currentExtensionToBeBuild = extension;
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
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
