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
import extendedtosca.Tosca_nodes_webapplication_wordpress;

import org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webapplicationImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes webapplication wordpress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webapplication_wordpressImpl#getDbHost <em>Db Host</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webapplication_wordpressImpl#getAdminPassword <em>Admin Password</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webapplication_wordpressImpl#getAdminUser <em>Admin User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_webapplication_wordpressImpl extends Tosca_nodes_webapplicationImpl implements Tosca_nodes_webapplication_wordpress {
	/**
	 * The default value of the '{@link #getDbHost() <em>Db Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbHost()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbHost() <em>Db Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbHost()
	 * @generated
	 * @ordered
	 */
	protected String dbHost = DB_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminPassword() <em>Admin Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminPassword() <em>Admin Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminPassword()
	 * @generated
	 * @ordered
	 */
	protected String adminPassword = ADMIN_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminUser() <em>Admin User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUser()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminUser() <em>Admin User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUser()
	 * @generated
	 * @ordered
	 */
	protected String adminUser = ADMIN_USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_webapplication_wordpressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_WEBAPPLICATION_WORDPRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbHost() {
		return dbHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbHost(String newDbHost) {
		String oldDbHost = dbHost;
		dbHost = newDbHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__DB_HOST, oldDbHost, dbHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdminPassword() {
		return adminPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminPassword(String newAdminPassword) {
		String oldAdminPassword = adminPassword;
		adminPassword = newAdminPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_PASSWORD, oldAdminPassword, adminPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdminUser() {
		return adminUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminUser(String newAdminUser) {
		String oldAdminUser = adminUser;
		adminUser = newAdminUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_USER, oldAdminUser, adminUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__DB_HOST:
				return getDbHost();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_PASSWORD:
				return getAdminPassword();
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_USER:
				return getAdminUser();
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__DB_HOST:
				setDbHost((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_PASSWORD:
				setAdminPassword((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_USER:
				setAdminUser((String)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__DB_HOST:
				setDbHost(DB_HOST_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_PASSWORD:
				setAdminPassword(ADMIN_PASSWORD_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_USER:
				setAdminUser(ADMIN_USER_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__DB_HOST:
				return DB_HOST_EDEFAULT == null ? dbHost != null : !DB_HOST_EDEFAULT.equals(dbHost);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_PASSWORD:
				return ADMIN_PASSWORD_EDEFAULT == null ? adminPassword != null : !ADMIN_PASSWORD_EDEFAULT.equals(adminPassword);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS__ADMIN_USER:
				return ADMIN_USER_EDEFAULT == null ? adminUser != null : !ADMIN_USER_EDEFAULT.equals(adminUser);
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
		result.append(" (dbHost: ");
		result.append(dbHost);
		result.append(", adminPassword: ");
		result.append(adminPassword);
		result.append(", adminUser: ");
		result.append(adminUser);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_webapplication_wordpressImpl
