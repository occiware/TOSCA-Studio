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
import org.eclipse.cmf.occi.tosca.arrayString;
import org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>toscadatatypesnetwork Network Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkNetworkInfoImpl#getNetworkid <em>Networkid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkNetworkInfoImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkNetworkInfoImpl#getNetworkname <em>Networkname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class toscadatatypesnetworkNetworkInfoImpl extends EObjectImpl implements toscadatatypesnetworkNetworkInfo {
	/**
	 * The default value of the '{@link #getNetworkid() <em>Networkid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkid()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORKID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkid() <em>Networkid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkid()
	 * @generated
	 * @ordered
	 */
	protected String networkid = NETWORKID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected arrayString addresses;

	/**
	 * The default value of the '{@link #getNetworkname() <em>Networkname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkname()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORKNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkname() <em>Networkname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkname()
	 * @generated
	 * @ordered
	 */
	protected String networkname = NETWORKNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected toscadatatypesnetworkNetworkInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCADATATYPESNETWORK_NETWORK_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkid() {
		return networkid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkid(String newNetworkid) {
		String oldNetworkid = networkid;
		networkid = newNetworkid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKID, oldNetworkid, networkid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayString getAddresses() {
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddresses(arrayString newAddresses, NotificationChain msgs) {
		arrayString oldAddresses = addresses;
		addresses = newAddresses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES, oldAddresses, newAddresses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddresses(arrayString newAddresses) {
		if (newAddresses != addresses) {
			NotificationChain msgs = null;
			if (addresses != null)
				msgs = ((InternalEObject)addresses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES, null, msgs);
			if (newAddresses != null)
				msgs = ((InternalEObject)newAddresses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES, null, msgs);
			msgs = basicSetAddresses(newAddresses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES, newAddresses, newAddresses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkname() {
		return networkname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkname(String newNetworkname) {
		String oldNetworkname = networkname;
		networkname = newNetworkname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKNAME, oldNetworkname, networkname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES:
				return basicSetAddresses(null, msgs);
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
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKID:
				return getNetworkid();
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES:
				return getAddresses();
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKNAME:
				return getNetworkname();
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
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKID:
				setNetworkid((String)newValue);
				return;
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES:
				setAddresses((arrayString)newValue);
				return;
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKNAME:
				setNetworkname((String)newValue);
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
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKID:
				setNetworkid(NETWORKID_EDEFAULT);
				return;
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES:
				setAddresses((arrayString)null);
				return;
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKNAME:
				setNetworkname(NETWORKNAME_EDEFAULT);
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
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKID:
				return NETWORKID_EDEFAULT == null ? networkid != null : !NETWORKID_EDEFAULT.equals(networkid);
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES:
				return addresses != null;
			case ToscaPackage.TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKNAME:
				return NETWORKNAME_EDEFAULT == null ? networkname != null : !NETWORKNAME_EDEFAULT.equals(networkname);
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
		result.append(" (networkid: ");
		result.append(networkid);
		result.append(", networkname: ");
		result.append(networkname);
		result.append(')');
		return result.toString();
	}

} //toscadatatypesnetworkNetworkInfoImpl
