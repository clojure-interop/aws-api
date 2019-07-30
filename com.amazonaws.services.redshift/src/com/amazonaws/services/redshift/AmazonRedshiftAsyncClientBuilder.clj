(ns com.amazonaws.services.redshift.AmazonRedshiftAsyncClientBuilder
  "Fluent builder for AmazonRedshiftAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.redshift AmazonRedshiftAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.redshift.AmazonRedshiftAsyncClientBuilder`"
  (^com.amazonaws.services.redshift.AmazonRedshiftAsyncClientBuilder []
    (AmazonRedshiftAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.redshift.AmazonRedshiftAsync`"
  (^com.amazonaws.services.redshift.AmazonRedshiftAsync []
    (AmazonRedshiftAsyncClientBuilder/defaultClient )))

