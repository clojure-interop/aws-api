(ns com.amazonaws.services.appmesh.AWSAppMesh
  "Interface for accessing AWS App Mesh.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSAppMesh instead.



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
  (:import [com.amazonaws.services.appmesh AWSAppMesh]))

(defn describe-virtual-service
  "Describes an existing virtual service.

  describe-virtual-service-request - `com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest`

  returns: Result of the DescribeVirtualService operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeVirtualServiceResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DescribeVirtualServiceResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest describe-virtual-service-request]
    (-> this (.describeVirtualService describe-virtual-service-request))))

(defn describe-route
  "Describes an existing route.

  describe-route-request - `com.amazonaws.services.appmesh.model.DescribeRouteRequest`

  returns: Result of the DescribeRoute operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeRouteResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DescribeRouteResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeRouteRequest describe-route-request]
    (-> this (.describeRoute describe-route-request))))

(defn create-mesh
  "Creates a service mesh. A service mesh is a logical boundary for network traffic between the services that reside
   within it.


   After you create your service mesh, you can create virtual services, virtual nodes, virtual routers, and routes
   to distribute traffic between the applications in your mesh.

  create-mesh-request - `com.amazonaws.services.appmesh.model.CreateMeshRequest`

  returns: Result of the CreateMesh operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateMeshResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.CreateMeshResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateMeshRequest create-mesh-request]
    (-> this (.createMesh create-mesh-request))))

(defn list-tags-for-resource
  "List the tags for an App Mesh resource.

  list-tags-for-resource-request - `com.amazonaws.services.appmesh.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.appmesh.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.ListTagsForResourceResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn create-virtual-service
  "Creates a virtual service within a service mesh.


   A virtual service is an abstraction of a real service that is provided by a virtual node directly or indirectly
   by means of a virtual router. Dependent services call your virtual service by its virtualServiceName
   , and those requests are routed to the virtual node or virtual router that is specified as the provider for the
   virtual service.

  create-virtual-service-request - `com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest`

  returns: Result of the CreateVirtualService operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateVirtualServiceResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.CreateVirtualServiceResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest create-virtual-service-request]
    (-> this (.createVirtualService create-virtual-service-request))))

(defn create-virtual-router
  "Creates a virtual router within a service mesh.


   Any inbound traffic that your virtual router expects should be specified as a listener.


   Virtual routers handle traffic for one or more virtual services within your mesh. After you create your virtual
   router, create and associate routes for your virtual router that direct incoming requests to different virtual
   nodes.

  create-virtual-router-request - `com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest`

  returns: Result of the CreateVirtualRouter operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateVirtualRouterResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.CreateVirtualRouterResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest create-virtual-router-request]
    (-> this (.createVirtualRouter create-virtual-router-request))))

(defn list-meshes
  "Returns a list of existing service meshes.

  list-meshes-request - `com.amazonaws.services.appmesh.model.ListMeshesRequest`

  returns: Result of the ListMeshes operation returned by the service. - `com.amazonaws.services.appmesh.model.ListMeshesResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.ListMeshesResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.ListMeshesRequest list-meshes-request]
    (-> this (.listMeshes list-meshes-request))))

(defn untag-resource
  "Deletes specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.appmesh.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.appmesh.model.UntagResourceResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.UntagResourceResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn describe-virtual-node
  "Describes an existing virtual node.

  describe-virtual-node-request - `com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest`

  returns: Result of the DescribeVirtualNode operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeVirtualNodeResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DescribeVirtualNodeResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest describe-virtual-node-request]
    (-> this (.describeVirtualNode describe-virtual-node-request))))

(defn list-virtual-nodes
  "Returns a list of existing virtual nodes.

  list-virtual-nodes-request - `com.amazonaws.services.appmesh.model.ListVirtualNodesRequest`

  returns: Result of the ListVirtualNodes operation returned by the service. - `com.amazonaws.services.appmesh.model.ListVirtualNodesResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.ListVirtualNodesResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.ListVirtualNodesRequest list-virtual-nodes-request]
    (-> this (.listVirtualNodes list-virtual-nodes-request))))

(defn delete-virtual-service
  "Deletes an existing virtual service.

  delete-virtual-service-request - `com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest`

  returns: Result of the DeleteVirtualService operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteVirtualServiceResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DeleteVirtualServiceResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest delete-virtual-service-request]
    (-> this (.deleteVirtualService delete-virtual-service-request))))

(defn create-route
  "Creates a route that is associated with a virtual router.


   You can use the prefix parameter in your route specification for path-based routing of requests. For
   example, if your virtual service name is my-service.local and you want the route to match requests
   to my-service.local/metrics, your prefix should be /metrics.


   If your route matches a request, you can distribute traffic to one or more target virtual nodes with relative
   weighting.

  create-route-request - `com.amazonaws.services.appmesh.model.CreateRouteRequest`

  returns: Result of the CreateRoute operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateRouteResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.CreateRouteResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateRouteRequest create-route-request]
    (-> this (.createRoute create-route-request))))

(defn delete-virtual-node
  "Deletes an existing virtual node.


   You must delete any virtual services that list a virtual node as a service provider before you can delete the
   virtual node itself.

  delete-virtual-node-request - `com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest`

  returns: Result of the DeleteVirtualNode operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteVirtualNodeResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DeleteVirtualNodeResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest delete-virtual-node-request]
    (-> this (.deleteVirtualNode delete-virtual-node-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSAppMesh this]
    (-> this (.shutdown))))

(defn update-virtual-router
  "Updates an existing virtual router in a specified service mesh.

  update-virtual-router-request - `com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest`

  returns: Result of the UpdateVirtualRouter operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateVirtualRouterResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.UpdateVirtualRouterResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest update-virtual-router-request]
    (-> this (.updateVirtualRouter update-virtual-router-request))))

(defn list-routes
  "Returns a list of existing routes in a service mesh.

  list-routes-request - `com.amazonaws.services.appmesh.model.ListRoutesRequest`

  returns: Result of the ListRoutes operation returned by the service. - `com.amazonaws.services.appmesh.model.ListRoutesResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.ListRoutesResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.ListRoutesRequest list-routes-request]
    (-> this (.listRoutes list-routes-request))))

(defn describe-virtual-router
  "Describes an existing virtual router.

  describe-virtual-router-request - `com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest`

  returns: Result of the DescribeVirtualRouter operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeVirtualRouterResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DescribeVirtualRouterResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest describe-virtual-router-request]
    (-> this (.describeVirtualRouter describe-virtual-router-request))))

(defn delete-mesh
  "Deletes an existing service mesh.


   You must delete all resources (virtual services, routes, virtual routers, and virtual nodes) in the service mesh
   before you can delete the mesh itself.

  delete-mesh-request - `com.amazonaws.services.appmesh.model.DeleteMeshRequest`

  returns: Result of the DeleteMesh operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteMeshResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DeleteMeshResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteMeshRequest delete-mesh-request]
    (-> this (.deleteMesh delete-mesh-request))))

(defn update-mesh
  "Updates an existing service mesh.

  update-mesh-request - `com.amazonaws.services.appmesh.model.UpdateMeshRequest`

  returns: Result of the UpdateMesh operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateMeshResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.UpdateMeshResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateMeshRequest update-mesh-request]
    (-> this (.updateMesh update-mesh-request))))

(defn list-virtual-routers
  "Returns a list of existing virtual routers in a service mesh.

  list-virtual-routers-request - `com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest`

  returns: Result of the ListVirtualRouters operation returned by the service. - `com.amazonaws.services.appmesh.model.ListVirtualRoutersResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.ListVirtualRoutersResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest list-virtual-routers-request]
    (-> this (.listVirtualRouters list-virtual-routers-request))))

(defn describe-mesh
  "Describes an existing service mesh.

  describe-mesh-request - `com.amazonaws.services.appmesh.model.DescribeMeshRequest`

  returns: Result of the DescribeMesh operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeMeshResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DescribeMeshResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeMeshRequest describe-mesh-request]
    (-> this (.describeMesh describe-mesh-request))))

(defn update-virtual-node
  "Updates an existing virtual node in a specified service mesh.

  update-virtual-node-request - `com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest`

  returns: Result of the UpdateVirtualNode operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateVirtualNodeResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.UpdateVirtualNodeResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest update-virtual-node-request]
    (-> this (.updateVirtualNode update-virtual-node-request))))

(defn delete-virtual-router
  "Deletes an existing virtual router.


   You must delete any routes associated with the virtual router before you can delete the router itself.

  delete-virtual-router-request - `com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest`

  returns: Result of the DeleteVirtualRouter operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteVirtualRouterResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DeleteVirtualRouterResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest delete-virtual-router-request]
    (-> this (.deleteVirtualRouter delete-virtual-router-request))))

(defn create-virtual-node
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

  returns: Result of the CreateVirtualNode operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateVirtualNodeResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.CreateVirtualNodeResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateVirtualNodeRequest create-virtual-node-request]
    (-> this (.createVirtualNode create-virtual-node-request))))

(defn delete-route
  "Deletes an existing route.

  delete-route-request - `com.amazonaws.services.appmesh.model.DeleteRouteRequest`

  returns: Result of the DeleteRoute operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteRouteResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.DeleteRouteResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteRouteRequest delete-route-request]
    (-> this (.deleteRoute delete-route-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSAppMesh this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-virtual-services
  "Returns a list of existing virtual services in a service mesh.

  list-virtual-services-request - `com.amazonaws.services.appmesh.model.ListVirtualServicesRequest`

  returns: Result of the ListVirtualServices operation returned by the service. - `com.amazonaws.services.appmesh.model.ListVirtualServicesResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.ListVirtualServicesResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.ListVirtualServicesRequest list-virtual-services-request]
    (-> this (.listVirtualServices list-virtual-services-request))))

(defn update-virtual-service
  "Updates an existing virtual service in a specified service mesh.

  update-virtual-service-request - `com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest`

  returns: Result of the UpdateVirtualService operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateVirtualServiceResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.UpdateVirtualServiceResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest update-virtual-service-request]
    (-> this (.updateVirtualService update-virtual-service-request))))

(defn tag-resource
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a
   resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
   associated with that resource are also deleted.

  tag-resource-request - `com.amazonaws.services.appmesh.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.appmesh.model.TagResourceResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.TagResourceResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn update-route
  "Updates an existing route for a specified service mesh and virtual router.

  update-route-request - `com.amazonaws.services.appmesh.model.UpdateRouteRequest`

  returns: Result of the UpdateRoute operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateRouteResult`

  throws: com.amazonaws.services.appmesh.model.BadRequestException - The request syntax was malformed. Check your request syntax and try again."
  (^com.amazonaws.services.appmesh.model.UpdateRouteResult [^AWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateRouteRequest update-route-request]
    (-> this (.updateRoute update-route-request))))

