(ns com.amazonaws.services.cloudwatch.AmazonCloudWatchAsyncClientBuilder
  "Fluent builder for AmazonCloudWatchAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudwatch AmazonCloudWatchAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloudwatch.AmazonCloudWatchAsyncClientBuilder`"
  (^com.amazonaws.services.cloudwatch.AmazonCloudWatchAsyncClientBuilder []
    (AmazonCloudWatchAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloudwatch.AmazonCloudWatchAsync`"
  (^com.amazonaws.services.cloudwatch.AmazonCloudWatchAsync []
    (AmazonCloudWatchAsyncClientBuilder/defaultClient )))

