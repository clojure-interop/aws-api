(ns com.amazonaws.services.support.AWSSupportAsyncClientBuilder
  "Fluent builder for AWSSupportAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.support AWSSupportAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.support.AWSSupportAsyncClientBuilder`"
  (^com.amazonaws.services.support.AWSSupportAsyncClientBuilder []
    (AWSSupportAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.support.AWSSupportAsync`"
  (^com.amazonaws.services.support.AWSSupportAsync []
    (AWSSupportAsyncClientBuilder/defaultClient )))

