(ns com.amazonaws.services.applicationautoscaling.AbstractAWSApplicationAutoScalingAsync
  "Abstract implementation of AWSApplicationAutoScalingAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationautoscaling AbstractAWSApplicationAutoScalingAsync]))

(defn describe-scaling-policies-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest request]
    (-> this (.describeScalingPoliciesAsync request))))

(defn deregister-scalable-target-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterScalableTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterScalableTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest request]
    (-> this (.deregisterScalableTargetAsync request))))

(defn delete-scaling-policy-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScalingPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest request]
    (-> this (.deleteScalingPolicyAsync request))))

(defn put-scheduled-action-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.PutScheduledActionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScheduledActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest request]
    (-> this (.putScheduledActionAsync request))))

(defn register-scalable-target-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterScalableTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerScalableTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest request]
    (-> this (.registerScalableTargetAsync request))))

(defn delete-scheduled-action-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScheduledActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest request]
    (-> this (.deleteScheduledActionAsync request))))

(defn put-scaling-policy-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScalingPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest request]
    (-> this (.putScalingPolicyAsync request))))

(defn describe-scaling-activities-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingActivitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest request]
    (-> this (.describeScalingActivitiesAsync request))))

(defn describe-scalable-targets-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalableTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalableTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest request]
    (-> this (.describeScalableTargetsAsync request))))

(defn describe-scheduled-actions-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest request]
    (-> this (.describeScheduledActionsAsync request))))

