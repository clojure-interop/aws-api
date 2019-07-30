(ns com.amazonaws.services.iot1clickprojects.AbstractAWSIoT1ClickProjects
  "Abstract implementation of AWSIoT1ClickProjects. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickprojects AbstractAWSIoT1ClickProjects]))

(defn list-tags-for-resource
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-project
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest`

  returns: Result of the DescribeProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DescribeProjectResult`"
  (^com.amazonaws.services.iot1clickprojects.model.DescribeProjectResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest request]
    (-> this (.describeProject request))))

(defn get-devices-in-placement
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest`

  returns: Result of the GetDevicesInPlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementResult`"
  (^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest request]
    (-> this (.getDevicesInPlacement request))))

(defn untag-resource
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.UntagResourceResult`"
  (^com.amazonaws.services.iot1clickprojects.model.UntagResourceResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-project
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.CreateProjectResult`"
  (^com.amazonaws.services.iot1clickprojects.model.CreateProjectResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn update-placement
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest`

  returns: Result of the UpdatePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.UpdatePlacementResult`"
  (^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest request]
    (-> this (.updatePlacement request))))

(defn shutdown
  "Description copied from interface: AWSIoT1ClickProjects"
  ([^AbstractAWSIoT1ClickProjects this]
    (-> this (.shutdown))))

(defn list-projects
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.ListProjectsResult`"
  (^com.amazonaws.services.iot1clickprojects.model.ListProjectsResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn update-project
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.UpdateProjectResult`"
  (^com.amazonaws.services.iot1clickprojects.model.UpdateProjectResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn associate-device-with-placement
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest`

  returns: Result of the AssociateDeviceWithPlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementResult`"
  (^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest request]
    (-> this (.associateDeviceWithPlacement request))))

(defn create-placement
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest`

  returns: Result of the CreatePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.CreatePlacementResult`"
  (^com.amazonaws.services.iot1clickprojects.model.CreatePlacementResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest request]
    (-> this (.createPlacement request))))

(defn disassociate-device-from-placement
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest`

  returns: Result of the DisassociateDeviceFromPlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementResult`"
  (^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest request]
    (-> this (.disassociateDeviceFromPlacement request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSIoT1ClickProjects

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-placement
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest`

  returns: Result of the DeletePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DeletePlacementResult`"
  (^com.amazonaws.services.iot1clickprojects.model.DeletePlacementResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest request]
    (-> this (.deletePlacement request))))

(defn delete-project
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DeleteProjectResult`"
  (^com.amazonaws.services.iot1clickprojects.model.DeleteProjectResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

(defn tag-resource
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.TagResourceResult`"
  (^com.amazonaws.services.iot1clickprojects.model.TagResourceResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-placement
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest`

  returns: Result of the DescribePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DescribePlacementResult`"
  (^com.amazonaws.services.iot1clickprojects.model.DescribePlacementResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest request]
    (-> this (.describePlacement request))))

(defn list-placements
  "Description copied from interface: AWSIoT1ClickProjects

  request - `com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest`

  returns: Result of the ListPlacements operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.ListPlacementsResult`"
  (^com.amazonaws.services.iot1clickprojects.model.ListPlacementsResult [^AbstractAWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest request]
    (-> this (.listPlacements request))))

