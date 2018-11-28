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
import extendedtosca.Tosca_nodes_computewithattrlist;

import java.util.Map;

import org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes computewithattrlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_nodes_computewithattrlistImpl#getAttrList <em>Attr List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_computewithattrlistImpl extends Tosca_nodes_computeImpl implements Tosca_nodes_computewithattrlist {
	/**
	 * The default value of the '{@link #getAttrList() <em>Attr List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrList()
	 * @generated
	 * @ordered
	 */
	protected static final Map ATTR_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrList() <em>Attr List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrList()
	 * @generated
	 * @ordered
	 */
	protected Map attrList = ATTR_LIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_computewithattrlistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_COMPUTEWITHATTRLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getAttrList() {
		return attrList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrList(Map newAttrList) {
		Map oldAttrList = attrList;
		attrList = newAttrList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST, oldAttrList, attrList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST:
				return getAttrList();
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
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST:
				setAttrList((Map)newValue);
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
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST:
				setAttrList(ATTR_LIST_EDEFAULT);
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
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST__ATTR_LIST:
				return ATTR_LIST_EDEFAULT == null ? attrList != null : !ATTR_LIST_EDEFAULT.equals(attrList);
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
		result.append(" (attrList: ");
		result.append(attrList);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_computewithattrlistImpl
