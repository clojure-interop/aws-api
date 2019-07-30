(ns com.amazonaws.services.iot1clickprojects.AWSIoT1ClickProjectsAsyncClient
  "Client for accessing AWS IoT 1-Click Projects asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  The AWS IoT 1-Click Projects API Reference"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot1clickprojects AWSIoT1ClickProjectsAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.iot1clickprojects.AWSIoT1ClickProjectsAsyncClientBuilder`"
  (^com.amazonaws.services.iot1clickprojects.AWSIoT1ClickProjectsAsyncClientBuilder []
    (AWSIoT1ClickProjectsAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSIoT1ClickProjectsAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-placement-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.CreatePlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.CreatePlacementRequest request]
    (-> this (.createPlacementAsync request))))

(defn update-project-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.UpdateProjectRequest request]
    (-> this (.updateProjectAsync request))))

(defn create-project-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.CreateProjectRequest request]
    (-> this (.createProjectAsync request))))

(defn associate-device-with-placement-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDeviceWithPlacement operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDeviceWithPlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.AssociateDeviceWithPlacementRequest request]
    (-> this (.associateDeviceWithPlacementAsync request))))

(defn list-projects-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.ListProjectsRequest request]
    (-> this (.listProjectsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSIoT1ClickProjectsAsyncClient this]
    (-> this (.shutdown))))

(defn delete-project-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DeleteProjectRequest request]
    (-> this (.deleteProjectAsync request))))

(defn describe-project-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DescribeProjectResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DescribeProjectRequest request]
    (-> this (.describeProjectAsync request))))

(defn update-placement-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.UpdatePlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.UpdatePlacementRequest request]
    (-> this (.updatePlacementAsync request))))

(defn list-placements-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPlacements operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.ListPlacementsResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPlacementsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.ListPlacementsRequest request]
    (-> this (.listPlacementsAsync request))))

(defn get-devices-in-placement-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevicesInPlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevicesInPlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.GetDevicesInPlacementRequest request]
    (-> this (.getDevicesInPlacementAsync request))))

(defn disassociate-device-from-placement-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDeviceFromPlacement operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDeviceFromPlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DisassociateDeviceFromPlacementRequest request]
    (-> this (.disassociateDeviceFromPlacementAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn describe-placement-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DescribePlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DescribePlacementRequest request]
    (-> this (.describePlacementAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn delete-placement-async
  "Description copied from interface: AWSIoT1ClickProjectsAsync

  request - `com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot1clickprojects.model.DeletePlacementResult>`"
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoT1ClickProjectsAsyncClient this ^com.amazonaws.services.iot1clickprojects.model.DeletePlacementRequest request]
    (-> this (.deletePlacementAsync request))))

