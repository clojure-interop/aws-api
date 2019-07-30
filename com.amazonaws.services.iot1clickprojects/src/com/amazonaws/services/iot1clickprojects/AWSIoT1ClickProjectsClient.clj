(ns com.amazonaws.services.iot1clickprojects.AWSIoT1ClickProjectsClient
  "Client for accessing AWS IoT 1-Click Projects. All service calls made using this client are blocking, and will not
  return until the service call completes.


  The AWS IoT 1-Click Projects API Reference"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickprojects AWSIoT1ClickProjectsClient]))

(defn *builder
  "returns: `com.amazonaws.services.iot1clickprojects.AWSIoT1ClickProjectsClientBuilder`"
  (^com.amazonaws.services.iot1clickprojects.AWSIoT1ClickProjectsClientBuilder []
    (AWSIoT1ClickProjectsClient/builder )))

(defn list-tags-for-resource
  "Lists the tags (metadata key/value pairs) which you have assigned to the resource.

  request - `com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-project
  "Returns an object describing a project.

  request - `com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest`

  returns: Result of the DescribeProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DescribeProjectResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DescribeProjectResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest request]
    (-> this (.describeProject request))))

(defn get-devices-in-placement
  "Returns an object enumerating the devices in a placement.

  request - `com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest`

  returns: Result of the GetDevicesInPlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest request]
    (-> this (.getDevicesInPlacement request))))

(defn untag-resource
  "Removes one or more tags (metadata key/value pairs) from a resource.

  request - `com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.UntagResourceResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.UntagResourceResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-project
  "Creates an empty project with a placement template. A project contains zero or more placements that adhere to the
   placement template defined in the project.

  request - `com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.CreateProjectResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.CreateProjectResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn update-placement
  "Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., \"\").

  request - `com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest`

  returns: Result of the UpdatePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.UpdatePlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest request]
    (-> this (.updatePlacement request))))

(defn list-projects
  "Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.

  request - `com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.ListProjectsResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.ListProjectsResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn update-project
  "Updates a project associated with your AWS account and region. With the exception of device template names, you
   can pass just the values that need to be updated because the update request will change only the values that are
   provided. To clear a value, pass the empty string (i.e., \"\").

  request - `com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.UpdateProjectResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.UpdateProjectResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn associate-device-with-placement
  "Associates a physical device with a placement.

  request - `com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest`

  returns: Result of the AssociateDeviceWithPlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest request]
    (-> this (.associateDeviceWithPlacement request))))

(defn create-placement
  "Creates an empty placement.

  request - `com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest`

  returns: Result of the CreatePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.CreatePlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.CreatePlacementResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest request]
    (-> this (.createPlacement request))))

(defn disassociate-device-from-placement
  "Removes a physical device from a placement.

  request - `com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest`

  returns: Result of the DisassociateDeviceFromPlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest request]
    (-> this (.disassociateDeviceFromPlacement request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoT1ClickProjectsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-placement
  "Deletes a placement. To delete a placement, it must not have any devices associated with it.



   When you delete a placement, all associated data becomes irretrievable.

  request - `com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest`

  returns: Result of the DeletePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DeletePlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DeletePlacementResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest request]
    (-> this (.deletePlacement request))))

(defn delete-project
  "Deletes a project. To delete a project, it must not have any placements associated with it.



   When you delete a project, all associated data becomes irretrievable.

  request - `com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DeleteProjectResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DeleteProjectResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

(defn tag-resource
  "Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a
   resource. For more information, see AWS Tagging Strategies.

  request - `com.amazonaws.services.iot1clickprojects.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.TagResourceResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.TagResourceResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-placement
  "Describes a placement in a project.

  request - `com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest`

  returns: Result of the DescribePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DescribePlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DescribePlacementResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest request]
    (-> this (.describePlacement request))))

(defn list-placements
  "Lists the placement(s) of a project.

  request - `com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest`

  returns: Result of the ListPlacements operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.ListPlacementsResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.ListPlacementsResult [^AWSIoT1ClickProjectsClient this ^com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest request]
    (-> this (.listPlacements request))))

