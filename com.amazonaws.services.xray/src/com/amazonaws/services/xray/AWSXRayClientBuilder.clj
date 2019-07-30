(ns com.amazonaws.services.xray.AWSXRayClientBuilder
  "Fluent builder for AWSXRay. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.xray AWSXRayClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.xray.AWSXRayClientBuilder`"
  (^com.amazonaws.services.xray.AWSXRayClientBuilder []
    (AWSXRayClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.xray.AWSXRay`"
  (^com.amazonaws.services.xray.AWSXRay []
    (AWSXRayClientBuilder/defaultClient )))

