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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca capabilities container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_containerImpl#getNumCpus <em>Num Cpus</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_containerImpl#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_containerImpl#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_containerImpl#getMemSize <em>Mem Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_capabilities_containerImpl extends Tosca_capabilities_rootImpl implements Tosca_capabilities_container {
	/**
	 * The default value of the '{@link #getNumCpus() <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCpus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_CPUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumCpus() <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCpus()
	 * @generated
	 * @ordered
	 */
	protected Integer numCpus = NUM_CPUS_EDEFAULT;

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
	 * The default value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final Double CPU_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected Double cpuFrequency = CPU_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemSize() <em>Mem Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEM_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemSize() <em>Mem Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemSize()
	 * @generated
	 * @ordered
	 */
	protected Integer memSize = MEM_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_capabilities_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumCpus() {
		return numCpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCpus(Integer newNumCpus) {
		Integer oldNumCpus = numCpus;
		numCpus = newNumCpus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS, oldNumCpus, numCpus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE, oldDiskSize, diskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuFrequency(Double newCpuFrequency) {
		Double oldCpuFrequency = cpuFrequency;
		cpuFrequency = newCpuFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY, oldCpuFrequency, cpuFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMemSize() {
		return memSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemSize(Integer newMemSize) {
		Integer oldMemSize = memSize;
		memSize = newMemSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE, oldMemSize, memSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS:
				return getNumCpus();
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE:
				return getDiskSize();
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY:
				return getCpuFrequency();
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE:
				return getMemSize();
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
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS:
				setNumCpus((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE:
				setDiskSize((Integer)newValue);
				return;
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY:
				setCpuFrequency((Double)newValue);
				return;
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE:
				setMemSize((Integer)newValue);
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
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS:
				setNumCpus(NUM_CPUS_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE:
				setDiskSize(DISK_SIZE_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY:
				setCpuFrequency(CPU_FREQUENCY_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE:
				setMemSize(MEM_SIZE_EDEFAULT);
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
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS:
				return NUM_CPUS_EDEFAULT == null ? numCpus != null : !NUM_CPUS_EDEFAULT.equals(numCpus);
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE:
				return DISK_SIZE_EDEFAULT == null ? diskSize != null : !DISK_SIZE_EDEFAULT.equals(diskSize);
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY:
				return CPU_FREQUENCY_EDEFAULT == null ? cpuFrequency != null : !CPU_FREQUENCY_EDEFAULT.equals(cpuFrequency);
			case ToscaPackage.TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE:
				return MEM_SIZE_EDEFAULT == null ? memSize != null : !MEM_SIZE_EDEFAULT.equals(memSize);
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
		result.append(" (numCpus: ");
		result.append(numCpus);
		result.append(", diskSize: ");
		result.append(diskSize);
		result.append(", cpuFrequency: ");
		result.append(cpuFrequency);
		result.append(", memSize: ");
		result.append(memSize);
		result.append(')');
		return result.toString();
	}

} //Tosca_capabilities_containerImpl
