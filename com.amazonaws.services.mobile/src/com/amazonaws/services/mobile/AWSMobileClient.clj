(ns com.amazonaws.services.mobile.AWSMobileClient
  "Client for accessing AWS Mobile. All service calls made using this client are blocking, and will not return until the
  service call completes.


  AWS Mobile Service provides mobile app and website developers with capabilities required to configure AWS resources
  and bootstrap their developer desktop projects with the necessary SDKs, constants, tools and samples to make use of
  those resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mobile AWSMobileClient]))

(defn *builder
  "returns: `com.amazonaws.services.mobile.AWSMobileClientBuilder`"
  (^com.amazonaws.services.mobile.AWSMobileClientBuilder []
    (AWSMobileClient/builder )))

(defn describe-project
  "Gets details about a project in AWS Mobile Hub.

  request - `com.amazonaws.services.mobile.model.DescribeProjectRequest`

  returns: Result of the DescribeProject operation returned by the service. - `com.amazonaws.services.mobile.model.DescribeProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.DescribeProjectResult [^AWSMobileClient this ^com.amazonaws.services.mobile.model.DescribeProjectRequest request]
    (-> this (.describeProject request))))

(defn create-project
  "Creates an AWS Mobile Hub project.

  request - `com.amazonaws.services.mobile.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.mobile.model.CreateProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.CreateProjectResult [^AWSMobileClient this ^com.amazonaws.services.mobile.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn export-project
  "Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push
   credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS
   account.

  request - `com.amazonaws.services.mobile.model.ExportProjectRequest`

  returns: Result of the ExportProject operation returned by the service. - `com.amazonaws.services.mobile.model.ExportProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.ExportProjectResult [^AWSMobileClient this ^com.amazonaws.services.mobile.model.ExportProjectRequest request]
    (-> this (.exportProject request))))

(defn describe-bundle
  "Get the bundle details for the requested bundle id.

  request - `com.amazonaws.services.mobile.model.DescribeBundleRequest`

  returns: Result of the DescribeBundle operation returned by the service. - `com.amazonaws.services.mobile.model.DescribeBundleResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.DescribeBundleResult [^AWSMobileClient this ^com.amazonaws.services.mobile.model.DescribeBundleRequest request]
    (-> this (.describeBundle request))))

(defn export-bundle
  "Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile
   app clients with backend AWS resources.

  request - `com.amazonaws.services.mobile.model.ExportBundleRequest`

  returns: Result of the ExportBundle operation returned by the service. - `com.amazonaws.services.mobile.model.ExportBundleResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.ExportBundleResult [^AWSMobileClient this ^com.amazonaws.services.mobile.model.ExportBundleRequest request]
    (-> this (.exportBundle request))))

(defn list-projects
  "Lists projects in AWS Mobile Hub.

  request - `com.amazonaws.services.mobile.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.mobile.model.ListProjectsResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.ListProjectsResult [^AWSMobileClient this ^com.amazonaws.services.mobile.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn list-bundles
  "List all available bundles.

  request - `com.amazonaws.services.mobile.model.ListBundlesRequest`

  returns: Result of the ListBundles operation returned by the service. - `com.amazonaws.services.mobile.model.ListBundlesResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.ListBundlesResult [^AWSMobileClient this ^com.amazonaws.services.mobile.model.ListBundlesRequest request]
    (-> this (.listBundles request))))

(defn update-project
  "Update an existing project.

  request - `com.amazonaws.services.mobile.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.mobile.model.UpdateProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.UpdateProjectResult [^AWSMobileClient this ^com.amazonaws.services.mobile.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMobileClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-project
  "Delets a project in AWS Mobile Hub.

  request - `com.amazonaws.services.mobile.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.mobile.model.DeleteProjectResult`

  throws: com.amazonaws.services.mobile.model.InternalFailureException - The service has encountered an unexpected error condition which prevents it from servicing the request."
  (^com.amazonaws.services.mobile.model.DeleteProjectResult [^AWSMobileClient this ^com.amazonaws.services.mobile.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

