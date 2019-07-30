(ns com.amazonaws.services.datapipeline.DataPipelineClientBuilder
  "Fluent builder for DataPipeline. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datapipeline DataPipelineClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.datapipeline.DataPipelineClientBuilder`"
  (^com.amazonaws.services.datapipeline.DataPipelineClientBuilder []
    (DataPipelineClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.datapipeline.DataPipeline`"
  (^com.amazonaws.services.datapipeline.DataPipeline []
    (DataPipelineClientBuilder/defaultClient )))

