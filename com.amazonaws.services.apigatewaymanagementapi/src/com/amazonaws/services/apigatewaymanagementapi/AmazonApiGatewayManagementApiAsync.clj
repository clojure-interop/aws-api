(ns com.amazonaws.services.apigatewaymanagementapi.AmazonApiGatewayManagementApiAsync
  "Interface for accessing AmazonApiGatewayManagementApi asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonApiGatewayManagementApiAsync instead.



  The Amazon API Gateway Management API allows you to directly manage runtime aspects of your deployed APIs. To use it,
  you must explicitly set the SDK's endpoint to point to the endpoint of your deployed API. The endpoint will be of the
  form https://{api-id}.execute-api.{region}.amazonaws.com/{stage}, or will be the endpoint corresponding to your API's
  custom domain and base path, if applicable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewaymanagementapi AmazonApiGatewayManagementApiAsync]))

(defn post-to-connection-async
  "Sends the provided data to the specified connection.

  post-to-connection-request - `com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostToConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayManagementApiAsync this ^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest post-to-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postToConnectionAsync post-to-connection-request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayManagementApiAsync this ^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest post-to-connection-request]
    (-> this (.postToConnectionAsync post-to-connection-request))))

