(ns com.amazonaws.services.sns.AmazonSNSClientBuilder
  "Fluent builder for AmazonSNS. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sns AmazonSNSClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.sns.AmazonSNSClientBuilder`"
  (^com.amazonaws.services.sns.AmazonSNSClientBuilder []
    (AmazonSNSClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.sns.AmazonSNS`"
  (^com.amazonaws.services.sns.AmazonSNS []
    (AmazonSNSClientBuilder/defaultClient )))

