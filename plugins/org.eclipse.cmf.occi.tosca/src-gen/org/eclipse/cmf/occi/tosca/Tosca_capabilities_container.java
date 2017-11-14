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
 * A representation of the model object '<em><b>Tosca capabilities container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getNumCpus <em>Num Cpus</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getDiskSize <em>Disk Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getMemSize <em>Mem Size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_container()
 * @model
 * @generated
 */
public interface Tosca_capabilities_container extends Tosca_capabilities_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Num Cpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of (actual or virtual) CPUs associated with the Compute node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Cpus</em>' attribute.
	 * @see #setNumCpus(Integer)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_container_NumCpus()
	 * @model dataType="org.eclipse.cmf.occi.tosca.integerMinOne"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_container!numCpus'"
	 * @generated
	 */
	Integer getNumCpus();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getNumCpus <em>Num Cpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cpus</em>' attribute.
	 * @see #getNumCpus()
	 * @generated
	 */
	void setNumCpus(Integer value);

	/**
	 * Returns the value of the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of the local disk available to applications running on the Compute node (default unit is MB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Size</em>' attribute.
	 * @see #setDiskSize(Integer)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_container_DiskSize()
	 * @model dataType="org.eclipse.cmf.occi.tosca.scalarSizeMinZeroMB"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_container!diskSize'"
	 * @generated
	 */
	Integer getDiskSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getDiskSize <em>Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Size</em>' attribute.
	 * @see #getDiskSize()
	 * @generated
	 */
	void setDiskSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the operating frequency of CPU's core.  This property expresses the expected frequency of one (1) CPU as provided by the property â€œnum_cpusâ€?.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #setCpuFrequency(Double)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_container_CpuFrequency()
	 * @model dataType="org.eclipse.cmf.occi.tosca.scalarFrequency"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_container!cpuFrequency'"
	 * @generated
	 */
	Double getCpuFrequency();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getCpuFrequency <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #getCpuFrequency()
	 * @generated
	 */
	void setCpuFrequency(Double value);

	/**
	 * Returns the value of the '<em><b>Mem Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of memory available to applications running on the Compute node (default unit is MB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mem Size</em>' attribute.
	 * @see #setMemSize(Integer)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_capabilities_container_MemSize()
	 * @model dataType="org.eclipse.cmf.occi.tosca.scalarSizeMinZeroMB"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_capabilities_container!memSize'"
	 * @generated
	 */
	Integer getMemSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getMemSize <em>Mem Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Size</em>' attribute.
	 * @see #getMemSize()
	 * @generated
	 */
	void setMemSize(Integer value);

} // Tosca_capabilities_container
