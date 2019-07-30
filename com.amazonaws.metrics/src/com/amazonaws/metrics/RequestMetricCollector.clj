(ns com.amazonaws.metrics.RequestMetricCollector
  "A service provider interface that can be used to implement an AWS SDK
  request/response metric collector."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics RequestMetricCollector]))

(defn ->request-metric-collector
  "Constructor."
  (^RequestMetricCollector []
    (new RequestMetricCollector )))

(def *-none
  "Static Constant.

  A convenient instance of a no-op request metric collector.

  type: com.amazonaws.metrics.RequestMetricCollector"
  RequestMetricCollector/NONE)

(defn collect-metrics
  "Used to collect the metric at the end of a request/response cycle.

  request - `com.amazonaws.Request`
  response - `com.amazonaws.Response`"
  ([^RequestMetricCollector this ^com.amazonaws.Request request ^com.amazonaws.Response response]
    (-> this (.collectMetrics request response))))

(defn enabled?
  "returns: `boolean`"
  (^Boolean [^RequestMetricCollector this]
    (-> this (.isEnabled))))

