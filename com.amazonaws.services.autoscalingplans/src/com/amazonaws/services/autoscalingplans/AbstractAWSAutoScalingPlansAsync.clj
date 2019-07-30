(ns com.amazonaws.services.autoscalingplans.AbstractAWSAutoScalingPlansAsync
  "Abstract implementation of AWSAutoScalingPlansAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscalingplans AbstractAWSAutoScalingPlansAsync]))

(defn create-scaling-plan-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateScalingPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createScalingPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest request]
    (-> this (.createScalingPlanAsync request))))

(defn delete-scaling-plan-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScalingPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScalingPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest request]
    (-> this (.deleteScalingPlanAsync request))))

(defn describe-scaling-plan-resources-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPlanResources operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPlanResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest request]
    (-> this (.describeScalingPlanResourcesAsync request))))

(defn describe-scaling-plans-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScalingPlans operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScalingPlansAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest request]
    (-> this (.describeScalingPlansAsync request))))

(defn get-scaling-plan-resource-forecast-data-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetScalingPlanResourceForecastData operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getScalingPlanResourceForecastDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest request]
    (-> this (.getScalingPlanResourceForecastDataAsync request))))

(defn update-scaling-plan-async
  "Description copied from interface: AWSAutoScalingPlansAsync

  request - `com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateScalingPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanResult>`"
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateScalingPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSAutoScalingPlansAsync this ^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest request]
    (-> this (.updateScalingPlanAsync request))))

