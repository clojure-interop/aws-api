(ns com.amazonaws.services.lambda.AWSLambdaClientBuilder
  "Fluent builder for AWSLambda. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lambda AWSLambdaClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.lambda.AWSLambdaClientBuilder`"
  (^com.amazonaws.services.lambda.AWSLambdaClientBuilder []
    (AWSLambdaClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.lambda.AWSLambda`"
  (^com.amazonaws.services.lambda.AWSLambda []
    (AWSLambdaClientBuilder/defaultClient )))

