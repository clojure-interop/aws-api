(ns com.amazonaws.services.datasync.AWSDataSyncClientBuilder
  "Fluent builder for AWSDataSync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datasync AWSDataSyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.datasync.AWSDataSyncClientBuilder`"
  (^com.amazonaws.services.datasync.AWSDataSyncClientBuilder []
    (AWSDataSyncClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.datasync.AWSDataSync`"
  (^com.amazonaws.services.datasync.AWSDataSync []
    (AWSDataSyncClientBuilder/defaultClient )))

