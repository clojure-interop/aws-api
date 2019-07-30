(ns com.amazonaws.services.rds.AmazonRDSClientBuilder
  "Fluent builder for AmazonRDS. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rds AmazonRDSClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.rds.AmazonRDSClientBuilder`"
  (^com.amazonaws.services.rds.AmazonRDSClientBuilder []
    (AmazonRDSClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.rds.AmazonRDS`"
  (^com.amazonaws.services.rds.AmazonRDS []
    (AmazonRDSClientBuilder/defaultClient )))

