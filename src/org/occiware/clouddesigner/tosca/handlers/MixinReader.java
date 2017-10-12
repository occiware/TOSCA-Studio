package org.occiware.clouddesigner.tosca.handlers;

import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class MixinReader {
	
	private Map<String, ?> mixins;
	
	public MixinReader(Map<String, ?> mixins) {
		this.mixins = mixins;
	}
	
	private Mixin getMixinByName(String name) {
		for (Mixin mixin : ExtensionsManager.getExtension("tosca").getMixins()) {
			System.out.println(mixin.getName());
			if (name.equals(mixin.getName())) {
				return mixin;
			}
		}
		System.out.println(mixins);
		Map<String, ?> maps = (Map<String, ?>) mixins.get(name);
		System.out.println(name + " is not defined");
		if (maps == null && StringToDataType.map.get(name) != null) {
			// TODO for instance we have derived_from: integer
			System.err.println(name);
			return null;
		} else {
			System.out.println(maps);
			readMixin(name, maps);
			return getMixinByName(name);
		}
	}

	public void readMixin(String mixinStr, Map<String, ?> map) {
		boolean alreadyRegistered = false;
		for (Mixin registeredMixin : ExtensionsManager.getExtension("tosca").getMixins()) {
			if (registeredMixin.getName().equals(mixinStr)) {
				alreadyRegistered = true;
			}
		}
		if (alreadyRegistered) {
			return;
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

		Map<String, ?> attributes = (Map<String, ?>) map.get("properties");
		if (attributes != null) {
			AttributeReader.readAttributes(mixin, (Map<String, ?>) map.get("properties"));
		} else {
			attributes = (Map<String, ?>) map.get("attributes");
			if (attributes != null) {
				AttributeReader.readAttributes(mixin, (Map<String, ?>) map.get("attributes"));
			}
		}
		
		Map<String, ?> capabilities = (Map<String, ?>)map.get("capabilities");
		if (capabilities != null) {
			for (String capability : capabilities.keySet()) {
				if (capabilities.get(capability) instanceof String) {
					continue;
				}
				Map<String, ?> valuesCapabilities = (Map<String, ?>)capabilities.get(capability);
					Mixin mixinCapability = getMixinByName(valuesCapabilities.get("type").toString());
					if (mixinCapability == null) {
						System.err.println("Capability not found : " + mixinCapability);
					}
					mixin.getDepends().add(mixinCapability);
			}
		}
		
		if (mixinStr.startsWith("tosca.interfaces")
				&& !mixinStr.endsWith("Root")) {
			ActionReader.readActions(mixin, (Map<String, ?>)mixins.get(mixinStr));
		}
		
//		Map<String, ?> interfaces = (Map<String, ?>)map.get("interfaces");
//		if (interfaces != null) {
//			for (String toscaInterface : interfaces.keySet()) {
//				if (interfaces.get(toscaInterface) instanceof String) {
//					continue;
//				}
//				Map<String, ?> valuesInterfaces = (Map<String, ?>)interfaces.get(toscaInterface);
//					Mixin mixinInterface = getMixinByName(valuesInterfaces.get("type").toString());
//					if (mixinInterface == null) {
//						System.err.println("Interface not found : " + mixinInterface);
//					}
//					mixin.getDepends().add(mixinInterface);
//			}
//		}
//		
		mixin.setScheme("http://occi/tosca/" + mixinStr.replaceAll("\\.", "").toLowerCase() + "#");
		ExtensionsManager.getExtension("tosca").getMixins().add(mixin);
	}

}
