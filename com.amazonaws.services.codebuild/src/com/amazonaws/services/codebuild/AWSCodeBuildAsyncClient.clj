(ns com.amazonaws.services.codebuild.AWSCodeBuildAsyncClient
  "Client for accessing AWS CodeBuild asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

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
  (:import [com.amazonaws.services.codebuild AWSCodeBuildAsyncClient]))

(defn ->aws-code-build-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSCodeBuildAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCodeBuildAsyncClient aws-credentials client-configuration executor-service))
  (^AWSCodeBuildAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCodeBuildAsyncClient aws-credentials executor-service))
  (^AWSCodeBuildAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCodeBuildAsyncClient client-configuration))
  (^AWSCodeBuildAsyncClient []
    (new AWSCodeBuildAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.codebuild.AWSCodeBuildAsyncClientBuilder`"
  (^com.amazonaws.services.codebuild.AWSCodeBuildAsyncClientBuilder []
    (AWSCodeBuildAsyncClient/asyncBuilder )))

(defn delete-source-credentials-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSourceCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.DeleteSourceCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSourceCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest request]
    (-> this (.deleteSourceCredentialsAsync request))))

(defn invalidate-project-cache-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvalidateProjectCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invalidateProjectCacheAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest request]
    (-> this (.invalidateProjectCacheAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCodeBuildAsyncClient this]
    (-> this (.getExecutorService))))

(defn import-source-credentials-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportSourceCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ImportSourceCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importSourceCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest request]
    (-> this (.importSourceCredentialsAsync request))))

(defn update-project-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.UpdateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.UpdateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.UpdateProjectRequest request]
    (-> this (.updateProjectAsync request))))

(defn create-project-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.CreateProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.CreateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.CreateProjectRequest request]
    (-> this (.createProjectAsync request))))

(defn list-builds-for-project-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBuildsForProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListBuildsForProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBuildsForProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest request]
    (-> this (.listBuildsForProjectAsync request))))

(defn create-webhook-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.CreateWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.CreateWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.CreateWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.CreateWebhookRequest request]
    (-> this (.createWebhookAsync request))))

(defn list-projects-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListProjectsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListProjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListProjectsRequest request]
    (-> this (.listProjectsAsync request))))

(defn batch-get-builds-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.BatchGetBuildsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.BatchGetBuildsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.BatchGetBuildsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetBuildsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.BatchGetBuildsRequest request]
    (-> this (.batchGetBuildsAsync request))))

(defn stop-build-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.StopBuildRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.StopBuildResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.StopBuildRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopBuildAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.StopBuildRequest request]
    (-> this (.stopBuildAsync request))))

(defn update-webhook-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.UpdateWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.UpdateWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.UpdateWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.UpdateWebhookRequest request]
    (-> this (.updateWebhookAsync request))))

(defn delete-webhook-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.DeleteWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.DeleteWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.DeleteWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhookAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCodeBuildAsyncClient this]
    (-> this (.shutdown))))

(defn delete-project-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.DeleteProjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.DeleteProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.DeleteProjectRequest request]
    (-> this (.deleteProjectAsync request))))

(defn batch-delete-builds-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteBuildsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest request]
    (-> this (.batchDeleteBuildsAsync request))))

(defn batch-get-projects-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.BatchGetProjectsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.BatchGetProjectsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.BatchGetProjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetProjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.BatchGetProjectsRequest request]
    (-> this (.batchGetProjectsAsync request))))

(defn list-source-credentials-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSourceCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListSourceCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSourceCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest request]
    (-> this (.listSourceCredentialsAsync request))))

(defn list-curated-environment-images-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCuratedEnvironmentImages operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCuratedEnvironmentImagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest request]
    (-> this (.listCuratedEnvironmentImagesAsync request))))

(defn list-builds-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.ListBuildsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBuilds operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.ListBuildsResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListBuildsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBuildsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.ListBuildsRequest request]
    (-> this (.listBuildsAsync request))))

(defn start-build-async
  "Description copied from interface: AWSCodeBuildAsync

  request - `com.amazonaws.services.codebuild.model.StartBuildRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartBuild operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codebuild.model.StartBuildResult>`"
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.StartBuildRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startBuildAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodeBuildAsyncClient this ^com.amazonaws.services.codebuild.model.StartBuildRequest request]
    (-> this (.startBuildAsync request))))

