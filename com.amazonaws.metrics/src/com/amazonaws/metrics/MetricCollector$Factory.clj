(ns com.amazonaws.metrics.MetricCollector$Factory
  "Can be used to serve as a factory for the request metric collector."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics MetricCollector$Factory]))

(defn get-instance
  "Returns an instance of the collector; or null if if failed to create
   one.

  returns: `com.amazonaws.metrics.MetricCollector`"
  (^com.amazonaws.metrics.MetricCollector [^MetricCollector$Factory this]
    (-> this (.getInstance))))

