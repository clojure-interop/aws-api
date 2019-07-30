(ns com.amazonaws.services.appsync.AWSAppSyncClientBuilder
  "Fluent builder for AWSAppSync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appsync AWSAppSyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.appsync.AWSAppSyncClientBuilder`"
  (^com.amazonaws.services.appsync.AWSAppSyncClientBuilder []
    (AWSAppSyncClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.appsync.AWSAppSync`"
  (^com.amazonaws.services.appsync.AWSAppSync []
    (AWSAppSyncClientBuilder/defaultClient )))

