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
package modmacao.impl;

import modmacao.Application;
import modmacao.Cluster;
import modmacao.Component;
import modmacao.Dependency;
import modmacao.Executiondependency;
import modmacao.Installationdependency;
import modmacao.ModmacaoFactory;
import modmacao.ModmacaoPackage;

import modmacao.util.ModmacaoValidator;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.modmacao.occi.platform.PlatformPackage;
import org.modmacao.placement.PlacementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModmacaoPackageImpl extends EPackageImpl implements ModmacaoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installationdependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executiondependencyEClass = null;

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
	private EDataType portEDataType = null;

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
	 * @see modmacao.ModmacaoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModmacaoPackageImpl() {
		super(eNS_URI, ModmacaoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModmacaoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModmacaoPackage init() {
		if (isInited) return (ModmacaoPackage)EPackage.Registry.INSTANCE.getEPackage(ModmacaoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModmacaoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModmacaoPackageImpl theModmacaoPackage = registeredModmacaoPackage instanceof ModmacaoPackageImpl ? (ModmacaoPackageImpl)registeredModmacaoPackage : new ModmacaoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PlatformPackage.eINSTANCE.eClass();
		PlacementPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModmacaoPackage.createPackageContents();

		// Initialize created meta-data
		theModmacaoPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModmacaoPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ModmacaoValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModmacaoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModmacaoPackage.eNS_URI, theModmacaoPackage);
		return theModmacaoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__AppliesConstraint__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__OneOrMoreComponents__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDependency__AppliesConstraint__DiagnosticChain_Map() {
		return dependencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDependency__TargetMustBeComponent__DiagnosticChain_Map() {
		return dependencyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDependency__SourceMustBeComponent__DiagnosticChain_Map() {
		return dependencyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ModmacaoComponentVersion() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__AppliesConstraint__DiagnosticChain_Map() {
		return componentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__OnlyOnePlacementLink__DiagnosticChain_Map() {
		return componentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstallationdependency() {
		return installationdependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutiondependency() {
		return executiondependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPort() {
		return portEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModmacaoFactory getModmacaoFactory() {
		return (ModmacaoFactory)getEFactoryInstance();
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
		applicationEClass = createEClass(APPLICATION);
		createEOperation(applicationEClass, APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___ONE_OR_MORE_COMPONENTS__DIAGNOSTICCHAIN_MAP);

		dependencyEClass = createEClass(DEPENDENCY);
		createEOperation(dependencyEClass, DEPENDENCY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(dependencyEClass, DEPENDENCY___TARGET_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(dependencyEClass, DEPENDENCY___SOURCE_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__MODMACAO_COMPONENT_VERSION);
		createEOperation(componentEClass, COMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(componentEClass, COMPONENT___ONLY_ONE_PLACEMENT_LINK__DIAGNOSTICCHAIN_MAP);

		clusterEClass = createEClass(CLUSTER);

		installationdependencyEClass = createEClass(INSTALLATIONDEPENDENCY);

		executiondependencyEClass = createEClass(EXECUTIONDEPENDENCY);

		// Create data types
		versionEDataType = createEDataType(VERSION);
		portEDataType = createEDataType(PORT);
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
		applicationEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		dependencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		componentEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		clusterEClass.getESuperTypes().add(this.getApplication());
		clusterEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		installationdependencyEClass.getESuperTypes().add(this.getDependency());
		installationdependencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		executiondependencyEClass.getESuperTypes().add(this.getDependency());
		executiondependencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApplication__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__OneOrMoreComponents__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OneOrMoreComponents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDependency__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDependency__TargetMustBeComponent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "TargetMustBeComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDependency__SourceMustBeComponent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SourceMustBeComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_ModmacaoComponentVersion(), this.getVersion(), "modmacaoComponentVersion", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComponent__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponent__OnlyOnePlacementLink__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OnlyOnePlacementLink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(installationdependencyEClass, Installationdependency.class, "Installationdependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executiondependencyEClass, Executiondependency.class, "Executiondependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(versionEDataType, String.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portEDataType, Integer.class, "Port", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (applicationEClass,
		   source,
		   new String[] {
			   "constraints", "OneOrMoreComponents"
		   });
		addAnnotation
		  (dependencyEClass,
		   source,
		   new String[] {
			   "constraints", "SourceMustBeComponent"
		   });
		addAnnotation
		  (componentEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyOnePlacementLink"
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
		  (portEDataType,
		   source,
		   new String[] {
			   "minInclusive", "0",
			   "maxInclusive", "65535"
		   });
	}

} //ModmacaoPackageImpl
