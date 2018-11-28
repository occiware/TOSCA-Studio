// Generated at Wed Nov 28 22:59:40 CET 2018 from  by org.eclipse.cmf.occi.core.gen.alloy

// ======================================================================
//
// Dynamic Semantics for fclouds 'tosca'
//
// ======================================================================

module tosca_behaviour

open util/boolean
open fclouds
open tosca

//
// Imported extensions
//
open core
open infrastructure
open platform
open sla

// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_root'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_root atoms.
//
pred isoTosca_capabilities_root[t1, t2: Tosca_capabilities_root]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_node'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_node atoms.
//
pred isoTosca_capabilities_node[t1, t2: Tosca_capabilities_node]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_endpoint'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_endpoint atoms.
//
pred isoTosca_capabilities_endpoint[t1, t2: Tosca_capabilities_endpoint]
{
    // Comment following lines when this is not the expected behaviour.
    t1.port_name = t2.port_name // same port.name
    t1.protocol = t2.protocol // same protocol
    t1.port = t2.port // same port
    t1.initiator = t2.initiator // same initiator
    t1.network_name = t2.network_name // same network.name
    t1.secure = t2.secure // same secure
    t1.ports = t2.ports // same ports
    t1.url_path = t2.url_path // same url.path
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_scalable'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_scalable atoms.
//
pred isoTosca_capabilities_scalable[t1, t2: Tosca_capabilities_scalable]
{
    // Comment following lines when this is not the expected behaviour.
    t1.min_instances = t2.min_instances // same min.instances
    t1.max_instances = t2.max_instances // same max.instances
    t1.default_instances = t2.default_instances // same default.instances
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_network_bindable'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_network_bindable atoms.
//
pred isoTosca_capabilities_network_bindable[t1, t2: Tosca_capabilities_network_bindable]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_container'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_container atoms.
//
pred isoTosca_capabilities_container[t1, t2: Tosca_capabilities_container]
{
    // Comment following lines when this is not the expected behaviour.
    t1.disk_size = t2.disk_size // same disk.size
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_endpoint_database'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_endpoint_database atoms.
//
pred isoTosca_capabilities_endpoint_database[t1, t2: Tosca_capabilities_endpoint_database]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_endpoint_public'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_endpoint_public atoms.
//
pred isoTosca_capabilities_endpoint_public[t1, t2: Tosca_capabilities_endpoint_public]
{
    // Comment following lines when this is not the expected behaviour.
    t1.floating = t2.floating // same floating
    t1.dns_name = t2.dns_name // same dns.name
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_endpoint_admin'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_endpoint_admin atoms.
//
pred isoTosca_capabilities_endpoint_admin[t1, t2: Tosca_capabilities_endpoint_admin]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_operatingsystem'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_operatingsystem atoms.
//
pred isoTosca_capabilities_operatingsystem[t1, t2: Tosca_capabilities_operatingsystem]
{
    // Comment following lines when this is not the expected behaviour.
    t1.type = t2.type // same type
    t1.distribution = t2.distribution // same distribution
    t1.version = t2.version // same version
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_capabilities_attachment'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_attachment atoms.
//
pred isoTosca_capabilities_attachment[t1, t2: Tosca_capabilities_attachment]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_root'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_root atoms.
//
pred isoTosca_nodes_root[t1, t2: Tosca_nodes_root]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_webapplication'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_webapplication atoms.
//
pred isoTosca_nodes_webapplication[t1, t2: Tosca_nodes_webapplication]
{
    // Comment following lines when this is not the expected behaviour.
    t1.context_root = t2.context_root // same context.root
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_softwarecomponent'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_softwarecomponent atoms.
//
pred isoTosca_nodes_softwarecomponent[t1, t2: Tosca_nodes_softwarecomponent]
{
    // Comment following lines when this is not the expected behaviour.
    t1.admin_credential = t2.admin_credential // same admin.credential
    t1.component_version = t2.component_version // same component.version
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_dbms'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_dbms atoms.
//
pred isoTosca_nodes_dbms[t1, t2: Tosca_nodes_dbms]
{
    // Comment following lines when this is not the expected behaviour.
    t1.port = t2.port // same port
    t1.root_password = t2.root_password // same root.password
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_objectstorage'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_objectstorage atoms.
//
pred isoTosca_nodes_objectstorage[t1, t2: Tosca_nodes_objectstorage]
{
    // Comment following lines when this is not the expected behaviour.
    t1.size = t2.size // same size
    t1.name = t2.name // same name
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_compute'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_compute atoms.
//
pred isoTosca_nodes_compute[t1, t2: Tosca_nodes_compute]
{
    // Comment following lines when this is not the expected behaviour.
    t1.private_address = t2.private_address // same private.address
    t1.public_address = t2.public_address // same public.address
    t1.networks = t2.networks // same networks
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_loadbalancer'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_loadbalancer atoms.
//
pred isoTosca_nodes_loadbalancer[t1, t2: Tosca_nodes_loadbalancer]
{
    // Comment following lines when this is not the expected behaviour.
    t1.algorithm = t2.algorithm // same algorithm
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_webserver'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_webserver atoms.
//
pred isoTosca_nodes_webserver[t1, t2: Tosca_nodes_webserver]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_database'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_database atoms.
//
pred isoTosca_nodes_database[t1, t2: Tosca_nodes_database]
{
    // Comment following lines when this is not the expected behaviour.
    t1.password = t2.password // same password
    t1.name = t2.name // same name
    t1.user = t2.user // same user
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_container_application'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_container_application atoms.
//
pred isoTosca_nodes_container_application[t1, t2: Tosca_nodes_container_application]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_container_runtime'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_container_runtime atoms.
//
pred isoTosca_nodes_container_runtime[t1, t2: Tosca_nodes_container_runtime]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_nodes_blockstorage'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_blockstorage atoms.
//
pred isoTosca_nodes_blockstorage[t1, t2: Tosca_nodes_blockstorage]
{
    // Comment following lines when this is not the expected behaviour.
    t1.volume_id = t2.volume_id // same volume.id
    t1.snapshot_id = t2.snapshot_id // same snapshot.id
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_policies_root'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_policies_root atoms.
//
pred isoTosca_policies_root[t1, t2: Tosca_policies_root]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_policies_update'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_policies_update atoms.
//
pred isoTosca_policies_update[t1, t2: Tosca_policies_update]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_policies_placement'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_policies_placement atoms.
//
pred isoTosca_policies_placement[t1, t2: Tosca_policies_placement]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_policies_scaling'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_policies_scaling atoms.
//
pred isoTosca_policies_scaling[t1, t2: Tosca_policies_scaling]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_policies_performance'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_policies_performance atoms.
//
pred isoTosca_policies_performance[t1, t2: Tosca_policies_performance]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_groups_root'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_groups_root atoms.
//
pred isoTosca_groups_root[t1, t2: Tosca_groups_root]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_interfaces_root'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_interfaces_root atoms.
//
pred isoTosca_interfaces_root[t1, t2: Tosca_interfaces_root]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_interfaces_relationship_configure'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_interfaces_relationship_configure atoms.
//
pred isoTosca_interfaces_relationship_configure[t1, t2: Tosca_interfaces_relationship_configure]
{
    // Comment following lines when this is not the expected behaviour.
}

//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_relationship_configure/action#pre_configure_source'
//



//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_relationship_configure/action#pre_configure_target'
//



//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_relationship_configure/action#post_configure_source'
//



//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_relationship_configure/action#post_configure_target'
//



//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_relationship_configure/action#remove_target'
//



//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_relationship_configure/action#add_target'
//



//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_relationship_configure/action#add_source'
//



//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_relationship_configure/action#target_changed'
//




// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_interfaces_node_lifecycle_standard'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_interfaces_node_lifecycle_standard atoms.
//
pred isoTosca_interfaces_node_lifecycle_standard[t1, t2: Tosca_interfaces_node_lifecycle_standard]
{
    // Comment following lines when this is not the expected behaviour.
}

//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_node_lifecycle_standard/action#create'
//



//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_node_lifecycle_standard/action#configure'
//



//
// OCCI Action 'http://org.occi/tosca/tosca_interfaces_node_lifecycle_standard/action#delete'
//




// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_relationships_root'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_relationships_root atoms.
//
pred isoTosca_relationships_root[t1, t2: Tosca_relationships_root]
{
    // Comment following lines when this is not the expected behaviour.
    t1.tosca_name = t2.tosca_name // same tosca.name
    t1.state = t2.state // same state
    t1.tosca_id = t2.tosca_id // same tosca.id
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_relationships_connectsto'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_relationships_connectsto atoms.
//
pred isoTosca_relationships_connectsto[t1, t2: Tosca_relationships_connectsto]
{
    // Comment following lines when this is not the expected behaviour.
    t1.credential = t2.credential // same credential
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_relationships_routesto'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_relationships_routesto atoms.
//
pred isoTosca_relationships_routesto[t1, t2: Tosca_relationships_routesto]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_relationships_attachesto'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_relationships_attachesto atoms.
//
pred isoTosca_relationships_attachesto[t1, t2: Tosca_relationships_attachesto]
{
    // Comment following lines when this is not the expected behaviour.
    t1.location = t2.location // same location
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_relationships_hostedon'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_relationships_hostedon atoms.
//
pred isoTosca_relationships_hostedon[t1, t2: Tosca_relationships_hostedon]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://org.occi/tosca#tosca_relationships_dependson'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_relationships_dependson atoms.
//
pred isoTosca_relationships_dependson[t1, t2: Tosca_relationships_dependson]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

