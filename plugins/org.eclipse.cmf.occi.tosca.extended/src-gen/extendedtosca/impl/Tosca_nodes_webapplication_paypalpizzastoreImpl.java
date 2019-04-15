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
import extendedtosca.Tosca_nodes_webapplication_paypalpizzastore;

import org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webapplicationImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes webapplication paypalpizzastore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_webapplication_paypalpizzastoreImpl#getGithubUrl <em>Github Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_webapplication_paypalpizzastoreImpl extends Tosca_nodes_webapplicationImpl implements Tosca_nodes_webapplication_paypalpizzastore {
	/**
	 * The default value of the '{@link #getGithubUrl() <em>Github Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGithubUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String GITHUB_URL_EDEFAULT = "https:github.comsample.git";

	/**
	 * The cached value of the '{@link #getGithubUrl() <em>Github Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGithubUrl()
	 * @generated
	 * @ordered
	 */
	protected String githubUrl = GITHUB_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_webapplication_paypalpizzastoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGithubUrl() {
		return githubUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGithubUrl(String newGithubUrl) {
		String oldGithubUrl = githubUrl;
		githubUrl = newGithubUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL, oldGithubUrl, githubUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL:
				return getGithubUrl();
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL:
				setGithubUrl((String)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL:
				setGithubUrl(GITHUB_URL_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE__GITHUB_URL:
				return GITHUB_URL_EDEFAULT == null ? githubUrl != null : !GITHUB_URL_EDEFAULT.equals(githubUrl);
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
		result.append(" (githubUrl: ");
		result.append(githubUrl);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_webapplication_paypalpizzastoreImpl
