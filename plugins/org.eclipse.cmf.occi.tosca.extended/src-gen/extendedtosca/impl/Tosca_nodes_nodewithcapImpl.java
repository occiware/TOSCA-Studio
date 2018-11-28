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
import extendedtosca.Tosca_capabilities_somecap;
import extendedtosca.Tosca_nodes_nodewithcap;

import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_container;

import org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_rootImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes nodewithcap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_nodewithcapImpl#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_nodewithcapImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_nodewithcapImpl extends Tosca_nodes_rootImpl implements Tosca_nodes_nodewithcap {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "someval";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_nodewithcapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_NODEWITHCAP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__DISK_SIZE:
				return getDiskSize();
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__TYPE:
				return getType();
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
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__DISK_SIZE:
				setDiskSize((Integer)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__TYPE:
				setType((String)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		if (baseClass == Tosca_capabilities_container.class) {
			switch (derivedFeatureID) {
				case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__DISK_SIZE: return ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_somecap.class) {
			switch (derivedFeatureID) {
				case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__TYPE: return ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECAP__TYPE;
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
		if (baseClass == Tosca_capabilities_container.class) {
			switch (baseFeatureID) {
				case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE: return ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__DISK_SIZE;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_somecap.class) {
			switch (baseFeatureID) {
				case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECAP__TYPE: return ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP__TYPE;
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
		result.append(" (diskSize: ");
		result.append(diskSize);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_nodewithcapImpl
