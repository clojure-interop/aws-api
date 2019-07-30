(ns com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoArchivedMedia
  "Abstract implementation of AmazonKinesisVideoArchivedMedia. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AbstractAmazonKinesisVideoArchivedMedia]))

(defn get-dash-streaming-session-url
  "Description copied from interface: AmazonKinesisVideoArchivedMedia

  request - `com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest`

  returns: Result of the GetDASHStreamingSessionURL operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLResult`"
  (^com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLResult [^AbstractAmazonKinesisVideoArchivedMedia this ^com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest request]
    (-> this (.getDASHStreamingSessionURL request))))

(defn get-hls-streaming-session-url
  "Description copied from interface: AmazonKinesisVideoArchivedMedia

  request - `com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest`

  returns: Result of the GetHLSStreamingSessionURL operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLResult`"
  (^com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLResult [^AbstractAmazonKinesisVideoArchivedMedia this ^com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest request]
    (-> this (.getHLSStreamingSessionURL request))))

(defn get-media-for-fragment-list
  "Description copied from interface: AmazonKinesisVideoArchivedMedia

  request - `com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest`

  returns: Result of the GetMediaForFragmentList operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListResult`"
  (^com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListResult [^AbstractAmazonKinesisVideoArchivedMedia this ^com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest request]
    (-> this (.getMediaForFragmentList request))))

(defn list-fragments
  "Description copied from interface: AmazonKinesisVideoArchivedMedia

  request - `com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest`

  returns: Result of the ListFragments operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.ListFragmentsResult`"
  (^com.amazonaws.services.kinesisvideo.model.ListFragmentsResult [^AbstractAmazonKinesisVideoArchivedMedia this ^com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest request]
    (-> this (.listFragments request))))

(defn shutdown
  "Description copied from interface: AmazonKinesisVideoArchivedMedia"
  ([^AbstractAmazonKinesisVideoArchivedMedia this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonKinesisVideoArchivedMedia

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonKinesisVideoArchivedMedia this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

