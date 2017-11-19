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
import extendedtosca.Tosca_interfaces_relationship_configure;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca interfaces relationship configure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Tosca_interfaces_relationship_configureImpl extends Tosca_interfaces_rootImpl implements Tosca_interfaces_relationship_configure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_interfaces_relationship_configureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pre_configure_source() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_relationship_configure!pre_configure_source()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pre_configure_target() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_relationship_configure!pre_configure_target()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void post_configure_source() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_relationship_configure!post_configure_source()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void post_configure_target() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_relationship_configure!post_configure_target()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove_target() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_relationship_configure!remove_target()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add_target() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_relationship_configure!add_target()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add_source() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_relationship_configure!add_source()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void target_changed() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_relationship_configure!target_changed()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_SOURCE:
				pre_configure_source();
				return null;
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_TARGET:
				pre_configure_target();
				return null;
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_SOURCE:
				post_configure_source();
				return null;
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_TARGET:
				post_configure_target();
				return null;
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___REMOVE_TARGET:
				remove_target();
				return null;
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_TARGET:
				add_target();
				return null;
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_SOURCE:
				add_source();
				return null;
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___TARGET_CHANGED:
				target_changed();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Tosca_interfaces_relationship_configureImpl
