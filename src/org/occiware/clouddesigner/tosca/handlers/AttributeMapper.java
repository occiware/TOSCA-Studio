package org.occiware.clouddesigner.tosca.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Type;

public class AttributeMapper extends Mapper {
	
	
	
	public AttributeMapper() {
		super();
		
		this.mappings.put("tosca.nodes.ObjectStorage", new AttributesMapping("maxsize"));
	}
	
	private class AttributesMapping implements Mapping<Type> {
		public final List<String> attributesToRemove;
		public AttributesMapping(String attributeToRemove) {
			this.attributesToRemove = new ArrayList<String>();
			this.attributesToRemove .add(attributeToRemove);
		}
		public AttributesMapping(List<String> attributesToRemove) {
			this.attributesToRemove = attributesToRemove;
		}
		@Override
		public void mapTo(Type type) {
			List<Attribute> realAttributesToRemove = new ArrayList<Attribute>();
			for (Attribute attribute : type.getAttributes()) {
				if (this.attributesToRemove.contains(attribute.getName())) {
					realAttributesToRemove.add(attribute);
				}
			}
			for (Attribute attribute : realAttributesToRemove) {
				type.getAttributes().remove(attribute);
			}
		}
	}

}
