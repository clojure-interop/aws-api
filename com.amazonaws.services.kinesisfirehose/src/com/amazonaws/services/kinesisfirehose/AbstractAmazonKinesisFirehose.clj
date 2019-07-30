(ns com.amazonaws.services.kinesisfirehose.AbstractAmazonKinesisFirehose
  "Abstract implementation of AmazonKinesisFirehose. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisfirehose AbstractAmazonKinesisFirehose]))

(defn set-region
  "Description copied from interface: AmazonKinesisFirehose

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonKinesisFirehose this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn stop-delivery-stream-encryption
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.StopDeliveryStreamEncryptionRequest`

  returns: Result of the StopDeliveryStreamEncryption operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.StopDeliveryStreamEncryptionResult`"
  (^com.amazonaws.services.kinesisfirehose.model.StopDeliveryStreamEncryptionResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.StopDeliveryStreamEncryptionRequest request]
    (-> this (.stopDeliveryStreamEncryption request))))

(defn describe-delivery-stream
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamRequest`

  returns: Result of the DescribeDeliveryStream operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamResult`"
  (^com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamRequest request]
    (-> this (.describeDeliveryStream request))))

(defn put-record-batch
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest`

  returns: Result of the PutRecordBatch operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult`"
  (^com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest request]
    (-> this (.putRecordBatch request))))

(defn tag-delivery-stream
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.TagDeliveryStreamRequest`

  returns: Result of the TagDeliveryStream operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.TagDeliveryStreamResult`"
  (^com.amazonaws.services.kinesisfirehose.model.TagDeliveryStreamResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.TagDeliveryStreamRequest request]
    (-> this (.tagDeliveryStream request))))

(defn shutdown
  "Description copied from interface: AmazonKinesisFirehose"
  ([^AbstractAmazonKinesisFirehose this]
    (-> this (.shutdown))))

(defn list-tags-for-delivery-stream
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.ListTagsForDeliveryStreamRequest`

  returns: Result of the ListTagsForDeliveryStream operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.ListTagsForDeliveryStreamResult`"
  (^com.amazonaws.services.kinesisfirehose.model.ListTagsForDeliveryStreamResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.ListTagsForDeliveryStreamRequest request]
    (-> this (.listTagsForDeliveryStream request))))

(defn untag-delivery-stream
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.UntagDeliveryStreamRequest`

  returns: Result of the UntagDeliveryStream operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.UntagDeliveryStreamResult`"
  (^com.amazonaws.services.kinesisfirehose.model.UntagDeliveryStreamResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.UntagDeliveryStreamRequest request]
    (-> this (.untagDeliveryStream request))))

(defn list-delivery-streams
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsRequest`

  returns: Result of the ListDeliveryStreams operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsResult`"
  (^com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsRequest request]
    (-> this (.listDeliveryStreams request))))

(defn set-endpoint
  "Description copied from interface: AmazonKinesisFirehose

  endpoint - The endpoint (ex: \"firehose.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://firehose.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonKinesisFirehose this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-delivery-stream
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamRequest`

  returns: Result of the DeleteDeliveryStream operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamResult`"
  (^com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamRequest request]
    (-> this (.deleteDeliveryStream request))))

(defn update-destination
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.UpdateDestinationRequest`

  returns: Result of the UpdateDestination operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.UpdateDestinationResult`"
  (^com.amazonaws.services.kinesisfirehose.model.UpdateDestinationResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.UpdateDestinationRequest request]
    (-> this (.updateDestination request))))

(defn put-record
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.PutRecordRequest`

  returns: Result of the PutRecord operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.PutRecordResult`"
  (^com.amazonaws.services.kinesisfirehose.model.PutRecordResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.PutRecordRequest request]
    (-> this (.putRecord request))))

(defn create-delivery-stream
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest`

  returns: Result of the CreateDeliveryStream operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamResult`"
  (^com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest request]
    (-> this (.createDeliveryStream request))))

(defn start-delivery-stream-encryption
  "Description copied from interface: AmazonKinesisFirehose

  request - `com.amazonaws.services.kinesisfirehose.model.StartDeliveryStreamEncryptionRequest`

  returns: Result of the StartDeliveryStreamEncryption operation returned by the service. - `com.amazonaws.services.kinesisfirehose.model.StartDeliveryStreamEncryptionResult`"
  (^com.amazonaws.services.kinesisfirehose.model.StartDeliveryStreamEncryptionResult [^AbstractAmazonKinesisFirehose this ^com.amazonaws.services.kinesisfirehose.model.StartDeliveryStreamEncryptionRequest request]
    (-> this (.startDeliveryStreamEncryption request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonKinesisFirehose

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonKinesisFirehose this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

