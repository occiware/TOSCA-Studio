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

import modmacao.Component;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.modmacao.occi.platform.Database;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see extendedtosca.ExtendedtoscaPackage
 * @generated
 */
public class ExtendedtoscaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtendedtoscaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedtoscaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtendedtoscaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedtoscaSwitch<Adapter> modelSwitch =
		new ExtendedtoscaSwitch<Adapter>() {
			@Override
			public Adapter casearrayCredential(arrayCredential object) {
				return createarrayCredentialAdapter();
			}
			@Override
			public Adapter casearrayPortSpec(arrayPortSpec object) {
				return createarrayPortSpecAdapter();
			}
			@Override
			public Adapter casearrayversion(arrayversion object) {
				return createarrayversionAdapter();
			}
			@Override
			public Adapter casearrayinteger(arrayinteger object) {
				return createarrayintegerAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_containerchild(Tosca_capabilities_containerchild object) {
				return createTosca_capabilities_containerchildAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_somecap(Tosca_capabilities_somecap object) {
				return createTosca_capabilities_somecapAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_indigo_endpoint(Tosca_capabilities_indigo_endpoint object) {
				return createTosca_capabilities_indigo_endpointAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_ha(Tosca_capabilities_ha object) {
				return createTosca_capabilities_haAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_nodejsappcontainer(Tosca_capabilities_nodejsappcontainer object) {
				return createTosca_capabilities_nodejsappcontainerAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_container_docker(Tosca_capabilities_container_docker object) {
				return createTosca_capabilities_container_dockerAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_somechildcap(Tosca_capabilities_somechildcap object) {
				return createTosca_capabilities_somechildcapAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_computewithprop(Tosca_nodes_computewithprop object) {
				return createTosca_nodes_computewithpropAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_webapplication_paypalpizzastore(Tosca_nodes_webapplication_paypalpizzastore object) {
				return createTosca_nodes_webapplication_paypalpizzastoreAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_abstractmongod(Tosca_nodes_abstractmongod object) {
				return createTosca_nodes_abstractmongodAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_mongod(Tosca_nodes_mongod object) {
				return createTosca_nodes_mongodAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_network_network(Tosca_nodes_network_network object) {
				return createTosca_nodes_network_networkAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_nodejs(Tosca_nodes_nodejs object) {
				return createTosca_nodes_nodejsAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_container_application_docker(Tosca_nodes_container_application_docker object) {
				return createTosca_nodes_container_application_dockerAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_softwarecomponent_kibana(Tosca_nodes_softwarecomponent_kibana object) {
				return createTosca_nodes_softwarecomponent_kibanaAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_computewithattrlist(Tosca_nodes_computewithattrlist object) {
				return createTosca_nodes_computewithattrlistAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_softwarecomponent_logstash(Tosca_nodes_softwarecomponent_logstash object) {
				return createTosca_nodes_softwarecomponent_logstashAdapter();
			}
			@Override
			public Adapter caseExample_databasesubsystem(Example_databasesubsystem object) {
				return createExample_databasesubsystemAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_softwarecomponent_collectd(Tosca_nodes_softwarecomponent_collectd object) {
				return createTosca_nodes_softwarecomponent_collectdAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_nodewithreq(Tosca_nodes_nodewithreq object) {
				return createTosca_nodes_nodewithreqAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_somenode2(Tosca_nodes_somenode2 object) {
				return createTosca_nodes_somenode2Adapter();
			}
			@Override
			public Adapter caseTosca_nodes_php(Tosca_nodes_php object) {
				return createTosca_nodes_phpAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_database_mysql(Tosca_nodes_database_mysql object) {
				return createTosca_nodes_database_mysqlAdapter();
			}
			@Override
			public Adapter caseExample_queuingsubsystem(Example_queuingsubsystem object) {
				return createExample_queuingsubsystemAdapter();
			}
			@Override
			public Adapter caseExample_transactionsubsystem(Example_transactionsubsystem object) {
				return createExample_transactionsubsystemAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_abstractmysql(Tosca_nodes_abstractmysql object) {
				return createTosca_nodes_abstractmysqlAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_mysql(Tosca_nodes_mysql object) {
				return createTosca_nodes_mysqlAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_softwarecomponent_elasticsearch(Tosca_nodes_softwarecomponent_elasticsearch object) {
				return createTosca_nodes_softwarecomponent_elasticsearchAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_databasewithlistparam(Tosca_nodes_databasewithlistparam object) {
				return createTosca_nodes_databasewithlistparamAdapter();
			}
			@Override
			public Adapter caseExample_someapp(Example_someapp object) {
				return createExample_someappAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_nodecellar(Tosca_nodes_nodecellar object) {
				return createTosca_nodes_nodecellarAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_nodewithcap(Tosca_nodes_nodewithcap object) {
				return createTosca_nodes_nodewithcapAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_apache(Tosca_nodes_apache object) {
				return createTosca_nodes_apacheAdapter();
			}
			@Override
			public Adapter caseRsyslog(Rsyslog object) {
				return createRsyslogAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_wordpress(Tosca_nodes_wordpress object) {
				return createTosca_nodes_wordpressAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_network_port(Tosca_nodes_network_port object) {
				return createTosca_nodes_network_portAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_computewithcapwithattr(Tosca_nodes_computewithcapwithattr object) {
				return createTosca_nodes_computewithcapwithattrAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_softwarecomponent_rsyslog(Tosca_nodes_softwarecomponent_rsyslog object) {
				return createTosca_nodes_softwarecomponent_rsyslogAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_hacompute(Tosca_nodes_hacompute object) {
				return createTosca_nodes_hacomputeAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_somenode(Tosca_nodes_somenode object) {
				return createTosca_nodes_somenodeAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_dbms_mysql(Tosca_nodes_dbms_mysql object) {
				return createTosca_nodes_dbms_mysqlAdapter();
			}
			@Override
			public Adapter caseMycompany_mytypes_myscalingpolicy(Mycompany_mytypes_myscalingpolicy object) {
				return createMycompany_mytypes_myscalingpolicyAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_nodecellarhostedonnodejs(Tosca_relationships_nodecellarhostedonnodejs object) {
				return createTosca_relationships_nodecellarhostedonnodejsAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_ha(Tosca_relationships_ha object) {
				return createTosca_relationships_haAdapter();
			}
			@Override
			public Adapter caseMyattachesto(Myattachesto object) {
				return createMyattachestoAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_nodejsconnecttomongo(Tosca_relationships_nodejsconnecttomongo object) {
				return createTosca_relationships_nodejsconnecttomongoAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_network_linksto(Tosca_relationships_network_linksto object) {
				return createTosca_relationships_network_linkstoAdapter();
			}
			@Override
			public Adapter caseTest_relation_connects(Test_relation_connects object) {
				return createTest_relation_connectsAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_network_bindsto(Tosca_relationships_network_bindsto object) {
				return createTosca_relationships_network_bindstoAdapter();
			}
			@Override
			public Adapter caseMixinBase(MixinBase object) {
				return createMixinBaseAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_root(Tosca_capabilities_root object) {
				return createTosca_capabilities_rootAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_container(Tosca_capabilities_container object) {
				return createTosca_capabilities_containerAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_endpoint(Tosca_capabilities_endpoint object) {
				return createTosca_capabilities_endpointAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_node(Tosca_capabilities_node object) {
				return createTosca_capabilities_nodeAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_root(Tosca_nodes_root object) {
				return createTosca_nodes_rootAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_scalable(Tosca_capabilities_scalable object) {
				return createTosca_capabilities_scalableAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_endpoint_admin(Tosca_capabilities_endpoint_admin object) {
				return createTosca_capabilities_endpoint_adminAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_operatingsystem(Tosca_capabilities_operatingsystem object) {
				return createTosca_capabilities_operatingsystemAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_network_bindable(Tosca_capabilities_network_bindable object) {
				return createTosca_capabilities_network_bindableAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_compute(Tosca_nodes_compute object) {
				return createTosca_nodes_computeAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_webapplication(Tosca_nodes_webapplication object) {
				return createTosca_nodes_webapplicationAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_softwarecomponent(Tosca_nodes_softwarecomponent object) {
				return createTosca_nodes_softwarecomponentAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_dbms(Tosca_nodes_dbms object) {
				return createTosca_nodes_dbmsAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_webserver(Tosca_nodes_webserver object) {
				return createTosca_nodes_webserverAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_container_application(Tosca_nodes_container_application object) {
				return createTosca_nodes_container_applicationAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_endpoint_database(Tosca_capabilities_endpoint_database object) {
				return createTosca_capabilities_endpoint_databaseAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_database(Tosca_nodes_database object) {
				return createTosca_nodes_databaseAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseInstallationdependency(Installationdependency object) {
				return createInstallationdependencyAdapter();
			}
			@Override
			public Adapter caseExecutiondependency(Executiondependency object) {
				return createExecutiondependencyAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_root(Tosca_relationships_root object) {
				return createTosca_relationships_rootAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_hostedon(Tosca_relationships_hostedon object) {
				return createTosca_relationships_hostedonAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_attachesto(Tosca_relationships_attachesto object) {
				return createTosca_relationships_attachestoAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_connectsto(Tosca_relationships_connectsto object) {
				return createTosca_relationships_connectstoAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_dependson(Tosca_relationships_dependson object) {
				return createTosca_relationships_dependsonAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.arrayCredential <em>array Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.arrayCredential
	 * @generated
	 */
	public Adapter createarrayCredentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.arrayPortSpec <em>array Port Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.arrayPortSpec
	 * @generated
	 */
	public Adapter createarrayPortSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.arrayversion <em>arrayversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.arrayversion
	 * @generated
	 */
	public Adapter createarrayversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.arrayinteger <em>arrayinteger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.arrayinteger
	 * @generated
	 */
	public Adapter createarrayintegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_capabilities_containerchild <em>Tosca capabilities containerchild</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_capabilities_containerchild
	 * @generated
	 */
	public Adapter createTosca_capabilities_containerchildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_capabilities_somecap <em>Tosca capabilities somecap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_capabilities_somecap
	 * @generated
	 */
	public Adapter createTosca_capabilities_somecapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_capabilities_indigo_endpoint <em>Tosca capabilities indigo endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_capabilities_indigo_endpoint
	 * @generated
	 */
	public Adapter createTosca_capabilities_indigo_endpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_capabilities_ha <em>Tosca capabilities ha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_capabilities_ha
	 * @generated
	 */
	public Adapter createTosca_capabilities_haAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_capabilities_nodejsappcontainer <em>Tosca capabilities nodejsappcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_capabilities_nodejsappcontainer
	 * @generated
	 */
	public Adapter createTosca_capabilities_nodejsappcontainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_capabilities_container_docker <em>Tosca capabilities container docker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_capabilities_container_docker
	 * @generated
	 */
	public Adapter createTosca_capabilities_container_dockerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_capabilities_somechildcap <em>Tosca capabilities somechildcap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_capabilities_somechildcap
	 * @generated
	 */
	public Adapter createTosca_capabilities_somechildcapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_computewithprop <em>Tosca nodes computewithprop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_computewithprop
	 * @generated
	 */
	public Adapter createTosca_nodes_computewithpropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_webapplication_paypalpizzastore <em>Tosca nodes webapplication paypalpizzastore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_webapplication_paypalpizzastore
	 * @generated
	 */
	public Adapter createTosca_nodes_webapplication_paypalpizzastoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_abstractmongod <em>Tosca nodes abstractmongod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_abstractmongod
	 * @generated
	 */
	public Adapter createTosca_nodes_abstractmongodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_mongod <em>Tosca nodes mongod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_mongod
	 * @generated
	 */
	public Adapter createTosca_nodes_mongodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_network_network <em>Tosca nodes network network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_network_network
	 * @generated
	 */
	public Adapter createTosca_nodes_network_networkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_nodejs <em>Tosca nodes nodejs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_nodejs
	 * @generated
	 */
	public Adapter createTosca_nodes_nodejsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_container_application_docker <em>Tosca nodes container application docker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_container_application_docker
	 * @generated
	 */
	public Adapter createTosca_nodes_container_application_dockerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_softwarecomponent_kibana <em>Tosca nodes softwarecomponent kibana</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_kibana
	 * @generated
	 */
	public Adapter createTosca_nodes_softwarecomponent_kibanaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_computewithattrlist <em>Tosca nodes computewithattrlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_computewithattrlist
	 * @generated
	 */
	public Adapter createTosca_nodes_computewithattrlistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_softwarecomponent_logstash <em>Tosca nodes softwarecomponent logstash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_logstash
	 * @generated
	 */
	public Adapter createTosca_nodes_softwarecomponent_logstashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Example_databasesubsystem <em>Example databasesubsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Example_databasesubsystem
	 * @generated
	 */
	public Adapter createExample_databasesubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_softwarecomponent_collectd <em>Tosca nodes softwarecomponent collectd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_collectd
	 * @generated
	 */
	public Adapter createTosca_nodes_softwarecomponent_collectdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_nodewithreq <em>Tosca nodes nodewithreq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_nodewithreq
	 * @generated
	 */
	public Adapter createTosca_nodes_nodewithreqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_somenode2 <em>Tosca nodes somenode2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_somenode2
	 * @generated
	 */
	public Adapter createTosca_nodes_somenode2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_php <em>Tosca nodes php</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_php
	 * @generated
	 */
	public Adapter createTosca_nodes_phpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_database_mysql <em>Tosca nodes database mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_database_mysql
	 * @generated
	 */
	public Adapter createTosca_nodes_database_mysqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Example_queuingsubsystem <em>Example queuingsubsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Example_queuingsubsystem
	 * @generated
	 */
	public Adapter createExample_queuingsubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Example_transactionsubsystem <em>Example transactionsubsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Example_transactionsubsystem
	 * @generated
	 */
	public Adapter createExample_transactionsubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_abstractmysql <em>Tosca nodes abstractmysql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_abstractmysql
	 * @generated
	 */
	public Adapter createTosca_nodes_abstractmysqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_mysql <em>Tosca nodes mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_mysql
	 * @generated
	 */
	public Adapter createTosca_nodes_mysqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_softwarecomponent_elasticsearch <em>Tosca nodes softwarecomponent elasticsearch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_elasticsearch
	 * @generated
	 */
	public Adapter createTosca_nodes_softwarecomponent_elasticsearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_databasewithlistparam <em>Tosca nodes databasewithlistparam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_databasewithlistparam
	 * @generated
	 */
	public Adapter createTosca_nodes_databasewithlistparamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Example_someapp <em>Example someapp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Example_someapp
	 * @generated
	 */
	public Adapter createExample_someappAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_nodecellar <em>Tosca nodes nodecellar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_nodecellar
	 * @generated
	 */
	public Adapter createTosca_nodes_nodecellarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_nodewithcap <em>Tosca nodes nodewithcap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_nodewithcap
	 * @generated
	 */
	public Adapter createTosca_nodes_nodewithcapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_apache <em>Tosca nodes apache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_apache
	 * @generated
	 */
	public Adapter createTosca_nodes_apacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Rsyslog <em>Rsyslog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Rsyslog
	 * @generated
	 */
	public Adapter createRsyslogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_wordpress <em>Tosca nodes wordpress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_wordpress
	 * @generated
	 */
	public Adapter createTosca_nodes_wordpressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_network_port <em>Tosca nodes network port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_network_port
	 * @generated
	 */
	public Adapter createTosca_nodes_network_portAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_computewithcapwithattr <em>Tosca nodes computewithcapwithattr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_computewithcapwithattr
	 * @generated
	 */
	public Adapter createTosca_nodes_computewithcapwithattrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_softwarecomponent_rsyslog <em>Tosca nodes softwarecomponent rsyslog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_softwarecomponent_rsyslog
	 * @generated
	 */
	public Adapter createTosca_nodes_softwarecomponent_rsyslogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_hacompute <em>Tosca nodes hacompute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_hacompute
	 * @generated
	 */
	public Adapter createTosca_nodes_hacomputeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_somenode <em>Tosca nodes somenode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_somenode
	 * @generated
	 */
	public Adapter createTosca_nodes_somenodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_nodes_dbms_mysql <em>Tosca nodes dbms mysql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_nodes_dbms_mysql
	 * @generated
	 */
	public Adapter createTosca_nodes_dbms_mysqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Mycompany_mytypes_myscalingpolicy <em>Mycompany mytypes myscalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Mycompany_mytypes_myscalingpolicy
	 * @generated
	 */
	public Adapter createMycompany_mytypes_myscalingpolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_relationships_nodecellarhostedonnodejs <em>Tosca relationships nodecellarhostedonnodejs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_relationships_nodecellarhostedonnodejs
	 * @generated
	 */
	public Adapter createTosca_relationships_nodecellarhostedonnodejsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_relationships_ha <em>Tosca relationships ha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_relationships_ha
	 * @generated
	 */
	public Adapter createTosca_relationships_haAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Myattachesto <em>Myattachesto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Myattachesto
	 * @generated
	 */
	public Adapter createMyattachestoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_relationships_nodejsconnecttomongo <em>Tosca relationships nodejsconnecttomongo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_relationships_nodejsconnecttomongo
	 * @generated
	 */
	public Adapter createTosca_relationships_nodejsconnecttomongoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_relationships_network_linksto <em>Tosca relationships network linksto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_relationships_network_linksto
	 * @generated
	 */
	public Adapter createTosca_relationships_network_linkstoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Test_relation_connects <em>Test relation connects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Test_relation_connects
	 * @generated
	 */
	public Adapter createTest_relation_connectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extendedtosca.Tosca_relationships_network_bindsto <em>Tosca relationships network bindsto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extendedtosca.Tosca_relationships_network_bindsto
	 * @generated
	 */
	public Adapter createTosca_relationships_network_bindstoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.MixinBase <em>Mixin Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.MixinBase
	 * @generated
	 */
	public Adapter createMixinBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modmacao.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modmacao.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_root <em>Tosca capabilities root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_root
	 * @generated
	 */
	public Adapter createTosca_capabilities_rootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container <em>Tosca capabilities container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_container
	 * @generated
	 */
	public Adapter createTosca_capabilities_containerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint <em>Tosca capabilities endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint
	 * @generated
	 */
	public Adapter createTosca_capabilities_endpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_node <em>Tosca capabilities node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_node
	 * @generated
	 */
	public Adapter createTosca_capabilities_nodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_root <em>Tosca nodes root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_root
	 * @generated
	 */
	public Adapter createTosca_nodes_rootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable <em>Tosca capabilities scalable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable
	 * @generated
	 */
	public Adapter createTosca_capabilities_scalableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_admin <em>Tosca capabilities endpoint admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_admin
	 * @generated
	 */
	public Adapter createTosca_capabilities_endpoint_adminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem <em>Tosca capabilities operatingsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem
	 * @generated
	 */
	public Adapter createTosca_capabilities_operatingsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_network_bindable <em>Tosca capabilities network bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_network_bindable
	 * @generated
	 */
	public Adapter createTosca_capabilities_network_bindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_compute <em>Tosca nodes compute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_compute
	 * @generated
	 */
	public Adapter createTosca_nodes_computeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication <em>Tosca nodes webapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication
	 * @generated
	 */
	public Adapter createTosca_nodes_webapplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent <em>Tosca nodes softwarecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent
	 * @generated
	 */
	public Adapter createTosca_nodes_softwarecomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.modmacao.occi.platform.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.modmacao.occi.platform.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms <em>Tosca nodes dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms
	 * @generated
	 */
	public Adapter createTosca_nodes_dbmsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver <em>Tosca nodes webserver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver
	 * @generated
	 */
	public Adapter createTosca_nodes_webserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_container_application <em>Tosca nodes container application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_container_application
	 * @generated
	 */
	public Adapter createTosca_nodes_container_applicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_database <em>Tosca capabilities endpoint database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_database
	 * @generated
	 */
	public Adapter createTosca_capabilities_endpoint_databaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_database <em>Tosca nodes database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_database
	 * @generated
	 */
	public Adapter createTosca_nodes_databaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modmacao.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modmacao.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modmacao.Installationdependency <em>Installationdependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modmacao.Installationdependency
	 * @generated
	 */
	public Adapter createInstallationdependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modmacao.Executiondependency <em>Executiondependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modmacao.Executiondependency
	 * @generated
	 */
	public Adapter createExecutiondependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_root <em>Tosca relationships root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_root
	 * @generated
	 */
	public Adapter createTosca_relationships_rootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon <em>Tosca relationships hostedon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon
	 * @generated
	 */
	public Adapter createTosca_relationships_hostedonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto <em>Tosca relationships attachesto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto
	 * @generated
	 */
	public Adapter createTosca_relationships_attachestoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto <em>Tosca relationships connectsto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto
	 * @generated
	 */
	public Adapter createTosca_relationships_connectstoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_dependson <em>Tosca relationships dependson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_dependson
	 * @generated
	 */
	public Adapter createTosca_relationships_dependsonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExtendedtoscaAdapterFactory
