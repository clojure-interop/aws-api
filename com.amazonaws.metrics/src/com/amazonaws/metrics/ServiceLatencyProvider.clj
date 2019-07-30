(ns com.amazonaws.metrics.ServiceLatencyProvider
  "ApiCallLatency metric information provider."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics ServiceLatencyProvider]))

(defn ->service-latency-provider
  "Constructor.

  type - `com.amazonaws.metrics.ServiceMetricType`"
  (^ServiceLatencyProvider [^com.amazonaws.metrics.ServiceMetricType type]
    (new ServiceLatencyProvider type)))

(defn get-service-metric-type
  "returns: `com.amazonaws.metrics.ServiceMetricType`"
  (^com.amazonaws.metrics.ServiceMetricType [^ServiceLatencyProvider this]
    (-> this (.getServiceMetricType))))

(defn end-timing
  "Ends the timing.  Must not be called more than once.

  returns: `com.amazonaws.metrics.ServiceLatencyProvider`"
  (^com.amazonaws.metrics.ServiceLatencyProvider [^ServiceLatencyProvider this]
    (-> this (.endTiming))))

(defn get-duration-milli
  "returns: `double`"
  (^Double [^ServiceLatencyProvider this]
    (-> this (.getDurationMilli))))

(defn get-provider-id
  "returns: `java.lang.String`"
  (^java.lang.String [^ServiceLatencyProvider this]
    (-> this (.getProviderId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ServiceLatencyProvider this]
    (-> this (.toString))))

