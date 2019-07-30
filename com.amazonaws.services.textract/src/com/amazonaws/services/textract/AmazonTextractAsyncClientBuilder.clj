(ns com.amazonaws.services.textract.AmazonTextractAsyncClientBuilder
  "Fluent builder for AmazonTextractAsync. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.textract AmazonTextractAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.textract.AmazonTextractAsyncClientBuilder`"
  (^com.amazonaws.services.textract.AmazonTextractAsyncClientBuilder []
    (AmazonTextractAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.textract.AmazonTextractAsync`"
  (^com.amazonaws.services.textract.AmazonTextractAsync []
    (AmazonTextractAsyncClientBuilder/defaultClient )))

