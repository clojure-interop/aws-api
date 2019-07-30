(ns com.amazonaws.internal.StaticCredentialsProvider
  "Deprecated.
 By AWSStaticCredentialsProvider"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal StaticCredentialsProvider]))

(defn ->static-credentials-provider
  "Constructor.

  Deprecated.

  credentials - `com.amazonaws.auth.AWSCredentials`"
  (^StaticCredentialsProvider [^com.amazonaws.auth.AWSCredentials credentials]
    (new StaticCredentialsProvider credentials)))

(defn get-credentials
  "Deprecated.

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^StaticCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Deprecated."
  ([^StaticCredentialsProvider this]
    (-> this (.refresh))))

