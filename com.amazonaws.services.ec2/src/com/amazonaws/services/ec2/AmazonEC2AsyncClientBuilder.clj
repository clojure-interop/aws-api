(ns com.amazonaws.services.ec2.AmazonEC2AsyncClientBuilder
  "Fluent builder for AmazonEC2Async. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2 AmazonEC2AsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.ec2.AmazonEC2AsyncClientBuilder`"
  (^com.amazonaws.services.ec2.AmazonEC2AsyncClientBuilder []
    (AmazonEC2AsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.ec2.AmazonEC2Async`"
  (^com.amazonaws.services.ec2.AmazonEC2Async []
    (AmazonEC2AsyncClientBuilder/defaultClient )))

