(ns com.amazonaws.services.fms.AWSFMSClientBuilder
  "Fluent builder for AWSFMS. Use of the builder is preferred over using constructors
  of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fms AWSFMSClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.fms.AWSFMSClientBuilder`"
  (^com.amazonaws.services.fms.AWSFMSClientBuilder []
    (AWSFMSClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.fms.AWSFMS`"
  (^com.amazonaws.services.fms.AWSFMS []
    (AWSFMSClientBuilder/defaultClient )))

