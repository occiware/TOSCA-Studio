
package org.eclipse.cmf.occi.tosca.handlers;

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

	private Map<String, ?> map;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// MessageDialog.openInformation(window.getShell(), "Tosca", "Tosca2Occi");
		try {
			YamlReader reader = new YamlReader(new FileReader(
					"C:/Users/schallit/workspace-tosca/plugins/org.eclipse.cmf.occi.tosca/normative-types.yml"));
			map = (Map<String, ?>) reader.read();

			// datatypes <=> record
			Map<String, ?> dataTypes = (Map<String, ?>) map.get("data_types");
			for (String datatype : dataTypes.keySet()) {
				DataTypeReader.read(datatype, (Map<String, ?>) dataTypes.get(datatype));
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
					for (String mixin : mixins.keySet()) {
						mixinReader.readMixin(mixin, (Map<String, ?>) mixins.get(mixin));
					}
				}
			}

			// links / relationship
			Map<String, ?> links = (Map<String, ?>) map.get("relationship_types");
			mixinReader = new MixinReader(links);
			for (String link : links.keySet()) {
				mixinReader.readMixin(link, (Map<String, ?>) links.get(link));
			}

			Extension extension = ExtensionsManager.getExtension("tosca");
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

			ExtensionsManager.save();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}
