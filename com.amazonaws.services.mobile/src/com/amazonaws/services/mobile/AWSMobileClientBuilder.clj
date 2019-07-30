(ns com.amazonaws.services.mobile.AWSMobileClientBuilder
  "Fluent builder for AWSMobile. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mobile AWSMobileClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mobile.AWSMobileClientBuilder`"
  (^com.amazonaws.services.mobile.AWSMobileClientBuilder []
    (AWSMobileClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mobile.AWSMobile`"
  (^com.amazonaws.services.mobile.AWSMobile []
    (AWSMobileClientBuilder/defaultClient )))

