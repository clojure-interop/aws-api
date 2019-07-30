(ns com.amazonaws.services.iot.AWSIotAsyncClientBuilder
  "Fluent builder for AWSIotAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot AWSIotAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.iot.AWSIotAsyncClientBuilder`"
  (^com.amazonaws.services.iot.AWSIotAsyncClientBuilder []
    (AWSIotAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.iot.AWSIotAsync`"
  (^com.amazonaws.services.iot.AWSIotAsync []
    (AWSIotAsyncClientBuilder/defaultClient )))

