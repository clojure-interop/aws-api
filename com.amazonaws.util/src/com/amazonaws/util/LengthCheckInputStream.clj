(ns com.amazonaws.util.LengthCheckInputStream
  "Used to perform length check to ensure the number of bytes read from the
  underlying input stream is the same as the expected total."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util LengthCheckInputStream]))

(defn ->length-check-input-stream
  "Constructor.

  Constructs an input stream that performs length check to ensure the
   number of bytes read from the underlying input stream is the same as the
   expected total.

  in - the underlying input stream - `java.io.InputStream`
  expected-length - the total length of the data in bytes expected to be read from the underlying input stream; must be non-negative. - `long`
  include-skipped - true if bytes skipped are to be considered as part of the data length; false otherwise. Typically, this parameter should be set to false for uploading data to AWS, but set to true for receiving data from AWS. - `boolean`"
  (^LengthCheckInputStream [^java.io.InputStream in ^Long expected-length ^Boolean include-skipped]
    (new LengthCheckInputStream in expected-length include-skipped)))

(def *-include-skipped-bytes
  "Static Constant.

  type: boolean"
  LengthCheckInputStream/INCLUDE_SKIPPED_BYTES)

(def *-exclude-skipped-bytes
  "Static Constant.

  type: boolean"
  LengthCheckInputStream/EXCLUDE_SKIPPED_BYTES)

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: com.amazonaws.SdkClientException - if the data length read has exceeded the expected total, or if the total data length is not the same as the expected total."
  (^Integer [^LengthCheckInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^LengthCheckInputStream this]
    (-> this (.read))))

(defn mark
  "readlimit - `int`"
  ([^LengthCheckInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn reset
  "throws: java.io.IOException"
  ([^LengthCheckInputStream this]
    (-> this (.reset))))

(defn skip
  "n - `long`

  returns: `long`

  throws: com.amazonaws.SdkClientException - if includeSkipped is true and the data length skipped has exceeded the expected total."
  (^Long [^LengthCheckInputStream this ^Long n]
    (-> this (.skip n))))

