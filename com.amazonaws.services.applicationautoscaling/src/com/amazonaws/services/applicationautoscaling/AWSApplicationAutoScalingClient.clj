(ns com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingClient
  "Client for accessing Application Auto Scaling. All service calls made using this client are blocking, and will not
  return until the service call completes.


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
  (:import [com.amazonaws.services.applicationautoscaling AWSApplicationAutoScalingClient]))

(defn ->aws-application-auto-scaling-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Application Auto Scaling (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSApplicationAutoScalingClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSApplicationAutoScalingClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSApplicationAutoScalingClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSApplicationAutoScalingClient aws-credentials client-configuration))
  (^AWSApplicationAutoScalingClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSApplicationAutoScalingClient client-configuration))
  (^AWSApplicationAutoScalingClient []
    (new AWSApplicationAutoScalingClient )))

(defn *builder
  "returns: `com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingClientBuilder`"
  (^com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingClientBuilder []
    (AWSApplicationAutoScalingClient/builder )))

(defn put-scheduled-action
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

  request - `com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest`

  returns: Result of the PutScheduledAction operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.PutScheduledActionResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest request]
    (-> this (.putScheduledAction request))))

(defn describe-scaling-activities
  "Provides descriptive information about the scaling activities in the specified namespace from the previous six
   weeks.


   You can filter the results using the ResourceId and ScalableDimension parameters.


   Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the
   scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or
   update an existing one, see PutScalingPolicy.

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest`

  returns: Result of the DescribeScalingActivities operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest request]
    (-> this (.describeScalingActivities request))))

(defn register-scalable-target
  "Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale
   out and scale in. Each scalable target has a resource ID, scalable dimension, and namespace, as well as values
   for minimum and maximum capacity.


   After you register a scalable target, you do not need to register it again to use other Application Auto Scaling
   operations. To see which resources have been registered, use DescribeScalableTargets. You can also view
   the scaling policies for a service namespace using DescribeScalableTargets.


   If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.

  request - `com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest`

  returns: Result of the RegisterScalableTarget operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest request]
    (-> this (.registerScalableTarget request))))

(defn delete-scaling-policy
  "Deletes the specified Application Auto Scaling scaling policy.


   Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with
   the scaling policy, even if it no longer has an associated action.


   To create a scaling policy or update an existing one, see PutScalingPolicy.

  request - `com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest`

  returns: Result of the DeleteScalingPolicy operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest request]
    (-> this (.deleteScalingPolicy request))))

(defn describe-scaling-policies
  "Describes the scaling policies for the specified service namespace.


   You can filter the results using the ResourceId, ScalableDimension, and
   PolicyNames parameters.


   To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a
   scaling policy, you can delete it using DeleteScalingPolicy.

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest`

  returns: Result of the DescribeScalingPolicies operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest request]
    (-> this (.describeScalingPolicies request))))

(defn delete-scheduled-action
  "Deletes the specified Application Auto Scaling scheduled action.

  request - `com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest`

  returns: Result of the DeleteScheduledAction operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest request]
    (-> this (.deleteScheduledAction request))))

(defn describe-scheduled-actions
  "Describes the scheduled actions for the specified service namespace.


   You can filter the results using the ResourceId, ScalableDimension, and
   ScheduledActionNames parameters.


   To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using
   a scheduled action, you can delete it using DeleteScheduledAction.

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest`

  returns: Result of the DescribeScheduledActions operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest request]
    (-> this (.describeScheduledActions request))))

(defn deregister-scalable-target
  "Deregisters a scalable target.


   Deregistering a scalable target deletes the scaling policies that are associated with it.


   To create a scalable target or update an existing one, see RegisterScalableTarget.

  request - `com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest`

  returns: Result of the DeregisterScalableTarget operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest request]
    (-> this (.deregisterScalableTarget request))))

(defn describe-scalable-targets
  "Gets information about the scalable targets in the specified namespace.


   You can filter the results using the ResourceIds and ScalableDimension parameters.


   To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer
   using a scalable target, you can deregister it using DeregisterScalableTarget.

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest`

  returns: Result of the DescribeScalableTargets operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest request]
    (-> this (.describeScalableTargets request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSApplicationAutoScalingClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-scaling-policy
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

  request - `com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest`

  returns: Result of the PutScalingPolicy operation returned by the service. - `com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyResult`

  throws: com.amazonaws.services.applicationautoscaling.model.ValidationException - An exception was thrown for a validation issue. Review the available parameters for the API request."
  (^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyResult [^AWSApplicationAutoScalingClient this ^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest request]
    (-> this (.putScalingPolicy request))))

