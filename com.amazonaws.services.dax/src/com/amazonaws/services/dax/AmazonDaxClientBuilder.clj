(ns com.amazonaws.services.dax.AmazonDaxClientBuilder
  "Fluent builder for AmazonDax. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dax AmazonDaxClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.dax.AmazonDaxClientBuilder`"
  (^com.amazonaws.services.dax.AmazonDaxClientBuilder []
    (AmazonDaxClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.dax.AmazonDax`"
  (^com.amazonaws.services.dax.AmazonDax []
    (AmazonDaxClientBuilder/defaultClient )))

