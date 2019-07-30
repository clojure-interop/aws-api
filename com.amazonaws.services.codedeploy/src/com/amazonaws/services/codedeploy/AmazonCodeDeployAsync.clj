(ns com.amazonaws.services.codedeploy.AmazonCodeDeployAsync
  "Interface for accessing CodeDeploy asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCodeDeployAsync instead.


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
  (:import [com.amazonaws.services.codedeploy AmazonCodeDeployAsync]))

(defn untag-resource-async
  "Disassociates a resource from a list of tags. The resource is identified by the ResourceArn input
   parameter. The tags are identfied by the list of keys in the TagKeys input parameter.

  untag-resource-request - `com.amazonaws.services.codedeploy.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-on-premises-instance-async
  "Gets information about an on-premises instance.

  get-on-premises-instance-request - Represents the input of a GetOnPremisesInstance operation. - `com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOnPremisesInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest get-on-premises-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOnPremisesInstanceAsync get-on-premises-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest get-on-premises-instance-request]
    (-> this (.getOnPremisesInstanceAsync get-on-premises-instance-request))))

(defn list-deployment-groups-async
  "Lists the deployment groups for an application registered with the IAM user or AWS account.

  list-deployment-groups-request - Represents the input of a ListDeploymentGroups operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest list-deployment-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentGroupsAsync list-deployment-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest list-deployment-groups-request]
    (-> this (.listDeploymentGroupsAsync list-deployment-groups-request))))

(defn get-deployment-config-async
  "Gets information about a deployment configuration.

  get-deployment-config-request - Represents the input of a GetDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest get-deployment-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentConfigAsync get-deployment-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest get-deployment-config-request]
    (-> this (.getDeploymentConfigAsync get-deployment-config-request))))

(defn list-application-revisions-async
  "Lists information about revisions for an application.

  list-application-revisions-request - Represents the input of a ListApplicationRevisions operation. - `com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplicationRevisions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest list-application-revisions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationRevisionsAsync list-application-revisions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest list-application-revisions-request]
    (-> this (.listApplicationRevisionsAsync list-application-revisions-request))))

(defn get-deployment-async
  "Gets information about a deployment.



   The content property of the appSpecContent object in the returned revision is always
   null. Use GetApplicationRevision and the sha256 property of the returned
   appSpecContent object to get the content of the deployment’s AppSpec file.

  get-deployment-request - Represents the input of a GetDeployment operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentRequest get-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentAsync get-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentRequest get-deployment-request]
    (-> this (.getDeploymentAsync get-deployment-request))))

(defn batch-get-deployment-instances-async
  "Deprecated.

  batch-get-deployment-instances-request - Represents the input of a BatchGetDeploymentInstances operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDeploymentInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest batch-get-deployment-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDeploymentInstancesAsync batch-get-deployment-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest batch-get-deployment-instances-request]
    (-> this (.batchGetDeploymentInstancesAsync batch-get-deployment-instances-request))))

(defn register-application-revision-async
  "Registers with AWS CodeDeploy a revision for the specified application.

  register-application-revision-request - Represents the input of a RegisterApplicationRevision operation. - `com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterApplicationRevision operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest register-application-revision-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerApplicationRevisionAsync register-application-revision-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest register-application-revision-request]
    (-> this (.registerApplicationRevisionAsync register-application-revision-request))))

(defn register-on-premises-instance-async
  "Registers an on-premises instance.



   Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both.

  register-on-premises-instance-request - Represents the input of the register on-premises instance operation. - `com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterOnPremisesInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest register-on-premises-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerOnPremisesInstanceAsync register-on-premises-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest register-on-premises-instance-request]
    (-> this (.registerOnPremisesInstanceAsync register-on-premises-instance-request))))

(defn get-deployment-instance-async
  "Deprecated.

  get-deployment-instance-request - Represents the input of a GetDeploymentInstance operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest get-deployment-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentInstanceAsync get-deployment-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest get-deployment-instance-request]
    (-> this (.getDeploymentInstanceAsync get-deployment-instance-request))))

(defn update-application-async
  "Changes the name of an application.

  update-application-request - Represents the input of an UpdateApplication operation. - `com.amazonaws.services.codedeploy.model.UpdateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.UpdateApplicationRequest update-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync update-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplicationAsync update-application-request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this]
    (-> this (.updateApplicationAsync))))

(defn list-git-hub-account-token-names-async
  "Lists the names of stored connections to GitHub accounts.

  list-git-hub-account-token-names-request - Represents the input of a ListGitHubAccountTokenNames operation. - `com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGitHubAccountTokenNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest list-git-hub-account-token-names-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGitHubAccountTokenNamesAsync list-git-hub-account-token-names-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest list-git-hub-account-token-names-request]
    (-> this (.listGitHubAccountTokenNamesAsync list-git-hub-account-token-names-request))))

(defn create-deployment-config-async
  "Creates a deployment configuration.

  create-deployment-config-request - Represents the input of a CreateDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeploymentConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest create-deployment-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentConfigAsync create-deployment-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest create-deployment-config-request]
    (-> this (.createDeploymentConfigAsync create-deployment-config-request))))

(defn stop-deployment-async
  "Attempts to stop an ongoing deployment.

  stop-deployment-request - Represents the input of a StopDeployment operation. - `com.amazonaws.services.codedeploy.model.StopDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.StopDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.StopDeploymentRequest stop-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDeploymentAsync stop-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.StopDeploymentRequest stop-deployment-request]
    (-> this (.stopDeploymentAsync stop-deployment-request))))

(defn get-deployment-group-async
  "Gets information about a deployment group.

  get-deployment-group-request - Represents the input of a GetDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest get-deployment-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentGroupAsync get-deployment-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest get-deployment-group-request]
    (-> this (.getDeploymentGroupAsync get-deployment-group-request))))

(defn list-applications-async
  "Lists the applications registered with the IAM user or AWS account.

  list-applications-request - Represents the input of a ListApplications operation. - `com.amazonaws.services.codedeploy.model.ListApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListApplicationsRequest list-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listApplicationsAsync list-applications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListApplicationsRequest list-applications-request]
    (-> this (.listApplicationsAsync list-applications-request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this]
    (-> this (.listApplicationsAsync))))

(defn get-deployment-target-async
  "Returns information about a deployment target.

  get-deployment-target-request - `com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeploymentTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetDeploymentTargetResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest get-deployment-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeploymentTargetAsync get-deployment-target-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest get-deployment-target-request]
    (-> this (.getDeploymentTargetAsync get-deployment-target-request))))

(defn list-deployment-instances-async
  "Deprecated.

  list-deployment-instances-request - Represents the input of a ListDeploymentInstances operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest list-deployment-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentInstancesAsync list-deployment-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest list-deployment-instances-request]
    (-> this (.listDeploymentInstancesAsync list-deployment-instances-request))))

(defn get-application-async
  "Gets information about an application.

  get-application-request - Represents the input of a GetApplication operation. - `com.amazonaws.services.codedeploy.model.GetApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetApplicationRequest get-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationAsync get-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetApplicationRequest get-application-request]
    (-> this (.getApplicationAsync get-application-request))))

(defn create-application-async
  "Creates an application.

  create-application-request - Represents the input of a CreateApplication operation. - `com.amazonaws.services.codedeploy.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.CreateApplicationRequest create-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync create-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplicationAsync create-application-request))))

(defn create-deployment-group-async
  "Creates a deployment group to which application revisions are deployed.

  create-deployment-group-request - Represents the input of a CreateDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeploymentGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest create-deployment-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentGroupAsync create-deployment-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest create-deployment-group-request]
    (-> this (.createDeploymentGroupAsync create-deployment-group-request))))

(defn deregister-on-premises-instance-async
  "Deregisters an on-premises instance.

  deregister-on-premises-instance-request - Represents the input of a DeregisterOnPremisesInstance operation. - `com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterOnPremisesInstance operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest deregister-on-premises-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterOnPremisesInstanceAsync deregister-on-premises-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest deregister-on-premises-instance-request]
    (-> this (.deregisterOnPremisesInstanceAsync deregister-on-premises-instance-request))))

(defn list-deployment-configs-async
  "Lists the deployment configurations with the IAM user or AWS account.

  list-deployment-configs-request - Represents the input of a ListDeploymentConfigs operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest list-deployment-configs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentConfigsAsync list-deployment-configs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest list-deployment-configs-request]
    (-> this (.listDeploymentConfigsAsync list-deployment-configs-request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this]
    (-> this (.listDeploymentConfigsAsync))))

(defn get-application-revision-async
  "Gets information about an application revision.

  get-application-revision-request - Represents the input of a GetApplicationRevision operation. - `com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetApplicationRevision operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest get-application-revision-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getApplicationRevisionAsync get-application-revision-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest get-application-revision-request]
    (-> this (.getApplicationRevisionAsync get-application-revision-request))))

(defn delete-application-async
  "Deletes an application.

  delete-application-request - Represents the input of a DeleteApplication operation. - `com.amazonaws.services.codedeploy.model.DeleteApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeleteApplicationRequest delete-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync delete-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplicationAsync delete-application-request))))

(defn skip-wait-time-for-instance-termination-async
  "Deprecated.

  skip-wait-time-for-instance-termination-request - `com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SkipWaitTimeForInstanceTermination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest skip-wait-time-for-instance-termination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.skipWaitTimeForInstanceTerminationAsync skip-wait-time-for-instance-termination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest skip-wait-time-for-instance-termination-request]
    (-> this (.skipWaitTimeForInstanceTerminationAsync skip-wait-time-for-instance-termination-request))))

(defn add-tags-to-on-premises-instances-async
  "Adds tags to on-premises instances.

  add-tags-to-on-premises-instances-request - Represents the input of, and adds tags to, an on-premises instance operation. - `com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToOnPremisesInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest add-tags-to-on-premises-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToOnPremisesInstancesAsync add-tags-to-on-premises-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest add-tags-to-on-premises-instances-request]
    (-> this (.addTagsToOnPremisesInstancesAsync add-tags-to-on-premises-instances-request))))

(defn batch-get-deployment-targets-async
  "Returns an array of one or more targets associated with a deployment. This method works with all compute types
   and should be used instead of the deprecated BatchGetDeploymentInstances. The maximum number of
   targets that can be returned is 25.


   The type of targets returned depends on the deployment's compute platform:




   EC2/On-premises: Information about EC2 instance targets.




   AWS Lambda: Information about Lambda functions targets.




   Amazon ECS: Information about Amazon ECS service targets.

  batch-get-deployment-targets-request - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDeploymentTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest batch-get-deployment-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDeploymentTargetsAsync batch-get-deployment-targets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest batch-get-deployment-targets-request]
    (-> this (.batchGetDeploymentTargetsAsync batch-get-deployment-targets-request))))

(defn continue-deployment-async
  "For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment
   to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic
   rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can
   start as soon as all instances have a status of Ready.)

  continue-deployment-request - `com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ContinueDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ContinueDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest continue-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.continueDeploymentAsync continue-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest continue-deployment-request]
    (-> this (.continueDeploymentAsync continue-deployment-request))))

(defn put-lifecycle-event-hook-execution-status-async
  "Sets the result of a Lambda validation function. The function validates one or both lifecycle events (
   BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or
   Failed.

  put-lifecycle-event-hook-execution-status-request - `com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecycleEventHookExecutionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest put-lifecycle-event-hook-execution-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecycleEventHookExecutionStatusAsync put-lifecycle-event-hook-execution-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest put-lifecycle-event-hook-execution-status-request]
    (-> this (.putLifecycleEventHookExecutionStatusAsync put-lifecycle-event-hook-execution-status-request))))

(defn batch-get-on-premises-instances-async
  "Gets information about one or more on-premises instances. The maximum number of on-premises instances that can be
   returned is 25.

  batch-get-on-premises-instances-request - Represents the input of a BatchGetOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetOnPremisesInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest batch-get-on-premises-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetOnPremisesInstancesAsync batch-get-on-premises-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest batch-get-on-premises-instances-request]
    (-> this (.batchGetOnPremisesInstancesAsync batch-get-on-premises-instances-request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this]
    (-> this (.batchGetOnPremisesInstancesAsync))))

(defn batch-get-deployments-async
  "Gets information about one or more deployments. The maximum number of deployments that can be returned is 25.

  batch-get-deployments-request - Represents the input of a BatchGetDeployments operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest batch-get-deployments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDeploymentsAsync batch-get-deployments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest batch-get-deployments-request]
    (-> this (.batchGetDeploymentsAsync batch-get-deployments-request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this]
    (-> this (.batchGetDeploymentsAsync))))

(defn delete-deployment-group-async
  "Deletes a deployment group.

  delete-deployment-group-request - Represents the input of a DeleteDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeploymentGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest delete-deployment-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeploymentGroupAsync delete-deployment-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest delete-deployment-group-request]
    (-> this (.deleteDeploymentGroupAsync delete-deployment-group-request))))

(defn remove-tags-from-on-premises-instances-async
  "Removes one or more tags from one or more on-premises instances.

  remove-tags-from-on-premises-instances-request - Represents the input of a RemoveTagsFromOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromOnPremisesInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest remove-tags-from-on-premises-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromOnPremisesInstancesAsync remove-tags-from-on-premises-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest remove-tags-from-on-premises-instances-request]
    (-> this (.removeTagsFromOnPremisesInstancesAsync remove-tags-from-on-premises-instances-request))))

(defn delete-deployment-config-async
  "Deletes a deployment configuration.



   A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be
   deleted.

  delete-deployment-config-request - Represents the input of a DeleteDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeploymentConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest delete-deployment-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeploymentConfigAsync delete-deployment-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest delete-deployment-config-request]
    (-> this (.deleteDeploymentConfigAsync delete-deployment-config-request))))

(defn batch-get-application-revisions-async
  "Gets information about one or more application revisions. The maximum number of application revisions that can be
   returned is 25.

  batch-get-application-revisions-request - Represents the input of a BatchGetApplicationRevisions operation. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetApplicationRevisions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest batch-get-application-revisions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetApplicationRevisionsAsync batch-get-application-revisions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest batch-get-application-revisions-request]
    (-> this (.batchGetApplicationRevisionsAsync batch-get-application-revisions-request))))

(defn list-tags-for-resource-async
  "Returns a list of tags for the resource identified by a specified ARN. Tags are used to organize and categorize
   your CodeDeploy resources.

  list-tags-for-resource-request - `com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn list-on-premises-instances-async
  "Gets a list of names for one or more on-premises instances.


   Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only
   registered or deregistered on-premises instance names, use the registration status parameter.

  list-on-premises-instances-request - Represents the input of a ListOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOnPremisesInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest list-on-premises-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOnPremisesInstancesAsync list-on-premises-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest list-on-premises-instances-request]
    (-> this (.listOnPremisesInstancesAsync list-on-premises-instances-request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this]
    (-> this (.listOnPremisesInstancesAsync))))

(defn delete-git-hub-account-token-async
  "Deletes a GitHub account connection.

  delete-git-hub-account-token-request - Represents the input of a DeleteGitHubAccount operation. - `com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGitHubAccountToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest delete-git-hub-account-token-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGitHubAccountTokenAsync delete-git-hub-account-token-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest delete-git-hub-account-token-request]
    (-> this (.deleteGitHubAccountTokenAsync delete-git-hub-account-token-request))))

(defn list-deployment-targets-async
  "Returns an array of target IDs that are associated a deployment.

  list-deployment-targets-request - `com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeploymentTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest list-deployment-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentTargetsAsync list-deployment-targets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest list-deployment-targets-request]
    (-> this (.listDeploymentTargetsAsync list-deployment-targets-request))))

(defn batch-get-deployment-groups-async
  "Gets information about one or more deployment groups.

  batch-get-deployment-groups-request - Represents the input of a BatchGetDeploymentGroups operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDeploymentGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest batch-get-deployment-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDeploymentGroupsAsync batch-get-deployment-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest batch-get-deployment-groups-request]
    (-> this (.batchGetDeploymentGroupsAsync batch-get-deployment-groups-request))))

(defn batch-get-applications-async
  "Gets information about one or more applications. The maximum number of applications that can be returned is 25.

  batch-get-applications-request - Represents the input of a BatchGetApplications operation. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest batch-get-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetApplicationsAsync batch-get-applications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest batch-get-applications-request]
    (-> this (.batchGetApplicationsAsync batch-get-applications-request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this]
    (-> this (.batchGetApplicationsAsync))))

(defn create-deployment-async
  "Deploys an application revision through the specified deployment group.

  create-deployment-request - Represents the input of a CreateDeployment operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.CreateDeploymentRequest create-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync create-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeploymentAsync create-deployment-request))))

(defn update-deployment-group-async
  "Changes information about a deployment group.

  update-deployment-group-request - Represents the input of an UpdateDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeploymentGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest update-deployment-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeploymentGroupAsync update-deployment-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest update-deployment-group-request]
    (-> this (.updateDeploymentGroupAsync update-deployment-group-request))))

(defn list-deployments-async
  "Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.

  list-deployments-request - Represents the input of a ListDeployments operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.ListDeploymentsResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentsRequest list-deployments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeploymentsAsync list-deployments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.ListDeploymentsRequest list-deployments-request]
    (-> this (.listDeploymentsAsync list-deployments-request)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this]
    (-> this (.listDeploymentsAsync))))

(defn tag-resource-async
  "Associates the list of tags in the input Tags parameter with the resource identified by the
   ResourceArn input parameter.

  tag-resource-request - `com.amazonaws.services.codedeploy.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codedeploy.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonCodeDeployAsync this ^com.amazonaws.services.codedeploy.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

