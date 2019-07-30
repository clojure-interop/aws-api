(ns com.amazonaws.services.codebuild.AWSCodeBuildAsyncClientBuilder
  "Fluent builder for AWSCodeBuildAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codebuild AWSCodeBuildAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.codebuild.AWSCodeBuildAsyncClientBuilder`"
  (^com.amazonaws.services.codebuild.AWSCodeBuildAsyncClientBuilder []
    (AWSCodeBuildAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.codebuild.AWSCodeBuildAsync`"
  (^com.amazonaws.services.codebuild.AWSCodeBuildAsync []
    (AWSCodeBuildAsyncClientBuilder/defaultClient )))

