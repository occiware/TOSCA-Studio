package org.occiware.clouddesigner.tosca.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.Type;

public abstract class Mapper {
	
	protected Map<String, Mapping> mappings;
	
	public Mapper() {
		this.mappings = new HashMap<String, Mapper.Mapping>();
	}
	
	public boolean map(Type typeToBeMapped) {
		Mapping mapping = mappings.get(typeToBeMapped.getName());
		if (mapping == null) {
			return false;
		}
		mapping.mapTo(typeToBeMapped);
		return true;
	}
	
	protected interface Mapping<T extends Type> {
		public void mapTo(T type);
	}

}
