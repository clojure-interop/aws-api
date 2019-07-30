(ns com.amazonaws.services.chime.AmazonChimeAsyncClientBuilder
  "Fluent builder for AmazonChimeAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.chime AmazonChimeAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.chime.AmazonChimeAsyncClientBuilder`"
  (^com.amazonaws.services.chime.AmazonChimeAsyncClientBuilder []
    (AmazonChimeAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.chime.AmazonChimeAsync`"
  (^com.amazonaws.services.chime.AmazonChimeAsync []
    (AmazonChimeAsyncClientBuilder/defaultClient )))

