(ns com.amazonaws.services.config.AmazonConfigClientBuilder
  "Fluent builder for AmazonConfig. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.config AmazonConfigClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.config.AmazonConfigClientBuilder`"
  (^com.amazonaws.services.config.AmazonConfigClientBuilder []
    (AmazonConfigClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.config.AmazonConfig`"
  (^com.amazonaws.services.config.AmazonConfig []
    (AmazonConfigClientBuilder/defaultClient )))

