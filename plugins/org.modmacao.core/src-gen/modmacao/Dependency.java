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
package modmacao;

import java.util.Map;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see modmacao.ModmacaoPackage#getDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SourceMustBeComponent'"
 * @generated
 */
public interface Dependency extends MixinBase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Dependency::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Componentlink)\n *       in\n *         \'Dependency::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%modmacao.ModmacaoTables%&gt;.STR_Dependency_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Componentlink = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Componentlink, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Componentlink).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%modmacao.ModmacaoTables%&gt;.STR_Dependency_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv TargetMustBeComponent:\n *   let\n *     severity : Integer[1] = \'Dependency::TargetMustBeComponent\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Link)\n *         .target.oclIsTypeOf(platform::Component)\n *       in\n *         \'Dependency::TargetMustBeComponent\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%modmacao.ModmacaoTables%&gt;.STR_Dependency_c_c_TargetMustBeComponent);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Link_0 = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Link, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Component_0 = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Component, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Link%&gt; oclAsType = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Link%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Link_0));\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Resource%&gt; target = oclAsType.getTarget();\n\t\tfinal /*@Thrown\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, target, TYP_platform_c_c_Component_0).booleanValue();\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%modmacao.ModmacaoTables%&gt;.STR_Dependency_c_c_TargetMustBeComponent, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean TargetMustBeComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SourceMustBeComponent:\n *   let\n *     severity : Integer[1] = \'Dependency::SourceMustBeComponent\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Link)\n *         .source.oclIsTypeOf(platform::Component)\n *       in\n *         \'Dependency::SourceMustBeComponent\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%modmacao.ModmacaoTables%&gt;.STR_Dependency_c_c_SourceMustBeComponent);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Link = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Link, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Component_0 = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Component, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Link%&gt; oclAsType = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Link%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Link));\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Resource%&gt; source = oclAsType.getSource();\n\t\tfinal /*@Thrown\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, source, TYP_platform_c_c_Component_0).booleanValue();\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%modmacao.ModmacaoTables%&gt;.STR_Dependency_c_c_SourceMustBeComponent, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean SourceMustBeComponent(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Dependency
