(ns com.amazonaws.services.autoscaling.AbstractAmazonAutoScaling
  "Abstract implementation of AmazonAutoScaling. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscaling AbstractAmazonAutoScaling]))

(defn update-auto-scaling-group
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest`

  returns: Result of the UpdateAutoScalingGroup operation returned by the service. - `com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult`"
  (^com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.UpdateAutoScalingGroupRequest request]
    (-> this (.updateAutoScalingGroup request))))

(defn delete-tags
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteTagsResult`"
  (^com.amazonaws.services.autoscaling.model.DeleteTagsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn describe-policies
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribePoliciesRequest`

  returns: Result of the DescribePolicies operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribePoliciesResult`"
  (^com.amazonaws.services.autoscaling.model.DescribePoliciesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribePoliciesRequest request]
    (-> this (.describePolicies request)))
  (^com.amazonaws.services.autoscaling.model.DescribePoliciesResult [^AbstractAmazonAutoScaling this]
    (-> this (.describePolicies))))

(defn enable-metrics-collection
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest`

  returns: Result of the EnableMetricsCollection operation returned by the service. - `com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult`"
  (^com.amazonaws.services.autoscaling.model.EnableMetricsCollectionResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.EnableMetricsCollectionRequest request]
    (-> this (.enableMetricsCollection request))))

(defn set-instance-protection
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest`

  returns: Result of the SetInstanceProtection operation returned by the service. - `com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult`"
  (^com.amazonaws.services.autoscaling.model.SetInstanceProtectionResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.SetInstanceProtectionRequest request]
    (-> this (.setInstanceProtection request))))

(defn describe-scaling-activities
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest`

  returns: Result of the DescribeScalingActivities operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesRequest request]
    (-> this (.describeScalingActivities request)))
  (^com.amazonaws.services.autoscaling.model.DescribeScalingActivitiesResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeScalingActivities))))

(defn attach-load-balancer-target-groups
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest`

  returns: Result of the AttachLoadBalancerTargetGroups operation returned by the service. - `com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult`"
  (^com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancerTargetGroupsRequest request]
    (-> this (.attachLoadBalancerTargetGroups request))))

(defn describe-tags
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeTagsResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeTagsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeTagsRequest request]
    (-> this (.describeTags request)))
  (^com.amazonaws.services.autoscaling.model.DescribeTagsResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeTags))))

(defn set-region
  "Description copied from interface: AmazonAutoScaling

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonAutoScaling this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn exit-standby
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.ExitStandbyRequest`

  returns: Result of the ExitStandby operation returned by the service. - `com.amazonaws.services.autoscaling.model.ExitStandbyResult`"
  (^com.amazonaws.services.autoscaling.model.ExitStandbyResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.ExitStandbyRequest request]
    (-> this (.exitStandby request))))

(defn delete-launch-configuration
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest`

  returns: Result of the DeleteLaunchConfiguration operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult`"
  (^com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteLaunchConfigurationRequest request]
    (-> this (.deleteLaunchConfiguration request))))

(defn waiters
  "returns: `com.amazonaws.services.autoscaling.waiters.AmazonAutoScalingWaiters`"
  (^com.amazonaws.services.autoscaling.waiters.AmazonAutoScalingWaiters [^AbstractAmazonAutoScaling this]
    (-> this (.waiters))))

(defn put-lifecycle-hook
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest`

  returns: Result of the PutLifecycleHook operation returned by the service. - `com.amazonaws.services.autoscaling.model.PutLifecycleHookResult`"
  (^com.amazonaws.services.autoscaling.model.PutLifecycleHookResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.PutLifecycleHookRequest request]
    (-> this (.putLifecycleHook request))))

(defn describe-load-balancers
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest`

  returns: Result of the DescribeLoadBalancers operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeLoadBalancersResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancersRequest request]
    (-> this (.describeLoadBalancers request))))

(defn suspend-processes
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.SuspendProcessesRequest`

  returns: Result of the SuspendProcesses operation returned by the service. - `com.amazonaws.services.autoscaling.model.SuspendProcessesResult`"
  (^com.amazonaws.services.autoscaling.model.SuspendProcessesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.SuspendProcessesRequest request]
    (-> this (.suspendProcesses request))))

(defn create-launch-configuration
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest`

  returns: Result of the CreateLaunchConfiguration operation returned by the service. - `com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult`"
  (^com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.CreateLaunchConfigurationRequest request]
    (-> this (.createLaunchConfiguration request))))

(defn detach-load-balancer-target-groups
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest`

  returns: Result of the DetachLoadBalancerTargetGroups operation returned by the service. - `com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult`"
  (^com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancerTargetGroupsRequest request]
    (-> this (.detachLoadBalancerTargetGroups request))))

(defn delete-scheduled-action
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest`

  returns: Result of the DeleteScheduledAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult`"
  (^com.amazonaws.services.autoscaling.model.DeleteScheduledActionResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteScheduledActionRequest request]
    (-> this (.deleteScheduledAction request))))

(defn complete-lifecycle-action
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest`

  returns: Result of the CompleteLifecycleAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult`"
  (^com.amazonaws.services.autoscaling.model.CompleteLifecycleActionResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.CompleteLifecycleActionRequest request]
    (-> this (.completeLifecycleAction request))))

(defn describe-notification-configurations
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest`

  returns: Result of the DescribeNotificationConfigurations operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsRequest request]
    (-> this (.describeNotificationConfigurations request)))
  (^com.amazonaws.services.autoscaling.model.DescribeNotificationConfigurationsResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeNotificationConfigurations))))

(defn resume-processes
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.ResumeProcessesRequest`

  returns: Result of the ResumeProcesses operation returned by the service. - `com.amazonaws.services.autoscaling.model.ResumeProcessesResult`"
  (^com.amazonaws.services.autoscaling.model.ResumeProcessesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.ResumeProcessesRequest request]
    (-> this (.resumeProcesses request))))

(defn describe-lifecycle-hooks
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest`

  returns: Result of the DescribeLifecycleHooks operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHooksRequest request]
    (-> this (.describeLifecycleHooks request))))

(defn describe-scheduled-actions
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest`

  returns: Result of the DescribeScheduledActions operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsRequest request]
    (-> this (.describeScheduledActions request)))
  (^com.amazonaws.services.autoscaling.model.DescribeScheduledActionsResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeScheduledActions))))

(defn describe-termination-policy-types
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest`

  returns: Result of the DescribeTerminationPolicyTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesRequest request]
    (-> this (.describeTerminationPolicyTypes request)))
  (^com.amazonaws.services.autoscaling.model.DescribeTerminationPolicyTypesResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeTerminationPolicyTypes))))

(defn set-desired-capacity
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest`

  returns: Result of the SetDesiredCapacity operation returned by the service. - `com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult`"
  (^com.amazonaws.services.autoscaling.model.SetDesiredCapacityResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.SetDesiredCapacityRequest request]
    (-> this (.setDesiredCapacity request))))

(defn execute-policy
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.ExecutePolicyRequest`

  returns: Result of the ExecutePolicy operation returned by the service. - `com.amazonaws.services.autoscaling.model.ExecutePolicyResult`"
  (^com.amazonaws.services.autoscaling.model.ExecutePolicyResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.ExecutePolicyRequest request]
    (-> this (.executePolicy request))))

(defn delete-auto-scaling-group
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest`

  returns: Result of the DeleteAutoScalingGroup operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult`"
  (^com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteAutoScalingGroupRequest request]
    (-> this (.deleteAutoScalingGroup request))))

(defn enter-standby
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.EnterStandbyRequest`

  returns: Result of the EnterStandby operation returned by the service. - `com.amazonaws.services.autoscaling.model.EnterStandbyResult`"
  (^com.amazonaws.services.autoscaling.model.EnterStandbyResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.EnterStandbyRequest request]
    (-> this (.enterStandby request))))

(defn delete-policy
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeletePolicyResult`"
  (^com.amazonaws.services.autoscaling.model.DeletePolicyResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeletePolicyRequest request]
    (-> this (.deletePolicy request))))

(defn shutdown
  "Description copied from interface: AmazonAutoScaling"
  ([^AbstractAmazonAutoScaling this]
    (-> this (.shutdown))))

(defn describe-lifecycle-hook-types
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest`

  returns: Result of the DescribeLifecycleHookTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesRequest request]
    (-> this (.describeLifecycleHookTypes request)))
  (^com.amazonaws.services.autoscaling.model.DescribeLifecycleHookTypesResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeLifecycleHookTypes))))

(defn terminate-instance-in-auto-scaling-group
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest`

  returns: Result of the TerminateInstanceInAutoScalingGroup operation returned by the service. - `com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult`"
  (^com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.TerminateInstanceInAutoScalingGroupRequest request]
    (-> this (.terminateInstanceInAutoScalingGroup request))))

(defn detach-instances
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DetachInstancesRequest`

  returns: Result of the DetachInstances operation returned by the service. - `com.amazonaws.services.autoscaling.model.DetachInstancesResult`"
  (^com.amazonaws.services.autoscaling.model.DetachInstancesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DetachInstancesRequest request]
    (-> this (.detachInstances request))))

(defn describe-metric-collection-types
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest`

  returns: Result of the DescribeMetricCollectionTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesRequest request]
    (-> this (.describeMetricCollectionTypes request)))
  (^com.amazonaws.services.autoscaling.model.DescribeMetricCollectionTypesResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeMetricCollectionTypes))))

(defn describe-account-limits
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest`

  returns: Result of the DescribeAccountLimits operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimits request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAccountLimitsResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeAccountLimits))))

(defn describe-adjustment-types
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest`

  returns: Result of the DescribeAdjustmentTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesRequest request]
    (-> this (.describeAdjustmentTypes request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAdjustmentTypesResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeAdjustmentTypes))))

(defn set-endpoint
  "Description copied from interface: AmazonAutoScaling

  endpoint - The endpoint (ex: \"autoscaling.amazonaws.com\") or a full URL, including the protocol (ex: \"https://autoscaling.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonAutoScaling this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-auto-scaling-instances
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest`

  returns: Result of the DescribeAutoScalingInstances operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesRequest request]
    (-> this (.describeAutoScalingInstances request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingInstancesResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeAutoScalingInstances))))

(defn create-or-update-tags
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest`

  returns: Result of the CreateOrUpdateTags operation returned by the service. - `com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult`"
  (^com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.CreateOrUpdateTagsRequest request]
    (-> this (.createOrUpdateTags request))))

(defn attach-instances
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.AttachInstancesRequest`

  returns: Result of the AttachInstances operation returned by the service. - `com.amazonaws.services.autoscaling.model.AttachInstancesResult`"
  (^com.amazonaws.services.autoscaling.model.AttachInstancesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.AttachInstancesRequest request]
    (-> this (.attachInstances request))))

(defn put-scheduled-update-group-action
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest`

  returns: Result of the PutScheduledUpdateGroupAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult`"
  (^com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.PutScheduledUpdateGroupActionRequest request]
    (-> this (.putScheduledUpdateGroupAction request))))

(defn record-lifecycle-action-heartbeat
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest`

  returns: Result of the RecordLifecycleActionHeartbeat operation returned by the service. - `com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult`"
  (^com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.RecordLifecycleActionHeartbeatRequest request]
    (-> this (.recordLifecycleActionHeartbeat request))))

(defn describe-auto-scaling-groups
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest`

  returns: Result of the DescribeAutoScalingGroups operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsRequest request]
    (-> this (.describeAutoScalingGroups request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingGroupsResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeAutoScalingGroups))))

(defn disable-metrics-collection
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest`

  returns: Result of the DisableMetricsCollection operation returned by the service. - `com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult`"
  (^com.amazonaws.services.autoscaling.model.DisableMetricsCollectionResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DisableMetricsCollectionRequest request]
    (-> this (.disableMetricsCollection request))))

(defn set-instance-health
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest`

  returns: Result of the SetInstanceHealth operation returned by the service. - `com.amazonaws.services.autoscaling.model.SetInstanceHealthResult`"
  (^com.amazonaws.services.autoscaling.model.SetInstanceHealthResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.SetInstanceHealthRequest request]
    (-> this (.setInstanceHealth request))))

(defn batch-put-scheduled-update-group-action
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest`

  returns: Result of the BatchPutScheduledUpdateGroupAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionResult`"
  (^com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.BatchPutScheduledUpdateGroupActionRequest request]
    (-> this (.batchPutScheduledUpdateGroupAction request))))

(defn attach-load-balancers
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest`

  returns: Result of the AttachLoadBalancers operation returned by the service. - `com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult`"
  (^com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.AttachLoadBalancersRequest request]
    (-> this (.attachLoadBalancers request)))
  (^com.amazonaws.services.autoscaling.model.AttachLoadBalancersResult [^AbstractAmazonAutoScaling this]
    (-> this (.attachLoadBalancers))))

(defn delete-lifecycle-hook
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest`

  returns: Result of the DeleteLifecycleHook operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult`"
  (^com.amazonaws.services.autoscaling.model.DeleteLifecycleHookResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteLifecycleHookRequest request]
    (-> this (.deleteLifecycleHook request))))

(defn describe-load-balancer-target-groups
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest`

  returns: Result of the DescribeLoadBalancerTargetGroups operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLoadBalancerTargetGroupsRequest request]
    (-> this (.describeLoadBalancerTargetGroups request))))

(defn put-notification-configuration
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest`

  returns: Result of the PutNotificationConfiguration operation returned by the service. - `com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult`"
  (^com.amazonaws.services.autoscaling.model.PutNotificationConfigurationResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.PutNotificationConfigurationRequest request]
    (-> this (.putNotificationConfiguration request))))

(defn describe-scaling-process-types
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest`

  returns: Result of the DescribeScalingProcessTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesRequest request]
    (-> this (.describeScalingProcessTypes request)))
  (^com.amazonaws.services.autoscaling.model.DescribeScalingProcessTypesResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeScalingProcessTypes))))

(defn batch-delete-scheduled-action
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest`

  returns: Result of the BatchDeleteScheduledAction operation returned by the service. - `com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionResult`"
  (^com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.BatchDeleteScheduledActionRequest request]
    (-> this (.batchDeleteScheduledAction request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonAutoScaling

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonAutoScaling this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn detach-load-balancers
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest`

  returns: Result of the DetachLoadBalancers operation returned by the service. - `com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult`"
  (^com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DetachLoadBalancersRequest request]
    (-> this (.detachLoadBalancers request)))
  (^com.amazonaws.services.autoscaling.model.DetachLoadBalancersResult [^AbstractAmazonAutoScaling this]
    (-> this (.detachLoadBalancers))))

(defn create-auto-scaling-group
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest`

  returns: Result of the CreateAutoScalingGroup operation returned by the service. - `com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult`"
  (^com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.CreateAutoScalingGroupRequest request]
    (-> this (.createAutoScalingGroup request))))

(defn delete-notification-configuration
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest`

  returns: Result of the DeleteNotificationConfiguration operation returned by the service. - `com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult`"
  (^com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DeleteNotificationConfigurationRequest request]
    (-> this (.deleteNotificationConfiguration request))))

(defn describe-launch-configurations
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest`

  returns: Result of the DescribeLaunchConfigurations operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsRequest request]
    (-> this (.describeLaunchConfigurations request)))
  (^com.amazonaws.services.autoscaling.model.DescribeLaunchConfigurationsResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeLaunchConfigurations))))

(defn describe-auto-scaling-notification-types
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest`

  returns: Result of the DescribeAutoScalingNotificationTypes operation returned by the service. - `com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult`"
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesRequest request]
    (-> this (.describeAutoScalingNotificationTypes request)))
  (^com.amazonaws.services.autoscaling.model.DescribeAutoScalingNotificationTypesResult [^AbstractAmazonAutoScaling this]
    (-> this (.describeAutoScalingNotificationTypes))))

(defn put-scaling-policy
  "Description copied from interface: AmazonAutoScaling

  request - `com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest`

  returns: Result of the PutScalingPolicy operation returned by the service. - `com.amazonaws.services.autoscaling.model.PutScalingPolicyResult`"
  (^com.amazonaws.services.autoscaling.model.PutScalingPolicyResult [^AbstractAmazonAutoScaling this ^com.amazonaws.services.autoscaling.model.PutScalingPolicyRequest request]
    (-> this (.putScalingPolicy request))))

