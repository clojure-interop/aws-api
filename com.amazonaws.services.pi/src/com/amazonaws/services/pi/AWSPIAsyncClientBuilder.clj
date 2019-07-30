(ns com.amazonaws.services.pi.AWSPIAsyncClientBuilder
  "Fluent builder for AWSPIAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pi AWSPIAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.pi.AWSPIAsyncClientBuilder`"
  (^com.amazonaws.services.pi.AWSPIAsyncClientBuilder []
    (AWSPIAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.pi.AWSPIAsync`"
  (^com.amazonaws.services.pi.AWSPIAsync []
    (AWSPIAsyncClientBuilder/defaultClient )))

