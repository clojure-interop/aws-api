(ns com.amazonaws.metrics.ThroughputMetricType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics ThroughputMetricType]))

(defn get-byte-count-metric-type
  "returns: `com.amazonaws.metrics.ServiceMetricType`"
  (^com.amazonaws.metrics.ServiceMetricType [^ThroughputMetricType this]
    (-> this (.getByteCountMetricType))))

