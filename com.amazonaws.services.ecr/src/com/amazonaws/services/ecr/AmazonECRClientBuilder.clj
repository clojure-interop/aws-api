(ns com.amazonaws.services.ecr.AmazonECRClientBuilder
  "Fluent builder for AmazonECR. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ecr AmazonECRClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.ecr.AmazonECRClientBuilder`"
  (^com.amazonaws.services.ecr.AmazonECRClientBuilder []
    (AmazonECRClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.ecr.AmazonECR`"
  (^com.amazonaws.services.ecr.AmazonECR []
    (AmazonECRClientBuilder/defaultClient )))

