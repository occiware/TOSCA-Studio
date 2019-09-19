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
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see modmacao.ModmacaoPackage#getApplication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneOrMoreComponents'"
 * @generated
 */
public interface Application extends MixinBase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Application::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Application)\n *       in\n *         \'Application::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%modmacao.ModmacaoTables%&gt;.STR_Application_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Application = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Application_0, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Application).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%modmacao.ModmacaoTables%&gt;.STR_Application_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv OneOrMoreComponents:\n *   let severity : Integer[1] = \'Application::OneOrMoreComponents\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)\n *         .links-&gt;collect(l | l.target)\n *         -&gt;select(rs | rs.oclIsTypeOf(platform::Component))\n *         -&gt;size() &gt;= 1\n *       in\n *         \'Application::OneOrMoreComponents\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%modmacao.ModmacaoTables%&gt;.STR_Application_c_c_OneOrMoreComponents);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Resource = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Resource, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Resource%&gt; oclAsType = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Resource%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource));\n\t\tfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.Link%&gt;&gt; links = oclAsType.getLinks();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_links = idResolver.createOrderedSetOfAll(&lt;%modmacao.ModmacaoTables%&gt;.ORD_CLSSid_Link, links);\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%modmacao.ModmacaoTables%&gt;.SEQ_CLSSid_Resource);\n\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_l = BOXED_links.iterator();\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; collect;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_l.hasNext()) {\n\t\t\t\tcollect = accumulator;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Link%&gt; l = (&lt;%org.eclipse.cmf.occi.core.Link%&gt;)ITERATOR_l.next();\n\t\t\t/**\n\t\t\t * l.target\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Resource%&gt; target = l.getTarget();\n\t\t\t//\n\t\t\taccumulator.add(target);\n\t\t}\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%modmacao.ModmacaoTables%&gt;.SEQ_CLSSid_Resource);\n\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_rs = collect.iterator();\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; select;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_rs.hasNext()) {\n\t\t\t\tselect = accumulator_0;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Resource%&gt; rs = (&lt;%org.eclipse.cmf.occi.core.Resource%&gt;)ITERATOR_rs.next();\n\t\t\t/**\n\t\t\t * rs.oclIsTypeOf(platform::Component)\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Component = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Component, null);\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, rs, TYP_platform_c_c_Component).booleanValue();\n\t\t\t//\n\t\t\tif (oclIsTypeOf == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\taccumulator_0.add(rs);\n\t\t\t}\n\t\t}\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(select);\n\t\tfinal /*@Thrown\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%modmacao.ModmacaoTables%&gt;.INT_1).booleanValue();\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%modmacao.ModmacaoTables%&gt;.STR_Application_c_c_OneOrMoreComponents, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean OneOrMoreComponents(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Application