(ns com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder
  "Fluent builder for AmazonSQSAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sqs AmazonSQSAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder`"
  (^com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder []
    (AmazonSQSAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.sqs.AmazonSQSAsync`"
  (^com.amazonaws.services.sqs.AmazonSQSAsync []
    (AmazonSQSAsyncClientBuilder/defaultClient )))

