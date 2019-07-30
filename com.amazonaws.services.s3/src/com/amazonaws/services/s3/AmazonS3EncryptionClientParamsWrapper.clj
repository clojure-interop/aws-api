(ns com.amazonaws.services.s3.AmazonS3EncryptionClientParamsWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 AmazonS3EncryptionClientParamsWrapper]))

(defn get-client-params
  "returns: `com.amazonaws.client.AwsSyncClientParams`"
  (^com.amazonaws.client.AwsSyncClientParams [^AmazonS3EncryptionClientParamsWrapper this]
    (-> this (.getClientParams))))

(defn get-s-3-client-options
  "returns: `com.amazonaws.services.s3.S3ClientOptions`"
  (^com.amazonaws.services.s3.S3ClientOptions [^AmazonS3EncryptionClientParamsWrapper this]
    (-> this (.getS3ClientOptions))))

