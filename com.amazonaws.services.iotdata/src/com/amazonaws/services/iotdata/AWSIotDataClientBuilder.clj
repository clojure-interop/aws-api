(ns com.amazonaws.services.iotdata.AWSIotDataClientBuilder
  "Fluent builder for AWSIotData. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotdata AWSIotDataClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.iotdata.AWSIotDataClientBuilder`"
  (^com.amazonaws.services.iotdata.AWSIotDataClientBuilder []
    (AWSIotDataClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.iotdata.AWSIotData`"
  (^com.amazonaws.services.iotdata.AWSIotData []
    (AWSIotDataClientBuilder/defaultClient )))

