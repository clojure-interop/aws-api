(ns com.amazonaws.services.kafka.AWSKafkaAsyncClientBuilder
  "Fluent builder for AWSKafkaAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kafka AWSKafkaAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.kafka.AWSKafkaAsyncClientBuilder`"
  (^com.amazonaws.services.kafka.AWSKafkaAsyncClientBuilder []
    (AWSKafkaAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.kafka.AWSKafkaAsync`"
  (^com.amazonaws.services.kafka.AWSKafkaAsync []
    (AWSKafkaAsyncClientBuilder/defaultClient )))

