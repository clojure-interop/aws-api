(ns com.amazonaws.services.docdb.AmazonDocDBAsyncClientBuilder
  "Fluent builder for AmazonDocDBAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.docdb AmazonDocDBAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.docdb.AmazonDocDBAsyncClientBuilder`"
  (^com.amazonaws.services.docdb.AmazonDocDBAsyncClientBuilder []
    (AmazonDocDBAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.docdb.AmazonDocDBAsync`"
  (^com.amazonaws.services.docdb.AmazonDocDBAsync []
    (AmazonDocDBAsyncClientBuilder/defaultClient )))

