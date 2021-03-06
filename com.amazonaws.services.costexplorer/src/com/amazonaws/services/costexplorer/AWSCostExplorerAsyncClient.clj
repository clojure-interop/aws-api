(ns com.amazonaws.services.costexplorer.AWSCostExplorerAsyncClient
  "Client for accessing AWS Cost Explorer asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  The Cost Explorer API enables you to programmatically query your cost and usage data. You can query for aggregated
  data such as total monthly costs or total daily usage. You can also query for granular data, such as the number of
  daily write operations for Amazon DynamoDB database tables in your production environment.


  Service Endpoint


  The Cost Explorer API provides the following endpoint:




  https://ce.us-east-1.amazonaws.com




  For information about costs associated with the Cost Explorer API, see AWS Cost Management Pricing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.costexplorer AWSCostExplorerAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.costexplorer.AWSCostExplorerAsyncClientBuilder`"
  (^com.amazonaws.services.costexplorer.AWSCostExplorerAsyncClientBuilder []
    (AWSCostExplorerAsyncClient/asyncBuilder )))

(defn get-reservation-purchase-recommendation-async
  "Description copied from interface: AWSCostExplorerAsync

  request - `com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservationPurchaseRecommendation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservationPurchaseRecommendationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest request]
    (-> this (.getReservationPurchaseRecommendationAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCostExplorerAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-reservation-utilization-async
  "Description copied from interface: AWSCostExplorerAsync

  request - `com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservationUtilization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservationUtilizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest request]
    (-> this (.getReservationUtilizationAsync request))))

(defn get-cost-forecast-async
  "Description copied from interface: AWSCostExplorerAsync

  request - `com.amazonaws.services.costexplorer.model.GetCostForecastRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCostForecast operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetCostForecastResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetCostForecastRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCostForecastAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetCostForecastRequest request]
    (-> this (.getCostForecastAsync request))))

(defn get-usage-forecast-async
  "Description copied from interface: AWSCostExplorerAsync

  request - `com.amazonaws.services.costexplorer.model.GetUsageForecastRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUsageForecast operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetUsageForecastResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetUsageForecastRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUsageForecastAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetUsageForecastRequest request]
    (-> this (.getUsageForecastAsync request))))

(defn get-reservation-coverage-async
  "Description copied from interface: AWSCostExplorerAsync

  request - You can use the following request parameters to query for how much of your instance usage a reservation covered. - `com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservationCoverage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetReservationCoverageResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservationCoverageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest request]
    (-> this (.getReservationCoverageAsync request))))

(defn get-rightsizing-recommendation-async
  "Description copied from interface: AWSCostExplorerAsync

  request - `com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRightsizingRecommendation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRightsizingRecommendationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest request]
    (-> this (.getRightsizingRecommendationAsync request))))

(defn get-cost-and-usage-async
  "Description copied from interface: AWSCostExplorerAsync

  request - `com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCostAndUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetCostAndUsageResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCostAndUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest request]
    (-> this (.getCostAndUsageAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCostExplorerAsyncClient this]
    (-> this (.shutdown))))

(defn get-dimension-values-async
  "Description copied from interface: AWSCostExplorerAsync

  request - `com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDimensionValues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetDimensionValuesResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDimensionValuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest request]
    (-> this (.getDimensionValuesAsync request))))

(defn get-tags-async
  "Description copied from interface: AWSCostExplorerAsync

  request - `com.amazonaws.services.costexplorer.model.GetTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costexplorer.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostExplorerAsyncClient this ^com.amazonaws.services.costexplorer.model.GetTagsRequest request]
    (-> this (.getTagsAsync request))))

