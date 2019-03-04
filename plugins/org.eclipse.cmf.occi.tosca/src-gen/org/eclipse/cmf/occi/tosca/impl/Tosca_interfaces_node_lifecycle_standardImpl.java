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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca interfaces node lifecycle standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Tosca_interfaces_node_lifecycle_standardImpl extends Tosca_interfaces_rootImpl implements Tosca_interfaces_node_lifecycle_standard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_interfaces_node_lifecycle_standardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_interfaces_node_lifecycle_standard!create()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void configure() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_interfaces_node_lifecycle_standard!configure()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/core/ecore!Tosca_interfaces_node_lifecycle_standard!delete()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CREATE:
				create();
				return null;
			case ToscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CONFIGURE:
				configure();
				return null;
			case ToscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___DELETE:
				delete();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Tosca_interfaces_node_lifecycle_standardImpl
