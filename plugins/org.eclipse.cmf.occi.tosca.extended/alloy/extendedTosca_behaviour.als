// Generated at Mon Mar 04 14:58:11 CET 2019 from  by org.eclipse.cmf.occi.core.gen.alloy

// ======================================================================
//
// Dynamic Semantics for fclouds 'extendedTosca'
//
// ======================================================================

module extendedTosca_behaviour

open util/boolean
open fclouds
open extendedTosca

//
// Imported extensions
//
open core
open infrastructure
open sla
open tosca
open modmacao
open platform
open placement

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_capabilities_indigo_endpoint'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_indigo_endpoint atoms.
//
pred isoTosca_capabilities_indigo_endpoint[t1, t2: Tosca_capabilities_indigo_endpoint]
{
    // Comment following lines when this is not the expected behaviour.
    t1.credential = t2.credential // same credential
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_capabilities_somecap'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_somecap atoms.
//
pred isoTosca_capabilities_somecap[t1, t2: Tosca_capabilities_somecap]
{
    // Comment following lines when this is not the expected behaviour.
    t1.type = t2.type // same type
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_capabilities_ha'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_ha atoms.
//
pred isoTosca_capabilities_ha[t1, t2: Tosca_capabilities_ha]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_capabilities_container_docker'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_container_docker atoms.
//
pred isoTosca_capabilities_container_docker[t1, t2: Tosca_capabilities_container_docker]
{
    // Comment following lines when this is not the expected behaviour.
    t1.publish_all = t2.publish_all // same publish.all
    t1.publish_ports = t2.publish_ports // same publish.ports
    t1.expose_ports = t2.expose_ports // same expose.ports
    t1.volumes = t2.volumes // same volumes
    t1.version = t2.version // same version
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_capabilities_containerchild'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_containerchild atoms.
//
pred isoTosca_capabilities_containerchild[t1, t2: Tosca_capabilities_containerchild]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_capabilities_somechildcap'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_capabilities_somechildcap atoms.
//
pred isoTosca_capabilities_somechildcap[t1, t2: Tosca_capabilities_somechildcap]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_computewithprop'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_computewithprop atoms.
//
pred isoTosca_nodes_computewithprop[t1, t2: Tosca_nodes_computewithprop]
{
    // Comment following lines when this is not the expected behaviour.
    t1.test = t2.test // same test
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_webapplication_paypalpizzastore'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_webapplication_paypalpizzastore atoms.
//
pred isoTosca_nodes_webapplication_paypalpizzastore[t1, t2: Tosca_nodes_webapplication_paypalpizzastore]
{
    // Comment following lines when this is not the expected behaviour.
    t1.github_url = t2.github_url // same github.url
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_network_network'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_network_network atoms.
//
pred isoTosca_nodes_network_network[t1, t2: Tosca_nodes_network_network]
{
    // Comment following lines when this is not the expected behaviour.
    t1.physical_network = t2.physical_network // same physical.network
    t1.segmentation_id = t2.segmentation_id // same segmentation.id
    t1.network_id = t2.network_id // same network.id
    t1.ip_version = t2.ip_version // same ip.version
    t1.start_ip = t2.start_ip // same start.ip
    t1.network_name = t2.network_name // same network.name
    t1.cidr = t2.cidr // same cidr
    t1.gateway_ip = t2.gateway_ip // same gateway.ip
    t1.network_type = t2.network_type // same network.type
    t1.end_ip = t2.end_ip // same end.ip
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_container_application_docker'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_container_application_docker atoms.
//
pred isoTosca_nodes_container_application_docker[t1, t2: Tosca_nodes_container_application_docker]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_softwarecomponent_kibana'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_softwarecomponent_kibana atoms.
//
pred isoTosca_nodes_softwarecomponent_kibana[t1, t2: Tosca_nodes_softwarecomponent_kibana]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_computewithattrlist'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_computewithattrlist atoms.
//
pred isoTosca_nodes_computewithattrlist[t1, t2: Tosca_nodes_computewithattrlist]
{
    // Comment following lines when this is not the expected behaviour.
    t1.attr_list = t2.attr_list // same attr.list
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_softwarecomponent_logstash'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_softwarecomponent_logstash atoms.
//
pred isoTosca_nodes_softwarecomponent_logstash[t1, t2: Tosca_nodes_softwarecomponent_logstash]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#example_databasesubsystem'
//
// ======================================================================

//
// Equivalence predicate between two Example_databasesubsystem atoms.
//
pred isoExample_databasesubsystem[e1, e2: Example_databasesubsystem]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_softwarecomponent_collectd'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_softwarecomponent_collectd atoms.
//
pred isoTosca_nodes_softwarecomponent_collectd[t1, t2: Tosca_nodes_softwarecomponent_collectd]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_nodewithreq'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_nodewithreq atoms.
//
pred isoTosca_nodes_nodewithreq[t1, t2: Tosca_nodes_nodewithreq]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_somenode2'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_somenode2 atoms.
//
pred isoTosca_nodes_somenode2[t1, t2: Tosca_nodes_somenode2]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_php'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_php atoms.
//
pred isoTosca_nodes_php[t1, t2: Tosca_nodes_php]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_database_mysql'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_database_mysql atoms.
//
pred isoTosca_nodes_database_mysql[t1, t2: Tosca_nodes_database_mysql]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#example_queuingsubsystem'
//
// ======================================================================

//
// Equivalence predicate between two Example_queuingsubsystem atoms.
//
pred isoExample_queuingsubsystem[e1, e2: Example_queuingsubsystem]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#example_transactionsubsystem'
//
// ======================================================================

//
// Equivalence predicate between two Example_transactionsubsystem atoms.
//
pred isoExample_transactionsubsystem[e1, e2: Example_transactionsubsystem]
{
    // Comment following lines when this is not the expected behaviour.
    e1.receiver_port = e2.receiver_port // same receiver.port
    e1.mq_service_ip = e2.mq_service_ip // same mq.service.ip
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_abstractmysql'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_abstractmysql atoms.
//
pred isoTosca_nodes_abstractmysql[t1, t2: Tosca_nodes_abstractmysql]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_mysql'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_mysql atoms.
//
pred isoTosca_nodes_mysql[t1, t2: Tosca_nodes_mysql]
{
    // Comment following lines when this is not the expected behaviour.
    t1.portMySQL = t2.portMySQL // same portMySQL
    t1.storage_path = t2.storage_path // same storage.path
    t1.db_user = t2.db_user // same db.user
    t1.bind_address = t2.bind_address // same bind.address
    t1.db_password = t2.db_password // same db.password
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_softwarecomponent_elasticsearch'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_softwarecomponent_elasticsearch atoms.
//
pred isoTosca_nodes_softwarecomponent_elasticsearch[t1, t2: Tosca_nodes_softwarecomponent_elasticsearch]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_databasewithlistparam'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_databasewithlistparam atoms.
//
pred isoTosca_nodes_databasewithlistparam[t1, t2: Tosca_nodes_databasewithlistparam]
{
    // Comment following lines when this is not the expected behaviour.
    t1.list_prop = t2.list_prop // same list.prop
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#example_someapp'
//
// ======================================================================

//
// Equivalence predicate between two Example_someapp atoms.
//
pred isoExample_someapp[e1, e2: Example_someapp]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_apache'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_apache atoms.
//
pred isoTosca_nodes_apache[t1, t2: Tosca_nodes_apache]
{
    // Comment following lines when this is not the expected behaviour.
    t1.document_root = t2.document_root // same document.root
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_nodewithcap'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_nodewithcap atoms.
//
pred isoTosca_nodes_nodewithcap[t1, t2: Tosca_nodes_nodewithcap]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#rsyslog'
//
// ======================================================================

//
// Equivalence predicate between two Rsyslog atoms.
//
pred isoRsyslog[r1, r2: Rsyslog]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_wordpress'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_wordpress atoms.
//
pred isoTosca_nodes_wordpress[t1, t2: Tosca_nodes_wordpress]
{
    // Comment following lines when this is not the expected behaviour.
    t1.zip_url = t2.zip_url // same zip.url
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_network_port'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_network_port atoms.
//
pred isoTosca_nodes_network_port[t1, t2: Tosca_nodes_network_port]
{
    // Comment following lines when this is not the expected behaviour.
    t1.ip_range_end = t2.ip_range_end // same ip.range.end
    t1.ip_range_start = t2.ip_range_start // same ip.range.start
    t1.ip_address = t2.ip_address // same ip.address
    t1.is_default = t2.is_default // same is.default
    t1.order = t2.order // same order
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_computewithcapwithattr'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_computewithcapwithattr atoms.
//
pred isoTosca_nodes_computewithcapwithattr[t1, t2: Tosca_nodes_computewithcapwithattr]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_softwarecomponent_rsyslog'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_softwarecomponent_rsyslog atoms.
//
pred isoTosca_nodes_softwarecomponent_rsyslog[t1, t2: Tosca_nodes_softwarecomponent_rsyslog]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_hacompute'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_hacompute atoms.
//
pred isoTosca_nodes_hacompute[t1, t2: Tosca_nodes_hacompute]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_somenode'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_somenode atoms.
//
pred isoTosca_nodes_somenode[t1, t2: Tosca_nodes_somenode]
{
    // Comment following lines when this is not the expected behaviour.
    t1.some_prop = t2.some_prop // same some.prop
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_webserver_nodejs'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_webserver_nodejs atoms.
//
pred isoTosca_nodes_webserver_nodejs[t1, t2: Tosca_nodes_webserver_nodejs]
{
    // Comment following lines when this is not the expected behaviour.
    t1.github_url = t2.github_url // same github.url
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_nodes_dbms_mysql'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_nodes_dbms_mysql atoms.
//
pred isoTosca_nodes_dbms_mysql[t1, t2: Tosca_nodes_dbms_mysql]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#mycompany_mytypes_myscalingpolicy'
//
// ======================================================================

//
// Equivalence predicate between two Mycompany_mytypes_myscalingpolicy atoms.
//
pred isoMycompany_mytypes_myscalingpolicy[m1, m2: Mycompany_mytypes_myscalingpolicy]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#test_relation_connects'
//
// ======================================================================

//
// Equivalence predicate between two Test_relation_connects atoms.
//
pred isoTest_relation_connects[t1, t2: Test_relation_connects]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_relationships_network_bindsto'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_relationships_network_bindsto atoms.
//
pred isoTosca_relationships_network_bindsto[t1, t2: Tosca_relationships_network_bindsto]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_relationships_ha'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_relationships_ha atoms.
//
pred isoTosca_relationships_ha[t1, t2: Tosca_relationships_ha]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#myattachesto'
//
// ======================================================================

//
// Equivalence predicate between two Myattachesto atoms.
//
pred isoMyattachesto[m1, m2: Myattachesto]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/extended#tosca_relationships_network_linksto'
//
// ======================================================================

//
// Equivalence predicate between two Tosca_relationships_network_linksto atoms.
//
pred isoTosca_relationships_network_linksto[t1, t2: Tosca_relationships_network_linksto]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

