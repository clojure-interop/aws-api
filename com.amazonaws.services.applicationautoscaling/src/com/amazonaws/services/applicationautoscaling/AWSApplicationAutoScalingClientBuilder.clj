(ns com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingClientBuilder
  "Fluent builder for AWSApplicationAutoScaling. Use of the
  builder is preferred over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationautoscaling AWSApplicationAutoScalingClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingClientBuilder`"
  (^com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScalingClientBuilder []
    (AWSApplicationAutoScalingClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScaling`"
  (^com.amazonaws.services.applicationautoscaling.AWSApplicationAutoScaling []
    (AWSApplicationAutoScalingClientBuilder/defaultClient )))

