/**
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
 */
package extendedtosca.impl;

import extendedtosca.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedtoscaFactoryImpl extends EFactoryImpl implements ExtendedtoscaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtendedtoscaFactory init() {
		try {
			ExtendedtoscaFactory theExtendedtoscaFactory = (ExtendedtoscaFactory)EPackage.Registry.INSTANCE.getEFactory(ExtendedtoscaPackage.eNS_URI);
			if (theExtendedtoscaFactory != null) {
				return theExtendedtoscaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtendedtoscaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedtoscaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExtendedtoscaPackage.ARRAYSTRING: return createarraystring();
			case ExtendedtoscaPackage.NETWORK_INFO: return createNetworkInfo();
			case ExtendedtoscaPackage.PORT_INFO: return createPortInfo();
			case ExtendedtoscaPackage.CREDENTIAL: return createCredential();
			case ExtendedtoscaPackage.PORT_SPEC: return createPortSpec();
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL: return createarrayCredential();
			case ExtendedtoscaPackage.ARRAYINTEGER: return createarrayinteger();
			case ExtendedtoscaPackage.ARRAY_PORT_SPEC: return createarrayPortSpec();
			case ExtendedtoscaPackage.ARRAYVERSION: return createarrayversion();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ROOT: return createTosca_capabilities_root();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_NODE: return createTosca_capabilities_node();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT: return createTosca_capabilities_endpoint();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE: return createTosca_capabilities_scalable();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_NETWORK_BINDABLE: return createTosca_capabilities_network_bindable();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER: return createTosca_capabilities_container();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT_DATABASE: return createTosca_capabilities_endpoint_database();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC: return createTosca_capabilities_endpoint_public();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT_ADMIN: return createTosca_capabilities_endpoint_admin();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM: return createTosca_capabilities_operatingsystem();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ATTACHMENT: return createTosca_capabilities_attachment();
			case ExtendedtoscaPackage.TOSCA_NODES_ROOT: return createTosca_nodes_root();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION: return createTosca_nodes_webapplication();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT: return createTosca_nodes_softwarecomponent();
			case ExtendedtoscaPackage.TOSCA_NODES_DBMS: return createTosca_nodes_dbms();
			case ExtendedtoscaPackage.TOSCA_NODES_OBJECTSTORAGE: return createTosca_nodes_objectstorage();
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTE: return createTosca_nodes_compute();
			case ExtendedtoscaPackage.TOSCA_NODES_LOADBALANCER: return createTosca_nodes_loadbalancer();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER: return createTosca_nodes_webserver();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE: return createTosca_nodes_database();
			case ExtendedtoscaPackage.TOSCA_NODES_CONTAINER_APPLICATION: return createTosca_nodes_container_application();
			case ExtendedtoscaPackage.TOSCA_NODES_CONTAINER_RUNTIME: return createTosca_nodes_container_runtime();
			case ExtendedtoscaPackage.TOSCA_NODES_BLOCKSTORAGE: return createTosca_nodes_blockstorage();
			case ExtendedtoscaPackage.TOSCA_POLICIES_ROOT: return createTosca_policies_root();
			case ExtendedtoscaPackage.TOSCA_POLICIES_UPDATE: return createTosca_policies_update();
			case ExtendedtoscaPackage.TOSCA_POLICIES_PLACEMENT: return createTosca_policies_placement();
			case ExtendedtoscaPackage.TOSCA_POLICIES_SCALING: return createTosca_policies_scaling();
			case ExtendedtoscaPackage.TOSCA_POLICIES_PERFORMANCE: return createTosca_policies_performance();
			case ExtendedtoscaPackage.TOSCA_GROUPS_ROOT: return createTosca_groups_root();
			case ExtendedtoscaPackage.TOSCA_INTERFACES_ROOT: return createTosca_interfaces_root();
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE: return createTosca_interfaces_relationship_configure();
			case ExtendedtoscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD: return createTosca_interfaces_node_lifecycle_standard();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT: return createTosca_relationships_root();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_CONNECTSTO: return createTosca_relationships_connectsto();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROUTESTO: return createTosca_relationships_routesto();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO: return createTosca_relationships_attachesto();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_HOSTEDON: return createTosca_relationships_hostedon();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON: return createTosca_relationships_dependson();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_INDIGO_ENDPOINT: return createTosca_capabilities_indigo_endpoint();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECAP: return createTosca_capabilities_somecap();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_HA: return createTosca_capabilities_ha();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINERCHILD: return createTosca_capabilities_containerchild();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECHILDCAP: return createTosca_capabilities_somechildcap();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE_MYSQL: return createTosca_nodes_database_mysql();
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHPROP: return createTosca_nodes_computewithprop();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH: return createTosca_nodes_softwarecomponent_elasticsearch();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM: return createTosca_nodes_databasewithlistparam();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE: return createTosca_nodes_webapplication_paypalpizzastore();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS: return createTosca_nodes_webapplication_wordpress();
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP: return createTosca_nodes_nodewithcap();
			case ExtendedtoscaPackage.TOSCA_NODES_CONTAINER_APPLICATION_DOCKER: return createTosca_nodes_container_application_docker();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_KIBANA: return createTosca_nodes_softwarecomponent_kibana();
			case ExtendedtoscaPackage.RSYSLOG: return createRsyslog();
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST: return createTosca_nodes_computewithattrlist();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH: return createTosca_nodes_softwarecomponent_logstash();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD: return createTosca_nodes_softwarecomponent_collectd();
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHCAPWITHATTR: return createTosca_nodes_computewithcapwithattr();
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHREQ: return createTosca_nodes_nodewithreq();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG: return createTosca_nodes_softwarecomponent_rsyslog();
			case ExtendedtoscaPackage.TOSCA_NODES_HACOMPUTE: return createTosca_nodes_hacompute();
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE: return createTosca_nodes_somenode();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER: return createTosca_capabilities_container_docker();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER_NODEJS: return createTosca_nodes_webserver_nodejs();
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE2: return createTosca_nodes_somenode2();
			case ExtendedtoscaPackage.TOSCA_NODES_DBMS_MYSQL: return createTosca_nodes_dbms_mysql();
			case ExtendedtoscaPackage.MYCOMPANY_MYTYPES_MYSCALINGPOLICY: return createMycompany_mytypes_myscalingpolicy();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_HA: return createTosca_relationships_ha();
			case ExtendedtoscaPackage.TEST_RELATION_CONNECTS: return createTest_relation_connects();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExtendedtoscaPackage.PROTOCOL_ENUM:
				return createprotocolEnumFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.INITIATOR_ENUM:
				return createinitiatorEnumFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.STRING:
				return createstringFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.STRING_MIN_ONE:
				return createstringMinOneFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.BOOLEAN:
				return createbooleanFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.BYTE:
				return createbyteFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.DOUBLE:
				return createdoubleFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.FLOAT:
				return createfloatFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.INTEGER:
				return createintegerFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.INTEGER_MIN_ONE:
				return createintegerMinOneFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.LONG:
				return createlongFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.SHORT:
				return createshortFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.MAP:
				return createmapFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.VERSION:
				return createversionFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.RANGE:
				return createrangeFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.TOSCADATATYPESNETWORK_PORT_DEF:
				return createtoscadatatypesnetworkPortDefFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.SCALAR_FREQUENCY:
				return createscalarFrequencyFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.SCALAR_SIZE_MIN_ONE_MB:
				return createscalarSizeMinOneMBFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.SCALAR_SIZE_MIN_ZERO_GB:
				return createscalarSizeMinZeroGBFromString(eDataType, initialValue);
			case ExtendedtoscaPackage.SCALAR_SIZE_MIN_ZERO_MB:
				return createscalarSizeMinZeroMBFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExtendedtoscaPackage.PROTOCOL_ENUM:
				return convertprotocolEnumToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.INITIATOR_ENUM:
				return convertinitiatorEnumToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.STRING:
				return convertstringToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.STRING_MIN_ONE:
				return convertstringMinOneToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.BOOLEAN:
				return convertbooleanToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.BYTE:
				return convertbyteToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.DOUBLE:
				return convertdoubleToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.FLOAT:
				return convertfloatToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.INTEGER:
				return convertintegerToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.INTEGER_MIN_ONE:
				return convertintegerMinOneToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.LONG:
				return convertlongToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.SHORT:
				return convertshortToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.MAP:
				return convertmapToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.VERSION:
				return convertversionToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.RANGE:
				return convertrangeToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.TOSCADATATYPESNETWORK_PORT_DEF:
				return converttoscadatatypesnetworkPortDefToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.SCALAR_FREQUENCY:
				return convertscalarFrequencyToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.SCALAR_SIZE_MIN_ONE_MB:
				return convertscalarSizeMinOneMBToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.SCALAR_SIZE_MIN_ZERO_GB:
				return convertscalarSizeMinZeroGBToString(eDataType, instanceValue);
			case ExtendedtoscaPackage.SCALAR_SIZE_MIN_ZERO_MB:
				return convertscalarSizeMinZeroMBToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arraystring createarraystring() {
		arraystringImpl arraystring = new arraystringImpl();
		return arraystring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInfo createNetworkInfo() {
		NetworkInfoImpl networkInfo = new NetworkInfoImpl();
		return networkInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInfo createPortInfo() {
		PortInfoImpl portInfo = new PortInfoImpl();
		return portInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credential createCredential() {
		CredentialImpl credential = new CredentialImpl();
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortSpec createPortSpec() {
		PortSpecImpl portSpec = new PortSpecImpl();
		return portSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayCredential createarrayCredential() {
		arrayCredentialImpl arrayCredential = new arrayCredentialImpl();
		return arrayCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayinteger createarrayinteger() {
		arrayintegerImpl arrayinteger = new arrayintegerImpl();
		return arrayinteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayPortSpec createarrayPortSpec() {
		arrayPortSpecImpl arrayPortSpec = new arrayPortSpecImpl();
		return arrayPortSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayversion createarrayversion() {
		arrayversionImpl arrayversion = new arrayversionImpl();
		return arrayversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_root createTosca_capabilities_root() {
		Tosca_capabilities_rootImpl tosca_capabilities_root = new Tosca_capabilities_rootImpl();
		return tosca_capabilities_root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_node createTosca_capabilities_node() {
		Tosca_capabilities_nodeImpl tosca_capabilities_node = new Tosca_capabilities_nodeImpl();
		return tosca_capabilities_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_endpoint createTosca_capabilities_endpoint() {
		Tosca_capabilities_endpointImpl tosca_capabilities_endpoint = new Tosca_capabilities_endpointImpl();
		return tosca_capabilities_endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_scalable createTosca_capabilities_scalable() {
		Tosca_capabilities_scalableImpl tosca_capabilities_scalable = new Tosca_capabilities_scalableImpl();
		return tosca_capabilities_scalable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_network_bindable createTosca_capabilities_network_bindable() {
		Tosca_capabilities_network_bindableImpl tosca_capabilities_network_bindable = new Tosca_capabilities_network_bindableImpl();
		return tosca_capabilities_network_bindable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_container createTosca_capabilities_container() {
		Tosca_capabilities_containerImpl tosca_capabilities_container = new Tosca_capabilities_containerImpl();
		return tosca_capabilities_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_endpoint_database createTosca_capabilities_endpoint_database() {
		Tosca_capabilities_endpoint_databaseImpl tosca_capabilities_endpoint_database = new Tosca_capabilities_endpoint_databaseImpl();
		return tosca_capabilities_endpoint_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_endpoint_public createTosca_capabilities_endpoint_public() {
		Tosca_capabilities_endpoint_publicImpl tosca_capabilities_endpoint_public = new Tosca_capabilities_endpoint_publicImpl();
		return tosca_capabilities_endpoint_public;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_endpoint_admin createTosca_capabilities_endpoint_admin() {
		Tosca_capabilities_endpoint_adminImpl tosca_capabilities_endpoint_admin = new Tosca_capabilities_endpoint_adminImpl();
		return tosca_capabilities_endpoint_admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_operatingsystem createTosca_capabilities_operatingsystem() {
		Tosca_capabilities_operatingsystemImpl tosca_capabilities_operatingsystem = new Tosca_capabilities_operatingsystemImpl();
		return tosca_capabilities_operatingsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_attachment createTosca_capabilities_attachment() {
		Tosca_capabilities_attachmentImpl tosca_capabilities_attachment = new Tosca_capabilities_attachmentImpl();
		return tosca_capabilities_attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_root createTosca_nodes_root() {
		Tosca_nodes_rootImpl tosca_nodes_root = new Tosca_nodes_rootImpl();
		return tosca_nodes_root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_webapplication createTosca_nodes_webapplication() {
		Tosca_nodes_webapplicationImpl tosca_nodes_webapplication = new Tosca_nodes_webapplicationImpl();
		return tosca_nodes_webapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_softwarecomponent createTosca_nodes_softwarecomponent() {
		Tosca_nodes_softwarecomponentImpl tosca_nodes_softwarecomponent = new Tosca_nodes_softwarecomponentImpl();
		return tosca_nodes_softwarecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_dbms createTosca_nodes_dbms() {
		Tosca_nodes_dbmsImpl tosca_nodes_dbms = new Tosca_nodes_dbmsImpl();
		return tosca_nodes_dbms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_objectstorage createTosca_nodes_objectstorage() {
		Tosca_nodes_objectstorageImpl tosca_nodes_objectstorage = new Tosca_nodes_objectstorageImpl();
		return tosca_nodes_objectstorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_compute createTosca_nodes_compute() {
		Tosca_nodes_computeImpl tosca_nodes_compute = new Tosca_nodes_computeImpl();
		return tosca_nodes_compute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_loadbalancer createTosca_nodes_loadbalancer() {
		Tosca_nodes_loadbalancerImpl tosca_nodes_loadbalancer = new Tosca_nodes_loadbalancerImpl();
		return tosca_nodes_loadbalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_webserver createTosca_nodes_webserver() {
		Tosca_nodes_webserverImpl tosca_nodes_webserver = new Tosca_nodes_webserverImpl();
		return tosca_nodes_webserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_database createTosca_nodes_database() {
		Tosca_nodes_databaseImpl tosca_nodes_database = new Tosca_nodes_databaseImpl();
		return tosca_nodes_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_container_application createTosca_nodes_container_application() {
		Tosca_nodes_container_applicationImpl tosca_nodes_container_application = new Tosca_nodes_container_applicationImpl();
		return tosca_nodes_container_application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_container_runtime createTosca_nodes_container_runtime() {
		Tosca_nodes_container_runtimeImpl tosca_nodes_container_runtime = new Tosca_nodes_container_runtimeImpl();
		return tosca_nodes_container_runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_blockstorage createTosca_nodes_blockstorage() {
		Tosca_nodes_blockstorageImpl tosca_nodes_blockstorage = new Tosca_nodes_blockstorageImpl();
		return tosca_nodes_blockstorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_policies_root createTosca_policies_root() {
		Tosca_policies_rootImpl tosca_policies_root = new Tosca_policies_rootImpl();
		return tosca_policies_root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_policies_update createTosca_policies_update() {
		Tosca_policies_updateImpl tosca_policies_update = new Tosca_policies_updateImpl();
		return tosca_policies_update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_policies_placement createTosca_policies_placement() {
		Tosca_policies_placementImpl tosca_policies_placement = new Tosca_policies_placementImpl();
		return tosca_policies_placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_policies_scaling createTosca_policies_scaling() {
		Tosca_policies_scalingImpl tosca_policies_scaling = new Tosca_policies_scalingImpl();
		return tosca_policies_scaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_policies_performance createTosca_policies_performance() {
		Tosca_policies_performanceImpl tosca_policies_performance = new Tosca_policies_performanceImpl();
		return tosca_policies_performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_groups_root createTosca_groups_root() {
		Tosca_groups_rootImpl tosca_groups_root = new Tosca_groups_rootImpl();
		return tosca_groups_root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_interfaces_root createTosca_interfaces_root() {
		Tosca_interfaces_rootImpl tosca_interfaces_root = new Tosca_interfaces_rootImpl();
		return tosca_interfaces_root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_interfaces_relationship_configure createTosca_interfaces_relationship_configure() {
		Tosca_interfaces_relationship_configureImpl tosca_interfaces_relationship_configure = new Tosca_interfaces_relationship_configureImpl();
		return tosca_interfaces_relationship_configure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_interfaces_node_lifecycle_standard createTosca_interfaces_node_lifecycle_standard() {
		Tosca_interfaces_node_lifecycle_standardImpl tosca_interfaces_node_lifecycle_standard = new Tosca_interfaces_node_lifecycle_standardImpl();
		return tosca_interfaces_node_lifecycle_standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_relationships_root createTosca_relationships_root() {
		Tosca_relationships_rootImpl tosca_relationships_root = new Tosca_relationships_rootImpl();
		return tosca_relationships_root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_relationships_connectsto createTosca_relationships_connectsto() {
		Tosca_relationships_connectstoImpl tosca_relationships_connectsto = new Tosca_relationships_connectstoImpl();
		return tosca_relationships_connectsto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_relationships_routesto createTosca_relationships_routesto() {
		Tosca_relationships_routestoImpl tosca_relationships_routesto = new Tosca_relationships_routestoImpl();
		return tosca_relationships_routesto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_relationships_attachesto createTosca_relationships_attachesto() {
		Tosca_relationships_attachestoImpl tosca_relationships_attachesto = new Tosca_relationships_attachestoImpl();
		return tosca_relationships_attachesto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_relationships_hostedon createTosca_relationships_hostedon() {
		Tosca_relationships_hostedonImpl tosca_relationships_hostedon = new Tosca_relationships_hostedonImpl();
		return tosca_relationships_hostedon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_relationships_dependson createTosca_relationships_dependson() {
		Tosca_relationships_dependsonImpl tosca_relationships_dependson = new Tosca_relationships_dependsonImpl();
		return tosca_relationships_dependson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_indigo_endpoint createTosca_capabilities_indigo_endpoint() {
		Tosca_capabilities_indigo_endpointImpl tosca_capabilities_indigo_endpoint = new Tosca_capabilities_indigo_endpointImpl();
		return tosca_capabilities_indigo_endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_somecap createTosca_capabilities_somecap() {
		Tosca_capabilities_somecapImpl tosca_capabilities_somecap = new Tosca_capabilities_somecapImpl();
		return tosca_capabilities_somecap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_ha createTosca_capabilities_ha() {
		Tosca_capabilities_haImpl tosca_capabilities_ha = new Tosca_capabilities_haImpl();
		return tosca_capabilities_ha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_containerchild createTosca_capabilities_containerchild() {
		Tosca_capabilities_containerchildImpl tosca_capabilities_containerchild = new Tosca_capabilities_containerchildImpl();
		return tosca_capabilities_containerchild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_somechildcap createTosca_capabilities_somechildcap() {
		Tosca_capabilities_somechildcapImpl tosca_capabilities_somechildcap = new Tosca_capabilities_somechildcapImpl();
		return tosca_capabilities_somechildcap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_database_mysql createTosca_nodes_database_mysql() {
		Tosca_nodes_database_mysqlImpl tosca_nodes_database_mysql = new Tosca_nodes_database_mysqlImpl();
		return tosca_nodes_database_mysql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_computewithprop createTosca_nodes_computewithprop() {
		Tosca_nodes_computewithpropImpl tosca_nodes_computewithprop = new Tosca_nodes_computewithpropImpl();
		return tosca_nodes_computewithprop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_softwarecomponent_elasticsearch createTosca_nodes_softwarecomponent_elasticsearch() {
		Tosca_nodes_softwarecomponent_elasticsearchImpl tosca_nodes_softwarecomponent_elasticsearch = new Tosca_nodes_softwarecomponent_elasticsearchImpl();
		return tosca_nodes_softwarecomponent_elasticsearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_databasewithlistparam createTosca_nodes_databasewithlistparam() {
		Tosca_nodes_databasewithlistparamImpl tosca_nodes_databasewithlistparam = new Tosca_nodes_databasewithlistparamImpl();
		return tosca_nodes_databasewithlistparam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_webapplication_paypalpizzastore createTosca_nodes_webapplication_paypalpizzastore() {
		Tosca_nodes_webapplication_paypalpizzastoreImpl tosca_nodes_webapplication_paypalpizzastore = new Tosca_nodes_webapplication_paypalpizzastoreImpl();
		return tosca_nodes_webapplication_paypalpizzastore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_webapplication_wordpress createTosca_nodes_webapplication_wordpress() {
		Tosca_nodes_webapplication_wordpressImpl tosca_nodes_webapplication_wordpress = new Tosca_nodes_webapplication_wordpressImpl();
		return tosca_nodes_webapplication_wordpress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_nodewithcap createTosca_nodes_nodewithcap() {
		Tosca_nodes_nodewithcapImpl tosca_nodes_nodewithcap = new Tosca_nodes_nodewithcapImpl();
		return tosca_nodes_nodewithcap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_container_application_docker createTosca_nodes_container_application_docker() {
		Tosca_nodes_container_application_dockerImpl tosca_nodes_container_application_docker = new Tosca_nodes_container_application_dockerImpl();
		return tosca_nodes_container_application_docker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_softwarecomponent_kibana createTosca_nodes_softwarecomponent_kibana() {
		Tosca_nodes_softwarecomponent_kibanaImpl tosca_nodes_softwarecomponent_kibana = new Tosca_nodes_softwarecomponent_kibanaImpl();
		return tosca_nodes_softwarecomponent_kibana;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rsyslog createRsyslog() {
		RsyslogImpl rsyslog = new RsyslogImpl();
		return rsyslog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_computewithattrlist createTosca_nodes_computewithattrlist() {
		Tosca_nodes_computewithattrlistImpl tosca_nodes_computewithattrlist = new Tosca_nodes_computewithattrlistImpl();
		return tosca_nodes_computewithattrlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_softwarecomponent_logstash createTosca_nodes_softwarecomponent_logstash() {
		Tosca_nodes_softwarecomponent_logstashImpl tosca_nodes_softwarecomponent_logstash = new Tosca_nodes_softwarecomponent_logstashImpl();
		return tosca_nodes_softwarecomponent_logstash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_softwarecomponent_collectd createTosca_nodes_softwarecomponent_collectd() {
		Tosca_nodes_softwarecomponent_collectdImpl tosca_nodes_softwarecomponent_collectd = new Tosca_nodes_softwarecomponent_collectdImpl();
		return tosca_nodes_softwarecomponent_collectd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_computewithcapwithattr createTosca_nodes_computewithcapwithattr() {
		Tosca_nodes_computewithcapwithattrImpl tosca_nodes_computewithcapwithattr = new Tosca_nodes_computewithcapwithattrImpl();
		return tosca_nodes_computewithcapwithattr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_nodewithreq createTosca_nodes_nodewithreq() {
		Tosca_nodes_nodewithreqImpl tosca_nodes_nodewithreq = new Tosca_nodes_nodewithreqImpl();
		return tosca_nodes_nodewithreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_softwarecomponent_rsyslog createTosca_nodes_softwarecomponent_rsyslog() {
		Tosca_nodes_softwarecomponent_rsyslogImpl tosca_nodes_softwarecomponent_rsyslog = new Tosca_nodes_softwarecomponent_rsyslogImpl();
		return tosca_nodes_softwarecomponent_rsyslog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_hacompute createTosca_nodes_hacompute() {
		Tosca_nodes_hacomputeImpl tosca_nodes_hacompute = new Tosca_nodes_hacomputeImpl();
		return tosca_nodes_hacompute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_somenode createTosca_nodes_somenode() {
		Tosca_nodes_somenodeImpl tosca_nodes_somenode = new Tosca_nodes_somenodeImpl();
		return tosca_nodes_somenode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_container_docker createTosca_capabilities_container_docker() {
		Tosca_capabilities_container_dockerImpl tosca_capabilities_container_docker = new Tosca_capabilities_container_dockerImpl();
		return tosca_capabilities_container_docker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_webserver_nodejs createTosca_nodes_webserver_nodejs() {
		Tosca_nodes_webserver_nodejsImpl tosca_nodes_webserver_nodejs = new Tosca_nodes_webserver_nodejsImpl();
		return tosca_nodes_webserver_nodejs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_somenode2 createTosca_nodes_somenode2() {
		Tosca_nodes_somenode2Impl tosca_nodes_somenode2 = new Tosca_nodes_somenode2Impl();
		return tosca_nodes_somenode2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_nodes_dbms_mysql createTosca_nodes_dbms_mysql() {
		Tosca_nodes_dbms_mysqlImpl tosca_nodes_dbms_mysql = new Tosca_nodes_dbms_mysqlImpl();
		return tosca_nodes_dbms_mysql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mycompany_mytypes_myscalingpolicy createMycompany_mytypes_myscalingpolicy() {
		Mycompany_mytypes_myscalingpolicyImpl mycompany_mytypes_myscalingpolicy = new Mycompany_mytypes_myscalingpolicyImpl();
		return mycompany_mytypes_myscalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_relationships_ha createTosca_relationships_ha() {
		Tosca_relationships_haImpl tosca_relationships_ha = new Tosca_relationships_haImpl();
		return tosca_relationships_ha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test_relation_connects createTest_relation_connects() {
		Test_relation_connectsImpl test_relation_connects = new Test_relation_connectsImpl();
		return test_relation_connects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public protocolEnum createprotocolEnumFromString(EDataType eDataType, String initialValue) {
		protocolEnum result = protocolEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertprotocolEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public initiatorEnum createinitiatorEnumFromString(EDataType eDataType, String initialValue) {
		initiatorEnum result = initiatorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertinitiatorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createstringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertstringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createstringMinOneFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertstringMinOneToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createbooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertbooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createbyteFromString(EDataType eDataType, String initialValue) {
		return (Byte)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertbyteToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createdoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createfloatFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertfloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createintegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertintegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createintegerMinOneFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertintegerMinOneToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createlongFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createshortFromString(EDataType eDataType, String initialValue) {
		return (Short)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertshortToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createmapFromString(EDataType eDataType, String initialValue) {
		return (Map)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createversionFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertversionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createrangeFromString(EDataType eDataType, String initialValue) {
		return (Short)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertrangeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createtoscadatatypesnetworkPortDefFromString(EDataType eDataType, String initialValue) {
		return (Short)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttoscadatatypesnetworkPortDefToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createscalarFrequencyFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertscalarFrequencyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createscalarSizeMinOneMBFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertscalarSizeMinOneMBToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createscalarSizeMinZeroGBFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertscalarSizeMinZeroGBToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createscalarSizeMinZeroMBFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertscalarSizeMinZeroMBToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedtoscaPackage getExtendedtoscaPackage() {
		return (ExtendedtoscaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtendedtoscaPackage getPackage() {
		return ExtendedtoscaPackage.eINSTANCE;
	}

} //ExtendedtoscaFactoryImpl
