(ns com.amazonaws.services.codedeploy.AmazonCodeDeployClient
  "Client for accessing CodeDeploy. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.codedeploy AmazonCodeDeployClient]))

(defn ->amazon-code-deploy-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to CodeDeploy (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonCodeDeployClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonCodeDeployClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonCodeDeployClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCodeDeployClient aws-credentials client-configuration))
  (^AmazonCodeDeployClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCodeDeployClient client-configuration))
  (^AmazonCodeDeployClient []
    (new AmazonCodeDeployClient )))

(defn *builder
  "returns: `com.amazonaws.services.codedeploy.AmazonCodeDeployClientBuilder`"
  (^com.amazonaws.services.codedeploy.AmazonCodeDeployClientBuilder []
    (AmazonCodeDeployClient/builder )))

(defn get-on-premises-instance
  "Gets information about an on-premises instance.

  request - `com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest`

  returns: Result of the GetOnPremisesInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest request]
    (-> this (.getOnPremisesInstance request))))

(defn put-lifecycle-event-hook-execution-status
  "Sets the result of a Lambda validation function. The function validates one or both lifecycle events (
   BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or
   Failed.

  request - `com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest`

  returns: Result of the PutLifecycleEventHookExecutionStatus operation returned by the service. - `com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidLifecycleEventHookExecutionStatusException - The result of a Lambda validation function that verifies a lifecycle event is invalid. It should return Succeeded or Failed."
  (^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest request]
    (-> this (.putLifecycleEventHookExecutionStatus request))))

(defn list-tags-for-resource
  "Returns a list of tags for the resource identified by a specified ARN. Tags are used to organize and categorize
   your CodeDeploy resources.

  request - `com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.codedeploy.model.ArnNotSupportedException - The specified ARN is not supported. For example, it might be an ARN for a resource that is not expected."
  (^com.amazonaws.services.codedeploy.model.ListTagsForResourceResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-deployment-configs
  "Lists the deployment configurations with the IAM user or AWS account.

  request - `com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest`

  returns: Result of the ListDeploymentConfigs operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidNextTokenException - The next token was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest request]
    (-> this (.listDeploymentConfigs request)))
  (^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult [^AmazonCodeDeployClient this]
    (-> this (.listDeploymentConfigs))))

(defn list-deployment-instances
  "Deprecated.

  request - `com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest`

  returns: Result of the ListDeploymentInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest request]
    (-> this (.listDeploymentInstances request))))

(defn waiters
  "returns: `com.amazonaws.services.codedeploy.waiters.AmazonCodeDeployWaiters`"
  (^com.amazonaws.services.codedeploy.waiters.AmazonCodeDeployWaiters [^AmazonCodeDeployClient this]
    (-> this (.waiters))))

(defn register-on-premises-instance
  "Registers an on-premises instance.



   Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both.

  request - `com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest`

  returns: Result of the RegisterOnPremisesInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameAlreadyRegisteredException - The specified on-premises instance name is already registered."
  (^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest request]
    (-> this (.registerOnPremisesInstance request))))

(defn add-tags-to-on-premises-instances
  "Adds tags to on-premises instances.

  request - `com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest`

  returns: Result of the AddTagsToOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest request]
    (-> this (.addTagsToOnPremisesInstances request))))

(defn list-application-revisions
  "Lists information about revisions for an application.

  request - `com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest`

  returns: Result of the ListApplicationRevisions operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidSortOrderException - The sort order was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest request]
    (-> this (.listApplicationRevisions request))))

(defn untag-resource
  "Disassociates a resource from a list of tags. The resource is identified by the ResourceArn input
   parameter. The tags are identfied by the list of keys in the TagKeys input parameter.

  request - `com.amazonaws.services.codedeploy.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.codedeploy.model.UntagResourceResult`

  throws: com.amazonaws.services.codedeploy.model.ResourceArnRequiredException - The ARN of a resource is required, but was not found."
  (^com.amazonaws.services.codedeploy.model.UntagResourceResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-deployment-config
  "Gets information about a deployment configuration.

  request - `com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest`

  returns: Result of the GetDeploymentConfig operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentConfigNameException - The deployment configuration name was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest request]
    (-> this (.getDeploymentConfig request))))

(defn stop-deployment
  "Attempts to stop an ongoing deployment.

  request - `com.amazonaws.services.codedeploy.model.StopDeploymentRequest`

  returns: Result of the StopDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.StopDeploymentResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.StopDeploymentResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.StopDeploymentRequest request]
    (-> this (.stopDeployment request))))

(defn create-deployment-group
  "Creates a deployment group to which application revisions are deployed.

  request - `com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest`

  returns: Result of the CreateDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult`

  throws: com.amazonaws.services.codedeploy.model.LifecycleHookLimitExceededException - The limit for lifecycle hooks was exceeded."
  (^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest request]
    (-> this (.createDeploymentGroup request))))

(defn batch-get-deployments
  "Gets information about one or more deployments. The maximum number of deployments that can be returned is 25.

  request - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest`

  returns: Result of the BatchGetDeployments operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest request]
    (-> this (.batchGetDeployments request)))
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult [^AmazonCodeDeployClient this]
    (-> this (.batchGetDeployments))))

(defn delete-application
  "Deletes an application.

  request - `com.amazonaws.services.codedeploy.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteApplicationResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.DeleteApplicationResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn get-deployment
  "Gets information about a deployment.



   The content property of the appSpecContent object in the returned revision is always
   null. Use GetApplicationRevision and the sha256 property of the returned
   appSpecContent object to get the content of the deployment’s AppSpec file.

  request - `com.amazonaws.services.codedeploy.model.GetDeploymentRequest`

  returns: Result of the GetDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentRequest request]
    (-> this (.getDeployment request))))

(defn list-applications
  "Lists the applications registered with the IAM user or AWS account.

  request - `com.amazonaws.services.codedeploy.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListApplicationsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidNextTokenException - The next token was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListApplicationsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListApplicationsRequest request]
    (-> this (.listApplications request)))
  (^com.amazonaws.services.codedeploy.model.ListApplicationsResult [^AmazonCodeDeployClient this]
    (-> this (.listApplications))))

(defn get-application-revision
  "Gets information about an application revision.

  request - `com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest`

  returns: Result of the GetApplicationRevision operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationDoesNotExistException - The application does not exist with the IAM user or AWS account."
  (^com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest request]
    (-> this (.getApplicationRevision request))))

(defn get-deployment-target
  "Returns information about a deployment target.

  request - `com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest`

  returns: Result of the GetDeploymentTarget operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentTargetResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentIdException - At least one of the deployment IDs was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentTargetResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest request]
    (-> this (.getDeploymentTarget request))))

(defn list-on-premises-instances
  "Gets a list of names for one or more on-premises instances.


   Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only
   registered or deregistered on-premises instance names, use the registration status parameter.

  request - `com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest`

  returns: Result of the ListOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidRegistrationStatusException - The registration status was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest request]
    (-> this (.listOnPremisesInstances request)))
  (^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult [^AmazonCodeDeployClient this]
    (-> this (.listOnPremisesInstances))))

(defn delete-deployment-group
  "Deletes a deployment group.

  request - `com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest`

  returns: Result of the DeleteDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest request]
    (-> this (.deleteDeploymentGroup request))))

(defn create-deployment
  "Deploys an application revision through the specified deployment group.

  request - `com.amazonaws.services.codedeploy.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateDeploymentResult`

  throws: com.amazonaws.services.codedeploy.model.ThrottlingException - An API function was called too frequently."
  (^com.amazonaws.services.codedeploy.model.CreateDeploymentResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn batch-get-deployment-groups
  "Gets information about one or more deployment groups.

  request - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest`

  returns: Result of the BatchGetDeploymentGroups operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest request]
    (-> this (.batchGetDeploymentGroups request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonCodeDeployClient this]
    (-> this (.shutdown))))

(defn update-application
  "Changes the name of an application.

  request - `com.amazonaws.services.codedeploy.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.UpdateApplicationResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.UpdateApplicationResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request)))
  (^com.amazonaws.services.codedeploy.model.UpdateApplicationResult [^AmazonCodeDeployClient this]
    (-> this (.updateApplication))))

(defn delete-git-hub-account-token
  "Deletes a GitHub account connection.

  request - `com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest`

  returns: Result of the DeleteGitHubAccountToken operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult`

  throws: com.amazonaws.services.codedeploy.model.GitHubAccountTokenNameRequiredException - The call is missing a required GitHub account connection name."
  (^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest request]
    (-> this (.deleteGitHubAccountToken request))))

(defn register-application-revision
  "Registers with AWS CodeDeploy a revision for the specified application.

  request - `com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest`

  returns: Result of the RegisterApplicationRevision operation returned by the service. - `com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationDoesNotExistException - The application does not exist with the IAM user or AWS account."
  (^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest request]
    (-> this (.registerApplicationRevision request))))

(defn create-application
  "Creates an application.

  request - `com.amazonaws.services.codedeploy.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateApplicationResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.CreateApplicationResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn list-deployments
  "Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.

  request - `com.amazonaws.services.codedeploy.model.ListDeploymentsRequest`

  returns: Result of the ListDeployments operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentStatusException - The specified deployment status doesn't exist or cannot be determined."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentsRequest request]
    (-> this (.listDeployments request)))
  (^com.amazonaws.services.codedeploy.model.ListDeploymentsResult [^AmazonCodeDeployClient this]
    (-> this (.listDeployments))))

(defn get-deployment-instance
  "Deprecated.

  request - `com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest`

  returns: Result of the GetDeploymentInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest request]
    (-> this (.getDeploymentInstance request))))

(defn continue-deployment
  "For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment
   to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic
   rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can
   start as soon as all instances have a status of Ready.)

  request - `com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest`

  returns: Result of the ContinueDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.ContinueDeploymentResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.ContinueDeploymentResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest request]
    (-> this (.continueDeployment request))))

(defn get-application
  "Gets information about an application.

  request - `com.amazonaws.services.codedeploy.model.GetApplicationRequest`

  returns: Result of the GetApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetApplicationResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.GetApplicationResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.GetApplicationRequest request]
    (-> this (.getApplication request))))

(defn remove-tags-from-on-premises-instances
  "Removes one or more tags from one or more on-premises instances.

  request - `com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest`

  returns: Result of the RemoveTagsFromOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest request]
    (-> this (.removeTagsFromOnPremisesInstances request))))

(defn create-deployment-config
  "Creates a deployment configuration.

  request - `com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest`

  returns: Result of the CreateDeploymentConfig operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentConfigNameException - The deployment configuration name was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest request]
    (-> this (.createDeploymentConfig request))))

(defn skip-wait-time-for-instance-termination
  "Deprecated.

  request - `com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest`

  returns: Result of the SkipWaitTimeForInstanceTermination operation returned by the service. - `com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest request]
    (-> this (.skipWaitTimeForInstanceTermination request))))

(defn batch-get-deployment-targets
  "Returns an array of one or more targets associated with a deployment. This method works with all compute types
   and should be used instead of the deprecated BatchGetDeploymentInstances. The maximum number of
   targets that can be returned is 25.


   The type of targets returned depends on the deployment's compute platform:




   EC2/On-premises: Information about EC2 instance targets.




   AWS Lambda: Information about Lambda functions targets.




   Amazon ECS: Information about Amazon ECS service targets.

  request - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest`

  returns: Result of the BatchGetDeploymentTargets operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentIdException - At least one of the deployment IDs was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest request]
    (-> this (.batchGetDeploymentTargets request))))

(defn batch-get-applications
  "Gets information about one or more applications. The maximum number of applications that can be returned is 25.

  request - `com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest`

  returns: Result of the BatchGetApplications operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest request]
    (-> this (.batchGetApplications request)))
  (^com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult [^AmazonCodeDeployClient this]
    (-> this (.batchGetApplications))))

(defn list-deployment-groups
  "Lists the deployment groups for an application registered with the IAM user or AWS account.

  request - `com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest`

  returns: Result of the ListDeploymentGroups operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest request]
    (-> this (.listDeploymentGroups request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCodeDeployClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn batch-get-on-premises-instances
  "Gets information about one or more on-premises instances. The maximum number of on-premises instances that can be
   returned is 25.

  request - `com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest`

  returns: Result of the BatchGetOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest request]
    (-> this (.batchGetOnPremisesInstances request)))
  (^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult [^AmazonCodeDeployClient this]
    (-> this (.batchGetOnPremisesInstances))))

(defn update-deployment-group
  "Changes information about a deployment group.

  request - `com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest`

  returns: Result of the UpdateDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult`

  throws: com.amazonaws.services.codedeploy.model.LifecycleHookLimitExceededException - The limit for lifecycle hooks was exceeded."
  (^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest request]
    (-> this (.updateDeploymentGroup request))))

(defn list-deployment-targets
  "Returns an array of target IDs that are associated a deployment.

  request - `com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest`

  returns: Result of the ListDeploymentTargets operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentTargetsResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest request]
    (-> this (.listDeploymentTargets request))))

(defn batch-get-application-revisions
  "Gets information about one or more application revisions. The maximum number of application revisions that can be
   returned is 25.

  request - `com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest`

  returns: Result of the BatchGetApplicationRevisions operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationDoesNotExistException - The application does not exist with the IAM user or AWS account."
  (^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest request]
    (-> this (.batchGetApplicationRevisions request))))

(defn deregister-on-premises-instance
  "Deregisters an on-premises instance.

  request - `com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest`

  returns: Result of the DeregisterOnPremisesInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult`

  throws: com.amazonaws.services.codedeploy.model.InstanceNameRequiredException - An on-premises instance name was not specified."
  (^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest request]
    (-> this (.deregisterOnPremisesInstance request))))

(defn tag-resource
  "Associates the list of tags in the input Tags parameter with the resource identified by the
   ResourceArn input parameter.

  request - `com.amazonaws.services.codedeploy.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.codedeploy.model.TagResourceResult`

  throws: com.amazonaws.services.codedeploy.model.ResourceArnRequiredException - The ARN of a resource is required, but was not found."
  (^com.amazonaws.services.codedeploy.model.TagResourceResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn batch-get-deployment-instances
  "Deprecated.

  request - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest`

  returns: Result of the BatchGetDeploymentInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult`

  throws: com.amazonaws.services.codedeploy.model.DeploymentIdRequiredException - At least one deployment ID must be specified."
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest request]
    (-> this (.batchGetDeploymentInstances request))))

(defn get-deployment-group
  "Gets information about a deployment group.

  request - `com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest`

  returns: Result of the GetDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult`

  throws: com.amazonaws.services.codedeploy.model.ApplicationNameRequiredException - The minimum number of required application names was not specified."
  (^com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest request]
    (-> this (.getDeploymentGroup request))))

(defn list-git-hub-account-token-names
  "Lists the names of stored connections to GitHub accounts.

  request - `com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest`

  returns: Result of the ListGitHubAccountTokenNames operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidNextTokenException - The next token was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest request]
    (-> this (.listGitHubAccountTokenNames request))))

(defn delete-deployment-config
  "Deletes a deployment configuration.



   A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be
   deleted.

  request - `com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest`

  returns: Result of the DeleteDeploymentConfig operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult`

  throws: com.amazonaws.services.codedeploy.model.InvalidDeploymentConfigNameException - The deployment configuration name was specified in an invalid format."
  (^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult [^AmazonCodeDeployClient this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest request]
    (-> this (.deleteDeploymentConfig request))))

