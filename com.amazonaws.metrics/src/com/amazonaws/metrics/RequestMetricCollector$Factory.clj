(ns com.amazonaws.metrics.RequestMetricCollector$Factory
  "Can be used to serve as a factory for the request metric collector."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics RequestMetricCollector$Factory]))

(defn get-request-metric-collector
  "Returns an instance of the collector; or null if if failed to create
   one.

  returns: `com.amazonaws.metrics.RequestMetricCollector`"
  (^com.amazonaws.metrics.RequestMetricCollector [^RequestMetricCollector$Factory this]
    (-> this (.getRequestMetricCollector))))

