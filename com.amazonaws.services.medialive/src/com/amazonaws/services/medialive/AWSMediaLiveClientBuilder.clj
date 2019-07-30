(ns com.amazonaws.services.medialive.AWSMediaLiveClientBuilder
  "Fluent builder for AWSMediaLive. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.medialive AWSMediaLiveClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.medialive.AWSMediaLiveClientBuilder`"
  (^com.amazonaws.services.medialive.AWSMediaLiveClientBuilder []
    (AWSMediaLiveClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.medialive.AWSMediaLive`"
  (^com.amazonaws.services.medialive.AWSMediaLive []
    (AWSMediaLiveClientBuilder/defaultClient )))

