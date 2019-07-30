(ns com.amazonaws.services.sagemakerruntime.AmazonSageMakerRuntimeClient
  "Client for accessing Amazon SageMaker Runtime. All service calls made using this client are blocking, and will not
  return until the service call completes.


  The Amazon SageMaker runtime API."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemakerruntime AmazonSageMakerRuntimeClient]))

(defn *builder
  "returns: `com.amazonaws.services.sagemakerruntime.AmazonSageMakerRuntimeClientBuilder`"
  (^com.amazonaws.services.sagemakerruntime.AmazonSageMakerRuntimeClientBuilder []
    (AmazonSageMakerRuntimeClient/builder )))

(defn invoke-endpoint
  "After you deploy a model into production using Amazon SageMaker hosting services, your client applications use
   this API to get inferences from the model hosted at the specified endpoint.


   For an overview of Amazon SageMaker, see How It Works.


   Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional
   headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.


   Cals to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests
   (AWS Signature Version 4) in the Amazon S3 API Reference.



   Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but
   Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller.

  request - `com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest`

  returns: Result of the InvokeEndpoint operation returned by the service. - `com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult`

  throws: com.amazonaws.services.sagemakerruntime.model.InternalFailureException - An internal failure occurred."
  (^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult [^AmazonSageMakerRuntimeClient this ^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest request]
    (-> this (.invokeEndpoint request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonSageMakerRuntimeClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

