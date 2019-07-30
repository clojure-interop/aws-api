(ns com.amazonaws.services.codepipeline.AWSCodePipelineClientBuilder
  "Fluent builder for AWSCodePipeline. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codepipeline AWSCodePipelineClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.codepipeline.AWSCodePipelineClientBuilder`"
  (^com.amazonaws.services.codepipeline.AWSCodePipelineClientBuilder []
    (AWSCodePipelineClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.codepipeline.AWSCodePipeline`"
  (^com.amazonaws.services.codepipeline.AWSCodePipeline []
    (AWSCodePipelineClientBuilder/defaultClient )))

