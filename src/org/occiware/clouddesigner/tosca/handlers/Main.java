
package org.occiware.clouddesigner.tosca.handlers;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.esotericsoftware.yamlbeans.YamlReader;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class Main extends AbstractHandler {
	
	public static Extension extension;
	public static Kind resourceKind;
	public static Kind linkKind;
	public static Resource resource;
	
	public static Extension coreExtension;
	
	public static Extension infrastructureExtension;
	
	public static Extension platformExtension;
	
	public static Kind storageResourceInfrastructure;
	
	public static Kind componentResourcePlatform;

	private Map<String, ?> kinds;
	
	private Map<String, ?> map;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		init();
		//MessageDialog.openInformation(window.getShell(), "Tosca", "Tosca2Occi");
		try {
			YamlReader reader = new YamlReader(new FileReader(
					"C:/Users/schallit/workspace-tosca/org.occiware.clouddesigner.tosca/normative-types.yml"));
			map = (Map<String, ?>)reader.read();
			
			// links / relationship
			kinds = (Map<String, ?>) map.get("relationship_types");
    		for (String kind : kinds.keySet()) {
    			readKind(kind, (Map<String, ?>) kinds.get(kind));
    		}
    		
    		// datatypes <=> record
    		Map<String, ?> dataTypes = (Map<String, ?>) map.get("data_types");
    		for (String datatype : dataTypes.keySet()) {
    			DataTypeReader.read(datatype, (Map<String, ?>) dataTypes.get(datatype));
    		}
    		
		    for(String collection : map.keySet()) {
		    	if (collection.endsWith("_types") && !"relationship_types".equals(collection)
		    			&& !"data_types".equals(collection)) {
		    		kinds = (Map<String, ?>) map.get(collection);
		    		for (String kind : kinds.keySet()) {
		    			readKind(kind, (Map<String, ?>) kinds.get(kind));
		    		}
		    	}
		    }
		    
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("Saving...");
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void init() {
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI.createURI("file:/C:/Users/schallit/runtime-EclipseApplication31072017/tosca_model/TOSCA.occie");
		resource = resSet.createResource(modelURI);

		extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription("Mon extension TOSCA");
		extension.setScheme("http://occi/tosca#");
		extension.setName("TOSCA");
		resource.getContents().add(extension);

		coreExtension = OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#");
		if (coreExtension == null) {
			throw new RuntimeException("Cannot load OCCI core extension!");
		}

		List<Kind> coreKinds = coreExtension.getKinds();
		for (Kind coreKind : coreKinds) {
			if (coreKind.getTerm().equals("resource")) {
				resourceKind = coreKind;
			} else if (coreKind.getTerm().equals("link")) {
				linkKind = coreKind;
			}
		}
		
		infrastructureExtension = OcciHelper.loadExtension("http://schemas.ogf.org/occi/infrastructure#");
		if (infrastructureExtension == null) {
			throw new RuntimeException("Cannot load OCCI infrastructure extension!");
		}
		List<Kind> infrastructureKinds = infrastructureExtension.getKinds();
		for (Kind infrastructureKind : infrastructureKinds) {
			System.err.println(infrastructureKind.getTerm());
			if (infrastructureKind.getTerm().equals("storage")) {
				storageResourceInfrastructure = infrastructureKind;
			}
		}
		
		platformExtension = OcciHelper.loadExtension("http://schemas.ogf.org/occi/platform#");
		if (platformExtension == null) {
			throw new RuntimeException("Cannot load OCCI platform extension!");
		}
		List<Kind> platformKinds = platformExtension.getKinds();
		for (Kind platformKind : platformKinds) {
			System.err.println(platformKind.getTerm());
			if (platformKind.getTerm().equals("component")) {
				System.err.println("loaded");
				componentResourcePlatform = platformKind;
			}
		}
	}
	
	private Kind getKindByName(String name) {
		for (Kind kind : extension.getKinds()) {
			if (name.equals(kind.getName())) {
				return kind;
			}
		}
		Map<String, ?> maps = (Map<String, ?>)kinds.get(name);
		System.out.println(name + " is not defined");
		if (maps == null && StringToDataType.map.get(name) != null) {
			// TODO for instance we have derived_from: integer
			System.err.println(name);
			return null;
		} else {
			readKind(name, maps);
			return getKindByName(name);
		}
	}
	
	private void readKind(String kindStr, Map<String, ?> map) {
		boolean alreadyRegistered = false;
		for (Kind registeredKind : extension.getKinds()) {
			if (registeredKind.getName().equals(kindStr)) {
				alreadyRegistered = true;
			}
		}
		if (alreadyRegistered) {
			return;
		}
		
    	Kind kind = OCCIFactory.eINSTANCE.createKind();
    	kind.setName(kindStr);
    	
    	if (kindStr.equals("tosca.nodes.BlockStorage")) {
    		kind.setParent(storageResourceInfrastructure);
    	} else if (kindStr.equals("tosca.nodes.SoftwareComponent")){
    		System.err.println(componentResourcePlatform);
    		kind.setParent(componentResourcePlatform);
    		Mixin softwareComponent = OCCIFactory.eINSTANCE.createMixin();
    		softwareComponent.setName("softwareComponentMixin");
    		softwareComponent.getApplies().add(kind);
    		softwareComponent.setScheme("http://occi/tosca/"+"softwareComponentMixin".replaceAll("\\.", "").toLowerCase()+"#");
    		extension.getMixins().add(softwareComponent);
    	} else {
	    	Object derived_from = map.get("derived_from");
	    	if (derived_from != null) {
	    		Kind parent = getKindByName(derived_from.toString());
	    		if (parent == null) {
	    			System.err.println(kindStr);
	    		}
	    		kind.setParent(parent);
	    	} else if (kindStr.startsWith("tosca.relationships")) {
	    		kind.setParent(linkKind);
	    	}
    	}
    	
    	Object description = map.get("description");
    	if (description != null) {
    		kind.setTitle(description.toString());	
    	}
    	Map<String, ?> attributes = (Map<String, ?> )map.get("properties");
    	if (attributes != null) {
    		readAttributes(kind, (Map<String, ?> )map.get("properties"));	
    	}
   
    	if (map.get("requirements") != null) {
    		Map<String, ?> tmp = (Map<String, ?>)((List)map.get("requirements")).get(0);
    		Map<String, ?> linkDefinition = ((Map<String, ?>)tmp.get(new ArrayList(tmp.keySet()).get(0)));
    		if (linkDefinition.get("node") != null) {
    			System.out.println(linkDefinition.get("node"));
    			String linkName = (String)linkDefinition.get("relationship");
    			Kind linkKind = getKindByName(linkName);
    			if (linkKind.getSource() != null) {
    				linkKind = copyKind(linkKind);
    			}
    			linkKind.setSource(kind);
    			String targetName = (String)linkDefinition.get("node");
    			if (targetName.equals(kindStr)) {
    				linkKind.setTarget(kind); // here see the case of tosca.nodes.Root which is the source AND the target of a tosca.relationships.DependsOn Link
    			} else {
    				Kind targetKind = getKindByName(targetName);
        			linkKind.setTarget(targetKind);
    			}
    			System.out.println(kind.getName() + " ---- " + linkName + " --> " + targetName);
    		}
    	}
    	kind.setScheme("http://occi/tosca/"+kindStr.replaceAll("\\.", "").toLowerCase()+"#");
    	extension.getKinds().add(kind);
	}

	private Kind copyKind(Kind toBoCopied) {
		Kind copy = OCCIFactory.eINSTANCE.createKind();
		copy.setName(toBoCopied.getName());
		copy.setScheme(toBoCopied.getScheme());
		copy.setParent(toBoCopied.getParent());
		copy.setTitle(toBoCopied.getTitle());
		extension.getKinds().add(copy);
		return copy;
	}
	
	private void readAttributes(Kind kind, Map<String, ?> attributes) {
		for (String attributeName : attributes.keySet()) {
			Attribute attribute = OCCIFactory.eINSTANCE.createAttribute();
			Map<String, ?> attributesValues = (Map<String, ?> ) attributes.get(attributeName);
			attribute.setName(attributeName);
			Object description = attributesValues.get("description");
			if (description != null) {
				attribute.setDescription(description.toString());	
			}
			if (attributesValues.containsKey("required")) {
				attribute.setRequired(attributesValues.get("required").equals("true"));	
			}
			if (attributesValues.containsKey("default")) {
				attribute.setDefault((String)attributesValues.get("default"));
			}
			DataType type = StringToDataType.map.get(attributesValues.get("type"));
			if (type != null) {
				attribute.setType(type);
			}
			kind.getAttributes().add(attribute);
		}
	}
}
