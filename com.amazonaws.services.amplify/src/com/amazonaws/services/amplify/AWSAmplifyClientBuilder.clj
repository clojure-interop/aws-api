(ns com.amazonaws.services.amplify.AWSAmplifyClientBuilder
  "Fluent builder for AWSAmplify. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.amplify AWSAmplifyClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.amplify.AWSAmplifyClientBuilder`"
  (^com.amazonaws.services.amplify.AWSAmplifyClientBuilder []
    (AWSAmplifyClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.amplify.AWSAmplify`"
  (^com.amazonaws.services.amplify.AWSAmplify []
    (AWSAmplifyClientBuilder/defaultClient )))

