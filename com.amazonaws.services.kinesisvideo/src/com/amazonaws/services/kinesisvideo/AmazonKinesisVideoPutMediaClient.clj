(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClient
  "Client implementation class for AmazonKinesisVideoPutMedia. To create, obtain an instance of the builder
  via builder() or AmazonKinesisVideoPutMediaClientBuilder.standard() and
  call AmazonKinesisVideoPutMediaClientBuilder.build() after configuring desired options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideoPutMediaClient]))

(defn *builder
  "Create a new builder instance that can configure and create an AmazonKinesisVideoPutMedia client.

  returns: Builder instance. - `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder []
    (AmazonKinesisVideoPutMediaClient/builder )))

(defn put-media
  "Description copied from interface: AmazonKinesisVideoPutMedia

  request - Represents the input of a PutMedia operation - `com.amazonaws.services.kinesisvideo.model.PutMediaRequest`
  response-handler - Handler to asynchronously process the AckEvent that are received by the service. - `com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler`"
  ([^AmazonKinesisVideoPutMediaClient this ^com.amazonaws.services.kinesisvideo.model.PutMediaRequest request ^com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler response-handler]
    (-> this (.putMedia request response-handler))))

(defn close
  "Description copied from interface: AmazonKinesisVideoPutMedia"
  ([^AmazonKinesisVideoPutMediaClient this]
    (-> this (.close))))

