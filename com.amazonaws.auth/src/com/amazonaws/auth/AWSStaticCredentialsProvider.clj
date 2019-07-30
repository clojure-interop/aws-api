(ns com.amazonaws.auth.AWSStaticCredentialsProvider
  "Simple implementation of AWSCredentialsProvider that just wraps static AWSCredentials."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWSStaticCredentialsProvider]))

(defn ->aws-static-credentials-provider
  "Constructor.

  credentials - `com.amazonaws.auth.AWSCredentials`"
  (^AWSStaticCredentialsProvider [^com.amazonaws.auth.AWSCredentials credentials]
    (new AWSStaticCredentialsProvider credentials)))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^AWSStaticCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^AWSStaticCredentialsProvider this]
    (-> this (.refresh))))

