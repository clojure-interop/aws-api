(ns com.amazonaws.services.batch.AWSBatchAsyncClientBuilder
  "Fluent builder for AWSBatchAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.batch AWSBatchAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.batch.AWSBatchAsyncClientBuilder`"
  (^com.amazonaws.services.batch.AWSBatchAsyncClientBuilder []
    (AWSBatchAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.batch.AWSBatchAsync`"
  (^com.amazonaws.services.batch.AWSBatchAsync []
    (AWSBatchAsyncClientBuilder/defaultClient )))

