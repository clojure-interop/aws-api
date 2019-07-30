(ns com.amazonaws.services.autoscalingplans.AWSAutoScalingPlans
  "Interface for accessing AWS Auto Scaling Plans.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSAutoScalingPlans instead.


  AWS Auto Scaling

  Use AWS Auto Scaling to quickly discover all the scalable AWS resources for your application and configure dynamic
  scaling and predictive scaling for your resources using scaling plans. Use this service in conjunction with the
  Amazon EC2 Auto Scaling, Application Auto Scaling, Amazon CloudWatch, and AWS CloudFormation services.


  Currently, predictive scaling is only available for Amazon EC2 Auto Scaling groups.


  For more information about AWS Auto Scaling, including information about granting IAM users required permissions for
  AWS Auto Scaling actions, see the AWS Auto Scaling User
  Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscalingplans AWSAutoScalingPlans]))

(defn create-scaling-plan
  "Creates a scaling plan.

  create-scaling-plan-request - `com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest`

  returns: Result of the CreateScalingPlan operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult`

  throws: com.amazonaws.services.autoscalingplans.model.ValidationException - An exception was thrown for a validation issue. Review the parameters provided."
  (^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanResult [^AWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.CreateScalingPlanRequest create-scaling-plan-request]
    (-> this (.createScalingPlan create-scaling-plan-request))))

(defn delete-scaling-plan
  "Deletes the specified scaling plan.


   Deleting a scaling plan deletes the underlying ScalingInstruction for all of the scalable resources that
   are covered by the plan.


   If the plan has launched resources or has scaling activities in progress, you must delete those resources
   separately.

  delete-scaling-plan-request - `com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest`

  returns: Result of the DeleteScalingPlan operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult`

  throws: com.amazonaws.services.autoscalingplans.model.ValidationException - An exception was thrown for a validation issue. Review the parameters provided."
  (^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanResult [^AWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.DeleteScalingPlanRequest delete-scaling-plan-request]
    (-> this (.deleteScalingPlan delete-scaling-plan-request))))

(defn describe-scaling-plan-resources
  "Describes the scalable resources in the specified scaling plan.

  describe-scaling-plan-resources-request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest`

  returns: Result of the DescribeScalingPlanResources operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult`

  throws: com.amazonaws.services.autoscalingplans.model.ValidationException - An exception was thrown for a validation issue. Review the parameters provided."
  (^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesResult [^AWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlanResourcesRequest describe-scaling-plan-resources-request]
    (-> this (.describeScalingPlanResources describe-scaling-plan-resources-request))))

(defn describe-scaling-plans
  "Describes one or more of your scaling plans.

  describe-scaling-plans-request - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest`

  returns: Result of the DescribeScalingPlans operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult`

  throws: com.amazonaws.services.autoscalingplans.model.ValidationException - An exception was thrown for a validation issue. Review the parameters provided."
  (^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansResult [^AWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.DescribeScalingPlansRequest describe-scaling-plans-request]
    (-> this (.describeScalingPlans describe-scaling-plans-request))))

(defn get-scaling-plan-resource-forecast-data
  "Retrieves the forecast data for a scalable resource.


   Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data
   points from a specified CloudWatch load metric. Data points are available for up to 56 days.

  get-scaling-plan-resource-forecast-data-request - `com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest`

  returns: Result of the GetScalingPlanResourceForecastData operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataResult`

  throws: com.amazonaws.services.autoscalingplans.model.ValidationException - An exception was thrown for a validation issue. Review the parameters provided."
  (^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataResult [^AWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.GetScalingPlanResourceForecastDataRequest get-scaling-plan-resource-forecast-data-request]
    (-> this (.getScalingPlanResourceForecastData get-scaling-plan-resource-forecast-data-request))))

(defn update-scaling-plan
  "Updates the specified scaling plan.


   You cannot update a scaling plan if it is in the process of being created, updated, or deleted.

  update-scaling-plan-request - `com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest`

  returns: Result of the UpdateScalingPlan operation returned by the service. - `com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanResult`

  throws: com.amazonaws.services.autoscalingplans.model.ValidationException - An exception was thrown for a validation issue. Review the parameters provided."
  (^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanResult [^AWSAutoScalingPlans this ^com.amazonaws.services.autoscalingplans.model.UpdateScalingPlanRequest update-scaling-plan-request]
    (-> this (.updateScalingPlan update-scaling-plan-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSAutoScalingPlans this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSAutoScalingPlans this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

