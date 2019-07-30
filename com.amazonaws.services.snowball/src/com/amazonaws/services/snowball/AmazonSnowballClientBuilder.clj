(ns com.amazonaws.services.snowball.AmazonSnowballClientBuilder
  "Fluent builder for AmazonSnowball. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.snowball AmazonSnowballClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.snowball.AmazonSnowballClientBuilder`"
  (^com.amazonaws.services.snowball.AmazonSnowballClientBuilder []
    (AmazonSnowballClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.snowball.AmazonSnowball`"
  (^com.amazonaws.services.snowball.AmazonSnowball []
    (AmazonSnowballClientBuilder/defaultClient )))

