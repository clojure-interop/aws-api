(ns com.amazonaws.services.ecr.AmazonECRAsyncClientBuilder
  "Fluent builder for AmazonECRAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecr AmazonECRAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.ecr.AmazonECRAsyncClientBuilder`"
  (^com.amazonaws.services.ecr.AmazonECRAsyncClientBuilder []
    (AmazonECRAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.ecr.AmazonECRAsync`"
  (^com.amazonaws.services.ecr.AmazonECRAsync []
    (AmazonECRAsyncClientBuilder/defaultClient )))

