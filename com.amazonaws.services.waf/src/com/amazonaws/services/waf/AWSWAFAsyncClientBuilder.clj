(ns com.amazonaws.services.waf.AWSWAFAsyncClientBuilder
  "Fluent builder for AWSWAFAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.waf AWSWAFAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.waf.AWSWAFAsyncClientBuilder`"
  (^com.amazonaws.services.waf.AWSWAFAsyncClientBuilder []
    (AWSWAFAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.waf.AWSWAFAsync`"
  (^com.amazonaws.services.waf.AWSWAFAsync []
    (AWSWAFAsyncClientBuilder/defaultClient )))

