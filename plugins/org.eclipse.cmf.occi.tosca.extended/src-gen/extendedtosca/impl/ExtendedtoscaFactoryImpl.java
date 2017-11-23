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

import org.eclipse.emf.ecore.EClass;
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
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL: return createarrayCredential();
			case ExtendedtoscaPackage.ARRAY_PORT_SPEC: return createarrayPortSpec();
			case ExtendedtoscaPackage.ARRAYVERSION: return createarrayversion();
			case ExtendedtoscaPackage.ARRAYINTEGER: return createarrayinteger();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_INDIGO_ENDPOINT: return createTosca_capabilities_indigo_endpoint();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECAP: return createTosca_capabilities_somecap();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_HA: return createTosca_capabilities_ha();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER: return createTosca_capabilities_container_docker();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINERCHILD: return createTosca_capabilities_containerchild();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECHILDCAP: return createTosca_capabilities_somechildcap();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE_MYSQL: return createTosca_nodes_database_mysql();
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHPROP: return createTosca_nodes_computewithprop();
			case ExtendedtoscaPackage.CAPABILITIES: return createCapabilities();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH: return createTosca_nodes_softwarecomponent_elasticsearch();
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM: return createTosca_nodes_databasewithlistparam();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE: return createTosca_nodes_webapplication_paypalpizzastore();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS: return createTosca_nodes_webapplication_wordpress();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK: return createTosca_nodes_network_network();
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP: return createTosca_nodes_nodewithcap();
			case ExtendedtoscaPackage.TOSCA_NODES_CONTAINER_APPLICATION_DOCKER: return createTosca_nodes_container_application_docker();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_KIBANA: return createTosca_nodes_softwarecomponent_kibana();
			case ExtendedtoscaPackage.RSYSLOG: return createRsyslog();
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST: return createTosca_nodes_computewithattrlist();
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT: return createTosca_nodes_network_port();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH: return createTosca_nodes_softwarecomponent_logstash();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD: return createTosca_nodes_softwarecomponent_collectd();
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHCAPWITHATTR: return createTosca_nodes_computewithcapwithattr();
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHREQ: return createTosca_nodes_nodewithreq();
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG: return createTosca_nodes_softwarecomponent_rsyslog();
			case ExtendedtoscaPackage.TOSCA_NODES_HACOMPUTE: return createTosca_nodes_hacompute();
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE: return createTosca_nodes_somenode();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER_NODEJS: return createTosca_nodes_webserver_nodejs();
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE2: return createTosca_nodes_somenode2();
			case ExtendedtoscaPackage.TOSCA_NODES_DBMS_MYSQL: return createTosca_nodes_dbms_mysql();
			case ExtendedtoscaPackage.MYCOMPANY_MYTYPES_MYSCALINGPOLICY: return createMycompany_mytypes_myscalingpolicy();
			case ExtendedtoscaPackage.TEST_RELATION_CONNECTS: return createTest_relation_connects();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_NETWORK_BINDSTO: return createTosca_relationships_network_bindsto();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_HA: return createTosca_relationships_ha();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_NETWORK_LINKSTO: return createTosca_relationships_network_linksto();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public arrayinteger createarrayinteger() {
		arrayintegerImpl arrayinteger = new arrayintegerImpl();
		return arrayinteger;
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
	public Tosca_capabilities_container_docker createTosca_capabilities_container_docker() {
		Tosca_capabilities_container_dockerImpl tosca_capabilities_container_docker = new Tosca_capabilities_container_dockerImpl();
		return tosca_capabilities_container_docker;
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
	public Capabilities createCapabilities() {
		CapabilitiesImpl capabilities = new CapabilitiesImpl();
		return capabilities;
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
	public Tosca_nodes_network_network createTosca_nodes_network_network() {
		Tosca_nodes_network_networkImpl tosca_nodes_network_network = new Tosca_nodes_network_networkImpl();
		return tosca_nodes_network_network;
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
	public Tosca_nodes_network_port createTosca_nodes_network_port() {
		Tosca_nodes_network_portImpl tosca_nodes_network_port = new Tosca_nodes_network_portImpl();
		return tosca_nodes_network_port;
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
	public Test_relation_connects createTest_relation_connects() {
		Test_relation_connectsImpl test_relation_connects = new Test_relation_connectsImpl();
		return test_relation_connects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_relationships_network_bindsto createTosca_relationships_network_bindsto() {
		Tosca_relationships_network_bindstoImpl tosca_relationships_network_bindsto = new Tosca_relationships_network_bindstoImpl();
		return tosca_relationships_network_bindsto;
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
	public Tosca_relationships_network_linksto createTosca_relationships_network_linksto() {
		Tosca_relationships_network_linkstoImpl tosca_relationships_network_linksto = new Tosca_relationships_network_linkstoImpl();
		return tosca_relationships_network_linksto;
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
