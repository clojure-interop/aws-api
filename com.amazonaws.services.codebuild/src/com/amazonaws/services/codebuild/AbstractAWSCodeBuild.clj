(ns com.amazonaws.services.codebuild.AbstractAWSCodeBuild
  "Abstract implementation of AWSCodeBuild. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codebuild AbstractAWSCodeBuild]))

(defn delete-source-credentials
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest`

  returns: Result of the DeleteSourceCredentials operation returned by the service. - `com.amazonaws.services.codebuild.model.DeleteSourceCredentialsResult`"
  (^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest request]
    (-> this (.deleteSourceCredentials request))))

(defn delete-webhook
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.DeleteWebhookRequest`

  returns: Result of the DeleteWebhook operation returned by the service. - `com.amazonaws.services.codebuild.model.DeleteWebhookResult`"
  (^com.amazonaws.services.codebuild.model.DeleteWebhookResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhook request))))

(defn set-region
  "Description copied from interface: AWSCodeBuild

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSCodeBuild this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-project
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.codebuild.model.CreateProjectResult`"
  (^com.amazonaws.services.codebuild.model.CreateProjectResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn batch-delete-builds
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest`

  returns: Result of the BatchDeleteBuilds operation returned by the service. - `com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult`"
  (^com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest request]
    (-> this (.batchDeleteBuilds request))))

(defn batch-get-projects
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.BatchGetProjectsRequest`

  returns: Result of the BatchGetProjects operation returned by the service. - `com.amazonaws.services.codebuild.model.BatchGetProjectsResult`"
  (^com.amazonaws.services.codebuild.model.BatchGetProjectsResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.BatchGetProjectsRequest request]
    (-> this (.batchGetProjects request))))

(defn invalidate-project-cache
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest`

  returns: Result of the InvalidateProjectCache operation returned by the service. - `com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult`"
  (^com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest request]
    (-> this (.invalidateProjectCache request))))

(defn shutdown
  "Description copied from interface: AWSCodeBuild"
  ([^AbstractAWSCodeBuild this]
    (-> this (.shutdown))))

(defn update-webhook
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.UpdateWebhookRequest`

  returns: Result of the UpdateWebhook operation returned by the service. - `com.amazonaws.services.codebuild.model.UpdateWebhookResult`"
  (^com.amazonaws.services.codebuild.model.UpdateWebhookResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.UpdateWebhookRequest request]
    (-> this (.updateWebhook request))))

(defn list-source-credentials
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest`

  returns: Result of the ListSourceCredentials operation returned by the service. - `com.amazonaws.services.codebuild.model.ListSourceCredentialsResult`"
  (^com.amazonaws.services.codebuild.model.ListSourceCredentialsResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest request]
    (-> this (.listSourceCredentials request))))

(defn set-endpoint
  "Description copied from interface: AWSCodeBuild

  endpoint - The endpoint (ex: \"codebuild.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"codebuild.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSCodeBuild this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-projects
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.codebuild.model.ListProjectsResult`"
  (^com.amazonaws.services.codebuild.model.ListProjectsResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn stop-build
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.StopBuildRequest`

  returns: Result of the StopBuild operation returned by the service. - `com.amazonaws.services.codebuild.model.StopBuildResult`"
  (^com.amazonaws.services.codebuild.model.StopBuildResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.StopBuildRequest request]
    (-> this (.stopBuild request))))

(defn list-curated-environment-images
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest`

  returns: Result of the ListCuratedEnvironmentImages operation returned by the service. - `com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult`"
  (^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest request]
    (-> this (.listCuratedEnvironmentImages request))))

(defn update-project
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.codebuild.model.UpdateProjectResult`"
  (^com.amazonaws.services.codebuild.model.UpdateProjectResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn import-source-credentials
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest`

  returns: Result of the ImportSourceCredentials operation returned by the service. - `com.amazonaws.services.codebuild.model.ImportSourceCredentialsResult`"
  (^com.amazonaws.services.codebuild.model.ImportSourceCredentialsResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest request]
    (-> this (.importSourceCredentials request))))

(defn list-builds
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.ListBuildsRequest`

  returns: Result of the ListBuilds operation returned by the service. - `com.amazonaws.services.codebuild.model.ListBuildsResult`"
  (^com.amazonaws.services.codebuild.model.ListBuildsResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListBuildsRequest request]
    (-> this (.listBuilds request))))

(defn list-builds-for-project
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest`

  returns: Result of the ListBuildsForProject operation returned by the service. - `com.amazonaws.services.codebuild.model.ListBuildsForProjectResult`"
  (^com.amazonaws.services.codebuild.model.ListBuildsForProjectResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest request]
    (-> this (.listBuildsForProject request))))

(defn create-webhook
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.CreateWebhookRequest`

  returns: Result of the CreateWebhook operation returned by the service. - `com.amazonaws.services.codebuild.model.CreateWebhookResult`"
  (^com.amazonaws.services.codebuild.model.CreateWebhookResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.CreateWebhookRequest request]
    (-> this (.createWebhook request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCodeBuild

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCodeBuild this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-build
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.StartBuildRequest`

  returns: Result of the StartBuild operation returned by the service. - `com.amazonaws.services.codebuild.model.StartBuildResult`"
  (^com.amazonaws.services.codebuild.model.StartBuildResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.StartBuildRequest request]
    (-> this (.startBuild request))))

(defn batch-get-builds
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.BatchGetBuildsRequest`

  returns: Result of the BatchGetBuilds operation returned by the service. - `com.amazonaws.services.codebuild.model.BatchGetBuildsResult`"
  (^com.amazonaws.services.codebuild.model.BatchGetBuildsResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.BatchGetBuildsRequest request]
    (-> this (.batchGetBuilds request))))

(defn delete-project
  "Description copied from interface: AWSCodeBuild

  request - `com.amazonaws.services.codebuild.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.codebuild.model.DeleteProjectResult`"
  (^com.amazonaws.services.codebuild.model.DeleteProjectResult [^AbstractAWSCodeBuild this ^com.amazonaws.services.codebuild.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

