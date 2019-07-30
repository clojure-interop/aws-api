(ns com.amazonaws.services.opsworks.AWSOpsWorksClient
  "Client for accessing AWS OpsWorks. All service calls made using this client are blocking, and will not return until
  the service call completes.

  AWS OpsWorks

  Welcome to the AWS OpsWorks Stacks API Reference. This guide provides descriptions, syntax, and usage examples
  for AWS OpsWorks Stacks actions and data types, including common parameters and error codes.


  AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the
  complete application lifecycle. For information about this product, go to the AWS OpsWorks details page.


  SDKs and CLI


  The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using
  one of the AWS SDKs to implement applications in your preferred language. For more information, see:




  AWS CLI




  AWS SDK for Java




  AWS SDK for .NET




  AWS SDK for PHP
  2




  AWS SDK for Ruby




  AWS SDK for Node.js




  AWS SDK for Python(Boto)




  Endpoints


  AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints.
  Stacks can only be accessed or managed within the endpoint in which they are created.




  opsworks.us-east-1.amazonaws.com




  opsworks.us-east-2.amazonaws.com




  opsworks.us-west-1.amazonaws.com




  opsworks.us-west-2.amazonaws.com




  opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)




  opsworks.eu-west-1.amazonaws.com




  opsworks.eu-west-2.amazonaws.com




  opsworks.eu-west-3.amazonaws.com




  opsworks.eu-central-1.amazonaws.com




  opsworks.ap-northeast-1.amazonaws.com




  opsworks.ap-northeast-2.amazonaws.com




  opsworks.ap-south-1.amazonaws.com




  opsworks.ap-southeast-1.amazonaws.com




  opsworks.ap-southeast-2.amazonaws.com




  opsworks.sa-east-1.amazonaws.com




  Chef Versions


  When you call CreateStack, CloneStack, or UpdateStack we recommend you use the
  ConfigurationManager parameter to specify the Chef version. The recommended and default value for Linux
  stacks is currently 12. Windows stacks use Chef 12.2. For more information, see Chef Versions.



  You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to
  Chef 12 as soon as possible."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.opsworks AWSOpsWorksClient]))

(defn ->aws-ops-works-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS OpsWorks (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSOpsWorksClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSOpsWorksClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSOpsWorksClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSOpsWorksClient aws-credentials client-configuration))
  (^AWSOpsWorksClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSOpsWorksClient client-configuration))
  (^AWSOpsWorksClient []
    (new AWSOpsWorksClient )))

(defn *builder
  "returns: `com.amazonaws.services.opsworks.AWSOpsWorksClientBuilder`"
  (^com.amazonaws.services.opsworks.AWSOpsWorksClientBuilder []
    (AWSOpsWorksClient/builder )))

(defn create-app
  "Creates an app for a specified stack. For more information, see Creating Apps.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateAppResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateAppResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.CreateAppRequest request]
    (-> this (.createApp request))))

(defn describe-stack-provisioning-parameters
  "Requests a description of a stack's provisioning parameters.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest`

  returns: Result of the DescribeStackProvisioningParameters operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest request]
    (-> this (.describeStackProvisioningParameters request))))

(defn update-layer
  "Updates a specified layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UpdateLayerRequest`

  returns: Result of the UpdateLayer operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateLayerResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateLayerResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UpdateLayerRequest request]
    (-> this (.updateLayer request))))

(defn describe-deployments
  "Requests a description of a specified set of deployments.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest`

  returns: Result of the DescribeDeployments operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeDeploymentsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeDeploymentsResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest request]
    (-> this (.describeDeployments request))))

(defn describe-stacks
  "Requests a description of one or more stacks.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeStacksRequest`

  returns: Result of the DescribeStacks operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeStacksResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeStacksResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeStacksRequest request]
    (-> this (.describeStacks request))))

(defn unassign-volume
  "Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see
   Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UnassignVolumeRequest`

  returns: Result of the UnassignVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.UnassignVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UnassignVolumeResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UnassignVolumeRequest request]
    (-> this (.unassignVolume request))))

(defn create-layer
  "Creates a layer. For more information, see How to Create a
   Layer.



   You should use CreateLayer for noncustom layer types such as PHP App Server only if the stack does not
   have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you
   attempt to create a second instance, CreateLayer fails. A stack can have an arbitrary number of custom
   layers, so you can call CreateLayer as many times as you like for that layer type.



   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.CreateLayerRequest`

  returns: Result of the CreateLayer operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateLayerResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateLayerResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.CreateLayerRequest request]
    (-> this (.createLayer request))))

(defn describe-volumes
  "Describes an instance's Amazon EBS volumes.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeVolumesRequest`

  returns: Result of the DescribeVolumes operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeVolumesResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeVolumesResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeVolumesRequest request]
    (-> this (.describeVolumes request))))

(defn start-instance
  "Starts a specified instance. For more information, see Starting, Stopping,
   and Rebooting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.StartInstanceRequest`

  returns: Result of the StartInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.StartInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.StartInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.StartInstanceRequest request]
    (-> this (.startInstance request))))

(defn deregister-ecs-cluster
  "Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see https://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.

  request - `com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest`

  returns: Result of the DeregisterEcsCluster operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest request]
    (-> this (.deregisterEcsCluster request))))

(defn delete-user-profile
  "Deletes a user profile.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DeleteUserProfileRequest`

  returns: Result of the DeleteUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteUserProfileResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteUserProfileResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeleteUserProfileRequest request]
    (-> this (.deleteUserProfile request))))

(defn waiters
  "returns: `com.amazonaws.services.opsworks.waiters.AWSOpsWorksWaiters`"
  (^com.amazonaws.services.opsworks.waiters.AWSOpsWorksWaiters [^AWSOpsWorksClient this]
    (-> this (.waiters))))

(defn update-user-profile
  "Updates a specified user profile.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UpdateUserProfileRequest`

  returns: Result of the UpdateUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateUserProfileResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateUserProfileResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UpdateUserProfileRequest request]
    (-> this (.updateUserProfile request))))

(defn describe-ecs-clusters
  "Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the
   MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks
   Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack or an attached policy that explicitly grants permission. For more information about user
   permissions, see Managing User
   Permissions.


   This call accepts only one resource-identifying parameter.

  request - `com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest`

  returns: Result of the DescribeEcsClusters operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeEcsClustersResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeEcsClustersResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest request]
    (-> this (.describeEcsClusters request))))

(defn register-instance
  "Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.



   We do not recommend using this action to register instances. The complete registration operation includes two
   tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack.
   RegisterInstance handles only the second step. You should instead use the AWS CLI
   register command, which performs the entire registration operation. For more information, see  Registering an
   Instance with an AWS OpsWorks Stacks Stack.



   Registered instances have the same requirements as instances that are created by using the CreateInstance
   API. For example, registered instances must be running a supported Linux-based operating system, and they must
   have a supported instance type. For more information about requirements for instances that you want to register,
   see
   Preparing the Instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.RegisterInstanceRequest`

  returns: Result of the RegisterInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.RegisterInstanceRequest request]
    (-> this (.registerInstance request))))

(defn list-tags
  "Returns a list of tags that are applied to the specified stack or layer.

  request - `com.amazonaws.services.opsworks.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.opsworks.model.ListTagsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.ListTagsResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn update-stack
  "Updates a specified stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UpdateStackRequest`

  returns: Result of the UpdateStack operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateStackResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UpdateStackRequest request]
    (-> this (.updateStack request))))

(defn update-my-user-profile
  "Updates a user's SSH public key.


   Required Permissions: To use this action, an IAM user must have self-management enabled or an attached
   policy that explicitly grants permissions. For more information about user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest`

  returns: Result of the UpdateMyUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest request]
    (-> this (.updateMyUserProfile request))))

(defn describe-time-based-auto-scaling
  "Describes time-based auto scaling configurations for specified instances.



   You must specify at least one of the parameters.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest`

  returns: Result of the DescribeTimeBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest request]
    (-> this (.describeTimeBasedAutoScaling request))))

(defn describe-my-user-profile
  "Describes a user's SSH information.


   Required Permissions: To use this action, an IAM user must have self-management enabled or an attached
   policy that explicitly grants permissions. For more information about user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest`

  returns: Result of the DescribeMyUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult`"
  (^com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest request]
    (-> this (.describeMyUserProfile request))))

(defn create-instance
  "Creates an instance in a specified stack. For more information, see Adding an Instance to a
   Layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.CreateInstanceRequest`

  returns: Result of the CreateInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.CreateInstanceRequest request]
    (-> this (.createInstance request))))

(defn deregister-rds-db-instance
  "Deregisters an Amazon RDS instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest`

  returns: Result of the DeregisterRdsDbInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest request]
    (-> this (.deregisterRdsDbInstance request))))

(defn describe-layers
  "Requests a description of one or more layers in a specified stack.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeLayersRequest`

  returns: Result of the DescribeLayers operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeLayersResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeLayersResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeLayersRequest request]
    (-> this (.describeLayers request))))

(defn untag-resource
  "Removes tags from a specified stack or layer.

  request - `com.amazonaws.services.opsworks.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.opsworks.model.UntagResourceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UntagResourceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn stop-instance
  "Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when
   you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information,
   see Starting,
   Stopping, and Rebooting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.StopInstanceRequest`

  returns: Result of the StopInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.StopInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.StopInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.StopInstanceRequest request]
    (-> this (.stopInstance request))))

(defn reboot-instance
  "Reboots a specified instance. For more information, see Starting, Stopping,
   and Rebooting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.RebootInstanceRequest`

  returns: Result of the RebootInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.RebootInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RebootInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.RebootInstanceRequest request]
    (-> this (.rebootInstance request))))

(defn update-volume
  "Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UpdateVolumeRequest`

  returns: Result of the UpdateVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateVolumeResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UpdateVolumeRequest request]
    (-> this (.updateVolume request))))

(defn describe-commands
  "Describes the results of specified commands.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeCommandsRequest`

  returns: Result of the DescribeCommands operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeCommandsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeCommandsResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeCommandsRequest request]
    (-> this (.describeCommands request))))

(defn disassociate-elastic-ip
  "Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more
   information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest`

  returns: Result of the DisassociateElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.DisassociateElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DisassociateElasticIpResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest request]
    (-> this (.disassociateElasticIp request))))

(defn describe-load-based-auto-scaling
  "Describes load-based auto scaling configurations for specified layers.



   You must specify at least one of the parameters.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest`

  returns: Result of the DescribeLoadBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest request]
    (-> this (.describeLoadBasedAutoScaling request))))

(defn update-rds-db-instance
  "Updates an Amazon RDS instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest`

  returns: Result of the UpdateRdsDbInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest request]
    (-> this (.updateRdsDbInstance request))))

(defn describe-operating-systems
  "Describes the operating systems that are supported by AWS OpsWorks Stacks.

  request - `com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest`

  returns: Result of the DescribeOperatingSystems operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult`"
  (^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest request]
    (-> this (.describeOperatingSystems request))))

(defn attach-elastic-load-balancer
  "Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support
   Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information,
   see Elastic Load Balancing.



   You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API,
   or CLI. For more information, see  Elastic Load
   Balancing Developer Guide.



   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest`

  returns: Result of the AttachElasticLoadBalancer operation returned by the service. - `com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest request]
    (-> this (.attachElasticLoadBalancer request))))

(defn describe-elastic-ips
  "Describes Elastic IP
   addresses.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest`

  returns: Result of the DescribeElasticIps operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeElasticIpsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeElasticIpsResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest request]
    (-> this (.describeElasticIps request))))

(defn delete-layer
  "Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered
   instances. For more information, see How to Delete a
   Layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DeleteLayerRequest`

  returns: Result of the DeleteLayer operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteLayerResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteLayerResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeleteLayerRequest request]
    (-> this (.deleteLayer request))))

(defn stop-stack
  "Stops a specified stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.StopStackRequest`

  returns: Result of the StopStack operation returned by the service. - `com.amazonaws.services.opsworks.model.StopStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.StopStackResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.StopStackRequest request]
    (-> this (.stopStack request))))

(defn set-permission
  "Specifies a user's permissions. For more information, see Security and Permissions.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.SetPermissionRequest`

  returns: Result of the SetPermission operation returned by the service. - `com.amazonaws.services.opsworks.model.SetPermissionResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.SetPermissionResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.SetPermissionRequest request]
    (-> this (.setPermission request))))

(defn associate-elastic-ip
  "Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first
   be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.AssociateElasticIpRequest`

  returns: Result of the AssociateElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.AssociateElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.AssociateElasticIpResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.AssociateElasticIpRequest request]
    (-> this (.associateElasticIp request))))

(defn assign-instance
  "Assign a registered instance to a layer.




   You can assign registered on-premises instances to any layer type.




   You can assign registered Amazon EC2 instances only to custom layers.




   You cannot use this action with instances that were created with AWS OpsWorks Stacks.




   Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a
   Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more
   information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.AssignInstanceRequest`

  returns: Result of the AssignInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.AssignInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.AssignInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.AssignInstanceRequest request]
    (-> this (.assignInstance request))))

(defn describe-stack-summary
  "Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as
   running_setup or online.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest`

  returns: Result of the DescribeStackSummary operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeStackSummaryResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeStackSummaryResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest request]
    (-> this (.describeStackSummary request))))

(defn describe-user-profiles
  "Describe specified users.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest`

  returns: Result of the DescribeUserProfiles operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeUserProfilesResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeUserProfilesResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest request]
    (-> this (.describeUserProfiles request))))

(defn register-ecs-cluster
  "Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster
   can be registered with only one stack. For more information, see  Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest`

  returns: Result of the RegisterEcsCluster operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterEcsClusterResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterEcsClusterResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest request]
    (-> this (.registerEcsCluster request))))

(defn create-stack
  "Creates a new stack. For more information, see Create a New Stack.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.CreateStackRequest`

  returns: Result of the CreateStack operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateStackResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.CreateStackRequest request]
    (-> this (.createStack request))))

(defn create-deployment
  "Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.


   Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for
   the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
   see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateDeploymentResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateDeploymentResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn delete-instance
  "Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance
   before you can delete it.


   For more information, see Deleting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DeleteInstanceRequest`

  returns: Result of the DeleteInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeleteInstanceRequest request]
    (-> this (.deleteInstance request))))

(defn deregister-instance
  "Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and
   returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DeregisterInstanceRequest`

  returns: Result of the DeregisterInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeregisterInstanceRequest request]
    (-> this (.deregisterInstance request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AWSOpsWorksClient this]
    (-> this (.shutdown))))

(defn clone-stack
  "Creates a clone of a specified stack. For more information, see Clone a Stack. By
   default, all parameters are set to the values used by the parent stack.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.CloneStackRequest`

  returns: Result of the CloneStack operation returned by the service. - `com.amazonaws.services.opsworks.model.CloneStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CloneStackResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.CloneStackRequest request]
    (-> this (.cloneStack request))))

(defn describe-apps
  "Requests a description of a specified set of apps.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeAppsRequest`

  returns: Result of the DescribeApps operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeAppsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeAppsResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeAppsRequest request]
    (-> this (.describeApps request))))

(defn register-rds-db-instance
  "Registers an Amazon RDS instance with a stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest`

  returns: Result of the RegisterRdsDbInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest request]
    (-> this (.registerRdsDbInstance request))))

(defn describe-service-errors
  "Describes AWS OpsWorks Stacks service errors.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.


   This call accepts only one resource-identifying parameter.

  request - `com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest`

  returns: Result of the DescribeServiceErrors operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest request]
    (-> this (.describeServiceErrors request))))

(defn assign-volume
  "Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be
   registered with the stack by calling RegisterVolume. After you register the volume, you must call
   UpdateVolume to specify a mount point before calling AssignVolume. For more information, see
   Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.AssignVolumeRequest`

  returns: Result of the AssignVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.AssignVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.AssignVolumeResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.AssignVolumeRequest request]
    (-> this (.assignVolume request))))

(defn delete-stack
  "Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered
   instances. For more information, see Shut Down a Stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DeleteStackRequest`

  returns: Result of the DeleteStack operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteStackResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeleteStackRequest request]
    (-> this (.deleteStack request))))

(defn create-user-profile
  "Creates a new user profile.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.CreateUserProfileRequest`

  returns: Result of the CreateUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateUserProfileResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateUserProfileResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.CreateUserProfileRequest request]
    (-> this (.createUserProfile request))))

(defn describe-elastic-load-balancers
  "Describes a stack's Elastic Load Balancing instances.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest`

  returns: Result of the DescribeElasticLoadBalancers operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest request]
    (-> this (.describeElasticLoadBalancers request))))

(defn update-instance
  "Updates a specified instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UpdateInstanceRequest`

  returns: Result of the UpdateInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UpdateInstanceRequest request]
    (-> this (.updateInstance request))))

(defn grant-access
  "This action can be used only with Windows stacks.



   Grants RDP access to a Windows instance for a specified time period.

  request - `com.amazonaws.services.opsworks.model.GrantAccessRequest`

  returns: Result of the GrantAccess operation returned by the service. - `com.amazonaws.services.opsworks.model.GrantAccessResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.GrantAccessResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.GrantAccessRequest request]
    (-> this (.grantAccess request))))

(defn delete-app
  "Deletes a specified app.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteAppResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteAppResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeleteAppRequest request]
    (-> this (.deleteApp request))))

(defn deregister-elastic-ip
  "Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more
   information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest`

  returns: Result of the DeregisterElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterElasticIpResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest request]
    (-> this (.deregisterElasticIp request))))

(defn register-elastic-ip
  "Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a
   time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp.
   For more information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.RegisterElasticIpRequest`

  returns: Result of the RegisterElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterElasticIpResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.RegisterElasticIpRequest request]
    (-> this (.registerElasticIp request))))

(defn deregister-volume
  "Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see
   Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DeregisterVolumeRequest`

  returns: Result of the DeregisterVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterVolumeResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DeregisterVolumeRequest request]
    (-> this (.deregisterVolume request))))

(defn detach-elastic-load-balancer
  "Detaches a specified Elastic Load Balancing instance from its layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest`

  returns: Result of the DetachElasticLoadBalancer operation returned by the service. - `com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult`

  throws: com.amazonaws.services.opsworks.model.ResourceNotFoundException - Indicates that a resource was not found."
  (^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest request]
    (-> this (.detachElasticLoadBalancer request))))

(defn describe-rds-db-instances
  "Describes Amazon RDS instances.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.


   This call accepts only one resource-identifying parameter.

  request - `com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest`

  returns: Result of the DescribeRdsDbInstances operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest request]
    (-> this (.describeRdsDbInstances request))))

(defn describe-instances
  "Requests a description of a set of instances.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeInstancesRequest`

  returns: Result of the DescribeInstances operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeInstancesResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeInstancesResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeInstancesRequest request]
    (-> this (.describeInstances request))))

(defn describe-permissions
  "Describes the permissions for a specified stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribePermissionsRequest`

  returns: Result of the DescribePermissions operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribePermissionsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribePermissionsResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribePermissionsRequest request]
    (-> this (.describePermissions request))))

(defn describe-agent-versions
  "Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration
   manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or
   configuration manager.

  request - `com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest`

  returns: Result of the DescribeAgentVersions operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest request]
    (-> this (.describeAgentVersions request))))

(defn start-stack
  "Starts a stack's instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.StartStackRequest`

  returns: Result of the StartStack operation returned by the service. - `com.amazonaws.services.opsworks.model.StartStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.StartStackResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.StartStackRequest request]
    (-> this (.startStack request))))

(defn get-hostname-suggestion
  "Gets a generated host name for the specified layer, based on the current host name theme.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest`

  returns: Result of the GetHostnameSuggestion operation returned by the service. - `com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest request]
    (-> this (.getHostnameSuggestion request))))

(defn register-volume
  "Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time.
   If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more
   information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.RegisterVolumeRequest`

  returns: Result of the RegisterVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterVolumeResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.RegisterVolumeRequest request]
    (-> this (.registerVolume request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSOpsWorksClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-time-based-auto-scaling
  "Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with
   Time-based and Load-based Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest`

  returns: Result of the SetTimeBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest request]
    (-> this (.setTimeBasedAutoScaling request))))

(defn update-app
  "Updates a specified app.


   Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for
   the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
   see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UpdateAppRequest`

  returns: Result of the UpdateApp operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateAppResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateAppResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UpdateAppRequest request]
    (-> this (.updateApp request))))

(defn describe-raid-arrays
  "Describe an instance's RAID arrays.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest`

  returns: Result of the DescribeRaidArrays operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeRaidArraysResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeRaidArraysResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest request]
    (-> this (.describeRaidArrays request))))

(defn unassign-instance
  "Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as
   an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances
   that were created with AWS OpsWorks Stacks.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UnassignInstanceRequest`

  returns: Result of the UnassignInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.UnassignInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UnassignInstanceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UnassignInstanceRequest request]
    (-> this (.unassignInstance request))))

(defn tag-resource
  "Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how
   tagging works, see Tags in the
   AWS OpsWorks User Guide.

  request - `com.amazonaws.services.opsworks.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.opsworks.model.TagResourceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.TagResourceResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn update-elastic-ip
  "Updates a registered Elastic IP address's name. For more information, see Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.UpdateElasticIpRequest`

  returns: Result of the UpdateElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateElasticIpResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.UpdateElasticIpRequest request]
    (-> this (.updateElasticIp request))))

(defn set-load-based-auto-scaling
  "Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with
   Time-based and Load-based Instances.



   To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto
   scaling operates only on the instances from that set, so you must ensure that you have created enough instances
   to handle the maximum anticipated load.



   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  request - `com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest`

  returns: Result of the SetLoadBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult [^AWSOpsWorksClient this ^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest request]
    (-> this (.setLoadBasedAutoScaling request))))

