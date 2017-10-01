package org.occiware.clouddesigner.tosca.handlers;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.BooleanType;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.NumericTypeEnum;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.RecordType;
import org.eclipse.cmf.occi.core.StringType;

public class StringToDataType {
	
	public final static StringType typeModelString = OCCIFactory.eINSTANCE.createStringType();
	public final static BooleanType typeModelBoolean = OCCIFactory.eINSTANCE.createBooleanType();
	public final static NumericType typeModelByte = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelDouble = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelFloat = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelInteger = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelLong = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelShort = OCCIFactory.eINSTANCE.createNumericType();
	
	public final static EnumerationType typeEnum = OCCIFactory.eINSTANCE.createEnumerationType();
	
	public final static ArrayType typeArray = OCCIFactory.eINSTANCE.createArrayType();
	public final static ArrayType typeArrayString = OCCIFactory.eINSTANCE.createArrayType();
	public final static ArrayType typeArrayBoolean = OCCIFactory.eINSTANCE.createArrayType();
	public final static ArrayType typeArrayByte = OCCIFactory.eINSTANCE.createArrayType();
	public final static ArrayType typeArrayDouble = OCCIFactory.eINSTANCE.createArrayType();
	public final static ArrayType typeArrayFloat = OCCIFactory.eINSTANCE.createArrayType();
	public final static ArrayType typeArrayInteger = OCCIFactory.eINSTANCE.createArrayType();
	public final static ArrayType typeArrayLong = OCCIFactory.eINSTANCE.createArrayType();
	public final static ArrayType typeArrayShort = OCCIFactory.eINSTANCE.createArrayType();
	
	
	public final static RecordType typeRecord = OCCIFactory.eINSTANCE.createRecordType();
	
	public final static EObjectType typeModelMap = OCCIFactory.eINSTANCE.createEObjectType();
	
	public final static EObjectType typeModelMapString = OCCIFactory.eINSTANCE.createEObjectType();
	
	public final static Map<String, DataType> map = new HashMap<>();

	static {
		typeModelByte.setType(NumericTypeEnum.BYTE);
		typeModelByte.setName("byte");
		typeModelDouble.setType(NumericTypeEnum.DOUBLE);
		typeModelDouble.setName("double");
		typeModelFloat.setType(NumericTypeEnum.FLOAT);
		typeModelFloat.setName("float");
		typeModelInteger.setType(NumericTypeEnum.INTEGER);
		typeModelInteger.setName("integer");
		typeModelLong.setType(NumericTypeEnum.LONG);
		typeModelLong.setName("long");
		typeModelShort.setType(NumericTypeEnum.SHORT);
		typeModelShort.setName("short");
		
		typeModelBoolean.setName("boolean");
		typeModelString.setName("string");
		typeEnum.setName("enum");
		
		typeArray.setName("array");
		
		typeArrayString.setName("arrayString");
		typeArrayString.setType(typeModelString);
		typeArrayBoolean.setName("arrayBoolean");
		typeArrayBoolean.setType(typeModelBoolean);
		typeArrayByte.setName("arrayByte");
		typeArrayByte.setType(typeModelByte);
		typeArrayDouble.setName("arrayDouble");
		typeArrayDouble.setType(typeModelDouble);
		typeArrayFloat.setName("arrayFloat");
		typeArrayFloat.setType(typeModelFloat);
		typeArrayInteger.setName("arrayInteger");
		typeArrayInteger.setType(typeModelInteger);
		typeArrayLong.setName("arrayLong");
		typeArrayLong.setType(typeModelLong);
		typeArrayShort.setName("arrayShort");
		typeArrayShort.setType(typeModelShort);
		
		typeRecord.setName("record");
		
		typeModelMap.setName("map");
		
		typeModelMapString.setName("mapString");
		
		Main.extension.getTypes().add(typeModelString);
		Main.extension.getTypes().add(typeModelBoolean);
		Main.extension.getTypes().add(typeModelByte);
		Main.extension.getTypes().add(typeModelDouble);
		Main.extension.getTypes().add(typeModelFloat);
		Main.extension.getTypes().add(typeModelInteger);
		Main.extension.getTypes().add(typeModelLong);
		Main.extension.getTypes().add(typeModelShort);
		Main.extension.getTypes().add(typeEnum);
		
		Main.extension.getTypes().add(typeArray);
		Main.extension.getTypes().add(typeArrayString);
		Main.extension.getTypes().add(typeArrayBoolean);
		Main.extension.getTypes().add(typeArrayByte);
		Main.extension.getTypes().add(typeArrayDouble);
		Main.extension.getTypes().add(typeArrayFloat);
		Main.extension.getTypes().add(typeArrayInteger);
		Main.extension.getTypes().add(typeArrayLong);
		Main.extension.getTypes().add(typeArrayShort);
		
		Main.extension.getTypes().add(typeRecord);
		
		Main.extension.getTypes().add(typeModelMap);
		
		map.put("string", typeModelString);
		map.put("boolean", typeModelBoolean);	
		
		map.put("byte", typeModelByte);
		map.put("double", typeModelDouble);
		map.put("float", typeModelFloat);
		map.put("integer", typeModelInteger);
		map.put("number", typeModelInteger);
		map.put("uint32", typeModelInteger);
		map.put("long", typeModelLong);
		map.put("short", typeModelShort);
		
		map.put("enum", typeEnum);
		map.put("array", typeArray);
		map.put("arraystring", typeArray);
		map.put("record", typeRecord);
		
		map.put("map", typeModelMap);
		map.put("mapString", typeModelMapString);
	}
}
