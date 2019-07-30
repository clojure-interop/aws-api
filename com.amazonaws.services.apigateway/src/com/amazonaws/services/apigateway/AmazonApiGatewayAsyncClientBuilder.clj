(ns com.amazonaws.services.apigateway.AmazonApiGatewayAsyncClientBuilder
  "Fluent builder for AmazonApiGatewayAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigateway AmazonApiGatewayAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.apigateway.AmazonApiGatewayAsyncClientBuilder`"
  (^com.amazonaws.services.apigateway.AmazonApiGatewayAsyncClientBuilder []
    (AmazonApiGatewayAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.apigateway.AmazonApiGatewayAsync`"
  (^com.amazonaws.services.apigateway.AmazonApiGatewayAsync []
    (AmazonApiGatewayAsyncClientBuilder/defaultClient )))

