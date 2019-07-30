(ns com.amazonaws.services.pi.AbstractAWSPI
  "Abstract implementation of AWSPI. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pi AbstractAWSPI]))

(defn describe-dimension-keys
  "Description copied from interface: AWSPI

  request - `com.amazonaws.services.pi.model.DescribeDimensionKeysRequest`

  returns: Result of the DescribeDimensionKeys operation returned by the service. - `com.amazonaws.services.pi.model.DescribeDimensionKeysResult`"
  (^com.amazonaws.services.pi.model.DescribeDimensionKeysResult [^AbstractAWSPI this ^com.amazonaws.services.pi.model.DescribeDimensionKeysRequest request]
    (-> this (.describeDimensionKeys request))))

(defn get-resource-metrics
  "Description copied from interface: AWSPI

  request - `com.amazonaws.services.pi.model.GetResourceMetricsRequest`

  returns: Result of the GetResourceMetrics operation returned by the service. - `com.amazonaws.services.pi.model.GetResourceMetricsResult`"
  (^com.amazonaws.services.pi.model.GetResourceMetricsResult [^AbstractAWSPI this ^com.amazonaws.services.pi.model.GetResourceMetricsRequest request]
    (-> this (.getResourceMetrics request))))

(defn shutdown
  "Description copied from interface: AWSPI"
  ([^AbstractAWSPI this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSPI

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSPI this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

