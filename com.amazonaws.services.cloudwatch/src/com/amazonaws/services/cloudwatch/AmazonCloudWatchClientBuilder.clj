(ns com.amazonaws.services.cloudwatch.AmazonCloudWatchClientBuilder
  "Fluent builder for AmazonCloudWatch. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudwatch AmazonCloudWatchClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloudwatch.AmazonCloudWatchClientBuilder`"
  (^com.amazonaws.services.cloudwatch.AmazonCloudWatchClientBuilder []
    (AmazonCloudWatchClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloudwatch.AmazonCloudWatch`"
  (^com.amazonaws.services.cloudwatch.AmazonCloudWatch []
    (AmazonCloudWatchClientBuilder/defaultClient )))

