(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideo
  "Interface for accessing Kinesis Video.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonKinesisVideo instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideo]))

(defn get-data-endpoint
  "Gets an endpoint for a specified stream for either reading or writing. Use this endpoint in your application to
   read from the specified stream (using the GetMedia or GetMediaForFragmentList
   operations) or write to it (using the PutMedia operation).



   The returned endpoint does not have the API name appended. The client needs to add the API name to the returned
   endpoint.



   In the request, specify the stream either by StreamName or StreamARN.

  get-data-endpoint-request - `com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest`

  returns: Result of the GetDataEndpoint operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.GetDataEndpointResult`

  throws: com.amazonaws.services.kinesisvideo.model.InvalidArgumentException - The value for this input parameter is invalid."
  (^com.amazonaws.services.kinesisvideo.model.GetDataEndpointResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.GetDataEndpointRequest get-data-endpoint-request]
    (-> this (.getDataEndpoint get-data-endpoint-request))))

(defn tag-stream
  "Adds one or more tags to a stream. A tag is a key-value pair (the value is optional) that you can define
   and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value
   that you specify in the request. For more information, see Using Cost Allocation
   Tags in the AWS Billing and Cost Management User Guide.


   You must provide either the StreamName or the StreamARN.


   This operation requires permission for the KinesisVideo:TagStream action.


   Kinesis video streams support up to 50 tags.

  tag-stream-request - `com.amazonaws.services.kinesisvideo.model.TagStreamRequest`

  returns: Result of the TagStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.TagStreamResult`

  throws: com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException - Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later."
  (^com.amazonaws.services.kinesisvideo.model.TagStreamResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.TagStreamRequest tag-stream-request]
    (-> this (.tagStream tag-stream-request))))

(defn list-tags-for-stream
  "Returns a list of tags associated with the specified stream.


   In the request, you must specify either the StreamName or the StreamARN.

  list-tags-for-stream-request - `com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest`

  returns: Result of the ListTagsForStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.ListTagsForStreamResult`

  throws: com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException - Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later."
  (^com.amazonaws.services.kinesisvideo.model.ListTagsForStreamResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.ListTagsForStreamRequest list-tags-for-stream-request]
    (-> this (.listTagsForStream list-tags-for-stream-request))))

(defn describe-stream
  "Returns the most current information about the specified stream. You must specify either the
   StreamName or the StreamARN.

  describe-stream-request - `com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest`

  returns: Result of the DescribeStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.DescribeStreamResult`

  throws: com.amazonaws.services.kinesisvideo.model.InvalidArgumentException - The value for this input parameter is invalid."
  (^com.amazonaws.services.kinesisvideo.model.DescribeStreamResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.DescribeStreamRequest describe-stream-request]
    (-> this (.describeStream describe-stream-request))))

(defn delete-stream
  "Deletes a Kinesis video stream and the data contained in the stream.


   This method marks the stream for deletion, and makes the data in the stream inaccessible immediately.




   To ensure that you have the latest version of the stream before deleting it, you can specify the stream version.
   Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a
   new version number. To get the latest stream version, use the DescribeStream API.


   This operation requires permission for the KinesisVideo:DeleteStream action.

  delete-stream-request - `com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest`

  returns: Result of the DeleteStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.DeleteStreamResult`

  throws: com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException - Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later."
  (^com.amazonaws.services.kinesisvideo.model.DeleteStreamResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.DeleteStreamRequest delete-stream-request]
    (-> this (.deleteStream delete-stream-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonKinesisVideo this]
    (-> this (.shutdown))))

(defn list-streams
  "Returns an array of StreamInfo objects. Each object describes a stream. To retrieve only streams
   that satisfy a specific condition, you can specify a StreamNameCondition.

  list-streams-request - `com.amazonaws.services.kinesisvideo.model.ListStreamsRequest`

  returns: Result of the ListStreams operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.ListStreamsResult`

  throws: com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException - Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later."
  (^com.amazonaws.services.kinesisvideo.model.ListStreamsResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.ListStreamsRequest list-streams-request]
    (-> this (.listStreams list-streams-request))))

(defn update-stream
  "Updates stream metadata, such as the device name and media type.


   You must provide the stream name or the Amazon Resource Name (ARN) of the stream.


   To make sure that you have the latest version of the stream before updating it, you can specify the stream
   version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams
   assigns a new version number. To get the latest stream version, use the DescribeStream API.


   UpdateStream is an asynchronous operation, and takes time to complete.

  update-stream-request - `com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest`

  returns: Result of the UpdateStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.UpdateStreamResult`

  throws: com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException - Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later."
  (^com.amazonaws.services.kinesisvideo.model.UpdateStreamResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.UpdateStreamRequest update-stream-request]
    (-> this (.updateStream update-stream-request))))

(defn update-data-retention
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

  returns: Result of the UpdateDataRetention operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionResult`

  throws: com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException - Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later."
  (^com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.UpdateDataRetentionRequest update-data-retention-request]
    (-> this (.updateDataRetention update-data-retention-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonKinesisVideo this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn untag-stream
  "Removes one or more tags from a stream. In the request, specify only a tag key or keys; don't specify the value.
   If you specify a tag key that does not exist, it's ignored.


   In the request, you must provide the StreamName or StreamARN.

  untag-stream-request - `com.amazonaws.services.kinesisvideo.model.UntagStreamRequest`

  returns: Result of the UntagStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.UntagStreamResult`

  throws: com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException - Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later."
  (^com.amazonaws.services.kinesisvideo.model.UntagStreamResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.UntagStreamRequest untag-stream-request]
    (-> this (.untagStream untag-stream-request))))

(defn create-stream
  "Creates a new Kinesis video stream.


   When you create a new stream, Kinesis Video Streams assigns it a version number. When you change the stream's
   metadata, Kinesis Video Streams updates the version.


   CreateStream is an asynchronous operation.


   For information about how the service works, see How it Works.


   You must have permissions for the KinesisVideo:CreateStream action.

  create-stream-request - `com.amazonaws.services.kinesisvideo.model.CreateStreamRequest`

  returns: Result of the CreateStream operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.CreateStreamResult`

  throws: com.amazonaws.services.kinesisvideo.model.AccountStreamLimitExceededException - The number of streams created for the account is too high."
  (^com.amazonaws.services.kinesisvideo.model.CreateStreamResult [^AmazonKinesisVideo this ^com.amazonaws.services.kinesisvideo.model.CreateStreamRequest create-stream-request]
    (-> this (.createStream create-stream-request))))

