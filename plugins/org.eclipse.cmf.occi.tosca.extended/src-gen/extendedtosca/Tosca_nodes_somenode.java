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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes somenode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_somenode#getSomeProp <em>Some Prop</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_somenode()
 * @model
 * @generated
 */
public interface Tosca_nodes_somenode extends Tosca_nodes_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Some Prop</b></em>' attribute.
	 * The default value is <code>"some"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Some Prop</em>' attribute.
	 * @see #setSomeProp(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_somenode_SomeProp()
	 * @model default="some" dataType="extendedtosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_somenode!someProp'"
	 * @generated
	 */
	String getSomeProp();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_somenode#getSomeProp <em>Some Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some Prop</em>' attribute.
	 * @see #getSomeProp()
	 * @generated
	 */
	void setSomeProp(String value);

} // Tosca_nodes_somenode
