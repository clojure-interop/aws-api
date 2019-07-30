(ns com.amazonaws.services.lambda.AWSLambdaAsyncClientBuilder
  "Fluent builder for AWSLambdaAsync. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lambda AWSLambdaAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.lambda.AWSLambdaAsyncClientBuilder`"
  (^com.amazonaws.services.lambda.AWSLambdaAsyncClientBuilder []
    (AWSLambdaAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.lambda.AWSLambdaAsync`"
  (^com.amazonaws.services.lambda.AWSLambdaAsync []
    (AWSLambdaAsyncClientBuilder/defaultClient )))

