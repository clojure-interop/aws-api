(ns com.amazonaws.services.applicationautoscaling.AbstractAWSApplicationAutoScaling
  "Abstract implementation of AWSApplicationAutoScaling. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationautoscaling AbstractAWSApplicationAutoScaling]))

(defn put-scheduled-action
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest`

  returns: Result of the PutScheduledAction operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.PutScheduledActionResult`"
  (^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest request]
    (-> this (.putScheduledAction request))))

(defn describe-scaling-activities
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest`

  returns: Result of the DescribeScalingActivities operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesResult`"
  (^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest request]
    (-> this (.describeScalingActivities request))))

(defn set-region
  "Description copied from interface: AWSApplicationAutoScaling

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSApplicationAutoScaling this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn register-scalable-target
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest`

  returns: Result of the RegisterScalableTarget operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetResult`"
  (^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest request]
    (-> this (.registerScalableTarget request))))

(defn delete-scaling-policy
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest`

  returns: Result of the DeleteScalingPolicy operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyResult`"
  (^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest request]
    (-> this (.deleteScalingPolicy request))))

(defn describe-scaling-policies
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest`

  returns: Result of the DescribeScalingPolicies operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesResult`"
  (^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest request]
    (-> this (.describeScalingPolicies request))))

(defn delete-scheduled-action
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest`

  returns: Result of the DeleteScheduledAction operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionResult`"
  (^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest request]
    (-> this (.deleteScheduledAction request))))

(defn describe-scheduled-actions
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest`

  returns: Result of the DescribeScheduledActions operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsResult`"
  (^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest request]
    (-> this (.describeScheduledActions request))))

(defn shutdown
  "Description copied from interface: AWSApplicationAutoScaling"
  ([^AbstractAWSApplicationAutoScaling this]
    (-> this (.shutdown))))

(defn deregister-scalable-target
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest`

  returns: Result of the DeregisterScalableTarget operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetResult`"
  (^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest request]
    (-> this (.deregisterScalableTarget request))))

(defn set-endpoint
  "Description copied from interface: AWSApplicationAutoScaling

  endpoint - The endpoint (ex: \"autoscaling.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://autoscaling.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSApplicationAutoScaling this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-scalable-targets
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest`

  returns: Result of the DescribeScalableTargets operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsResult`"
  (^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest request]
    (-> this (.describeScalableTargets request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSApplicationAutoScaling

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-scaling-policy
  "Description copied from interface: AWSApplicationAutoScaling

  request - `com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest`

  returns: Result of the PutScalingPolicy operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyResult`"
  (^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyResult [^AbstractAWSApplicationAutoScaling this ^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest request]
    (-> this (.putScalingPolicy request))))

