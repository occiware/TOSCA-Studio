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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modmacao.Component#getModmacaoComponentVersion <em>Modmacao Component Version</em>}</li>
 * </ul>
 *
 * @see modmacao.ModmacaoPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyOnePlacementLink'"
 * @generated
 */
public interface Component extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Modmacao Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modmacao Component Version</em>' attribute.
	 * @see #setModmacaoComponentVersion(String)
	 * @see modmacao.ModmacaoPackage#getComponent_ModmacaoComponentVersion()
	 * @model dataType="modmacao.Version"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/modmacao/ecore!Component!modmacaoComponentVersion'"
	 * @generated
	 */
	String getModmacaoComponentVersion();

	/**
	 * Sets the value of the '{@link modmacao.Component#getModmacaoComponentVersion <em>Modmacao Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modmacao Component Version</em>' attribute.
	 * @see #getModmacaoComponentVersion()
	 * @generated
	 */
	void setModmacaoComponentVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Component::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Component)\n *       in\n *         \'Component::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%modmacao.ModmacaoTables%&gt;.STR_Component_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Component_0 = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Component, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Component_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%modmacao.ModmacaoTables%&gt;.STR_Component_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv OnlyOnePlacementLink:\n *   let severity : Integer[1] = \'Component::OnlyOnePlacementLink\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)\n *         .links-&gt;select(l |\n *           l.oclIsTypeOf(placement::Placementlink))\n *         -&gt;size() = 1\n *       in\n *         \'Component::OnlyOnePlacementLink\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%modmacao.ModmacaoTables%&gt;.STR_Component_c_c_OnlyOnePlacementLink);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Resource_0 = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Resource, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Resource%&gt; oclAsType = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Resource%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource_0));\n\t\tfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.Link%&gt;&gt; links = oclAsType.getLinks();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_links = idResolver.createOrderedSetOfAll(&lt;%modmacao.ModmacaoTables%&gt;.ORD_CLSSid_Link, links);\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createOrderedSetAccumulatorValue(&lt;%modmacao.ModmacaoTables%&gt;.ORD_CLSSid_Link);\n\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_l = BOXED_links.iterator();\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; select;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_l.hasNext()) {\n\t\t\t\tselect = accumulator;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Link%&gt; l = (&lt;%org.eclipse.cmf.occi.core.Link%&gt;)ITERATOR_l.next();\n\t\t\t/**\n\t\t\t * l.oclIsTypeOf(placement::Placementlink)\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_placement_c_c_Placementlink = idResolver.getClass(&lt;%modmacao.ModmacaoTables%&gt;.CLSSid_Placementlink, null);\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, l, TYP_placement_c_c_Placementlink).booleanValue();\n\t\t\t//\n\t\t\tif (oclIsTypeOf == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\taccumulator.add(l);\n\t\t\t}\n\t\t}\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(select);\n\t\tfinal /*@Thrown\052/ boolean result = size.equals(&lt;%modmacao.ModmacaoTables%&gt;.INT_1);\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%modmacao.ModmacaoTables%&gt;.STR_Component_c_c_OnlyOnePlacementLink, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%modmacao.ModmacaoTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean OnlyOnePlacementLink(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Component
