(ns com.amazonaws.services.cloudwatchevents.AmazonCloudWatchEventsClientBuilder
  "Fluent builder for AmazonCloudWatchEvents. Use of the builder is
  preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudwatchevents AmazonCloudWatchEventsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloudwatchevents.AmazonCloudWatchEventsClientBuilder`"
  (^com.amazonaws.services.cloudwatchevents.AmazonCloudWatchEventsClientBuilder []
    (AmazonCloudWatchEventsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloudwatchevents.AmazonCloudWatchEvents`"
  (^com.amazonaws.services.cloudwatchevents.AmazonCloudWatchEvents []
    (AmazonCloudWatchEventsClientBuilder/defaultClient )))

