(ns com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideo
  "Abstract implementation of AmazonKinesisVideo. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AbstractAmazonKinesisVideo]))

(defn get-data-endpoint
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest`

  returns: Result of the GetDataEndpoint operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.GetDataEndpointResult`"
  (^com.amazonaws.services.kinesisvideo.model.GetDataEndpointResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest request]
    (-> this (.getDataEndpoint request))))

(defn tag-stream
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.TagStreamRequest`

  returns: Result of the TagStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.TagStreamResult`"
  (^com.amazonaws.services.kinesisvideo.model.TagStreamResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.TagStreamRequest request]
    (-> this (.tagStream request))))

(defn list-tags-for-stream
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest`

  returns: Result of the ListTagsForStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.ListTagsForStreamResult`"
  (^com.amazonaws.services.kinesisvideo.model.ListTagsForStreamResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest request]
    (-> this (.listTagsForStream request))))

(defn describe-stream
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest`

  returns: Result of the DescribeStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.DescribeStreamResult`"
  (^com.amazonaws.services.kinesisvideo.model.DescribeStreamResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest request]
    (-> this (.describeStream request))))

(defn delete-stream
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest`

  returns: Result of the DeleteStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.DeleteStreamResult`"
  (^com.amazonaws.services.kinesisvideo.model.DeleteStreamResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest request]
    (-> this (.deleteStream request))))

(defn shutdown
  "Description copied from interface: AmazonKinesisVideo"
  ([^AbstractAmazonKinesisVideo this]
    (-> this (.shutdown))))

(defn list-streams
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.ListStreamsRequest`

  returns: Result of the ListStreams operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.ListStreamsResult`"
  (^com.amazonaws.services.kinesisvideo.model.ListStreamsResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.ListStreamsRequest request]
    (-> this (.listStreams request))))

(defn update-stream
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest`

  returns: Result of the UpdateStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.UpdateStreamResult`"
  (^com.amazonaws.services.kinesisvideo.model.UpdateStreamResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest request]
    (-> this (.updateStream request))))

(defn update-data-retention
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionRequest`

  returns: Result of the UpdateDataRetention operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionResult`"
  (^com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionRequest request]
    (-> this (.updateDataRetention request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonKinesisVideo

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonKinesisVideo this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn untag-stream
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.UntagStreamRequest`

  returns: Result of the UntagStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.UntagStreamResult`"
  (^com.amazonaws.services.kinesisvideo.model.UntagStreamResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.UntagStreamRequest request]
    (-> this (.untagStream request))))

(defn create-stream
  "Description copied from interface: AmazonKinesisVideo

  request - `com.amazonaws.services.kinesisvideo.model.CreateStreamRequest`

  returns: Result of the CreateStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.CreateStreamResult`"
  (^com.amazonaws.services.kinesisvideo.model.CreateStreamResult [^AbstractAmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.CreateStreamRequest request]
    (-> this (.createStream request))))

