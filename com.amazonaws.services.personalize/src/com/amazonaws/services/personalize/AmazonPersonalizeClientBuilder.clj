(ns com.amazonaws.services.personalize.AmazonPersonalizeClientBuilder
  "Fluent builder for AmazonPersonalize. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalize AmazonPersonalizeClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.personalize.AmazonPersonalizeClientBuilder`"
  (^com.amazonaws.services.personalize.AmazonPersonalizeClientBuilder []
    (AmazonPersonalizeClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.personalize.AmazonPersonalize`"
  (^com.amazonaws.services.personalize.AmazonPersonalize []
    (AmazonPersonalizeClientBuilder/defaultClient )))

