package org.eclipse.cmf.occi.tosca.handlers;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.BooleanType;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.NumericTypeEnum;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.RecordType;
import org.eclipse.cmf.occi.core.StringType;

public class StringToDataType {
	
	public final static StringType typeModelString = OCCIFactory.eINSTANCE.createStringType();
	public final static StringType typeModelStringMinOne = OCCIFactory.eINSTANCE.createStringType();
	public final static BooleanType typeModelBoolean = OCCIFactory.eINSTANCE.createBooleanType();
	public final static NumericType typeModelByte = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelDouble = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelFloat = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelInteger = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelIntegerMinOne = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelLong = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelShort = OCCIFactory.eINSTANCE.createNumericType();
	
	public final static NumericType typeModelRange = OCCIFactory.eINSTANCE.createNumericType();
	
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
	
	public final static StringType typeModelVersion = OCCIFactory.eINSTANCE.createStringType();
	
	public final static NumericType scalarFrequency = OCCIFactory.eINSTANCE.createNumericType();
	
	public final static NumericType scalarSizeZeroMB = OCCIFactory.eINSTANCE.createNumericType();
	
	public final static NumericType scalarSizeZeroGB = OCCIFactory.eINSTANCE.createNumericType();
	
	public final static NumericType scalarSizeOneMB = OCCIFactory.eINSTANCE.createNumericType();
	
	public final static Map<String, DataType> map = new HashMap<>();

	static {
		scalarFrequency.setType(NumericTypeEnum.DOUBLE);
		scalarFrequency.setName("scalarFrequency");
		scalarFrequency.setMinInclusive("0.1 GHz");
		
		scalarSizeZeroMB.setType(NumericTypeEnum.INTEGER);
		scalarSizeZeroMB.setName("scalarSizeMinZeroMB");
		scalarSizeZeroMB.setMinInclusive("0 MB");
		
		scalarSizeZeroGB.setType(NumericTypeEnum.INTEGER);
		scalarSizeZeroGB.setName("scalarSizeMinZeroGB");
		scalarSizeZeroGB.setMinInclusive("0 GB");
		
		scalarSizeOneMB.setType(NumericTypeEnum.INTEGER);
		scalarSizeOneMB.setName("scalarSizeMinOneMB");
		scalarSizeOneMB.setMinInclusive("1 MB");
		
		typeModelByte.setType(NumericTypeEnum.BYTE);
		typeModelByte.setName("byte");
		typeModelDouble.setType(NumericTypeEnum.DOUBLE);
		typeModelDouble.setName("double");
		typeModelFloat.setType(NumericTypeEnum.FLOAT);
		typeModelFloat.setName("float");
		typeModelInteger.setType(NumericTypeEnum.INTEGER);
		typeModelInteger.setName("integer");
		typeModelIntegerMinOne.setType(NumericTypeEnum.INTEGER);
		typeModelIntegerMinOne.setName("integerMinOne");
		typeModelIntegerMinOne.setMinInclusive("1");
		typeModelLong.setType(NumericTypeEnum.LONG);
		typeModelLong.setName("long");
		typeModelShort.setType(NumericTypeEnum.SHORT);
		typeModelShort.setName("short");
		
		typeModelRange.setType(NumericTypeEnum.SHORT);
		typeModelRange.setName("range");
		typeModelRange.setMaxInclusive("65535");
		typeModelRange.setMinInclusive("1");
		
		typeModelBoolean.setName("boolean");
		typeModelString.setName("string");
		typeModelStringMinOne.setName("stringMinOne");
		typeModelStringMinOne.setMinLength(1);
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
		
//		typeModelMapString.setName("mapString");
		
		typeModelVersion.setName("version");
		typeModelVersion.setPattern("((\\d+)((\\.\\d+)+)?)"); //examples: "10" "10.1" "10.1.999999", TODO check the pattern
		
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelString);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelStringMinOne);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelBoolean);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelByte);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelDouble);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelFloat);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelInteger);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelIntegerMinOne);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelLong);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelShort);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeEnum);
		
		ExtensionsManager.getExtension("tosca").getTypes().add(typeArray);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeArrayString);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeArrayBoolean);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeArrayByte);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeArrayDouble);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeArrayFloat);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeArrayInteger);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeArrayLong);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeArrayShort);
		
		ExtensionsManager.getExtension("tosca").getTypes().add(typeRecord);
		
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelMap);
		
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelVersion);
		
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelRange);
		
		ExtensionsManager.getExtension("tosca").getTypes().add(scalarFrequency);
		
		ExtensionsManager.getExtension("tosca").getTypes().add(scalarSizeOneMB);
		
		ExtensionsManager.getExtension("tosca").getTypes().add(scalarSizeZeroGB);
		
		ExtensionsManager.getExtension("tosca").getTypes().add(scalarSizeZeroMB);
		
		
		map.put("string", typeModelString);
		map.put("stringMinOne", typeModelStringMinOne);
		map.put("boolean", typeModelBoolean);
		
		map.put("byte", typeModelByte);
		map.put("double", typeModelDouble);
		map.put("float", typeModelFloat);
		map.put("integer", typeModelInteger);
		map.put("integer1", typeModelIntegerMinOne);
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
		map.put("version", typeModelVersion);
		map.put("range", typeModelRange);

		map.put("scalar-unit.frequency0.1 GHz", scalarFrequency);
		
		map.put("scalar-unit.size1 MB", scalarSizeOneMB);
		map.put("scalar-unit.size0 GB", scalarSizeZeroGB);
		map.put("scalar-unit.size0 MB", scalarSizeZeroMB);
	}
}


