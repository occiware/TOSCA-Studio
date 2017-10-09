package org.occiware.clouddesigner.tosca.handlers;

import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class MixinReader {
	
	private Map<String, ?> mixins;
	
	private Extension extension;
	
	public MixinReader(Extension extension, Map<String, ?> mixins) {
		this.extension = extension;
		this.mixins = mixins;
	}
	
	private Mixin getMixinByName(String name) {
		for (Mixin mixin : extension.getMixins()) {
			if (name.equals(mixin.getName())) {
				return mixin;
			}
		}
		Map<String, ?> maps = (Map<String, ?>) mixins.get(name);
		System.out.println(name + " is not defined");
		if (maps == null && StringToDataType.map.get(name) != null) {
			// TODO for instance we have derived_from: integer
			System.err.println(name);
			return null;
		} else {
			readMixin(name, maps);
			return getMixinByName(name);
		}
	}

	public void readMixin(String mixinStr, Map<String, ?> map) {
		boolean alreadyRegistered = false;
		for (Mixin registeredMixin : extension.getMixins()) {
			if (registeredMixin.getName().equals(mixinStr)) {
				alreadyRegistered = true;
			}
		}
		if (alreadyRegistered) {
			return;
		}
		
		Mixin mixin = OCCIFactory.eINSTANCE.createMixin();
		mixin.setName(mixinStr);

		//mapper.map(mixin);
		
		Object derived_from = map.get("derived_from");
		if (derived_from != null) {
			Mixin parent = getMixinByName(derived_from.toString());
			if (parent == null) {
				System.err.println(mixinStr);
			}
			mixin.getDepends().add(parent);
		}
		
		Object description = map.get("description");
		if (description != null) {
			mixin.setTitle(description.toString());
		}

		Map<String, ?> attributes = (Map<String, ?>) map.get("properties");
		if (attributes != null) {
			AttributeReader.readAttributes(mixin, (Map<String, ?>) map.get("properties"));
		} else {
			attributes = (Map<String, ?>) map.get("attributes");
			if (attributes != null) {
				AttributeReader.readAttributes(mixin, (Map<String, ?>) map.get("attributes"));
			}
		}
		mixin.setScheme("http://occi/tosca/" + mixinStr.replaceAll("\\.", "").toLowerCase() + "#");
		extension.getMixins().add(mixin);
	}

}
