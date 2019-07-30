(ns com.amazonaws.services.mobile.AbstractAWSMobile
  "Abstract implementation of AWSMobile. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mobile AbstractAWSMobile]))

(defn describe-project
  "Description copied from interface: AWSMobile

  request - Request structure used to request details about a project. - `com.amazonaws.services.mobile.model.DescribeProjectRequest`

  returns: Result of the DescribeProject operation returned by the service. - `com.amazonaws.services.mobile.model.DescribeProjectResult`"
  (^com.amazonaws.services.mobile.model.DescribeProjectResult [^AbstractAWSMobile this ^com.amazonaws.services.mobile.model.DescribeProjectRequest request]
    (-> this (.describeProject request))))

(defn create-project
  "Description copied from interface: AWSMobile

  request - Request structure used to request a project be created. - `com.amazonaws.services.mobile.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.mobile.model.CreateProjectResult`"
  (^com.amazonaws.services.mobile.model.CreateProjectResult [^AbstractAWSMobile this ^com.amazonaws.services.mobile.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn export-project
  "Description copied from interface: AWSMobile

  request - Request structure used in requests to export project configuration details. - `com.amazonaws.services.mobile.model.ExportProjectRequest`

  returns: Result of the ExportProject operation returned by the service. - `com.amazonaws.services.mobile.model.ExportProjectResult`"
  (^com.amazonaws.services.mobile.model.ExportProjectResult [^AbstractAWSMobile this ^com.amazonaws.services.mobile.model.ExportProjectRequest request]
    (-> this (.exportProject request))))

(defn shutdown
  "Description copied from interface: AWSMobile"
  ([^AbstractAWSMobile this]
    (-> this (.shutdown))))

(defn describe-bundle
  "Description copied from interface: AWSMobile

  request - Request structure to request the details of a specific bundle. - `com.amazonaws.services.mobile.model.DescribeBundleRequest`

  returns: Result of the DescribeBundle operation returned by the service. - `com.amazonaws.services.mobile.model.DescribeBundleResult`"
  (^com.amazonaws.services.mobile.model.DescribeBundleResult [^AbstractAWSMobile this ^com.amazonaws.services.mobile.model.DescribeBundleRequest request]
    (-> this (.describeBundle request))))

(defn export-bundle
  "Description copied from interface: AWSMobile

  request - Request structure used to request generation of custom SDK and tool packages required to integrate mobile web or app clients with backed AWS resources. - `com.amazonaws.services.mobile.model.ExportBundleRequest`

  returns: Result of the ExportBundle operation returned by the service. - `com.amazonaws.services.mobile.model.ExportBundleResult`"
  (^com.amazonaws.services.mobile.model.ExportBundleResult [^AbstractAWSMobile this ^com.amazonaws.services.mobile.model.ExportBundleRequest request]
    (-> this (.exportBundle request))))

(defn list-projects
  "Description copied from interface: AWSMobile

  request - Request structure used to request projects list in AWS Mobile Hub. - `com.amazonaws.services.mobile.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.mobile.model.ListProjectsResult`"
  (^com.amazonaws.services.mobile.model.ListProjectsResult [^AbstractAWSMobile this ^com.amazonaws.services.mobile.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn list-bundles
  "Description copied from interface: AWSMobile

  request - Request structure to request all available bundles. - `com.amazonaws.services.mobile.model.ListBundlesRequest`

  returns: Result of the ListBundles operation returned by the service. - `com.amazonaws.services.mobile.model.ListBundlesResult`"
  (^com.amazonaws.services.mobile.model.ListBundlesResult [^AbstractAWSMobile this ^com.amazonaws.services.mobile.model.ListBundlesRequest request]
    (-> this (.listBundles request))))

(defn update-project
  "Description copied from interface: AWSMobile

  request - Request structure used for requests to update project configuration. - `com.amazonaws.services.mobile.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.mobile.model.UpdateProjectResult`"
  (^com.amazonaws.services.mobile.model.UpdateProjectResult [^AbstractAWSMobile this ^com.amazonaws.services.mobile.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMobile

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMobile this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-project
  "Description copied from interface: AWSMobile

  request - Request structure used to request a project be deleted. - `com.amazonaws.services.mobile.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.mobile.model.DeleteProjectResult`"
  (^com.amazonaws.services.mobile.model.DeleteProjectResult [^AbstractAWSMobile this ^com.amazonaws.services.mobile.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

