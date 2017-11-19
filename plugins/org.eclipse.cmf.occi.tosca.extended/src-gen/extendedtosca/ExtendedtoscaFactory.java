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
	 * Returns a new object of class '<em>arraystring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>arraystring</em>'.
	 * @generated
	 */
	arraystring createarraystring();

	/**
	 * Returns a new object of class '<em>Network Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Info</em>'.
	 * @generated
	 */
	NetworkInfo createNetworkInfo();

	/**
	 * Returns a new object of class '<em>Port Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Info</em>'.
	 * @generated
	 */
	PortInfo createPortInfo();

	/**
	 * Returns a new object of class '<em>Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credential</em>'.
	 * @generated
	 */
	Credential createCredential();

	/**
	 * Returns a new object of class '<em>Port Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Spec</em>'.
	 * @generated
	 */
	PortSpec createPortSpec();

	/**
	 * Returns a new object of class '<em>array Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Credential</em>'.
	 * @generated
	 */
	arrayCredential createarrayCredential();

	/**
	 * Returns a new object of class '<em>arrayinteger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>arrayinteger</em>'.
	 * @generated
	 */
	arrayinteger createarrayinteger();

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
	 * Returns a new object of class '<em>Tosca capabilities root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities root</em>'.
	 * @generated
	 */
	Tosca_capabilities_root createTosca_capabilities_root();

	/**
	 * Returns a new object of class '<em>Tosca capabilities node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities node</em>'.
	 * @generated
	 */
	Tosca_capabilities_node createTosca_capabilities_node();

	/**
	 * Returns a new object of class '<em>Tosca capabilities endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities endpoint</em>'.
	 * @generated
	 */
	Tosca_capabilities_endpoint createTosca_capabilities_endpoint();

	/**
	 * Returns a new object of class '<em>Tosca capabilities scalable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities scalable</em>'.
	 * @generated
	 */
	Tosca_capabilities_scalable createTosca_capabilities_scalable();

	/**
	 * Returns a new object of class '<em>Tosca capabilities network bindable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities network bindable</em>'.
	 * @generated
	 */
	Tosca_capabilities_network_bindable createTosca_capabilities_network_bindable();

	/**
	 * Returns a new object of class '<em>Tosca capabilities container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities container</em>'.
	 * @generated
	 */
	Tosca_capabilities_container createTosca_capabilities_container();

	/**
	 * Returns a new object of class '<em>Tosca capabilities endpoint database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities endpoint database</em>'.
	 * @generated
	 */
	Tosca_capabilities_endpoint_database createTosca_capabilities_endpoint_database();

	/**
	 * Returns a new object of class '<em>Tosca capabilities endpoint public</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities endpoint public</em>'.
	 * @generated
	 */
	Tosca_capabilities_endpoint_public createTosca_capabilities_endpoint_public();

	/**
	 * Returns a new object of class '<em>Tosca capabilities endpoint admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities endpoint admin</em>'.
	 * @generated
	 */
	Tosca_capabilities_endpoint_admin createTosca_capabilities_endpoint_admin();

	/**
	 * Returns a new object of class '<em>Tosca capabilities operatingsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities operatingsystem</em>'.
	 * @generated
	 */
	Tosca_capabilities_operatingsystem createTosca_capabilities_operatingsystem();

	/**
	 * Returns a new object of class '<em>Tosca capabilities attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities attachment</em>'.
	 * @generated
	 */
	Tosca_capabilities_attachment createTosca_capabilities_attachment();

	/**
	 * Returns a new object of class '<em>Tosca nodes root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes root</em>'.
	 * @generated
	 */
	Tosca_nodes_root createTosca_nodes_root();

	/**
	 * Returns a new object of class '<em>Tosca nodes webapplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes webapplication</em>'.
	 * @generated
	 */
	Tosca_nodes_webapplication createTosca_nodes_webapplication();

	/**
	 * Returns a new object of class '<em>Tosca nodes softwarecomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes softwarecomponent</em>'.
	 * @generated
	 */
	Tosca_nodes_softwarecomponent createTosca_nodes_softwarecomponent();

	/**
	 * Returns a new object of class '<em>Tosca nodes dbms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes dbms</em>'.
	 * @generated
	 */
	Tosca_nodes_dbms createTosca_nodes_dbms();

	/**
	 * Returns a new object of class '<em>Tosca nodes objectstorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes objectstorage</em>'.
	 * @generated
	 */
	Tosca_nodes_objectstorage createTosca_nodes_objectstorage();

	/**
	 * Returns a new object of class '<em>Tosca nodes compute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes compute</em>'.
	 * @generated
	 */
	Tosca_nodes_compute createTosca_nodes_compute();

	/**
	 * Returns a new object of class '<em>Tosca nodes loadbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes loadbalancer</em>'.
	 * @generated
	 */
	Tosca_nodes_loadbalancer createTosca_nodes_loadbalancer();

	/**
	 * Returns a new object of class '<em>Tosca nodes webserver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes webserver</em>'.
	 * @generated
	 */
	Tosca_nodes_webserver createTosca_nodes_webserver();

	/**
	 * Returns a new object of class '<em>Tosca nodes database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes database</em>'.
	 * @generated
	 */
	Tosca_nodes_database createTosca_nodes_database();

	/**
	 * Returns a new object of class '<em>Tosca nodes container application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes container application</em>'.
	 * @generated
	 */
	Tosca_nodes_container_application createTosca_nodes_container_application();

	/**
	 * Returns a new object of class '<em>Tosca nodes container runtime</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes container runtime</em>'.
	 * @generated
	 */
	Tosca_nodes_container_runtime createTosca_nodes_container_runtime();

	/**
	 * Returns a new object of class '<em>Tosca nodes blockstorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes blockstorage</em>'.
	 * @generated
	 */
	Tosca_nodes_blockstorage createTosca_nodes_blockstorage();

	/**
	 * Returns a new object of class '<em>Tosca policies root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca policies root</em>'.
	 * @generated
	 */
	Tosca_policies_root createTosca_policies_root();

	/**
	 * Returns a new object of class '<em>Tosca policies update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca policies update</em>'.
	 * @generated
	 */
	Tosca_policies_update createTosca_policies_update();

	/**
	 * Returns a new object of class '<em>Tosca policies placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca policies placement</em>'.
	 * @generated
	 */
	Tosca_policies_placement createTosca_policies_placement();

	/**
	 * Returns a new object of class '<em>Tosca policies scaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca policies scaling</em>'.
	 * @generated
	 */
	Tosca_policies_scaling createTosca_policies_scaling();

	/**
	 * Returns a new object of class '<em>Tosca policies performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca policies performance</em>'.
	 * @generated
	 */
	Tosca_policies_performance createTosca_policies_performance();

	/**
	 * Returns a new object of class '<em>Tosca groups root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca groups root</em>'.
	 * @generated
	 */
	Tosca_groups_root createTosca_groups_root();

	/**
	 * Returns a new object of class '<em>Tosca interfaces root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca interfaces root</em>'.
	 * @generated
	 */
	Tosca_interfaces_root createTosca_interfaces_root();

	/**
	 * Returns a new object of class '<em>Tosca interfaces relationship configure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca interfaces relationship configure</em>'.
	 * @generated
	 */
	Tosca_interfaces_relationship_configure createTosca_interfaces_relationship_configure();

	/**
	 * Returns a new object of class '<em>Tosca interfaces node lifecycle standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca interfaces node lifecycle standard</em>'.
	 * @generated
	 */
	Tosca_interfaces_node_lifecycle_standard createTosca_interfaces_node_lifecycle_standard();

	/**
	 * Returns a new object of class '<em>Tosca relationships root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships root</em>'.
	 * @generated
	 */
	Tosca_relationships_root createTosca_relationships_root();

	/**
	 * Returns a new object of class '<em>Tosca relationships connectsto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships connectsto</em>'.
	 * @generated
	 */
	Tosca_relationships_connectsto createTosca_relationships_connectsto();

	/**
	 * Returns a new object of class '<em>Tosca relationships routesto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships routesto</em>'.
	 * @generated
	 */
	Tosca_relationships_routesto createTosca_relationships_routesto();

	/**
	 * Returns a new object of class '<em>Tosca relationships attachesto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships attachesto</em>'.
	 * @generated
	 */
	Tosca_relationships_attachesto createTosca_relationships_attachesto();

	/**
	 * Returns a new object of class '<em>Tosca relationships hostedon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships hostedon</em>'.
	 * @generated
	 */
	Tosca_relationships_hostedon createTosca_relationships_hostedon();

	/**
	 * Returns a new object of class '<em>Tosca relationships dependson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships dependson</em>'.
	 * @generated
	 */
	Tosca_relationships_dependson createTosca_relationships_dependson();

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
	 * Returns a new object of class '<em>Tosca nodes database mysql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes database mysql</em>'.
	 * @generated
	 */
	Tosca_nodes_database_mysql createTosca_nodes_database_mysql();

	/**
	 * Returns a new object of class '<em>Tosca nodes computewithprop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes computewithprop</em>'.
	 * @generated
	 */
	Tosca_nodes_computewithprop createTosca_nodes_computewithprop();

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
	 * Returns a new object of class '<em>Tosca nodes webapplication paypalpizzastore</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes webapplication paypalpizzastore</em>'.
	 * @generated
	 */
	Tosca_nodes_webapplication_paypalpizzastore createTosca_nodes_webapplication_paypalpizzastore();

	/**
	 * Returns a new object of class '<em>Tosca nodes webapplication wordpress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes webapplication wordpress</em>'.
	 * @generated
	 */
	Tosca_nodes_webapplication_wordpress createTosca_nodes_webapplication_wordpress();

	/**
	 * Returns a new object of class '<em>Tosca nodes nodewithcap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes nodewithcap</em>'.
	 * @generated
	 */
	Tosca_nodes_nodewithcap createTosca_nodes_nodewithcap();

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
	 * Returns a new object of class '<em>Rsyslog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rsyslog</em>'.
	 * @generated
	 */
	Rsyslog createRsyslog();

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
	 * Returns a new object of class '<em>Tosca nodes softwarecomponent collectd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes softwarecomponent collectd</em>'.
	 * @generated
	 */
	Tosca_nodes_softwarecomponent_collectd createTosca_nodes_softwarecomponent_collectd();

	/**
	 * Returns a new object of class '<em>Tosca nodes computewithcapwithattr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes computewithcapwithattr</em>'.
	 * @generated
	 */
	Tosca_nodes_computewithcapwithattr createTosca_nodes_computewithcapwithattr();

	/**
	 * Returns a new object of class '<em>Tosca nodes nodewithreq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes nodewithreq</em>'.
	 * @generated
	 */
	Tosca_nodes_nodewithreq createTosca_nodes_nodewithreq();

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
	 * Returns a new object of class '<em>Tosca capabilities container docker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca capabilities container docker</em>'.
	 * @generated
	 */
	Tosca_capabilities_container_docker createTosca_capabilities_container_docker();

	/**
	 * Returns a new object of class '<em>Tosca nodes webserver nodejs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes webserver nodejs</em>'.
	 * @generated
	 */
	Tosca_nodes_webserver_nodejs createTosca_nodes_webserver_nodejs();

	/**
	 * Returns a new object of class '<em>Tosca nodes somenode2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca nodes somenode2</em>'.
	 * @generated
	 */
	Tosca_nodes_somenode2 createTosca_nodes_somenode2();

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
	 * Returns a new object of class '<em>Tosca relationships ha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tosca relationships ha</em>'.
	 * @generated
	 */
	Tosca_relationships_ha createTosca_relationships_ha();

	/**
	 * Returns a new object of class '<em>Test relation connects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test relation connects</em>'.
	 * @generated
	 */
	Test_relation_connects createTest_relation_connects();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtendedtoscaPackage getExtendedtoscaPackage();

} //ExtendedtoscaFactory
