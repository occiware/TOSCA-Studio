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
package extendedtosca;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.tosca.Tosca_capabilities_container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca capabilities somecap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_capabilities_somecap#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_capabilities_somecap()
 * @model
 * @generated
 */
public interface Tosca_capabilities_somecap extends Tosca_capabilities_container, MixinBase {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"someval"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_capabilities_somecap_Type()
	 * @model default="someval" dataType="org.eclipse.cmf.occi.tosca.string" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/extendedTosca/ecore!Tosca_capabilities_somecap!type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_capabilities_somecap#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Tosca_capabilities_somecap
