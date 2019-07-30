(ns com.amazonaws.services.kms.AWSKMSClientBuilder
  "Fluent builder for AWSKMS. Use of the builder is preferred over using constructors
  of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kms AWSKMSClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.kms.AWSKMSClientBuilder`"
  (^com.amazonaws.services.kms.AWSKMSClientBuilder []
    (AWSKMSClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.kms.AWSKMS`"
  (^com.amazonaws.services.kms.AWSKMS []
    (AWSKMSClientBuilder/defaultClient )))

