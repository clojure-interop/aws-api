(ns com.amazonaws.services.appmesh.AbstractAWSAppMeshAsync
  "Abstract implementation of AWSAppMeshAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appmesh AbstractAWSAppMeshAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn list-virtual-routers-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVirtualRouters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListVirtualRoutersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVirtualRoutersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest request]
    (-> this (.listVirtualRoutersAsync request))))

(defn list-routes-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.ListRoutesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListRoutesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListRoutesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRoutesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListRoutesRequest request]
    (-> this (.listRoutesAsync request))))

(defn list-virtual-services-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.ListVirtualServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVirtualServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListVirtualServicesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVirtualServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualServicesRequest request]
    (-> this (.listVirtualServicesAsync request))))

(defn update-mesh-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.UpdateMeshRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMesh operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateMeshResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateMeshRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMeshAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateMeshRequest request]
    (-> this (.updateMeshAsync request))))

(defn update-route-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.UpdateRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateRouteResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateRouteRequest request]
    (-> this (.updateRouteAsync request))))

(defn create-mesh-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.CreateMeshRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMesh operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateMeshResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateMeshRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMeshAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateMeshRequest request]
    (-> this (.createMeshAsync request))))

(defn delete-mesh-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DeleteMeshRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMesh operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteMeshResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteMeshRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMeshAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteMeshRequest request]
    (-> this (.deleteMeshAsync request))))

(defn delete-virtual-router-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualRouter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteVirtualRouterResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualRouterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest request]
    (-> this (.deleteVirtualRouterAsync request))))

(defn delete-route-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DeleteRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteRouteResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteRouteRequest request]
    (-> this (.deleteRouteAsync request))))

(defn describe-virtual-router-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualRouter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeVirtualRouterResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualRouterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest request]
    (-> this (.describeVirtualRouterAsync request))))

(defn create-virtual-router-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVirtualRouter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateVirtualRouterResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVirtualRouterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest request]
    (-> this (.createVirtualRouterAsync request))))

(defn update-virtual-service-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVirtualService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateVirtualServiceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVirtualServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest request]
    (-> this (.updateVirtualServiceAsync request))))

(defn describe-virtual-service-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeVirtualServiceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest request]
    (-> this (.describeVirtualServiceAsync request))))

(defn describe-route-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DescribeRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeRouteResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeRouteRequest request]
    (-> this (.describeRouteAsync request))))

(defn list-meshes-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.ListMeshesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMeshes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListMeshesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListMeshesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMeshesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListMeshesRequest request]
    (-> this (.listMeshesAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn create-virtual-service-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVirtualService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateVirtualServiceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVirtualServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest request]
    (-> this (.createVirtualServiceAsync request))))

(defn update-virtual-router-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVirtualRouter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateVirtualRouterResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVirtualRouterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest request]
    (-> this (.updateVirtualRouterAsync request))))

(defn update-virtual-node-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVirtualNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.UpdateVirtualNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVirtualNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest request]
    (-> this (.updateVirtualNodeAsync request))))

(defn describe-mesh-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DescribeMeshRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMesh operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeMeshResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeMeshRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMeshAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeMeshRequest request]
    (-> this (.describeMeshAsync request))))

(defn list-virtual-nodes-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.ListVirtualNodesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVirtualNodes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.ListVirtualNodesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualNodesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVirtualNodesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.ListVirtualNodesRequest request]
    (-> this (.listVirtualNodesAsync request))))

(defn create-virtual-node-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.CreateVirtualNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVirtualNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateVirtualNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVirtualNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateVirtualNodeRequest request]
    (-> this (.createVirtualNodeAsync request))))

(defn create-route-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.CreateRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.CreateRouteResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.CreateRouteRequest request]
    (-> this (.createRouteAsync request))))

(defn delete-virtual-service-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualService operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteVirtualServiceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualServiceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest request]
    (-> this (.deleteVirtualServiceAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-virtual-node-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVirtualNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DescribeVirtualNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVirtualNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest request]
    (-> this (.describeVirtualNodeAsync request))))

(defn delete-virtual-node-async
  "Description copied from interface: AWSAppMeshAsync

  request - `com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualNode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appmesh.model.DeleteVirtualNodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualNodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAppMeshAsync this ^com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest request]
    (-> this (.deleteVirtualNodeAsync request))))

