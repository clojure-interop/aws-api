(ns com.amazonaws.services.mobile.AWSMobileAsyncClientBuilder
  "Fluent builder for AWSMobileAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mobile AWSMobileAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mobile.AWSMobileAsyncClientBuilder`"
  (^com.amazonaws.services.mobile.AWSMobileAsyncClientBuilder []
    (AWSMobileAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mobile.AWSMobileAsync`"
  (^com.amazonaws.services.mobile.AWSMobileAsync []
    (AWSMobileAsyncClientBuilder/defaultClient )))

