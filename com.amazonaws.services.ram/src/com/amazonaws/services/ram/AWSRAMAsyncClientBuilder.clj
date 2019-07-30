(ns com.amazonaws.services.ram.AWSRAMAsyncClientBuilder
  "Fluent builder for AWSRAMAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ram AWSRAMAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.ram.AWSRAMAsyncClientBuilder`"
  (^com.amazonaws.services.ram.AWSRAMAsyncClientBuilder []
    (AWSRAMAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.ram.AWSRAMAsync`"
  (^com.amazonaws.services.ram.AWSRAMAsync []
    (AWSRAMAsyncClientBuilder/defaultClient )))

