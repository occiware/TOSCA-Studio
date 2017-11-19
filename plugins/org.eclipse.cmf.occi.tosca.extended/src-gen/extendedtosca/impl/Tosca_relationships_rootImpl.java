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
package extendedtosca.impl;

import extendedtosca.ExtendedtoscaPackage;
import extendedtosca.ExtendedtoscaTables;
import extendedtosca.Tosca_relationships_root;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca relationships root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_relationships_rootImpl#getToscaName <em>Tosca Name</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_relationships_rootImpl#getState <em>State</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_relationships_rootImpl#getToscaId <em>Tosca Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_relationships_rootImpl extends MixinBaseImpl implements Tosca_relationships_root {
	/**
	 * The default value of the '{@link #getToscaName() <em>Tosca Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToscaName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOSCA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToscaName() <em>Tosca Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToscaName()
	 * @generated
	 * @ordered
	 */
	protected String toscaName = TOSCA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = "initial";

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToscaId() <em>Tosca Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToscaId()
	 * @generated
	 * @ordered
	 */
	protected static final String TOSCA_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToscaId() <em>Tosca Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToscaId()
	 * @generated
	 * @ordered
	 */
	protected String toscaId = TOSCA_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_relationships_rootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_RELATIONSHIPS_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToscaName() {
		return toscaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToscaName(String newToscaName) {
		String oldToscaName = toscaName;
		toscaName = newToscaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME, oldToscaName, toscaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToscaId() {
		return toscaId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToscaId(String newToscaId) {
		String oldToscaId = toscaId;
		toscaId = newToscaId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID, oldToscaId, toscaId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let
		 *     severity : Integer[1] = 'Tosca_relationships_root::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(occi::Link)
		 *       in
		 *         'Tosca_relationships_root::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ExtendedtoscaTables.STR_Tosca_relationships_root_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ExtendedtoscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Link = idResolver.getClass(ExtendedtoscaTables.CLSSid_Link, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Link).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ExtendedtoscaTables.STR_Tosca_relationships_root_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ExtendedtoscaTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME:
				return getToscaName();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__STATE:
				return getState();
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID:
				return getToscaId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME:
				setToscaName((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__STATE:
				setState((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID:
				setToscaId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME:
				setToscaName(TOSCA_NAME_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID:
				setToscaId(TOSCA_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME:
				return TOSCA_NAME_EDEFAULT == null ? toscaName != null : !TOSCA_NAME_EDEFAULT.equals(toscaName);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID:
				return TOSCA_ID_EDEFAULT == null ? toscaId != null : !TOSCA_ID_EDEFAULT.equals(toscaId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (toscaName: ");
		result.append(toscaName);
		result.append(", state: ");
		result.append(state);
		result.append(", toscaId: ");
		result.append(toscaId);
		result.append(')');
		return result.toString();
	}

} //Tosca_relationships_rootImpl
