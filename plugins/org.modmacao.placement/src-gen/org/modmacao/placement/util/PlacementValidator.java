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
package org.modmacao.placement.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.modmacao.placement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.modmacao.placement.PlacementPackage
 * @generated
 */
public class PlacementValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PlacementValidator INSTANCE = new PlacementValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.modmacao.placement";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Placementlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLACEMENTLINK__SOURCE_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Placementlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLACEMENTLINK__TARGET_CONSTRAINT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PlacementPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PlacementPackage.PLACEMENTLINK:
				return validatePlacementlink((Placementlink)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementlink(Placementlink placementlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(placementlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlacementlink_targetConstraint(placementlink, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlacementlink_sourceConstraint(placementlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Placementlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementlink_sourceConstraint(Placementlink placementlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return placementlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Placementlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementlink_targetConstraint(Placementlink placementlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return placementlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PlacementValidator
