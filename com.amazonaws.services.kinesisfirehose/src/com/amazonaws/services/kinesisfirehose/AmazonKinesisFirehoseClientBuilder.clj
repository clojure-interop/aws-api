(ns com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClientBuilder
  "Fluent builder for AmazonKinesisFirehose. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisfirehose AmazonKinesisFirehoseClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClientBuilder`"
  (^com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClientBuilder []
    (AmazonKinesisFirehoseClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose`"
  (^com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose []
    (AmazonKinesisFirehoseClientBuilder/defaultClient )))

