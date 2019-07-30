(ns com.amazonaws.services.mediaconnect.AWSMediaConnectClientBuilder
  "Fluent builder for AWSMediaConnect. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconnect AWSMediaConnectClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mediaconnect.AWSMediaConnectClientBuilder`"
  (^com.amazonaws.services.mediaconnect.AWSMediaConnectClientBuilder []
    (AWSMediaConnectClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mediaconnect.AWSMediaConnect`"
  (^com.amazonaws.services.mediaconnect.AWSMediaConnect []
    (AWSMediaConnectClientBuilder/defaultClient )))

