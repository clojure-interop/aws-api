(ns com.amazonaws.services.apigateway.AmazonApiGatewayClientBuilder
  "Fluent builder for AmazonApiGateway. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigateway AmazonApiGatewayClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.apigateway.AmazonApiGatewayClientBuilder`"
  (^com.amazonaws.services.apigateway.AmazonApiGatewayClientBuilder []
    (AmazonApiGatewayClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.apigateway.AmazonApiGateway`"
  (^com.amazonaws.services.apigateway.AmazonApiGateway []
    (AmazonApiGatewayClientBuilder/defaultClient )))

