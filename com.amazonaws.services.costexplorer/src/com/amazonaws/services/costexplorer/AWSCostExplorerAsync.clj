(ns com.amazonaws.services.costexplorer.AWSCostExplorerAsync
  "Interface for accessing AWS Cost Explorer asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCostExplorerAsync instead.



  The Cost Explorer API enables you to programmatically query your cost and usage data. You can query for aggregated
  data such as total monthly costs or total daily usage. You can also query for granular data, such as the number of
  daily write operations for Amazon DynamoDB database tables in your production environment.


  Service Endpoint


  The Cost Explorer API provides the following endpoint:




  https://ce.us-east-1.amazonaws.com




  For information about costs associated with the Cost Explorer API, see AWS Cost Management Pricing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.costexplorer AWSCostExplorerAsync]))

(defn get-reservation-purchase-recommendation-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservationPurchaseRecommendation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest get-reservation-purchase-recommendation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservationPurchaseRecommendationAsync get-reservation-purchase-recommendation-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest get-reservation-purchase-recommendation-request]
    (-> this (.getReservationPurchaseRecommendationAsync get-reservation-purchase-recommendation-request))))

(defn get-reservation-utilization-async
  "Retrieves the reservation utilization for your account. Master accounts in an organization have access to member
   accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to
   determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID.

  get-reservation-utilization-request - `com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservationUtilization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest get-reservation-utilization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservationUtilizationAsync get-reservation-utilization-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest get-reservation-utilization-request]
    (-> this (.getReservationUtilizationAsync get-reservation-utilization-request))))

(defn get-cost-forecast-async
  "Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period
   that you select, based on your past costs.

  get-cost-forecast-request - `com.amazonaws.services.costexplorer.model.GetCostForecastRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCostForecast operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetCostForecastResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetCostForecastRequest get-cost-forecast-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCostForecastAsync get-cost-forecast-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetCostForecastRequest get-cost-forecast-request]
    (-> this (.getCostForecastAsync get-cost-forecast-request))))

(defn get-usage-forecast-async
  "Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period
   that you select, based on your past usage.

  get-usage-forecast-request - `com.amazonaws.services.costexplorer.model.GetUsageForecastRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsageForecast operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetUsageForecastResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetUsageForecastRequest get-usage-forecast-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsageForecastAsync get-usage-forecast-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetUsageForecastRequest get-usage-forecast-request]
    (-> this (.getUsageForecastAsync get-usage-forecast-request))))

(defn get-reservation-coverage-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservationCoverage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetReservationCoverageResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest get-reservation-coverage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservationCoverageAsync get-reservation-coverage-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest get-reservation-coverage-request]
    (-> this (.getReservationCoverageAsync get-reservation-coverage-request))))

(defn get-rightsizing-recommendation-async
  "Creates recommendations that helps you save cost by identifying idle and underutilized Amazon EC2 instances.


   Recommendations are generated to either downsize or terminate instances, along with providing savings detail and
   metrics. For details on calculation and function, see Optimizing Your Cost with
   Rightsizing Recommendations.

  get-rightsizing-recommendation-request - `com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRightsizingRecommendation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest get-rightsizing-recommendation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRightsizingRecommendationAsync get-rightsizing-recommendation-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest get-rightsizing-recommendation-request]
    (-> this (.getRightsizingRecommendationAsync get-rightsizing-recommendation-request))))

(defn get-cost-and-usage-async
  "Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as
   BlendedCosts or UsageQuantity, that you want the request to return. You can also filter
   and group your data by various dimensions, such as SERVICE or AZ, in a specific time
   range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all
   member accounts.

  get-cost-and-usage-request - `com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCostAndUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetCostAndUsageResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest get-cost-and-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCostAndUsageAsync get-cost-and-usage-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest get-cost-and-usage-request]
    (-> this (.getCostAndUsageAsync get-cost-and-usage-request))))

(defn get-dimension-values-async
  "Retrieves all available filter values for a specified filter over a period of time. You can search the dimension
   values for an arbitrary string.

  get-dimension-values-request - `com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDimensionValues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetDimensionValuesResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest get-dimension-values-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDimensionValuesAsync get-dimension-values-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest get-dimension-values-request]
    (-> this (.getDimensionValuesAsync get-dimension-values-request))))

(defn get-tags-async
  "Queries for available tag keys and tag values for a specified period. You can search the tag values for an
   arbitrary string.

  get-tags-request - `com.amazonaws.services.costexplorer.model.GetTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetTagsRequest get-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync get-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsync this ^com.amazonaws.services.costexplorer.model.GetTagsRequest get-tags-request]
    (-> this (.getTagsAsync get-tags-request))))

