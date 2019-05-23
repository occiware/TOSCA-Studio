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
package extendedtosca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see extendedtosca.ExtendedtoscaPackage
 * @generated
 */
public interface ExtendedtoscaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtendedtoscaFactory eINSTANCE = extendedtosca.impl.ExtendedtoscaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>array Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Credential</em>'.
	 * @generated
	 */
	arrayCredential createarrayCredential();

	/**
	 * Returns a new object of class '<em>array Port Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Port Spec</em>'.
	 * @generated
	 */
	arrayPortSpec createarrayPortSpec();

	/**
	 * Returns a new object of class '<em>arrayversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>arrayversion</em>'.
	 * @generated
	 */
	arrayversion createarrayversion();

	/**
	 * Returns a new object of class '<em>arrayinteger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>arrayinteger</em>'.
	 * @generated
	 */
	arrayinteger createarrayinteger();

	/**
	 * Returns a new object of class '<em>Tosca capabilities indigo endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities indigo endpoint</em>'.
	 * @generated
	 */
	Tosca_capabilities_indigo_endpoint createTosca_capabilities_indigo_endpoint();

	/**
	 * Returns a new object of class '<em>Tosca capabilities somecap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities somecap</em>'.
	 * @generated
	 */
	Tosca_capabilities_somecap createTosca_capabilities_somecap();

	/**
	 * Returns a new object of class '<em>Tosca capabilities ha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities ha</em>'.
	 * @generated
	 */
	Tosca_capabilities_ha createTosca_capabilities_ha();

	/**
	 * Returns a new object of class '<em>Tosca capabilities container docker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities container docker</em>'.
	 * @generated
	 */
	Tosca_capabilities_container_docker createTosca_capabilities_container_docker();

	/**
	 * Returns a new object of class '<em>Tosca capabilities containerchild</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities containerchild</em>'.
	 * @generated
	 */
	Tosca_capabilities_containerchild createTosca_capabilities_containerchild();

	/**
	 * Returns a new object of class '<em>Tosca capabilities somechildcap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities somechildcap</em>'.
	 * @generated
	 */
	Tosca_capabilities_somechildcap createTosca_capabilities_somechildcap();

	/**
	 * Returns a new object of class '<em>Tosca nodes computewithprop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes computewithprop</em>'.
	 * @generated
	 */
	Tosca_nodes_computewithprop createTosca_nodes_computewithprop();

	/**
	 * Returns a new object of class '<em>Tosca nodes webapplication paypalpizzastore</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes webapplication paypalpizzastore</em>'.
	 * @generated
	 */
	Tosca_nodes_webapplication_paypalpizzastore createTosca_nodes_webapplication_paypalpizzastore();

	/**
	 * Returns a new object of class '<em>Tosca nodes network network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes network network</em>'.
	 * @generated
	 */
	Tosca_nodes_network_network createTosca_nodes_network_network();

	/**
	 * Returns a new object of class '<em>Tosca nodes container application docker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes container application docker</em>'.
	 * @generated
	 */
	Tosca_nodes_container_application_docker createTosca_nodes_container_application_docker();

	/**
	 * Returns a new object of class '<em>Tosca nodes softwarecomponent kibana</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes softwarecomponent kibana</em>'.
	 * @generated
	 */
	Tosca_nodes_softwarecomponent_kibana createTosca_nodes_softwarecomponent_kibana();

	/**
	 * Returns a new object of class '<em>Tosca nodes computewithattrlist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes computewithattrlist</em>'.
	 * @generated
	 */
	Tosca_nodes_computewithattrlist createTosca_nodes_computewithattrlist();

	/**
	 * Returns a new object of class '<em>Tosca nodes softwarecomponent logstash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes softwarecomponent logstash</em>'.
	 * @generated
	 */
	Tosca_nodes_softwarecomponent_logstash createTosca_nodes_softwarecomponent_logstash();

	/**
	 * Returns a new object of class '<em>Example databasesubsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example databasesubsystem</em>'.
	 * @generated
	 */
	Example_databasesubsystem createExample_databasesubsystem();

	/**
	 * Returns a new object of class '<em>Tosca nodes softwarecomponent collectd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes softwarecomponent collectd</em>'.
	 * @generated
	 */
	Tosca_nodes_softwarecomponent_collectd createTosca_nodes_softwarecomponent_collectd();

	/**
	 * Returns a new object of class '<em>Tosca nodes nodewithreq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes nodewithreq</em>'.
	 * @generated
	 */
	Tosca_nodes_nodewithreq createTosca_nodes_nodewithreq();

	/**
	 * Returns a new object of class '<em>Tosca nodes somenode2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes somenode2</em>'.
	 * @generated
	 */
	Tosca_nodes_somenode2 createTosca_nodes_somenode2();

	/**
	 * Returns a new object of class '<em>Tosca nodes php</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes php</em>'.
	 * @generated
	 */
	Tosca_nodes_php createTosca_nodes_php();

	/**
	 * Returns a new object of class '<em>Tosca nodes database mysql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes database mysql</em>'.
	 * @generated
	 */
	Tosca_nodes_database_mysql createTosca_nodes_database_mysql();

	/**
	 * Returns a new object of class '<em>Example queuingsubsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example queuingsubsystem</em>'.
	 * @generated
	 */
	Example_queuingsubsystem createExample_queuingsubsystem();

	/**
	 * Returns a new object of class '<em>Example transactionsubsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example transactionsubsystem</em>'.
	 * @generated
	 */
	Example_transactionsubsystem createExample_transactionsubsystem();

	/**
	 * Returns a new object of class '<em>Tosca nodes abstractmysql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes abstractmysql</em>'.
	 * @generated
	 */
	Tosca_nodes_abstractmysql createTosca_nodes_abstractmysql();

	/**
	 * Returns a new object of class '<em>Tosca nodes mysql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes mysql</em>'.
	 * @generated
	 */
	Tosca_nodes_mysql createTosca_nodes_mysql();

	/**
	 * Returns a new object of class '<em>Tosca nodes softwarecomponent elasticsearch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes softwarecomponent elasticsearch</em>'.
	 * @generated
	 */
	Tosca_nodes_softwarecomponent_elasticsearch createTosca_nodes_softwarecomponent_elasticsearch();

	/**
	 * Returns a new object of class '<em>Tosca nodes databasewithlistparam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes databasewithlistparam</em>'.
	 * @generated
	 */
	Tosca_nodes_databasewithlistparam createTosca_nodes_databasewithlistparam();

	/**
	 * Returns a new object of class '<em>Example someapp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example someapp</em>'.
	 * @generated
	 */
	Example_someapp createExample_someapp();

	/**
	 * Returns a new object of class '<em>Tosca nodes apache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes apache</em>'.
	 * @generated
	 */
	Tosca_nodes_apache createTosca_nodes_apache();

	/**
	 * Returns a new object of class '<em>Tosca nodes nodewithcap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes nodewithcap</em>'.
	 * @generated
	 */
	Tosca_nodes_nodewithcap createTosca_nodes_nodewithcap();

	/**
	 * Returns a new object of class '<em>Rsyslog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rsyslog</em>'.
	 * @generated
	 */
	Rsyslog createRsyslog();

	/**
	 * Returns a new object of class '<em>Tosca nodes wordpress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes wordpress</em>'.
	 * @generated
	 */
	Tosca_nodes_wordpress createTosca_nodes_wordpress();

	/**
	 * Returns a new object of class '<em>Tosca nodes network port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes network port</em>'.
	 * @generated
	 */
	Tosca_nodes_network_port createTosca_nodes_network_port();

	/**
	 * Returns a new object of class '<em>Tosca nodes computewithcapwithattr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes computewithcapwithattr</em>'.
	 * @generated
	 */
	Tosca_nodes_computewithcapwithattr createTosca_nodes_computewithcapwithattr();

	/**
	 * Returns a new object of class '<em>Tosca nodes softwarecomponent rsyslog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes softwarecomponent rsyslog</em>'.
	 * @generated
	 */
	Tosca_nodes_softwarecomponent_rsyslog createTosca_nodes_softwarecomponent_rsyslog();

	/**
	 * Returns a new object of class '<em>Tosca nodes hacompute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes hacompute</em>'.
	 * @generated
	 */
	Tosca_nodes_hacompute createTosca_nodes_hacompute();

	/**
	 * Returns a new object of class '<em>Tosca nodes somenode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes somenode</em>'.
	 * @generated
	 */
	Tosca_nodes_somenode createTosca_nodes_somenode();

	/**
	 * Returns a new object of class '<em>Tosca nodes webserver nodejs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes webserver nodejs</em>'.
	 * @generated
	 */
	Tosca_nodes_webserver_nodejs createTosca_nodes_webserver_nodejs();

	/**
	 * Returns a new object of class '<em>Tosca nodes dbms mysql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes dbms mysql</em>'.
	 * @generated
	 */
	Tosca_nodes_dbms_mysql createTosca_nodes_dbms_mysql();

	/**
	 * Returns a new object of class '<em>Mycompany mytypes myscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mycompany mytypes myscalingpolicy</em>'.
	 * @generated
	 */
	Mycompany_mytypes_myscalingpolicy createMycompany_mytypes_myscalingpolicy();

	/**
	 * Returns a new object of class '<em>Test relation connects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test relation connects</em>'.
	 * @generated
	 */
	Test_relation_connects createTest_relation_connects();

	/**
	 * Returns a new object of class '<em>Tosca relationships network bindsto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships network bindsto</em>'.
	 * @generated
	 */
	Tosca_relationships_network_bindsto createTosca_relationships_network_bindsto();

	/**
	 * Returns a new object of class '<em>Tosca relationships ha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships ha</em>'.
	 * @generated
	 */
	Tosca_relationships_ha createTosca_relationships_ha();

	/**
	 * Returns a new object of class '<em>Myattachesto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Myattachesto</em>'.
	 * @generated
	 */
	Myattachesto createMyattachesto();

	/**
	 * Returns a new object of class '<em>Tosca relationships network linksto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships network linksto</em>'.
	 * @generated
	 */
	Tosca_relationships_network_linksto createTosca_relationships_network_linksto();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtendedtoscaPackage getExtendedtoscaPackage();

} //ExtendedtoscaFactory
