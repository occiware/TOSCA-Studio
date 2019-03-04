package org.eclipse.cmf.occi.tosca.config;

import java.util.Map;

import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.infrastructure.Architecture;
import org.eclipse.cmf.occi.tosca.config.Mapper.Mapping;

public class PropertyReader {

	public static void readProperties(MixinBase node, Map<String, ?> properties) throws Exception {
		for (String property : properties.keySet()) {
			String propertyValue;
			if (!(properties.get(property) instanceof String)) {
				if (properties.get(property) instanceof Map) { // it means this is a input
					propertyValue = InputsReader.inputs.get(((Map) properties.get(property)).get("get_input"));
				} else {
					System.err.println(property + " skipped (" + properties.get(property).getClass() + ")");
					continue;
				} 	
				if (propertyValue == null) {
					continue;
				}
			} else {
				propertyValue = (String) properties.get(property);
			}
			String[] splittedProperty = property.split("_");
			String setterNameMethod = "set";
			for (String partProperty : splittedProperty) {
				setterNameMethod += Character.toUpperCase(partProperty.charAt(0)) + partProperty.substring(1);
			}
			invokeRightMethod(node.getClass(), setterNameMethod, propertyValue, node);
		}
	}

	private static void invokeRightMethod(Class<?> classOfNode, String methodName, String propertyValue,
			MixinBase node) {
		propertyValue = convertPropertyValue(propertyValue);
		try {
			classOfNode.getMethod(methodName, Integer.class).invoke(node, Integer.parseInt(propertyValue));
		} catch (Exception e) {
			try {
				classOfNode.getMethod(methodName, Double.class).invoke(node, Double.parseDouble(propertyValue));
			} catch (Exception e1) {
				try {
					classOfNode.getMethod(methodName, String.class).invoke(node, propertyValue);
				} catch (Exception e2) {
					Mapping mapping = Mapper.mappingOfCapabilities.get(methodName);
					if (mapping != null) {
						boolean invokedCorrectly = invokeUsingMappingOn(mapping, propertyValue, node);
						if (!invokedCorrectly) {
							for (Kind kind : node.getMixin().getApplies()) {
								if (invokeUsingMappingOn(mapping, propertyValue,
										ConfigManager.getResourceOfGivenKind(kind))) {
									break;
								}
							}
						}
					} else {
						System.err.println("Error could not find mapping for " + methodName + " in "
								+ classOfNode.getSimpleName() + " for property value " + propertyValue);
					}
				}
			}
		}
	}

	private static String convertPropertyValue(String propertyValue) {
		if (propertyValue.endsWith("GB") || propertyValue.endsWith("GHz")) {
			return propertyValue.substring(0, propertyValue.length() - 3);
		} else if (propertyValue.endsWith("MB") || propertyValue.endsWith("MHz")) {
			return "" + Double.parseDouble(propertyValue.substring(0, propertyValue.length() - 3)) / 1024.0D;
		} else {
			return propertyValue;
		}
	}

	private static boolean invokeUsingMappingOn(Mapping mapping, String propertyValue, Object object) {
		try {
			if (mapping.argumentClass == Integer.class) {
				mapping.getMethod().invoke(object, Integer.parseInt(propertyValue));
			} else if (mapping.argumentClass == Double.class) {
				mapping.getMethod().invoke(object, Double.parseDouble(propertyValue));
			} else if (mapping.argumentClass == Float.class) {
				mapping.getMethod().invoke(object, Float.parseFloat(propertyValue));
			} else if (mapping.argumentClass == Architecture.class) {
				if (propertyValue.toLowerCase().equals("x86_64") || propertyValue.toLowerCase().equals("x64")) {
					mapping.getMethod().invoke(object, Architecture.X64);
				} else {
					mapping.getMethod().invoke(object, Architecture.X86);
				}
			} else {
				mapping.getMethod().invoke(object, propertyValue);
			}
		} catch (Exception e) {
			return false;
		}
		System.out.println("Invoked " + mapping.methodNameToBeInvoked + " on " + object.toString());
		return true;
	}

}
