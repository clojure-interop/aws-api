(ns com.amazonaws.metrics.SimpleThroughputMetricType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics SimpleThroughputMetricType]))

(defn ->simple-throughput-metric-type
  "Constructor.

  name - `java.lang.String`
  service-name - `java.lang.String`
  byte-count-metric-name - `java.lang.String`"
  (^SimpleThroughputMetricType [^java.lang.String name ^java.lang.String service-name ^java.lang.String byte-count-metric-name]
    (new SimpleThroughputMetricType name service-name byte-count-metric-name)))

(defn get-byte-count-metric-type
  "returns: `com.amazonaws.metrics.ServiceMetricType`"
  (^com.amazonaws.metrics.ServiceMetricType [^SimpleThroughputMetricType this]
    (-> this (.getByteCountMetricType))))

