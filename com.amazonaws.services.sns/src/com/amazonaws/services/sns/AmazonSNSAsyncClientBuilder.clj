(ns com.amazonaws.services.sns.AmazonSNSAsyncClientBuilder
  "Fluent builder for AmazonSNSAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sns AmazonSNSAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.sns.AmazonSNSAsyncClientBuilder`"
  (^com.amazonaws.services.sns.AmazonSNSAsyncClientBuilder []
    (AmazonSNSAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.sns.AmazonSNSAsync`"
  (^com.amazonaws.services.sns.AmazonSNSAsync []
    (AmazonSNSAsyncClientBuilder/defaultClient )))

