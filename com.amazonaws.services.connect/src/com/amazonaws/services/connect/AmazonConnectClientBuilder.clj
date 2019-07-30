(ns com.amazonaws.services.connect.AmazonConnectClientBuilder
  "Fluent builder for AmazonConnect. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.connect AmazonConnectClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.connect.AmazonConnectClientBuilder`"
  (^com.amazonaws.services.connect.AmazonConnectClientBuilder []
    (AmazonConnectClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.connect.AmazonConnect`"
  (^com.amazonaws.services.connect.AmazonConnect []
    (AmazonConnectClientBuilder/defaultClient )))

