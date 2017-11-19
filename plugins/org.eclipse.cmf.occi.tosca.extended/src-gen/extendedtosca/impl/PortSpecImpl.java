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
package extendedtosca.impl;

import extendedtosca.ExtendedtoscaPackage;
import extendedtosca.PortSpec;
import extendedtosca.protocolEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.PortSpecImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link extendedtosca.impl.PortSpecImpl#getTargetrange <em>Targetrange</em>}</li>
 *   <li>{@link extendedtosca.impl.PortSpecImpl#getSourcerange <em>Sourcerange</em>}</li>
 *   <li>{@link extendedtosca.impl.PortSpecImpl#getSource <em>Source</em>}</li>
 *   <li>{@link extendedtosca.impl.PortSpecImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortSpecImpl extends EObjectImpl implements PortSpec {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final protocolEnum PROTOCOL_EDEFAULT = protocolEnum.UDP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected protocolEnum protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetrange() <em>Targetrange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetrange()
	 * @generated
	 * @ordered
	 */
	protected static final Short TARGETRANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetrange() <em>Targetrange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetrange()
	 * @generated
	 * @ordered
	 */
	protected Short targetrange = TARGETRANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourcerange() <em>Sourcerange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcerange()
	 * @generated
	 * @ordered
	 */
	protected static final Short SOURCERANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcerange() <em>Sourcerange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcerange()
	 * @generated
	 * @ordered
	 */
	protected Short sourcerange = SOURCERANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final Short SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Short source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Short TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Short target = TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.PORT_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public protocolEnum getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(protocolEnum newProtocol) {
		protocolEnum oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_SPEC__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getTargetrange() {
		return targetrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetrange(Short newTargetrange) {
		Short oldTargetrange = targetrange;
		targetrange = newTargetrange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_SPEC__TARGETRANGE, oldTargetrange, targetrange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getSourcerange() {
		return sourcerange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcerange(Short newSourcerange) {
		Short oldSourcerange = sourcerange;
		sourcerange = newSourcerange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_SPEC__SOURCERANGE, oldSourcerange, sourcerange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Short newSource) {
		Short oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_SPEC__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Short newTarget) {
		Short oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.PORT_SPEC__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.PORT_SPEC__PROTOCOL:
				return getProtocol();
			case ExtendedtoscaPackage.PORT_SPEC__TARGETRANGE:
				return getTargetrange();
			case ExtendedtoscaPackage.PORT_SPEC__SOURCERANGE:
				return getSourcerange();
			case ExtendedtoscaPackage.PORT_SPEC__SOURCE:
				return getSource();
			case ExtendedtoscaPackage.PORT_SPEC__TARGET:
				return getTarget();
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
			case ExtendedtoscaPackage.PORT_SPEC__PROTOCOL:
				setProtocol((protocolEnum)newValue);
				return;
			case ExtendedtoscaPackage.PORT_SPEC__TARGETRANGE:
				setTargetrange((Short)newValue);
				return;
			case ExtendedtoscaPackage.PORT_SPEC__SOURCERANGE:
				setSourcerange((Short)newValue);
				return;
			case ExtendedtoscaPackage.PORT_SPEC__SOURCE:
				setSource((Short)newValue);
				return;
			case ExtendedtoscaPackage.PORT_SPEC__TARGET:
				setTarget((Short)newValue);
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
			case ExtendedtoscaPackage.PORT_SPEC__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ExtendedtoscaPackage.PORT_SPEC__TARGETRANGE:
				setTargetrange(TARGETRANGE_EDEFAULT);
				return;
			case ExtendedtoscaPackage.PORT_SPEC__SOURCERANGE:
				setSourcerange(SOURCERANGE_EDEFAULT);
				return;
			case ExtendedtoscaPackage.PORT_SPEC__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case ExtendedtoscaPackage.PORT_SPEC__TARGET:
				setTarget(TARGET_EDEFAULT);
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
			case ExtendedtoscaPackage.PORT_SPEC__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case ExtendedtoscaPackage.PORT_SPEC__TARGETRANGE:
				return TARGETRANGE_EDEFAULT == null ? targetrange != null : !TARGETRANGE_EDEFAULT.equals(targetrange);
			case ExtendedtoscaPackage.PORT_SPEC__SOURCERANGE:
				return SOURCERANGE_EDEFAULT == null ? sourcerange != null : !SOURCERANGE_EDEFAULT.equals(sourcerange);
			case ExtendedtoscaPackage.PORT_SPEC__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case ExtendedtoscaPackage.PORT_SPEC__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", targetrange: ");
		result.append(targetrange);
		result.append(", sourcerange: ");
		result.append(sourcerange);
		result.append(", source: ");
		result.append(source);
		result.append(", target: ");
		result.append(target);
		result.append(')');
		return result.toString();
	}

} //PortSpecImpl
