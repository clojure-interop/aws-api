(ns com.amazonaws.services.acmpca.AWSACMPCAClientBuilder
  "Fluent builder for AWSACMPCA. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.acmpca AWSACMPCAClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.acmpca.AWSACMPCAClientBuilder`"
  (^com.amazonaws.services.acmpca.AWSACMPCAClientBuilder []
    (AWSACMPCAClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.acmpca.AWSACMPCA`"
  (^com.amazonaws.services.acmpca.AWSACMPCA []
    (AWSACMPCAClientBuilder/defaultClient )))

