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

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes compute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_compute#getPrivateAddress <em>Private Address</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_compute#getPublicAddress <em>Public Address</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_compute#getNetworks <em>Networks</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_compute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Tosca_nodes_compute extends Tosca_nodes_root, Tosca_capabilities_scalable, Tosca_capabilities_endpoint_admin, Tosca_capabilities_operatingsystem, Tosca_capabilities_container, Tosca_capabilities_network_bindable, MixinBase {
	/**
	 * Returns the value of the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primary private IP address assigned by the cloud provider that applications may use to access the Compute node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Address</em>' attribute.
	 * @see #setPrivateAddress(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_compute_PrivateAddress()
	 * @model dataType="extendedtosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_compute!privateAddress'"
	 * @generated
	 */
	String getPrivateAddress();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_compute#getPrivateAddress <em>Private Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Address</em>' attribute.
	 * @see #getPrivateAddress()
	 * @generated
	 */
	void setPrivateAddress(String value);

	/**
	 * Returns the value of the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primary public IP address assigned by the cloud provider that applications may use to access the Compute node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Address</em>' attribute.
	 * @see #setPublicAddress(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_compute_PublicAddress()
	 * @model dataType="extendedtosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_compute!publicAddress'"
	 * @generated
	 */
	String getPublicAddress();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_compute#getPublicAddress <em>Public Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Address</em>' attribute.
	 * @see #getPublicAddress()
	 * @generated
	 */
	void setPublicAddress(String value);

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networks</em>' attribute.
	 * @see #setNetworks(Map)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_compute_Networks()
	 * @model dataType="extendedtosca.map"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_compute!networks'"
	 * @generated
	 */
	Map getNetworks();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_compute#getNetworks <em>Networks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networks</em>' attribute.
	 * @see #getNetworks()
	 * @generated
	 */
	void setNetworks(Map value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv SourceMustBeSoftwareComponent: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean SourceMustBeSoftwareComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Tosca_nodes_compute::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Compute)\n *       in\n *         \'Tosca_nodes_compute::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.STR_Tosca_nodes_compute_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Compute = idResolver.getClass(&lt;%extendedtosca.ExtendedtoscaTables%&gt;.CLSSid_Compute, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Compute).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.STR_Tosca_nodes_compute_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tosca_nodes_compute
