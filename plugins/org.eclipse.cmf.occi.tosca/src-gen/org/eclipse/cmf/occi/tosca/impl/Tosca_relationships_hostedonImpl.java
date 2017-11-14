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

import java.util.Map;

import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca relationships hostedon</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Tosca_relationships_hostedonImpl extends Tosca_relationships_rootImpl implements Tosca_relationships_hostedon {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_relationships_hostedonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCA_RELATIONSHIPS_HOSTEDON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeWebServerAndTargetMustBeWebApplication(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SourceMustBeWebServerAndTargetMustBeWebApplication: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeSoftwareComponentAndTargetMustBeCompute(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SourceMustBeSoftwareComponentAndTargetMustBeCompute: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeDatabaseAndTargetMustBeDBMS(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SourceMustBeDatabaseAndTargetMustBeDBMS: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToscaPackage.TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_WEB_SERVER_AND_TARGET_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeWebServerAndTargetMustBeWebApplication((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ToscaPackage.TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_CONTAINER_APPLICATION_AND_TARGET_MUST_BE_CONTAINER_RUNTIME__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ToscaPackage.TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_SOFTWARE_COMPONENT_AND_TARGET_MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeSoftwareComponentAndTargetMustBeCompute((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ToscaPackage.TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_DATABASE_AND_TARGET_MUST_BE_DBMS__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeDatabaseAndTargetMustBeDBMS((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Tosca_relationships_hostedonImpl
