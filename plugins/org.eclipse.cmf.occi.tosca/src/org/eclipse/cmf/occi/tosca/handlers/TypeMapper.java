package org.eclipse.cmf.occi.tosca.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Constraint;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.cmf.occi.tosca.handlers.Mapper.Mapping;

public class TypeMapper extends Mapper {
	
	public TypeMapper() {
		super();
		
		this.mappings.put("tosca.nodes.Root", 
				new MixinMapping(
						ExtensionsManager.getKindFromItsTerm("core", "resource"),
						ExtensionsManager.getMixinFromItsTerm("tosca", "tosca.interfaces.node.lifecycle.standard")
		));
		
		this.mappings.put("tosca.nodes.BlockStorage",
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "storage"))
		);
		
		this.mappings.put("tosca.nodes.ObjectStorage", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "storage")
		));
		
		Constraint computeConstraint = OCCIFactory.eINSTANCE.createConstraint();
		computeConstraint.setName("SourceMustBeSoftwareComponent");
		this.mappings.put("tosca.nodes.Compute", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "compute"), computeConstraint)
			);
		

	

		this.mappings.put("tosca.nodes.SoftwareComponent", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));

		this.mappings.put("tosca.nodes.WebApplication", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));
		
		Constraint webServerConstraint = OCCIFactory.eINSTANCE.createConstraint();
		webServerConstraint.setName("SourceMustBeWebApplication");
		this.mappings.put("tosca.nodes.WebServer", 
				new MixinMapping(webServerConstraint)
			);
		
		Constraint dbmsConstraint = OCCIFactory.eINSTANCE.createConstraint();
		dbmsConstraint.setName("SourceMustBeDatabase");
		this.mappings.put("tosca.nodes.DBMS", 
				new MixinMapping(ExtensionsManager.getMixinFromItsTerm("platform", "database"), dbmsConstraint)
			);
		
		this.mappings.put("tosca.nodes.Database", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));

		this.mappings.put("tosca.nodes.Container.Application", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("platform", "component")
			));
		
		this.mappings.put("tosca.policies.Root", 
				new MixinMapping(ExtensionsManager.getMixinFromItsTerm("sla", "agreement_term"))
		);	
		
		this.mappings.put("tosca.relationships.Root",
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("core", "link"))
		);
		
		Constraint dependsOnConstraint = OCCIFactory.eINSTANCE.createConstraint();
		dependsOnConstraint.setName("SourceMustBeNodeAndTargetMustBeNode");
		this.mappings.put("tosca.relationships.DependsOn",
				new MixinMapping(dependsOnConstraint)
		);
		
		Constraint hostedOnConstraints1 = OCCIFactory.eINSTANCE.createConstraint();
		hostedOnConstraints1.setName("SourceMustBeSoftwareComponentAndTargetMustBeCompute");
		MixinMapping hostedOnMapping = new MixinMapping(hostedOnConstraints1);
		
		Constraint hostedOnConstraints2 = OCCIFactory.eINSTANCE.createConstraint();
		hostedOnConstraints2.setName("SourceMustBeWebServerAndTargetMustBeWebApplication");
		hostedOnMapping.constraints.add(hostedOnConstraints2);
		this.mappings.put("tosca.relationships.HostedOn", hostedOnMapping);
		
		Constraint hostedOnConstraints3 = OCCIFactory.eINSTANCE.createConstraint();
		hostedOnConstraints3.setName("SourceMustBeDatabaseAndTargetMustBeDBMS");
		hostedOnMapping.constraints.add(hostedOnConstraints3);
		this.mappings.put("tosca.relationships.HostedOn", hostedOnMapping);
		
		Constraint hostedOnConstraints4 = OCCIFactory.eINSTANCE.createConstraint();
		hostedOnConstraints4.setName("SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime");
		hostedOnMapping.constraints.add(hostedOnConstraints4);
		this.mappings.put("tosca.relationships.HostedOn", hostedOnMapping);
		
		Constraint attachesToConstraint = OCCIFactory.eINSTANCE.createConstraint();
		attachesToConstraint.setName("SourceMustBeComputeAndTargetMustBeBlockStorage");
		this.mappings.put("tosca.relationships.AttachesTo",
				new MixinMapping(attachesToConstraint)
		);
		
		Constraint routesToConstraint = OCCIFactory.eINSTANCE.createConstraint();
		routesToConstraint.setName("SourceMustBeLoadBalancer");
		this.mappings.put("tosca.relationships.RoutesTo",
				new MixinMapping(routesToConstraint)
		);
			
		
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
		public final List<Constraint> constraints;
		public MixinMapping(Kind apply) {
			this.apply = apply;
			this.dependsOn = null;
			this.constraints = new ArrayList<Constraint>();
		}
		public MixinMapping(Mixin depend) {
			this.apply = null;
			this.dependsOn = depend;
			this.constraints = new ArrayList<Constraint>();
		}
		public MixinMapping(Constraint constraint) {
			this.apply = null;
			this.dependsOn = null;
			this.constraints = new ArrayList<Constraint>();
			this.constraints.add(constraint);
		}
		public MixinMapping(Kind apply, Mixin depend) {
			this.apply = apply;
			this.dependsOn = depend;
			this.constraints = new ArrayList<Constraint>();
		}
		public MixinMapping(Mixin depend, Constraint constraint) {
			this.apply = null;
			this.dependsOn = depend;
			this.constraints = new ArrayList<Constraint>();
			this.constraints.add(constraint);
		}
		public MixinMapping(Kind apply, Constraint constraint) {
			this.apply = apply;
			this.dependsOn = null;
			this.constraints = new ArrayList<Constraint>();
			this.constraints.add(constraint);
		}
		public void mapTo(Mixin mixin) {
			if (apply != null) {
				mixin.getApplies().add(apply);
			} 
			if (dependsOn != null) {
				mixin.getDepends().add(dependsOn);
			}
			if (!constraints.isEmpty()) {
				mixin.getConstraints().addAll(constraints);
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
