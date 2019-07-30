(ns com.amazonaws.services.athena.AmazonAthenaAsyncClientBuilder
  "Fluent builder for AmazonAthenaAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.athena AmazonAthenaAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.athena.AmazonAthenaAsyncClientBuilder`"
  (^com.amazonaws.services.athena.AmazonAthenaAsyncClientBuilder []
    (AmazonAthenaAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.athena.AmazonAthenaAsync`"
  (^com.amazonaws.services.athena.AmazonAthenaAsync []
    (AmazonAthenaAsyncClientBuilder/defaultClient )))

