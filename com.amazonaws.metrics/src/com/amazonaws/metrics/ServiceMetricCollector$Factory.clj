(ns com.amazonaws.metrics.ServiceMetricCollector$Factory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics ServiceMetricCollector$Factory]))

(defn get-service-metric-collector
  "Returns an instance of the collector; or null if if failed to create
   one.

  returns: `com.amazonaws.metrics.ServiceMetricCollector`"
  (^com.amazonaws.metrics.ServiceMetricCollector [^ServiceMetricCollector$Factory this]
    (-> this (.getServiceMetricCollector))))

