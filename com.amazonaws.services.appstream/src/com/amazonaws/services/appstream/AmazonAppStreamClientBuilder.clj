(ns com.amazonaws.services.appstream.AmazonAppStreamClientBuilder
  "Fluent builder for AmazonAppStream. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appstream AmazonAppStreamClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.appstream.AmazonAppStreamClientBuilder`"
  (^com.amazonaws.services.appstream.AmazonAppStreamClientBuilder []
    (AmazonAppStreamClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.appstream.AmazonAppStream`"
  (^com.amazonaws.services.appstream.AmazonAppStream []
    (AmazonAppStreamClientBuilder/defaultClient )))

