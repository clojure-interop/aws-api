(ns com.amazonaws.services.eventbridge.AmazonEventBridgeClientBuilder
  "Fluent builder for AmazonEventBridge. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eventbridge AmazonEventBridgeClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.eventbridge.AmazonEventBridgeClientBuilder`"
  (^com.amazonaws.services.eventbridge.AmazonEventBridgeClientBuilder []
    (AmazonEventBridgeClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.eventbridge.AmazonEventBridge`"
  (^com.amazonaws.services.eventbridge.AmazonEventBridge []
    (AmazonEventBridgeClientBuilder/defaultClient )))

