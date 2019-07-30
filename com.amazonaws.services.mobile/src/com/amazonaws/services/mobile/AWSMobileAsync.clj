(ns com.amazonaws.services.mobile.AWSMobileAsync
  "Interface for accessing AWS Mobile asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMobileAsync instead.



  AWS Mobile Service provides mobile app and website developers with capabilities required to configure AWS resources
  and bootstrap their developer desktop projects with the necessary SDKs, constants, tools and samples to make use of
  those resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mobile AWSMobileAsync]))

(defn describe-bundle-async
  "Get the bundle details for the requested bundle id.

  describe-bundle-request - Request structure to request the details of a specific bundle. - `com.amazonaws.services.mobile.model.DescribeBundleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBundle operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.DescribeBundleResult>`"
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.DescribeBundleRequest describe-bundle-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBundleAsync describe-bundle-request async-handler)))
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.DescribeBundleRequest describe-bundle-request]
    (-> this (.describeBundleAsync describe-bundle-request))))

(defn update-project-async
  "Update an existing project.

  update-project-request - Request structure used for requests to update project configuration. - `com.amazonaws.services.mobile.model.UpdateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.UpdateProjectRequest update-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync update-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProjectAsync update-project-request))))

(defn create-project-async
  "Creates an AWS Mobile Hub project.

  create-project-request - Request structure used to request a project be created. - `com.amazonaws.services.mobile.model.CreateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.CreateProjectRequest create-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync create-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.CreateProjectRequest create-project-request]
    (-> this (.createProjectAsync create-project-request))))

(defn export-bundle-async
  "Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile
   app clients with backend AWS resources.

  export-bundle-request - Request structure used to request generation of custom SDK and tool packages required to integrate mobile web or app clients with backed AWS resources. - `com.amazonaws.services.mobile.model.ExportBundleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportBundle operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.ExportBundleResult>`"
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.ExportBundleRequest export-bundle-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportBundleAsync export-bundle-request async-handler)))
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.ExportBundleRequest export-bundle-request]
    (-> this (.exportBundleAsync export-bundle-request))))

(defn list-projects-async
  "Lists projects in AWS Mobile Hub.

  list-projects-request - Request structure used to request projects list in AWS Mobile Hub. - `com.amazonaws.services.mobile.model.ListProjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.ListProjectsRequest list-projects-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync list-projects-request async-handler)))
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjectsAsync list-projects-request))))

(defn list-bundles-async
  "List all available bundles.

  list-bundles-request - Request structure to request all available bundles. - `com.amazonaws.services.mobile.model.ListBundlesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBundles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.ListBundlesResult>`"
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.ListBundlesRequest list-bundles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBundlesAsync list-bundles-request async-handler)))
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.ListBundlesRequest list-bundles-request]
    (-> this (.listBundlesAsync list-bundles-request))))

(defn export-project-async
  "Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push
   credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS
   account.

  export-project-request - Request structure used in requests to export project configuration details. - `com.amazonaws.services.mobile.model.ExportProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.ExportProjectResult>`"
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.ExportProjectRequest export-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportProjectAsync export-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.ExportProjectRequest export-project-request]
    (-> this (.exportProjectAsync export-project-request))))

(defn delete-project-async
  "Delets a project in AWS Mobile Hub.

  delete-project-request - Request structure used to request a project be deleted. - `com.amazonaws.services.mobile.model.DeleteProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.DeleteProjectRequest delete-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync delete-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProjectAsync delete-project-request))))

(defn describe-project-async
  "Gets details about a project in AWS Mobile Hub.

  describe-project-request - Request structure used to request details about a project. - `com.amazonaws.services.mobile.model.DescribeProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mobile.model.DescribeProjectResult>`"
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.DescribeProjectRequest describe-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProjectAsync describe-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSMobileAsync this ^com.amazonaws.services.mobile.model.DescribeProjectRequest describe-project-request]
    (-> this (.describeProjectAsync describe-project-request))))

