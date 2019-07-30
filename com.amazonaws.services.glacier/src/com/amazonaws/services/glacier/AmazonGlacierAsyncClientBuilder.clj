(ns com.amazonaws.services.glacier.AmazonGlacierAsyncClientBuilder
  "Fluent builder for AmazonGlacierAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glacier AmazonGlacierAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.glacier.AmazonGlacierAsyncClientBuilder`"
  (^com.amazonaws.services.glacier.AmazonGlacierAsyncClientBuilder []
    (AmazonGlacierAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.glacier.AmazonGlacierAsync`"
  (^com.amazonaws.services.glacier.AmazonGlacierAsync []
    (AmazonGlacierAsyncClientBuilder/defaultClient )))

