(ns com.amazonaws.services.autoscaling.AmazonAutoScalingAsync
  "Interface for accessing Auto Scaling asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonAutoScalingAsync instead.


  Amazon EC2 Auto Scaling

  Amazon EC2 Auto Scaling is designed to automatically launch or terminate EC2 instances based on user-defined
  policies, schedules, and health checks. Use this service with AWS Auto Scaling, Amazon CloudWatch, and Elastic Load
  Balancing.


  For more information, including information about granting IAM users required permissions for Amazon EC2 Auto Scaling
  actions, see the Amazon EC2 Auto
  Scaling User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscaling AmazonAutoScalingAsync]))

(defn describe-account-limits-async
  "Describes the current Amazon EC2 Auto Scaling resource limits for your AWS account.


   For information about requesting an increase in these limits, see Amazon EC2 Auto Scaling
   Limits in the Amazon EC2 Auto Scaling User Guide.

  describe-account-limits-request - `com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest describe-account-limits-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountLimitsAsync describe-account-limits-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest describe-account-limits-request]
    (-> this (.describeAccountLimitsAsync describe-account-limits-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeAccountLimitsAsync))))

(defn resume-processes-async
  "Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto
   Scaling group.


   For more information, see Suspending and
   Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.

  resume-processes-request - `com.amazonaws.services.autoscaling.model.ResumeProcessesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResumeProcesses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.ResumeProcessesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ResumeProcessesRequest resume-processes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resumeProcessesAsync resume-processes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ResumeProcessesRequest resume-processes-request]
    (-> this (.resumeProcessesAsync resume-processes-request))))

(defn detach-load-balancer-target-groups-async
  "Detaches one or more target groups from the specified Auto Scaling group.

  detach-load-balancer-target-groups-request - `com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachLoadBalancerTargetGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest detach-load-balancer-target-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachLoadBalancerTargetGroupsAsync detach-load-balancer-target-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest detach-load-balancer-target-groups-request]
    (-> this (.detachLoadBalancerTargetGroupsAsync detach-load-balancer-target-groups-request))))

(defn delete-policy-async
  "Deletes the specified scaling policy.


   Deleting either a step scaling policy or a simple scaling policy deletes the underlying alarm action, but does
   not delete the alarm, even if it no longer has an associated action.


   For more information, see Deleting a Scaling
   Policy in the Amazon EC2 Auto Scaling User Guide.

  delete-policy-request - `com.amazonaws.services.autoscaling.model.DeletePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeletePolicyRequest delete-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync delete-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeletePolicyRequest delete-policy-request]
    (-> this (.deletePolicyAsync delete-policy-request))))

(defn delete-notification-configuration-async
  "Deletes the specified notification.

  delete-notification-configuration-request - `com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotificationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest delete-notification-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotificationConfigurationAsync delete-notification-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest delete-notification-configuration-request]
    (-> this (.deleteNotificationConfigurationAsync delete-notification-configuration-request))))

(defn put-notification-configuration-async
  "Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the
   specified topic can have messages delivered to an endpoint such as a web server or an email address.


   This configuration overwrites any existing configuration.


   For more information, see Getting Amazon SNS
   Notifications When Your Auto Scaling Group Scales in the Amazon EC2 Auto Scaling User Guide.

  put-notification-configuration-request - `com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutNotificationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest put-notification-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putNotificationConfigurationAsync put-notification-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest put-notification-configuration-request]
    (-> this (.putNotificationConfigurationAsync put-notification-configuration-request))))

(defn describe-policies-async
  "Describes the policies for the specified Auto Scaling group.

  describe-policies-request - `com.amazonaws.services.autoscaling.model.DescribePoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribePoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribePoliciesRequest describe-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePoliciesAsync describe-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribePoliciesRequest describe-policies-request]
    (-> this (.describePoliciesAsync describe-policies-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describePoliciesAsync))))

(defn set-instance-health-async
  "Sets the health status of the specified instance.


   For more information, see Health
   Checks for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.

  set-instance-health-request - `com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetInstanceHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.SetInstanceHealthResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest set-instance-health-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setInstanceHealthAsync set-instance-health-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest set-instance-health-request]
    (-> this (.setInstanceHealthAsync set-instance-health-request))))

(defn describe-auto-scaling-groups-async
  "Describes one or more Auto Scaling groups.

  describe-auto-scaling-groups-request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutoScalingGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest describe-auto-scaling-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutoScalingGroupsAsync describe-auto-scaling-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest describe-auto-scaling-groups-request]
    (-> this (.describeAutoScalingGroupsAsync describe-auto-scaling-groups-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeAutoScalingGroupsAsync))))

(defn enter-standby-async
  "Moves the specified instances into the standby state.


   For more information, see Temporarily Removing
   Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  enter-standby-request - `com.amazonaws.services.autoscaling.model.EnterStandbyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnterStandby operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.EnterStandbyResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.EnterStandbyRequest enter-standby-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enterStandbyAsync enter-standby-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.EnterStandbyRequest enter-standby-request]
    (-> this (.enterStandbyAsync enter-standby-request))))

(defn batch-delete-scheduled-action-async
  "Deletes one or more scheduled actions for the specified Auto Scaling group.

  batch-delete-scheduled-action-request - `com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest batch-delete-scheduled-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteScheduledActionAsync batch-delete-scheduled-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest batch-delete-scheduled-action-request]
    (-> this (.batchDeleteScheduledActionAsync batch-delete-scheduled-action-request))))

(defn delete-tags-async
  "Deletes the specified tags.

  delete-tags-request - `com.amazonaws.services.autoscaling.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteTagsRequest delete-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync delete-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTagsAsync delete-tags-request))))

(defn set-instance-protection-async
  "Updates the instance protection settings of the specified instances.


   For more information about preventing instances that are part of an Auto Scaling group from terminating on scale
   in, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.

  set-instance-protection-request - `com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetInstanceProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest set-instance-protection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setInstanceProtectionAsync set-instance-protection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest set-instance-protection-request]
    (-> this (.setInstanceProtectionAsync set-instance-protection-request))))

(defn describe-load-balancers-async
  "Describes the load balancers for the specified Auto Scaling group.


   This operation describes only Classic Load Balancers. If you have Application Load Balancers or Network Load
   Balancers, use DescribeLoadBalancerTargetGroups instead.

  describe-load-balancers-request - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest describe-load-balancers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancersAsync describe-load-balancers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest describe-load-balancers-request]
    (-> this (.describeLoadBalancersAsync describe-load-balancers-request))))

(defn describe-lifecycle-hooks-async
  "Describes the lifecycle hooks for the specified Auto Scaling group.

  describe-lifecycle-hooks-request - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLifecycleHooks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest describe-lifecycle-hooks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLifecycleHooksAsync describe-lifecycle-hooks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest describe-lifecycle-hooks-request]
    (-> this (.describeLifecycleHooksAsync describe-lifecycle-hooks-request))))

(defn put-scheduled-update-group-action-async
  "Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified
   when updating a scheduled scaling action, the corresponding value remains unchanged.


   For more information, see Scheduled Scaling in the
   Amazon EC2 Auto Scaling User Guide.

  put-scheduled-update-group-action-request - `com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScheduledUpdateGroupAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest put-scheduled-update-group-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScheduledUpdateGroupActionAsync put-scheduled-update-group-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest put-scheduled-update-group-action-request]
    (-> this (.putScheduledUpdateGroupActionAsync put-scheduled-update-group-action-request))))

(defn suspend-processes-async
  "Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group.


   If you suspend either the Launch or Terminate process types, it can prevent other
   process types from functioning properly.


   To resume processes that have been suspended, use ResumeProcesses.


   For more information, see Suspending and
   Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.

  suspend-processes-request - `com.amazonaws.services.autoscaling.model.SuspendProcessesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SuspendProcesses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.SuspendProcessesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SuspendProcessesRequest suspend-processes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.suspendProcessesAsync suspend-processes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SuspendProcessesRequest suspend-processes-request]
    (-> this (.suspendProcessesAsync suspend-processes-request))))

(defn set-desired-capacity-async
  "Sets the size of the specified Auto Scaling group.


   For more information about desired capacity, see What Is Amazon
   EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.

  set-desired-capacity-request - `com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetDesiredCapacity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest set-desired-capacity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setDesiredCapacityAsync set-desired-capacity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest set-desired-capacity-request]
    (-> this (.setDesiredCapacityAsync set-desired-capacity-request))))

(defn delete-auto-scaling-group-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAutoScalingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest delete-auto-scaling-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAutoScalingGroupAsync delete-auto-scaling-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest delete-auto-scaling-group-request]
    (-> this (.deleteAutoScalingGroupAsync delete-auto-scaling-group-request))))

(defn batch-put-scheduled-update-group-action-async
  "Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter
   unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.

  batch-put-scheduled-update-group-action-request - `com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchPutScheduledUpdateGroupAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest batch-put-scheduled-update-group-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchPutScheduledUpdateGroupActionAsync batch-put-scheduled-update-group-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest batch-put-scheduled-update-group-action-request]
    (-> this (.batchPutScheduledUpdateGroupActionAsync batch-put-scheduled-update-group-action-request))))

(defn describe-adjustment-types-async
  "Describes the policy adjustment types for use with PutScalingPolicy.

  describe-adjustment-types-request - `com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAdjustmentTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest describe-adjustment-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAdjustmentTypesAsync describe-adjustment-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest describe-adjustment-types-request]
    (-> this (.describeAdjustmentTypesAsync describe-adjustment-types-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeAdjustmentTypesAsync))))

(defn complete-lifecycle-action-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CompleteLifecycleAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest complete-lifecycle-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.completeLifecycleActionAsync complete-lifecycle-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest complete-lifecycle-action-request]
    (-> this (.completeLifecycleActionAsync complete-lifecycle-action-request))))

(defn describe-metric-collection-types-async
  "Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling.


   The GroupStandbyInstances metric is not returned by default. You must explicitly request this metric
   when calling EnableMetricsCollection.

  describe-metric-collection-types-request - `com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMetricCollectionTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest describe-metric-collection-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMetricCollectionTypesAsync describe-metric-collection-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest describe-metric-collection-types-request]
    (-> this (.describeMetricCollectionTypesAsync describe-metric-collection-types-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeMetricCollectionTypesAsync))))

(defn create-launch-configuration-async
  "Creates a launch configuration.


   If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this
   limit, see DescribeAccountLimits. For information about updating this limit, see Amazon EC2 Auto Scaling
   Limits in the Amazon EC2 Auto Scaling User Guide.


   For more information, see Launch Configurations
   in the Amazon EC2 Auto Scaling User Guide.

  create-launch-configuration-request - `com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLaunchConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest create-launch-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLaunchConfigurationAsync create-launch-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest create-launch-configuration-request]
    (-> this (.createLaunchConfigurationAsync create-launch-configuration-request))))

(defn describe-auto-scaling-instances-async
  "Describes one or more Auto Scaling instances.

  describe-auto-scaling-instances-request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutoScalingInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest describe-auto-scaling-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutoScalingInstancesAsync describe-auto-scaling-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest describe-auto-scaling-instances-request]
    (-> this (.describeAutoScalingInstancesAsync describe-auto-scaling-instances-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeAutoScalingInstancesAsync))))

(defn detach-instances-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DetachInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachInstancesRequest detach-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachInstancesAsync detach-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachInstancesRequest detach-instances-request]
    (-> this (.detachInstancesAsync detach-instances-request))))

(defn describe-termination-policy-types-async
  "Describes the termination policies supported by Amazon EC2 Auto Scaling.


   For more information, see Controlling Which Auto
   Scaling Instances Terminate During Scale In in the Amazon EC2 Auto Scaling User Guide.

  describe-termination-policy-types-request - `com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTerminationPolicyTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest describe-termination-policy-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTerminationPolicyTypesAsync describe-termination-policy-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest describe-termination-policy-types-request]
    (-> this (.describeTerminationPolicyTypesAsync describe-termination-policy-types-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeTerminationPolicyTypesAsync))))

(defn describe-scaling-process-types-async
  "Describes the scaling process types for use with ResumeProcesses and SuspendProcesses.

  describe-scaling-process-types-request - `com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingProcessTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest describe-scaling-process-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingProcessTypesAsync describe-scaling-process-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest describe-scaling-process-types-request]
    (-> this (.describeScalingProcessTypesAsync describe-scaling-process-types-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeScalingProcessTypesAsync))))

(defn describe-load-balancer-target-groups-async
  "Describes the target groups for the specified Auto Scaling group.

  describe-load-balancer-target-groups-request - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerTargetGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest describe-load-balancer-target-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerTargetGroupsAsync describe-load-balancer-target-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest describe-load-balancer-target-groups-request]
    (-> this (.describeLoadBalancerTargetGroupsAsync describe-load-balancer-target-groups-request))))

(defn describe-notification-configurations-async
  "Describes the notification actions associated with the specified Auto Scaling group.

  describe-notification-configurations-request - `com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotificationConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest describe-notification-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotificationConfigurationsAsync describe-notification-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest describe-notification-configurations-request]
    (-> this (.describeNotificationConfigurationsAsync describe-notification-configurations-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeNotificationConfigurationsAsync))))

(defn attach-load-balancers-async
  "Attaches one or more Classic Load Balancers to the specified Auto Scaling group.


   To attach an Application Load Balancer or a Network Load Balancer instead, see
   AttachLoadBalancerTargetGroups.


   To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load
   balancer from the Auto Scaling group, use DetachLoadBalancers.


   For more information, see Attaching a Load
   Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  attach-load-balancers-request - `com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest attach-load-balancers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachLoadBalancersAsync attach-load-balancers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest attach-load-balancers-request]
    (-> this (.attachLoadBalancersAsync attach-load-balancers-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.attachLoadBalancersAsync))))

(defn execute-policy-async
  "Executes the specified policy.

  execute-policy-request - `com.amazonaws.services.autoscaling.model.ExecutePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecutePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.ExecutePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ExecutePolicyRequest execute-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executePolicyAsync execute-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ExecutePolicyRequest execute-policy-request]
    (-> this (.executePolicyAsync execute-policy-request))))

(defn delete-launch-configuration-async
  "Deletes the specified launch configuration.


   The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch
   configuration is no longer available for use.

  delete-launch-configuration-request - `com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLaunchConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest delete-launch-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLaunchConfigurationAsync delete-launch-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest delete-launch-configuration-request]
    (-> this (.deleteLaunchConfigurationAsync delete-launch-configuration-request))))

(defn create-auto-scaling-group-async
  "Creates an Auto Scaling group with the specified name and attributes.


   If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this
   limit, see DescribeAccountLimits. For information about updating this limit, see Amazon EC2 Auto Scaling
   Limits in the Amazon EC2 Auto Scaling User Guide.

  create-auto-scaling-group-request - `com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAutoScalingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest create-auto-scaling-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAutoScalingGroupAsync create-auto-scaling-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest create-auto-scaling-group-request]
    (-> this (.createAutoScalingGroupAsync create-auto-scaling-group-request))))

(defn disable-metrics-collection-async
  "Disables group metrics for the specified Auto Scaling group.

  disable-metrics-collection-request - `com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableMetricsCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest disable-metrics-collection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableMetricsCollectionAsync disable-metrics-collection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest disable-metrics-collection-request]
    (-> this (.disableMetricsCollectionAsync disable-metrics-collection-request))))

(defn enable-metrics-collection-async
  "Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto
   Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.

  enable-metrics-collection-request - `com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableMetricsCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest enable-metrics-collection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableMetricsCollectionAsync enable-metrics-collection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest enable-metrics-collection-request]
    (-> this (.enableMetricsCollectionAsync enable-metrics-collection-request))))

(defn delete-scheduled-action-async
  "Deletes the specified scheduled action.

  delete-scheduled-action-request - `com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest delete-scheduled-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScheduledActionAsync delete-scheduled-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest delete-scheduled-action-request]
    (-> this (.deleteScheduledActionAsync delete-scheduled-action-request))))

(defn record-lifecycle-action-heartbeat-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RecordLifecycleActionHeartbeat operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest record-lifecycle-action-heartbeat-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.recordLifecycleActionHeartbeatAsync record-lifecycle-action-heartbeat-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest record-lifecycle-action-heartbeat-request]
    (-> this (.recordLifecycleActionHeartbeatAsync record-lifecycle-action-heartbeat-request))))

(defn describe-auto-scaling-notification-types-async
  "Describes the notification types that are supported by Amazon EC2 Auto Scaling.

  describe-auto-scaling-notification-types-request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutoScalingNotificationTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest describe-auto-scaling-notification-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutoScalingNotificationTypesAsync describe-auto-scaling-notification-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest describe-auto-scaling-notification-types-request]
    (-> this (.describeAutoScalingNotificationTypesAsync describe-auto-scaling-notification-types-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeAutoScalingNotificationTypesAsync))))

(defn terminate-instance-in-auto-scaling-group-async
  "Terminates the specified instance and optionally adjusts the desired group size.


   This call simply makes a termination request. The instance is not terminated immediately.

  terminate-instance-in-auto-scaling-group-request - `com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateInstanceInAutoScalingGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest terminate-instance-in-auto-scaling-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateInstanceInAutoScalingGroupAsync terminate-instance-in-auto-scaling-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest terminate-instance-in-auto-scaling-group-request]
    (-> this (.terminateInstanceInAutoScalingGroupAsync terminate-instance-in-auto-scaling-group-request))))

(defn put-scaling-policy-async
  "Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name
   and set the parameters to change. Any existing parameter not changed in an update to an existing policy is not
   changed in this update request.

  put-scaling-policy-request - `com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.PutScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest put-scaling-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScalingPolicyAsync put-scaling-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest put-scaling-policy-request]
    (-> this (.putScalingPolicyAsync put-scaling-policy-request))))

(defn describe-tags-async
  "Describes the specified tags.


   You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling
   group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it
   to be included in the results.


   You can also specify multiple filters. The result includes information for a particular tag only if it matches
   all the filters. If there's no match, no special message is returned.

  describe-tags-request - `com.amazonaws.services.autoscaling.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeTagsRequest describe-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync describe-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTagsAsync describe-tags-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeTagsAsync))))

(defn create-or-update-tags-async
  "Creates or updates tags for the specified Auto Scaling group.


   When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and
   you do not get an error message.


   For more information, see Tagging Auto Scaling Groups
   and Instances in the Amazon EC2 Auto Scaling User Guide.

  create-or-update-tags-request - `com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOrUpdateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest create-or-update-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOrUpdateTagsAsync create-or-update-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest create-or-update-tags-request]
    (-> this (.createOrUpdateTagsAsync create-or-update-tags-request))))

(defn describe-scaling-activities-async
  "Describes one or more scaling activities for the specified Auto Scaling group.

  describe-scaling-activities-request - `com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest describe-scaling-activities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingActivitiesAsync describe-scaling-activities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest describe-scaling-activities-request]
    (-> this (.describeScalingActivitiesAsync describe-scaling-activities-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeScalingActivitiesAsync))))

(defn attach-instances-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.AttachInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachInstancesRequest attach-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachInstancesAsync attach-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachInstancesRequest attach-instances-request]
    (-> this (.attachInstancesAsync attach-instances-request))))

(defn describe-scheduled-actions-async
  "Describes the actions scheduled for your Auto Scaling group that haven't run or that have not reached their end
   time. To describe the actions that have already run, use DescribeScalingActivities.

  describe-scheduled-actions-request - `com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest describe-scheduled-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledActionsAsync describe-scheduled-actions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest describe-scheduled-actions-request]
    (-> this (.describeScheduledActionsAsync describe-scheduled-actions-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeScheduledActionsAsync))))

(defn detach-load-balancers-async
  "Detaches one or more Classic Load Balancers from the specified Auto Scaling group.


   This operation detaches only Classic Load Balancers. If you have Application Load Balancers or Network Load
   Balancers, use DetachLoadBalancerTargetGroups instead.


   When you detach a load balancer, it enters the Removing state while deregistering the instances in
   the group. When all instances are deregistered, then you can no longer describe the load balancer using
   DescribeLoadBalancers. The instances remain running.

  detach-load-balancers-request - `com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest detach-load-balancers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachLoadBalancersAsync detach-load-balancers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest detach-load-balancers-request]
    (-> this (.detachLoadBalancersAsync detach-load-balancers-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.detachLoadBalancersAsync))))

(defn update-auto-scaling-group-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAutoScalingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest update-auto-scaling-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAutoScalingGroupAsync update-auto-scaling-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest update-auto-scaling-group-request]
    (-> this (.updateAutoScalingGroupAsync update-auto-scaling-group-request))))

(defn put-lifecycle-hook-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecycleHook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.PutLifecycleHookResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest put-lifecycle-hook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecycleHookAsync put-lifecycle-hook-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest put-lifecycle-hook-request]
    (-> this (.putLifecycleHookAsync put-lifecycle-hook-request))))

(defn attach-load-balancer-target-groups-async
  "Attaches one or more target groups to the specified Auto Scaling group.


   To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach
   the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups.


   With Application Load Balancers and Network Load Balancers, instances are registered as targets with a target
   group. With Classic Load Balancers, instances are registered with the load balancer. For more information, see Attaching a Load
   Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  attach-load-balancer-target-groups-request - `com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachLoadBalancerTargetGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest attach-load-balancer-target-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachLoadBalancerTargetGroupsAsync attach-load-balancer-target-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest attach-load-balancer-target-groups-request]
    (-> this (.attachLoadBalancerTargetGroupsAsync attach-load-balancer-target-groups-request))))

(defn delete-lifecycle-hook-async
  "Deletes the specified lifecycle hook.


   If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching
   instances, CONTINUE for terminating instances).

  delete-lifecycle-hook-request - `com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLifecycleHook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest delete-lifecycle-hook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLifecycleHookAsync delete-lifecycle-hook-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest delete-lifecycle-hook-request]
    (-> this (.deleteLifecycleHookAsync delete-lifecycle-hook-request))))

(defn describe-launch-configurations-async
  "Describes one or more launch configurations.

  describe-launch-configurations-request - `com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLaunchConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest describe-launch-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLaunchConfigurationsAsync describe-launch-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest describe-launch-configurations-request]
    (-> this (.describeLaunchConfigurationsAsync describe-launch-configurations-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeLaunchConfigurationsAsync))))

(defn describe-lifecycle-hook-types-async
  "Describes the available types of lifecycle hooks.


   The following hook types are supported:




   autoscaling:EC2_INSTANCE_LAUNCHING




   autoscaling:EC2_INSTANCE_TERMINATING

  describe-lifecycle-hook-types-request - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLifecycleHookTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest describe-lifecycle-hook-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLifecycleHookTypesAsync describe-lifecycle-hook-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest describe-lifecycle-hook-types-request]
    (-> this (.describeLifecycleHookTypesAsync describe-lifecycle-hook-types-request)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this]
    (-> this (.describeLifecycleHookTypesAsync))))

(defn exit-standby-async
  "Moves the specified instances out of the standby state.


   For more information, see Temporarily Removing
   Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.

  exit-standby-request - `com.amazonaws.services.autoscaling.model.ExitStandbyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExitStandby operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.ExitStandbyResult>`"
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ExitStandbyRequest exit-standby-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exitStandbyAsync exit-standby-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ExitStandbyRequest exit-standby-request]
    (-> this (.exitStandbyAsync exit-standby-request))))

