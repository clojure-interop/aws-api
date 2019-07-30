(ns com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2ClientBuilder
  "Fluent builder for AmazonApiGatewayV2. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewayv2 AmazonApiGatewayV2ClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2ClientBuilder`"
  (^com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2ClientBuilder []
    (AmazonApiGatewayV2ClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2`"
  (^com.amazonaws.services.apigatewayv2.AmazonApiGatewayV2 []
    (AmazonApiGatewayV2ClientBuilder/defaultClient )))

