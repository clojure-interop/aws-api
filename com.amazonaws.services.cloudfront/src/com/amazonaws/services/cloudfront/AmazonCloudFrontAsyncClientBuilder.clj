(ns com.amazonaws.services.cloudfront.AmazonCloudFrontAsyncClientBuilder
  "Fluent builder for AmazonCloudFrontAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudfront AmazonCloudFrontAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.cloudfront.AmazonCloudFrontAsyncClientBuilder`"
  (^com.amazonaws.services.cloudfront.AmazonCloudFrontAsyncClientBuilder []
    (AmazonCloudFrontAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.cloudfront.AmazonCloudFrontAsync`"
  (^com.amazonaws.services.cloudfront.AmazonCloudFrontAsync []
    (AmazonCloudFrontAsyncClientBuilder/defaultClient )))

