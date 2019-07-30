(ns com.amazonaws.services.s3.AmazonS3ClientBuilder
  "Fluent builder for AmazonS3. Capable of building synchronous and asynchronous clients. Use of the
  builder is preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 AmazonS3ClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.s3.AmazonS3ClientBuilder`"
  (^com.amazonaws.services.s3.AmazonS3ClientBuilder []
    (AmazonS3ClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAwsRegionProviderChain
   chain. - `com.amazonaws.services.s3.AmazonS3`"
  (^com.amazonaws.services.s3.AmazonS3 []
    (AmazonS3ClientBuilder/defaultClient )))

