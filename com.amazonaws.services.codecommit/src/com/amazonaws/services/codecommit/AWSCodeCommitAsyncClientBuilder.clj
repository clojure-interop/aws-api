(ns com.amazonaws.services.codecommit.AWSCodeCommitAsyncClientBuilder
  "Fluent builder for AWSCodeCommitAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codecommit AWSCodeCommitAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.codecommit.AWSCodeCommitAsyncClientBuilder`"
  (^com.amazonaws.services.codecommit.AWSCodeCommitAsyncClientBuilder []
    (AWSCodeCommitAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.codecommit.AWSCodeCommitAsync`"
  (^com.amazonaws.services.codecommit.AWSCodeCommitAsync []
    (AWSCodeCommitAsyncClientBuilder/defaultClient )))

