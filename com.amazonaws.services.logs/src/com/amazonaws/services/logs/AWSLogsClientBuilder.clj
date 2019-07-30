(ns com.amazonaws.services.logs.AWSLogsClientBuilder
  "Fluent builder for AWSLogs. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.logs AWSLogsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.logs.AWSLogsClientBuilder`"
  (^com.amazonaws.services.logs.AWSLogsClientBuilder []
    (AWSLogsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.logs.AWSLogs`"
  (^com.amazonaws.services.logs.AWSLogs []
    (AWSLogsClientBuilder/defaultClient )))

