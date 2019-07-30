(ns com.amazonaws.internal.SdkFilterOutputStream
  "Base class for AWS Java SDK specific FilterOutputStream."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkFilterOutputStream]))

(defn ->sdk-filter-output-stream
  "Constructor.

  out - `java.io.OutputStream`"
  (^SdkFilterOutputStream [^java.io.OutputStream out]
    (new SdkFilterOutputStream out)))

(defn metric-activated?
  "Description copied from interface: MetricAware

  returns: `boolean`"
  (^Boolean [^SdkFilterOutputStream this]
    (-> this (.isMetricActivated))))

(defn release
  "Description copied from interface: Releasable"
  ([^SdkFilterOutputStream this]
    (-> this (.release))))

