/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.cmf.occi.tosca/model/tosca.ecore
 * using:
 *   /org.eclipse.cmf.occi.tosca/model/tosca.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.tosca;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.sla.SlaTables;
import org.eclipse.cmf.occi.tosca.ToscaTables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * ToscaTables provides the dispatch tables for the tosca for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class ToscaTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ToscaPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_org_occi_s_tosca_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://org.occi/tosca/ecore", null, org.eclipse.cmf.occi.tosca.ToscaPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/platform/ecore", null, org.eclipse.cmf.occi.platform.PlatformPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Component = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("Component", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Link = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Link", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storage = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Storage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storagelink = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Storagelink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_blockstorage = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_blockstorage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_compute = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_container_application = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_container_application", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_database = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_database", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_dbms = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_dbms", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_objectstorage = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_objectstorage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_root = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_root", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_softwarecomponent = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_softwarecomponent", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_webapplication = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_webapplication", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_webserver = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_nodes_webserver", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_relationships_attachesto = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_relationships_attachesto", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_relationships_connectsto = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_relationships_connectsto", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_relationships_dependson = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_relationships_dependson", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_relationships_hostedon = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_relationships_hostedon", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_relationships_root = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_relationships_root", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_relationships_routesto = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("Tosca_relationships_routesto", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_arrayString = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("arrayString", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_toscadatatypesCredential = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("toscadatatypesCredential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_toscadatatypesnetworkNetworkInfo = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("toscadatatypesnetworkNetworkInfo", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_toscadatatypesnetworkPortInfo = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getClassId("toscadatatypesnetworkPortInfo", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_boolean = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("boolean", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_byte = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("byte", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_double = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("double", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_float = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("float", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_integer = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("integer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_integerMinOne = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("integerMinOne", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_long = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("long", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_map = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("map", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_range = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("range", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_scalarFrequency = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("scalarFrequency", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_scalarSizeMinOneMB = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("scalarSizeMinOneMB", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_scalarSizeMinZeroGB = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("scalarSizeMinZeroGB", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_scalarSizeMinZeroMB = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("scalarSizeMinZeroMB", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_short = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("short", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_string = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("string", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_stringMinOne = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("stringMinOne", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_toscadatatypesnetworkPortDef = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("toscadatatypesnetworkPortDef", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_version = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getDataTypeId("version", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_initiatorEnum = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getEnumerationId("initiatorEnum");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_protocolEnum = org.eclipse.cmf.occi.tosca.ToscaTables.PACKid_http_c_s_s_org_occi_s_tosca_s_ecore.getEnumerationId("protocolEnum");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_blockstorage_c_c_appliesConstraint = "Tosca_nodes_blockstorage::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_compute_c_c_appliesConstraint = "Tosca_nodes_compute::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_container_application_c_c_appliesConstraint = "Tosca_nodes_container_application::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_database_c_c_appliesConstraint = "Tosca_nodes_database::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_objectstorage_c_c_appliesConstraint = "Tosca_nodes_objectstorage::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_root_c_c_appliesConstraint = "Tosca_nodes_root::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_softwarecomponent_c_c_appliesConstraint = "Tosca_nodes_softwarecomponent::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_webapplication_c_c_appliesConstraint = "Tosca_nodes_webapplication::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_relationships_attachesto_c_c_appliesConstraint = "Tosca_relationships_attachesto::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_relationships_root_c_c_appliesConstraint = "Tosca_relationships_root::appliesConstraint";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_boolean = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.tosca.ToscaTables.DATAid_boolean);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_byte = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.tosca.ToscaTables.DATAid_byte);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_double = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.tosca.ToscaTables.DATAid_double);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_float = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.tosca.ToscaTables.DATAid_float);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_integer = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.tosca.ToscaTables.DATAid_integer);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_long = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.tosca.ToscaTables.DATAid_long);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_short = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.tosca.ToscaTables.DATAid_short);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_string = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.tosca.ToscaTables.DATAid_string);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ToscaTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_attachment = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_ATTACHMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_container = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_endpoint = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_endpoint_admin = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT_ADMIN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_endpoint_database = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT_DATABASE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_endpoint_public = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_network_bindable = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_NETWORK_BINDABLE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_node = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_NODE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_operatingsystem = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_OPERATINGSYSTEM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_root = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_ROOT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_scalable = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_CAPABILITIES_SCALABLE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_groups_root = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_GROUPS_ROOT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_interfaces_node_lifecycle_standard = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_interfaces_relationship_configure = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_interfaces_root = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_INTERFACES_ROOT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_blockstorage = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_BLOCKSTORAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_compute = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_COMPUTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_container_application = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_CONTAINER_APPLICATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_container_runtime = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_CONTAINER_RUNTIME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_database = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_DATABASE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_dbms = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_DBMS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_loadbalancer = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_LOADBALANCER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_objectstorage = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_OBJECTSTORAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_root = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_ROOT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_softwarecomponent = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_webapplication = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_WEBAPPLICATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_webserver = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_NODES_WEBSERVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_policies_performance = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_POLICIES_PERFORMANCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_policies_placement = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_POLICIES_PLACEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_policies_root = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_POLICIES_ROOT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_policies_scaling = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_POLICIES_SCALING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_policies_update = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_POLICIES_UPDATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_attachesto = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_ATTACHESTO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_connectsto = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_CONNECTSTO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_dependson = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_DEPENDSON, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_hostedon = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_HOSTEDON, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_root = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_ROOT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_routesto = new EcoreExecutorType(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_ROUTESTO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayBoolean = new EcoreExecutorType(ToscaPackage.Literals.ARRAY_BOOLEAN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayByte = new EcoreExecutorType(ToscaPackage.Literals.ARRAY_BYTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayDouble = new EcoreExecutorType(ToscaPackage.Literals.ARRAY_DOUBLE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayFloat = new EcoreExecutorType(ToscaPackage.Literals.ARRAY_FLOAT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayInteger = new EcoreExecutorType(ToscaPackage.Literals.ARRAY_INTEGER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayLong = new EcoreExecutorType(ToscaPackage.Literals.ARRAY_LONG, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayShort = new EcoreExecutorType(ToscaPackage.Literals.ARRAY_SHORT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayString = new EcoreExecutorType(ToscaPackage.Literals.ARRAY_STRING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _boolean = new EcoreExecutorType("boolean", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _byte = new EcoreExecutorType("byte", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _double = new EcoreExecutorType("double", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _float = new EcoreExecutorType("float", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _initiatorEnum = new EcoreExecutorEnumeration(ToscaPackage.Literals.INITIATOR_ENUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _integer = new EcoreExecutorType("integer", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _integerMinOne = new EcoreExecutorType("integerMinOne", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _long = new EcoreExecutorType("long", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _map = new EcoreExecutorType("map", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _protocolEnum = new EcoreExecutorEnumeration(ToscaPackage.Literals.PROTOCOL_ENUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _range = new EcoreExecutorType("range", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _scalarFrequency = new EcoreExecutorType("scalarFrequency", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _scalarSizeMinOneMB = new EcoreExecutorType("scalarSizeMinOneMB", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _scalarSizeMinZeroGB = new EcoreExecutorType("scalarSizeMinZeroGB", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _scalarSizeMinZeroMB = new EcoreExecutorType("scalarSizeMinZeroMB", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _short = new EcoreExecutorType("short", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _string = new EcoreExecutorType("string", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _stringMinOne = new EcoreExecutorType("stringMinOne", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _toscadatatypesCredential = new EcoreExecutorType(ToscaPackage.Literals.TOSCADATATYPES_CREDENTIAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _toscadatatypesnetworkNetworkInfo = new EcoreExecutorType(ToscaPackage.Literals.TOSCADATATYPESNETWORK_NETWORK_INFO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _toscadatatypesnetworkPortDef = new EcoreExecutorType("toscadatatypesnetworkPortDef", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _toscadatatypesnetworkPortInfo = new EcoreExecutorType(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_INFO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _toscadatatypesnetworkPortSpec = new EcoreExecutorType(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_SPEC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _version = new EcoreExecutorType("version", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Tosca_capabilities_attachment,
			_Tosca_capabilities_container,
			_Tosca_capabilities_endpoint,
			_Tosca_capabilities_endpoint_admin,
			_Tosca_capabilities_endpoint_database,
			_Tosca_capabilities_endpoint_public,
			_Tosca_capabilities_network_bindable,
			_Tosca_capabilities_node,
			_Tosca_capabilities_operatingsystem,
			_Tosca_capabilities_root,
			_Tosca_capabilities_scalable,
			_Tosca_groups_root,
			_Tosca_interfaces_node_lifecycle_standard,
			_Tosca_interfaces_relationship_configure,
			_Tosca_interfaces_root,
			_Tosca_nodes_blockstorage,
			_Tosca_nodes_compute,
			_Tosca_nodes_container_application,
			_Tosca_nodes_container_runtime,
			_Tosca_nodes_database,
			_Tosca_nodes_dbms,
			_Tosca_nodes_loadbalancer,
			_Tosca_nodes_objectstorage,
			_Tosca_nodes_root,
			_Tosca_nodes_softwarecomponent,
			_Tosca_nodes_webapplication,
			_Tosca_nodes_webserver,
			_Tosca_policies_performance,
			_Tosca_policies_placement,
			_Tosca_policies_root,
			_Tosca_policies_scaling,
			_Tosca_policies_update,
			_Tosca_relationships_attachesto,
			_Tosca_relationships_connectsto,
			_Tosca_relationships_dependson,
			_Tosca_relationships_hostedon,
			_Tosca_relationships_root,
			_Tosca_relationships_routesto,
			_arrayBoolean,
			_arrayByte,
			_arrayDouble,
			_arrayFloat,
			_arrayInteger,
			_arrayLong,
			_arrayShort,
			_arrayString,
			_boolean,
			_byte,
			_double,
			_float,
			_initiatorEnum,
			_integer,
			_integerMinOne,
			_long,
			_map,
			_protocolEnum,
			_range,
			_scalarFrequency,
			_scalarSizeMinOneMB,
			_scalarSizeMinZeroGB,
			_scalarSizeMinZeroMB,
			_short,
			_string,
			_stringMinOne,
			_toscadatatypesCredential,
			_toscadatatypesnetworkNetworkInfo,
			_toscadatatypesnetworkPortDef,
			_toscadatatypesnetworkPortInfo,
			_toscadatatypesnetworkPortSpec,
			_version
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_attachment__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_attachment, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_attachment__OclAny = new ExecutorFragment(Types._Tosca_capabilities_attachment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_attachment__OclElement = new ExecutorFragment(Types._Tosca_capabilities_attachment, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_attachment__Tosca_capabilities_attachment = new ExecutorFragment(Types._Tosca_capabilities_attachment, ToscaTables.Types._Tosca_capabilities_attachment);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_attachment__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_attachment, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_container, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container__OclAny = new ExecutorFragment(Types._Tosca_capabilities_container, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container__OclElement = new ExecutorFragment(Types._Tosca_capabilities_container, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_capabilities_container, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_container, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_endpoint, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint__OclAny = new ExecutorFragment(Types._Tosca_capabilities_endpoint, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint__OclElement = new ExecutorFragment(Types._Tosca_capabilities_endpoint, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_capabilities_endpoint, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_endpoint, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_admin__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_endpoint_admin, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_admin__OclAny = new ExecutorFragment(Types._Tosca_capabilities_endpoint_admin, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_admin__OclElement = new ExecutorFragment(Types._Tosca_capabilities_endpoint_admin, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_capabilities_endpoint_admin, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint_admin = new ExecutorFragment(Types._Tosca_capabilities_endpoint_admin, ToscaTables.Types._Tosca_capabilities_endpoint_admin);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_admin__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_endpoint_admin, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_database__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_endpoint_database, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_database__OclAny = new ExecutorFragment(Types._Tosca_capabilities_endpoint_database, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_database__OclElement = new ExecutorFragment(Types._Tosca_capabilities_endpoint_database, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_capabilities_endpoint_database, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint_database = new ExecutorFragment(Types._Tosca_capabilities_endpoint_database, ToscaTables.Types._Tosca_capabilities_endpoint_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_database__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_endpoint_database, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_public__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_endpoint_public, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_public__OclAny = new ExecutorFragment(Types._Tosca_capabilities_endpoint_public, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_public__OclElement = new ExecutorFragment(Types._Tosca_capabilities_endpoint_public, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_capabilities_endpoint_public, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint_public = new ExecutorFragment(Types._Tosca_capabilities_endpoint_public, ToscaTables.Types._Tosca_capabilities_endpoint_public);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_endpoint_public__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_endpoint_public, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_network_bindable__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_network_bindable, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_network_bindable__OclAny = new ExecutorFragment(Types._Tosca_capabilities_network_bindable, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_network_bindable__OclElement = new ExecutorFragment(Types._Tosca_capabilities_network_bindable, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_network_bindable__Tosca_capabilities_network_bindable = new ExecutorFragment(Types._Tosca_capabilities_network_bindable, ToscaTables.Types._Tosca_capabilities_network_bindable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_network_bindable__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_capabilities_network_bindable, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_network_bindable__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_network_bindable, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_node__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_node, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_node__OclAny = new ExecutorFragment(Types._Tosca_capabilities_node, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_node__OclElement = new ExecutorFragment(Types._Tosca_capabilities_node, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_node__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_capabilities_node, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_node__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_node, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_operatingsystem__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_operatingsystem, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_operatingsystem__OclAny = new ExecutorFragment(Types._Tosca_capabilities_operatingsystem, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_operatingsystem__OclElement = new ExecutorFragment(Types._Tosca_capabilities_operatingsystem, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_operatingsystem__Tosca_capabilities_operatingsystem = new ExecutorFragment(Types._Tosca_capabilities_operatingsystem, ToscaTables.Types._Tosca_capabilities_operatingsystem);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_operatingsystem__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_operatingsystem, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_root__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_root, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_root__OclAny = new ExecutorFragment(Types._Tosca_capabilities_root, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_root__OclElement = new ExecutorFragment(Types._Tosca_capabilities_root, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_root__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_root, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_scalable__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_scalable, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_scalable__OclAny = new ExecutorFragment(Types._Tosca_capabilities_scalable, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_scalable__OclElement = new ExecutorFragment(Types._Tosca_capabilities_scalable, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_scalable__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_scalable, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_scalable__Tosca_capabilities_scalable = new ExecutorFragment(Types._Tosca_capabilities_scalable, ToscaTables.Types._Tosca_capabilities_scalable);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_groups_root__MixinBase = new ExecutorFragment(Types._Tosca_groups_root, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_groups_root__OclAny = new ExecutorFragment(Types._Tosca_groups_root, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_groups_root__OclElement = new ExecutorFragment(Types._Tosca_groups_root, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_groups_root__Tosca_groups_root = new ExecutorFragment(Types._Tosca_groups_root, ToscaTables.Types._Tosca_groups_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_node_lifecycle_standard__MixinBase = new ExecutorFragment(Types._Tosca_interfaces_node_lifecycle_standard, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_node_lifecycle_standard__OclAny = new ExecutorFragment(Types._Tosca_interfaces_node_lifecycle_standard, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_node_lifecycle_standard__OclElement = new ExecutorFragment(Types._Tosca_interfaces_node_lifecycle_standard, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_interfaces_node_lifecycle_standard, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_interfaces_node_lifecycle_standard, ToscaTables.Types._Tosca_interfaces_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_relationship_configure__MixinBase = new ExecutorFragment(Types._Tosca_interfaces_relationship_configure, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_relationship_configure__OclAny = new ExecutorFragment(Types._Tosca_interfaces_relationship_configure, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_relationship_configure__OclElement = new ExecutorFragment(Types._Tosca_interfaces_relationship_configure, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_relationship_configure__Tosca_interfaces_relationship_configure = new ExecutorFragment(Types._Tosca_interfaces_relationship_configure, ToscaTables.Types._Tosca_interfaces_relationship_configure);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_relationship_configure__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_interfaces_relationship_configure, ToscaTables.Types._Tosca_interfaces_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_root__MixinBase = new ExecutorFragment(Types._Tosca_interfaces_root, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_root__OclAny = new ExecutorFragment(Types._Tosca_interfaces_root, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_root__OclElement = new ExecutorFragment(Types._Tosca_interfaces_root, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_interfaces_root__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_interfaces_root, ToscaTables.Types._Tosca_interfaces_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__MixinBase = new ExecutorFragment(Types._Tosca_nodes_blockstorage, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__OclAny = new ExecutorFragment(Types._Tosca_nodes_blockstorage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__OclElement = new ExecutorFragment(Types._Tosca_nodes_blockstorage, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__Tosca_capabilities_attachment = new ExecutorFragment(Types._Tosca_nodes_blockstorage, ToscaTables.Types._Tosca_capabilities_attachment);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_blockstorage, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_blockstorage, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_blockstorage, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_blockstorage, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__Tosca_nodes_blockstorage = new ExecutorFragment(Types._Tosca_nodes_blockstorage, ToscaTables.Types._Tosca_nodes_blockstorage);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_blockstorage__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_blockstorage, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__MixinBase = new ExecutorFragment(Types._Tosca_nodes_compute, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__OclAny = new ExecutorFragment(Types._Tosca_nodes_compute, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__OclElement = new ExecutorFragment(Types._Tosca_nodes_compute, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_capabilities_endpoint_admin = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_capabilities_endpoint_admin);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_capabilities_network_bindable = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_capabilities_network_bindable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_capabilities_operatingsystem = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_capabilities_operatingsystem);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_capabilities_scalable = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_capabilities_scalable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_nodes_compute = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_nodes_compute);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_compute__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_compute, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application__MixinBase = new ExecutorFragment(Types._Tosca_nodes_container_application, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application__OclAny = new ExecutorFragment(Types._Tosca_nodes_container_application, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application__OclElement = new ExecutorFragment(Types._Tosca_nodes_container_application, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_container_application, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_container_application, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_container_application, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_container_application, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application__Tosca_nodes_container_application = new ExecutorFragment(Types._Tosca_nodes_container_application, ToscaTables.Types._Tosca_nodes_container_application);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_container_application, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__MixinBase = new ExecutorFragment(Types._Tosca_nodes_container_runtime, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__OclAny = new ExecutorFragment(Types._Tosca_nodes_container_runtime, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__OclElement = new ExecutorFragment(Types._Tosca_nodes_container_runtime, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_container_runtime, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_container_runtime, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_container_runtime, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__Tosca_capabilities_scalable = new ExecutorFragment(Types._Tosca_nodes_container_runtime, ToscaTables.Types._Tosca_capabilities_scalable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_container_runtime, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_container_runtime, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__Tosca_nodes_container_runtime = new ExecutorFragment(Types._Tosca_nodes_container_runtime, ToscaTables.Types._Tosca_nodes_container_runtime);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_container_runtime, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_runtime__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_container_runtime, ToscaTables.Types._Tosca_nodes_softwarecomponent);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__MixinBase = new ExecutorFragment(Types._Tosca_nodes_database, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__OclAny = new ExecutorFragment(Types._Tosca_nodes_database, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__OclElement = new ExecutorFragment(Types._Tosca_nodes_database, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_database, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__Tosca_capabilities_endpoint_database = new ExecutorFragment(Types._Tosca_nodes_database, ToscaTables.Types._Tosca_capabilities_endpoint_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_database, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_database, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_database, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_database, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__Tosca_nodes_database = new ExecutorFragment(Types._Tosca_nodes_database, ToscaTables.Types._Tosca_nodes_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_database, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__MixinBase = new ExecutorFragment(Types._Tosca_nodes_dbms, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__OclAny = new ExecutorFragment(Types._Tosca_nodes_dbms, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__OclElement = new ExecutorFragment(Types._Tosca_nodes_dbms, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_dbms, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_dbms, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_dbms, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_dbms, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_dbms, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__Tosca_nodes_dbms = new ExecutorFragment(Types._Tosca_nodes_dbms, ToscaTables.Types._Tosca_nodes_dbms);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_dbms, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_dbms, ToscaTables.Types._Tosca_nodes_softwarecomponent);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__MixinBase = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__OclAny = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__OclElement = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint_public = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, ToscaTables.Types._Tosca_capabilities_endpoint_public);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__Tosca_nodes_loadbalancer = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, ToscaTables.Types._Tosca_nodes_loadbalancer);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_loadbalancer__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_loadbalancer, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__MixinBase = new ExecutorFragment(Types._Tosca_nodes_objectstorage, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__OclAny = new ExecutorFragment(Types._Tosca_nodes_objectstorage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__OclElement = new ExecutorFragment(Types._Tosca_nodes_objectstorage, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_objectstorage, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_objectstorage, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_objectstorage, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_objectstorage, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_objectstorage, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__Tosca_nodes_objectstorage = new ExecutorFragment(Types._Tosca_nodes_objectstorage, ToscaTables.Types._Tosca_nodes_objectstorage);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_objectstorage__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_objectstorage, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_root__MixinBase = new ExecutorFragment(Types._Tosca_nodes_root, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_root__OclAny = new ExecutorFragment(Types._Tosca_nodes_root, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_root__OclElement = new ExecutorFragment(Types._Tosca_nodes_root, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_root__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_root, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_root__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_root, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_root__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_root, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_root__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_root, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_root__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_root, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent__MixinBase = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent__OclAny = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent__OclElement = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent, ToscaTables.Types._Tosca_nodes_softwarecomponent);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__MixinBase = new ExecutorFragment(Types._Tosca_nodes_webapplication, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__OclAny = new ExecutorFragment(Types._Tosca_nodes_webapplication, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__OclElement = new ExecutorFragment(Types._Tosca_nodes_webapplication, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_webapplication, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_webapplication, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_webapplication, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_webapplication, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_webapplication, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_webapplication, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication__Tosca_nodes_webapplication = new ExecutorFragment(Types._Tosca_nodes_webapplication, ToscaTables.Types._Tosca_nodes_webapplication);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__MixinBase = new ExecutorFragment(Types._Tosca_nodes_webserver, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__OclAny = new ExecutorFragment(Types._Tosca_nodes_webserver, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__OclElement = new ExecutorFragment(Types._Tosca_nodes_webserver, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_capabilities_endpoint_admin = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_capabilities_endpoint_admin);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_interfaces_node_lifecycle_standard = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_interfaces_node_lifecycle_standard);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_interfaces_root = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_interfaces_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_nodes_softwarecomponent);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webserver__Tosca_nodes_webserver = new ExecutorFragment(Types._Tosca_nodes_webserver, ToscaTables.Types._Tosca_nodes_webserver);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_performance__Agreement_term = new ExecutorFragment(Types._Tosca_policies_performance, SlaTables.Types._Agreement_term);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_performance__MixinBase = new ExecutorFragment(Types._Tosca_policies_performance, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_performance__OclAny = new ExecutorFragment(Types._Tosca_policies_performance, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_performance__OclElement = new ExecutorFragment(Types._Tosca_policies_performance, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_performance__Tosca_policies_performance = new ExecutorFragment(Types._Tosca_policies_performance, ToscaTables.Types._Tosca_policies_performance);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_performance__Tosca_policies_root = new ExecutorFragment(Types._Tosca_policies_performance, ToscaTables.Types._Tosca_policies_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_placement__Agreement_term = new ExecutorFragment(Types._Tosca_policies_placement, SlaTables.Types._Agreement_term);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_placement__MixinBase = new ExecutorFragment(Types._Tosca_policies_placement, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_placement__OclAny = new ExecutorFragment(Types._Tosca_policies_placement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_placement__OclElement = new ExecutorFragment(Types._Tosca_policies_placement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_placement__Tosca_policies_placement = new ExecutorFragment(Types._Tosca_policies_placement, ToscaTables.Types._Tosca_policies_placement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_placement__Tosca_policies_root = new ExecutorFragment(Types._Tosca_policies_placement, ToscaTables.Types._Tosca_policies_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_root__Agreement_term = new ExecutorFragment(Types._Tosca_policies_root, SlaTables.Types._Agreement_term);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_root__MixinBase = new ExecutorFragment(Types._Tosca_policies_root, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_root__OclAny = new ExecutorFragment(Types._Tosca_policies_root, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_root__OclElement = new ExecutorFragment(Types._Tosca_policies_root, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_root__Tosca_policies_root = new ExecutorFragment(Types._Tosca_policies_root, ToscaTables.Types._Tosca_policies_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_scaling__Agreement_term = new ExecutorFragment(Types._Tosca_policies_scaling, SlaTables.Types._Agreement_term);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_scaling__MixinBase = new ExecutorFragment(Types._Tosca_policies_scaling, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_scaling__OclAny = new ExecutorFragment(Types._Tosca_policies_scaling, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_scaling__OclElement = new ExecutorFragment(Types._Tosca_policies_scaling, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_scaling__Tosca_policies_root = new ExecutorFragment(Types._Tosca_policies_scaling, ToscaTables.Types._Tosca_policies_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_scaling__Tosca_policies_scaling = new ExecutorFragment(Types._Tosca_policies_scaling, ToscaTables.Types._Tosca_policies_scaling);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_update__Agreement_term = new ExecutorFragment(Types._Tosca_policies_update, SlaTables.Types._Agreement_term);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_update__MixinBase = new ExecutorFragment(Types._Tosca_policies_update, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_update__OclAny = new ExecutorFragment(Types._Tosca_policies_update, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_update__OclElement = new ExecutorFragment(Types._Tosca_policies_update, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_update__Tosca_policies_root = new ExecutorFragment(Types._Tosca_policies_update, ToscaTables.Types._Tosca_policies_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_policies_update__Tosca_policies_update = new ExecutorFragment(Types._Tosca_policies_update, ToscaTables.Types._Tosca_policies_update);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_attachesto__MixinBase = new ExecutorFragment(Types._Tosca_relationships_attachesto, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_attachesto__OclAny = new ExecutorFragment(Types._Tosca_relationships_attachesto, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_attachesto__OclElement = new ExecutorFragment(Types._Tosca_relationships_attachesto, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_attachesto__Tosca_relationships_attachesto = new ExecutorFragment(Types._Tosca_relationships_attachesto, ToscaTables.Types._Tosca_relationships_attachesto);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_attachesto__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_attachesto, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_connectsto__MixinBase = new ExecutorFragment(Types._Tosca_relationships_connectsto, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_connectsto__OclAny = new ExecutorFragment(Types._Tosca_relationships_connectsto, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_connectsto__OclElement = new ExecutorFragment(Types._Tosca_relationships_connectsto, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_connectsto__Tosca_relationships_connectsto = new ExecutorFragment(Types._Tosca_relationships_connectsto, ToscaTables.Types._Tosca_relationships_connectsto);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_connectsto__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_connectsto, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_dependson__MixinBase = new ExecutorFragment(Types._Tosca_relationships_dependson, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_dependson__OclAny = new ExecutorFragment(Types._Tosca_relationships_dependson, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_dependson__OclElement = new ExecutorFragment(Types._Tosca_relationships_dependson, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_dependson__Tosca_relationships_dependson = new ExecutorFragment(Types._Tosca_relationships_dependson, ToscaTables.Types._Tosca_relationships_dependson);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_dependson__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_dependson, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_hostedon__MixinBase = new ExecutorFragment(Types._Tosca_relationships_hostedon, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_hostedon__OclAny = new ExecutorFragment(Types._Tosca_relationships_hostedon, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_hostedon__OclElement = new ExecutorFragment(Types._Tosca_relationships_hostedon, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_hostedon__Tosca_relationships_hostedon = new ExecutorFragment(Types._Tosca_relationships_hostedon, ToscaTables.Types._Tosca_relationships_hostedon);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_hostedon__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_hostedon, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_root__MixinBase = new ExecutorFragment(Types._Tosca_relationships_root, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_root__OclAny = new ExecutorFragment(Types._Tosca_relationships_root, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_root__OclElement = new ExecutorFragment(Types._Tosca_relationships_root, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_root__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_root, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_routesto__MixinBase = new ExecutorFragment(Types._Tosca_relationships_routesto, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_routesto__OclAny = new ExecutorFragment(Types._Tosca_relationships_routesto, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_routesto__OclElement = new ExecutorFragment(Types._Tosca_relationships_routesto, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_routesto__Tosca_relationships_connectsto = new ExecutorFragment(Types._Tosca_relationships_routesto, ToscaTables.Types._Tosca_relationships_connectsto);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_routesto__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_routesto, ToscaTables.Types._Tosca_relationships_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_routesto__Tosca_relationships_routesto = new ExecutorFragment(Types._Tosca_relationships_routesto, ToscaTables.Types._Tosca_relationships_routesto);

		private static final /*@NonNull*/ ExecutorFragment _arrayBoolean__OclAny = new ExecutorFragment(Types._arrayBoolean, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayBoolean__OclElement = new ExecutorFragment(Types._arrayBoolean, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayBoolean__arrayBoolean = new ExecutorFragment(Types._arrayBoolean, ToscaTables.Types._arrayBoolean);

		private static final /*@NonNull*/ ExecutorFragment _arrayByte__OclAny = new ExecutorFragment(Types._arrayByte, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayByte__OclElement = new ExecutorFragment(Types._arrayByte, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayByte__arrayByte = new ExecutorFragment(Types._arrayByte, ToscaTables.Types._arrayByte);

		private static final /*@NonNull*/ ExecutorFragment _arrayDouble__OclAny = new ExecutorFragment(Types._arrayDouble, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayDouble__OclElement = new ExecutorFragment(Types._arrayDouble, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayDouble__arrayDouble = new ExecutorFragment(Types._arrayDouble, ToscaTables.Types._arrayDouble);

		private static final /*@NonNull*/ ExecutorFragment _arrayFloat__OclAny = new ExecutorFragment(Types._arrayFloat, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayFloat__OclElement = new ExecutorFragment(Types._arrayFloat, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayFloat__arrayFloat = new ExecutorFragment(Types._arrayFloat, ToscaTables.Types._arrayFloat);

		private static final /*@NonNull*/ ExecutorFragment _arrayInteger__OclAny = new ExecutorFragment(Types._arrayInteger, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayInteger__OclElement = new ExecutorFragment(Types._arrayInteger, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayInteger__arrayInteger = new ExecutorFragment(Types._arrayInteger, ToscaTables.Types._arrayInteger);

		private static final /*@NonNull*/ ExecutorFragment _arrayLong__OclAny = new ExecutorFragment(Types._arrayLong, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayLong__OclElement = new ExecutorFragment(Types._arrayLong, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayLong__arrayLong = new ExecutorFragment(Types._arrayLong, ToscaTables.Types._arrayLong);

		private static final /*@NonNull*/ ExecutorFragment _arrayShort__OclAny = new ExecutorFragment(Types._arrayShort, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayShort__OclElement = new ExecutorFragment(Types._arrayShort, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayShort__arrayShort = new ExecutorFragment(Types._arrayShort, ToscaTables.Types._arrayShort);

		private static final /*@NonNull*/ ExecutorFragment _arrayString__OclAny = new ExecutorFragment(Types._arrayString, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayString__OclElement = new ExecutorFragment(Types._arrayString, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayString__arrayString = new ExecutorFragment(Types._arrayString, ToscaTables.Types._arrayString);

		private static final /*@NonNull*/ ExecutorFragment _boolean__OclAny = new ExecutorFragment(Types._boolean, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _boolean__boolean = new ExecutorFragment(Types._boolean, ToscaTables.Types._boolean);

		private static final /*@NonNull*/ ExecutorFragment _byte__OclAny = new ExecutorFragment(Types._byte, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _byte__byte = new ExecutorFragment(Types._byte, ToscaTables.Types._byte);

		private static final /*@NonNull*/ ExecutorFragment _double__OclAny = new ExecutorFragment(Types._double, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _double__double = new ExecutorFragment(Types._double, ToscaTables.Types._double);

		private static final /*@NonNull*/ ExecutorFragment _float__OclAny = new ExecutorFragment(Types._float, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _float__float = new ExecutorFragment(Types._float, ToscaTables.Types._float);

		private static final /*@NonNull*/ ExecutorFragment _initiatorEnum__OclAny = new ExecutorFragment(Types._initiatorEnum, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _initiatorEnum__OclElement = new ExecutorFragment(Types._initiatorEnum, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _initiatorEnum__OclEnumeration = new ExecutorFragment(Types._initiatorEnum, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _initiatorEnum__OclType = new ExecutorFragment(Types._initiatorEnum, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _initiatorEnum__initiatorEnum = new ExecutorFragment(Types._initiatorEnum, ToscaTables.Types._initiatorEnum);

		private static final /*@NonNull*/ ExecutorFragment _integer__OclAny = new ExecutorFragment(Types._integer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _integer__integer = new ExecutorFragment(Types._integer, ToscaTables.Types._integer);

		private static final /*@NonNull*/ ExecutorFragment _integerMinOne__OclAny = new ExecutorFragment(Types._integerMinOne, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _integerMinOne__integerMinOne = new ExecutorFragment(Types._integerMinOne, ToscaTables.Types._integerMinOne);

		private static final /*@NonNull*/ ExecutorFragment _long__OclAny = new ExecutorFragment(Types._long, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _long__long = new ExecutorFragment(Types._long, ToscaTables.Types._long);

		private static final /*@NonNull*/ ExecutorFragment _map__OclAny = new ExecutorFragment(Types._map, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _map__map = new ExecutorFragment(Types._map, ToscaTables.Types._map);

		private static final /*@NonNull*/ ExecutorFragment _protocolEnum__OclAny = new ExecutorFragment(Types._protocolEnum, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _protocolEnum__OclElement = new ExecutorFragment(Types._protocolEnum, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _protocolEnum__OclEnumeration = new ExecutorFragment(Types._protocolEnum, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _protocolEnum__OclType = new ExecutorFragment(Types._protocolEnum, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _protocolEnum__protocolEnum = new ExecutorFragment(Types._protocolEnum, ToscaTables.Types._protocolEnum);

		private static final /*@NonNull*/ ExecutorFragment _range__OclAny = new ExecutorFragment(Types._range, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _range__range = new ExecutorFragment(Types._range, ToscaTables.Types._range);

		private static final /*@NonNull*/ ExecutorFragment _scalarFrequency__OclAny = new ExecutorFragment(Types._scalarFrequency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _scalarFrequency__scalarFrequency = new ExecutorFragment(Types._scalarFrequency, ToscaTables.Types._scalarFrequency);

		private static final /*@NonNull*/ ExecutorFragment _scalarSizeMinOneMB__OclAny = new ExecutorFragment(Types._scalarSizeMinOneMB, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _scalarSizeMinOneMB__scalarSizeMinOneMB = new ExecutorFragment(Types._scalarSizeMinOneMB, ToscaTables.Types._scalarSizeMinOneMB);

		private static final /*@NonNull*/ ExecutorFragment _scalarSizeMinZeroGB__OclAny = new ExecutorFragment(Types._scalarSizeMinZeroGB, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _scalarSizeMinZeroGB__scalarSizeMinZeroGB = new ExecutorFragment(Types._scalarSizeMinZeroGB, ToscaTables.Types._scalarSizeMinZeroGB);

		private static final /*@NonNull*/ ExecutorFragment _scalarSizeMinZeroMB__OclAny = new ExecutorFragment(Types._scalarSizeMinZeroMB, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _scalarSizeMinZeroMB__scalarSizeMinZeroMB = new ExecutorFragment(Types._scalarSizeMinZeroMB, ToscaTables.Types._scalarSizeMinZeroMB);

		private static final /*@NonNull*/ ExecutorFragment _short__OclAny = new ExecutorFragment(Types._short, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _short__short = new ExecutorFragment(Types._short, ToscaTables.Types._short);

		private static final /*@NonNull*/ ExecutorFragment _string__OclAny = new ExecutorFragment(Types._string, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _string__string = new ExecutorFragment(Types._string, ToscaTables.Types._string);

		private static final /*@NonNull*/ ExecutorFragment _stringMinOne__OclAny = new ExecutorFragment(Types._stringMinOne, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _stringMinOne__stringMinOne = new ExecutorFragment(Types._stringMinOne, ToscaTables.Types._stringMinOne);

		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesCredential__OclAny = new ExecutorFragment(Types._toscadatatypesCredential, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesCredential__OclElement = new ExecutorFragment(Types._toscadatatypesCredential, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesCredential__toscadatatypesCredential = new ExecutorFragment(Types._toscadatatypesCredential, ToscaTables.Types._toscadatatypesCredential);

		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkNetworkInfo__OclAny = new ExecutorFragment(Types._toscadatatypesnetworkNetworkInfo, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkNetworkInfo__OclElement = new ExecutorFragment(Types._toscadatatypesnetworkNetworkInfo, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkNetworkInfo__toscadatatypesnetworkNetworkInfo = new ExecutorFragment(Types._toscadatatypesnetworkNetworkInfo, ToscaTables.Types._toscadatatypesnetworkNetworkInfo);

		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkPortDef__OclAny = new ExecutorFragment(Types._toscadatatypesnetworkPortDef, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkPortDef__toscadatatypesnetworkPortDef = new ExecutorFragment(Types._toscadatatypesnetworkPortDef, ToscaTables.Types._toscadatatypesnetworkPortDef);

		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkPortInfo__OclAny = new ExecutorFragment(Types._toscadatatypesnetworkPortInfo, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkPortInfo__OclElement = new ExecutorFragment(Types._toscadatatypesnetworkPortInfo, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkPortInfo__toscadatatypesnetworkPortInfo = new ExecutorFragment(Types._toscadatatypesnetworkPortInfo, ToscaTables.Types._toscadatatypesnetworkPortInfo);

		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkPortSpec__OclAny = new ExecutorFragment(Types._toscadatatypesnetworkPortSpec, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkPortSpec__OclElement = new ExecutorFragment(Types._toscadatatypesnetworkPortSpec, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _toscadatatypesnetworkPortSpec__toscadatatypesnetworkPortSpec = new ExecutorFragment(Types._toscadatatypesnetworkPortSpec, ToscaTables.Types._toscadatatypesnetworkPortSpec);

		private static final /*@NonNull*/ ExecutorFragment _version__OclAny = new ExecutorFragment(Types._version, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _version__version = new ExecutorFragment(Types._version, ToscaTables.Types._version);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_node_lifecycle_standard__configure = new ExecutorOperation("configure", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_node_lifecycle_standard,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_node_lifecycle_standard__create = new ExecutorOperation("create", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_node_lifecycle_standard,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_node_lifecycle_standard__delete = new ExecutorOperation("delete", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_node_lifecycle_standard,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_relationship_configure__add_source = new ExecutorOperation("add_source", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_relationship_configure,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_relationship_configure__add_target = new ExecutorOperation("add_target", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_relationship_configure,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_relationship_configure__post_configure_source = new ExecutorOperation("post_configure_source", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_relationship_configure,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_relationship_configure__post_configure_target = new ExecutorOperation("post_configure_target", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_relationship_configure,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_relationship_configure__pre_configure_source = new ExecutorOperation("pre_configure_source", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_relationship_configure,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_relationship_configure__pre_configure_target = new ExecutorOperation("pre_configure_target", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_relationship_configure,
			5, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_relationship_configure__remove_target = new ExecutorOperation("remove_target", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_relationship_configure,
			6, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Tosca_interfaces_relationship_configure__target_changed = new ExecutorOperation("target_changed", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Tosca_interfaces_relationship_configure,
			7, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_container__cpuFrequency = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY, Types._Tosca_capabilities_container, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_container__diskSize = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE, Types._Tosca_capabilities_container, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_container__memSize = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE, Types._Tosca_capabilities_container, 2);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_container__numCpus = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS, Types._Tosca_capabilities_container, 3);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint__initiator = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR, Types._Tosca_capabilities_endpoint, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint__networkName = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME, Types._Tosca_capabilities_endpoint, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint__port = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__PORT, Types._Tosca_capabilities_endpoint, 2);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint__portName = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME, Types._Tosca_capabilities_endpoint, 3);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint__ports = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__PORTS, Types._Tosca_capabilities_endpoint, 4);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint__protocol = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL, Types._Tosca_capabilities_endpoint, 5);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint__secure = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__SECURE, Types._Tosca_capabilities_endpoint, 6);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint__urlPath = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH, Types._Tosca_capabilities_endpoint, 7);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint_public__dnsName = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME, Types._Tosca_capabilities_endpoint_public, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_endpoint_public__floating = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING, Types._Tosca_capabilities_endpoint_public, 1);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_operatingsystem__architecture = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_OPERATINGSYSTEM__ARCHITECTURE, Types._Tosca_capabilities_operatingsystem, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_operatingsystem__distribution = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_OPERATINGSYSTEM__DISTRIBUTION, Types._Tosca_capabilities_operatingsystem, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_operatingsystem__type = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_OPERATINGSYSTEM__TYPE, Types._Tosca_capabilities_operatingsystem, 2);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_operatingsystem__version = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_OPERATINGSYSTEM__VERSION, Types._Tosca_capabilities_operatingsystem, 3);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_scalable__defaultInstances = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES, Types._Tosca_capabilities_scalable, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_scalable__maxInstances = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES, Types._Tosca_capabilities_scalable, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_scalable__minInstances = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES, Types._Tosca_capabilities_scalable, 2);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_blockstorage__size = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_BLOCKSTORAGE__SIZE, Types._Tosca_nodes_blockstorage, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_blockstorage__snapshotId = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_BLOCKSTORAGE__SNAPSHOT_ID, Types._Tosca_nodes_blockstorage, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_blockstorage__volumeId = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_BLOCKSTORAGE__VOLUME_ID, Types._Tosca_nodes_blockstorage, 2);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_compute__networks = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_COMPUTE__NETWORKS, Types._Tosca_nodes_compute, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_compute__privateAddress = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS, Types._Tosca_nodes_compute, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_compute__publicAddress = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS, Types._Tosca_nodes_compute, 2);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_database__name = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_DATABASE__NAME, Types._Tosca_nodes_database, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_database__password = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_DATABASE__PASSWORD, Types._Tosca_nodes_database, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_database__user = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_DATABASE__USER, Types._Tosca_nodes_database, 2);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_dbms__port = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_DBMS__PORT, Types._Tosca_nodes_dbms, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_dbms__rootPassword = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_DBMS__ROOT_PASSWORD, Types._Tosca_nodes_dbms, 1);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_loadbalancer__algorithm = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_LOADBALANCER__ALGORITHM, Types._Tosca_nodes_loadbalancer, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_objectstorage__name = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_OBJECTSTORAGE__NAME, Types._Tosca_nodes_objectstorage, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_objectstorage__size = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_OBJECTSTORAGE__SIZE, Types._Tosca_nodes_objectstorage, 1);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_softwarecomponent__adminCredential = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL, Types._Tosca_nodes_softwarecomponent, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_softwarecomponent__componentVersion = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION, Types._Tosca_nodes_softwarecomponent, 1);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_webapplication__contextRoot = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT, Types._Tosca_nodes_webapplication, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_relationships_attachesto__location = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_ATTACHESTO__LOCATION, Types._Tosca_relationships_attachesto, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_relationships_connectsto__credential = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_CONNECTSTO__CREDENTIAL, Types._Tosca_relationships_connectsto, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_relationships_root__state = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_ROOT__STATE, Types._Tosca_relationships_root, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_relationships_root__toscaId = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID, Types._Tosca_relationships_root, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_relationships_root__toscaName = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME, Types._Tosca_relationships_root, 2);

		public static final /*@NonNull*/ ExecutorProperty _arrayBoolean__values = new EcoreExecutorProperty(ToscaPackage.Literals.ARRAY_BOOLEAN__VALUES, Types._arrayBoolean, 0);

		public static final /*@NonNull*/ ExecutorProperty _arrayByte__values = new EcoreExecutorProperty(ToscaPackage.Literals.ARRAY_BYTE__VALUES, Types._arrayByte, 0);

		public static final /*@NonNull*/ ExecutorProperty _arrayDouble__values = new EcoreExecutorProperty(ToscaPackage.Literals.ARRAY_DOUBLE__VALUES, Types._arrayDouble, 0);

		public static final /*@NonNull*/ ExecutorProperty _arrayFloat__values = new EcoreExecutorProperty(ToscaPackage.Literals.ARRAY_FLOAT__VALUES, Types._arrayFloat, 0);

		public static final /*@NonNull*/ ExecutorProperty _arrayInteger__values = new EcoreExecutorProperty(ToscaPackage.Literals.ARRAY_INTEGER__VALUES, Types._arrayInteger, 0);

		public static final /*@NonNull*/ ExecutorProperty _arrayLong__values = new EcoreExecutorProperty(ToscaPackage.Literals.ARRAY_LONG__VALUES, Types._arrayLong, 0);

		public static final /*@NonNull*/ ExecutorProperty _arrayShort__values = new EcoreExecutorProperty(ToscaPackage.Literals.ARRAY_SHORT__VALUES, Types._arrayShort, 0);

		public static final /*@NonNull*/ ExecutorProperty _arrayString__values = new EcoreExecutorProperty(ToscaPackage.Literals.ARRAY_STRING__VALUES, Types._arrayString, 0);
		public static final /*@NonNull*/ ExecutorProperty _arrayString__toscadatatypesnetworkNetworkInfo__addresses = new ExecutorPropertyWithImplementation("toscadatatypesnetworkNetworkInfo", Types._arrayString, 1, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES));
		public static final /*@NonNull*/ ExecutorProperty _arrayString__toscadatatypesnetworkPortInfo__addresses = new ExecutorPropertyWithImplementation("toscadatatypesnetworkPortInfo", Types._arrayString, 2, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_INFO__ADDRESSES));

		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesCredential__keys = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPES_CREDENTIAL__KEYS, Types._toscadatatypesCredential, 0);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesCredential__protocol = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPES_CREDENTIAL__PROTOCOL, Types._toscadatatypesCredential, 1);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesCredential__token = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPES_CREDENTIAL__TOKEN, Types._toscadatatypesCredential, 2);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesCredential__tokentype = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPES_CREDENTIAL__TOKENTYPE, Types._toscadatatypesCredential, 3);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesCredential__user = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPES_CREDENTIAL__USER, Types._toscadatatypesCredential, 4);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesCredential__Tosca_nodes_softwarecomponent__adminCredential = new ExecutorPropertyWithImplementation("Tosca_nodes_softwarecomponent", Types._toscadatatypesCredential, 5, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL));
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesCredential__Tosca_relationships_connectsto__credential = new ExecutorPropertyWithImplementation("Tosca_relationships_connectsto", Types._toscadatatypesCredential, 6, new EcoreLibraryOppositeProperty(ToscaPackage.Literals.TOSCA_RELATIONSHIPS_CONNECTSTO__CREDENTIAL));

		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkNetworkInfo__addresses = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES, Types._toscadatatypesnetworkNetworkInfo, 0);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkNetworkInfo__networkid = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKID, Types._toscadatatypesnetworkNetworkInfo, 1);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkNetworkInfo__networkname = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKNAME, Types._toscadatatypesnetworkNetworkInfo, 2);

		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortInfo__addresses = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_INFO__ADDRESSES, Types._toscadatatypesnetworkPortInfo, 0);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortInfo__macaddress = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_INFO__MACADDRESS, Types._toscadatatypesnetworkPortInfo, 1);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortInfo__networkid = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_INFO__NETWORKID, Types._toscadatatypesnetworkPortInfo, 2);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortInfo__portid = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_INFO__PORTID, Types._toscadatatypesnetworkPortInfo, 3);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortInfo__portname = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_INFO__PORTNAME, Types._toscadatatypesnetworkPortInfo, 4);

		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortSpec__protocol = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_SPEC__PROTOCOL, Types._toscadatatypesnetworkPortSpec, 0);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortSpec__source = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_SPEC__SOURCE, Types._toscadatatypesnetworkPortSpec, 1);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortSpec__sourcerange = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_SPEC__SOURCERANGE, Types._toscadatatypesnetworkPortSpec, 2);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortSpec__target = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_SPEC__TARGET, Types._toscadatatypesnetworkPortSpec, 3);
		public static final /*@NonNull*/ ExecutorProperty _toscadatatypesnetworkPortSpec__targetrange = new EcoreExecutorProperty(ToscaPackage.Literals.TOSCADATATYPESNETWORK_PORT_SPEC__TARGETRANGE, Types._toscadatatypesnetworkPortSpec, 4);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_attachment =
		{
			Fragments._Tosca_capabilities_attachment__OclAny /* 0 */,
			Fragments._Tosca_capabilities_attachment__OclElement /* 1 */,
			Fragments._Tosca_capabilities_attachment__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_attachment__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_attachment__Tosca_capabilities_attachment /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_attachment = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_container =
		{
			Fragments._Tosca_capabilities_container__OclAny /* 0 */,
			Fragments._Tosca_capabilities_container__OclElement /* 1 */,
			Fragments._Tosca_capabilities_container__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_container__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_container__Tosca_capabilities_container /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_container = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_endpoint =
		{
			Fragments._Tosca_capabilities_endpoint__OclAny /* 0 */,
			Fragments._Tosca_capabilities_endpoint__OclElement /* 1 */,
			Fragments._Tosca_capabilities_endpoint__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_endpoint__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_endpoint__Tosca_capabilities_endpoint /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_endpoint = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_endpoint_admin =
		{
			Fragments._Tosca_capabilities_endpoint_admin__OclAny /* 0 */,
			Fragments._Tosca_capabilities_endpoint_admin__OclElement /* 1 */,
			Fragments._Tosca_capabilities_endpoint_admin__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_endpoint_admin__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint /* 4 */,
			Fragments._Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint_admin /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_endpoint_admin = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_endpoint_database =
		{
			Fragments._Tosca_capabilities_endpoint_database__OclAny /* 0 */,
			Fragments._Tosca_capabilities_endpoint_database__OclElement /* 1 */,
			Fragments._Tosca_capabilities_endpoint_database__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_endpoint_database__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint /* 4 */,
			Fragments._Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint_database /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_endpoint_database = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_endpoint_public =
		{
			Fragments._Tosca_capabilities_endpoint_public__OclAny /* 0 */,
			Fragments._Tosca_capabilities_endpoint_public__OclElement /* 1 */,
			Fragments._Tosca_capabilities_endpoint_public__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_endpoint_public__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint /* 4 */,
			Fragments._Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint_public /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_endpoint_public = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_network_bindable =
		{
			Fragments._Tosca_capabilities_network_bindable__OclAny /* 0 */,
			Fragments._Tosca_capabilities_network_bindable__OclElement /* 1 */,
			Fragments._Tosca_capabilities_network_bindable__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_network_bindable__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_network_bindable__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_capabilities_network_bindable__Tosca_capabilities_network_bindable /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_network_bindable = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_node =
		{
			Fragments._Tosca_capabilities_node__OclAny /* 0 */,
			Fragments._Tosca_capabilities_node__OclElement /* 1 */,
			Fragments._Tosca_capabilities_node__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_node__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_node__Tosca_capabilities_node /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_node = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_operatingsystem =
		{
			Fragments._Tosca_capabilities_operatingsystem__OclAny /* 0 */,
			Fragments._Tosca_capabilities_operatingsystem__OclElement /* 1 */,
			Fragments._Tosca_capabilities_operatingsystem__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_operatingsystem__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_operatingsystem__Tosca_capabilities_operatingsystem /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_operatingsystem = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_root =
		{
			Fragments._Tosca_capabilities_root__OclAny /* 0 */,
			Fragments._Tosca_capabilities_root__OclElement /* 1 */,
			Fragments._Tosca_capabilities_root__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_root__Tosca_capabilities_root /* 3 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_root = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_scalable =
		{
			Fragments._Tosca_capabilities_scalable__OclAny /* 0 */,
			Fragments._Tosca_capabilities_scalable__OclElement /* 1 */,
			Fragments._Tosca_capabilities_scalable__MixinBase /* 2 */,
			Fragments._Tosca_capabilities_scalable__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_capabilities_scalable__Tosca_capabilities_scalable /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_scalable = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_groups_root =
		{
			Fragments._Tosca_groups_root__OclAny /* 0 */,
			Fragments._Tosca_groups_root__OclElement /* 1 */,
			Fragments._Tosca_groups_root__MixinBase /* 2 */,
			Fragments._Tosca_groups_root__Tosca_groups_root /* 3 */
		};
		private static final int /*@NonNull*/ [] __Tosca_groups_root = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_interfaces_node_lifecycle_standard =
		{
			Fragments._Tosca_interfaces_node_lifecycle_standard__OclAny /* 0 */,
			Fragments._Tosca_interfaces_node_lifecycle_standard__OclElement /* 1 */,
			Fragments._Tosca_interfaces_node_lifecycle_standard__MixinBase /* 2 */,
			Fragments._Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_node_lifecycle_standard /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_interfaces_node_lifecycle_standard = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_interfaces_relationship_configure =
		{
			Fragments._Tosca_interfaces_relationship_configure__OclAny /* 0 */,
			Fragments._Tosca_interfaces_relationship_configure__OclElement /* 1 */,
			Fragments._Tosca_interfaces_relationship_configure__MixinBase /* 2 */,
			Fragments._Tosca_interfaces_relationship_configure__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_interfaces_relationship_configure__Tosca_interfaces_relationship_configure /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_interfaces_relationship_configure = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_interfaces_root =
		{
			Fragments._Tosca_interfaces_root__OclAny /* 0 */,
			Fragments._Tosca_interfaces_root__OclElement /* 1 */,
			Fragments._Tosca_interfaces_root__MixinBase /* 2 */,
			Fragments._Tosca_interfaces_root__Tosca_interfaces_root /* 3 */
		};
		private static final int /*@NonNull*/ [] __Tosca_interfaces_root = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_blockstorage =
		{
			Fragments._Tosca_nodes_blockstorage__OclAny /* 0 */,
			Fragments._Tosca_nodes_blockstorage__OclElement /* 1 */,
			Fragments._Tosca_nodes_blockstorage__MixinBase /* 2 */,
			Fragments._Tosca_nodes_blockstorage__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_blockstorage__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_blockstorage__Tosca_capabilities_attachment /* 4 */,
			Fragments._Tosca_nodes_blockstorage__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_blockstorage__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_blockstorage__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_blockstorage__Tosca_nodes_blockstorage /* 6 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_blockstorage = { 1,1,1,2,3,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_compute =
		{
			Fragments._Tosca_nodes_compute__OclAny /* 0 */,
			Fragments._Tosca_nodes_compute__OclElement /* 1 */,
			Fragments._Tosca_nodes_compute__MixinBase /* 2 */,
			Fragments._Tosca_nodes_compute__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_compute__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_compute__Tosca_capabilities_container /* 4 */,
			Fragments._Tosca_nodes_compute__Tosca_capabilities_endpoint /* 4 */,
			Fragments._Tosca_nodes_compute__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_compute__Tosca_capabilities_operatingsystem /* 4 */,
			Fragments._Tosca_nodes_compute__Tosca_capabilities_scalable /* 4 */,
			Fragments._Tosca_nodes_compute__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_compute__Tosca_capabilities_endpoint_admin /* 5 */,
			Fragments._Tosca_nodes_compute__Tosca_capabilities_network_bindable /* 5 */,
			Fragments._Tosca_nodes_compute__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_compute__Tosca_nodes_compute /* 6 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_compute = { 1,1,1,2,6,3,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_container_application =
		{
			Fragments._Tosca_nodes_container_application__OclAny /* 0 */,
			Fragments._Tosca_nodes_container_application__OclElement /* 1 */,
			Fragments._Tosca_nodes_container_application__MixinBase /* 2 */,
			Fragments._Tosca_nodes_container_application__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_container_application__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_container_application__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_container_application__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_container_application__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_container_application__Tosca_nodes_container_application /* 6 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_container_application = { 1,1,1,2,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_container_runtime =
		{
			Fragments._Tosca_nodes_container_runtime__OclAny /* 0 */,
			Fragments._Tosca_nodes_container_runtime__OclElement /* 1 */,
			Fragments._Tosca_nodes_container_runtime__MixinBase /* 2 */,
			Fragments._Tosca_nodes_container_runtime__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_container_runtime__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_container_runtime__Tosca_capabilities_container /* 4 */,
			Fragments._Tosca_nodes_container_runtime__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_container_runtime__Tosca_capabilities_scalable /* 4 */,
			Fragments._Tosca_nodes_container_runtime__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_container_runtime__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_container_runtime__Tosca_nodes_softwarecomponent /* 6 */,
			Fragments._Tosca_nodes_container_runtime__Tosca_nodes_container_runtime /* 7 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_container_runtime = { 1,1,1,2,4,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_database =
		{
			Fragments._Tosca_nodes_database__OclAny /* 0 */,
			Fragments._Tosca_nodes_database__OclElement /* 1 */,
			Fragments._Tosca_nodes_database__MixinBase /* 2 */,
			Fragments._Tosca_nodes_database__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_database__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_database__Tosca_capabilities_endpoint /* 4 */,
			Fragments._Tosca_nodes_database__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_database__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_database__Tosca_capabilities_endpoint_database /* 5 */,
			Fragments._Tosca_nodes_database__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_database__Tosca_nodes_database /* 6 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_database = { 1,1,1,2,3,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_dbms =
		{
			Fragments._Tosca_nodes_dbms__OclAny /* 0 */,
			Fragments._Tosca_nodes_dbms__OclElement /* 1 */,
			Fragments._Tosca_nodes_dbms__MixinBase /* 2 */,
			Fragments._Tosca_nodes_dbms__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_dbms__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_dbms__Tosca_capabilities_container /* 4 */,
			Fragments._Tosca_nodes_dbms__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_dbms__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_dbms__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_dbms__Tosca_nodes_softwarecomponent /* 6 */,
			Fragments._Tosca_nodes_dbms__Tosca_nodes_dbms /* 7 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_dbms = { 1,1,1,2,3,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_loadbalancer =
		{
			Fragments._Tosca_nodes_loadbalancer__OclAny /* 0 */,
			Fragments._Tosca_nodes_loadbalancer__OclElement /* 1 */,
			Fragments._Tosca_nodes_loadbalancer__MixinBase /* 2 */,
			Fragments._Tosca_nodes_loadbalancer__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_loadbalancer__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint /* 4 */,
			Fragments._Tosca_nodes_loadbalancer__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_loadbalancer__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint_public /* 5 */,
			Fragments._Tosca_nodes_loadbalancer__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_loadbalancer__Tosca_nodes_loadbalancer /* 6 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_loadbalancer = { 1,1,1,2,3,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_objectstorage =
		{
			Fragments._Tosca_nodes_objectstorage__OclAny /* 0 */,
			Fragments._Tosca_nodes_objectstorage__OclElement /* 1 */,
			Fragments._Tosca_nodes_objectstorage__MixinBase /* 2 */,
			Fragments._Tosca_nodes_objectstorage__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_objectstorage__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_objectstorage__Tosca_capabilities_endpoint /* 4 */,
			Fragments._Tosca_nodes_objectstorage__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_objectstorage__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_objectstorage__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_objectstorage__Tosca_nodes_objectstorage /* 6 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_objectstorage = { 1,1,1,2,3,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_root =
		{
			Fragments._Tosca_nodes_root__OclAny /* 0 */,
			Fragments._Tosca_nodes_root__OclElement /* 1 */,
			Fragments._Tosca_nodes_root__MixinBase /* 2 */,
			Fragments._Tosca_nodes_root__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_root__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_root__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_root__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_root__Tosca_nodes_root /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_root = { 1,1,1,2,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_softwarecomponent =
		{
			Fragments._Tosca_nodes_softwarecomponent__OclAny /* 0 */,
			Fragments._Tosca_nodes_softwarecomponent__OclElement /* 1 */,
			Fragments._Tosca_nodes_softwarecomponent__MixinBase /* 2 */,
			Fragments._Tosca_nodes_softwarecomponent__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_softwarecomponent__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_softwarecomponent__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_softwarecomponent__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_softwarecomponent__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_softwarecomponent__Tosca_nodes_softwarecomponent /* 6 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_softwarecomponent = { 1,1,1,2,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_webapplication =
		{
			Fragments._Tosca_nodes_webapplication__OclAny /* 0 */,
			Fragments._Tosca_nodes_webapplication__OclElement /* 1 */,
			Fragments._Tosca_nodes_webapplication__MixinBase /* 2 */,
			Fragments._Tosca_nodes_webapplication__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_webapplication__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_webapplication__Tosca_capabilities_endpoint /* 4 */,
			Fragments._Tosca_nodes_webapplication__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_webapplication__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_webapplication__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_webapplication__Tosca_nodes_webapplication /* 6 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_webapplication = { 1,1,1,2,3,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_webserver =
		{
			Fragments._Tosca_nodes_webserver__OclAny /* 0 */,
			Fragments._Tosca_nodes_webserver__OclElement /* 1 */,
			Fragments._Tosca_nodes_webserver__MixinBase /* 2 */,
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_root /* 3 */,
			Fragments._Tosca_nodes_webserver__Tosca_interfaces_root /* 3 */,
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_container /* 4 */,
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_endpoint /* 4 */,
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_node /* 4 */,
			Fragments._Tosca_nodes_webserver__Tosca_interfaces_node_lifecycle_standard /* 4 */,
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_endpoint_admin /* 5 */,
			Fragments._Tosca_nodes_webserver__Tosca_nodes_root /* 5 */,
			Fragments._Tosca_nodes_webserver__Tosca_nodes_softwarecomponent /* 6 */,
			Fragments._Tosca_nodes_webserver__Tosca_nodes_webserver /* 7 */
		};
		private static final int /*@NonNull*/ [] __Tosca_nodes_webserver = { 1,1,1,2,4,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_policies_performance =
		{
			Fragments._Tosca_policies_performance__OclAny /* 0 */,
			Fragments._Tosca_policies_performance__OclElement /* 1 */,
			Fragments._Tosca_policies_performance__MixinBase /* 2 */,
			Fragments._Tosca_policies_performance__Agreement_term /* 3 */,
			Fragments._Tosca_policies_performance__Tosca_policies_root /* 4 */,
			Fragments._Tosca_policies_performance__Tosca_policies_performance /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_policies_performance = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_policies_placement =
		{
			Fragments._Tosca_policies_placement__OclAny /* 0 */,
			Fragments._Tosca_policies_placement__OclElement /* 1 */,
			Fragments._Tosca_policies_placement__MixinBase /* 2 */,
			Fragments._Tosca_policies_placement__Agreement_term /* 3 */,
			Fragments._Tosca_policies_placement__Tosca_policies_root /* 4 */,
			Fragments._Tosca_policies_placement__Tosca_policies_placement /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_policies_placement = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_policies_root =
		{
			Fragments._Tosca_policies_root__OclAny /* 0 */,
			Fragments._Tosca_policies_root__OclElement /* 1 */,
			Fragments._Tosca_policies_root__MixinBase /* 2 */,
			Fragments._Tosca_policies_root__Agreement_term /* 3 */,
			Fragments._Tosca_policies_root__Tosca_policies_root /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_policies_root = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_policies_scaling =
		{
			Fragments._Tosca_policies_scaling__OclAny /* 0 */,
			Fragments._Tosca_policies_scaling__OclElement /* 1 */,
			Fragments._Tosca_policies_scaling__MixinBase /* 2 */,
			Fragments._Tosca_policies_scaling__Agreement_term /* 3 */,
			Fragments._Tosca_policies_scaling__Tosca_policies_root /* 4 */,
			Fragments._Tosca_policies_scaling__Tosca_policies_scaling /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_policies_scaling = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_policies_update =
		{
			Fragments._Tosca_policies_update__OclAny /* 0 */,
			Fragments._Tosca_policies_update__OclElement /* 1 */,
			Fragments._Tosca_policies_update__MixinBase /* 2 */,
			Fragments._Tosca_policies_update__Agreement_term /* 3 */,
			Fragments._Tosca_policies_update__Tosca_policies_root /* 4 */,
			Fragments._Tosca_policies_update__Tosca_policies_update /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_policies_update = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_attachesto =
		{
			Fragments._Tosca_relationships_attachesto__OclAny /* 0 */,
			Fragments._Tosca_relationships_attachesto__OclElement /* 1 */,
			Fragments._Tosca_relationships_attachesto__MixinBase /* 2 */,
			Fragments._Tosca_relationships_attachesto__Tosca_relationships_root /* 3 */,
			Fragments._Tosca_relationships_attachesto__Tosca_relationships_attachesto /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_relationships_attachesto = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_connectsto =
		{
			Fragments._Tosca_relationships_connectsto__OclAny /* 0 */,
			Fragments._Tosca_relationships_connectsto__OclElement /* 1 */,
			Fragments._Tosca_relationships_connectsto__MixinBase /* 2 */,
			Fragments._Tosca_relationships_connectsto__Tosca_relationships_root /* 3 */,
			Fragments._Tosca_relationships_connectsto__Tosca_relationships_connectsto /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_relationships_connectsto = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_dependson =
		{
			Fragments._Tosca_relationships_dependson__OclAny /* 0 */,
			Fragments._Tosca_relationships_dependson__OclElement /* 1 */,
			Fragments._Tosca_relationships_dependson__MixinBase /* 2 */,
			Fragments._Tosca_relationships_dependson__Tosca_relationships_root /* 3 */,
			Fragments._Tosca_relationships_dependson__Tosca_relationships_dependson /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_relationships_dependson = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_hostedon =
		{
			Fragments._Tosca_relationships_hostedon__OclAny /* 0 */,
			Fragments._Tosca_relationships_hostedon__OclElement /* 1 */,
			Fragments._Tosca_relationships_hostedon__MixinBase /* 2 */,
			Fragments._Tosca_relationships_hostedon__Tosca_relationships_root /* 3 */,
			Fragments._Tosca_relationships_hostedon__Tosca_relationships_hostedon /* 4 */
		};
		private static final int /*@NonNull*/ [] __Tosca_relationships_hostedon = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_root =
		{
			Fragments._Tosca_relationships_root__OclAny /* 0 */,
			Fragments._Tosca_relationships_root__OclElement /* 1 */,
			Fragments._Tosca_relationships_root__MixinBase /* 2 */,
			Fragments._Tosca_relationships_root__Tosca_relationships_root /* 3 */
		};
		private static final int /*@NonNull*/ [] __Tosca_relationships_root = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_routesto =
		{
			Fragments._Tosca_relationships_routesto__OclAny /* 0 */,
			Fragments._Tosca_relationships_routesto__OclElement /* 1 */,
			Fragments._Tosca_relationships_routesto__MixinBase /* 2 */,
			Fragments._Tosca_relationships_routesto__Tosca_relationships_root /* 3 */,
			Fragments._Tosca_relationships_routesto__Tosca_relationships_connectsto /* 4 */,
			Fragments._Tosca_relationships_routesto__Tosca_relationships_routesto /* 5 */
		};
		private static final int /*@NonNull*/ [] __Tosca_relationships_routesto = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayBoolean =
		{
			Fragments._arrayBoolean__OclAny /* 0 */,
			Fragments._arrayBoolean__OclElement /* 1 */,
			Fragments._arrayBoolean__arrayBoolean /* 2 */
		};
		private static final int /*@NonNull*/ [] __arrayBoolean = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayByte =
		{
			Fragments._arrayByte__OclAny /* 0 */,
			Fragments._arrayByte__OclElement /* 1 */,
			Fragments._arrayByte__arrayByte /* 2 */
		};
		private static final int /*@NonNull*/ [] __arrayByte = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayDouble =
		{
			Fragments._arrayDouble__OclAny /* 0 */,
			Fragments._arrayDouble__OclElement /* 1 */,
			Fragments._arrayDouble__arrayDouble /* 2 */
		};
		private static final int /*@NonNull*/ [] __arrayDouble = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayFloat =
		{
			Fragments._arrayFloat__OclAny /* 0 */,
			Fragments._arrayFloat__OclElement /* 1 */,
			Fragments._arrayFloat__arrayFloat /* 2 */
		};
		private static final int /*@NonNull*/ [] __arrayFloat = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayInteger =
		{
			Fragments._arrayInteger__OclAny /* 0 */,
			Fragments._arrayInteger__OclElement /* 1 */,
			Fragments._arrayInteger__arrayInteger /* 2 */
		};
		private static final int /*@NonNull*/ [] __arrayInteger = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayLong =
		{
			Fragments._arrayLong__OclAny /* 0 */,
			Fragments._arrayLong__OclElement /* 1 */,
			Fragments._arrayLong__arrayLong /* 2 */
		};
		private static final int /*@NonNull*/ [] __arrayLong = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayShort =
		{
			Fragments._arrayShort__OclAny /* 0 */,
			Fragments._arrayShort__OclElement /* 1 */,
			Fragments._arrayShort__arrayShort /* 2 */
		};
		private static final int /*@NonNull*/ [] __arrayShort = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayString =
		{
			Fragments._arrayString__OclAny /* 0 */,
			Fragments._arrayString__OclElement /* 1 */,
			Fragments._arrayString__arrayString /* 2 */
		};
		private static final int /*@NonNull*/ [] __arrayString = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _boolean =
		{
			Fragments._boolean__OclAny /* 0 */,
			Fragments._boolean__boolean /* 1 */
		};
		private static final int /*@NonNull*/ [] __boolean = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _byte =
		{
			Fragments._byte__OclAny /* 0 */,
			Fragments._byte__byte /* 1 */
		};
		private static final int /*@NonNull*/ [] __byte = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _double =
		{
			Fragments._double__OclAny /* 0 */,
			Fragments._double__double /* 1 */
		};
		private static final int /*@NonNull*/ [] __double = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _float =
		{
			Fragments._float__OclAny /* 0 */,
			Fragments._float__float /* 1 */
		};
		private static final int /*@NonNull*/ [] __float = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _initiatorEnum =
		{
			Fragments._initiatorEnum__OclAny /* 0 */,
			Fragments._initiatorEnum__OclElement /* 1 */,
			Fragments._initiatorEnum__OclType /* 2 */,
			Fragments._initiatorEnum__OclEnumeration /* 3 */,
			Fragments._initiatorEnum__initiatorEnum /* 4 */
		};
		private static final int /*@NonNull*/ [] __initiatorEnum = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _integer =
		{
			Fragments._integer__OclAny /* 0 */,
			Fragments._integer__integer /* 1 */
		};
		private static final int /*@NonNull*/ [] __integer = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _integerMinOne =
		{
			Fragments._integerMinOne__OclAny /* 0 */,
			Fragments._integerMinOne__integerMinOne /* 1 */
		};
		private static final int /*@NonNull*/ [] __integerMinOne = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _long =
		{
			Fragments._long__OclAny /* 0 */,
			Fragments._long__long /* 1 */
		};
		private static final int /*@NonNull*/ [] __long = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _map =
		{
			Fragments._map__OclAny /* 0 */,
			Fragments._map__map /* 1 */
		};
		private static final int /*@NonNull*/ [] __map = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _protocolEnum =
		{
			Fragments._protocolEnum__OclAny /* 0 */,
			Fragments._protocolEnum__OclElement /* 1 */,
			Fragments._protocolEnum__OclType /* 2 */,
			Fragments._protocolEnum__OclEnumeration /* 3 */,
			Fragments._protocolEnum__protocolEnum /* 4 */
		};
		private static final int /*@NonNull*/ [] __protocolEnum = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _range =
		{
			Fragments._range__OclAny /* 0 */,
			Fragments._range__range /* 1 */
		};
		private static final int /*@NonNull*/ [] __range = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _scalarFrequency =
		{
			Fragments._scalarFrequency__OclAny /* 0 */,
			Fragments._scalarFrequency__scalarFrequency /* 1 */
		};
		private static final int /*@NonNull*/ [] __scalarFrequency = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _scalarSizeMinOneMB =
		{
			Fragments._scalarSizeMinOneMB__OclAny /* 0 */,
			Fragments._scalarSizeMinOneMB__scalarSizeMinOneMB /* 1 */
		};
		private static final int /*@NonNull*/ [] __scalarSizeMinOneMB = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _scalarSizeMinZeroGB =
		{
			Fragments._scalarSizeMinZeroGB__OclAny /* 0 */,
			Fragments._scalarSizeMinZeroGB__scalarSizeMinZeroGB /* 1 */
		};
		private static final int /*@NonNull*/ [] __scalarSizeMinZeroGB = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _scalarSizeMinZeroMB =
		{
			Fragments._scalarSizeMinZeroMB__OclAny /* 0 */,
			Fragments._scalarSizeMinZeroMB__scalarSizeMinZeroMB /* 1 */
		};
		private static final int /*@NonNull*/ [] __scalarSizeMinZeroMB = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _short =
		{
			Fragments._short__OclAny /* 0 */,
			Fragments._short__short /* 1 */
		};
		private static final int /*@NonNull*/ [] __short = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _string =
		{
			Fragments._string__OclAny /* 0 */,
			Fragments._string__string /* 1 */
		};
		private static final int /*@NonNull*/ [] __string = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _stringMinOne =
		{
			Fragments._stringMinOne__OclAny /* 0 */,
			Fragments._stringMinOne__stringMinOne /* 1 */
		};
		private static final int /*@NonNull*/ [] __stringMinOne = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _toscadatatypesCredential =
		{
			Fragments._toscadatatypesCredential__OclAny /* 0 */,
			Fragments._toscadatatypesCredential__OclElement /* 1 */,
			Fragments._toscadatatypesCredential__toscadatatypesCredential /* 2 */
		};
		private static final int /*@NonNull*/ [] __toscadatatypesCredential = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _toscadatatypesnetworkNetworkInfo =
		{
			Fragments._toscadatatypesnetworkNetworkInfo__OclAny /* 0 */,
			Fragments._toscadatatypesnetworkNetworkInfo__OclElement /* 1 */,
			Fragments._toscadatatypesnetworkNetworkInfo__toscadatatypesnetworkNetworkInfo /* 2 */
		};
		private static final int /*@NonNull*/ [] __toscadatatypesnetworkNetworkInfo = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _toscadatatypesnetworkPortDef =
		{
			Fragments._toscadatatypesnetworkPortDef__OclAny /* 0 */,
			Fragments._toscadatatypesnetworkPortDef__toscadatatypesnetworkPortDef /* 1 */
		};
		private static final int /*@NonNull*/ [] __toscadatatypesnetworkPortDef = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _toscadatatypesnetworkPortInfo =
		{
			Fragments._toscadatatypesnetworkPortInfo__OclAny /* 0 */,
			Fragments._toscadatatypesnetworkPortInfo__OclElement /* 1 */,
			Fragments._toscadatatypesnetworkPortInfo__toscadatatypesnetworkPortInfo /* 2 */
		};
		private static final int /*@NonNull*/ [] __toscadatatypesnetworkPortInfo = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _toscadatatypesnetworkPortSpec =
		{
			Fragments._toscadatatypesnetworkPortSpec__OclAny /* 0 */,
			Fragments._toscadatatypesnetworkPortSpec__OclElement /* 1 */,
			Fragments._toscadatatypesnetworkPortSpec__toscadatatypesnetworkPortSpec /* 2 */
		};
		private static final int /*@NonNull*/ [] __toscadatatypesnetworkPortSpec = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _version =
		{
			Fragments._version__OclAny /* 0 */,
			Fragments._version__version /* 1 */
		};
		private static final int /*@NonNull*/ [] __version = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Tosca_capabilities_attachment.initFragments(_Tosca_capabilities_attachment, __Tosca_capabilities_attachment);
			Types._Tosca_capabilities_container.initFragments(_Tosca_capabilities_container, __Tosca_capabilities_container);
			Types._Tosca_capabilities_endpoint.initFragments(_Tosca_capabilities_endpoint, __Tosca_capabilities_endpoint);
			Types._Tosca_capabilities_endpoint_admin.initFragments(_Tosca_capabilities_endpoint_admin, __Tosca_capabilities_endpoint_admin);
			Types._Tosca_capabilities_endpoint_database.initFragments(_Tosca_capabilities_endpoint_database, __Tosca_capabilities_endpoint_database);
			Types._Tosca_capabilities_endpoint_public.initFragments(_Tosca_capabilities_endpoint_public, __Tosca_capabilities_endpoint_public);
			Types._Tosca_capabilities_network_bindable.initFragments(_Tosca_capabilities_network_bindable, __Tosca_capabilities_network_bindable);
			Types._Tosca_capabilities_node.initFragments(_Tosca_capabilities_node, __Tosca_capabilities_node);
			Types._Tosca_capabilities_operatingsystem.initFragments(_Tosca_capabilities_operatingsystem, __Tosca_capabilities_operatingsystem);
			Types._Tosca_capabilities_root.initFragments(_Tosca_capabilities_root, __Tosca_capabilities_root);
			Types._Tosca_capabilities_scalable.initFragments(_Tosca_capabilities_scalable, __Tosca_capabilities_scalable);
			Types._Tosca_groups_root.initFragments(_Tosca_groups_root, __Tosca_groups_root);
			Types._Tosca_interfaces_node_lifecycle_standard.initFragments(_Tosca_interfaces_node_lifecycle_standard, __Tosca_interfaces_node_lifecycle_standard);
			Types._Tosca_interfaces_relationship_configure.initFragments(_Tosca_interfaces_relationship_configure, __Tosca_interfaces_relationship_configure);
			Types._Tosca_interfaces_root.initFragments(_Tosca_interfaces_root, __Tosca_interfaces_root);
			Types._Tosca_nodes_blockstorage.initFragments(_Tosca_nodes_blockstorage, __Tosca_nodes_blockstorage);
			Types._Tosca_nodes_compute.initFragments(_Tosca_nodes_compute, __Tosca_nodes_compute);
			Types._Tosca_nodes_container_application.initFragments(_Tosca_nodes_container_application, __Tosca_nodes_container_application);
			Types._Tosca_nodes_container_runtime.initFragments(_Tosca_nodes_container_runtime, __Tosca_nodes_container_runtime);
			Types._Tosca_nodes_database.initFragments(_Tosca_nodes_database, __Tosca_nodes_database);
			Types._Tosca_nodes_dbms.initFragments(_Tosca_nodes_dbms, __Tosca_nodes_dbms);
			Types._Tosca_nodes_loadbalancer.initFragments(_Tosca_nodes_loadbalancer, __Tosca_nodes_loadbalancer);
			Types._Tosca_nodes_objectstorage.initFragments(_Tosca_nodes_objectstorage, __Tosca_nodes_objectstorage);
			Types._Tosca_nodes_root.initFragments(_Tosca_nodes_root, __Tosca_nodes_root);
			Types._Tosca_nodes_softwarecomponent.initFragments(_Tosca_nodes_softwarecomponent, __Tosca_nodes_softwarecomponent);
			Types._Tosca_nodes_webapplication.initFragments(_Tosca_nodes_webapplication, __Tosca_nodes_webapplication);
			Types._Tosca_nodes_webserver.initFragments(_Tosca_nodes_webserver, __Tosca_nodes_webserver);
			Types._Tosca_policies_performance.initFragments(_Tosca_policies_performance, __Tosca_policies_performance);
			Types._Tosca_policies_placement.initFragments(_Tosca_policies_placement, __Tosca_policies_placement);
			Types._Tosca_policies_root.initFragments(_Tosca_policies_root, __Tosca_policies_root);
			Types._Tosca_policies_scaling.initFragments(_Tosca_policies_scaling, __Tosca_policies_scaling);
			Types._Tosca_policies_update.initFragments(_Tosca_policies_update, __Tosca_policies_update);
			Types._Tosca_relationships_attachesto.initFragments(_Tosca_relationships_attachesto, __Tosca_relationships_attachesto);
			Types._Tosca_relationships_connectsto.initFragments(_Tosca_relationships_connectsto, __Tosca_relationships_connectsto);
			Types._Tosca_relationships_dependson.initFragments(_Tosca_relationships_dependson, __Tosca_relationships_dependson);
			Types._Tosca_relationships_hostedon.initFragments(_Tosca_relationships_hostedon, __Tosca_relationships_hostedon);
			Types._Tosca_relationships_root.initFragments(_Tosca_relationships_root, __Tosca_relationships_root);
			Types._Tosca_relationships_routesto.initFragments(_Tosca_relationships_routesto, __Tosca_relationships_routesto);
			Types._arrayBoolean.initFragments(_arrayBoolean, __arrayBoolean);
			Types._arrayByte.initFragments(_arrayByte, __arrayByte);
			Types._arrayDouble.initFragments(_arrayDouble, __arrayDouble);
			Types._arrayFloat.initFragments(_arrayFloat, __arrayFloat);
			Types._arrayInteger.initFragments(_arrayInteger, __arrayInteger);
			Types._arrayLong.initFragments(_arrayLong, __arrayLong);
			Types._arrayShort.initFragments(_arrayShort, __arrayShort);
			Types._arrayString.initFragments(_arrayString, __arrayString);
			Types._boolean.initFragments(_boolean, __boolean);
			Types._byte.initFragments(_byte, __byte);
			Types._double.initFragments(_double, __double);
			Types._float.initFragments(_float, __float);
			Types._initiatorEnum.initFragments(_initiatorEnum, __initiatorEnum);
			Types._integer.initFragments(_integer, __integer);
			Types._integerMinOne.initFragments(_integerMinOne, __integerMinOne);
			Types._long.initFragments(_long, __long);
			Types._map.initFragments(_map, __map);
			Types._protocolEnum.initFragments(_protocolEnum, __protocolEnum);
			Types._range.initFragments(_range, __range);
			Types._scalarFrequency.initFragments(_scalarFrequency, __scalarFrequency);
			Types._scalarSizeMinOneMB.initFragments(_scalarSizeMinOneMB, __scalarSizeMinOneMB);
			Types._scalarSizeMinZeroGB.initFragments(_scalarSizeMinZeroGB, __scalarSizeMinZeroGB);
			Types._scalarSizeMinZeroMB.initFragments(_scalarSizeMinZeroMB, __scalarSizeMinZeroMB);
			Types._short.initFragments(_short, __short);
			Types._string.initFragments(_string, __string);
			Types._stringMinOne.initFragments(_stringMinOne, __stringMinOne);
			Types._toscadatatypesCredential.initFragments(_toscadatatypesCredential, __toscadatatypesCredential);
			Types._toscadatatypesnetworkNetworkInfo.initFragments(_toscadatatypesnetworkNetworkInfo, __toscadatatypesnetworkNetworkInfo);
			Types._toscadatatypesnetworkPortDef.initFragments(_toscadatatypesnetworkPortDef, __toscadatatypesnetworkPortDef);
			Types._toscadatatypesnetworkPortInfo.initFragments(_toscadatatypesnetworkPortInfo, __toscadatatypesnetworkPortInfo);
			Types._toscadatatypesnetworkPortSpec.initFragments(_toscadatatypesnetworkPortSpec, __toscadatatypesnetworkPortSpec);
			Types._version.initFragments(_version, __version);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_attachment__Tosca_capabilities_attachment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_attachment__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_attachment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_attachment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_attachment__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint_admin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_admin__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_admin__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_admin__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_admin__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_database__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_database__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_database__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_database__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint_public = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_public__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_public__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_public__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_endpoint_public__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_network_bindable__Tosca_capabilities_network_bindable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_network_bindable__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_network_bindable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_network_bindable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_network_bindable__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_network_bindable__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_node__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_node__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_node__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_node__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_node__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_operatingsystem__Tosca_capabilities_operatingsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_operatingsystem__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_operatingsystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_operatingsystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_operatingsystem__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_root__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_root__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_root__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_root__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_scalable__Tosca_capabilities_scalable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_scalable__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_scalable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_scalable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_scalable__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_groups_root__Tosca_groups_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_groups_root__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_groups_root__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_groups_root__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_node_lifecycle_standard__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_node_lifecycle_standard__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_node_lifecycle_standard__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_relationship_configure__Tosca_interfaces_relationship_configure = {
			ToscaTables.Operations._Tosca_interfaces_relationship_configure__add_source /* add_source() */,
			ToscaTables.Operations._Tosca_interfaces_relationship_configure__add_target /* add_target() */,
			ToscaTables.Operations._Tosca_interfaces_relationship_configure__post_configure_source /* post_configure_source() */,
			ToscaTables.Operations._Tosca_interfaces_relationship_configure__post_configure_target /* post_configure_target() */,
			ToscaTables.Operations._Tosca_interfaces_relationship_configure__pre_configure_source /* pre_configure_source() */,
			ToscaTables.Operations._Tosca_interfaces_relationship_configure__pre_configure_target /* pre_configure_target() */,
			ToscaTables.Operations._Tosca_interfaces_relationship_configure__remove_target /* remove_target() */,
			ToscaTables.Operations._Tosca_interfaces_relationship_configure__target_changed /* target_changed() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_relationship_configure__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_relationship_configure__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_relationship_configure__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_relationship_configure__Tosca_interfaces_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_root__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_root__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_root__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_interfaces_root__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__Tosca_nodes_blockstorage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__Tosca_capabilities_attachment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_blockstorage__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_nodes_compute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_capabilities_endpoint_admin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_capabilities_network_bindable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_capabilities_operatingsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_capabilities_scalable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_compute__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application__Tosca_nodes_container_application = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__Tosca_nodes_container_runtime = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__Tosca_capabilities_scalable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_runtime__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__Tosca_nodes_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__Tosca_capabilities_endpoint_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__Tosca_nodes_dbms = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__Tosca_nodes_loadbalancer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint_public = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_loadbalancer__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__Tosca_nodes_objectstorage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_objectstorage__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_root__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_root__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_root__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_root__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_root__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_root__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_root__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_root__Tosca_interfaces_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent__Tosca_nodes_softwarecomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__Tosca_nodes_webapplication = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_nodes_webserver = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_capabilities_endpoint_admin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_interfaces_node_lifecycle_standard = {
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__configure /* configure() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__create /* create() */,
			ToscaTables.Operations._Tosca_interfaces_node_lifecycle_standard__delete /* delete() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_interfaces_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webserver__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_performance__Tosca_policies_performance = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_performance__Agreement_term = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_performance__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_performance__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_performance__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_performance__Tosca_policies_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_placement__Tosca_policies_placement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_placement__Agreement_term = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_placement__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_placement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_placement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_placement__Tosca_policies_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_root__Tosca_policies_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_root__Agreement_term = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_root__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_root__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_root__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_scaling__Tosca_policies_scaling = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_scaling__Agreement_term = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_scaling__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_scaling__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_scaling__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_scaling__Tosca_policies_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_update__Tosca_policies_update = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_update__Agreement_term = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_update__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_update__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_update__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_policies_update__Tosca_policies_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_attachesto__Tosca_relationships_attachesto = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_attachesto__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_attachesto__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_attachesto__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_attachesto__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_connectsto__Tosca_relationships_connectsto = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_connectsto__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_connectsto__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_connectsto__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_connectsto__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_dependson__Tosca_relationships_dependson = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_dependson__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_dependson__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_dependson__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_dependson__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_hostedon__Tosca_relationships_hostedon = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_hostedon__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_hostedon__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_hostedon__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_hostedon__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_root__Tosca_relationships_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_root__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_root__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_root__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_routesto__Tosca_relationships_routesto = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_routesto__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_routesto__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_routesto__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_routesto__Tosca_relationships_connectsto = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_routesto__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayBoolean__arrayBoolean = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayBoolean__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayBoolean__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayByte__arrayByte = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayByte__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayByte__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayDouble__arrayDouble = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayDouble__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayDouble__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayFloat__arrayFloat = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayFloat__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayFloat__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayInteger__arrayInteger = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayInteger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayInteger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayLong__arrayLong = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayLong__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayLong__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayShort__arrayShort = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayShort__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayShort__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayString__arrayString = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayString__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayString__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _boolean__boolean = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _boolean__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _byte__byte = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _byte__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _double__double = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _double__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _float__float = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _float__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _initiatorEnum__initiatorEnum = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _initiatorEnum__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _initiatorEnum__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _initiatorEnum__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _initiatorEnum__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _integer__integer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _integer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _integerMinOne__integerMinOne = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _integerMinOne__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _long__long = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _long__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _map__map = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _map__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _protocolEnum__protocolEnum = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _protocolEnum__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _protocolEnum__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _protocolEnum__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _protocolEnum__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _range__range = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _range__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _scalarFrequency__scalarFrequency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _scalarFrequency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _scalarSizeMinOneMB__scalarSizeMinOneMB = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _scalarSizeMinOneMB__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _scalarSizeMinZeroGB__scalarSizeMinZeroGB = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _scalarSizeMinZeroGB__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _scalarSizeMinZeroMB__scalarSizeMinZeroMB = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _scalarSizeMinZeroMB__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _short__short = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _short__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _string__string = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _string__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _stringMinOne__stringMinOne = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _stringMinOne__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesCredential__toscadatatypesCredential = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesCredential__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesCredential__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkNetworkInfo__toscadatatypesnetworkNetworkInfo = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkNetworkInfo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkNetworkInfo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkPortDef__toscadatatypesnetworkPortDef = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkPortDef__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkPortInfo__toscadatatypesnetworkPortInfo = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkPortInfo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkPortInfo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkPortSpec__toscadatatypesnetworkPortSpec = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkPortSpec__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _toscadatatypesnetworkPortSpec__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _version__version = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _version__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Tosca_capabilities_attachment__MixinBase.initOperations(_Tosca_capabilities_attachment__MixinBase);
			Fragments._Tosca_capabilities_attachment__OclAny.initOperations(_Tosca_capabilities_attachment__OclAny);
			Fragments._Tosca_capabilities_attachment__OclElement.initOperations(_Tosca_capabilities_attachment__OclElement);
			Fragments._Tosca_capabilities_attachment__Tosca_capabilities_attachment.initOperations(_Tosca_capabilities_attachment__Tosca_capabilities_attachment);
			Fragments._Tosca_capabilities_attachment__Tosca_capabilities_root.initOperations(_Tosca_capabilities_attachment__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_container__MixinBase.initOperations(_Tosca_capabilities_container__MixinBase);
			Fragments._Tosca_capabilities_container__OclAny.initOperations(_Tosca_capabilities_container__OclAny);
			Fragments._Tosca_capabilities_container__OclElement.initOperations(_Tosca_capabilities_container__OclElement);
			Fragments._Tosca_capabilities_container__Tosca_capabilities_container.initOperations(_Tosca_capabilities_container__Tosca_capabilities_container);
			Fragments._Tosca_capabilities_container__Tosca_capabilities_root.initOperations(_Tosca_capabilities_container__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_endpoint__MixinBase.initOperations(_Tosca_capabilities_endpoint__MixinBase);
			Fragments._Tosca_capabilities_endpoint__OclAny.initOperations(_Tosca_capabilities_endpoint__OclAny);
			Fragments._Tosca_capabilities_endpoint__OclElement.initOperations(_Tosca_capabilities_endpoint__OclElement);
			Fragments._Tosca_capabilities_endpoint__Tosca_capabilities_endpoint.initOperations(_Tosca_capabilities_endpoint__Tosca_capabilities_endpoint);
			Fragments._Tosca_capabilities_endpoint__Tosca_capabilities_root.initOperations(_Tosca_capabilities_endpoint__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_endpoint_admin__MixinBase.initOperations(_Tosca_capabilities_endpoint_admin__MixinBase);
			Fragments._Tosca_capabilities_endpoint_admin__OclAny.initOperations(_Tosca_capabilities_endpoint_admin__OclAny);
			Fragments._Tosca_capabilities_endpoint_admin__OclElement.initOperations(_Tosca_capabilities_endpoint_admin__OclElement);
			Fragments._Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint.initOperations(_Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint);
			Fragments._Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint_admin.initOperations(_Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_capabilities_endpoint_admin__Tosca_capabilities_root.initOperations(_Tosca_capabilities_endpoint_admin__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_endpoint_database__MixinBase.initOperations(_Tosca_capabilities_endpoint_database__MixinBase);
			Fragments._Tosca_capabilities_endpoint_database__OclAny.initOperations(_Tosca_capabilities_endpoint_database__OclAny);
			Fragments._Tosca_capabilities_endpoint_database__OclElement.initOperations(_Tosca_capabilities_endpoint_database__OclElement);
			Fragments._Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint.initOperations(_Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint);
			Fragments._Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint_database.initOperations(_Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint_database);
			Fragments._Tosca_capabilities_endpoint_database__Tosca_capabilities_root.initOperations(_Tosca_capabilities_endpoint_database__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_endpoint_public__MixinBase.initOperations(_Tosca_capabilities_endpoint_public__MixinBase);
			Fragments._Tosca_capabilities_endpoint_public__OclAny.initOperations(_Tosca_capabilities_endpoint_public__OclAny);
			Fragments._Tosca_capabilities_endpoint_public__OclElement.initOperations(_Tosca_capabilities_endpoint_public__OclElement);
			Fragments._Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint.initOperations(_Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint);
			Fragments._Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint_public.initOperations(_Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint_public);
			Fragments._Tosca_capabilities_endpoint_public__Tosca_capabilities_root.initOperations(_Tosca_capabilities_endpoint_public__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_network_bindable__MixinBase.initOperations(_Tosca_capabilities_network_bindable__MixinBase);
			Fragments._Tosca_capabilities_network_bindable__OclAny.initOperations(_Tosca_capabilities_network_bindable__OclAny);
			Fragments._Tosca_capabilities_network_bindable__OclElement.initOperations(_Tosca_capabilities_network_bindable__OclElement);
			Fragments._Tosca_capabilities_network_bindable__Tosca_capabilities_network_bindable.initOperations(_Tosca_capabilities_network_bindable__Tosca_capabilities_network_bindable);
			Fragments._Tosca_capabilities_network_bindable__Tosca_capabilities_node.initOperations(_Tosca_capabilities_network_bindable__Tosca_capabilities_node);
			Fragments._Tosca_capabilities_network_bindable__Tosca_capabilities_root.initOperations(_Tosca_capabilities_network_bindable__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_node__MixinBase.initOperations(_Tosca_capabilities_node__MixinBase);
			Fragments._Tosca_capabilities_node__OclAny.initOperations(_Tosca_capabilities_node__OclAny);
			Fragments._Tosca_capabilities_node__OclElement.initOperations(_Tosca_capabilities_node__OclElement);
			Fragments._Tosca_capabilities_node__Tosca_capabilities_node.initOperations(_Tosca_capabilities_node__Tosca_capabilities_node);
			Fragments._Tosca_capabilities_node__Tosca_capabilities_root.initOperations(_Tosca_capabilities_node__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_operatingsystem__MixinBase.initOperations(_Tosca_capabilities_operatingsystem__MixinBase);
			Fragments._Tosca_capabilities_operatingsystem__OclAny.initOperations(_Tosca_capabilities_operatingsystem__OclAny);
			Fragments._Tosca_capabilities_operatingsystem__OclElement.initOperations(_Tosca_capabilities_operatingsystem__OclElement);
			Fragments._Tosca_capabilities_operatingsystem__Tosca_capabilities_operatingsystem.initOperations(_Tosca_capabilities_operatingsystem__Tosca_capabilities_operatingsystem);
			Fragments._Tosca_capabilities_operatingsystem__Tosca_capabilities_root.initOperations(_Tosca_capabilities_operatingsystem__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_root__MixinBase.initOperations(_Tosca_capabilities_root__MixinBase);
			Fragments._Tosca_capabilities_root__OclAny.initOperations(_Tosca_capabilities_root__OclAny);
			Fragments._Tosca_capabilities_root__OclElement.initOperations(_Tosca_capabilities_root__OclElement);
			Fragments._Tosca_capabilities_root__Tosca_capabilities_root.initOperations(_Tosca_capabilities_root__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_scalable__MixinBase.initOperations(_Tosca_capabilities_scalable__MixinBase);
			Fragments._Tosca_capabilities_scalable__OclAny.initOperations(_Tosca_capabilities_scalable__OclAny);
			Fragments._Tosca_capabilities_scalable__OclElement.initOperations(_Tosca_capabilities_scalable__OclElement);
			Fragments._Tosca_capabilities_scalable__Tosca_capabilities_root.initOperations(_Tosca_capabilities_scalable__Tosca_capabilities_root);
			Fragments._Tosca_capabilities_scalable__Tosca_capabilities_scalable.initOperations(_Tosca_capabilities_scalable__Tosca_capabilities_scalable);

			Fragments._Tosca_groups_root__MixinBase.initOperations(_Tosca_groups_root__MixinBase);
			Fragments._Tosca_groups_root__OclAny.initOperations(_Tosca_groups_root__OclAny);
			Fragments._Tosca_groups_root__OclElement.initOperations(_Tosca_groups_root__OclElement);
			Fragments._Tosca_groups_root__Tosca_groups_root.initOperations(_Tosca_groups_root__Tosca_groups_root);

			Fragments._Tosca_interfaces_node_lifecycle_standard__MixinBase.initOperations(_Tosca_interfaces_node_lifecycle_standard__MixinBase);
			Fragments._Tosca_interfaces_node_lifecycle_standard__OclAny.initOperations(_Tosca_interfaces_node_lifecycle_standard__OclAny);
			Fragments._Tosca_interfaces_node_lifecycle_standard__OclElement.initOperations(_Tosca_interfaces_node_lifecycle_standard__OclElement);
			Fragments._Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_root.initOperations(_Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_root);

			Fragments._Tosca_interfaces_relationship_configure__MixinBase.initOperations(_Tosca_interfaces_relationship_configure__MixinBase);
			Fragments._Tosca_interfaces_relationship_configure__OclAny.initOperations(_Tosca_interfaces_relationship_configure__OclAny);
			Fragments._Tosca_interfaces_relationship_configure__OclElement.initOperations(_Tosca_interfaces_relationship_configure__OclElement);
			Fragments._Tosca_interfaces_relationship_configure__Tosca_interfaces_relationship_configure.initOperations(_Tosca_interfaces_relationship_configure__Tosca_interfaces_relationship_configure);
			Fragments._Tosca_interfaces_relationship_configure__Tosca_interfaces_root.initOperations(_Tosca_interfaces_relationship_configure__Tosca_interfaces_root);

			Fragments._Tosca_interfaces_root__MixinBase.initOperations(_Tosca_interfaces_root__MixinBase);
			Fragments._Tosca_interfaces_root__OclAny.initOperations(_Tosca_interfaces_root__OclAny);
			Fragments._Tosca_interfaces_root__OclElement.initOperations(_Tosca_interfaces_root__OclElement);
			Fragments._Tosca_interfaces_root__Tosca_interfaces_root.initOperations(_Tosca_interfaces_root__Tosca_interfaces_root);

			Fragments._Tosca_nodes_blockstorage__MixinBase.initOperations(_Tosca_nodes_blockstorage__MixinBase);
			Fragments._Tosca_nodes_blockstorage__OclAny.initOperations(_Tosca_nodes_blockstorage__OclAny);
			Fragments._Tosca_nodes_blockstorage__OclElement.initOperations(_Tosca_nodes_blockstorage__OclElement);
			Fragments._Tosca_nodes_blockstorage__Tosca_capabilities_attachment.initOperations(_Tosca_nodes_blockstorage__Tosca_capabilities_attachment);
			Fragments._Tosca_nodes_blockstorage__Tosca_capabilities_node.initOperations(_Tosca_nodes_blockstorage__Tosca_capabilities_node);
			Fragments._Tosca_nodes_blockstorage__Tosca_capabilities_root.initOperations(_Tosca_nodes_blockstorage__Tosca_capabilities_root);
			Fragments._Tosca_nodes_blockstorage__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_blockstorage__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_blockstorage__Tosca_interfaces_root.initOperations(_Tosca_nodes_blockstorage__Tosca_interfaces_root);
			Fragments._Tosca_nodes_blockstorage__Tosca_nodes_blockstorage.initOperations(_Tosca_nodes_blockstorage__Tosca_nodes_blockstorage);
			Fragments._Tosca_nodes_blockstorage__Tosca_nodes_root.initOperations(_Tosca_nodes_blockstorage__Tosca_nodes_root);

			Fragments._Tosca_nodes_compute__MixinBase.initOperations(_Tosca_nodes_compute__MixinBase);
			Fragments._Tosca_nodes_compute__OclAny.initOperations(_Tosca_nodes_compute__OclAny);
			Fragments._Tosca_nodes_compute__OclElement.initOperations(_Tosca_nodes_compute__OclElement);
			Fragments._Tosca_nodes_compute__Tosca_capabilities_container.initOperations(_Tosca_nodes_compute__Tosca_capabilities_container);
			Fragments._Tosca_nodes_compute__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_compute__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_compute__Tosca_capabilities_endpoint_admin.initOperations(_Tosca_nodes_compute__Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_nodes_compute__Tosca_capabilities_network_bindable.initOperations(_Tosca_nodes_compute__Tosca_capabilities_network_bindable);
			Fragments._Tosca_nodes_compute__Tosca_capabilities_node.initOperations(_Tosca_nodes_compute__Tosca_capabilities_node);
			Fragments._Tosca_nodes_compute__Tosca_capabilities_operatingsystem.initOperations(_Tosca_nodes_compute__Tosca_capabilities_operatingsystem);
			Fragments._Tosca_nodes_compute__Tosca_capabilities_root.initOperations(_Tosca_nodes_compute__Tosca_capabilities_root);
			Fragments._Tosca_nodes_compute__Tosca_capabilities_scalable.initOperations(_Tosca_nodes_compute__Tosca_capabilities_scalable);
			Fragments._Tosca_nodes_compute__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_compute__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_compute__Tosca_interfaces_root.initOperations(_Tosca_nodes_compute__Tosca_interfaces_root);
			Fragments._Tosca_nodes_compute__Tosca_nodes_compute.initOperations(_Tosca_nodes_compute__Tosca_nodes_compute);
			Fragments._Tosca_nodes_compute__Tosca_nodes_root.initOperations(_Tosca_nodes_compute__Tosca_nodes_root);

			Fragments._Tosca_nodes_container_application__MixinBase.initOperations(_Tosca_nodes_container_application__MixinBase);
			Fragments._Tosca_nodes_container_application__OclAny.initOperations(_Tosca_nodes_container_application__OclAny);
			Fragments._Tosca_nodes_container_application__OclElement.initOperations(_Tosca_nodes_container_application__OclElement);
			Fragments._Tosca_nodes_container_application__Tosca_capabilities_node.initOperations(_Tosca_nodes_container_application__Tosca_capabilities_node);
			Fragments._Tosca_nodes_container_application__Tosca_capabilities_root.initOperations(_Tosca_nodes_container_application__Tosca_capabilities_root);
			Fragments._Tosca_nodes_container_application__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_container_application__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_container_application__Tosca_interfaces_root.initOperations(_Tosca_nodes_container_application__Tosca_interfaces_root);
			Fragments._Tosca_nodes_container_application__Tosca_nodes_container_application.initOperations(_Tosca_nodes_container_application__Tosca_nodes_container_application);
			Fragments._Tosca_nodes_container_application__Tosca_nodes_root.initOperations(_Tosca_nodes_container_application__Tosca_nodes_root);

			Fragments._Tosca_nodes_container_runtime__MixinBase.initOperations(_Tosca_nodes_container_runtime__MixinBase);
			Fragments._Tosca_nodes_container_runtime__OclAny.initOperations(_Tosca_nodes_container_runtime__OclAny);
			Fragments._Tosca_nodes_container_runtime__OclElement.initOperations(_Tosca_nodes_container_runtime__OclElement);
			Fragments._Tosca_nodes_container_runtime__Tosca_capabilities_container.initOperations(_Tosca_nodes_container_runtime__Tosca_capabilities_container);
			Fragments._Tosca_nodes_container_runtime__Tosca_capabilities_node.initOperations(_Tosca_nodes_container_runtime__Tosca_capabilities_node);
			Fragments._Tosca_nodes_container_runtime__Tosca_capabilities_root.initOperations(_Tosca_nodes_container_runtime__Tosca_capabilities_root);
			Fragments._Tosca_nodes_container_runtime__Tosca_capabilities_scalable.initOperations(_Tosca_nodes_container_runtime__Tosca_capabilities_scalable);
			Fragments._Tosca_nodes_container_runtime__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_container_runtime__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_container_runtime__Tosca_interfaces_root.initOperations(_Tosca_nodes_container_runtime__Tosca_interfaces_root);
			Fragments._Tosca_nodes_container_runtime__Tosca_nodes_container_runtime.initOperations(_Tosca_nodes_container_runtime__Tosca_nodes_container_runtime);
			Fragments._Tosca_nodes_container_runtime__Tosca_nodes_root.initOperations(_Tosca_nodes_container_runtime__Tosca_nodes_root);
			Fragments._Tosca_nodes_container_runtime__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_container_runtime__Tosca_nodes_softwarecomponent);

			Fragments._Tosca_nodes_database__MixinBase.initOperations(_Tosca_nodes_database__MixinBase);
			Fragments._Tosca_nodes_database__OclAny.initOperations(_Tosca_nodes_database__OclAny);
			Fragments._Tosca_nodes_database__OclElement.initOperations(_Tosca_nodes_database__OclElement);
			Fragments._Tosca_nodes_database__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_database__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_database__Tosca_capabilities_endpoint_database.initOperations(_Tosca_nodes_database__Tosca_capabilities_endpoint_database);
			Fragments._Tosca_nodes_database__Tosca_capabilities_node.initOperations(_Tosca_nodes_database__Tosca_capabilities_node);
			Fragments._Tosca_nodes_database__Tosca_capabilities_root.initOperations(_Tosca_nodes_database__Tosca_capabilities_root);
			Fragments._Tosca_nodes_database__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_database__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_database__Tosca_interfaces_root.initOperations(_Tosca_nodes_database__Tosca_interfaces_root);
			Fragments._Tosca_nodes_database__Tosca_nodes_database.initOperations(_Tosca_nodes_database__Tosca_nodes_database);
			Fragments._Tosca_nodes_database__Tosca_nodes_root.initOperations(_Tosca_nodes_database__Tosca_nodes_root);

			Fragments._Tosca_nodes_dbms__MixinBase.initOperations(_Tosca_nodes_dbms__MixinBase);
			Fragments._Tosca_nodes_dbms__OclAny.initOperations(_Tosca_nodes_dbms__OclAny);
			Fragments._Tosca_nodes_dbms__OclElement.initOperations(_Tosca_nodes_dbms__OclElement);
			Fragments._Tosca_nodes_dbms__Tosca_capabilities_container.initOperations(_Tosca_nodes_dbms__Tosca_capabilities_container);
			Fragments._Tosca_nodes_dbms__Tosca_capabilities_node.initOperations(_Tosca_nodes_dbms__Tosca_capabilities_node);
			Fragments._Tosca_nodes_dbms__Tosca_capabilities_root.initOperations(_Tosca_nodes_dbms__Tosca_capabilities_root);
			Fragments._Tosca_nodes_dbms__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_dbms__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_dbms__Tosca_interfaces_root.initOperations(_Tosca_nodes_dbms__Tosca_interfaces_root);
			Fragments._Tosca_nodes_dbms__Tosca_nodes_dbms.initOperations(_Tosca_nodes_dbms__Tosca_nodes_dbms);
			Fragments._Tosca_nodes_dbms__Tosca_nodes_root.initOperations(_Tosca_nodes_dbms__Tosca_nodes_root);
			Fragments._Tosca_nodes_dbms__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_dbms__Tosca_nodes_softwarecomponent);

			Fragments._Tosca_nodes_loadbalancer__MixinBase.initOperations(_Tosca_nodes_loadbalancer__MixinBase);
			Fragments._Tosca_nodes_loadbalancer__OclAny.initOperations(_Tosca_nodes_loadbalancer__OclAny);
			Fragments._Tosca_nodes_loadbalancer__OclElement.initOperations(_Tosca_nodes_loadbalancer__OclElement);
			Fragments._Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint_public.initOperations(_Tosca_nodes_loadbalancer__Tosca_capabilities_endpoint_public);
			Fragments._Tosca_nodes_loadbalancer__Tosca_capabilities_node.initOperations(_Tosca_nodes_loadbalancer__Tosca_capabilities_node);
			Fragments._Tosca_nodes_loadbalancer__Tosca_capabilities_root.initOperations(_Tosca_nodes_loadbalancer__Tosca_capabilities_root);
			Fragments._Tosca_nodes_loadbalancer__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_loadbalancer__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_loadbalancer__Tosca_interfaces_root.initOperations(_Tosca_nodes_loadbalancer__Tosca_interfaces_root);
			Fragments._Tosca_nodes_loadbalancer__Tosca_nodes_loadbalancer.initOperations(_Tosca_nodes_loadbalancer__Tosca_nodes_loadbalancer);
			Fragments._Tosca_nodes_loadbalancer__Tosca_nodes_root.initOperations(_Tosca_nodes_loadbalancer__Tosca_nodes_root);

			Fragments._Tosca_nodes_objectstorage__MixinBase.initOperations(_Tosca_nodes_objectstorage__MixinBase);
			Fragments._Tosca_nodes_objectstorage__OclAny.initOperations(_Tosca_nodes_objectstorage__OclAny);
			Fragments._Tosca_nodes_objectstorage__OclElement.initOperations(_Tosca_nodes_objectstorage__OclElement);
			Fragments._Tosca_nodes_objectstorage__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_objectstorage__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_objectstorage__Tosca_capabilities_node.initOperations(_Tosca_nodes_objectstorage__Tosca_capabilities_node);
			Fragments._Tosca_nodes_objectstorage__Tosca_capabilities_root.initOperations(_Tosca_nodes_objectstorage__Tosca_capabilities_root);
			Fragments._Tosca_nodes_objectstorage__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_objectstorage__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_objectstorage__Tosca_interfaces_root.initOperations(_Tosca_nodes_objectstorage__Tosca_interfaces_root);
			Fragments._Tosca_nodes_objectstorage__Tosca_nodes_objectstorage.initOperations(_Tosca_nodes_objectstorage__Tosca_nodes_objectstorage);
			Fragments._Tosca_nodes_objectstorage__Tosca_nodes_root.initOperations(_Tosca_nodes_objectstorage__Tosca_nodes_root);

			Fragments._Tosca_nodes_root__MixinBase.initOperations(_Tosca_nodes_root__MixinBase);
			Fragments._Tosca_nodes_root__OclAny.initOperations(_Tosca_nodes_root__OclAny);
			Fragments._Tosca_nodes_root__OclElement.initOperations(_Tosca_nodes_root__OclElement);
			Fragments._Tosca_nodes_root__Tosca_capabilities_node.initOperations(_Tosca_nodes_root__Tosca_capabilities_node);
			Fragments._Tosca_nodes_root__Tosca_capabilities_root.initOperations(_Tosca_nodes_root__Tosca_capabilities_root);
			Fragments._Tosca_nodes_root__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_root__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_root__Tosca_interfaces_root.initOperations(_Tosca_nodes_root__Tosca_interfaces_root);
			Fragments._Tosca_nodes_root__Tosca_nodes_root.initOperations(_Tosca_nodes_root__Tosca_nodes_root);

			Fragments._Tosca_nodes_softwarecomponent__MixinBase.initOperations(_Tosca_nodes_softwarecomponent__MixinBase);
			Fragments._Tosca_nodes_softwarecomponent__OclAny.initOperations(_Tosca_nodes_softwarecomponent__OclAny);
			Fragments._Tosca_nodes_softwarecomponent__OclElement.initOperations(_Tosca_nodes_softwarecomponent__OclElement);
			Fragments._Tosca_nodes_softwarecomponent__Tosca_capabilities_node.initOperations(_Tosca_nodes_softwarecomponent__Tosca_capabilities_node);
			Fragments._Tosca_nodes_softwarecomponent__Tosca_capabilities_root.initOperations(_Tosca_nodes_softwarecomponent__Tosca_capabilities_root);
			Fragments._Tosca_nodes_softwarecomponent__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_softwarecomponent__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_softwarecomponent__Tosca_interfaces_root.initOperations(_Tosca_nodes_softwarecomponent__Tosca_interfaces_root);
			Fragments._Tosca_nodes_softwarecomponent__Tosca_nodes_root.initOperations(_Tosca_nodes_softwarecomponent__Tosca_nodes_root);
			Fragments._Tosca_nodes_softwarecomponent__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_softwarecomponent__Tosca_nodes_softwarecomponent);

			Fragments._Tosca_nodes_webapplication__MixinBase.initOperations(_Tosca_nodes_webapplication__MixinBase);
			Fragments._Tosca_nodes_webapplication__OclAny.initOperations(_Tosca_nodes_webapplication__OclAny);
			Fragments._Tosca_nodes_webapplication__OclElement.initOperations(_Tosca_nodes_webapplication__OclElement);
			Fragments._Tosca_nodes_webapplication__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_webapplication__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_webapplication__Tosca_capabilities_node.initOperations(_Tosca_nodes_webapplication__Tosca_capabilities_node);
			Fragments._Tosca_nodes_webapplication__Tosca_capabilities_root.initOperations(_Tosca_nodes_webapplication__Tosca_capabilities_root);
			Fragments._Tosca_nodes_webapplication__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_webapplication__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_webapplication__Tosca_interfaces_root.initOperations(_Tosca_nodes_webapplication__Tosca_interfaces_root);
			Fragments._Tosca_nodes_webapplication__Tosca_nodes_root.initOperations(_Tosca_nodes_webapplication__Tosca_nodes_root);
			Fragments._Tosca_nodes_webapplication__Tosca_nodes_webapplication.initOperations(_Tosca_nodes_webapplication__Tosca_nodes_webapplication);

			Fragments._Tosca_nodes_webserver__MixinBase.initOperations(_Tosca_nodes_webserver__MixinBase);
			Fragments._Tosca_nodes_webserver__OclAny.initOperations(_Tosca_nodes_webserver__OclAny);
			Fragments._Tosca_nodes_webserver__OclElement.initOperations(_Tosca_nodes_webserver__OclElement);
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_container.initOperations(_Tosca_nodes_webserver__Tosca_capabilities_container);
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_webserver__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_endpoint_admin.initOperations(_Tosca_nodes_webserver__Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_node.initOperations(_Tosca_nodes_webserver__Tosca_capabilities_node);
			Fragments._Tosca_nodes_webserver__Tosca_capabilities_root.initOperations(_Tosca_nodes_webserver__Tosca_capabilities_root);
			Fragments._Tosca_nodes_webserver__Tosca_interfaces_node_lifecycle_standard.initOperations(_Tosca_nodes_webserver__Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_nodes_webserver__Tosca_interfaces_root.initOperations(_Tosca_nodes_webserver__Tosca_interfaces_root);
			Fragments._Tosca_nodes_webserver__Tosca_nodes_root.initOperations(_Tosca_nodes_webserver__Tosca_nodes_root);
			Fragments._Tosca_nodes_webserver__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_webserver__Tosca_nodes_softwarecomponent);
			Fragments._Tosca_nodes_webserver__Tosca_nodes_webserver.initOperations(_Tosca_nodes_webserver__Tosca_nodes_webserver);

			Fragments._Tosca_policies_performance__Agreement_term.initOperations(_Tosca_policies_performance__Agreement_term);
			Fragments._Tosca_policies_performance__MixinBase.initOperations(_Tosca_policies_performance__MixinBase);
			Fragments._Tosca_policies_performance__OclAny.initOperations(_Tosca_policies_performance__OclAny);
			Fragments._Tosca_policies_performance__OclElement.initOperations(_Tosca_policies_performance__OclElement);
			Fragments._Tosca_policies_performance__Tosca_policies_performance.initOperations(_Tosca_policies_performance__Tosca_policies_performance);
			Fragments._Tosca_policies_performance__Tosca_policies_root.initOperations(_Tosca_policies_performance__Tosca_policies_root);

			Fragments._Tosca_policies_placement__Agreement_term.initOperations(_Tosca_policies_placement__Agreement_term);
			Fragments._Tosca_policies_placement__MixinBase.initOperations(_Tosca_policies_placement__MixinBase);
			Fragments._Tosca_policies_placement__OclAny.initOperations(_Tosca_policies_placement__OclAny);
			Fragments._Tosca_policies_placement__OclElement.initOperations(_Tosca_policies_placement__OclElement);
			Fragments._Tosca_policies_placement__Tosca_policies_placement.initOperations(_Tosca_policies_placement__Tosca_policies_placement);
			Fragments._Tosca_policies_placement__Tosca_policies_root.initOperations(_Tosca_policies_placement__Tosca_policies_root);

			Fragments._Tosca_policies_root__Agreement_term.initOperations(_Tosca_policies_root__Agreement_term);
			Fragments._Tosca_policies_root__MixinBase.initOperations(_Tosca_policies_root__MixinBase);
			Fragments._Tosca_policies_root__OclAny.initOperations(_Tosca_policies_root__OclAny);
			Fragments._Tosca_policies_root__OclElement.initOperations(_Tosca_policies_root__OclElement);
			Fragments._Tosca_policies_root__Tosca_policies_root.initOperations(_Tosca_policies_root__Tosca_policies_root);

			Fragments._Tosca_policies_scaling__Agreement_term.initOperations(_Tosca_policies_scaling__Agreement_term);
			Fragments._Tosca_policies_scaling__MixinBase.initOperations(_Tosca_policies_scaling__MixinBase);
			Fragments._Tosca_policies_scaling__OclAny.initOperations(_Tosca_policies_scaling__OclAny);
			Fragments._Tosca_policies_scaling__OclElement.initOperations(_Tosca_policies_scaling__OclElement);
			Fragments._Tosca_policies_scaling__Tosca_policies_root.initOperations(_Tosca_policies_scaling__Tosca_policies_root);
			Fragments._Tosca_policies_scaling__Tosca_policies_scaling.initOperations(_Tosca_policies_scaling__Tosca_policies_scaling);

			Fragments._Tosca_policies_update__Agreement_term.initOperations(_Tosca_policies_update__Agreement_term);
			Fragments._Tosca_policies_update__MixinBase.initOperations(_Tosca_policies_update__MixinBase);
			Fragments._Tosca_policies_update__OclAny.initOperations(_Tosca_policies_update__OclAny);
			Fragments._Tosca_policies_update__OclElement.initOperations(_Tosca_policies_update__OclElement);
			Fragments._Tosca_policies_update__Tosca_policies_root.initOperations(_Tosca_policies_update__Tosca_policies_root);
			Fragments._Tosca_policies_update__Tosca_policies_update.initOperations(_Tosca_policies_update__Tosca_policies_update);

			Fragments._Tosca_relationships_attachesto__MixinBase.initOperations(_Tosca_relationships_attachesto__MixinBase);
			Fragments._Tosca_relationships_attachesto__OclAny.initOperations(_Tosca_relationships_attachesto__OclAny);
			Fragments._Tosca_relationships_attachesto__OclElement.initOperations(_Tosca_relationships_attachesto__OclElement);
			Fragments._Tosca_relationships_attachesto__Tosca_relationships_attachesto.initOperations(_Tosca_relationships_attachesto__Tosca_relationships_attachesto);
			Fragments._Tosca_relationships_attachesto__Tosca_relationships_root.initOperations(_Tosca_relationships_attachesto__Tosca_relationships_root);

			Fragments._Tosca_relationships_connectsto__MixinBase.initOperations(_Tosca_relationships_connectsto__MixinBase);
			Fragments._Tosca_relationships_connectsto__OclAny.initOperations(_Tosca_relationships_connectsto__OclAny);
			Fragments._Tosca_relationships_connectsto__OclElement.initOperations(_Tosca_relationships_connectsto__OclElement);
			Fragments._Tosca_relationships_connectsto__Tosca_relationships_connectsto.initOperations(_Tosca_relationships_connectsto__Tosca_relationships_connectsto);
			Fragments._Tosca_relationships_connectsto__Tosca_relationships_root.initOperations(_Tosca_relationships_connectsto__Tosca_relationships_root);

			Fragments._Tosca_relationships_dependson__MixinBase.initOperations(_Tosca_relationships_dependson__MixinBase);
			Fragments._Tosca_relationships_dependson__OclAny.initOperations(_Tosca_relationships_dependson__OclAny);
			Fragments._Tosca_relationships_dependson__OclElement.initOperations(_Tosca_relationships_dependson__OclElement);
			Fragments._Tosca_relationships_dependson__Tosca_relationships_dependson.initOperations(_Tosca_relationships_dependson__Tosca_relationships_dependson);
			Fragments._Tosca_relationships_dependson__Tosca_relationships_root.initOperations(_Tosca_relationships_dependson__Tosca_relationships_root);

			Fragments._Tosca_relationships_hostedon__MixinBase.initOperations(_Tosca_relationships_hostedon__MixinBase);
			Fragments._Tosca_relationships_hostedon__OclAny.initOperations(_Tosca_relationships_hostedon__OclAny);
			Fragments._Tosca_relationships_hostedon__OclElement.initOperations(_Tosca_relationships_hostedon__OclElement);
			Fragments._Tosca_relationships_hostedon__Tosca_relationships_hostedon.initOperations(_Tosca_relationships_hostedon__Tosca_relationships_hostedon);
			Fragments._Tosca_relationships_hostedon__Tosca_relationships_root.initOperations(_Tosca_relationships_hostedon__Tosca_relationships_root);

			Fragments._Tosca_relationships_root__MixinBase.initOperations(_Tosca_relationships_root__MixinBase);
			Fragments._Tosca_relationships_root__OclAny.initOperations(_Tosca_relationships_root__OclAny);
			Fragments._Tosca_relationships_root__OclElement.initOperations(_Tosca_relationships_root__OclElement);
			Fragments._Tosca_relationships_root__Tosca_relationships_root.initOperations(_Tosca_relationships_root__Tosca_relationships_root);

			Fragments._Tosca_relationships_routesto__MixinBase.initOperations(_Tosca_relationships_routesto__MixinBase);
			Fragments._Tosca_relationships_routesto__OclAny.initOperations(_Tosca_relationships_routesto__OclAny);
			Fragments._Tosca_relationships_routesto__OclElement.initOperations(_Tosca_relationships_routesto__OclElement);
			Fragments._Tosca_relationships_routesto__Tosca_relationships_connectsto.initOperations(_Tosca_relationships_routesto__Tosca_relationships_connectsto);
			Fragments._Tosca_relationships_routesto__Tosca_relationships_root.initOperations(_Tosca_relationships_routesto__Tosca_relationships_root);
			Fragments._Tosca_relationships_routesto__Tosca_relationships_routesto.initOperations(_Tosca_relationships_routesto__Tosca_relationships_routesto);

			Fragments._arrayBoolean__OclAny.initOperations(_arrayBoolean__OclAny);
			Fragments._arrayBoolean__OclElement.initOperations(_arrayBoolean__OclElement);
			Fragments._arrayBoolean__arrayBoolean.initOperations(_arrayBoolean__arrayBoolean);

			Fragments._arrayByte__OclAny.initOperations(_arrayByte__OclAny);
			Fragments._arrayByte__OclElement.initOperations(_arrayByte__OclElement);
			Fragments._arrayByte__arrayByte.initOperations(_arrayByte__arrayByte);

			Fragments._arrayDouble__OclAny.initOperations(_arrayDouble__OclAny);
			Fragments._arrayDouble__OclElement.initOperations(_arrayDouble__OclElement);
			Fragments._arrayDouble__arrayDouble.initOperations(_arrayDouble__arrayDouble);

			Fragments._arrayFloat__OclAny.initOperations(_arrayFloat__OclAny);
			Fragments._arrayFloat__OclElement.initOperations(_arrayFloat__OclElement);
			Fragments._arrayFloat__arrayFloat.initOperations(_arrayFloat__arrayFloat);

			Fragments._arrayInteger__OclAny.initOperations(_arrayInteger__OclAny);
			Fragments._arrayInteger__OclElement.initOperations(_arrayInteger__OclElement);
			Fragments._arrayInteger__arrayInteger.initOperations(_arrayInteger__arrayInteger);

			Fragments._arrayLong__OclAny.initOperations(_arrayLong__OclAny);
			Fragments._arrayLong__OclElement.initOperations(_arrayLong__OclElement);
			Fragments._arrayLong__arrayLong.initOperations(_arrayLong__arrayLong);

			Fragments._arrayShort__OclAny.initOperations(_arrayShort__OclAny);
			Fragments._arrayShort__OclElement.initOperations(_arrayShort__OclElement);
			Fragments._arrayShort__arrayShort.initOperations(_arrayShort__arrayShort);

			Fragments._arrayString__OclAny.initOperations(_arrayString__OclAny);
			Fragments._arrayString__OclElement.initOperations(_arrayString__OclElement);
			Fragments._arrayString__arrayString.initOperations(_arrayString__arrayString);

			Fragments._boolean__OclAny.initOperations(_boolean__OclAny);
			Fragments._boolean__boolean.initOperations(_boolean__boolean);

			Fragments._byte__OclAny.initOperations(_byte__OclAny);
			Fragments._byte__byte.initOperations(_byte__byte);

			Fragments._double__OclAny.initOperations(_double__OclAny);
			Fragments._double__double.initOperations(_double__double);

			Fragments._float__OclAny.initOperations(_float__OclAny);
			Fragments._float__float.initOperations(_float__float);

			Fragments._initiatorEnum__OclAny.initOperations(_initiatorEnum__OclAny);
			Fragments._initiatorEnum__OclElement.initOperations(_initiatorEnum__OclElement);
			Fragments._initiatorEnum__OclEnumeration.initOperations(_initiatorEnum__OclEnumeration);
			Fragments._initiatorEnum__OclType.initOperations(_initiatorEnum__OclType);
			Fragments._initiatorEnum__initiatorEnum.initOperations(_initiatorEnum__initiatorEnum);

			Fragments._integer__OclAny.initOperations(_integer__OclAny);
			Fragments._integer__integer.initOperations(_integer__integer);

			Fragments._integerMinOne__OclAny.initOperations(_integerMinOne__OclAny);
			Fragments._integerMinOne__integerMinOne.initOperations(_integerMinOne__integerMinOne);

			Fragments._long__OclAny.initOperations(_long__OclAny);
			Fragments._long__long.initOperations(_long__long);

			Fragments._map__OclAny.initOperations(_map__OclAny);
			Fragments._map__map.initOperations(_map__map);

			Fragments._protocolEnum__OclAny.initOperations(_protocolEnum__OclAny);
			Fragments._protocolEnum__OclElement.initOperations(_protocolEnum__OclElement);
			Fragments._protocolEnum__OclEnumeration.initOperations(_protocolEnum__OclEnumeration);
			Fragments._protocolEnum__OclType.initOperations(_protocolEnum__OclType);
			Fragments._protocolEnum__protocolEnum.initOperations(_protocolEnum__protocolEnum);

			Fragments._range__OclAny.initOperations(_range__OclAny);
			Fragments._range__range.initOperations(_range__range);

			Fragments._scalarFrequency__OclAny.initOperations(_scalarFrequency__OclAny);
			Fragments._scalarFrequency__scalarFrequency.initOperations(_scalarFrequency__scalarFrequency);

			Fragments._scalarSizeMinOneMB__OclAny.initOperations(_scalarSizeMinOneMB__OclAny);
			Fragments._scalarSizeMinOneMB__scalarSizeMinOneMB.initOperations(_scalarSizeMinOneMB__scalarSizeMinOneMB);

			Fragments._scalarSizeMinZeroGB__OclAny.initOperations(_scalarSizeMinZeroGB__OclAny);
			Fragments._scalarSizeMinZeroGB__scalarSizeMinZeroGB.initOperations(_scalarSizeMinZeroGB__scalarSizeMinZeroGB);

			Fragments._scalarSizeMinZeroMB__OclAny.initOperations(_scalarSizeMinZeroMB__OclAny);
			Fragments._scalarSizeMinZeroMB__scalarSizeMinZeroMB.initOperations(_scalarSizeMinZeroMB__scalarSizeMinZeroMB);

			Fragments._short__OclAny.initOperations(_short__OclAny);
			Fragments._short__short.initOperations(_short__short);

			Fragments._string__OclAny.initOperations(_string__OclAny);
			Fragments._string__string.initOperations(_string__string);

			Fragments._stringMinOne__OclAny.initOperations(_stringMinOne__OclAny);
			Fragments._stringMinOne__stringMinOne.initOperations(_stringMinOne__stringMinOne);

			Fragments._toscadatatypesCredential__OclAny.initOperations(_toscadatatypesCredential__OclAny);
			Fragments._toscadatatypesCredential__OclElement.initOperations(_toscadatatypesCredential__OclElement);
			Fragments._toscadatatypesCredential__toscadatatypesCredential.initOperations(_toscadatatypesCredential__toscadatatypesCredential);

			Fragments._toscadatatypesnetworkNetworkInfo__OclAny.initOperations(_toscadatatypesnetworkNetworkInfo__OclAny);
			Fragments._toscadatatypesnetworkNetworkInfo__OclElement.initOperations(_toscadatatypesnetworkNetworkInfo__OclElement);
			Fragments._toscadatatypesnetworkNetworkInfo__toscadatatypesnetworkNetworkInfo.initOperations(_toscadatatypesnetworkNetworkInfo__toscadatatypesnetworkNetworkInfo);

			Fragments._toscadatatypesnetworkPortDef__OclAny.initOperations(_toscadatatypesnetworkPortDef__OclAny);
			Fragments._toscadatatypesnetworkPortDef__toscadatatypesnetworkPortDef.initOperations(_toscadatatypesnetworkPortDef__toscadatatypesnetworkPortDef);

			Fragments._toscadatatypesnetworkPortInfo__OclAny.initOperations(_toscadatatypesnetworkPortInfo__OclAny);
			Fragments._toscadatatypesnetworkPortInfo__OclElement.initOperations(_toscadatatypesnetworkPortInfo__OclElement);
			Fragments._toscadatatypesnetworkPortInfo__toscadatatypesnetworkPortInfo.initOperations(_toscadatatypesnetworkPortInfo__toscadatatypesnetworkPortInfo);

			Fragments._toscadatatypesnetworkPortSpec__OclAny.initOperations(_toscadatatypesnetworkPortSpec__OclAny);
			Fragments._toscadatatypesnetworkPortSpec__OclElement.initOperations(_toscadatatypesnetworkPortSpec__OclElement);
			Fragments._toscadatatypesnetworkPortSpec__toscadatatypesnetworkPortSpec.initOperations(_toscadatatypesnetworkPortSpec__toscadatatypesnetworkPortSpec);

			Fragments._version__OclAny.initOperations(_version__OclAny);
			Fragments._version__version.initOperations(_version__version);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_attachment = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_container = {
			ToscaTables.Properties._Tosca_capabilities_container__cpuFrequency,
			ToscaTables.Properties._Tosca_capabilities_container__diskSize,
			ToscaTables.Properties._Tosca_capabilities_container__memSize,
			ToscaTables.Properties._Tosca_capabilities_container__numCpus
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_endpoint = {
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_endpoint_admin = {
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_endpoint_database = {
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_endpoint_public = {
			ToscaTables.Properties._Tosca_capabilities_endpoint_public__dnsName,
			ToscaTables.Properties._Tosca_capabilities_endpoint_public__floating,
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_network_bindable = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_node = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_operatingsystem = {
			ToscaTables.Properties._Tosca_capabilities_operatingsystem__architecture,
			ToscaTables.Properties._Tosca_capabilities_operatingsystem__distribution,
			ToscaTables.Properties._Tosca_capabilities_operatingsystem__type,
			ToscaTables.Properties._Tosca_capabilities_operatingsystem__version
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_scalable = {
			ToscaTables.Properties._Tosca_capabilities_scalable__defaultInstances,
			ToscaTables.Properties._Tosca_capabilities_scalable__maxInstances,
			ToscaTables.Properties._Tosca_capabilities_scalable__minInstances
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_groups_root = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_interfaces_node_lifecycle_standard = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_interfaces_relationship_configure = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_interfaces_root = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_blockstorage = {
			ToscaTables.Properties._Tosca_nodes_blockstorage__size,
			ToscaTables.Properties._Tosca_nodes_blockstorage__snapshotId,
			ToscaTables.Properties._Tosca_nodes_blockstorage__volumeId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_compute = {
			ToscaTables.Properties._Tosca_capabilities_operatingsystem__architecture,
			ToscaTables.Properties._Tosca_capabilities_container__cpuFrequency,
			ToscaTables.Properties._Tosca_capabilities_scalable__defaultInstances,
			ToscaTables.Properties._Tosca_capabilities_container__diskSize,
			ToscaTables.Properties._Tosca_capabilities_operatingsystem__distribution,
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_capabilities_scalable__maxInstances,
			ToscaTables.Properties._Tosca_capabilities_container__memSize,
			ToscaTables.Properties._Tosca_capabilities_scalable__minInstances,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_nodes_compute__networks,
			ToscaTables.Properties._Tosca_capabilities_container__numCpus,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_nodes_compute__privateAddress,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_nodes_compute__publicAddress,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_capabilities_operatingsystem__type,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath,
			ToscaTables.Properties._Tosca_capabilities_operatingsystem__version
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_container_application = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_container_runtime = {
			ToscaTables.Properties._Tosca_nodes_softwarecomponent__adminCredential,
			ToscaTables.Properties._Tosca_nodes_softwarecomponent__componentVersion,
			ToscaTables.Properties._Tosca_capabilities_container__cpuFrequency,
			ToscaTables.Properties._Tosca_capabilities_scalable__defaultInstances,
			ToscaTables.Properties._Tosca_capabilities_container__diskSize,
			ToscaTables.Properties._Tosca_capabilities_scalable__maxInstances,
			ToscaTables.Properties._Tosca_capabilities_container__memSize,
			ToscaTables.Properties._Tosca_capabilities_scalable__minInstances,
			ToscaTables.Properties._Tosca_capabilities_container__numCpus
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_database = {
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_nodes_database__name,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_nodes_database__password,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath,
			ToscaTables.Properties._Tosca_nodes_database__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_dbms = {
			ToscaTables.Properties._Tosca_nodes_softwarecomponent__adminCredential,
			ToscaTables.Properties._Tosca_nodes_softwarecomponent__componentVersion,
			ToscaTables.Properties._Tosca_capabilities_container__cpuFrequency,
			ToscaTables.Properties._Tosca_capabilities_container__diskSize,
			ToscaTables.Properties._Tosca_capabilities_container__memSize,
			ToscaTables.Properties._Tosca_capabilities_container__numCpus,
			ToscaTables.Properties._Tosca_nodes_dbms__port,
			ToscaTables.Properties._Tosca_nodes_dbms__rootPassword
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_loadbalancer = {
			ToscaTables.Properties._Tosca_nodes_loadbalancer__algorithm,
			ToscaTables.Properties._Tosca_capabilities_endpoint_public__dnsName,
			ToscaTables.Properties._Tosca_capabilities_endpoint_public__floating,
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_objectstorage = {
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_nodes_objectstorage__name,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_nodes_objectstorage__size,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_softwarecomponent = {
			ToscaTables.Properties._Tosca_nodes_softwarecomponent__adminCredential,
			ToscaTables.Properties._Tosca_nodes_softwarecomponent__componentVersion
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_webapplication = {
			ToscaTables.Properties._Tosca_nodes_webapplication__contextRoot,
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_webserver = {
			ToscaTables.Properties._Tosca_nodes_softwarecomponent__adminCredential,
			ToscaTables.Properties._Tosca_nodes_softwarecomponent__componentVersion,
			ToscaTables.Properties._Tosca_capabilities_container__cpuFrequency,
			ToscaTables.Properties._Tosca_capabilities_container__diskSize,
			ToscaTables.Properties._Tosca_capabilities_endpoint__initiator,
			ToscaTables.Properties._Tosca_capabilities_container__memSize,
			ToscaTables.Properties._Tosca_capabilities_endpoint__networkName,
			ToscaTables.Properties._Tosca_capabilities_container__numCpus,
			ToscaTables.Properties._Tosca_capabilities_endpoint__port,
			ToscaTables.Properties._Tosca_capabilities_endpoint__portName,
			ToscaTables.Properties._Tosca_capabilities_endpoint__ports,
			ToscaTables.Properties._Tosca_capabilities_endpoint__protocol,
			ToscaTables.Properties._Tosca_capabilities_endpoint__secure,
			ToscaTables.Properties._Tosca_capabilities_endpoint__urlPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_policies_performance = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_policies_placement = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_policies_root = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_policies_scaling = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_policies_update = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_attachesto = {
			ToscaTables.Properties._Tosca_relationships_attachesto__location,
			ToscaTables.Properties._Tosca_relationships_root__state,
			ToscaTables.Properties._Tosca_relationships_root__toscaId,
			ToscaTables.Properties._Tosca_relationships_root__toscaName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_connectsto = {
			ToscaTables.Properties._Tosca_relationships_connectsto__credential,
			ToscaTables.Properties._Tosca_relationships_root__state,
			ToscaTables.Properties._Tosca_relationships_root__toscaId,
			ToscaTables.Properties._Tosca_relationships_root__toscaName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_dependson = {
			ToscaTables.Properties._Tosca_relationships_root__state,
			ToscaTables.Properties._Tosca_relationships_root__toscaId,
			ToscaTables.Properties._Tosca_relationships_root__toscaName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_hostedon = {
			ToscaTables.Properties._Tosca_relationships_root__state,
			ToscaTables.Properties._Tosca_relationships_root__toscaId,
			ToscaTables.Properties._Tosca_relationships_root__toscaName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_root = {
			ToscaTables.Properties._Tosca_relationships_root__state,
			ToscaTables.Properties._Tosca_relationships_root__toscaId,
			ToscaTables.Properties._Tosca_relationships_root__toscaName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_routesto = {
			ToscaTables.Properties._Tosca_relationships_connectsto__credential,
			ToscaTables.Properties._Tosca_relationships_root__state,
			ToscaTables.Properties._Tosca_relationships_root__toscaId,
			ToscaTables.Properties._Tosca_relationships_root__toscaName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayBoolean = {
			ToscaTables.Properties._arrayBoolean__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayByte = {
			ToscaTables.Properties._arrayByte__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayDouble = {
			ToscaTables.Properties._arrayDouble__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayFloat = {
			ToscaTables.Properties._arrayFloat__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayInteger = {
			ToscaTables.Properties._arrayInteger__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayLong = {
			ToscaTables.Properties._arrayLong__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayShort = {
			ToscaTables.Properties._arrayShort__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayString = {
			ToscaTables.Properties._arrayString__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _boolean = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _byte = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _double = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _float = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _initiatorEnum = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _integer = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _integerMinOne = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _long = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _map = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _protocolEnum = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _range = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _scalarFrequency = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _scalarSizeMinOneMB = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _scalarSizeMinZeroGB = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _scalarSizeMinZeroMB = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _short = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _string = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _stringMinOne = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _toscadatatypesCredential = {
			ToscaTables.Properties._toscadatatypesCredential__keys,
			ToscaTables.Properties._toscadatatypesCredential__protocol,
			ToscaTables.Properties._toscadatatypesCredential__token,
			ToscaTables.Properties._toscadatatypesCredential__tokentype,
			ToscaTables.Properties._toscadatatypesCredential__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _toscadatatypesnetworkNetworkInfo = {
			ToscaTables.Properties._toscadatatypesnetworkNetworkInfo__addresses,
			ToscaTables.Properties._toscadatatypesnetworkNetworkInfo__networkid,
			ToscaTables.Properties._toscadatatypesnetworkNetworkInfo__networkname
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _toscadatatypesnetworkPortDef = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _toscadatatypesnetworkPortInfo = {
			ToscaTables.Properties._toscadatatypesnetworkPortInfo__addresses,
			ToscaTables.Properties._toscadatatypesnetworkPortInfo__macaddress,
			ToscaTables.Properties._toscadatatypesnetworkPortInfo__networkid,
			ToscaTables.Properties._toscadatatypesnetworkPortInfo__portid,
			ToscaTables.Properties._toscadatatypesnetworkPortInfo__portname
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _toscadatatypesnetworkPortSpec = {
			ToscaTables.Properties._toscadatatypesnetworkPortSpec__protocol,
			ToscaTables.Properties._toscadatatypesnetworkPortSpec__source,
			ToscaTables.Properties._toscadatatypesnetworkPortSpec__sourcerange,
			ToscaTables.Properties._toscadatatypesnetworkPortSpec__target,
			ToscaTables.Properties._toscadatatypesnetworkPortSpec__targetrange
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _version = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Tosca_capabilities_attachment__Tosca_capabilities_attachment.initProperties(_Tosca_capabilities_attachment);
			Fragments._Tosca_capabilities_container__Tosca_capabilities_container.initProperties(_Tosca_capabilities_container);
			Fragments._Tosca_capabilities_endpoint__Tosca_capabilities_endpoint.initProperties(_Tosca_capabilities_endpoint);
			Fragments._Tosca_capabilities_endpoint_admin__Tosca_capabilities_endpoint_admin.initProperties(_Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_capabilities_endpoint_database__Tosca_capabilities_endpoint_database.initProperties(_Tosca_capabilities_endpoint_database);
			Fragments._Tosca_capabilities_endpoint_public__Tosca_capabilities_endpoint_public.initProperties(_Tosca_capabilities_endpoint_public);
			Fragments._Tosca_capabilities_network_bindable__Tosca_capabilities_network_bindable.initProperties(_Tosca_capabilities_network_bindable);
			Fragments._Tosca_capabilities_node__Tosca_capabilities_node.initProperties(_Tosca_capabilities_node);
			Fragments._Tosca_capabilities_operatingsystem__Tosca_capabilities_operatingsystem.initProperties(_Tosca_capabilities_operatingsystem);
			Fragments._Tosca_capabilities_root__Tosca_capabilities_root.initProperties(_Tosca_capabilities_root);
			Fragments._Tosca_capabilities_scalable__Tosca_capabilities_scalable.initProperties(_Tosca_capabilities_scalable);
			Fragments._Tosca_groups_root__Tosca_groups_root.initProperties(_Tosca_groups_root);
			Fragments._Tosca_interfaces_node_lifecycle_standard__Tosca_interfaces_node_lifecycle_standard.initProperties(_Tosca_interfaces_node_lifecycle_standard);
			Fragments._Tosca_interfaces_relationship_configure__Tosca_interfaces_relationship_configure.initProperties(_Tosca_interfaces_relationship_configure);
			Fragments._Tosca_interfaces_root__Tosca_interfaces_root.initProperties(_Tosca_interfaces_root);
			Fragments._Tosca_nodes_blockstorage__Tosca_nodes_blockstorage.initProperties(_Tosca_nodes_blockstorage);
			Fragments._Tosca_nodes_compute__Tosca_nodes_compute.initProperties(_Tosca_nodes_compute);
			Fragments._Tosca_nodes_container_application__Tosca_nodes_container_application.initProperties(_Tosca_nodes_container_application);
			Fragments._Tosca_nodes_container_runtime__Tosca_nodes_container_runtime.initProperties(_Tosca_nodes_container_runtime);
			Fragments._Tosca_nodes_database__Tosca_nodes_database.initProperties(_Tosca_nodes_database);
			Fragments._Tosca_nodes_dbms__Tosca_nodes_dbms.initProperties(_Tosca_nodes_dbms);
			Fragments._Tosca_nodes_loadbalancer__Tosca_nodes_loadbalancer.initProperties(_Tosca_nodes_loadbalancer);
			Fragments._Tosca_nodes_objectstorage__Tosca_nodes_objectstorage.initProperties(_Tosca_nodes_objectstorage);
			Fragments._Tosca_nodes_root__Tosca_nodes_root.initProperties(_Tosca_nodes_root);
			Fragments._Tosca_nodes_softwarecomponent__Tosca_nodes_softwarecomponent.initProperties(_Tosca_nodes_softwarecomponent);
			Fragments._Tosca_nodes_webapplication__Tosca_nodes_webapplication.initProperties(_Tosca_nodes_webapplication);
			Fragments._Tosca_nodes_webserver__Tosca_nodes_webserver.initProperties(_Tosca_nodes_webserver);
			Fragments._Tosca_policies_performance__Tosca_policies_performance.initProperties(_Tosca_policies_performance);
			Fragments._Tosca_policies_placement__Tosca_policies_placement.initProperties(_Tosca_policies_placement);
			Fragments._Tosca_policies_root__Tosca_policies_root.initProperties(_Tosca_policies_root);
			Fragments._Tosca_policies_scaling__Tosca_policies_scaling.initProperties(_Tosca_policies_scaling);
			Fragments._Tosca_policies_update__Tosca_policies_update.initProperties(_Tosca_policies_update);
			Fragments._Tosca_relationships_attachesto__Tosca_relationships_attachesto.initProperties(_Tosca_relationships_attachesto);
			Fragments._Tosca_relationships_connectsto__Tosca_relationships_connectsto.initProperties(_Tosca_relationships_connectsto);
			Fragments._Tosca_relationships_dependson__Tosca_relationships_dependson.initProperties(_Tosca_relationships_dependson);
			Fragments._Tosca_relationships_hostedon__Tosca_relationships_hostedon.initProperties(_Tosca_relationships_hostedon);
			Fragments._Tosca_relationships_root__Tosca_relationships_root.initProperties(_Tosca_relationships_root);
			Fragments._Tosca_relationships_routesto__Tosca_relationships_routesto.initProperties(_Tosca_relationships_routesto);
			Fragments._arrayBoolean__arrayBoolean.initProperties(_arrayBoolean);
			Fragments._arrayByte__arrayByte.initProperties(_arrayByte);
			Fragments._arrayDouble__arrayDouble.initProperties(_arrayDouble);
			Fragments._arrayFloat__arrayFloat.initProperties(_arrayFloat);
			Fragments._arrayInteger__arrayInteger.initProperties(_arrayInteger);
			Fragments._arrayLong__arrayLong.initProperties(_arrayLong);
			Fragments._arrayShort__arrayShort.initProperties(_arrayShort);
			Fragments._arrayString__arrayString.initProperties(_arrayString);
			Fragments._boolean__boolean.initProperties(_boolean);
			Fragments._byte__byte.initProperties(_byte);
			Fragments._double__double.initProperties(_double);
			Fragments._float__float.initProperties(_float);
			Fragments._initiatorEnum__initiatorEnum.initProperties(_initiatorEnum);
			Fragments._integer__integer.initProperties(_integer);
			Fragments._integerMinOne__integerMinOne.initProperties(_integerMinOne);
			Fragments._long__long.initProperties(_long);
			Fragments._map__map.initProperties(_map);
			Fragments._protocolEnum__protocolEnum.initProperties(_protocolEnum);
			Fragments._range__range.initProperties(_range);
			Fragments._scalarFrequency__scalarFrequency.initProperties(_scalarFrequency);
			Fragments._scalarSizeMinOneMB__scalarSizeMinOneMB.initProperties(_scalarSizeMinOneMB);
			Fragments._scalarSizeMinZeroGB__scalarSizeMinZeroGB.initProperties(_scalarSizeMinZeroGB);
			Fragments._scalarSizeMinZeroMB__scalarSizeMinZeroMB.initProperties(_scalarSizeMinZeroMB);
			Fragments._short__short.initProperties(_short);
			Fragments._string__string.initProperties(_string);
			Fragments._stringMinOne__stringMinOne.initProperties(_stringMinOne);
			Fragments._toscadatatypesCredential__toscadatatypesCredential.initProperties(_toscadatatypesCredential);
			Fragments._toscadatatypesnetworkNetworkInfo__toscadatatypesnetworkNetworkInfo.initProperties(_toscadatatypesnetworkNetworkInfo);
			Fragments._toscadatatypesnetworkPortDef__toscadatatypesnetworkPortDef.initProperties(_toscadatatypesnetworkPortDef);
			Fragments._toscadatatypesnetworkPortInfo__toscadatatypesnetworkPortInfo.initProperties(_toscadatatypesnetworkPortInfo);
			Fragments._toscadatatypesnetworkPortSpec__toscadatatypesnetworkPortSpec.initProperties(_toscadatatypesnetworkPortSpec);
			Fragments._version__version.initProperties(_version);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _initiatorEnum__source = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.INITIATOR_ENUM.getEEnumLiteral("source"), Types._initiatorEnum, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _initiatorEnum__target = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.INITIATOR_ENUM.getEEnumLiteral("target"), Types._initiatorEnum, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _initiatorEnum__peer = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.INITIATOR_ENUM.getEEnumLiteral("peer"), Types._initiatorEnum, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _initiatorEnum = {
			_initiatorEnum__source,
			_initiatorEnum__target,
			_initiatorEnum__peer
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _protocolEnum__udp = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.PROTOCOL_ENUM.getEEnumLiteral("udp"), Types._protocolEnum, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _protocolEnum__tcp = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.PROTOCOL_ENUM.getEEnumLiteral("tcp"), Types._protocolEnum, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _protocolEnum__igmp = new EcoreExecutorEnumerationLiteral(ToscaPackage.Literals.PROTOCOL_ENUM.getEEnumLiteral("igmp"), Types._protocolEnum, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _protocolEnum = {
			_protocolEnum__udp,
			_protocolEnum__tcp,
			_protocolEnum__igmp
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._initiatorEnum.initLiterals(_initiatorEnum);
			Types._protocolEnum.initLiterals(_protocolEnum);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ToscaTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
