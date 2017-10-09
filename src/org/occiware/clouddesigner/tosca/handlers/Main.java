
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
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class Main extends AbstractHandler {

	public static Extension extension;

	private Resource resource;

	private Map<String, ?> map;

	private ExtensionsManager extensionsManager;

	private Mapper mapper;

	// TODO extension should not be static
	public Main() {
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI
				.createURI("file:/C:/Users/schallit/runtime-EclipseApplication31072017/tosca_model/TOSCA.occie");
		resource = resSet.createResource(modelURI);
		extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription("Mon extension TOSCA");
		extension.setScheme("http://occi/tosca#");
		extension.setName("TOSCA");
		resource.getContents().add(extension);
		extensionsManager = new ExtensionsManager(extension);
		mapper = new Mapper(extensionsManager, extension);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// MessageDialog.openInformation(window.getShell(), "Tosca", "Tosca2Occi");
		try {
			YamlReader reader = new YamlReader(new FileReader(
					"C:/Users/schallit/workspace-tosca/org.occiware.clouddesigner.tosca/normative-types.yml"));
			map = (Map<String, ?>) reader.read();

			// links / relationship
			Map<String, ?> kinds = (Map<String, ?>) map.get("relationship_types");
			KindReader kindReader = new KindReader(extension, kinds);
			for (String kind : kinds.keySet()) {
				kindReader.readKind(kind, (Map<String, ?>) kinds.get(kind));
			}

			// datatypes <=> record
			Map<String, ?> dataTypes = (Map<String, ?>) map.get("data_types");
			for (String datatype : dataTypes.keySet()) {
				DataTypeReader.read(datatype, (Map<String, ?>) dataTypes.get(datatype));
			}

			for (String collection : map.keySet()) {
				if (collection.endsWith("_types") && !"relationship_types".equals(collection)
						&& !"data_types".equals(collection) && !"artifact_types".equals(collection)) {
					Map<String, ?> mixins = (Map<String, ?>) map.get(collection);
					MixinReader mixinReader = new MixinReader(extension, mixins);
					for (String mixin : mixins.keySet()) {
						mixinReader.readMixin(mixin, (Map<String, ?>) mixins.get(mixin));
					}
				}
			}
			System.out.println("Saving...");
			resource.save(Collections.emptyMap());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}
