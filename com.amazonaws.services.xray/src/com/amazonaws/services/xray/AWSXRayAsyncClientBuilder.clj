(ns com.amazonaws.services.xray.AWSXRayAsyncClientBuilder
  "Fluent builder for AWSXRayAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.xray AWSXRayAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.xray.AWSXRayAsyncClientBuilder`"
  (^com.amazonaws.services.xray.AWSXRayAsyncClientBuilder []
    (AWSXRayAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.xray.AWSXRayAsync`"
  (^com.amazonaws.services.xray.AWSXRayAsync []
    (AWSXRayAsyncClientBuilder/defaultClient )))

