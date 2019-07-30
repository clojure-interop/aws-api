(ns com.amazonaws.services.kinesis.AmazonKinesisAsyncClientBuilder
  "Fluent builder for AmazonKinesisAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesis AmazonKinesisAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.kinesis.AmazonKinesisAsyncClientBuilder`"
  (^com.amazonaws.services.kinesis.AmazonKinesisAsyncClientBuilder []
    (AmazonKinesisAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.kinesis.AmazonKinesisAsync`"
  (^com.amazonaws.services.kinesis.AmazonKinesisAsync []
    (AmazonKinesisAsyncClientBuilder/defaultClient )))

