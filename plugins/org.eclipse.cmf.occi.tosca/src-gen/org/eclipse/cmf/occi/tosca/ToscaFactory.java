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
package org.eclipse.cmf.occi.tosca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage
 * @generated
 */
public interface ToscaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscaFactory eINSTANCE = org.eclipse.cmf.occi.tosca.impl.ToscaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>array String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array String</em>'.
	 * @generated
	 */
	arrayString createarrayString();

	/**
	 * Returns a new object of class '<em>array Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Boolean</em>'.
	 * @generated
	 */
	arrayBoolean createarrayBoolean();

	/**
	 * Returns a new object of class '<em>array Byte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Byte</em>'.
	 * @generated
	 */
	arrayByte createarrayByte();

	/**
	 * Returns a new object of class '<em>array Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Double</em>'.
	 * @generated
	 */
	arrayDouble createarrayDouble();

	/**
	 * Returns a new object of class '<em>array Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Float</em>'.
	 * @generated
	 */
	arrayFloat createarrayFloat();

	/**
	 * Returns a new object of class '<em>array Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Integer</em>'.
	 * @generated
	 */
	arrayInteger createarrayInteger();

	/**
	 * Returns a new object of class '<em>array Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Long</em>'.
	 * @generated
	 */
	arrayLong createarrayLong();

	/**
	 * Returns a new object of class '<em>array Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array Short</em>'.
	 * @generated
	 */
	arrayShort createarrayShort();

	/**
	 * Returns a new object of class '<em>toscadatatypesnetwork Network Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>toscadatatypesnetwork Network Info</em>'.
	 * @generated
	 */
	toscadatatypesnetworkNetworkInfo createtoscadatatypesnetworkNetworkInfo();

	/**
	 * Returns a new object of class '<em>toscadatatypesnetwork Port Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>toscadatatypesnetwork Port Info</em>'.
	 * @generated
	 */
	toscadatatypesnetworkPortInfo createtoscadatatypesnetworkPortInfo();

	/**
	 * Returns a new object of class '<em>toscadatatypes Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>toscadatatypes Credential</em>'.
	 * @generated
	 */
	toscadatatypesCredential createtoscadatatypesCredential();

	/**
	 * Returns a new object of class '<em>toscadatatypesnetwork Port Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>toscadatatypesnetwork Port Spec</em>'.
	 * @generated
	 */
	toscadatatypesnetworkPortSpec createtoscadatatypesnetworkPortSpec();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToscaPackage getToscaPackage();

} //ToscaFactory
