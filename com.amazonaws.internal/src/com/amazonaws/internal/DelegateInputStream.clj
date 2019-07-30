(ns com.amazonaws.internal.DelegateInputStream
  "InputStream delegate class. Subclasses could extend this class, so that
  they need only override methods they are interested in enhancing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal DelegateInputStream]))

(defn ->delegate-input-stream
  "Constructor.

  in - `java.io.InputStream`"
  (^DelegateInputStream [^java.io.InputStream in]
    (new DelegateInputStream in)))

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^DelegateInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^DelegateInputStream this b]
    (-> this (.read b)))
  (^Integer [^DelegateInputStream this]
    (-> this (.read))))

(defn skip
  "n - `long`

  returns: `long`

  throws: java.io.IOException"
  (^Long [^DelegateInputStream this ^Long n]
    (-> this (.skip n))))

(defn available
  "returns: `int`

  throws: java.io.IOException"
  (^Integer [^DelegateInputStream this]
    (-> this (.available))))

(defn close
  "throws: java.io.IOException"
  ([^DelegateInputStream this]
    (-> this (.close))))

(defn mark
  "readlimit - `int`"
  ([^DelegateInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn reset
  "throws: java.io.IOException"
  ([^DelegateInputStream this]
    (-> this (.reset))))

(defn mark-supported
  "returns: `boolean`"
  (^Boolean [^DelegateInputStream this]
    (-> this (.markSupported))))

