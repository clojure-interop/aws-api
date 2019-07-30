(ns com.amazonaws.internal.SdkBufferedInputStream
  "A buffered input stream that is both SDK metric aware, and can be aborted
  via thread interrupt."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkBufferedInputStream]))

(defn ->sdk-buffered-input-stream
  "Constructor.

  in - `java.io.InputStream`
  size - `int`"
  (^SdkBufferedInputStream [^java.io.InputStream in ^Integer size]
    (new SdkBufferedInputStream in size))
  (^SdkBufferedInputStream [^java.io.InputStream in]
    (new SdkBufferedInputStream in)))

(defn metric-activated?
  "Description copied from interface: MetricAware

  returns: `boolean`"
  (^Boolean [^SdkBufferedInputStream this]
    (-> this (.isMetricActivated))))

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^SdkBufferedInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^SdkBufferedInputStream this]
    (-> this (.read))))

(defn skip
  "n - `long`

  returns: `long`

  throws: java.io.IOException"
  (^Long [^SdkBufferedInputStream this ^Long n]
    (-> this (.skip n))))

(defn available
  "returns: `int`

  throws: java.io.IOException"
  (^Integer [^SdkBufferedInputStream this]
    (-> this (.available))))

(defn close
  "throws: java.io.IOException"
  ([^SdkBufferedInputStream this]
    (-> this (.close))))

(defn mark
  "readlimit - `int`"
  ([^SdkBufferedInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn reset
  "throws: java.io.IOException"
  ([^SdkBufferedInputStream this]
    (-> this (.reset))))

(defn mark-supported
  "returns: `boolean`"
  (^Boolean [^SdkBufferedInputStream this]
    (-> this (.markSupported))))

