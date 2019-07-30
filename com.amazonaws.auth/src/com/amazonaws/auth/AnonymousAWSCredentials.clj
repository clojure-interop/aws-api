(ns com.amazonaws.auth.AnonymousAWSCredentials
  "Basic implementation of the AWSCredentials interface that allows use of \"anonymous\"
  credentials.  Using anonymous credentials will result in requests not being signed
  before sending to the service.  Any service that does not accept unsigned requests
  will return a service exception in this case."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AnonymousAWSCredentials]))

(defn ->anonymous-aws-credentials
  "Constructor."
  (^AnonymousAWSCredentials []
    (new AnonymousAWSCredentials )))

(defn get-aws-access-key-id
  "Description copied from interface: AWSCredentials

  returns: The AWS access key ID for this credentials object. - `java.lang.String`"
  (^java.lang.String [^AnonymousAWSCredentials this]
    (-> this (.getAWSAccessKeyId))))

(defn get-aws-secret-key
  "Description copied from interface: AWSCredentials

  returns: The AWS secret access key for this credentials object. - `java.lang.String`"
  (^java.lang.String [^AnonymousAWSCredentials this]
    (-> this (.getAWSSecretKey))))

