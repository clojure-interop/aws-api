(ns com.amazonaws.services.cloudfront.AmazonCloudFrontClientBuilder
  "Fluent builder for AmazonCloudFront. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront AmazonCloudFrontClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloudfront.AmazonCloudFrontClientBuilder`"
  (^com.amazonaws.services.cloudfront.AmazonCloudFrontClientBuilder []
    (AmazonCloudFrontClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloudfront.AmazonCloudFront`"
  (^com.amazonaws.services.cloudfront.AmazonCloudFront []
    (AmazonCloudFrontClientBuilder/defaultClient )))

