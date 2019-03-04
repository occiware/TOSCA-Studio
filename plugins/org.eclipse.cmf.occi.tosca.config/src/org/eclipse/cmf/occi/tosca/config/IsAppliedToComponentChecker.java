package org.eclipse.cmf.occi.tosca.config;

import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.emf.common.util.EList;

public class IsAppliedToComponentChecker {

	private MixinBase internalMixin;

	public IsAppliedToComponentChecker(MixinBase internalMixinBase) {
		this.internalMixin = internalMixinBase;
	}

	public boolean check() {
		return _check(this.internalMixin.getMixin());
	}

	private boolean _check(EList<Mixin> depends) {
		for (Mixin depend : depends) {
			if (_check(depend)) {
				return true;
			}
		}
		return false;
	}

	private boolean _check(Mixin depend) {
		try {
			String dependName = depend.getName();
			if (dependName == null) {
				String dependStr = depend.toString();
				dependName = dependStr.split("term=")[1].split("'")[1];
			}
			MixinBase mixinBaseOfDepend = Main.instanciateCorrectMixinBaseFromTypeName(dependName);
			Mixin mixinDepend = mixinBaseOfDepend.getMixin();
			return match(mixinDepend) || _check(mixinDepend.getDepends());
		} catch (Exception e) {
			return false;
		}
	}

	private boolean match(Mixin mixin) {
		return mixin.getApplies().stream().anyMatch(apply ->
				"Component".equals(apply.getName()) && 
							"http://schemas.modmacao.org/occi/platform#".equals(apply.getScheme())
							);
	}

}
