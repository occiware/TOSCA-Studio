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
import extendedtosca.PortInfo;
import extendedtosca.arraystring;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.PortInfoImpl#getPortname <em>Portname</em>}</li>
 *   <li>{@link extendedtosca.impl.PortInfoImpl#getNetworkid <em>Networkid</em>}</li>
 *   <li>{@link extendedtosca.impl.PortInfoImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link extendedtosca.impl.PortInfoImpl#getMacaddress <em>Macaddress</em>}</li>
 *   <li>{@link extendedtosca.impl.PortInfoImpl#getPortid <em>Portid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortInfoImpl extends EObjectImpl implements PortInfo {
	/**
	 * The default value of the '{@link #getPortname() <em>Portname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortname()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortname() <em>Portname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortname()
	 * @generated
	 * @ordered
	 */
	protected String portname = PORTNAME_EDEFAULT;

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
	protected arraystring addresses;

	/**
	 * The default value of the '{@link #getMacaddress() <em>Macaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacaddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MACADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacaddress() <em>Macaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacaddress()
	 * @generated
	 * @ordered
	 */
	protected String macaddress = MACADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortid() <em>Portid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortid()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortid() <em>Portid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortid()
	 * @generated
	 * @ordered
	 */
	protected String portid = PORTID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.PORT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortname() {
		return portname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortname(String newPortname) {
		String oldPortname = portname;
		portname = newPortname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_INFO__PORTNAME, oldPortname, portname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_INFO__NETWORKID, oldNetworkid, networkid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arraystring getAddresses() {
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddresses(arraystring newAddresses, NotificationChain msgs) {
		arraystring oldAddresses = addresses;
		addresses = newAddresses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_INFO__ADDRESSES, oldAddresses, newAddresses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddresses(arraystring newAddresses) {
		if (newAddresses != addresses) {
			NotificationChain msgs = null;
			if (addresses != null)
				msgs = ((InternalEObject)addresses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.PORT_INFO__ADDRESSES, null, msgs);
			if (newAddresses != null)
				msgs = ((InternalEObject)newAddresses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.PORT_INFO__ADDRESSES, null, msgs);
			msgs = basicSetAddresses(newAddresses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_INFO__ADDRESSES, newAddresses, newAddresses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMacaddress() {
		return macaddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacaddress(String newMacaddress) {
		String oldMacaddress = macaddress;
		macaddress = newMacaddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_INFO__MACADDRESS, oldMacaddress, macaddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortid() {
		return portid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortid(String newPortid) {
		String oldPortid = portid;
		portid = newPortid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_INFO__PORTID, oldPortid, portid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtendedtoscaPackage.PORT_INFO__ADDRESSES:
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
			case ExtendedtoscaPackage.PORT_INFO__PORTNAME:
				return getPortname();
			case ExtendedtoscaPackage.PORT_INFO__NETWORKID:
				return getNetworkid();
			case ExtendedtoscaPackage.PORT_INFO__ADDRESSES:
				return getAddresses();
			case ExtendedtoscaPackage.PORT_INFO__MACADDRESS:
				return getMacaddress();
			case ExtendedtoscaPackage.PORT_INFO__PORTID:
				return getPortid();
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
			case ExtendedtoscaPackage.PORT_INFO__PORTNAME:
				setPortname((String)newValue);
				return;
			case ExtendedtoscaPackage.PORT_INFO__NETWORKID:
				setNetworkid((String)newValue);
				return;
			case ExtendedtoscaPackage.PORT_INFO__ADDRESSES:
				setAddresses((arraystring)newValue);
				return;
			case ExtendedtoscaPackage.PORT_INFO__MACADDRESS:
				setMacaddress((String)newValue);
				return;
			case ExtendedtoscaPackage.PORT_INFO__PORTID:
				setPortid((String)newValue);
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
			case ExtendedtoscaPackage.PORT_INFO__PORTNAME:
				setPortname(PORTNAME_EDEFAULT);
				return;
			case ExtendedtoscaPackage.PORT_INFO__NETWORKID:
				setNetworkid(NETWORKID_EDEFAULT);
				return;
			case ExtendedtoscaPackage.PORT_INFO__ADDRESSES:
				setAddresses((arraystring)null);
				return;
			case ExtendedtoscaPackage.PORT_INFO__MACADDRESS:
				setMacaddress(MACADDRESS_EDEFAULT);
				return;
			case ExtendedtoscaPackage.PORT_INFO__PORTID:
				setPortid(PORTID_EDEFAULT);
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
			case ExtendedtoscaPackage.PORT_INFO__PORTNAME:
				return PORTNAME_EDEFAULT == null ? portname != null : !PORTNAME_EDEFAULT.equals(portname);
			case ExtendedtoscaPackage.PORT_INFO__NETWORKID:
				return NETWORKID_EDEFAULT == null ? networkid != null : !NETWORKID_EDEFAULT.equals(networkid);
			case ExtendedtoscaPackage.PORT_INFO__ADDRESSES:
				return addresses != null;
			case ExtendedtoscaPackage.PORT_INFO__MACADDRESS:
				return MACADDRESS_EDEFAULT == null ? macaddress != null : !MACADDRESS_EDEFAULT.equals(macaddress);
			case ExtendedtoscaPackage.PORT_INFO__PORTID:
				return PORTID_EDEFAULT == null ? portid != null : !PORTID_EDEFAULT.equals(portid);
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
		result.append(" (portname: ");
		result.append(portname);
		result.append(", networkid: ");
		result.append(networkid);
		result.append(", macaddress: ");
		result.append(macaddress);
		result.append(", portid: ");
		result.append(portid);
		result.append(')');
		return result.toString();
	}

} //PortInfoImpl
