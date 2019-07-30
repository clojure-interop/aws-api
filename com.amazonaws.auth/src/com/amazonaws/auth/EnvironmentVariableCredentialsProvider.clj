(ns com.amazonaws.auth.EnvironmentVariableCredentialsProvider
  "AWSCredentialsProvider implementation that provides credentials by looking at the: AWS_ACCESS_KEY_ID (or
  AWS_ACCESS_KEY) and AWS_SECRET_KEY (or AWS_SECRET_ACCESS_KEY) environment variables. If
  the AWS_SESSION_TOKEN environment variable is also set then temporary credentials will be used."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth EnvironmentVariableCredentialsProvider]))

(defn ->environment-variable-credentials-provider
  "Constructor."
  (^EnvironmentVariableCredentialsProvider []
    (new EnvironmentVariableCredentialsProvider )))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^EnvironmentVariableCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^EnvironmentVariableCredentialsProvider this]
    (-> this (.refresh))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EnvironmentVariableCredentialsProvider this]
    (-> this (.toString))))

