(ns com.amazonaws.services.sqs.AmazonSQSClientBuilder
  "Fluent builder for AmazonSQS. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sqs AmazonSQSClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.sqs.AmazonSQSClientBuilder`"
  (^com.amazonaws.services.sqs.AmazonSQSClientBuilder []
    (AmazonSQSClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.sqs.AmazonSQS`"
  (^com.amazonaws.services.sqs.AmazonSQS []
    (AmazonSQSClientBuilder/defaultClient )))

