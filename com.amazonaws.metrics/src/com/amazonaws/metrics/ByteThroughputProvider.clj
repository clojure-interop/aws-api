(ns com.amazonaws.metrics.ByteThroughputProvider
  "Byte throughput metric information provider."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics ByteThroughputProvider]))

(defn get-throughput-metric-type
  "returns: `com.amazonaws.metrics.ThroughputMetricType`"
  (^com.amazonaws.metrics.ThroughputMetricType [^ByteThroughputProvider this]
    (-> this (.getThroughputMetricType))))

(defn get-byte-count
  "returns: `int`"
  (^Integer [^ByteThroughputProvider this]
    (-> this (.getByteCount))))

(defn get-duration-nano
  "returns: `long`"
  (^Long [^ByteThroughputProvider this]
    (-> this (.getDurationNano))))

(defn get-provider-id
  "Returns a provider id that can be used to compute the number of active
   byte throughput provider of a specific metric type being active in a
   given time interval.

  returns: `java.lang.String`"
  (^java.lang.String [^ByteThroughputProvider this]
    (-> this (.getProviderId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ByteThroughputProvider this]
    (-> this (.toString))))

