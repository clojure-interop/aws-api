(ns com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepositoryClient
  "Client for accessing AWSServerlessApplicationRepository. All service calls made using this client are blocking, and
  will not return until the service call completes.


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
  (:import [com.amazonaws.services.serverlessapplicationrepository AWSServerlessApplicationRepositoryClient]))

(defn *builder
  "returns: `com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepositoryClientBuilder`"
  (^com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepositoryClientBuilder []
    (AWSServerlessApplicationRepositoryClient/builder )))

(defn create-cloud-formation-change-set
  "Creates an AWS CloudFormation change set for the given application.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest`

  returns: Result of the CreateCloudFormationChangeSet operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.TooManyRequestsException - The client is sending more than the allowed number of requests per unit of time."
  (^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationChangeSetRequest request]
    (-> this (.createCloudFormationChangeSet request))))

(defn list-application-versions
  "Lists versions for the specified application.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest`

  returns: Result of the ListApplicationVersions operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.NotFoundException - The resource (for example, an access policy statement) specified in the request doesn't exist."
  (^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationVersionsRequest request]
    (-> this (.listApplicationVersions request))))

(defn get-application-policy
  "Retrieves the policy for the application.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest`

  returns: Result of the GetApplicationPolicy operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.NotFoundException - The resource (for example, an access policy statement) specified in the request doesn't exist."
  (^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationPolicyRequest request]
    (-> this (.getApplicationPolicy request))))

(defn create-cloud-formation-template
  "Creates an AWS CloudFormation template.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest`

  returns: Result of the CreateCloudFormationTemplate operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.NotFoundException - The resource (for example, an access policy statement) specified in the request doesn't exist."
  (^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateCloudFormationTemplateRequest request]
    (-> this (.createCloudFormationTemplate request))))

(defn get-cloud-formation-template
  "Gets the specified AWS CloudFormation template.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest`

  returns: Result of the GetCloudFormationTemplate operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.NotFoundException - The resource (for example, an access policy statement) specified in the request doesn't exist."
  (^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.GetCloudFormationTemplateRequest request]
    (-> this (.getCloudFormationTemplate request))))

(defn delete-application
  "Deletes the specified application.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.BadRequestException - One of the parameters in the request is invalid."
  (^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn create-application-version
  "Creates an application version.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest`

  returns: Result of the CreateApplicationVersion operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.TooManyRequestsException - The client is sending more than the allowed number of requests per unit of time."
  (^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationVersionRequest request]
    (-> this (.createApplicationVersion request))))

(defn list-applications
  "Lists applications owned by the requester.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.NotFoundException - The resource (for example, an access policy statement) specified in the request doesn't exist."
  (^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationsRequest request]
    (-> this (.listApplications request))))

(defn list-application-dependencies
  "Retrieves the list of applications nested in the containing application.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest`

  returns: Result of the ListApplicationDependencies operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.NotFoundException - The resource (for example, an access policy statement) specified in the request doesn't exist."
  (^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.ListApplicationDependenciesRequest request]
    (-> this (.listApplicationDependencies request))))

(defn update-application
  "Updates the specified application.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.BadRequestException - One of the parameters in the request is invalid."
  (^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request))))

(defn create-application
  "Creates an application, optionally including an AWS SAM file to create the first application version in the same
   call.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.TooManyRequestsException - The client is sending more than the allowed number of requests per unit of time."
  (^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn get-application
  "Gets the specified application.

  request - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest`

  returns: Result of the GetApplication operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.NotFoundException - The resource (for example, an access policy statement) specified in the request doesn't exist."
  (^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.GetApplicationRequest request]
    (-> this (.getApplication request))))

(defn put-application-policy
  "Sets the permission policy for an application. For the list of actions supported for this operation, see Application Permissions .

  request - `com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest`

  returns: Result of the PutApplicationPolicy operation returned by the service. - `com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult`

  throws: com.amazonaws.services.serverlessapplicationrepository.model.NotFoundException - The resource (for example, an access policy statement) specified in the request doesn't exist."
  (^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyResult [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.services.serverlessapplicationrepository.model.PutApplicationPolicyRequest request]
    (-> this (.putApplicationPolicy request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSServerlessApplicationRepositoryClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

