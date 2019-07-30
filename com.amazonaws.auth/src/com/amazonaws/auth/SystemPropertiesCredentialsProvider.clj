(ns com.amazonaws.auth.SystemPropertiesCredentialsProvider
  "AWSCredentialsProvider implementation that provides credentials by
  looking at the aws.accessKeyId and aws.secretKey
  Java system properties."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SystemPropertiesCredentialsProvider]))

(defn ->system-properties-credentials-provider
  "Constructor."
  (^SystemPropertiesCredentialsProvider []
    (new SystemPropertiesCredentialsProvider )))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^SystemPropertiesCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^SystemPropertiesCredentialsProvider this]
    (-> this (.refresh))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SystemPropertiesCredentialsProvider this]
    (-> this (.toString))))

