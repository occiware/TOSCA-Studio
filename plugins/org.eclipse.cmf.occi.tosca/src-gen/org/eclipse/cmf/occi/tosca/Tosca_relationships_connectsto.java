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
package org.eclipse.cmf.occi.tosca;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca relationships connectsto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto#getCredential <em>Credential</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_relationships_connectsto()
 * @model
 * @generated
 */
public interface Tosca_relationships_connectsto extends Tosca_relationships_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The security credential to use to present to the target endpoint to for either authentication or authorization purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credential</em>' containment reference.
	 * @see #setCredential(toscadatatypesCredential)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_relationships_connectsto_Credential()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_relationships_connectsto!credential'"
	 * @generated
	 */
	toscadatatypesCredential getCredential();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto#getCredential <em>Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential</em>' containment reference.
	 * @see #getCredential()
	 * @generated
	 */
	void setCredential(toscadatatypesCredential value);

} // Tosca_relationships_connectsto
