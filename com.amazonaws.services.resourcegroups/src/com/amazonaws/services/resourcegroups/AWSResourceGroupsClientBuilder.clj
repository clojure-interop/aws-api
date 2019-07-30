(ns com.amazonaws.services.resourcegroups.AWSResourceGroupsClientBuilder
  "Fluent builder for AWSResourceGroups. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroups AWSResourceGroupsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.resourcegroups.AWSResourceGroupsClientBuilder`"
  (^com.amazonaws.services.resourcegroups.AWSResourceGroupsClientBuilder []
    (AWSResourceGroupsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.resourcegroups.AWSResourceGroups`"
  (^com.amazonaws.services.resourcegroups.AWSResourceGroups []
    (AWSResourceGroupsClientBuilder/defaultClient )))

