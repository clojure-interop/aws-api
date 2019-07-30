(ns com.amazonaws.services.mturk.AmazonMTurkClientBuilder
  "Fluent builder for AmazonMTurk. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mturk AmazonMTurkClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mturk.AmazonMTurkClientBuilder`"
  (^com.amazonaws.services.mturk.AmazonMTurkClientBuilder []
    (AmazonMTurkClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mturk.AmazonMTurk`"
  (^com.amazonaws.services.mturk.AmazonMTurk []
    (AmazonMTurkClientBuilder/defaultClient )))

