(ns com.amazonaws.services.mq.AmazonMQAsyncClientBuilder
  "Fluent builder for AmazonMQAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mq AmazonMQAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mq.AmazonMQAsyncClientBuilder`"
  (^com.amazonaws.services.mq.AmazonMQAsyncClientBuilder []
    (AmazonMQAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mq.AmazonMQAsync`"
  (^com.amazonaws.services.mq.AmazonMQAsync []
    (AmazonMQAsyncClientBuilder/defaultClient )))

