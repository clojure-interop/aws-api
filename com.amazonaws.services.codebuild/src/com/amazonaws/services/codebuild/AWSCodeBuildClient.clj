(ns com.amazonaws.services.codebuild.AWSCodeBuildClient
  "Client for accessing AWS CodeBuild. All service calls made using this client are blocking, and will not return until
  the service call completes.

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
  (:import [com.amazonaws.services.codebuild AWSCodeBuildClient]))

(defn ->aws-code-build-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS CodeBuild (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSCodeBuildClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSCodeBuildClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSCodeBuildClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCodeBuildClient aws-credentials client-configuration))
  (^AWSCodeBuildClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCodeBuildClient client-configuration))
  (^AWSCodeBuildClient []
    (new AWSCodeBuildClient )))

(defn *builder
  "returns: `com.amazonaws.services.codebuild.AWSCodeBuildClientBuilder`"
  (^com.amazonaws.services.codebuild.AWSCodeBuildClientBuilder []
    (AWSCodeBuildClient/builder )))

(defn delete-source-credentials
  "Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.

  request - `com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest`

  returns: Result of the DeleteSourceCredentials operation returned by the service. - `com.amazonaws.services.codebuild.model.DeleteSourceCredentialsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest request]
    (-> this (.deleteSourceCredentials request))))

(defn delete-webhook
  "For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
   stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.

  request - `com.amazonaws.services.codebuild.model.DeleteWebhookRequest`

  returns: Result of the DeleteWebhook operation returned by the service. - `com.amazonaws.services.codebuild.model.DeleteWebhookResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.DeleteWebhookResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhook request))))

(defn create-project
  "Creates a build project.

  request - `com.amazonaws.services.codebuild.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.codebuild.model.CreateProjectResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.CreateProjectResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn batch-delete-builds
  "Deletes one or more builds.

  request - `com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest`

  returns: Result of the BatchDeleteBuilds operation returned by the service. - `com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest request]
    (-> this (.batchDeleteBuilds request))))

(defn batch-get-projects
  "Gets information about build projects.

  request - `com.amazonaws.services.codebuild.model.BatchGetProjectsRequest`

  returns: Result of the BatchGetProjects operation returned by the service. - `com.amazonaws.services.codebuild.model.BatchGetProjectsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.BatchGetProjectsResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.BatchGetProjectsRequest request]
    (-> this (.batchGetProjects request))))

(defn invalidate-project-cache
  "Resets the cache for a project.

  request - `com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest`

  returns: Result of the InvalidateProjectCache operation returned by the service. - `com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest request]
    (-> this (.invalidateProjectCache request))))

(defn update-webhook
  "Updates the webhook associated with an AWS CodeBuild build project.



   If you use Bitbucket for your repository, rotateSecret is ignored.

  request - `com.amazonaws.services.codebuild.model.UpdateWebhookRequest`

  returns: Result of the UpdateWebhook operation returned by the service. - `com.amazonaws.services.codebuild.model.UpdateWebhookResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.UpdateWebhookResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.UpdateWebhookRequest request]
    (-> this (.updateWebhook request))))

(defn list-source-credentials
  "Returns a list of SourceCredentialsInfo objects.

  request - `com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest`

  returns: Result of the ListSourceCredentials operation returned by the service. - `com.amazonaws.services.codebuild.model.ListSourceCredentialsResult`"
  (^com.amazonaws.services.codebuild.model.ListSourceCredentialsResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest request]
    (-> this (.listSourceCredentials request))))

(defn list-projects
  "Gets a list of build project names, with each build project name representing a single build project.

  request - `com.amazonaws.services.codebuild.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.codebuild.model.ListProjectsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.ListProjectsResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn stop-build
  "Attempts to stop running a build.

  request - `com.amazonaws.services.codebuild.model.StopBuildRequest`

  returns: Result of the StopBuild operation returned by the service. - `com.amazonaws.services.codebuild.model.StopBuildResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.StopBuildResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.StopBuildRequest request]
    (-> this (.stopBuild request))))

(defn list-curated-environment-images
  "Gets information about Docker images that are managed by AWS CodeBuild.

  request - `com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest`

  returns: Result of the ListCuratedEnvironmentImages operation returned by the service. - `com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult`"
  (^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest request]
    (-> this (.listCuratedEnvironmentImages request))))

(defn update-project
  "Changes the settings of a build project.

  request - `com.amazonaws.services.codebuild.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.codebuild.model.UpdateProjectResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.UpdateProjectResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn import-source-credentials
  "Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a
   GitHub, GitHub Enterprise, or Bitbucket repository.

  request - `com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest`

  returns: Result of the ImportSourceCredentials operation returned by the service. - `com.amazonaws.services.codebuild.model.ImportSourceCredentialsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.ImportSourceCredentialsResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest request]
    (-> this (.importSourceCredentials request))))

(defn list-builds
  "Gets a list of build IDs, with each build ID representing a single build.

  request - `com.amazonaws.services.codebuild.model.ListBuildsRequest`

  returns: Result of the ListBuilds operation returned by the service. - `com.amazonaws.services.codebuild.model.ListBuildsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.ListBuildsResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.ListBuildsRequest request]
    (-> this (.listBuilds request))))

(defn list-builds-for-project
  "Gets a list of build IDs for the specified build project, with each build ID representing a single build.

  request - `com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest`

  returns: Result of the ListBuildsForProject operation returned by the service. - `com.amazonaws.services.codebuild.model.ListBuildsForProjectResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.ListBuildsForProjectResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest request]
    (-> this (.listBuildsForProject request))))

(defn create-webhook
  "For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
   enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.



   If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline,
   then two identical builds are created for each commit. One build is triggered through webhooks, and one through
   AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are
   using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console,
   clear the Webhook box. For more information, see step 5 in Change a
   Build Project's Settings.

  request - `com.amazonaws.services.codebuild.model.CreateWebhookRequest`

  returns: Result of the CreateWebhook operation returned by the service. - `com.amazonaws.services.codebuild.model.CreateWebhookResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.CreateWebhookResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.CreateWebhookRequest request]
    (-> this (.createWebhook request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCodeBuildClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-build
  "Starts running a build.

  request - `com.amazonaws.services.codebuild.model.StartBuildRequest`

  returns: Result of the StartBuild operation returned by the service. - `com.amazonaws.services.codebuild.model.StartBuildResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.StartBuildResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.StartBuildRequest request]
    (-> this (.startBuild request))))

(defn batch-get-builds
  "Gets information about builds.

  request - `com.amazonaws.services.codebuild.model.BatchGetBuildsRequest`

  returns: Result of the BatchGetBuilds operation returned by the service. - `com.amazonaws.services.codebuild.model.BatchGetBuildsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.BatchGetBuildsResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.BatchGetBuildsRequest request]
    (-> this (.batchGetBuilds request))))

(defn delete-project
  "Deletes a build project.

  request - `com.amazonaws.services.codebuild.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.codebuild.model.DeleteProjectResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.DeleteProjectResult [^AWSCodeBuildClient this ^com.amazonaws.services.codebuild.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

