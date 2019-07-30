(ns com.amazonaws.services.codestar.AWSCodeStarClientBuilder
  "Fluent builder for AWSCodeStar. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codestar AWSCodeStarClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.codestar.AWSCodeStarClientBuilder`"
  (^com.amazonaws.services.codestar.AWSCodeStarClientBuilder []
    (AWSCodeStarClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.codestar.AWSCodeStar`"
  (^com.amazonaws.services.codestar.AWSCodeStar []
    (AWSCodeStarClientBuilder/defaultClient )))

