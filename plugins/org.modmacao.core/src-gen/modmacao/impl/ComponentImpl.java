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
import modmacao.Component;
import modmacao.ModmacaoPackage;

import modmacao.ModmacaoTables;
import modmacao.util.ModmacaoValidator;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modmacao.impl.ComponentImpl#getModmacaoComponentVersion <em>Modmacao Component Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MixinBaseImpl implements Component {
	/**
	 * The default value of the '{@link #getModmacaoComponentVersion() <em>Modmacao Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModmacaoComponentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MODMACAO_COMPONENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModmacaoComponentVersion() <em>Modmacao Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModmacaoComponentVersion()
	 * @generated
	 * @ordered
	 */
	protected String modmacaoComponentVersion = MODMACAO_COMPONENT_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModmacaoPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModmacaoComponentVersion() {
		return modmacaoComponentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModmacaoComponentVersion(String newModmacaoComponentVersion) {
		String oldModmacaoComponentVersion = modmacaoComponentVersion;
		modmacaoComponentVersion = newModmacaoComponentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION, oldModmacaoComponentVersion, modmacaoComponentVersion));
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
		 *   let severity : Integer[1] = 'Component::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Component)
		 *       in
		 *         'Component::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModmacaoTables.STR_Component_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModmacaoTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Component_0 = idResolver.getClass(ModmacaoTables.CLSSid_Component, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Component_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ModmacaoTables.STR_Component_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ModmacaoTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyOnePlacementLink(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv OnlyOnePlacementLink:
		 *   let severity : Integer[1] = 'Component::OnlyOnePlacementLink'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclAsType(occi::Resource)
		 *         .links->select(l |
		 *           l.oclIsTypeOf(placement::Placementlink))
		 *         ->size() = 1
		 *       in
		 *         'Component::OnlyOnePlacementLink'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModmacaoTables.STR_Component_c_c_OnlyOnePlacementLink);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModmacaoTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource_0 = idResolver.getClass(ModmacaoTables.CLSSid_Resource, null);
				final /*@NonInvalid*/ Entity entity = this.getEntity();
				final /*@Thrown*/ Resource oclAsType = ClassUtil.nonNullState((Resource)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource_0));
				final /*@Thrown*/ List<Link> links = oclAsType.getLinks();
				final /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(ModmacaoTables.ORD_CLSSid_Link, links);
				/*@Thrown*/ OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ModmacaoTables.ORD_CLSSid_Link);
				/*@NonNull*/ Iterator<Object> ITERATOR_l = BOXED_links.iterator();
				/*@Thrown*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_l.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Link l = (Link)ITERATOR_l.next();
					/**
					 * l.oclIsTypeOf(placement::Placementlink)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_placement_c_c_Placementlink = idResolver.getClass(ModmacaoTables.CLSSid_Placementlink, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, l, TYP_placement_c_c_Placementlink).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator.add(l);
					}
				}
				final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@Thrown*/ boolean result = size.equals(ModmacaoTables.INT_1);
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ModmacaoTables.STR_Component_c_c_OnlyOnePlacementLink, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ModmacaoTables.INT_0).booleanValue();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION:
				return getModmacaoComponentVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION:
				setModmacaoComponentVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION:
				setModmacaoComponentVersion(MODMACAO_COMPONENT_VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModmacaoPackage.COMPONENT__MODMACAO_COMPONENT_VERSION:
				return MODMACAO_COMPONENT_VERSION_EDEFAULT == null ? modmacaoComponentVersion != null : !MODMACAO_COMPONENT_VERSION_EDEFAULT.equals(modmacaoComponentVersion);
		}
		return super.eIsSet(featureID);
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
			case ModmacaoPackage.COMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ModmacaoPackage.COMPONENT___ONLY_ONE_PLACEMENT_LINK__DIAGNOSTICCHAIN_MAP:
				return OnlyOnePlacementLink((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (modmacaoComponentVersion: ");
		result.append(modmacaoComponentVersion);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
