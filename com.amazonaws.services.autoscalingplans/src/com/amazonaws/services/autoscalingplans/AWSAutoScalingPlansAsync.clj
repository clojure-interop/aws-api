(ns com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansAsync
  "Interface for accessing AWS Auto Scaling Plans asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSAutoScalingPlansAsync instead.


  AWS Auto Scaling

  Use AWS Auto Scaling to quickly discover all the scalable AWS resources for your application and configure dynamic
  scaling and predictive scaling for your resources using scaling plans. Use this service in conjunction with the
  Amazon EC2 Auto Scaling, Application Auto Scaling, Amazon CloudWatch, and AWS CloudFormation services.


  Currently, predictive scaling is only available for Amazon EC2 Auto Scaling groups.


  For more information about AWS Auto Scaling, including information about granting IAM users required permissions for
  AWS Auto Scaling actions, see the AWS Auto Scaling User
  Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscalingplans AWSAutoScalingPlansAsync]))

(defn create-scaling-plan-async
  "Creates a scaling plan.

  create-scaling-plan-request - `com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateScalingPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest create-scaling-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createScalingPlanAsync create-scaling-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest create-scaling-plan-request]
    (-> this (.createScalingPlanAsync create-scaling-plan-request))))

(defn delete-scaling-plan-async
  "Deletes the specified scaling plan.


   Deleting a scaling plan deletes the underlying ScalingInstruction for all of the scalable resources that
   are covered by the plan.


   If the plan has launched resources or has scaling activities in progress, you must delete those resources
   separately.

  delete-scaling-plan-request - `com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScalingPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest delete-scaling-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScalingPlanAsync delete-scaling-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest delete-scaling-plan-request]
    (-> this (.deleteScalingPlanAsync delete-scaling-plan-request))))

(defn describe-scaling-plan-resources-async
  "Describes the scalable resources in the specified scaling plan.

  describe-scaling-plan-resources-request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPlanResources operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest describe-scaling-plan-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPlanResourcesAsync describe-scaling-plan-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest describe-scaling-plan-resources-request]
    (-> this (.describeScalingPlanResourcesAsync describe-scaling-plan-resources-request))))

(defn describe-scaling-plans-async
  "Describes one or more of your scaling plans.

  describe-scaling-plans-request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPlans operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest describe-scaling-plans-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPlansAsync describe-scaling-plans-request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest describe-scaling-plans-request]
    (-> this (.describeScalingPlansAsync describe-scaling-plans-request))))

(defn get-scaling-plan-resource-forecast-data-async
  "Retrieves the forecast data for a scalable resource.


   Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data
   points from a specified CloudWatch load metric. Data points are available for up to 56 days.

  get-scaling-plan-resource-forecast-data-request - `com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetScalingPlanResourceForecastData operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest get-scaling-plan-resource-forecast-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getScalingPlanResourceForecastDataAsync get-scaling-plan-resource-forecast-data-request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest get-scaling-plan-resource-forecast-data-request]
    (-> this (.getScalingPlanResourceForecastDataAsync get-scaling-plan-resource-forecast-data-request))))

(defn update-scaling-plan-async
  "Updates the specified scaling plan.


   You cannot update a scaling plan if it is in the process of being created, updated, or deleted.

  update-scaling-plan-request - `com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateScalingPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanResult>`"
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest update-scaling-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateScalingPlanAsync update-scaling-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest update-scaling-plan-request]
    (-> this (.updateScalingPlanAsync update-scaling-plan-request))))

