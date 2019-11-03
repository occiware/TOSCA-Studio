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
package org.eclipse.cmf.occi.tosca.util;

import modmacao.Component;
import modmacao.Dependency;
import modmacao.Executiondependency;
import modmacao.Installationdependency;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.sla.Agreement_term;

import org.eclipse.cmf.occi.tosca.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.modmacao.occi.platform.Database;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage
 * @generated
 */
public class ToscaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToscaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaSwitch() {
		if (modelPackage == null) {
			modelPackage = ToscaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ToscaPackage.ARRAYSTRING: {
				arraystring arraystring = (arraystring)theEObject;
				T result = casearraystring(arraystring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.NETWORK_INFO: {
				NetworkInfo networkInfo = (NetworkInfo)theEObject;
				T result = caseNetworkInfo(networkInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PORT_INFO: {
				PortInfo portInfo = (PortInfo)theEObject;
				T result = casePortInfo(portInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.CREDENTIAL: {
				Credential credential = (Credential)theEObject;
				T result = caseCredential(credential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PORT_SPEC: {
				PortSpec portSpec = (PortSpec)theEObject;
				T result = casePortSpec(portSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_ROOT: {
				Tosca_capabilities_root tosca_capabilities_root = (Tosca_capabilities_root)theEObject;
				T result = caseTosca_capabilities_root(tosca_capabilities_root);
				if (result == null) result = caseComponent(tosca_capabilities_root);
				if (result == null) result = caseMixinBase(tosca_capabilities_root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_NODE: {
				Tosca_capabilities_node tosca_capabilities_node = (Tosca_capabilities_node)theEObject;
				T result = caseTosca_capabilities_node(tosca_capabilities_node);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_node);
				if (result == null) result = caseComponent(tosca_capabilities_node);
				if (result == null) result = caseMixinBase(tosca_capabilities_node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT: {
				Tosca_capabilities_endpoint tosca_capabilities_endpoint = (Tosca_capabilities_endpoint)theEObject;
				T result = caseTosca_capabilities_endpoint(tosca_capabilities_endpoint);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_endpoint);
				if (result == null) result = caseComponent(tosca_capabilities_endpoint);
				if (result == null) result = caseMixinBase(tosca_capabilities_endpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_SCALABLE: {
				Tosca_capabilities_scalable tosca_capabilities_scalable = (Tosca_capabilities_scalable)theEObject;
				T result = caseTosca_capabilities_scalable(tosca_capabilities_scalable);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_scalable);
				if (result == null) result = caseComponent(tosca_capabilities_scalable);
				if (result == null) result = caseMixinBase(tosca_capabilities_scalable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_NETWORK_BINDABLE: {
				Tosca_capabilities_network_bindable tosca_capabilities_network_bindable = (Tosca_capabilities_network_bindable)theEObject;
				T result = caseTosca_capabilities_network_bindable(tosca_capabilities_network_bindable);
				if (result == null) result = caseTosca_capabilities_node(tosca_capabilities_network_bindable);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_network_bindable);
				if (result == null) result = caseComponent(tosca_capabilities_network_bindable);
				if (result == null) result = caseMixinBase(tosca_capabilities_network_bindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER: {
				Tosca_capabilities_container tosca_capabilities_container = (Tosca_capabilities_container)theEObject;
				T result = caseTosca_capabilities_container(tosca_capabilities_container);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_container);
				if (result == null) result = caseComponent(tosca_capabilities_container);
				if (result == null) result = caseMixinBase(tosca_capabilities_container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_DATABASE: {
				Tosca_capabilities_endpoint_database tosca_capabilities_endpoint_database = (Tosca_capabilities_endpoint_database)theEObject;
				T result = caseTosca_capabilities_endpoint_database(tosca_capabilities_endpoint_database);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_capabilities_endpoint_database);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_endpoint_database);
				if (result == null) result = caseComponent(tosca_capabilities_endpoint_database);
				if (result == null) result = caseMixinBase(tosca_capabilities_endpoint_database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC: {
				Tosca_capabilities_endpoint_public tosca_capabilities_endpoint_public = (Tosca_capabilities_endpoint_public)theEObject;
				T result = caseTosca_capabilities_endpoint_public(tosca_capabilities_endpoint_public);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_capabilities_endpoint_public);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_endpoint_public);
				if (result == null) result = caseComponent(tosca_capabilities_endpoint_public);
				if (result == null) result = caseMixinBase(tosca_capabilities_endpoint_public);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_ADMIN: {
				Tosca_capabilities_endpoint_admin tosca_capabilities_endpoint_admin = (Tosca_capabilities_endpoint_admin)theEObject;
				T result = caseTosca_capabilities_endpoint_admin(tosca_capabilities_endpoint_admin);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_capabilities_endpoint_admin);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_endpoint_admin);
				if (result == null) result = caseComponent(tosca_capabilities_endpoint_admin);
				if (result == null) result = caseMixinBase(tosca_capabilities_endpoint_admin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM: {
				Tosca_capabilities_operatingsystem tosca_capabilities_operatingsystem = (Tosca_capabilities_operatingsystem)theEObject;
				T result = caseTosca_capabilities_operatingsystem(tosca_capabilities_operatingsystem);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_operatingsystem);
				if (result == null) result = caseComponent(tosca_capabilities_operatingsystem);
				if (result == null) result = caseMixinBase(tosca_capabilities_operatingsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_CAPABILITIES_ATTACHMENT: {
				Tosca_capabilities_attachment tosca_capabilities_attachment = (Tosca_capabilities_attachment)theEObject;
				T result = caseTosca_capabilities_attachment(tosca_capabilities_attachment);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_attachment);
				if (result == null) result = caseComponent(tosca_capabilities_attachment);
				if (result == null) result = caseMixinBase(tosca_capabilities_attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_ROOT: {
				Tosca_nodes_root tosca_nodes_root = (Tosca_nodes_root)theEObject;
				T result = caseTosca_nodes_root(tosca_nodes_root);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_root);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_root);
				if (result == null) result = caseComponent(tosca_nodes_root);
				if (result == null) result = caseMixinBase(tosca_nodes_root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_WEBAPPLICATION: {
				Tosca_nodes_webapplication tosca_nodes_webapplication = (Tosca_nodes_webapplication)theEObject;
				T result = caseTosca_nodes_webapplication(tosca_nodes_webapplication);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_webapplication);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_webapplication);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_webapplication);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_webapplication);
				if (result == null) result = caseComponent(tosca_nodes_webapplication);
				if (result == null) result = caseMixinBase(tosca_nodes_webapplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT: {
				Tosca_nodes_softwarecomponent tosca_nodes_softwarecomponent = (Tosca_nodes_softwarecomponent)theEObject;
				T result = caseTosca_nodes_softwarecomponent(tosca_nodes_softwarecomponent);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_softwarecomponent);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_softwarecomponent);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_softwarecomponent);
				if (result == null) result = caseComponent(tosca_nodes_softwarecomponent);
				if (result == null) result = caseMixinBase(tosca_nodes_softwarecomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_DBMS: {
				Tosca_nodes_dbms tosca_nodes_dbms = (Tosca_nodes_dbms)theEObject;
				T result = caseTosca_nodes_dbms(tosca_nodes_dbms);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_dbms);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_dbms);
				if (result == null) result = caseDatabase(tosca_nodes_dbms);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_dbms);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_dbms);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_dbms);
				if (result == null) result = caseComponent(tosca_nodes_dbms);
				if (result == null) result = caseMixinBase(tosca_nodes_dbms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_OBJECTSTORAGE: {
				Tosca_nodes_objectstorage tosca_nodes_objectstorage = (Tosca_nodes_objectstorage)theEObject;
				T result = caseTosca_nodes_objectstorage(tosca_nodes_objectstorage);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_objectstorage);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_objectstorage);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_objectstorage);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_objectstorage);
				if (result == null) result = caseComponent(tosca_nodes_objectstorage);
				if (result == null) result = caseMixinBase(tosca_nodes_objectstorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_COMPUTE: {
				Tosca_nodes_compute tosca_nodes_compute = (Tosca_nodes_compute)theEObject;
				T result = caseTosca_nodes_compute(tosca_nodes_compute);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_compute);
				if (result == null) result = caseTosca_capabilities_scalable(tosca_nodes_compute);
				if (result == null) result = caseTosca_capabilities_endpoint_admin(tosca_nodes_compute);
				if (result == null) result = caseTosca_capabilities_operatingsystem(tosca_nodes_compute);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_compute);
				if (result == null) result = caseTosca_capabilities_network_bindable(tosca_nodes_compute);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_compute);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_compute);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_compute);
				if (result == null) result = caseComponent(tosca_nodes_compute);
				if (result == null) result = caseMixinBase(tosca_nodes_compute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_LOADBALANCER: {
				Tosca_nodes_loadbalancer tosca_nodes_loadbalancer = (Tosca_nodes_loadbalancer)theEObject;
				T result = caseTosca_nodes_loadbalancer(tosca_nodes_loadbalancer);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_loadbalancer);
				if (result == null) result = caseTosca_capabilities_endpoint_public(tosca_nodes_loadbalancer);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_loadbalancer);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_loadbalancer);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_loadbalancer);
				if (result == null) result = caseComponent(tosca_nodes_loadbalancer);
				if (result == null) result = caseMixinBase(tosca_nodes_loadbalancer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_WEBSERVER: {
				Tosca_nodes_webserver tosca_nodes_webserver = (Tosca_nodes_webserver)theEObject;
				T result = caseTosca_nodes_webserver(tosca_nodes_webserver);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_webserver);
				if (result == null) result = caseTosca_capabilities_endpoint_admin(tosca_nodes_webserver);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_webserver);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_webserver);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_webserver);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_webserver);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_webserver);
				if (result == null) result = caseComponent(tosca_nodes_webserver);
				if (result == null) result = caseMixinBase(tosca_nodes_webserver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_DATABASE: {
				Tosca_nodes_database tosca_nodes_database = (Tosca_nodes_database)theEObject;
				T result = caseTosca_nodes_database(tosca_nodes_database);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_database);
				if (result == null) result = caseTosca_capabilities_endpoint_database(tosca_nodes_database);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_database);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_database);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_database);
				if (result == null) result = caseComponent(tosca_nodes_database);
				if (result == null) result = caseMixinBase(tosca_nodes_database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_CONTAINER_APPLICATION: {
				Tosca_nodes_container_application tosca_nodes_container_application = (Tosca_nodes_container_application)theEObject;
				T result = caseTosca_nodes_container_application(tosca_nodes_container_application);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_container_application);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_container_application);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_container_application);
				if (result == null) result = caseComponent(tosca_nodes_container_application);
				if (result == null) result = caseMixinBase(tosca_nodes_container_application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME: {
				Tosca_nodes_container_runtime tosca_nodes_container_runtime = (Tosca_nodes_container_runtime)theEObject;
				T result = caseTosca_nodes_container_runtime(tosca_nodes_container_runtime);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_container_runtime);
				if (result == null) result = caseTosca_capabilities_scalable(tosca_nodes_container_runtime);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_container_runtime);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_container_runtime);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_container_runtime);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_container_runtime);
				if (result == null) result = caseComponent(tosca_nodes_container_runtime);
				if (result == null) result = caseMixinBase(tosca_nodes_container_runtime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_NODES_BLOCKSTORAGE: {
				Tosca_nodes_blockstorage tosca_nodes_blockstorage = (Tosca_nodes_blockstorage)theEObject;
				T result = caseTosca_nodes_blockstorage(tosca_nodes_blockstorage);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_blockstorage);
				if (result == null) result = caseTosca_capabilities_attachment(tosca_nodes_blockstorage);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_blockstorage);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_blockstorage);
				if (result == null) result = caseComponent(tosca_nodes_blockstorage);
				if (result == null) result = caseMixinBase(tosca_nodes_blockstorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_POLICIES_ROOT: {
				Tosca_policies_root tosca_policies_root = (Tosca_policies_root)theEObject;
				T result = caseTosca_policies_root(tosca_policies_root);
				if (result == null) result = caseAgreement_term(tosca_policies_root);
				if (result == null) result = caseMixinBase(tosca_policies_root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_POLICIES_UPDATE: {
				Tosca_policies_update tosca_policies_update = (Tosca_policies_update)theEObject;
				T result = caseTosca_policies_update(tosca_policies_update);
				if (result == null) result = caseTosca_policies_root(tosca_policies_update);
				if (result == null) result = caseAgreement_term(tosca_policies_update);
				if (result == null) result = caseMixinBase(tosca_policies_update);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_POLICIES_PLACEMENT: {
				Tosca_policies_placement tosca_policies_placement = (Tosca_policies_placement)theEObject;
				T result = caseTosca_policies_placement(tosca_policies_placement);
				if (result == null) result = caseTosca_policies_root(tosca_policies_placement);
				if (result == null) result = caseAgreement_term(tosca_policies_placement);
				if (result == null) result = caseMixinBase(tosca_policies_placement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_POLICIES_SCALING: {
				Tosca_policies_scaling tosca_policies_scaling = (Tosca_policies_scaling)theEObject;
				T result = caseTosca_policies_scaling(tosca_policies_scaling);
				if (result == null) result = caseTosca_policies_root(tosca_policies_scaling);
				if (result == null) result = caseAgreement_term(tosca_policies_scaling);
				if (result == null) result = caseMixinBase(tosca_policies_scaling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_POLICIES_PERFORMANCE: {
				Tosca_policies_performance tosca_policies_performance = (Tosca_policies_performance)theEObject;
				T result = caseTosca_policies_performance(tosca_policies_performance);
				if (result == null) result = caseTosca_policies_root(tosca_policies_performance);
				if (result == null) result = caseAgreement_term(tosca_policies_performance);
				if (result == null) result = caseMixinBase(tosca_policies_performance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_GROUPS_ROOT: {
				Tosca_groups_root tosca_groups_root = (Tosca_groups_root)theEObject;
				T result = caseTosca_groups_root(tosca_groups_root);
				if (result == null) result = caseMixinBase(tosca_groups_root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_INTERFACES_ROOT: {
				Tosca_interfaces_root tosca_interfaces_root = (Tosca_interfaces_root)theEObject;
				T result = caseTosca_interfaces_root(tosca_interfaces_root);
				if (result == null) result = caseMixinBase(tosca_interfaces_root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE: {
				Tosca_interfaces_relationship_configure tosca_interfaces_relationship_configure = (Tosca_interfaces_relationship_configure)theEObject;
				T result = caseTosca_interfaces_relationship_configure(tosca_interfaces_relationship_configure);
				if (result == null) result = caseTosca_interfaces_root(tosca_interfaces_relationship_configure);
				if (result == null) result = caseMixinBase(tosca_interfaces_relationship_configure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD: {
				Tosca_interfaces_node_lifecycle_standard tosca_interfaces_node_lifecycle_standard = (Tosca_interfaces_node_lifecycle_standard)theEObject;
				T result = caseTosca_interfaces_node_lifecycle_standard(tosca_interfaces_node_lifecycle_standard);
				if (result == null) result = caseTosca_interfaces_root(tosca_interfaces_node_lifecycle_standard);
				if (result == null) result = caseMixinBase(tosca_interfaces_node_lifecycle_standard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_RELATIONSHIPS_ROOT: {
				Tosca_relationships_root tosca_relationships_root = (Tosca_relationships_root)theEObject;
				T result = caseTosca_relationships_root(tosca_relationships_root);
				if (result == null) result = caseInstallationdependency(tosca_relationships_root);
				if (result == null) result = caseExecutiondependency(tosca_relationships_root);
				if (result == null) result = caseDependency(tosca_relationships_root);
				if (result == null) result = caseMixinBase(tosca_relationships_root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_RELATIONSHIPS_CONNECTSTO: {
				Tosca_relationships_connectsto tosca_relationships_connectsto = (Tosca_relationships_connectsto)theEObject;
				T result = caseTosca_relationships_connectsto(tosca_relationships_connectsto);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_connectsto);
				if (result == null) result = caseInstallationdependency(tosca_relationships_connectsto);
				if (result == null) result = caseExecutiondependency(tosca_relationships_connectsto);
				if (result == null) result = caseDependency(tosca_relationships_connectsto);
				if (result == null) result = caseMixinBase(tosca_relationships_connectsto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_RELATIONSHIPS_ROUTESTO: {
				Tosca_relationships_routesto tosca_relationships_routesto = (Tosca_relationships_routesto)theEObject;
				T result = caseTosca_relationships_routesto(tosca_relationships_routesto);
				if (result == null) result = caseTosca_relationships_connectsto(tosca_relationships_routesto);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_routesto);
				if (result == null) result = caseInstallationdependency(tosca_relationships_routesto);
				if (result == null) result = caseExecutiondependency(tosca_relationships_routesto);
				if (result == null) result = caseDependency(tosca_relationships_routesto);
				if (result == null) result = caseMixinBase(tosca_relationships_routesto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO: {
				Tosca_relationships_attachesto tosca_relationships_attachesto = (Tosca_relationships_attachesto)theEObject;
				T result = caseTosca_relationships_attachesto(tosca_relationships_attachesto);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_attachesto);
				if (result == null) result = caseInstallationdependency(tosca_relationships_attachesto);
				if (result == null) result = caseExecutiondependency(tosca_relationships_attachesto);
				if (result == null) result = caseDependency(tosca_relationships_attachesto);
				if (result == null) result = caseMixinBase(tosca_relationships_attachesto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_RELATIONSHIPS_HOSTEDON: {
				Tosca_relationships_hostedon tosca_relationships_hostedon = (Tosca_relationships_hostedon)theEObject;
				T result = caseTosca_relationships_hostedon(tosca_relationships_hostedon);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_hostedon);
				if (result == null) result = caseInstallationdependency(tosca_relationships_hostedon);
				if (result == null) result = caseExecutiondependency(tosca_relationships_hostedon);
				if (result == null) result = caseDependency(tosca_relationships_hostedon);
				if (result == null) result = caseMixinBase(tosca_relationships_hostedon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON: {
				Tosca_relationships_dependson tosca_relationships_dependson = (Tosca_relationships_dependson)theEObject;
				T result = caseTosca_relationships_dependson(tosca_relationships_dependson);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_dependson);
				if (result == null) result = caseInstallationdependency(tosca_relationships_dependson);
				if (result == null) result = caseExecutiondependency(tosca_relationships_dependson);
				if (result == null) result = caseDependency(tosca_relationships_dependson);
				if (result == null) result = caseMixinBase(tosca_relationships_dependson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>arraystring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>arraystring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casearraystring(arraystring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInfo(NetworkInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInfo(PortInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCredential(Credential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSpec(PortSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_root(Tosca_capabilities_root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_node(Tosca_capabilities_node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_endpoint(Tosca_capabilities_endpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities scalable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities scalable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_scalable(Tosca_capabilities_scalable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities network bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities network bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_network_bindable(Tosca_capabilities_network_bindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_container(Tosca_capabilities_container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities endpoint database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities endpoint database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_endpoint_database(Tosca_capabilities_endpoint_database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities endpoint public</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities endpoint public</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_endpoint_public(Tosca_capabilities_endpoint_public object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities endpoint admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities endpoint admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_endpoint_admin(Tosca_capabilities_endpoint_admin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities operatingsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities operatingsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_operatingsystem(Tosca_capabilities_operatingsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_attachment(Tosca_capabilities_attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_root(Tosca_nodes_root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes webapplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes webapplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_webapplication(Tosca_nodes_webapplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_softwarecomponent(Tosca_nodes_softwarecomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes dbms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes dbms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_dbms(Tosca_nodes_dbms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes objectstorage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes objectstorage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_objectstorage(Tosca_nodes_objectstorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_compute(Tosca_nodes_compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes loadbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes loadbalancer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_loadbalancer(Tosca_nodes_loadbalancer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes webserver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes webserver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_webserver(Tosca_nodes_webserver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_database(Tosca_nodes_database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes container application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes container application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_container_application(Tosca_nodes_container_application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes container runtime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes container runtime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_container_runtime(Tosca_nodes_container_runtime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes blockstorage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes blockstorage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_blockstorage(Tosca_nodes_blockstorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca policies root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca policies root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_policies_root(Tosca_policies_root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca policies update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca policies update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_policies_update(Tosca_policies_update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca policies placement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca policies placement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_policies_placement(Tosca_policies_placement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca policies scaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca policies scaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_policies_scaling(Tosca_policies_scaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca policies performance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca policies performance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_policies_performance(Tosca_policies_performance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca groups root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca groups root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_groups_root(Tosca_groups_root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca interfaces root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca interfaces root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_interfaces_root(Tosca_interfaces_root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca interfaces relationship configure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca interfaces relationship configure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_interfaces_relationship_configure(Tosca_interfaces_relationship_configure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca interfaces node lifecycle standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca interfaces node lifecycle standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_interfaces_node_lifecycle_standard(Tosca_interfaces_node_lifecycle_standard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_root(Tosca_relationships_root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships connectsto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships connectsto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_connectsto(Tosca_relationships_connectsto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships routesto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships routesto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_routesto(Tosca_relationships_routesto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships attachesto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships attachesto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_attachesto(Tosca_relationships_attachesto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships hostedon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships hostedon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_hostedon(Tosca_relationships_hostedon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships dependson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships dependson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_dependson(Tosca_relationships_dependson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinBase(MixinBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreement_term(Agreement_term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installationdependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installationdependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstallationdependency(Installationdependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executiondependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executiondependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutiondependency(Executiondependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ToscaSwitch
