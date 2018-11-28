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
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca capabilities endpoint public</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_publicImpl#getFloating <em>Floating</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_publicImpl#getDnsName <em>Dns Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_capabilities_endpoint_publicImpl extends Tosca_capabilities_endpointImpl implements Tosca_capabilities_endpoint_public {
	/**
	 * The default value of the '{@link #getFloating() <em>Floating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FLOATING_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getFloating() <em>Floating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating()
	 * @generated
	 * @ordered
	 */
	protected Boolean floating = FLOATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDnsName() <em>Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsName()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDnsName() <em>Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsName()
	 * @generated
	 * @ordered
	 */
	protected String dnsName = DNS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_capabilities_endpoint_publicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFloating() {
		return floating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloating(Boolean newFloating) {
		Boolean oldFloating = floating;
		floating = newFloating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING, oldFloating, floating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDnsName() {
		return dnsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDnsName(String newDnsName) {
		String oldDnsName = dnsName;
		dnsName = newDnsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME, oldDnsName, dnsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING:
				return getFloating();
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME:
				return getDnsName();
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
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING:
				setFloating((Boolean)newValue);
				return;
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME:
				setDnsName((String)newValue);
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
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING:
				setFloating(FLOATING_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME:
				setDnsName(DNS_NAME_EDEFAULT);
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
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING:
				return FLOATING_EDEFAULT == null ? floating != null : !FLOATING_EDEFAULT.equals(floating);
			case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME:
				return DNS_NAME_EDEFAULT == null ? dnsName != null : !DNS_NAME_EDEFAULT.equals(dnsName);
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
		result.append(" (floating: ");
		result.append(floating);
		result.append(", dnsName: ");
		result.append(dnsName);
		result.append(')');
		return result.toString();
	}

} //Tosca_capabilities_endpoint_publicImpl
