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
package org.eclipse.cmf.occi.tosca.impl;

import java.util.Map;

import org.eclipse.cmf.occi.tosca.*;

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
public class ToscaFactoryImpl extends EFactoryImpl implements ToscaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToscaFactory init() {
		try {
			ToscaFactory theToscaFactory = (ToscaFactory)EPackage.Registry.INSTANCE.getEFactory(ToscaPackage.eNS_URI);
			if (theToscaFactory != null) {
				return theToscaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToscaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaFactoryImpl() {
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
			case ToscaPackage.ARRAY_STRING: return createarrayString();
			case ToscaPackage.ARRAY_BOOLEAN: return createarrayBoolean();
			case ToscaPackage.ARRAY_BYTE: return createarrayByte();
			case ToscaPackage.ARRAY_DOUBLE: return createarrayDouble();
			case ToscaPackage.ARRAY_FLOAT: return createarrayFloat();
			case ToscaPackage.ARRAY_INTEGER: return createarrayInteger();
			case ToscaPackage.ARRAY_LONG: return createarrayLong();
			case ToscaPackage.ARRAY_SHORT: return createarrayShort();
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO: return createtoscadatatypesnetworkNetworkInfo();
			case ToscaPackage.TOSCADATATYPESNETWORK_PORT_INFO: return createtoscadatatypesnetworkPortInfo();
			case ToscaPackage.TOSCADATATYPES_CREDENTIAL: return createtoscadatatypesCredential();
			case ToscaPackage.TOSCADATATYPESNETWORK_PORT_SPEC: return createtoscadatatypesnetworkPortSpec();
			case ToscaPackage.TOSCA_CAPABILITIES_ROOT: return createTosca_capabilities_root();
			case ToscaPackage.TOSCA_CAPABILITIES_NODE: return createTosca_capabilities_node();
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT: return createTosca_capabilities_endpoint();
			case ToscaPackage.TOSCA_CAPABILITIES_SCALABLE: return createTosca_capabilities_scalable();
			case ToscaPackage.TOSCA_CAPABILITIES_NETWORK_BINDABLE: return createTosca_capabilities_network_bindable();
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER: return createTosca_capabilities_container();
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_DATABASE: return createTosca_capabilities_endpoint_database();
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC: return createTosca_capabilities_endpoint_public();
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_ADMIN: return createTosca_capabilities_endpoint_admin();
			case ToscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM: return createTosca_capabilities_operatingsystem();
			case ToscaPackage.TOSCA_CAPABILITIES_ATTACHMENT: return createTosca_capabilities_attachment();
			case ToscaPackage.TOSCA_NODES_ROOT: return createTosca_nodes_root();
			case ToscaPackage.TOSCA_NODES_WEBAPPLICATION: return createTosca_nodes_webapplication();
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT: return createTosca_nodes_softwarecomponent();
			case ToscaPackage.TOSCA_NODES_DBMS: return createTosca_nodes_dbms();
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE: return createTosca_nodes_objectstorage();
			case ToscaPackage.TOSCA_NODES_COMPUTE: return createTosca_nodes_compute();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER: return createTosca_nodes_loadbalancer();
			case ToscaPackage.TOSCA_NODES_WEBSERVER: return createTosca_nodes_webserver();
			case ToscaPackage.TOSCA_NODES_DATABASE: return createTosca_nodes_database();
			case ToscaPackage.TOSCA_NODES_CONTAINER_APPLICATION: return createTosca_nodes_container_application();
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME: return createTosca_nodes_container_runtime();
			case ToscaPackage.TOSCA_NODES_BLOCKSTORAGE: return createTosca_nodes_blockstorage();
			case ToscaPackage.TOSCA_POLICIES_ROOT: return createTosca_policies_root();
			case ToscaPackage.TOSCA_POLICIES_UPDATE: return createTosca_policies_update();
			case ToscaPackage.TOSCA_POLICIES_PLACEMENT: return createTosca_policies_placement();
			case ToscaPackage.TOSCA_POLICIES_SCALING: return createTosca_policies_scaling();
			case ToscaPackage.TOSCA_POLICIES_PERFORMANCE: return createTosca_policies_performance();
			case ToscaPackage.TOSCA_GROUPS_ROOT: return createTosca_groups_root();
			case ToscaPackage.TOSCA_INTERFACES_ROOT: return createTosca_interfaces_root();
			case ToscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE: return createTosca_interfaces_relationship_configure();
			case ToscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD: return createTosca_interfaces_node_lifecycle_standard();
			case ToscaPackage.TOSCA_RELATIONSHIPS_ROOT: return createTosca_relationships_root();
			case ToscaPackage.TOSCA_RELATIONSHIPS_CONNECTSTO: return createTosca_relationships_connectsto();
			case ToscaPackage.TOSCA_RELATIONSHIPS_ROUTESTO: return createTosca_relationships_routesto();
			case ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO: return createTosca_relationships_attachesto();
			case ToscaPackage.TOSCA_RELATIONSHIPS_HOSTEDON: return createTosca_relationships_hostedon();
			case ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON: return createTosca_relationships_dependson();
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
			case ToscaPackage.PROTOCOL_ENUM:
				return createprotocolEnumFromString(eDataType, initialValue);
			case ToscaPackage.INITIATOR_ENUM:
				return createinitiatorEnumFromString(eDataType, initialValue);
			case ToscaPackage.STRING:
				return createstringFromString(eDataType, initialValue);
			case ToscaPackage.STRING_MIN_ONE:
				return createstringMinOneFromString(eDataType, initialValue);
			case ToscaPackage.BOOLEAN:
				return createbooleanFromString(eDataType, initialValue);
			case ToscaPackage.BYTE:
				return createbyteFromString(eDataType, initialValue);
			case ToscaPackage.DOUBLE:
				return createdoubleFromString(eDataType, initialValue);
			case ToscaPackage.FLOAT:
				return createfloatFromString(eDataType, initialValue);
			case ToscaPackage.INTEGER:
				return createintegerFromString(eDataType, initialValue);
			case ToscaPackage.INTEGER_MIN_ONE:
				return createintegerMinOneFromString(eDataType, initialValue);
			case ToscaPackage.LONG:
				return createlongFromString(eDataType, initialValue);
			case ToscaPackage.SHORT:
				return createshortFromString(eDataType, initialValue);
			case ToscaPackage.MAP:
				return createmapFromString(eDataType, initialValue);
			case ToscaPackage.VERSION:
				return createversionFromString(eDataType, initialValue);
			case ToscaPackage.RANGE:
				return createrangeFromString(eDataType, initialValue);
			case ToscaPackage.TOSCADATATYPESNETWORK_PORT_DEF:
				return createtoscadatatypesnetworkPortDefFromString(eDataType, initialValue);
			case ToscaPackage.SCALAR_FREQUENCY:
				return createscalarFrequencyFromString(eDataType, initialValue);
			case ToscaPackage.SCALAR_SIZE_MIN_ONE_MB:
				return createscalarSizeMinOneMBFromString(eDataType, initialValue);
			case ToscaPackage.SCALAR_SIZE_MIN_ZERO_GB:
				return createscalarSizeMinZeroGBFromString(eDataType, initialValue);
			case ToscaPackage.SCALAR_SIZE_MIN_ZERO_MB:
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
			case ToscaPackage.PROTOCOL_ENUM:
				return convertprotocolEnumToString(eDataType, instanceValue);
			case ToscaPackage.INITIATOR_ENUM:
				return convertinitiatorEnumToString(eDataType, instanceValue);
			case ToscaPackage.STRING:
				return convertstringToString(eDataType, instanceValue);
			case ToscaPackage.STRING_MIN_ONE:
				return convertstringMinOneToString(eDataType, instanceValue);
			case ToscaPackage.BOOLEAN:
				return convertbooleanToString(eDataType, instanceValue);
			case ToscaPackage.BYTE:
				return convertbyteToString(eDataType, instanceValue);
			case ToscaPackage.DOUBLE:
				return convertdoubleToString(eDataType, instanceValue);
			case ToscaPackage.FLOAT:
				return convertfloatToString(eDataType, instanceValue);
			case ToscaPackage.INTEGER:
				return convertintegerToString(eDataType, instanceValue);
			case ToscaPackage.INTEGER_MIN_ONE:
				return convertintegerMinOneToString(eDataType, instanceValue);
			case ToscaPackage.LONG:
				return convertlongToString(eDataType, instanceValue);
			case ToscaPackage.SHORT:
				return convertshortToString(eDataType, instanceValue);
			case ToscaPackage.MAP:
				return convertmapToString(eDataType, instanceValue);
			case ToscaPackage.VERSION:
				return convertversionToString(eDataType, instanceValue);
			case ToscaPackage.RANGE:
				return convertrangeToString(eDataType, instanceValue);
			case ToscaPackage.TOSCADATATYPESNETWORK_PORT_DEF:
				return converttoscadatatypesnetworkPortDefToString(eDataType, instanceValue);
			case ToscaPackage.SCALAR_FREQUENCY:
				return convertscalarFrequencyToString(eDataType, instanceValue);
			case ToscaPackage.SCALAR_SIZE_MIN_ONE_MB:
				return convertscalarSizeMinOneMBToString(eDataType, instanceValue);
			case ToscaPackage.SCALAR_SIZE_MIN_ZERO_GB:
				return convertscalarSizeMinZeroGBToString(eDataType, instanceValue);
			case ToscaPackage.SCALAR_SIZE_MIN_ZERO_MB:
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
	public arrayString createarrayString() {
		arrayStringImpl arrayString = new arrayStringImpl();
		return arrayString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayBoolean createarrayBoolean() {
		arrayBooleanImpl arrayBoolean = new arrayBooleanImpl();
		return arrayBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayByte createarrayByte() {
		arrayByteImpl arrayByte = new arrayByteImpl();
		return arrayByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayDouble createarrayDouble() {
		arrayDoubleImpl arrayDouble = new arrayDoubleImpl();
		return arrayDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayFloat createarrayFloat() {
		arrayFloatImpl arrayFloat = new arrayFloatImpl();
		return arrayFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayInteger createarrayInteger() {
		arrayIntegerImpl arrayInteger = new arrayIntegerImpl();
		return arrayInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayLong createarrayLong() {
		arrayLongImpl arrayLong = new arrayLongImpl();
		return arrayLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayShort createarrayShort() {
		arrayShortImpl arrayShort = new arrayShortImpl();
		return arrayShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public toscadatatypesnetworkNetworkInfo createtoscadatatypesnetworkNetworkInfo() {
		toscadatatypesnetworkNetworkInfoImpl toscadatatypesnetworkNetworkInfo = new toscadatatypesnetworkNetworkInfoImpl();
		return toscadatatypesnetworkNetworkInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public toscadatatypesnetworkPortInfo createtoscadatatypesnetworkPortInfo() {
		toscadatatypesnetworkPortInfoImpl toscadatatypesnetworkPortInfo = new toscadatatypesnetworkPortInfoImpl();
		return toscadatatypesnetworkPortInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public toscadatatypesCredential createtoscadatatypesCredential() {
		toscadatatypesCredentialImpl toscadatatypesCredential = new toscadatatypesCredentialImpl();
		return toscadatatypesCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public toscadatatypesnetworkPortSpec createtoscadatatypesnetworkPortSpec() {
		toscadatatypesnetworkPortSpecImpl toscadatatypesnetworkPortSpec = new toscadatatypesnetworkPortSpecImpl();
		return toscadatatypesnetworkPortSpec;
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
	public ToscaPackage getToscaPackage() {
		return (ToscaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToscaPackage getPackage() {
		return ToscaPackage.eINSTANCE;
	}

} //ToscaFactoryImpl
