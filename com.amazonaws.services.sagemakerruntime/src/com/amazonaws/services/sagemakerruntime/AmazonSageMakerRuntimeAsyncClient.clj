(ns com.amazonaws.services.sagemakerruntime.AmazonSageMakerRuntimeAsyncClient
  "Client for accessing Amazon SageMaker Runtime asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  The Amazon SageMaker runtime API."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemakerruntime AmazonSageMakerRuntimeAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.sagemakerruntime.AmazonSageMakerRuntimeAsyncClientBuilder`"
  (^com.amazonaws.services.sagemakerruntime.AmazonSageMakerRuntimeAsyncClientBuilder []
    (AmazonSageMakerRuntimeAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonSageMakerRuntimeAsyncClient this]
    (-> this (.getExecutorService))))

(defn invoke-endpoint-async
  "Description copied from interface: AmazonSageMakerRuntimeAsync

  request - `com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InvokeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerRuntimeAsyncClient this ^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.invokeEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerRuntimeAsyncClient this ^com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest request]
    (-> this (.invokeEndpointAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonSageMakerRuntimeAsyncClient this]
    (-> this (.shutdown))))

