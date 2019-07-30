(ns com.amazonaws.services.macie.AmazonMacieClientBuilder
  "Fluent builder for AmazonMacie. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.macie AmazonMacieClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.macie.AmazonMacieClientBuilder`"
  (^com.amazonaws.services.macie.AmazonMacieClientBuilder []
    (AmazonMacieClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.macie.AmazonMacie`"
  (^com.amazonaws.services.macie.AmazonMacie []
    (AmazonMacieClientBuilder/defaultClient )))

