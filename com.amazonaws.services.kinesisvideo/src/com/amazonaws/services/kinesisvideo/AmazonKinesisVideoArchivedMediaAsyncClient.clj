(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaAsyncClient
  "Client for accessing Kinesis Video Archived Media asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideoArchivedMediaAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaAsyncClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaAsyncClientBuilder []
    (AmazonKinesisVideoArchivedMediaAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonKinesisVideoArchivedMediaAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-dash-streaming-session-url-async
  "Description copied from interface: AmazonKinesisVideoArchivedMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDASHStreamingSessionURL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDASHStreamingSessionURLAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest request]
    (-> this (.getDASHStreamingSessionURLAsync request))))

(defn get-hls-streaming-session-url-async
  "Description copied from interface: AmazonKinesisVideoArchivedMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHLSStreamingSessionURL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHLSStreamingSessionURLAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest request]
    (-> this (.getHLSStreamingSessionURLAsync request))))

(defn get-media-for-fragment-list-async
  "Description copied from interface: AmazonKinesisVideoArchivedMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMediaForFragmentList operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMediaForFragmentListAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest request]
    (-> this (.getMediaForFragmentListAsync request))))

(defn list-fragments-async
  "Description copied from interface: AmazonKinesisVideoArchivedMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFragments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.ListFragmentsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFragmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsyncClient this ^com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest request]
    (-> this (.listFragmentsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonKinesisVideoArchivedMediaAsyncClient this]
    (-> this (.shutdown))))

