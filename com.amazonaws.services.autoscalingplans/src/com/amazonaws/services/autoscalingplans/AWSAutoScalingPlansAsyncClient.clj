(ns com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansAsyncClient
  "Client for accessing AWS Auto Scaling Plans asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Auto Scaling

  Use AWS Auto Scaling to quickly discover all the scalable AWS resources for your application and configure dynamic
  scaling and predictive scaling for your resources using scaling plans. Use this service in conjunction with the
  Amazon EC2 Auto Scaling, Application Auto Scaling, Amazon CloudWatch, and AWS CloudFormation services.


  Currently, predictive scaling is only available for Amazon EC2 Auto Scaling groups.


  For more information about AWS Auto Scaling, including information about granting IAM users required permissions for
  AWS Auto Scaling actions, see the AWS Auto Scaling User
  Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscalingplans AWSAutoScalingPlansAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansAsyncClientBuilder`"
  (^com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansAsyncClientBuilder []
    (AWSAutoScalingPlansAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSAutoScalingPlansAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-scaling-plan-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateScalingPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createScalingPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest request]
    (-> this (.createScalingPlanAsync request))))

(defn delete-scaling-plan-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScalingPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScalingPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest request]
    (-> this (.deleteScalingPlanAsync request))))

(defn describe-scaling-plan-resources-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPlanResources operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPlanResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest request]
    (-> this (.describeScalingPlanResourcesAsync request))))

(defn describe-scaling-plans-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPlans operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPlansAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest request]
    (-> this (.describeScalingPlansAsync request))))

(defn get-scaling-plan-resource-forecast-data-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetScalingPlanResourceForecastData operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getScalingPlanResourceForecastDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest request]
    (-> this (.getScalingPlanResourceForecastDataAsync request))))

(defn update-scaling-plan-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateScalingPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateScalingPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsyncClient this ^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest request]
    (-> this (.updateScalingPlanAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSAutoScalingPlansAsyncClient this]
    (-> this (.shutdown))))

