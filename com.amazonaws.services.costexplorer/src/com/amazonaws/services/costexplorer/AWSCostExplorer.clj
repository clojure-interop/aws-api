(ns com.amazonaws.services.costexplorer.AWSCostExplorer
  "Interface for accessing AWS Cost Explorer.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCostExplorer instead.



  The Cost Explorer API enables you to programmatically query your cost and usage data. You can query for aggregated
  data such as total monthly costs or total daily usage. You can also query for granular data, such as the number of
  daily write operations for Amazon DynamoDB database tables in your production environment.


  Service Endpoint


  The Cost Explorer API provides the following endpoint:




  https://ce.us-east-1.amazonaws.com




  For information about costs associated with the Cost Explorer API, see AWS Cost Management Pricing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.costexplorer AWSCostExplorer]))

(defn get-usage-forecast
  "Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period
   that you select, based on your past usage.

  get-usage-forecast-request - `com.amazonaws.services.costexplorer.model.GetUsageForecastRequest`

  returns: Result of the GetUsageForecast operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetUsageForecastResult`

  throws: com.amazonaws.services.costexplorer.model.LimitExceededException - You made too many calls in a short period of time. Try again later."
  (^com.amazonaws.services.costexplorer.model.GetUsageForecastResult [^AWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetUsageForecastRequest get-usage-forecast-request]
    (-> this (.getUsageForecast get-usage-forecast-request))))

(defn get-reservation-coverage
  "Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic
   Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a
   reservation. An organization's master account can see the coverage of the associated member accounts. For any
   time period, you can filter data about reservation usage by the following dimensions:




   AZ




   CACHE_ENGINE




   DATABASE_ENGINE




   DEPLOYMENT_OPTION




   INSTANCE_TYPE




   LINKED_ACCOUNT




   OPERATING_SYSTEM




   PLATFORM




   REGION




   SERVICE




   TAG




   TENANCY




   To determine valid values for a dimension, use the GetDimensionValues operation.

  get-reservation-coverage-request - You can use the following request parameters to query for how much of your instance usage a reservation covered. - `com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest`

  returns: Result of the GetReservationCoverage operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetReservationCoverageResult`

  throws: com.amazonaws.services.costexplorer.model.LimitExceededException - You made too many calls in a short period of time. Try again later."
  (^com.amazonaws.services.costexplorer.model.GetReservationCoverageResult [^AWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest get-reservation-coverage-request]
    (-> this (.getReservationCoverage get-reservation-coverage-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSCostExplorer this]
    (-> this (.shutdown))))

(defn get-tags
  "Queries for available tag keys and tag values for a specified period. You can search the tag values for an
   arbitrary string.

  get-tags-request - `com.amazonaws.services.costexplorer.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetTagsResult`

  throws: com.amazonaws.services.costexplorer.model.LimitExceededException - You made too many calls in a short period of time. Try again later."
  (^com.amazonaws.services.costexplorer.model.GetTagsResult [^AWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetTagsRequest get-tags-request]
    (-> this (.getTags get-tags-request))))

(defn get-cost-and-usage
  "Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as
   BlendedCosts or UsageQuantity, that you want the request to return. You can also filter
   and group your data by various dimensions, such as SERVICE or AZ, in a specific time
   range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all
   member accounts.

  get-cost-and-usage-request - `com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest`

  returns: Result of the GetCostAndUsage operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetCostAndUsageResult`

  throws: com.amazonaws.services.costexplorer.model.LimitExceededException - You made too many calls in a short period of time. Try again later."
  (^com.amazonaws.services.costexplorer.model.GetCostAndUsageResult [^AWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest get-cost-and-usage-request]
    (-> this (.getCostAndUsage get-cost-and-usage-request))))

(defn get-reservation-utilization
  "Retrieves the reservation utilization for your account. Master accounts in an organization have access to member
   accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to
   determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID.

  get-reservation-utilization-request - `com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest`

  returns: Result of the GetReservationUtilization operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult`

  throws: com.amazonaws.services.costexplorer.model.LimitExceededException - You made too many calls in a short period of time. Try again later."
  (^com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult [^AWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest get-reservation-utilization-request]
    (-> this (.getReservationUtilization get-reservation-utilization-request))))

(defn get-cost-forecast
  "Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period
   that you select, based on your past costs.

  get-cost-forecast-request - `com.amazonaws.services.costexplorer.model.GetCostForecastRequest`

  returns: Result of the GetCostForecast operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetCostForecastResult`

  throws: com.amazonaws.services.costexplorer.model.LimitExceededException - You made too many calls in a short period of time. Try again later."
  (^com.amazonaws.services.costexplorer.model.GetCostForecastResult [^AWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetCostForecastRequest get-cost-forecast-request]
    (-> this (.getCostForecast get-cost-forecast-request))))

(defn get-rightsizing-recommendation
  "Creates recommendations that helps you save cost by identifying idle and underutilized Amazon EC2 instances.


   Recommendations are generated to either downsize or terminate instances, along with providing savings detail and
   metrics. For details on calculation and function, see Optimizing Your Cost with
   Rightsizing Recommendations.

  get-rightsizing-recommendation-request - `com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest`

  returns: Result of the GetRightsizingRecommendation operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationResult`

  throws: com.amazonaws.services.costexplorer.model.LimitExceededException - You made too many calls in a short period of time. Try again later."
  (^com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationResult [^AWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest get-rightsizing-recommendation-request]
    (-> this (.getRightsizingRecommendation get-rightsizing-recommendation-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCostExplorer this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-dimension-values
  "Retrieves all available filter values for a specified filter over a period of time. You can search the dimension
   values for an arbitrary string.

  get-dimension-values-request - `com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest`

  returns: Result of the GetDimensionValues operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetDimensionValuesResult`

  throws: com.amazonaws.services.costexplorer.model.LimitExceededException - You made too many calls in a short period of time. Try again later."
  (^com.amazonaws.services.costexplorer.model.GetDimensionValuesResult [^AWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest get-dimension-values-request]
    (-> this (.getDimensionValues get-dimension-values-request))))

(defn get-reservation-purchase-recommendation
  "Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs.
   Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing.


   AWS generates your recommendations by identifying your On-Demand usage during a specific time period and
   collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it
   simulates every combination of reservations in each category of usage to identify the best number of each type of
   RI to purchase to maximize your estimated savings.


   For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US
   West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family
   usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a
   size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size
   that you want. For this example, your RI recommendation would be for c4.large because that is the
   smallest size instance in the c4 instance family.

  get-reservation-purchase-recommendation-request - `com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest`

  returns: Result of the GetReservationPurchaseRecommendation operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult`

  throws: com.amazonaws.services.costexplorer.model.LimitExceededException - You made too many calls in a short period of time. Try again later."
  (^com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult [^AWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest get-reservation-purchase-recommendation-request]
    (-> this (.getReservationPurchaseRecommendation get-reservation-purchase-recommendation-request))))

