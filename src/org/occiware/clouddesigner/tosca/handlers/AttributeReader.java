package org.occiware.clouddesigner.tosca.handlers;

import java.util.Map;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Category;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class AttributeReader {

	public static void readAttributes(Category category, Map<String, ?> attributes) {
		for (String attributeName : attributes.keySet()) {
			Attribute attribute = OCCIFactory.eINSTANCE.createAttribute();
			Map<String, ?> attributesValues = (Map<String, ?> ) attributes.get(attributeName);
			attribute.setName(attributeName);
			Object description = attributesValues.get("description");
			if (description != null) {
				attribute.setDescription(description.toString());	
			}
			if (attributesValues.containsKey("required")) {
				attribute.setRequired(attributesValues.get("required").equals("true"));	
			}
			if (attributesValues.containsKey("default")) {
				attribute.setDefault((String)attributesValues.get("default"));
			}
			DataType type = StringToDataType.map.get(attributesValues.get("type"));
			if (type != null) {
				attribute.setType(type);
			}
			category.getAttributes().add(attribute);
		}
	}
	
}
