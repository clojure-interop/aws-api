(ns com.amazonaws.services.worklink.AmazonWorkLinkClientBuilder
  "Fluent builder for AmazonWorkLink. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.worklink AmazonWorkLinkClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.worklink.AmazonWorkLinkClientBuilder`"
  (^com.amazonaws.services.worklink.AmazonWorkLinkClientBuilder []
    (AmazonWorkLinkClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.worklink.AmazonWorkLink`"
  (^com.amazonaws.services.worklink.AmazonWorkLink []
    (AmazonWorkLinkClientBuilder/defaultClient )))

