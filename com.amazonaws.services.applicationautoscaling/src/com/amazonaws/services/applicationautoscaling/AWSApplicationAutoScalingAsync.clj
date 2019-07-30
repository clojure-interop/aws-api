(ns com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingAsync
  "Interface for accessing Application Auto Scaling asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSApplicationAutoScalingAsync instead.



  With Application Auto Scaling, you can configure automatic scaling for your scalable resources. You can use
  Application Auto Scaling to accomplish the following tasks:




  Define scaling policies to automatically scale your AWS or custom resources




  Scale your resources in response to CloudWatch alarms




  Schedule one-time or recurring scaling actions




  View the history of your scaling events




  Application Auto Scaling can scale the following resources:




  Amazon ECS services. For more information, see Service Auto Scaling
  in the Amazon Elastic Container Service Developer Guide.




  Amazon EC2 Spot fleets. For more information, see Automatic Scaling for Spot
  Fleet in the Amazon EC2 User Guide.




  Amazon EMR clusters. For more information, see Using Automatic
  Scaling in Amazon EMR in the Amazon EMR Management Guide.




  AppStream 2.0 fleets. For more information, see Fleet Auto Scaling for Amazon
  AppStream 2.0 in the Amazon AppStream 2.0 Developer Guide.




  Provisioned read and write capacity for Amazon DynamoDB tables and global secondary indexes. For more information,
  see Managing Throughput
  Capacity Automatically with DynamoDB Auto Scaling in the Amazon DynamoDB Developer Guide.




  Amazon Aurora Replicas. For more information, see Using Amazon
  Aurora Auto Scaling with Aurora Replicas.




  Amazon SageMaker endpoint variants. For more information, see Automatically Scaling Amazon
  SageMaker Models.




  Custom resources provided by your own applications or services. More information is available in our GitHub repository.




  To learn more about Application Auto Scaling, including information about granting IAM users required permissions for
  Application Auto Scaling actions, see the Application Auto Scaling User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationautoscaling AWSApplicationAutoScalingAsync]))

(defn describe-scaling-policies-async
  "Describes the scaling policies for the specified service namespace.


   You can filter the results using the ResourceId, ScalableDimension, and
   PolicyNames parameters.


   To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a
   scaling policy, you can delete it using DeleteScalingPolicy.

  describe-scaling-policies-request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest describe-scaling-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPoliciesAsync describe-scaling-policies-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest describe-scaling-policies-request]
    (-> this (.describeScalingPoliciesAsync describe-scaling-policies-request))))

(defn deregister-scalable-target-async
  "Deregisters a scalable target.


   Deregistering a scalable target deletes the scaling policies that are associated with it.


   To create a scalable target or update an existing one, see RegisterScalableTarget.

  deregister-scalable-target-request - `com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterScalableTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest deregister-scalable-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterScalableTargetAsync deregister-scalable-target-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest deregister-scalable-target-request]
    (-> this (.deregisterScalableTargetAsync deregister-scalable-target-request))))

(defn delete-scaling-policy-async
  "Deletes the specified Application Auto Scaling scaling policy.


   Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with
   the scaling policy, even if it no longer has an associated action.


   To create a scaling policy or update an existing one, see PutScalingPolicy.

  delete-scaling-policy-request - `com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest delete-scaling-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScalingPolicyAsync delete-scaling-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest delete-scaling-policy-request]
    (-> this (.deleteScalingPolicyAsync delete-scaling-policy-request))))

(defn put-scheduled-action-async
  "Creates or updates a scheduled action for an Application Auto Scaling scalable target.


   Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled
   action applies to the scalable target identified by those three attributes. You cannot create a scheduled action
   until you have registered the resource as a scalable target using RegisterScalableTarget.


   To update an action, specify its name and the parameters that you want to change. If you don't specify start and
   end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update
   request.


   You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled
   action, you can delete it using DeleteScheduledAction.


   Learn more about how to work with scheduled actions in the Application Auto Scaling User Guide.

  put-scheduled-action-request - `com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.PutScheduledActionResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest put-scheduled-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScheduledActionAsync put-scheduled-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest put-scheduled-action-request]
    (-> this (.putScheduledActionAsync put-scheduled-action-request))))

(defn register-scalable-target-async
  "Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale
   out and scale in. Each scalable target has a resource ID, scalable dimension, and namespace, as well as values
   for minimum and maximum capacity.


   After you register a scalable target, you do not need to register it again to use other Application Auto Scaling
   operations. To see which resources have been registered, use DescribeScalableTargets. You can also view
   the scaling policies for a service namespace using DescribeScalableTargets.


   If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.

  register-scalable-target-request - `com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterScalableTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest register-scalable-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerScalableTargetAsync register-scalable-target-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest register-scalable-target-request]
    (-> this (.registerScalableTargetAsync register-scalable-target-request))))

(defn delete-scheduled-action-async
  "Deletes the specified Application Auto Scaling scheduled action.

  delete-scheduled-action-request - `com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest delete-scheduled-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScheduledActionAsync delete-scheduled-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest delete-scheduled-action-request]
    (-> this (.deleteScheduledActionAsync delete-scheduled-action-request))))

(defn put-scaling-policy-async
  "Creates or updates a policy for an Application Auto Scaling scalable target.


   Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy
   applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you
   have registered the resource as a scalable target using RegisterScalableTarget.


   To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you
   don't specify are not changed by this update request.


   You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no
   longer using a scaling policy, you can delete it using DeleteScalingPolicy.


   Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more
   target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that
   multiple policies could conflict, instructing the scalable target to scale out or in at the same time.
   Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale in and
   scale out. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent,
   and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity
   (200% of 10 = 20) and scales out to 30.


   Learn more about how to work with scaling policies in the Application Auto Scaling User Guide.

  put-scaling-policy-request - `com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest put-scaling-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScalingPolicyAsync put-scaling-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest put-scaling-policy-request]
    (-> this (.putScalingPolicyAsync put-scaling-policy-request))))

(defn describe-scaling-activities-async
  "Provides descriptive information about the scaling activities in the specified namespace from the previous six
   weeks.


   You can filter the results using the ResourceId and ScalableDimension parameters.


   Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the
   scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or
   update an existing one, see PutScalingPolicy.

  describe-scaling-activities-request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest describe-scaling-activities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingActivitiesAsync describe-scaling-activities-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest describe-scaling-activities-request]
    (-> this (.describeScalingActivitiesAsync describe-scaling-activities-request))))

(defn describe-scalable-targets-async
  "Gets information about the scalable targets in the specified namespace.


   You can filter the results using the ResourceIds and ScalableDimension parameters.


   To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer
   using a scalable target, you can deregister it using DeregisterScalableTarget.

  describe-scalable-targets-request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalableTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest describe-scalable-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalableTargetsAsync describe-scalable-targets-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest describe-scalable-targets-request]
    (-> this (.describeScalableTargetsAsync describe-scalable-targets-request))))

(defn describe-scheduled-actions-async
  "Describes the scheduled actions for the specified service namespace.


   You can filter the results using the ResourceId, ScalableDimension, and
   ScheduledActionNames parameters.


   To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using
   a scheduled action, you can delete it using DeleteScheduledAction.

  describe-scheduled-actions-request - `com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest describe-scheduled-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledActionsAsync describe-scheduled-actions-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsync this ^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest describe-scheduled-actions-request]
    (-> this (.describeScheduledActionsAsync describe-scheduled-actions-request))))

