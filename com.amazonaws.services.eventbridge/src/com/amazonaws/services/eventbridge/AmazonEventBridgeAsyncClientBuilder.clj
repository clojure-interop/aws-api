(ns com.amazonaws.services.eventbridge.AmazonEventBridgeAsyncClientBuilder
  "Fluent builder for AmazonEventBridgeAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eventbridge AmazonEventBridgeAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.eventbridge.AmazonEventBridgeAsyncClientBuilder`"
  (^com.amazonaws.services.eventbridge.AmazonEventBridgeAsyncClientBuilder []
    (AmazonEventBridgeAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.eventbridge.AmazonEventBridgeAsync`"
  (^com.amazonaws.services.eventbridge.AmazonEventBridgeAsync []
    (AmazonEventBridgeAsyncClientBuilder/defaultClient )))

