(ns com.amazonaws.services.docdb.AmazonDocDBClientBuilder
  "Fluent builder for AmazonDocDB. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.docdb AmazonDocDBClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.docdb.AmazonDocDBClientBuilder`"
  (^com.amazonaws.services.docdb.AmazonDocDBClientBuilder []
    (AmazonDocDBClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.docdb.AmazonDocDB`"
  (^com.amazonaws.services.docdb.AmazonDocDB []
    (AmazonDocDBClientBuilder/defaultClient )))

