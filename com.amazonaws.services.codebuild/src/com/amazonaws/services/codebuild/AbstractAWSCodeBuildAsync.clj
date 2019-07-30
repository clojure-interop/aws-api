(ns com.amazonaws.services.codebuild.AbstractAWSCodeBuildAsync
  "Abstract implementation of AWSCodeBuildAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codebuild AbstractAWSCodeBuildAsync]))

(defn delete-source-credentials-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSourceCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.DeleteSourceCredentialsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSourceCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest request]
    (-> this (.deleteSourceCredentialsAsync request))))

(defn invalidate-project-cache-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvalidateProjectCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invalidateProjectCacheAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest request]
    (-> this (.invalidateProjectCacheAsync request))))

(defn import-source-credentials-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportSourceCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ImportSourceCredentialsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importSourceCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest request]
    (-> this (.importSourceCredentialsAsync request))))

(defn update-project-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.UpdateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.UpdateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.UpdateProjectRequest request]
    (-> this (.updateProjectAsync request))))

(defn create-project-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.CreateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.CreateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.CreateProjectRequest request]
    (-> this (.createProjectAsync request))))

(defn list-builds-for-project-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBuildsForProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListBuildsForProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBuildsForProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest request]
    (-> this (.listBuildsForProjectAsync request))))

(defn create-webhook-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.CreateWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.CreateWebhookResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.CreateWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.CreateWebhookRequest request]
    (-> this (.createWebhookAsync request))))

(defn list-projects-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListProjectsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListProjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListProjectsRequest request]
    (-> this (.listProjectsAsync request))))

(defn batch-get-builds-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.BatchGetBuildsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.BatchGetBuildsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchGetBuildsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetBuildsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchGetBuildsRequest request]
    (-> this (.batchGetBuildsAsync request))))

(defn stop-build-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.StopBuildRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.StopBuildResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.StopBuildRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopBuildAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.StopBuildRequest request]
    (-> this (.stopBuildAsync request))))

(defn update-webhook-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.UpdateWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.UpdateWebhookResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.UpdateWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.UpdateWebhookRequest request]
    (-> this (.updateWebhookAsync request))))

(defn delete-webhook-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.DeleteWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.DeleteWebhookResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhookAsync request))))

(defn delete-project-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.DeleteProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteProjectRequest request]
    (-> this (.deleteProjectAsync request))))

(defn batch-delete-builds-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteBuildsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest request]
    (-> this (.batchDeleteBuildsAsync request))))

(defn batch-get-projects-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.BatchGetProjectsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.BatchGetProjectsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchGetProjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetProjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchGetProjectsRequest request]
    (-> this (.batchGetProjectsAsync request))))

(defn list-source-credentials-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSourceCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListSourceCredentialsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSourceCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest request]
    (-> this (.listSourceCredentialsAsync request))))

(defn list-curated-environment-images-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCuratedEnvironmentImages operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCuratedEnvironmentImagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest request]
    (-> this (.listCuratedEnvironmentImagesAsync request))))

(defn list-builds-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListBuildsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListBuildsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListBuildsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBuildsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListBuildsRequest request]
    (-> this (.listBuildsAsync request))))

(defn start-build-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.StartBuildRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.StartBuildResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.StartBuildRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startBuildAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.StartBuildRequest request]
    (-> this (.startBuildAsync request))))

