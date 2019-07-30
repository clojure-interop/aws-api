(ns com.amazonaws.services.fsx.AmazonFSxAsyncClientBuilder
  "Fluent builder for AmazonFSxAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fsx AmazonFSxAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.fsx.AmazonFSxAsyncClientBuilder`"
  (^com.amazonaws.services.fsx.AmazonFSxAsyncClientBuilder []
    (AmazonFSxAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.fsx.AmazonFSxAsync`"
  (^com.amazonaws.services.fsx.AmazonFSxAsync []
    (AmazonFSxAsyncClientBuilder/defaultClient )))

