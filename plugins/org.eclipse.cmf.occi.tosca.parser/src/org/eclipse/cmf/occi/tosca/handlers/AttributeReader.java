package org.eclipse.cmf.occi.tosca.handlers;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Category;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.StringType;

public class AttributeReader {

	public static void readAttributes(Category category, Map<String, ?> attributes) {
		for (String attributeName : attributes.keySet()) {
			boolean skip = false;
			if (category instanceof Mixin) {
				Mixin mixin = (Mixin) category;
				for (Mixin parent : mixin.getDepends()) {
					for (Attribute attribute : parent.getAttributes()) {
						if (attribute.getName().equals(attributeName.replaceAll("_","."))) {
							System.err.println("WARNING " + attributeName + " is defined in both " + parent.getName() + " and " + mixin.getName());
							skip = true; // TODO add as OCL constraint
						}
					}
					if (!skip && parent.getDepends() != null) {
						for (Mixin grandParent : parent.getDepends()) {
							for (Attribute attribute : grandParent.getAttributes()) {
								if (attribute.getName().equals(attributeName.replaceAll("_","."))) {
									System.err.println("WARNING " + attributeName + " is defined in both " + parent.getName() + " and " + mixin.getName());
									skip = true; // TODO add as OCL constraint
								}
							}	
						}
					}
				}
			}
			if (skip) {
				continue;
			}
			Attribute attribute = OCCIFactory.eINSTANCE.createAttribute();
			Map<String, ?> attributesValues = (Map<String, ?>) attributes.get(attributeName);
			attributeName = attributeName.replaceAll("_",".");
			attribute.setName(attributeName);
			Object description = attributesValues.get("description");
			if (description != null) {
				attribute.setDescription(description.toString());
			}
			if (attributesValues.containsKey("required")) {
				attribute.setRequired(attributesValues.get("required").equals("true"));
			}
			if (attributesValues.containsKey("default")) {
				attribute.setDefault((String) attributesValues.get("default"));
			}
			
			DataType type;
			if ("list".equals(attributesValues.get("type"))
					|| "array".equals(attributesValues.get("type"))) {
				String entrySchema = (String)attributesValues.get("entry_schema");
				type = StringToDataType.map.get("array" + entrySchema);
				if (type == null) {
					type = 	StringToDataType.defineNewArrayType(entrySchema);
				}
			} else {
				type = StringToDataType.map.get(attributesValues.get("type"));
			}
			if (type != null || ((String)attributesValues.get("type")).startsWith("scalar")) {
				if (attributesValues.get("constraints") != null) {
					List<Map<String, ?>> constraints = (ArrayList<Map<String, ?>>) attributesValues.get("constraints");
					for (Map<String, ?> constraint : constraints) {
						if (constraint.get("valid_values") != null) {
							List<String> literals = (ArrayList) constraint.get("valid_values");
							type = OCCIFactory.eINSTANCE.createEnumerationType();
							type.setName(attributeName + "Enum");
							for (String literal : literals) {
								EnumerationLiteral enumLit = OCCIFactory.eINSTANCE.createEnumerationLiteral();
								enumLit.setName(literal);
								enumLit.setEnumerationType((EnumerationType) type);
								((EnumerationType) type).getLiterals().add(enumLit);
							}
							StringToDataType.map.put(attributeName + "Enum", type);
							ExtensionsManager.getExtension("tosca").getTypes().add(type);
						}
						if (constraint.get("min_length") != null && type instanceof StringType) {
							type = StringToDataType.map.get("stringMinOne");
						}
						if (constraint.get("greater_or_equal") != null ) {
							type =  StringToDataType.map.get((String)attributesValues.get("type") +
									constraint.get("greater_or_equal"));
						}
					}
				}
				attribute.setType(type);
			}
			category.getAttributes().add(attribute);
		}
	}

}
