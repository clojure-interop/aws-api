(ns com.amazonaws.services.comprehend.AmazonComprehendClientBuilder
  "Fluent builder for AmazonComprehend. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehend AmazonComprehendClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.comprehend.AmazonComprehendClientBuilder`"
  (^com.amazonaws.services.comprehend.AmazonComprehendClientBuilder []
    (AmazonComprehendClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.comprehend.AmazonComprehend`"
  (^com.amazonaws.services.comprehend.AmazonComprehend []
    (AmazonComprehendClientBuilder/defaultClient )))

