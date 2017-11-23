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
import extendedtosca.Tosca_nodes_databasewithlistparam;
import extendedtosca.arrayinteger;

import org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_databaseImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes databasewithlistparam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_databasewithlistparamImpl#getListProp <em>List Prop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_databasewithlistparamImpl extends Tosca_nodes_databaseImpl implements Tosca_nodes_databasewithlistparam {
	/**
	 * The cached value of the '{@link #getListProp() <em>List Prop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListProp()
	 * @generated
	 * @ordered
	 */
	protected arrayinteger listProp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_databasewithlistparamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_DATABASEWITHLISTPARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayinteger getListProp() {
		return listProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListProp(arrayinteger newListProp, NotificationChain msgs) {
		arrayinteger oldListProp = listProp;
		listProp = newListProp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP, oldListProp, newListProp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListProp(arrayinteger newListProp) {
		if (newListProp != listProp) {
			NotificationChain msgs = null;
			if (listProp != null)
				msgs = ((InternalEObject)listProp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP, null, msgs);
			if (newListProp != null)
				msgs = ((InternalEObject)newListProp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP, null, msgs);
			msgs = basicSetListProp(newListProp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP, newListProp, newListProp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP:
				return basicSetListProp(null, msgs);
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
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP:
				return getListProp();
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
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP:
				setListProp((arrayinteger)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP:
				setListProp((arrayinteger)null);
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
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM__LIST_PROP:
				return listProp != null;
		}
		return super.eIsSet(featureID);
	}

} //Tosca_nodes_databasewithlistparamImpl
