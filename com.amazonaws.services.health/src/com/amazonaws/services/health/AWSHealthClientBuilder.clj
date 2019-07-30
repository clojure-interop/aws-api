(ns com.amazonaws.services.health.AWSHealthClientBuilder
  "Fluent builder for AWSHealth. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.health AWSHealthClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.health.AWSHealthClientBuilder`"
  (^com.amazonaws.services.health.AWSHealthClientBuilder []
    (AWSHealthClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.health.AWSHealth`"
  (^com.amazonaws.services.health.AWSHealth []
    (AWSHealthClientBuilder/defaultClient )))

