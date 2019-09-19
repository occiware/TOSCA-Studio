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

import org.eclipse.cmf.occi.tosca.Tosca_nodes_root;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes network port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.Tosca_nodes_network_port#getIpRangeEnd <em>Ip Range End</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_port#getIpRangeStart <em>Ip Range Start</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_port#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_port#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link extendedtosca.Tosca_nodes_network_port#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_port()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Tosca_nodes_network_port extends Tosca_nodes_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Ip Range End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Range End</em>' attribute.
	 * @see #setIpRangeEnd(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_port_IpRangeEnd()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_port!ipRangeEnd'"
	 * @generated
	 */
	String getIpRangeEnd();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_port#getIpRangeEnd <em>Ip Range End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Range End</em>' attribute.
	 * @see #getIpRangeEnd()
	 * @generated
	 */
	void setIpRangeEnd(String value);

	/**
	 * Returns the value of the '<em><b>Ip Range Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Range Start</em>' attribute.
	 * @see #setIpRangeStart(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_port_IpRangeStart()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_port!ipRangeStart'"
	 * @generated
	 */
	String getIpRangeStart();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_port#getIpRangeStart <em>Ip Range Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Range Start</em>' attribute.
	 * @see #getIpRangeStart()
	 * @generated
	 */
	void setIpRangeStart(String value);

	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_port_IpAddress()
	 * @model dataType="org.eclipse.cmf.occi.tosca.string"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_port!ipAddress'"
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_port#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_port_IsDefault()
	 * @model default="false" dataType="org.eclipse.cmf.occi.tosca.boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_port!isDefault'"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_port#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(Integer)
	 * @see extendedtosca.ExtendedtoscaPackage#getTosca_nodes_network_port_Order()
	 * @model default="0" dataType="org.eclipse.cmf.occi.tosca.integerMinZero" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/tosca/extended/ecore!Tosca_nodes_network_port!order'"
	 * @generated
	 */
	Integer getOrder();

	/**
	 * Sets the value of the '{@link extendedtosca.Tosca_nodes_network_port#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Tosca_nodes_network_port::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Network)\n *       in\n *         \'Tosca_nodes_network_port::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.STR_Tosca_nodes_network_port_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Network_0 = idResolver.getClass(&lt;%extendedtosca.ExtendedtoscaTables%&gt;.CLSSid_Network, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Network_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.STR_Tosca_nodes_network_port_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%extendedtosca.ExtendedtoscaTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tosca_nodes_network_port
