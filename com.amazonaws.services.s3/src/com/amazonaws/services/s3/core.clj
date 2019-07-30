(ns com.amazonaws.services.s3.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.amazonaws.services.s3.AbstractAmazonS3])
(require '[com.amazonaws.services.s3.AmazonS3])
(require '[com.amazonaws.services.s3.AmazonS3Builder])
(require '[com.amazonaws.services.s3.AmazonS3Client])
(require '[com.amazonaws.services.s3.AmazonS3ClientBuilder])
(require '[com.amazonaws.services.s3.AmazonS3Encryption])
(require '[com.amazonaws.services.s3.AmazonS3EncryptionClient])
(require '[com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder])
(require '[com.amazonaws.services.s3.AmazonS3EncryptionClientParamsWrapper])
(require '[com.amazonaws.services.s3.AmazonS3URI])
(require '[com.amazonaws.services.s3.Headers])
(require '[com.amazonaws.services.s3.KeyWrapException])
(require '[com.amazonaws.services.s3.OnFileDelete])
(require '[com.amazonaws.services.s3.S3ClientOptions$Builder])
(require '[com.amazonaws.services.s3.S3ClientOptions])
(require '[com.amazonaws.services.s3.S3ResponseMetadata])
(require '[com.amazonaws.services.s3.UploadObjectObserver])