(ns com.amazonaws.services.appmesh.AbstractAWSAppMesh
  "Abstract implementation of AWSAppMesh. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appmesh AbstractAWSAppMesh]))

(defn describe-virtual-service
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest`

  returns: Result of the DescribeVirtualService operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeVirtualServiceResult`"
  (^com.amazonaws.services.appmesh.model.DescribeVirtualServiceResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeVirtualServiceRequest request]
    (-> this (.describeVirtualService request))))

(defn describe-route
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DescribeRouteRequest`

  returns: Result of the DescribeRoute operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeRouteResult`"
  (^com.amazonaws.services.appmesh.model.DescribeRouteResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeRouteRequest request]
    (-> this (.describeRoute request))))

(defn create-mesh
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.CreateMeshRequest`

  returns: Result of the CreateMesh operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateMeshResult`"
  (^com.amazonaws.services.appmesh.model.CreateMeshResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateMeshRequest request]
    (-> this (.createMesh request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.appmesh.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.appmesh.model.ListTagsForResourceResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn create-virtual-service
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest`

  returns: Result of the CreateVirtualService operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateVirtualServiceResult`"
  (^com.amazonaws.services.appmesh.model.CreateVirtualServiceResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateVirtualServiceRequest request]
    (-> this (.createVirtualService request))))

(defn create-virtual-router
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest`

  returns: Result of the CreateVirtualRouter operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateVirtualRouterResult`"
  (^com.amazonaws.services.appmesh.model.CreateVirtualRouterResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateVirtualRouterRequest request]
    (-> this (.createVirtualRouter request))))

(defn list-meshes
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.ListMeshesRequest`

  returns: Result of the ListMeshes operation returned by the service. - `com.amazonaws.services.appmesh.model.ListMeshesResult`"
  (^com.amazonaws.services.appmesh.model.ListMeshesResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.ListMeshesRequest request]
    (-> this (.listMeshes request))))

(defn untag-resource
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.appmesh.model.UntagResourceResult`"
  (^com.amazonaws.services.appmesh.model.UntagResourceResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn describe-virtual-node
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest`

  returns: Result of the DescribeVirtualNode operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeVirtualNodeResult`"
  (^com.amazonaws.services.appmesh.model.DescribeVirtualNodeResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeVirtualNodeRequest request]
    (-> this (.describeVirtualNode request))))

(defn list-virtual-nodes
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.ListVirtualNodesRequest`

  returns: Result of the ListVirtualNodes operation returned by the service. - `com.amazonaws.services.appmesh.model.ListVirtualNodesResult`"
  (^com.amazonaws.services.appmesh.model.ListVirtualNodesResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.ListVirtualNodesRequest request]
    (-> this (.listVirtualNodes request))))

(defn delete-virtual-service
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest`

  returns: Result of the DeleteVirtualService operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteVirtualServiceResult`"
  (^com.amazonaws.services.appmesh.model.DeleteVirtualServiceResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteVirtualServiceRequest request]
    (-> this (.deleteVirtualService request))))

(defn create-route
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.CreateRouteRequest`

  returns: Result of the CreateRoute operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateRouteResult`"
  (^com.amazonaws.services.appmesh.model.CreateRouteResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateRouteRequest request]
    (-> this (.createRoute request))))

(defn delete-virtual-node
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest`

  returns: Result of the DeleteVirtualNode operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteVirtualNodeResult`"
  (^com.amazonaws.services.appmesh.model.DeleteVirtualNodeResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteVirtualNodeRequest request]
    (-> this (.deleteVirtualNode request))))

(defn shutdown
  "Description copied from interface: AWSAppMesh"
  ([^AbstractAWSAppMesh this]
    (-> this (.shutdown))))

(defn update-virtual-router
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest`

  returns: Result of the UpdateVirtualRouter operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateVirtualRouterResult`"
  (^com.amazonaws.services.appmesh.model.UpdateVirtualRouterResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateVirtualRouterRequest request]
    (-> this (.updateVirtualRouter request))))

(defn list-routes
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.ListRoutesRequest`

  returns: Result of the ListRoutes operation returned by the service. - `com.amazonaws.services.appmesh.model.ListRoutesResult`"
  (^com.amazonaws.services.appmesh.model.ListRoutesResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.ListRoutesRequest request]
    (-> this (.listRoutes request))))

(defn describe-virtual-router
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest`

  returns: Result of the DescribeVirtualRouter operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeVirtualRouterResult`"
  (^com.amazonaws.services.appmesh.model.DescribeVirtualRouterResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeVirtualRouterRequest request]
    (-> this (.describeVirtualRouter request))))

(defn delete-mesh
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DeleteMeshRequest`

  returns: Result of the DeleteMesh operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteMeshResult`"
  (^com.amazonaws.services.appmesh.model.DeleteMeshResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteMeshRequest request]
    (-> this (.deleteMesh request))))

(defn update-mesh
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.UpdateMeshRequest`

  returns: Result of the UpdateMesh operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateMeshResult`"
  (^com.amazonaws.services.appmesh.model.UpdateMeshResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateMeshRequest request]
    (-> this (.updateMesh request))))

(defn list-virtual-routers
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest`

  returns: Result of the ListVirtualRouters operation returned by the service. - `com.amazonaws.services.appmesh.model.ListVirtualRoutersResult`"
  (^com.amazonaws.services.appmesh.model.ListVirtualRoutersResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.ListVirtualRoutersRequest request]
    (-> this (.listVirtualRouters request))))

(defn describe-mesh
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DescribeMeshRequest`

  returns: Result of the DescribeMesh operation returned by the service. - `com.amazonaws.services.appmesh.model.DescribeMeshResult`"
  (^com.amazonaws.services.appmesh.model.DescribeMeshResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DescribeMeshRequest request]
    (-> this (.describeMesh request))))

(defn update-virtual-node
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest`

  returns: Result of the UpdateVirtualNode operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateVirtualNodeResult`"
  (^com.amazonaws.services.appmesh.model.UpdateVirtualNodeResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateVirtualNodeRequest request]
    (-> this (.updateVirtualNode request))))

(defn delete-virtual-router
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest`

  returns: Result of the DeleteVirtualRouter operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteVirtualRouterResult`"
  (^com.amazonaws.services.appmesh.model.DeleteVirtualRouterResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteVirtualRouterRequest request]
    (-> this (.deleteVirtualRouter request))))

(defn create-virtual-node
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.CreateVirtualNodeRequest`

  returns: Result of the CreateVirtualNode operation returned by the service. - `com.amazonaws.services.appmesh.model.CreateVirtualNodeResult`"
  (^com.amazonaws.services.appmesh.model.CreateVirtualNodeResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.CreateVirtualNodeRequest request]
    (-> this (.createVirtualNode request))))

(defn delete-route
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.DeleteRouteRequest`

  returns: Result of the DeleteRoute operation returned by the service. - `com.amazonaws.services.appmesh.model.DeleteRouteResult`"
  (^com.amazonaws.services.appmesh.model.DeleteRouteResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.DeleteRouteRequest request]
    (-> this (.deleteRoute request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSAppMesh

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSAppMesh this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-virtual-services
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.ListVirtualServicesRequest`

  returns: Result of the ListVirtualServices operation returned by the service. - `com.amazonaws.services.appmesh.model.ListVirtualServicesResult`"
  (^com.amazonaws.services.appmesh.model.ListVirtualServicesResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.ListVirtualServicesRequest request]
    (-> this (.listVirtualServices request))))

(defn update-virtual-service
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest`

  returns: Result of the UpdateVirtualService operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateVirtualServiceResult`"
  (^com.amazonaws.services.appmesh.model.UpdateVirtualServiceResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateVirtualServiceRequest request]
    (-> this (.updateVirtualService request))))

(defn tag-resource
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.appmesh.model.TagResourceResult`"
  (^com.amazonaws.services.appmesh.model.TagResourceResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn update-route
  "Description copied from interface: AWSAppMesh

  request - `com.amazonaws.services.appmesh.model.UpdateRouteRequest`

  returns: Result of the UpdateRoute operation returned by the service. - `com.amazonaws.services.appmesh.model.UpdateRouteResult`"
  (^com.amazonaws.services.appmesh.model.UpdateRouteResult [^AbstractAWSAppMesh this ^com.amazonaws.services.appmesh.model.UpdateRouteRequest request]
    (-> this (.updateRoute request))))

