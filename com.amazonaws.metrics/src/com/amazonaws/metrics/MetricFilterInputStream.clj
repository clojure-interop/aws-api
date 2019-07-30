(ns com.amazonaws.metrics.MetricFilterInputStream
  "Used to capture the input stream throughput metrics, but excluding the
  SdkFilterInputStream.read() API.

  Note this class is only relevant
  when metric is enabled. Otherwise it should not even be involved in the call
  stack to minimize runtime overhead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics MetricFilterInputStream]))

(defn ->metric-filter-input-stream
  "Constructor.

  type - `com.amazonaws.metrics.ThroughputMetricType`
  in - `java.io.InputStream`"
  (^MetricFilterInputStream [^com.amazonaws.metrics.ThroughputMetricType type ^java.io.InputStream in]
    (new MetricFilterInputStream type in)))

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^MetricFilterInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len))))

(defn close
  "throws: java.io.IOException"
  ([^MetricFilterInputStream this]
    (-> this (.close))))

(defn metric-activated?
  "Description copied from interface: MetricAware

  returns: `boolean`"
  (^Boolean [^MetricFilterInputStream this]
    (-> this (.isMetricActivated))))

