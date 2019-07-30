(ns com.amazonaws.services.cloudformation.AmazonCloudFormationAsyncClientBuilder
  "Fluent builder for AmazonCloudFormationAsync. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudformation AmazonCloudFormationAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloudformation.AmazonCloudFormationAsyncClientBuilder`"
  (^com.amazonaws.services.cloudformation.AmazonCloudFormationAsyncClientBuilder []
    (AmazonCloudFormationAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloudformation.AmazonCloudFormationAsync`"
  (^com.amazonaws.services.cloudformation.AmazonCloudFormationAsync []
    (AmazonCloudFormationAsyncClientBuilder/defaultClient )))

