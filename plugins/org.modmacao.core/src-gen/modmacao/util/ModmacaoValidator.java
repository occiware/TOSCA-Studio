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
package modmacao.util;

import java.util.Map;

import modmacao.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see modmacao.ModmacaoPackage
 * @generated
 */
public class ModmacaoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModmacaoValidator INSTANCE = new ModmacaoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "modmacao";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Or More Components' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__ONE_OR_MORE_COMPONENTS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Dependency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPENDENCY__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Must Be Component' of 'Dependency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPENDENCY__TARGET_MUST_BE_COMPONENT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Component' of 'Dependency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPENDENCY__SOURCE_MUST_BE_COMPONENT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Placement Link' of 'Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT__ONLY_ONE_PLACEMENT_LINK = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModmacaoValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ModmacaoPackage.eINSTANCE;
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
			case ModmacaoPackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case ModmacaoPackage.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case ModmacaoPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case ModmacaoPackage.CLUSTER:
				return validateCluster((Cluster)value, diagnostics, context);
			case ModmacaoPackage.INSTALLATIONDEPENDENCY:
				return validateInstallationdependency((Installationdependency)value, diagnostics, context);
			case ModmacaoPackage.EXECUTIONDEPENDENCY:
				return validateExecutiondependency((Executiondependency)value, diagnostics, context);
			case ModmacaoPackage.VERSION:
				return validateVersion((String)value, diagnostics, context);
			case ModmacaoPackage.PORT:
				return validatePort((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(application, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_OneOrMoreComponents(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_appliesConstraint(application, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OneOrMoreComponents constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_OneOrMoreComponents(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.OneOrMoreComponents(diagnostics, context);
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_appliesConstraint(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_SourceMustBeComponent(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_appliesConstraint(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_TargetMustBeComponent(dependency, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SourceMustBeComponent constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency_SourceMustBeComponent(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dependency.SourceMustBeComponent(diagnostics, context);
	}

	/**
	 * Validates the TargetMustBeComponent constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency_TargetMustBeComponent(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dependency.TargetMustBeComponent(diagnostics, context);
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency_appliesConstraint(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dependency.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_OnlyOnePlacementLink(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_appliesConstraint(component, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OnlyOnePlacementLink constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_OnlyOnePlacementLink(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return component.OnlyOnePlacementLink(diagnostics, context);
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_appliesConstraint(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return component.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cluster, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_OneOrMoreComponents(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_appliesConstraint(cluster, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstallationdependency(Installationdependency installationdependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(installationdependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_SourceMustBeComponent(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_appliesConstraint(installationdependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_TargetMustBeComponent(installationdependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutiondependency(Executiondependency executiondependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executiondependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_SourceMustBeComponent(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_appliesConstraint(executiondependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateDependency_TargetMustBeComponent(executiondependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Integer port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePort_Min(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_Max(port, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePort_Min
	 */
	public static final Integer PORT__MIN__VALUE = new Integer(0);

	/**
	 * Validates the Min constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_Min(Integer port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = port.compareTo(PORT__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(ModmacaoPackage.Literals.PORT, port, PORT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePort_Max
	 */
	public static final Integer PORT__MAX__VALUE = new Integer(65535);

	/**
	 * Validates the Max constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_Max(Integer port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = port.compareTo(PORT__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(ModmacaoPackage.Literals.PORT, port, PORT__MAX__VALUE, true, diagnostics, context);
		return result;
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

} //ModmacaoValidator
