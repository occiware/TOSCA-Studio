package org.eclipse.cmf.occi.tosca.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Annotation;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Category;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.StringType;

public class AttributeReader {
	
	private static boolean mustBeSkipped(Mixin currentParent, String mixinName, String currentAttributeName) {
		for (Attribute attribute : currentParent.getAttributes()) {
			if (attribute.getName().equals(currentAttributeName)) {
				System.err.println("WARNING " + currentAttributeName + " is defined in both " 
						+ currentParent.getName() + " and " + mixinName);
				return true;
			}
		}
		for (Mixin parent : currentParent.getDepends()) {
			if (mustBeSkipped(parent, mixinName, currentAttributeName)) {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public static void readAttributes(Category category, Map<String, ?> attributes) {
		for (String attributeName : attributes.keySet()) {
			Map<String, ?> attributesValues = (Map<String, ?>) attributes.get(attributeName);
			attributeName = attributeName.replaceAll("_",".");
			boolean skip = false;
			if (category instanceof Mixin) {
				Mixin mixin = (Mixin) category;
				for (Mixin parent : mixin.getDepends()) {
					if (mustBeSkipped(parent, category.getName(), attributeName.replaceAll("_","."))) {
						skip = true;
						break;
					}
				}
			}
			if (skip) {
				// here, the attribute is inherited from depends mixins
				// we check if the current mixin is re-defining a default value or not
				// if so, we use an annotation to keep the value without erasing default value of the inherited attribute.
				if (attributesValues.containsKey("default")) {
					Annotation defaultAnnotationForInherited = OCCIFactory.eINSTANCE.createAnnotation();
					defaultAnnotationForInherited.setKey("default-value_" + attributeName);
					String defaultValue = (String) attributesValues.get("default");
					defaultValue = defaultValue.replaceAll("/", "");
					defaultAnnotationForInherited.setValue(defaultValue);
					category.getAnnotations().add(defaultAnnotationForInherited);
					System.out.println("Set up a default value for an inherited attribute: " + attributeName+"("+ defaultValue + ")");
				}
				continue;
			}
			System.out.println("Defining " + attributeName + " for " + category.getName());
			Attribute attribute = OCCIFactory.eINSTANCE.createAttribute();
			attribute.setName(attributeName);
			Object description = attributesValues.get("description");
			if (description != null) {
				attribute.setDescription(description.toString());
			}
			if (attributesValues.containsKey("required")) {
				attribute.setRequired(attributesValues.get("required").equals("true"));
			}
			if (attributesValues.containsKey("default")) {
				String defaultValue = (String) attributesValues.get("default");
				defaultValue = defaultValue.replaceAll("/", "");
				attribute.setDefault(defaultValue);
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
							type.setName(attributeName.replaceAll("\\.", "_") + "Enum");
							for (String literal : literals) {
								EnumerationLiteral enumLit = OCCIFactory.eINSTANCE.createEnumerationLiteral();
								enumLit.setName(literal.replaceAll("/", ""));
								enumLit.setEnumerationType((EnumerationType) type);
								((EnumerationType) type).getLiterals().add(enumLit);
							}
							StringToDataType.map.put(attributeName + "Enum", type);
							ExtensionsManager.currentExtensionToBeBuild.getTypes().add(type);
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