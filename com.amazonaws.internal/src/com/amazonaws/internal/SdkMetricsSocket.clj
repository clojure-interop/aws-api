(ns com.amazonaws.internal.SdkMetricsSocket
  "A wrapper to Socket with metrics feature to record socket read time."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkMetricsSocket]))

(defn ->sdk-metrics-socket
  "Constructor.

  sock - `java.net.Socket`"
  (^SdkMetricsSocket [^java.net.Socket sock]
    (new SdkMetricsSocket sock)))

(defn set-metrics
  "AWSRequestMetrics is set per request.

  metrics - `com.amazonaws.util.AWSRequestMetrics`"
  ([^SdkMetricsSocket this ^com.amazonaws.util.AWSRequestMetrics metrics]
    (-> this (.setMetrics metrics))))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^SdkMetricsSocket this]
    (-> this (.getInputStream))))

