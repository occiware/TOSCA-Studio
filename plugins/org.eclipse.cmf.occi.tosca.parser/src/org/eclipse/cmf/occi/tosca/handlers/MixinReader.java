package org.eclipse.cmf.occi.tosca.handlers;

import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class MixinReader {

	private Map<String, ?> mixins;
	private Extension extension;

	public MixinReader(Extension extension, Map<String, ?> mixins) {
		this.mixins = mixins;
		this.extension = extension;
	}

	private Mixin getMixinByName(String name) {
		name = name.replaceAll("\\.", "_");
		for (Mixin mixin : extension.getMixins()) {
			if (name.equals(mixin.getName())) {
				return mixin;
			}
		}
		Map<String, ?> maps = (Map<String, ?>) mixins.get(name.replaceAll("_", "\\."));
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

	public void readMixin(String mixinData, Map<String, ?> map) {
		String mixinStr = mixinData.replaceAll("\\.", "_");
		for (Mixin registeredMixin : ExtensionsManager.getExtension("tosca").getMixins()) {
			if (registeredMixin.getName().equals(mixinStr)) {
				return;
			}
		}

		Mixin mixin = OCCIFactory.eINSTANCE.createMixin();
		mixin.setName(mixinStr);

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

		Map<String, ?> capabilities = (Map<String, ?>) map.get("capabilities");
		if (capabilities != null) {
			for (String capability : capabilities.keySet()) {
				if (capabilities.get(capability) instanceof String) {
					Mixin mixinCapability = getMixinByName((String) capabilities.get(capability));
					mixin.getDepends().add(mixinCapability);
				} else {
					Map<String, ?> valuesCapabilities = (Map<String, ?>) capabilities.get(capability);
					if (valuesCapabilities.get("type") != null) {
						Mixin mixinCapability = getMixinByName(valuesCapabilities.get("type").toString());
						if (mixinCapability == null) {
							System.err.println("Capability not found : " + mixinCapability);
						}
						mixin.getDepends().add(mixinCapability);
					} else {
						System.err.println("Capability ("+ capability +") is inherited from the parent Mixin");
					}
				}
			}
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
		
		if (mixinStr.startsWith("tosca_interfaces") && !mixinStr.endsWith("Root")) {
			ActionReader.readActions(mixin, (Map<String, ?>) mixins.get(mixinData));
		}
		
		mixin.setScheme(this.extension.getScheme());
		this.extension.getMixins().add(mixin);
	}

}
