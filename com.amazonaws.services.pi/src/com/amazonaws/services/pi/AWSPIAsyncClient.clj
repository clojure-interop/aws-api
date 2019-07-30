(ns com.amazonaws.services.pi.AWSPIAsyncClient
  "Client for accessing AWS PI asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.


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
  (:import [com.amazonaws.services.pi AWSPIAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.pi.AWSPIAsyncClientBuilder`"
  (^com.amazonaws.services.pi.AWSPIAsyncClientBuilder []
    (AWSPIAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSPIAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-dimension-keys-async
  "Description copied from interface: AWSPIAsync

  request - `com.amazonaws.services.pi.model.DescribeDimensionKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDimensionKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pi.model.DescribeDimensionKeysResult>`"
  (^java.util.concurrent.Future [^AWSPIAsyncClient this ^com.amazonaws.services.pi.model.DescribeDimensionKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDimensionKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSPIAsyncClient this ^com.amazonaws.services.pi.model.DescribeDimensionKeysRequest request]
    (-> this (.describeDimensionKeysAsync request))))

(defn get-resource-metrics-async
  "Description copied from interface: AWSPIAsync

  request - `com.amazonaws.services.pi.model.GetResourceMetricsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceMetrics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pi.model.GetResourceMetricsResult>`"
  (^java.util.concurrent.Future [^AWSPIAsyncClient this ^com.amazonaws.services.pi.model.GetResourceMetricsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceMetricsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSPIAsyncClient this ^com.amazonaws.services.pi.model.GetResourceMetricsRequest request]
    (-> this (.getResourceMetricsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSPIAsyncClient this]
    (-> this (.shutdown))))

