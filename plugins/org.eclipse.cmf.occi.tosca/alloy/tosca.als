// Generated at Mon Mar 04 14:57:53 CET 2019 from  by org.eclipse.cmf.occi.core.gen.alloy

// ======================================================================
//
// Static Semantics for fclouds 'tosca'
//
// ======================================================================

module tosca

open util/boolean
open fclouds

// ======================================================================
//
// Imported extensions
//
// ======================================================================

open core
open infrastructure
open sla
open modmacao
open platform
open placement

// ======================================================================
//
// fclouds extension 'tosca'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "tosca"
    scheme = "http://schemas.ogf.org/tosca/core#"
    import = core/extension + infrastructure/extension + sla/extension + modmacao/extension + platform/extension + placement/extension
    no kinds
    mixins = tosca_capabilities_root + tosca_capabilities_node + tosca_capabilities_endpoint + tosca_capabilities_scalable + tosca_capabilities_network_bindable + tosca_capabilities_container + tosca_capabilities_endpoint_database + tosca_capabilities_endpoint_public + tosca_capabilities_endpoint_admin + tosca_capabilities_operatingsystem + tosca_capabilities_attachment + tosca_nodes_root + tosca_nodes_webapplication + tosca_nodes_softwarecomponent + tosca_nodes_dbms + tosca_nodes_objectstorage + tosca_nodes_compute + tosca_nodes_loadbalancer + tosca_nodes_webserver + tosca_nodes_database + tosca_nodes_container_application + tosca_nodes_container_runtime + tosca_nodes_blockstorage + tosca_policies_root + tosca_policies_update + tosca_policies_placement + tosca_policies_scaling + tosca_policies_performance + tosca_groups_root + tosca_interfaces_root + tosca_interfaces_relationship_configure + tosca_interfaces_node_lifecycle_standard + tosca_relationships_root + tosca_relationships_connectsto + tosca_relationships_routesto + tosca_relationships_attachesto + tosca_relationships_hostedon + tosca_relationships_dependson
    types = string_DataType + stringMinOne_DataType + boolean_DataType + byte_DataType + double_DataType + float_DataType + integer_DataType + integerMinOne_DataType + integerMinZero_DataType + long_DataType + short_DataType + map_DataType + version_DataType + range_DataType + toscadatatypesnetworkPortDef_DataType + scalarFrequency_DataType + scalarSizeMinOneMB_DataType + scalarSizeMinZeroGB_DataType + scalarSizeMinZeroMB_DataType + arraystring_DataType + NetworkInfo_DataType + PortInfo_DataType + Credential_DataType + protocolEnum_DataType + PortSpec_DataType + initiatorEnum_DataType
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_root'
//
// ======================================================================

one sig tosca_capabilities_root extends Mixin {} {
    term = "tosca_capabilities_root"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This is the default (root) TOSCA Capability Type definition that all other TOSCA Capability Types derive from."
    no depends
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_capabilities_root
}

// ======================================================================
// Signature for Tosca_capabilities_root
// ======================================================================

sig Tosca_capabilities_root in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_node'
//
// ======================================================================

one sig tosca_capabilities_node extends Mixin {} {
    term = "tosca_capabilities_node"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The Node capability indicates the base capabilities of a TOSCA Node Type."
    depends = tosca_capabilities_root
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_capabilities_node
}

// ======================================================================
// Signature for Tosca_capabilities_node
// ======================================================================

sig Tosca_capabilities_node in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_endpoint'
//
// ======================================================================

one sig tosca_capabilities_endpoint extends Mixin {} {
    term = "tosca_capabilities_endpoint"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This is the default TOSCA type that should be used or extended to define a network endpoint capability. This includes the information to express a basic endpoint with a single port or a complex endpoint with multiple ports. By default the Endpoint is assumed to represent an address on a private network unless otherwise specified."
    depends = tosca_capabilities_root
    no applies
    attributes = tosca_capabilities_endpoint_port_name + tosca_capabilities_endpoint_protocol + tosca_capabilities_endpoint_port + tosca_capabilities_endpoint_initiator + tosca_capabilities_endpoint_network_name + tosca_capabilities_endpoint_secure + tosca_capabilities_endpoint_ports + tosca_capabilities_endpoint_url_path
    no actions
    entities.Time in this/Tosca_capabilities_endpoint
}

//
// OCCI attribute 'port.name'
//
one sig tosca_capabilities_endpoint_port_name extends Attribute {} {
    name = "port.name"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "The optional name (or ID) of the network port this endpoint should be bound to."
    multiple_values = False
}

//
// OCCI attribute 'protocol'
//
one sig tosca_capabilities_endpoint_protocol extends Attribute {} {
    name = "protocol"
    type = string_DataType
    mutable = True
    required = False
    default = "tcp"
    description = "The name of the protocol (i.e., the protocol prefix) that the endpoint accepts (any OSI Layer 4-7 protocols) Examples: http, https, ftp, tcp, udp, etc."
    multiple_values = False
}

//
// OCCI attribute 'port'
//
one sig tosca_capabilities_endpoint_port extends Attribute {} {
    name = "port"
    type = toscadatatypesnetworkPortDef_DataType
    mutable = True
    required = False
    no default
    description = "The optional port of the endpoint."
    multiple_values = False
}

//
// OCCI attribute 'initiator'
//
one sig tosca_capabilities_endpoint_initiator extends Attribute {} {
    name = "initiator"
    type = initiatorEnum_DataType
    mutable = True
    required = False
    default = "source"
    description = "The optional indicator of the direction of the connection."
    multiple_values = False
}

//
// OCCI attribute 'network.name'
//
one sig tosca_capabilities_endpoint_network_name extends Attribute {} {
    name = "network.name"
    type = string_DataType
    mutable = True
    required = False
    default = "PRIVATE"
    description = "The optional name (or ID) of the network this endpoint should be bound to. network_name: PRIVATE | PUBLIC |<network_name> | <network_id>"
    multiple_values = False
}

//
// OCCI attribute 'secure'
//
one sig tosca_capabilities_endpoint_secure extends Attribute {} {
    name = "secure"
    type = boolean_DataType
    mutable = True
    required = False
    default = "false"
    description = "Requests for the endpoint to be secure and use credentials supplied on the ConnectsTo relationship."
    multiple_values = False
}

//
// OCCI attribute 'ports'
//
one sig tosca_capabilities_endpoint_ports extends Attribute {} {
    name = "ports"
    type = map_DataType
    mutable = True
    required = False
    no default
    description = "The optional map of ports the Endpoint supports (if more than one)."
    multiple_values = False
}

//
// OCCI attribute 'url.path'
//
one sig tosca_capabilities_endpoint_url_path extends Attribute {} {
    name = "url.path"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "The optional URL path of the endpointâ€™s address if applicable for the protocol."
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_capabilities_endpoint
// ======================================================================

sig Tosca_capabilities_endpoint in core/Entity {
    port_name : lone string,
    protocol : lone string,
    port : lone toscadatatypesnetworkPortDef,
    initiator : lone initiatorEnum,
    network_name : lone string,
    secure : lone boolean,
    ports : lone map,
    url_path : lone string,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_scalable'
//
// ======================================================================

one sig tosca_capabilities_scalable extends Mixin {} {
    term = "tosca_capabilities_scalable"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This is the default TOSCA type that should be used to express a scalability capability for a node."
    depends = tosca_capabilities_root
    no applies
    attributes = tosca_capabilities_scalable_min_instances + tosca_capabilities_scalable_max_instances + tosca_capabilities_scalable_default_instances
    no actions
    entities.Time in this/Tosca_capabilities_scalable
}

//
// OCCI attribute 'min.instances'
//
one sig tosca_capabilities_scalable_min_instances extends Attribute {} {
    name = "min.instances"
    type = integer_DataType
    mutable = True
    required = False
    default = "1"
    description = "This property is used to indicate the minimum number of instances that should be created for the associated TOSCA Node Template by a TOSCA orchestrator."
    multiple_values = False
}

//
// OCCI attribute 'max.instances'
//
one sig tosca_capabilities_scalable_max_instances extends Attribute {} {
    name = "max.instances"
    type = integer_DataType
    mutable = True
    required = False
    default = "1"
    description = "This property is used to indicate the maximum number of instances that should be created for the associated TOSCA Node Template by a TOSCA orchestrator."
    multiple_values = False
}

//
// OCCI attribute 'default.instances'
//
one sig tosca_capabilities_scalable_default_instances extends Attribute {} {
    name = "default.instances"
    type = integer_DataType
    mutable = True
    required = False
    default = "1"
    description = "An optional property that indicates the requested default number of instances that should be the starting number of instances a TOSCA orchestrator should attempt to allocate. Note: The value for this property MUST be in the range between the values set for â€˜min_instancesâ€™ and â€˜max_instancesâ€™ properties."
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_capabilities_scalable
// ======================================================================

sig Tosca_capabilities_scalable in core/Entity {
    min_instances : lone integer,
    max_instances : lone integer,
    default_instances : lone integer,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_network_bindable'
//
// ======================================================================

one sig tosca_capabilities_network_bindable extends Mixin {} {
    term = "tosca_capabilities_network_bindable"
    scheme = "http://schemas.ogf.org/tosca/core#"
    no title
    depends = tosca_capabilities_node
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_capabilities_network_bindable
}

// ======================================================================
// Signature for Tosca_capabilities_network_bindable
// ======================================================================

sig Tosca_capabilities_network_bindable in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_container'
//
// ======================================================================

one sig tosca_capabilities_container extends Mixin {} {
    term = "tosca_capabilities_container"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The Container capability, when included on a Node Type or Template definition, indicates that the node can act as a container for (or a host for) one or more other declared Node Types."
    depends = tosca_capabilities_root
    no applies
    attributes = tosca_capabilities_container_disk_size
    no actions
    entities.Time in this/Tosca_capabilities_container
}

//
// OCCI attribute 'disk.size'
//
one sig tosca_capabilities_container_disk_size extends Attribute {} {
    name = "disk.size"
    type = scalarSizeMinZeroMB_DataType
    mutable = True
    required = False
    no default
    description = "Size of the local disk available to applications running on the Compute node (default unit is MB)."
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_capabilities_container
// ======================================================================

sig Tosca_capabilities_container in core/Entity {
    disk_size : lone scalarSizeMinZeroMB,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_endpoint_database'
//
// ======================================================================

one sig tosca_capabilities_endpoint_database extends Mixin {} {
    term = "tosca_capabilities_endpoint_database"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This is the default TOSCA type that should be used or extended to define a specialized database endpoint capability."
    depends = tosca_capabilities_endpoint
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_capabilities_endpoint_database
}

// ======================================================================
// Signature for Tosca_capabilities_endpoint_database
// ======================================================================

sig Tosca_capabilities_endpoint_database in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_endpoint_public'
//
// ======================================================================

one sig tosca_capabilities_endpoint_public extends Mixin {} {
    term = "tosca_capabilities_endpoint_public"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This capability represents a public endpoint which is accessible to the general internet (and its public IP address ranges). This public endpoint capability also can be used to create a floating (IP) address that the underlying network assigns from a pool allocated from the applicationâ€™s underlying public network.  This floating address is managed by the underlying network such that can be routed an applicationâ€™s private address and remains reliable to internet clients."
    depends = tosca_capabilities_endpoint
    no applies
    attributes = tosca_capabilities_endpoint_public_floating + tosca_capabilities_endpoint_public_dns_name
    no actions
    entities.Time in this/Tosca_capabilities_endpoint_public
}

//
// OCCI attribute 'floating'
//
one sig tosca_capabilities_endpoint_public_floating extends Attribute {} {
    name = "floating"
    type = boolean_DataType
    mutable = True
    required = False
    default = "false"
    description = "Indicates that the public address should be allocated from a pool of floating IPs that are associated with the network."
    multiple_values = False
}

//
// OCCI attribute 'dns.name'
//
one sig tosca_capabilities_endpoint_public_dns_name extends Attribute {} {
    name = "dns.name"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "The optional name to register with DNS"
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_capabilities_endpoint_public
// ======================================================================

sig Tosca_capabilities_endpoint_public in core/Entity {
    floating : lone boolean,
    dns_name : lone string,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_endpoint_admin'
//
// ======================================================================

one sig tosca_capabilities_endpoint_admin extends Mixin {} {
    term = "tosca_capabilities_endpoint_admin"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This is the default TOSCA type that should be used or extended to define a specialized administrator endpoint capability."
    depends = tosca_capabilities_endpoint
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_capabilities_endpoint_admin
}

// ======================================================================
// Signature for Tosca_capabilities_endpoint_admin
// ======================================================================

sig Tosca_capabilities_endpoint_admin in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_operatingsystem'
//
// ======================================================================

one sig tosca_capabilities_operatingsystem extends Mixin {} {
    term = "tosca_capabilities_operatingsystem"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This is the default TOSCA type that should be used to express an Operating System capability for a node."
    depends = tosca_capabilities_root
    no applies
    attributes = tosca_capabilities_operatingsystem_type + tosca_capabilities_operatingsystem_distribution + tosca_capabilities_operatingsystem_version
    no actions
    entities.Time in this/Tosca_capabilities_operatingsystem
}

//
// OCCI attribute 'type'
//
one sig tosca_capabilities_operatingsystem_type extends Attribute {} {
    name = "type"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "The Operating System (OS) type. Examples of valid values include: linux, aix, mac, windows, etc."
    multiple_values = False
}

//
// OCCI attribute 'distribution'
//
one sig tosca_capabilities_operatingsystem_distribution extends Attribute {} {
    name = "distribution"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "The Operating System (OS) distribution. Examples of valid values for an â€œtypeâ€� of â€œLinuxâ€� would include:  debian, fedora, rhel and ubuntu."
    multiple_values = False
}

//
// OCCI attribute 'version'
//
one sig tosca_capabilities_operatingsystem_version extends Attribute {} {
    name = "version"
    type = version_DataType
    mutable = True
    required = False
    no default
    description = "The Operating System version."
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_capabilities_operatingsystem
// ======================================================================

sig Tosca_capabilities_operatingsystem in core/Entity {
    type : lone string,
    distribution : lone string,
    version : lone version,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_capabilities_attachment'
//
// ======================================================================

one sig tosca_capabilities_attachment extends Mixin {} {
    term = "tosca_capabilities_attachment"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This is the default TOSCA type that should be used or extended to define an attachment capability of a (logical) infrastructure device node (e.g., BlockStorage node)."
    depends = tosca_capabilities_root
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_capabilities_attachment
}

// ======================================================================
// Signature for Tosca_capabilities_attachment
// ======================================================================

sig Tosca_capabilities_attachment in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_root'
//
// ======================================================================

one sig tosca_nodes_root extends Mixin {} {
    term = "tosca_nodes_root"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This is the default (root) TOSCA Node Type that all other TOSCA nodes should extends. This allows all TOSCA nodes to have a consistent set of features for modeling and management (e.g, consistent definitions for requirements, capabilities, and lifecycle interfaces)."
    depends = tosca_capabilities_node + tosca_interfaces_node_lifecycle_standard
    applies = core/resource
    no attributes
    no actions
    entities.Time in this/Tosca_nodes_root
}

// ======================================================================
// Signature for Tosca_nodes_root
// ======================================================================

sig Tosca_nodes_root in core/Resource {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_webapplication'
//
// ======================================================================

one sig tosca_nodes_webapplication extends Mixin {} {
    term = "tosca_nodes_webapplication"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA WebApplication node represents a software application that can be managed and run by a TOSCA WebServer node. Specific types of web applications such as Java, etc. could be derived from this type."
    depends = tosca_nodes_root + tosca_capabilities_endpoint
    applies = platform/component
    attributes = tosca_nodes_webapplication_context_root
    no actions
    entities.Time in this/Tosca_nodes_webapplication
}

//
// OCCI attribute 'context.root'
//
one sig tosca_nodes_webapplication_context_root extends Attribute {} {
    name = "context.root"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "The web applicationâ€™s context root which designates the applicationâ€™s URL path within the web server it is hosted on."
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_nodes_webapplication
// ======================================================================

sig Tosca_nodes_webapplication in platform/Component {
    context_root : lone string,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_softwarecomponent'
//
// ======================================================================

one sig tosca_nodes_softwarecomponent extends Mixin {} {
    term = "tosca_nodes_softwarecomponent"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA SoftwareComponent node represents a generic software component that can be managed and run by a TOSCA Compute Node Type."
    depends = tosca_nodes_root
    applies = platform/component
    attributes = tosca_nodes_softwarecomponent_admin_credential + tosca_nodes_softwarecomponent_component_version
    no actions
    entities.Time in this/Tosca_nodes_softwarecomponent
}

//
// OCCI attribute 'admin.credential'
//
one sig tosca_nodes_softwarecomponent_admin_credential extends Attribute {} {
    name = "admin.credential"
    type = Credential_DataType
    mutable = True
    required = False
    no default
    description = "The optional credential that can be used to authenticate to the software component."
    multiple_values = False
}

//
// OCCI attribute 'component.version'
//
one sig tosca_nodes_softwarecomponent_component_version extends Attribute {} {
    name = "component.version"
    type = version_DataType
    mutable = True
    required = False
    no default
    description = "The optional software componentâ€™s version."
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_nodes_softwarecomponent
// ======================================================================

sig Tosca_nodes_softwarecomponent in platform/Component {
    admin_credential : lone Credential,
    component_version : lone version,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_dbms'
//
// ======================================================================

one sig tosca_nodes_dbms extends Mixin {} {
    term = "tosca_nodes_dbms"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA DBMS node represents a typical relational, SQL Database Management System software component or service."
    depends = tosca_nodes_softwarecomponent + tosca_capabilities_container
    no applies
    attributes = tosca_nodes_dbms_port + tosca_nodes_dbms_root_password
    no actions
    entities.Time in this/Tosca_nodes_dbms
}

//
// OCCI attribute 'port'
//
one sig tosca_nodes_dbms_port extends Attribute {} {
    name = "port"
    type = integer_DataType
    mutable = True
    required = False
    no default
    description = "the port the DBMS service will listen to for data and requests"
    multiple_values = False
}

//
// OCCI attribute 'root.password'
//
one sig tosca_nodes_dbms_root_password extends Attribute {} {
    name = "root.password"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "the optional root password for the DBMS service"
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_nodes_dbms
// ======================================================================

sig Tosca_nodes_dbms in core/Entity {
    port : lone integer,
    root_password : lone string,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_objectstorage'
//
// ======================================================================

one sig tosca_nodes_objectstorage extends Mixin {} {
    term = "tosca_nodes_objectstorage"
    scheme = "http://schemas.ogf.org/tosca/core#"
    no title
    depends = tosca_nodes_root + tosca_capabilities_endpoint
    applies = infrastructure/storage
    attributes = tosca_nodes_objectstorage_size + tosca_nodes_objectstorage_name
    no actions
    entities.Time in this/Tosca_nodes_objectstorage
}

//
// OCCI attribute 'size'
//
one sig tosca_nodes_objectstorage_size extends Attribute {} {
    name = "size"
    type = scalarSizeMinZeroGB_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'name'
//
one sig tosca_nodes_objectstorage_name extends Attribute {} {
    name = "name"
    type = string_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_nodes_objectstorage
// ======================================================================

sig Tosca_nodes_objectstorage in infrastructure/Storage {
    size : lone scalarSizeMinZeroGB,
    name : one string,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_compute'
//
// ======================================================================

one sig tosca_nodes_compute extends Mixin {} {
    term = "tosca_nodes_compute"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Compute node represents one or more real or virtual processors of software applications or services along with other essential local resources. Collectively, the resources the compute node represents can logically be viewed as a (real or virtual) â€œserverâ€�."
    depends = tosca_nodes_root + tosca_capabilities_scalable + tosca_capabilities_endpoint_admin + tosca_capabilities_operatingsystem + tosca_capabilities_container + tosca_capabilities_network_bindable
    applies = infrastructure/compute
    attributes = tosca_nodes_compute_private_address + tosca_nodes_compute_public_address + tosca_nodes_compute_networks
    no actions
    entities.Time in this/Tosca_nodes_compute
}

//
// OCCI attribute 'private.address'
//
one sig tosca_nodes_compute_private_address extends Attribute {} {
    name = "private.address"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "The primary private IP address assigned by the cloud provider that applications may use to access the Compute node."
    multiple_values = False
}

//
// OCCI attribute 'public.address'
//
one sig tosca_nodes_compute_public_address extends Attribute {} {
    name = "public.address"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "The primary public IP address assigned by the cloud provider that applications may use to access the Compute node."
    multiple_values = False
}

//
// OCCI attribute 'networks'
//
one sig tosca_nodes_compute_networks extends Attribute {} {
    name = "networks"
    type = map_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_nodes_compute
// ======================================================================

sig Tosca_nodes_compute in infrastructure/Compute {
    private_address : lone string,
    public_address : lone string,
    networks : lone map,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_loadbalancer'
//
// ======================================================================

one sig tosca_nodes_loadbalancer extends Mixin {} {
    term = "tosca_nodes_loadbalancer"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Load Balancer node represents logical function that be used in conjunction with a Floating Address to distribute an applicationâ€™s traffic (load) across a number of instances of the application (e.g., for a clustered or scaled application)."
    depends = tosca_nodes_root + tosca_capabilities_endpoint_public
    no applies
    attributes = tosca_nodes_loadbalancer_algorithm
    no actions
    entities.Time in this/Tosca_nodes_loadbalancer
}

//
// OCCI attribute 'algorithm'
//
one sig tosca_nodes_loadbalancer_algorithm extends Attribute {} {
    name = "algorithm"
    type = string_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_nodes_loadbalancer
// ======================================================================

sig Tosca_nodes_loadbalancer in core/Entity {
    algorithm : lone string,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_webserver'
//
// ======================================================================

one sig tosca_nodes_webserver extends Mixin {} {
    term = "tosca_nodes_webserver"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This TOSCA WebServer Node Type represents an abstract software component or service that is capable of hosting and providing management operations for one or more WebApplication nodes."
    depends = tosca_nodes_softwarecomponent + tosca_capabilities_endpoint + tosca_capabilities_endpoint_admin + tosca_capabilities_container
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_nodes_webserver
}

// ======================================================================
// Signature for Tosca_nodes_webserver
// ======================================================================

sig Tosca_nodes_webserver in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_database'
//
// ======================================================================

one sig tosca_nodes_database extends Mixin {} {
    term = "tosca_nodes_database"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Database node represents a logical database that can be managed and hosted by a TOSCA DBMS node."
    depends = tosca_nodes_root + tosca_capabilities_endpoint_database
    applies = platform/component
    attributes = tosca_nodes_database_password + tosca_nodes_database_name + tosca_nodes_database_user
    no actions
    entities.Time in this/Tosca_nodes_database
}

//
// OCCI attribute 'password'
//
one sig tosca_nodes_database_password extends Attribute {} {
    name = "password"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "the optional password for the DB user account"
    multiple_values = False
}

//
// OCCI attribute 'name'
//
one sig tosca_nodes_database_name extends Attribute {} {
    name = "name"
    type = string_DataType
    mutable = True
    required = True
    no default
    description = "the logical name of the database"
    multiple_values = False
}

//
// OCCI attribute 'user'
//
one sig tosca_nodes_database_user extends Attribute {} {
    name = "user"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "the optional user account name for DB administration"
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_nodes_database
// ======================================================================

sig Tosca_nodes_database in platform/Component {
    password : lone string,
    name : one string,
    user : lone string,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_container_application'
//
// ======================================================================

one sig tosca_nodes_container_application extends Mixin {} {
    term = "tosca_nodes_container_application"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Container Application node represents an application that requires Container-level virtualization technology."
    depends = tosca_nodes_root
    applies = platform/component
    no attributes
    no actions
    entities.Time in this/Tosca_nodes_container_application
}

// ======================================================================
// Signature for Tosca_nodes_container_application
// ======================================================================

sig Tosca_nodes_container_application in platform/Component {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_container_runtime'
//
// ======================================================================

one sig tosca_nodes_container_runtime extends Mixin {} {
    term = "tosca_nodes_container_runtime"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Container Runtime node represents operating system-level virtualization technology used to run multiple application services on a single Compute host."
    depends = tosca_nodes_softwarecomponent + tosca_capabilities_scalable + tosca_capabilities_container
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_nodes_container_runtime
}

// ======================================================================
// Signature for Tosca_nodes_container_runtime
// ======================================================================

sig Tosca_nodes_container_runtime in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_nodes_blockstorage'
//
// ======================================================================

one sig tosca_nodes_blockstorage extends Mixin {} {
    term = "tosca_nodes_blockstorage"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA BlockStorage node currently represents a server-local block storage device (i.e., not shared) offering evenly sized blocks of data from which raw storage volumes can be created."
    depends = tosca_nodes_root + tosca_capabilities_attachment
    applies = infrastructure/storage
    attributes = tosca_nodes_blockstorage_volume_id + tosca_nodes_blockstorage_snapshot_id
    no actions
    entities.Time in this/Tosca_nodes_blockstorage
}

//
// OCCI attribute 'volume.id'
//
one sig tosca_nodes_blockstorage_volume_id extends Attribute {} {
    name = "volume.id"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "ID of an existing volume (that is in the accessible scope of the requesting application)."
    multiple_values = False
}

//
// OCCI attribute 'snapshot.id'
//
one sig tosca_nodes_blockstorage_snapshot_id extends Attribute {} {
    name = "snapshot.id"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "Some identifier that represents an existing snapshot that should be used when creating the block storage (volume)."
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_nodes_blockstorage
// ======================================================================

sig Tosca_nodes_blockstorage in infrastructure/Storage {
    volume_id : lone string,
    snapshot_id : lone string,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_policies_root'
//
// ======================================================================

one sig tosca_policies_root extends Mixin {} {
    term = "tosca_policies_root"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Policy Type all other TOSCA Policy Types derive from"
    depends = sla/agreement_term
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_policies_root
}

// ======================================================================
// Signature for Tosca_policies_root
// ======================================================================

sig Tosca_policies_root in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_policies_update'
//
// ======================================================================

one sig tosca_policies_update extends Mixin {} {
    term = "tosca_policies_update"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Policy Type definition that is used to govern update of TOSCA nodes or groups of nodes."
    depends = tosca_policies_root
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_policies_update
}

// ======================================================================
// Signature for Tosca_policies_update
// ======================================================================

sig Tosca_policies_update in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_policies_placement'
//
// ======================================================================

one sig tosca_policies_placement extends Mixin {} {
    term = "tosca_policies_placement"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Policy Type definition that is used to govern placement of TOSCA nodes or groups of nodes."
    depends = tosca_policies_root
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_policies_placement
}

// ======================================================================
// Signature for Tosca_policies_placement
// ======================================================================

sig Tosca_policies_placement in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_policies_scaling'
//
// ======================================================================

one sig tosca_policies_scaling extends Mixin {} {
    term = "tosca_policies_scaling"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Policy Type definition that is used to govern scaling of TOSCA nodes or groups of nodes."
    depends = tosca_policies_root
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_policies_scaling
}

// ======================================================================
// Signature for Tosca_policies_scaling
// ======================================================================

sig Tosca_policies_scaling in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_policies_performance'
//
// ======================================================================

one sig tosca_policies_performance extends Mixin {} {
    term = "tosca_policies_performance"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Policy Type definition that is used to declare performance requirements for TOSCA nodes or groups of nodes."
    depends = tosca_policies_root
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_policies_performance
}

// ======================================================================
// Signature for Tosca_policies_performance
// ======================================================================

sig Tosca_policies_performance in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_groups_root'
//
// ======================================================================

one sig tosca_groups_root extends Mixin {} {
    term = "tosca_groups_root"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA Group Type all other TOSCA Group Types derive from"
    no depends
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_groups_root
}

// ======================================================================
// Signature for Tosca_groups_root
// ======================================================================

sig Tosca_groups_root in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_interfaces_root'
//
// ======================================================================

one sig tosca_interfaces_root extends Mixin {} {
    term = "tosca_interfaces_root"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA root Interface Type all other TOSCA base Interface Types derive from."
    no depends
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_interfaces_root
}

// ======================================================================
// Signature for Tosca_interfaces_root
// ======================================================================

sig Tosca_interfaces_root in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_interfaces_relationship_configure'
//
// ======================================================================

one sig tosca_interfaces_relationship_configure extends Mixin {} {
    term = "tosca_interfaces_relationship_configure"
    scheme = "http://schemas.ogf.org/tosca/core#"
    no title
    depends = tosca_interfaces_root
    no applies
    no attributes
    actions = tosca_interfaces_relationship_configure_pre_configure_source + tosca_interfaces_relationship_configure_pre_configure_target + tosca_interfaces_relationship_configure_post_configure_source + tosca_interfaces_relationship_configure_post_configure_target + tosca_interfaces_relationship_configure_remove_target + tosca_interfaces_relationship_configure_add_target + tosca_interfaces_relationship_configure_add_source + tosca_interfaces_relationship_configure_target_changed
    entities.Time in this/Tosca_interfaces_relationship_configure
}

//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#pre_configure_source'
//
one sig tosca_interfaces_relationship_configure_pre_configure_source extends Action {} {
    term = "pre_configure_source"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#"
    title = "Operation to pre-configure the source endpoint."
    no attributes
}


//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#pre_configure_target'
//
one sig tosca_interfaces_relationship_configure_pre_configure_target extends Action {} {
    term = "pre_configure_target"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#"
    title = "Operation to pre-configure the target endpoint."
    no attributes
}


//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#post_configure_source'
//
one sig tosca_interfaces_relationship_configure_post_configure_source extends Action {} {
    term = "post_configure_source"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#"
    title = "Operation to post-configure the source endpoint."
    no attributes
}


//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#post_configure_target'
//
one sig tosca_interfaces_relationship_configure_post_configure_target extends Action {} {
    term = "post_configure_target"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#"
    title = "Operation to post-configure the target endpoint."
    no attributes
}


//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#remove_target'
//
one sig tosca_interfaces_relationship_configure_remove_target extends Action {} {
    term = "remove_target"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#"
    title = "Operation to remove a target node."
    no attributes
}


//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#add_target'
//
one sig tosca_interfaces_relationship_configure_add_target extends Action {} {
    term = "add_target"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#"
    title = "Operation to notify the source node of a target node being added via a relationship."
    no attributes
}


//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#add_source'
//
one sig tosca_interfaces_relationship_configure_add_source extends Action {} {
    term = "add_source"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#"
    no title
    no attributes
}


//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#target_changed'
//
one sig tosca_interfaces_relationship_configure_target_changed extends Action {} {
    term = "target_changed"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_relationship_configure/action#"
    title = "Operation to notify source some property or attribute of the target changed"
    no attributes
}


// ======================================================================
// Signature for Tosca_interfaces_relationship_configure
// ======================================================================

sig Tosca_interfaces_relationship_configure in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_interfaces_node_lifecycle_standard'
//
// ======================================================================

one sig tosca_interfaces_node_lifecycle_standard extends Mixin {} {
    term = "tosca_interfaces_node_lifecycle_standard"
    scheme = "http://schemas.ogf.org/tosca/core#"
    no title
    depends = tosca_interfaces_root
    no applies
    no attributes
    actions = tosca_interfaces_node_lifecycle_standard_create + tosca_interfaces_node_lifecycle_standard_configure + tosca_interfaces_node_lifecycle_standard_delete
    entities.Time in this/Tosca_interfaces_node_lifecycle_standard
}

//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_node_lifecycle_standard/action#create'
//
one sig tosca_interfaces_node_lifecycle_standard_create extends Action {} {
    term = "create"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_node_lifecycle_standard/action#"
    title = "Standard lifecycle create operation."
    no attributes
}


//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_node_lifecycle_standard/action#configure'
//
one sig tosca_interfaces_node_lifecycle_standard_configure extends Action {} {
    term = "configure"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_node_lifecycle_standard/action#"
    title = "Standard lifecycle configure operation."
    no attributes
}


//
// OCCI action 'http://schemas.ogf.org/tosca/core/tosca_interfaces_node_lifecycle_standard/action#delete'
//
one sig tosca_interfaces_node_lifecycle_standard_delete extends Action {} {
    term = "delete"
    scheme = "http://schemas.ogf.org/tosca/core/tosca_interfaces_node_lifecycle_standard/action#"
    title = "Standard lifecycle delete operation."
    no attributes
}


// ======================================================================
// Signature for Tosca_interfaces_node_lifecycle_standard
// ======================================================================

sig Tosca_interfaces_node_lifecycle_standard in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_relationships_root'
//
// ======================================================================

one sig tosca_relationships_root extends Mixin {} {
    term = "tosca_relationships_root"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "The TOSCA root Relationship Type all other TOSCA base Relationship Types derive from"
    no depends
    applies = core/link
    attributes = tosca_relationships_root_tosca_name + tosca_relationships_root_state + tosca_relationships_root_tosca_id
    no actions
    entities.Time in this/Tosca_relationships_root
}

//
// OCCI attribute 'tosca.name'
//
one sig tosca_relationships_root_tosca_name extends Attribute {} {
    name = "tosca.name"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "This attribute reflects the name of the Relationship Template as defined in the TOSCA service template. This name is not unique to the realized instance model of corresponding deployed application as each template in the model can result in one or more instances (e.g., scaled) when orchestrated to a provider environment."
    multiple_values = False
}

//
// OCCI attribute 'state'
//
one sig tosca_relationships_root_state extends Attribute {} {
    name = "state"
    type = string_DataType
    mutable = True
    required = False
    default = "initial"
    description = "The state of the relationship instance."
    multiple_values = False
}

//
// OCCI attribute 'tosca.id'
//
one sig tosca_relationships_root_tosca_id extends Attribute {} {
    name = "tosca.id"
    type = string_DataType
    mutable = True
    required = False
    no default
    description = "A unique identifier of the realized instance of a Relationship Template that derives from any TOSCA normative type."
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_relationships_root
// ======================================================================

sig Tosca_relationships_root in core/Link {
    tosca_name : lone string,
    state : lone string,
    tosca_id : lone string,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_relationships_connectsto'
//
// ======================================================================

one sig tosca_relationships_connectsto extends Mixin {} {
    term = "tosca_relationships_connectsto"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This type represents a network connection relationship between two nodes."
    depends = tosca_relationships_root
    no applies
    attributes = tosca_relationships_connectsto_credential
    no actions
    entities.Time in this/Tosca_relationships_connectsto
}

//
// OCCI attribute 'credential'
//
one sig tosca_relationships_connectsto_credential extends Attribute {} {
    name = "credential"
    type = Credential_DataType
    mutable = True
    required = False
    no default
    description = "The security credential to use to present to the target endpoint to for either authentication or authorization purposes."
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_relationships_connectsto
// ======================================================================

sig Tosca_relationships_connectsto in core/Entity {
    credential : lone Credential,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_relationships_routesto'
//
// ======================================================================

one sig tosca_relationships_routesto extends Mixin {} {
    term = "tosca_relationships_routesto"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This type represents an intentional network routing between two Endpoints in different networks."
    depends = tosca_relationships_connectsto
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_relationships_routesto
}

// ======================================================================
// Signature for Tosca_relationships_routesto
// ======================================================================

sig Tosca_relationships_routesto in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_relationships_attachesto'
//
// ======================================================================

one sig tosca_relationships_attachesto extends Mixin {} {
    term = "tosca_relationships_attachesto"
    scheme = "http://schemas.ogf.org/tosca/core#"
    no title
    depends = tosca_relationships_root
    applies = infrastructure/storagelink
    attributes = tosca_relationships_attachesto_location
    no actions
    entities.Time in this/Tosca_relationships_attachesto
}

//
// OCCI attribute 'location'
//
one sig tosca_relationships_attachesto_location extends Attribute {} {
    name = "location"
    type = stringMinOne_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Tosca_relationships_attachesto
// ======================================================================

sig Tosca_relationships_attachesto in infrastructure/Storagelink {
    location : lone stringMinOne,
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_relationships_hostedon'
//
// ======================================================================

one sig tosca_relationships_hostedon extends Mixin {} {
    term = "tosca_relationships_hostedon"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This type represents a hosting relationship between two nodes."
    depends = tosca_relationships_root
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_relationships_hostedon
}

// ======================================================================
// Signature for Tosca_relationships_hostedon
// ======================================================================

sig Tosca_relationships_hostedon in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://schemas.ogf.org/tosca/core#tosca_relationships_dependson'
//
// ======================================================================

one sig tosca_relationships_dependson extends Mixin {} {
    term = "tosca_relationships_dependson"
    scheme = "http://schemas.ogf.org/tosca/core#"
    title = "This type represents a general dependency relationship between two nodes."
    depends = tosca_relationships_root
    no applies
    no attributes
    no actions
    entities.Time in this/Tosca_relationships_dependson
}

// ======================================================================
// Signature for Tosca_relationships_dependson
// ======================================================================

sig Tosca_relationships_dependson in core/Entity {
}

//
// OCCI data type string
//
one sig string_DataType extends DataType {} {
    name = "string"
}

let string=String

//
// OCCI data type stringMinOne
//
one sig stringMinOne_DataType extends DataType {} {
    name = "stringMinOne"
}

let stringMinOne=String

//
// OCCI data type boolean
//
one sig boolean_DataType extends DataType {} {
    name = "boolean"
}

let boolean=String

//
// OCCI data type byte
//
one sig byte_DataType extends DataType {} {
    name = "byte"
}

let byte=String

//
// OCCI data type double
//
one sig double_DataType extends DataType {} {
    name = "double"
}

let double=String

//
// OCCI data type float
//
one sig float_DataType extends DataType {} {
    name = "float"
}

let float=String

//
// OCCI data type integer
//
one sig integer_DataType extends DataType {} {
    name = "integer"
}

let integer=String

//
// OCCI data type integerMinOne
//
one sig integerMinOne_DataType extends DataType {} {
    name = "integerMinOne"
}

let integerMinOne=String

//
// OCCI data type integerMinZero
//
one sig integerMinZero_DataType extends DataType {} {
    name = "integerMinZero"
}

let integerMinZero=String

//
// OCCI data type long
//
one sig long_DataType extends DataType {} {
    name = "long"
}

let long=String

//
// OCCI data type short
//
one sig short_DataType extends DataType {} {
    name = "short"
}

let short=String

//
// OCCI data type map
//
one sig map_DataType extends DataType {} {
    name = "map"
}

let map=String

//
// OCCI data type version
//
one sig version_DataType extends DataType {} {
    name = "version"
}

let version=String

//
// OCCI data type range
//
one sig range_DataType extends DataType {} {
    name = "range"
}

let range=String

//
// OCCI data type toscadatatypesnetworkPortDef
//
one sig toscadatatypesnetworkPortDef_DataType extends DataType {} {
    name = "toscadatatypesnetworkPortDef"
}

let toscadatatypesnetworkPortDef=String

//
// OCCI data type scalarFrequency
//
one sig scalarFrequency_DataType extends DataType {} {
    name = "scalarFrequency"
}

let scalarFrequency=String

//
// OCCI data type scalarSizeMinOneMB
//
one sig scalarSizeMinOneMB_DataType extends DataType {} {
    name = "scalarSizeMinOneMB"
}

let scalarSizeMinOneMB=String

//
// OCCI data type scalarSizeMinZeroGB
//
one sig scalarSizeMinZeroGB_DataType extends DataType {} {
    name = "scalarSizeMinZeroGB"
}

let scalarSizeMinZeroGB=String

//
// OCCI data type scalarSizeMinZeroMB
//
one sig scalarSizeMinZeroMB_DataType extends DataType {} {
    name = "scalarSizeMinZeroMB"
}

let scalarSizeMinZeroMB=String

//
// OCCI data type arraystring
//
one sig arraystring_DataType extends DataType {} {
    name = "arraystring"
}

let arraystring=String

//
// OCCI data type NetworkInfo
//
one sig NetworkInfo_DataType extends DataType {} {
    name = "NetworkInfo"
}

let NetworkInfo=String

//
// OCCI data type PortInfo
//
one sig PortInfo_DataType extends DataType {} {
    name = "PortInfo"
}

let PortInfo=String

//
// OCCI data type Credential
//
one sig Credential_DataType extends DataType {} {
    name = "Credential"
}

let Credential=String

//
// OCCI data type protocolEnum
//
one sig protocolEnum_DataType extends DataType {} {
    name = "protocolEnum"
}

let protocolEnum=String

//
// OCCI data type PortSpec
//
one sig PortSpec_DataType extends DataType {} {
    name = "PortSpec"
}

let PortSpec=String

//
// OCCI data type initiatorEnum
//
one sig initiatorEnum_DataType extends DataType {} {
    name = "initiatorEnum"
}

let initiatorEnum=String

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

// ======================================================================
// imported check
// ======================================================================

check GetAllCategoriesIsSafe for 10
check GetAllCategoriesIsIdempotent for 10
check GetAllCategoriesOnConfigurationWithoutExtensionsAndUserMixinsReturnsNoCategory for 10
check GetAllCategoriesOnConfigurationWithoutExtensionsReturnsUserMixins for 10
check GetAllCategoriesOnConfigurationWithoutUserMixinsReturnsAllExtensionsKindsAndMixins for 10
check CreateResourceIsIdempotent for 10
check CreateResourceImpliesResourceAddedToKind for 10
check RetrieveResourceIsSafe for 10
check RetrieveResourceIsIdempotent for 10
check CreateResourceAndRetrieveResourceAreSequential for 10 //but exactly 1 Configuration, exactly 2 Resource, exactly 3 Time
check UpdateResourceIsIdempotent for 10
check DeleteResourceIsIdempotent for 10
check DeleteResourceImpliesResourceRemovedFromConfiguration for 10
check CreateResourceAndDeleteResourceAreReversible for 10
check CreateLinkIsIdempotent for 10
check CreateLinkImpliesLinkAddedToKind for 10
check RetrieveLinkIsSafe for 10
check RetrieveLinkIsIdempotent for 10
check CreateLinkAndRetrieveLinkAreSequential for 10
check DeleteLinkIsIdempotent for 10
check DeleteLinkImpliesLinkRemovedFromConfiguration for 10
check CreateLinkAndDeleteLinkAreReversible for 10
check UpdateLinkIsIdempotent for 10
check AddUserMixinDoesNotModifyConfigurationExtensionsAndResources for 10
check AddUserMixinCanNotAddAlreadyExistingMixin for 10
check AddUserMixinDoesTheWork for 10
check RemoveUserMixinDoesNotModifyConfigurationExtensionsAndResources for 10
check RemoveUserMixinCanNotRemoveNotExistingMixin for 10
check RemoveUserMixinDoesTheWork for 10
check AddUserMixinAndRemoveUserMixinAreReversibleOperations_v2 for 10
check AssociateMixinToResourceIsIdempotent for 10
check DissociateMixinFromResourceIsIdempotent for 10
check AssociateMixinToResourceAndDissociateMixinFromResourceAreReversible for 10
check RetrieveCollectionIsSafe for 10
check RetrieveCollectionOnConfigurationWithoutExtensionsAndUserMixinsReturnsNoCategory for 10
check RetrieveCollectionOnConfigurationWithoutExtensionsReturnsUserMixins for 10
check RetrieveCollectionOnConfigurationWithoutUserMixinsReturnsAllExtensionsKindsAndMixins for 10

