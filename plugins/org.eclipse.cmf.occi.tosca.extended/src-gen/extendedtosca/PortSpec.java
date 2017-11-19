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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.PortSpec#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link extendedtosca.PortSpec#getTargetrange <em>Targetrange</em>}</li>
 *   <li>{@link extendedtosca.PortSpec#getSourcerange <em>Sourcerange</em>}</li>
 *   <li>{@link extendedtosca.PortSpec#getSource <em>Source</em>}</li>
 *   <li>{@link extendedtosca.PortSpec#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getPortSpec()
 * @model
 * @generated
 */
public interface PortSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link extendedtosca.protocolEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see extendedtosca.protocolEnum
	 * @see #setProtocol(protocolEnum)
	 * @see extendedtosca.ExtendedtoscaPackage#getPortSpec_Protocol()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!PortSpec!protocol'"
	 * @generated
	 */
	protocolEnum getProtocol();

	/**
	 * Sets the value of the '{@link extendedtosca.PortSpec#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see extendedtosca.protocolEnum
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
	 * @see extendedtosca.ExtendedtoscaPackage#getPortSpec_Targetrange()
	 * @model dataType="extendedtosca.range" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!PortSpec!targetrange'"
	 * @generated
	 */
	Short getTargetrange();

	/**
	 * Sets the value of the '{@link extendedtosca.PortSpec#getTargetrange <em>Targetrange</em>}' attribute.
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
	 * @see extendedtosca.ExtendedtoscaPackage#getPortSpec_Sourcerange()
	 * @model dataType="extendedtosca.range" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!PortSpec!sourcerange'"
	 * @generated
	 */
	Short getSourcerange();

	/**
	 * Sets the value of the '{@link extendedtosca.PortSpec#getSourcerange <em>Sourcerange</em>}' attribute.
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
	 * @see extendedtosca.ExtendedtoscaPackage#getPortSpec_Source()
	 * @model dataType="extendedtosca.toscadatatypesnetworkPortDef" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!PortSpec!source'"
	 * @generated
	 */
	Short getSource();

	/**
	 * Sets the value of the '{@link extendedtosca.PortSpec#getSource <em>Source</em>}' attribute.
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
	 * @see extendedtosca.ExtendedtoscaPackage#getPortSpec_Target()
	 * @model dataType="extendedtosca.toscadatatypesnetworkPortDef" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!PortSpec!target'"
	 * @generated
	 */
	Short getTarget();

	/**
	 * Sets the value of the '{@link extendedtosca.PortSpec#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Short value);

} // PortSpec
