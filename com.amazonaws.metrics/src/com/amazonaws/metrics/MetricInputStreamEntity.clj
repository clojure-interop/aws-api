(ns com.amazonaws.metrics.MetricInputStreamEntity
  "Used to help capture the throughput metrics.

  Note this class is only relevant
  when metric is enabled. Otherwise it should not even be involved in the call
  stack to minimize runtime overhead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics MetricInputStreamEntity]))

(defn ->metric-input-stream-entity
  "Constructor.

  metric-type - `com.amazonaws.metrics.ThroughputMetricType`
  instream - `java.io.InputStream`
  length - `long`
  content-type - `org.apache.http.entity.ContentType`"
  (^MetricInputStreamEntity [^com.amazonaws.metrics.ThroughputMetricType metric-type ^java.io.InputStream instream ^Long length ^org.apache.http.entity.ContentType content-type]
    (new MetricInputStreamEntity metric-type instream length content-type))
  (^MetricInputStreamEntity [^com.amazonaws.metrics.ThroughputMetricType metric-type ^java.io.InputStream instream ^Long length]
    (new MetricInputStreamEntity metric-type instream length)))

(defn write-to
  "outstream - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^MetricInputStreamEntity this ^java.io.OutputStream outstream]
    (-> this (.writeTo outstream))))

