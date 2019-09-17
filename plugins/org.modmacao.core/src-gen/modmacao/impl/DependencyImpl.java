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
import java.util.Map;
import modmacao.Dependency;
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
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DependencyImpl extends MixinBaseImpl implements Dependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModmacaoPackage.Literals.DEPENDENCY;
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
		 *   let severity : Integer[1] = 'Dependency::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Componentlink)
		 *       in
		 *         'Dependency::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModmacaoTables.STR_Dependency_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModmacaoTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Componentlink = idResolver.getClass(ModmacaoTables.CLSSid_Componentlink, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Componentlink).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ModmacaoTables.STR_Dependency_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ModmacaoTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TargetMustBeComponent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv TargetMustBeComponent:
		 *   let
		 *     severity : Integer[1] = 'Dependency::TargetMustBeComponent'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Link)
		 *         .target.oclIsTypeOf(platform::Component)
		 *       in
		 *         'Dependency::TargetMustBeComponent'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModmacaoTables.STR_Dependency_c_c_TargetMustBeComponent);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModmacaoTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Link_0 = idResolver.getClass(ModmacaoTables.CLSSid_Link, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Component_0 = idResolver.getClass(ModmacaoTables.CLSSid_Component, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Link oclAsType = ClassUtil.nonNullState((Link)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Link_0));
				final /*@Thrown*/ Resource target = oclAsType.getTarget();
				final /*@Thrown*/ boolean result = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, target, TYP_platform_c_c_Component_0).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ModmacaoTables.STR_Dependency_c_c_TargetMustBeComponent, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ModmacaoTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SourceMustBeComponent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SourceMustBeComponent:
		 *   let
		 *     severity : Integer[1] = 'Dependency::SourceMustBeComponent'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Link)
		 *         .source.oclIsTypeOf(platform::Component)
		 *       in
		 *         'Dependency::SourceMustBeComponent'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModmacaoTables.STR_Dependency_c_c_SourceMustBeComponent);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModmacaoTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Link = idResolver.getClass(ModmacaoTables.CLSSid_Link, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Component_0 = idResolver.getClass(ModmacaoTables.CLSSid_Component, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Link oclAsType = ClassUtil.nonNullState((Link)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Link));
				final /*@Thrown*/ Resource source = oclAsType.getSource();
				final /*@Thrown*/ boolean result = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, source, TYP_platform_c_c_Component_0).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ModmacaoTables.STR_Dependency_c_c_SourceMustBeComponent, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ModmacaoTables.INT_0).booleanValue();
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
			case ModmacaoPackage.DEPENDENCY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ModmacaoPackage.DEPENDENCY___TARGET_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP:
				return TargetMustBeComponent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ModmacaoPackage.DEPENDENCY___SOURCE_MUST_BE_COMPONENT__DIAGNOSTICCHAIN_MAP:
				return SourceMustBeComponent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DependencyImpl
