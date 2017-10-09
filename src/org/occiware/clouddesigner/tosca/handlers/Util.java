package org.occiware.clouddesigner.tosca.handlers;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class Util {

	
	public static Kind copyKind(Kind toBoCopied, Extension extension) {
		Kind copy = OCCIFactory.eINSTANCE.createKind();
		copy.setName(toBoCopied.getName());
		copy.setScheme(toBoCopied.getScheme());
		copy.setParent(toBoCopied.getParent());
		copy.setTitle(toBoCopied.getTitle());
		extension.getKinds().add(copy);
		return copy;
	}
	
}
