(ns com.amazonaws.services.kafka.AWSKafkaClientBuilder
  "Fluent builder for AWSKafka. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kafka AWSKafkaClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.kafka.AWSKafkaClientBuilder`"
  (^com.amazonaws.services.kafka.AWSKafkaClientBuilder []
    (AWSKafkaClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.kafka.AWSKafka`"
  (^com.amazonaws.services.kafka.AWSKafka []
    (AWSKafkaClientBuilder/defaultClient )))

