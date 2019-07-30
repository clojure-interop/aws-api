(ns com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoAsync
  "Abstract implementation of AmazonKinesisVideoAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AbstractAmazonKinesisVideoAsync]))

(defn tag-stream-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.TagStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.TagStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.TagStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.TagStreamRequest request]
    (-> this (.tagStreamAsync request))))

(defn create-stream-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.CreateStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.CreateStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.CreateStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.CreateStreamRequest request]
    (-> this (.createStreamAsync request))))

(defn update-stream-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.UpdateStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest request]
    (-> this (.updateStreamAsync request))))

(defn list-streams-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.ListStreamsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.ListStreamsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.ListStreamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.ListStreamsRequest request]
    (-> this (.listStreamsAsync request))))

(defn describe-stream-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.DescribeStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest request]
    (-> this (.describeStreamAsync request))))

(defn list-tags-for-stream-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.ListTagsForStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest request]
    (-> this (.listTagsForStreamAsync request))))

(defn update-data-retention-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDataRetention operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDataRetentionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionRequest request]
    (-> this (.updateDataRetentionAsync request))))

(defn get-data-endpoint-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetDataEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest request]
    (-> this (.getDataEndpointAsync request))))

(defn delete-stream-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.DeleteStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest request]
    (-> this (.deleteStreamAsync request))))

(defn untag-stream-async
  "Description copied from interface: AmazonKinesisVideoAsync

  request - `com.amazonaws.services.kinesisvideo.model.UntagStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.UntagStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UntagStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UntagStreamRequest request]
    (-> this (.untagStreamAsync request))))

