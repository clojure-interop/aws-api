(ns com.amazonaws.services.amplify.AWSAmplifyAsyncClientBuilder
  "Fluent builder for AWSAmplifyAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.amplify AWSAmplifyAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.amplify.AWSAmplifyAsyncClientBuilder`"
  (^com.amazonaws.services.amplify.AWSAmplifyAsyncClientBuilder []
    (AWSAmplifyAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.amplify.AWSAmplifyAsync`"
  (^com.amazonaws.services.amplify.AWSAmplifyAsync []
    (AWSAmplifyAsyncClientBuilder/defaultClient )))

