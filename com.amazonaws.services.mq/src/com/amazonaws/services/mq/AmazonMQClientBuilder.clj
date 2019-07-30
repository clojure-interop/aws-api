(ns com.amazonaws.services.mq.AmazonMQClientBuilder
  "Fluent builder for AmazonMQ. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mq AmazonMQClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mq.AmazonMQClientBuilder`"
  (^com.amazonaws.services.mq.AmazonMQClientBuilder []
    (AmazonMQClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mq.AmazonMQ`"
  (^com.amazonaws.services.mq.AmazonMQ []
    (AmazonMQClientBuilder/defaultClient )))

