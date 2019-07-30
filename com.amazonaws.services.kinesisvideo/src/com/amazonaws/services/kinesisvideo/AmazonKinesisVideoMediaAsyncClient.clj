(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaAsyncClient
  "Client for accessing Kinesis Video Media asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideoMediaAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaAsyncClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaAsyncClientBuilder []
    (AmazonKinesisVideoMediaAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonKinesisVideoMediaAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-media-async
  "Description copied from interface: AmazonKinesisVideoMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.GetMediaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMedia operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetMediaResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.GetMediaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMediaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.GetMediaRequest request]
    (-> this (.getMediaAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonKinesisVideoMediaAsyncClient this]
    (-> this (.shutdown))))

