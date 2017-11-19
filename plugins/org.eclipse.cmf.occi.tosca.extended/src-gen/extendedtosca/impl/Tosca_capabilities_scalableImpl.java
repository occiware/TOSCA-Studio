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
import extendedtosca.Tosca_capabilities_scalable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca capabilities scalable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_capabilities_scalableImpl#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_capabilities_scalableImpl#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_capabilities_scalableImpl#getDefaultInstances <em>Default Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_capabilities_scalableImpl extends Tosca_capabilities_rootImpl implements Tosca_capabilities_scalable {
	/**
	 * The default value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_INSTANCES_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer minInstances = MIN_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_INSTANCES_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer maxInstances = MAX_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInstances() <em>Default Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_INSTANCES_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getDefaultInstances() <em>Default Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultInstances = DEFAULT_INSTANCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_capabilities_scalableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_SCALABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinInstances() {
		return minInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInstances(Integer newMinInstances) {
		Integer oldMinInstances = minInstances;
		minInstances = newMinInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES, oldMinInstances, minInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxInstances() {
		return maxInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInstances(Integer newMaxInstances) {
		Integer oldMaxInstances = maxInstances;
		maxInstances = newMaxInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES, oldMaxInstances, maxInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDefaultInstances() {
		return defaultInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultInstances(Integer newDefaultInstances) {
		Integer oldDefaultInstances = defaultInstances;
		defaultInstances = newDefaultInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES, oldDefaultInstances, defaultInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES:
				return getMinInstances();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES:
				return getMaxInstances();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES:
				return getDefaultInstances();
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
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES:
				setMinInstances((Integer)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES:
				setMaxInstances((Integer)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES:
				setDefaultInstances((Integer)newValue);
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
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES:
				setMinInstances(MIN_INSTANCES_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES:
				setMaxInstances(MAX_INSTANCES_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES:
				setDefaultInstances(DEFAULT_INSTANCES_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES:
				return MIN_INSTANCES_EDEFAULT == null ? minInstances != null : !MIN_INSTANCES_EDEFAULT.equals(minInstances);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES:
				return MAX_INSTANCES_EDEFAULT == null ? maxInstances != null : !MAX_INSTANCES_EDEFAULT.equals(maxInstances);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES:
				return DEFAULT_INSTANCES_EDEFAULT == null ? defaultInstances != null : !DEFAULT_INSTANCES_EDEFAULT.equals(defaultInstances);
		}
		return super.eIsSet(featureID);
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
		result.append(" (minInstances: ");
		result.append(minInstances);
		result.append(", maxInstances: ");
		result.append(maxInstances);
		result.append(", defaultInstances: ");
		result.append(defaultInstances);
		result.append(')');
		return result.toString();
	}

} //Tosca_capabilities_scalableImpl
