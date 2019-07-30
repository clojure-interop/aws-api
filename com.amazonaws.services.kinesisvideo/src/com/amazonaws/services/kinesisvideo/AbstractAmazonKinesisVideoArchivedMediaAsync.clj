(ns com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoArchivedMediaAsync
  "Abstract implementation of AmazonKinesisVideoArchivedMediaAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AbstractAmazonKinesisVideoArchivedMediaAsync]))

(defn get-dash-streaming-session-url-async
  "Description copied from interface: AmazonKinesisVideoArchivedMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDASHStreamingSessionURL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDASHStreamingSessionURLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest request]
    (-> this (.getDASHStreamingSessionURLAsync request))))

(defn get-hls-streaming-session-url-async
  "Description copied from interface: AmazonKinesisVideoArchivedMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHLSStreamingSessionURL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHLSStreamingSessionURLAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest request]
    (-> this (.getHLSStreamingSessionURLAsync request))))

(defn get-media-for-fragment-list-async
  "Description copied from interface: AmazonKinesisVideoArchivedMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMediaForFragmentList operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMediaForFragmentListAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest request]
    (-> this (.getMediaForFragmentListAsync request))))

(defn list-fragments-async
  "Description copied from interface: AmazonKinesisVideoArchivedMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFragments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.ListFragmentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFragmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest request]
    (-> this (.listFragmentsAsync request))))

