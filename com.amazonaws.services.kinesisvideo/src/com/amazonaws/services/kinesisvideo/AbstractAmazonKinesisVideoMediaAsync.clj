(ns com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoMediaAsync
  "Abstract implementation of AmazonKinesisVideoMediaAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AbstractAmazonKinesisVideoMediaAsync]))

(defn get-media-async
  "Description copied from interface: AmazonKinesisVideoMediaAsync

  request - `com.amazonaws.services.kinesisvideo.model.GetMediaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMedia operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetMediaResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetMediaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMediaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetMediaRequest request]
    (-> this (.getMediaAsync request))))

