(ns com.amazonaws.services.signer.AWSsignerClientBuilder
  "Fluent builder for AWSsigner. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.signer AWSsignerClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.signer.AWSsignerClientBuilder`"
  (^com.amazonaws.services.signer.AWSsignerClientBuilder []
    (AWSsignerClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.signer.AWSsigner`"
  (^com.amazonaws.services.signer.AWSsigner []
    (AWSsignerClientBuilder/defaultClient )))

