package org.occiware.clouddesigner.tosca.handlers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;

public class ExtensionsManager {
	
	/** 
	 * Contains all extension indexed by their name
	 */
	private Map<String, Extension> extensionsPerName;

	public ExtensionsManager(Extension extension) {
		extensionsPerName = new HashMap<>();
		extensionsPerName.put("core", OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#"));
		extensionsPerName.put("infrastructure", OcciHelper.loadExtension("http://schemas.ogf.org/occi/infrastructure#"));
		extensionsPerName.put("platform", OcciHelper.loadExtension("http://schemas.ogf.org/occi/platform#"));
		extensionsPerName.put("sla", OcciHelper.loadExtension("http://schemas.ogf.org/occi/sla#"));
		
		// add abstract Resource in platform
		Kind coreResource = getKindFromItsTerm("core", "resource");
		Kind platformResource = Util.copyKind(coreResource, extension);
		platformResource.setName(platformResource.getName() + "Platform");
		platformResource.setParent(coreResource);
		extensionsPerName.get("platform").getKinds().add(platformResource);
	}
	
	public Mixin getMixinFromItsTerm(String extension, String termOfTheMixin) {
		List<Mixin> mixins = extensionsPerName.get(extension).getMixins();
		for (Mixin mixin : mixins ) {
			System.err.println(mixin.getTerm());
			if (mixin.getTerm().equals(termOfTheMixin)) {
				return mixin;
			}
		}
		throw new RuntimeException("Mixin with term: " + termOfTheMixin + " not found in the extension:" + extension);
	}
	
	public Kind getKindFromItsTerm(String extension, String termOfTheKind) {
		List<Kind> kinds = extensionsPerName.get(extension).getKinds();
		for (Kind kind : kinds) {
			System.err.println(kind.getTerm());
			if (kind.getTerm().equals(termOfTheKind)) {
				return kind;
			}
		}
		throw new RuntimeException("Kind with term: " + termOfTheKind + " not found in the extension:" + extension);
	}
	
}
