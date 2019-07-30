(ns com.amazonaws.services.apigatewaymanagementapi.AmazonApiGatewayManagementApiAsyncClient
  "Client for accessing AmazonApiGatewayManagementApi asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  The Amazon API Gateway Management API allows you to directly manage runtime aspects of your deployed APIs. To use it,
  you must explicitly set the SDK's endpoint to point to the endpoint of your deployed API. The endpoint will be of the
  form https://{api-id}.execute-api.{region}.amazonaws.com/{stage}, or will be the endpoint corresponding to your API's
  custom domain and base path, if applicable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewaymanagementapi AmazonApiGatewayManagementApiAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.apigatewaymanagementapi.AmazonApiGatewayManagementApiAsyncClientBuilder`"
  (^com.amazonaws.services.apigatewaymanagementapi.AmazonApiGatewayManagementApiAsyncClientBuilder []
    (AmazonApiGatewayManagementApiAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonApiGatewayManagementApiAsyncClient this]
    (-> this (.getExecutorService))))

(defn post-to-connection-async
  "Description copied from interface: AmazonApiGatewayManagementApiAsync

  request - `com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostToConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonApiGatewayManagementApiAsyncClient this ^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postToConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonApiGatewayManagementApiAsyncClient this ^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest request]
    (-> this (.postToConnectionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonApiGatewayManagementApiAsyncClient this]
    (-> this (.shutdown))))

