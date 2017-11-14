package org.eclipse.cmf.occi.tosca.handlers;

import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class KindReader {
	
	private Map<String, ?> kinds;
	
	public KindReader(Map<String, ?> kinds) {
		this.kinds = kinds;
	}
	
	private Kind getKindByName(String name) {
		for (Kind kind : ExtensionsManager.getExtension("tosca").getKinds()) {
			if (name.equals(kind.getName())) {
				return kind;
			}
		}
		Map<String, ?> maps = (Map<String, ?>) kinds.get(name);
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

	public void readKind(String kindStr, Map<String, ?> map) {
		boolean alreadyRegistered = false;
		for (Kind registeredKind : ExtensionsManager.getExtension("tosca").getKinds()) {
			if (registeredKind.getName().equals(kindStr)) {
				alreadyRegistered = true;
			}
		}
		if (alreadyRegistered) {
			return;
		}
		
		Kind kind = OCCIFactory.eINSTANCE.createKind();
		kindStr = kindStr.replaceAll("\\.", "_");
		kind.setName(kindStr);
		
		if (map.get("derived_from") != null) {
			String nameOfParent = map.get("derived_from").toString();
			if ("tosca_relationships_Root".equals(nameOfParent)) {
				for (Mixin mixin : ExtensionsManager.getExtension("tosca").getMixins()) {
					System.err.println(mixin.getTerm());
					if (mixin.getTerm().equals("tosca.relationships.root")) {
						mixin.getApplies().add(kind);
					}
				}
			} else {
				kind.setParent(getKindByName(nameOfParent));
			}
		}

		//mapper.map(kind);
		
		Object description = map.get("description");
		if (description != null) {
			kind.setTitle(description.toString());
		}

		Map<String, ?> attributes = (Map<String, ?>) map.get("properties");
		if (attributes != null) {
			AttributeReader.readAttributes(kind, (Map<String, ?>) map.get("properties"));
		} else {
			attributes = (Map<String, ?>) map.get("attributes");
			if (attributes != null) {
				AttributeReader.readAttributes(kind, (Map<String, ?>) map.get("attributes"));
			}
		}
		
		kind.setScheme(ExtensionsManager.getExtension("tosca").getScheme());
		ExtensionsManager.getExtension("tosca").getKinds().add(kind);
	}

}
