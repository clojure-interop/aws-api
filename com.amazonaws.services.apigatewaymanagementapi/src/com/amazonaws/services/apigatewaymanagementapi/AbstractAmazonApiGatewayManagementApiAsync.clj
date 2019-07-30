(ns com.amazonaws.services.apigatewaymanagementapi.AbstractAmazonApiGatewayManagementApiAsync
  "Abstract implementation of AmazonApiGatewayManagementApiAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewaymanagementapi AbstractAmazonApiGatewayManagementApiAsync]))

(defn post-to-connection-async
  "Description copied from interface: AmazonApiGatewayManagementApiAsync

  request - `com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostToConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayManagementApiAsync this ^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postToConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonApiGatewayManagementApiAsync this ^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest request]
    (-> this (.postToConnectionAsync request))))

