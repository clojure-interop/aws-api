(ns com.amazonaws.services.autoscaling.AbstractAmazonAutoScalingAsync
  "Abstract implementation of AmazonAutoScalingAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscaling AbstractAmazonAutoScalingAsync]))

(defn describe-account-limits-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimitsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeAccountLimitsAsync))))

(defn resume-processes-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.ResumeProcessesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResumeProcesses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.ResumeProcessesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ResumeProcessesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resumeProcessesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ResumeProcessesRequest request]
    (-> this (.resumeProcessesAsync request))))

(defn detach-load-balancer-target-groups-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachLoadBalancerTargetGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachLoadBalancerTargetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest request]
    (-> this (.detachLoadBalancerTargetGroupsAsync request))))

(defn delete-policy-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DeletePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeletePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeletePolicyRequest request]
    (-> this (.deletePolicyAsync request))))

(defn delete-notification-configuration-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotificationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotificationConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest request]
    (-> this (.deleteNotificationConfigurationAsync request))))

(defn put-notification-configuration-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutNotificationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putNotificationConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest request]
    (-> this (.putNotificationConfigurationAsync request))))

(defn describe-policies-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribePoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribePoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribePoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribePoliciesRequest request]
    (-> this (.describePoliciesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describePoliciesAsync))))

(defn set-instance-health-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetInstanceHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.SetInstanceHealthResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setInstanceHealthAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest request]
    (-> this (.setInstanceHealthAsync request))))

(defn describe-auto-scaling-groups-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutoScalingGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutoScalingGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest request]
    (-> this (.describeAutoScalingGroupsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeAutoScalingGroupsAsync))))

(defn enter-standby-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.EnterStandbyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnterStandby operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.EnterStandbyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.EnterStandbyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enterStandbyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.EnterStandbyRequest request]
    (-> this (.enterStandbyAsync request))))

(defn batch-delete-scheduled-action-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteScheduledActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest request]
    (-> this (.batchDeleteScheduledActionAsync request))))

(defn delete-tags-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DeleteTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn set-instance-protection-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetInstanceProtection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setInstanceProtectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest request]
    (-> this (.setInstanceProtectionAsync request))))

(defn describe-load-balancers-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest request]
    (-> this (.describeLoadBalancersAsync request))))

(defn describe-lifecycle-hooks-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLifecycleHooks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLifecycleHooksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest request]
    (-> this (.describeLifecycleHooksAsync request))))

(defn put-scheduled-update-group-action-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScheduledUpdateGroupAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScheduledUpdateGroupActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest request]
    (-> this (.putScheduledUpdateGroupActionAsync request))))

(defn suspend-processes-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.SuspendProcessesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SuspendProcesses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.SuspendProcessesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SuspendProcessesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.suspendProcessesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SuspendProcessesRequest request]
    (-> this (.suspendProcessesAsync request))))

(defn set-desired-capacity-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetDesiredCapacity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setDesiredCapacityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest request]
    (-> this (.setDesiredCapacityAsync request))))

(defn delete-auto-scaling-group-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAutoScalingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAutoScalingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest request]
    (-> this (.deleteAutoScalingGroupAsync request))))

(defn batch-put-scheduled-update-group-action-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchPutScheduledUpdateGroupAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchPutScheduledUpdateGroupActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest request]
    (-> this (.batchPutScheduledUpdateGroupActionAsync request))))

(defn describe-adjustment-types-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAdjustmentTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAdjustmentTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest request]
    (-> this (.describeAdjustmentTypesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeAdjustmentTypesAsync))))

(defn complete-lifecycle-action-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CompleteLifecycleAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.completeLifecycleActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest request]
    (-> this (.completeLifecycleActionAsync request))))

(defn describe-metric-collection-types-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMetricCollectionTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMetricCollectionTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest request]
    (-> this (.describeMetricCollectionTypesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeMetricCollectionTypesAsync))))

(defn create-launch-configuration-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLaunchConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLaunchConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest request]
    (-> this (.createLaunchConfigurationAsync request))))

(defn describe-auto-scaling-instances-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutoScalingInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutoScalingInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest request]
    (-> this (.describeAutoScalingInstancesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeAutoScalingInstancesAsync))))

(defn detach-instances-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DetachInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DetachInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachInstancesRequest request]
    (-> this (.detachInstancesAsync request))))

(defn describe-termination-policy-types-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTerminationPolicyTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTerminationPolicyTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest request]
    (-> this (.describeTerminationPolicyTypesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeTerminationPolicyTypesAsync))))

(defn describe-scaling-process-types-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingProcessTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingProcessTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest request]
    (-> this (.describeScalingProcessTypesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeScalingProcessTypesAsync))))

(defn describe-load-balancer-target-groups-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoadBalancerTargetGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoadBalancerTargetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest request]
    (-> this (.describeLoadBalancerTargetGroupsAsync request))))

(defn describe-notification-configurations-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotificationConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotificationConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest request]
    (-> this (.describeNotificationConfigurationsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeNotificationConfigurationsAsync))))

(defn attach-load-balancers-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachLoadBalancersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest request]
    (-> this (.attachLoadBalancersAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.attachLoadBalancersAsync))))

(defn execute-policy-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.ExecutePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecutePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.ExecutePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ExecutePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ExecutePolicyRequest request]
    (-> this (.executePolicyAsync request))))

(defn delete-launch-configuration-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLaunchConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLaunchConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest request]
    (-> this (.deleteLaunchConfigurationAsync request))))

(defn create-auto-scaling-group-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAutoScalingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAutoScalingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest request]
    (-> this (.createAutoScalingGroupAsync request))))

(defn disable-metrics-collection-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableMetricsCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableMetricsCollectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest request]
    (-> this (.disableMetricsCollectionAsync request))))

(defn enable-metrics-collection-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableMetricsCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableMetricsCollectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest request]
    (-> this (.enableMetricsCollectionAsync request))))

(defn delete-scheduled-action-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScheduledActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest request]
    (-> this (.deleteScheduledActionAsync request))))

(defn record-lifecycle-action-heartbeat-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RecordLifecycleActionHeartbeat operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.recordLifecycleActionHeartbeatAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest request]
    (-> this (.recordLifecycleActionHeartbeatAsync request))))

(defn describe-auto-scaling-notification-types-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAutoScalingNotificationTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAutoScalingNotificationTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest request]
    (-> this (.describeAutoScalingNotificationTypesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeAutoScalingNotificationTypesAsync))))

(defn terminate-instance-in-auto-scaling-group-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateInstanceInAutoScalingGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateInstanceInAutoScalingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest request]
    (-> this (.terminateInstanceInAutoScalingGroupAsync request))))

(defn put-scaling-policy-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.PutScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScalingPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest request]
    (-> this (.putScalingPolicyAsync request))))

(defn describe-tags-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeTagsAsync))))

(defn create-or-update-tags-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOrUpdateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOrUpdateTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest request]
    (-> this (.createOrUpdateTagsAsync request))))

(defn describe-scaling-activities-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingActivitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest request]
    (-> this (.describeScalingActivitiesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeScalingActivitiesAsync))))

(defn attach-instances-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.AttachInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.AttachInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachInstancesRequest request]
    (-> this (.attachInstancesAsync request))))

(defn describe-scheduled-actions-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest request]
    (-> this (.describeScheduledActionsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeScheduledActionsAsync))))

(defn detach-load-balancers-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachLoadBalancersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest request]
    (-> this (.detachLoadBalancersAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.detachLoadBalancersAsync))))

(defn update-auto-scaling-group-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAutoScalingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAutoScalingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest request]
    (-> this (.updateAutoScalingGroupAsync request))))

(defn put-lifecycle-hook-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecycleHook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.PutLifecycleHookResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecycleHookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest request]
    (-> this (.putLifecycleHookAsync request))))

(defn attach-load-balancer-target-groups-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachLoadBalancerTargetGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachLoadBalancerTargetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest request]
    (-> this (.attachLoadBalancerTargetGroupsAsync request))))

(defn delete-lifecycle-hook-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLifecycleHook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLifecycleHookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest request]
    (-> this (.deleteLifecycleHookAsync request))))

(defn describe-launch-configurations-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLaunchConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLaunchConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest request]
    (-> this (.describeLaunchConfigurationsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeLaunchConfigurationsAsync))))

(defn describe-lifecycle-hook-types-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLifecycleHookTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLifecycleHookTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest request]
    (-> this (.describeLifecycleHookTypesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this]
    (-> this (.describeLifecycleHookTypesAsync))))

(defn exit-standby-async
  "Description copied from interface: AmazonAutoScalingAsync

  request - `com.amazonaws.services.autoscaling.model.ExitStandbyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExitStandby operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscaling.model.ExitStandbyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ExitStandbyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exitStandbyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonAutoScalingAsync this ^com.amazonaws.services.autoscaling.model.ExitStandbyRequest request]
    (-> this (.exitStandbyAsync request))))

