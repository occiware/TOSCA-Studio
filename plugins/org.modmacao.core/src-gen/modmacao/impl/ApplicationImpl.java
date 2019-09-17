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
package modmacao.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import modmacao.Application;
import modmacao.ModmacaoPackage;

import modmacao.ModmacaoTables;
import modmacao.util.ModmacaoValidator;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApplicationImpl extends MixinBaseImpl implements Application {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModmacaoPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Application::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Application)
		 *       in
		 *         'Application::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModmacaoTables.STR_Application_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModmacaoTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Application = idResolver.getClass(ModmacaoTables.CLSSid_Application_0, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Application).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ModmacaoTables.STR_Application_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ModmacaoTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneOrMoreComponents(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv OneOrMoreComponents:
		 *   let severity : Integer[1] = 'Application::OneOrMoreComponents'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)
		 *         .links->collect(l | l.target)
		 *         ->select(rs | rs.oclIsTypeOf(platform::Component))
		 *         ->size() >= 1
		 *       in
		 *         'Application::OneOrMoreComponents'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModmacaoTables.STR_Application_c_c_OneOrMoreComponents);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModmacaoTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource = idResolver.getClass(ModmacaoTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(ModmacaoTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(ModmacaoTables.SEQ_CLSSid_Resource);
				/*@NonNull*/ Iterator<Object> ITERATOR_l = BOXED_links.iterator();
				/*@Thrown*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_l.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Link l = (Link)ITERATOR_l.next();
					/**
					 * l.target
					 */
					final /*@NonInvalid*/ Resource target = l.getTarget();
					//
					accumulator.add(target);
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(ModmacaoTables.SEQ_CLSSid_Resource);
				/*@NonNull*/ Iterator<Object> ITERATOR_rs = collect.iterator();
				/*@Thrown*/ SequenceValue select;
				while (true) {
					if (!ITERATOR_rs.hasNext()) {
						select = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Resource rs = (Resource)ITERATOR_rs.next();
					/**
					 * rs.oclIsTypeOf(platform::Component)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Component = idResolver.getClass(ModmacaoTables.CLSSid_Component, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, rs, TYP_platform_c_c_Component).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator_0.add(rs);
					}
				}
				final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@Thrown*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, ModmacaoTables.INT_1).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ModmacaoTables.STR_Application_c_c_OneOrMoreComponents, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ModmacaoTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModmacaoPackage.APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ModmacaoPackage.APPLICATION___ONE_OR_MORE_COMPONENTS__DIAGNOSTICCHAIN_MAP:
				return OneOrMoreComponents((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApplicationImpl
