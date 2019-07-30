(ns com.amazonaws.services.opsworks.AWSOpsWorksAsync
  "Interface for accessing AWS OpsWorks asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSOpsWorksAsync instead.


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
  (:import [com.amazonaws.services.opsworks AWSOpsWorksAsync]))

(defn deregister-ecs-cluster-async
  "Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see https://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.

  deregister-ecs-cluster-request - `com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterEcsCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterEcsClusterResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest deregister-ecs-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterEcsClusterAsync deregister-ecs-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterEcsClusterRequest deregister-ecs-cluster-request]
    (-> this (.deregisterEcsClusterAsync deregister-ecs-cluster-request))))

(defn untag-resource-async
  "Removes tags from a specified stack or layer.

  untag-resource-request - `com.amazonaws.services.opsworks.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn unassign-instance-async
  "Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as
   an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances
   that were created with AWS OpsWorks Stacks.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User
   Permissions.

  unassign-instance-request - `com.amazonaws.services.opsworks.model.UnassignInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnassignInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UnassignInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UnassignInstanceRequest unassign-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unassignInstanceAsync unassign-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UnassignInstanceRequest unassign-instance-request]
    (-> this (.unassignInstanceAsync unassign-instance-request))))

(defn describe-ecs-clusters-async
  "Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the
   MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks
   Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack or an attached policy that explicitly grants permission. For more information about user
   permissions, see Managing User
   Permissions.


   This call accepts only one resource-identifying parameter.

  describe-ecs-clusters-request - `com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEcsClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeEcsClustersResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest describe-ecs-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEcsClustersAsync describe-ecs-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeEcsClustersRequest describe-ecs-clusters-request]
    (-> this (.describeEcsClustersAsync describe-ecs-clusters-request))))

(defn update-rds-db-instance-async
  "Updates an Amazon RDS instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-rds-db-instance-request - `com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRdsDbInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest update-rds-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRdsDbInstanceAsync update-rds-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateRdsDbInstanceRequest update-rds-db-instance-request]
    (-> this (.updateRdsDbInstanceAsync update-rds-db-instance-request))))

(defn describe-layers-async
  "Requests a description of one or more layers in a specified stack.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-layers-request - `com.amazonaws.services.opsworks.model.DescribeLayersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLayers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeLayersResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeLayersRequest describe-layers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLayersAsync describe-layers-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeLayersRequest describe-layers-request]
    (-> this (.describeLayersAsync describe-layers-request))))

(defn clone-stack-async
  "Creates a clone of a specified stack. For more information, see Clone a Stack. By
   default, all parameters are set to the values used by the parent stack.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  clone-stack-request - `com.amazonaws.services.opsworks.model.CloneStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CloneStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CloneStackResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CloneStackRequest clone-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cloneStackAsync clone-stack-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CloneStackRequest clone-stack-request]
    (-> this (.cloneStackAsync clone-stack-request))))

(defn delete-app-async
  "Deletes a specified app.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  delete-app-request - `com.amazonaws.services.opsworks.model.DeleteAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteAppResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteAppRequest delete-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAppAsync delete-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteAppRequest delete-app-request]
    (-> this (.deleteAppAsync delete-app-request))))

(defn describe-operating-systems-async
  "Describes the operating systems that are supported by AWS OpsWorks Stacks.

  describe-operating-systems-request - `com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOperatingSystems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeOperatingSystemsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest describe-operating-systems-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOperatingSystemsAsync describe-operating-systems-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeOperatingSystemsRequest describe-operating-systems-request]
    (-> this (.describeOperatingSystemsAsync describe-operating-systems-request))))

(defn describe-instances-async
  "Requests a description of a set of instances.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-instances-request - `com.amazonaws.services.opsworks.model.DescribeInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeInstancesResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeInstancesRequest describe-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancesAsync describe-instances-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeInstancesRequest describe-instances-request]
    (-> this (.describeInstancesAsync describe-instances-request))))

(defn register-ecs-cluster-async
  "Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster
   can be registered with only one stack. For more information, see  Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User
   Permissions.

  register-ecs-cluster-request - `com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterEcsCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterEcsClusterResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest register-ecs-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerEcsClusterAsync register-ecs-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterEcsClusterRequest register-ecs-cluster-request]
    (-> this (.registerEcsClusterAsync register-ecs-cluster-request))))

(defn list-tags-async
  "Returns a list of tags that are applied to the specified stack or layer.

  list-tags-request - `com.amazonaws.services.opsworks.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn update-app-async
  "Updates a specified app.


   Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for
   the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
   see Managing User
   Permissions.

  update-app-request - `com.amazonaws.services.opsworks.model.UpdateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateAppResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateAppRequest update-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAppAsync update-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateAppRequest update-app-request]
    (-> this (.updateAppAsync update-app-request))))

(defn create-layer-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLayer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateLayerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateLayerRequest create-layer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLayerAsync create-layer-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateLayerRequest create-layer-request]
    (-> this (.createLayerAsync create-layer-request))))

(defn stop-stack-async
  "Stops a specified stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  stop-stack-request - `com.amazonaws.services.opsworks.model.StopStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.StopStackResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StopStackRequest stop-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopStackAsync stop-stack-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StopStackRequest stop-stack-request]
    (-> this (.stopStackAsync stop-stack-request))))

(defn set-time-based-auto-scaling-async
  "Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with
   Time-based and Load-based Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  set-time-based-auto-scaling-request - `com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetTimeBasedAutoScaling operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest set-time-based-auto-scaling-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTimeBasedAutoScalingAsync set-time-based-auto-scaling-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetTimeBasedAutoScalingRequest set-time-based-auto-scaling-request]
    (-> this (.setTimeBasedAutoScalingAsync set-time-based-auto-scaling-request))))

(defn unassign-volume-async
  "Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see
   Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  unassign-volume-request - `com.amazonaws.services.opsworks.model.UnassignVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnassignVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UnassignVolumeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UnassignVolumeRequest unassign-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unassignVolumeAsync unassign-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UnassignVolumeRequest unassign-volume-request]
    (-> this (.unassignVolumeAsync unassign-volume-request))))

(defn describe-elastic-ips-async
  "Describes Elastic IP
   addresses.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-elastic-ips-request - `com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticIps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeElasticIpsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest describe-elastic-ips-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticIpsAsync describe-elastic-ips-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeElasticIpsRequest describe-elastic-ips-request]
    (-> this (.describeElasticIpsAsync describe-elastic-ips-request))))

(defn describe-permissions-async
  "Describes the permissions for a specified stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  describe-permissions-request - `com.amazonaws.services.opsworks.model.DescribePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribePermissionsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribePermissionsRequest describe-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePermissionsAsync describe-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribePermissionsRequest describe-permissions-request]
    (-> this (.describePermissionsAsync describe-permissions-request))))

(defn describe-volumes-async
  "Describes an instance's Amazon EBS volumes.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-volumes-request - `com.amazonaws.services.opsworks.model.DescribeVolumesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeVolumesResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeVolumesRequest describe-volumes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumesAsync describe-volumes-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeVolumesRequest describe-volumes-request]
    (-> this (.describeVolumesAsync describe-volumes-request))))

(defn create-instance-async
  "Creates an instance in a specified stack. For more information, see Adding an Instance to a
   Layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  create-instance-request - `com.amazonaws.services.opsworks.model.CreateInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateInstanceRequest create-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceAsync create-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateInstanceRequest create-instance-request]
    (-> this (.createInstanceAsync create-instance-request))))

(defn associate-elastic-ip-async
  "Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first
   be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  associate-elastic-ip-request - `com.amazonaws.services.opsworks.model.AssociateElasticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.AssociateElasticIpResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssociateElasticIpRequest associate-elastic-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateElasticIpAsync associate-elastic-ip-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssociateElasticIpRequest associate-elastic-ip-request]
    (-> this (.associateElasticIpAsync associate-elastic-ip-request))))

(defn delete-stack-async
  "Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered
   instances. For more information, see Shut Down a Stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  delete-stack-request - `com.amazonaws.services.opsworks.model.DeleteStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteStackResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteStackRequest delete-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackAsync delete-stack-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteStackRequest delete-stack-request]
    (-> this (.deleteStackAsync delete-stack-request))))

(defn set-permission-async
  "Specifies a user's permissions. For more information, see Security and Permissions.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  set-permission-request - `com.amazonaws.services.opsworks.model.SetPermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.SetPermissionResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetPermissionRequest set-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setPermissionAsync set-permission-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetPermissionRequest set-permission-request]
    (-> this (.setPermissionAsync set-permission-request))))

(defn describe-user-profiles-async
  "Describe specified users.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  describe-user-profiles-request - `com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeUserProfilesResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest describe-user-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserProfilesAsync describe-user-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeUserProfilesRequest describe-user-profiles-request]
    (-> this (.describeUserProfilesAsync describe-user-profiles-request))))

(defn describe-time-based-auto-scaling-async
  "Describes time-based auto scaling configurations for specified instances.



   You must specify at least one of the parameters.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-time-based-auto-scaling-request - `com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTimeBasedAutoScaling operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest describe-time-based-auto-scaling-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTimeBasedAutoScalingAsync describe-time-based-auto-scaling-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeTimeBasedAutoScalingRequest describe-time-based-auto-scaling-request]
    (-> this (.describeTimeBasedAutoScalingAsync describe-time-based-auto-scaling-request))))

(defn deregister-elastic-ip-async
  "Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more
   information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  deregister-elastic-ip-request - `com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterElasticIpResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest deregister-elastic-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterElasticIpAsync deregister-elastic-ip-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterElasticIpRequest deregister-elastic-ip-request]
    (-> this (.deregisterElasticIpAsync deregister-elastic-ip-request))))

(defn reboot-instance-async
  "Reboots a specified instance. For more information, see Starting, Stopping,
   and Rebooting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  reboot-instance-request - `com.amazonaws.services.opsworks.model.RebootInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RebootInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RebootInstanceRequest reboot-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootInstanceAsync reboot-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RebootInstanceRequest reboot-instance-request]
    (-> this (.rebootInstanceAsync reboot-instance-request))))

(defn assign-volume-async
  "Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be
   registered with the stack by calling RegisterVolume. After you register the volume, you must call
   UpdateVolume to specify a mount point before calling AssignVolume. For more information, see
   Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  assign-volume-request - `com.amazonaws.services.opsworks.model.AssignVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.AssignVolumeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssignVolumeRequest assign-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignVolumeAsync assign-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssignVolumeRequest assign-volume-request]
    (-> this (.assignVolumeAsync assign-volume-request))))

(defn grant-access-async
  "This action can be used only with Windows stacks.



   Grants RDP access to a Windows instance for a specified time period.

  grant-access-request - `com.amazonaws.services.opsworks.model.GrantAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GrantAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.GrantAccessResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.GrantAccessRequest grant-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.grantAccessAsync grant-access-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.GrantAccessRequest grant-access-request]
    (-> this (.grantAccessAsync grant-access-request))))

(defn stop-instance-async
  "Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when
   you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information,
   see Starting,
   Stopping, and Rebooting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  stop-instance-request - `com.amazonaws.services.opsworks.model.StopInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.StopInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StopInstanceRequest stop-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopInstanceAsync stop-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StopInstanceRequest stop-instance-request]
    (-> this (.stopInstanceAsync stop-instance-request))))

(defn describe-commands-async
  "Describes the results of specified commands.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-commands-request - `com.amazonaws.services.opsworks.model.DescribeCommandsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCommands operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeCommandsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeCommandsRequest describe-commands-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCommandsAsync describe-commands-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeCommandsRequest describe-commands-request]
    (-> this (.describeCommandsAsync describe-commands-request))))

(defn create-user-profile-async
  "Creates a new user profile.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  create-user-profile-request - `com.amazonaws.services.opsworks.model.CreateUserProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateUserProfileRequest create-user-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserProfileAsync create-user-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateUserProfileRequest create-user-profile-request]
    (-> this (.createUserProfileAsync create-user-profile-request))))

(defn assign-instance-async
  "Assign a registered instance to a layer.




   You can assign registered on-premises instances to any layer type.




   You can assign registered Amazon EC2 instances only to custom layers.




   You cannot use this action with instances that were created with AWS OpsWorks Stacks.




   Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a
   Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more
   information on user permissions, see Managing User
   Permissions.

  assign-instance-request - `com.amazonaws.services.opsworks.model.AssignInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.AssignInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssignInstanceRequest assign-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignInstanceAsync assign-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AssignInstanceRequest assign-instance-request]
    (-> this (.assignInstanceAsync assign-instance-request))))

(defn get-hostname-suggestion-async
  "Gets a generated host name for the specified layer, based on the current host name theme.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  get-hostname-suggestion-request - `com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostnameSuggestion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.GetHostnameSuggestionResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest get-hostname-suggestion-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostnameSuggestionAsync get-hostname-suggestion-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.GetHostnameSuggestionRequest get-hostname-suggestion-request]
    (-> this (.getHostnameSuggestionAsync get-hostname-suggestion-request))))

(defn describe-stacks-async
  "Requests a description of one or more stacks.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-stacks-request - `com.amazonaws.services.opsworks.model.DescribeStacksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeStacksResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStacksRequest describe-stacks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStacksAsync describe-stacks-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStacksRequest describe-stacks-request]
    (-> this (.describeStacksAsync describe-stacks-request))))

(defn register-volume-async
  "Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time.
   If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more
   information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  register-volume-request - `com.amazonaws.services.opsworks.model.RegisterVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterVolumeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterVolumeRequest register-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerVolumeAsync register-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterVolumeRequest register-volume-request]
    (-> this (.registerVolumeAsync register-volume-request))))

(defn register-instance-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterInstanceRequest register-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerInstanceAsync register-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterInstanceRequest register-instance-request]
    (-> this (.registerInstanceAsync register-instance-request))))

(defn detach-elastic-load-balancer-async
  "Detaches a specified Elastic Load Balancing instance from its layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  detach-elastic-load-balancer-request - `com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachElasticLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest detach-elastic-load-balancer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachElasticLoadBalancerAsync detach-elastic-load-balancer-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DetachElasticLoadBalancerRequest detach-elastic-load-balancer-request]
    (-> this (.detachElasticLoadBalancerAsync detach-elastic-load-balancer-request))))

(defn update-elastic-ip-async
  "Updates a registered Elastic IP address's name. For more information, see Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-elastic-ip-request - `com.amazonaws.services.opsworks.model.UpdateElasticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateElasticIpResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateElasticIpRequest update-elastic-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateElasticIpAsync update-elastic-ip-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateElasticIpRequest update-elastic-ip-request]
    (-> this (.updateElasticIpAsync update-elastic-ip-request))))

(defn delete-instance-async
  "Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance
   before you can delete it.


   For more information, see Deleting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  delete-instance-request - `com.amazonaws.services.opsworks.model.DeleteInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteInstanceRequest delete-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceAsync delete-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteInstanceRequest delete-instance-request]
    (-> this (.deleteInstanceAsync delete-instance-request))))

(defn update-volume-async
  "Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-volume-request - `com.amazonaws.services.opsworks.model.UpdateVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateVolumeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateVolumeRequest update-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVolumeAsync update-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateVolumeRequest update-volume-request]
    (-> this (.updateVolumeAsync update-volume-request))))

(defn deregister-instance-async
  "Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and
   returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  deregister-instance-request - `com.amazonaws.services.opsworks.model.DeregisterInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterInstanceRequest deregister-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterInstanceAsync deregister-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterInstanceRequest deregister-instance-request]
    (-> this (.deregisterInstanceAsync deregister-instance-request))))

(defn deregister-rds-db-instance-async
  "Deregisters an Amazon RDS instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  deregister-rds-db-instance-request - `com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterRdsDbInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest deregister-rds-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterRdsDbInstanceAsync deregister-rds-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterRdsDbInstanceRequest deregister-rds-db-instance-request]
    (-> this (.deregisterRdsDbInstanceAsync deregister-rds-db-instance-request))))

(defn describe-elastic-load-balancers-async
  "Describes a stack's Elastic Load Balancing instances.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-elastic-load-balancers-request - `com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticLoadBalancers operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest describe-elastic-load-balancers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticLoadBalancersAsync describe-elastic-load-balancers-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeElasticLoadBalancersRequest describe-elastic-load-balancers-request]
    (-> this (.describeElasticLoadBalancersAsync describe-elastic-load-balancers-request))))

(defn describe-my-user-profile-async
  "Describes a user's SSH information.


   Required Permissions: To use this action, an IAM user must have self-management enabled or an attached
   policy that explicitly grants permissions. For more information about user permissions, see Managing User
   Permissions.

  describe-my-user-profile-request - `com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMyUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeMyUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest describe-my-user-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMyUserProfileAsync describe-my-user-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeMyUserProfileRequest describe-my-user-profile-request]
    (-> this (.describeMyUserProfileAsync describe-my-user-profile-request))))

(defn attach-elastic-load-balancer-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachElasticLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest attach-elastic-load-balancer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachElasticLoadBalancerAsync attach-elastic-load-balancer-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.AttachElasticLoadBalancerRequest attach-elastic-load-balancer-request]
    (-> this (.attachElasticLoadBalancerAsync attach-elastic-load-balancer-request))))

(defn update-layer-async
  "Updates a specified layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-layer-request - `com.amazonaws.services.opsworks.model.UpdateLayerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLayer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateLayerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateLayerRequest update-layer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLayerAsync update-layer-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateLayerRequest update-layer-request]
    (-> this (.updateLayerAsync update-layer-request))))

(defn describe-load-based-auto-scaling-async
  "Describes load-based auto scaling configurations for specified layers.



   You must specify at least one of the parameters.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-load-based-auto-scaling-request - `com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBasedAutoScaling operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest describe-load-based-auto-scaling-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBasedAutoScalingAsync describe-load-based-auto-scaling-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeLoadBasedAutoScalingRequest describe-load-based-auto-scaling-request]
    (-> this (.describeLoadBasedAutoScalingAsync describe-load-based-auto-scaling-request))))

(defn register-rds-db-instance-async
  "Registers an Amazon RDS instance with a stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  register-rds-db-instance-request - `com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterRdsDbInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest register-rds-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerRdsDbInstanceAsync register-rds-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterRdsDbInstanceRequest register-rds-db-instance-request]
    (-> this (.registerRdsDbInstanceAsync register-rds-db-instance-request))))

(defn describe-raid-arrays-async
  "Describe an instance's RAID arrays.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-raid-arrays-request - `com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRaidArrays operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeRaidArraysResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest describe-raid-arrays-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRaidArraysAsync describe-raid-arrays-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeRaidArraysRequest describe-raid-arrays-request]
    (-> this (.describeRaidArraysAsync describe-raid-arrays-request))))

(defn describe-agent-versions-async
  "Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration
   manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or
   configuration manager.

  describe-agent-versions-request - `com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAgentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeAgentVersionsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest describe-agent-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAgentVersionsAsync describe-agent-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeAgentVersionsRequest describe-agent-versions-request]
    (-> this (.describeAgentVersionsAsync describe-agent-versions-request))))

(defn describe-stack-summary-async
  "Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as
   running_setup or online.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-stack-summary-request - `com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackSummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeStackSummaryResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest describe-stack-summary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackSummaryAsync describe-stack-summary-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStackSummaryRequest describe-stack-summary-request]
    (-> this (.describeStackSummaryAsync describe-stack-summary-request))))

(defn describe-service-errors-async
  "Describes AWS OpsWorks Stacks service errors.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.


   This call accepts only one resource-identifying parameter.

  describe-service-errors-request - `com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceErrors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeServiceErrorsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest describe-service-errors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceErrorsAsync describe-service-errors-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeServiceErrorsRequest describe-service-errors-request]
    (-> this (.describeServiceErrorsAsync describe-service-errors-request))))

(defn start-instance-async
  "Starts a specified instance. For more information, see Starting, Stopping,
   and Rebooting Instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  start-instance-request - `com.amazonaws.services.opsworks.model.StartInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.StartInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StartInstanceRequest start-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startInstanceAsync start-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StartInstanceRequest start-instance-request]
    (-> this (.startInstanceAsync start-instance-request))))

(defn describe-apps-async
  "Requests a description of a specified set of apps.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-apps-request - `com.amazonaws.services.opsworks.model.DescribeAppsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeAppsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeAppsRequest describe-apps-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAppsAsync describe-apps-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeAppsRequest describe-apps-request]
    (-> this (.describeAppsAsync describe-apps-request))))

(defn update-stack-async
  "Updates a specified stack.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-stack-request - `com.amazonaws.services.opsworks.model.UpdateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateStackResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateStackRequest update-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackAsync update-stack-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateStackRequest update-stack-request]
    (-> this (.updateStackAsync update-stack-request))))

(defn create-stack-async
  "Creates a new stack. For more information, see Create a New Stack.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  create-stack-request - `com.amazonaws.services.opsworks.model.CreateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateStackResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateStackRequest create-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackAsync create-stack-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateStackRequest create-stack-request]
    (-> this (.createStackAsync create-stack-request))))

(defn delete-user-profile-async
  "Deletes a user profile.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  delete-user-profile-request - `com.amazonaws.services.opsworks.model.DeleteUserProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteUserProfileRequest delete-user-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserProfileAsync delete-user-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteUserProfileRequest delete-user-profile-request]
    (-> this (.deleteUserProfileAsync delete-user-profile-request))))

(defn update-instance-async
  "Updates a specified instance.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  update-instance-request - `com.amazonaws.services.opsworks.model.UpdateInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateInstanceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateInstanceRequest update-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInstanceAsync update-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateInstanceRequest update-instance-request]
    (-> this (.updateInstanceAsync update-instance-request))))

(defn set-load-based-auto-scaling-async
  "Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with
   Time-based and Load-based Instances.



   To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto
   scaling operates only on the instances from that set, so you must ensure that you have created enough instances
   to handle the maximum anticipated load.



   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  set-load-based-auto-scaling-request - `com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoadBasedAutoScaling operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest set-load-based-auto-scaling-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoadBasedAutoScalingAsync set-load-based-auto-scaling-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.SetLoadBasedAutoScalingRequest set-load-based-auto-scaling-request]
    (-> this (.setLoadBasedAutoScalingAsync set-load-based-auto-scaling-request))))

(defn describe-stack-provisioning-parameters-async
  "Requests a description of a stack's provisioning parameters.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-stack-provisioning-parameters-request - `com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStackProvisioningParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest describe-stack-provisioning-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStackProvisioningParametersAsync describe-stack-provisioning-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeStackProvisioningParametersRequest describe-stack-provisioning-parameters-request]
    (-> this (.describeStackProvisioningParametersAsync describe-stack-provisioning-parameters-request))))

(defn start-stack-async
  "Starts a stack's instances.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  start-stack-request - `com.amazonaws.services.opsworks.model.StartStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.StartStackResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StartStackRequest start-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startStackAsync start-stack-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.StartStackRequest start-stack-request]
    (-> this (.startStackAsync start-stack-request))))

(defn update-user-profile-async
  "Updates a specified user profile.


   Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants
   permissions. For more information about user permissions, see Managing User
   Permissions.

  update-user-profile-request - `com.amazonaws.services.opsworks.model.UpdateUserProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateUserProfileRequest update-user-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserProfileAsync update-user-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateUserProfileRequest update-user-profile-request]
    (-> this (.updateUserProfileAsync update-user-profile-request))))

(defn deregister-volume-async
  "Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see
   Resource Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  deregister-volume-request - `com.amazonaws.services.opsworks.model.DeregisterVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeregisterVolumeResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterVolumeRequest deregister-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterVolumeAsync deregister-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeregisterVolumeRequest deregister-volume-request]
    (-> this (.deregisterVolumeAsync deregister-volume-request))))

(defn create-deployment-async
  "Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.


   Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for
   the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
   see Managing User
   Permissions.

  create-deployment-request - `com.amazonaws.services.opsworks.model.CreateDeploymentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeployment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateDeploymentResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateDeploymentRequest create-deployment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeploymentAsync create-deployment-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateDeploymentRequest create-deployment-request]
    (-> this (.createDeploymentAsync create-deployment-request))))

(defn register-elastic-ip-async
  "Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a
   time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp.
   For more information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  register-elastic-ip-request - `com.amazonaws.services.opsworks.model.RegisterElasticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.RegisterElasticIpResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterElasticIpRequest register-elastic-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerElasticIpAsync register-elastic-ip-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.RegisterElasticIpRequest register-elastic-ip-request]
    (-> this (.registerElasticIpAsync register-elastic-ip-request))))

(defn update-my-user-profile-async
  "Updates a user's SSH public key.


   Required Permissions: To use this action, an IAM user must have self-management enabled or an attached
   policy that explicitly grants permissions. For more information about user permissions, see Managing User
   Permissions.

  update-my-user-profile-request - `com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMyUserProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.UpdateMyUserProfileResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest update-my-user-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMyUserProfileAsync update-my-user-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.UpdateMyUserProfileRequest update-my-user-profile-request]
    (-> this (.updateMyUserProfileAsync update-my-user-profile-request))))

(defn create-app-async
  "Creates an app for a specified stack. For more information, see Creating Apps.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  create-app-request - `com.amazonaws.services.opsworks.model.CreateAppRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.CreateAppResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateAppRequest create-app-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAppAsync create-app-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.CreateAppRequest create-app-request]
    (-> this (.createAppAsync create-app-request))))

(defn tag-resource-async
  "Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how
   tagging works, see Tags in the
   AWS OpsWorks User Guide.

  tag-resource-request - `com.amazonaws.services.opsworks.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn describe-rds-db-instances-async
  "Describes Amazon RDS instances.


   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.


   This call accepts only one resource-identifying parameter.

  describe-rds-db-instances-request - `com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRdsDbInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest describe-rds-db-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRdsDbInstancesAsync describe-rds-db-instances-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeRdsDbInstancesRequest describe-rds-db-instances-request]
    (-> this (.describeRdsDbInstancesAsync describe-rds-db-instances-request))))

(defn describe-deployments-async
  "Requests a description of a specified set of deployments.



   This call accepts only one resource-identifying parameter.



   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
   level for the stack, or an attached policy that explicitly grants permissions. For more information about user
   permissions, see Managing User
   Permissions.

  describe-deployments-request - `com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDeployments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DescribeDeploymentsResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest describe-deployments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeploymentsAsync describe-deployments-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest describe-deployments-request]
    (-> this (.describeDeploymentsAsync describe-deployments-request))))

(defn disassociate-elastic-ip-async
  "Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more
   information, see Resource
   Management.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  disassociate-elastic-ip-request - `com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateElasticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DisassociateElasticIpResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest disassociate-elastic-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateElasticIpAsync disassociate-elastic-ip-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DisassociateElasticIpRequest disassociate-elastic-ip-request]
    (-> this (.disassociateElasticIpAsync disassociate-elastic-ip-request))))

(defn delete-layer-async
  "Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered
   instances. For more information, see How to Delete a
   Layer.


   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack,
   or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User
   Permissions.

  delete-layer-request - `com.amazonaws.services.opsworks.model.DeleteLayerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLayer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.opsworks.model.DeleteLayerResult>`"
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteLayerRequest delete-layer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLayerAsync delete-layer-request async-handler)))
  (^java.util.concurrent.Future [^AWSOpsWorksAsync this ^com.amazonaws.services.opsworks.model.DeleteLayerRequest delete-layer-request]
    (-> this (.deleteLayerAsync delete-layer-request))))

