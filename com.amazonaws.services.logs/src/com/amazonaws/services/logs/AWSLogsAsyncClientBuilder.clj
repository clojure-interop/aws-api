(ns com.amazonaws.services.logs.AWSLogsAsyncClientBuilder
  "Fluent builder for AWSLogsAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.logs AWSLogsAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.logs.AWSLogsAsyncClientBuilder`"
  (^com.amazonaws.services.logs.AWSLogsAsyncClientBuilder []
    (AWSLogsAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.logs.AWSLogsAsync`"
  (^com.amazonaws.services.logs.AWSLogsAsync []
    (AWSLogsAsyncClientBuilder/defaultClient )))

