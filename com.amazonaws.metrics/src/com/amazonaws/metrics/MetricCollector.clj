(ns com.amazonaws.metrics.MetricCollector
  "Metric Collector SPI.  This is a class instead of interface so in case of
  adding new methods in the future we can do that safetly without breaking
  any existing clients that implements this SPI."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics MetricCollector]))

(defn ->metric-collector
  "Constructor."
  (^MetricCollector []
    (new MetricCollector )))

(def *-none
  "Static Constant.

  A convenient instance of a no-op request metric collector.

  type: com.amazonaws.metrics.MetricCollector"
  MetricCollector/NONE)

(defn start
  "Starts the request metric collector.

  returns: true if the collector is successfully started; false otherwise. - `boolean`"
  (^Boolean [^MetricCollector this]
    (-> this (.start))))

(defn stop
  "Stops the request metric collector.

  returns: true if the collector is successfully stopped; false if the
           collector is not running and therefore the call has no effect. - `boolean`"
  (^Boolean [^MetricCollector this]
    (-> this (.stop))))

(defn enabled?
  "Returns true if this collector is enabled; false otherwise.

  returns: `boolean`"
  (^Boolean [^MetricCollector this]
    (-> this (.isEnabled))))

(defn get-request-metric-collector
  "returns: `com.amazonaws.metrics.RequestMetricCollector`"
  (^com.amazonaws.metrics.RequestMetricCollector [^MetricCollector this]
    (-> this (.getRequestMetricCollector))))

(defn get-service-metric-collector
  "returns: `com.amazonaws.metrics.ServiceMetricCollector`"
  (^com.amazonaws.metrics.ServiceMetricCollector [^MetricCollector this]
    (-> this (.getServiceMetricCollector))))

