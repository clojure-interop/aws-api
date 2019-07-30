(ns com.amazonaws.services.kms.AWSKMSAsyncClientBuilder
  "Fluent builder for AWSKMSAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kms AWSKMSAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.kms.AWSKMSAsyncClientBuilder`"
  (^com.amazonaws.services.kms.AWSKMSAsyncClientBuilder []
    (AWSKMSAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.kms.AWSKMSAsync`"
  (^com.amazonaws.services.kms.AWSKMSAsync []
    (AWSKMSAsyncClientBuilder/defaultClient )))

