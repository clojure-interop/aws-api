(ns com.amazonaws.services.shield.AWSShieldClientBuilder
  "Fluent builder for AWSShield. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.shield AWSShieldClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.shield.AWSShieldClientBuilder`"
  (^com.amazonaws.services.shield.AWSShieldClientBuilder []
    (AWSShieldClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.shield.AWSShield`"
  (^com.amazonaws.services.shield.AWSShield []
    (AWSShieldClientBuilder/defaultClient )))

