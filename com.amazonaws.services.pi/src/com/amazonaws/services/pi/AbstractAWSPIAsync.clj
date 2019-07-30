(ns com.amazonaws.services.pi.AbstractAWSPIAsync
  "Abstract implementation of AWSPIAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pi AbstractAWSPIAsync]))

(defn describe-dimension-keys-async
  "Description copied from interface: AWSPIAsync

  request - `com.amazonaws.services.pi.model.DescribeDimensionKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDimensionKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pi.model.DescribeDimensionKeysResult>`"
  (^java.util.concurrent.Future [^AbstractAWSPIAsync this ^com.amazonaws.services.pi.model.DescribeDimensionKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDimensionKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSPIAsync this ^com.amazonaws.services.pi.model.DescribeDimensionKeysRequest request]
    (-> this (.describeDimensionKeysAsync request))))

(defn get-resource-metrics-async
  "Description copied from interface: AWSPIAsync

  request - `com.amazonaws.services.pi.model.GetResourceMetricsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceMetrics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pi.model.GetResourceMetricsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSPIAsync this ^com.amazonaws.services.pi.model.GetResourceMetricsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceMetricsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSPIAsync this ^com.amazonaws.services.pi.model.GetResourceMetricsRequest request]
    (-> this (.getResourceMetricsAsync request))))

