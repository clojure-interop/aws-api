(ns com.amazonaws.services.codecommit.AWSCodeCommitClientBuilder
  "Fluent builder for AWSCodeCommit. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codecommit AWSCodeCommitClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.codecommit.AWSCodeCommitClientBuilder`"
  (^com.amazonaws.services.codecommit.AWSCodeCommitClientBuilder []
    (AWSCodeCommitClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.codecommit.AWSCodeCommit`"
  (^com.amazonaws.services.codecommit.AWSCodeCommit []
    (AWSCodeCommitClientBuilder/defaultClient )))

