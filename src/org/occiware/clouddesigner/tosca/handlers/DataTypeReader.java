package org.occiware.clouddesigner.tosca.handlers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.RecordField;
import org.eclipse.cmf.occi.core.RecordType;

public class DataTypeReader {
	
	public static void read(String dataTypeAsString, Map<String, ?> map) {
		RecordType recordType = OCCIFactory.eINSTANCE.createRecordType();
		recordType.setName(dataTypeAsString);
		Object description = map.get("description");
    	if (description != null) {
    		recordType.setDocumentation(description.toString());	
    	}
    	// do not support the derived_from
    	Map<String, ?> attributes = (Map<String, ?> )map.get("properties");
    	if (attributes != null) {
    		recordType.getRecordFields().addAll(readRecordField((Map<String, ?> )map.get("properties")));	
    	}

    	ExtensionsManager.getExtension("tosca").getTypes().add(recordType);
    	StringToDataType.map.put(dataTypeAsString, recordType);
	}
	
	private static Collection<RecordField> readRecordField(Map<String, ?> recordFieldsMap) {
		List<RecordField> recordFields = new ArrayList<>();
		for (String recordFieldName : recordFieldsMap.keySet()) {
			RecordField recordField = OCCIFactory.eINSTANCE.createRecordField();
			recordField.setName(recordFieldName);
			Map<String, ?> recordFieldMap = (Map<String, ?>)recordFieldsMap.get(recordFieldName);
			
			String description = (String)recordFieldMap.get("description");
			if (description != null) {
				recordField.setDescription(description);	
			}
			
			String type = (String)recordFieldMap.get("type");
			if (type != null) {
				if (type.equals("list")) {
					type = "array";
				}
				if (type.equals("array")) {
					String typeOfCollection = (String)(((Map<String, ?>)recordFieldMap.get("entry_schema")).get("type"));
					type += typeOfCollection;                                                                                                                      
				}
				recordField.setType(StringToDataType.map.get(type));	
			}
			
			String required = (String)recordFieldMap.get("required");
			if (required != null) {
				recordField.setRequired(required.equals("true"));	
			}
			
			String defaultValue = (String)recordFieldMap.get("default");
			if (defaultValue != null) {
				recordField.setDefault(description);	
			}
			
			recordFields.add(recordField);
		}
		return recordFields;
	}
 
}
