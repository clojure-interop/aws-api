(ns com.amazonaws.services.kinesis.AmazonKinesisClientBuilder
  "Fluent builder for AmazonKinesis. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesis AmazonKinesisClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.kinesis.AmazonKinesisClientBuilder`"
  (^com.amazonaws.services.kinesis.AmazonKinesisClientBuilder []
    (AmazonKinesisClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.kinesis.AmazonKinesis`"
  (^com.amazonaws.services.kinesis.AmazonKinesis []
    (AmazonKinesisClientBuilder/defaultClient )))

