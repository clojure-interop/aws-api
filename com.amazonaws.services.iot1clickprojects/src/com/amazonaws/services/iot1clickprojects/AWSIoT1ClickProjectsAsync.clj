(ns com.amazonaws.services.iot1clickprojects.AWSIoT1ClickProjectsAsync
  "Interface for accessing AWS IoT 1-Click Projects asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoT1ClickProjectsAsync instead.



  The AWS IoT 1-Click Projects API Reference"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickprojects AWSIoT1ClickProjectsAsync]))

(defn untag-resource-async
  "Removes one or more tags (metadata key/value pairs) from a resource.

  untag-resource-request - `com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn create-placement-async
  "Creates an empty placement.

  create-placement-request - `com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.CreatePlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest create-placement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlacementAsync create-placement-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest create-placement-request]
    (-> this (.createPlacementAsync create-placement-request))))

(defn update-project-async
  "Updates a project associated with your AWS account and region. With the exception of device template names, you
   can pass just the values that need to be updated because the update request will change only the values that are
   provided. To clear a value, pass the empty string (i.e., \"\").

  update-project-request - `com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest update-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync update-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProjectAsync update-project-request))))

(defn create-project-async
  "Creates an empty project with a placement template. A project contains zero or more placements that adhere to the
   placement template defined in the project.

  create-project-request - `com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest create-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync create-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest create-project-request]
    (-> this (.createProjectAsync create-project-request))))

(defn associate-device-with-placement-async
  "Associates a physical device with a placement.

  associate-device-with-placement-request - `com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDeviceWithPlacement operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest associate-device-with-placement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDeviceWithPlacementAsync associate-device-with-placement-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest associate-device-with-placement-request]
    (-> this (.associateDeviceWithPlacementAsync associate-device-with-placement-request))))

(defn list-projects-async
  "Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.

  list-projects-request - `com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest list-projects-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync list-projects-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjectsAsync list-projects-request))))

(defn delete-project-async
  "Deletes a project. To delete a project, it must not have any placements associated with it.



   When you delete a project, all associated data becomes irretrievable.

  delete-project-request - `com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest delete-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync delete-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProjectAsync delete-project-request))))

(defn describe-project-async
  "Returns an object describing a project.

  describe-project-request - `com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DescribeProjectResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest describe-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProjectAsync describe-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest describe-project-request]
    (-> this (.describeProjectAsync describe-project-request))))

(defn update-placement-async
  "Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., \"\").

  update-placement-request - `com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.UpdatePlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest update-placement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePlacementAsync update-placement-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest update-placement-request]
    (-> this (.updatePlacementAsync update-placement-request))))

(defn list-placements-async
  "Lists the placement(s) of a project.

  list-placements-request - `com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPlacements operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.ListPlacementsResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest list-placements-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPlacementsAsync list-placements-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest list-placements-request]
    (-> this (.listPlacementsAsync list-placements-request))))

(defn get-devices-in-placement-async
  "Returns an object enumerating the devices in a placement.

  get-devices-in-placement-request - `com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevicesInPlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest get-devices-in-placement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevicesInPlacementAsync get-devices-in-placement-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest get-devices-in-placement-request]
    (-> this (.getDevicesInPlacementAsync get-devices-in-placement-request))))

(defn disassociate-device-from-placement-async
  "Removes a physical device from a placement.

  disassociate-device-from-placement-request - `com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDeviceFromPlacement operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest disassociate-device-from-placement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDeviceFromPlacementAsync disassociate-device-from-placement-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest disassociate-device-from-placement-request]
    (-> this (.disassociateDeviceFromPlacementAsync disassociate-device-from-placement-request))))

(defn list-tags-for-resource-async
  "Lists the tags (metadata key/value pairs) which you have assigned to the resource.

  list-tags-for-resource-request - `com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn describe-placement-async
  "Describes a placement in a project.

  describe-placement-request - `com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DescribePlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest describe-placement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePlacementAsync describe-placement-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest describe-placement-request]
    (-> this (.describePlacementAsync describe-placement-request))))

(defn tag-resource-async
  "Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a
   resource. For more information, see AWS Tagging Strategies.

  tag-resource-request - `com.amazonaws.services.iot1clickprojects.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn delete-placement-async
  "Deletes a placement. To delete a placement, it must not have any devices associated with it.



   When you delete a placement, all associated data becomes irretrievable.

  delete-placement-request - `com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DeletePlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest delete-placement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlacementAsync delete-placement-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsync this ^com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest delete-placement-request]
    (-> this (.deletePlacementAsync delete-placement-request))))

