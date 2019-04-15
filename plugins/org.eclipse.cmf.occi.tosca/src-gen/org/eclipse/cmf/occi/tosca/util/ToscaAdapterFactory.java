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

import modmacao.Dependency;
import modmacao.Executiondependency;
import modmacao.Installationdependency;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.sla.Agreement_term;

import org.eclipse.cmf.occi.tosca.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage
 * @generated
 */
public class ToscaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToscaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToscaPackage.eINSTANCE;
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
	protected ToscaSwitch<Adapter> modelSwitch =
		new ToscaSwitch<Adapter>() {
			@Override
			public Adapter casearraystring(arraystring object) {
				return createarraystringAdapter();
			}
			@Override
			public Adapter caseNetworkInfo(NetworkInfo object) {
				return createNetworkInfoAdapter();
			}
			@Override
			public Adapter casePortInfo(PortInfo object) {
				return createPortInfoAdapter();
			}
			@Override
			public Adapter caseCredential(Credential object) {
				return createCredentialAdapter();
			}
			@Override
			public Adapter casePortSpec(PortSpec object) {
				return createPortSpecAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_root(Tosca_capabilities_root object) {
				return createTosca_capabilities_rootAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_node(Tosca_capabilities_node object) {
				return createTosca_capabilities_nodeAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_endpoint(Tosca_capabilities_endpoint object) {
				return createTosca_capabilities_endpointAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_scalable(Tosca_capabilities_scalable object) {
				return createTosca_capabilities_scalableAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_network_bindable(Tosca_capabilities_network_bindable object) {
				return createTosca_capabilities_network_bindableAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_container(Tosca_capabilities_container object) {
				return createTosca_capabilities_containerAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_endpoint_database(Tosca_capabilities_endpoint_database object) {
				return createTosca_capabilities_endpoint_databaseAdapter();
			}
			@Override
			public Adapter caseTosca_capabilities_endpoint_public(Tosca_capabilities_endpoint_public object) {
				return createTosca_capabilities_endpoint_publicAdapter();
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
			public Adapter caseTosca_capabilities_attachment(Tosca_capabilities_attachment object) {
				return createTosca_capabilities_attachmentAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_root(Tosca_nodes_root object) {
				return createTosca_nodes_rootAdapter();
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
			public Adapter caseTosca_nodes_dbms(Tosca_nodes_dbms object) {
				return createTosca_nodes_dbmsAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_objectstorage(Tosca_nodes_objectstorage object) {
				return createTosca_nodes_objectstorageAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_compute(Tosca_nodes_compute object) {
				return createTosca_nodes_computeAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_loadbalancer(Tosca_nodes_loadbalancer object) {
				return createTosca_nodes_loadbalancerAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_webserver(Tosca_nodes_webserver object) {
				return createTosca_nodes_webserverAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_database(Tosca_nodes_database object) {
				return createTosca_nodes_databaseAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_container_application(Tosca_nodes_container_application object) {
				return createTosca_nodes_container_applicationAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_container_runtime(Tosca_nodes_container_runtime object) {
				return createTosca_nodes_container_runtimeAdapter();
			}
			@Override
			public Adapter caseTosca_nodes_blockstorage(Tosca_nodes_blockstorage object) {
				return createTosca_nodes_blockstorageAdapter();
			}
			@Override
			public Adapter caseTosca_policies_root(Tosca_policies_root object) {
				return createTosca_policies_rootAdapter();
			}
			@Override
			public Adapter caseTosca_policies_update(Tosca_policies_update object) {
				return createTosca_policies_updateAdapter();
			}
			@Override
			public Adapter caseTosca_policies_placement(Tosca_policies_placement object) {
				return createTosca_policies_placementAdapter();
			}
			@Override
			public Adapter caseTosca_policies_scaling(Tosca_policies_scaling object) {
				return createTosca_policies_scalingAdapter();
			}
			@Override
			public Adapter caseTosca_policies_performance(Tosca_policies_performance object) {
				return createTosca_policies_performanceAdapter();
			}
			@Override
			public Adapter caseTosca_groups_root(Tosca_groups_root object) {
				return createTosca_groups_rootAdapter();
			}
			@Override
			public Adapter caseTosca_interfaces_root(Tosca_interfaces_root object) {
				return createTosca_interfaces_rootAdapter();
			}
			@Override
			public Adapter caseTosca_interfaces_relationship_configure(Tosca_interfaces_relationship_configure object) {
				return createTosca_interfaces_relationship_configureAdapter();
			}
			@Override
			public Adapter caseTosca_interfaces_node_lifecycle_standard(Tosca_interfaces_node_lifecycle_standard object) {
				return createTosca_interfaces_node_lifecycle_standardAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_root(Tosca_relationships_root object) {
				return createTosca_relationships_rootAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_connectsto(Tosca_relationships_connectsto object) {
				return createTosca_relationships_connectstoAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_routesto(Tosca_relationships_routesto object) {
				return createTosca_relationships_routestoAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_attachesto(Tosca_relationships_attachesto object) {
				return createTosca_relationships_attachestoAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_hostedon(Tosca_relationships_hostedon object) {
				return createTosca_relationships_hostedonAdapter();
			}
			@Override
			public Adapter caseTosca_relationships_dependson(Tosca_relationships_dependson object) {
				return createTosca_relationships_dependsonAdapter();
			}
			@Override
			public Adapter caseMixinBase(MixinBase object) {
				return createMixinBaseAdapter();
			}
			@Override
			public Adapter caseAgreement_term(Agreement_term object) {
				return createAgreement_termAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.arraystring <em>arraystring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.arraystring
	 * @generated
	 */
	public Adapter createarraystringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.NetworkInfo <em>Network Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.NetworkInfo
	 * @generated
	 */
	public Adapter createNetworkInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.PortInfo <em>Port Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.PortInfo
	 * @generated
	 */
	public Adapter createPortInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Credential
	 * @generated
	 */
	public Adapter createCredentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.PortSpec <em>Port Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.PortSpec
	 * @generated
	 */
	public Adapter createPortSpecAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public <em>Tosca capabilities endpoint public</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public
	 * @generated
	 */
	public Adapter createTosca_capabilities_endpoint_publicAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_attachment <em>Tosca capabilities attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_attachment
	 * @generated
	 */
	public Adapter createTosca_capabilities_attachmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage <em>Tosca nodes objectstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage
	 * @generated
	 */
	public Adapter createTosca_nodes_objectstorageAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_loadbalancer <em>Tosca nodes loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_loadbalancer
	 * @generated
	 */
	public Adapter createTosca_nodes_loadbalancerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_container_runtime <em>Tosca nodes container runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_container_runtime
	 * @generated
	 */
	public Adapter createTosca_nodes_container_runtimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage <em>Tosca nodes blockstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage
	 * @generated
	 */
	public Adapter createTosca_nodes_blockstorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_root <em>Tosca policies root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_root
	 * @generated
	 */
	public Adapter createTosca_policies_rootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_update <em>Tosca policies update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_update
	 * @generated
	 */
	public Adapter createTosca_policies_updateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_placement <em>Tosca policies placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_placement
	 * @generated
	 */
	public Adapter createTosca_policies_placementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_scaling <em>Tosca policies scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_scaling
	 * @generated
	 */
	public Adapter createTosca_policies_scalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_performance <em>Tosca policies performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_performance
	 * @generated
	 */
	public Adapter createTosca_policies_performanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_groups_root <em>Tosca groups root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_groups_root
	 * @generated
	 */
	public Adapter createTosca_groups_rootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_root <em>Tosca interfaces root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_root
	 * @generated
	 */
	public Adapter createTosca_interfaces_rootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure <em>Tosca interfaces relationship configure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure
	 * @generated
	 */
	public Adapter createTosca_interfaces_relationship_configureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard <em>Tosca interfaces node lifecycle standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard
	 * @generated
	 */
	public Adapter createTosca_interfaces_node_lifecycle_standardAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_routesto <em>Tosca relationships routesto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_routesto
	 * @generated
	 */
	public Adapter createTosca_relationships_routestoAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.sla.Agreement_term <em>Agreement term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.sla.Agreement_term
	 * @generated
	 */
	public Adapter createAgreement_termAdapter() {
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

} //ToscaAdapterFactory
