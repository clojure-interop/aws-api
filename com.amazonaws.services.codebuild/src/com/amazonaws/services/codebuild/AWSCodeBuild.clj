(ns com.amazonaws.services.codebuild.AWSCodeBuild
  "Interface for accessing AWS CodeBuild.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCodeBuild instead.


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
  (:import [com.amazonaws.services.codebuild AWSCodeBuild]))

(defn delete-source-credentials
  "Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.

  delete-source-credentials-request - `com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest`

  returns: Result of the DeleteSourceCredentials operation returned by the service. - `com.amazonaws.services.codebuild.model.DeleteSourceCredentialsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.DeleteSourceCredentialsRequest delete-source-credentials-request]
    (-> this (.deleteSourceCredentials delete-source-credentials-request))))

(defn delete-webhook
  "For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
   stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.

  delete-webhook-request - `com.amazonaws.services.codebuild.model.DeleteWebhookRequest`

  returns: Result of the DeleteWebhook operation returned by the service. - `com.amazonaws.services.codebuild.model.DeleteWebhookResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.DeleteWebhookResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.DeleteWebhookRequest delete-webhook-request]
    (-> this (.deleteWebhook delete-webhook-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSCodeBuild this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-project
  "Creates a build project.

  create-project-request - `com.amazonaws.services.codebuild.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.codebuild.model.CreateProjectResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.CreateProjectResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.CreateProjectRequest create-project-request]
    (-> this (.createProject create-project-request))))

(defn batch-delete-builds
  "Deletes one or more builds.

  batch-delete-builds-request - `com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest`

  returns: Result of the BatchDeleteBuilds operation returned by the service. - `com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.BatchDeleteBuildsResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.BatchDeleteBuildsRequest batch-delete-builds-request]
    (-> this (.batchDeleteBuilds batch-delete-builds-request))))

(defn batch-get-projects
  "Gets information about build projects.

  batch-get-projects-request - `com.amazonaws.services.codebuild.model.BatchGetProjectsRequest`

  returns: Result of the BatchGetProjects operation returned by the service. - `com.amazonaws.services.codebuild.model.BatchGetProjectsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.BatchGetProjectsResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.BatchGetProjectsRequest batch-get-projects-request]
    (-> this (.batchGetProjects batch-get-projects-request))))

(defn invalidate-project-cache
  "Resets the cache for a project.

  invalidate-project-cache-request - `com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest`

  returns: Result of the InvalidateProjectCache operation returned by the service. - `com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.InvalidateProjectCacheResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.InvalidateProjectCacheRequest invalidate-project-cache-request]
    (-> this (.invalidateProjectCache invalidate-project-cache-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSCodeBuild this]
    (-> this (.shutdown))))

(defn update-webhook
  "Updates the webhook associated with an AWS CodeBuild build project.



   If you use Bitbucket for your repository, rotateSecret is ignored.

  update-webhook-request - `com.amazonaws.services.codebuild.model.UpdateWebhookRequest`

  returns: Result of the UpdateWebhook operation returned by the service. - `com.amazonaws.services.codebuild.model.UpdateWebhookResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.UpdateWebhookResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.UpdateWebhookRequest update-webhook-request]
    (-> this (.updateWebhook update-webhook-request))))

(defn list-source-credentials
  "Returns a list of SourceCredentialsInfo objects.

  list-source-credentials-request - `com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest`

  returns: Result of the ListSourceCredentials operation returned by the service. - `com.amazonaws.services.codebuild.model.ListSourceCredentialsResult`"
  (^com.amazonaws.services.codebuild.model.ListSourceCredentialsResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListSourceCredentialsRequest list-source-credentials-request]
    (-> this (.listSourceCredentials list-source-credentials-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"codebuild.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"codebuild.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSCodeBuild this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-projects
  "Gets a list of build project names, with each build project name representing a single build project.

  list-projects-request - `com.amazonaws.services.codebuild.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.codebuild.model.ListProjectsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.ListProjectsResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjects list-projects-request))))

(defn stop-build
  "Attempts to stop running a build.

  stop-build-request - `com.amazonaws.services.codebuild.model.StopBuildRequest`

  returns: Result of the StopBuild operation returned by the service. - `com.amazonaws.services.codebuild.model.StopBuildResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.StopBuildResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.StopBuildRequest stop-build-request]
    (-> this (.stopBuild stop-build-request))))

(defn list-curated-environment-images
  "Gets information about Docker images that are managed by AWS CodeBuild.

  list-curated-environment-images-request - `com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest`

  returns: Result of the ListCuratedEnvironmentImages operation returned by the service. - `com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult`"
  (^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListCuratedEnvironmentImagesRequest list-curated-environment-images-request]
    (-> this (.listCuratedEnvironmentImages list-curated-environment-images-request))))

(defn update-project
  "Changes the settings of a build project.

  update-project-request - `com.amazonaws.services.codebuild.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.codebuild.model.UpdateProjectResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.UpdateProjectResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProject update-project-request))))

(defn import-source-credentials
  "Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a
   GitHub, GitHub Enterprise, or Bitbucket repository.

  import-source-credentials-request - `com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest`

  returns: Result of the ImportSourceCredentials operation returned by the service. - `com.amazonaws.services.codebuild.model.ImportSourceCredentialsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.ImportSourceCredentialsResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.ImportSourceCredentialsRequest import-source-credentials-request]
    (-> this (.importSourceCredentials import-source-credentials-request))))

(defn list-builds
  "Gets a list of build IDs, with each build ID representing a single build.

  list-builds-request - `com.amazonaws.services.codebuild.model.ListBuildsRequest`

  returns: Result of the ListBuilds operation returned by the service. - `com.amazonaws.services.codebuild.model.ListBuildsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.ListBuildsResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListBuildsRequest list-builds-request]
    (-> this (.listBuilds list-builds-request))))

(defn list-builds-for-project
  "Gets a list of build IDs for the specified build project, with each build ID representing a single build.

  list-builds-for-project-request - `com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest`

  returns: Result of the ListBuildsForProject operation returned by the service. - `com.amazonaws.services.codebuild.model.ListBuildsForProjectResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.ListBuildsForProjectResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.ListBuildsForProjectRequest list-builds-for-project-request]
    (-> this (.listBuildsForProject list-builds-for-project-request))))

(defn create-webhook
  "For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
   enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.



   If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline,
   then two identical builds are created for each commit. One build is triggered through webhooks, and one through
   AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are
   using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console,
   clear the Webhook box. For more information, see step 5 in Change a
   Build Project's Settings.

  create-webhook-request - `com.amazonaws.services.codebuild.model.CreateWebhookRequest`

  returns: Result of the CreateWebhook operation returned by the service. - `com.amazonaws.services.codebuild.model.CreateWebhookResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.CreateWebhookResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.CreateWebhookRequest create-webhook-request]
    (-> this (.createWebhook create-webhook-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCodeBuild this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-build
  "Starts running a build.

  start-build-request - `com.amazonaws.services.codebuild.model.StartBuildRequest`

  returns: Result of the StartBuild operation returned by the service. - `com.amazonaws.services.codebuild.model.StartBuildResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.StartBuildResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.StartBuildRequest start-build-request]
    (-> this (.startBuild start-build-request))))

(defn batch-get-builds
  "Gets information about builds.

  batch-get-builds-request - `com.amazonaws.services.codebuild.model.BatchGetBuildsRequest`

  returns: Result of the BatchGetBuilds operation returned by the service. - `com.amazonaws.services.codebuild.model.BatchGetBuildsResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.BatchGetBuildsResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.BatchGetBuildsRequest batch-get-builds-request]
    (-> this (.batchGetBuilds batch-get-builds-request))))

(defn delete-project
  "Deletes a build project.

  delete-project-request - `com.amazonaws.services.codebuild.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.codebuild.model.DeleteProjectResult`

  throws: com.amazonaws.services.codebuild.model.InvalidInputException - The input value that was provided is not valid."
  (^com.amazonaws.services.codebuild.model.DeleteProjectResult [^AWSCodeBuild this ^com.amazonaws.services.codebuild.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProject delete-project-request))))

