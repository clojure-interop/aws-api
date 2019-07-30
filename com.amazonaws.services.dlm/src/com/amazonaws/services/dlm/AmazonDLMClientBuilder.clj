(ns com.amazonaws.services.dlm.AmazonDLMClientBuilder
  "Fluent builder for AmazonDLM. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dlm AmazonDLMClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.dlm.AmazonDLMClientBuilder`"
  (^com.amazonaws.services.dlm.AmazonDLMClientBuilder []
    (AmazonDLMClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.dlm.AmazonDLM`"
  (^com.amazonaws.services.dlm.AmazonDLM []
    (AmazonDLMClientBuilder/defaultClient )))

