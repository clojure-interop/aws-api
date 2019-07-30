(ns com.amazonaws.services.codebuild.AWSCodeBuildClientBuilder
  "Fluent builder for AWSCodeBuild. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codebuild AWSCodeBuildClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.codebuild.AWSCodeBuildClientBuilder`"
  (^com.amazonaws.services.codebuild.AWSCodeBuildClientBuilder []
    (AWSCodeBuildClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.codebuild.AWSCodeBuild`"
  (^com.amazonaws.services.codebuild.AWSCodeBuild []
    (AWSCodeBuildClientBuilder/defaultClient )))

