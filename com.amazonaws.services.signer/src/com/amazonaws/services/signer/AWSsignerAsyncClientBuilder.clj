(ns com.amazonaws.services.signer.AWSsignerAsyncClientBuilder
  "Fluent builder for AWSsignerAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.signer AWSsignerAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.signer.AWSsignerAsyncClientBuilder`"
  (^com.amazonaws.services.signer.AWSsignerAsyncClientBuilder []
    (AWSsignerAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.signer.AWSsignerAsync`"
  (^com.amazonaws.services.signer.AWSsignerAsync []
    (AWSsignerAsyncClientBuilder/defaultClient )))

