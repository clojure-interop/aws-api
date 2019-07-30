(ns com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepositoryAsyncClient
  "Client for accessing AWSServerlessApplicationRepository asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.


  The AWS Serverless Application Repository makes it easy for developers and enterprises to quickly find and deploy
  serverless applications in the AWS Cloud. For more information about serverless applications, see Serverless
  Computing and Applications on the AWS website.


  The AWS Serverless Application Repository is deeply integrated with the AWS Lambda console, so that developers of all
  levels can get started with serverless computing without needing to learn anything new. You can use category keywords
  to browse for applications such as web and mobile backends, data processing applications, or chatbots. You can also
  search for applications by name, publisher, or event source. To use an application, you simply choose it, configure
  any required fields, and deploy it with a few clicks.


  You can also easily publish applications, sharing them publicly with the community at large, or privately within your
  team or across your organization. To publish a serverless application (or app), you can use the AWS Management
  Console, AWS Command Line Interface (AWS CLI), or AWS SDKs to upload the code. Along with the code, you upload a
  simple manifest file, also known as the AWS Serverless Application Model (AWS SAM) template. For more information
  about AWS SAM, see AWS Serverless Application Model (AWS SAM) on the AWS Labs GitHub repository.


  The AWS Serverless Application Repository Developer Guide contains more information about the two developer
  experiences available:




  Consuming Applications – Browse for applications and view information about them, including source code and readme
  files. Also install, configure, and deploy applications of your choosing.


  Publishing Applications – Configure and upload applications to make them available to other developers, and publish
  new versions of applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.serverlessapplicationrepository AWSServerlessApplicationRepositoryAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepositoryAsyncClientBuilder`"
  (^com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepositoryAsyncClientBuilder []
    (AWSServerlessApplicationRepositoryAsyncClient/asyncBuilder )))

(defn list-application-versions-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest request]
    (-> this (.listApplicationVersionsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSServerlessApplicationRepositoryAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-application-policy-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplicationPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest request]
    (-> this (.getApplicationPolicyAsync request))))

(defn update-application-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest request]
    (-> this (.updateApplicationAsync request))))

(defn list-applications-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest request]
    (-> this (.listApplicationsAsync request))))

(defn get-application-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest request]
    (-> this (.getApplicationAsync request))))

(defn create-application-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest request]
    (-> this (.createApplicationAsync request))))

(defn delete-application-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest request]
    (-> this (.deleteApplicationAsync request))))

(defn put-application-policy-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutApplicationPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putApplicationPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest request]
    (-> this (.putApplicationPolicyAsync request))))

(defn get-cloud-formation-template-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCloudFormationTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCloudFormationTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest request]
    (-> this (.getCloudFormationTemplateAsync request))))

(defn list-application-dependencies-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationDependencies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationDependenciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest request]
    (-> this (.listApplicationDependenciesAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSServerlessApplicationRepositoryAsyncClient this]
    (-> this (.shutdown))))

(defn create-cloud-formation-change-set-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFormationChangeSet operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFormationChangeSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest request]
    (-> this (.createCloudFormationChangeSetAsync request))))

(defn create-application-version-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplicationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest request]
    (-> this (.createApplicationVersionAsync request))))

(defn create-cloud-formation-template-async
  "Description copied from interface: AWSServerlessApplicationRepositoryAsync

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFormationTemplate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFormationTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsyncClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest request]
    (-> this (.createCloudFormationTemplateAsync request))))

