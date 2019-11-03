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
package extendedtosca.provider;


import extendedtosca.ExtendedtoscaFactory;
import extendedtosca.ExtendedtoscaPackage;
import extendedtosca.Tosca_capabilities_container_docker;

import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.tosca.ToscaFactory;

import org.eclipse.cmf.occi.tosca.provider.Tosca_capabilities_containerItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link extendedtosca.Tosca_capabilities_container_docker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Tosca_capabilities_container_dockerItemProvider extends Tosca_capabilities_containerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_capabilities_container_dockerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPublishAllPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Publish All feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishAllPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tosca_capabilities_container_docker_publishAll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tosca_capabilities_container_docker_publishAll_feature", "_UI_Tosca_capabilities_container_docker_type"),
				 ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS);
			childrenFeatures.add(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS);
			childrenFeatures.add(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES);
			childrenFeatures.add(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Tosca_capabilities_container_docker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tosca_capabilities_container_docker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tosca_capabilities_container_docker)object).getModmacaoComponentVersion();
		return label == null || label.length() == 0 ?
			getString("_UI_Tosca_capabilities_container_docker_type") :
			getString("_UI_Tosca_capabilities_container_docker_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Tosca_capabilities_container_docker.class)) {
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_ALL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS:
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS:
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES:
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS,
				 ExtendedtoscaFactory.eINSTANCE.createarrayPortSpec()));

		newChildDescriptors.add
			(createChildParameter
				(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS,
				 ExtendedtoscaFactory.eINSTANCE.createarrayPortSpec()));

		newChildDescriptors.add
			(createChildParameter
				(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VOLUMES,
				 ToscaFactory.eINSTANCE.createarraystring()));

		newChildDescriptors.add
			(createChildParameter
				(ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__VERSION,
				 ExtendedtoscaFactory.eINSTANCE.createarrayversion()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__PUBLISH_PORTS ||
			childFeature == ExtendedtoscaPackage.Literals.TOSCA_CAPABILITIES_CONTAINER_DOCKER__EXPOSE_PORTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExtendedtoscaEditPlugin.INSTANCE;
	}

}
