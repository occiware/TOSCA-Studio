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
 * A representation of the model object '<em><b>Tosca capabilities scalable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getDefaultInstances <em>Default Instances</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_scalable()
 * @model
 * @generated
 */
public interface Tosca_capabilities_scalable extends Tosca_capabilities_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Min Instances</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used to indicate the minimum number of instances that should be created for the associated TOSCA Node Template by a TOSCA orchestrator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Instances</em>' attribute.
	 * @see #setMinInstances(Integer)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_scalable_MinInstances()
	 * @model default="1" dataType="org.eclipse.cmf.occi.tosca.integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_scalable!minInstances'"
	 * @generated
	 */
	Integer getMinInstances();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getMinInstances <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Instances</em>' attribute.
	 * @see #getMinInstances()
	 * @generated
	 */
	void setMinInstances(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Instances</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used to indicate the maximum number of instances that should be created for the associated TOSCA Node Template by a TOSCA orchestrator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Instances</em>' attribute.
	 * @see #setMaxInstances(Integer)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_scalable_MaxInstances()
	 * @model default="1" dataType="org.eclipse.cmf.occi.tosca.integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_scalable!maxInstances'"
	 * @generated
	 */
	Integer getMaxInstances();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getMaxInstances <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instances</em>' attribute.
	 * @see #getMaxInstances()
	 * @generated
	 */
	void setMaxInstances(Integer value);

	/**
	 * Returns the value of the '<em><b>Default Instances</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional property that indicates the requested default number of instances that should be the starting number of instances a TOSCA orchestrator should attempt to allocate. Note: The value for this property MUST be in the range between the values set for ‘min_instances’ and ‘max_instances’ properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Instances</em>' attribute.
	 * @see #setDefaultInstances(Integer)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_scalable_DefaultInstances()
	 * @model default="1" dataType="org.eclipse.cmf.occi.tosca.integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_scalable!defaultInstances'"
	 * @generated
	 */
	Integer getDefaultInstances();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getDefaultInstances <em>Default Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Instances</em>' attribute.
	 * @see #getDefaultInstances()
	 * @generated
	 */
	void setDefaultInstances(Integer value);

} // Tosca_capabilities_scalable
