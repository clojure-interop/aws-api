(ns com.amazonaws.services.iot1clickprojects.AWSIoT1ClickProjects
  "Interface for accessing AWS IoT 1-Click Projects.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoT1ClickProjects instead.



  The AWS IoT 1-Click Projects API Reference"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickprojects AWSIoT1ClickProjects]))

(defn list-tags-for-resource
  "Lists the tags (metadata key/value pairs) which you have assigned to the resource.

  list-tags-for-resource-request - `com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn describe-project
  "Returns an object describing a project.

  describe-project-request - `com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest`

  returns: Result of the DescribeProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DescribeProjectResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DescribeProjectResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest describe-project-request]
    (-> this (.describeProject describe-project-request))))

(defn get-devices-in-placement
  "Returns an object enumerating the devices in a placement.

  get-devices-in-placement-request - `com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest`

  returns: Result of the GetDevicesInPlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest get-devices-in-placement-request]
    (-> this (.getDevicesInPlacement get-devices-in-placement-request))))

(defn untag-resource
  "Removes one or more tags (metadata key/value pairs) from a resource.

  untag-resource-request - `com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.UntagResourceResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.UntagResourceResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn create-project
  "Creates an empty project with a placement template. A project contains zero or more placements that adhere to the
   placement template defined in the project.

  create-project-request - `com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.CreateProjectResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.CreateProjectResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest create-project-request]
    (-> this (.createProject create-project-request))))

(defn update-placement
  "Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., \"\").

  update-placement-request - `com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest`

  returns: Result of the UpdatePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.UpdatePlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest update-placement-request]
    (-> this (.updatePlacement update-placement-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSIoT1ClickProjects this]
    (-> this (.shutdown))))

(defn list-projects
  "Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.

  list-projects-request - `com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.ListProjectsResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.ListProjectsResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjects list-projects-request))))

(defn update-project
  "Updates a project associated with your AWS account and region. With the exception of device template names, you
   can pass just the values that need to be updated because the update request will change only the values that are
   provided. To clear a value, pass the empty string (i.e., \"\").

  update-project-request - `com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.UpdateProjectResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.UpdateProjectResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProject update-project-request))))

(defn associate-device-with-placement
  "Associates a physical device with a placement.

  associate-device-with-placement-request - `com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest`

  returns: Result of the AssociateDeviceWithPlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest associate-device-with-placement-request]
    (-> this (.associateDeviceWithPlacement associate-device-with-placement-request))))

(defn create-placement
  "Creates an empty placement.

  create-placement-request - `com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest`

  returns: Result of the CreatePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.CreatePlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.CreatePlacementResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest create-placement-request]
    (-> this (.createPlacement create-placement-request))))

(defn disassociate-device-from-placement
  "Removes a physical device from a placement.

  disassociate-device-from-placement-request - `com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest`

  returns: Result of the DisassociateDeviceFromPlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest disassociate-device-from-placement-request]
    (-> this (.disassociateDeviceFromPlacement disassociate-device-from-placement-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoT1ClickProjects this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-placement
  "Deletes a placement. To delete a placement, it must not have any devices associated with it.



   When you delete a placement, all associated data becomes irretrievable.

  delete-placement-request - `com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest`

  returns: Result of the DeletePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DeletePlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DeletePlacementResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest delete-placement-request]
    (-> this (.deletePlacement delete-placement-request))))

(defn delete-project
  "Deletes a project. To delete a project, it must not have any placements associated with it.



   When you delete a project, all associated data becomes irretrievable.

  delete-project-request - `com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DeleteProjectResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DeleteProjectResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProject delete-project-request))))

(defn tag-resource
  "Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a
   resource. For more information, see AWS Tagging Strategies.

  tag-resource-request - `com.amazonaws.services.iot1clickprojects.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.TagResourceResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.TagResourceResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn describe-placement
  "Describes a placement in a project.

  describe-placement-request - `com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest`

  returns: Result of the DescribePlacement operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.DescribePlacementResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.DescribePlacementResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest describe-placement-request]
    (-> this (.describePlacement describe-placement-request))))

(defn list-placements
  "Lists the placement(s) of a project.

  list-placements-request - `com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest`

  returns: Result of the ListPlacements operation returned by the service. - `com.amazonaws.services.iot1clickprojects.model.ListPlacementsResult`

  throws: com.amazonaws.services.iot1clickprojects.model.InternalFailureException"
  (^com.amazonaws.services.iot1clickprojects.model.ListPlacementsResult [^AWSIoT1ClickProjects this ^com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest list-placements-request]
    (-> this (.listPlacements list-placements-request))))

