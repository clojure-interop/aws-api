(ns com.amazonaws.services.transfer.AWSTransferClientBuilder
  "Fluent builder for AWSTransfer. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transfer AWSTransferClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.transfer.AWSTransferClientBuilder`"
  (^com.amazonaws.services.transfer.AWSTransferClientBuilder []
    (AWSTransferClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.transfer.AWSTransfer`"
  (^com.amazonaws.services.transfer.AWSTransfer []
    (AWSTransferClientBuilder/defaultClient )))

