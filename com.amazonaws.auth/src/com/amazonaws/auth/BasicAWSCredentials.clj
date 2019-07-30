(ns com.amazonaws.auth.BasicAWSCredentials
  "Basic implementation of the AWSCredentials interface that allows callers to
  pass in the AWS access key and secret access in the constructor."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth BasicAWSCredentials]))

(defn ->basic-aws-credentials
  "Constructor.

  Constructs a new BasicAWSCredentials object, with the specified AWS
   access key and AWS secret key.

  access-key - The AWS access key. - `java.lang.String`
  secret-key - The AWS secret access key. - `java.lang.String`"
  (^BasicAWSCredentials [^java.lang.String access-key ^java.lang.String secret-key]
    (new BasicAWSCredentials access-key secret-key)))

(defn get-aws-access-key-id
  "Description copied from interface: AWSCredentials

  returns: The AWS access key ID for this credentials object. - `java.lang.String`"
  (^java.lang.String [^BasicAWSCredentials this]
    (-> this (.getAWSAccessKeyId))))

(defn get-aws-secret-key
  "Description copied from interface: AWSCredentials

  returns: The AWS secret access key for this credentials object. - `java.lang.String`"
  (^java.lang.String [^BasicAWSCredentials this]
    (-> this (.getAWSSecretKey))))

