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

import org.eclipse.cmf.occi.tosca.Credential;
import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes softwarecomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_softwarecomponentImpl#getAdminCredential <em>Admin Credential</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_softwarecomponentImpl#getComponentVersion <em>Component Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_softwarecomponentImpl extends Tosca_nodes_rootImpl implements Tosca_nodes_softwarecomponent {
	/**
	 * The cached value of the '{@link #getAdminCredential() <em>Admin Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminCredential()
	 * @generated
	 * @ordered
	 */
	protected Credential adminCredential;

	/**
	 * The default value of the '{@link #getComponentVersion() <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentVersion() <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentVersion()
	 * @generated
	 * @ordered
	 */
	protected String componentVersion = COMPONENT_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_softwarecomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCA_NODES_SOFTWARECOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credential getAdminCredential() {
		return adminCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdminCredential(Credential newAdminCredential, NotificationChain msgs) {
		Credential oldAdminCredential = adminCredential;
		adminCredential = newAdminCredential;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL, oldAdminCredential, newAdminCredential);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminCredential(Credential newAdminCredential) {
		if (newAdminCredential != adminCredential) {
			NotificationChain msgs = null;
			if (adminCredential != null)
				msgs = ((InternalEObject)adminCredential).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL, null, msgs);
			if (newAdminCredential != null)
				msgs = ((InternalEObject)newAdminCredential).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL, null, msgs);
			msgs = basicSetAdminCredential(newAdminCredential, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL, newAdminCredential, newAdminCredential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentVersion() {
		return componentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentVersion(String newComponentVersion) {
		String oldComponentVersion = componentVersion;
		componentVersion = newComponentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION, oldComponentVersion, componentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL:
				return basicSetAdminCredential(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL:
				return getAdminCredential();
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION:
				return getComponentVersion();
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
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL:
				setAdminCredential((Credential)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION:
				setComponentVersion((String)newValue);
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
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL:
				setAdminCredential((Credential)null);
				return;
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION:
				setComponentVersion(COMPONENT_VERSION_EDEFAULT);
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
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL:
				return adminCredential != null;
			case ToscaPackage.TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION:
				return COMPONENT_VERSION_EDEFAULT == null ? componentVersion != null : !COMPONENT_VERSION_EDEFAULT.equals(componentVersion);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (componentVersion: ");
		result.append(componentVersion);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_softwarecomponentImpl
