(ns com.amazonaws.services.codedeploy.AmazonCodeDeploy
  "Interface for accessing CodeDeploy.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCodeDeploy instead.


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
  (:import [com.amazonaws.services.codedeploy AmazonCodeDeploy]))

(defn get-on-premises-instance
  "Gets information about an on-premises instance.

  get-on-premises-instance-request - Represents the input of a GetOnPremisesInstance operation. - `com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest`

  returns: Result of the GetOnPremisesInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest get-on-premises-instance-request]
    (-> this (.getOnPremisesInstance get-on-premises-instance-request))))

(defn put-lifecycle-event-hook-execution-status
  "Sets the result of a Lambda validation function. The function validates one or both lifecycle events (
   BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or
   Failed.

  put-lifecycle-event-hook-execution-status-request - `com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest`

  returns: Result of the PutLifecycleEventHookExecutionStatus operation returned by the service. - `com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidLifecycleEventHookExecutionStatusException - The result of a Lambda validation function that verifies a lifecycle event is invalid. It should return Succeeded or Failed."
  (^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest put-lifecycle-event-hook-execution-status-request]
    (-> this (.putLifecycleEventHookExecutionStatus put-lifecycle-event-hook-execution-status-request))))

(defn list-tags-for-resource
  "Returns a list of tags for the resource identified by a specified ARN. Tags are used to organize and categorize
   your CodeDeploy resources.

  list-tags-for-resource-request - `com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.codedeploy.model.ArnNotSupportedException - The specified ARN is not supported. For example, it might be an ARN for a resource that is not expected."
  (^com.amazonaws.services.codedeploy.model.ListTagsForResourceResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn list-deployment-configs
  "Lists the deployment configurations with the IAM user or AWS account.

  list-deployment-configs-request - Represents the input of a ListDeploymentConfigs operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest`

  returns: Result of the ListDeploymentConfigs operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidNextTokenException - The next token was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest list-deployment-configs-request]
    (-> this (.listDeploymentConfigs list-deployment-configs-request)))
  (^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult [^AmazonCodeDeploy this]
    (-> this (.listDeploymentConfigs))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonCodeDeploy this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-deployment-instances
  "Deprecated.

  list-deployment-instances-request - Represents the input of a ListDeploymentInstances operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest`

  returns: Result of the ListDeploymentInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest list-deployment-instances-request]
    (-> this (.listDeploymentInstances list-deployment-instances-request))))

(defn waiters
  "returns: `com.amazonaws.services.codedeploy.waiters.AmazonCodeDeployWaiters`"
  (^com.amazonaws.services.codedeploy.waiters.AmazonCodeDeployWaiters [^AmazonCodeDeploy this]
    (-> this (.waiters))))

(defn register-on-premises-instance
  "Registers an on-premises instance.



   Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both.

  register-on-premises-instance-request - Represents the input of the register on-premises instance operation. - `com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest`

  returns: Result of the RegisterOnPremisesInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameAlreadyRegisteredException - The specified on-premises instance name is already registered."
  (^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest register-on-premises-instance-request]
    (-> this (.registerOnPremisesInstance register-on-premises-instance-request))))

(defn add-tags-to-on-premises-instances
  "Adds tags to on-premises instances.

  add-tags-to-on-premises-instances-request - Represents the input of, and adds tags to, an on-premises instance operation. - `com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest`

  returns: Result of the AddTagsToOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest add-tags-to-on-premises-instances-request]
    (-> this (.addTagsToOnPremisesInstances add-tags-to-on-premises-instances-request))))

(defn list-application-revisions
  "Lists information about revisions for an application.

  list-application-revisions-request - Represents the input of a ListApplicationRevisions operation. - `com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest`

  returns: Result of the ListApplicationRevisions operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidSortOrderException - The sort order was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest list-application-revisions-request]
    (-> this (.listApplicationRevisions list-application-revisions-request))))

(defn untag-resource
  "Disassociates a resource from a list of tags. The resource is identified by the ResourceArn input
   parameter. The tags are identfied by the list of keys in the TagKeys input parameter.

  untag-resource-request - `com.amazonaws.services.codedeploy.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.codedeploy.model.UntagResourceResult`

  throws: com.amazonaws.services.codedeploy.model.ResourceArnRequiredException - The ARN of a resource is required, but was not found."
  (^com.amazonaws.services.codedeploy.model.UntagResourceResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn get-deployment-config
  "Gets information about a deployment configuration.

  get-deployment-config-request - Represents the input of a GetDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest`

  returns: Result of the GetDeploymentConfig operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentConfigNameException - The deployment configuration name was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest get-deployment-config-request]
    (-> this (.getDeploymentConfig get-deployment-config-request))))

(defn stop-deployment
  "Attempts to stop an ongoing deployment.

  stop-deployment-request - Represents the input of a StopDeployment operation. - `com.amazonaws.services.codedeploy.model.StopDeploymentRequest`

  returns: Result of the StopDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.StopDeploymentResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.StopDeploymentResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.StopDeploymentRequest stop-deployment-request]
    (-> this (.stopDeployment stop-deployment-request))))

(defn create-deployment-group
  "Creates a deployment group to which application revisions are deployed.

  create-deployment-group-request - Represents the input of a CreateDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest`

  returns: Result of the CreateDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult`

  throws: com.amazonaws.services.codedeploy.model.LifecycleHookLimitExceededException - The limit for lifecycle hooks was exceeded."
  (^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest create-deployment-group-request]
    (-> this (.createDeploymentGroup create-deployment-group-request))))

(defn batch-get-deployments
  "Gets information about one or more deployments. The maximum number of deployments that can be returned is 25.

  batch-get-deployments-request - Represents the input of a BatchGetDeployments operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest`

  returns: Result of the BatchGetDeployments operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest batch-get-deployments-request]
    (-> this (.batchGetDeployments batch-get-deployments-request)))
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult [^AmazonCodeDeploy this]
    (-> this (.batchGetDeployments))))

(defn delete-application
  "Deletes an application.

  delete-application-request - Represents the input of a DeleteApplication operation. - `com.amazonaws.services.codedeploy.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteApplicationResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.DeleteApplicationResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplication delete-application-request))))

(defn get-deployment
  "Gets information about a deployment.



   The content property of the appSpecContent object in the returned revision is always
   null. Use GetApplicationRevision and the sha256 property of the returned
   appSpecContent object to get the content of the deployment’s AppSpec file.

  get-deployment-request - Represents the input of a GetDeployment operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentRequest`

  returns: Result of the GetDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentRequest get-deployment-request]
    (-> this (.getDeployment get-deployment-request))))

(defn list-applications
  "Lists the applications registered with the IAM user or AWS account.

  list-applications-request - Represents the input of a ListApplications operation. - `com.amazonaws.services.codedeploy.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListApplicationsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidNextTokenException - The next token was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListApplicationsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListApplicationsRequest list-applications-request]
    (-> this (.listApplications list-applications-request)))
  (^com.amazonaws.services.codedeploy.model.ListApplicationsResult [^AmazonCodeDeploy this]
    (-> this (.listApplications))))

(defn get-application-revision
  "Gets information about an application revision.

  get-application-revision-request - Represents the input of a GetApplicationRevision operation. - `com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest`

  returns: Result of the GetApplicationRevision operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationDoesNotExistException - The application does not exist with the IAM user or AWS account."
  (^com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest get-application-revision-request]
    (-> this (.getApplicationRevision get-application-revision-request))))

(defn get-deployment-target
  "Returns information about a deployment target.

  get-deployment-target-request - `com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest`

  returns: Result of the GetDeploymentTarget operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentTargetResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentIdException - At least one of the deployment IDs was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentTargetResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest get-deployment-target-request]
    (-> this (.getDeploymentTarget get-deployment-target-request))))

(defn list-on-premises-instances
  "Gets a list of names for one or more on-premises instances.


   Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only
   registered or deregistered on-premises instance names, use the registration status parameter.

  list-on-premises-instances-request - Represents the input of a ListOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest`

  returns: Result of the ListOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidRegistrationStatusException - The registration status was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest list-on-premises-instances-request]
    (-> this (.listOnPremisesInstances list-on-premises-instances-request)))
  (^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult [^AmazonCodeDeploy this]
    (-> this (.listOnPremisesInstances))))

(defn delete-deployment-group
  "Deletes a deployment group.

  delete-deployment-group-request - Represents the input of a DeleteDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest`

  returns: Result of the DeleteDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest delete-deployment-group-request]
    (-> this (.deleteDeploymentGroup delete-deployment-group-request))))

(defn create-deployment
  "Deploys an application revision through the specified deployment group.

  create-deployment-request - Represents the input of a CreateDeployment operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateDeploymentResult`

  throws: com.amazonaws.services.codedeploy.model.ThrottlingException - An API function was called too frequently."
  (^com.amazonaws.services.codedeploy.model.CreateDeploymentResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeployment create-deployment-request))))

(defn batch-get-deployment-groups
  "Gets information about one or more deployment groups.

  batch-get-deployment-groups-request - Represents the input of a BatchGetDeploymentGroups operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest`

  returns: Result of the BatchGetDeploymentGroups operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest batch-get-deployment-groups-request]
    (-> this (.batchGetDeploymentGroups batch-get-deployment-groups-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonCodeDeploy this]
    (-> this (.shutdown))))

(defn update-application
  "Changes the name of an application.

  update-application-request - Represents the input of an UpdateApplication operation. - `com.amazonaws.services.codedeploy.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.UpdateApplicationResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.UpdateApplicationResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplication update-application-request)))
  (^com.amazonaws.services.codedeploy.model.UpdateApplicationResult [^AmazonCodeDeploy this]
    (-> this (.updateApplication))))

(defn delete-git-hub-account-token
  "Deletes a GitHub account connection.

  delete-git-hub-account-token-request - Represents the input of a DeleteGitHubAccount operation. - `com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest`

  returns: Result of the DeleteGitHubAccountToken operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult`

  throws: com.amazonaws.services.codedeploy.model.GitHubAccountTokenNameRequiredException - The call is missing a required GitHub account connection name."
  (^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest delete-git-hub-account-token-request]
    (-> this (.deleteGitHubAccountToken delete-git-hub-account-token-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"codedeploy.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://codedeploy.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonCodeDeploy this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn register-application-revision
  "Registers with AWS CodeDeploy a revision for the specified application.

  register-application-revision-request - Represents the input of a RegisterApplicationRevision operation. - `com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest`

  returns: Result of the RegisterApplicationRevision operation returned by the service. - `com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationDoesNotExistException - The application does not exist with the IAM user or AWS account."
  (^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest register-application-revision-request]
    (-> this (.registerApplicationRevision register-application-revision-request))))

(defn create-application
  "Creates an application.

  create-application-request - Represents the input of a CreateApplication operation. - `com.amazonaws.services.codedeploy.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateApplicationResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.CreateApplicationResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplication create-application-request))))

(defn list-deployments
  "Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.

  list-deployments-request - Represents the input of a ListDeployments operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentsRequest`

  returns: Result of the ListDeployments operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentStatusException - The specified deployment status doesn't exist or cannot be determined."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentsRequest list-deployments-request]
    (-> this (.listDeployments list-deployments-request)))
  (^com.amazonaws.services.codedeploy.model.ListDeploymentsResult [^AmazonCodeDeploy this]
    (-> this (.listDeployments))))

(defn get-deployment-instance
  "Deprecated.

  get-deployment-instance-request - Represents the input of a GetDeploymentInstance operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest`

  returns: Result of the GetDeploymentInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest get-deployment-instance-request]
    (-> this (.getDeploymentInstance get-deployment-instance-request))))

(defn continue-deployment
  "For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment
   to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic
   rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can
   start as soon as all instances have a status of Ready.)

  continue-deployment-request - `com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest`

  returns: Result of the ContinueDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.ContinueDeploymentResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.ContinueDeploymentResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest continue-deployment-request]
    (-> this (.continueDeployment continue-deployment-request))))

(defn get-application
  "Gets information about an application.

  get-application-request - Represents the input of a GetApplication operation. - `com.amazonaws.services.codedeploy.model.GetApplicationRequest`

  returns: Result of the GetApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetApplicationResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.GetApplicationResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetApplicationRequest get-application-request]
    (-> this (.getApplication get-application-request))))

(defn remove-tags-from-on-premises-instances
  "Removes one or more tags from one or more on-premises instances.

  remove-tags-from-on-premises-instances-request - Represents the input of a RemoveTagsFromOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest`

  returns: Result of the RemoveTagsFromOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest remove-tags-from-on-premises-instances-request]
    (-> this (.removeTagsFromOnPremisesInstances remove-tags-from-on-premises-instances-request))))

(defn create-deployment-config
  "Creates a deployment configuration.

  create-deployment-config-request - Represents the input of a CreateDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest`

  returns: Result of the CreateDeploymentConfig operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentConfigNameException - The deployment configuration name was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest create-deployment-config-request]
    (-> this (.createDeploymentConfig create-deployment-config-request))))

(defn skip-wait-time-for-instance-termination
  "Deprecated.

  skip-wait-time-for-instance-termination-request - `com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest`

  returns: Result of the SkipWaitTimeForInstanceTermination operation returned by the service. - `com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest skip-wait-time-for-instance-termination-request]
    (-> this (.skipWaitTimeForInstanceTermination skip-wait-time-for-instance-termination-request))))

(defn batch-get-deployment-targets
  "Returns an array of one or more targets associated with a deployment. This method works with all compute types
   and should be used instead of the deprecated BatchGetDeploymentInstances. The maximum number of
   targets that can be returned is 25.


   The type of targets returned depends on the deployment's compute platform:




   EC2/On-premises: Information about EC2 instance targets.




   AWS Lambda: Information about Lambda functions targets.




   Amazon ECS: Information about Amazon ECS service targets.

  batch-get-deployment-targets-request - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest`

  returns: Result of the BatchGetDeploymentTargets operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentIdException - At least one of the deployment IDs was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest batch-get-deployment-targets-request]
    (-> this (.batchGetDeploymentTargets batch-get-deployment-targets-request))))

(defn batch-get-applications
  "Gets information about one or more applications. The maximum number of applications that can be returned is 25.

  batch-get-applications-request - Represents the input of a BatchGetApplications operation. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest`

  returns: Result of the BatchGetApplications operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest batch-get-applications-request]
    (-> this (.batchGetApplications batch-get-applications-request)))
  (^com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult [^AmazonCodeDeploy this]
    (-> this (.batchGetApplications))))

(defn list-deployment-groups
  "Lists the deployment groups for an application registered with the IAM user or AWS account.

  list-deployment-groups-request - Represents the input of a ListDeploymentGroups operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest`

  returns: Result of the ListDeploymentGroups operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest list-deployment-groups-request]
    (-> this (.listDeploymentGroups list-deployment-groups-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCodeDeploy this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn batch-get-on-premises-instances
  "Gets information about one or more on-premises instances. The maximum number of on-premises instances that can be
   returned is 25.

  batch-get-on-premises-instances-request - Represents the input of a BatchGetOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest`

  returns: Result of the BatchGetOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest batch-get-on-premises-instances-request]
    (-> this (.batchGetOnPremisesInstances batch-get-on-premises-instances-request)))
  (^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult [^AmazonCodeDeploy this]
    (-> this (.batchGetOnPremisesInstances))))

(defn update-deployment-group
  "Changes information about a deployment group.

  update-deployment-group-request - Represents the input of an UpdateDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest`

  returns: Result of the UpdateDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult`

  throws: com.amazonaws.services.codedeploy.model.LifecycleHookLimitExceededException - The limit for lifecycle hooks was exceeded."
  (^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest update-deployment-group-request]
    (-> this (.updateDeploymentGroup update-deployment-group-request))))

(defn list-deployment-targets
  "Returns an array of target IDs that are associated a deployment.

  list-deployment-targets-request - `com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest`

  returns: Result of the ListDeploymentTargets operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentTargetsResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest list-deployment-targets-request]
    (-> this (.listDeploymentTargets list-deployment-targets-request))))

(defn batch-get-application-revisions
  "Gets information about one or more application revisions. The maximum number of application revisions that can be
   returned is 25.

  batch-get-application-revisions-request - Represents the input of a BatchGetApplicationRevisions operation. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest`

  returns: Result of the BatchGetApplicationRevisions operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationDoesNotExistException - The application does not exist with the IAM user or AWS account."
  (^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest batch-get-application-revisions-request]
    (-> this (.batchGetApplicationRevisions batch-get-application-revisions-request))))

(defn deregister-on-premises-instance
  "Deregisters an on-premises instance.

  deregister-on-premises-instance-request - Represents the input of a DeregisterOnPremisesInstance operation. - `com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest`

  returns: Result of the DeregisterOnPremisesInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest deregister-on-premises-instance-request]
    (-> this (.deregisterOnPremisesInstance deregister-on-premises-instance-request))))

(defn tag-resource
  "Associates the list of tags in the input Tags parameter with the resource identified by the
   ResourceArn input parameter.

  tag-resource-request - `com.amazonaws.services.codedeploy.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.codedeploy.model.TagResourceResult`

  throws: com.amazonaws.services.codedeploy.model.ResourceArnRequiredException - The ARN of a resource is required, but was not found."
  (^com.amazonaws.services.codedeploy.model.TagResourceResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn batch-get-deployment-instances
  "Deprecated.

  batch-get-deployment-instances-request - Represents the input of a BatchGetDeploymentInstances operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest`

  returns: Result of the BatchGetDeploymentInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest batch-get-deployment-instances-request]
    (-> this (.batchGetDeploymentInstances batch-get-deployment-instances-request))))

(defn get-deployment-group
  "Gets information about a deployment group.

  get-deployment-group-request - Represents the input of a GetDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest`

  returns: Result of the GetDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest get-deployment-group-request]
    (-> this (.getDeploymentGroup get-deployment-group-request))))

(defn list-git-hub-account-token-names
  "Lists the names of stored connections to GitHub accounts.

  list-git-hub-account-token-names-request - Represents the input of a ListGitHubAccountTokenNames operation. - `com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest`

  returns: Result of the ListGitHubAccountTokenNames operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidNextTokenException - The next token was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest list-git-hub-account-token-names-request]
    (-> this (.listGitHubAccountTokenNames list-git-hub-account-token-names-request))))

(defn delete-deployment-config
  "Deletes a deployment configuration.



   A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be
   deleted.

  delete-deployment-config-request - Represents the input of a DeleteDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest`

  returns: Result of the DeleteDeploymentConfig operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentConfigNameException - The deployment configuration name was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult [^AmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest delete-deployment-config-request]
    (-> this (.deleteDeploymentConfig delete-deployment-config-request))))

