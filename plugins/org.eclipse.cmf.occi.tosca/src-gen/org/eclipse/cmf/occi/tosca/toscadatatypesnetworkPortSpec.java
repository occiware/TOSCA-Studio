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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>toscadatatypesnetwork Port Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getTargetrange <em>Targetrange</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getSourcerange <em>Sourcerange</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#gettoscadatatypesnetworkPortSpec()
 * @model
 * @generated
 */
public interface toscadatatypesnetworkPortSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.tosca.protocolEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see org.eclipse.cmf.occi.tosca.protocolEnum
	 * @see #setProtocol(protocolEnum)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#gettoscadatatypesnetworkPortSpec_Protocol()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!toscadatatypesnetworkPortSpec!protocol'"
	 * @generated
	 */
	protocolEnum getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see org.eclipse.cmf.occi.tosca.protocolEnum
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(protocolEnum value);

	/**
	 * Returns the value of the '<em><b>Targetrange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Targetrange</em>' attribute.
	 * @see #setTargetrange(Short)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#gettoscadatatypesnetworkPortSpec_Targetrange()
	 * @model dataType="org.eclipse.cmf.occi.tosca.range" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!toscadatatypesnetworkPortSpec!targetrange'"
	 * @generated
	 */
	Short getTargetrange();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getTargetrange <em>Targetrange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetrange</em>' attribute.
	 * @see #getTargetrange()
	 * @generated
	 */
	void setTargetrange(Short value);

	/**
	 * Returns the value of the '<em><b>Sourcerange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sourcerange</em>' attribute.
	 * @see #setSourcerange(Short)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#gettoscadatatypesnetworkPortSpec_Sourcerange()
	 * @model dataType="org.eclipse.cmf.occi.tosca.range" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!toscadatatypesnetworkPortSpec!sourcerange'"
	 * @generated
	 */
	Short getSourcerange();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getSourcerange <em>Sourcerange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcerange</em>' attribute.
	 * @see #getSourcerange()
	 * @generated
	 */
	void setSourcerange(Short value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(Short)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#gettoscadatatypesnetworkPortSpec_Source()
	 * @model dataType="org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortDef" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!toscadatatypesnetworkPortSpec!source'"
	 * @generated
	 */
	Short getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Short value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(Short)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#gettoscadatatypesnetworkPortSpec_Target()
	 * @model dataType="org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortDef" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!toscadatatypesnetworkPortSpec!target'"
	 * @generated
	 */
	Short getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Short value);

} // toscadatatypesnetworkPortSpec
