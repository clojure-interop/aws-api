(ns com.amazonaws.services.redshift.AmazonRedshiftClientBuilder
  "Fluent builder for AmazonRedshift. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.redshift AmazonRedshiftClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.redshift.AmazonRedshiftClientBuilder`"
  (^com.amazonaws.services.redshift.AmazonRedshiftClientBuilder []
    (AmazonRedshiftClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.redshift.AmazonRedshift`"
  (^com.amazonaws.services.redshift.AmazonRedshift []
    (AmazonRedshiftClientBuilder/defaultClient )))

