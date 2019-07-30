(ns com.amazonaws.services.personalize.AmazonPersonalizeAsyncClientBuilder
  "Fluent builder for AmazonPersonalizeAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalize AmazonPersonalizeAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.personalize.AmazonPersonalizeAsyncClientBuilder`"
  (^com.amazonaws.services.personalize.AmazonPersonalizeAsyncClientBuilder []
    (AmazonPersonalizeAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.personalize.AmazonPersonalizeAsync`"
  (^com.amazonaws.services.personalize.AmazonPersonalizeAsync []
    (AmazonPersonalizeAsyncClientBuilder/defaultClient )))

