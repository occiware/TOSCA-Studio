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
import extendedtosca.Tosca_capabilities_container_docker;
import extendedtosca.arrayPortSpec;
import extendedtosca.arraystring;
import extendedtosca.arrayversion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca capabilities container docker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link extendedtosca.impl.Tosca_capabilities_container_dockerImpl#getPublishAll <em>Publish All</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_capabilities_container_dockerImpl#getPublishPorts <em>Publish Ports</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_capabilities_container_dockerImpl#getExposePorts <em>Expose Ports</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_capabilities_container_dockerImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link extendedtosca.impl.Tosca_capabilities_container_dockerImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_capabilities_container_dockerImpl extends Tosca_capabilities_containerImpl implements Tosca_capabilities_container_docker {
	/**
	 * The default value of the '{@link #getPublishAll() <em>Publish All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishAll()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PUBLISH_ALL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPublishAll() <em>Publish All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishAll()
	 * @generated
	 * @ordered
	 */
	protected Boolean publishAll = PUBLISH_ALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublishPorts() <em>Publish Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishPorts()
	 * @generated
	 * @ordered
	 */
	protected arrayPortSpec publishPorts;

	/**
	 * The cached value of the '{@link #getExposePorts() <em>Expose Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposePorts()
	 * @generated
	 * @ordered
	 */
	protected arrayPortSpec exposePorts;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected arraystring volumes;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected arrayversion version;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_capabilities_container_dockerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPublishAll() {
		return publishAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishAll(Boolean newPublishAll) {
		Boolean oldPublishAll = publishAll;
		publishAll = newPublishAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL, oldPublishAll, publishAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayPortSpec getPublishPorts() {
		return publishPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishPorts(arrayPortSpec newPublishPorts, NotificationChain msgs) {
		arrayPortSpec oldPublishPorts = publishPorts;
		publishPorts = newPublishPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS, oldPublishPorts, newPublishPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishPorts(arrayPortSpec newPublishPorts) {
		if (newPublishPorts != publishPorts) {
			NotificationChain msgs = null;
			if (publishPorts != null)
				msgs = ((InternalEObject)publishPorts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS, null, msgs);
			if (newPublishPorts != null)
				msgs = ((InternalEObject)newPublishPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS, null, msgs);
			msgs = basicSetPublishPorts(newPublishPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS, newPublishPorts, newPublishPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayPortSpec getExposePorts() {
		return exposePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposePorts(arrayPortSpec newExposePorts, NotificationChain msgs) {
		arrayPortSpec oldExposePorts = exposePorts;
		exposePorts = newExposePorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS, oldExposePorts, newExposePorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposePorts(arrayPortSpec newExposePorts) {
		if (newExposePorts != exposePorts) {
			NotificationChain msgs = null;
			if (exposePorts != null)
				msgs = ((InternalEObject)exposePorts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS, null, msgs);
			if (newExposePorts != null)
				msgs = ((InternalEObject)newExposePorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS, null, msgs);
			msgs = basicSetExposePorts(newExposePorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS, newExposePorts, newExposePorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arraystring getVolumes() {
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumes(arraystring newVolumes, NotificationChain msgs) {
		arraystring oldVolumes = volumes;
		volumes = newVolumes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES, oldVolumes, newVolumes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumes(arraystring newVolumes) {
		if (newVolumes != volumes) {
			NotificationChain msgs = null;
			if (volumes != null)
				msgs = ((InternalEObject)volumes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES, null, msgs);
			if (newVolumes != null)
				msgs = ((InternalEObject)newVolumes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES, null, msgs);
			msgs = basicSetVolumes(newVolumes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES, newVolumes, newVolumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arrayversion getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(arrayversion newVersion, NotificationChain msgs) {
		arrayversion oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(arrayversion newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS:
				return basicSetPublishPorts(null, msgs);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS:
				return basicSetExposePorts(null, msgs);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES:
				return basicSetVolumes(null, msgs);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION:
				return basicSetVersion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL:
				return getPublishAll();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS:
				return getPublishPorts();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS:
				return getExposePorts();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES:
				return getVolumes();
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION:
				return getVersion();
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
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL:
				setPublishAll((Boolean)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS:
				setPublishPorts((arrayPortSpec)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS:
				setExposePorts((arrayPortSpec)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES:
				setVolumes((arraystring)newValue);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION:
				setVersion((arrayversion)newValue);
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
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL:
				setPublishAll(PUBLISH_ALL_EDEFAULT);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS:
				setPublishPorts((arrayPortSpec)null);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS:
				setExposePorts((arrayPortSpec)null);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES:
				setVolumes((arraystring)null);
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION:
				setVersion((arrayversion)null);
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
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL:
				return PUBLISH_ALL_EDEFAULT == null ? publishAll != null : !PUBLISH_ALL_EDEFAULT.equals(publishAll);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS:
				return publishPorts != null;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS:
				return exposePorts != null;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES:
				return volumes != null;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION:
				return version != null;
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
		result.append(" (publishAll: ");
		result.append(publishAll);
		result.append(')');
		return result.toString();
	}

} //Tosca_capabilities_container_dockerImpl
