(ns com.amazonaws.services.cloud9.AWSCloud9AsyncClientBuilder
  "Fluent builder for AWSCloud9Async. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloud9 AWSCloud9AsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloud9.AWSCloud9AsyncClientBuilder`"
  (^com.amazonaws.services.cloud9.AWSCloud9AsyncClientBuilder []
    (AWSCloud9AsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloud9.AWSCloud9Async`"
  (^com.amazonaws.services.cloud9.AWSCloud9Async []
    (AWSCloud9AsyncClientBuilder/defaultClient )))

