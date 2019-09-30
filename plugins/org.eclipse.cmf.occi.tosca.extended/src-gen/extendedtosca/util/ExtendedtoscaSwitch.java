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
package extendedtosca.util;

import extendedtosca.*;

import modmacao.Dependency;
import modmacao.Executiondependency;
import modmacao.Installationdependency;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.tosca.Tosca_capabilities_container;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_admin;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_database;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_network_bindable;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_node;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_root;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_compute;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_container_application;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_database;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_root;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_dependson;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_root;

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
 * @see extendedtosca.ExtendedtoscaPackage
 * @generated
 */
public class ExtendedtoscaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtendedtoscaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedtoscaSwitch() {
		if (modelPackage == null) {
			modelPackage = ExtendedtoscaPackage.eINSTANCE;
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
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL: {
				arrayCredential arrayCredential = (arrayCredential)theEObject;
				T result = casearrayCredential(arrayCredential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.ARRAY_PORT_SPEC: {
				arrayPortSpec arrayPortSpec = (arrayPortSpec)theEObject;
				T result = casearrayPortSpec(arrayPortSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.ARRAYVERSION: {
				arrayversion arrayversion = (arrayversion)theEObject;
				T result = casearrayversion(arrayversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.ARRAYINTEGER: {
				arrayinteger arrayinteger = (arrayinteger)theEObject;
				T result = casearrayinteger(arrayinteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINERCHILD: {
				Tosca_capabilities_containerchild tosca_capabilities_containerchild = (Tosca_capabilities_containerchild)theEObject;
				T result = caseTosca_capabilities_containerchild(tosca_capabilities_containerchild);
				if (result == null) result = caseTosca_capabilities_container(tosca_capabilities_containerchild);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_containerchild);
				if (result == null) result = caseMixinBase(tosca_capabilities_containerchild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECAP: {
				Tosca_capabilities_somecap tosca_capabilities_somecap = (Tosca_capabilities_somecap)theEObject;
				T result = caseTosca_capabilities_somecap(tosca_capabilities_somecap);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_somecap);
				if (result == null) result = caseMixinBase(tosca_capabilities_somecap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_INDIGO_ENDPOINT: {
				Tosca_capabilities_indigo_endpoint tosca_capabilities_indigo_endpoint = (Tosca_capabilities_indigo_endpoint)theEObject;
				T result = caseTosca_capabilities_indigo_endpoint(tosca_capabilities_indigo_endpoint);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_capabilities_indigo_endpoint);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_indigo_endpoint);
				if (result == null) result = caseMixinBase(tosca_capabilities_indigo_endpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_HA: {
				Tosca_capabilities_ha tosca_capabilities_ha = (Tosca_capabilities_ha)theEObject;
				T result = caseTosca_capabilities_ha(tosca_capabilities_ha);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_ha);
				if (result == null) result = caseMixinBase(tosca_capabilities_ha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_NODEJSAPPCONTAINER: {
				Tosca_capabilities_nodejsappcontainer tosca_capabilities_nodejsappcontainer = (Tosca_capabilities_nodejsappcontainer)theEObject;
				T result = caseTosca_capabilities_nodejsappcontainer(tosca_capabilities_nodejsappcontainer);
				if (result == null) result = caseTosca_capabilities_container(tosca_capabilities_nodejsappcontainer);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_nodejsappcontainer);
				if (result == null) result = caseMixinBase(tosca_capabilities_nodejsappcontainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER: {
				Tosca_capabilities_container_docker tosca_capabilities_container_docker = (Tosca_capabilities_container_docker)theEObject;
				T result = caseTosca_capabilities_container_docker(tosca_capabilities_container_docker);
				if (result == null) result = caseTosca_capabilities_container(tosca_capabilities_container_docker);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_container_docker);
				if (result == null) result = caseMixinBase(tosca_capabilities_container_docker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECHILDCAP: {
				Tosca_capabilities_somechildcap tosca_capabilities_somechildcap = (Tosca_capabilities_somechildcap)theEObject;
				T result = caseTosca_capabilities_somechildcap(tosca_capabilities_somechildcap);
				if (result == null) result = caseTosca_capabilities_somecap(tosca_capabilities_somechildcap);
				if (result == null) result = caseTosca_capabilities_root(tosca_capabilities_somechildcap);
				if (result == null) result = caseMixinBase(tosca_capabilities_somechildcap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHPROP: {
				Tosca_nodes_computewithprop tosca_nodes_computewithprop = (Tosca_nodes_computewithprop)theEObject;
				T result = caseTosca_nodes_computewithprop(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_nodes_compute(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_capabilities_scalable(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_capabilities_endpoint_admin(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_capabilities_operatingsystem(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_capabilities_network_bindable(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_computewithprop);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_computewithprop);
				if (result == null) result = caseMixinBase(tosca_nodes_computewithprop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE: {
				Tosca_nodes_webapplication_paypalpizzastore tosca_nodes_webapplication_paypalpizzastore = (Tosca_nodes_webapplication_paypalpizzastore)theEObject;
				T result = caseTosca_nodes_webapplication_paypalpizzastore(tosca_nodes_webapplication_paypalpizzastore);
				if (result == null) result = caseTosca_nodes_webapplication(tosca_nodes_webapplication_paypalpizzastore);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_webapplication_paypalpizzastore);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_webapplication_paypalpizzastore);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_webapplication_paypalpizzastore);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_webapplication_paypalpizzastore);
				if (result == null) result = caseMixinBase(tosca_nodes_webapplication_paypalpizzastore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_ABSTRACTMONGOD: {
				Tosca_nodes_abstractmongod tosca_nodes_abstractmongod = (Tosca_nodes_abstractmongod)theEObject;
				T result = caseTosca_nodes_abstractmongod(tosca_nodes_abstractmongod);
				if (result == null) result = caseTosca_nodes_dbms(tosca_nodes_abstractmongod);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_abstractmongod);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_abstractmongod);
				if (result == null) result = caseDatabase(tosca_nodes_abstractmongod);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_abstractmongod);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_abstractmongod);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_abstractmongod);
				if (result == null) result = caseMixinBase(tosca_nodes_abstractmongod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_MONGOD: {
				Tosca_nodes_mongod tosca_nodes_mongod = (Tosca_nodes_mongod)theEObject;
				T result = caseTosca_nodes_mongod(tosca_nodes_mongod);
				if (result == null) result = caseTosca_nodes_abstractmongod(tosca_nodes_mongod);
				if (result == null) result = caseTosca_nodes_dbms(tosca_nodes_mongod);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_mongod);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_mongod);
				if (result == null) result = caseDatabase(tosca_nodes_mongod);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_mongod);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_mongod);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_mongod);
				if (result == null) result = caseMixinBase(tosca_nodes_mongod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_NETWORK: {
				Tosca_nodes_network_network tosca_nodes_network_network = (Tosca_nodes_network_network)theEObject;
				T result = caseTosca_nodes_network_network(tosca_nodes_network_network);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_network_network);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_network_network);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_network_network);
				if (result == null) result = caseMixinBase(tosca_nodes_network_network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_NODEJS: {
				Tosca_nodes_nodejs tosca_nodes_nodejs = (Tosca_nodes_nodejs)theEObject;
				T result = caseTosca_nodes_nodejs(tosca_nodes_nodejs);
				if (result == null) result = caseTosca_nodes_webserver(tosca_nodes_nodejs);
				if (result == null) result = caseTosca_capabilities_nodejsappcontainer(tosca_nodes_nodejs);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_nodejs);
				if (result == null) result = caseTosca_capabilities_endpoint_admin(tosca_nodes_nodejs);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_nodejs);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_nodejs);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_nodejs);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_nodejs);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_nodejs);
				if (result == null) result = caseMixinBase(tosca_nodes_nodejs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_CONTAINER_APPLICATION_DOCKER: {
				Tosca_nodes_container_application_docker tosca_nodes_container_application_docker = (Tosca_nodes_container_application_docker)theEObject;
				T result = caseTosca_nodes_container_application_docker(tosca_nodes_container_application_docker);
				if (result == null) result = caseTosca_nodes_container_application(tosca_nodes_container_application_docker);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_container_application_docker);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_container_application_docker);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_container_application_docker);
				if (result == null) result = caseMixinBase(tosca_nodes_container_application_docker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_KIBANA: {
				Tosca_nodes_softwarecomponent_kibana tosca_nodes_softwarecomponent_kibana = (Tosca_nodes_softwarecomponent_kibana)theEObject;
				T result = caseTosca_nodes_softwarecomponent_kibana(tosca_nodes_softwarecomponent_kibana);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_softwarecomponent_kibana);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_softwarecomponent_kibana);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_softwarecomponent_kibana);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_softwarecomponent_kibana);
				if (result == null) result = caseMixinBase(tosca_nodes_softwarecomponent_kibana);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST: {
				Tosca_nodes_computewithattrlist tosca_nodes_computewithattrlist = (Tosca_nodes_computewithattrlist)theEObject;
				T result = caseTosca_nodes_computewithattrlist(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_nodes_compute(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_capabilities_scalable(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_capabilities_endpoint_admin(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_capabilities_operatingsystem(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_capabilities_network_bindable(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_computewithattrlist);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_computewithattrlist);
				if (result == null) result = caseMixinBase(tosca_nodes_computewithattrlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH: {
				Tosca_nodes_softwarecomponent_logstash tosca_nodes_softwarecomponent_logstash = (Tosca_nodes_softwarecomponent_logstash)theEObject;
				T result = caseTosca_nodes_softwarecomponent_logstash(tosca_nodes_softwarecomponent_logstash);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_softwarecomponent_logstash);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_softwarecomponent_logstash);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_softwarecomponent_logstash);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_softwarecomponent_logstash);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_softwarecomponent_logstash);
				if (result == null) result = caseMixinBase(tosca_nodes_softwarecomponent_logstash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.EXAMPLE_DATABASESUBSYSTEM: {
				Example_databasesubsystem example_databasesubsystem = (Example_databasesubsystem)theEObject;
				T result = caseExample_databasesubsystem(example_databasesubsystem);
				if (result == null) result = caseTosca_nodes_root(example_databasesubsystem);
				if (result == null) result = caseTosca_capabilities_endpoint_database(example_databasesubsystem);
				if (result == null) result = caseTosca_capabilities_node(example_databasesubsystem);
				if (result == null) result = caseTosca_capabilities_endpoint(example_databasesubsystem);
				if (result == null) result = caseTosca_capabilities_root(example_databasesubsystem);
				if (result == null) result = caseMixinBase(example_databasesubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD: {
				Tosca_nodes_softwarecomponent_collectd tosca_nodes_softwarecomponent_collectd = (Tosca_nodes_softwarecomponent_collectd)theEObject;
				T result = caseTosca_nodes_softwarecomponent_collectd(tosca_nodes_softwarecomponent_collectd);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_softwarecomponent_collectd);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_softwarecomponent_collectd);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_softwarecomponent_collectd);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_softwarecomponent_collectd);
				if (result == null) result = caseMixinBase(tosca_nodes_softwarecomponent_collectd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHREQ: {
				Tosca_nodes_nodewithreq tosca_nodes_nodewithreq = (Tosca_nodes_nodewithreq)theEObject;
				T result = caseTosca_nodes_nodewithreq(tosca_nodes_nodewithreq);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_nodewithreq);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_nodewithreq);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_nodewithreq);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_nodewithreq);
				if (result == null) result = caseMixinBase(tosca_nodes_nodewithreq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE2: {
				Tosca_nodes_somenode2 tosca_nodes_somenode2 = (Tosca_nodes_somenode2)theEObject;
				T result = caseTosca_nodes_somenode2(tosca_nodes_somenode2);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_somenode2);
				if (result == null) result = caseTosca_capabilities_containerchild(tosca_nodes_somenode2);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_somenode2);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_somenode2);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_somenode2);
				if (result == null) result = caseMixinBase(tosca_nodes_somenode2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_PHP: {
				Tosca_nodes_php tosca_nodes_php = (Tosca_nodes_php)theEObject;
				T result = caseTosca_nodes_php(tosca_nodes_php);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_php);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_php);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_php);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_php);
				if (result == null) result = caseMixinBase(tosca_nodes_php);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE_MYSQL: {
				Tosca_nodes_database_mysql tosca_nodes_database_mysql = (Tosca_nodes_database_mysql)theEObject;
				T result = caseTosca_nodes_database_mysql(tosca_nodes_database_mysql);
				if (result == null) result = caseTosca_nodes_database(tosca_nodes_database_mysql);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_database_mysql);
				if (result == null) result = caseTosca_capabilities_endpoint_database(tosca_nodes_database_mysql);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_database_mysql);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_database_mysql);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_database_mysql);
				if (result == null) result = caseMixinBase(tosca_nodes_database_mysql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.EXAMPLE_QUEUINGSUBSYSTEM: {
				Example_queuingsubsystem example_queuingsubsystem = (Example_queuingsubsystem)theEObject;
				T result = caseExample_queuingsubsystem(example_queuingsubsystem);
				if (result == null) result = caseTosca_nodes_root(example_queuingsubsystem);
				if (result == null) result = caseTosca_capabilities_endpoint(example_queuingsubsystem);
				if (result == null) result = caseTosca_capabilities_node(example_queuingsubsystem);
				if (result == null) result = caseTosca_capabilities_root(example_queuingsubsystem);
				if (result == null) result = caseMixinBase(example_queuingsubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.EXAMPLE_TRANSACTIONSUBSYSTEM: {
				Example_transactionsubsystem example_transactionsubsystem = (Example_transactionsubsystem)theEObject;
				T result = caseExample_transactionsubsystem(example_transactionsubsystem);
				if (result == null) result = caseTosca_nodes_root(example_transactionsubsystem);
				if (result == null) result = caseTosca_capabilities_endpoint(example_transactionsubsystem);
				if (result == null) result = caseTosca_capabilities_node(example_transactionsubsystem);
				if (result == null) result = caseTosca_capabilities_root(example_transactionsubsystem);
				if (result == null) result = caseMixinBase(example_transactionsubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_ABSTRACTMYSQL: {
				Tosca_nodes_abstractmysql tosca_nodes_abstractmysql = (Tosca_nodes_abstractmysql)theEObject;
				T result = caseTosca_nodes_abstractmysql(tosca_nodes_abstractmysql);
				if (result == null) result = caseTosca_nodes_database(tosca_nodes_abstractmysql);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_abstractmysql);
				if (result == null) result = caseTosca_capabilities_endpoint_database(tosca_nodes_abstractmysql);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_abstractmysql);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_abstractmysql);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_abstractmysql);
				if (result == null) result = caseMixinBase(tosca_nodes_abstractmysql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL: {
				Tosca_nodes_mysql tosca_nodes_mysql = (Tosca_nodes_mysql)theEObject;
				T result = caseTosca_nodes_mysql(tosca_nodes_mysql);
				if (result == null) result = caseTosca_nodes_abstractmysql(tosca_nodes_mysql);
				if (result == null) result = caseTosca_nodes_database(tosca_nodes_mysql);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_mysql);
				if (result == null) result = caseTosca_capabilities_endpoint_database(tosca_nodes_mysql);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_mysql);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_mysql);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_mysql);
				if (result == null) result = caseMixinBase(tosca_nodes_mysql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH: {
				Tosca_nodes_softwarecomponent_elasticsearch tosca_nodes_softwarecomponent_elasticsearch = (Tosca_nodes_softwarecomponent_elasticsearch)theEObject;
				T result = caseTosca_nodes_softwarecomponent_elasticsearch(tosca_nodes_softwarecomponent_elasticsearch);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_softwarecomponent_elasticsearch);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_softwarecomponent_elasticsearch);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_softwarecomponent_elasticsearch);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_softwarecomponent_elasticsearch);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_softwarecomponent_elasticsearch);
				if (result == null) result = caseMixinBase(tosca_nodes_softwarecomponent_elasticsearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM: {
				Tosca_nodes_databasewithlistparam tosca_nodes_databasewithlistparam = (Tosca_nodes_databasewithlistparam)theEObject;
				T result = caseTosca_nodes_databasewithlistparam(tosca_nodes_databasewithlistparam);
				if (result == null) result = caseTosca_nodes_database(tosca_nodes_databasewithlistparam);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_databasewithlistparam);
				if (result == null) result = caseTosca_capabilities_endpoint_database(tosca_nodes_databasewithlistparam);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_databasewithlistparam);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_databasewithlistparam);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_databasewithlistparam);
				if (result == null) result = caseMixinBase(tosca_nodes_databasewithlistparam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.EXAMPLE_SOMEAPP: {
				Example_someapp example_someapp = (Example_someapp)theEObject;
				T result = caseExample_someapp(example_someapp);
				if (result == null) result = caseTosca_nodes_root(example_someapp);
				if (result == null) result = caseTosca_capabilities_endpoint(example_someapp);
				if (result == null) result = caseTosca_capabilities_node(example_someapp);
				if (result == null) result = caseTosca_capabilities_root(example_someapp);
				if (result == null) result = caseMixinBase(example_someapp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_NODECELLAR: {
				Tosca_nodes_nodecellar tosca_nodes_nodecellar = (Tosca_nodes_nodecellar)theEObject;
				T result = caseTosca_nodes_nodecellar(tosca_nodes_nodecellar);
				if (result == null) result = caseTosca_nodes_webapplication(tosca_nodes_nodecellar);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_nodecellar);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_nodecellar);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_nodecellar);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_nodecellar);
				if (result == null) result = caseMixinBase(tosca_nodes_nodecellar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP: {
				Tosca_nodes_nodewithcap tosca_nodes_nodewithcap = (Tosca_nodes_nodewithcap)theEObject;
				T result = caseTosca_nodes_nodewithcap(tosca_nodes_nodewithcap);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_nodewithcap);
				if (result == null) result = caseTosca_capabilities_somecap(tosca_nodes_nodewithcap);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_nodewithcap);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_nodewithcap);
				if (result == null) result = caseMixinBase(tosca_nodes_nodewithcap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_APACHE: {
				Tosca_nodes_apache tosca_nodes_apache = (Tosca_nodes_apache)theEObject;
				T result = caseTosca_nodes_apache(tosca_nodes_apache);
				if (result == null) result = caseTosca_nodes_webserver(tosca_nodes_apache);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_apache);
				if (result == null) result = caseTosca_capabilities_endpoint_admin(tosca_nodes_apache);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_apache);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_apache);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_apache);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_apache);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_apache);
				if (result == null) result = caseMixinBase(tosca_nodes_apache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.RSYSLOG: {
				Rsyslog rsyslog = (Rsyslog)theEObject;
				T result = caseRsyslog(rsyslog);
				if (result == null) result = caseTosca_nodes_softwarecomponent(rsyslog);
				if (result == null) result = caseTosca_nodes_root(rsyslog);
				if (result == null) result = caseTosca_capabilities_node(rsyslog);
				if (result == null) result = caseTosca_capabilities_root(rsyslog);
				if (result == null) result = caseMixinBase(rsyslog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_WORDPRESS: {
				Tosca_nodes_wordpress tosca_nodes_wordpress = (Tosca_nodes_wordpress)theEObject;
				T result = caseTosca_nodes_wordpress(tosca_nodes_wordpress);
				if (result == null) result = caseTosca_nodes_webapplication(tosca_nodes_wordpress);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_wordpress);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_wordpress);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_wordpress);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_wordpress);
				if (result == null) result = caseMixinBase(tosca_nodes_wordpress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_NETWORK_PORT: {
				Tosca_nodes_network_port tosca_nodes_network_port = (Tosca_nodes_network_port)theEObject;
				T result = caseTosca_nodes_network_port(tosca_nodes_network_port);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_network_port);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_network_port);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_network_port);
				if (result == null) result = caseMixinBase(tosca_nodes_network_port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHCAPWITHATTR: {
				Tosca_nodes_computewithcapwithattr tosca_nodes_computewithcapwithattr = (Tosca_nodes_computewithcapwithattr)theEObject;
				T result = caseTosca_nodes_computewithcapwithattr(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_nodes_compute(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_capabilities_indigo_endpoint(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_capabilities_scalable(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_capabilities_endpoint_admin(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_capabilities_operatingsystem(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_capabilities_network_bindable(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_computewithcapwithattr);
				if (result == null) result = caseMixinBase(tosca_nodes_computewithcapwithattr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG: {
				Tosca_nodes_softwarecomponent_rsyslog tosca_nodes_softwarecomponent_rsyslog = (Tosca_nodes_softwarecomponent_rsyslog)theEObject;
				T result = caseTosca_nodes_softwarecomponent_rsyslog(tosca_nodes_softwarecomponent_rsyslog);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_softwarecomponent_rsyslog);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_softwarecomponent_rsyslog);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_softwarecomponent_rsyslog);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_softwarecomponent_rsyslog);
				if (result == null) result = caseMixinBase(tosca_nodes_softwarecomponent_rsyslog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_HACOMPUTE: {
				Tosca_nodes_hacompute tosca_nodes_hacompute = (Tosca_nodes_hacompute)theEObject;
				T result = caseTosca_nodes_hacompute(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_nodes_compute(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_capabilities_ha(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_capabilities_scalable(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_capabilities_endpoint_admin(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_capabilities_operatingsystem(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_capabilities_network_bindable(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_capabilities_endpoint(tosca_nodes_hacompute);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_hacompute);
				if (result == null) result = caseMixinBase(tosca_nodes_hacompute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE: {
				Tosca_nodes_somenode tosca_nodes_somenode = (Tosca_nodes_somenode)theEObject;
				T result = caseTosca_nodes_somenode(tosca_nodes_somenode);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_somenode);
				if (result == null) result = caseTosca_capabilities_somechildcap(tosca_nodes_somenode);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_somenode);
				if (result == null) result = caseTosca_capabilities_somecap(tosca_nodes_somenode);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_somenode);
				if (result == null) result = caseMixinBase(tosca_nodes_somenode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_NODES_DBMS_MYSQL: {
				Tosca_nodes_dbms_mysql tosca_nodes_dbms_mysql = (Tosca_nodes_dbms_mysql)theEObject;
				T result = caseTosca_nodes_dbms_mysql(tosca_nodes_dbms_mysql);
				if (result == null) result = caseTosca_nodes_dbms(tosca_nodes_dbms_mysql);
				if (result == null) result = caseTosca_nodes_softwarecomponent(tosca_nodes_dbms_mysql);
				if (result == null) result = caseTosca_capabilities_container(tosca_nodes_dbms_mysql);
				if (result == null) result = caseDatabase(tosca_nodes_dbms_mysql);
				if (result == null) result = caseTosca_nodes_root(tosca_nodes_dbms_mysql);
				if (result == null) result = caseTosca_capabilities_node(tosca_nodes_dbms_mysql);
				if (result == null) result = caseTosca_capabilities_root(tosca_nodes_dbms_mysql);
				if (result == null) result = caseMixinBase(tosca_nodes_dbms_mysql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.MYCOMPANY_MYTYPES_MYSCALINGPOLICY: {
				Mycompany_mytypes_myscalingpolicy mycompany_mytypes_myscalingpolicy = (Mycompany_mytypes_myscalingpolicy)theEObject;
				T result = caseMycompany_mytypes_myscalingpolicy(mycompany_mytypes_myscalingpolicy);
				if (result == null) result = caseMixinBase(mycompany_mytypes_myscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_NODECELLARHOSTEDONNODEJS: {
				Tosca_relationships_nodecellarhostedonnodejs tosca_relationships_nodecellarhostedonnodejs = (Tosca_relationships_nodecellarhostedonnodejs)theEObject;
				T result = caseTosca_relationships_nodecellarhostedonnodejs(tosca_relationships_nodecellarhostedonnodejs);
				if (result == null) result = caseTosca_relationships_hostedon(tosca_relationships_nodecellarhostedonnodejs);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_nodecellarhostedonnodejs);
				if (result == null) result = caseInstallationdependency(tosca_relationships_nodecellarhostedonnodejs);
				if (result == null) result = caseExecutiondependency(tosca_relationships_nodecellarhostedonnodejs);
				if (result == null) result = caseDependency(tosca_relationships_nodecellarhostedonnodejs);
				if (result == null) result = caseMixinBase(tosca_relationships_nodecellarhostedonnodejs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_HA: {
				Tosca_relationships_ha tosca_relationships_ha = (Tosca_relationships_ha)theEObject;
				T result = caseTosca_relationships_ha(tosca_relationships_ha);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_ha);
				if (result == null) result = caseInstallationdependency(tosca_relationships_ha);
				if (result == null) result = caseExecutiondependency(tosca_relationships_ha);
				if (result == null) result = caseDependency(tosca_relationships_ha);
				if (result == null) result = caseMixinBase(tosca_relationships_ha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.MYATTACHESTO: {
				Myattachesto myattachesto = (Myattachesto)theEObject;
				T result = caseMyattachesto(myattachesto);
				if (result == null) result = caseTosca_relationships_attachesto(myattachesto);
				if (result == null) result = caseTosca_relationships_root(myattachesto);
				if (result == null) result = caseInstallationdependency(myattachesto);
				if (result == null) result = caseExecutiondependency(myattachesto);
				if (result == null) result = caseDependency(myattachesto);
				if (result == null) result = caseMixinBase(myattachesto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_NODEJSCONNECTTOMONGO: {
				Tosca_relationships_nodejsconnecttomongo tosca_relationships_nodejsconnecttomongo = (Tosca_relationships_nodejsconnecttomongo)theEObject;
				T result = caseTosca_relationships_nodejsconnecttomongo(tosca_relationships_nodejsconnecttomongo);
				if (result == null) result = caseTosca_relationships_connectsto(tosca_relationships_nodejsconnecttomongo);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_nodejsconnecttomongo);
				if (result == null) result = caseInstallationdependency(tosca_relationships_nodejsconnecttomongo);
				if (result == null) result = caseExecutiondependency(tosca_relationships_nodejsconnecttomongo);
				if (result == null) result = caseDependency(tosca_relationships_nodejsconnecttomongo);
				if (result == null) result = caseMixinBase(tosca_relationships_nodejsconnecttomongo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_NETWORK_LINKSTO: {
				Tosca_relationships_network_linksto tosca_relationships_network_linksto = (Tosca_relationships_network_linksto)theEObject;
				T result = caseTosca_relationships_network_linksto(tosca_relationships_network_linksto);
				if (result == null) result = caseTosca_relationships_dependson(tosca_relationships_network_linksto);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_network_linksto);
				if (result == null) result = caseInstallationdependency(tosca_relationships_network_linksto);
				if (result == null) result = caseExecutiondependency(tosca_relationships_network_linksto);
				if (result == null) result = caseDependency(tosca_relationships_network_linksto);
				if (result == null) result = caseMixinBase(tosca_relationships_network_linksto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TEST_RELATION_CONNECTS: {
				Test_relation_connects test_relation_connects = (Test_relation_connects)theEObject;
				T result = caseTest_relation_connects(test_relation_connects);
				if (result == null) result = caseMixinBase(test_relation_connects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_NETWORK_BINDSTO: {
				Tosca_relationships_network_bindsto tosca_relationships_network_bindsto = (Tosca_relationships_network_bindsto)theEObject;
				T result = caseTosca_relationships_network_bindsto(tosca_relationships_network_bindsto);
				if (result == null) result = caseTosca_relationships_dependson(tosca_relationships_network_bindsto);
				if (result == null) result = caseTosca_relationships_root(tosca_relationships_network_bindsto);
				if (result == null) result = caseInstallationdependency(tosca_relationships_network_bindsto);
				if (result == null) result = caseExecutiondependency(tosca_relationships_network_bindsto);
				if (result == null) result = caseDependency(tosca_relationships_network_bindsto);
				if (result == null) result = caseMixinBase(tosca_relationships_network_bindsto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>array Credential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>array Credential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casearrayCredential(arrayCredential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>array Port Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>array Port Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casearrayPortSpec(arrayPortSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>arrayversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>arrayversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casearrayversion(arrayversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>arrayinteger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>arrayinteger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casearrayinteger(arrayinteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities containerchild</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities containerchild</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_containerchild(Tosca_capabilities_containerchild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities somecap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities somecap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_somecap(Tosca_capabilities_somecap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities indigo endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities indigo endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_indigo_endpoint(Tosca_capabilities_indigo_endpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities ha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities ha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_ha(Tosca_capabilities_ha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities nodejsappcontainer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities nodejsappcontainer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_nodejsappcontainer(Tosca_capabilities_nodejsappcontainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities container docker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities container docker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_container_docker(Tosca_capabilities_container_docker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca capabilities somechildcap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca capabilities somechildcap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_capabilities_somechildcap(Tosca_capabilities_somechildcap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes computewithprop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes computewithprop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_computewithprop(Tosca_nodes_computewithprop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes webapplication paypalpizzastore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes webapplication paypalpizzastore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_webapplication_paypalpizzastore(Tosca_nodes_webapplication_paypalpizzastore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes abstractmongod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes abstractmongod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_abstractmongod(Tosca_nodes_abstractmongod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes mongod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes mongod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_mongod(Tosca_nodes_mongod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes network network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes network network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_network_network(Tosca_nodes_network_network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes nodejs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes nodejs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_nodejs(Tosca_nodes_nodejs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes container application docker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes container application docker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_container_application_docker(Tosca_nodes_container_application_docker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent kibana</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent kibana</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_softwarecomponent_kibana(Tosca_nodes_softwarecomponent_kibana object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes computewithattrlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes computewithattrlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_computewithattrlist(Tosca_nodes_computewithattrlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent logstash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent logstash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_softwarecomponent_logstash(Tosca_nodes_softwarecomponent_logstash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example databasesubsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example databasesubsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample_databasesubsystem(Example_databasesubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent collectd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent collectd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_softwarecomponent_collectd(Tosca_nodes_softwarecomponent_collectd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes nodewithreq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes nodewithreq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_nodewithreq(Tosca_nodes_nodewithreq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes somenode2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes somenode2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_somenode2(Tosca_nodes_somenode2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes php</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes php</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_php(Tosca_nodes_php object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes database mysql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes database mysql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_database_mysql(Tosca_nodes_database_mysql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example queuingsubsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example queuingsubsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample_queuingsubsystem(Example_queuingsubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example transactionsubsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example transactionsubsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample_transactionsubsystem(Example_transactionsubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes abstractmysql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes abstractmysql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_abstractmysql(Tosca_nodes_abstractmysql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes mysql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes mysql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_mysql(Tosca_nodes_mysql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent elasticsearch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent elasticsearch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_softwarecomponent_elasticsearch(Tosca_nodes_softwarecomponent_elasticsearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes databasewithlistparam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes databasewithlistparam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_databasewithlistparam(Tosca_nodes_databasewithlistparam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example someapp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example someapp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample_someapp(Example_someapp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes nodecellar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes nodecellar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_nodecellar(Tosca_nodes_nodecellar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes nodewithcap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes nodewithcap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_nodewithcap(Tosca_nodes_nodewithcap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes apache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes apache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_apache(Tosca_nodes_apache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rsyslog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rsyslog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRsyslog(Rsyslog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes wordpress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes wordpress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_wordpress(Tosca_nodes_wordpress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes network port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes network port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_network_port(Tosca_nodes_network_port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes computewithcapwithattr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes computewithcapwithattr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_computewithcapwithattr(Tosca_nodes_computewithcapwithattr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent rsyslog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes softwarecomponent rsyslog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_softwarecomponent_rsyslog(Tosca_nodes_softwarecomponent_rsyslog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes hacompute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes hacompute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_hacompute(Tosca_nodes_hacompute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes somenode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes somenode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_somenode(Tosca_nodes_somenode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca nodes dbms mysql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca nodes dbms mysql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_nodes_dbms_mysql(Tosca_nodes_dbms_mysql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mycompany mytypes myscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mycompany mytypes myscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMycompany_mytypes_myscalingpolicy(Mycompany_mytypes_myscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships nodecellarhostedonnodejs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships nodecellarhostedonnodejs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_nodecellarhostedonnodejs(Tosca_relationships_nodecellarhostedonnodejs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships ha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships ha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_ha(Tosca_relationships_ha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Myattachesto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Myattachesto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMyattachesto(Myattachesto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships nodejsconnecttomongo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships nodejsconnecttomongo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_nodejsconnecttomongo(Tosca_relationships_nodejsconnecttomongo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships network linksto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships network linksto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_network_linksto(Tosca_relationships_network_linksto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test relation connects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test relation connects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest_relation_connects(Test_relation_connects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tosca relationships network bindsto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tosca relationships network bindsto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTosca_relationships_network_bindsto(Tosca_relationships_network_bindsto object) {
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

} //ExtendedtoscaSwitch
