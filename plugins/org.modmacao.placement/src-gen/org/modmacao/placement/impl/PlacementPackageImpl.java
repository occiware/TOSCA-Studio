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
package org.modmacao.placement.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modmacao.occi.platform.PlatformPackage;

import org.modmacao.placement.PlacementFactory;
import org.modmacao.placement.PlacementPackage;
import org.modmacao.placement.Placementlink;

import org.modmacao.placement.util.PlacementValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlacementPackageImpl extends EPackageImpl implements PlacementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementlinkEClass = null;

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
	 * @see org.modmacao.placement.PlacementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlacementPackageImpl() {
		super(eNS_URI, PlacementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlacementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlacementPackage init() {
		if (isInited) return (PlacementPackage)EPackage.Registry.INSTANCE.getEPackage(PlacementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPlacementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PlacementPackageImpl thePlacementPackage = registeredPlacementPackage instanceof PlacementPackageImpl ? (PlacementPackageImpl)registeredPlacementPackage : new PlacementPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePlacementPackage.createPackageContents();

		// Initialize created meta-data
		thePlacementPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePlacementPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PlacementValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePlacementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlacementPackage.eNS_URI, thePlacementPackage);
		return thePlacementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacementlink() {
		return placementlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlacementlink__SourceConstraint__DiagnosticChain_Map() {
		return placementlinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlacementlink__TargetConstraint__DiagnosticChain_Map() {
		return placementlinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementFactory getPlacementFactory() {
		return (PlacementFactory)getEFactoryInstance();
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
		placementlinkEClass = createEClass(PLACEMENTLINK);
		createEOperation(placementlinkEClass, PLACEMENTLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(placementlinkEClass, PLACEMENTLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placementlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(placementlinkEClass, Placementlink.class, "Placementlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getPlacementlink__SourceConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPlacementlink__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		addAnnotation
		  (placementlinkEClass,
		   source,
		   new String[] {
			   "constraints", "targetConstraint"
		   });
	}

} //PlacementPackageImpl
