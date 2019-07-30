(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideoAsync
  "Interface for accessing Kinesis Video asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonKinesisVideoAsync instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideoAsync]))

(defn tag-stream-async
  "Adds one or more tags to a stream. A tag is a key-value pair (the value is optional) that you can define
   and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value
   that you specify in the request. For more information, see Using Cost Allocation
   Tags in the AWS Billing and Cost Management User Guide.


   You must provide either the StreamName or the StreamARN.


   This operation requires permission for the KinesisVideo:TagStream action.


   Kinesis video streams support up to 50 tags.

  tag-stream-request - `com.amazonaws.services.kinesisvideo.model.TagStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.TagStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.TagStreamRequest tag-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagStreamAsync tag-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.TagStreamRequest tag-stream-request]
    (-> this (.tagStreamAsync tag-stream-request))))

(defn create-stream-async
  "Creates a new Kinesis video stream.


   When you create a new stream, Kinesis Video Streams assigns it a version number. When you change the stream's
   metadata, Kinesis Video Streams updates the version.


   CreateStream is an asynchronous operation.


   For information about how the service works, see How it Works.


   You must have permissions for the KinesisVideo:CreateStream action.

  create-stream-request - `com.amazonaws.services.kinesisvideo.model.CreateStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.CreateStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.CreateStreamRequest create-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamAsync create-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.CreateStreamRequest create-stream-request]
    (-> this (.createStreamAsync create-stream-request))))

(defn update-stream-async
  "Updates stream metadata, such as the device name and media type.


   You must provide the stream name or the Amazon Resource Name (ARN) of the stream.


   To make sure that you have the latest version of the stream before updating it, you can specify the stream
   version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams
   assigns a new version number. To get the latest stream version, use the DescribeStream API.


   UpdateStream is an asynchronous operation, and takes time to complete.

  update-stream-request - `com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.UpdateStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest update-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStreamAsync update-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest update-stream-request]
    (-> this (.updateStreamAsync update-stream-request))))

(defn list-streams-async
  "Returns an array of StreamInfo objects. Each object describes a stream. To retrieve only streams
   that satisfy a specific condition, you can specify a StreamNameCondition.

  list-streams-request - `com.amazonaws.services.kinesisvideo.model.ListStreamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.ListStreamsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.ListStreamsRequest list-streams-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamsAsync list-streams-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.ListStreamsRequest list-streams-request]
    (-> this (.listStreamsAsync list-streams-request))))

(defn describe-stream-async
  "Returns the most current information about the specified stream. You must specify either the
   StreamName or the StreamARN.

  describe-stream-request - `com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.DescribeStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest describe-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync describe-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest describe-stream-request]
    (-> this (.describeStreamAsync describe-stream-request))))

(defn list-tags-for-stream-async
  "Returns a list of tags associated with the specified stream.


   In the request, you must specify either the StreamName or the StreamARN.

  list-tags-for-stream-request - `com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.ListTagsForStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest list-tags-for-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForStreamAsync list-tags-for-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest list-tags-for-stream-request]
    (-> this (.listTagsForStreamAsync list-tags-for-stream-request))))

(defn update-data-retention-async
  "Increases or decreases the stream's data retention period by the value that you specify. To indicate whether you
   want to increase or decrease the data retention period, specify the Operation parameter in the
   request body. In the request, you must specify either the StreamName or the StreamARN.



   The retention period that you specify replaces the current value.



   This operation requires permission for the KinesisVideo:UpdateDataRetention action.


   Changing the data retention period affects the data in the stream as follows:




   If the data retention period is increased, existing data is retained for the new retention period. For example,
   if the data retention period is increased from one hour to seven hours, all existing data is retained for seven
   hours.




   If the data retention period is decreased, existing data is retained for the new retention period. For example,
   if the data retention period is decreased from seven hours to one hour, all existing data is retained for one
   hour, and any data older than one hour is deleted immediately.

  update-data-retention-request - `com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDataRetention operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionRequest update-data-retention-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDataRetentionAsync update-data-retention-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionRequest update-data-retention-request]
    (-> this (.updateDataRetentionAsync update-data-retention-request))))

(defn get-data-endpoint-async
  "Gets an endpoint for a specified stream for either reading or writing. Use this endpoint in your application to
   read from the specified stream (using the GetMedia or GetMediaForFragmentList
   operations) or write to it (using the PutMedia operation).



   The returned endpoint does not have the API name appended. The client needs to add the API name to the returned
   endpoint.



   In the request, specify the stream either by StreamName or StreamARN.

  get-data-endpoint-request - `com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetDataEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest get-data-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataEndpointAsync get-data-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest get-data-endpoint-request]
    (-> this (.getDataEndpointAsync get-data-endpoint-request))))

(defn delete-stream-async
  "Deletes a Kinesis video stream and the data contained in the stream.


   This method marks the stream for deletion, and makes the data in the stream inaccessible immediately.




   To ensure that you have the latest version of the stream before deleting it, you can specify the stream version.
   Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a
   new version number. To get the latest stream version, use the DescribeStream API.


   This operation requires permission for the KinesisVideo:DeleteStream action.

  delete-stream-request - `com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.DeleteStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest delete-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStreamAsync delete-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest delete-stream-request]
    (-> this (.deleteStreamAsync delete-stream-request))))

(defn untag-stream-async
  "Removes one or more tags from a stream. In the request, specify only a tag key or keys; don't specify the value.
   If you specify a tag key that does not exist, it's ignored.


   In the request, you must provide the StreamName or StreamARN.

  untag-stream-request - `com.amazonaws.services.kinesisvideo.model.UntagStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.UntagStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UntagStreamRequest untag-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagStreamAsync untag-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoAsync this ^com.amazonaws.services.kinesisvideo.model.UntagStreamRequest untag-stream-request]
    (-> this (.untagStreamAsync untag-stream-request))))

