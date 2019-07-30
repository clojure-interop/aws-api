(ns com.amazonaws.util.CountingInputStream
  "Simple input stream wrapper utility to count the bytes read from a stream."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util CountingInputStream]))

(defn ->counting-input-stream
  "Constructor.

  in - `java.io.InputStream`"
  (^CountingInputStream [^java.io.InputStream in]
    (new CountingInputStream in)))

(defn get-byte-count
  "Returns the number of bytes read from this stream so far.

  returns: the number of bytes read from this stream so far. - `long`"
  (^Long [^CountingInputStream this]
    (-> this (.getByteCount))))

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^CountingInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^CountingInputStream this]
    (-> this (.read))))

