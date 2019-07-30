(ns com.amazonaws.services.simpledb.AmazonSimpleDBClientBuilder
  "Fluent builder for AmazonSimpleDB. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpledb AmazonSimpleDBClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.simpledb.AmazonSimpleDBClientBuilder`"
  (^com.amazonaws.services.simpledb.AmazonSimpleDBClientBuilder []
    (AmazonSimpleDBClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.simpledb.AmazonSimpleDB`"
  (^com.amazonaws.services.simpledb.AmazonSimpleDB []
    (AmazonSimpleDBClientBuilder/defaultClient )))

