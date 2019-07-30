(ns com.amazonaws.services.sagemakerruntime.AbstractAmazonSageMakerRuntime
  "Abstract implementation of AmazonSageMakerRuntime. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemakerruntime AbstractAmazonSageMakerRuntime]))

(defn invoke-endpoint
  "Description copied from interface: AmazonSageMakerRuntime

  request - `com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest`

  returns: Result of the InvokeEndpoint operation returned by the service. - `com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult`"
  (^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult [^AbstractAmazonSageMakerRuntime this ^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest request]
    (-> this (.invokeEndpoint request))))

(defn shutdown
  "Description copied from interface: AmazonSageMakerRuntime"
  ([^AbstractAmazonSageMakerRuntime this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonSageMakerRuntime

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonSageMakerRuntime this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

