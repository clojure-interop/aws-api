(ns com.amazonaws.auth.AWSCredentialsProvider
  "Interface for providing AWS credentials. Implementations are free to use any
  strategy for providing AWS credentials, such as simply providing static
  credentials that don't change, or more complicated implementations, such as
  integrating with existing key management systems."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWSCredentialsProvider]))

(defn get-credentials
  "Returns AWSCredentials which the caller can use to authorize an AWS request.
   Each implementation of AWSCredentialsProvider can chose its own strategy for
   loading credentials.  For example, an implementation might load credentials
   from an existing key management system, or load new credentials when
   credentials are rotated.

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^AWSCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Forces this credentials provider to refresh its credentials. For many
   implementations of credentials provider, this method may simply be a
   no-op, such as any credentials provider implementation that vends
   static/non-changing credentials. For other implementations that vend
   different credentials through out their lifetime, this method should
   force the credentials provider to refresh its credentials."
  ([^AWSCredentialsProvider this]
    (-> this (.refresh))))

