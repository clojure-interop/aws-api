(ns com.amazonaws.services.athena.AmazonAthenaClientBuilder
  "Fluent builder for AmazonAthena. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.athena AmazonAthenaClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.athena.AmazonAthenaClientBuilder`"
  (^com.amazonaws.services.athena.AmazonAthenaClientBuilder []
    (AmazonAthenaClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.athena.AmazonAthena`"
  (^com.amazonaws.services.athena.AmazonAthena []
    (AmazonAthenaClientBuilder/defaultClient )))

