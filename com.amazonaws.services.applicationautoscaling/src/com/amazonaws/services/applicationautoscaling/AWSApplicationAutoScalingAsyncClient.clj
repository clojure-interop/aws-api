(ns com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingAsyncClient
  "Client for accessing Application Auto Scaling asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


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
  (:import [com.amazonaws.services.applicationautoscaling AWSApplicationAutoScalingAsyncClient]))

(defn ->aws-application-auto-scaling-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSApplicationAutoScalingAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSApplicationAutoScalingAsyncClient aws-credentials client-configuration executor-service))
  (^AWSApplicationAutoScalingAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSApplicationAutoScalingAsyncClient aws-credentials executor-service))
  (^AWSApplicationAutoScalingAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSApplicationAutoScalingAsyncClient client-configuration))
  (^AWSApplicationAutoScalingAsyncClient []
    (new AWSApplicationAutoScalingAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingAsyncClientBuilder`"
  (^com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingAsyncClientBuilder []
    (AWSApplicationAutoScalingAsyncClient/asyncBuilder )))

(defn describe-scaling-policies-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingPoliciesRequest request]
    (-> this (.describeScalingPoliciesAsync request))))

(defn deregister-scalable-target-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterScalableTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterScalableTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DeregisterScalableTargetRequest request]
    (-> this (.deregisterScalableTargetAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSApplicationAutoScalingAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-scaling-policy-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScalingPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DeleteScalingPolicyRequest request]
    (-> this (.deleteScalingPolicyAsync request))))

(defn put-scheduled-action-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.PutScheduledActionResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScheduledActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.PutScheduledActionRequest request]
    (-> this (.putScheduledActionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSApplicationAutoScalingAsyncClient this]
    (-> this (.shutdown))))

(defn register-scalable-target-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterScalableTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerScalableTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.RegisterScalableTargetRequest request]
    (-> this (.registerScalableTargetAsync request))))

(defn delete-scheduled-action-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScheduledAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScheduledActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DeleteScheduledActionRequest request]
    (-> this (.deleteScheduledActionAsync request))))

(defn put-scaling-policy-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutScalingPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putScalingPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.PutScalingPolicyRequest request]
    (-> this (.putScalingPolicyAsync request))))

(defn describe-scaling-activities-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingActivitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalingActivitiesRequest request]
    (-> this (.describeScalingActivitiesAsync request))))

(defn describe-scalable-targets-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalableTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalableTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScalableTargetsRequest request]
    (-> this (.describeScalableTargetsAsync request))))

(defn describe-scheduled-actions-async
  "Description copied from interface: AWSApplicationAutoScalingAsync

  request - `com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationAutoScalingAsyncClient this ^com.amazonaws.services.applicationautoscaling.model.DescribeScheduledActionsRequest request]
    (-> this (.describeScheduledActionsAsync request))))

