package org.occiware.clouddesigner.tosca.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Category;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.StringType;

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
				if (attributesValues.get("constraints") != null) {
					List<Map<String, ?>> constraints = (ArrayList<Map<String, ?>>)attributesValues.get("constraints");
					for (Map<String, ?> constraint : constraints) {
					if (constraint.get("valid_values") != null) {
						List<String> literals  = (ArrayList)constraint.get("valid_values");
						type = OCCIFactory.eINSTANCE.createEnumerationType();
						type.setName(attributeName + "Enum");
//						String [] literals = validValues.replaceAll("[", "").replaceAll("]", "").trim().split(",");
						for (String literal : literals) {
							EnumerationLiteral enumLit = OCCIFactory.eINSTANCE.createEnumerationLiteral();
							enumLit.setName(literal);
							enumLit.setEnumerationType((EnumerationType) type);
							((EnumerationType) type).getLiterals().add(enumLit);
						}
						StringToDataType.map.put(attributeName + "Enum", type);
						ExtensionsManager.getExtension("tosca").getTypes().add(type);
					}
					if (constraint.get("min_length") != null 
							&& type instanceof StringType) {
						((StringType)type).setMinLength(Integer.parseInt(constraint.get("min_length").toString())); // TODO this may change all attribute type string
					}
					}
				}
				attribute.setType(type);
			}
			category.getAttributes().add(attribute);
		}
	}
	
}
