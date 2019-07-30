(ns com.amazonaws.services.codedeploy.AmazonCodeDeployAsyncClient
  "Client for accessing CodeDeploy asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS CodeDeploy

  AWS CodeDeploy is a deployment service that automates application deployments to Amazon EC2 instances, on-premises
  instances running in your own facility, serverless AWS Lambda functions, or applications in an Amazon ECS service.


  You can deploy a nearly unlimited variety of application content, such as an updated Lambda function, updated
  applications in an Amazon ECS service, code, web and configuration files, executables, packages, scripts, multimedia
  files, and so on. AWS CodeDeploy can deploy application content stored in Amazon S3 buckets, GitHub repositories, or
  Bitbucket repositories. You do not need to make changes to your existing code before you can use AWS CodeDeploy.


  AWS CodeDeploy makes it easier for you to rapidly release new features, helps you avoid downtime during application
  deployment, and handles the complexity of updating your applications, without many of the risks associated with
  error-prone manual deployments.


  AWS CodeDeploy Components


  Use the information in this guide to help you work with the following AWS CodeDeploy components:




  Application: A name that uniquely identifies the application you want to deploy. AWS CodeDeploy uses this
  name, which functions as a container, to ensure the correct combination of revision, deployment configuration, and
  deployment group are referenced during a deployment.




  Deployment group: A set of individual instances, CodeDeploy Lambda deployment configuration settings, or an
  Amazon ECS service and network details. A Lambda deployment group specifies how to route traffic to a new version of
  a Lambda function. An Amazon ECS deployment group specifies the service created in Amazon ECS to deploy, a load
  balancer, and a listener to reroute production traffic to an updated containerized application. An EC2/On-premises
  deployment group contains individually tagged instances, Amazon EC2 instances in Amazon EC2 Auto Scaling groups, or
  both. All deployment groups can specify optional trigger, alarm, and rollback settings.




  Deployment configuration: A set of deployment rules and deployment success and failure conditions used by AWS
  CodeDeploy during a deployment.




  Deployment: The process and the components used when updating a Lambda function, a containerized application
  in an Amazon ECS service, or of installing content on one or more instances.




  Application revisions: For an AWS Lambda deployment, this is an AppSpec file that specifies the Lambda
  function to be updated and one or more functions to validate deployment lifecycle events. For an Amazon ECS
  deployment, this is an AppSpec file that specifies the Amazon ECS task definition, container, and port where
  production traffic is rerouted. For an EC2/On-premises deployment, this is an archive file that contains source
  content—source code, webpages, executable files, and deployment scripts—along with an AppSpec file. Revisions are
  stored in Amazon S3 buckets or GitHub repositories. For Amazon S3, a revision is uniquely identified by its Amazon S3
  object key and its ETag, version, or both. For GitHub, a revision is uniquely identified by its commit ID.




  This guide also contains information to help you get details about the instances in your deployments, to make
  on-premises instances available for AWS CodeDeploy deployments, to get details about a Lambda function deployment,
  and to get details about Amazon ECS service deployments.


  AWS CodeDeploy Information Resources




  AWS CodeDeploy User Guide




  AWS CodeDeploy API Reference Guide




  AWS CLI Reference for AWS CodeDeploy




  AWS CodeDeploy Developer Forum"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codedeploy AmazonCodeDeployAsyncClient]))

(defn ->amazon-code-deploy-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonCodeDeployAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCodeDeployAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonCodeDeployAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCodeDeployAsyncClient aws-credentials executor-service))
  (^AmazonCodeDeployAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCodeDeployAsyncClient client-configuration))
  (^AmazonCodeDeployAsyncClient []
    (new AmazonCodeDeployAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.codedeploy.AmazonCodeDeployAsyncClientBuilder`"
  (^com.amazonaws.services.codedeploy.AmazonCodeDeployAsyncClientBuilder []
    (AmazonCodeDeployAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - `com.amazonaws.services.codedeploy.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-on-premises-instance-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a GetOnPremisesInstance operation. - `com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOnPremisesInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOnPremisesInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest request]
    (-> this (.getOnPremisesInstanceAsync request))))

(defn list-deployment-groups-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a ListDeploymentGroups operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest request]
    (-> this (.listDeploymentGroupsAsync request))))

(defn get-deployment-config-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a GetDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest request]
    (-> this (.getDeploymentConfigAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonCodeDeployAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-application-revisions-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a ListApplicationRevisions operation. - `com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationRevisionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest request]
    (-> this (.listApplicationRevisionsAsync request))))

(defn get-deployment-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a GetDeployment operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentRequest request]
    (-> this (.getDeploymentAsync request))))

(defn batch-get-deployment-instances-async
  "Deprecated.

  request - Represents the input of a BatchGetDeploymentInstances operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDeploymentInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDeploymentInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest request]
    (-> this (.batchGetDeploymentInstancesAsync request))))

(defn register-application-revision-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a RegisterApplicationRevision operation. - `com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterApplicationRevision operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerApplicationRevisionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest request]
    (-> this (.registerApplicationRevisionAsync request))))

(defn register-on-premises-instance-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of the register on-premises instance operation. - `com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterOnPremisesInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerOnPremisesInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest request]
    (-> this (.registerOnPremisesInstanceAsync request))))

(defn get-deployment-instance-async
  "Deprecated.

  request - Represents the input of a GetDeploymentInstance operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest request]
    (-> this (.getDeploymentInstanceAsync request))))

(defn update-application-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of an UpdateApplication operation. - `com.amazonaws.services.codedeploy.model.UpdateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.UpdateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.UpdateApplicationRequest request]
    (-> this (.updateApplicationAsync request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this]
    (-> this (.updateApplicationAsync))))

(defn list-git-hub-account-token-names-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a ListGitHubAccountTokenNames operation. - `com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGitHubAccountTokenNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGitHubAccountTokenNamesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest request]
    (-> this (.listGitHubAccountTokenNamesAsync request))))

(defn create-deployment-config-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a CreateDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeploymentConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest request]
    (-> this (.createDeploymentConfigAsync request))))

(defn stop-deployment-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a StopDeployment operation. - `com.amazonaws.services.codedeploy.model.StopDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.StopDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.StopDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.StopDeploymentRequest request]
    (-> this (.stopDeploymentAsync request))))

(defn get-deployment-group-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a GetDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest request]
    (-> this (.getDeploymentGroupAsync request))))

(defn list-applications-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a ListApplications operation. - `com.amazonaws.services.codedeploy.model.ListApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListApplicationsRequest request]
    (-> this (.listApplicationsAsync request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this]
    (-> this (.listApplicationsAsync))))

(defn get-deployment-target-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - `com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentTargetResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest request]
    (-> this (.getDeploymentTargetAsync request))))

(defn list-deployment-instances-async
  "Deprecated.

  request - Represents the input of a ListDeploymentInstances operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest request]
    (-> this (.listDeploymentInstancesAsync request))))

(defn get-application-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a GetApplication operation. - `com.amazonaws.services.codedeploy.model.GetApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetApplicationRequest request]
    (-> this (.getApplicationAsync request))))

(defn create-application-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a CreateApplication operation. - `com.amazonaws.services.codedeploy.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.CreateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.CreateApplicationRequest request]
    (-> this (.createApplicationAsync request))))

(defn create-deployment-group-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a CreateDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeploymentGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest request]
    (-> this (.createDeploymentGroupAsync request))))

(defn deregister-on-premises-instance-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a DeregisterOnPremisesInstance operation. - `com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterOnPremisesInstance operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterOnPremisesInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest request]
    (-> this (.deregisterOnPremisesInstanceAsync request))))

(defn list-deployment-configs-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a ListDeploymentConfigs operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentConfigsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest request]
    (-> this (.listDeploymentConfigsAsync request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this]
    (-> this (.listDeploymentConfigsAsync))))

(defn get-application-revision-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a GetApplicationRevision operation. - `com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplicationRevision operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationRevisionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest request]
    (-> this (.getApplicationRevisionAsync request))))

(defn delete-application-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a DeleteApplication operation. - `com.amazonaws.services.codedeploy.model.DeleteApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeleteApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeleteApplicationRequest request]
    (-> this (.deleteApplicationAsync request))))

(defn skip-wait-time-for-instance-termination-async
  "Deprecated.

  request - `com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SkipWaitTimeForInstanceTermination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.skipWaitTimeForInstanceTerminationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest request]
    (-> this (.skipWaitTimeForInstanceTerminationAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonCodeDeployAsyncClient this]
    (-> this (.shutdown))))

(defn add-tags-to-on-premises-instances-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of, and adds tags to, an on-premises instance operation. - `com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToOnPremisesInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToOnPremisesInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest request]
    (-> this (.addTagsToOnPremisesInstancesAsync request))))

(defn batch-get-deployment-targets-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDeploymentTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDeploymentTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest request]
    (-> this (.batchGetDeploymentTargetsAsync request))))

(defn continue-deployment-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - `com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ContinueDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ContinueDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.continueDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest request]
    (-> this (.continueDeploymentAsync request))))

(defn put-lifecycle-event-hook-execution-status-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - `com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecycleEventHookExecutionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecycleEventHookExecutionStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest request]
    (-> this (.putLifecycleEventHookExecutionStatusAsync request))))

(defn batch-get-on-premises-instances-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a BatchGetOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetOnPremisesInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetOnPremisesInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest request]
    (-> this (.batchGetOnPremisesInstancesAsync request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this]
    (-> this (.batchGetOnPremisesInstancesAsync))))

(defn batch-get-deployments-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a BatchGetDeployments operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDeploymentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest request]
    (-> this (.batchGetDeploymentsAsync request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this]
    (-> this (.batchGetDeploymentsAsync))))

(defn delete-deployment-group-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a DeleteDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeploymentGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeploymentGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest request]
    (-> this (.deleteDeploymentGroupAsync request))))

(defn remove-tags-from-on-premises-instances-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a RemoveTagsFromOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromOnPremisesInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromOnPremisesInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest request]
    (-> this (.removeTagsFromOnPremisesInstancesAsync request))))

(defn delete-deployment-config-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a DeleteDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeploymentConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeploymentConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest request]
    (-> this (.deleteDeploymentConfigAsync request))))

(defn batch-get-application-revisions-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a BatchGetApplicationRevisions operation. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetApplicationRevisions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetApplicationRevisionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest request]
    (-> this (.batchGetApplicationRevisionsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - `com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn list-on-premises-instances-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a ListOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOnPremisesInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOnPremisesInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest request]
    (-> this (.listOnPremisesInstancesAsync request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this]
    (-> this (.listOnPremisesInstancesAsync))))

(defn delete-git-hub-account-token-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a DeleteGitHubAccount operation. - `com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGitHubAccountToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGitHubAccountTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest request]
    (-> this (.deleteGitHubAccountTokenAsync request))))

(defn list-deployment-targets-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - `com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest request]
    (-> this (.listDeploymentTargetsAsync request))))

(defn batch-get-deployment-groups-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a BatchGetDeploymentGroups operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDeploymentGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDeploymentGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest request]
    (-> this (.batchGetDeploymentGroupsAsync request))))

(defn batch-get-applications-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a BatchGetApplications operation. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest request]
    (-> this (.batchGetApplicationsAsync request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this]
    (-> this (.batchGetApplicationsAsync))))

(defn create-deployment-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a CreateDeployment operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.CreateDeploymentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.CreateDeploymentRequest request]
    (-> this (.createDeploymentAsync request))))

(defn update-deployment-group-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of an UpdateDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeploymentGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeploymentGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest request]
    (-> this (.updateDeploymentGroupAsync request))))

(defn list-deployments-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - Represents the input of a ListDeployments operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentsRequest request]
    (-> this (.listDeploymentsAsync request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this]
    (-> this (.listDeploymentsAsync))))

(defn tag-resource-async
  "Description copied from interface: AmazonCodeDeployAsync

  request - `com.amazonaws.services.codedeploy.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsyncClient this ^com.amazonaws.services.codedeploy.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

