(ns com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseAsyncClientBuilder
  "Fluent builder for AmazonKinesisFirehoseAsync. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisfirehose AmazonKinesisFirehoseAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseAsyncClientBuilder`"
  (^com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseAsyncClientBuilder []
    (AmazonKinesisFirehoseAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseAsync`"
  (^com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseAsync []
    (AmazonKinesisFirehoseAsyncClientBuilder/defaultClient )))

