package org.occiware.clouddesigner.tosca.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Type;

public class Mapper {
	
	private Map<String, Mapping> mappings;
	
	public Mapper() {
		this.mappings = new HashMap<String, Mapping>();
		
		this.mappings.put("tosca.nodes.Root", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("core", "resource"))
		);
		
		this.mappings.put("tosca.nodes.BlockStorage",
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "storage"))
		);
		
		this.mappings.put("tosca.nodes.ObjectStorage", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "storage")
			));

		
		this.mappings.put("tosca.nodes.Compute", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "compute"))
			);

		this.mappings.put("tosca.nodes.SoftwareComponent", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));
		

		this.mappings.put("tosca.nodes.WebServer", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));
		

		this.mappings.put("tosca.nodes.WebApplication", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));

		
		this.mappings.put("tosca.nodes.DBMS", 
				new MixinMapping(ExtensionsManager.getMixinFromItsTerm("platform", "database")
			));
		
		this.mappings.put("tosca.nodes.Database", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));
		
		this.mappings.put("tosca.nodes.LoadBalancer", 
				new KindMapping(ExtensionsManager.getKindFromItsTerm("core", "resource"))
		);
		
		this.mappings.put("tosca.nodes.Container.Runtime", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));
		

		this.mappings.put("tosca.nodes.Container.Application", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));
		
		this.mappings.put("tosca.policies.Root", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("sla", "agreement"))
		);
		
		this.mappings.put("tosca.policies.Update", 
				new MixinMapping(ExtensionsManager.getMixinFromItsTerm("sla", "agreement_term")
		));
		
		this.mappings.put("tosca.policies.Placement", 
				new MixinMapping(ExtensionsManager.getMixinFromItsTerm("sla", "agreement_term")
			));

		this.mappings.put("tosca.policies.Scaling", 
				new MixinMapping(ExtensionsManager.getMixinFromItsTerm("sla", "agreement_term")
			));

		this.mappings.put("tosca.policies.Performance", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("sla", "agreement")
			));
//		
//		Mixin standardMixin = OCCIFactory.eINSTANCE.createMixin();
//		standardMixin.setName("StandardMixin");
//		standardMixin.setScheme("http://occi/tosca/"+"standardMixin".replaceAll("\\.", "").toLowerCase()+"#");
//		extension.getMixins().add(standardMixin);
//		this.mappings.put("tosca.interfaces.node.lifecycle.Standard", 
//				new ResourceMapping(ExtensionsManager.getKindFromItsTerm("core", "resource"),
//						standardMixin
//			));
//		
		this.mappings.put("tosca.relationships.AttachesTo", 
				new LinkMapping(
						ExtensionsManager.getKindFromItsTerm("infrastructure", "storagelink"), 
						ExtensionsManager.getKindFromItsTerm("infrastructure", "compute"),
						ExtensionsManager.getKindFromItsTerm("infrastructure", "storage"))
			);
		
		this.mappings.put("tosca.relationships.ConnectsTo", 
				new LinkMapping(
						ExtensionsManager.getKindFromItsTerm("core", "link"), 
						ExtensionsManager.getKindFromItsTerm("core", "resource"),
						ExtensionsManager.getKindFromItsTerm("core", "resource"))
			);
		
		this.mappings.put("tosca.relationships.DependsOn", 
				new LinkMapping(
						ExtensionsManager.getKindFromItsTerm("core", "link"), 
						ExtensionsManager.getKindFromItsTerm("core", "resource"),
						ExtensionsManager.getKindFromItsTerm("core", "resource"))
			);
		
		this.mappings.put("tosca.relationships.HostedOn", 
				new LinkMapping(
						ExtensionsManager.getKindFromItsTerm("core", "link"), 
						ExtensionsManager.getKindFromItsTerm("platform", "component"),
						ExtensionsManager.getKindFromItsTerm("platform", "component"))
			);
			
		
		this.mappings.put("tosca.relationships.RoutesTo", 
				new LinkMapping(
						ExtensionsManager.getKindFromItsTerm("tosca", "tosca.relationships.connectsto"), 
						ExtensionsManager.getKindFromItsTerm("tosca", "tosca.nodes.loadbalancer"),
						ExtensionsManager.getKindFromItsTerm("core", "resource"))
			);
//		
//		Mixin configureMixin = OCCIFactory.eINSTANCE.createMixin();
//		configureMixin.setName("ConfigureMixin");
//		configureMixin.setScheme("http://occi/tosca/"+"configureMixin".replaceAll("\\.", "").toLowerCase()+"#");
//		extension.getMixins().add(configureMixin);
//		this.mappings.put("tosca.relationship.Configure", 
//				new LinkMapping(
//						ExtensionsManager.getKindFromItsTerm("core", "link"),
//						null,
//						null,
//						configureMixin)						
//			);
	}
	
	public boolean map(Type typeToBeMapped) {
		Mapping mapping = mappings.get(typeToBeMapped.getName());
		if (mapping == null) {
			return false;
		}
		mapping.mapTo(typeToBeMapped);
		return true;
	}
	
	private interface Mapping<T extends Type> {
		public void mapTo(T type);
	}
	
	private class KindMapping implements Mapping<Kind> {
		public final Kind parent;
		public KindMapping(Kind parent) {
			this.parent = parent;
		}
		public void mapTo(Kind type) {
			type.setParent(this.parent);
		}
	}
	
	private class MixinMapping implements Mapping<Mixin> {
		public final Kind apply;
		public final Mixin dependsOn;
		public MixinMapping(Kind apply) {
			this.apply = apply;
			this.dependsOn = null;
		}
		public MixinMapping(Mixin depend) {
			this.apply = null;
			this.dependsOn = depend;
		}
		public void mapTo(Mixin mixin) {
			if (apply != null) {
				mixin.getApplies().add(apply);
			} else {
				mixin.getDepends().add(dependsOn);
			}
		}
	}
	
	private class LinkMapping implements Mapping<Kind>{
		public final Kind parent;
		public final Kind source;
		public final Kind target;
		public final List<Mixin> mixins;
		public LinkMapping(Kind parent, Kind source, Kind target) {
			this.parent = parent;
			this.source = source;
			this.target = target;
			this.mixins = new ArrayList<>();
		}
		public LinkMapping(Kind parent, Kind source, Kind target, Mixin mixin) {
			this.parent = parent;
			this.source = source;
			this.target = target;
			this.mixins = new ArrayList<>();
			this.mixins.add(mixin);
		}
		public LinkMapping(Kind parent, Kind source, Kind target, List<Mixin> mixins) {
			this.parent = parent;
			this.source = source;
			this.target = target;
			this.mixins = mixins;
		}
		public void mapTo(Kind kindToBeMapped) {
			kindToBeMapped.setParent(parent);
			kindToBeMapped.setSource(source);
			kindToBeMapped.setTarget(target);
			for (Mixin mixin : mixins) {
				mixin.getApplies().add(kindToBeMapped);
			}
		}
	}

}
