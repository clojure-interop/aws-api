(ns com.amazonaws.services.polly.AmazonPollyClientBuilder
  "Fluent builder for AmazonPolly. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.polly AmazonPollyClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.polly.AmazonPollyClientBuilder`"
  (^com.amazonaws.services.polly.AmazonPollyClientBuilder []
    (AmazonPollyClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.polly.AmazonPolly`"
  (^com.amazonaws.services.polly.AmazonPolly []
    (AmazonPollyClientBuilder/defaultClient )))

