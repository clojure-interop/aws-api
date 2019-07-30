(ns com.amazonaws.services.apigatewaymanagementapi.AbstractAmazonApiGatewayManagementApi
  "Abstract implementation of AmazonApiGatewayManagementApi. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewaymanagementapi AbstractAmazonApiGatewayManagementApi]))

(defn post-to-connection
  "Description copied from interface: AmazonApiGatewayManagementApi

  request - `com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest`

  returns: Result of the PostToConnection operation returned by the service. - `com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionResult`"
  (^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionResult [^AbstractAmazonApiGatewayManagementApi this ^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest request]
    (-> this (.postToConnection request))))

(defn shutdown
  "Description copied from interface: AmazonApiGatewayManagementApi"
  ([^AbstractAmazonApiGatewayManagementApi this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonApiGatewayManagementApi

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonApiGatewayManagementApi this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

