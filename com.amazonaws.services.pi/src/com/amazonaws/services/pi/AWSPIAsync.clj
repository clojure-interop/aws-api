(ns com.amazonaws.services.pi.AWSPIAsync
  "Interface for accessing AWS PI asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSPIAsync instead.



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
  (:import [com.amazonaws.services.pi AWSPIAsync]))

(defn describe-dimension-keys-async
  "For a specific time period, retrieve the top N dimension keys for a metric.

  describe-dimension-keys-request - `com.amazonaws.services.pi.model.DescribeDimensionKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDimensionKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pi.model.DescribeDimensionKeysResult>`"
  (^java.util.concurrent.Future [^AWSPIAsync this ^com.amazonaws.services.pi.model.DescribeDimensionKeysRequest describe-dimension-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDimensionKeysAsync describe-dimension-keys-request async-handler)))
  (^java.util.concurrent.Future [^AWSPIAsync this ^com.amazonaws.services.pi.model.DescribeDimensionKeysRequest describe-dimension-keys-request]
    (-> this (.describeDimensionKeysAsync describe-dimension-keys-request))))

(defn get-resource-metrics-async
  "Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific
   dimension groups and dimensions, and provide aggregation and filtering criteria for each group.

  get-resource-metrics-request - `com.amazonaws.services.pi.model.GetResourceMetricsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceMetrics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pi.model.GetResourceMetricsResult>`"
  (^java.util.concurrent.Future [^AWSPIAsync this ^com.amazonaws.services.pi.model.GetResourceMetricsRequest get-resource-metrics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceMetricsAsync get-resource-metrics-request async-handler)))
  (^java.util.concurrent.Future [^AWSPIAsync this ^com.amazonaws.services.pi.model.GetResourceMetricsRequest get-resource-metrics-request]
    (-> this (.getResourceMetricsAsync get-resource-metrics-request))))

