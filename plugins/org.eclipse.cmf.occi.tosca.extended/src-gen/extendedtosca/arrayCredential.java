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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>array Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.arrayCredential#getArraycredentialValues <em>Arraycredential Values</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getarrayCredential()
 * @model
 * @generated
 */
public interface arrayCredential extends EObject {
	/**
	 * Returns the value of the '<em><b>Arraycredential Values</b></em>' containment reference list.
	 * The list contents are of type {@link extendedtosca.Credential}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arraycredential Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arraycredential Values</em>' containment reference list.
	 * @see extendedtosca.ExtendedtoscaPackage#getarrayCredential_ArraycredentialValues()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!arrayCredential!arraycredentialValues'"
	 * @generated
	 */
	EList<Credential> getArraycredentialValues();

} // arrayCredential
