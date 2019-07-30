(ns com.amazonaws.services.sagemakerruntime.AmazonSageMakerRuntimeAsync
  "Interface for accessing Amazon SageMaker Runtime asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSageMakerRuntimeAsync instead.



  The Amazon SageMaker runtime API."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemakerruntime AmazonSageMakerRuntimeAsync]))

(defn invoke-endpoint-async
  "After you deploy a model into production using Amazon SageMaker hosting services, your client applications use
   this API to get inferences from the model hosted at the specified endpoint.


   For an overview of Amazon SageMaker, see How It Works.


   Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional
   headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.


   Cals to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests
   (AWS Signature Version 4) in the Amazon S3 API Reference.



   Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but
   Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller.

  invoke-endpoint-request - `com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvokeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerRuntimeAsync this ^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest invoke-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invokeEndpointAsync invoke-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerRuntimeAsync this ^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest invoke-endpoint-request]
    (-> this (.invokeEndpointAsync invoke-endpoint-request))))

