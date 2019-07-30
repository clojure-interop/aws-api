(ns com.amazonaws.services.comprehend.AmazonComprehendAsyncClientBuilder
  "Fluent builder for AmazonComprehendAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehend AmazonComprehendAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.comprehend.AmazonComprehendAsyncClientBuilder`"
  (^com.amazonaws.services.comprehend.AmazonComprehendAsyncClientBuilder []
    (AmazonComprehendAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.comprehend.AmazonComprehendAsync`"
  (^com.amazonaws.services.comprehend.AmazonComprehendAsync []
    (AmazonComprehendAsyncClientBuilder/defaultClient )))

