(ns com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoMedia
  "Abstract implementation of AmazonKinesisVideoMedia. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AbstractAmazonKinesisVideoMedia]))

(defn get-media
  "Description copied from interface: AmazonKinesisVideoMedia

  request - `com.amazonaws.services.kinesisvideo.model.GetMediaRequest`

  returns: Result of the GetMedia operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.GetMediaResult`"
  (^com.amazonaws.services.kinesisvideo.model.GetMediaResult [^AbstractAmazonKinesisVideoMedia this ^com.amazonaws.services.kinesisvideo.model.GetMediaRequest request]
    (-> this (.getMedia request))))

(defn shutdown
  "Description copied from interface: AmazonKinesisVideoMedia"
  ([^AbstractAmazonKinesisVideoMedia this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonKinesisVideoMedia

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonKinesisVideoMedia this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

