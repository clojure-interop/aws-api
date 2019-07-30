(ns com.amazonaws.services.costexplorer.AbstractAWSCostExplorer
  "Abstract implementation of AWSCostExplorer. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.costexplorer AbstractAWSCostExplorer]))

(defn get-usage-forecast
  "Description copied from interface: AWSCostExplorer

  request - `com.amazonaws.services.costexplorer.model.GetUsageForecastRequest`

  returns: Result of the GetUsageForecast operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetUsageForecastResult`"
  (^com.amazonaws.services.costexplorer.model.GetUsageForecastResult [^AbstractAWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetUsageForecastRequest request]
    (-> this (.getUsageForecast request))))

(defn get-reservation-coverage
  "Description copied from interface: AWSCostExplorer

  request - You can use the following request parameters to query for how much of your instance usage a reservation covered. - `com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest`

  returns: Result of the GetReservationCoverage operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetReservationCoverageResult`"
  (^com.amazonaws.services.costexplorer.model.GetReservationCoverageResult [^AbstractAWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetReservationCoverageRequest request]
    (-> this (.getReservationCoverage request))))

(defn shutdown
  "Description copied from interface: AWSCostExplorer"
  ([^AbstractAWSCostExplorer this]
    (-> this (.shutdown))))

(defn get-tags
  "Description copied from interface: AWSCostExplorer

  request - `com.amazonaws.services.costexplorer.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetTagsResult`"
  (^com.amazonaws.services.costexplorer.model.GetTagsResult [^AbstractAWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetTagsRequest request]
    (-> this (.getTags request))))

(defn get-cost-and-usage
  "Description copied from interface: AWSCostExplorer

  request - `com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest`

  returns: Result of the GetCostAndUsage operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetCostAndUsageResult`"
  (^com.amazonaws.services.costexplorer.model.GetCostAndUsageResult [^AbstractAWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetCostAndUsageRequest request]
    (-> this (.getCostAndUsage request))))

(defn get-reservation-utilization
  "Description copied from interface: AWSCostExplorer

  request - `com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest`

  returns: Result of the GetReservationUtilization operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult`"
  (^com.amazonaws.services.costexplorer.model.GetReservationUtilizationResult [^AbstractAWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetReservationUtilizationRequest request]
    (-> this (.getReservationUtilization request))))

(defn get-cost-forecast
  "Description copied from interface: AWSCostExplorer

  request - `com.amazonaws.services.costexplorer.model.GetCostForecastRequest`

  returns: Result of the GetCostForecast operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetCostForecastResult`"
  (^com.amazonaws.services.costexplorer.model.GetCostForecastResult [^AbstractAWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetCostForecastRequest request]
    (-> this (.getCostForecast request))))

(defn get-rightsizing-recommendation
  "Description copied from interface: AWSCostExplorer

  request - `com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest`

  returns: Result of the GetRightsizingRecommendation operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationResult`"
  (^com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationResult [^AbstractAWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetRightsizingRecommendationRequest request]
    (-> this (.getRightsizingRecommendation request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCostExplorer

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCostExplorer this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-dimension-values
  "Description copied from interface: AWSCostExplorer

  request - `com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest`

  returns: Result of the GetDimensionValues operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetDimensionValuesResult`"
  (^com.amazonaws.services.costexplorer.model.GetDimensionValuesResult [^AbstractAWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetDimensionValuesRequest request]
    (-> this (.getDimensionValues request))))

(defn get-reservation-purchase-recommendation
  "Description copied from interface: AWSCostExplorer

  request - `com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest`

  returns: Result of the GetReservationPurchaseRecommendation operation returned by the service. - `com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult`"
  (^com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationResult [^AbstractAWSCostExplorer this ^com.amazonaws.services.costexplorer.model.GetReservationPurchaseRecommendationRequest request]
    (-> this (.getReservationPurchaseRecommendation request))))

