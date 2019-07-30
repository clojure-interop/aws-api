(ns com.amazonaws.services.mobile.AWSMobile
  "Interface for accessing AWS Mobile.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMobile instead.



  AWS Mobile Service provides mobile app and website developers with capabilities required to configure AWS resources
  and bootstrap their developer desktop projects with the necessary SDKs, constants, tools and samples to make use of
  those resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mobile AWSMobile]))

(defn describe-project
  "Gets details about a project in AWS Mobile Hub.

  describe-project-request - Request structure used to request details about a project. - `com.amazonaws.services.mobile.model.DescribeProjectRequest`

  returns: Result of the DescribeProject operation returned by the service. - `com.amazonaws.services.mobile.model.DescribeProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.DescribeProjectResult [^AWSMobile this ^com.amazonaws.services.mobile.model.DescribeProjectRequest describe-project-request]
    (-> this (.describeProject describe-project-request))))

(defn create-project
  "Creates an AWS Mobile Hub project.

  create-project-request - Request structure used to request a project be created. - `com.amazonaws.services.mobile.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.mobile.model.CreateProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.CreateProjectResult [^AWSMobile this ^com.amazonaws.services.mobile.model.CreateProjectRequest create-project-request]
    (-> this (.createProject create-project-request))))

(defn export-project
  "Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push
   credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS
   account.

  export-project-request - Request structure used in requests to export project configuration details. - `com.amazonaws.services.mobile.model.ExportProjectRequest`

  returns: Result of the ExportProject operation returned by the service. - `com.amazonaws.services.mobile.model.ExportProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.ExportProjectResult [^AWSMobile this ^com.amazonaws.services.mobile.model.ExportProjectRequest export-project-request]
    (-> this (.exportProject export-project-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMobile this]
    (-> this (.shutdown))))

(defn describe-bundle
  "Get the bundle details for the requested bundle id.

  describe-bundle-request - Request structure to request the details of a specific bundle. - `com.amazonaws.services.mobile.model.DescribeBundleRequest`

  returns: Result of the DescribeBundle operation returned by the service. - `com.amazonaws.services.mobile.model.DescribeBundleResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.DescribeBundleResult [^AWSMobile this ^com.amazonaws.services.mobile.model.DescribeBundleRequest describe-bundle-request]
    (-> this (.describeBundle describe-bundle-request))))

(defn export-bundle
  "Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile
   app clients with backend AWS resources.

  export-bundle-request - Request structure used to request generation of custom SDK and tool packages required to integrate mobile web or app clients with backed AWS resources. - `com.amazonaws.services.mobile.model.ExportBundleRequest`

  returns: Result of the ExportBundle operation returned by the service. - `com.amazonaws.services.mobile.model.ExportBundleResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.ExportBundleResult [^AWSMobile this ^com.amazonaws.services.mobile.model.ExportBundleRequest export-bundle-request]
    (-> this (.exportBundle export-bundle-request))))

(defn list-projects
  "Lists projects in AWS Mobile Hub.

  list-projects-request - Request structure used to request projects list in AWS Mobile Hub. - `com.amazonaws.services.mobile.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.mobile.model.ListProjectsResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.ListProjectsResult [^AWSMobile this ^com.amazonaws.services.mobile.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjects list-projects-request))))

(defn list-bundles
  "List all available bundles.

  list-bundles-request - Request structure to request all available bundles. - `com.amazonaws.services.mobile.model.ListBundlesRequest`

  returns: Result of the ListBundles operation returned by the service. - `com.amazonaws.services.mobile.model.ListBundlesResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.ListBundlesResult [^AWSMobile this ^com.amazonaws.services.mobile.model.ListBundlesRequest list-bundles-request]
    (-> this (.listBundles list-bundles-request))))

(defn update-project
  "Update an existing project.

  update-project-request - Request structure used for requests to update project configuration. - `com.amazonaws.services.mobile.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.mobile.model.UpdateProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.UpdateProjectResult [^AWSMobile this ^com.amazonaws.services.mobile.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProject update-project-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMobile this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-project
  "Delets a project in AWS Mobile Hub.

  delete-project-request - Request structure used to request a project be deleted. - `com.amazonaws.services.mobile.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.mobile.model.DeleteProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.DeleteProjectResult [^AWSMobile this ^com.amazonaws.services.mobile.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProject delete-project-request))))

