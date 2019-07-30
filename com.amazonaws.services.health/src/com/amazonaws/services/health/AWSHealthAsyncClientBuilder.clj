(ns com.amazonaws.services.health.AWSHealthAsyncClientBuilder
  "Fluent builder for AWSHealthAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.health AWSHealthAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.health.AWSHealthAsyncClientBuilder`"
  (^com.amazonaws.services.health.AWSHealthAsyncClientBuilder []
    (AWSHealthAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.health.AWSHealthAsync`"
  (^com.amazonaws.services.health.AWSHealthAsync []
    (AWSHealthAsyncClientBuilder/defaultClient )))

