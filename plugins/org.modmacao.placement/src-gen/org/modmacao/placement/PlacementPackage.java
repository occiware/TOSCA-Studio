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
package org.modmacao.placement;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.modmacao.placement.PlacementFactory
 * @model kind="package"
 * @generated
 */
public interface PlacementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "placement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.modmacao.org/placement/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "placement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlacementPackage eINSTANCE = org.modmacao.placement.impl.PlacementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modmacao.placement.impl.PlacementlinkImpl <em>Placementlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modmacao.placement.impl.PlacementlinkImpl
	 * @see org.modmacao.placement.impl.PlacementPackageImpl#getPlacementlink()
	 * @generated
	 */
	int PLACEMENTLINK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Placementlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Source Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Placementlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENTLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.modmacao.placement.Placementlink <em>Placementlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placementlink</em>'.
	 * @see org.modmacao.placement.Placementlink
	 * @generated
	 */
	EClass getPlacementlink();

	/**
	 * Returns the meta object for the '{@link org.modmacao.placement.Placementlink#sourceConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Constraint</em>' operation.
	 * @see org.modmacao.placement.Placementlink#sourceConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPlacementlink__SourceConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.modmacao.placement.Placementlink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.modmacao.placement.Placementlink#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPlacementlink__TargetConstraint__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlacementFactory getPlacementFactory();

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
		 * The meta object literal for the '{@link org.modmacao.placement.impl.PlacementlinkImpl <em>Placementlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modmacao.placement.impl.PlacementlinkImpl
		 * @see org.modmacao.placement.impl.PlacementPackageImpl#getPlacementlink()
		 * @generated
		 */
		EClass PLACEMENTLINK = eINSTANCE.getPlacementlink();
		/**
		 * The meta object literal for the '<em><b>Source Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACEMENTLINK___SOURCE_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPlacementlink__SourceConstraint__DiagnosticChain_Map();
		/**
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACEMENTLINK___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPlacementlink__TargetConstraint__DiagnosticChain_Map();

	}

} //PlacementPackage
