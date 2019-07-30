(ns com.amazonaws.services.rds.AmazonRDSAsyncClientBuilder
  "Fluent builder for AmazonRDSAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rds AmazonRDSAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.rds.AmazonRDSAsyncClientBuilder`"
  (^com.amazonaws.services.rds.AmazonRDSAsyncClientBuilder []
    (AmazonRDSAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.rds.AmazonRDSAsync`"
  (^com.amazonaws.services.rds.AmazonRDSAsync []
    (AmazonRDSAsyncClientBuilder/defaultClient )))

