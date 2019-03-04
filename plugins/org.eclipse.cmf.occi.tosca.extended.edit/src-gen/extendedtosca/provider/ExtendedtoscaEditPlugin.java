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

import modmacao.provider.ModmacaoEditPlugin;

import org.eclipse.cmf.occi.core.provider.OCCIEditPlugin;

import org.eclipse.cmf.occi.infrastructure.provider.InfrastructureEditPlugin;

import org.eclipse.cmf.occi.sla.provider.SlaEditPlugin;

import org.eclipse.cmf.occi.tosca.provider.ToscaEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.modmacao.occi.platform.provider.PlatformEditPlugin;

import org.modmacao.placement.provider.PlacementEditPlugin;

/**
 * This is the central singleton for the Extendedtosca edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ExtendedtoscaEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExtendedtoscaEditPlugin INSTANCE = new ExtendedtoscaEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedtoscaEditPlugin() {
		super
		  (new ResourceLocator [] {
		     InfrastructureEditPlugin.INSTANCE,
		     SlaEditPlugin.INSTANCE,
		     ToscaEditPlugin.INSTANCE,
		     ModmacaoEditPlugin.INSTANCE,
		     PlatformEditPlugin.INSTANCE,
		     PlacementEditPlugin.INSTANCE,
		     OCCIEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
