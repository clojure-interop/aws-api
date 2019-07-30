(ns com.amazonaws.internal.SdkFilterInputStream
  "Base class for AWS Java SDK specific FilterInputStream."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkFilterInputStream]))

(defn skip
  "n - `long`

  returns: `long`

  throws: java.io.IOException"
  (^Long [^SdkFilterInputStream this ^Long n]
    (-> this (.skip n))))

(defn release
  "Description copied from interface: Releasable"
  ([^SdkFilterInputStream this]
    (-> this (.release))))

(defn metric-activated?
  "Description copied from interface: MetricAware

  returns: `boolean`"
  (^Boolean [^SdkFilterInputStream this]
    (-> this (.isMetricActivated))))

(defn get-delegate-stream
  "returns: The wrapped stream. - `java.io.InputStream`"
  (^java.io.InputStream [^SdkFilterInputStream this]
    (-> this (.getDelegateStream))))

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^SdkFilterInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^SdkFilterInputStream this]
    (-> this (.read))))

(defn reset
  "throws: java.io.IOException"
  ([^SdkFilterInputStream this]
    (-> this (.reset))))

(defn mark-supported
  "returns: `boolean`"
  (^Boolean [^SdkFilterInputStream this]
    (-> this (.markSupported))))

(defn close
  "throws: java.io.IOException"
  ([^SdkFilterInputStream this]
    (-> this (.close))))

(defn abort
  "Can be used to provide abortion logic prior to throwing the
   AbortedException. If the wrapped InputStream is also an instance
   of this class, then it will also be aborted, otherwise this is a no-op."
  ([^SdkFilterInputStream this]
    (-> this (.abort))))

(defn mark
  "readlimit - `int`"
  ([^SdkFilterInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn available
  "returns: `int`

  throws: java.io.IOException"
  (^Integer [^SdkFilterInputStream this]
    (-> this (.available))))

