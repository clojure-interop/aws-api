(ns com.amazonaws.auth.AWSCredentials
  "Provides access to the AWS credentials used for accessing AWS services: AWS
  access key ID and secret access key. These credentials are used to securely
  sign requests to AWS services.

  A basic implementation of this interface is provided in
  BasicAWSCredentials, but callers are free to provide their own
  implementation, for example, to load AWS credentials from an encrypted file.

  For more details on AWS access keys, see: http://docs.amazonwebservices.com/AWSSecurityCredentials/1.0/
  AboutAWSCredentials.html#AccessKeys"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWSCredentials]))

(defn get-aws-access-key-id
  "Returns the AWS access key ID for this credentials object.

  returns: The AWS access key ID for this credentials object. - `java.lang.String`"
  (^java.lang.String [^AWSCredentials this]
    (-> this (.getAWSAccessKeyId))))

(defn get-aws-secret-key
  "Returns the AWS secret access key for this credentials object.

  returns: The AWS secret access key for this credentials object. - `java.lang.String`"
  (^java.lang.String [^AWSCredentials this]
    (-> this (.getAWSSecretKey))))

