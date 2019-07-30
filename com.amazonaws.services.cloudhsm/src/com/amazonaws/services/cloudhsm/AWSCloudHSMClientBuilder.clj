(ns com.amazonaws.services.cloudhsm.AWSCloudHSMClientBuilder
  "Fluent builder for AWSCloudHSM. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsm AWSCloudHSMClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloudhsm.AWSCloudHSMClientBuilder`"
  (^com.amazonaws.services.cloudhsm.AWSCloudHSMClientBuilder []
    (AWSCloudHSMClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloudhsm.AWSCloudHSM`"
  (^com.amazonaws.services.cloudhsm.AWSCloudHSM []
    (AWSCloudHSMClientBuilder/defaultClient )))

