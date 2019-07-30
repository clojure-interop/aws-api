(ns com.amazonaws.services.opsworks.AWSOpsWorks
  "Interface for accessing AWS OpsWorks.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSOpsWorks instead.


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
  (:import [com.amazonaws.services.opsworks AWSOpsWorks]))

(defn create-app
  "Creates an app for a specified stack. For more information, see Creating Apps.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  create-app-request - `com.amazonaws.services.opsworks.model.CreateAppRequest`

  returns: Result of the CreateApp operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateAppResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateAppResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateAppRequest create-app-request]
    (-> this (.createApp create-app-request))))

(defn describe-stack-provisioning-parameters
  "Requests a description of a stack's provisioning parameters.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-stack-provisioning-parameters-request - `com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest`

  returns: Result of the DescribeStackProvisioningParameters operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest describe-stack-provisioning-parameters-request]
    (-> this (.describeStackProvisioningParameters describe-stack-provisioning-parameters-request))))

(defn update-layer
  "Updates a specified layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-layer-request - `com.amazonaws.services.opsworks.model.UpdateLayerRequest`

  returns: Result of the UpdateLayer operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateLayerResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateLayerResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateLayerRequest update-layer-request]
    (-> this (.updateLayer update-layer-request))))

(defn describe-deployments
  "Requests a description of a specified set of deployments.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-deployments-request - `com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest`

  returns: Result of the DescribeDeployments operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeDeploymentsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeDeploymentsResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest describe-deployments-request]
    (-> this (.describeDeployments describe-deployments-request))))

(defn describe-stacks
  "Requests a description of one or more stacks.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-stacks-request - `com.amazonaws.services.opsworks.model.DescribeStacksRequest`

  returns: Result of the DescribeStacks operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeStacksResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeStacksResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeStacksRequest describe-stacks-request]
    (-> this (.describeStacks describe-stacks-request))))

(defn unassign-volume
  "Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see
   Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  unassign-volume-request - `com.amazonaws.services.opsworks.model.UnassignVolumeRequest`

  returns: Result of the UnassignVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.UnassignVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UnassignVolumeResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UnassignVolumeRequest unassign-volume-request]
    (-> this (.unassignVolume unassign-volume-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSOpsWorks this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

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

  create-layer-request - `com.amazonaws.services.opsworks.model.CreateLayerRequest`

  returns: Result of the CreateLayer operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateLayerResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateLayerResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateLayerRequest create-layer-request]
    (-> this (.createLayer create-layer-request))))

(defn describe-volumes
  "Describes an instance's Amazon EBS volumes.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-volumes-request - `com.amazonaws.services.opsworks.model.DescribeVolumesRequest`

  returns: Result of the DescribeVolumes operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeVolumesResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeVolumesResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeVolumesRequest describe-volumes-request]
    (-> this (.describeVolumes describe-volumes-request))))

(defn start-instance
  "Starts a specified instance. For more information, see Starting, Stopping,
   and Rebooting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  start-instance-request - `com.amazonaws.services.opsworks.model.StartInstanceRequest`

  returns: Result of the StartInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.StartInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.StartInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.StartInstanceRequest start-instance-request]
    (-> this (.startInstance start-instance-request))))

(defn deregister-ecs-cluster
  "Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see https://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.

  deregister-ecs-cluster-request - `com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest`

  returns: Result of the DeregisterEcsCluster operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest deregister-ecs-cluster-request]
    (-> this (.deregisterEcsCluster deregister-ecs-cluster-request))))

(defn delete-user-profile
  "Deletes a user profile.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  delete-user-profile-request - `com.amazonaws.services.opsworks.model.DeleteUserProfileRequest`

  returns: Result of the DeleteUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteUserProfileResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteUserProfileResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteUserProfileRequest delete-user-profile-request]
    (-> this (.deleteUserProfile delete-user-profile-request))))

(defn waiters
  "returns: `com.amazonaws.services.opsworks.waiters.AWSOpsWorksWaiters`"
  (^com.amazonaws.services.opsworks.waiters.AWSOpsWorksWaiters [^AWSOpsWorks this]
    (-> this (.waiters))))

(defn update-user-profile
  "Updates a specified user profile.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  update-user-profile-request - `com.amazonaws.services.opsworks.model.UpdateUserProfileRequest`

  returns: Result of the UpdateUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateUserProfileResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateUserProfileResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateUserProfileRequest update-user-profile-request]
    (-> this (.updateUserProfile update-user-profile-request))))

(defn describe-ecs-clusters
  "Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the
   MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks
   Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack or an attached policy that explicitly grants permission. For more information about user
   permissions, see Managing User
   Permissions.


   This call accepts only one resource-identifying parameter.

  describe-ecs-clusters-request - `com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest`

  returns: Result of the DescribeEcsClusters operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeEcsClustersResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeEcsClustersResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest describe-ecs-clusters-request]
    (-> this (.describeEcsClusters describe-ecs-clusters-request))))

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

  register-instance-request - `com.amazonaws.services.opsworks.model.RegisterInstanceRequest`

  returns: Result of the RegisterInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterInstanceRequest register-instance-request]
    (-> this (.registerInstance register-instance-request))))

(defn list-tags
  "Returns a list of tags that are applied to the specified stack or layer.

  list-tags-request - `com.amazonaws.services.opsworks.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.opsworks.model.ListTagsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.ListTagsResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.ListTagsRequest list-tags-request]
    (-> this (.listTags list-tags-request))))

(defn update-stack
  "Updates a specified stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-stack-request - `com.amazonaws.services.opsworks.model.UpdateStackRequest`

  returns: Result of the UpdateStack operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateStackResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateStackRequest update-stack-request]
    (-> this (.updateStack update-stack-request))))

(defn update-my-user-profile
  "Updates a user's SSH public key.


   Required Permissions: To use this action, an IAM user must have self-management enabled or an attached
   policy that explicitly grants permissions. For more information about user permissions, see Managing User
   Permissions.

  update-my-user-profile-request - `com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest`

  returns: Result of the UpdateMyUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest update-my-user-profile-request]
    (-> this (.updateMyUserProfile update-my-user-profile-request))))

(defn describe-time-based-auto-scaling
  "Describes time-based auto scaling configurations for specified instances.



   You must specify at least one of the parameters.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-time-based-auto-scaling-request - `com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest`

  returns: Result of the DescribeTimeBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest describe-time-based-auto-scaling-request]
    (-> this (.describeTimeBasedAutoScaling describe-time-based-auto-scaling-request))))

(defn describe-my-user-profile
  "Describes a user's SSH information.


   Required Permissions: To use this action, an IAM user must have self-management enabled or an attached
   policy that explicitly grants permissions. For more information about user permissions, see Managing User
   Permissions.

  describe-my-user-profile-request - `com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest`

  returns: Result of the DescribeMyUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult`"
  (^com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest describe-my-user-profile-request]
    (-> this (.describeMyUserProfile describe-my-user-profile-request))))

(defn create-instance
  "Creates an instance in a specified stack. For more information, see Adding an Instance to a
   Layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  create-instance-request - `com.amazonaws.services.opsworks.model.CreateInstanceRequest`

  returns: Result of the CreateInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateInstanceRequest create-instance-request]
    (-> this (.createInstance create-instance-request))))

(defn deregister-rds-db-instance
  "Deregisters an Amazon RDS instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  deregister-rds-db-instance-request - `com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest`

  returns: Result of the DeregisterRdsDbInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest deregister-rds-db-instance-request]
    (-> this (.deregisterRdsDbInstance deregister-rds-db-instance-request))))

(defn describe-layers
  "Requests a description of one or more layers in a specified stack.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-layers-request - `com.amazonaws.services.opsworks.model.DescribeLayersRequest`

  returns: Result of the DescribeLayers operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeLayersResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeLayersResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeLayersRequest describe-layers-request]
    (-> this (.describeLayers describe-layers-request))))

(defn untag-resource
  "Removes tags from a specified stack or layer.

  untag-resource-request - `com.amazonaws.services.opsworks.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.opsworks.model.UntagResourceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UntagResourceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn stop-instance
  "Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when
   you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information,
   see Starting,
   Stopping, and Rebooting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  stop-instance-request - `com.amazonaws.services.opsworks.model.StopInstanceRequest`

  returns: Result of the StopInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.StopInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.StopInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.StopInstanceRequest stop-instance-request]
    (-> this (.stopInstance stop-instance-request))))

(defn reboot-instance
  "Reboots a specified instance. For more information, see Starting, Stopping,
   and Rebooting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  reboot-instance-request - `com.amazonaws.services.opsworks.model.RebootInstanceRequest`

  returns: Result of the RebootInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.RebootInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RebootInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.RebootInstanceRequest reboot-instance-request]
    (-> this (.rebootInstance reboot-instance-request))))

(defn update-volume
  "Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-volume-request - `com.amazonaws.services.opsworks.model.UpdateVolumeRequest`

  returns: Result of the UpdateVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateVolumeResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateVolumeRequest update-volume-request]
    (-> this (.updateVolume update-volume-request))))

(defn describe-commands
  "Describes the results of specified commands.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-commands-request - `com.amazonaws.services.opsworks.model.DescribeCommandsRequest`

  returns: Result of the DescribeCommands operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeCommandsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeCommandsResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeCommandsRequest describe-commands-request]
    (-> this (.describeCommands describe-commands-request))))

(defn disassociate-elastic-ip
  "Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more
   information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  disassociate-elastic-ip-request - `com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest`

  returns: Result of the DisassociateElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.DisassociateElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DisassociateElasticIpResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest disassociate-elastic-ip-request]
    (-> this (.disassociateElasticIp disassociate-elastic-ip-request))))

(defn describe-load-based-auto-scaling
  "Describes load-based auto scaling configurations for specified layers.



   You must specify at least one of the parameters.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-load-based-auto-scaling-request - `com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest`

  returns: Result of the DescribeLoadBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest describe-load-based-auto-scaling-request]
    (-> this (.describeLoadBasedAutoScaling describe-load-based-auto-scaling-request))))

(defn update-rds-db-instance
  "Updates an Amazon RDS instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-rds-db-instance-request - `com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest`

  returns: Result of the UpdateRdsDbInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest update-rds-db-instance-request]
    (-> this (.updateRdsDbInstance update-rds-db-instance-request))))

(defn describe-operating-systems
  "Describes the operating systems that are supported by AWS OpsWorks Stacks.

  describe-operating-systems-request - `com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest`

  returns: Result of the DescribeOperatingSystems operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult`"
  (^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest describe-operating-systems-request]
    (-> this (.describeOperatingSystems describe-operating-systems-request))))

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

  attach-elastic-load-balancer-request - `com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest`

  returns: Result of the AttachElasticLoadBalancer operation returned by the service. - `com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest attach-elastic-load-balancer-request]
    (-> this (.attachElasticLoadBalancer attach-elastic-load-balancer-request))))

(defn describe-elastic-ips
  "Describes Elastic IP
   addresses.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-elastic-ips-request - `com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest`

  returns: Result of the DescribeElasticIps operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeElasticIpsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeElasticIpsResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest describe-elastic-ips-request]
    (-> this (.describeElasticIps describe-elastic-ips-request))))

(defn delete-layer
  "Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered
   instances. For more information, see How to Delete a
   Layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  delete-layer-request - `com.amazonaws.services.opsworks.model.DeleteLayerRequest`

  returns: Result of the DeleteLayer operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteLayerResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteLayerResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteLayerRequest delete-layer-request]
    (-> this (.deleteLayer delete-layer-request))))

(defn stop-stack
  "Stops a specified stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  stop-stack-request - `com.amazonaws.services.opsworks.model.StopStackRequest`

  returns: Result of the StopStack operation returned by the service. - `com.amazonaws.services.opsworks.model.StopStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.StopStackResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.StopStackRequest stop-stack-request]
    (-> this (.stopStack stop-stack-request))))

(defn set-permission
  "Specifies a user's permissions. For more information, see Security and Permissions.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  set-permission-request - `com.amazonaws.services.opsworks.model.SetPermissionRequest`

  returns: Result of the SetPermission operation returned by the service. - `com.amazonaws.services.opsworks.model.SetPermissionResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.SetPermissionResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.SetPermissionRequest set-permission-request]
    (-> this (.setPermission set-permission-request))))

(defn associate-elastic-ip
  "Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first
   be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  associate-elastic-ip-request - `com.amazonaws.services.opsworks.model.AssociateElasticIpRequest`

  returns: Result of the AssociateElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.AssociateElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.AssociateElasticIpResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.AssociateElasticIpRequest associate-elastic-ip-request]
    (-> this (.associateElasticIp associate-elastic-ip-request))))

(defn assign-instance
  "Assign a registered instance to a layer.




   You can assign registered on-premises instances to any layer type.




   You can assign registered Amazon EC2 instances only to custom layers.




   You cannot use this action with instances that were created with AWS OpsWorks Stacks.




   Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a
   Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more
   information on user permissions, see Managing User
   Permissions.

  assign-instance-request - `com.amazonaws.services.opsworks.model.AssignInstanceRequest`

  returns: Result of the AssignInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.AssignInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.AssignInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.AssignInstanceRequest assign-instance-request]
    (-> this (.assignInstance assign-instance-request))))

(defn describe-stack-summary
  "Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as
   running_setup or online.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-stack-summary-request - `com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest`

  returns: Result of the DescribeStackSummary operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeStackSummaryResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeStackSummaryResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest describe-stack-summary-request]
    (-> this (.describeStackSummary describe-stack-summary-request))))

(defn describe-user-profiles
  "Describe specified users.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  describe-user-profiles-request - `com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest`

  returns: Result of the DescribeUserProfiles operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeUserProfilesResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeUserProfilesResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest describe-user-profiles-request]
    (-> this (.describeUserProfiles describe-user-profiles-request))))

(defn register-ecs-cluster
  "Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster
   can be registered with only one stack. For more information, see  Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User
   Permissions.

  register-ecs-cluster-request - `com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest`

  returns: Result of the RegisterEcsCluster operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterEcsClusterResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterEcsClusterResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest register-ecs-cluster-request]
    (-> this (.registerEcsCluster register-ecs-cluster-request))))

(defn create-stack
  "Creates a new stack. For more information, see Create a New Stack.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  create-stack-request - `com.amazonaws.services.opsworks.model.CreateStackRequest`

  returns: Result of the CreateStack operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateStackResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateStackRequest create-stack-request]
    (-> this (.createStack create-stack-request))))

(defn create-deployment
  "Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.


   Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for
   the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
   see Managing User
   Permissions.

  create-deployment-request - `com.amazonaws.services.opsworks.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateDeploymentResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateDeploymentResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeployment create-deployment-request))))

(defn delete-instance
  "Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance
   before you can delete it.


   For more information, see Deleting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  delete-instance-request - `com.amazonaws.services.opsworks.model.DeleteInstanceRequest`

  returns: Result of the DeleteInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteInstanceRequest delete-instance-request]
    (-> this (.deleteInstance delete-instance-request))))

(defn deregister-instance
  "Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and
   returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  deregister-instance-request - `com.amazonaws.services.opsworks.model.DeregisterInstanceRequest`

  returns: Result of the DeregisterInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterInstanceRequest deregister-instance-request]
    (-> this (.deregisterInstance deregister-instance-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSOpsWorks this]
    (-> this (.shutdown))))

(defn clone-stack
  "Creates a clone of a specified stack. For more information, see Clone a Stack. By
   default, all parameters are set to the values used by the parent stack.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  clone-stack-request - `com.amazonaws.services.opsworks.model.CloneStackRequest`

  returns: Result of the CloneStack operation returned by the service. - `com.amazonaws.services.opsworks.model.CloneStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CloneStackResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.CloneStackRequest clone-stack-request]
    (-> this (.cloneStack clone-stack-request))))

(defn describe-apps
  "Requests a description of a specified set of apps.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-apps-request - `com.amazonaws.services.opsworks.model.DescribeAppsRequest`

  returns: Result of the DescribeApps operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeAppsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeAppsResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeAppsRequest describe-apps-request]
    (-> this (.describeApps describe-apps-request))))

(defn register-rds-db-instance
  "Registers an Amazon RDS instance with a stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  register-rds-db-instance-request - `com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest`

  returns: Result of the RegisterRdsDbInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest register-rds-db-instance-request]
    (-> this (.registerRdsDbInstance register-rds-db-instance-request))))

(defn describe-service-errors
  "Describes AWS OpsWorks Stacks service errors.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.


   This call accepts only one resource-identifying parameter.

  describe-service-errors-request - `com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest`

  returns: Result of the DescribeServiceErrors operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest describe-service-errors-request]
    (-> this (.describeServiceErrors describe-service-errors-request))))

(defn assign-volume
  "Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be
   registered with the stack by calling RegisterVolume. After you register the volume, you must call
   UpdateVolume to specify a mount point before calling AssignVolume. For more information, see
   Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  assign-volume-request - `com.amazonaws.services.opsworks.model.AssignVolumeRequest`

  returns: Result of the AssignVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.AssignVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.AssignVolumeResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.AssignVolumeRequest assign-volume-request]
    (-> this (.assignVolume assign-volume-request))))

(defn delete-stack
  "Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered
   instances. For more information, see Shut Down a Stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  delete-stack-request - `com.amazonaws.services.opsworks.model.DeleteStackRequest`

  returns: Result of the DeleteStack operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteStackResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteStackRequest delete-stack-request]
    (-> this (.deleteStack delete-stack-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"opsworks.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://opsworks.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSOpsWorks this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-user-profile
  "Creates a new user profile.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  create-user-profile-request - `com.amazonaws.services.opsworks.model.CreateUserProfileRequest`

  returns: Result of the CreateUserProfile operation returned by the service. - `com.amazonaws.services.opsworks.model.CreateUserProfileResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.CreateUserProfileResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.CreateUserProfileRequest create-user-profile-request]
    (-> this (.createUserProfile create-user-profile-request))))

(defn describe-elastic-load-balancers
  "Describes a stack's Elastic Load Balancing instances.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-elastic-load-balancers-request - `com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest`

  returns: Result of the DescribeElasticLoadBalancers operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest describe-elastic-load-balancers-request]
    (-> this (.describeElasticLoadBalancers describe-elastic-load-balancers-request))))

(defn update-instance
  "Updates a specified instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-instance-request - `com.amazonaws.services.opsworks.model.UpdateInstanceRequest`

  returns: Result of the UpdateInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateInstanceRequest update-instance-request]
    (-> this (.updateInstance update-instance-request))))

(defn grant-access
  "This action can be used only with Windows stacks.



   Grants RDP access to a Windows instance for a specified time period.

  grant-access-request - `com.amazonaws.services.opsworks.model.GrantAccessRequest`

  returns: Result of the GrantAccess operation returned by the service. - `com.amazonaws.services.opsworks.model.GrantAccessResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.GrantAccessResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.GrantAccessRequest grant-access-request]
    (-> this (.grantAccess grant-access-request))))

(defn delete-app
  "Deletes a specified app.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  delete-app-request - `com.amazonaws.services.opsworks.model.DeleteAppRequest`

  returns: Result of the DeleteApp operation returned by the service. - `com.amazonaws.services.opsworks.model.DeleteAppResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeleteAppResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeleteAppRequest delete-app-request]
    (-> this (.deleteApp delete-app-request))))

(defn deregister-elastic-ip
  "Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more
   information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  deregister-elastic-ip-request - `com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest`

  returns: Result of the DeregisterElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterElasticIpResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest deregister-elastic-ip-request]
    (-> this (.deregisterElasticIp deregister-elastic-ip-request))))

(defn register-elastic-ip
  "Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a
   time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp.
   For more information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  register-elastic-ip-request - `com.amazonaws.services.opsworks.model.RegisterElasticIpRequest`

  returns: Result of the RegisterElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterElasticIpResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterElasticIpRequest register-elastic-ip-request]
    (-> this (.registerElasticIp register-elastic-ip-request))))

(defn deregister-volume
  "Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see
   Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  deregister-volume-request - `com.amazonaws.services.opsworks.model.DeregisterVolumeRequest`

  returns: Result of the DeregisterVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.DeregisterVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DeregisterVolumeResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DeregisterVolumeRequest deregister-volume-request]
    (-> this (.deregisterVolume deregister-volume-request))))

(defn detach-elastic-load-balancer
  "Detaches a specified Elastic Load Balancing instance from its layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  detach-elastic-load-balancer-request - `com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest`

  returns: Result of the DetachElasticLoadBalancer operation returned by the service. - `com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult`

  throws: com.amazonaws.services.opsworks.model.ResourceNotFoundException - Indicates that a resource was not found."
  (^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest detach-elastic-load-balancer-request]
    (-> this (.detachElasticLoadBalancer detach-elastic-load-balancer-request))))

(defn describe-rds-db-instances
  "Describes Amazon RDS instances.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.


   This call accepts only one resource-identifying parameter.

  describe-rds-db-instances-request - `com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest`

  returns: Result of the DescribeRdsDbInstances operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest describe-rds-db-instances-request]
    (-> this (.describeRdsDbInstances describe-rds-db-instances-request))))

(defn describe-instances
  "Requests a description of a set of instances.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-instances-request - `com.amazonaws.services.opsworks.model.DescribeInstancesRequest`

  returns: Result of the DescribeInstances operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeInstancesResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeInstancesResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeInstancesRequest describe-instances-request]
    (-> this (.describeInstances describe-instances-request))))

(defn describe-permissions
  "Describes the permissions for a specified stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  describe-permissions-request - `com.amazonaws.services.opsworks.model.DescribePermissionsRequest`

  returns: Result of the DescribePermissions operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribePermissionsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribePermissionsResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribePermissionsRequest describe-permissions-request]
    (-> this (.describePermissions describe-permissions-request))))

(defn describe-agent-versions
  "Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration
   manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or
   configuration manager.

  describe-agent-versions-request - `com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest`

  returns: Result of the DescribeAgentVersions operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest describe-agent-versions-request]
    (-> this (.describeAgentVersions describe-agent-versions-request))))

(defn start-stack
  "Starts a stack's instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  start-stack-request - `com.amazonaws.services.opsworks.model.StartStackRequest`

  returns: Result of the StartStack operation returned by the service. - `com.amazonaws.services.opsworks.model.StartStackResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.StartStackResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.StartStackRequest start-stack-request]
    (-> this (.startStack start-stack-request))))

(defn get-hostname-suggestion
  "Gets a generated host name for the specified layer, based on the current host name theme.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  get-hostname-suggestion-request - `com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest`

  returns: Result of the GetHostnameSuggestion operation returned by the service. - `com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest get-hostname-suggestion-request]
    (-> this (.getHostnameSuggestion get-hostname-suggestion-request))))

(defn register-volume
  "Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time.
   If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more
   information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  register-volume-request - `com.amazonaws.services.opsworks.model.RegisterVolumeRequest`

  returns: Result of the RegisterVolume operation returned by the service. - `com.amazonaws.services.opsworks.model.RegisterVolumeResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.RegisterVolumeResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.RegisterVolumeRequest register-volume-request]
    (-> this (.registerVolume register-volume-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSOpsWorks this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-time-based-auto-scaling
  "Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with
   Time-based and Load-based Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  set-time-based-auto-scaling-request - `com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest`

  returns: Result of the SetTimeBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest set-time-based-auto-scaling-request]
    (-> this (.setTimeBasedAutoScaling set-time-based-auto-scaling-request))))

(defn update-app
  "Updates a specified app.


   Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for
   the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
   see Managing User
   Permissions.

  update-app-request - `com.amazonaws.services.opsworks.model.UpdateAppRequest`

  returns: Result of the UpdateApp operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateAppResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateAppResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateAppRequest update-app-request]
    (-> this (.updateApp update-app-request))))

(defn describe-raid-arrays
  "Describe an instance's RAID arrays.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-raid-arrays-request - `com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest`

  returns: Result of the DescribeRaidArrays operation returned by the service. - `com.amazonaws.services.opsworks.model.DescribeRaidArraysResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.DescribeRaidArraysResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest describe-raid-arrays-request]
    (-> this (.describeRaidArrays describe-raid-arrays-request))))

(defn unassign-instance
  "Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as
   an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances
   that were created with AWS OpsWorks Stacks.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User
   Permissions.

  unassign-instance-request - `com.amazonaws.services.opsworks.model.UnassignInstanceRequest`

  returns: Result of the UnassignInstance operation returned by the service. - `com.amazonaws.services.opsworks.model.UnassignInstanceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UnassignInstanceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UnassignInstanceRequest unassign-instance-request]
    (-> this (.unassignInstance unassign-instance-request))))

(defn tag-resource
  "Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how
   tagging works, see Tags in the
   AWS OpsWorks User Guide.

  tag-resource-request - `com.amazonaws.services.opsworks.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.opsworks.model.TagResourceResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.TagResourceResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn update-elastic-ip
  "Updates a registered Elastic IP address's name. For more information, see Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-elastic-ip-request - `com.amazonaws.services.opsworks.model.UpdateElasticIpRequest`

  returns: Result of the UpdateElasticIp operation returned by the service. - `com.amazonaws.services.opsworks.model.UpdateElasticIpResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.UpdateElasticIpResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.UpdateElasticIpRequest update-elastic-ip-request]
    (-> this (.updateElasticIp update-elastic-ip-request))))

(defn set-load-based-auto-scaling
  "Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with
   Time-based and Load-based Instances.



   To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto
   scaling operates only on the instances from that set, so you must ensure that you have created enough instances
   to handle the maximum anticipated load.



   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  set-load-based-auto-scaling-request - `com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest`

  returns: Result of the SetLoadBasedAutoScaling operation returned by the service. - `com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult`

  throws: com.amazonaws.services.opsworks.model.ValidationException - Indicates that a request was not valid."
  (^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult [^AWSOpsWorks this ^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest set-load-based-auto-scaling-request]
    (-> this (.setLoadBasedAutoScaling set-load-based-auto-scaling-request))))

