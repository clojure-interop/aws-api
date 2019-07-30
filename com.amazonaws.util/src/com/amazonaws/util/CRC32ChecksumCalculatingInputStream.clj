(ns com.amazonaws.util.CRC32ChecksumCalculatingInputStream
  "Simple InputStream wrapper that examines the wrapped stream's contents as
  they are read and calculates and CRC32 checksum."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util CRC32ChecksumCalculatingInputStream]))

(defn ->crc-32-checksum-calculating-input-stream
  "Constructor.

  in - `java.io.InputStream`"
  (^CRC32ChecksumCalculatingInputStream [^java.io.InputStream in]
    (new CRC32ChecksumCalculatingInputStream in)))

(defn get-crc-32-checksum
  "returns: `long`"
  (^Long [^CRC32ChecksumCalculatingInputStream this]
    (-> this (.getCRC32Checksum))))

(defn reset
  "Resets the wrapped input stream and the CRC32 computation.

  throws: java.io.IOException"
  ([^CRC32ChecksumCalculatingInputStream this]
    (-> this (.reset))))

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^CRC32ChecksumCalculatingInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^CRC32ChecksumCalculatingInputStream this]
    (-> this (.read))))

