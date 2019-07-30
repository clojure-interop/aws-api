(ns com.amazonaws.services.backup.AWSBackupClientBuilder
  "Fluent builder for AWSBackup. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.backup AWSBackupClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.backup.AWSBackupClientBuilder`"
  (^com.amazonaws.services.backup.AWSBackupClientBuilder []
    (AWSBackupClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.backup.AWSBackup`"
  (^com.amazonaws.services.backup.AWSBackup []
    (AWSBackupClientBuilder/defaultClient )))

