(ns com.amazonaws.services.autoscaling.AmazonAutoScaling
  "Interface for accessing Auto Scaling.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonAutoScaling instead.


  Amazon EC2 Auto Scaling

  Amazon EC2 Auto Scaling is designed to automatically launch or terminate EC2 instances based on user-defined
  policies, schedules, and health checks. Use this service with AWS Auto Scaling, Amazon CloudWatch, and Elastic Load
  Balancing.


  For more information, including information about granting IAM users required permissions for Amazon EC2 Auto Scaling
  actions, see the Amazon EC2 Auto
  Scaling User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscaling AmazonAutoScaling]))

(defn update-auto-scaling-group
  "Updates the configuration for the specified Auto Scaling group.


   To update an Auto Scaling group, specify the name of the group and the parameter that you want to change. Any
   parameters that you don't specify are not changed by this update request. The new settings take effect on any
   scaling activities after this call returns. Scaling activities that are currently in progress aren't affected.


   If you associate a new launch configuration or template with an Auto Scaling group, all new instances will get
   the updated configuration, but existing instances continue to run with the configuration that they were
   originally launched with. When you update a group to specify a mixed instances policy instead of a launch
   configuration or template, existing instances may be replaced to match the new purchasing options that you
   specified in the policy. For example, if the group currently has 100% On-Demand capacity and the policy specifies
   50% Spot capacity, this means that half of your instances will be gradually terminated and relaunched as Spot
   Instances. When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old
   ones, so that updating your group does not compromise the performance or availability of your application.


   Note the following about changing DesiredCapacity, MaxSize, or MinSize:




   If a scale-in event occurs as a result of a new DesiredCapacity value that is lower than the current
   size of the group, the Auto Scaling group uses its termination policy to determine which instances to terminate.




   If you specify a new value for MinSize without specifying a value for DesiredCapacity,
   and the new MinSize is larger than the current size of the group, this sets the group's
   DesiredCapacity to the new MinSize value.




   If you specify a new value for MaxSize without specifying a value for DesiredCapacity,
   and the new MaxSize is smaller than the current size of the group, this sets the group's
   DesiredCapacity to the new MaxSize value.




   To see which parameters have been set, use DescribeAutoScalingGroups. You can also view the scaling
   policies for an Auto Scaling group using DescribePolicies. If the group has scaling policies, you can
   update them using PutScalingPolicy.

  update-auto-scaling-group-request - `com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest`

  returns: Result of the UpdateAutoScalingGroup operation returned by the service. - `com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult`

  throws: com.amazonaws.services.autoscaling.model.ScalingActivityInProgressException - The operation can't be performed because there are scaling activities in progress."
  (^com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest update-auto-scaling-group-request]
    (-> this (.updateAutoScalingGroup update-auto-scaling-group-request))))

(defn delete-tags
  "Deletes the specified tags.

  delete-tags-request - `com.amazonaws.services.autoscaling.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteTagsResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DeleteTagsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTags delete-tags-request))))

(defn describe-policies
  "Describes the policies for the specified Auto Scaling group.

  describe-policies-request - `com.amazonaws.services.autoscaling.model.DescribePoliciesRequest`

  returns: Result of the DescribePolicies operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribePoliciesResult`

  throws: com.amazonaws.services.autoscaling.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.autoscaling.model.DescribePoliciesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribePoliciesRequest describe-policies-request]
    (-> this (.describePolicies describe-policies-request)))
  (^com.amazonaws.services.autoscaling.model.DescribePoliciesResult [^AmazonAutoScaling this]
    (-> this (.describePolicies))))

(defn enable-metrics-collection
  "Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto
   Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.

  enable-metrics-collection-request - `com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest`

  returns: Result of the EnableMetricsCollection operation returned by the service. - `com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest enable-metrics-collection-request]
    (-> this (.enableMetricsCollection enable-metrics-collection-request))))

(defn set-instance-protection
  "Updates the instance protection settings of the specified instances.


   For more information about preventing instances that are part of an Auto Scaling group from terminating on scale
   in, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.

  set-instance-protection-request - `com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest`

  returns: Result of the SetInstanceProtection operation returned by the service. - `com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult`

  throws: com.amazonaws.services.autoscaling.model.LimitExceededException - You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling groups, launch configurations, or lifecycle hooks). For more information, see DescribeAccountLimits."
  (^com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest set-instance-protection-request]
    (-> this (.setInstanceProtection set-instance-protection-request))))

(defn describe-scaling-activities
  "Describes one or more scaling activities for the specified Auto Scaling group.

  describe-scaling-activities-request - `com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest`

  returns: Result of the DescribeScalingActivities operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult`

  throws: com.amazonaws.services.autoscaling.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest describe-scaling-activities-request]
    (-> this (.describeScalingActivities describe-scaling-activities-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult [^AmazonAutoScaling this]
    (-> this (.describeScalingActivities))))

(defn attach-load-balancer-target-groups
  "Attaches one or more target groups to the specified Auto Scaling group.


   To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach
   the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups.


   With Application Load Balancers and Network Load Balancers, instances are registered as targets with a target
   group. With Classic Load Balancers, instances are registered with the load balancer. For more information, see Attaching a Load
   Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  attach-load-balancer-target-groups-request - `com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest`

  returns: Result of the AttachLoadBalancerTargetGroups operation returned by the service. - `com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest attach-load-balancer-target-groups-request]
    (-> this (.attachLoadBalancerTargetGroups attach-load-balancer-target-groups-request))))

(defn describe-tags
  "Describes the specified tags.


   You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling
   group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it
   to be included in the results.


   You can also specify multiple filters. The result includes information for a particular tag only if it matches
   all the filters. If there's no match, no special message is returned.

  describe-tags-request - `com.amazonaws.services.autoscaling.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeTagsResult`

  throws: com.amazonaws.services.autoscaling.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.autoscaling.model.DescribeTagsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTags describe-tags-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeTagsResult [^AmazonAutoScaling this]
    (-> this (.describeTags))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonAutoScaling this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn exit-standby
  "Moves the specified instances out of the standby state.


   For more information, see Temporarily Removing
   Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  exit-standby-request - `com.amazonaws.services.autoscaling.model.ExitStandbyRequest`

  returns: Result of the ExitStandby operation returned by the service. - `com.amazonaws.services.autoscaling.model.ExitStandbyResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.ExitStandbyResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.ExitStandbyRequest exit-standby-request]
    (-> this (.exitStandby exit-standby-request))))

(defn delete-launch-configuration
  "Deletes the specified launch configuration.


   The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch
   configuration is no longer available for use.

  delete-launch-configuration-request - `com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest`

  returns: Result of the DeleteLaunchConfiguration operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceInUseException - The operation can't be performed because the resource is in use."
  (^com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest delete-launch-configuration-request]
    (-> this (.deleteLaunchConfiguration delete-launch-configuration-request))))

(defn waiters
  "returns: `com.amazonaws.services.autoscaling.waiters.AmazonAutoScalingWaiters`"
  (^com.amazonaws.services.autoscaling.waiters.AmazonAutoScalingWaiters [^AmazonAutoScaling this]
    (-> this (.waiters))))

(defn put-lifecycle-hook
  "Creates or updates a lifecycle hook for the specified Auto Scaling group.


   A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches
   (before it is put into service) or as the instance terminates (before it is fully terminated).


   This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:




   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
   Amazon EC2 Auto Scaling launches or terminates instances.




   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
   Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.




   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.




   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using using
   RecordLifecycleActionHeartbeat.




   If you finish before the timeout period ends, complete the lifecycle action using CompleteLifecycleAction.




   For more information, see Amazon EC2 Auto Scaling
   Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide.


   If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call
   fails.


   You can view the lifecycle hooks for an Auto Scaling group using DescribeLifecycleHooks. If you are no
   longer using a lifecycle hook, you can delete it using DeleteLifecycleHook.

  put-lifecycle-hook-request - `com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest`

  returns: Result of the PutLifecycleHook operation returned by the service. - `com.amazonaws.services.autoscaling.model.PutLifecycleHookResult`

  throws: com.amazonaws.services.autoscaling.model.LimitExceededException - You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling groups, launch configurations, or lifecycle hooks). For more information, see DescribeAccountLimits."
  (^com.amazonaws.services.autoscaling.model.PutLifecycleHookResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest put-lifecycle-hook-request]
    (-> this (.putLifecycleHook put-lifecycle-hook-request))))

(defn describe-load-balancers
  "Describes the load balancers for the specified Auto Scaling group.


   This operation describes only Classic Load Balancers. If you have Application Load Balancers or Network Load
   Balancers, use DescribeLoadBalancerTargetGroups instead.

  describe-load-balancers-request - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest`

  returns: Result of the DescribeLoadBalancers operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest describe-load-balancers-request]
    (-> this (.describeLoadBalancers describe-load-balancers-request))))

(defn suspend-processes
  "Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group.


   If you suspend either the Launch or Terminate process types, it can prevent other
   process types from functioning properly.


   To resume processes that have been suspended, use ResumeProcesses.


   For more information, see Suspending and
   Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.

  suspend-processes-request - `com.amazonaws.services.autoscaling.model.SuspendProcessesRequest`

  returns: Result of the SuspendProcesses operation returned by the service. - `com.amazonaws.services.autoscaling.model.SuspendProcessesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceInUseException - The operation can't be performed because the resource is in use."
  (^com.amazonaws.services.autoscaling.model.SuspendProcessesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.SuspendProcessesRequest suspend-processes-request]
    (-> this (.suspendProcesses suspend-processes-request))))

(defn create-launch-configuration
  "Creates a launch configuration.


   If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this
   limit, see DescribeAccountLimits. For information about updating this limit, see Amazon EC2 Auto Scaling
   Limits in the Amazon EC2 Auto Scaling User Guide.


   For more information, see Launch Configurations
   in the Amazon EC2 Auto Scaling User Guide.

  create-launch-configuration-request - `com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest`

  returns: Result of the CreateLaunchConfiguration operation returned by the service. - `com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult`

  throws: com.amazonaws.services.autoscaling.model.AlreadyExistsException - You already have an Auto Scaling group or launch configuration with this name."
  (^com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest create-launch-configuration-request]
    (-> this (.createLaunchConfiguration create-launch-configuration-request))))

(defn detach-load-balancer-target-groups
  "Detaches one or more target groups from the specified Auto Scaling group.

  detach-load-balancer-target-groups-request - `com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest`

  returns: Result of the DetachLoadBalancerTargetGroups operation returned by the service. - `com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest detach-load-balancer-target-groups-request]
    (-> this (.detachLoadBalancerTargetGroups detach-load-balancer-target-groups-request))))

(defn delete-scheduled-action
  "Deletes the specified scheduled action.

  delete-scheduled-action-request - `com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest`

  returns: Result of the DeleteScheduledAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest delete-scheduled-action-request]
    (-> this (.deleteScheduledAction delete-scheduled-action-request))))

(defn complete-lifecycle-action
  "Completes the lifecycle action for the specified token or instance with the specified result.


   This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:




   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
   Amazon EC2 Auto Scaling launches or terminates instances.




   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
   Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.




   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.




   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.




   If you finish before the timeout period ends, complete the lifecycle action.




   For more information, see Amazon EC2 Auto Scaling
   Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide.

  complete-lifecycle-action-request - `com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest`

  returns: Result of the CompleteLifecycleAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest complete-lifecycle-action-request]
    (-> this (.completeLifecycleAction complete-lifecycle-action-request))))

(defn describe-notification-configurations
  "Describes the notification actions associated with the specified Auto Scaling group.

  describe-notification-configurations-request - `com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest`

  returns: Result of the DescribeNotificationConfigurations operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult`

  throws: com.amazonaws.services.autoscaling.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest describe-notification-configurations-request]
    (-> this (.describeNotificationConfigurations describe-notification-configurations-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult [^AmazonAutoScaling this]
    (-> this (.describeNotificationConfigurations))))

(defn resume-processes
  "Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto
   Scaling group.


   For more information, see Suspending and
   Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.

  resume-processes-request - `com.amazonaws.services.autoscaling.model.ResumeProcessesRequest`

  returns: Result of the ResumeProcesses operation returned by the service. - `com.amazonaws.services.autoscaling.model.ResumeProcessesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceInUseException - The operation can't be performed because the resource is in use."
  (^com.amazonaws.services.autoscaling.model.ResumeProcessesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.ResumeProcessesRequest resume-processes-request]
    (-> this (.resumeProcesses resume-processes-request))))

(defn describe-lifecycle-hooks
  "Describes the lifecycle hooks for the specified Auto Scaling group.

  describe-lifecycle-hooks-request - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest`

  returns: Result of the DescribeLifecycleHooks operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest describe-lifecycle-hooks-request]
    (-> this (.describeLifecycleHooks describe-lifecycle-hooks-request))))

(defn describe-scheduled-actions
  "Describes the actions scheduled for your Auto Scaling group that haven't run or that have not reached their end
   time. To describe the actions that have already run, use DescribeScalingActivities.

  describe-scheduled-actions-request - `com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest`

  returns: Result of the DescribeScheduledActions operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult`

  throws: com.amazonaws.services.autoscaling.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest describe-scheduled-actions-request]
    (-> this (.describeScheduledActions describe-scheduled-actions-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult [^AmazonAutoScaling this]
    (-> this (.describeScheduledActions))))

(defn describe-termination-policy-types
  "Describes the termination policies supported by Amazon EC2 Auto Scaling.


   For more information, see Controlling Which Auto
   Scaling Instances Terminate During Scale In in the Amazon EC2 Auto Scaling User Guide.

  describe-termination-policy-types-request - `com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest`

  returns: Result of the DescribeTerminationPolicyTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest describe-termination-policy-types-request]
    (-> this (.describeTerminationPolicyTypes describe-termination-policy-types-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult [^AmazonAutoScaling this]
    (-> this (.describeTerminationPolicyTypes))))

(defn set-desired-capacity
  "Sets the size of the specified Auto Scaling group.


   For more information about desired capacity, see What Is Amazon
   EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.

  set-desired-capacity-request - `com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest`

  returns: Result of the SetDesiredCapacity operation returned by the service. - `com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult`

  throws: com.amazonaws.services.autoscaling.model.ScalingActivityInProgressException - The operation can't be performed because there are scaling activities in progress."
  (^com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest set-desired-capacity-request]
    (-> this (.setDesiredCapacity set-desired-capacity-request))))

(defn execute-policy
  "Executes the specified policy.

  execute-policy-request - `com.amazonaws.services.autoscaling.model.ExecutePolicyRequest`

  returns: Result of the ExecutePolicy operation returned by the service. - `com.amazonaws.services.autoscaling.model.ExecutePolicyResult`

  throws: com.amazonaws.services.autoscaling.model.ScalingActivityInProgressException - The operation can't be performed because there are scaling activities in progress."
  (^com.amazonaws.services.autoscaling.model.ExecutePolicyResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.ExecutePolicyRequest execute-policy-request]
    (-> this (.executePolicy execute-policy-request))))

(defn delete-auto-scaling-group
  "Deletes the specified Auto Scaling group.


   If the group has instances or scaling activities in progress, you must specify the option to force the deletion
   in order for it to succeed.


   If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm
   that no longer has an associated action.


   To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of
   instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not
   launch replacement instances.


   To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the
   minimum size and desired capacity of the Auto Scaling group to zero.

  delete-auto-scaling-group-request - `com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest`

  returns: Result of the DeleteAutoScalingGroup operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult`

  throws: com.amazonaws.services.autoscaling.model.ScalingActivityInProgressException - The operation can't be performed because there are scaling activities in progress."
  (^com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest delete-auto-scaling-group-request]
    (-> this (.deleteAutoScalingGroup delete-auto-scaling-group-request))))

(defn enter-standby
  "Moves the specified instances into the standby state.


   For more information, see Temporarily Removing
   Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  enter-standby-request - `com.amazonaws.services.autoscaling.model.EnterStandbyRequest`

  returns: Result of the EnterStandby operation returned by the service. - `com.amazonaws.services.autoscaling.model.EnterStandbyResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.EnterStandbyResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.EnterStandbyRequest enter-standby-request]
    (-> this (.enterStandby enter-standby-request))))

(defn delete-policy
  "Deletes the specified scaling policy.


   Deleting either a step scaling policy or a simple scaling policy deletes the underlying alarm action, but does
   not delete the alarm, even if it no longer has an associated action.


   For more information, see Deleting a Scaling
   Policy in the Amazon EC2 Auto Scaling User Guide.

  delete-policy-request - `com.amazonaws.services.autoscaling.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeletePolicyResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DeletePolicyResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeletePolicyRequest delete-policy-request]
    (-> this (.deletePolicy delete-policy-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonAutoScaling this]
    (-> this (.shutdown))))

(defn describe-lifecycle-hook-types
  "Describes the available types of lifecycle hooks.


   The following hook types are supported:




   autoscaling:EC2_INSTANCE_LAUNCHING




   autoscaling:EC2_INSTANCE_TERMINATING

  describe-lifecycle-hook-types-request - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest`

  returns: Result of the DescribeLifecycleHookTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest describe-lifecycle-hook-types-request]
    (-> this (.describeLifecycleHookTypes describe-lifecycle-hook-types-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult [^AmazonAutoScaling this]
    (-> this (.describeLifecycleHookTypes))))

(defn terminate-instance-in-auto-scaling-group
  "Terminates the specified instance and optionally adjusts the desired group size.


   This call simply makes a termination request. The instance is not terminated immediately.

  terminate-instance-in-auto-scaling-group-request - `com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest`

  returns: Result of the TerminateInstanceInAutoScalingGroup operation returned by the service. - `com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult`

  throws: com.amazonaws.services.autoscaling.model.ScalingActivityInProgressException - The operation can't be performed because there are scaling activities in progress."
  (^com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest terminate-instance-in-auto-scaling-group-request]
    (-> this (.terminateInstanceInAutoScalingGroup terminate-instance-in-auto-scaling-group-request))))

(defn detach-instances
  "Removes one or more instances from the specified Auto Scaling group.


   After the instances are detached, you can manage them independent of the Auto Scaling group.


   If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to
   replace the ones that are detached.


   If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the
   load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from
   the target groups.


   For more information, see Detach EC2 Instances from
   Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  detach-instances-request - `com.amazonaws.services.autoscaling.model.DetachInstancesRequest`

  returns: Result of the DetachInstances operation returned by the service. - `com.amazonaws.services.autoscaling.model.DetachInstancesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DetachInstancesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DetachInstancesRequest detach-instances-request]
    (-> this (.detachInstances detach-instances-request))))

(defn describe-metric-collection-types
  "Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling.


   The GroupStandbyInstances metric is not returned by default. You must explicitly request this metric
   when calling EnableMetricsCollection.

  describe-metric-collection-types-request - `com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest`

  returns: Result of the DescribeMetricCollectionTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest describe-metric-collection-types-request]
    (-> this (.describeMetricCollectionTypes describe-metric-collection-types-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult [^AmazonAutoScaling this]
    (-> this (.describeMetricCollectionTypes))))

(defn describe-account-limits
  "Describes the current Amazon EC2 Auto Scaling resource limits for your AWS account.


   For information about requesting an increase in these limits, see Amazon EC2 Auto Scaling
   Limits in the Amazon EC2 Auto Scaling User Guide.

  describe-account-limits-request - `com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest`

  returns: Result of the DescribeAccountLimits operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest describe-account-limits-request]
    (-> this (.describeAccountLimits describe-account-limits-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult [^AmazonAutoScaling this]
    (-> this (.describeAccountLimits))))

(defn describe-adjustment-types
  "Describes the policy adjustment types for use with PutScalingPolicy.

  describe-adjustment-types-request - `com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest`

  returns: Result of the DescribeAdjustmentTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest describe-adjustment-types-request]
    (-> this (.describeAdjustmentTypes describe-adjustment-types-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult [^AmazonAutoScaling this]
    (-> this (.describeAdjustmentTypes))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"autoscaling.amazonaws.com\") or a full URL, including the protocol (ex: \"https://autoscaling.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonAutoScaling this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-auto-scaling-instances
  "Describes one or more Auto Scaling instances.

  describe-auto-scaling-instances-request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest`

  returns: Result of the DescribeAutoScalingInstances operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult`

  throws: com.amazonaws.services.autoscaling.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest describe-auto-scaling-instances-request]
    (-> this (.describeAutoScalingInstances describe-auto-scaling-instances-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult [^AmazonAutoScaling this]
    (-> this (.describeAutoScalingInstances))))

(defn create-or-update-tags
  "Creates or updates tags for the specified Auto Scaling group.


   When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and
   you do not get an error message.


   For more information, see Tagging Auto Scaling Groups
   and Instances in the Amazon EC2 Auto Scaling User Guide.

  create-or-update-tags-request - `com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest`

  returns: Result of the CreateOrUpdateTags operation returned by the service. - `com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult`

  throws: com.amazonaws.services.autoscaling.model.LimitExceededException - You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling groups, launch configurations, or lifecycle hooks). For more information, see DescribeAccountLimits."
  (^com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest create-or-update-tags-request]
    (-> this (.createOrUpdateTags create-or-update-tags-request))))

(defn attach-instances
  "Attaches one or more EC2 instances to the specified Auto Scaling group.


   When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of
   instances being attached. If the number of instances being attached plus the desired capacity of the group
   exceeds the maximum size of the group, the operation fails.


   If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with
   the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also
   registered with the target groups.


   For more information, see Attach EC2 Instances to
   Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  attach-instances-request - `com.amazonaws.services.autoscaling.model.AttachInstancesRequest`

  returns: Result of the AttachInstances operation returned by the service. - `com.amazonaws.services.autoscaling.model.AttachInstancesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.AttachInstancesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.AttachInstancesRequest attach-instances-request]
    (-> this (.attachInstances attach-instances-request))))

(defn put-scheduled-update-group-action
  "Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified
   when updating a scheduled scaling action, the corresponding value remains unchanged.


   For more information, see Scheduled Scaling in the
   Amazon EC2 Auto Scaling User Guide.

  put-scheduled-update-group-action-request - `com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest`

  returns: Result of the PutScheduledUpdateGroupAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult`

  throws: com.amazonaws.services.autoscaling.model.AlreadyExistsException - You already have an Auto Scaling group or launch configuration with this name."
  (^com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest put-scheduled-update-group-action-request]
    (-> this (.putScheduledUpdateGroupAction put-scheduled-update-group-action-request))))

(defn record-lifecycle-action-heartbeat
  "Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the
   timeout by the length of time defined using PutLifecycleHook.


   This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:




   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
   Amazon EC2 Auto Scaling launches or terminates instances.




   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
   Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.




   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.




   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.




   If you finish before the timeout period ends, complete the lifecycle action.




   For more information, see Auto Scaling
   Lifecycle in the Amazon EC2 Auto Scaling User Guide.

  record-lifecycle-action-heartbeat-request - `com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest`

  returns: Result of the RecordLifecycleActionHeartbeat operation returned by the service. - `com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest record-lifecycle-action-heartbeat-request]
    (-> this (.recordLifecycleActionHeartbeat record-lifecycle-action-heartbeat-request))))

(defn describe-auto-scaling-groups
  "Describes one or more Auto Scaling groups.

  describe-auto-scaling-groups-request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest`

  returns: Result of the DescribeAutoScalingGroups operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult`

  throws: com.amazonaws.services.autoscaling.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest describe-auto-scaling-groups-request]
    (-> this (.describeAutoScalingGroups describe-auto-scaling-groups-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult [^AmazonAutoScaling this]
    (-> this (.describeAutoScalingGroups))))

(defn disable-metrics-collection
  "Disables group metrics for the specified Auto Scaling group.

  disable-metrics-collection-request - `com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest`

  returns: Result of the DisableMetricsCollection operation returned by the service. - `com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest disable-metrics-collection-request]
    (-> this (.disableMetricsCollection disable-metrics-collection-request))))

(defn set-instance-health
  "Sets the health status of the specified instance.


   For more information, see Health
   Checks for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.

  set-instance-health-request - `com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest`

  returns: Result of the SetInstanceHealth operation returned by the service. - `com.amazonaws.services.autoscaling.model.SetInstanceHealthResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.SetInstanceHealthResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest set-instance-health-request]
    (-> this (.setInstanceHealth set-instance-health-request))))

(defn batch-put-scheduled-update-group-action
  "Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter
   unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.

  batch-put-scheduled-update-group-action-request - `com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest`

  returns: Result of the BatchPutScheduledUpdateGroupAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionResult`

  throws: com.amazonaws.services.autoscaling.model.AlreadyExistsException - You already have an Auto Scaling group or launch configuration with this name."
  (^com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest batch-put-scheduled-update-group-action-request]
    (-> this (.batchPutScheduledUpdateGroupAction batch-put-scheduled-update-group-action-request))))

(defn attach-load-balancers
  "Attaches one or more Classic Load Balancers to the specified Auto Scaling group.


   To attach an Application Load Balancer or a Network Load Balancer instead, see
   AttachLoadBalancerTargetGroups.


   To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load
   balancer from the Auto Scaling group, use DetachLoadBalancers.


   For more information, see Attaching a Load
   Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  attach-load-balancers-request - `com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest`

  returns: Result of the AttachLoadBalancers operation returned by the service. - `com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest attach-load-balancers-request]
    (-> this (.attachLoadBalancers attach-load-balancers-request)))
  (^com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult [^AmazonAutoScaling this]
    (-> this (.attachLoadBalancers))))

(defn delete-lifecycle-hook
  "Deletes the specified lifecycle hook.


   If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching
   instances, CONTINUE for terminating instances).

  delete-lifecycle-hook-request - `com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest`

  returns: Result of the DeleteLifecycleHook operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest delete-lifecycle-hook-request]
    (-> this (.deleteLifecycleHook delete-lifecycle-hook-request))))

(defn describe-load-balancer-target-groups
  "Describes the target groups for the specified Auto Scaling group.

  describe-load-balancer-target-groups-request - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest`

  returns: Result of the DescribeLoadBalancerTargetGroups operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest describe-load-balancer-target-groups-request]
    (-> this (.describeLoadBalancerTargetGroups describe-load-balancer-target-groups-request))))

(defn put-notification-configuration
  "Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the
   specified topic can have messages delivered to an endpoint such as a web server or an email address.


   This configuration overwrites any existing configuration.


   For more information, see Getting Amazon SNS
   Notifications When Your Auto Scaling Group Scales in the Amazon EC2 Auto Scaling User Guide.

  put-notification-configuration-request - `com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest`

  returns: Result of the PutNotificationConfiguration operation returned by the service. - `com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult`

  throws: com.amazonaws.services.autoscaling.model.LimitExceededException - You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling groups, launch configurations, or lifecycle hooks). For more information, see DescribeAccountLimits."
  (^com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest put-notification-configuration-request]
    (-> this (.putNotificationConfiguration put-notification-configuration-request))))

(defn describe-scaling-process-types
  "Describes the scaling process types for use with ResumeProcesses and SuspendProcesses.

  describe-scaling-process-types-request - `com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest`

  returns: Result of the DescribeScalingProcessTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest describe-scaling-process-types-request]
    (-> this (.describeScalingProcessTypes describe-scaling-process-types-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult [^AmazonAutoScaling this]
    (-> this (.describeScalingProcessTypes))))

(defn batch-delete-scheduled-action
  "Deletes one or more scheduled actions for the specified Auto Scaling group.

  batch-delete-scheduled-action-request - `com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest`

  returns: Result of the BatchDeleteScheduledAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest batch-delete-scheduled-action-request]
    (-> this (.batchDeleteScheduledAction batch-delete-scheduled-action-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonAutoScaling this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn detach-load-balancers
  "Detaches one or more Classic Load Balancers from the specified Auto Scaling group.


   This operation detaches only Classic Load Balancers. If you have Application Load Balancers or Network Load
   Balancers, use DetachLoadBalancerTargetGroups instead.


   When you detach a load balancer, it enters the Removing state while deregistering the instances in
   the group. When all instances are deregistered, then you can no longer describe the load balancer using
   DescribeLoadBalancers. The instances remain running.

  detach-load-balancers-request - `com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest`

  returns: Result of the DetachLoadBalancers operation returned by the service. - `com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest detach-load-balancers-request]
    (-> this (.detachLoadBalancers detach-load-balancers-request)))
  (^com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult [^AmazonAutoScaling this]
    (-> this (.detachLoadBalancers))))

(defn create-auto-scaling-group
  "Creates an Auto Scaling group with the specified name and attributes.


   If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this
   limit, see DescribeAccountLimits. For information about updating this limit, see Amazon EC2 Auto Scaling
   Limits in the Amazon EC2 Auto Scaling User Guide.

  create-auto-scaling-group-request - `com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest`

  returns: Result of the CreateAutoScalingGroup operation returned by the service. - `com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult`

  throws: com.amazonaws.services.autoscaling.model.AlreadyExistsException - You already have an Auto Scaling group or launch configuration with this name."
  (^com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest create-auto-scaling-group-request]
    (-> this (.createAutoScalingGroup create-auto-scaling-group-request))))

(defn delete-notification-configuration
  "Deletes the specified notification.

  delete-notification-configuration-request - `com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest`

  returns: Result of the DeleteNotificationConfiguration operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest delete-notification-configuration-request]
    (-> this (.deleteNotificationConfiguration delete-notification-configuration-request))))

(defn describe-launch-configurations
  "Describes one or more launch configurations.

  describe-launch-configurations-request - `com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest`

  returns: Result of the DescribeLaunchConfigurations operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult`

  throws: com.amazonaws.services.autoscaling.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest describe-launch-configurations-request]
    (-> this (.describeLaunchConfigurations describe-launch-configurations-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult [^AmazonAutoScaling this]
    (-> this (.describeLaunchConfigurations))))

(defn describe-auto-scaling-notification-types
  "Describes the notification types that are supported by Amazon EC2 Auto Scaling.

  describe-auto-scaling-notification-types-request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest`

  returns: Result of the DescribeAutoScalingNotificationTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult`

  throws: com.amazonaws.services.autoscaling.model.ResourceContentionException - You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling group, instance, or load balancer)."
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest describe-auto-scaling-notification-types-request]
    (-> this (.describeAutoScalingNotificationTypes describe-auto-scaling-notification-types-request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult [^AmazonAutoScaling this]
    (-> this (.describeAutoScalingNotificationTypes))))

(defn put-scaling-policy
  "Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name
   and set the parameters to change. Any existing parameter not changed in an update to an existing policy is not
   changed in this update request.

  put-scaling-policy-request - `com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest`

  returns: Result of the PutScalingPolicy operation returned by the service. - `com.amazonaws.services.autoscaling.model.PutScalingPolicyResult`

  throws: com.amazonaws.services.autoscaling.model.LimitExceededException - You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling groups, launch configurations, or lifecycle hooks). For more information, see DescribeAccountLimits."
  (^com.amazonaws.services.autoscaling.model.PutScalingPolicyResult [^AmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest put-scaling-policy-request]
    (-> this (.putScalingPolicy put-scaling-policy-request))))

