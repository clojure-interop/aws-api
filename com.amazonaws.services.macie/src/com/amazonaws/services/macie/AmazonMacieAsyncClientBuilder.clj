(ns com.amazonaws.services.macie.AmazonMacieAsyncClientBuilder
  "Fluent builder for AmazonMacieAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.macie AmazonMacieAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.macie.AmazonMacieAsyncClientBuilder`"
  (^com.amazonaws.services.macie.AmazonMacieAsyncClientBuilder []
    (AmazonMacieAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.macie.AmazonMacieAsync`"
  (^com.amazonaws.services.macie.AmazonMacieAsync []
    (AmazonMacieAsyncClientBuilder/defaultClient )))

