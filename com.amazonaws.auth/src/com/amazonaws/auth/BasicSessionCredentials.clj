(ns com.amazonaws.auth.BasicSessionCredentials
  "Simple session credentials with keys and session token."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth BasicSessionCredentials]))

(defn ->basic-session-credentials
  "Constructor.

  aws-access-key - `java.lang.String`
  aws-secret-key - `java.lang.String`
  session-token - `java.lang.String`"
  (^BasicSessionCredentials [^java.lang.String aws-access-key ^java.lang.String aws-secret-key ^java.lang.String session-token]
    (new BasicSessionCredentials aws-access-key aws-secret-key session-token)))

(defn get-aws-access-key-id
  "Description copied from interface: AWSCredentials

  returns: The AWS access key ID for this credentials object. - `java.lang.String`"
  (^java.lang.String [^BasicSessionCredentials this]
    (-> this (.getAWSAccessKeyId))))

(defn get-aws-secret-key
  "Description copied from interface: AWSCredentials

  returns: The AWS secret access key for this credentials object. - `java.lang.String`"
  (^java.lang.String [^BasicSessionCredentials this]
    (-> this (.getAWSSecretKey))))

(defn get-session-token
  "Description copied from interface: AWSSessionCredentials

  returns: `java.lang.String`"
  (^java.lang.String [^BasicSessionCredentials this]
    (-> this (.getSessionToken))))

