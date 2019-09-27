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
 *   /org.eclipse.cmf.occi.tosca.extended/model/extendedTosca.ecore
 * using:
 *   /org.eclipse.cmf.occi.tosca.extended/model/extendedTosca.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package extendedtosca;

import extendedtosca.ExtendedtoscaTables;
import modmacao.ModmacaoTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.tosca.ToscaTables;
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
import org.modmacao.occi.platform.PlatformTables;

/**
 * ExtendedtoscaTables provides the dispatch tables for the extendedtosca for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ExtendedtoscaTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ExtendedtoscaPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/tosca/core/ecore", null, org.eclipse.cmf.occi.tosca.ToscaPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/tosca/extended/ecore", null, extendedtosca.ExtendedtoscaPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = extendedtosca.ExtendedtoscaTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Credential = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore.getClassId("Credential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Network = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Network", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PortSpec = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore.getClassId("PortSpec", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_capabilities_container_docker = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getClassId("Tosca_capabilities_container_docker", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_capabilities_indigo_endpoint = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getClassId("Tosca_capabilities_indigo_endpoint", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_databasewithlistparam = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getClassId("Tosca_nodes_databasewithlistparam", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_network_network = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getClassId("Tosca_nodes_network_network", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Tosca_nodes_network_port = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getClassId("Tosca_nodes_network_port", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_arrayCredential = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getClassId("arrayCredential", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_arrayPortSpec = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getClassId("arrayPortSpec", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_arrayinteger = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getClassId("arrayinteger", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_arraystring = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore.getClassId("arraystring", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_arrayversion = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getClassId("arrayversion", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_boolean = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore.getDataTypeId("boolean", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_integer = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore.getDataTypeId("integer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_integerMinZero = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore.getDataTypeId("integerMinZero", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_map = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore.getDataTypeId("map", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_string = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore.getDataTypeId("string", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_version = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_core_s_ecore.getDataTypeId("version", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ip_versionEnum = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getEnumerationId("ip_versionEnum");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_storage_pathEnum = extendedtosca.ExtendedtoscaTables.PACKid_http_c_s_s_schemas_ogf_org_s_tosca_s_extended_s_ecore.getEnumerationId("storage_pathEnum");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_network_network_c_c_appliesConstraint = "Tosca_nodes_network_network::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Tosca_nodes_network_port_c_c_appliesConstraint = "Tosca_nodes_network_port::appliesConstraint";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Credential = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(extendedtosca.ExtendedtoscaTables.CLSSid_Credential);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_PortSpec = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(extendedtosca.ExtendedtoscaTables.CLSSid_PortSpec);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_integer = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(extendedtosca.ExtendedtoscaTables.DATAid_integer);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_version = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(extendedtosca.ExtendedtoscaTables.DATAid_version);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ExtendedtoscaTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ExtendedtoscaTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Example_databasesubsystem = new EcoreExecutorType(ExtendedtoscaPackage.Literals.EXAMPLE_DATABASESUBSYSTEM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Example_queuingsubsystem = new EcoreExecutorType(ExtendedtoscaPackage.Literals.EXAMPLE_QUEUINGSUBSYSTEM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Example_someapp = new EcoreExecutorType(ExtendedtoscaPackage.Literals.EXAMPLE_SOMEAPP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Example_transactionsubsystem = new EcoreExecutorType(ExtendedtoscaPackage.Literals.EXAMPLE_TRANSACTIONSUBSYSTEM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Myattachesto = new EcoreExecutorType(ExtendedtoscaPackage.Literals.MYATTACHESTO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mycompany_mytypes_myscalingpolicy = new EcoreExecutorType(ExtendedtoscaPackage.Literals.MYCOMPANY_MYTYPES_MYSCALINGPOLICY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Rsyslog = new EcoreExecutorType(ExtendedtoscaPackage.Literals.RSYSLOG, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Test_relation_connects = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TEST_RELATION_CONNECTS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_container_docker = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_containerchild = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINERCHILD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_ha = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_HA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_indigo_endpoint = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_INDIGO_ENDPOINT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_nodejsappcontainer = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_NODEJSAPPCONTAINER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_somecap = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_SOMECAP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_capabilities_somechildcap = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_SOMECHILDCAP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_abstractmongod = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_ABSTRACTMONGOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_abstractmysql = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_ABSTRACTMYSQL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_apache = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_APACHE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_computewithattrlist = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_COMPUTEWITHATTRLIST, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_computewithcapwithattr = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_COMPUTEWITHCAPWITHATTR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_computewithprop = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_COMPUTEWITHPROP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_container_application_docker = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_CONTAINER_APPLICATION_DOCKER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_database_mysql = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_DATABASE_MYSQL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_databasewithlistparam = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_DATABASEWITHLISTPARAM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_dbms_mysql = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_DBMS_MYSQL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_hacompute = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_HACOMPUTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_mongod = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_MONGOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_mysql = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_network_network = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_network_port = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_nodecellar = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_NODECELLAR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_nodejs = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_NODEJS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_nodewithcap = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_NODEWITHCAP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_nodewithreq = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_NODEWITHREQ, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_php = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_PHP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_softwarecomponent_collectd = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_softwarecomponent_elasticsearch = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_softwarecomponent_kibana = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT_KIBANA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_softwarecomponent_logstash = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_softwarecomponent_rsyslog = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_somenode = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_SOMENODE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_somenode2 = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_SOMENODE2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_webapplication_paypalpizzastore = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_nodes_wordpress = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_NODES_WORDPRESS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_ha = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_RELATIONSHIPS_HA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_network_bindsto = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_RELATIONSHIPS_NETWORK_BINDSTO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_network_linksto = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_RELATIONSHIPS_NETWORK_LINKSTO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_nodecellarhostedonnodejs = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_RELATIONSHIPS_NODECELLARHOSTEDONNODEJS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Tosca_relationships_nodejsconnecttomongo = new EcoreExecutorType(ExtendedtoscaPackage.Literals.TOSCA_RELATIONSHIPS_NODEJSCONNECTTOMONGO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayCredential = new EcoreExecutorType(ExtendedtoscaPackage.Literals.ARRAY_CREDENTIAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayPortSpec = new EcoreExecutorType(ExtendedtoscaPackage.Literals.ARRAY_PORT_SPEC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayinteger = new EcoreExecutorType(ExtendedtoscaPackage.Literals.ARRAYINTEGER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _arrayversion = new EcoreExecutorType(ExtendedtoscaPackage.Literals.ARRAYVERSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ip_versionEnum = new EcoreExecutorEnumeration(ExtendedtoscaPackage.Literals.IP_VERSION_ENUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _storage_pathEnum = new EcoreExecutorEnumeration(ExtendedtoscaPackage.Literals.STORAGE_PATH_ENUM, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Example_databasesubsystem,
			_Example_queuingsubsystem,
			_Example_someapp,
			_Example_transactionsubsystem,
			_Myattachesto,
			_Mycompany_mytypes_myscalingpolicy,
			_Rsyslog,
			_Test_relation_connects,
			_Tosca_capabilities_container_docker,
			_Tosca_capabilities_containerchild,
			_Tosca_capabilities_ha,
			_Tosca_capabilities_indigo_endpoint,
			_Tosca_capabilities_nodejsappcontainer,
			_Tosca_capabilities_somecap,
			_Tosca_capabilities_somechildcap,
			_Tosca_nodes_abstractmongod,
			_Tosca_nodes_abstractmysql,
			_Tosca_nodes_apache,
			_Tosca_nodes_computewithattrlist,
			_Tosca_nodes_computewithcapwithattr,
			_Tosca_nodes_computewithprop,
			_Tosca_nodes_container_application_docker,
			_Tosca_nodes_database_mysql,
			_Tosca_nodes_databasewithlistparam,
			_Tosca_nodes_dbms_mysql,
			_Tosca_nodes_hacompute,
			_Tosca_nodes_mongod,
			_Tosca_nodes_mysql,
			_Tosca_nodes_network_network,
			_Tosca_nodes_network_port,
			_Tosca_nodes_nodecellar,
			_Tosca_nodes_nodejs,
			_Tosca_nodes_nodewithcap,
			_Tosca_nodes_nodewithreq,
			_Tosca_nodes_php,
			_Tosca_nodes_softwarecomponent_collectd,
			_Tosca_nodes_softwarecomponent_elasticsearch,
			_Tosca_nodes_softwarecomponent_kibana,
			_Tosca_nodes_softwarecomponent_logstash,
			_Tosca_nodes_softwarecomponent_rsyslog,
			_Tosca_nodes_somenode,
			_Tosca_nodes_somenode2,
			_Tosca_nodes_webapplication_paypalpizzastore,
			_Tosca_nodes_wordpress,
			_Tosca_relationships_ha,
			_Tosca_relationships_network_bindsto,
			_Tosca_relationships_network_linksto,
			_Tosca_relationships_nodecellarhostedonnodejs,
			_Tosca_relationships_nodejsconnecttomongo,
			_arrayCredential,
			_arrayPortSpec,
			_arrayinteger,
			_arrayversion,
			_ip_versionEnum,
			_storage_pathEnum
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ExtendedtoscaTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Example_databasesubsystem__Example_databasesubsystem = new ExecutorFragment(Types._Example_databasesubsystem, ExtendedtoscaTables.Types._Example_databasesubsystem);
		private static final /*@NonNull*/ ExecutorFragment _Example_databasesubsystem__MixinBase = new ExecutorFragment(Types._Example_databasesubsystem, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Example_databasesubsystem__OclAny = new ExecutorFragment(Types._Example_databasesubsystem, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Example_databasesubsystem__OclElement = new ExecutorFragment(Types._Example_databasesubsystem, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Example_databasesubsystem__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Example_databasesubsystem, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Example_databasesubsystem__Tosca_capabilities_endpoint_database = new ExecutorFragment(Types._Example_databasesubsystem, ToscaTables.Types._Tosca_capabilities_endpoint_database);
		private static final /*@NonNull*/ ExecutorFragment _Example_databasesubsystem__Tosca_capabilities_node = new ExecutorFragment(Types._Example_databasesubsystem, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Example_databasesubsystem__Tosca_capabilities_root = new ExecutorFragment(Types._Example_databasesubsystem, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Example_databasesubsystem__Tosca_nodes_root = new ExecutorFragment(Types._Example_databasesubsystem, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Example_queuingsubsystem__Example_queuingsubsystem = new ExecutorFragment(Types._Example_queuingsubsystem, ExtendedtoscaTables.Types._Example_queuingsubsystem);
		private static final /*@NonNull*/ ExecutorFragment _Example_queuingsubsystem__MixinBase = new ExecutorFragment(Types._Example_queuingsubsystem, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Example_queuingsubsystem__OclAny = new ExecutorFragment(Types._Example_queuingsubsystem, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Example_queuingsubsystem__OclElement = new ExecutorFragment(Types._Example_queuingsubsystem, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Example_queuingsubsystem__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Example_queuingsubsystem, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Example_queuingsubsystem__Tosca_capabilities_node = new ExecutorFragment(Types._Example_queuingsubsystem, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Example_queuingsubsystem__Tosca_capabilities_root = new ExecutorFragment(Types._Example_queuingsubsystem, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Example_queuingsubsystem__Tosca_nodes_root = new ExecutorFragment(Types._Example_queuingsubsystem, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Example_someapp__Example_someapp = new ExecutorFragment(Types._Example_someapp, ExtendedtoscaTables.Types._Example_someapp);
		private static final /*@NonNull*/ ExecutorFragment _Example_someapp__MixinBase = new ExecutorFragment(Types._Example_someapp, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Example_someapp__OclAny = new ExecutorFragment(Types._Example_someapp, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Example_someapp__OclElement = new ExecutorFragment(Types._Example_someapp, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Example_someapp__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Example_someapp, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Example_someapp__Tosca_capabilities_node = new ExecutorFragment(Types._Example_someapp, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Example_someapp__Tosca_capabilities_root = new ExecutorFragment(Types._Example_someapp, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Example_someapp__Tosca_nodes_root = new ExecutorFragment(Types._Example_someapp, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Example_transactionsubsystem__Example_transactionsubsystem = new ExecutorFragment(Types._Example_transactionsubsystem, ExtendedtoscaTables.Types._Example_transactionsubsystem);
		private static final /*@NonNull*/ ExecutorFragment _Example_transactionsubsystem__MixinBase = new ExecutorFragment(Types._Example_transactionsubsystem, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Example_transactionsubsystem__OclAny = new ExecutorFragment(Types._Example_transactionsubsystem, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Example_transactionsubsystem__OclElement = new ExecutorFragment(Types._Example_transactionsubsystem, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Example_transactionsubsystem__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Example_transactionsubsystem, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Example_transactionsubsystem__Tosca_capabilities_node = new ExecutorFragment(Types._Example_transactionsubsystem, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Example_transactionsubsystem__Tosca_capabilities_root = new ExecutorFragment(Types._Example_transactionsubsystem, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Example_transactionsubsystem__Tosca_nodes_root = new ExecutorFragment(Types._Example_transactionsubsystem, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Myattachesto__Dependency = new ExecutorFragment(Types._Myattachesto, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Myattachesto__Executiondependency = new ExecutorFragment(Types._Myattachesto, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Myattachesto__Installationdependency = new ExecutorFragment(Types._Myattachesto, ModmacaoTables.Types._Installationdependency);
		private static final /*@NonNull*/ ExecutorFragment _Myattachesto__MixinBase = new ExecutorFragment(Types._Myattachesto, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Myattachesto__Myattachesto = new ExecutorFragment(Types._Myattachesto, ExtendedtoscaTables.Types._Myattachesto);
		private static final /*@NonNull*/ ExecutorFragment _Myattachesto__OclAny = new ExecutorFragment(Types._Myattachesto, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Myattachesto__OclElement = new ExecutorFragment(Types._Myattachesto, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Myattachesto__Tosca_relationships_attachesto = new ExecutorFragment(Types._Myattachesto, ToscaTables.Types._Tosca_relationships_attachesto);
		private static final /*@NonNull*/ ExecutorFragment _Myattachesto__Tosca_relationships_root = new ExecutorFragment(Types._Myattachesto, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Mycompany_mytypes_myscalingpolicy__MixinBase = new ExecutorFragment(Types._Mycompany_mytypes_myscalingpolicy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mycompany_mytypes_myscalingpolicy__Mycompany_mytypes_myscalingpolicy = new ExecutorFragment(Types._Mycompany_mytypes_myscalingpolicy, ExtendedtoscaTables.Types._Mycompany_mytypes_myscalingpolicy);
		private static final /*@NonNull*/ ExecutorFragment _Mycompany_mytypes_myscalingpolicy__OclAny = new ExecutorFragment(Types._Mycompany_mytypes_myscalingpolicy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mycompany_mytypes_myscalingpolicy__OclElement = new ExecutorFragment(Types._Mycompany_mytypes_myscalingpolicy, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Rsyslog__MixinBase = new ExecutorFragment(Types._Rsyslog, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Rsyslog__OclAny = new ExecutorFragment(Types._Rsyslog, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Rsyslog__OclElement = new ExecutorFragment(Types._Rsyslog, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Rsyslog__Rsyslog = new ExecutorFragment(Types._Rsyslog, ExtendedtoscaTables.Types._Rsyslog);
		private static final /*@NonNull*/ ExecutorFragment _Rsyslog__Tosca_capabilities_node = new ExecutorFragment(Types._Rsyslog, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Rsyslog__Tosca_capabilities_root = new ExecutorFragment(Types._Rsyslog, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Rsyslog__Tosca_nodes_root = new ExecutorFragment(Types._Rsyslog, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Rsyslog__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Rsyslog, ToscaTables.Types._Tosca_nodes_softwarecomponent);

		private static final /*@NonNull*/ ExecutorFragment _Test_relation_connects__MixinBase = new ExecutorFragment(Types._Test_relation_connects, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Test_relation_connects__OclAny = new ExecutorFragment(Types._Test_relation_connects, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Test_relation_connects__OclElement = new ExecutorFragment(Types._Test_relation_connects, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Test_relation_connects__Test_relation_connects = new ExecutorFragment(Types._Test_relation_connects, ExtendedtoscaTables.Types._Test_relation_connects);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container_docker__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_container_docker, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container_docker__OclAny = new ExecutorFragment(Types._Tosca_capabilities_container_docker, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container_docker__OclElement = new ExecutorFragment(Types._Tosca_capabilities_container_docker, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container_docker__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_capabilities_container_docker, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container_docker__Tosca_capabilities_container_docker = new ExecutorFragment(Types._Tosca_capabilities_container_docker, ExtendedtoscaTables.Types._Tosca_capabilities_container_docker);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_container_docker__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_container_docker, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_containerchild__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_containerchild, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_containerchild__OclAny = new ExecutorFragment(Types._Tosca_capabilities_containerchild, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_containerchild__OclElement = new ExecutorFragment(Types._Tosca_capabilities_containerchild, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_containerchild__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_capabilities_containerchild, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_containerchild__Tosca_capabilities_containerchild = new ExecutorFragment(Types._Tosca_capabilities_containerchild, ExtendedtoscaTables.Types._Tosca_capabilities_containerchild);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_containerchild__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_containerchild, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_ha__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_ha, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_ha__OclAny = new ExecutorFragment(Types._Tosca_capabilities_ha, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_ha__OclElement = new ExecutorFragment(Types._Tosca_capabilities_ha, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_ha__Tosca_capabilities_ha = new ExecutorFragment(Types._Tosca_capabilities_ha, ExtendedtoscaTables.Types._Tosca_capabilities_ha);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_ha__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_ha, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_indigo_endpoint__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_indigo_endpoint, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_indigo_endpoint__OclAny = new ExecutorFragment(Types._Tosca_capabilities_indigo_endpoint, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_indigo_endpoint__OclElement = new ExecutorFragment(Types._Tosca_capabilities_indigo_endpoint, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_indigo_endpoint__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_capabilities_indigo_endpoint, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_indigo_endpoint__Tosca_capabilities_indigo_endpoint = new ExecutorFragment(Types._Tosca_capabilities_indigo_endpoint, ExtendedtoscaTables.Types._Tosca_capabilities_indigo_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_indigo_endpoint__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_indigo_endpoint, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_nodejsappcontainer__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_nodejsappcontainer, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_nodejsappcontainer__OclAny = new ExecutorFragment(Types._Tosca_capabilities_nodejsappcontainer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_nodejsappcontainer__OclElement = new ExecutorFragment(Types._Tosca_capabilities_nodejsappcontainer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_capabilities_nodejsappcontainer, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_nodejsappcontainer = new ExecutorFragment(Types._Tosca_capabilities_nodejsappcontainer, ExtendedtoscaTables.Types._Tosca_capabilities_nodejsappcontainer);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_nodejsappcontainer, ToscaTables.Types._Tosca_capabilities_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somecap__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_somecap, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somecap__OclAny = new ExecutorFragment(Types._Tosca_capabilities_somecap, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somecap__OclElement = new ExecutorFragment(Types._Tosca_capabilities_somecap, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somecap__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_somecap, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somecap__Tosca_capabilities_somecap = new ExecutorFragment(Types._Tosca_capabilities_somecap, ExtendedtoscaTables.Types._Tosca_capabilities_somecap);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somechildcap__MixinBase = new ExecutorFragment(Types._Tosca_capabilities_somechildcap, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somechildcap__OclAny = new ExecutorFragment(Types._Tosca_capabilities_somechildcap, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somechildcap__OclElement = new ExecutorFragment(Types._Tosca_capabilities_somechildcap, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somechildcap__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_capabilities_somechildcap, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somechildcap__Tosca_capabilities_somecap = new ExecutorFragment(Types._Tosca_capabilities_somechildcap, ExtendedtoscaTables.Types._Tosca_capabilities_somecap);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_capabilities_somechildcap__Tosca_capabilities_somechildcap = new ExecutorFragment(Types._Tosca_capabilities_somechildcap, ExtendedtoscaTables.Types._Tosca_capabilities_somechildcap);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__Database = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, PlatformTables.Types._Database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__MixinBase = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__OclAny = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__OclElement = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__Tosca_nodes_abstractmongod = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, ExtendedtoscaTables.Types._Tosca_nodes_abstractmongod);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__Tosca_nodes_dbms = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, ToscaTables.Types._Tosca_nodes_dbms);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmongod__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_abstractmongod, ToscaTables.Types._Tosca_nodes_softwarecomponent);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__MixinBase = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__OclAny = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__OclElement = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint_database = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, ToscaTables.Types._Tosca_capabilities_endpoint_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__Tosca_nodes_abstractmysql = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, ExtendedtoscaTables.Types._Tosca_nodes_abstractmysql);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__Tosca_nodes_database = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, ToscaTables.Types._Tosca_nodes_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_abstractmysql__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_abstractmysql, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__MixinBase = new ExecutorFragment(Types._Tosca_nodes_apache, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__OclAny = new ExecutorFragment(Types._Tosca_nodes_apache, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__OclElement = new ExecutorFragment(Types._Tosca_nodes_apache, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_apache, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_apache, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__Tosca_capabilities_endpoint_admin = new ExecutorFragment(Types._Tosca_nodes_apache, ToscaTables.Types._Tosca_capabilities_endpoint_admin);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_apache, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_apache, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__Tosca_nodes_apache = new ExecutorFragment(Types._Tosca_nodes_apache, ExtendedtoscaTables.Types._Tosca_nodes_apache);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_apache, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_apache, ToscaTables.Types._Tosca_nodes_softwarecomponent);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_apache__Tosca_nodes_webserver = new ExecutorFragment(Types._Tosca_nodes_apache, ToscaTables.Types._Tosca_nodes_webserver);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__MixinBase = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__OclAny = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__OclElement = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint_admin = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_capabilities_endpoint_admin);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_capabilities_network_bindable = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_capabilities_network_bindable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_capabilities_operatingsystem = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_capabilities_operatingsystem);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_capabilities_scalable = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_capabilities_scalable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_nodes_compute = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_nodes_compute);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_nodes_computewithattrlist = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ExtendedtoscaTables.Types._Tosca_nodes_computewithattrlist);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithattrlist__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_computewithattrlist, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__MixinBase = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__OclAny = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__OclElement = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint_admin = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_capabilities_endpoint_admin);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_indigo_endpoint = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ExtendedtoscaTables.Types._Tosca_capabilities_indigo_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_network_bindable = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_capabilities_network_bindable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_operatingsystem = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_capabilities_operatingsystem);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_scalable = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_capabilities_scalable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_nodes_compute = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_nodes_compute);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_nodes_computewithcapwithattr = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ExtendedtoscaTables.Types._Tosca_nodes_computewithcapwithattr);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithcapwithattr__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_computewithcapwithattr, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__MixinBase = new ExecutorFragment(Types._Tosca_nodes_computewithprop, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__OclAny = new ExecutorFragment(Types._Tosca_nodes_computewithprop, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__OclElement = new ExecutorFragment(Types._Tosca_nodes_computewithprop, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_capabilities_endpoint_admin = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_capabilities_endpoint_admin);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_capabilities_network_bindable = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_capabilities_network_bindable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_capabilities_operatingsystem = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_capabilities_operatingsystem);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_capabilities_scalable = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_capabilities_scalable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_nodes_compute = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_nodes_compute);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_nodes_computewithprop = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ExtendedtoscaTables.Types._Tosca_nodes_computewithprop);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_computewithprop__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_computewithprop, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application_docker__MixinBase = new ExecutorFragment(Types._Tosca_nodes_container_application_docker, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application_docker__OclAny = new ExecutorFragment(Types._Tosca_nodes_container_application_docker, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application_docker__OclElement = new ExecutorFragment(Types._Tosca_nodes_container_application_docker, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application_docker__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_container_application_docker, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application_docker__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_container_application_docker, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application_docker__Tosca_nodes_container_application = new ExecutorFragment(Types._Tosca_nodes_container_application_docker, ToscaTables.Types._Tosca_nodes_container_application);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application_docker__Tosca_nodes_container_application_docker = new ExecutorFragment(Types._Tosca_nodes_container_application_docker, ExtendedtoscaTables.Types._Tosca_nodes_container_application_docker);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_container_application_docker__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_container_application_docker, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__MixinBase = new ExecutorFragment(Types._Tosca_nodes_database_mysql, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__OclAny = new ExecutorFragment(Types._Tosca_nodes_database_mysql, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__OclElement = new ExecutorFragment(Types._Tosca_nodes_database_mysql, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_database_mysql, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__Tosca_capabilities_endpoint_database = new ExecutorFragment(Types._Tosca_nodes_database_mysql, ToscaTables.Types._Tosca_capabilities_endpoint_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_database_mysql, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_database_mysql, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__Tosca_nodes_database = new ExecutorFragment(Types._Tosca_nodes_database_mysql, ToscaTables.Types._Tosca_nodes_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__Tosca_nodes_database_mysql = new ExecutorFragment(Types._Tosca_nodes_database_mysql, ExtendedtoscaTables.Types._Tosca_nodes_database_mysql);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_database_mysql__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_database_mysql, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__MixinBase = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__OclAny = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__OclElement = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint_database = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, ToscaTables.Types._Tosca_capabilities_endpoint_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__Tosca_nodes_database = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, ToscaTables.Types._Tosca_nodes_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__Tosca_nodes_databasewithlistparam = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, ExtendedtoscaTables.Types._Tosca_nodes_databasewithlistparam);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_databasewithlistparam__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_databasewithlistparam, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__Database = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, PlatformTables.Types._Database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__MixinBase = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__OclAny = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__OclElement = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__Tosca_nodes_dbms = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, ToscaTables.Types._Tosca_nodes_dbms);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__Tosca_nodes_dbms_mysql = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, ExtendedtoscaTables.Types._Tosca_nodes_dbms_mysql);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_dbms_mysql__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_dbms_mysql, ToscaTables.Types._Tosca_nodes_softwarecomponent);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__MixinBase = new ExecutorFragment(Types._Tosca_nodes_hacompute, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__OclAny = new ExecutorFragment(Types._Tosca_nodes_hacompute, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__OclElement = new ExecutorFragment(Types._Tosca_nodes_hacompute, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_capabilities_endpoint_admin = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_capabilities_endpoint_admin);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_capabilities_ha = new ExecutorFragment(Types._Tosca_nodes_hacompute, ExtendedtoscaTables.Types._Tosca_capabilities_ha);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_capabilities_network_bindable = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_capabilities_network_bindable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_capabilities_operatingsystem = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_capabilities_operatingsystem);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_capabilities_scalable = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_capabilities_scalable);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_nodes_compute = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_nodes_compute);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_nodes_hacompute = new ExecutorFragment(Types._Tosca_nodes_hacompute, ExtendedtoscaTables.Types._Tosca_nodes_hacompute);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_hacompute__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_hacompute, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__Database = new ExecutorFragment(Types._Tosca_nodes_mongod, PlatformTables.Types._Database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__MixinBase = new ExecutorFragment(Types._Tosca_nodes_mongod, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__OclAny = new ExecutorFragment(Types._Tosca_nodes_mongod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__OclElement = new ExecutorFragment(Types._Tosca_nodes_mongod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_mongod, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_mongod, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_mongod, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__Tosca_nodes_abstractmongod = new ExecutorFragment(Types._Tosca_nodes_mongod, ExtendedtoscaTables.Types._Tosca_nodes_abstractmongod);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__Tosca_nodes_dbms = new ExecutorFragment(Types._Tosca_nodes_mongod, ToscaTables.Types._Tosca_nodes_dbms);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__Tosca_nodes_mongod = new ExecutorFragment(Types._Tosca_nodes_mongod, ExtendedtoscaTables.Types._Tosca_nodes_mongod);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_mongod, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mongod__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_mongod, ToscaTables.Types._Tosca_nodes_softwarecomponent);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__MixinBase = new ExecutorFragment(Types._Tosca_nodes_mysql, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__OclAny = new ExecutorFragment(Types._Tosca_nodes_mysql, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__OclElement = new ExecutorFragment(Types._Tosca_nodes_mysql, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_mysql, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__Tosca_capabilities_endpoint_database = new ExecutorFragment(Types._Tosca_nodes_mysql, ToscaTables.Types._Tosca_capabilities_endpoint_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_mysql, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_mysql, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__Tosca_nodes_abstractmysql = new ExecutorFragment(Types._Tosca_nodes_mysql, ExtendedtoscaTables.Types._Tosca_nodes_abstractmysql);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__Tosca_nodes_database = new ExecutorFragment(Types._Tosca_nodes_mysql, ToscaTables.Types._Tosca_nodes_database);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__Tosca_nodes_mysql = new ExecutorFragment(Types._Tosca_nodes_mysql, ExtendedtoscaTables.Types._Tosca_nodes_mysql);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_mysql__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_mysql, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_network__MixinBase = new ExecutorFragment(Types._Tosca_nodes_network_network, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_network__OclAny = new ExecutorFragment(Types._Tosca_nodes_network_network, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_network__OclElement = new ExecutorFragment(Types._Tosca_nodes_network_network, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_network__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_network_network, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_network__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_network_network, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_network__Tosca_nodes_network_network = new ExecutorFragment(Types._Tosca_nodes_network_network, ExtendedtoscaTables.Types._Tosca_nodes_network_network);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_network__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_network_network, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_port__MixinBase = new ExecutorFragment(Types._Tosca_nodes_network_port, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_port__OclAny = new ExecutorFragment(Types._Tosca_nodes_network_port, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_port__OclElement = new ExecutorFragment(Types._Tosca_nodes_network_port, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_port__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_network_port, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_port__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_network_port, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_port__Tosca_nodes_network_port = new ExecutorFragment(Types._Tosca_nodes_network_port, ExtendedtoscaTables.Types._Tosca_nodes_network_port);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_network_port__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_network_port, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodecellar__MixinBase = new ExecutorFragment(Types._Tosca_nodes_nodecellar, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodecellar__OclAny = new ExecutorFragment(Types._Tosca_nodes_nodecellar, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodecellar__OclElement = new ExecutorFragment(Types._Tosca_nodes_nodecellar, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodecellar__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_nodecellar, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodecellar__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_nodecellar, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodecellar__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_nodecellar, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodecellar__Tosca_nodes_nodecellar = new ExecutorFragment(Types._Tosca_nodes_nodecellar, ExtendedtoscaTables.Types._Tosca_nodes_nodecellar);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodecellar__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_nodecellar, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodecellar__Tosca_nodes_webapplication = new ExecutorFragment(Types._Tosca_nodes_nodecellar, ToscaTables.Types._Tosca_nodes_webapplication);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__MixinBase = new ExecutorFragment(Types._Tosca_nodes_nodejs, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__OclAny = new ExecutorFragment(Types._Tosca_nodes_nodejs, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__OclElement = new ExecutorFragment(Types._Tosca_nodes_nodejs, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_nodejs, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_nodejs, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_capabilities_endpoint_admin = new ExecutorFragment(Types._Tosca_nodes_nodejs, ToscaTables.Types._Tosca_capabilities_endpoint_admin);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_nodejs, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_capabilities_nodejsappcontainer = new ExecutorFragment(Types._Tosca_nodes_nodejs, ExtendedtoscaTables.Types._Tosca_capabilities_nodejsappcontainer);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_nodejs, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_nodes_nodejs = new ExecutorFragment(Types._Tosca_nodes_nodejs, ExtendedtoscaTables.Types._Tosca_nodes_nodejs);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_nodejs, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_nodejs, ToscaTables.Types._Tosca_nodes_softwarecomponent);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodejs__Tosca_nodes_webserver = new ExecutorFragment(Types._Tosca_nodes_nodejs, ToscaTables.Types._Tosca_nodes_webserver);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithcap__MixinBase = new ExecutorFragment(Types._Tosca_nodes_nodewithcap, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithcap__OclAny = new ExecutorFragment(Types._Tosca_nodes_nodewithcap, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithcap__OclElement = new ExecutorFragment(Types._Tosca_nodes_nodewithcap, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithcap__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_nodewithcap, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithcap__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_nodewithcap, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithcap__Tosca_capabilities_somecap = new ExecutorFragment(Types._Tosca_nodes_nodewithcap, ExtendedtoscaTables.Types._Tosca_capabilities_somecap);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithcap__Tosca_nodes_nodewithcap = new ExecutorFragment(Types._Tosca_nodes_nodewithcap, ExtendedtoscaTables.Types._Tosca_nodes_nodewithcap);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithcap__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_nodewithcap, ToscaTables.Types._Tosca_nodes_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithreq__MixinBase = new ExecutorFragment(Types._Tosca_nodes_nodewithreq, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithreq__OclAny = new ExecutorFragment(Types._Tosca_nodes_nodewithreq, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithreq__OclElement = new ExecutorFragment(Types._Tosca_nodes_nodewithreq, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithreq__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_nodewithreq, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithreq__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_nodewithreq, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithreq__Tosca_nodes_nodewithreq = new ExecutorFragment(Types._Tosca_nodes_nodewithreq, ExtendedtoscaTables.Types._Tosca_nodes_nodewithreq);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithreq__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_nodewithreq, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_nodewithreq__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_nodewithreq, ToscaTables.Types._Tosca_nodes_softwarecomponent);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_php__MixinBase = new ExecutorFragment(Types._Tosca_nodes_php, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_php__OclAny = new ExecutorFragment(Types._Tosca_nodes_php, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_php__OclElement = new ExecutorFragment(Types._Tosca_nodes_php, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_php__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_php, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_php__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_php, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_php__Tosca_nodes_php = new ExecutorFragment(Types._Tosca_nodes_php, ExtendedtoscaTables.Types._Tosca_nodes_php);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_php__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_php, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_php__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_php, ToscaTables.Types._Tosca_nodes_softwarecomponent);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_collectd__MixinBase = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_collectd, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_collectd__OclAny = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_collectd, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_collectd__OclElement = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_collectd, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_collectd, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_collectd, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_collectd, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_collectd, ToscaTables.Types._Tosca_nodes_softwarecomponent);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent_collectd = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_collectd, ExtendedtoscaTables.Types._Tosca_nodes_softwarecomponent_collectd);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_elasticsearch__MixinBase = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_elasticsearch, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_elasticsearch__OclAny = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_elasticsearch, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_elasticsearch__OclElement = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_elasticsearch, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_elasticsearch, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_elasticsearch, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_elasticsearch, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_elasticsearch, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_elasticsearch, ToscaTables.Types._Tosca_nodes_softwarecomponent);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent_elasticsearch = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_elasticsearch, ExtendedtoscaTables.Types._Tosca_nodes_softwarecomponent_elasticsearch);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_kibana__MixinBase = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_kibana, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_kibana__OclAny = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_kibana, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_kibana__OclElement = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_kibana, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_kibana, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_kibana, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_kibana, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_kibana, ToscaTables.Types._Tosca_nodes_softwarecomponent);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent_kibana = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_kibana, ExtendedtoscaTables.Types._Tosca_nodes_softwarecomponent_kibana);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_logstash__MixinBase = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_logstash, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_logstash__OclAny = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_logstash, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_logstash__OclElement = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_logstash, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_logstash, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_logstash, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_logstash, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_logstash, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_logstash, ToscaTables.Types._Tosca_nodes_softwarecomponent);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent_logstash = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_logstash, ExtendedtoscaTables.Types._Tosca_nodes_softwarecomponent_logstash);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_rsyslog__MixinBase = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_rsyslog, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_rsyslog__OclAny = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_rsyslog, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_rsyslog__OclElement = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_rsyslog, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_rsyslog, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_rsyslog, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_rsyslog, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_rsyslog, ToscaTables.Types._Tosca_nodes_softwarecomponent);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent_rsyslog = new ExecutorFragment(Types._Tosca_nodes_softwarecomponent_rsyslog, ExtendedtoscaTables.Types._Tosca_nodes_softwarecomponent_rsyslog);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode__MixinBase = new ExecutorFragment(Types._Tosca_nodes_somenode, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode__OclAny = new ExecutorFragment(Types._Tosca_nodes_somenode, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode__OclElement = new ExecutorFragment(Types._Tosca_nodes_somenode, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_somenode, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_somenode, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode__Tosca_capabilities_somecap = new ExecutorFragment(Types._Tosca_nodes_somenode, ExtendedtoscaTables.Types._Tosca_capabilities_somecap);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode__Tosca_capabilities_somechildcap = new ExecutorFragment(Types._Tosca_nodes_somenode, ExtendedtoscaTables.Types._Tosca_capabilities_somechildcap);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_somenode, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode__Tosca_nodes_somenode = new ExecutorFragment(Types._Tosca_nodes_somenode, ExtendedtoscaTables.Types._Tosca_nodes_somenode);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode2__MixinBase = new ExecutorFragment(Types._Tosca_nodes_somenode2, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode2__OclAny = new ExecutorFragment(Types._Tosca_nodes_somenode2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode2__OclElement = new ExecutorFragment(Types._Tosca_nodes_somenode2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode2__Tosca_capabilities_container = new ExecutorFragment(Types._Tosca_nodes_somenode2, ToscaTables.Types._Tosca_capabilities_container);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode2__Tosca_capabilities_containerchild = new ExecutorFragment(Types._Tosca_nodes_somenode2, ExtendedtoscaTables.Types._Tosca_capabilities_containerchild);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode2__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_somenode2, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode2__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_somenode2, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode2__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_somenode2, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_somenode2__Tosca_nodes_somenode2 = new ExecutorFragment(Types._Tosca_nodes_somenode2, ExtendedtoscaTables.Types._Tosca_nodes_somenode2);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication_paypalpizzastore__MixinBase = new ExecutorFragment(Types._Tosca_nodes_webapplication_paypalpizzastore, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication_paypalpizzastore__OclAny = new ExecutorFragment(Types._Tosca_nodes_webapplication_paypalpizzastore, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication_paypalpizzastore__OclElement = new ExecutorFragment(Types._Tosca_nodes_webapplication_paypalpizzastore, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_webapplication_paypalpizzastore, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_webapplication_paypalpizzastore, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_webapplication_paypalpizzastore, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_webapplication_paypalpizzastore, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication = new ExecutorFragment(Types._Tosca_nodes_webapplication_paypalpizzastore, ToscaTables.Types._Tosca_nodes_webapplication);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication_paypalpizzastore = new ExecutorFragment(Types._Tosca_nodes_webapplication_paypalpizzastore, ExtendedtoscaTables.Types._Tosca_nodes_webapplication_paypalpizzastore);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_wordpress__MixinBase = new ExecutorFragment(Types._Tosca_nodes_wordpress, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_wordpress__OclAny = new ExecutorFragment(Types._Tosca_nodes_wordpress, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_wordpress__OclElement = new ExecutorFragment(Types._Tosca_nodes_wordpress, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_wordpress__Tosca_capabilities_endpoint = new ExecutorFragment(Types._Tosca_nodes_wordpress, ToscaTables.Types._Tosca_capabilities_endpoint);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_wordpress__Tosca_capabilities_node = new ExecutorFragment(Types._Tosca_nodes_wordpress, ToscaTables.Types._Tosca_capabilities_node);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_wordpress__Tosca_capabilities_root = new ExecutorFragment(Types._Tosca_nodes_wordpress, ToscaTables.Types._Tosca_capabilities_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_wordpress__Tosca_nodes_root = new ExecutorFragment(Types._Tosca_nodes_wordpress, ToscaTables.Types._Tosca_nodes_root);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_wordpress__Tosca_nodes_webapplication = new ExecutorFragment(Types._Tosca_nodes_wordpress, ToscaTables.Types._Tosca_nodes_webapplication);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_nodes_wordpress__Tosca_nodes_wordpress = new ExecutorFragment(Types._Tosca_nodes_wordpress, ExtendedtoscaTables.Types._Tosca_nodes_wordpress);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_ha__Dependency = new ExecutorFragment(Types._Tosca_relationships_ha, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_ha__Executiondependency = new ExecutorFragment(Types._Tosca_relationships_ha, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_ha__Installationdependency = new ExecutorFragment(Types._Tosca_relationships_ha, ModmacaoTables.Types._Installationdependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_ha__MixinBase = new ExecutorFragment(Types._Tosca_relationships_ha, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_ha__OclAny = new ExecutorFragment(Types._Tosca_relationships_ha, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_ha__OclElement = new ExecutorFragment(Types._Tosca_relationships_ha, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_ha__Tosca_relationships_ha = new ExecutorFragment(Types._Tosca_relationships_ha, ExtendedtoscaTables.Types._Tosca_relationships_ha);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_ha__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_ha, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_bindsto__Dependency = new ExecutorFragment(Types._Tosca_relationships_network_bindsto, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_bindsto__Executiondependency = new ExecutorFragment(Types._Tosca_relationships_network_bindsto, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_bindsto__Installationdependency = new ExecutorFragment(Types._Tosca_relationships_network_bindsto, ModmacaoTables.Types._Installationdependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_bindsto__MixinBase = new ExecutorFragment(Types._Tosca_relationships_network_bindsto, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_bindsto__OclAny = new ExecutorFragment(Types._Tosca_relationships_network_bindsto, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_bindsto__OclElement = new ExecutorFragment(Types._Tosca_relationships_network_bindsto, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_bindsto__Tosca_relationships_dependson = new ExecutorFragment(Types._Tosca_relationships_network_bindsto, ToscaTables.Types._Tosca_relationships_dependson);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_bindsto__Tosca_relationships_network_bindsto = new ExecutorFragment(Types._Tosca_relationships_network_bindsto, ExtendedtoscaTables.Types._Tosca_relationships_network_bindsto);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_bindsto__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_network_bindsto, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_linksto__Dependency = new ExecutorFragment(Types._Tosca_relationships_network_linksto, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_linksto__Executiondependency = new ExecutorFragment(Types._Tosca_relationships_network_linksto, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_linksto__Installationdependency = new ExecutorFragment(Types._Tosca_relationships_network_linksto, ModmacaoTables.Types._Installationdependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_linksto__MixinBase = new ExecutorFragment(Types._Tosca_relationships_network_linksto, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_linksto__OclAny = new ExecutorFragment(Types._Tosca_relationships_network_linksto, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_linksto__OclElement = new ExecutorFragment(Types._Tosca_relationships_network_linksto, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_linksto__Tosca_relationships_dependson = new ExecutorFragment(Types._Tosca_relationships_network_linksto, ToscaTables.Types._Tosca_relationships_dependson);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_linksto__Tosca_relationships_network_linksto = new ExecutorFragment(Types._Tosca_relationships_network_linksto, ExtendedtoscaTables.Types._Tosca_relationships_network_linksto);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_network_linksto__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_network_linksto, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodecellarhostedonnodejs__Dependency = new ExecutorFragment(Types._Tosca_relationships_nodecellarhostedonnodejs, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodecellarhostedonnodejs__Executiondependency = new ExecutorFragment(Types._Tosca_relationships_nodecellarhostedonnodejs, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodecellarhostedonnodejs__Installationdependency = new ExecutorFragment(Types._Tosca_relationships_nodecellarhostedonnodejs, ModmacaoTables.Types._Installationdependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodecellarhostedonnodejs__MixinBase = new ExecutorFragment(Types._Tosca_relationships_nodecellarhostedonnodejs, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodecellarhostedonnodejs__OclAny = new ExecutorFragment(Types._Tosca_relationships_nodecellarhostedonnodejs, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodecellarhostedonnodejs__OclElement = new ExecutorFragment(Types._Tosca_relationships_nodecellarhostedonnodejs, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_hostedon = new ExecutorFragment(Types._Tosca_relationships_nodecellarhostedonnodejs, ToscaTables.Types._Tosca_relationships_hostedon);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_nodecellarhostedonnodejs = new ExecutorFragment(Types._Tosca_relationships_nodecellarhostedonnodejs, ExtendedtoscaTables.Types._Tosca_relationships_nodecellarhostedonnodejs);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_nodecellarhostedonnodejs, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodejsconnecttomongo__Dependency = new ExecutorFragment(Types._Tosca_relationships_nodejsconnecttomongo, ModmacaoTables.Types._Dependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodejsconnecttomongo__Executiondependency = new ExecutorFragment(Types._Tosca_relationships_nodejsconnecttomongo, ModmacaoTables.Types._Executiondependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodejsconnecttomongo__Installationdependency = new ExecutorFragment(Types._Tosca_relationships_nodejsconnecttomongo, ModmacaoTables.Types._Installationdependency);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodejsconnecttomongo__MixinBase = new ExecutorFragment(Types._Tosca_relationships_nodejsconnecttomongo, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodejsconnecttomongo__OclAny = new ExecutorFragment(Types._Tosca_relationships_nodejsconnecttomongo, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodejsconnecttomongo__OclElement = new ExecutorFragment(Types._Tosca_relationships_nodejsconnecttomongo, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_connectsto = new ExecutorFragment(Types._Tosca_relationships_nodejsconnecttomongo, ToscaTables.Types._Tosca_relationships_connectsto);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_nodejsconnecttomongo = new ExecutorFragment(Types._Tosca_relationships_nodejsconnecttomongo, ExtendedtoscaTables.Types._Tosca_relationships_nodejsconnecttomongo);
		private static final /*@NonNull*/ ExecutorFragment _Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_root = new ExecutorFragment(Types._Tosca_relationships_nodejsconnecttomongo, ToscaTables.Types._Tosca_relationships_root);

		private static final /*@NonNull*/ ExecutorFragment _arrayCredential__OclAny = new ExecutorFragment(Types._arrayCredential, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayCredential__OclElement = new ExecutorFragment(Types._arrayCredential, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayCredential__arrayCredential = new ExecutorFragment(Types._arrayCredential, ExtendedtoscaTables.Types._arrayCredential);

		private static final /*@NonNull*/ ExecutorFragment _arrayPortSpec__OclAny = new ExecutorFragment(Types._arrayPortSpec, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayPortSpec__OclElement = new ExecutorFragment(Types._arrayPortSpec, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayPortSpec__arrayPortSpec = new ExecutorFragment(Types._arrayPortSpec, ExtendedtoscaTables.Types._arrayPortSpec);

		private static final /*@NonNull*/ ExecutorFragment _arrayinteger__OclAny = new ExecutorFragment(Types._arrayinteger, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayinteger__OclElement = new ExecutorFragment(Types._arrayinteger, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayinteger__arrayinteger = new ExecutorFragment(Types._arrayinteger, ExtendedtoscaTables.Types._arrayinteger);

		private static final /*@NonNull*/ ExecutorFragment _arrayversion__OclAny = new ExecutorFragment(Types._arrayversion, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _arrayversion__OclElement = new ExecutorFragment(Types._arrayversion, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _arrayversion__arrayversion = new ExecutorFragment(Types._arrayversion, ExtendedtoscaTables.Types._arrayversion);

		private static final /*@NonNull*/ ExecutorFragment _ip_versionEnum__OclAny = new ExecutorFragment(Types._ip_versionEnum, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ip_versionEnum__OclElement = new ExecutorFragment(Types._ip_versionEnum, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ip_versionEnum__OclEnumeration = new ExecutorFragment(Types._ip_versionEnum, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ip_versionEnum__OclType = new ExecutorFragment(Types._ip_versionEnum, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _ip_versionEnum__ip_versionEnum = new ExecutorFragment(Types._ip_versionEnum, ExtendedtoscaTables.Types._ip_versionEnum);

		private static final /*@NonNull*/ ExecutorFragment _storage_pathEnum__OclAny = new ExecutorFragment(Types._storage_pathEnum, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _storage_pathEnum__OclElement = new ExecutorFragment(Types._storage_pathEnum, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _storage_pathEnum__OclEnumeration = new ExecutorFragment(Types._storage_pathEnum, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _storage_pathEnum__OclType = new ExecutorFragment(Types._storage_pathEnum, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _storage_pathEnum__storage_pathEnum = new ExecutorFragment(Types._storage_pathEnum, ExtendedtoscaTables.Types._storage_pathEnum);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ExtendedtoscaTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ExtendedtoscaTables::Parameters and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ExtendedtoscaTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Example_transactionsubsystem__mqServiceIp = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.EXAMPLE_TRANSACTIONSUBSYSTEM__MQ_SERVICE_IP, Types._Example_transactionsubsystem, 0);
		public static final /*@NonNull*/ ExecutorProperty _Example_transactionsubsystem__receiverPort = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.EXAMPLE_TRANSACTIONSUBSYSTEM__RECEIVER_PORT, Types._Example_transactionsubsystem, 1);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_container_docker__exposePorts = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS, Types._Tosca_capabilities_container_docker, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_container_docker__publishAll = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL, Types._Tosca_capabilities_container_docker, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_container_docker__publishPorts = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS, Types._Tosca_capabilities_container_docker, 2);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_container_docker__version = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION, Types._Tosca_capabilities_container_docker, 3);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_container_docker__volumes = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES, Types._Tosca_capabilities_container_docker, 4);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_capabilities_indigo_endpoint__credential = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_INDIGO_ENDPOINT__CREDENTIAL, Types._Tosca_capabilities_indigo_endpoint, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_apache__documentRoot = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_APACHE__DOCUMENT_ROOT, Types._Tosca_nodes_apache, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_computewithattrlist__attrList = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST, Types._Tosca_nodes_computewithattrlist, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_computewithprop__test = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_COMPUTEWITHPROP__TEST, Types._Tosca_nodes_computewithprop, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_databasewithlistparam__listProp = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP, Types._Tosca_nodes_databasewithlistparam, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_mysql__bindAddress = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL__BIND_ADDRESS, Types._Tosca_nodes_mysql, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_mysql__dbPassword = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL__DB_PASSWORD, Types._Tosca_nodes_mysql, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_mysql__dbUser = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL__DB_USER, Types._Tosca_nodes_mysql, 2);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_mysql__storagePath = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL__STORAGE_PATH, Types._Tosca_nodes_mysql, 3);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__cidr = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__CIDR, Types._Tosca_nodes_network_network, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__endIp = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__END_IP, Types._Tosca_nodes_network_network, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__gatewayIp = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP, Types._Tosca_nodes_network_network, 2);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__ipVersion = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__IP_VERSION, Types._Tosca_nodes_network_network, 3);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__networkId = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID, Types._Tosca_nodes_network_network, 4);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__networkName = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME, Types._Tosca_nodes_network_network, 5);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__networkType = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE, Types._Tosca_nodes_network_network, 6);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__physicalNetwork = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK, Types._Tosca_nodes_network_network, 7);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__segmentationId = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID, Types._Tosca_nodes_network_network, 8);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_network__startIp = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_NETWORK__START_IP, Types._Tosca_nodes_network_network, 9);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_port__ipAddress = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__IP_ADDRESS, Types._Tosca_nodes_network_port, 0);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_port__ipRangeEnd = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__IP_RANGE_END, Types._Tosca_nodes_network_port, 1);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_port__ipRangeStart = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__IP_RANGE_START, Types._Tosca_nodes_network_port, 2);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_port__isDefault = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__IS_DEFAULT, Types._Tosca_nodes_network_port, 3);
		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_network_port__order = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_NETWORK_PORT__ORDER, Types._Tosca_nodes_network_port, 4);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_webapplication_paypalpizzastore__githubUrl = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL, Types._Tosca_nodes_webapplication_paypalpizzastore, 0);

		public static final /*@NonNull*/ ExecutorProperty _Tosca_nodes_wordpress__zipUrl = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_WORDPRESS__ZIP_URL, Types._Tosca_nodes_wordpress, 0);

		public static final /*@NonNull*/ ExecutorProperty _arrayCredential__arraycredentialValues = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES, Types._arrayCredential, 0);
		public static final /*@NonNull*/ ExecutorProperty _arrayCredential__Tosca_capabilities_indigo_endpoint__credential = new ExecutorPropertyWithImplementation("Tosca_capabilities_indigo_endpoint", Types._arrayCredential, 1, new EcoreLibraryOppositeProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_INDIGO_ENDPOINT__CREDENTIAL));

		public static final /*@NonNull*/ ExecutorProperty _arrayPortSpec__arrayportspecValues = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.ARRAY_PORT_SPEC__ARRAYPORTSPEC_VALUES, Types._arrayPortSpec, 0);
		public static final /*@NonNull*/ ExecutorProperty _arrayPortSpec__Tosca_capabilities_container_docker__exposePorts = new ExecutorPropertyWithImplementation("Tosca_capabilities_container_docker", Types._arrayPortSpec, 1, new EcoreLibraryOppositeProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS));
		public static final /*@NonNull*/ ExecutorProperty _arrayPortSpec__Tosca_capabilities_container_docker__publishPorts = new ExecutorPropertyWithImplementation("Tosca_capabilities_container_docker", Types._arrayPortSpec, 2, new EcoreLibraryOppositeProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS));

		public static final /*@NonNull*/ ExecutorProperty _arrayinteger__values = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.ARRAYINTEGER__VALUES, Types._arrayinteger, 0);
		public static final /*@NonNull*/ ExecutorProperty _arrayinteger__Tosca_nodes_databasewithlistparam__listProp = new ExecutorPropertyWithImplementation("Tosca_nodes_databasewithlistparam", Types._arrayinteger, 1, new EcoreLibraryOppositeProperty(ExtendedtoscaPackage.Literals.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP));

		public static final /*@NonNull*/ ExecutorProperty _arrayversion__values = new EcoreExecutorProperty(ExtendedtoscaPackage.Literals.ARRAYVERSION__VALUES, Types._arrayversion, 0);
		public static final /*@NonNull*/ ExecutorProperty _arrayversion__Tosca_capabilities_container_docker__version = new ExecutorPropertyWithImplementation("Tosca_capabilities_container_docker", Types._arrayversion, 1, new EcoreLibraryOppositeProperty(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ExtendedtoscaTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Example_databasesubsystem =
			{
				Fragments._Example_databasesubsystem__OclAny /* 0 */,
				Fragments._Example_databasesubsystem__OclElement /* 1 */,
				Fragments._Example_databasesubsystem__MixinBase /* 2 */,
				Fragments._Example_databasesubsystem__Tosca_capabilities_root /* 3 */,
				Fragments._Example_databasesubsystem__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Example_databasesubsystem__Tosca_capabilities_node /* 4 */,
				Fragments._Example_databasesubsystem__Tosca_capabilities_endpoint_database /* 5 */,
				Fragments._Example_databasesubsystem__Tosca_nodes_root /* 5 */,
				Fragments._Example_databasesubsystem__Example_databasesubsystem /* 6 */
			};
		private static final int /*@NonNull*/ [] __Example_databasesubsystem = { 1,1,1,1,2,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Example_queuingsubsystem =
			{
				Fragments._Example_queuingsubsystem__OclAny /* 0 */,
				Fragments._Example_queuingsubsystem__OclElement /* 1 */,
				Fragments._Example_queuingsubsystem__MixinBase /* 2 */,
				Fragments._Example_queuingsubsystem__Tosca_capabilities_root /* 3 */,
				Fragments._Example_queuingsubsystem__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Example_queuingsubsystem__Tosca_capabilities_node /* 4 */,
				Fragments._Example_queuingsubsystem__Tosca_nodes_root /* 5 */,
				Fragments._Example_queuingsubsystem__Example_queuingsubsystem /* 6 */
			};
		private static final int /*@NonNull*/ [] __Example_queuingsubsystem = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Example_someapp =
			{
				Fragments._Example_someapp__OclAny /* 0 */,
				Fragments._Example_someapp__OclElement /* 1 */,
				Fragments._Example_someapp__MixinBase /* 2 */,
				Fragments._Example_someapp__Tosca_capabilities_root /* 3 */,
				Fragments._Example_someapp__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Example_someapp__Tosca_capabilities_node /* 4 */,
				Fragments._Example_someapp__Tosca_nodes_root /* 5 */,
				Fragments._Example_someapp__Example_someapp /* 6 */
			};
		private static final int /*@NonNull*/ [] __Example_someapp = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Example_transactionsubsystem =
			{
				Fragments._Example_transactionsubsystem__OclAny /* 0 */,
				Fragments._Example_transactionsubsystem__OclElement /* 1 */,
				Fragments._Example_transactionsubsystem__MixinBase /* 2 */,
				Fragments._Example_transactionsubsystem__Tosca_capabilities_root /* 3 */,
				Fragments._Example_transactionsubsystem__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Example_transactionsubsystem__Tosca_capabilities_node /* 4 */,
				Fragments._Example_transactionsubsystem__Tosca_nodes_root /* 5 */,
				Fragments._Example_transactionsubsystem__Example_transactionsubsystem /* 6 */
			};
		private static final int /*@NonNull*/ [] __Example_transactionsubsystem = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Myattachesto =
			{
				Fragments._Myattachesto__OclAny /* 0 */,
				Fragments._Myattachesto__OclElement /* 1 */,
				Fragments._Myattachesto__MixinBase /* 2 */,
				Fragments._Myattachesto__Dependency /* 3 */,
				Fragments._Myattachesto__Executiondependency /* 4 */,
				Fragments._Myattachesto__Installationdependency /* 4 */,
				Fragments._Myattachesto__Tosca_relationships_root /* 5 */,
				Fragments._Myattachesto__Tosca_relationships_attachesto /* 6 */,
				Fragments._Myattachesto__Myattachesto /* 7 */
			};
		private static final int /*@NonNull*/ [] __Myattachesto = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mycompany_mytypes_myscalingpolicy =
			{
				Fragments._Mycompany_mytypes_myscalingpolicy__OclAny /* 0 */,
				Fragments._Mycompany_mytypes_myscalingpolicy__OclElement /* 1 */,
				Fragments._Mycompany_mytypes_myscalingpolicy__MixinBase /* 2 */,
				Fragments._Mycompany_mytypes_myscalingpolicy__Mycompany_mytypes_myscalingpolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Mycompany_mytypes_myscalingpolicy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Rsyslog =
			{
				Fragments._Rsyslog__OclAny /* 0 */,
				Fragments._Rsyslog__OclElement /* 1 */,
				Fragments._Rsyslog__MixinBase /* 2 */,
				Fragments._Rsyslog__Tosca_capabilities_root /* 3 */,
				Fragments._Rsyslog__Tosca_capabilities_node /* 4 */,
				Fragments._Rsyslog__Tosca_nodes_root /* 5 */,
				Fragments._Rsyslog__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Rsyslog__Rsyslog /* 7 */
			};
		private static final int /*@NonNull*/ [] __Rsyslog = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Test_relation_connects =
			{
				Fragments._Test_relation_connects__OclAny /* 0 */,
				Fragments._Test_relation_connects__OclElement /* 1 */,
				Fragments._Test_relation_connects__MixinBase /* 2 */,
				Fragments._Test_relation_connects__Test_relation_connects /* 3 */
			};
		private static final int /*@NonNull*/ [] __Test_relation_connects = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_container_docker =
			{
				Fragments._Tosca_capabilities_container_docker__OclAny /* 0 */,
				Fragments._Tosca_capabilities_container_docker__OclElement /* 1 */,
				Fragments._Tosca_capabilities_container_docker__MixinBase /* 2 */,
				Fragments._Tosca_capabilities_container_docker__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_capabilities_container_docker__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_capabilities_container_docker__Tosca_capabilities_container_docker /* 5 */
			};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_container_docker = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_containerchild =
			{
				Fragments._Tosca_capabilities_containerchild__OclAny /* 0 */,
				Fragments._Tosca_capabilities_containerchild__OclElement /* 1 */,
				Fragments._Tosca_capabilities_containerchild__MixinBase /* 2 */,
				Fragments._Tosca_capabilities_containerchild__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_capabilities_containerchild__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_capabilities_containerchild__Tosca_capabilities_containerchild /* 5 */
			};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_containerchild = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_ha =
			{
				Fragments._Tosca_capabilities_ha__OclAny /* 0 */,
				Fragments._Tosca_capabilities_ha__OclElement /* 1 */,
				Fragments._Tosca_capabilities_ha__MixinBase /* 2 */,
				Fragments._Tosca_capabilities_ha__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_capabilities_ha__Tosca_capabilities_ha /* 4 */
			};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_ha = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_indigo_endpoint =
			{
				Fragments._Tosca_capabilities_indigo_endpoint__OclAny /* 0 */,
				Fragments._Tosca_capabilities_indigo_endpoint__OclElement /* 1 */,
				Fragments._Tosca_capabilities_indigo_endpoint__MixinBase /* 2 */,
				Fragments._Tosca_capabilities_indigo_endpoint__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_capabilities_indigo_endpoint__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_capabilities_indigo_endpoint__Tosca_capabilities_indigo_endpoint /* 5 */
			};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_indigo_endpoint = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_nodejsappcontainer =
			{
				Fragments._Tosca_capabilities_nodejsappcontainer__OclAny /* 0 */,
				Fragments._Tosca_capabilities_nodejsappcontainer__OclElement /* 1 */,
				Fragments._Tosca_capabilities_nodejsappcontainer__MixinBase /* 2 */,
				Fragments._Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_nodejsappcontainer /* 5 */
			};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_nodejsappcontainer = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_somecap =
			{
				Fragments._Tosca_capabilities_somecap__OclAny /* 0 */,
				Fragments._Tosca_capabilities_somecap__OclElement /* 1 */,
				Fragments._Tosca_capabilities_somecap__MixinBase /* 2 */,
				Fragments._Tosca_capabilities_somecap__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_capabilities_somecap__Tosca_capabilities_somecap /* 4 */
			};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_somecap = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_capabilities_somechildcap =
			{
				Fragments._Tosca_capabilities_somechildcap__OclAny /* 0 */,
				Fragments._Tosca_capabilities_somechildcap__OclElement /* 1 */,
				Fragments._Tosca_capabilities_somechildcap__MixinBase /* 2 */,
				Fragments._Tosca_capabilities_somechildcap__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_capabilities_somechildcap__Tosca_capabilities_somecap /* 4 */,
				Fragments._Tosca_capabilities_somechildcap__Tosca_capabilities_somechildcap /* 5 */
			};
		private static final int /*@NonNull*/ [] __Tosca_capabilities_somechildcap = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_abstractmongod =
			{
				Fragments._Tosca_nodes_abstractmongod__OclAny /* 0 */,
				Fragments._Tosca_nodes_abstractmongod__OclElement /* 1 */,
				Fragments._Tosca_nodes_abstractmongod__MixinBase /* 2 */,
				Fragments._Tosca_nodes_abstractmongod__Database /* 3 */,
				Fragments._Tosca_nodes_abstractmongod__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_abstractmongod__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_abstractmongod__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_abstractmongod__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_abstractmongod__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_abstractmongod__Tosca_nodes_dbms /* 7 */,
				Fragments._Tosca_nodes_abstractmongod__Tosca_nodes_abstractmongod /* 8 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_abstractmongod = { 1,1,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_abstractmysql =
			{
				Fragments._Tosca_nodes_abstractmysql__OclAny /* 0 */,
				Fragments._Tosca_nodes_abstractmysql__OclElement /* 1 */,
				Fragments._Tosca_nodes_abstractmysql__MixinBase /* 2 */,
				Fragments._Tosca_nodes_abstractmysql__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_abstractmysql__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint_database /* 5 */,
				Fragments._Tosca_nodes_abstractmysql__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_abstractmysql__Tosca_nodes_database /* 6 */,
				Fragments._Tosca_nodes_abstractmysql__Tosca_nodes_abstractmysql /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_abstractmysql = { 1,1,1,1,2,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_apache =
			{
				Fragments._Tosca_nodes_apache__OclAny /* 0 */,
				Fragments._Tosca_nodes_apache__OclElement /* 1 */,
				Fragments._Tosca_nodes_apache__MixinBase /* 2 */,
				Fragments._Tosca_nodes_apache__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_apache__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_apache__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_apache__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_apache__Tosca_capabilities_endpoint_admin /* 5 */,
				Fragments._Tosca_nodes_apache__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_apache__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_apache__Tosca_nodes_webserver /* 7 */,
				Fragments._Tosca_nodes_apache__Tosca_nodes_apache /* 8 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_apache = { 1,1,1,1,3,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_computewithattrlist =
			{
				Fragments._Tosca_nodes_computewithattrlist__OclAny /* 0 */,
				Fragments._Tosca_nodes_computewithattrlist__OclElement /* 1 */,
				Fragments._Tosca_nodes_computewithattrlist__MixinBase /* 2 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_operatingsystem /* 4 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_scalable /* 4 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint_admin /* 5 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_network_bindable /* 5 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_nodes_compute /* 6 */,
				Fragments._Tosca_nodes_computewithattrlist__Tosca_nodes_computewithattrlist /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_computewithattrlist = { 1,1,1,1,5,3,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr =
			{
				Fragments._Tosca_nodes_computewithcapwithattr__OclAny /* 0 */,
				Fragments._Tosca_nodes_computewithcapwithattr__OclElement /* 1 */,
				Fragments._Tosca_nodes_computewithcapwithattr__MixinBase /* 2 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_operatingsystem /* 4 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_scalable /* 4 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint_admin /* 5 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_indigo_endpoint /* 5 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_network_bindable /* 5 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_nodes_compute /* 6 */,
				Fragments._Tosca_nodes_computewithcapwithattr__Tosca_nodes_computewithcapwithattr /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_computewithcapwithattr = { 1,1,1,1,5,4,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_computewithprop =
			{
				Fragments._Tosca_nodes_computewithprop__OclAny /* 0 */,
				Fragments._Tosca_nodes_computewithprop__OclElement /* 1 */,
				Fragments._Tosca_nodes_computewithprop__MixinBase /* 2 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_operatingsystem /* 4 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_scalable /* 4 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_endpoint_admin /* 5 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_network_bindable /* 5 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_nodes_compute /* 6 */,
				Fragments._Tosca_nodes_computewithprop__Tosca_nodes_computewithprop /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_computewithprop = { 1,1,1,1,5,3,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_container_application_docker =
			{
				Fragments._Tosca_nodes_container_application_docker__OclAny /* 0 */,
				Fragments._Tosca_nodes_container_application_docker__OclElement /* 1 */,
				Fragments._Tosca_nodes_container_application_docker__MixinBase /* 2 */,
				Fragments._Tosca_nodes_container_application_docker__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_container_application_docker__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_container_application_docker__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_container_application_docker__Tosca_nodes_container_application /* 6 */,
				Fragments._Tosca_nodes_container_application_docker__Tosca_nodes_container_application_docker /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_container_application_docker = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_database_mysql =
			{
				Fragments._Tosca_nodes_database_mysql__OclAny /* 0 */,
				Fragments._Tosca_nodes_database_mysql__OclElement /* 1 */,
				Fragments._Tosca_nodes_database_mysql__MixinBase /* 2 */,
				Fragments._Tosca_nodes_database_mysql__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_database_mysql__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_database_mysql__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_database_mysql__Tosca_capabilities_endpoint_database /* 5 */,
				Fragments._Tosca_nodes_database_mysql__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_database_mysql__Tosca_nodes_database /* 6 */,
				Fragments._Tosca_nodes_database_mysql__Tosca_nodes_database_mysql /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_database_mysql = { 1,1,1,1,2,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam =
			{
				Fragments._Tosca_nodes_databasewithlistparam__OclAny /* 0 */,
				Fragments._Tosca_nodes_databasewithlistparam__OclElement /* 1 */,
				Fragments._Tosca_nodes_databasewithlistparam__MixinBase /* 2 */,
				Fragments._Tosca_nodes_databasewithlistparam__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_databasewithlistparam__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint_database /* 5 */,
				Fragments._Tosca_nodes_databasewithlistparam__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_databasewithlistparam__Tosca_nodes_database /* 6 */,
				Fragments._Tosca_nodes_databasewithlistparam__Tosca_nodes_databasewithlistparam /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_databasewithlistparam = { 1,1,1,1,2,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_dbms_mysql =
			{
				Fragments._Tosca_nodes_dbms_mysql__OclAny /* 0 */,
				Fragments._Tosca_nodes_dbms_mysql__OclElement /* 1 */,
				Fragments._Tosca_nodes_dbms_mysql__MixinBase /* 2 */,
				Fragments._Tosca_nodes_dbms_mysql__Database /* 3 */,
				Fragments._Tosca_nodes_dbms_mysql__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_dbms_mysql__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_dbms_mysql__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_dbms_mysql__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_dbms_mysql__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_dbms_mysql__Tosca_nodes_dbms /* 7 */,
				Fragments._Tosca_nodes_dbms_mysql__Tosca_nodes_dbms_mysql /* 8 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_dbms_mysql = { 1,1,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_hacompute =
			{
				Fragments._Tosca_nodes_hacompute__OclAny /* 0 */,
				Fragments._Tosca_nodes_hacompute__OclElement /* 1 */,
				Fragments._Tosca_nodes_hacompute__MixinBase /* 2 */,
				Fragments._Tosca_nodes_hacompute__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_hacompute__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_hacompute__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_hacompute__Tosca_capabilities_ha /* 4 */,
				Fragments._Tosca_nodes_hacompute__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_hacompute__Tosca_capabilities_operatingsystem /* 4 */,
				Fragments._Tosca_nodes_hacompute__Tosca_capabilities_scalable /* 4 */,
				Fragments._Tosca_nodes_hacompute__Tosca_capabilities_endpoint_admin /* 5 */,
				Fragments._Tosca_nodes_hacompute__Tosca_capabilities_network_bindable /* 5 */,
				Fragments._Tosca_nodes_hacompute__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_hacompute__Tosca_nodes_compute /* 6 */,
				Fragments._Tosca_nodes_hacompute__Tosca_nodes_hacompute /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_hacompute = { 1,1,1,1,6,3,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_mongod =
			{
				Fragments._Tosca_nodes_mongod__OclAny /* 0 */,
				Fragments._Tosca_nodes_mongod__OclElement /* 1 */,
				Fragments._Tosca_nodes_mongod__MixinBase /* 2 */,
				Fragments._Tosca_nodes_mongod__Database /* 3 */,
				Fragments._Tosca_nodes_mongod__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_mongod__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_mongod__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_mongod__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_mongod__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_mongod__Tosca_nodes_dbms /* 7 */,
				Fragments._Tosca_nodes_mongod__Tosca_nodes_abstractmongod /* 8 */,
				Fragments._Tosca_nodes_mongod__Tosca_nodes_mongod /* 9 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_mongod = { 1,1,1,2,2,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_mysql =
			{
				Fragments._Tosca_nodes_mysql__OclAny /* 0 */,
				Fragments._Tosca_nodes_mysql__OclElement /* 1 */,
				Fragments._Tosca_nodes_mysql__MixinBase /* 2 */,
				Fragments._Tosca_nodes_mysql__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_mysql__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_mysql__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_mysql__Tosca_capabilities_endpoint_database /* 5 */,
				Fragments._Tosca_nodes_mysql__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_mysql__Tosca_nodes_database /* 6 */,
				Fragments._Tosca_nodes_mysql__Tosca_nodes_abstractmysql /* 7 */,
				Fragments._Tosca_nodes_mysql__Tosca_nodes_mysql /* 8 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_mysql = { 1,1,1,1,2,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_network_network =
			{
				Fragments._Tosca_nodes_network_network__OclAny /* 0 */,
				Fragments._Tosca_nodes_network_network__OclElement /* 1 */,
				Fragments._Tosca_nodes_network_network__MixinBase /* 2 */,
				Fragments._Tosca_nodes_network_network__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_network_network__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_network_network__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_network_network__Tosca_nodes_network_network /* 6 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_network_network = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_network_port =
			{
				Fragments._Tosca_nodes_network_port__OclAny /* 0 */,
				Fragments._Tosca_nodes_network_port__OclElement /* 1 */,
				Fragments._Tosca_nodes_network_port__MixinBase /* 2 */,
				Fragments._Tosca_nodes_network_port__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_network_port__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_network_port__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_network_port__Tosca_nodes_network_port /* 6 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_network_port = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_nodecellar =
			{
				Fragments._Tosca_nodes_nodecellar__OclAny /* 0 */,
				Fragments._Tosca_nodes_nodecellar__OclElement /* 1 */,
				Fragments._Tosca_nodes_nodecellar__MixinBase /* 2 */,
				Fragments._Tosca_nodes_nodecellar__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_nodecellar__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_nodecellar__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_nodecellar__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_nodecellar__Tosca_nodes_webapplication /* 6 */,
				Fragments._Tosca_nodes_nodecellar__Tosca_nodes_nodecellar /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_nodecellar = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_nodejs =
			{
				Fragments._Tosca_nodes_nodejs__OclAny /* 0 */,
				Fragments._Tosca_nodes_nodejs__OclElement /* 1 */,
				Fragments._Tosca_nodes_nodejs__MixinBase /* 2 */,
				Fragments._Tosca_nodes_nodejs__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_nodejs__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_nodejs__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_nodejs__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_nodejs__Tosca_capabilities_endpoint_admin /* 5 */,
				Fragments._Tosca_nodes_nodejs__Tosca_capabilities_nodejsappcontainer /* 5 */,
				Fragments._Tosca_nodes_nodejs__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_nodejs__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_nodejs__Tosca_nodes_webserver /* 7 */,
				Fragments._Tosca_nodes_nodejs__Tosca_nodes_nodejs /* 8 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_nodejs = { 1,1,1,1,3,3,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_nodewithcap =
			{
				Fragments._Tosca_nodes_nodewithcap__OclAny /* 0 */,
				Fragments._Tosca_nodes_nodewithcap__OclElement /* 1 */,
				Fragments._Tosca_nodes_nodewithcap__MixinBase /* 2 */,
				Fragments._Tosca_nodes_nodewithcap__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_nodewithcap__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_nodewithcap__Tosca_capabilities_somecap /* 4 */,
				Fragments._Tosca_nodes_nodewithcap__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_nodewithcap__Tosca_nodes_nodewithcap /* 6 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_nodewithcap = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_nodewithreq =
			{
				Fragments._Tosca_nodes_nodewithreq__OclAny /* 0 */,
				Fragments._Tosca_nodes_nodewithreq__OclElement /* 1 */,
				Fragments._Tosca_nodes_nodewithreq__MixinBase /* 2 */,
				Fragments._Tosca_nodes_nodewithreq__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_nodewithreq__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_nodewithreq__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_nodewithreq__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_nodewithreq__Tosca_nodes_nodewithreq /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_nodewithreq = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_php =
			{
				Fragments._Tosca_nodes_php__OclAny /* 0 */,
				Fragments._Tosca_nodes_php__OclElement /* 1 */,
				Fragments._Tosca_nodes_php__MixinBase /* 2 */,
				Fragments._Tosca_nodes_php__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_php__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_php__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_php__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_php__Tosca_nodes_php /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_php = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd =
			{
				Fragments._Tosca_nodes_softwarecomponent_collectd__OclAny /* 0 */,
				Fragments._Tosca_nodes_softwarecomponent_collectd__OclElement /* 1 */,
				Fragments._Tosca_nodes_softwarecomponent_collectd__MixinBase /* 2 */,
				Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent_collectd /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_softwarecomponent_collectd = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch =
			{
				Fragments._Tosca_nodes_softwarecomponent_elasticsearch__OclAny /* 0 */,
				Fragments._Tosca_nodes_softwarecomponent_elasticsearch__OclElement /* 1 */,
				Fragments._Tosca_nodes_softwarecomponent_elasticsearch__MixinBase /* 2 */,
				Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent_elasticsearch /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_softwarecomponent_elasticsearch = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana =
			{
				Fragments._Tosca_nodes_softwarecomponent_kibana__OclAny /* 0 */,
				Fragments._Tosca_nodes_softwarecomponent_kibana__OclElement /* 1 */,
				Fragments._Tosca_nodes_softwarecomponent_kibana__MixinBase /* 2 */,
				Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent_kibana /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_softwarecomponent_kibana = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash =
			{
				Fragments._Tosca_nodes_softwarecomponent_logstash__OclAny /* 0 */,
				Fragments._Tosca_nodes_softwarecomponent_logstash__OclElement /* 1 */,
				Fragments._Tosca_nodes_softwarecomponent_logstash__MixinBase /* 2 */,
				Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent_logstash /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_softwarecomponent_logstash = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog =
			{
				Fragments._Tosca_nodes_softwarecomponent_rsyslog__OclAny /* 0 */,
				Fragments._Tosca_nodes_softwarecomponent_rsyslog__OclElement /* 1 */,
				Fragments._Tosca_nodes_softwarecomponent_rsyslog__MixinBase /* 2 */,
				Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent /* 6 */,
				Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent_rsyslog /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_softwarecomponent_rsyslog = { 1,1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_somenode =
			{
				Fragments._Tosca_nodes_somenode__OclAny /* 0 */,
				Fragments._Tosca_nodes_somenode__OclElement /* 1 */,
				Fragments._Tosca_nodes_somenode__MixinBase /* 2 */,
				Fragments._Tosca_nodes_somenode__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_somenode__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_somenode__Tosca_capabilities_somecap /* 4 */,
				Fragments._Tosca_nodes_somenode__Tosca_capabilities_somechildcap /* 5 */,
				Fragments._Tosca_nodes_somenode__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_somenode__Tosca_nodes_somenode /* 6 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_somenode = { 1,1,1,1,2,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_somenode2 =
			{
				Fragments._Tosca_nodes_somenode2__OclAny /* 0 */,
				Fragments._Tosca_nodes_somenode2__OclElement /* 1 */,
				Fragments._Tosca_nodes_somenode2__MixinBase /* 2 */,
				Fragments._Tosca_nodes_somenode2__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_somenode2__Tosca_capabilities_container /* 4 */,
				Fragments._Tosca_nodes_somenode2__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_somenode2__Tosca_capabilities_containerchild /* 5 */,
				Fragments._Tosca_nodes_somenode2__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_somenode2__Tosca_nodes_somenode2 /* 6 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_somenode2 = { 1,1,1,1,2,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore =
			{
				Fragments._Tosca_nodes_webapplication_paypalpizzastore__OclAny /* 0 */,
				Fragments._Tosca_nodes_webapplication_paypalpizzastore__OclElement /* 1 */,
				Fragments._Tosca_nodes_webapplication_paypalpizzastore__MixinBase /* 2 */,
				Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication /* 6 */,
				Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication_paypalpizzastore /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_webapplication_paypalpizzastore = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_nodes_wordpress =
			{
				Fragments._Tosca_nodes_wordpress__OclAny /* 0 */,
				Fragments._Tosca_nodes_wordpress__OclElement /* 1 */,
				Fragments._Tosca_nodes_wordpress__MixinBase /* 2 */,
				Fragments._Tosca_nodes_wordpress__Tosca_capabilities_root /* 3 */,
				Fragments._Tosca_nodes_wordpress__Tosca_capabilities_endpoint /* 4 */,
				Fragments._Tosca_nodes_wordpress__Tosca_capabilities_node /* 4 */,
				Fragments._Tosca_nodes_wordpress__Tosca_nodes_root /* 5 */,
				Fragments._Tosca_nodes_wordpress__Tosca_nodes_webapplication /* 6 */,
				Fragments._Tosca_nodes_wordpress__Tosca_nodes_wordpress /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_nodes_wordpress = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_ha =
			{
				Fragments._Tosca_relationships_ha__OclAny /* 0 */,
				Fragments._Tosca_relationships_ha__OclElement /* 1 */,
				Fragments._Tosca_relationships_ha__MixinBase /* 2 */,
				Fragments._Tosca_relationships_ha__Dependency /* 3 */,
				Fragments._Tosca_relationships_ha__Executiondependency /* 4 */,
				Fragments._Tosca_relationships_ha__Installationdependency /* 4 */,
				Fragments._Tosca_relationships_ha__Tosca_relationships_root /* 5 */,
				Fragments._Tosca_relationships_ha__Tosca_relationships_ha /* 6 */
			};
		private static final int /*@NonNull*/ [] __Tosca_relationships_ha = { 1,1,1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_network_bindsto =
			{
				Fragments._Tosca_relationships_network_bindsto__OclAny /* 0 */,
				Fragments._Tosca_relationships_network_bindsto__OclElement /* 1 */,
				Fragments._Tosca_relationships_network_bindsto__MixinBase /* 2 */,
				Fragments._Tosca_relationships_network_bindsto__Dependency /* 3 */,
				Fragments._Tosca_relationships_network_bindsto__Executiondependency /* 4 */,
				Fragments._Tosca_relationships_network_bindsto__Installationdependency /* 4 */,
				Fragments._Tosca_relationships_network_bindsto__Tosca_relationships_root /* 5 */,
				Fragments._Tosca_relationships_network_bindsto__Tosca_relationships_dependson /* 6 */,
				Fragments._Tosca_relationships_network_bindsto__Tosca_relationships_network_bindsto /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_relationships_network_bindsto = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_network_linksto =
			{
				Fragments._Tosca_relationships_network_linksto__OclAny /* 0 */,
				Fragments._Tosca_relationships_network_linksto__OclElement /* 1 */,
				Fragments._Tosca_relationships_network_linksto__MixinBase /* 2 */,
				Fragments._Tosca_relationships_network_linksto__Dependency /* 3 */,
				Fragments._Tosca_relationships_network_linksto__Executiondependency /* 4 */,
				Fragments._Tosca_relationships_network_linksto__Installationdependency /* 4 */,
				Fragments._Tosca_relationships_network_linksto__Tosca_relationships_root /* 5 */,
				Fragments._Tosca_relationships_network_linksto__Tosca_relationships_dependson /* 6 */,
				Fragments._Tosca_relationships_network_linksto__Tosca_relationships_network_linksto /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_relationships_network_linksto = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs =
			{
				Fragments._Tosca_relationships_nodecellarhostedonnodejs__OclAny /* 0 */,
				Fragments._Tosca_relationships_nodecellarhostedonnodejs__OclElement /* 1 */,
				Fragments._Tosca_relationships_nodecellarhostedonnodejs__MixinBase /* 2 */,
				Fragments._Tosca_relationships_nodecellarhostedonnodejs__Dependency /* 3 */,
				Fragments._Tosca_relationships_nodecellarhostedonnodejs__Executiondependency /* 4 */,
				Fragments._Tosca_relationships_nodecellarhostedonnodejs__Installationdependency /* 4 */,
				Fragments._Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_root /* 5 */,
				Fragments._Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_hostedon /* 6 */,
				Fragments._Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_nodecellarhostedonnodejs /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_relationships_nodecellarhostedonnodejs = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo =
			{
				Fragments._Tosca_relationships_nodejsconnecttomongo__OclAny /* 0 */,
				Fragments._Tosca_relationships_nodejsconnecttomongo__OclElement /* 1 */,
				Fragments._Tosca_relationships_nodejsconnecttomongo__MixinBase /* 2 */,
				Fragments._Tosca_relationships_nodejsconnecttomongo__Dependency /* 3 */,
				Fragments._Tosca_relationships_nodejsconnecttomongo__Executiondependency /* 4 */,
				Fragments._Tosca_relationships_nodejsconnecttomongo__Installationdependency /* 4 */,
				Fragments._Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_root /* 5 */,
				Fragments._Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_connectsto /* 6 */,
				Fragments._Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_nodejsconnecttomongo /* 7 */
			};
		private static final int /*@NonNull*/ [] __Tosca_relationships_nodejsconnecttomongo = { 1,1,1,1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayCredential =
			{
				Fragments._arrayCredential__OclAny /* 0 */,
				Fragments._arrayCredential__OclElement /* 1 */,
				Fragments._arrayCredential__arrayCredential /* 2 */
			};
		private static final int /*@NonNull*/ [] __arrayCredential = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayPortSpec =
			{
				Fragments._arrayPortSpec__OclAny /* 0 */,
				Fragments._arrayPortSpec__OclElement /* 1 */,
				Fragments._arrayPortSpec__arrayPortSpec /* 2 */
			};
		private static final int /*@NonNull*/ [] __arrayPortSpec = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayinteger =
			{
				Fragments._arrayinteger__OclAny /* 0 */,
				Fragments._arrayinteger__OclElement /* 1 */,
				Fragments._arrayinteger__arrayinteger /* 2 */
			};
		private static final int /*@NonNull*/ [] __arrayinteger = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _arrayversion =
			{
				Fragments._arrayversion__OclAny /* 0 */,
				Fragments._arrayversion__OclElement /* 1 */,
				Fragments._arrayversion__arrayversion /* 2 */
			};
		private static final int /*@NonNull*/ [] __arrayversion = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ip_versionEnum =
			{
				Fragments._ip_versionEnum__OclAny /* 0 */,
				Fragments._ip_versionEnum__OclElement /* 1 */,
				Fragments._ip_versionEnum__OclType /* 2 */,
				Fragments._ip_versionEnum__OclEnumeration /* 3 */,
				Fragments._ip_versionEnum__ip_versionEnum /* 4 */
			};
		private static final int /*@NonNull*/ [] __ip_versionEnum = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _storage_pathEnum =
			{
				Fragments._storage_pathEnum__OclAny /* 0 */,
				Fragments._storage_pathEnum__OclElement /* 1 */,
				Fragments._storage_pathEnum__OclType /* 2 */,
				Fragments._storage_pathEnum__OclEnumeration /* 3 */,
				Fragments._storage_pathEnum__storage_pathEnum /* 4 */
			};
		private static final int /*@NonNull*/ [] __storage_pathEnum = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Example_databasesubsystem.initFragments(_Example_databasesubsystem, __Example_databasesubsystem);
			Types._Example_queuingsubsystem.initFragments(_Example_queuingsubsystem, __Example_queuingsubsystem);
			Types._Example_someapp.initFragments(_Example_someapp, __Example_someapp);
			Types._Example_transactionsubsystem.initFragments(_Example_transactionsubsystem, __Example_transactionsubsystem);
			Types._Myattachesto.initFragments(_Myattachesto, __Myattachesto);
			Types._Mycompany_mytypes_myscalingpolicy.initFragments(_Mycompany_mytypes_myscalingpolicy, __Mycompany_mytypes_myscalingpolicy);
			Types._Rsyslog.initFragments(_Rsyslog, __Rsyslog);
			Types._Test_relation_connects.initFragments(_Test_relation_connects, __Test_relation_connects);
			Types._Tosca_capabilities_container_docker.initFragments(_Tosca_capabilities_container_docker, __Tosca_capabilities_container_docker);
			Types._Tosca_capabilities_containerchild.initFragments(_Tosca_capabilities_containerchild, __Tosca_capabilities_containerchild);
			Types._Tosca_capabilities_ha.initFragments(_Tosca_capabilities_ha, __Tosca_capabilities_ha);
			Types._Tosca_capabilities_indigo_endpoint.initFragments(_Tosca_capabilities_indigo_endpoint, __Tosca_capabilities_indigo_endpoint);
			Types._Tosca_capabilities_nodejsappcontainer.initFragments(_Tosca_capabilities_nodejsappcontainer, __Tosca_capabilities_nodejsappcontainer);
			Types._Tosca_capabilities_somecap.initFragments(_Tosca_capabilities_somecap, __Tosca_capabilities_somecap);
			Types._Tosca_capabilities_somechildcap.initFragments(_Tosca_capabilities_somechildcap, __Tosca_capabilities_somechildcap);
			Types._Tosca_nodes_abstractmongod.initFragments(_Tosca_nodes_abstractmongod, __Tosca_nodes_abstractmongod);
			Types._Tosca_nodes_abstractmysql.initFragments(_Tosca_nodes_abstractmysql, __Tosca_nodes_abstractmysql);
			Types._Tosca_nodes_apache.initFragments(_Tosca_nodes_apache, __Tosca_nodes_apache);
			Types._Tosca_nodes_computewithattrlist.initFragments(_Tosca_nodes_computewithattrlist, __Tosca_nodes_computewithattrlist);
			Types._Tosca_nodes_computewithcapwithattr.initFragments(_Tosca_nodes_computewithcapwithattr, __Tosca_nodes_computewithcapwithattr);
			Types._Tosca_nodes_computewithprop.initFragments(_Tosca_nodes_computewithprop, __Tosca_nodes_computewithprop);
			Types._Tosca_nodes_container_application_docker.initFragments(_Tosca_nodes_container_application_docker, __Tosca_nodes_container_application_docker);
			Types._Tosca_nodes_database_mysql.initFragments(_Tosca_nodes_database_mysql, __Tosca_nodes_database_mysql);
			Types._Tosca_nodes_databasewithlistparam.initFragments(_Tosca_nodes_databasewithlistparam, __Tosca_nodes_databasewithlistparam);
			Types._Tosca_nodes_dbms_mysql.initFragments(_Tosca_nodes_dbms_mysql, __Tosca_nodes_dbms_mysql);
			Types._Tosca_nodes_hacompute.initFragments(_Tosca_nodes_hacompute, __Tosca_nodes_hacompute);
			Types._Tosca_nodes_mongod.initFragments(_Tosca_nodes_mongod, __Tosca_nodes_mongod);
			Types._Tosca_nodes_mysql.initFragments(_Tosca_nodes_mysql, __Tosca_nodes_mysql);
			Types._Tosca_nodes_network_network.initFragments(_Tosca_nodes_network_network, __Tosca_nodes_network_network);
			Types._Tosca_nodes_network_port.initFragments(_Tosca_nodes_network_port, __Tosca_nodes_network_port);
			Types._Tosca_nodes_nodecellar.initFragments(_Tosca_nodes_nodecellar, __Tosca_nodes_nodecellar);
			Types._Tosca_nodes_nodejs.initFragments(_Tosca_nodes_nodejs, __Tosca_nodes_nodejs);
			Types._Tosca_nodes_nodewithcap.initFragments(_Tosca_nodes_nodewithcap, __Tosca_nodes_nodewithcap);
			Types._Tosca_nodes_nodewithreq.initFragments(_Tosca_nodes_nodewithreq, __Tosca_nodes_nodewithreq);
			Types._Tosca_nodes_php.initFragments(_Tosca_nodes_php, __Tosca_nodes_php);
			Types._Tosca_nodes_softwarecomponent_collectd.initFragments(_Tosca_nodes_softwarecomponent_collectd, __Tosca_nodes_softwarecomponent_collectd);
			Types._Tosca_nodes_softwarecomponent_elasticsearch.initFragments(_Tosca_nodes_softwarecomponent_elasticsearch, __Tosca_nodes_softwarecomponent_elasticsearch);
			Types._Tosca_nodes_softwarecomponent_kibana.initFragments(_Tosca_nodes_softwarecomponent_kibana, __Tosca_nodes_softwarecomponent_kibana);
			Types._Tosca_nodes_softwarecomponent_logstash.initFragments(_Tosca_nodes_softwarecomponent_logstash, __Tosca_nodes_softwarecomponent_logstash);
			Types._Tosca_nodes_softwarecomponent_rsyslog.initFragments(_Tosca_nodes_softwarecomponent_rsyslog, __Tosca_nodes_softwarecomponent_rsyslog);
			Types._Tosca_nodes_somenode.initFragments(_Tosca_nodes_somenode, __Tosca_nodes_somenode);
			Types._Tosca_nodes_somenode2.initFragments(_Tosca_nodes_somenode2, __Tosca_nodes_somenode2);
			Types._Tosca_nodes_webapplication_paypalpizzastore.initFragments(_Tosca_nodes_webapplication_paypalpizzastore, __Tosca_nodes_webapplication_paypalpizzastore);
			Types._Tosca_nodes_wordpress.initFragments(_Tosca_nodes_wordpress, __Tosca_nodes_wordpress);
			Types._Tosca_relationships_ha.initFragments(_Tosca_relationships_ha, __Tosca_relationships_ha);
			Types._Tosca_relationships_network_bindsto.initFragments(_Tosca_relationships_network_bindsto, __Tosca_relationships_network_bindsto);
			Types._Tosca_relationships_network_linksto.initFragments(_Tosca_relationships_network_linksto, __Tosca_relationships_network_linksto);
			Types._Tosca_relationships_nodecellarhostedonnodejs.initFragments(_Tosca_relationships_nodecellarhostedonnodejs, __Tosca_relationships_nodecellarhostedonnodejs);
			Types._Tosca_relationships_nodejsconnecttomongo.initFragments(_Tosca_relationships_nodejsconnecttomongo, __Tosca_relationships_nodejsconnecttomongo);
			Types._arrayCredential.initFragments(_arrayCredential, __arrayCredential);
			Types._arrayPortSpec.initFragments(_arrayPortSpec, __arrayPortSpec);
			Types._arrayinteger.initFragments(_arrayinteger, __arrayinteger);
			Types._arrayversion.initFragments(_arrayversion, __arrayversion);
			Types._ip_versionEnum.initFragments(_ip_versionEnum, __ip_versionEnum);
			Types._storage_pathEnum.initFragments(_storage_pathEnum, __storage_pathEnum);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ExtendedtoscaTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_databasesubsystem__Example_databasesubsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_databasesubsystem__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_databasesubsystem__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_databasesubsystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_databasesubsystem__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_databasesubsystem__Tosca_capabilities_endpoint_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_databasesubsystem__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_databasesubsystem__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_databasesubsystem__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_queuingsubsystem__Example_queuingsubsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_queuingsubsystem__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_queuingsubsystem__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_queuingsubsystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_queuingsubsystem__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_queuingsubsystem__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_queuingsubsystem__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_queuingsubsystem__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_someapp__Example_someapp = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_someapp__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_someapp__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_someapp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_someapp__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_someapp__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_someapp__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_someapp__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_transactionsubsystem__Example_transactionsubsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_transactionsubsystem__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_transactionsubsystem__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_transactionsubsystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_transactionsubsystem__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_transactionsubsystem__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_transactionsubsystem__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Example_transactionsubsystem__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Myattachesto__Myattachesto = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Myattachesto__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Myattachesto__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Myattachesto__Installationdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Myattachesto__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Myattachesto__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Myattachesto__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Myattachesto__Tosca_relationships_attachesto = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Myattachesto__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mycompany_mytypes_myscalingpolicy__Mycompany_mytypes_myscalingpolicy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mycompany_mytypes_myscalingpolicy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mycompany_mytypes_myscalingpolicy__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mycompany_mytypes_myscalingpolicy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rsyslog__Rsyslog = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rsyslog__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rsyslog__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rsyslog__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rsyslog__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rsyslog__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rsyslog__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rsyslog__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Test_relation_connects__Test_relation_connects = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Test_relation_connects__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Test_relation_connects__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Test_relation_connects__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container_docker__Tosca_capabilities_container_docker = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container_docker__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container_docker__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container_docker__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container_docker__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_container_docker__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_containerchild__Tosca_capabilities_containerchild = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_containerchild__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_containerchild__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_containerchild__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_containerchild__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_containerchild__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_ha__Tosca_capabilities_ha = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_ha__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_ha__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_ha__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_ha__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_indigo_endpoint__Tosca_capabilities_indigo_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_indigo_endpoint__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_indigo_endpoint__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_indigo_endpoint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_indigo_endpoint__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_indigo_endpoint__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_nodejsappcontainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_nodejsappcontainer__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_nodejsappcontainer__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_nodejsappcontainer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somecap__Tosca_capabilities_somecap = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somecap__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somecap__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somecap__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somecap__Tosca_capabilities_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somechildcap__Tosca_capabilities_somechildcap = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somechildcap__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somechildcap__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somechildcap__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somechildcap__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_capabilities_somechildcap__Tosca_capabilities_somecap = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__Tosca_nodes_abstractmongod = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__Database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__Tosca_nodes_dbms = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmongod__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__Tosca_nodes_abstractmysql = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__Tosca_nodes_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_abstractmysql__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__Tosca_nodes_apache = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__Tosca_capabilities_endpoint_admin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__Tosca_nodes_softwarecomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_apache__Tosca_nodes_webserver = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_nodes_computewithattrlist = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint_admin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_capabilities_network_bindable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_capabilities_operatingsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_capabilities_scalable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_nodes_compute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithattrlist__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_nodes_computewithcapwithattr = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint_admin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_indigo_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_network_bindable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_operatingsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_capabilities_scalable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_nodes_compute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_nodes_computewithprop = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_capabilities_endpoint_admin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_capabilities_network_bindable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_capabilities_operatingsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_capabilities_scalable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_nodes_compute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_computewithprop__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application_docker__Tosca_nodes_container_application_docker = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application_docker__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application_docker__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application_docker__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application_docker__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application_docker__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application_docker__Tosca_nodes_container_application = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_container_application_docker__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__Tosca_nodes_database_mysql = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__Tosca_capabilities_endpoint_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__Tosca_nodes_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_database_mysql__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__Tosca_nodes_databasewithlistparam = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__Tosca_nodes_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__Tosca_nodes_dbms_mysql = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__Database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__Tosca_nodes_dbms = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_dbms_mysql__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_nodes_hacompute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_capabilities_endpoint_admin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_capabilities_ha = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_capabilities_network_bindable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_capabilities_operatingsystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_capabilities_scalable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_nodes_compute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_hacompute__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__Tosca_nodes_mongod = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__Database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__Tosca_nodes_abstractmongod = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__Tosca_nodes_dbms = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mongod__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__Tosca_nodes_mysql = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__Tosca_capabilities_endpoint_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__Tosca_nodes_abstractmysql = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__Tosca_nodes_database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_mysql__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_network__Tosca_nodes_network_network = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_network__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_network__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_network__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_network__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_network__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_network__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_port__Tosca_nodes_network_port = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_port__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_port__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_port__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_port__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_port__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_network_port__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodecellar__Tosca_nodes_nodecellar = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodecellar__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodecellar__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodecellar__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodecellar__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodecellar__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodecellar__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodecellar__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodecellar__Tosca_nodes_webapplication = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_nodes_nodejs = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_capabilities_endpoint_admin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_capabilities_nodejsappcontainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_nodes_softwarecomponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodejs__Tosca_nodes_webserver = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithcap__Tosca_nodes_nodewithcap = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithcap__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithcap__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithcap__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithcap__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithcap__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithcap__Tosca_capabilities_somecap = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithcap__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithreq__Tosca_nodes_nodewithreq = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithreq__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithreq__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithreq__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithreq__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithreq__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithreq__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_nodewithreq__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_php__Tosca_nodes_php = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_php__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_php__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_php__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_php__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_php__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_php__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_php__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent_collectd = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent_elasticsearch = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent_kibana = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent_logstash = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent_rsyslog = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode__Tosca_nodes_somenode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode__Tosca_capabilities_somecap = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode__Tosca_capabilities_somechildcap = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode2__Tosca_nodes_somenode2 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode2__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode2__Tosca_capabilities_container = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode2__Tosca_capabilities_containerchild = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode2__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode2__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_somenode2__Tosca_nodes_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication_paypalpizzastore = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_wordpress__Tosca_nodes_wordpress = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_wordpress__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_wordpress__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_wordpress__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_wordpress__Tosca_capabilities_endpoint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_wordpress__Tosca_capabilities_node = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_wordpress__Tosca_capabilities_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_wordpress__Tosca_nodes_root = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_nodes_wordpress__Tosca_nodes_webapplication = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_ha__Tosca_relationships_ha = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_ha__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_ha__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_ha__Installationdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_ha__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_ha__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_ha__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_ha__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_bindsto__Tosca_relationships_network_bindsto = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_bindsto__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_bindsto__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_bindsto__Installationdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_bindsto__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_bindsto__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_bindsto__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_bindsto__Tosca_relationships_dependson = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_bindsto__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_linksto__Tosca_relationships_network_linksto = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_linksto__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_linksto__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_linksto__Installationdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_linksto__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_linksto__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_linksto__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_linksto__Tosca_relationships_dependson = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_network_linksto__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_nodecellarhostedonnodejs = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs__Installationdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_hostedon = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_nodejsconnecttomongo = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo__Dependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo__Executiondependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo__Installationdependency = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_connectsto = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_root = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayCredential__arrayCredential = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayCredential__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayCredential__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayPortSpec__arrayPortSpec = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayPortSpec__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayPortSpec__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayinteger__arrayinteger = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayinteger__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayinteger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayversion__arrayversion = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayversion__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _arrayversion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ip_versionEnum__ip_versionEnum = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ip_versionEnum__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ip_versionEnum__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ip_versionEnum__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ip_versionEnum__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _storage_pathEnum__storage_pathEnum = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _storage_pathEnum__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _storage_pathEnum__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _storage_pathEnum__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _storage_pathEnum__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Example_databasesubsystem__Example_databasesubsystem.initOperations(_Example_databasesubsystem__Example_databasesubsystem);
			Fragments._Example_databasesubsystem__MixinBase.initOperations(_Example_databasesubsystem__MixinBase);
			Fragments._Example_databasesubsystem__OclAny.initOperations(_Example_databasesubsystem__OclAny);
			Fragments._Example_databasesubsystem__OclElement.initOperations(_Example_databasesubsystem__OclElement);
			Fragments._Example_databasesubsystem__Tosca_capabilities_endpoint.initOperations(_Example_databasesubsystem__Tosca_capabilities_endpoint);
			Fragments._Example_databasesubsystem__Tosca_capabilities_endpoint_database.initOperations(_Example_databasesubsystem__Tosca_capabilities_endpoint_database);
			Fragments._Example_databasesubsystem__Tosca_capabilities_node.initOperations(_Example_databasesubsystem__Tosca_capabilities_node);
			Fragments._Example_databasesubsystem__Tosca_capabilities_root.initOperations(_Example_databasesubsystem__Tosca_capabilities_root);
			Fragments._Example_databasesubsystem__Tosca_nodes_root.initOperations(_Example_databasesubsystem__Tosca_nodes_root);

			Fragments._Example_queuingsubsystem__Example_queuingsubsystem.initOperations(_Example_queuingsubsystem__Example_queuingsubsystem);
			Fragments._Example_queuingsubsystem__MixinBase.initOperations(_Example_queuingsubsystem__MixinBase);
			Fragments._Example_queuingsubsystem__OclAny.initOperations(_Example_queuingsubsystem__OclAny);
			Fragments._Example_queuingsubsystem__OclElement.initOperations(_Example_queuingsubsystem__OclElement);
			Fragments._Example_queuingsubsystem__Tosca_capabilities_endpoint.initOperations(_Example_queuingsubsystem__Tosca_capabilities_endpoint);
			Fragments._Example_queuingsubsystem__Tosca_capabilities_node.initOperations(_Example_queuingsubsystem__Tosca_capabilities_node);
			Fragments._Example_queuingsubsystem__Tosca_capabilities_root.initOperations(_Example_queuingsubsystem__Tosca_capabilities_root);
			Fragments._Example_queuingsubsystem__Tosca_nodes_root.initOperations(_Example_queuingsubsystem__Tosca_nodes_root);

			Fragments._Example_someapp__Example_someapp.initOperations(_Example_someapp__Example_someapp);
			Fragments._Example_someapp__MixinBase.initOperations(_Example_someapp__MixinBase);
			Fragments._Example_someapp__OclAny.initOperations(_Example_someapp__OclAny);
			Fragments._Example_someapp__OclElement.initOperations(_Example_someapp__OclElement);
			Fragments._Example_someapp__Tosca_capabilities_endpoint.initOperations(_Example_someapp__Tosca_capabilities_endpoint);
			Fragments._Example_someapp__Tosca_capabilities_node.initOperations(_Example_someapp__Tosca_capabilities_node);
			Fragments._Example_someapp__Tosca_capabilities_root.initOperations(_Example_someapp__Tosca_capabilities_root);
			Fragments._Example_someapp__Tosca_nodes_root.initOperations(_Example_someapp__Tosca_nodes_root);

			Fragments._Example_transactionsubsystem__Example_transactionsubsystem.initOperations(_Example_transactionsubsystem__Example_transactionsubsystem);
			Fragments._Example_transactionsubsystem__MixinBase.initOperations(_Example_transactionsubsystem__MixinBase);
			Fragments._Example_transactionsubsystem__OclAny.initOperations(_Example_transactionsubsystem__OclAny);
			Fragments._Example_transactionsubsystem__OclElement.initOperations(_Example_transactionsubsystem__OclElement);
			Fragments._Example_transactionsubsystem__Tosca_capabilities_endpoint.initOperations(_Example_transactionsubsystem__Tosca_capabilities_endpoint);
			Fragments._Example_transactionsubsystem__Tosca_capabilities_node.initOperations(_Example_transactionsubsystem__Tosca_capabilities_node);
			Fragments._Example_transactionsubsystem__Tosca_capabilities_root.initOperations(_Example_transactionsubsystem__Tosca_capabilities_root);
			Fragments._Example_transactionsubsystem__Tosca_nodes_root.initOperations(_Example_transactionsubsystem__Tosca_nodes_root);

			Fragments._Myattachesto__Dependency.initOperations(_Myattachesto__Dependency);
			Fragments._Myattachesto__Executiondependency.initOperations(_Myattachesto__Executiondependency);
			Fragments._Myattachesto__Installationdependency.initOperations(_Myattachesto__Installationdependency);
			Fragments._Myattachesto__MixinBase.initOperations(_Myattachesto__MixinBase);
			Fragments._Myattachesto__Myattachesto.initOperations(_Myattachesto__Myattachesto);
			Fragments._Myattachesto__OclAny.initOperations(_Myattachesto__OclAny);
			Fragments._Myattachesto__OclElement.initOperations(_Myattachesto__OclElement);
			Fragments._Myattachesto__Tosca_relationships_attachesto.initOperations(_Myattachesto__Tosca_relationships_attachesto);
			Fragments._Myattachesto__Tosca_relationships_root.initOperations(_Myattachesto__Tosca_relationships_root);

			Fragments._Mycompany_mytypes_myscalingpolicy__MixinBase.initOperations(_Mycompany_mytypes_myscalingpolicy__MixinBase);
			Fragments._Mycompany_mytypes_myscalingpolicy__Mycompany_mytypes_myscalingpolicy.initOperations(_Mycompany_mytypes_myscalingpolicy__Mycompany_mytypes_myscalingpolicy);
			Fragments._Mycompany_mytypes_myscalingpolicy__OclAny.initOperations(_Mycompany_mytypes_myscalingpolicy__OclAny);
			Fragments._Mycompany_mytypes_myscalingpolicy__OclElement.initOperations(_Mycompany_mytypes_myscalingpolicy__OclElement);

			Fragments._Rsyslog__MixinBase.initOperations(_Rsyslog__MixinBase);
			Fragments._Rsyslog__OclAny.initOperations(_Rsyslog__OclAny);
			Fragments._Rsyslog__OclElement.initOperations(_Rsyslog__OclElement);
			Fragments._Rsyslog__Rsyslog.initOperations(_Rsyslog__Rsyslog);
			Fragments._Rsyslog__Tosca_capabilities_node.initOperations(_Rsyslog__Tosca_capabilities_node);
			Fragments._Rsyslog__Tosca_capabilities_root.initOperations(_Rsyslog__Tosca_capabilities_root);
			Fragments._Rsyslog__Tosca_nodes_root.initOperations(_Rsyslog__Tosca_nodes_root);
			Fragments._Rsyslog__Tosca_nodes_softwarecomponent.initOperations(_Rsyslog__Tosca_nodes_softwarecomponent);

			Fragments._Test_relation_connects__MixinBase.initOperations(_Test_relation_connects__MixinBase);
			Fragments._Test_relation_connects__OclAny.initOperations(_Test_relation_connects__OclAny);
			Fragments._Test_relation_connects__OclElement.initOperations(_Test_relation_connects__OclElement);
			Fragments._Test_relation_connects__Test_relation_connects.initOperations(_Test_relation_connects__Test_relation_connects);

			Fragments._Tosca_capabilities_container_docker__MixinBase.initOperations(_Tosca_capabilities_container_docker__MixinBase);
			Fragments._Tosca_capabilities_container_docker__OclAny.initOperations(_Tosca_capabilities_container_docker__OclAny);
			Fragments._Tosca_capabilities_container_docker__OclElement.initOperations(_Tosca_capabilities_container_docker__OclElement);
			Fragments._Tosca_capabilities_container_docker__Tosca_capabilities_container.initOperations(_Tosca_capabilities_container_docker__Tosca_capabilities_container);
			Fragments._Tosca_capabilities_container_docker__Tosca_capabilities_container_docker.initOperations(_Tosca_capabilities_container_docker__Tosca_capabilities_container_docker);
			Fragments._Tosca_capabilities_container_docker__Tosca_capabilities_root.initOperations(_Tosca_capabilities_container_docker__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_containerchild__MixinBase.initOperations(_Tosca_capabilities_containerchild__MixinBase);
			Fragments._Tosca_capabilities_containerchild__OclAny.initOperations(_Tosca_capabilities_containerchild__OclAny);
			Fragments._Tosca_capabilities_containerchild__OclElement.initOperations(_Tosca_capabilities_containerchild__OclElement);
			Fragments._Tosca_capabilities_containerchild__Tosca_capabilities_container.initOperations(_Tosca_capabilities_containerchild__Tosca_capabilities_container);
			Fragments._Tosca_capabilities_containerchild__Tosca_capabilities_containerchild.initOperations(_Tosca_capabilities_containerchild__Tosca_capabilities_containerchild);
			Fragments._Tosca_capabilities_containerchild__Tosca_capabilities_root.initOperations(_Tosca_capabilities_containerchild__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_ha__MixinBase.initOperations(_Tosca_capabilities_ha__MixinBase);
			Fragments._Tosca_capabilities_ha__OclAny.initOperations(_Tosca_capabilities_ha__OclAny);
			Fragments._Tosca_capabilities_ha__OclElement.initOperations(_Tosca_capabilities_ha__OclElement);
			Fragments._Tosca_capabilities_ha__Tosca_capabilities_ha.initOperations(_Tosca_capabilities_ha__Tosca_capabilities_ha);
			Fragments._Tosca_capabilities_ha__Tosca_capabilities_root.initOperations(_Tosca_capabilities_ha__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_indigo_endpoint__MixinBase.initOperations(_Tosca_capabilities_indigo_endpoint__MixinBase);
			Fragments._Tosca_capabilities_indigo_endpoint__OclAny.initOperations(_Tosca_capabilities_indigo_endpoint__OclAny);
			Fragments._Tosca_capabilities_indigo_endpoint__OclElement.initOperations(_Tosca_capabilities_indigo_endpoint__OclElement);
			Fragments._Tosca_capabilities_indigo_endpoint__Tosca_capabilities_endpoint.initOperations(_Tosca_capabilities_indigo_endpoint__Tosca_capabilities_endpoint);
			Fragments._Tosca_capabilities_indigo_endpoint__Tosca_capabilities_indigo_endpoint.initOperations(_Tosca_capabilities_indigo_endpoint__Tosca_capabilities_indigo_endpoint);
			Fragments._Tosca_capabilities_indigo_endpoint__Tosca_capabilities_root.initOperations(_Tosca_capabilities_indigo_endpoint__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_nodejsappcontainer__MixinBase.initOperations(_Tosca_capabilities_nodejsappcontainer__MixinBase);
			Fragments._Tosca_capabilities_nodejsappcontainer__OclAny.initOperations(_Tosca_capabilities_nodejsappcontainer__OclAny);
			Fragments._Tosca_capabilities_nodejsappcontainer__OclElement.initOperations(_Tosca_capabilities_nodejsappcontainer__OclElement);
			Fragments._Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_container.initOperations(_Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_container);
			Fragments._Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_nodejsappcontainer.initOperations(_Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_nodejsappcontainer);
			Fragments._Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_root.initOperations(_Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_root);

			Fragments._Tosca_capabilities_somecap__MixinBase.initOperations(_Tosca_capabilities_somecap__MixinBase);
			Fragments._Tosca_capabilities_somecap__OclAny.initOperations(_Tosca_capabilities_somecap__OclAny);
			Fragments._Tosca_capabilities_somecap__OclElement.initOperations(_Tosca_capabilities_somecap__OclElement);
			Fragments._Tosca_capabilities_somecap__Tosca_capabilities_root.initOperations(_Tosca_capabilities_somecap__Tosca_capabilities_root);
			Fragments._Tosca_capabilities_somecap__Tosca_capabilities_somecap.initOperations(_Tosca_capabilities_somecap__Tosca_capabilities_somecap);

			Fragments._Tosca_capabilities_somechildcap__MixinBase.initOperations(_Tosca_capabilities_somechildcap__MixinBase);
			Fragments._Tosca_capabilities_somechildcap__OclAny.initOperations(_Tosca_capabilities_somechildcap__OclAny);
			Fragments._Tosca_capabilities_somechildcap__OclElement.initOperations(_Tosca_capabilities_somechildcap__OclElement);
			Fragments._Tosca_capabilities_somechildcap__Tosca_capabilities_root.initOperations(_Tosca_capabilities_somechildcap__Tosca_capabilities_root);
			Fragments._Tosca_capabilities_somechildcap__Tosca_capabilities_somecap.initOperations(_Tosca_capabilities_somechildcap__Tosca_capabilities_somecap);
			Fragments._Tosca_capabilities_somechildcap__Tosca_capabilities_somechildcap.initOperations(_Tosca_capabilities_somechildcap__Tosca_capabilities_somechildcap);

			Fragments._Tosca_nodes_abstractmongod__Database.initOperations(_Tosca_nodes_abstractmongod__Database);
			Fragments._Tosca_nodes_abstractmongod__MixinBase.initOperations(_Tosca_nodes_abstractmongod__MixinBase);
			Fragments._Tosca_nodes_abstractmongod__OclAny.initOperations(_Tosca_nodes_abstractmongod__OclAny);
			Fragments._Tosca_nodes_abstractmongod__OclElement.initOperations(_Tosca_nodes_abstractmongod__OclElement);
			Fragments._Tosca_nodes_abstractmongod__Tosca_capabilities_container.initOperations(_Tosca_nodes_abstractmongod__Tosca_capabilities_container);
			Fragments._Tosca_nodes_abstractmongod__Tosca_capabilities_node.initOperations(_Tosca_nodes_abstractmongod__Tosca_capabilities_node);
			Fragments._Tosca_nodes_abstractmongod__Tosca_capabilities_root.initOperations(_Tosca_nodes_abstractmongod__Tosca_capabilities_root);
			Fragments._Tosca_nodes_abstractmongod__Tosca_nodes_abstractmongod.initOperations(_Tosca_nodes_abstractmongod__Tosca_nodes_abstractmongod);
			Fragments._Tosca_nodes_abstractmongod__Tosca_nodes_dbms.initOperations(_Tosca_nodes_abstractmongod__Tosca_nodes_dbms);
			Fragments._Tosca_nodes_abstractmongod__Tosca_nodes_root.initOperations(_Tosca_nodes_abstractmongod__Tosca_nodes_root);
			Fragments._Tosca_nodes_abstractmongod__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_abstractmongod__Tosca_nodes_softwarecomponent);

			Fragments._Tosca_nodes_abstractmysql__MixinBase.initOperations(_Tosca_nodes_abstractmysql__MixinBase);
			Fragments._Tosca_nodes_abstractmysql__OclAny.initOperations(_Tosca_nodes_abstractmysql__OclAny);
			Fragments._Tosca_nodes_abstractmysql__OclElement.initOperations(_Tosca_nodes_abstractmysql__OclElement);
			Fragments._Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint_database.initOperations(_Tosca_nodes_abstractmysql__Tosca_capabilities_endpoint_database);
			Fragments._Tosca_nodes_abstractmysql__Tosca_capabilities_node.initOperations(_Tosca_nodes_abstractmysql__Tosca_capabilities_node);
			Fragments._Tosca_nodes_abstractmysql__Tosca_capabilities_root.initOperations(_Tosca_nodes_abstractmysql__Tosca_capabilities_root);
			Fragments._Tosca_nodes_abstractmysql__Tosca_nodes_abstractmysql.initOperations(_Tosca_nodes_abstractmysql__Tosca_nodes_abstractmysql);
			Fragments._Tosca_nodes_abstractmysql__Tosca_nodes_database.initOperations(_Tosca_nodes_abstractmysql__Tosca_nodes_database);
			Fragments._Tosca_nodes_abstractmysql__Tosca_nodes_root.initOperations(_Tosca_nodes_abstractmysql__Tosca_nodes_root);

			Fragments._Tosca_nodes_apache__MixinBase.initOperations(_Tosca_nodes_apache__MixinBase);
			Fragments._Tosca_nodes_apache__OclAny.initOperations(_Tosca_nodes_apache__OclAny);
			Fragments._Tosca_nodes_apache__OclElement.initOperations(_Tosca_nodes_apache__OclElement);
			Fragments._Tosca_nodes_apache__Tosca_capabilities_container.initOperations(_Tosca_nodes_apache__Tosca_capabilities_container);
			Fragments._Tosca_nodes_apache__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_apache__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_apache__Tosca_capabilities_endpoint_admin.initOperations(_Tosca_nodes_apache__Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_nodes_apache__Tosca_capabilities_node.initOperations(_Tosca_nodes_apache__Tosca_capabilities_node);
			Fragments._Tosca_nodes_apache__Tosca_capabilities_root.initOperations(_Tosca_nodes_apache__Tosca_capabilities_root);
			Fragments._Tosca_nodes_apache__Tosca_nodes_apache.initOperations(_Tosca_nodes_apache__Tosca_nodes_apache);
			Fragments._Tosca_nodes_apache__Tosca_nodes_root.initOperations(_Tosca_nodes_apache__Tosca_nodes_root);
			Fragments._Tosca_nodes_apache__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_apache__Tosca_nodes_softwarecomponent);
			Fragments._Tosca_nodes_apache__Tosca_nodes_webserver.initOperations(_Tosca_nodes_apache__Tosca_nodes_webserver);

			Fragments._Tosca_nodes_computewithattrlist__MixinBase.initOperations(_Tosca_nodes_computewithattrlist__MixinBase);
			Fragments._Tosca_nodes_computewithattrlist__OclAny.initOperations(_Tosca_nodes_computewithattrlist__OclAny);
			Fragments._Tosca_nodes_computewithattrlist__OclElement.initOperations(_Tosca_nodes_computewithattrlist__OclElement);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_container.initOperations(_Tosca_nodes_computewithattrlist__Tosca_capabilities_container);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint_admin.initOperations(_Tosca_nodes_computewithattrlist__Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_network_bindable.initOperations(_Tosca_nodes_computewithattrlist__Tosca_capabilities_network_bindable);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_node.initOperations(_Tosca_nodes_computewithattrlist__Tosca_capabilities_node);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_operatingsystem.initOperations(_Tosca_nodes_computewithattrlist__Tosca_capabilities_operatingsystem);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_root.initOperations(_Tosca_nodes_computewithattrlist__Tosca_capabilities_root);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_capabilities_scalable.initOperations(_Tosca_nodes_computewithattrlist__Tosca_capabilities_scalable);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_nodes_compute.initOperations(_Tosca_nodes_computewithattrlist__Tosca_nodes_compute);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_nodes_computewithattrlist.initOperations(_Tosca_nodes_computewithattrlist__Tosca_nodes_computewithattrlist);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_nodes_root.initOperations(_Tosca_nodes_computewithattrlist__Tosca_nodes_root);

			Fragments._Tosca_nodes_computewithcapwithattr__MixinBase.initOperations(_Tosca_nodes_computewithcapwithattr__MixinBase);
			Fragments._Tosca_nodes_computewithcapwithattr__OclAny.initOperations(_Tosca_nodes_computewithcapwithattr__OclAny);
			Fragments._Tosca_nodes_computewithcapwithattr__OclElement.initOperations(_Tosca_nodes_computewithcapwithattr__OclElement);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_container.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_capabilities_container);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint_admin.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_indigo_endpoint.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_capabilities_indigo_endpoint);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_network_bindable.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_capabilities_network_bindable);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_node.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_capabilities_node);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_operatingsystem.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_capabilities_operatingsystem);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_root.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_capabilities_root);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_capabilities_scalable.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_capabilities_scalable);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_nodes_compute.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_nodes_compute);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_nodes_computewithcapwithattr.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_nodes_computewithcapwithattr);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_nodes_root.initOperations(_Tosca_nodes_computewithcapwithattr__Tosca_nodes_root);

			Fragments._Tosca_nodes_computewithprop__MixinBase.initOperations(_Tosca_nodes_computewithprop__MixinBase);
			Fragments._Tosca_nodes_computewithprop__OclAny.initOperations(_Tosca_nodes_computewithprop__OclAny);
			Fragments._Tosca_nodes_computewithprop__OclElement.initOperations(_Tosca_nodes_computewithprop__OclElement);
			Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_container.initOperations(_Tosca_nodes_computewithprop__Tosca_capabilities_container);
			Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_computewithprop__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_endpoint_admin.initOperations(_Tosca_nodes_computewithprop__Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_network_bindable.initOperations(_Tosca_nodes_computewithprop__Tosca_capabilities_network_bindable);
			Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_node.initOperations(_Tosca_nodes_computewithprop__Tosca_capabilities_node);
			Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_operatingsystem.initOperations(_Tosca_nodes_computewithprop__Tosca_capabilities_operatingsystem);
			Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_root.initOperations(_Tosca_nodes_computewithprop__Tosca_capabilities_root);
			Fragments._Tosca_nodes_computewithprop__Tosca_capabilities_scalable.initOperations(_Tosca_nodes_computewithprop__Tosca_capabilities_scalable);
			Fragments._Tosca_nodes_computewithprop__Tosca_nodes_compute.initOperations(_Tosca_nodes_computewithprop__Tosca_nodes_compute);
			Fragments._Tosca_nodes_computewithprop__Tosca_nodes_computewithprop.initOperations(_Tosca_nodes_computewithprop__Tosca_nodes_computewithprop);
			Fragments._Tosca_nodes_computewithprop__Tosca_nodes_root.initOperations(_Tosca_nodes_computewithprop__Tosca_nodes_root);

			Fragments._Tosca_nodes_container_application_docker__MixinBase.initOperations(_Tosca_nodes_container_application_docker__MixinBase);
			Fragments._Tosca_nodes_container_application_docker__OclAny.initOperations(_Tosca_nodes_container_application_docker__OclAny);
			Fragments._Tosca_nodes_container_application_docker__OclElement.initOperations(_Tosca_nodes_container_application_docker__OclElement);
			Fragments._Tosca_nodes_container_application_docker__Tosca_capabilities_node.initOperations(_Tosca_nodes_container_application_docker__Tosca_capabilities_node);
			Fragments._Tosca_nodes_container_application_docker__Tosca_capabilities_root.initOperations(_Tosca_nodes_container_application_docker__Tosca_capabilities_root);
			Fragments._Tosca_nodes_container_application_docker__Tosca_nodes_container_application.initOperations(_Tosca_nodes_container_application_docker__Tosca_nodes_container_application);
			Fragments._Tosca_nodes_container_application_docker__Tosca_nodes_container_application_docker.initOperations(_Tosca_nodes_container_application_docker__Tosca_nodes_container_application_docker);
			Fragments._Tosca_nodes_container_application_docker__Tosca_nodes_root.initOperations(_Tosca_nodes_container_application_docker__Tosca_nodes_root);

			Fragments._Tosca_nodes_database_mysql__MixinBase.initOperations(_Tosca_nodes_database_mysql__MixinBase);
			Fragments._Tosca_nodes_database_mysql__OclAny.initOperations(_Tosca_nodes_database_mysql__OclAny);
			Fragments._Tosca_nodes_database_mysql__OclElement.initOperations(_Tosca_nodes_database_mysql__OclElement);
			Fragments._Tosca_nodes_database_mysql__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_database_mysql__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_database_mysql__Tosca_capabilities_endpoint_database.initOperations(_Tosca_nodes_database_mysql__Tosca_capabilities_endpoint_database);
			Fragments._Tosca_nodes_database_mysql__Tosca_capabilities_node.initOperations(_Tosca_nodes_database_mysql__Tosca_capabilities_node);
			Fragments._Tosca_nodes_database_mysql__Tosca_capabilities_root.initOperations(_Tosca_nodes_database_mysql__Tosca_capabilities_root);
			Fragments._Tosca_nodes_database_mysql__Tosca_nodes_database.initOperations(_Tosca_nodes_database_mysql__Tosca_nodes_database);
			Fragments._Tosca_nodes_database_mysql__Tosca_nodes_database_mysql.initOperations(_Tosca_nodes_database_mysql__Tosca_nodes_database_mysql);
			Fragments._Tosca_nodes_database_mysql__Tosca_nodes_root.initOperations(_Tosca_nodes_database_mysql__Tosca_nodes_root);

			Fragments._Tosca_nodes_databasewithlistparam__MixinBase.initOperations(_Tosca_nodes_databasewithlistparam__MixinBase);
			Fragments._Tosca_nodes_databasewithlistparam__OclAny.initOperations(_Tosca_nodes_databasewithlistparam__OclAny);
			Fragments._Tosca_nodes_databasewithlistparam__OclElement.initOperations(_Tosca_nodes_databasewithlistparam__OclElement);
			Fragments._Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint_database.initOperations(_Tosca_nodes_databasewithlistparam__Tosca_capabilities_endpoint_database);
			Fragments._Tosca_nodes_databasewithlistparam__Tosca_capabilities_node.initOperations(_Tosca_nodes_databasewithlistparam__Tosca_capabilities_node);
			Fragments._Tosca_nodes_databasewithlistparam__Tosca_capabilities_root.initOperations(_Tosca_nodes_databasewithlistparam__Tosca_capabilities_root);
			Fragments._Tosca_nodes_databasewithlistparam__Tosca_nodes_database.initOperations(_Tosca_nodes_databasewithlistparam__Tosca_nodes_database);
			Fragments._Tosca_nodes_databasewithlistparam__Tosca_nodes_databasewithlistparam.initOperations(_Tosca_nodes_databasewithlistparam__Tosca_nodes_databasewithlistparam);
			Fragments._Tosca_nodes_databasewithlistparam__Tosca_nodes_root.initOperations(_Tosca_nodes_databasewithlistparam__Tosca_nodes_root);

			Fragments._Tosca_nodes_dbms_mysql__Database.initOperations(_Tosca_nodes_dbms_mysql__Database);
			Fragments._Tosca_nodes_dbms_mysql__MixinBase.initOperations(_Tosca_nodes_dbms_mysql__MixinBase);
			Fragments._Tosca_nodes_dbms_mysql__OclAny.initOperations(_Tosca_nodes_dbms_mysql__OclAny);
			Fragments._Tosca_nodes_dbms_mysql__OclElement.initOperations(_Tosca_nodes_dbms_mysql__OclElement);
			Fragments._Tosca_nodes_dbms_mysql__Tosca_capabilities_container.initOperations(_Tosca_nodes_dbms_mysql__Tosca_capabilities_container);
			Fragments._Tosca_nodes_dbms_mysql__Tosca_capabilities_node.initOperations(_Tosca_nodes_dbms_mysql__Tosca_capabilities_node);
			Fragments._Tosca_nodes_dbms_mysql__Tosca_capabilities_root.initOperations(_Tosca_nodes_dbms_mysql__Tosca_capabilities_root);
			Fragments._Tosca_nodes_dbms_mysql__Tosca_nodes_dbms.initOperations(_Tosca_nodes_dbms_mysql__Tosca_nodes_dbms);
			Fragments._Tosca_nodes_dbms_mysql__Tosca_nodes_dbms_mysql.initOperations(_Tosca_nodes_dbms_mysql__Tosca_nodes_dbms_mysql);
			Fragments._Tosca_nodes_dbms_mysql__Tosca_nodes_root.initOperations(_Tosca_nodes_dbms_mysql__Tosca_nodes_root);
			Fragments._Tosca_nodes_dbms_mysql__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_dbms_mysql__Tosca_nodes_softwarecomponent);

			Fragments._Tosca_nodes_hacompute__MixinBase.initOperations(_Tosca_nodes_hacompute__MixinBase);
			Fragments._Tosca_nodes_hacompute__OclAny.initOperations(_Tosca_nodes_hacompute__OclAny);
			Fragments._Tosca_nodes_hacompute__OclElement.initOperations(_Tosca_nodes_hacompute__OclElement);
			Fragments._Tosca_nodes_hacompute__Tosca_capabilities_container.initOperations(_Tosca_nodes_hacompute__Tosca_capabilities_container);
			Fragments._Tosca_nodes_hacompute__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_hacompute__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_hacompute__Tosca_capabilities_endpoint_admin.initOperations(_Tosca_nodes_hacompute__Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_nodes_hacompute__Tosca_capabilities_ha.initOperations(_Tosca_nodes_hacompute__Tosca_capabilities_ha);
			Fragments._Tosca_nodes_hacompute__Tosca_capabilities_network_bindable.initOperations(_Tosca_nodes_hacompute__Tosca_capabilities_network_bindable);
			Fragments._Tosca_nodes_hacompute__Tosca_capabilities_node.initOperations(_Tosca_nodes_hacompute__Tosca_capabilities_node);
			Fragments._Tosca_nodes_hacompute__Tosca_capabilities_operatingsystem.initOperations(_Tosca_nodes_hacompute__Tosca_capabilities_operatingsystem);
			Fragments._Tosca_nodes_hacompute__Tosca_capabilities_root.initOperations(_Tosca_nodes_hacompute__Tosca_capabilities_root);
			Fragments._Tosca_nodes_hacompute__Tosca_capabilities_scalable.initOperations(_Tosca_nodes_hacompute__Tosca_capabilities_scalable);
			Fragments._Tosca_nodes_hacompute__Tosca_nodes_compute.initOperations(_Tosca_nodes_hacompute__Tosca_nodes_compute);
			Fragments._Tosca_nodes_hacompute__Tosca_nodes_hacompute.initOperations(_Tosca_nodes_hacompute__Tosca_nodes_hacompute);
			Fragments._Tosca_nodes_hacompute__Tosca_nodes_root.initOperations(_Tosca_nodes_hacompute__Tosca_nodes_root);

			Fragments._Tosca_nodes_mongod__Database.initOperations(_Tosca_nodes_mongod__Database);
			Fragments._Tosca_nodes_mongod__MixinBase.initOperations(_Tosca_nodes_mongod__MixinBase);
			Fragments._Tosca_nodes_mongod__OclAny.initOperations(_Tosca_nodes_mongod__OclAny);
			Fragments._Tosca_nodes_mongod__OclElement.initOperations(_Tosca_nodes_mongod__OclElement);
			Fragments._Tosca_nodes_mongod__Tosca_capabilities_container.initOperations(_Tosca_nodes_mongod__Tosca_capabilities_container);
			Fragments._Tosca_nodes_mongod__Tosca_capabilities_node.initOperations(_Tosca_nodes_mongod__Tosca_capabilities_node);
			Fragments._Tosca_nodes_mongod__Tosca_capabilities_root.initOperations(_Tosca_nodes_mongod__Tosca_capabilities_root);
			Fragments._Tosca_nodes_mongod__Tosca_nodes_abstractmongod.initOperations(_Tosca_nodes_mongod__Tosca_nodes_abstractmongod);
			Fragments._Tosca_nodes_mongod__Tosca_nodes_dbms.initOperations(_Tosca_nodes_mongod__Tosca_nodes_dbms);
			Fragments._Tosca_nodes_mongod__Tosca_nodes_mongod.initOperations(_Tosca_nodes_mongod__Tosca_nodes_mongod);
			Fragments._Tosca_nodes_mongod__Tosca_nodes_root.initOperations(_Tosca_nodes_mongod__Tosca_nodes_root);
			Fragments._Tosca_nodes_mongod__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_mongod__Tosca_nodes_softwarecomponent);

			Fragments._Tosca_nodes_mysql__MixinBase.initOperations(_Tosca_nodes_mysql__MixinBase);
			Fragments._Tosca_nodes_mysql__OclAny.initOperations(_Tosca_nodes_mysql__OclAny);
			Fragments._Tosca_nodes_mysql__OclElement.initOperations(_Tosca_nodes_mysql__OclElement);
			Fragments._Tosca_nodes_mysql__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_mysql__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_mysql__Tosca_capabilities_endpoint_database.initOperations(_Tosca_nodes_mysql__Tosca_capabilities_endpoint_database);
			Fragments._Tosca_nodes_mysql__Tosca_capabilities_node.initOperations(_Tosca_nodes_mysql__Tosca_capabilities_node);
			Fragments._Tosca_nodes_mysql__Tosca_capabilities_root.initOperations(_Tosca_nodes_mysql__Tosca_capabilities_root);
			Fragments._Tosca_nodes_mysql__Tosca_nodes_abstractmysql.initOperations(_Tosca_nodes_mysql__Tosca_nodes_abstractmysql);
			Fragments._Tosca_nodes_mysql__Tosca_nodes_database.initOperations(_Tosca_nodes_mysql__Tosca_nodes_database);
			Fragments._Tosca_nodes_mysql__Tosca_nodes_mysql.initOperations(_Tosca_nodes_mysql__Tosca_nodes_mysql);
			Fragments._Tosca_nodes_mysql__Tosca_nodes_root.initOperations(_Tosca_nodes_mysql__Tosca_nodes_root);

			Fragments._Tosca_nodes_network_network__MixinBase.initOperations(_Tosca_nodes_network_network__MixinBase);
			Fragments._Tosca_nodes_network_network__OclAny.initOperations(_Tosca_nodes_network_network__OclAny);
			Fragments._Tosca_nodes_network_network__OclElement.initOperations(_Tosca_nodes_network_network__OclElement);
			Fragments._Tosca_nodes_network_network__Tosca_capabilities_node.initOperations(_Tosca_nodes_network_network__Tosca_capabilities_node);
			Fragments._Tosca_nodes_network_network__Tosca_capabilities_root.initOperations(_Tosca_nodes_network_network__Tosca_capabilities_root);
			Fragments._Tosca_nodes_network_network__Tosca_nodes_network_network.initOperations(_Tosca_nodes_network_network__Tosca_nodes_network_network);
			Fragments._Tosca_nodes_network_network__Tosca_nodes_root.initOperations(_Tosca_nodes_network_network__Tosca_nodes_root);

			Fragments._Tosca_nodes_network_port__MixinBase.initOperations(_Tosca_nodes_network_port__MixinBase);
			Fragments._Tosca_nodes_network_port__OclAny.initOperations(_Tosca_nodes_network_port__OclAny);
			Fragments._Tosca_nodes_network_port__OclElement.initOperations(_Tosca_nodes_network_port__OclElement);
			Fragments._Tosca_nodes_network_port__Tosca_capabilities_node.initOperations(_Tosca_nodes_network_port__Tosca_capabilities_node);
			Fragments._Tosca_nodes_network_port__Tosca_capabilities_root.initOperations(_Tosca_nodes_network_port__Tosca_capabilities_root);
			Fragments._Tosca_nodes_network_port__Tosca_nodes_network_port.initOperations(_Tosca_nodes_network_port__Tosca_nodes_network_port);
			Fragments._Tosca_nodes_network_port__Tosca_nodes_root.initOperations(_Tosca_nodes_network_port__Tosca_nodes_root);

			Fragments._Tosca_nodes_nodecellar__MixinBase.initOperations(_Tosca_nodes_nodecellar__MixinBase);
			Fragments._Tosca_nodes_nodecellar__OclAny.initOperations(_Tosca_nodes_nodecellar__OclAny);
			Fragments._Tosca_nodes_nodecellar__OclElement.initOperations(_Tosca_nodes_nodecellar__OclElement);
			Fragments._Tosca_nodes_nodecellar__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_nodecellar__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_nodecellar__Tosca_capabilities_node.initOperations(_Tosca_nodes_nodecellar__Tosca_capabilities_node);
			Fragments._Tosca_nodes_nodecellar__Tosca_capabilities_root.initOperations(_Tosca_nodes_nodecellar__Tosca_capabilities_root);
			Fragments._Tosca_nodes_nodecellar__Tosca_nodes_nodecellar.initOperations(_Tosca_nodes_nodecellar__Tosca_nodes_nodecellar);
			Fragments._Tosca_nodes_nodecellar__Tosca_nodes_root.initOperations(_Tosca_nodes_nodecellar__Tosca_nodes_root);
			Fragments._Tosca_nodes_nodecellar__Tosca_nodes_webapplication.initOperations(_Tosca_nodes_nodecellar__Tosca_nodes_webapplication);

			Fragments._Tosca_nodes_nodejs__MixinBase.initOperations(_Tosca_nodes_nodejs__MixinBase);
			Fragments._Tosca_nodes_nodejs__OclAny.initOperations(_Tosca_nodes_nodejs__OclAny);
			Fragments._Tosca_nodes_nodejs__OclElement.initOperations(_Tosca_nodes_nodejs__OclElement);
			Fragments._Tosca_nodes_nodejs__Tosca_capabilities_container.initOperations(_Tosca_nodes_nodejs__Tosca_capabilities_container);
			Fragments._Tosca_nodes_nodejs__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_nodejs__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_nodejs__Tosca_capabilities_endpoint_admin.initOperations(_Tosca_nodes_nodejs__Tosca_capabilities_endpoint_admin);
			Fragments._Tosca_nodes_nodejs__Tosca_capabilities_node.initOperations(_Tosca_nodes_nodejs__Tosca_capabilities_node);
			Fragments._Tosca_nodes_nodejs__Tosca_capabilities_nodejsappcontainer.initOperations(_Tosca_nodes_nodejs__Tosca_capabilities_nodejsappcontainer);
			Fragments._Tosca_nodes_nodejs__Tosca_capabilities_root.initOperations(_Tosca_nodes_nodejs__Tosca_capabilities_root);
			Fragments._Tosca_nodes_nodejs__Tosca_nodes_nodejs.initOperations(_Tosca_nodes_nodejs__Tosca_nodes_nodejs);
			Fragments._Tosca_nodes_nodejs__Tosca_nodes_root.initOperations(_Tosca_nodes_nodejs__Tosca_nodes_root);
			Fragments._Tosca_nodes_nodejs__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_nodejs__Tosca_nodes_softwarecomponent);
			Fragments._Tosca_nodes_nodejs__Tosca_nodes_webserver.initOperations(_Tosca_nodes_nodejs__Tosca_nodes_webserver);

			Fragments._Tosca_nodes_nodewithcap__MixinBase.initOperations(_Tosca_nodes_nodewithcap__MixinBase);
			Fragments._Tosca_nodes_nodewithcap__OclAny.initOperations(_Tosca_nodes_nodewithcap__OclAny);
			Fragments._Tosca_nodes_nodewithcap__OclElement.initOperations(_Tosca_nodes_nodewithcap__OclElement);
			Fragments._Tosca_nodes_nodewithcap__Tosca_capabilities_node.initOperations(_Tosca_nodes_nodewithcap__Tosca_capabilities_node);
			Fragments._Tosca_nodes_nodewithcap__Tosca_capabilities_root.initOperations(_Tosca_nodes_nodewithcap__Tosca_capabilities_root);
			Fragments._Tosca_nodes_nodewithcap__Tosca_capabilities_somecap.initOperations(_Tosca_nodes_nodewithcap__Tosca_capabilities_somecap);
			Fragments._Tosca_nodes_nodewithcap__Tosca_nodes_nodewithcap.initOperations(_Tosca_nodes_nodewithcap__Tosca_nodes_nodewithcap);
			Fragments._Tosca_nodes_nodewithcap__Tosca_nodes_root.initOperations(_Tosca_nodes_nodewithcap__Tosca_nodes_root);

			Fragments._Tosca_nodes_nodewithreq__MixinBase.initOperations(_Tosca_nodes_nodewithreq__MixinBase);
			Fragments._Tosca_nodes_nodewithreq__OclAny.initOperations(_Tosca_nodes_nodewithreq__OclAny);
			Fragments._Tosca_nodes_nodewithreq__OclElement.initOperations(_Tosca_nodes_nodewithreq__OclElement);
			Fragments._Tosca_nodes_nodewithreq__Tosca_capabilities_node.initOperations(_Tosca_nodes_nodewithreq__Tosca_capabilities_node);
			Fragments._Tosca_nodes_nodewithreq__Tosca_capabilities_root.initOperations(_Tosca_nodes_nodewithreq__Tosca_capabilities_root);
			Fragments._Tosca_nodes_nodewithreq__Tosca_nodes_nodewithreq.initOperations(_Tosca_nodes_nodewithreq__Tosca_nodes_nodewithreq);
			Fragments._Tosca_nodes_nodewithreq__Tosca_nodes_root.initOperations(_Tosca_nodes_nodewithreq__Tosca_nodes_root);
			Fragments._Tosca_nodes_nodewithreq__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_nodewithreq__Tosca_nodes_softwarecomponent);

			Fragments._Tosca_nodes_php__MixinBase.initOperations(_Tosca_nodes_php__MixinBase);
			Fragments._Tosca_nodes_php__OclAny.initOperations(_Tosca_nodes_php__OclAny);
			Fragments._Tosca_nodes_php__OclElement.initOperations(_Tosca_nodes_php__OclElement);
			Fragments._Tosca_nodes_php__Tosca_capabilities_node.initOperations(_Tosca_nodes_php__Tosca_capabilities_node);
			Fragments._Tosca_nodes_php__Tosca_capabilities_root.initOperations(_Tosca_nodes_php__Tosca_capabilities_root);
			Fragments._Tosca_nodes_php__Tosca_nodes_php.initOperations(_Tosca_nodes_php__Tosca_nodes_php);
			Fragments._Tosca_nodes_php__Tosca_nodes_root.initOperations(_Tosca_nodes_php__Tosca_nodes_root);
			Fragments._Tosca_nodes_php__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_php__Tosca_nodes_softwarecomponent);

			Fragments._Tosca_nodes_softwarecomponent_collectd__MixinBase.initOperations(_Tosca_nodes_softwarecomponent_collectd__MixinBase);
			Fragments._Tosca_nodes_softwarecomponent_collectd__OclAny.initOperations(_Tosca_nodes_softwarecomponent_collectd__OclAny);
			Fragments._Tosca_nodes_softwarecomponent_collectd__OclElement.initOperations(_Tosca_nodes_softwarecomponent_collectd__OclElement);
			Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_node.initOperations(_Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_node);
			Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_root.initOperations(_Tosca_nodes_softwarecomponent_collectd__Tosca_capabilities_root);
			Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_root.initOperations(_Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_root);
			Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent);
			Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent_collectd.initOperations(_Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent_collectd);

			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__MixinBase.initOperations(_Tosca_nodes_softwarecomponent_elasticsearch__MixinBase);
			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__OclAny.initOperations(_Tosca_nodes_softwarecomponent_elasticsearch__OclAny);
			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__OclElement.initOperations(_Tosca_nodes_softwarecomponent_elasticsearch__OclElement);
			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_node.initOperations(_Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_node);
			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_root.initOperations(_Tosca_nodes_softwarecomponent_elasticsearch__Tosca_capabilities_root);
			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_root.initOperations(_Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_root);
			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent);
			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent_elasticsearch.initOperations(_Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent_elasticsearch);

			Fragments._Tosca_nodes_softwarecomponent_kibana__MixinBase.initOperations(_Tosca_nodes_softwarecomponent_kibana__MixinBase);
			Fragments._Tosca_nodes_softwarecomponent_kibana__OclAny.initOperations(_Tosca_nodes_softwarecomponent_kibana__OclAny);
			Fragments._Tosca_nodes_softwarecomponent_kibana__OclElement.initOperations(_Tosca_nodes_softwarecomponent_kibana__OclElement);
			Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_node.initOperations(_Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_node);
			Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_root.initOperations(_Tosca_nodes_softwarecomponent_kibana__Tosca_capabilities_root);
			Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_root.initOperations(_Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_root);
			Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent);
			Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent_kibana.initOperations(_Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent_kibana);

			Fragments._Tosca_nodes_softwarecomponent_logstash__MixinBase.initOperations(_Tosca_nodes_softwarecomponent_logstash__MixinBase);
			Fragments._Tosca_nodes_softwarecomponent_logstash__OclAny.initOperations(_Tosca_nodes_softwarecomponent_logstash__OclAny);
			Fragments._Tosca_nodes_softwarecomponent_logstash__OclElement.initOperations(_Tosca_nodes_softwarecomponent_logstash__OclElement);
			Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_node.initOperations(_Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_node);
			Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_root.initOperations(_Tosca_nodes_softwarecomponent_logstash__Tosca_capabilities_root);
			Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_root.initOperations(_Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_root);
			Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent);
			Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent_logstash.initOperations(_Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent_logstash);

			Fragments._Tosca_nodes_softwarecomponent_rsyslog__MixinBase.initOperations(_Tosca_nodes_softwarecomponent_rsyslog__MixinBase);
			Fragments._Tosca_nodes_softwarecomponent_rsyslog__OclAny.initOperations(_Tosca_nodes_softwarecomponent_rsyslog__OclAny);
			Fragments._Tosca_nodes_softwarecomponent_rsyslog__OclElement.initOperations(_Tosca_nodes_softwarecomponent_rsyslog__OclElement);
			Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_node.initOperations(_Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_node);
			Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_root.initOperations(_Tosca_nodes_softwarecomponent_rsyslog__Tosca_capabilities_root);
			Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_root.initOperations(_Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_root);
			Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent.initOperations(_Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent);
			Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent_rsyslog.initOperations(_Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent_rsyslog);

			Fragments._Tosca_nodes_somenode__MixinBase.initOperations(_Tosca_nodes_somenode__MixinBase);
			Fragments._Tosca_nodes_somenode__OclAny.initOperations(_Tosca_nodes_somenode__OclAny);
			Fragments._Tosca_nodes_somenode__OclElement.initOperations(_Tosca_nodes_somenode__OclElement);
			Fragments._Tosca_nodes_somenode__Tosca_capabilities_node.initOperations(_Tosca_nodes_somenode__Tosca_capabilities_node);
			Fragments._Tosca_nodes_somenode__Tosca_capabilities_root.initOperations(_Tosca_nodes_somenode__Tosca_capabilities_root);
			Fragments._Tosca_nodes_somenode__Tosca_capabilities_somecap.initOperations(_Tosca_nodes_somenode__Tosca_capabilities_somecap);
			Fragments._Tosca_nodes_somenode__Tosca_capabilities_somechildcap.initOperations(_Tosca_nodes_somenode__Tosca_capabilities_somechildcap);
			Fragments._Tosca_nodes_somenode__Tosca_nodes_root.initOperations(_Tosca_nodes_somenode__Tosca_nodes_root);
			Fragments._Tosca_nodes_somenode__Tosca_nodes_somenode.initOperations(_Tosca_nodes_somenode__Tosca_nodes_somenode);

			Fragments._Tosca_nodes_somenode2__MixinBase.initOperations(_Tosca_nodes_somenode2__MixinBase);
			Fragments._Tosca_nodes_somenode2__OclAny.initOperations(_Tosca_nodes_somenode2__OclAny);
			Fragments._Tosca_nodes_somenode2__OclElement.initOperations(_Tosca_nodes_somenode2__OclElement);
			Fragments._Tosca_nodes_somenode2__Tosca_capabilities_container.initOperations(_Tosca_nodes_somenode2__Tosca_capabilities_container);
			Fragments._Tosca_nodes_somenode2__Tosca_capabilities_containerchild.initOperations(_Tosca_nodes_somenode2__Tosca_capabilities_containerchild);
			Fragments._Tosca_nodes_somenode2__Tosca_capabilities_node.initOperations(_Tosca_nodes_somenode2__Tosca_capabilities_node);
			Fragments._Tosca_nodes_somenode2__Tosca_capabilities_root.initOperations(_Tosca_nodes_somenode2__Tosca_capabilities_root);
			Fragments._Tosca_nodes_somenode2__Tosca_nodes_root.initOperations(_Tosca_nodes_somenode2__Tosca_nodes_root);
			Fragments._Tosca_nodes_somenode2__Tosca_nodes_somenode2.initOperations(_Tosca_nodes_somenode2__Tosca_nodes_somenode2);

			Fragments._Tosca_nodes_webapplication_paypalpizzastore__MixinBase.initOperations(_Tosca_nodes_webapplication_paypalpizzastore__MixinBase);
			Fragments._Tosca_nodes_webapplication_paypalpizzastore__OclAny.initOperations(_Tosca_nodes_webapplication_paypalpizzastore__OclAny);
			Fragments._Tosca_nodes_webapplication_paypalpizzastore__OclElement.initOperations(_Tosca_nodes_webapplication_paypalpizzastore__OclElement);
			Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_node.initOperations(_Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_node);
			Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_root.initOperations(_Tosca_nodes_webapplication_paypalpizzastore__Tosca_capabilities_root);
			Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_root.initOperations(_Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_root);
			Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication.initOperations(_Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication);
			Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication_paypalpizzastore.initOperations(_Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication_paypalpizzastore);

			Fragments._Tosca_nodes_wordpress__MixinBase.initOperations(_Tosca_nodes_wordpress__MixinBase);
			Fragments._Tosca_nodes_wordpress__OclAny.initOperations(_Tosca_nodes_wordpress__OclAny);
			Fragments._Tosca_nodes_wordpress__OclElement.initOperations(_Tosca_nodes_wordpress__OclElement);
			Fragments._Tosca_nodes_wordpress__Tosca_capabilities_endpoint.initOperations(_Tosca_nodes_wordpress__Tosca_capabilities_endpoint);
			Fragments._Tosca_nodes_wordpress__Tosca_capabilities_node.initOperations(_Tosca_nodes_wordpress__Tosca_capabilities_node);
			Fragments._Tosca_nodes_wordpress__Tosca_capabilities_root.initOperations(_Tosca_nodes_wordpress__Tosca_capabilities_root);
			Fragments._Tosca_nodes_wordpress__Tosca_nodes_root.initOperations(_Tosca_nodes_wordpress__Tosca_nodes_root);
			Fragments._Tosca_nodes_wordpress__Tosca_nodes_webapplication.initOperations(_Tosca_nodes_wordpress__Tosca_nodes_webapplication);
			Fragments._Tosca_nodes_wordpress__Tosca_nodes_wordpress.initOperations(_Tosca_nodes_wordpress__Tosca_nodes_wordpress);

			Fragments._Tosca_relationships_ha__Dependency.initOperations(_Tosca_relationships_ha__Dependency);
			Fragments._Tosca_relationships_ha__Executiondependency.initOperations(_Tosca_relationships_ha__Executiondependency);
			Fragments._Tosca_relationships_ha__Installationdependency.initOperations(_Tosca_relationships_ha__Installationdependency);
			Fragments._Tosca_relationships_ha__MixinBase.initOperations(_Tosca_relationships_ha__MixinBase);
			Fragments._Tosca_relationships_ha__OclAny.initOperations(_Tosca_relationships_ha__OclAny);
			Fragments._Tosca_relationships_ha__OclElement.initOperations(_Tosca_relationships_ha__OclElement);
			Fragments._Tosca_relationships_ha__Tosca_relationships_ha.initOperations(_Tosca_relationships_ha__Tosca_relationships_ha);
			Fragments._Tosca_relationships_ha__Tosca_relationships_root.initOperations(_Tosca_relationships_ha__Tosca_relationships_root);

			Fragments._Tosca_relationships_network_bindsto__Dependency.initOperations(_Tosca_relationships_network_bindsto__Dependency);
			Fragments._Tosca_relationships_network_bindsto__Executiondependency.initOperations(_Tosca_relationships_network_bindsto__Executiondependency);
			Fragments._Tosca_relationships_network_bindsto__Installationdependency.initOperations(_Tosca_relationships_network_bindsto__Installationdependency);
			Fragments._Tosca_relationships_network_bindsto__MixinBase.initOperations(_Tosca_relationships_network_bindsto__MixinBase);
			Fragments._Tosca_relationships_network_bindsto__OclAny.initOperations(_Tosca_relationships_network_bindsto__OclAny);
			Fragments._Tosca_relationships_network_bindsto__OclElement.initOperations(_Tosca_relationships_network_bindsto__OclElement);
			Fragments._Tosca_relationships_network_bindsto__Tosca_relationships_dependson.initOperations(_Tosca_relationships_network_bindsto__Tosca_relationships_dependson);
			Fragments._Tosca_relationships_network_bindsto__Tosca_relationships_network_bindsto.initOperations(_Tosca_relationships_network_bindsto__Tosca_relationships_network_bindsto);
			Fragments._Tosca_relationships_network_bindsto__Tosca_relationships_root.initOperations(_Tosca_relationships_network_bindsto__Tosca_relationships_root);

			Fragments._Tosca_relationships_network_linksto__Dependency.initOperations(_Tosca_relationships_network_linksto__Dependency);
			Fragments._Tosca_relationships_network_linksto__Executiondependency.initOperations(_Tosca_relationships_network_linksto__Executiondependency);
			Fragments._Tosca_relationships_network_linksto__Installationdependency.initOperations(_Tosca_relationships_network_linksto__Installationdependency);
			Fragments._Tosca_relationships_network_linksto__MixinBase.initOperations(_Tosca_relationships_network_linksto__MixinBase);
			Fragments._Tosca_relationships_network_linksto__OclAny.initOperations(_Tosca_relationships_network_linksto__OclAny);
			Fragments._Tosca_relationships_network_linksto__OclElement.initOperations(_Tosca_relationships_network_linksto__OclElement);
			Fragments._Tosca_relationships_network_linksto__Tosca_relationships_dependson.initOperations(_Tosca_relationships_network_linksto__Tosca_relationships_dependson);
			Fragments._Tosca_relationships_network_linksto__Tosca_relationships_network_linksto.initOperations(_Tosca_relationships_network_linksto__Tosca_relationships_network_linksto);
			Fragments._Tosca_relationships_network_linksto__Tosca_relationships_root.initOperations(_Tosca_relationships_network_linksto__Tosca_relationships_root);

			Fragments._Tosca_relationships_nodecellarhostedonnodejs__Dependency.initOperations(_Tosca_relationships_nodecellarhostedonnodejs__Dependency);
			Fragments._Tosca_relationships_nodecellarhostedonnodejs__Executiondependency.initOperations(_Tosca_relationships_nodecellarhostedonnodejs__Executiondependency);
			Fragments._Tosca_relationships_nodecellarhostedonnodejs__Installationdependency.initOperations(_Tosca_relationships_nodecellarhostedonnodejs__Installationdependency);
			Fragments._Tosca_relationships_nodecellarhostedonnodejs__MixinBase.initOperations(_Tosca_relationships_nodecellarhostedonnodejs__MixinBase);
			Fragments._Tosca_relationships_nodecellarhostedonnodejs__OclAny.initOperations(_Tosca_relationships_nodecellarhostedonnodejs__OclAny);
			Fragments._Tosca_relationships_nodecellarhostedonnodejs__OclElement.initOperations(_Tosca_relationships_nodecellarhostedonnodejs__OclElement);
			Fragments._Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_hostedon.initOperations(_Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_hostedon);
			Fragments._Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_nodecellarhostedonnodejs.initOperations(_Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_nodecellarhostedonnodejs);
			Fragments._Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_root.initOperations(_Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_root);

			Fragments._Tosca_relationships_nodejsconnecttomongo__Dependency.initOperations(_Tosca_relationships_nodejsconnecttomongo__Dependency);
			Fragments._Tosca_relationships_nodejsconnecttomongo__Executiondependency.initOperations(_Tosca_relationships_nodejsconnecttomongo__Executiondependency);
			Fragments._Tosca_relationships_nodejsconnecttomongo__Installationdependency.initOperations(_Tosca_relationships_nodejsconnecttomongo__Installationdependency);
			Fragments._Tosca_relationships_nodejsconnecttomongo__MixinBase.initOperations(_Tosca_relationships_nodejsconnecttomongo__MixinBase);
			Fragments._Tosca_relationships_nodejsconnecttomongo__OclAny.initOperations(_Tosca_relationships_nodejsconnecttomongo__OclAny);
			Fragments._Tosca_relationships_nodejsconnecttomongo__OclElement.initOperations(_Tosca_relationships_nodejsconnecttomongo__OclElement);
			Fragments._Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_connectsto.initOperations(_Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_connectsto);
			Fragments._Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_nodejsconnecttomongo.initOperations(_Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_nodejsconnecttomongo);
			Fragments._Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_root.initOperations(_Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_root);

			Fragments._arrayCredential__OclAny.initOperations(_arrayCredential__OclAny);
			Fragments._arrayCredential__OclElement.initOperations(_arrayCredential__OclElement);
			Fragments._arrayCredential__arrayCredential.initOperations(_arrayCredential__arrayCredential);

			Fragments._arrayPortSpec__OclAny.initOperations(_arrayPortSpec__OclAny);
			Fragments._arrayPortSpec__OclElement.initOperations(_arrayPortSpec__OclElement);
			Fragments._arrayPortSpec__arrayPortSpec.initOperations(_arrayPortSpec__arrayPortSpec);

			Fragments._arrayinteger__OclAny.initOperations(_arrayinteger__OclAny);
			Fragments._arrayinteger__OclElement.initOperations(_arrayinteger__OclElement);
			Fragments._arrayinteger__arrayinteger.initOperations(_arrayinteger__arrayinteger);

			Fragments._arrayversion__OclAny.initOperations(_arrayversion__OclAny);
			Fragments._arrayversion__OclElement.initOperations(_arrayversion__OclElement);
			Fragments._arrayversion__arrayversion.initOperations(_arrayversion__arrayversion);

			Fragments._ip_versionEnum__OclAny.initOperations(_ip_versionEnum__OclAny);
			Fragments._ip_versionEnum__OclElement.initOperations(_ip_versionEnum__OclElement);
			Fragments._ip_versionEnum__OclEnumeration.initOperations(_ip_versionEnum__OclEnumeration);
			Fragments._ip_versionEnum__OclType.initOperations(_ip_versionEnum__OclType);
			Fragments._ip_versionEnum__ip_versionEnum.initOperations(_ip_versionEnum__ip_versionEnum);

			Fragments._storage_pathEnum__OclAny.initOperations(_storage_pathEnum__OclAny);
			Fragments._storage_pathEnum__OclElement.initOperations(_storage_pathEnum__OclElement);
			Fragments._storage_pathEnum__OclEnumeration.initOperations(_storage_pathEnum__OclEnumeration);
			Fragments._storage_pathEnum__OclType.initOperations(_storage_pathEnum__OclType);
			Fragments._storage_pathEnum__storage_pathEnum.initOperations(_storage_pathEnum__storage_pathEnum);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ExtendedtoscaTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Example_databasesubsystem = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Example_queuingsubsystem = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Example_someapp = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Example_transactionsubsystem = {
			ExtendedtoscaTables.Properties._Example_transactionsubsystem__mqServiceIp,
			ExtendedtoscaTables.Properties._Example_transactionsubsystem__receiverPort
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Myattachesto = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mycompany_mytypes_myscalingpolicy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Rsyslog = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Test_relation_connects = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_container_docker = {
			ExtendedtoscaTables.Properties._Tosca_capabilities_container_docker__exposePorts,
			ExtendedtoscaTables.Properties._Tosca_capabilities_container_docker__publishAll,
			ExtendedtoscaTables.Properties._Tosca_capabilities_container_docker__publishPorts,
			ExtendedtoscaTables.Properties._Tosca_capabilities_container_docker__version,
			ExtendedtoscaTables.Properties._Tosca_capabilities_container_docker__volumes
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_containerchild = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_ha = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_indigo_endpoint = {
			ExtendedtoscaTables.Properties._Tosca_capabilities_indigo_endpoint__credential
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_nodejsappcontainer = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_somecap = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_capabilities_somechildcap = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_abstractmongod = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_abstractmysql = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_apache = {
			ExtendedtoscaTables.Properties._Tosca_nodes_apache__documentRoot
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_computewithattrlist = {
			ExtendedtoscaTables.Properties._Tosca_nodes_computewithattrlist__attrList
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_computewithcapwithattr = {
			ExtendedtoscaTables.Properties._Tosca_capabilities_indigo_endpoint__credential
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_computewithprop = {
			ExtendedtoscaTables.Properties._Tosca_nodes_computewithprop__test
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_container_application_docker = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_database_mysql = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_databasewithlistparam = {
			ExtendedtoscaTables.Properties._Tosca_nodes_databasewithlistparam__listProp
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_dbms_mysql = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_hacompute = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_mongod = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_mysql = {
			ExtendedtoscaTables.Properties._Tosca_nodes_mysql__bindAddress,
			ExtendedtoscaTables.Properties._Tosca_nodes_mysql__dbPassword,
			ExtendedtoscaTables.Properties._Tosca_nodes_mysql__dbUser,
			ExtendedtoscaTables.Properties._Tosca_nodes_mysql__storagePath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_network_network = {
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__cidr,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__endIp,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__gatewayIp,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__ipVersion,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__networkId,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__networkName,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__networkType,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__physicalNetwork,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__segmentationId,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_network__startIp
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_network_port = {
			ExtendedtoscaTables.Properties._Tosca_nodes_network_port__ipAddress,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_port__ipRangeEnd,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_port__ipRangeStart,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_port__isDefault,
			ExtendedtoscaTables.Properties._Tosca_nodes_network_port__order
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_nodecellar = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_nodejs = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_nodewithcap = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_nodewithreq = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_php = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_collectd = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_elasticsearch = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_kibana = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_logstash = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_softwarecomponent_rsyslog = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_somenode = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_somenode2 = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_webapplication_paypalpizzastore = {
			ExtendedtoscaTables.Properties._Tosca_nodes_webapplication_paypalpizzastore__githubUrl
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_nodes_wordpress = {
			ExtendedtoscaTables.Properties._Tosca_nodes_wordpress__zipUrl
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_ha = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_network_bindsto = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_network_linksto = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_nodecellarhostedonnodejs = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Tosca_relationships_nodejsconnecttomongo = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayCredential = {
			ExtendedtoscaTables.Properties._arrayCredential__arraycredentialValues
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayPortSpec = {
			ExtendedtoscaTables.Properties._arrayPortSpec__arrayportspecValues
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayinteger = {
			ExtendedtoscaTables.Properties._arrayinteger__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _arrayversion = {
			ExtendedtoscaTables.Properties._arrayversion__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ip_versionEnum = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _storage_pathEnum = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Example_databasesubsystem__Example_databasesubsystem.initProperties(_Example_databasesubsystem);
			Fragments._Example_queuingsubsystem__Example_queuingsubsystem.initProperties(_Example_queuingsubsystem);
			Fragments._Example_someapp__Example_someapp.initProperties(_Example_someapp);
			Fragments._Example_transactionsubsystem__Example_transactionsubsystem.initProperties(_Example_transactionsubsystem);
			Fragments._Myattachesto__Myattachesto.initProperties(_Myattachesto);
			Fragments._Mycompany_mytypes_myscalingpolicy__Mycompany_mytypes_myscalingpolicy.initProperties(_Mycompany_mytypes_myscalingpolicy);
			Fragments._Rsyslog__Rsyslog.initProperties(_Rsyslog);
			Fragments._Test_relation_connects__Test_relation_connects.initProperties(_Test_relation_connects);
			Fragments._Tosca_capabilities_container_docker__Tosca_capabilities_container_docker.initProperties(_Tosca_capabilities_container_docker);
			Fragments._Tosca_capabilities_containerchild__Tosca_capabilities_containerchild.initProperties(_Tosca_capabilities_containerchild);
			Fragments._Tosca_capabilities_ha__Tosca_capabilities_ha.initProperties(_Tosca_capabilities_ha);
			Fragments._Tosca_capabilities_indigo_endpoint__Tosca_capabilities_indigo_endpoint.initProperties(_Tosca_capabilities_indigo_endpoint);
			Fragments._Tosca_capabilities_nodejsappcontainer__Tosca_capabilities_nodejsappcontainer.initProperties(_Tosca_capabilities_nodejsappcontainer);
			Fragments._Tosca_capabilities_somecap__Tosca_capabilities_somecap.initProperties(_Tosca_capabilities_somecap);
			Fragments._Tosca_capabilities_somechildcap__Tosca_capabilities_somechildcap.initProperties(_Tosca_capabilities_somechildcap);
			Fragments._Tosca_nodes_abstractmongod__Tosca_nodes_abstractmongod.initProperties(_Tosca_nodes_abstractmongod);
			Fragments._Tosca_nodes_abstractmysql__Tosca_nodes_abstractmysql.initProperties(_Tosca_nodes_abstractmysql);
			Fragments._Tosca_nodes_apache__Tosca_nodes_apache.initProperties(_Tosca_nodes_apache);
			Fragments._Tosca_nodes_computewithattrlist__Tosca_nodes_computewithattrlist.initProperties(_Tosca_nodes_computewithattrlist);
			Fragments._Tosca_nodes_computewithcapwithattr__Tosca_nodes_computewithcapwithattr.initProperties(_Tosca_nodes_computewithcapwithattr);
			Fragments._Tosca_nodes_computewithprop__Tosca_nodes_computewithprop.initProperties(_Tosca_nodes_computewithprop);
			Fragments._Tosca_nodes_container_application_docker__Tosca_nodes_container_application_docker.initProperties(_Tosca_nodes_container_application_docker);
			Fragments._Tosca_nodes_database_mysql__Tosca_nodes_database_mysql.initProperties(_Tosca_nodes_database_mysql);
			Fragments._Tosca_nodes_databasewithlistparam__Tosca_nodes_databasewithlistparam.initProperties(_Tosca_nodes_databasewithlistparam);
			Fragments._Tosca_nodes_dbms_mysql__Tosca_nodes_dbms_mysql.initProperties(_Tosca_nodes_dbms_mysql);
			Fragments._Tosca_nodes_hacompute__Tosca_nodes_hacompute.initProperties(_Tosca_nodes_hacompute);
			Fragments._Tosca_nodes_mongod__Tosca_nodes_mongod.initProperties(_Tosca_nodes_mongod);
			Fragments._Tosca_nodes_mysql__Tosca_nodes_mysql.initProperties(_Tosca_nodes_mysql);
			Fragments._Tosca_nodes_network_network__Tosca_nodes_network_network.initProperties(_Tosca_nodes_network_network);
			Fragments._Tosca_nodes_network_port__Tosca_nodes_network_port.initProperties(_Tosca_nodes_network_port);
			Fragments._Tosca_nodes_nodecellar__Tosca_nodes_nodecellar.initProperties(_Tosca_nodes_nodecellar);
			Fragments._Tosca_nodes_nodejs__Tosca_nodes_nodejs.initProperties(_Tosca_nodes_nodejs);
			Fragments._Tosca_nodes_nodewithcap__Tosca_nodes_nodewithcap.initProperties(_Tosca_nodes_nodewithcap);
			Fragments._Tosca_nodes_nodewithreq__Tosca_nodes_nodewithreq.initProperties(_Tosca_nodes_nodewithreq);
			Fragments._Tosca_nodes_php__Tosca_nodes_php.initProperties(_Tosca_nodes_php);
			Fragments._Tosca_nodes_softwarecomponent_collectd__Tosca_nodes_softwarecomponent_collectd.initProperties(_Tosca_nodes_softwarecomponent_collectd);
			Fragments._Tosca_nodes_softwarecomponent_elasticsearch__Tosca_nodes_softwarecomponent_elasticsearch.initProperties(_Tosca_nodes_softwarecomponent_elasticsearch);
			Fragments._Tosca_nodes_softwarecomponent_kibana__Tosca_nodes_softwarecomponent_kibana.initProperties(_Tosca_nodes_softwarecomponent_kibana);
			Fragments._Tosca_nodes_softwarecomponent_logstash__Tosca_nodes_softwarecomponent_logstash.initProperties(_Tosca_nodes_softwarecomponent_logstash);
			Fragments._Tosca_nodes_softwarecomponent_rsyslog__Tosca_nodes_softwarecomponent_rsyslog.initProperties(_Tosca_nodes_softwarecomponent_rsyslog);
			Fragments._Tosca_nodes_somenode__Tosca_nodes_somenode.initProperties(_Tosca_nodes_somenode);
			Fragments._Tosca_nodes_somenode2__Tosca_nodes_somenode2.initProperties(_Tosca_nodes_somenode2);
			Fragments._Tosca_nodes_webapplication_paypalpizzastore__Tosca_nodes_webapplication_paypalpizzastore.initProperties(_Tosca_nodes_webapplication_paypalpizzastore);
			Fragments._Tosca_nodes_wordpress__Tosca_nodes_wordpress.initProperties(_Tosca_nodes_wordpress);
			Fragments._Tosca_relationships_ha__Tosca_relationships_ha.initProperties(_Tosca_relationships_ha);
			Fragments._Tosca_relationships_network_bindsto__Tosca_relationships_network_bindsto.initProperties(_Tosca_relationships_network_bindsto);
			Fragments._Tosca_relationships_network_linksto__Tosca_relationships_network_linksto.initProperties(_Tosca_relationships_network_linksto);
			Fragments._Tosca_relationships_nodecellarhostedonnodejs__Tosca_relationships_nodecellarhostedonnodejs.initProperties(_Tosca_relationships_nodecellarhostedonnodejs);
			Fragments._Tosca_relationships_nodejsconnecttomongo__Tosca_relationships_nodejsconnecttomongo.initProperties(_Tosca_relationships_nodejsconnecttomongo);
			Fragments._arrayCredential__arrayCredential.initProperties(_arrayCredential);
			Fragments._arrayPortSpec__arrayPortSpec.initProperties(_arrayPortSpec);
			Fragments._arrayinteger__arrayinteger.initProperties(_arrayinteger);
			Fragments._arrayversion__arrayversion.initProperties(_arrayversion);
			Fragments._ip_versionEnum__ip_versionEnum.initProperties(_ip_versionEnum);
			Fragments._storage_pathEnum__storage_pathEnum.initProperties(_storage_pathEnum);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ExtendedtoscaTables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ip_versionEnum__IPv4 = new EcoreExecutorEnumerationLiteral(ExtendedtoscaPackage.Literals.IP_VERSION_ENUM.getEEnumLiteral("IPv4"), Types._ip_versionEnum, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ip_versionEnum__IPv6 = new EcoreExecutorEnumerationLiteral(ExtendedtoscaPackage.Literals.IP_VERSION_ENUM.getEEnumLiteral("IPv6"), Types._ip_versionEnum, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ip_versionEnum = {
			_ip_versionEnum__IPv4,
			_ip_versionEnum__IPv6
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _storage_pathEnum__mountedStorage = new EcoreExecutorEnumerationLiteral(ExtendedtoscaPackage.Literals.STORAGE_PATH_ENUM.getEEnumLiteral("mountedStorage"), Types._storage_pathEnum, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _storage_pathEnum__varmysql = new EcoreExecutorEnumerationLiteral(ExtendedtoscaPackage.Literals.STORAGE_PATH_ENUM.getEEnumLiteral("varmysql"), Types._storage_pathEnum, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _storage_pathEnum = {
			_storage_pathEnum__mountedStorage,
			_storage_pathEnum__varmysql
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ip_versionEnum.initLiterals(_ip_versionEnum);
			Types._storage_pathEnum.initLiterals(_storage_pathEnum);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ExtendedtoscaTables::EnumerationLiterals and all preceding sub-packages.
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
