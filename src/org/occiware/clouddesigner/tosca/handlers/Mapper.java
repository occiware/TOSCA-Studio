package org.occiware.clouddesigner.tosca.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class Mapper {
	
	private Map<String, Mapping> mappings;
	
	public Mapper(ExtensionsManager extensionsManager, Extension extension) {
		this.mappings = new HashMap<String, Mapping>();
		
		Mixin blockStorage = OCCIFactory.eINSTANCE.createMixin();
		blockStorage.setName("BlockStorageMixin");
		blockStorage.setScheme("http://occi/tosca/"+"blockStorageMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(blockStorage);
		this.mappings.put("tosca.nodes.BlockStorage", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("infrastructure", "storage"),
						blockStorage
			));
		
		Mixin objectStorage = OCCIFactory.eINSTANCE.createMixin();
		objectStorage.setName("ObjectStorageMixin");
		objectStorage.setScheme("http://occi/tosca/"+"objectStorageMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(objectStorage);
		this.mappings.put("tosca.nodes.ObjectStorage", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("infrastructure", "storage"),
						objectStorage
			));
		
		
		this.mappings.put("tosca.nodes.Compute", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("infrastructure", "compute"))
			);
		
		
		Mixin softwareComponent = OCCIFactory.eINSTANCE.createMixin();
		softwareComponent.setName("SoftwareComponentMixin");
		softwareComponent.setScheme("http://occi/tosca/"+"softwareComponentMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(softwareComponent);
		this.mappings.put("tosca.nodes.SoftwareComponent", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("platform", "component"),
				softwareComponent
			));
		
		Mixin webServer = OCCIFactory.eINSTANCE.createMixin();
		webServer.setName("WebServerMixin");
		webServer.setScheme("http://occi/tosca/"+"webServerMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(webServer);
		this.mappings.put("tosca.nodes.WebServer", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("platform", "component"),
						webServer
			));
		
		Mixin webApplication = OCCIFactory.eINSTANCE.createMixin();
		webApplication.setName("WebApplicationMixin");
		webApplication.setScheme("http://occi/tosca/"+"webApplicationMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(webApplication);
		this.mappings.put("tosca.nodes.WebApplication", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("platform", "application"),
						webApplication
			));
		
		Mixin dbms = OCCIFactory.eINSTANCE.createMixin();
		dbms.setName("DBMSMixin");
		dbms.setScheme("http://occi/tosca/"+"dbmsMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(dbms);
		this.mappings.put("tosca.nodes.DBMS", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("platform", "component"),
						dbms
			));
		
		this.mappings.put("tosca.nodes.Database", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("platform", "component"),
						extensionsManager.getMixinFromItsTerm("platform", "database")
			));
		
		Mixin loadBalancer = OCCIFactory.eINSTANCE.createMixin();
		loadBalancer.setName("LoadBalancerMixin");
		loadBalancer.setScheme("http://occi/tosca/"+"loadBalancerMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(loadBalancer);
		this.mappings.put("tosca.nodes.LoadBalancer", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("core", "resource"),
						loadBalancer
			));
		
		Mixin runtime = OCCIFactory.eINSTANCE.createMixin();
		runtime.setName("RuntimeMixin");
		runtime.setScheme("http://occi/tosca/"+"runtimeMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(runtime);
		this.mappings.put("tosca.nodes.Container.Runtime", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("platform", "component"),
						runtime
			));
		
		Mixin container = OCCIFactory.eINSTANCE.createMixin();
		container.setName("ContainerMixin");
		container.setScheme("http://occi/tosca/"+"containerMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(container);
		this.mappings.put("tosca.nodes.Container.Application", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("platform", "component"),
						container
			));
		
		
		
		Mixin updateTermMixin = OCCIFactory.eINSTANCE.createMixin();
		updateTermMixin.setName("Update-Term");
		updateTermMixin.setScheme("http://occi/tosca/"+"updateTermMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(updateTermMixin);
		updateTermMixin.getDepends().add(extensionsManager.getMixinFromItsTerm("sla", "agreement_term"));
		this.mappings.put("tosca.policies.Update", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("sla", "agreement"),
						updateTermMixin
			));
		
		Mixin placementTermMixin = OCCIFactory.eINSTANCE.createMixin();
		placementTermMixin.setName("Placement-Term");
		placementTermMixin.setScheme("http://occi/tosca/"+"placementTermMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(placementTermMixin);
		placementTermMixin.getDepends().add(extensionsManager.getMixinFromItsTerm("sla", "agreement_term"));
		this.mappings.put("tosca.policies.Placement", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("sla", "agreement"),
						placementTermMixin
			));
		
		Mixin scalingTermMixin = OCCIFactory.eINSTANCE.createMixin();
		scalingTermMixin.setName("Scaling-Term");
		scalingTermMixin.setScheme("http://occi/tosca/"+"scalingTermMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(scalingTermMixin);
		scalingTermMixin.getDepends().add(extensionsManager.getMixinFromItsTerm("sla", "agreement_term"));
		this.mappings.put("tosca.policies.Scaling", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("sla", "agreement"),
						scalingTermMixin
			));
		
		Mixin performanceTermMixin = OCCIFactory.eINSTANCE.createMixin();
		performanceTermMixin.setName("Performance-Term");
		performanceTermMixin.setScheme("http://occi/tosca/"+"performanceTermMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(performanceTermMixin);
		performanceTermMixin.getDepends().add(extensionsManager.getMixinFromItsTerm("sla", "agreement_term"));
		this.mappings.put("tosca.policies.Performance", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("sla", "agreement"),
						performanceTermMixin.getDepends()
			));
		
		Mixin standardMixin = OCCIFactory.eINSTANCE.createMixin();
		standardMixin.setName("StandardMixin");
		standardMixin.setScheme("http://occi/tosca/"+"standardMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(standardMixin);
		this.mappings.put("tosca.interfaces.node.lifecycle.Standard", 
				new ResourceMapping(extensionsManager.getKindFromItsTerm("core", "resource"),
						standardMixin
			));
		
		this.mappings.put("tosca.relationships.AttachesTo", 
				new LinkMapping(
						extensionsManager.getKindFromItsTerm("infrastructure", "storagelink"), 
						extensionsManager.getKindFromItsTerm("infrastructure", "compute"),
						extensionsManager.getKindFromItsTerm("infrastructure", "storage"))
			);
		
		this.mappings.put("tosca.relationships.ConnectsTo", 
				new LinkMapping(
						extensionsManager.getKindFromItsTerm("core", "link"), 
						extensionsManager.getKindFromItsTerm("core", "resource"),
						extensionsManager.getKindFromItsTerm("core", "resource"))
			);
		
		this.mappings.put("tosca.relationships.DependsOn", 
				new LinkMapping(
						extensionsManager.getKindFromItsTerm("core", "link"), 
						extensionsManager.getKindFromItsTerm("core", "resource"),
						extensionsManager.getKindFromItsTerm("core", "resource"))
			);
		
		this.mappings.put("tosca.relationships.HostedOn", 
				new LinkMapping(
						extensionsManager.getKindFromItsTerm("core", "link"), 
						extensionsManager.getKindFromItsTerm("platform", "component"),
						extensionsManager.getKindFromItsTerm("core", "resource"))
			);
			
		
		this.mappings.put("tosca.relationships.RoutesTo", 
				new LinkMapping(
						extensionsManager.getKindFromItsTerm("core", "link"), 
						extensionsManager.getKindFromItsTerm("core", "resource"),
						extensionsManager.getKindFromItsTerm("core", "resource"))
			);
		
		Mixin configureMixin = OCCIFactory.eINSTANCE.createMixin();
		configureMixin.setName("ConfigureMixin");
		configureMixin.setScheme("http://occi/tosca/"+"configureMixin".replaceAll("\\.", "").toLowerCase()+"#");
		extension.getMixins().add(configureMixin);
		this.mappings.put("tosca.relationship.Configure", 
				new LinkMapping(
						extensionsManager.getKindFromItsTerm("core", "link"),
						null,
						null,
						configureMixin)						
			);
	}
	
	public boolean map(Kind kindToBeMapped) {
		Mapping mapping = mappings.get(kindToBeMapped.getName());
		if (mapping == null) {
			return false;
		}
		mapping.mapTo(kindToBeMapped);
		return true;
	}
	
	private interface Mapping {
		public void mapTo(Kind kind);
	}
	
	private class LinkMapping implements Mapping{
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
	
	private class ResourceMapping implements Mapping {
		public final Kind kind;
		public final List<Mixin> mixins;
		public ResourceMapping(Kind kind) {
			this.kind = kind;
			this.mixins = new ArrayList<>();
		}
		public ResourceMapping(Kind kind, Mixin mixin) {
			this.kind = kind;
			this.mixins = new ArrayList<>();
			this.mixins.add(mixin);
		}
		public ResourceMapping(Kind kind, List<Mixin> mixins) {
			this.kind = kind;
			this.mixins = mixins;
		}
		public void mapTo(Kind kindToBeMapped) {
			kindToBeMapped.setParent(kind);
			for (Mixin mixin : mixins) {
				mixin.getApplies().add(kindToBeMapped);
			}
		}
	}

}
