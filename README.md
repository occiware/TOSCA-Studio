# TOSCA Studio

With the advent of cloud computing, different cloud providers with heterogeneous cloud services _(compute, storage, network, applications, etc.)_ and _Application Programming Interfaces_ (APIs) have emerged. This heterogeneity complicates the implementation of an interoperable cloud system. 
Several standards have been proposed to address this challenge and provide a unified interface to cloud resources.
The _Open Cloud Computing Interface_ (OCCI) thereby focuses on the standardization of a common API for _Infrastructure-as-a-Service_ (IaaS) providers and the _Topology and Orchestration Specification for Cloud Applications_ (TOSCA) focuses on the standardization of a template language to enable the proper definition of the topology of cloud applications and their orchestrations on top of an IaaS cloud.
TOSCA thereby does not define how the application topologies are created on the cloud. Therefore, we analyse the conceptual similarities between the two approaches and we integrate both. 
We propose an automated extensive mapping between the concepts of the two standards and we provide TOSCA Studio, a model-driven tool chain for TOSCA based on the OCCIware approach. TOSCA Studio allows to graphically design cloud applications, but also to deploy and manage them at runtime a fully model-driven cloud orchestrator based on the two standards. Our contribution is validated by successfully designing and deploying three cloud applications: WordPress, Node Cellar and Multi-Tier.

## The semantics behind TOSCA Studio

TOSCA Studio relies on a metamodel, called TOSCA Extension, defining the static semantics for the TOSCA standard in Ecore and OCL and conforming to the OCCIware Metamodel. More specifically, TOSCA Extension defines the different types introduced in TOSCA YAML specifications by automatically mapping them to OCCIware types.
Therefore, TOSCA Extension is obtained by parsing `.yml` files and generating an extension, in OCCIware parlance. This means that TOSCA Extension can be automatically enriched with new types and concepts from `.yml` by using the same parser.
The used `.yml` files are avalaible in the folder [`plugins/org.eclipse.cmf.occi.tosca.parser/tosca-types/`](https://github.com/occiware/TOSCA-Studio/tree/master/plugins/org.eclipse.cmf.occi.tosca.parser/tosca-types). 
In this folder, the `normatives-types.yml` contains the normative types definitions as expressed in the TOSCA specification document.
In the folder `custom-types/`, there are several `.yml` files that contains custom and more specific types definitions such as the ones used in a WordPress configuration.

## Usage of TOSCA Studio
TOSCA Studio mainly contains a **TOSCA Designer** that provides users facilities for designing, editing, validating TOSCA-based cloud applications, and an **OCCI Orchestrator** that allows users to deploy and manage these applications.

### Download

You can download the latest release [here](https://github.com/occiware/TOSCA-Studio/releases).

After downloading the proper archive according to your OS, unzip and you should find an executable file `TOSCA-Studio`.

By running it (double-click on the executable file or run `./TOSCA-Studio` on the command line), you can choose your worskpace and you have your TOSCA Studio.

### Running Examples

TOSCA Studio is able to generate TOSCA configurations (`.extendedTosca` files) from TOSCA topologies (`.yml` files). A TOSCA configuration is a TOSCA-based application that conforms to TOSCA Extension and therefore to OCCIware Metamodel.

You can use the provided examples.

1. Clone the project:

```
git clone https://github.com/occiware/TOSCA-Studio.git
```
or download only the folder that contains file examples:

```
wget https://minhaskamal.github.io/DownGit/#/home?url=https://github.com/occiware/TOSCA-Studio/tree/master/plugins/org.eclipse.cmf.occi.tosca.examples
```

2. Move the folder `org.eclipse.cmf.occi.tosca.examples` next to the TOSCA-Studio executable.

3. In TOSCA-Studio, open the project `org.eclipse.cmf.occi.tosca.examples`.

4. Launch the generator by clicking on the custom button `TOSCA Config`.

Shortly after, you would have new TOSCA configurations that appear. 

What happens is that TOSCA-Studio read each `.yml` file in the folder `tosca-topologies` and generated a corresponding `.extendedTosca` file, which is a TOSCA configuration.

#### Inputs

If a tosca topology needs inputs, TOSCA-Studio will read them from `.csv` files in the folder `inputs`.
The `.csv` must be named as the tosca topolology, suffixed by `-inputs.csv`.
For example, for the topology `nodecellar.yml`, the corresponding input file is `inputs/nodecellar-inputs.csv`.

The format of the inputs are as follow: `<name>:<value>`.

## Use cases

### WordPress

WordPress is an open source Content management system (CMS) that allows to build custom web applications based on Apache as the  Webserver, MySQL  as  the  relational database management system and PHP as the object-oriented scripting language. TOSCA allows to define such types, and therefore it allows to define a WordPress application. You can find in the following a figure that shows the model of a WordPress configuration.

![WordPressDiagram](https://github.com/occiware/TOSCA-Studio/blob/master/img/WordPressDiagram.jpg)

#### Deployment

While the transformation and deployment process can be triggered from within TOSCA-Studio, a visual documentation of the deployment process  can be achieved using [SmartWYRM](https://gitlab.gwdg.de/rwm/de.ugoe.cs.rwm.smartwyrm), a webserver visualizing the runtime model maintained by the OCCIWare runtime server. Below you can see the design time WordPress OCCI configuration and how it is transferred to the runtime model of the OCCIWare runtime server and deployed on a private OpenStack cloud. Moreover, a short demonstration of the deployed application is provided:

![WordPress](videos/WordPress-deployment.gif)

The implementation of the OCCI Orchestrator deployment logic can be found [here](https://gitlab.gwdg.de/rwm/de.ugoe.cs.rwm.docci).
A MP4 video of the deployment process demonstration is available [here](https://github.com/occiware/TOSCA-studio/raw/master/videos/WordPress-deployment.mp4).

### Node Cellar

The Node Cellar application is a sample JavaScript application that allows to manage (retrieve, create, update, delete) the wines in a wine cellar database. TOSCA allows to define such types, and therefore it allows to define a Node Cellar application. You can find in the following a figure that shows the model of a Node Cellar configuration.

![NodeCellarDiagram](https://github.com/occiware/TOSCA-Studio/blob/master/img/NodeCellarDiagram.jpg)

#### Deployment
Similar to the WordPress example, we visualized the deployment of the Node Cellar application using [SmartWYRM]("https://gitlab.gwdg.de/rwm/de.ugoe.cs.rwm.smartwyrm"). Below you can see this process, as well as a short demonstration of the deployed application is provided.

![Node Cellar](videos/Node_Cellar-deployment.gif)

The implementation of the OCCI Orchestrator deployment logic can be found [here](https://gitlab.gwdg.de/rwm/de.ugoe.cs.rwm.docci).
A MP4 video of the deployment process demonstration is available [here](https://github.com/occiware/TOSCA-studio/raw/master/videos/Node_Cellar-deployment.mp4).

### Multi-Tier
This use case shows the ELK stack being used in a typical manner to collect, search and monitor/visualize data from a running application. 
This use case builds upon our NodeCellar application as the one being monitored. Here is our model of a Multi-Tier configuration.

![MultiTierDiagram](https://github.com/occiware/TOSCA-Studio/blob/master/img/MultiTierDiagram.jpg)

#### Deployment
Below you can see this deployment process of the Multi-Tier application, as well as a short demonstration of the deployed application is provided.

The implementation of the OCCI Orchestrator deployment logic can be found [here](https://gitlab.gwdg.de/rwm/de.ugoe.cs.rwm.docci).
A MP4 video of the deployment process demonstration is available [here](https://github.com/occiware/TOSCA-studio/raw/master/videos/MultiTier-deployment.mp4).

![MultiTier](videos/MultiTier-deployment.gif)

