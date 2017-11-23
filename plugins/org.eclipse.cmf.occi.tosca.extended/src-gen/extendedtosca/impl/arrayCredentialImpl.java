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
import extendedtosca.arrayCredential;

import java.util.Collection;

import org.eclipse.cmf.occi.tosca.Credential;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>array Credential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.arrayCredentialImpl#getArraycredentialValues <em>Arraycredential Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class arrayCredentialImpl extends EObjectImpl implements arrayCredential {
	/**
	 * The cached value of the '{@link #getArraycredentialValues() <em>Arraycredential Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraycredentialValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Credential> arraycredentialValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected arrayCredentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.ARRAY_CREDENTIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Credential> getArraycredentialValues() {
		if (arraycredentialValues == null) {
			arraycredentialValues = new EObjectContainmentEList<Credential>(Credential.class, this, ExtendedtoscaPackage.ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES);
		}
		return arraycredentialValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES:
				return ((InternalEList<?>)getArraycredentialValues()).basicRemove(otherEnd, msgs);
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
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES:
				return getArraycredentialValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES:
				getArraycredentialValues().clear();
				getArraycredentialValues().addAll((Collection<? extends Credential>)newValue);
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
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES:
				getArraycredentialValues().clear();
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
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL__ARRAYCREDENTIAL_VALUES:
				return arraycredentialValues != null && !arraycredentialValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //arrayCredentialImpl
