
package org.occiware.clouddesigner.tosca.handlers;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
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
	public static Resource resource;
	
	public static void init() {
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI.createURI("file:/C:/Users/schallit/runtime-EclipseApplication31072017/tosca_model/TOSCA.occie");
		resource = resSet.createResource(modelURI);

		extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription("Mon extension TOSCA");
		extension.setScheme("http://tosca/occi#");
		extension.setName("TOSCA");
		resource.getContents().add(extension);

		Extension coreExtension = OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#");
		if (coreExtension == null) {
			throw new RuntimeException("Cannot load OCCI core extension!");
		}
		System.out.println(coreExtension.getTypes());
		List<Kind> coreKinds = coreExtension.getKinds();
		for (Kind coreKind : coreKinds) {
			if (coreKind.getTerm().equals("resource")) {
				resourceKind = coreKind;
			}
		}
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		init();
		//MessageDialog.openInformation(window.getShell(), "Tosca", "Tosca2Occi");
		try {
			YamlReader reader = new YamlReader(new FileReader(
					"C:/Users/schallit/workspace-tosca/org.occiware.clouddesigner.tosca/normative-types.yml"));
			Map<String, ?> map = (Map<String, ?>)reader.read();
		    for(String collection : map.keySet()) {
		    	if (collection.endsWith("_types")) {
		    		Map<String, ?> kinds = (Map<String, ?>) map.get(collection);
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
	
	private void readKind(String kindStr, Map<String, ?> map) {
		System.out.println(kindStr);
    	Kind kind = OCCIFactory.eINSTANCE.createKind();
    	kind.setName(kindStr);
    	Object description = map.get("description");
    	if (description != null) {
    		kind.setTitle(description.toString());	
    	}
    	Map<String, ?> attributes = (Map<String, ?> )map.get("properties");
    	if (attributes != null) {
    		readAttributes(kind, (Map<String, ?> )map.get("properties"));	
    	}
    	extension.getKinds().add(kind);
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
			DataType type = StringToDataType.map.get(attributesValues.get("type"));
			if (type != null) {
				attribute.setType(type);
			}
			kind.getAttributes().add(attribute);
		}
	}
}
