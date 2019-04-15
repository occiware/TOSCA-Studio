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
import extendedtosca.Tosca_nodes_mysql;
import extendedtosca.storage_pathEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes mysql</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_mysqlImpl#getStoragePath <em>Storage Path</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_mysqlImpl#getDbUser <em>Db User</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_mysqlImpl#getBindAddress <em>Bind Address</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_mysqlImpl#getDbPassword <em>Db Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_mysqlImpl extends Tosca_nodes_abstractmysqlImpl implements Tosca_nodes_mysql {
	/**
	 * The default value of the '{@link #getStoragePath() <em>Storage Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragePath()
	 * @generated
	 * @ordered
	 */
	protected static final storage_pathEnum STORAGE_PATH_EDEFAULT = storage_pathEnum.MOUNTED_STORAGE;

	/**
	 * The cached value of the '{@link #getStoragePath() <em>Storage Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragePath()
	 * @generated
	 * @ordered
	 */
	protected storage_pathEnum storagePath = STORAGE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbUser() <em>Db User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUser()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_USER_EDEFAULT = "pass";

	/**
	 * The cached value of the '{@link #getDbUser() <em>Db User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUser()
	 * @generated
	 * @ordered
	 */
	protected String dbUser = DB_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindAddress() <em>Bind Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BIND_ADDRESS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getBindAddress() <em>Bind Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindAddress()
	 * @generated
	 * @ordered
	 */
	protected Boolean bindAddress = BIND_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PASSWORD_EDEFAULT = "pass";

	/**
	 * The cached value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected String dbPassword = DB_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_mysqlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_MYSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public storage_pathEnum getStoragePath() {
		return storagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoragePath(storage_pathEnum newStoragePath) {
		storage_pathEnum oldStoragePath = storagePath;
		storagePath = newStoragePath == null ? STORAGE_PATH_EDEFAULT : newStoragePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_MYSQL__STORAGE_PATH, oldStoragePath, storagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbUser() {
		return dbUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbUser(String newDbUser) {
		String oldDbUser = dbUser;
		dbUser = newDbUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_USER, oldDbUser, dbUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBindAddress() {
		return bindAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindAddress(Boolean newBindAddress) {
		Boolean oldBindAddress = bindAddress;
		bindAddress = newBindAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_MYSQL__BIND_ADDRESS, oldBindAddress, bindAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbPassword(String newDbPassword) {
		String oldDbPassword = dbPassword;
		dbPassword = newDbPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_PASSWORD, oldDbPassword, dbPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__STORAGE_PATH:
				return getStoragePath();
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_USER:
				return getDbUser();
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__BIND_ADDRESS:
				return getBindAddress();
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_PASSWORD:
				return getDbPassword();
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
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__STORAGE_PATH:
				setStoragePath((storage_pathEnum)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_USER:
				setDbUser((String)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__BIND_ADDRESS:
				setBindAddress((Boolean)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_PASSWORD:
				setDbPassword((String)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__STORAGE_PATH:
				setStoragePath(STORAGE_PATH_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_USER:
				setDbUser(DB_USER_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__BIND_ADDRESS:
				setBindAddress(BIND_ADDRESS_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_PASSWORD:
				setDbPassword(DB_PASSWORD_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__STORAGE_PATH:
				return storagePath != STORAGE_PATH_EDEFAULT;
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_USER:
				return DB_USER_EDEFAULT == null ? dbUser != null : !DB_USER_EDEFAULT.equals(dbUser);
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__BIND_ADDRESS:
				return BIND_ADDRESS_EDEFAULT == null ? bindAddress != null : !BIND_ADDRESS_EDEFAULT.equals(bindAddress);
			case ExtendedtoscaPackage.TOSCA_NODES_MYSQL__DB_PASSWORD:
				return DB_PASSWORD_EDEFAULT == null ? dbPassword != null : !DB_PASSWORD_EDEFAULT.equals(dbPassword);
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
		result.append(" (storagePath: ");
		result.append(storagePath);
		result.append(", dbUser: ");
		result.append(dbUser);
		result.append(", bindAddress: ");
		result.append(bindAddress);
		result.append(", dbPassword: ");
		result.append(dbPassword);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_mysqlImpl
