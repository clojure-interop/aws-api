(ns com.amazonaws.internal.SdkSSLMetricsSocket
  "A wrapper to SSLSocket with metric feature to record socket read time."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkSSLMetricsSocket]))

(defn ->sdk-ssl-metrics-socket
  "Constructor.

  sock - `javax.net.ssl.SSLSocket`"
  (^SdkSSLMetricsSocket [^javax.net.ssl.SSLSocket sock]
    (new SdkSSLMetricsSocket sock)))

(defn set-metrics
  "metrics - `com.amazonaws.util.AWSRequestMetrics`

  throws: java.io.IOException"
  ([^SdkSSLMetricsSocket this ^com.amazonaws.util.AWSRequestMetrics metrics]
    (-> this (.setMetrics metrics))))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^SdkSSLMetricsSocket this]
    (-> this (.getInputStream))))

