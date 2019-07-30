(ns com.amazonaws.services.pi.AWSPIClient
  "Client for accessing AWS PI. All service calls made using this client are blocking, and will not return until the
  service call completes.


  AWS Performance Insights enables you to monitor and explore different dimensions of database load based on data
  captured from a running RDS instance. The guide provides detailed information about Performance Insights data types,
  parameters and errors. For more information about Performance Insights capabilities see Using Amazon RDS Performance
  Insights  in the Amazon RDS User Guide.


  The AWS Performance Insights API provides visibility into the performance of your RDS instance, when Performance
  Insights is enabled for supported engine types. While Amazon CloudWatch provides the authoritative source for AWS
  service vended monitoring metrics, AWS Performance Insights offers a domain-specific view of database load measured
  as Average Active Sessions and provided to API consumers as a 2-dimensional time-series dataset. The time dimension
  of the data provides DB load data for each time point in the queried time range, and each time point decomposes
  overall load in relation to the requested dimensions, such as SQL, Wait-event, User or Host, measured at that time
  point."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pi AWSPIClient]))

(defn *builder
  "returns: `com.amazonaws.services.pi.AWSPIClientBuilder`"
  (^com.amazonaws.services.pi.AWSPIClientBuilder []
    (AWSPIClient/builder )))

(defn describe-dimension-keys
  "For a specific time period, retrieve the top N dimension keys for a metric.

  request - `com.amazonaws.services.pi.model.DescribeDimensionKeysRequest`

  returns: Result of the DescribeDimensionKeys operation returned by the service. - `com.amazonaws.services.pi.model.DescribeDimensionKeysResult`

  throws: com.amazonaws.services.pi.model.InvalidArgumentException - One of the arguments provided is invalid for this request."
  (^com.amazonaws.services.pi.model.DescribeDimensionKeysResult [^AWSPIClient this ^com.amazonaws.services.pi.model.DescribeDimensionKeysRequest request]
    (-> this (.describeDimensionKeys request))))

(defn get-resource-metrics
  "Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific
   dimension groups and dimensions, and provide aggregation and filtering criteria for each group.

  request - `com.amazonaws.services.pi.model.GetResourceMetricsRequest`

  returns: Result of the GetResourceMetrics operation returned by the service. - `com.amazonaws.services.pi.model.GetResourceMetricsResult`

  throws: com.amazonaws.services.pi.model.InvalidArgumentException - One of the arguments provided is invalid for this request."
  (^com.amazonaws.services.pi.model.GetResourceMetricsResult [^AWSPIClient this ^com.amazonaws.services.pi.model.GetResourceMetricsRequest request]
    (-> this (.getResourceMetrics request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSPIClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

