(ns com.amazonaws.services.greengrass.AWSGreengrassAsyncClientBuilder
  "Fluent builder for AWSGreengrassAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.greengrass AWSGreengrassAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.greengrass.AWSGreengrassAsyncClientBuilder`"
  (^com.amazonaws.services.greengrass.AWSGreengrassAsyncClientBuilder []
    (AWSGreengrassAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.greengrass.AWSGreengrassAsync`"
  (^com.amazonaws.services.greengrass.AWSGreengrassAsync []
    (AWSGreengrassAsyncClientBuilder/defaultClient )))

