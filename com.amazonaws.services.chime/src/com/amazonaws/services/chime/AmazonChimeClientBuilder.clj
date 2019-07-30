(ns com.amazonaws.services.chime.AmazonChimeClientBuilder
  "Fluent builder for AmazonChime. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.chime AmazonChimeClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.chime.AmazonChimeClientBuilder`"
  (^com.amazonaws.services.chime.AmazonChimeClientBuilder []
    (AmazonChimeClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.chime.AmazonChime`"
  (^com.amazonaws.services.chime.AmazonChime []
    (AmazonChimeClientBuilder/defaultClient )))

