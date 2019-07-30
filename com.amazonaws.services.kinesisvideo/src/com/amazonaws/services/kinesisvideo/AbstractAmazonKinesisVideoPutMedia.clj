(ns com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoPutMedia
  "Abstract implementation of {@link AmazonKinesisVideoPutMedia}. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AbstractAmazonKinesisVideoPutMedia]))

(defn ->abstract-amazon-kinesis-video-put-media
  "Constructor."
  (^AbstractAmazonKinesisVideoPutMedia []
    (new AbstractAmazonKinesisVideoPutMedia )))

(defn put-media
  "Description copied from interface: AmazonKinesisVideoPutMedia

  request - Represents the input of a PutMedia operation - `com.amazonaws.services.kinesisvideo.model.PutMediaRequest`
  response-handler - Handler to asynchronously process the AckEvent that are received by the service. - `com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler`"
  ([^AbstractAmazonKinesisVideoPutMedia this ^com.amazonaws.services.kinesisvideo.model.PutMediaRequest request ^com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler response-handler]
    (-> this (.putMedia request response-handler))))

(defn close
  "Description copied from interface: AmazonKinesisVideoPutMedia"
  ([^AbstractAmazonKinesisVideoPutMedia this]
    (-> this (.close))))

