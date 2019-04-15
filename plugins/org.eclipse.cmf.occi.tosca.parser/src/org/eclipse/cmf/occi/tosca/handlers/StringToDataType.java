package org.eclipse.cmf.occi.tosca.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.BooleanType;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.NumericTypeEnum;
import org.eclipse.cmf.occi.core.OCCIFactory;
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
	public final static NumericType typeModelIntegerMinZero = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelLong = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelShort = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType typeModelRange = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType toscaDatatypesNetworkPortDef = OCCIFactory.eINSTANCE.createNumericType();
	public final static EObjectType typeModelMap = OCCIFactory.eINSTANCE.createEObjectType();
	public final static StringType typeModelVersion = OCCIFactory.eINSTANCE.createStringType();
	public final static NumericType scalarFrequency = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType scalarSizeZeroMB = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType scalarSizeZeroGB = OCCIFactory.eINSTANCE.createNumericType();
	public final static NumericType scalarSizeOneMB = OCCIFactory.eINSTANCE.createNumericType();

	public final static Map<String, DataType> map = new HashMap<>();

	static {
		scalarFrequency.setType(NumericTypeEnum.DOUBLE);
		scalarFrequency.setName("scalarFrequency");
		scalarFrequency.setMinInclusive("0.1");// GHz");//
		scalarFrequency.setMinExclusive("0.2");// GHz");
		
		scalarSizeZeroMB.setType(NumericTypeEnum.INTEGER);
		scalarSizeZeroMB.setName("scalarSizeMinZeroMB");
		scalarSizeZeroMB.setMinInclusive("0");// MB");
		scalarSizeZeroMB.setMinExclusive("1");// MB");
		
		scalarSizeZeroGB.setType(NumericTypeEnum.INTEGER);
		scalarSizeZeroGB.setName("scalarSizeMinZeroGB");
		scalarSizeZeroGB.setMinInclusive("0");// GB");
		scalarSizeZeroGB.setMinExclusive("1");// GB");
		
		scalarSizeOneMB.setType(NumericTypeEnum.INTEGER);
		scalarSizeOneMB.setName("scalarSizeMinOneMB");
		scalarSizeOneMB.setMinInclusive("1");// MB");
		scalarSizeOneMB.setMinExclusive("0");// MB");
		
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
		typeModelIntegerMinZero.setType(NumericTypeEnum.INTEGER);
		typeModelIntegerMinZero.setName("integerMinZero");
		typeModelIntegerMinZero.setMinInclusive("0");
		typeModelIntegerMinZero.setMinExclusive("-1");
		typeModelLong.setType(NumericTypeEnum.LONG);
		typeModelLong.setName("long");
		typeModelShort.setType(NumericTypeEnum.SHORT);
		typeModelShort.setName("short");
		
		typeModelRange.setType(NumericTypeEnum.SHORT);
		typeModelRange.setName("range");
		typeModelRange.setMaxInclusive("32767");
		typeModelRange.setMaxExclusive("32767");
		typeModelRange.setMinInclusive("1");
		
		// semantically same as "range" type, but used explicitly in TOSCA. We create a specific type to remain consistent between both models: TOSCA and OCCI.
		toscaDatatypesNetworkPortDef.setType(NumericTypeEnum.SHORT);
		toscaDatatypesNetworkPortDef.setName("toscadatatypesnetworkPortDef");
		toscaDatatypesNetworkPortDef.setMaxInclusive("32767");
		toscaDatatypesNetworkPortDef.setMaxExclusive("32767");
		toscaDatatypesNetworkPortDef.setMinInclusive("1");
		toscaDatatypesNetworkPortDef.setMinExclusive("0");
		
		typeModelBoolean.setName("boolean");
		typeModelString.setName("string");
		typeModelStringMinOne.setName("stringMinOne");
		typeModelStringMinOne.setMinLength(1);
		
		typeModelMap.setName("map");
		typeModelMap.setInstanceClassName("java.util.Map");
		
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
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelIntegerMinZero);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelLong);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelShort);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelMap);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelVersion);
		ExtensionsManager.getExtension("tosca").getTypes().add(typeModelRange);
		ExtensionsManager.getExtension("tosca").getTypes().add(toscaDatatypesNetworkPortDef);
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
		map.put("integer0", typeModelIntegerMinZero);
		map.put("number", typeModelInteger);
		map.put("uint32", typeModelInteger);
		map.put("long", typeModelLong);
		map.put("short", typeModelShort);
		map.put("map", typeModelMap);
		map.put("version", typeModelVersion);
		map.put("range", typeModelRange);
		map.put("tosca.datatypes.network.PortDef", toscaDatatypesNetworkPortDef);
		map.put("scalar-unit.frequency0.1 GHz", scalarFrequency);
		map.put("scalar-unit.size1 MB", scalarSizeOneMB);
		map.put("scalar-unit.size0 GB", scalarSizeZeroGB);
		map.put("scalar-unit.size0 MB", scalarSizeZeroMB);
	}
	
	public static DataType defineNewArrayType(String entrySchema) {
		ArrayType newArrayType = OCCIFactory.eINSTANCE.createArrayType();
		String [] split = entrySchema.split("\\.");
		entrySchema = split[split.length - 1];
		newArrayType.setName("array" + entrySchema);
		newArrayType.setType(ExtensionsManager.getDataTypeFromItsName(entrySchema));
		map.put("array" + entrySchema, newArrayType);
		ExtensionsManager.currentExtensionToBeBuild.getTypes().add(newArrayType);
		return newArrayType;
	}
}