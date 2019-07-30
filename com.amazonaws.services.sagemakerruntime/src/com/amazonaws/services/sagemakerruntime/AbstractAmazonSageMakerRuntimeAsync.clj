(ns com.amazonaws.services.sagemakerruntime.AbstractAmazonSageMakerRuntimeAsync
  "Abstract implementation of AmazonSageMakerRuntimeAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemakerruntime AbstractAmazonSageMakerRuntimeAsync]))

(defn invoke-endpoint-async
  "Description copied from interface: AmazonSageMakerRuntimeAsync

  request - `com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvokeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSageMakerRuntimeAsync this ^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invokeEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSageMakerRuntimeAsync this ^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest request]
    (-> this (.invokeEndpointAsync request))))

