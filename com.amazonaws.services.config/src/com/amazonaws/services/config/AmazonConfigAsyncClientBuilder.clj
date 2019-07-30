(ns com.amazonaws.services.config.AmazonConfigAsyncClientBuilder
  "Fluent builder for AmazonConfigAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.config AmazonConfigAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.config.AmazonConfigAsyncClientBuilder`"
  (^com.amazonaws.services.config.AmazonConfigAsyncClientBuilder []
    (AmazonConfigAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.config.AmazonConfigAsync`"
  (^com.amazonaws.services.config.AmazonConfigAsync []
    (AmazonConfigAsyncClientBuilder/defaultClient )))

