(ns com.amazonaws.auth.AwsChunkedEncodingInputStream
  "A wrapper class of InputStream that implements chunked-encoding."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AwsChunkedEncodingInputStream]))

(defn ->aws-chunked-encoding-input-stream
  "Constructor.

  A wrapper of InputStream that implements pseudo-chunked-encoding.
   Each chunk will be buffered for the calculation of the chunk signature
   which is added at the head of each chunk.
   The default chunk size cannot be customized, since we need to calculate
   the expected encoded stream length before reading the wrapped stream.
   This class will use the mark() & reset() of the wrapped InputStream if they
   are supported, otherwise it will create a buffer for bytes read from
   the wrapped stream.

  in - The original InputStream. - `java.io.InputStream`
  max-buffer-size - Maximum number of bytes buffered by this class. - `int`
  k-signing - Signing key. - `byte[]`
  datetime - Datetime, as used in SigV4. - `java.lang.String`
  key-path - Keypath/Scope, as used in SigV4. - `java.lang.String`
  header-signature - The signature of the signed headers. This will be used for calculating the signature of the first chunk. - `java.lang.String`
  aws-4-signer - The AWS4Signer used for hashing and signing. - `com.amazonaws.auth.AWS4Signer`"
  (^AwsChunkedEncodingInputStream [^java.io.InputStream in ^Integer max-buffer-size k-signing ^java.lang.String datetime ^java.lang.String key-path ^java.lang.String header-signature ^com.amazonaws.auth.AWS4Signer aws-4-signer]
    (new AwsChunkedEncodingInputStream in max-buffer-size k-signing datetime key-path header-signature aws-4-signer))
  (^AwsChunkedEncodingInputStream [^java.io.InputStream in k-signing ^java.lang.String datetime ^java.lang.String key-path ^java.lang.String header-signature ^com.amazonaws.auth.AWS4Signer aws-4-signer]
    (new AwsChunkedEncodingInputStream in k-signing datetime key-path header-signature aws-4-signer)))

(defn *calculate-stream-content-length
  "original-length - `long`

  returns: `long`"
  (^Long [^Long original-length]
    (AwsChunkedEncodingInputStream/calculateStreamContentLength original-length)))

(defn read
  "b - `byte[]`
  off - `int`
  len - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^AwsChunkedEncodingInputStream this b ^Integer off ^Integer len]
    (-> this (.read b off len)))
  (^Integer [^AwsChunkedEncodingInputStream this]
    (-> this (.read))))

(defn skip
  "n - `long`

  returns: `long`

  throws: java.io.IOException"
  (^Long [^AwsChunkedEncodingInputStream this ^Long n]
    (-> this (.skip n))))

(defn mark-supported
  "returns: `boolean`"
  (^Boolean [^AwsChunkedEncodingInputStream this]
    (-> this (.markSupported))))

(defn mark
  "The readlimit parameter is ignored.

  readlimit - `int`"
  ([^AwsChunkedEncodingInputStream this ^Integer readlimit]
    (-> this (.mark readlimit))))

(defn reset
  "Reset the stream, either by resetting the wrapped stream or using the
   buffer created by this class.

  throws: java.io.IOException"
  ([^AwsChunkedEncodingInputStream this]
    (-> this (.reset))))

