(ns com.amazonaws.services.autoscaling.AmazonAutoScalingAsyncClientBuilder
  "Fluent builder for AmazonAutoScalingAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscaling AmazonAutoScalingAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.autoscaling.AmazonAutoScalingAsyncClientBuilder`"
  (^com.amazonaws.services.autoscaling.AmazonAutoScalingAsyncClientBuilder []
    (AmazonAutoScalingAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.autoscaling.AmazonAutoScalingAsync`"
  (^com.amazonaws.services.autoscaling.AmazonAutoScalingAsync []
    (AmazonAutoScalingAsyncClientBuilder/defaultClient )))

