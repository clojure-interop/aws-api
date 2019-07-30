(ns com.amazonaws.services.ram.AWSRAMClientBuilder
  "Fluent builder for AWSRAM. Use of the builder is preferred over using constructors
  of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ram AWSRAMClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.ram.AWSRAMClientBuilder`"
  (^com.amazonaws.services.ram.AWSRAMClientBuilder []
    (AWSRAMClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.ram.AWSRAM`"
  (^com.amazonaws.services.ram.AWSRAM []
    (AWSRAMClientBuilder/defaultClient )))

