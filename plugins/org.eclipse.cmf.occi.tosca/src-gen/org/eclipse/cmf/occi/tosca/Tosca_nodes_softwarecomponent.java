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

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tosca nodes softwarecomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getAdminCredential <em>Admin Credential</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getComponentVersion <em>Component Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_softwarecomponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Tosca_nodes_softwarecomponent extends Tosca_nodes_root, MixinBase {
	/**
	 * Returns the value of the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional credential that can be used to authenticate to the software component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admin Credential</em>' containment reference.
	 * @see #setAdminCredential(Credential)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_softwarecomponent_AdminCredential()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_softwarecomponent!adminCredential'"
	 * @generated
	 */
	Credential getAdminCredential();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getAdminCredential <em>Admin Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Credential</em>' containment reference.
	 * @see #getAdminCredential()
	 * @generated
	 */
	void setAdminCredential(Credential value);

	/**
	 * Returns the value of the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional software component’s version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Version</em>' attribute.
	 * @see #setComponentVersion(String)
	 * @see org.eclipse.cmf.occi.tosca.ToscaPackage#getTosca_nodes_softwarecomponent_ComponentVersion()
	 * @model dataType="org.eclipse.cmf.occi.tosca.version"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_nodes_softwarecomponent!componentVersion'"
	 * @generated
	 */
	String getComponentVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getComponentVersion <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Version</em>' attribute.
	 * @see #getComponentVersion()
	 * @generated
	 */
	void setComponentVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Tosca_nodes_softwarecomponent::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Component)\n *       in\n *         \'Tosca_nodes_softwarecomponent::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.tosca.ToscaTables%&gt;.STR_Tosca_nodes_softwarecomponent_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.tosca.ToscaTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Component_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.tosca.ToscaTables%&gt;.CLSSid_Component, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Component_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.tosca.ToscaTables%&gt;.STR_Tosca_nodes_softwarecomponent_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.tosca.ToscaTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tosca_nodes_softwarecomponent
