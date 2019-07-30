(ns com.amazonaws.auth.AbstractAWSSigner
  "Abstract base class for AWS signing protocol implementations. Provides
  utilities commonly needed by signing protocols such as computing
  canonicalized host names, query string parameters, etc.

  Not intended to be sub-classed by developers."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AbstractAWSSigner]))

(defn ->abstract-aws-signer
  "Constructor."
  (^AbstractAWSSigner []
    (new AbstractAWSSigner )))

(def *-empty-string-sha-256-hex
  "Static Constant.

  type: java.lang.String"
  AbstractAWSSigner/EMPTY_STRING_SHA256_HEX)

(defn sign
  "string-data - `java.lang.String`
  key - `byte[]`
  algorithm - `com.amazonaws.auth.SigningAlgorithm`

  returns: `byte[]`

  throws: com.amazonaws.SdkClientException"
  ([^AbstractAWSSigner this ^java.lang.String string-data key ^com.amazonaws.auth.SigningAlgorithm algorithm]
    (-> this (.sign string-data key algorithm))))

(defn sign-with-mac
  "string-data - `java.lang.String`
  mac - `javax.crypto.Mac`

  returns: `byte[]`"
  ([^AbstractAWSSigner this ^java.lang.String string-data ^javax.crypto.Mac mac]
    (-> this (.signWithMac string-data mac))))

(defn hash
  "Hashes the string contents (assumed to be UTF-8) using the SHA-256
   algorithm.

  text - The string to hash. - `java.lang.String`

  returns: The hashed bytes from the specified string. - `byte[]`

  throws: com.amazonaws.SdkClientException - If the hash cannot be computed."
  ([^AbstractAWSSigner this ^java.lang.String text]
    (-> this (.hash text))))

