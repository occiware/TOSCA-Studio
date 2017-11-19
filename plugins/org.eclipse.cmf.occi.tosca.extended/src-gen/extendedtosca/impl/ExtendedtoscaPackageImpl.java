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

import extendedtosca.Credential;
import extendedtosca.ExtendedtoscaFactory;
import extendedtosca.ExtendedtoscaPackage;
import extendedtosca.Mycompany_mytypes_myscalingpolicy;
import extendedtosca.NetworkInfo;
import extendedtosca.PortInfo;
import extendedtosca.PortSpec;
import extendedtosca.Rsyslog;
import extendedtosca.Test_relation_connects;
import extendedtosca.Tosca_capabilities_attachment;
import extendedtosca.Tosca_capabilities_container;
import extendedtosca.Tosca_capabilities_container_docker;
import extendedtosca.Tosca_capabilities_containerchild;
import extendedtosca.Tosca_capabilities_endpoint;
import extendedtosca.Tosca_capabilities_endpoint_admin;
import extendedtosca.Tosca_capabilities_endpoint_database;
import extendedtosca.Tosca_capabilities_endpoint_public;
import extendedtosca.Tosca_capabilities_ha;
import extendedtosca.Tosca_capabilities_indigo_endpoint;
import extendedtosca.Tosca_capabilities_network_bindable;
import extendedtosca.Tosca_capabilities_node;
import extendedtosca.Tosca_capabilities_operatingsystem;
import extendedtosca.Tosca_capabilities_root;
import extendedtosca.Tosca_capabilities_scalable;
import extendedtosca.Tosca_capabilities_somecap;
import extendedtosca.Tosca_capabilities_somechildcap;
import extendedtosca.Tosca_groups_root;
import extendedtosca.Tosca_interfaces_node_lifecycle_standard;
import extendedtosca.Tosca_interfaces_relationship_configure;
import extendedtosca.Tosca_interfaces_root;
import extendedtosca.Tosca_nodes_blockstorage;
import extendedtosca.Tosca_nodes_compute;
import extendedtosca.Tosca_nodes_computewithattrlist;
import extendedtosca.Tosca_nodes_computewithcapwithattr;
import extendedtosca.Tosca_nodes_computewithprop;
import extendedtosca.Tosca_nodes_container_application;
import extendedtosca.Tosca_nodes_container_application_docker;
import extendedtosca.Tosca_nodes_container_runtime;
import extendedtosca.Tosca_nodes_database;
import extendedtosca.Tosca_nodes_database_mysql;
import extendedtosca.Tosca_nodes_databasewithlistparam;
import extendedtosca.Tosca_nodes_dbms;
import extendedtosca.Tosca_nodes_dbms_mysql;
import extendedtosca.Tosca_nodes_hacompute;
import extendedtosca.Tosca_nodes_loadbalancer;
import extendedtosca.Tosca_nodes_nodewithcap;
import extendedtosca.Tosca_nodes_nodewithreq;
import extendedtosca.Tosca_nodes_objectstorage;
import extendedtosca.Tosca_nodes_root;
import extendedtosca.Tosca_nodes_softwarecomponent;
import extendedtosca.Tosca_nodes_softwarecomponent_collectd;
import extendedtosca.Tosca_nodes_softwarecomponent_elasticsearch;
import extendedtosca.Tosca_nodes_softwarecomponent_kibana;
import extendedtosca.Tosca_nodes_softwarecomponent_logstash;
import extendedtosca.Tosca_nodes_softwarecomponent_rsyslog;
import extendedtosca.Tosca_nodes_somenode;
import extendedtosca.Tosca_nodes_somenode2;
import extendedtosca.Tosca_nodes_webapplication;
import extendedtosca.Tosca_nodes_webapplication_paypalpizzastore;
import extendedtosca.Tosca_nodes_webapplication_wordpress;
import extendedtosca.Tosca_nodes_webserver;
import extendedtosca.Tosca_nodes_webserver_nodejs;
import extendedtosca.Tosca_policies_performance;
import extendedtosca.Tosca_policies_placement;
import extendedtosca.Tosca_policies_root;
import extendedtosca.Tosca_policies_scaling;
import extendedtosca.Tosca_policies_update;
import extendedtosca.Tosca_relationships_attachesto;
import extendedtosca.Tosca_relationships_connectsto;
import extendedtosca.Tosca_relationships_dependson;
import extendedtosca.Tosca_relationships_ha;
import extendedtosca.Tosca_relationships_hostedon;
import extendedtosca.Tosca_relationships_root;
import extendedtosca.Tosca_relationships_routesto;
import extendedtosca.arrayCredential;
import extendedtosca.arrayPortSpec;
import extendedtosca.arrayinteger;
import extendedtosca.arraystring;
import extendedtosca.arrayversion;
import extendedtosca.initiatorEnum;
import extendedtosca.protocolEnum;

import extendedtosca.util.ExtendedtoscaValidator;

import java.util.Map;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.cmf.occi.sla.SlaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedtoscaPackageImpl extends EPackageImpl implements ExtendedtoscaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraystringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass credentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayCredentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayintegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayPortSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_scalableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_network_bindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_endpoint_databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_endpoint_publicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_endpoint_adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_operatingsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_webapplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_softwarecomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_dbmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_objectstorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_computeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_loadbalancerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_webserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_container_applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_container_runtimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_blockstorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_policies_rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_policies_updateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_policies_placementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_policies_scalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_policies_performanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_groups_rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_interfaces_rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_interfaces_relationship_configureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_interfaces_node_lifecycle_standardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_relationships_rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_relationships_connectstoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_relationships_routestoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_relationships_attachestoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_relationships_hostedonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_relationships_dependsonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_indigo_endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_somecapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_haEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_containerchildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_somechildcapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_database_mysqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_computewithpropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_softwarecomponent_elasticsearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_databasewithlistparamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_webapplication_paypalpizzastoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_webapplication_wordpressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_nodewithcapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_container_application_dockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_softwarecomponent_kibanaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsyslogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_computewithattrlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_softwarecomponent_logstashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_softwarecomponent_collectdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_computewithcapwithattrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_nodewithreqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_softwarecomponent_rsyslogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_hacomputeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_somenodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_capabilities_container_dockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_webserver_nodejsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_somenode2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_dbms_mysqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mycompany_mytypes_myscalingpolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_relationships_haEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass test_relation_connectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initiatorEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringMinOneEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType byteEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerMinOneEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rangeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType toscadatatypesnetworkPortDefEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scalarFrequencyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scalarSizeMinOneMBEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scalarSizeMinZeroGBEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scalarSizeMinZeroMBEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see extendedtosca.ExtendedtoscaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtendedtoscaPackageImpl() {
		super(eNS_URI, ExtendedtoscaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExtendedtoscaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtendedtoscaPackage init() {
		if (isInited) return (ExtendedtoscaPackage)EPackage.Registry.INSTANCE.getEPackage(ExtendedtoscaPackage.eNS_URI);

		// Obtain or create and register package
		ExtendedtoscaPackageImpl theExtendedtoscaPackage = (ExtendedtoscaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtendedtoscaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtendedtoscaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		SlaPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExtendedtoscaPackage.createPackageContents();

		// Initialize created meta-data
		theExtendedtoscaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theExtendedtoscaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ExtendedtoscaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theExtendedtoscaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtendedtoscaPackage.eNS_URI, theExtendedtoscaPackage);
		return theExtendedtoscaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarraystring() {
		return arraystringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarraystring_Values() {
		return (EAttribute)arraystringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkInfo() {
		return networkInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkInfo_Networkid() {
		return (EAttribute)networkInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkInfo_Addresses() {
		return (EReference)networkInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkInfo_Networkname() {
		return (EAttribute)networkInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortInfo() {
		return portInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortInfo_Portname() {
		return (EAttribute)portInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortInfo_Networkid() {
		return (EAttribute)portInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInfo_Addresses() {
		return (EReference)portInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortInfo_Macaddress() {
		return (EAttribute)portInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortInfo_Portid() {
		return (EAttribute)portInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCredential() {
		return credentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredential_Protocol() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredential_Keys() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredential_Tokentype() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredential_User() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredential_Token() {
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSpec() {
		return portSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortSpec_Protocol() {
		return (EAttribute)portSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortSpec_Targetrange() {
		return (EAttribute)portSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortSpec_Sourcerange() {
		return (EAttribute)portSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortSpec_Source() {
		return (EAttribute)portSpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortSpec_Target() {
		return (EAttribute)portSpecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayCredential() {
		return arrayCredentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getarrayCredential_ArraycredentialValues() {
		return (EReference)arrayCredentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayinteger() {
		return arrayintegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayinteger_Values() {
		return (EAttribute)arrayintegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayPortSpec() {
		return arrayPortSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getarrayPortSpec_ArrayportspecValues() {
		return (EReference)arrayPortSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayversion() {
		return arrayversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayversion_Values() {
		return (EAttribute)arrayversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_root() {
		return tosca_capabilities_rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_node() {
		return tosca_capabilities_nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_endpoint() {
		return tosca_capabilities_endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_PortName() {
		return (EAttribute)tosca_capabilities_endpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_Protocol() {
		return (EAttribute)tosca_capabilities_endpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_Port() {
		return (EAttribute)tosca_capabilities_endpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_Initiator() {
		return (EAttribute)tosca_capabilities_endpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_NetworkName() {
		return (EAttribute)tosca_capabilities_endpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_Secure() {
		return (EAttribute)tosca_capabilities_endpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_Ports() {
		return (EAttribute)tosca_capabilities_endpointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_UrlPath() {
		return (EAttribute)tosca_capabilities_endpointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_scalable() {
		return tosca_capabilities_scalableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_scalable_MinInstances() {
		return (EAttribute)tosca_capabilities_scalableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_scalable_MaxInstances() {
		return (EAttribute)tosca_capabilities_scalableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_scalable_DefaultInstances() {
		return (EAttribute)tosca_capabilities_scalableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_network_bindable() {
		return tosca_capabilities_network_bindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_container() {
		return tosca_capabilities_containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_container_DiskSize() {
		return (EAttribute)tosca_capabilities_containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_endpoint_database() {
		return tosca_capabilities_endpoint_databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_endpoint_public() {
		return tosca_capabilities_endpoint_publicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_public_Floating() {
		return (EAttribute)tosca_capabilities_endpoint_publicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_endpoint_public_DnsName() {
		return (EAttribute)tosca_capabilities_endpoint_publicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_endpoint_admin() {
		return tosca_capabilities_endpoint_adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_operatingsystem() {
		return tosca_capabilities_operatingsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_operatingsystem_Type() {
		return (EAttribute)tosca_capabilities_operatingsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_operatingsystem_Distribution() {
		return (EAttribute)tosca_capabilities_operatingsystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_operatingsystem_Version() {
		return (EAttribute)tosca_capabilities_operatingsystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_attachment() {
		return tosca_capabilities_attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_root() {
		return tosca_nodes_rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_root__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_nodes_rootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_webapplication() {
		return tosca_nodes_webapplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_webapplication_ContextRoot() {
		return (EAttribute)tosca_nodes_webapplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_webapplication__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_nodes_webapplicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_softwarecomponent() {
		return tosca_nodes_softwarecomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTosca_nodes_softwarecomponent_AdminCredential() {
		return (EReference)tosca_nodes_softwarecomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_softwarecomponent_ComponentVersion() {
		return (EAttribute)tosca_nodes_softwarecomponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_softwarecomponent__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_nodes_softwarecomponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_dbms() {
		return tosca_nodes_dbmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_dbms_Port() {
		return (EAttribute)tosca_nodes_dbmsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_dbms_RootPassword() {
		return (EAttribute)tosca_nodes_dbmsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_dbms__SourceMustBeDatabase__DiagnosticChain_Map() {
		return tosca_nodes_dbmsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_objectstorage() {
		return tosca_nodes_objectstorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_objectstorage_Size() {
		return (EAttribute)tosca_nodes_objectstorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_objectstorage_Name() {
		return (EAttribute)tosca_nodes_objectstorageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_objectstorage__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_nodes_objectstorageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_compute() {
		return tosca_nodes_computeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_compute_PrivateAddress() {
		return (EAttribute)tosca_nodes_computeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_compute_PublicAddress() {
		return (EAttribute)tosca_nodes_computeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_compute_Networks() {
		return (EAttribute)tosca_nodes_computeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_compute__SourceMustBeSoftwareComponent__DiagnosticChain_Map() {
		return tosca_nodes_computeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_compute__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_nodes_computeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_loadbalancer() {
		return tosca_nodes_loadbalancerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_loadbalancer_Algorithm() {
		return (EAttribute)tosca_nodes_loadbalancerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_webserver() {
		return tosca_nodes_webserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_webserver__SourceMustBeWebApplication__DiagnosticChain_Map() {
		return tosca_nodes_webserverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_database() {
		return tosca_nodes_databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_database_Password() {
		return (EAttribute)tosca_nodes_databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_database_Name() {
		return (EAttribute)tosca_nodes_databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_database_User() {
		return (EAttribute)tosca_nodes_databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_database__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_nodes_databaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_container_application() {
		return tosca_nodes_container_applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_container_application__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_nodes_container_applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_container_runtime() {
		return tosca_nodes_container_runtimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_blockstorage() {
		return tosca_nodes_blockstorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_blockstorage_Size() {
		return (EAttribute)tosca_nodes_blockstorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_blockstorage_VolumeId() {
		return (EAttribute)tosca_nodes_blockstorageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_blockstorage_SnapshotId() {
		return (EAttribute)tosca_nodes_blockstorageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_nodes_blockstorage__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_nodes_blockstorageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_policies_root() {
		return tosca_policies_rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_policies_update() {
		return tosca_policies_updateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_policies_placement() {
		return tosca_policies_placementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_policies_scaling() {
		return tosca_policies_scalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_policies_performance() {
		return tosca_policies_performanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_groups_root() {
		return tosca_groups_rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_interfaces_root() {
		return tosca_interfaces_rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_interfaces_relationship_configure() {
		return tosca_interfaces_relationship_configureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_relationship_configure__Pre_configure_source() {
		return tosca_interfaces_relationship_configureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_relationship_configure__Pre_configure_target() {
		return tosca_interfaces_relationship_configureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_relationship_configure__Post_configure_source() {
		return tosca_interfaces_relationship_configureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_relationship_configure__Post_configure_target() {
		return tosca_interfaces_relationship_configureEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_relationship_configure__Remove_target() {
		return tosca_interfaces_relationship_configureEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_relationship_configure__Add_target() {
		return tosca_interfaces_relationship_configureEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_relationship_configure__Add_source() {
		return tosca_interfaces_relationship_configureEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_relationship_configure__Target_changed() {
		return tosca_interfaces_relationship_configureEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_interfaces_node_lifecycle_standard() {
		return tosca_interfaces_node_lifecycle_standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_node_lifecycle_standard__Create() {
		return tosca_interfaces_node_lifecycle_standardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_node_lifecycle_standard__Configure() {
		return tosca_interfaces_node_lifecycle_standardEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_interfaces_node_lifecycle_standard__Delete() {
		return tosca_interfaces_node_lifecycle_standardEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_relationships_root() {
		return tosca_relationships_rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_relationships_root_ToscaName() {
		return (EAttribute)tosca_relationships_rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_relationships_root_State() {
		return (EAttribute)tosca_relationships_rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_relationships_root_ToscaId() {
		return (EAttribute)tosca_relationships_rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_relationships_root__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_relationships_rootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_relationships_connectsto() {
		return tosca_relationships_connectstoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTosca_relationships_connectsto_Credential() {
		return (EReference)tosca_relationships_connectstoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_relationships_routesto() {
		return tosca_relationships_routestoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_relationships_routesto__SourceMustBeLoadBalancer__DiagnosticChain_Map() {
		return tosca_relationships_routestoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_relationships_attachesto() {
		return tosca_relationships_attachestoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_relationships_attachesto_Location() {
		return (EAttribute)tosca_relationships_attachestoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_relationships_attachesto__AppliesConstraint__DiagnosticChain_Map() {
		return tosca_relationships_attachestoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_relationships_attachesto__SourceMustBeComputeAndTargetMustBeBlockStorage__DiagnosticChain_Map() {
		return tosca_relationships_attachestoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_relationships_hostedon() {
		return tosca_relationships_hostedonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_relationships_hostedon__SourceMustBeWebServerAndTargetMustBeWebApplication__DiagnosticChain_Map() {
		return tosca_relationships_hostedonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_relationships_hostedon__SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime__DiagnosticChain_Map() {
		return tosca_relationships_hostedonEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_relationships_hostedon__SourceMustBeSoftwareComponentAndTargetMustBeCompute__DiagnosticChain_Map() {
		return tosca_relationships_hostedonEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_relationships_hostedon__SourceMustBeDatabaseAndTargetMustBeDBMS__DiagnosticChain_Map() {
		return tosca_relationships_hostedonEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_relationships_dependson() {
		return tosca_relationships_dependsonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTosca_relationships_dependson__SourceMustBeNodeAndTargetMustBeNode__DiagnosticChain_Map() {
		return tosca_relationships_dependsonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_indigo_endpoint() {
		return tosca_capabilities_indigo_endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTosca_capabilities_indigo_endpoint_Credential() {
		return (EReference)tosca_capabilities_indigo_endpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_somecap() {
		return tosca_capabilities_somecapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_somecap_Type() {
		return (EAttribute)tosca_capabilities_somecapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_ha() {
		return tosca_capabilities_haEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_containerchild() {
		return tosca_capabilities_containerchildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_somechildcap() {
		return tosca_capabilities_somechildcapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_database_mysql() {
		return tosca_nodes_database_mysqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_computewithprop() {
		return tosca_nodes_computewithpropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_computewithprop_Test() {
		return (EAttribute)tosca_nodes_computewithpropEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_softwarecomponent_elasticsearch() {
		return tosca_nodes_softwarecomponent_elasticsearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_databasewithlistparam() {
		return tosca_nodes_databasewithlistparamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTosca_nodes_databasewithlistparam_ListProp() {
		return (EReference)tosca_nodes_databasewithlistparamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_webapplication_paypalpizzastore() {
		return tosca_nodes_webapplication_paypalpizzastoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_webapplication_paypalpizzastore_GithubUrl() {
		return (EAttribute)tosca_nodes_webapplication_paypalpizzastoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_webapplication_wordpress() {
		return tosca_nodes_webapplication_wordpressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_webapplication_wordpress_DbHost() {
		return (EAttribute)tosca_nodes_webapplication_wordpressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_webapplication_wordpress_AdminPassword() {
		return (EAttribute)tosca_nodes_webapplication_wordpressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_webapplication_wordpress_AdminUser() {
		return (EAttribute)tosca_nodes_webapplication_wordpressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_nodewithcap() {
		return tosca_nodes_nodewithcapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_container_application_docker() {
		return tosca_nodes_container_application_dockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_softwarecomponent_kibana() {
		return tosca_nodes_softwarecomponent_kibanaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRsyslog() {
		return rsyslogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_computewithattrlist() {
		return tosca_nodes_computewithattrlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_computewithattrlist_AttrList() {
		return (EAttribute)tosca_nodes_computewithattrlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_softwarecomponent_logstash() {
		return tosca_nodes_softwarecomponent_logstashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_softwarecomponent_collectd() {
		return tosca_nodes_softwarecomponent_collectdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_computewithcapwithattr() {
		return tosca_nodes_computewithcapwithattrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_nodewithreq() {
		return tosca_nodes_nodewithreqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_softwarecomponent_rsyslog() {
		return tosca_nodes_softwarecomponent_rsyslogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_hacompute() {
		return tosca_nodes_hacomputeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_somenode() {
		return tosca_nodes_somenodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_somenode_SomeProp() {
		return (EAttribute)tosca_nodes_somenodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_capabilities_container_docker() {
		return tosca_capabilities_container_dockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_container_docker_PublishAll() {
		return (EAttribute)tosca_capabilities_container_dockerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTosca_capabilities_container_docker_PublishPorts() {
		return (EReference)tosca_capabilities_container_dockerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTosca_capabilities_container_docker_ExposePorts() {
		return (EReference)tosca_capabilities_container_dockerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTosca_capabilities_container_docker_Volumes() {
		return (EReference)tosca_capabilities_container_dockerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTosca_capabilities_container_docker_Version() {
		return (EReference)tosca_capabilities_container_dockerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_webserver_nodejs() {
		return tosca_nodes_webserver_nodejsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_webserver_nodejs_GithubUrl() {
		return (EAttribute)tosca_nodes_webserver_nodejsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_somenode2() {
		return tosca_nodes_somenode2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_dbms_mysql() {
		return tosca_nodes_dbms_mysqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMycompany_mytypes_myscalingpolicy() {
		return mycompany_mytypes_myscalingpolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_relationships_ha() {
		return tosca_relationships_haEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest_relation_connects() {
		return test_relation_connectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getprotocolEnum() {
		return protocolEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getinitiatorEnum() {
		return initiatorEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getstring() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getstringMinOne() {
		return stringMinOneEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getboolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getbyte() {
		return byteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getdouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getfloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getinteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getintegerMinOne() {
		return integerMinOneEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getlong() {
		return longEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getshort() {
		return shortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getmap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getversion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getrange() {
		return rangeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType gettoscadatatypesnetworkPortDef() {
		return toscadatatypesnetworkPortDefEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getscalarFrequency() {
		return scalarFrequencyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getscalarSizeMinOneMB() {
		return scalarSizeMinOneMBEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getscalarSizeMinZeroGB() {
		return scalarSizeMinZeroGBEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getscalarSizeMinZeroMB() {
		return scalarSizeMinZeroMBEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedtoscaFactory getExtendedtoscaFactory() {
		return (ExtendedtoscaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		arraystringEClass = createEClass(ARRAYSTRING);
		createEAttribute(arraystringEClass, ARRAYSTRING__VALUES);

		networkInfoEClass = createEClass(NETWORK_INFO);
		createEAttribute(networkInfoEClass, NETWORK_INFO__NETWORKID);
		createEReference(networkInfoEClass, NETWORK_INFO__ADDRESSES);
		createEAttribute(networkInfoEClass, NETWORK_INFO__NETWORKNAME);

		portInfoEClass = createEClass(PORT_INFO);
		createEAttribute(portInfoEClass, PORT_INFO__PORTNAME);
		createEAttribute(portInfoEClass, PORT_INFO__NETWORKID);
		createEReference(portInfoEClass, PORT_INFO__ADDRESSES);
		createEAttribute(portInfoEClass, PORT_INFO__MACADDRESS);
		createEAttribute(portInfoEClass, PORT_INFO__PORTID);

		credentialEClass = createEClass(CREDENTIAL);
		createEAttribute(credentialEClass, CREDENTIAL__PROTOCOL);
		createEAttribute(credentialEClass, CREDENTIAL__KEYS);
		createEAttribute(credentialEClass, CREDENTIAL__TOKENTYPE);
		createEAttribute(credentialEClass, CREDENTIAL__USER);
		createEAttribute(credentialEClass, CREDENTIAL__TOKEN);

		portSpecEClass = createEClass(PORT_SPEC);
		createEAttribute(portSpecEClass, PORT_SPEC__PROTOCOL);
		createEAttribute(portSpecEClass, PORT_SPEC__TARGETRANGE);
		createEAttribute(portSpecEClass, PORT_SPEC__SOURCERANGE);
		createEAttribute(portSpecEClass, PORT_SPEC__SOURCE);
		createEAttribute(portSpecEClass, PORT_SPEC__TARGET);

		arrayCredentialEClass = createEClass(ARRAY_CREDENTIAL);
		createEReference(arrayCredentialEClass, ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES);

		arrayintegerEClass = createEClass(ARRAYINTEGER);
		createEAttribute(arrayintegerEClass, ARRAYINTEGER__VALUES);

		arrayPortSpecEClass = createEClass(ARRAY_PORT_SPEC);
		createEReference(arrayPortSpecEClass, ARRAY_PORT_SPEC__ARRAYPORTSPEC_VALUES);

		arrayversionEClass = createEClass(ARRAYVERSION);
		createEAttribute(arrayversionEClass, ARRAYVERSION__VALUES);

		tosca_capabilities_rootEClass = createEClass(TOSCA_CAPABILITIES_ROOT);

		tosca_capabilities_nodeEClass = createEClass(TOSCA_CAPABILITIES_NODE);

		tosca_capabilities_endpointEClass = createEClass(TOSCA_CAPABILITIES_ENDPOINT);
		createEAttribute(tosca_capabilities_endpointEClass, TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME);
		createEAttribute(tosca_capabilities_endpointEClass, TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL);
		createEAttribute(tosca_capabilities_endpointEClass, TOSCA_CAPABILITIES_ENDPOINT__PORT);
		createEAttribute(tosca_capabilities_endpointEClass, TOSCA_CAPABILITIES_ENDPOINT__INITIATOR);
		createEAttribute(tosca_capabilities_endpointEClass, TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME);
		createEAttribute(tosca_capabilities_endpointEClass, TOSCA_CAPABILITIES_ENDPOINT__SECURE);
		createEAttribute(tosca_capabilities_endpointEClass, TOSCA_CAPABILITIES_ENDPOINT__PORTS);
		createEAttribute(tosca_capabilities_endpointEClass, TOSCA_CAPABILITIES_ENDPOINT__URL_PATH);

		tosca_capabilities_scalableEClass = createEClass(TOSCA_CAPABILITIES_SCALABLE);
		createEAttribute(tosca_capabilities_scalableEClass, TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES);
		createEAttribute(tosca_capabilities_scalableEClass, TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES);
		createEAttribute(tosca_capabilities_scalableEClass, TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES);

		tosca_capabilities_network_bindableEClass = createEClass(TOSCA_CAPABILITIES_NETWORK_BINDABLE);

		tosca_capabilities_containerEClass = createEClass(TOSCA_CAPABILITIES_CONTAINER);
		createEAttribute(tosca_capabilities_containerEClass, TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE);

		tosca_capabilities_endpoint_databaseEClass = createEClass(TOSCA_CAPABILITIES_ENDPOINT_DATABASE);

		tosca_capabilities_endpoint_publicEClass = createEClass(TOSCA_CAPABILITIES_ENDPOINT_PUBLIC);
		createEAttribute(tosca_capabilities_endpoint_publicEClass, TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING);
		createEAttribute(tosca_capabilities_endpoint_publicEClass, TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME);

		tosca_capabilities_endpoint_adminEClass = createEClass(TOSCA_CAPABILITIES_ENDPOINT_ADMIN);

		tosca_capabilities_operatingsystemEClass = createEClass(TOSCA_CAPABILITIES_OPERATINGSYSTEM);
		createEAttribute(tosca_capabilities_operatingsystemEClass, TOSCA_CAPABILITIES_OPERATINGSYSTEM__TYPE);
		createEAttribute(tosca_capabilities_operatingsystemEClass, TOSCA_CAPABILITIES_OPERATINGSYSTEM__DISTRIBUTION);
		createEAttribute(tosca_capabilities_operatingsystemEClass, TOSCA_CAPABILITIES_OPERATINGSYSTEM__VERSION);

		tosca_capabilities_attachmentEClass = createEClass(TOSCA_CAPABILITIES_ATTACHMENT);

		tosca_nodes_rootEClass = createEClass(TOSCA_NODES_ROOT);
		createEOperation(tosca_nodes_rootEClass, TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		tosca_nodes_webapplicationEClass = createEClass(TOSCA_NODES_WEBAPPLICATION);
		createEAttribute(tosca_nodes_webapplicationEClass, TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT);
		createEOperation(tosca_nodes_webapplicationEClass, TOSCA_NODES_WEBAPPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		tosca_nodes_softwarecomponentEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT);
		createEReference(tosca_nodes_softwarecomponentEClass, TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL);
		createEAttribute(tosca_nodes_softwarecomponentEClass, TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION);
		createEOperation(tosca_nodes_softwarecomponentEClass, TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		tosca_nodes_dbmsEClass = createEClass(TOSCA_NODES_DBMS);
		createEAttribute(tosca_nodes_dbmsEClass, TOSCA_NODES_DBMS__PORT);
		createEAttribute(tosca_nodes_dbmsEClass, TOSCA_NODES_DBMS__ROOT_PASSWORD);
		createEOperation(tosca_nodes_dbmsEClass, TOSCA_NODES_DBMS___SOURCE_MUST_BE_DATABASE__DIAGNOSTICCHAIN_MAP);

		tosca_nodes_objectstorageEClass = createEClass(TOSCA_NODES_OBJECTSTORAGE);
		createEAttribute(tosca_nodes_objectstorageEClass, TOSCA_NODES_OBJECTSTORAGE__SIZE);
		createEAttribute(tosca_nodes_objectstorageEClass, TOSCA_NODES_OBJECTSTORAGE__NAME);
		createEOperation(tosca_nodes_objectstorageEClass, TOSCA_NODES_OBJECTSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		tosca_nodes_computeEClass = createEClass(TOSCA_NODES_COMPUTE);
		createEAttribute(tosca_nodes_computeEClass, TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS);
		createEAttribute(tosca_nodes_computeEClass, TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS);
		createEAttribute(tosca_nodes_computeEClass, TOSCA_NODES_COMPUTE__NETWORKS);
		createEOperation(tosca_nodes_computeEClass, TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(tosca_nodes_computeEClass, TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		tosca_nodes_loadbalancerEClass = createEClass(TOSCA_NODES_LOADBALANCER);
		createEAttribute(tosca_nodes_loadbalancerEClass, TOSCA_NODES_LOADBALANCER__ALGORITHM);

		tosca_nodes_webserverEClass = createEClass(TOSCA_NODES_WEBSERVER);
		createEOperation(tosca_nodes_webserverEClass, TOSCA_NODES_WEBSERVER___SOURCE_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP);

		tosca_nodes_databaseEClass = createEClass(TOSCA_NODES_DATABASE);
		createEAttribute(tosca_nodes_databaseEClass, TOSCA_NODES_DATABASE__PASSWORD);
		createEAttribute(tosca_nodes_databaseEClass, TOSCA_NODES_DATABASE__NAME);
		createEAttribute(tosca_nodes_databaseEClass, TOSCA_NODES_DATABASE__USER);
		createEOperation(tosca_nodes_databaseEClass, TOSCA_NODES_DATABASE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		tosca_nodes_container_applicationEClass = createEClass(TOSCA_NODES_CONTAINER_APPLICATION);
		createEOperation(tosca_nodes_container_applicationEClass, TOSCA_NODES_CONTAINER_APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		tosca_nodes_container_runtimeEClass = createEClass(TOSCA_NODES_CONTAINER_RUNTIME);

		tosca_nodes_blockstorageEClass = createEClass(TOSCA_NODES_BLOCKSTORAGE);
		createEAttribute(tosca_nodes_blockstorageEClass, TOSCA_NODES_BLOCKSTORAGE__SIZE);
		createEAttribute(tosca_nodes_blockstorageEClass, TOSCA_NODES_BLOCKSTORAGE__VOLUME_ID);
		createEAttribute(tosca_nodes_blockstorageEClass, TOSCA_NODES_BLOCKSTORAGE__SNAPSHOT_ID);
		createEOperation(tosca_nodes_blockstorageEClass, TOSCA_NODES_BLOCKSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		tosca_policies_rootEClass = createEClass(TOSCA_POLICIES_ROOT);

		tosca_policies_updateEClass = createEClass(TOSCA_POLICIES_UPDATE);

		tosca_policies_placementEClass = createEClass(TOSCA_POLICIES_PLACEMENT);

		tosca_policies_scalingEClass = createEClass(TOSCA_POLICIES_SCALING);

		tosca_policies_performanceEClass = createEClass(TOSCA_POLICIES_PERFORMANCE);

		tosca_groups_rootEClass = createEClass(TOSCA_GROUPS_ROOT);

		tosca_interfaces_rootEClass = createEClass(TOSCA_INTERFACES_ROOT);

		tosca_interfaces_relationship_configureEClass = createEClass(TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE);
		createEOperation(tosca_interfaces_relationship_configureEClass, TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_SOURCE);
		createEOperation(tosca_interfaces_relationship_configureEClass, TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_TARGET);
		createEOperation(tosca_interfaces_relationship_configureEClass, TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_SOURCE);
		createEOperation(tosca_interfaces_relationship_configureEClass, TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_TARGET);
		createEOperation(tosca_interfaces_relationship_configureEClass, TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___REMOVE_TARGET);
		createEOperation(tosca_interfaces_relationship_configureEClass, TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_TARGET);
		createEOperation(tosca_interfaces_relationship_configureEClass, TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_SOURCE);
		createEOperation(tosca_interfaces_relationship_configureEClass, TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___TARGET_CHANGED);

		tosca_interfaces_node_lifecycle_standardEClass = createEClass(TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD);
		createEOperation(tosca_interfaces_node_lifecycle_standardEClass, TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CREATE);
		createEOperation(tosca_interfaces_node_lifecycle_standardEClass, TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CONFIGURE);
		createEOperation(tosca_interfaces_node_lifecycle_standardEClass, TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___DELETE);

		tosca_relationships_rootEClass = createEClass(TOSCA_RELATIONSHIPS_ROOT);
		createEAttribute(tosca_relationships_rootEClass, TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME);
		createEAttribute(tosca_relationships_rootEClass, TOSCA_RELATIONSHIPS_ROOT__STATE);
		createEAttribute(tosca_relationships_rootEClass, TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID);
		createEOperation(tosca_relationships_rootEClass, TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		tosca_relationships_connectstoEClass = createEClass(TOSCA_RELATIONSHIPS_CONNECTSTO);
		createEReference(tosca_relationships_connectstoEClass, TOSCA_RELATIONSHIPS_CONNECTSTO__CREDENTIAL);

		tosca_relationships_routestoEClass = createEClass(TOSCA_RELATIONSHIPS_ROUTESTO);
		createEOperation(tosca_relationships_routestoEClass, TOSCA_RELATIONSHIPS_ROUTESTO___SOURCE_MUST_BE_LOAD_BALANCER__DIAGNOSTICCHAIN_MAP);

		tosca_relationships_attachestoEClass = createEClass(TOSCA_RELATIONSHIPS_ATTACHESTO);
		createEAttribute(tosca_relationships_attachestoEClass, TOSCA_RELATIONSHIPS_ATTACHESTO__LOCATION);
		createEOperation(tosca_relationships_attachestoEClass, TOSCA_RELATIONSHIPS_ATTACHESTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(tosca_relationships_attachestoEClass, TOSCA_RELATIONSHIPS_ATTACHESTO___SOURCE_MUST_BE_COMPUTE_AND_TARGET_MUST_BE_BLOCK_STORAGE__DIAGNOSTICCHAIN_MAP);

		tosca_relationships_hostedonEClass = createEClass(TOSCA_RELATIONSHIPS_HOSTEDON);
		createEOperation(tosca_relationships_hostedonEClass, TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_WEB_SERVER_AND_TARGET_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(tosca_relationships_hostedonEClass, TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_CONTAINER_APPLICATION_AND_TARGET_MUST_BE_CONTAINER_RUNTIME__DIAGNOSTICCHAIN_MAP);
		createEOperation(tosca_relationships_hostedonEClass, TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_SOFTWARE_COMPONENT_AND_TARGET_MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(tosca_relationships_hostedonEClass, TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_DATABASE_AND_TARGET_MUST_BE_DBMS__DIAGNOSTICCHAIN_MAP);

		tosca_relationships_dependsonEClass = createEClass(TOSCA_RELATIONSHIPS_DEPENDSON);
		createEOperation(tosca_relationships_dependsonEClass, TOSCA_RELATIONSHIPS_DEPENDSON___SOURCE_MUST_BE_NODE_AND_TARGET_MUST_BE_NODE__DIAGNOSTICCHAIN_MAP);

		tosca_capabilities_indigo_endpointEClass = createEClass(TOSCA_CAPABILITIES_INDIGO_ENDPOINT);
		createEReference(tosca_capabilities_indigo_endpointEClass, TOSCA_CAPABILITIES_INDIGO_ENDPOINT__CREDENTIAL);

		tosca_capabilities_somecapEClass = createEClass(TOSCA_CAPABILITIES_SOMECAP);
		createEAttribute(tosca_capabilities_somecapEClass, TOSCA_CAPABILITIES_SOMECAP__TYPE);

		tosca_capabilities_haEClass = createEClass(TOSCA_CAPABILITIES_HA);

		tosca_capabilities_containerchildEClass = createEClass(TOSCA_CAPABILITIES_CONTAINERCHILD);

		tosca_capabilities_somechildcapEClass = createEClass(TOSCA_CAPABILITIES_SOMECHILDCAP);

		tosca_nodes_database_mysqlEClass = createEClass(TOSCA_NODES_DATABASE_MYSQL);

		tosca_nodes_computewithpropEClass = createEClass(TOSCA_NODES_COMPUTEWITHPROP);
		createEAttribute(tosca_nodes_computewithpropEClass, TOSCA_NODES_COMPUTEWITHPROP__TEST);

		tosca_nodes_softwarecomponent_elasticsearchEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH);

		tosca_nodes_databasewithlistparamEClass = createEClass(TOSCA_NODES_DATABASEWITHLISTPARAM);
		createEReference(tosca_nodes_databasewithlistparamEClass, TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP);

		tosca_nodes_webapplication_paypalpizzastoreEClass = createEClass(TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE);
		createEAttribute(tosca_nodes_webapplication_paypalpizzastoreEClass, TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL);

		tosca_nodes_webapplication_wordpressEClass = createEClass(TOSCA_NODES_WEBAPPLICATION_WORDPRESS);
		createEAttribute(tosca_nodes_webapplication_wordpressEClass, TOSCA_NODES_WEBAPPLICATION_WORDPRESS__DB_HOST);
		createEAttribute(tosca_nodes_webapplication_wordpressEClass, TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_PASSWORD);
		createEAttribute(tosca_nodes_webapplication_wordpressEClass, TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_USER);

		tosca_nodes_nodewithcapEClass = createEClass(TOSCA_NODES_NODEWITHCAP);

		tosca_nodes_container_application_dockerEClass = createEClass(TOSCA_NODES_CONTAINER_APPLICATION_DOCKER);

		tosca_nodes_softwarecomponent_kibanaEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_KIBANA);

		rsyslogEClass = createEClass(RSYSLOG);

		tosca_nodes_computewithattrlistEClass = createEClass(TOSCA_NODES_COMPUTEWITHATTRLIST);
		createEAttribute(tosca_nodes_computewithattrlistEClass, TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST);

		tosca_nodes_softwarecomponent_logstashEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH);

		tosca_nodes_softwarecomponent_collectdEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD);

		tosca_nodes_computewithcapwithattrEClass = createEClass(TOSCA_NODES_COMPUTEWITHCAPWITHATTR);

		tosca_nodes_nodewithreqEClass = createEClass(TOSCA_NODES_NODEWITHREQ);

		tosca_nodes_softwarecomponent_rsyslogEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG);

		tosca_nodes_hacomputeEClass = createEClass(TOSCA_NODES_HACOMPUTE);

		tosca_nodes_somenodeEClass = createEClass(TOSCA_NODES_SOMENODE);
		createEAttribute(tosca_nodes_somenodeEClass, TOSCA_NODES_SOMENODE__SOME_PROP);

		tosca_capabilities_container_dockerEClass = createEClass(TOSCA_CAPABILITIES_CONTAINER_DOCKER);
		createEAttribute(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL);
		createEReference(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS);
		createEReference(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS);
		createEReference(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES);
		createEReference(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION);

		tosca_nodes_webserver_nodejsEClass = createEClass(TOSCA_NODES_WEBSERVER_NODEJS);
		createEAttribute(tosca_nodes_webserver_nodejsEClass, TOSCA_NODES_WEBSERVER_NODEJS__GITHUB_URL);

		tosca_nodes_somenode2EClass = createEClass(TOSCA_NODES_SOMENODE2);

		tosca_nodes_dbms_mysqlEClass = createEClass(TOSCA_NODES_DBMS_MYSQL);

		mycompany_mytypes_myscalingpolicyEClass = createEClass(MYCOMPANY_MYTYPES_MYSCALINGPOLICY);

		tosca_relationships_haEClass = createEClass(TOSCA_RELATIONSHIPS_HA);

		test_relation_connectsEClass = createEClass(TEST_RELATION_CONNECTS);

		// Create enums
		protocolEnumEEnum = createEEnum(PROTOCOL_ENUM);
		initiatorEnumEEnum = createEEnum(INITIATOR_ENUM);

		// Create data types
		stringEDataType = createEDataType(STRING);
		stringMinOneEDataType = createEDataType(STRING_MIN_ONE);
		booleanEDataType = createEDataType(BOOLEAN);
		byteEDataType = createEDataType(BYTE);
		doubleEDataType = createEDataType(DOUBLE);
		floatEDataType = createEDataType(FLOAT);
		integerEDataType = createEDataType(INTEGER);
		integerMinOneEDataType = createEDataType(INTEGER_MIN_ONE);
		longEDataType = createEDataType(LONG);
		shortEDataType = createEDataType(SHORT);
		mapEDataType = createEDataType(MAP);
		versionEDataType = createEDataType(VERSION);
		rangeEDataType = createEDataType(RANGE);
		toscadatatypesnetworkPortDefEDataType = createEDataType(TOSCADATATYPESNETWORK_PORT_DEF);
		scalarFrequencyEDataType = createEDataType(SCALAR_FREQUENCY);
		scalarSizeMinOneMBEDataType = createEDataType(SCALAR_SIZE_MIN_ONE_MB);
		scalarSizeMinZeroGBEDataType = createEDataType(SCALAR_SIZE_MIN_ZERO_GB);
		scalarSizeMinZeroMBEDataType = createEDataType(SCALAR_SIZE_MIN_ZERO_MB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);
		SlaPackage theSlaPackage = (SlaPackage)EPackage.Registry.INSTANCE.getEPackage(SlaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tosca_capabilities_rootEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_nodeEClass.getESuperTypes().add(this.getTosca_capabilities_root());
		tosca_capabilities_nodeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_endpointEClass.getESuperTypes().add(this.getTosca_capabilities_root());
		tosca_capabilities_endpointEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_scalableEClass.getESuperTypes().add(this.getTosca_capabilities_root());
		tosca_capabilities_scalableEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_network_bindableEClass.getESuperTypes().add(this.getTosca_capabilities_node());
		tosca_capabilities_network_bindableEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_containerEClass.getESuperTypes().add(this.getTosca_capabilities_root());
		tosca_capabilities_containerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_endpoint_databaseEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint());
		tosca_capabilities_endpoint_databaseEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_endpoint_publicEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint());
		tosca_capabilities_endpoint_publicEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_endpoint_adminEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint());
		tosca_capabilities_endpoint_adminEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_operatingsystemEClass.getESuperTypes().add(this.getTosca_capabilities_root());
		tosca_capabilities_operatingsystemEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_attachmentEClass.getESuperTypes().add(this.getTosca_capabilities_root());
		tosca_capabilities_attachmentEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_rootEClass.getESuperTypes().add(this.getTosca_capabilities_node());
		tosca_nodes_rootEClass.getESuperTypes().add(this.getTosca_interfaces_node_lifecycle_standard());
		tosca_nodes_rootEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_webapplicationEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_webapplicationEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint());
		tosca_nodes_webapplicationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponentEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_softwarecomponentEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_dbmsEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		tosca_nodes_dbmsEClass.getESuperTypes().add(this.getTosca_capabilities_container());
		tosca_nodes_dbmsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_objectstorageEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_objectstorageEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint());
		tosca_nodes_objectstorageEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_computeEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_computeEClass.getESuperTypes().add(this.getTosca_capabilities_scalable());
		tosca_nodes_computeEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint_admin());
		tosca_nodes_computeEClass.getESuperTypes().add(this.getTosca_capabilities_operatingsystem());
		tosca_nodes_computeEClass.getESuperTypes().add(this.getTosca_capabilities_container());
		tosca_nodes_computeEClass.getESuperTypes().add(this.getTosca_capabilities_network_bindable());
		tosca_nodes_computeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_loadbalancerEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_loadbalancerEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint_public());
		tosca_nodes_loadbalancerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_webserverEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		tosca_nodes_webserverEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint());
		tosca_nodes_webserverEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint_admin());
		tosca_nodes_webserverEClass.getESuperTypes().add(this.getTosca_capabilities_container());
		tosca_nodes_webserverEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_databaseEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_databaseEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint_database());
		tosca_nodes_databaseEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_container_applicationEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_container_applicationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_container_runtimeEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		tosca_nodes_container_runtimeEClass.getESuperTypes().add(this.getTosca_capabilities_scalable());
		tosca_nodes_container_runtimeEClass.getESuperTypes().add(this.getTosca_capabilities_container());
		tosca_nodes_container_runtimeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_blockstorageEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_blockstorageEClass.getESuperTypes().add(this.getTosca_capabilities_attachment());
		tosca_nodes_blockstorageEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_policies_rootEClass.getESuperTypes().add(theSlaPackage.getAgreement_term());
		tosca_policies_rootEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_policies_updateEClass.getESuperTypes().add(this.getTosca_policies_root());
		tosca_policies_updateEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_policies_placementEClass.getESuperTypes().add(this.getTosca_policies_root());
		tosca_policies_placementEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_policies_scalingEClass.getESuperTypes().add(this.getTosca_policies_root());
		tosca_policies_scalingEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_policies_performanceEClass.getESuperTypes().add(this.getTosca_policies_root());
		tosca_policies_performanceEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_groups_rootEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_interfaces_rootEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_interfaces_relationship_configureEClass.getESuperTypes().add(this.getTosca_interfaces_root());
		tosca_interfaces_relationship_configureEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_interfaces_node_lifecycle_standardEClass.getESuperTypes().add(this.getTosca_interfaces_root());
		tosca_interfaces_node_lifecycle_standardEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_rootEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_connectstoEClass.getESuperTypes().add(this.getTosca_relationships_root());
		tosca_relationships_connectstoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_routestoEClass.getESuperTypes().add(this.getTosca_relationships_connectsto());
		tosca_relationships_routestoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_attachestoEClass.getESuperTypes().add(this.getTosca_relationships_root());
		tosca_relationships_attachestoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_hostedonEClass.getESuperTypes().add(this.getTosca_relationships_root());
		tosca_relationships_hostedonEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_dependsonEClass.getESuperTypes().add(this.getTosca_relationships_root());
		tosca_relationships_dependsonEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_indigo_endpointEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint());
		tosca_capabilities_indigo_endpointEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_somecapEClass.getESuperTypes().add(this.getTosca_capabilities_container());
		tosca_capabilities_somecapEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_haEClass.getESuperTypes().add(this.getTosca_capabilities_root());
		tosca_capabilities_haEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_containerchildEClass.getESuperTypes().add(this.getTosca_capabilities_container());
		tosca_capabilities_containerchildEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_somechildcapEClass.getESuperTypes().add(this.getTosca_capabilities_somecap());
		tosca_capabilities_somechildcapEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_database_mysqlEClass.getESuperTypes().add(this.getTosca_nodes_database());
		tosca_nodes_database_mysqlEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_computewithpropEClass.getESuperTypes().add(this.getTosca_nodes_compute());
		tosca_nodes_computewithpropEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_elasticsearchEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_elasticsearchEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint());
		tosca_nodes_softwarecomponent_elasticsearchEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_databasewithlistparamEClass.getESuperTypes().add(this.getTosca_nodes_database());
		tosca_nodes_databasewithlistparamEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_webapplication_paypalpizzastoreEClass.getESuperTypes().add(this.getTosca_nodes_webapplication());
		tosca_nodes_webapplication_paypalpizzastoreEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_webapplication_wordpressEClass.getESuperTypes().add(this.getTosca_nodes_webapplication());
		tosca_nodes_webapplication_wordpressEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_nodewithcapEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_nodewithcapEClass.getESuperTypes().add(this.getTosca_capabilities_somecap());
		tosca_nodes_nodewithcapEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_container_application_dockerEClass.getESuperTypes().add(this.getTosca_nodes_container_application());
		tosca_nodes_container_application_dockerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_kibanaEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_kibanaEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		rsyslogEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		rsyslogEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_computewithattrlistEClass.getESuperTypes().add(this.getTosca_nodes_compute());
		tosca_nodes_computewithattrlistEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_logstashEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_logstashEClass.getESuperTypes().add(this.getTosca_capabilities_endpoint());
		tosca_nodes_softwarecomponent_logstashEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_collectdEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_collectdEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_computewithcapwithattrEClass.getESuperTypes().add(this.getTosca_nodes_compute());
		tosca_nodes_computewithcapwithattrEClass.getESuperTypes().add(this.getTosca_capabilities_indigo_endpoint());
		tosca_nodes_computewithcapwithattrEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_nodewithreqEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		tosca_nodes_nodewithreqEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_rsyslogEClass.getESuperTypes().add(this.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_rsyslogEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_hacomputeEClass.getESuperTypes().add(this.getTosca_nodes_compute());
		tosca_nodes_hacomputeEClass.getESuperTypes().add(this.getTosca_capabilities_ha());
		tosca_nodes_hacomputeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_somenodeEClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_somenodeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_container_dockerEClass.getESuperTypes().add(this.getTosca_capabilities_container());
		tosca_capabilities_container_dockerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_webserver_nodejsEClass.getESuperTypes().add(this.getTosca_nodes_webserver());
		tosca_nodes_webserver_nodejsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_somenode2EClass.getESuperTypes().add(this.getTosca_nodes_root());
		tosca_nodes_somenode2EClass.getESuperTypes().add(this.getTosca_capabilities_containerchild());
		tosca_nodes_somenode2EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_dbms_mysqlEClass.getESuperTypes().add(this.getTosca_nodes_dbms());
		tosca_nodes_dbms_mysqlEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mycompany_mytypes_myscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_haEClass.getESuperTypes().add(this.getTosca_relationships_root());
		tosca_relationships_haEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		test_relation_connectsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(arraystringEClass, arraystring.class, "arraystring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarraystring_Values(), this.getstring(), "values", null, 0, -1, arraystring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkInfoEClass, NetworkInfo.class, "NetworkInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkInfo_Networkid(), this.getstring(), "networkid", null, 1, 1, NetworkInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInfo_Addresses(), this.getarraystring(), null, "addresses", null, 0, 1, NetworkInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInfo_Networkname(), this.getstring(), "networkname", null, 1, 1, NetworkInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portInfoEClass, PortInfo.class, "PortInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortInfo_Portname(), this.getstring(), "portname", null, 1, 1, PortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortInfo_Networkid(), this.getstring(), "networkid", null, 1, 1, PortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInfo_Addresses(), this.getarraystring(), null, "addresses", null, 0, 1, PortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortInfo_Macaddress(), this.getstring(), "macaddress", null, 1, 1, PortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortInfo_Portid(), this.getstring(), "portid", null, 1, 1, PortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(credentialEClass, Credential.class, "Credential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCredential_Protocol(), this.getstring(), "protocol", null, 1, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Keys(), this.getmap(), "keys", null, 1, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Tokentype(), this.getstring(), "tokentype", "The required token type.", 1, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_User(), this.getstring(), "user", null, 1, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Token(), this.getstring(), "token", null, 1, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portSpecEClass, PortSpec.class, "PortSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortSpec_Protocol(), this.getprotocolEnum(), "protocol", null, 1, 1, PortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortSpec_Targetrange(), this.getrange(), "targetrange", null, 1, 1, PortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortSpec_Sourcerange(), this.getrange(), "sourcerange", null, 1, 1, PortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortSpec_Source(), this.gettoscadatatypesnetworkPortDef(), "source", null, 1, 1, PortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortSpec_Target(), this.gettoscadatatypesnetworkPortDef(), "target", null, 1, 1, PortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayCredentialEClass, arrayCredential.class, "arrayCredential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getarrayCredential_ArraycredentialValues(), this.getCredential(), null, "arraycredentialValues", null, 0, -1, arrayCredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayintegerEClass, arrayinteger.class, "arrayinteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayinteger_Values(), this.getinteger(), "values", null, 0, -1, arrayinteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayPortSpecEClass, arrayPortSpec.class, "arrayPortSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getarrayPortSpec_ArrayportspecValues(), this.getPortSpec(), null, "arrayportspecValues", null, 0, -1, arrayPortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayversionEClass, arrayversion.class, "arrayversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayversion_Values(), this.getversion(), "values", null, 0, -1, arrayversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_rootEClass, Tosca_capabilities_root.class, "Tosca_capabilities_root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_nodeEClass, Tosca_capabilities_node.class, "Tosca_capabilities_node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_endpointEClass, Tosca_capabilities_endpoint.class, "Tosca_capabilities_endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_endpoint_PortName(), this.getstring(), "portName", null, 0, 1, Tosca_capabilities_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_endpoint_Protocol(), this.getstring(), "protocol", "tcp", 0, 1, Tosca_capabilities_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_endpoint_Port(), this.gettoscadatatypesnetworkPortDef(), "port", null, 0, 1, Tosca_capabilities_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_endpoint_Initiator(), this.getinitiatorEnum(), "initiator", "source", 0, 1, Tosca_capabilities_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_endpoint_NetworkName(), this.getstring(), "networkName", "PRIVATE", 0, 1, Tosca_capabilities_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_endpoint_Secure(), this.getboolean(), "secure", "false", 0, 1, Tosca_capabilities_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_endpoint_Ports(), this.getmap(), "ports", null, 0, 1, Tosca_capabilities_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_endpoint_UrlPath(), this.getstring(), "urlPath", null, 0, 1, Tosca_capabilities_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_scalableEClass, Tosca_capabilities_scalable.class, "Tosca_capabilities_scalable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_scalable_MinInstances(), this.getinteger(), "minInstances", "1", 0, 1, Tosca_capabilities_scalable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_scalable_MaxInstances(), this.getinteger(), "maxInstances", "1", 0, 1, Tosca_capabilities_scalable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_scalable_DefaultInstances(), this.getinteger(), "defaultInstances", "1", 0, 1, Tosca_capabilities_scalable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_network_bindableEClass, Tosca_capabilities_network_bindable.class, "Tosca_capabilities_network_bindable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_containerEClass, Tosca_capabilities_container.class, "Tosca_capabilities_container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_container_DiskSize(), this.getscalarSizeMinZeroMB(), "diskSize", null, 0, 1, Tosca_capabilities_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_endpoint_databaseEClass, Tosca_capabilities_endpoint_database.class, "Tosca_capabilities_endpoint_database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_endpoint_publicEClass, Tosca_capabilities_endpoint_public.class, "Tosca_capabilities_endpoint_public", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_endpoint_public_Floating(), this.getboolean(), "floating", "false", 0, 1, Tosca_capabilities_endpoint_public.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_endpoint_public_DnsName(), this.getstring(), "dnsName", null, 0, 1, Tosca_capabilities_endpoint_public.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_endpoint_adminEClass, Tosca_capabilities_endpoint_admin.class, "Tosca_capabilities_endpoint_admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_operatingsystemEClass, Tosca_capabilities_operatingsystem.class, "Tosca_capabilities_operatingsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_operatingsystem_Type(), this.getstring(), "type", null, 0, 1, Tosca_capabilities_operatingsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_operatingsystem_Distribution(), this.getstring(), "distribution", null, 0, 1, Tosca_capabilities_operatingsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_operatingsystem_Version(), this.getversion(), "version", null, 0, 1, Tosca_capabilities_operatingsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_attachmentEClass, Tosca_capabilities_attachment.class, "Tosca_capabilities_attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_rootEClass, Tosca_nodes_root.class, "Tosca_nodes_root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTosca_nodes_root__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_nodes_webapplicationEClass, Tosca_nodes_webapplication.class, "Tosca_nodes_webapplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_webapplication_ContextRoot(), this.getstring(), "contextRoot", null, 0, 1, Tosca_nodes_webapplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTosca_nodes_webapplication__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_nodes_softwarecomponentEClass, Tosca_nodes_softwarecomponent.class, "Tosca_nodes_softwarecomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTosca_nodes_softwarecomponent_AdminCredential(), this.getCredential(), null, "adminCredential", null, 0, 1, Tosca_nodes_softwarecomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_softwarecomponent_ComponentVersion(), this.getversion(), "componentVersion", null, 0, 1, Tosca_nodes_softwarecomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTosca_nodes_softwarecomponent__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_nodes_dbmsEClass, Tosca_nodes_dbms.class, "Tosca_nodes_dbms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_dbms_Port(), this.getinteger(), "port", null, 0, 1, Tosca_nodes_dbms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_dbms_RootPassword(), this.getstring(), "rootPassword", null, 0, 1, Tosca_nodes_dbms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTosca_nodes_dbms__SourceMustBeDatabase__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeDatabase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_nodes_objectstorageEClass, Tosca_nodes_objectstorage.class, "Tosca_nodes_objectstorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_objectstorage_Size(), this.getscalarSizeMinZeroGB(), "size", null, 0, 1, Tosca_nodes_objectstorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_objectstorage_Name(), this.getstring(), "name", null, 1, 1, Tosca_nodes_objectstorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTosca_nodes_objectstorage__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_nodes_computeEClass, Tosca_nodes_compute.class, "Tosca_nodes_compute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_compute_PrivateAddress(), this.getstring(), "privateAddress", null, 0, 1, Tosca_nodes_compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_compute_PublicAddress(), this.getstring(), "publicAddress", null, 0, 1, Tosca_nodes_compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_compute_Networks(), this.getmap(), "networks", null, 0, 1, Tosca_nodes_compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTosca_nodes_compute__SourceMustBeSoftwareComponent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeSoftwareComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTosca_nodes_compute__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_nodes_loadbalancerEClass, Tosca_nodes_loadbalancer.class, "Tosca_nodes_loadbalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_loadbalancer_Algorithm(), this.getstring(), "algorithm", null, 0, 1, Tosca_nodes_loadbalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_webserverEClass, Tosca_nodes_webserver.class, "Tosca_nodes_webserver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTosca_nodes_webserver__SourceMustBeWebApplication__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeWebApplication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_nodes_databaseEClass, Tosca_nodes_database.class, "Tosca_nodes_database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_database_Password(), this.getstring(), "password", null, 0, 1, Tosca_nodes_database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_database_Name(), this.getstring(), "name", null, 1, 1, Tosca_nodes_database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_database_User(), this.getstring(), "user", null, 0, 1, Tosca_nodes_database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTosca_nodes_database__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_nodes_container_applicationEClass, Tosca_nodes_container_application.class, "Tosca_nodes_container_application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTosca_nodes_container_application__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_nodes_container_runtimeEClass, Tosca_nodes_container_runtime.class, "Tosca_nodes_container_runtime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_blockstorageEClass, Tosca_nodes_blockstorage.class, "Tosca_nodes_blockstorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_blockstorage_Size(), this.getscalarSizeMinOneMB(), "size", null, 0, 1, Tosca_nodes_blockstorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_blockstorage_VolumeId(), this.getstring(), "volumeId", null, 0, 1, Tosca_nodes_blockstorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_blockstorage_SnapshotId(), this.getstring(), "snapshotId", null, 0, 1, Tosca_nodes_blockstorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTosca_nodes_blockstorage__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_policies_rootEClass, Tosca_policies_root.class, "Tosca_policies_root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_policies_updateEClass, Tosca_policies_update.class, "Tosca_policies_update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_policies_placementEClass, Tosca_policies_placement.class, "Tosca_policies_placement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_policies_scalingEClass, Tosca_policies_scaling.class, "Tosca_policies_scaling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_policies_performanceEClass, Tosca_policies_performance.class, "Tosca_policies_performance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_groups_rootEClass, Tosca_groups_root.class, "Tosca_groups_root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_interfaces_rootEClass, Tosca_interfaces_root.class, "Tosca_interfaces_root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_interfaces_relationship_configureEClass, Tosca_interfaces_relationship_configure.class, "Tosca_interfaces_relationship_configure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTosca_interfaces_relationship_configure__Pre_configure_source(), null, "pre_configure_source", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTosca_interfaces_relationship_configure__Pre_configure_target(), null, "pre_configure_target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTosca_interfaces_relationship_configure__Post_configure_source(), null, "post_configure_source", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTosca_interfaces_relationship_configure__Post_configure_target(), null, "post_configure_target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTosca_interfaces_relationship_configure__Remove_target(), null, "remove_target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTosca_interfaces_relationship_configure__Add_target(), null, "add_target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTosca_interfaces_relationship_configure__Add_source(), null, "add_source", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTosca_interfaces_relationship_configure__Target_changed(), null, "target_changed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_interfaces_node_lifecycle_standardEClass, Tosca_interfaces_node_lifecycle_standard.class, "Tosca_interfaces_node_lifecycle_standard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTosca_interfaces_node_lifecycle_standard__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTosca_interfaces_node_lifecycle_standard__Configure(), null, "configure", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTosca_interfaces_node_lifecycle_standard__Delete(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_relationships_rootEClass, Tosca_relationships_root.class, "Tosca_relationships_root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_relationships_root_ToscaName(), this.getstring(), "toscaName", null, 0, 1, Tosca_relationships_root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_relationships_root_State(), this.getstring(), "state", "initial", 0, 1, Tosca_relationships_root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_relationships_root_ToscaId(), this.getstring(), "toscaId", null, 0, 1, Tosca_relationships_root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTosca_relationships_root__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_relationships_connectstoEClass, Tosca_relationships_connectsto.class, "Tosca_relationships_connectsto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTosca_relationships_connectsto_Credential(), this.getCredential(), null, "credential", null, 0, 1, Tosca_relationships_connectsto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_relationships_routestoEClass, Tosca_relationships_routesto.class, "Tosca_relationships_routesto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTosca_relationships_routesto__SourceMustBeLoadBalancer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeLoadBalancer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_relationships_attachestoEClass, Tosca_relationships_attachesto.class, "Tosca_relationships_attachesto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_relationships_attachesto_Location(), this.getstringMinOne(), "location", null, 0, 1, Tosca_relationships_attachesto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTosca_relationships_attachesto__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTosca_relationships_attachesto__SourceMustBeComputeAndTargetMustBeBlockStorage__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeComputeAndTargetMustBeBlockStorage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_relationships_hostedonEClass, Tosca_relationships_hostedon.class, "Tosca_relationships_hostedon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTosca_relationships_hostedon__SourceMustBeWebServerAndTargetMustBeWebApplication__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeWebServerAndTargetMustBeWebApplication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTosca_relationships_hostedon__SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTosca_relationships_hostedon__SourceMustBeSoftwareComponentAndTargetMustBeCompute__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeSoftwareComponentAndTargetMustBeCompute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTosca_relationships_hostedon__SourceMustBeDatabaseAndTargetMustBeDBMS__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeDatabaseAndTargetMustBeDBMS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_relationships_dependsonEClass, Tosca_relationships_dependson.class, "Tosca_relationships_dependson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTosca_relationships_dependson__SourceMustBeNodeAndTargetMustBeNode__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeNodeAndTargetMustBeNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tosca_capabilities_indigo_endpointEClass, Tosca_capabilities_indigo_endpoint.class, "Tosca_capabilities_indigo_endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTosca_capabilities_indigo_endpoint_Credential(), this.getarrayCredential(), null, "credential", null, 0, 1, Tosca_capabilities_indigo_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_somecapEClass, Tosca_capabilities_somecap.class, "Tosca_capabilities_somecap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_somecap_Type(), this.getstring(), "type", "someval", 1, 1, Tosca_capabilities_somecap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_haEClass, Tosca_capabilities_ha.class, "Tosca_capabilities_ha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_containerchildEClass, Tosca_capabilities_containerchild.class, "Tosca_capabilities_containerchild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_somechildcapEClass, Tosca_capabilities_somechildcap.class, "Tosca_capabilities_somechildcap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_database_mysqlEClass, Tosca_nodes_database_mysql.class, "Tosca_nodes_database_mysql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_computewithpropEClass, Tosca_nodes_computewithprop.class, "Tosca_nodes_computewithprop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_computewithprop_Test(), this.getinteger(), "test", null, 0, 1, Tosca_nodes_computewithprop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_softwarecomponent_elasticsearchEClass, Tosca_nodes_softwarecomponent_elasticsearch.class, "Tosca_nodes_softwarecomponent_elasticsearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_databasewithlistparamEClass, Tosca_nodes_databasewithlistparam.class, "Tosca_nodes_databasewithlistparam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTosca_nodes_databasewithlistparam_ListProp(), this.getarrayinteger(), null, "listProp", null, 0, 1, Tosca_nodes_databasewithlistparam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_webapplication_paypalpizzastoreEClass, Tosca_nodes_webapplication_paypalpizzastore.class, "Tosca_nodes_webapplication_paypalpizzastore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_webapplication_paypalpizzastore_GithubUrl(), this.getstring(), "githubUrl", "https://github.com/sample.git", 0, 1, Tosca_nodes_webapplication_paypalpizzastore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_webapplication_wordpressEClass, Tosca_nodes_webapplication_wordpress.class, "Tosca_nodes_webapplication_wordpress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_webapplication_wordpress_DbHost(), this.getstring(), "dbHost", null, 0, 1, Tosca_nodes_webapplication_wordpress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_webapplication_wordpress_AdminPassword(), this.getstring(), "adminPassword", null, 0, 1, Tosca_nodes_webapplication_wordpress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_webapplication_wordpress_AdminUser(), this.getstring(), "adminUser", null, 0, 1, Tosca_nodes_webapplication_wordpress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_nodewithcapEClass, Tosca_nodes_nodewithcap.class, "Tosca_nodes_nodewithcap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_container_application_dockerEClass, Tosca_nodes_container_application_docker.class, "Tosca_nodes_container_application_docker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_softwarecomponent_kibanaEClass, Tosca_nodes_softwarecomponent_kibana.class, "Tosca_nodes_softwarecomponent_kibana", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rsyslogEClass, Rsyslog.class, "Rsyslog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_computewithattrlistEClass, Tosca_nodes_computewithattrlist.class, "Tosca_nodes_computewithattrlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_computewithattrlist_AttrList(), this.getmap(), "attrList", null, 0, 1, Tosca_nodes_computewithattrlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_softwarecomponent_logstashEClass, Tosca_nodes_softwarecomponent_logstash.class, "Tosca_nodes_softwarecomponent_logstash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_softwarecomponent_collectdEClass, Tosca_nodes_softwarecomponent_collectd.class, "Tosca_nodes_softwarecomponent_collectd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_computewithcapwithattrEClass, Tosca_nodes_computewithcapwithattr.class, "Tosca_nodes_computewithcapwithattr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_nodewithreqEClass, Tosca_nodes_nodewithreq.class, "Tosca_nodes_nodewithreq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_softwarecomponent_rsyslogEClass, Tosca_nodes_softwarecomponent_rsyslog.class, "Tosca_nodes_softwarecomponent_rsyslog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_hacomputeEClass, Tosca_nodes_hacompute.class, "Tosca_nodes_hacompute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_somenodeEClass, Tosca_nodes_somenode.class, "Tosca_nodes_somenode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_somenode_SomeProp(), this.getstring(), "someProp", "some", 0, 1, Tosca_nodes_somenode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_container_dockerEClass, Tosca_capabilities_container_docker.class, "Tosca_capabilities_container_docker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_container_docker_PublishAll(), this.getboolean(), "publishAll", "false", 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTosca_capabilities_container_docker_PublishPorts(), this.getarrayPortSpec(), null, "publishPorts", null, 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTosca_capabilities_container_docker_ExposePorts(), this.getarrayPortSpec(), null, "exposePorts", null, 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTosca_capabilities_container_docker_Volumes(), this.getarraystring(), null, "volumes", null, 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTosca_capabilities_container_docker_Version(), this.getarrayversion(), null, "version", null, 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_webserver_nodejsEClass, Tosca_nodes_webserver_nodejs.class, "Tosca_nodes_webserver_nodejs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_webserver_nodejs_GithubUrl(), this.getstring(), "githubUrl", "https://github.com/mmm/testnode.git", 0, 1, Tosca_nodes_webserver_nodejs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_somenode2EClass, Tosca_nodes_somenode2.class, "Tosca_nodes_somenode2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_dbms_mysqlEClass, Tosca_nodes_dbms_mysql.class, "Tosca_nodes_dbms_mysql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mycompany_mytypes_myscalingpolicyEClass, Mycompany_mytypes_myscalingpolicy.class, "Mycompany_mytypes_myscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_relationships_haEClass, Tosca_relationships_ha.class, "Tosca_relationships_ha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(test_relation_connectsEClass, Test_relation_connects.class, "Test_relation_connects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(protocolEnumEEnum, protocolEnum.class, "protocolEnum");
		addEEnumLiteral(protocolEnumEEnum, protocolEnum.UDP);
		addEEnumLiteral(protocolEnumEEnum, protocolEnum.TCP);
		addEEnumLiteral(protocolEnumEEnum, protocolEnum.IGMP);

		initEEnum(initiatorEnumEEnum, initiatorEnum.class, "initiatorEnum");
		addEEnumLiteral(initiatorEnumEEnum, initiatorEnum.SOURCE);
		addEEnumLiteral(initiatorEnumEEnum, initiatorEnum.TARGET);
		addEEnumLiteral(initiatorEnumEEnum, initiatorEnum.PEER);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "string", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringMinOneEDataType, String.class, "stringMinOne", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(byteEDataType, Byte.class, "byte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleEDataType, Double.class, "double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatEDataType, Float.class, "float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerMinOneEDataType, Integer.class, "integerMinOne", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longEDataType, Long.class, "long", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shortEDataType, Short.class, "short", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionEDataType, String.class, "version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rangeEDataType, Short.class, "range", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(toscadatatypesnetworkPortDefEDataType, Short.class, "toscadatatypesnetworkPortDef", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scalarFrequencyEDataType, Double.class, "scalarFrequency", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scalarSizeMinOneMBEDataType, Integer.class, "scalarSizeMinOneMB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scalarSizeMinZeroGBEDataType, Integer.class, "scalarSizeMinZeroGB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scalarSizeMinZeroMBEDataType, Integer.class, "scalarSizeMinZeroMB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (tosca_nodes_rootEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tosca_nodes_webapplicationEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tosca_nodes_softwarecomponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tosca_nodes_dbmsEClass, 
		   source, 
		   new String[] {
			 "constraints", "SourceMustBeDatabase"
		   });	
		addAnnotation
		  (tosca_nodes_objectstorageEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tosca_nodes_computeEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tosca_nodes_webserverEClass, 
		   source, 
		   new String[] {
			 "constraints", "SourceMustBeWebApplication"
		   });	
		addAnnotation
		  (tosca_nodes_databaseEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tosca_nodes_container_applicationEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tosca_nodes_blockstorageEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tosca_relationships_rootEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (tosca_relationships_routestoEClass, 
		   source, 
		   new String[] {
			 "constraints", "SourceMustBeLoadBalancer"
		   });	
		addAnnotation
		  (tosca_relationships_attachestoEClass, 
		   source, 
		   new String[] {
			 "constraints", "SourceMustBeComputeAndTargetMustBeBlockStorage"
		   });	
		addAnnotation
		  (tosca_relationships_hostedonEClass, 
		   source, 
		   new String[] {
			 "constraints", "SourceMustBeDatabaseAndTargetMustBeDBMS"
		   });	
		addAnnotation
		  (tosca_relationships_dependsonEClass, 
		   source, 
		   new String[] {
			 "constraints", "SourceMustBeNodeAndTargetMustBeNode"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (stringMinOneEDataType, 
		   source, 
		   new String[] {
			 "minLength", "1",
			 "pattern", null
		   });	
		addAnnotation
		  (integerMinOneEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "1"
		   });	
		addAnnotation
		  (versionEDataType, 
		   source, 
		   new String[] {
			 "pattern", "((\\d+)((\\.\\d+)+)?)"
		   });	
		addAnnotation
		  (rangeEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "1",
			 "MaxInclusive", "65535"
		   });	
		addAnnotation
		  (toscadatatypesnetworkPortDefEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "1",
			 "MaxInclusive", "65535"
		   });	
		addAnnotation
		  (scalarFrequencyEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "0.1 GHz"
		   });	
		addAnnotation
		  (scalarSizeMinOneMBEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "1 MB"
		   });	
		addAnnotation
		  (scalarSizeMinZeroGBEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "0 GB"
		   });	
		addAnnotation
		  (scalarSizeMinZeroMBEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "0 MB"
		   });
	}

} //ExtendedtoscaPackageImpl
