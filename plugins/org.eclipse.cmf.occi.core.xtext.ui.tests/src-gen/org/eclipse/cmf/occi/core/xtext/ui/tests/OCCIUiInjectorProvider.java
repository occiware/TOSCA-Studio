/*
 * generated by Xtext 2.12.0
 */
package org.eclipse.cmf.occi.core.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.cmf.occi.core.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class OCCIUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("org.eclipse.cmf.occi.core.xtext.OCCI");
	}

}