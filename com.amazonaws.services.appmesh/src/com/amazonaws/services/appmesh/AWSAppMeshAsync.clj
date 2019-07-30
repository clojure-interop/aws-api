(ns com.amazonaws.services.appmesh.AWSAppMeshAsync
  "Interface for accessing AWS App Mesh asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSAppMeshAsync instead.



  AWS App Mesh is a service mesh based on the Envoy proxy that makes it easy to monitor and control microservices. App
  Mesh standardizes how your microservices communicate, giving you end-to-end visibility and helping to ensure high
  availability for your applications.


  App Mesh gives you consistent visibility and network traffic controls for every microservice in an application. You
  can use App Mesh with AWS Fargate, Amazon ECS, Amazon EKS, Kubernetes on AWS, and Amazon EC2.



  App Mesh supports microservice applications that use service discovery naming for their components. For more
  information about service discovery on Amazon ECS, see Service Discovery in the
  Amazon Elastic Container Service Developer Guide. Kubernetes kube-dns and coredns
  are supported. For more information, see DNS for Services and Pods in the
  Kubernetes documentation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appmesh AWSAppMeshAsync]))

(defn untag-resource-async
  "Deletes specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.appmesh.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn list-virtual-routers-async
  "Returns a list of existing virtual routers in a service mesh.

  list-virtual-routers-request - `com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVirtualRouters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListVirtualRoutersResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest list-virtual-routers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVirtualRoutersAsync list-virtual-routers-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest list-virtual-routers-request]
    (-> this (.listVirtualRoutersAsync list-virtual-routers-request))))

(defn list-routes-async
  "Returns a list of existing routes in a service mesh.

  list-routes-request - `com.amazonaws.services.appmesh.model.ListRoutesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListRoutesResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListRoutesRequest list-routes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRoutesAsync list-routes-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListRoutesRequest list-routes-request]
    (-> this (.listRoutesAsync list-routes-request))))

(defn list-virtual-services-async
  "Returns a list of existing virtual services in a service mesh.

  list-virtual-services-request - `com.amazonaws.services.appmesh.model.ListVirtualServicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVirtualServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListVirtualServicesResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualServicesRequest list-virtual-services-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVirtualServicesAsync list-virtual-services-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualServicesRequest list-virtual-services-request]
    (-> this (.listVirtualServicesAsync list-virtual-services-request))))

(defn update-mesh-async
  "Updates an existing service mesh.

  update-mesh-request - `com.amazonaws.services.appmesh.model.UpdateMeshRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMesh operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateMeshResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateMeshRequest update-mesh-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMeshAsync update-mesh-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateMeshRequest update-mesh-request]
    (-> this (.updateMeshAsync update-mesh-request))))

(defn update-route-async
  "Updates an existing route for a specified service mesh and virtual router.

  update-route-request - `com.amazonaws.services.appmesh.model.UpdateRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateRouteResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateRouteRequest update-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRouteAsync update-route-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateRouteRequest update-route-request]
    (-> this (.updateRouteAsync update-route-request))))

(defn create-mesh-async
  "Creates a service mesh. A service mesh is a logical boundary for network traffic between the services that reside
   within it.


   After you create your service mesh, you can create virtual services, virtual nodes, virtual routers, and routes
   to distribute traffic between the applications in your mesh.

  create-mesh-request - `com.amazonaws.services.appmesh.model.CreateMeshRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMesh operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateMeshResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateMeshRequest create-mesh-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMeshAsync create-mesh-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateMeshRequest create-mesh-request]
    (-> this (.createMeshAsync create-mesh-request))))

(defn delete-mesh-async
  "Deletes an existing service mesh.


   You must delete all resources (virtual services, routes, virtual routers, and virtual nodes) in the service mesh
   before you can delete the mesh itself.

  delete-mesh-request - `com.amazonaws.services.appmesh.model.DeleteMeshRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMesh operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteMeshResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteMeshRequest delete-mesh-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMeshAsync delete-mesh-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteMeshRequest delete-mesh-request]
    (-> this (.deleteMeshAsync delete-mesh-request))))

(defn delete-virtual-router-async
  "Deletes an existing virtual router.


   You must delete any routes associated with the virtual router before you can delete the router itself.

  delete-virtual-router-request - `com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualRouter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteVirtualRouterResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest delete-virtual-router-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualRouterAsync delete-virtual-router-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest delete-virtual-router-request]
    (-> this (.deleteVirtualRouterAsync delete-virtual-router-request))))

(defn delete-route-async
  "Deletes an existing route.

  delete-route-request - `com.amazonaws.services.appmesh.model.DeleteRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteRouteResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteRouteRequest delete-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteAsync delete-route-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteRouteRequest delete-route-request]
    (-> this (.deleteRouteAsync delete-route-request))))

(defn describe-virtual-router-async
  "Describes an existing virtual router.

  describe-virtual-router-request - `com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualRouter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeVirtualRouterResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest describe-virtual-router-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualRouterAsync describe-virtual-router-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest describe-virtual-router-request]
    (-> this (.describeVirtualRouterAsync describe-virtual-router-request))))

(defn create-virtual-router-async
  "Creates a virtual router within a service mesh.


   Any inbound traffic that your virtual router expects should be specified as a listener.


   Virtual routers handle traffic for one or more virtual services within your mesh. After you create your virtual
   router, create and associate routes for your virtual router that direct incoming requests to different virtual
   nodes.

  create-virtual-router-request - `com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVirtualRouter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateVirtualRouterResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest create-virtual-router-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVirtualRouterAsync create-virtual-router-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest create-virtual-router-request]
    (-> this (.createVirtualRouterAsync create-virtual-router-request))))

(defn update-virtual-service-async
  "Updates an existing virtual service in a specified service mesh.

  update-virtual-service-request - `com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVirtualService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateVirtualServiceResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest update-virtual-service-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVirtualServiceAsync update-virtual-service-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest update-virtual-service-request]
    (-> this (.updateVirtualServiceAsync update-virtual-service-request))))

(defn describe-virtual-service-async
  "Describes an existing virtual service.

  describe-virtual-service-request - `com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeVirtualServiceResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest describe-virtual-service-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualServiceAsync describe-virtual-service-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest describe-virtual-service-request]
    (-> this (.describeVirtualServiceAsync describe-virtual-service-request))))

(defn describe-route-async
  "Describes an existing route.

  describe-route-request - `com.amazonaws.services.appmesh.model.DescribeRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeRouteResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeRouteRequest describe-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRouteAsync describe-route-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeRouteRequest describe-route-request]
    (-> this (.describeRouteAsync describe-route-request))))

(defn list-meshes-async
  "Returns a list of existing service meshes.

  list-meshes-request - `com.amazonaws.services.appmesh.model.ListMeshesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMeshes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListMeshesResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListMeshesRequest list-meshes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMeshesAsync list-meshes-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListMeshesRequest list-meshes-request]
    (-> this (.listMeshesAsync list-meshes-request))))

(defn list-tags-for-resource-async
  "List the tags for an App Mesh resource.

  list-tags-for-resource-request - `com.amazonaws.services.appmesh.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn create-virtual-service-async
  "Creates a virtual service within a service mesh.


   A virtual service is an abstraction of a real service that is provided by a virtual node directly or indirectly
   by means of a virtual router. Dependent services call your virtual service by its virtualServiceName
   , and those requests are routed to the virtual node or virtual router that is specified as the provider for the
   virtual service.

  create-virtual-service-request - `com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVirtualService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateVirtualServiceResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest create-virtual-service-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVirtualServiceAsync create-virtual-service-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest create-virtual-service-request]
    (-> this (.createVirtualServiceAsync create-virtual-service-request))))

(defn update-virtual-router-async
  "Updates an existing virtual router in a specified service mesh.

  update-virtual-router-request - `com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVirtualRouter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateVirtualRouterResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest update-virtual-router-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVirtualRouterAsync update-virtual-router-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest update-virtual-router-request]
    (-> this (.updateVirtualRouterAsync update-virtual-router-request))))

(defn update-virtual-node-async
  "Updates an existing virtual node in a specified service mesh.

  update-virtual-node-request - `com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVirtualNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateVirtualNodeResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest update-virtual-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVirtualNodeAsync update-virtual-node-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest update-virtual-node-request]
    (-> this (.updateVirtualNodeAsync update-virtual-node-request))))

(defn describe-mesh-async
  "Describes an existing service mesh.

  describe-mesh-request - `com.amazonaws.services.appmesh.model.DescribeMeshRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMesh operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeMeshResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeMeshRequest describe-mesh-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMeshAsync describe-mesh-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeMeshRequest describe-mesh-request]
    (-> this (.describeMeshAsync describe-mesh-request))))

(defn list-virtual-nodes-async
  "Returns a list of existing virtual nodes.

  list-virtual-nodes-request - `com.amazonaws.services.appmesh.model.ListVirtualNodesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVirtualNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListVirtualNodesResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualNodesRequest list-virtual-nodes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVirtualNodesAsync list-virtual-nodes-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualNodesRequest list-virtual-nodes-request]
    (-> this (.listVirtualNodesAsync list-virtual-nodes-request))))

(defn create-virtual-node-async
  "Creates a virtual node within a service mesh.


   A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS service or a
   Kubernetes deployment. When you create a virtual node, you can specify the service discovery information for your
   task group.


   Any inbound traffic that your virtual node expects should be specified as a listener. Any outbound
   traffic that your virtual node expects to reach should be specified as a backend.


   The response metadata for your new virtual node contains the arn that is associated with the virtual
   node. Set this value (either the full ARN or the truncated resource name: for example,
   mesh/default/virtualNode/simpleapp) as the APPMESH_VIRTUAL_NODE_NAME environment
   variable for your task group's Envoy proxy container in your task definition or pod spec. This is then mapped to
   the node.id and node.cluster Envoy parameters.



   If you require your Envoy stats or tracing to use a different name, you can override the
   node.cluster value that is set by APPMESH_VIRTUAL_NODE_NAME with the
   APPMESH_VIRTUAL_NODE_CLUSTER environment variable.

  create-virtual-node-request - `com.amazonaws.services.appmesh.model.CreateVirtualNodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVirtualNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateVirtualNodeResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualNodeRequest create-virtual-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVirtualNodeAsync create-virtual-node-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualNodeRequest create-virtual-node-request]
    (-> this (.createVirtualNodeAsync create-virtual-node-request))))

(defn create-route-async
  "Creates a route that is associated with a virtual router.


   You can use the prefix parameter in your route specification for path-based routing of requests. For
   example, if your virtual service name is my-service.local and you want the route to match requests
   to my-service.local/metrics, your prefix should be /metrics.


   If your route matches a request, you can distribute traffic to one or more target virtual nodes with relative
   weighting.

  create-route-request - `com.amazonaws.services.appmesh.model.CreateRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateRouteResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateRouteRequest create-route-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteAsync create-route-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateRouteRequest create-route-request]
    (-> this (.createRouteAsync create-route-request))))

(defn delete-virtual-service-async
  "Deletes an existing virtual service.

  delete-virtual-service-request - `com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteVirtualServiceResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest delete-virtual-service-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualServiceAsync delete-virtual-service-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest delete-virtual-service-request]
    (-> this (.deleteVirtualServiceAsync delete-virtual-service-request))))

(defn tag-resource-async
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a
   resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
   associated with that resource are also deleted.

  tag-resource-request - `com.amazonaws.services.appmesh.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn describe-virtual-node-async
  "Describes an existing virtual node.

  describe-virtual-node-request - `com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeVirtualNodeResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest describe-virtual-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualNodeAsync describe-virtual-node-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest describe-virtual-node-request]
    (-> this (.describeVirtualNodeAsync describe-virtual-node-request))))

(defn delete-virtual-node-async
  "Deletes an existing virtual node.


   You must delete any virtual services that list a virtual node as a service provider before you can delete the
   virtual node itself.

  delete-virtual-node-request - `com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteVirtualNodeResult>`"
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest delete-virtual-node-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualNodeAsync delete-virtual-node-request async-handler)))
  (^java.util.concurrent.Future [^AWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest delete-virtual-node-request]
    (-> this (.deleteVirtualNodeAsync delete-virtual-node-request))))

