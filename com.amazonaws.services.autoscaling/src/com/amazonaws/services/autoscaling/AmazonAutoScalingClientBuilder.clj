(ns com.amazonaws.services.autoscaling.AmazonAutoScalingClientBuilder
  "Fluent builder for AmazonAutoScaling. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.autoscaling AmazonAutoScalingClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.autoscaling.AmazonAutoScalingClientBuilder`"
  (^com.amazonaws.services.autoscaling.AmazonAutoScalingClientBuilder []
    (AmazonAutoScalingClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.autoscaling.AmazonAutoScaling`"
  (^com.amazonaws.services.autoscaling.AmazonAutoScaling []
    (AmazonAutoScalingClientBuilder/defaultClient )))

