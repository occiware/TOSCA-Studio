package org.eclipse.cmf.occi.tosca.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Constraint;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.cmf.occi.tosca.handlers.Mapper.Mapping;

public class TypeMapper extends Mapper {
	
	public TypeMapper() {
		super();
		
//		this.mappings.put("tosca_nodes_Root", 
//				new MixinMapping(
//						ExtensionsManager.getKindFromItsTerm("core", "resource")
//						//ExtensionsManager.getMixinFromItsTerm("tosca", "tosca_interfaces_node_lifecycle_standard")
//		));
		
		this.mappings.put("tosca_nodes_BlockStorage",
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "storage"))
		);
		
		this.mappings.put("tosca_nodes_ObjectStorage", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "storage")
		));
		
		Constraint computeConstraint = OCCIFactory.eINSTANCE.createConstraint();
		computeConstraint.setName("SourceMustBeSoftwareComponent");
		computeConstraint.setBody("true");
		this.mappings.put("tosca_nodes_Compute", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "compute"), computeConstraint)
			);
		
		/*
		this.mappings.put("tosca_nodes_Root",
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("modmacao-platform", "component")
			)
		);
		*/
		
		this.mappings.put("tosca_nodes_SoftwareComponent",
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("modmacao-platform", "component")
			)
		);
		
		Constraint webServerConstraint = OCCIFactory.eINSTANCE.createConstraint();
		webServerConstraint.setName("SourceMustBeWebApplication");
		//webServerConstraint.setBody("self.depends.applies.source= tosca_nodes_WebApplication");
		webServerConstraint.setBody("true");
		this.mappings.put("tosca_nodes_WebServer", 
				new MixinMapping(webServerConstraint)
		);
		
		this.mappings.put("tosca_nodes_WebApplication",
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("modmacao-platform", "component")
			)
		);
		
		Constraint dbmsConstraint = OCCIFactory.eINSTANCE.createConstraint();
		dbmsConstraint.setName("SourceMustBeDatabase");
		//dbmsConstraint.setBody("self.depends.applies.source= tosca_nodes_Database");
		dbmsConstraint.setBody("true");
		this.mappings.put("tosca_nodes_DBMS", 
				new MixinMapping(ExtensionsManager.getMixinFromItsTerm("modmacao-platform", "database"), dbmsConstraint)
			);
		
		this.mappings.put("tosca_nodes_Database", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("modmacao-platform", "component")
			)
		);
		
		this.mappings.put("tosca_nodes_LoadBalancer", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("modmacao-platform", "component")
			)
		);
		
		this.mappings.put("tosca_nodes_Container_Application", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("modmacao-platform", "component")
			)
		);
		
		this.mappings.put("tosca_policies_Root", 
				new MixinMapping(ExtensionsManager.getMixinFromItsTerm("sla", "agreement_term"))
		);	
		
		this.mappings.put("tosca_relationships_Root",
				new MixinMapping(
						ExtensionsManager.getKindFromItsTerm("core", "link"),
						Arrays.asList(
								ExtensionsManager.getMixinFromItsTerm("modmacao-core", "installationdependency"),
								ExtensionsManager.getMixinFromItsTerm("modmacao-core", "executiondependency")
						)
				)
		);
		
		this.mappings.put("tosca_nodes_network_Network", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "network")
			)
		);
		
		this.mappings.put("tosca_nodes_network_Port", 
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "network")
			)
		);
		
		Constraint dependsOnConstraint = OCCIFactory.eINSTANCE.createConstraint();
		dependsOnConstraint.setName("SourceMustBeNodeAndTargetMustBeNode");
		//dependsOnConstraint.setBody("self.depends.applies.source= tosca_nodes_Root and self.depends.applies.target = tosca_nodes_Root");
		dependsOnConstraint.setBody("true");
		this.mappings.put("tosca_relationships_DependsOn",
				new MixinMapping(dependsOnConstraint)
		);
		
		Constraint hostedOnConstraints1 = OCCIFactory.eINSTANCE.createConstraint();
		hostedOnConstraints1.setName("SourceMustBeSoftwareComponentAndTargetMustBeCompute");
		//hostedOnConstraints1.setBody("self.depends.applies.source= tosca_nodes_SoftwareComponent and self.depends.applies.target = tosca_nodes_Compute");
		hostedOnConstraints1.setBody("true");
		MixinMapping hostedOnMapping = new MixinMapping(hostedOnConstraints1);
		
		Constraint hostedOnConstraints2 = OCCIFactory.eINSTANCE.createConstraint();
		hostedOnConstraints2.setName("SourceMustBeWebServerAndTargetMustBeWebApplication");
		//hostedOnConstraints2.setBody("self.depends.applies.source= tosca_nodes_WebServer and self.depends.applies.target = tosca_nodes_WebApplication");
		hostedOnConstraints2.setBody("true");
		hostedOnMapping.constraints.add(hostedOnConstraints2);
		
		Constraint hostedOnConstraints3 = OCCIFactory.eINSTANCE.createConstraint();
		hostedOnConstraints3.setName("SourceMustBeDatabaseAndTargetMustBeDBMS");
		//hostedOnConstraints3.setBody("self.depends.applies.source= tosca_nodes_Database and self.depends.applies.target = tosca_nodes_DBMS");
		hostedOnConstraints3.setBody("true");
		hostedOnMapping.constraints.add(hostedOnConstraints3);
		
		Constraint hostedOnConstraints4 = OCCIFactory.eINSTANCE.createConstraint();
		hostedOnConstraints4.setName("SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime");
		//hostedOnConstraints4.setBody("self.depends.applies.source= tosca_nodes_container_Application and self.depends.applies.target = tosca_nodes_Container_Runtime");
		hostedOnConstraints4.setBody("true");
		hostedOnMapping.constraints.add(hostedOnConstraints4);
		this.mappings.put("tosca_relationships_HostedOn", hostedOnMapping);
		
		Constraint attachesToConstraint = OCCIFactory.eINSTANCE.createConstraint();
		attachesToConstraint.setName("SourceMustBeComputeAndTargetMustBeBlockStorage");
		//attachesToConstraint.setBody("self.depends.applies.source= tosca_nodes_Compute and self.depends.applies.target = tosca_nodes_BlockStorage");
		attachesToConstraint.setBody("true");
		this.mappings.put("tosca_relationships_AttachesTo",
				new MixinMapping(ExtensionsManager.getKindFromItsTerm("infrastructure", "storagelink"), attachesToConstraint)
		);
		
		Constraint routesToConstraint = OCCIFactory.eINSTANCE.createConstraint();
		routesToConstraint.setName("SourceMustBeLoadBalancer");
		//routesToConstraint.setBody("self.depends.applies.source= tosca_nodes_LoadBalancer");
		routesToConstraint.setBody("true");
		this.mappings.put("tosca_relationships_RoutesTo",
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
		public final List<Mixin> dependsOn;
		public final List<Constraint> constraints;
		public MixinMapping(Kind apply) {
			this.apply = apply;
			this.dependsOn = null;
			this.constraints = new ArrayList<Constraint>();
		}
		public MixinMapping(Mixin depend) {
			this.apply = null;
			this.dependsOn = Collections.singletonList(depend);
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
			this.dependsOn = Collections.singletonList(depend);
			this.constraints = new ArrayList<Constraint>();
		}
		public MixinMapping(Kind apply, List<Mixin> depends) {
			this.apply = apply;
			this.dependsOn = depends;
			this.constraints = new ArrayList<Constraint>();
		}
		public MixinMapping(Mixin depend, Constraint constraint) {
			this.apply = null;
			this.dependsOn = Collections.singletonList(depend);
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
				for (Mixin depend : this.dependsOn) {
					mixin.getDepends().add(depend);
				}
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
			kindToBeMapped.getTarget().add(target);
			kindToBeMapped.getSource().add(source);
			for (Mixin mixin : mixins) {
				mixin.getApplies().add(kindToBeMapped);
			}
		}
	}

}
