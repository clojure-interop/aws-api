(ns com.amazonaws.services.glacier.AmazonGlacierClientBuilder
  "Fluent builder for AmazonGlacier. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glacier AmazonGlacierClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.glacier.AmazonGlacierClientBuilder`"
  (^com.amazonaws.services.glacier.AmazonGlacierClientBuilder []
    (AmazonGlacierClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.glacier.AmazonGlacier`"
  (^com.amazonaws.services.glacier.AmazonGlacier []
    (AmazonGlacierClientBuilder/defaultClient )))

