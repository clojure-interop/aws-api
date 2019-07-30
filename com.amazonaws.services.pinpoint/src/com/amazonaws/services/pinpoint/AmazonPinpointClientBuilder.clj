(ns com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder
  "Fluent builder for AmazonPinpoint. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpoint AmazonPinpointClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder`"
  (^com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder []
    (AmazonPinpointClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.pinpoint.AmazonPinpoint`"
  (^com.amazonaws.services.pinpoint.AmazonPinpoint []
    (AmazonPinpointClientBuilder/defaultClient )))

