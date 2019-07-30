(ns com.amazonaws.auth.STSSessionCredentials
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth STSSessionCredentials]))

(defn ->sts-session-credentials
  "Constructor.

  Deprecated.

  credentials - Primary AWS account credentials. - `com.amazonaws.auth.AWSCredentials`
  session-duration-seconds - The duration, in seconds, for each session to last. - `int`"
  (^STSSessionCredentials [^com.amazonaws.auth.AWSCredentials credentials ^Integer session-duration-seconds]
    (new STSSessionCredentials credentials session-duration-seconds))
  (^STSSessionCredentials [^com.amazonaws.auth.AWSCredentials credentials]
    (new STSSessionCredentials credentials)))

(def *-default-duration-seconds
  "Static Constant.

  Deprecated.

  type: int"
  STSSessionCredentials/DEFAULT_DURATION_SECONDS)

(defn get-aws-access-key-id
  "Deprecated.

  returns: The AWS access key ID for this credentials object. - `java.lang.String`"
  (^java.lang.String [^STSSessionCredentials this]
    (-> this (.getAWSAccessKeyId))))

(defn get-aws-secret-key
  "Deprecated.

  returns: The AWS secret access key for this credentials object. - `java.lang.String`"
  (^java.lang.String [^STSSessionCredentials this]
    (-> this (.getAWSSecretKey))))

(defn get-session-token
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^STSSessionCredentials this]
    (-> this (.getSessionToken))))

(defn get-immutable-credentials
  "Deprecated.

  returns: `com.amazonaws.auth.AWSSessionCredentials`"
  (^com.amazonaws.auth.AWSSessionCredentials [^STSSessionCredentials this]
    (-> this (.getImmutableCredentials))))

(defn refresh-credentials
  "Deprecated."
  ([^STSSessionCredentials this]
    (-> this (.refreshCredentials))))

