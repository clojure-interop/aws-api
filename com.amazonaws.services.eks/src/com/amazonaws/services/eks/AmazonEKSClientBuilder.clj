(ns com.amazonaws.services.eks.AmazonEKSClientBuilder
  "Fluent builder for AmazonEKS. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eks AmazonEKSClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.eks.AmazonEKSClientBuilder`"
  (^com.amazonaws.services.eks.AmazonEKSClientBuilder []
    (AmazonEKSClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.eks.AmazonEKS`"
  (^com.amazonaws.services.eks.AmazonEKS []
    (AmazonEKSClientBuilder/defaultClient )))

