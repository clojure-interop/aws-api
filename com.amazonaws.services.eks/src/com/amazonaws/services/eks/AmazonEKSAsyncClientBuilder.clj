(ns com.amazonaws.services.eks.AmazonEKSAsyncClientBuilder
  "Fluent builder for AmazonEKSAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eks AmazonEKSAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.eks.AmazonEKSAsyncClientBuilder`"
  (^com.amazonaws.services.eks.AmazonEKSAsyncClientBuilder []
    (AmazonEKSAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.eks.AmazonEKSAsync`"
  (^com.amazonaws.services.eks.AmazonEKSAsync []
    (AmazonEKSAsyncClientBuilder/defaultClient )))

