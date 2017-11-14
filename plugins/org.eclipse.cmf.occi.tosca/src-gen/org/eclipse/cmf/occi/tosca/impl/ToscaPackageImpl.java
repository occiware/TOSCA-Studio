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
package org.eclipse.cmf.occi.tosca.impl;

import java.util.Map;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.cmf.occi.sla.SlaPackage;

import org.eclipse.cmf.occi.tosca.ToscaFactory;
import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_attachment;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_container;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_admin;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_database;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_network_bindable;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_node;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_root;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable;
import org.eclipse.cmf.occi.tosca.Tosca_groups_root;
import org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard;
import org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure;
import org.eclipse.cmf.occi.tosca.Tosca_interfaces_root;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_compute;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_container_application;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_container_runtime;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_database;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_loadbalancer;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_root;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver;
import org.eclipse.cmf.occi.tosca.Tosca_policies_performance;
import org.eclipse.cmf.occi.tosca.Tosca_policies_placement;
import org.eclipse.cmf.occi.tosca.Tosca_policies_root;
import org.eclipse.cmf.occi.tosca.Tosca_policies_scaling;
import org.eclipse.cmf.occi.tosca.Tosca_policies_update;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_dependson;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_root;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_routesto;
import org.eclipse.cmf.occi.tosca.arrayBoolean;
import org.eclipse.cmf.occi.tosca.arrayByte;
import org.eclipse.cmf.occi.tosca.arrayDouble;
import org.eclipse.cmf.occi.tosca.arrayFloat;
import org.eclipse.cmf.occi.tosca.arrayInteger;
import org.eclipse.cmf.occi.tosca.arrayLong;
import org.eclipse.cmf.occi.tosca.arrayShort;
import org.eclipse.cmf.occi.tosca.arrayString;
import org.eclipse.cmf.occi.tosca.initiatorEnum;
import org.eclipse.cmf.occi.tosca.protocolEnum;
import org.eclipse.cmf.occi.tosca.toscadatatypesCredential;
import org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo;
import org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo;
import org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec;

import org.eclipse.cmf.occi.tosca.util.ToscaValidator;

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
public class ToscaPackageImpl extends EPackageImpl implements ToscaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayByteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayShortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toscadatatypesnetworkNetworkInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toscadatatypesnetworkPortInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toscadatatypesCredentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toscadatatypesnetworkPortSpecEClass = null;

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
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToscaPackageImpl() {
		super(eNS_URI, ToscaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToscaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToscaPackage init() {
		if (isInited) return (ToscaPackage)EPackage.Registry.INSTANCE.getEPackage(ToscaPackage.eNS_URI);

		// Obtain or create and register package
		ToscaPackageImpl theToscaPackage = (ToscaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToscaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToscaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		SlaPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToscaPackage.createPackageContents();

		// Initialize created meta-data
		theToscaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theToscaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ToscaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theToscaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToscaPackage.eNS_URI, theToscaPackage);
		return theToscaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayString() {
		return arrayStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayString_Values() {
		return (EAttribute)arrayStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayBoolean() {
		return arrayBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayBoolean_Values() {
		return (EAttribute)arrayBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayByte() {
		return arrayByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayByte_Values() {
		return (EAttribute)arrayByteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayDouble() {
		return arrayDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayDouble_Values() {
		return (EAttribute)arrayDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayFloat() {
		return arrayFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayFloat_Values() {
		return (EAttribute)arrayFloatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayInteger() {
		return arrayIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayInteger_Values() {
		return (EAttribute)arrayIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayLong() {
		return arrayLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayLong_Values() {
		return (EAttribute)arrayLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarrayShort() {
		return arrayShortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarrayShort_Values() {
		return (EAttribute)arrayShortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettoscadatatypesnetworkNetworkInfo() {
		return toscadatatypesnetworkNetworkInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkNetworkInfo_Networkid() {
		return (EAttribute)toscadatatypesnetworkNetworkInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettoscadatatypesnetworkNetworkInfo_Addresses() {
		return (EReference)toscadatatypesnetworkNetworkInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkNetworkInfo_Networkname() {
		return (EAttribute)toscadatatypesnetworkNetworkInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettoscadatatypesnetworkPortInfo() {
		return toscadatatypesnetworkPortInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkPortInfo_Portname() {
		return (EAttribute)toscadatatypesnetworkPortInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkPortInfo_Networkid() {
		return (EAttribute)toscadatatypesnetworkPortInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettoscadatatypesnetworkPortInfo_Addresses() {
		return (EReference)toscadatatypesnetworkPortInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkPortInfo_Macaddress() {
		return (EAttribute)toscadatatypesnetworkPortInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkPortInfo_Portid() {
		return (EAttribute)toscadatatypesnetworkPortInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettoscadatatypesCredential() {
		return toscadatatypesCredentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesCredential_Protocol() {
		return (EAttribute)toscadatatypesCredentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesCredential_Keys() {
		return (EAttribute)toscadatatypesCredentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesCredential_Tokentype() {
		return (EAttribute)toscadatatypesCredentialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesCredential_User() {
		return (EAttribute)toscadatatypesCredentialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesCredential_Token() {
		return (EAttribute)toscadatatypesCredentialEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettoscadatatypesnetworkPortSpec() {
		return toscadatatypesnetworkPortSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkPortSpec_Protocol() {
		return (EAttribute)toscadatatypesnetworkPortSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkPortSpec_Targetrange() {
		return (EAttribute)toscadatatypesnetworkPortSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkPortSpec_Sourcerange() {
		return (EAttribute)toscadatatypesnetworkPortSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkPortSpec_Source() {
		return (EAttribute)toscadatatypesnetworkPortSpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettoscadatatypesnetworkPortSpec_Target() {
		return (EAttribute)toscadatatypesnetworkPortSpecEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getTosca_capabilities_container_NumCpus() {
		return (EAttribute)tosca_capabilities_containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_container_DiskSize() {
		return (EAttribute)tosca_capabilities_containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_container_CpuFrequency() {
		return (EAttribute)tosca_capabilities_containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTosca_capabilities_container_MemSize() {
		return (EAttribute)tosca_capabilities_containerEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getTosca_capabilities_operatingsystem_Architecture() {
		return (EAttribute)tosca_capabilities_operatingsystemEClass.getEStructuralFeatures().get(3);
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
	public ToscaFactory getToscaFactory() {
		return (ToscaFactory)getEFactoryInstance();
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
		arrayStringEClass = createEClass(ARRAY_STRING);
		createEAttribute(arrayStringEClass, ARRAY_STRING__VALUES);

		arrayBooleanEClass = createEClass(ARRAY_BOOLEAN);
		createEAttribute(arrayBooleanEClass, ARRAY_BOOLEAN__VALUES);

		arrayByteEClass = createEClass(ARRAY_BYTE);
		createEAttribute(arrayByteEClass, ARRAY_BYTE__VALUES);

		arrayDoubleEClass = createEClass(ARRAY_DOUBLE);
		createEAttribute(arrayDoubleEClass, ARRAY_DOUBLE__VALUES);

		arrayFloatEClass = createEClass(ARRAY_FLOAT);
		createEAttribute(arrayFloatEClass, ARRAY_FLOAT__VALUES);

		arrayIntegerEClass = createEClass(ARRAY_INTEGER);
		createEAttribute(arrayIntegerEClass, ARRAY_INTEGER__VALUES);

		arrayLongEClass = createEClass(ARRAY_LONG);
		createEAttribute(arrayLongEClass, ARRAY_LONG__VALUES);

		arrayShortEClass = createEClass(ARRAY_SHORT);
		createEAttribute(arrayShortEClass, ARRAY_SHORT__VALUES);

		toscadatatypesnetworkNetworkInfoEClass = createEClass(TOSCADATATYPESNETWORK_NETWORK_INFO);
		createEAttribute(toscadatatypesnetworkNetworkInfoEClass, TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKID);
		createEReference(toscadatatypesnetworkNetworkInfoEClass, TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES);
		createEAttribute(toscadatatypesnetworkNetworkInfoEClass, TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKNAME);

		toscadatatypesnetworkPortInfoEClass = createEClass(TOSCADATATYPESNETWORK_PORT_INFO);
		createEAttribute(toscadatatypesnetworkPortInfoEClass, TOSCADATATYPESNETWORK_PORT_INFO__PORTNAME);
		createEAttribute(toscadatatypesnetworkPortInfoEClass, TOSCADATATYPESNETWORK_PORT_INFO__NETWORKID);
		createEReference(toscadatatypesnetworkPortInfoEClass, TOSCADATATYPESNETWORK_PORT_INFO__ADDRESSES);
		createEAttribute(toscadatatypesnetworkPortInfoEClass, TOSCADATATYPESNETWORK_PORT_INFO__MACADDRESS);
		createEAttribute(toscadatatypesnetworkPortInfoEClass, TOSCADATATYPESNETWORK_PORT_INFO__PORTID);

		toscadatatypesCredentialEClass = createEClass(TOSCADATATYPES_CREDENTIAL);
		createEAttribute(toscadatatypesCredentialEClass, TOSCADATATYPES_CREDENTIAL__PROTOCOL);
		createEAttribute(toscadatatypesCredentialEClass, TOSCADATATYPES_CREDENTIAL__KEYS);
		createEAttribute(toscadatatypesCredentialEClass, TOSCADATATYPES_CREDENTIAL__TOKENTYPE);
		createEAttribute(toscadatatypesCredentialEClass, TOSCADATATYPES_CREDENTIAL__USER);
		createEAttribute(toscadatatypesCredentialEClass, TOSCADATATYPES_CREDENTIAL__TOKEN);

		toscadatatypesnetworkPortSpecEClass = createEClass(TOSCADATATYPESNETWORK_PORT_SPEC);
		createEAttribute(toscadatatypesnetworkPortSpecEClass, TOSCADATATYPESNETWORK_PORT_SPEC__PROTOCOL);
		createEAttribute(toscadatatypesnetworkPortSpecEClass, TOSCADATATYPESNETWORK_PORT_SPEC__TARGETRANGE);
		createEAttribute(toscadatatypesnetworkPortSpecEClass, TOSCADATATYPESNETWORK_PORT_SPEC__SOURCERANGE);
		createEAttribute(toscadatatypesnetworkPortSpecEClass, TOSCADATATYPESNETWORK_PORT_SPEC__SOURCE);
		createEAttribute(toscadatatypesnetworkPortSpecEClass, TOSCADATATYPESNETWORK_PORT_SPEC__TARGET);

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
		createEAttribute(tosca_capabilities_containerEClass, TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS);
		createEAttribute(tosca_capabilities_containerEClass, TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE);
		createEAttribute(tosca_capabilities_containerEClass, TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY);
		createEAttribute(tosca_capabilities_containerEClass, TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE);

		tosca_capabilities_endpoint_databaseEClass = createEClass(TOSCA_CAPABILITIES_ENDPOINT_DATABASE);

		tosca_capabilities_endpoint_publicEClass = createEClass(TOSCA_CAPABILITIES_ENDPOINT_PUBLIC);
		createEAttribute(tosca_capabilities_endpoint_publicEClass, TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING);
		createEAttribute(tosca_capabilities_endpoint_publicEClass, TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME);

		tosca_capabilities_endpoint_adminEClass = createEClass(TOSCA_CAPABILITIES_ENDPOINT_ADMIN);

		tosca_capabilities_operatingsystemEClass = createEClass(TOSCA_CAPABILITIES_OPERATINGSYSTEM);
		createEAttribute(tosca_capabilities_operatingsystemEClass, TOSCA_CAPABILITIES_OPERATINGSYSTEM__TYPE);
		createEAttribute(tosca_capabilities_operatingsystemEClass, TOSCA_CAPABILITIES_OPERATINGSYSTEM__DISTRIBUTION);
		createEAttribute(tosca_capabilities_operatingsystemEClass, TOSCA_CAPABILITIES_OPERATINGSYSTEM__VERSION);
		createEAttribute(tosca_capabilities_operatingsystemEClass, TOSCA_CAPABILITIES_OPERATINGSYSTEM__ARCHITECTURE);

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

		// Initialize classes, features, and operations; add parameters
		initEClass(arrayStringEClass, arrayString.class, "arrayString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayString_Values(), this.getstring(), "values", null, 0, -1, arrayString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayBooleanEClass, arrayBoolean.class, "arrayBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayBoolean_Values(), this.getboolean(), "values", null, 0, -1, arrayBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayByteEClass, arrayByte.class, "arrayByte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayByte_Values(), this.getbyte(), "values", null, 0, -1, arrayByte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayDoubleEClass, arrayDouble.class, "arrayDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayDouble_Values(), this.getdouble(), "values", null, 0, -1, arrayDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayFloatEClass, arrayFloat.class, "arrayFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayFloat_Values(), this.getfloat(), "values", null, 0, -1, arrayFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayIntegerEClass, arrayInteger.class, "arrayInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayInteger_Values(), this.getinteger(), "values", null, 0, -1, arrayInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayLongEClass, arrayLong.class, "arrayLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayLong_Values(), this.getlong(), "values", null, 0, -1, arrayLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayShortEClass, arrayShort.class, "arrayShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarrayShort_Values(), this.getshort(), "values", null, 0, -1, arrayShort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toscadatatypesnetworkNetworkInfoEClass, toscadatatypesnetworkNetworkInfo.class, "toscadatatypesnetworkNetworkInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettoscadatatypesnetworkNetworkInfo_Networkid(), this.getstring(), "networkid", null, 1, 1, toscadatatypesnetworkNetworkInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettoscadatatypesnetworkNetworkInfo_Addresses(), this.getarrayString(), null, "addresses", null, 0, 1, toscadatatypesnetworkNetworkInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesnetworkNetworkInfo_Networkname(), this.getstring(), "networkname", null, 1, 1, toscadatatypesnetworkNetworkInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toscadatatypesnetworkPortInfoEClass, toscadatatypesnetworkPortInfo.class, "toscadatatypesnetworkPortInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettoscadatatypesnetworkPortInfo_Portname(), this.getstring(), "portname", null, 1, 1, toscadatatypesnetworkPortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesnetworkPortInfo_Networkid(), this.getstring(), "networkid", null, 1, 1, toscadatatypesnetworkPortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettoscadatatypesnetworkPortInfo_Addresses(), this.getarrayString(), null, "addresses", null, 0, 1, toscadatatypesnetworkPortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesnetworkPortInfo_Macaddress(), this.getstring(), "macaddress", null, 1, 1, toscadatatypesnetworkPortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesnetworkPortInfo_Portid(), this.getstring(), "portid", null, 1, 1, toscadatatypesnetworkPortInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toscadatatypesCredentialEClass, toscadatatypesCredential.class, "toscadatatypesCredential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettoscadatatypesCredential_Protocol(), this.getstring(), "protocol", null, 1, 1, toscadatatypesCredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesCredential_Keys(), this.getmap(), "keys", null, 1, 1, toscadatatypesCredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesCredential_Tokentype(), this.getstring(), "tokentype", "The required token type.", 1, 1, toscadatatypesCredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesCredential_User(), this.getstring(), "user", null, 1, 1, toscadatatypesCredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesCredential_Token(), this.getstring(), "token", null, 1, 1, toscadatatypesCredential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toscadatatypesnetworkPortSpecEClass, toscadatatypesnetworkPortSpec.class, "toscadatatypesnetworkPortSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettoscadatatypesnetworkPortSpec_Protocol(), this.getprotocolEnum(), "protocol", null, 1, 1, toscadatatypesnetworkPortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesnetworkPortSpec_Targetrange(), this.getrange(), "targetrange", null, 1, 1, toscadatatypesnetworkPortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesnetworkPortSpec_Sourcerange(), this.getrange(), "sourcerange", null, 1, 1, toscadatatypesnetworkPortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesnetworkPortSpec_Source(), this.gettoscadatatypesnetworkPortDef(), "source", null, 1, 1, toscadatatypesnetworkPortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettoscadatatypesnetworkPortSpec_Target(), this.gettoscadatatypesnetworkPortDef(), "target", null, 1, 1, toscadatatypesnetworkPortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getTosca_capabilities_container_NumCpus(), this.getintegerMinOne(), "numCpus", null, 0, 1, Tosca_capabilities_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_container_DiskSize(), this.getscalarSizeMinZeroMB(), "diskSize", null, 0, 1, Tosca_capabilities_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_container_CpuFrequency(), this.getscalarFrequency(), "cpuFrequency", null, 0, 1, Tosca_capabilities_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_container_MemSize(), this.getscalarSizeMinZeroMB(), "memSize", null, 0, 1, Tosca_capabilities_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_endpoint_databaseEClass, Tosca_capabilities_endpoint_database.class, "Tosca_capabilities_endpoint_database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_endpoint_publicEClass, Tosca_capabilities_endpoint_public.class, "Tosca_capabilities_endpoint_public", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_endpoint_public_Floating(), this.getboolean(), "floating", "false", 0, 1, Tosca_capabilities_endpoint_public.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_endpoint_public_DnsName(), this.getstring(), "dnsName", null, 0, 1, Tosca_capabilities_endpoint_public.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tosca_capabilities_endpoint_adminEClass, Tosca_capabilities_endpoint_admin.class, "Tosca_capabilities_endpoint_admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tosca_capabilities_operatingsystemEClass, Tosca_capabilities_operatingsystem.class, "Tosca_capabilities_operatingsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTosca_capabilities_operatingsystem_Type(), this.getstring(), "type", null, 0, 1, Tosca_capabilities_operatingsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_operatingsystem_Distribution(), this.getstring(), "distribution", null, 0, 1, Tosca_capabilities_operatingsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_operatingsystem_Version(), this.getversion(), "version", null, 0, 1, Tosca_capabilities_operatingsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTosca_capabilities_operatingsystem_Architecture(), this.getstring(), "architecture", null, 0, 1, Tosca_capabilities_operatingsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getTosca_nodes_softwarecomponent_AdminCredential(), this.gettoscadatatypesCredential(), null, "adminCredential", null, 0, 1, Tosca_nodes_softwarecomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getTosca_relationships_connectsto_Credential(), this.gettoscadatatypesCredential(), null, "credential", null, 0, 1, Tosca_relationships_connectsto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //ToscaPackageImpl
