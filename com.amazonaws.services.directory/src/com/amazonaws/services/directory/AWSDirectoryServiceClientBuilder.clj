(ns com.amazonaws.services.directory.AWSDirectoryServiceClientBuilder
  "Fluent builder for AWSDirectoryService. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.directory AWSDirectoryServiceClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.directory.AWSDirectoryServiceClientBuilder`"
  (^com.amazonaws.services.directory.AWSDirectoryServiceClientBuilder []
    (AWSDirectoryServiceClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.directory.AWSDirectoryService`"
  (^com.amazonaws.services.directory.AWSDirectoryService []
    (AWSDirectoryServiceClientBuilder/defaultClient )))

