(ns com.amazonaws.services.mobile.AbstractAWSMobileAsync
  "Abstract implementation of AWSMobileAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mobile AbstractAWSMobileAsync]))

(defn describe-bundle-async
  "Description copied from interface: AWSMobileAsync

  request - Request structure to request the details of a specific bundle. - `com.amazonaws.services.mobile.model.DescribeBundleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBundle operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.DescribeBundleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.DescribeBundleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBundleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.DescribeBundleRequest request]
    (-> this (.describeBundleAsync request))))

(defn update-project-async
  "Description copied from interface: AWSMobileAsync

  request - Request structure used for requests to update project configuration. - `com.amazonaws.services.mobile.model.UpdateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.UpdateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.UpdateProjectRequest request]
    (-> this (.updateProjectAsync request))))

(defn create-project-async
  "Description copied from interface: AWSMobileAsync

  request - Request structure used to request a project be created. - `com.amazonaws.services.mobile.model.CreateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.CreateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.CreateProjectRequest request]
    (-> this (.createProjectAsync request))))

(defn export-bundle-async
  "Description copied from interface: AWSMobileAsync

  request - Request structure used to request generation of custom SDK and tool packages required to integrate mobile web or app clients with backed AWS resources. - `com.amazonaws.services.mobile.model.ExportBundleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportBundle operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.ExportBundleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.ExportBundleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportBundleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.ExportBundleRequest request]
    (-> this (.exportBundleAsync request))))

(defn list-projects-async
  "Description copied from interface: AWSMobileAsync

  request - Request structure used to request projects list in AWS Mobile Hub. - `com.amazonaws.services.mobile.model.ListProjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.ListProjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.ListProjectsRequest request]
    (-> this (.listProjectsAsync request))))

(defn list-bundles-async
  "Description copied from interface: AWSMobileAsync

  request - Request structure to request all available bundles. - `com.amazonaws.services.mobile.model.ListBundlesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBundles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.ListBundlesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.ListBundlesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBundlesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.ListBundlesRequest request]
    (-> this (.listBundlesAsync request))))

(defn export-project-async
  "Description copied from interface: AWSMobileAsync

  request - Request structure used in requests to export project configuration details. - `com.amazonaws.services.mobile.model.ExportProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.ExportProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.ExportProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.ExportProjectRequest request]
    (-> this (.exportProjectAsync request))))

(defn delete-project-async
  "Description copied from interface: AWSMobileAsync

  request - Request structure used to request a project be deleted. - `com.amazonaws.services.mobile.model.DeleteProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.DeleteProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.DeleteProjectRequest request]
    (-> this (.deleteProjectAsync request))))

(defn describe-project-async
  "Description copied from interface: AWSMobileAsync

  request - Request structure used to request details about a project. - `com.amazonaws.services.mobile.model.DescribeProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.DescribeProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.DescribeProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMobileAsync this ^com.amazonaws.services.mobile.model.DescribeProjectRequest request]
    (-> this (.describeProjectAsync request))))

