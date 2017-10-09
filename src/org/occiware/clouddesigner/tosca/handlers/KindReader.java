package org.occiware.clouddesigner.tosca.handlers;

import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class KindReader {
	
	private Map<String, ?> kinds;
	
	private Extension extension;
	
	public KindReader(Extension extension, Map<String, ?> kinds) {
		this.extension = extension;
		this.kinds = kinds;
	}
	
	private Kind getKindByName(String name) {
		for (Kind kind : extension.getKinds()) {
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

		//mapper.map(mixin);
		
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
		kind.setScheme("http://occi/tosca/" + kindStr.replaceAll("\\.", "").toLowerCase() + "#");
		extension.getKinds().add(kind);
	}

}
