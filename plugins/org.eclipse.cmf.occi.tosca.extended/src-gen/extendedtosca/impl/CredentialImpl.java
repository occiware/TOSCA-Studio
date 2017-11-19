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

import extendedtosca.Credential;
import extendedtosca.ExtendedtoscaPackage;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.CredentialImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link extendedtosca.impl.CredentialImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link extendedtosca.impl.CredentialImpl#getTokentype <em>Tokentype</em>}</li>
 *   <li>{@link extendedtosca.impl.CredentialImpl#getUser <em>User</em>}</li>
 *   <li>{@link extendedtosca.impl.CredentialImpl#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CredentialImpl extends EObjectImpl implements Credential {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeys() <em>Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected static final Map KEYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected Map keys = KEYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokentype() <em>Tokentype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokentype()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKENTYPE_EDEFAULT = "The required token type.";

	/**
	 * The cached value of the '{@link #getTokentype() <em>Tokentype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokentype()
	 * @generated
	 * @ordered
	 */
	protected String tokentype = TOKENTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CredentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.CREDENTIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.CREDENTIAL__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getKeys() {
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeys(Map newKeys) {
		Map oldKeys = keys;
		keys = newKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.CREDENTIAL__KEYS, oldKeys, keys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokentype() {
		return tokentype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokentype(String newTokentype) {
		String oldTokentype = tokentype;
		tokentype = newTokentype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.CREDENTIAL__TOKENTYPE, oldTokentype, tokentype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.CREDENTIAL__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.CREDENTIAL__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.CREDENTIAL__PROTOCOL:
				return getProtocol();
			case ExtendedtoscaPackage.CREDENTIAL__KEYS:
				return getKeys();
			case ExtendedtoscaPackage.CREDENTIAL__TOKENTYPE:
				return getTokentype();
			case ExtendedtoscaPackage.CREDENTIAL__USER:
				return getUser();
			case ExtendedtoscaPackage.CREDENTIAL__TOKEN:
				return getToken();
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
			case ExtendedtoscaPackage.CREDENTIAL__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case ExtendedtoscaPackage.CREDENTIAL__KEYS:
				setKeys((Map)newValue);
				return;
			case ExtendedtoscaPackage.CREDENTIAL__TOKENTYPE:
				setTokentype((String)newValue);
				return;
			case ExtendedtoscaPackage.CREDENTIAL__USER:
				setUser((String)newValue);
				return;
			case ExtendedtoscaPackage.CREDENTIAL__TOKEN:
				setToken((String)newValue);
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
			case ExtendedtoscaPackage.CREDENTIAL__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ExtendedtoscaPackage.CREDENTIAL__KEYS:
				setKeys(KEYS_EDEFAULT);
				return;
			case ExtendedtoscaPackage.CREDENTIAL__TOKENTYPE:
				setTokentype(TOKENTYPE_EDEFAULT);
				return;
			case ExtendedtoscaPackage.CREDENTIAL__USER:
				setUser(USER_EDEFAULT);
				return;
			case ExtendedtoscaPackage.CREDENTIAL__TOKEN:
				setToken(TOKEN_EDEFAULT);
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
			case ExtendedtoscaPackage.CREDENTIAL__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case ExtendedtoscaPackage.CREDENTIAL__KEYS:
				return KEYS_EDEFAULT == null ? keys != null : !KEYS_EDEFAULT.equals(keys);
			case ExtendedtoscaPackage.CREDENTIAL__TOKENTYPE:
				return TOKENTYPE_EDEFAULT == null ? tokentype != null : !TOKENTYPE_EDEFAULT.equals(tokentype);
			case ExtendedtoscaPackage.CREDENTIAL__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case ExtendedtoscaPackage.CREDENTIAL__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", keys: ");
		result.append(keys);
		result.append(", tokentype: ");
		result.append(tokentype);
		result.append(", user: ");
		result.append(user);
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //CredentialImpl
