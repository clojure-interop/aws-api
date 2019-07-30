(ns com.amazonaws.services.kinesisfirehose.AbstractAmazonKinesisFirehoseAsync
  "Abstract implementation of AmazonKinesisFirehoseAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisfirehose AbstractAmazonKinesisFirehoseAsync]))

(defn stop-delivery-stream-encryption-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.StopDeliveryStreamEncryptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDeliveryStreamEncryption operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.StopDeliveryStreamEncryptionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.StopDeliveryStreamEncryptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDeliveryStreamEncryptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.StopDeliveryStreamEncryptionRequest request]
    (-> this (.stopDeliveryStreamEncryptionAsync request))))

(defn delete-delivery-stream-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeliveryStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeliveryStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.DeleteDeliveryStreamRequest request]
    (-> this (.deleteDeliveryStreamAsync request))))

(defn put-record-batch-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRecordBatch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRecordBatchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest request]
    (-> this (.putRecordBatchAsync request))))

(defn put-record-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.PutRecordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRecord operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.PutRecordResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.PutRecordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRecordAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.PutRecordRequest request]
    (-> this (.putRecordAsync request))))

(defn list-tags-for-delivery-stream-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.ListTagsForDeliveryStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForDeliveryStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.ListTagsForDeliveryStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.ListTagsForDeliveryStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForDeliveryStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.ListTagsForDeliveryStreamRequest request]
    (-> this (.listTagsForDeliveryStreamAsync request))))

(defn tag-delivery-stream-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.TagDeliveryStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagDeliveryStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.TagDeliveryStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.TagDeliveryStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagDeliveryStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.TagDeliveryStreamRequest request]
    (-> this (.tagDeliveryStreamAsync request))))

(defn list-delivery-streams-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeliveryStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeliveryStreamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsRequest request]
    (-> this (.listDeliveryStreamsAsync request))))

(defn create-delivery-stream-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeliveryStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeliveryStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest request]
    (-> this (.createDeliveryStreamAsync request))))

(defn update-destination-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.UpdateDestinationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDestination operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.UpdateDestinationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.UpdateDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.UpdateDestinationRequest request]
    (-> this (.updateDestinationAsync request))))

(defn describe-delivery-stream-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDeliveryStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeliveryStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamRequest request]
    (-> this (.describeDeliveryStreamAsync request))))

(defn untag-delivery-stream-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.UntagDeliveryStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagDeliveryStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.UntagDeliveryStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.UntagDeliveryStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagDeliveryStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.UntagDeliveryStreamRequest request]
    (-> this (.untagDeliveryStreamAsync request))))

(defn start-delivery-stream-encryption-async
  "Description copied from interface: AmazonKinesisFirehoseAsync

  request - `com.amazonaws.services.kinesisfirehose.model.StartDeliveryStreamEncryptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDeliveryStreamEncryption operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisfirehose.model.StartDeliveryStreamEncryptionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.StartDeliveryStreamEncryptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDeliveryStreamEncryptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonKinesisFirehoseAsync this ^com.amazonaws.services.kinesisfirehose.model.StartDeliveryStreamEncryptionRequest request]
    (-> this (.startDeliveryStreamEncryptionAsync request))))

