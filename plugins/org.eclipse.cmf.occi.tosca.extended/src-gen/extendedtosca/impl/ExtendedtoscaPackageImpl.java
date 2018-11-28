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

import extendedtosca.Example_databasesubsystem;
import extendedtosca.Example_queuingsubsystem;
import extendedtosca.Example_someapp;
import extendedtosca.Example_transactionsubsystem;
import extendedtosca.ExtendedtoscaFactory;
import extendedtosca.ExtendedtoscaPackage;
import extendedtosca.Myattachesto;
import extendedtosca.Mycompany_mytypes_myscalingpolicy;
import extendedtosca.Rsyslog;
import extendedtosca.Test_relation_connects;
import extendedtosca.Tosca_capabilities_container_docker;
import extendedtosca.Tosca_capabilities_containerchild;
import extendedtosca.Tosca_capabilities_ha;
import extendedtosca.Tosca_capabilities_indigo_endpoint;
import extendedtosca.Tosca_capabilities_somecap;
import extendedtosca.Tosca_capabilities_somechildcap;
import extendedtosca.Tosca_nodes_computewithattrlist;
import extendedtosca.Tosca_nodes_computewithcapwithattr;
import extendedtosca.Tosca_nodes_computewithprop;
import extendedtosca.Tosca_nodes_container_application_docker;
import extendedtosca.Tosca_nodes_database_mysql;
import extendedtosca.Tosca_nodes_databasewithlistparam;
import extendedtosca.Tosca_nodes_dbms_mysql;
import extendedtosca.Tosca_nodes_hacompute;
import extendedtosca.Tosca_nodes_network_network;
import extendedtosca.Tosca_nodes_network_port;
import extendedtosca.Tosca_nodes_nodewithcap;
import extendedtosca.Tosca_nodes_nodewithreq;
import extendedtosca.Tosca_nodes_softwarecomponent_collectd;
import extendedtosca.Tosca_nodes_softwarecomponent_elasticsearch;
import extendedtosca.Tosca_nodes_softwarecomponent_kibana;
import extendedtosca.Tosca_nodes_softwarecomponent_logstash;
import extendedtosca.Tosca_nodes_softwarecomponent_rsyslog;
import extendedtosca.Tosca_nodes_somenode;
import extendedtosca.Tosca_nodes_somenode2;
import extendedtosca.Tosca_nodes_webapplication_paypalpizzastore;
import extendedtosca.Tosca_nodes_webapplication_wordpress;
import extendedtosca.Tosca_nodes_webserver_nodejs;
import extendedtosca.Tosca_relationships_ha;
import extendedtosca.Tosca_relationships_network_bindsto;
import extendedtosca.Tosca_relationships_network_linksto;
import extendedtosca.arrayCredential;
import extendedtosca.arrayPortSpec;
import extendedtosca.arrayinteger;
import extendedtosca.arrayversion;
import extendedtosca.ip_versionEnum;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.cmf.occi.sla.SlaPackage;

import org.eclipse.cmf.occi.tosca.ToscaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass arrayCredentialEClass = null;

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
	private EClass arrayintegerEClass = null;

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
	private EClass tosca_capabilities_container_dockerEClass = null;

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
	private EClass tosca_nodes_computewithpropEClass = null;

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
	private EClass tosca_nodes_network_networkEClass = null;

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
	private EClass example_databasesubsystemEClass = null;

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
	private EClass tosca_nodes_nodewithreqEClass = null;

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
	private EClass tosca_nodes_database_mysqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass example_queuingsubsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass example_transactionsubsystemEClass = null;

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
	private EClass example_someappEClass = null;

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
	private EClass rsyslogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_nodes_network_portEClass = null;

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
	private EClass tosca_nodes_webserver_nodejsEClass = null;

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
	private EClass test_relation_connectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_relationships_network_bindstoEClass = null;

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
	private EClass myattachestoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tosca_relationships_network_linkstoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ip_versionEnumEEnum = null;

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
		Object registeredExtendedtoscaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExtendedtoscaPackageImpl theExtendedtoscaPackage = registeredExtendedtoscaPackage instanceof ExtendedtoscaPackageImpl ? (ExtendedtoscaPackageImpl)registeredExtendedtoscaPackage : new ExtendedtoscaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		SlaPackage.eINSTANCE.eClass();
		ToscaPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExtendedtoscaPackage.createPackageContents();

		// Initialize created meta-data
		theExtendedtoscaPackage.initializePackageContents();

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
	public EClass getTosca_nodes_network_network() {
		return tosca_nodes_network_networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_PhysicalNetwork() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_SegmentationId() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_NetworkId() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_IpVersion() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_StartIp() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_NetworkName() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_Cidr() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_GatewayIp() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_NetworkType() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_network_EndIp() {
		return (EAttribute)tosca_nodes_network_networkEClass.getEStructuralFeatures().get(9);
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
	public EClass getExample_databasesubsystem() {
		return example_databasesubsystemEClass;
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
	public EClass getTosca_nodes_nodewithreq() {
		return tosca_nodes_nodewithreqEClass;
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
	public EClass getTosca_nodes_database_mysql() {
		return tosca_nodes_database_mysqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExample_queuingsubsystem() {
		return example_queuingsubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExample_transactionsubsystem() {
		return example_transactionsubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExample_transactionsubsystem_ReceiverPort() {
		return (EAttribute)example_transactionsubsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExample_transactionsubsystem_MqServiceIp() {
		return (EAttribute)example_transactionsubsystemEClass.getEStructuralFeatures().get(1);
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
	public EClass getExample_someapp() {
		return example_someappEClass;
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
	public EClass getRsyslog() {
		return rsyslogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_nodes_network_port() {
		return tosca_nodes_network_portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_port_IpRangeEnd() {
		return (EAttribute)tosca_nodes_network_portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_port_IpRangeStart() {
		return (EAttribute)tosca_nodes_network_portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_port_IpAddress() {
		return (EAttribute)tosca_nodes_network_portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_port_IsDefault() {
		return (EAttribute)tosca_nodes_network_portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_nodes_network_port_Order() {
		return (EAttribute)tosca_nodes_network_portEClass.getEStructuralFeatures().get(4);
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
	public EClass getTest_relation_connects() {
		return test_relation_connectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_relationships_network_bindsto() {
		return tosca_relationships_network_bindstoEClass;
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
	public EClass getMyattachesto() {
		return myattachestoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTosca_relationships_network_linksto() {
		return tosca_relationships_network_linkstoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getip_versionEnum() {
		return ip_versionEnumEEnum;
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
		arrayCredentialEClass = createEClass(ARRAY_CREDENTIAL);
		createEReference(arrayCredentialEClass, ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES);

		arrayPortSpecEClass = createEClass(ARRAY_PORT_SPEC);
		createEReference(arrayPortSpecEClass, ARRAY_PORT_SPEC__ARRAYPORTSPEC_VALUES);

		arrayversionEClass = createEClass(ARRAYVERSION);
		createEAttribute(arrayversionEClass, ARRAYVERSION__VALUES);

		arrayintegerEClass = createEClass(ARRAYINTEGER);
		createEAttribute(arrayintegerEClass, ARRAYINTEGER__VALUES);

		tosca_capabilities_indigo_endpointEClass = createEClass(TOSCA_CAPABILITIES_INDIGO_ENDPOINT);
		createEReference(tosca_capabilities_indigo_endpointEClass, TOSCA_CAPABILITIES_INDIGO_ENDPOINT__CREDENTIAL);

		tosca_capabilities_somecapEClass = createEClass(TOSCA_CAPABILITIES_SOMECAP);
		createEAttribute(tosca_capabilities_somecapEClass, TOSCA_CAPABILITIES_SOMECAP__TYPE);

		tosca_capabilities_haEClass = createEClass(TOSCA_CAPABILITIES_HA);

		tosca_capabilities_container_dockerEClass = createEClass(TOSCA_CAPABILITIES_CONTAINER_DOCKER);
		createEAttribute(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL);
		createEReference(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS);
		createEReference(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS);
		createEReference(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES);
		createEReference(tosca_capabilities_container_dockerEClass, TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION);

		tosca_capabilities_containerchildEClass = createEClass(TOSCA_CAPABILITIES_CONTAINERCHILD);

		tosca_capabilities_somechildcapEClass = createEClass(TOSCA_CAPABILITIES_SOMECHILDCAP);

		tosca_nodes_computewithpropEClass = createEClass(TOSCA_NODES_COMPUTEWITHPROP);
		createEAttribute(tosca_nodes_computewithpropEClass, TOSCA_NODES_COMPUTEWITHPROP__TEST);

		tosca_nodes_webapplication_paypalpizzastoreEClass = createEClass(TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE);
		createEAttribute(tosca_nodes_webapplication_paypalpizzastoreEClass, TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL);

		tosca_nodes_webapplication_wordpressEClass = createEClass(TOSCA_NODES_WEBAPPLICATION_WORDPRESS);
		createEAttribute(tosca_nodes_webapplication_wordpressEClass, TOSCA_NODES_WEBAPPLICATION_WORDPRESS__DB_HOST);
		createEAttribute(tosca_nodes_webapplication_wordpressEClass, TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_PASSWORD);
		createEAttribute(tosca_nodes_webapplication_wordpressEClass, TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_USER);

		tosca_nodes_network_networkEClass = createEClass(TOSCA_NODES_NETWORK_NETWORK);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__PHYSICAL_NETWORK);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__SEGMENTATION_ID);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__NETWORK_ID);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__IP_VERSION);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__START_IP);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__NETWORK_NAME);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__CIDR);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__GATEWAY_IP);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__NETWORK_TYPE);
		createEAttribute(tosca_nodes_network_networkEClass, TOSCA_NODES_NETWORK_NETWORK__END_IP);

		tosca_nodes_container_application_dockerEClass = createEClass(TOSCA_NODES_CONTAINER_APPLICATION_DOCKER);

		tosca_nodes_softwarecomponent_kibanaEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_KIBANA);

		tosca_nodes_computewithattrlistEClass = createEClass(TOSCA_NODES_COMPUTEWITHATTRLIST);
		createEAttribute(tosca_nodes_computewithattrlistEClass, TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST);

		tosca_nodes_softwarecomponent_logstashEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH);

		example_databasesubsystemEClass = createEClass(EXAMPLE_DATABASESUBSYSTEM);

		tosca_nodes_softwarecomponent_collectdEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD);

		tosca_nodes_nodewithreqEClass = createEClass(TOSCA_NODES_NODEWITHREQ);

		tosca_nodes_somenode2EClass = createEClass(TOSCA_NODES_SOMENODE2);

		tosca_nodes_database_mysqlEClass = createEClass(TOSCA_NODES_DATABASE_MYSQL);

		example_queuingsubsystemEClass = createEClass(EXAMPLE_QUEUINGSUBSYSTEM);

		example_transactionsubsystemEClass = createEClass(EXAMPLE_TRANSACTIONSUBSYSTEM);
		createEAttribute(example_transactionsubsystemEClass, EXAMPLE_TRANSACTIONSUBSYSTEM__RECEIVER_PORT);
		createEAttribute(example_transactionsubsystemEClass, EXAMPLE_TRANSACTIONSUBSYSTEM__MQ_SERVICE_IP);

		tosca_nodes_softwarecomponent_elasticsearchEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH);

		tosca_nodes_databasewithlistparamEClass = createEClass(TOSCA_NODES_DATABASEWITHLISTPARAM);
		createEReference(tosca_nodes_databasewithlistparamEClass, TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP);

		example_someappEClass = createEClass(EXAMPLE_SOMEAPP);

		tosca_nodes_nodewithcapEClass = createEClass(TOSCA_NODES_NODEWITHCAP);

		rsyslogEClass = createEClass(RSYSLOG);

		tosca_nodes_network_portEClass = createEClass(TOSCA_NODES_NETWORK_PORT);
		createEAttribute(tosca_nodes_network_portEClass, TOSCA_NODES_NETWORK_PORT__IP_RANGE_END);
		createEAttribute(tosca_nodes_network_portEClass, TOSCA_NODES_NETWORK_PORT__IP_RANGE_START);
		createEAttribute(tosca_nodes_network_portEClass, TOSCA_NODES_NETWORK_PORT__IP_ADDRESS);
		createEAttribute(tosca_nodes_network_portEClass, TOSCA_NODES_NETWORK_PORT__IS_DEFAULT);
		createEAttribute(tosca_nodes_network_portEClass, TOSCA_NODES_NETWORK_PORT__ORDER);

		tosca_nodes_computewithcapwithattrEClass = createEClass(TOSCA_NODES_COMPUTEWITHCAPWITHATTR);

		tosca_nodes_softwarecomponent_rsyslogEClass = createEClass(TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG);

		tosca_nodes_hacomputeEClass = createEClass(TOSCA_NODES_HACOMPUTE);

		tosca_nodes_somenodeEClass = createEClass(TOSCA_NODES_SOMENODE);
		createEAttribute(tosca_nodes_somenodeEClass, TOSCA_NODES_SOMENODE__SOME_PROP);

		tosca_nodes_webserver_nodejsEClass = createEClass(TOSCA_NODES_WEBSERVER_NODEJS);
		createEAttribute(tosca_nodes_webserver_nodejsEClass, TOSCA_NODES_WEBSERVER_NODEJS__GITHUB_URL);

		tosca_nodes_dbms_mysqlEClass = createEClass(TOSCA_NODES_DBMS_MYSQL);

		mycompany_mytypes_myscalingpolicyEClass = createEClass(MYCOMPANY_MYTYPES_MYSCALINGPOLICY);

		test_relation_connectsEClass = createEClass(TEST_RELATION_CONNECTS);

		tosca_relationships_network_bindstoEClass = createEClass(TOSCA_RELATIONSHIPS_NETWORK_BINDSTO);

		tosca_relationships_haEClass = createEClass(TOSCA_RELATIONSHIPS_HA);

		myattachestoEClass = createEClass(MYATTACHESTO);

		tosca_relationships_network_linkstoEClass = createEClass(TOSCA_RELATIONSHIPS_NETWORK_LINKSTO);

		// Create enums
		ip_versionEnumEEnum = createEEnum(IP_VERSION_ENUM);
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
		ToscaPackage theToscaPackage = (ToscaPackage)EPackage.Registry.INSTANCE.getEPackage(ToscaPackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tosca_capabilities_indigo_endpointEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_endpoint());
		tosca_capabilities_indigo_endpointEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_somecapEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_container());
		tosca_capabilities_somecapEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_haEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_root());
		tosca_capabilities_haEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_container_dockerEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_container());
		tosca_capabilities_container_dockerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_containerchildEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_container());
		tosca_capabilities_containerchildEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_capabilities_somechildcapEClass.getESuperTypes().add(this.getTosca_capabilities_somecap());
		tosca_capabilities_somechildcapEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_computewithpropEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_compute());
		tosca_nodes_computewithpropEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_webapplication_paypalpizzastoreEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_webapplication());
		tosca_nodes_webapplication_paypalpizzastoreEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_webapplication_wordpressEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_webapplication());
		tosca_nodes_webapplication_wordpressEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_network_networkEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_root());
		tosca_nodes_network_networkEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_container_application_dockerEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_container_application());
		tosca_nodes_container_application_dockerEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_kibanaEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_kibanaEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_computewithattrlistEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_compute());
		tosca_nodes_computewithattrlistEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_logstashEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_logstashEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_endpoint());
		tosca_nodes_softwarecomponent_logstashEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		example_databasesubsystemEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_root());
		example_databasesubsystemEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_endpoint_database());
		example_databasesubsystemEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_collectdEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_collectdEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_nodewithreqEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_softwarecomponent());
		tosca_nodes_nodewithreqEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_somenode2EClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_root());
		tosca_nodes_somenode2EClass.getESuperTypes().add(this.getTosca_capabilities_containerchild());
		tosca_nodes_somenode2EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_database_mysqlEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_database());
		tosca_nodes_database_mysqlEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		example_queuingsubsystemEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_root());
		example_queuingsubsystemEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_endpoint());
		example_queuingsubsystemEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		example_transactionsubsystemEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_root());
		example_transactionsubsystemEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_endpoint());
		example_transactionsubsystemEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_elasticsearchEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_elasticsearchEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_endpoint());
		tosca_nodes_softwarecomponent_elasticsearchEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_databasewithlistparamEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_database());
		tosca_nodes_databasewithlistparamEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		example_someappEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_root());
		example_someappEClass.getESuperTypes().add(theToscaPackage.getTosca_capabilities_endpoint());
		example_someappEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_nodewithcapEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_root());
		tosca_nodes_nodewithcapEClass.getESuperTypes().add(this.getTosca_capabilities_somecap());
		tosca_nodes_nodewithcapEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		rsyslogEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_softwarecomponent());
		rsyslogEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_network_portEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_root());
		tosca_nodes_network_portEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_computewithcapwithattrEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_compute());
		tosca_nodes_computewithcapwithattrEClass.getESuperTypes().add(this.getTosca_capabilities_indigo_endpoint());
		tosca_nodes_computewithcapwithattrEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_softwarecomponent_rsyslogEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_softwarecomponent());
		tosca_nodes_softwarecomponent_rsyslogEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_hacomputeEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_compute());
		tosca_nodes_hacomputeEClass.getESuperTypes().add(this.getTosca_capabilities_ha());
		tosca_nodes_hacomputeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_somenodeEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_root());
		tosca_nodes_somenodeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_webserver_nodejsEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_webserver());
		tosca_nodes_webserver_nodejsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_nodes_dbms_mysqlEClass.getESuperTypes().add(theToscaPackage.getTosca_nodes_dbms());
		tosca_nodes_dbms_mysqlEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mycompany_mytypes_myscalingpolicyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		test_relation_connectsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_network_bindstoEClass.getESuperTypes().add(theToscaPackage.getTosca_relationships_dependson());
		tosca_relationships_network_bindstoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_haEClass.getESuperTypes().add(theToscaPackage.getTosca_relationships_root());
		tosca_relationships_haEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		myattachestoEClass.getESuperTypes().add(theToscaPackage.getTosca_relationships_attachesto());
		myattachestoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		tosca_relationships_network_linkstoEClass.getESuperTypes().add(theToscaPackage.getTosca_relationships_dependson());
		tosca_relationships_network_linkstoEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(arrayCredentialEClass, arrayCredential.class, "arrayCredential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getarrayCredential_ArraycredentialValues(), theToscaPackage.getCredential(), null, "arraycredentialValues", null, 0, -1, arrayCredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayPortSpecEClass, arrayPortSpec.class, "arrayPortSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getarrayPortSpec_ArrayportspecValues(), theToscaPackage.getPortSpec(), null, "arrayportspecValues", null, 0, -1, arrayPortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayversionEClass, arrayversion.class, "arrayversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayversion_Values(), theToscaPackage.getversion(), "values", null, 0, -1, arrayversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayintegerEClass, arrayinteger.class, "arrayinteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayinteger_Values(), theToscaPackage.getinteger(), "values", null, 0, -1, arrayinteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_indigo_endpointEClass, Tosca_capabilities_indigo_endpoint.class, "Tosca_capabilities_indigo_endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTosca_capabilities_indigo_endpoint_Credential(), this.getarrayCredential(), null, "credential", null, 0, 1, Tosca_capabilities_indigo_endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_somecapEClass, Tosca_capabilities_somecap.class, "Tosca_capabilities_somecap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_somecap_Type(), theToscaPackage.getstring(), "type", "someval", 1, 1, Tosca_capabilities_somecap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_haEClass, Tosca_capabilities_ha.class, "Tosca_capabilities_ha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_container_dockerEClass, Tosca_capabilities_container_docker.class, "Tosca_capabilities_container_docker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_container_docker_PublishAll(), theToscaPackage.getboolean(), "publishAll", "false", 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTosca_capabilities_container_docker_PublishPorts(), this.getarrayPortSpec(), null, "publishPorts", null, 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTosca_capabilities_container_docker_ExposePorts(), this.getarrayPortSpec(), null, "exposePorts", null, 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTosca_capabilities_container_docker_Volumes(), theToscaPackage.getarraystring(), null, "volumes", null, 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTosca_capabilities_container_docker_Version(), this.getarrayversion(), null, "version", null, 0, 1, Tosca_capabilities_container_docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_containerchildEClass, Tosca_capabilities_containerchild.class, "Tosca_capabilities_containerchild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_somechildcapEClass, Tosca_capabilities_somechildcap.class, "Tosca_capabilities_somechildcap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_computewithpropEClass, Tosca_nodes_computewithprop.class, "Tosca_nodes_computewithprop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_computewithprop_Test(), theToscaPackage.getinteger(), "test", null, 0, 1, Tosca_nodes_computewithprop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_webapplication_paypalpizzastoreEClass, Tosca_nodes_webapplication_paypalpizzastore.class, "Tosca_nodes_webapplication_paypalpizzastore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_webapplication_paypalpizzastore_GithubUrl(), theToscaPackage.getstring(), "githubUrl", "https://github.com/sample.git", 0, 1, Tosca_nodes_webapplication_paypalpizzastore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_webapplication_wordpressEClass, Tosca_nodes_webapplication_wordpress.class, "Tosca_nodes_webapplication_wordpress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_webapplication_wordpress_DbHost(), theToscaPackage.getstring(), "dbHost", null, 0, 1, Tosca_nodes_webapplication_wordpress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_webapplication_wordpress_AdminPassword(), theToscaPackage.getstring(), "adminPassword", null, 0, 1, Tosca_nodes_webapplication_wordpress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_webapplication_wordpress_AdminUser(), theToscaPackage.getstring(), "adminUser", null, 0, 1, Tosca_nodes_webapplication_wordpress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_network_networkEClass, Tosca_nodes_network_network.class, "Tosca_nodes_network_network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_network_network_PhysicalNetwork(), theToscaPackage.getstring(), "physicalNetwork", null, 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_network_SegmentationId(), theToscaPackage.getstring(), "segmentationId", null, 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_network_NetworkId(), theToscaPackage.getstring(), "networkId", null, 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_network_IpVersion(), this.getip_versionEnum(), "ipVersion", "IPv4", 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_network_StartIp(), theToscaPackage.getstring(), "startIp", null, 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_network_NetworkName(), theToscaPackage.getstring(), "networkName", null, 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_network_Cidr(), theToscaPackage.getstring(), "cidr", null, 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_network_GatewayIp(), theToscaPackage.getstring(), "gatewayIp", null, 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_network_NetworkType(), theToscaPackage.getstring(), "networkType", null, 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_network_EndIp(), theToscaPackage.getstring(), "endIp", null, 0, 1, Tosca_nodes_network_network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_container_application_dockerEClass, Tosca_nodes_container_application_docker.class, "Tosca_nodes_container_application_docker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_softwarecomponent_kibanaEClass, Tosca_nodes_softwarecomponent_kibana.class, "Tosca_nodes_softwarecomponent_kibana", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_computewithattrlistEClass, Tosca_nodes_computewithattrlist.class, "Tosca_nodes_computewithattrlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_computewithattrlist_AttrList(), theToscaPackage.getmap(), "attrList", null, 0, 1, Tosca_nodes_computewithattrlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_softwarecomponent_logstashEClass, Tosca_nodes_softwarecomponent_logstash.class, "Tosca_nodes_softwarecomponent_logstash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(example_databasesubsystemEClass, Example_databasesubsystem.class, "Example_databasesubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_softwarecomponent_collectdEClass, Tosca_nodes_softwarecomponent_collectd.class, "Tosca_nodes_softwarecomponent_collectd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_nodewithreqEClass, Tosca_nodes_nodewithreq.class, "Tosca_nodes_nodewithreq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_somenode2EClass, Tosca_nodes_somenode2.class, "Tosca_nodes_somenode2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_database_mysqlEClass, Tosca_nodes_database_mysql.class, "Tosca_nodes_database_mysql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(example_queuingsubsystemEClass, Example_queuingsubsystem.class, "Example_queuingsubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(example_transactionsubsystemEClass, Example_transactionsubsystem.class, "Example_transactionsubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExample_transactionsubsystem_ReceiverPort(), theToscaPackage.getinteger(), "receiverPort", null, 0, 1, Example_transactionsubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExample_transactionsubsystem_MqServiceIp(), theToscaPackage.getstring(), "mqServiceIp", null, 0, 1, Example_transactionsubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_softwarecomponent_elasticsearchEClass, Tosca_nodes_softwarecomponent_elasticsearch.class, "Tosca_nodes_softwarecomponent_elasticsearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_databasewithlistparamEClass, Tosca_nodes_databasewithlistparam.class, "Tosca_nodes_databasewithlistparam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTosca_nodes_databasewithlistparam_ListProp(), this.getarrayinteger(), null, "listProp", null, 0, 1, Tosca_nodes_databasewithlistparam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(example_someappEClass, Example_someapp.class, "Example_someapp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_nodewithcapEClass, Tosca_nodes_nodewithcap.class, "Tosca_nodes_nodewithcap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rsyslogEClass, Rsyslog.class, "Rsyslog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_network_portEClass, Tosca_nodes_network_port.class, "Tosca_nodes_network_port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_network_port_IpRangeEnd(), theToscaPackage.getstring(), "ipRangeEnd", null, 0, 1, Tosca_nodes_network_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_port_IpRangeStart(), theToscaPackage.getstring(), "ipRangeStart", null, 0, 1, Tosca_nodes_network_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_port_IpAddress(), theToscaPackage.getstring(), "ipAddress", null, 0, 1, Tosca_nodes_network_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_port_IsDefault(), theToscaPackage.getboolean(), "isDefault", "false", 0, 1, Tosca_nodes_network_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_nodes_network_port_Order(), theToscaPackage.getintegerMinZero(), "order", "0", 1, 1, Tosca_nodes_network_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_computewithcapwithattrEClass, Tosca_nodes_computewithcapwithattr.class, "Tosca_nodes_computewithcapwithattr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_softwarecomponent_rsyslogEClass, Tosca_nodes_softwarecomponent_rsyslog.class, "Tosca_nodes_softwarecomponent_rsyslog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_hacomputeEClass, Tosca_nodes_hacompute.class, "Tosca_nodes_hacompute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_nodes_somenodeEClass, Tosca_nodes_somenode.class, "Tosca_nodes_somenode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_somenode_SomeProp(), theToscaPackage.getstring(), "someProp", "some", 0, 1, Tosca_nodes_somenode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_webserver_nodejsEClass, Tosca_nodes_webserver_nodejs.class, "Tosca_nodes_webserver_nodejs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_nodes_webserver_nodejs_GithubUrl(), theToscaPackage.getstring(), "githubUrl", "https://github.com/mmm/testnode.git", 0, 1, Tosca_nodes_webserver_nodejs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_nodes_dbms_mysqlEClass, Tosca_nodes_dbms_mysql.class, "Tosca_nodes_dbms_mysql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mycompany_mytypes_myscalingpolicyEClass, Mycompany_mytypes_myscalingpolicy.class, "Mycompany_mytypes_myscalingpolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(test_relation_connectsEClass, Test_relation_connects.class, "Test_relation_connects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_relationships_network_bindstoEClass, Tosca_relationships_network_bindsto.class, "Tosca_relationships_network_bindsto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_relationships_haEClass, Tosca_relationships_ha.class, "Tosca_relationships_ha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(myattachestoEClass, Myattachesto.class, "Myattachesto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_relationships_network_linkstoEClass, Tosca_relationships_network_linksto.class, "Tosca_relationships_network_linksto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(ip_versionEnumEEnum, ip_versionEnum.class, "ip_versionEnum");
		addEEnumLiteral(ip_versionEnumEEnum, ip_versionEnum.IPV4);
		addEEnumLiteral(ip_versionEnumEEnum, ip_versionEnum.IPV6);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
	}

} //ExtendedtoscaPackageImpl
