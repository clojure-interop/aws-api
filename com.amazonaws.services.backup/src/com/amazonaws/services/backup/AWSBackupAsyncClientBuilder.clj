(ns com.amazonaws.services.backup.AWSBackupAsyncClientBuilder
  "Fluent builder for AWSBackupAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.backup AWSBackupAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.backup.AWSBackupAsyncClientBuilder`"
  (^com.amazonaws.services.backup.AWSBackupAsyncClientBuilder []
    (AWSBackupAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.backup.AWSBackupAsync`"
  (^com.amazonaws.services.backup.AWSBackupAsync []
    (AWSBackupAsyncClientBuilder/defaultClient )))

