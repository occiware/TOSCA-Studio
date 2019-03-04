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

import org.eclipse.cmf.occi.tosca.Tosca_nodes_database;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes databasewithlistparam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_databasewithlistparam#getListProp <em>List Prop</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_databasewithlistparam()
 * @model
 * @generated
 */
public interface Tosca_nodes_databasewithlistparam extends Tosca_nodes_database, MixinBase {
	/**
	 * Returns the value of the '<em><b>List Prop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Prop</em>' containment reference.
	 * @see #setListProp(arrayinteger)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_databasewithlistparam_ListProp()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_databasewithlistparam!listProp'"
	 * @generated
	 */
	arrayinteger getListProp();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_databasewithlistparam#getListProp <em>List Prop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Prop</em>' containment reference.
	 * @see #getListProp()
	 * @generated
	 */
	void setListProp(arrayinteger value);

} // Tosca_nodes_databasewithlistparam
