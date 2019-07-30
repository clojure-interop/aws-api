(ns com.amazonaws.services.apigatewaymanagementapi.AmazonApiGatewayManagementApi
  "Interface for accessing AmazonApiGatewayManagementApi.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonApiGatewayManagementApi instead.



  The Amazon API Gateway Management API allows you to directly manage runtime aspects of your deployed APIs. To use it,
  you must explicitly set the SDK's endpoint to point to the endpoint of your deployed API. The endpoint will be of the
  form https://{api-id}.execute-api.{region}.amazonaws.com/{stage}, or will be the endpoint corresponding to your API's
  custom domain and base path, if applicable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.apigatewaymanagementapi AmazonApiGatewayManagementApi]))

(defn post-to-connection
  "Sends the provided data to the specified connection.

  post-to-connection-request - `com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest`

  returns: Result of the PostToConnection operation returned by the service. - `com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionResult`

  throws: com.amazonaws.services.apigatewaymanagementapi.model.GoneException - The connection with the provided id no longer exists."
  (^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionResult [^AmazonApiGatewayManagementApi this ^com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest post-to-connection-request]
    (-> this (.postToConnection post-to-connection-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonApiGatewayManagementApi this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonApiGatewayManagementApi this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

