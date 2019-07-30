(ns com.amazonaws.services.transfer.AWSTransferAsyncClientBuilder
  "Fluent builder for AWSTransferAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.transfer AWSTransferAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.transfer.AWSTransferAsyncClientBuilder`"
  (^com.amazonaws.services.transfer.AWSTransferAsyncClientBuilder []
    (AWSTransferAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.transfer.AWSTransferAsync`"
  (^com.amazonaws.services.transfer.AWSTransferAsync []
    (AWSTransferAsyncClientBuilder/defaultClient )))

