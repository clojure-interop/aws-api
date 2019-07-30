(ns com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepositoryAsync
  "Interface for accessing AWSServerlessApplicationRepository asynchronously. Each asynchronous method will return a
  Java Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be
  used to receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSServerlessApplicationRepositoryAsync
  instead.



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
  (:import [com.amazonaws.services.serverlessapplicationrepository AWSServerlessApplicationRepositoryAsync]))

(defn list-application-versions-async
  "Lists versions for the specified application.

  list-application-versions-request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest list-application-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationVersionsAsync list-application-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest list-application-versions-request]
    (-> this (.listApplicationVersionsAsync list-application-versions-request))))

(defn get-application-policy-async
  "Retrieves the policy for the application.

  get-application-policy-request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplicationPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest get-application-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationPolicyAsync get-application-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest get-application-policy-request]
    (-> this (.getApplicationPolicyAsync get-application-policy-request))))

(defn update-application-async
  "Updates the specified application.

  update-application-request - `com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest update-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync update-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplicationAsync update-application-request))))

(defn list-applications-async
  "Lists applications owned by the requester.

  list-applications-request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest list-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync list-applications-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest list-applications-request]
    (-> this (.listApplicationsAsync list-applications-request))))

(defn get-application-async
  "Gets the specified application.

  get-application-request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest get-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationAsync get-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest get-application-request]
    (-> this (.getApplicationAsync get-application-request))))

(defn create-application-async
  "Creates an application, optionally including an AWS SAM file to create the first application version in the same
   call.

  create-application-request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest create-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync create-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplicationAsync create-application-request))))

(defn delete-application-async
  "Deletes the specified application.

  delete-application-request - `com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest delete-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync delete-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplicationAsync delete-application-request))))

(defn put-application-policy-async
  "Sets the permission policy for an application. For the list of actions supported for this operation, see Application Permissions .

  put-application-policy-request - `com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutApplicationPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest put-application-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putApplicationPolicyAsync put-application-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest put-application-policy-request]
    (-> this (.putApplicationPolicyAsync put-application-policy-request))))

(defn get-cloud-formation-template-async
  "Gets the specified AWS CloudFormation template.

  get-cloud-formation-template-request - `com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCloudFormationTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest get-cloud-formation-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCloudFormationTemplateAsync get-cloud-formation-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest get-cloud-formation-template-request]
    (-> this (.getCloudFormationTemplateAsync get-cloud-formation-template-request))))

(defn list-application-dependencies-async
  "Retrieves the list of applications nested in the containing application.

  list-application-dependencies-request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationDependencies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest list-application-dependencies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationDependenciesAsync list-application-dependencies-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest list-application-dependencies-request]
    (-> this (.listApplicationDependenciesAsync list-application-dependencies-request))))

(defn create-cloud-formation-change-set-async
  "Creates an AWS CloudFormation change set for the given application.

  create-cloud-formation-change-set-request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFormationChangeSet operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest create-cloud-formation-change-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFormationChangeSetAsync create-cloud-formation-change-set-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest create-cloud-formation-change-set-request]
    (-> this (.createCloudFormationChangeSetAsync create-cloud-formation-change-set-request))))

(defn create-application-version-async
  "Creates an application version.

  create-application-version-request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplicationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest create-application-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationVersionAsync create-application-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest create-application-version-request]
    (-> this (.createApplicationVersionAsync create-application-version-request))))

(defn create-cloud-formation-template-async
  "Creates an AWS CloudFormation template.

  create-cloud-formation-template-request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFormationTemplate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateResult>`"
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest create-cloud-formation-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFormationTemplateAsync create-cloud-formation-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSServerlessApplicationRepositoryAsync this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest create-cloud-formation-template-request]
    (-> this (.createCloudFormationTemplateAsync create-cloud-formation-template-request))))

