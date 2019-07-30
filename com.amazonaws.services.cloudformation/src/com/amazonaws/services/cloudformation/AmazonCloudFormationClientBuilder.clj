(ns com.amazonaws.services.cloudformation.AmazonCloudFormationClientBuilder
  "Fluent builder for AmazonCloudFormation. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudformation AmazonCloudFormationClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloudformation.AmazonCloudFormationClientBuilder`"
  (^com.amazonaws.services.cloudformation.AmazonCloudFormationClientBuilder []
    (AmazonCloudFormationClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloudformation.AmazonCloudFormation`"
  (^com.amazonaws.services.cloudformation.AmazonCloudFormation []
    (AmazonCloudFormationClientBuilder/defaultClient )))

