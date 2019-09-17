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
package modmacao;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modmacao.ModmacaoFactory
 * @model kind="package"
 * @generated
 */
public interface ModmacaoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modmacao";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/modmacao/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modmacao";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModmacaoPackage eINSTANCE = modmacao.impl.ModmacaoPackageImpl.init();

	/**
	 * The meta object id for the '{@link modmacao.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modmacao.impl.ApplicationImpl
	 * @see modmacao.impl.ModmacaoPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>One Or More Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___ONE_OR_MORE_COMPONENTS__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link modmacao.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modmacao.impl.DependencyImpl
	 * @see modmacao.impl.ModmacaoPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Target Must Be Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___TARGET_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source Must Be Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___SOURCE_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link modmacao.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modmacao.impl.ComponentImpl
	 * @see modmacao.impl.ModmacaoPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MODMACAO_COMPONENT_VERSION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Only One Placement Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ONLY_ONE_PLACEMENT_LINK__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link modmacao.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modmacao.impl.ClusterImpl
	 * @see modmacao.impl.ModmacaoPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__MIXIN = APPLICATION__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ENTITY = APPLICATION__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ATTRIBUTES = APPLICATION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>One Or More Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___ONE_OR_MORE_COMPONENTS__DIAGNOSTICCHAIN_MAP = APPLICATION___ONE_OR_MORE_COMPONENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modmacao.impl.InstallationdependencyImpl <em>Installationdependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modmacao.impl.InstallationdependencyImpl
	 * @see modmacao.impl.ModmacaoPackageImpl#getInstallationdependency()
	 * @generated
	 */
	int INSTALLATIONDEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATIONDEPENDENCY__MIXIN = DEPENDENCY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATIONDEPENDENCY__ENTITY = DEPENDENCY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATIONDEPENDENCY__ATTRIBUTES = DEPENDENCY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Installationdependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATIONDEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATIONDEPENDENCY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = DEPENDENCY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Target Must Be Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATIONDEPENDENCY___TARGET_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP = DEPENDENCY___TARGET_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATIONDEPENDENCY___SOURCE_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP = DEPENDENCY___SOURCE_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Installationdependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATIONDEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modmacao.impl.ExecutiondependencyImpl <em>Executiondependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modmacao.impl.ExecutiondependencyImpl
	 * @see modmacao.impl.ModmacaoPackageImpl#getExecutiondependency()
	 * @generated
	 */
	int EXECUTIONDEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONDEPENDENCY__MIXIN = DEPENDENCY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONDEPENDENCY__ENTITY = DEPENDENCY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONDEPENDENCY__ATTRIBUTES = DEPENDENCY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Executiondependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONDEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONDEPENDENCY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = DEPENDENCY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Target Must Be Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONDEPENDENCY___TARGET_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP = DEPENDENCY___TARGET_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONDEPENDENCY___SOURCE_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP = DEPENDENCY___SOURCE_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Executiondependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIONDEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see modmacao.impl.ModmacaoPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 6;

	/**
	 * The meta object id for the '<em>Port</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see modmacao.impl.ModmacaoPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 7;


	/**
	 * Returns the meta object for class '{@link modmacao.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see modmacao.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the '{@link modmacao.Application#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see modmacao.Application#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link modmacao.Application#OneOrMoreComponents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Or More Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Or More Components</em>' operation.
	 * @see modmacao.Application#OneOrMoreComponents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__OneOrMoreComponents__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link modmacao.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see modmacao.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the '{@link modmacao.Dependency#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see modmacao.Dependency#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDependency__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link modmacao.Dependency#TargetMustBeComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Must Be Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Must Be Component</em>' operation.
	 * @see modmacao.Dependency#TargetMustBeComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDependency__TargetMustBeComponent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link modmacao.Dependency#SourceMustBeComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Component</em>' operation.
	 * @see modmacao.Dependency#SourceMustBeComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDependency__SourceMustBeComponent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link modmacao.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see modmacao.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link modmacao.Component#getModmacaoComponentVersion <em>Modmacao Component Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modmacao Component Version</em>'.
	 * @see modmacao.Component#getModmacaoComponentVersion()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ModmacaoComponentVersion();

	/**
	 * Returns the meta object for the '{@link modmacao.Component#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see modmacao.Component#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComponent__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link modmacao.Component#OnlyOnePlacementLink(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One Placement Link</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One Placement Link</em>' operation.
	 * @see modmacao.Component#OnlyOnePlacementLink(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComponent__OnlyOnePlacementLink__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link modmacao.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see modmacao.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for class '{@link modmacao.Installationdependency <em>Installationdependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installationdependency</em>'.
	 * @see modmacao.Installationdependency
	 * @generated
	 */
	EClass getInstallationdependency();

	/**
	 * Returns the meta object for class '{@link modmacao.Executiondependency <em>Executiondependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executiondependency</em>'.
	 * @see modmacao.Executiondependency
	 * @generated
	 */
	EClass getExecutiondependency();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="minInclusive='0' maxInclusive='65535'"
	 * @generated
	 */
	EDataType getPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModmacaoFactory getModmacaoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modmacao.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modmacao.impl.ApplicationImpl
		 * @see modmacao.impl.ModmacaoPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApplication__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>One Or More Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___ONE_OR_MORE_COMPONENTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApplication__OneOrMoreComponents__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link modmacao.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modmacao.impl.DependencyImpl
		 * @see modmacao.impl.ModmacaoPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPENDENCY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDependency__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Target Must Be Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPENDENCY___TARGET_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDependency__TargetMustBeComponent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPENDENCY___SOURCE_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDependency__SourceMustBeComponent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link modmacao.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modmacao.impl.ComponentImpl
		 * @see modmacao.impl.ModmacaoPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Modmacao Component Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MODMACAO_COMPONENT_VERSION = eINSTANCE.getComponent_ModmacaoComponentVersion();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComponent__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Only One Placement Link</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___ONLY_ONE_PLACEMENT_LINK__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComponent__OnlyOnePlacementLink__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link modmacao.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modmacao.impl.ClusterImpl
		 * @see modmacao.impl.ModmacaoPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '{@link modmacao.impl.InstallationdependencyImpl <em>Installationdependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modmacao.impl.InstallationdependencyImpl
		 * @see modmacao.impl.ModmacaoPackageImpl#getInstallationdependency()
		 * @generated
		 */
		EClass INSTALLATIONDEPENDENCY = eINSTANCE.getInstallationdependency();

		/**
		 * The meta object literal for the '{@link modmacao.impl.ExecutiondependencyImpl <em>Executiondependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modmacao.impl.ExecutiondependencyImpl
		 * @see modmacao.impl.ModmacaoPackageImpl#getExecutiondependency()
		 * @generated
		 */
		EClass EXECUTIONDEPENDENCY = eINSTANCE.getExecutiondependency();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see modmacao.impl.ModmacaoPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em>Port</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see modmacao.impl.ModmacaoPackageImpl#getPort()
		 * @generated
		 */
		EDataType PORT = eINSTANCE.getPort();

	}

} //ModmacaoPackage
