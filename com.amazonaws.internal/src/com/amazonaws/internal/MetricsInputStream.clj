(ns com.amazonaws.internal.MetricsInputStream
  "Record input stream read time into AWSRequestMetrics under metric type
  HttpSocketReadTime;"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal MetricsInputStream]))

(defn ->metrics-input-stream
  "Constructor.

  in - `java.io.InputStream`"
  (^MetricsInputStream [^java.io.InputStream in]
    (new MetricsInputStream in)))

(defn set-metrics
  "metrics - `com.amazonaws.util.AWSRequestMetrics`"
  ([^MetricsInputStream this ^com.amazonaws.util.AWSRequestMetrics metrics]
    (-> this (.setMetrics metrics))))

(defn read
  "Record the read time into the metrics.

  b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^MetricsInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^MetricsInputStream this b]
    (-> this (.read b)))
  (^Integer [^MetricsInputStream this]
    (-> this (.read))))

