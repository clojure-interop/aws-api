(ns com.amazonaws.services.autoscalingplans.AbstractAWSAutoScalingPlans
  "Abstract implementation of AWSAutoScalingPlans. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscalingplans AbstractAWSAutoScalingPlans]))

(defn create-scaling-plan
  "Description copied from interface: AWSAutoScalingPlans

  request - `com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest`

  returns: Result of the CreateScalingPlan operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult`"
  (^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult [^AbstractAWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest request]
    (-> this (.createScalingPlan request))))

(defn delete-scaling-plan
  "Description copied from interface: AWSAutoScalingPlans

  request - `com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest`

  returns: Result of the DeleteScalingPlan operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult`"
  (^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult [^AbstractAWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest request]
    (-> this (.deleteScalingPlan request))))

(defn describe-scaling-plan-resources
  "Description copied from interface: AWSAutoScalingPlans

  request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest`

  returns: Result of the DescribeScalingPlanResources operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult`"
  (^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult [^AbstractAWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest request]
    (-> this (.describeScalingPlanResources request))))

(defn describe-scaling-plans
  "Description copied from interface: AWSAutoScalingPlans

  request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest`

  returns: Result of the DescribeScalingPlans operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult`"
  (^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult [^AbstractAWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest request]
    (-> this (.describeScalingPlans request))))

(defn get-scaling-plan-resource-forecast-data
  "Description copied from interface: AWSAutoScalingPlans

  request - `com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest`

  returns: Result of the GetScalingPlanResourceForecastData operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataResult`"
  (^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataResult [^AbstractAWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest request]
    (-> this (.getScalingPlanResourceForecastData request))))

(defn update-scaling-plan
  "Description copied from interface: AWSAutoScalingPlans

  request - `com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest`

  returns: Result of the UpdateScalingPlan operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanResult`"
  (^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanResult [^AbstractAWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest request]
    (-> this (.updateScalingPlan request))))

(defn shutdown
  "Description copied from interface: AWSAutoScalingPlans"
  ([^AbstractAWSAutoScalingPlans this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSAutoScalingPlans

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSAutoScalingPlans this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

