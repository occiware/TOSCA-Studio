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

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.tosca.Tosca_nodes_compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes computewithattrlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_computewithattrlist#getAttrList <em>Attr List</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_computewithattrlist()
 * @model
 * @generated
 */
public interface Tosca_nodes_computewithattrlist extends Tosca_nodes_compute, MixinBase {
	/**
	 * Returns the value of the '<em><b>Attr List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attr List</em>' attribute.
	 * @see #setAttrList(Map)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_computewithattrlist_AttrList()
	 * @model dataType="org.eclipse.cmf.occi.tosca.map"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_computewithattrlist!attrList'"
	 * @generated
	 */
	Map getAttrList();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_computewithattrlist#getAttrList <em>Attr List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr List</em>' attribute.
	 * @see #getAttrList()
	 * @generated
	 */
	void setAttrList(Map value);

} // Tosca_nodes_computewithattrlist
