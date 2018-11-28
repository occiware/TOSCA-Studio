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

import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_container;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_container_runtime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes container runtime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_runtimeImpl#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_runtimeImpl#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_runtimeImpl#getDefaultInstances <em>Default Instances</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_runtimeImpl#getDiskSize <em>Disk Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_container_runtimeImpl extends Tosca_nodes_softwarecomponentImpl implements Tosca_nodes_container_runtime {
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
	 * The default value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskSize() <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSize()
	 * @generated
	 * @ordered
	 */
	protected Integer diskSize = DISK_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_container_runtimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCA_NODES_CONTAINER_RUNTIME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MIN_INSTANCES, oldMinInstances, minInstances));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MAX_INSTANCES, oldMaxInstances, maxInstances));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DEFAULT_INSTANCES, oldDefaultInstances, defaultInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDiskSize() {
		return diskSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskSize(Integer newDiskSize) {
		Integer oldDiskSize = diskSize;
		diskSize = newDiskSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MIN_INSTANCES:
				return getMinInstances();
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MAX_INSTANCES:
				return getMaxInstances();
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DEFAULT_INSTANCES:
				return getDefaultInstances();
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DISK_SIZE:
				return getDiskSize();
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
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MIN_INSTANCES:
				setMinInstances((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MAX_INSTANCES:
				setMaxInstances((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DEFAULT_INSTANCES:
				setDefaultInstances((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DISK_SIZE:
				setDiskSize((Integer)newValue);
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
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MIN_INSTANCES:
				setMinInstances(MIN_INSTANCES_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MAX_INSTANCES:
				setMaxInstances(MAX_INSTANCES_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DEFAULT_INSTANCES:
				setDefaultInstances(DEFAULT_INSTANCES_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
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
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MIN_INSTANCES:
				return MIN_INSTANCES_EDEFAULT == null ? minInstances != null : !MIN_INSTANCES_EDEFAULT.equals(minInstances);
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MAX_INSTANCES:
				return MAX_INSTANCES_EDEFAULT == null ? maxInstances != null : !MAX_INSTANCES_EDEFAULT.equals(maxInstances);
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DEFAULT_INSTANCES:
				return DEFAULT_INSTANCES_EDEFAULT == null ? defaultInstances != null : !DEFAULT_INSTANCES_EDEFAULT.equals(defaultInstances);
			case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Tosca_capabilities_scalable.class) {
			switch (derivedFeatureID) {
				case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MIN_INSTANCES: return ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES;
				case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MAX_INSTANCES: return ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES;
				case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DEFAULT_INSTANCES: return ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_container.class) {
			switch (derivedFeatureID) {
				case ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DISK_SIZE: return ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Tosca_capabilities_scalable.class) {
			switch (baseFeatureID) {
				case ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES: return ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MIN_INSTANCES;
				case ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES: return ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__MAX_INSTANCES;
				case ToscaPackage.TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES: return ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DEFAULT_INSTANCES;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_container.class) {
			switch (baseFeatureID) {
				case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE: return ToscaPackage.TOSCA_NODES_CONTAINER_RUNTIME__DISK_SIZE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minInstances: ");
		result.append(minInstances);
		result.append(", maxInstances: ");
		result.append(maxInstances);
		result.append(", defaultInstances: ");
		result.append(defaultInstances);
		result.append(", diskSize: ");
		result.append(diskSize);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_container_runtimeImpl
