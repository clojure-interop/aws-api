(ns com.amazonaws.metrics.ServiceMetricCollector
  "A service provider interface that can be used to implement an AWS SDK
  general purpose metric collector."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics ServiceMetricCollector]))

(defn ->service-metric-collector
  "Constructor."
  (^ServiceMetricCollector []
    (new ServiceMetricCollector )))

(def *-none
  "Static Constant.

  A convenient instance of a no-op service metric collector.

  type: com.amazonaws.metrics.ServiceMetricCollector"
  ServiceMetricCollector/NONE)

(defn collect-byte-throughput
  "Collects metrics on the number of bytes written or read and the respective
   duration.

  provider - `com.amazonaws.metrics.ByteThroughputProvider`"
  ([^ServiceMetricCollector this ^com.amazonaws.metrics.ByteThroughputProvider provider]
    (-> this (.collectByteThroughput provider))))

(defn collect-latency
  "Collects metrics for non-request specific latencies.

  provider - `com.amazonaws.metrics.ServiceLatencyProvider`"
  ([^ServiceMetricCollector this ^com.amazonaws.metrics.ServiceLatencyProvider provider]
    (-> this (.collectLatency provider))))

(defn enabled?
  "returns: `boolean`"
  (^Boolean [^ServiceMetricCollector this]
    (-> this (.isEnabled))))

