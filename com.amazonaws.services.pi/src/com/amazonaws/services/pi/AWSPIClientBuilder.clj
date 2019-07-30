(ns com.amazonaws.services.pi.AWSPIClientBuilder
  "Fluent builder for AWSPI. Use of the builder is preferred over using constructors
  of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pi AWSPIClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.pi.AWSPIClientBuilder`"
  (^com.amazonaws.services.pi.AWSPIClientBuilder []
    (AWSPIClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.pi.AWSPI`"
  (^com.amazonaws.services.pi.AWSPI []
    (AWSPIClientBuilder/defaultClient )))

