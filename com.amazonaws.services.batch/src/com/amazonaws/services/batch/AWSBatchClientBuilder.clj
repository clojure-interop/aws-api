(ns com.amazonaws.services.batch.AWSBatchClientBuilder
  "Fluent builder for AWSBatch. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.batch AWSBatchClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.batch.AWSBatchClientBuilder`"
  (^com.amazonaws.services.batch.AWSBatchClientBuilder []
    (AWSBatchClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.batch.AWSBatch`"
  (^com.amazonaws.services.batch.AWSBatch []
    (AWSBatchClientBuilder/defaultClient )))

