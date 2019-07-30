(ns com.amazonaws.services.codebuild.AWSCodeBuildAsync
  "Interface for accessing AWS CodeBuild asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCodeBuildAsync instead.


  AWS CodeBuild

  AWS CodeBuild is a fully managed build service in the cloud. AWS CodeBuild compiles your source code, runs unit
  tests, and produces artifacts that are ready to deploy. AWS CodeBuild eliminates the need to provision, manage, and
  scale your own build servers. It provides prepackaged build environments for the most popular programming languages
  and build tools, such as Apache Maven, Gradle, and more. You can also fully customize build environments in AWS
  CodeBuild to use your own build tools. AWS CodeBuild scales automatically to meet peak build requests. You pay only
  for the build time you consume. For more information about AWS CodeBuild, see the AWS CodeBuild User Guide.


  AWS CodeBuild supports these operations:




  BatchDeleteBuilds: Deletes one or more builds.




  BatchGetProjects: Gets information about one or more build projects. A build project defines how
  AWS CodeBuild runs a build. This includes information such as where to get the source code to build, the build
  environment to use, the build commands to run, and where to store the build output. A build environment is a
  representation of operating system, programming language runtime, and tools that AWS CodeBuild uses to run a build.
  You can add tags to build projects to help manage your resources and costs.




  CreateProject: Creates a build project.




  CreateWebhook: For an existing AWS CodeBuild build project that has its source code stored in a GitHub
  or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed
  to the repository.




  UpdateWebhook: Changes the settings of an existing webhook.




  DeleteProject: Deletes a build project.




  DeleteWebhook: For an existing AWS CodeBuild build project that has its source code stored in a GitHub
  or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to
  the repository.




  ListProjects: Gets a list of build project names, with each build project name representing a single
  build project.




  UpdateProject: Changes the settings of an existing build project.




  BatchGetBuilds: Gets information about one or more builds.




  ListBuilds: Gets a list of build IDs, with each build ID representing a single build.




  ListBuildsForProject: Gets a list of build IDs for the specified build project, with each build ID
  representing a single build.




  StartBuild: Starts running a build.




  StopBuild: Attempts to stop running a build.




  ListCuratedEnvironmentImages: Gets information about Docker images that are managed by AWS CodeBuild.




  DeleteSourceCredentials: Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.




  ImportSourceCredentials: Imports the source repository credentials for an AWS CodeBuild project that has
  its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository.




  ListSourceCredentials: Returns a list of SourceCredentialsInfo objects. Each
  SourceCredentialsInfo object includes the authentication type, token ARN, and type of source provider
  for one set of credentials."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codebuild AWSCodeBuildAsync]))

(defn delete-source-credentials-async
  "Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.

  delete-source-credentials-request - `com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSourceCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.DeleteSourceCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest delete-source-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSourceCredentialsAsync delete-source-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest delete-source-credentials-request]
    (-> this (.deleteSourceCredentialsAsync delete-source-credentials-request))))

(defn invalidate-project-cache-async
  "Resets the cache for a project.

  invalidate-project-cache-request - `com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvalidateProjectCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest invalidate-project-cache-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invalidateProjectCacheAsync invalidate-project-cache-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest invalidate-project-cache-request]
    (-> this (.invalidateProjectCacheAsync invalidate-project-cache-request))))

(defn import-source-credentials-async
  "Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a
   GitHub, GitHub Enterprise, or Bitbucket repository.

  import-source-credentials-request - `com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportSourceCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ImportSourceCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest import-source-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importSourceCredentialsAsync import-source-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest import-source-credentials-request]
    (-> this (.importSourceCredentialsAsync import-source-credentials-request))))

(defn update-project-async
  "Changes the settings of a build project.

  update-project-request - `com.amazonaws.services.codebuild.model.UpdateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.UpdateProjectRequest update-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync update-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProjectAsync update-project-request))))

(defn create-project-async
  "Creates a build project.

  create-project-request - `com.amazonaws.services.codebuild.model.CreateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.CreateProjectRequest create-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync create-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.CreateProjectRequest create-project-request]
    (-> this (.createProjectAsync create-project-request))))

(defn list-builds-for-project-async
  "Gets a list of build IDs for the specified build project, with each build ID representing a single build.

  list-builds-for-project-request - `com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBuildsForProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListBuildsForProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest list-builds-for-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBuildsForProjectAsync list-builds-for-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest list-builds-for-project-request]
    (-> this (.listBuildsForProjectAsync list-builds-for-project-request))))

(defn create-webhook-async
  "For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
   enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.



   If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline,
   then two identical builds are created for each commit. One build is triggered through webhooks, and one through
   AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are
   using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console,
   clear the Webhook box. For more information, see step 5 in Change a
   Build Project's Settings.

  create-webhook-request - `com.amazonaws.services.codebuild.model.CreateWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.CreateWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.CreateWebhookRequest create-webhook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWebhookAsync create-webhook-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.CreateWebhookRequest create-webhook-request]
    (-> this (.createWebhookAsync create-webhook-request))))

(defn list-projects-async
  "Gets a list of build project names, with each build project name representing a single build project.

  list-projects-request - `com.amazonaws.services.codebuild.model.ListProjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListProjectsRequest list-projects-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync list-projects-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjectsAsync list-projects-request))))

(defn batch-get-builds-async
  "Gets information about builds.

  batch-get-builds-request - `com.amazonaws.services.codebuild.model.BatchGetBuildsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.BatchGetBuildsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchGetBuildsRequest batch-get-builds-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetBuildsAsync batch-get-builds-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchGetBuildsRequest batch-get-builds-request]
    (-> this (.batchGetBuildsAsync batch-get-builds-request))))

(defn stop-build-async
  "Attempts to stop running a build.

  stop-build-request - `com.amazonaws.services.codebuild.model.StopBuildRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.StopBuildResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.StopBuildRequest stop-build-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopBuildAsync stop-build-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.StopBuildRequest stop-build-request]
    (-> this (.stopBuildAsync stop-build-request))))

(defn update-webhook-async
  "Updates the webhook associated with an AWS CodeBuild build project.



   If you use Bitbucket for your repository, rotateSecret is ignored.

  update-webhook-request - `com.amazonaws.services.codebuild.model.UpdateWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.UpdateWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.UpdateWebhookRequest update-webhook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWebhookAsync update-webhook-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.UpdateWebhookRequest update-webhook-request]
    (-> this (.updateWebhookAsync update-webhook-request))))

(defn delete-webhook-async
  "For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
   stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.

  delete-webhook-request - `com.amazonaws.services.codebuild.model.DeleteWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.DeleteWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteWebhookRequest delete-webhook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWebhookAsync delete-webhook-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteWebhookRequest delete-webhook-request]
    (-> this (.deleteWebhookAsync delete-webhook-request))))

(defn delete-project-async
  "Deletes a build project.

  delete-project-request - `com.amazonaws.services.codebuild.model.DeleteProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteProjectRequest delete-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync delete-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProjectAsync delete-project-request))))

(defn batch-delete-builds-async
  "Deletes one or more builds.

  batch-delete-builds-request - `com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest batch-delete-builds-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteBuildsAsync batch-delete-builds-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest batch-delete-builds-request]
    (-> this (.batchDeleteBuildsAsync batch-delete-builds-request))))

(defn batch-get-projects-async
  "Gets information about build projects.

  batch-get-projects-request - `com.amazonaws.services.codebuild.model.BatchGetProjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.BatchGetProjectsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchGetProjectsRequest batch-get-projects-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetProjectsAsync batch-get-projects-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.BatchGetProjectsRequest batch-get-projects-request]
    (-> this (.batchGetProjectsAsync batch-get-projects-request))))

(defn list-source-credentials-async
  "Returns a list of SourceCredentialsInfo objects.

  list-source-credentials-request - `com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSourceCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListSourceCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest list-source-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSourceCredentialsAsync list-source-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest list-source-credentials-request]
    (-> this (.listSourceCredentialsAsync list-source-credentials-request))))

(defn list-curated-environment-images-async
  "Gets information about Docker images that are managed by AWS CodeBuild.

  list-curated-environment-images-request - `com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCuratedEnvironmentImages operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest list-curated-environment-images-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCuratedEnvironmentImagesAsync list-curated-environment-images-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest list-curated-environment-images-request]
    (-> this (.listCuratedEnvironmentImagesAsync list-curated-environment-images-request))))

(defn list-builds-async
  "Gets a list of build IDs, with each build ID representing a single build.

  list-builds-request - `com.amazonaws.services.codebuild.model.ListBuildsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListBuildsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListBuildsRequest list-builds-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBuildsAsync list-builds-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.ListBuildsRequest list-builds-request]
    (-> this (.listBuildsAsync list-builds-request))))

(defn start-build-async
  "Starts running a build.

  start-build-request - `com.amazonaws.services.codebuild.model.StartBuildRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.StartBuildResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.StartBuildRequest start-build-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startBuildAsync start-build-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsync this ^com.amazonaws.services.codebuild.model.StartBuildRequest start-build-request]
    (-> this (.startBuildAsync start-build-request))))

