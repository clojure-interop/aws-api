(ns com.amazonaws.services.kinesis.AbstractAmazonKinesis
  "Abstract implementation of AmazonKinesis. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesis AbstractAmazonKinesis]))

(defn list-tags-for-stream
  "Description copied from interface: AmazonKinesis

  request - Represents the input for ListTagsForStream. - `com.amazonaws.services.kinesis.model.ListTagsForStreamRequest`

  returns: Result of the ListTagsForStream operation returned by the service. - `com.amazonaws.services.kinesis.model.ListTagsForStreamResult`"
  (^com.amazonaws.services.kinesis.model.ListTagsForStreamResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.ListTagsForStreamRequest request]
    (-> this (.listTagsForStream request))))

(defn describe-stream
  "Description copied from interface: AmazonKinesis

  stream-name - `java.lang.String`
  limit - `java.lang.Integer`
  exclusive-start-shard-id - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.DescribeStreamResult`"
  (^com.amazonaws.services.kinesis.model.DescribeStreamResult [^AbstractAmazonKinesis this ^java.lang.String stream-name ^java.lang.Integer limit ^java.lang.String exclusive-start-shard-id]
    (-> this (.describeStream stream-name limit exclusive-start-shard-id)))
  (^com.amazonaws.services.kinesis.model.DescribeStreamResult [^AbstractAmazonKinesis this ^java.lang.String stream-name ^java.lang.String exclusive-start-shard-id]
    (-> this (.describeStream stream-name exclusive-start-shard-id)))
  (^com.amazonaws.services.kinesis.model.DescribeStreamResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.DescribeStreamRequest request]
    (-> this (.describeStream request))))

(defn update-shard-count
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.UpdateShardCountRequest`

  returns: Result of the UpdateShardCount operation returned by the service. - `com.amazonaws.services.kinesis.model.UpdateShardCountResult`"
  (^com.amazonaws.services.kinesis.model.UpdateShardCountResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.UpdateShardCountRequest request]
    (-> this (.updateShardCount request))))

(defn delete-stream
  "Description copied from interface: AmazonKinesis

  request - Represents the input for DeleteStream. - `com.amazonaws.services.kinesis.model.DeleteStreamRequest`

  returns: Result of the DeleteStream operation returned by the service. - `com.amazonaws.services.kinesis.model.DeleteStreamResult`"
  (^com.amazonaws.services.kinesis.model.DeleteStreamResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.DeleteStreamRequest request]
    (-> this (.deleteStream request))))

(defn set-region
  "Description copied from interface: AmazonKinesis

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonKinesis this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn deregister-stream-consumer
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.DeregisterStreamConsumerRequest`

  returns: Result of the DeregisterStreamConsumer operation returned by the service. - `com.amazonaws.services.kinesis.model.DeregisterStreamConsumerResult`"
  (^com.amazonaws.services.kinesis.model.DeregisterStreamConsumerResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.DeregisterStreamConsumerRequest request]
    (-> this (.deregisterStreamConsumer request))))

(defn waiters
  "returns: `com.amazonaws.services.kinesis.waiters.AmazonKinesisWaiters`"
  (^com.amazonaws.services.kinesis.waiters.AmazonKinesisWaiters [^AbstractAmazonKinesis this]
    (-> this (.waiters))))

(defn increase-stream-retention-period
  "Description copied from interface: AmazonKinesis

  request - Represents the input for IncreaseStreamRetentionPeriod. - `com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest`

  returns: Result of the IncreaseStreamRetentionPeriod operation returned by the service. - `com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult`"
  (^com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest request]
    (-> this (.increaseStreamRetentionPeriod request))))

(defn describe-limits
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.DescribeLimitsRequest`

  returns: Result of the DescribeLimits operation returned by the service. - `com.amazonaws.services.kinesis.model.DescribeLimitsResult`"
  (^com.amazonaws.services.kinesis.model.DescribeLimitsResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.DescribeLimitsRequest request]
    (-> this (.describeLimits request))))

(defn enable-enhanced-monitoring
  "Description copied from interface: AmazonKinesis

  request - Represents the input for EnableEnhancedMonitoring. - `com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest`

  returns: Result of the EnableEnhancedMonitoring operation returned by the service. - `com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult`"
  (^com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest request]
    (-> this (.enableEnhancedMonitoring request))))

(defn add-tags-to-stream
  "Description copied from interface: AmazonKinesis

  request - Represents the input for AddTagsToStream. - `com.amazonaws.services.kinesis.model.AddTagsToStreamRequest`

  returns: Result of the AddTagsToStream operation returned by the service. - `com.amazonaws.services.kinesis.model.AddTagsToStreamResult`"
  (^com.amazonaws.services.kinesis.model.AddTagsToStreamResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.AddTagsToStreamRequest request]
    (-> this (.addTagsToStream request))))

(defn disable-enhanced-monitoring
  "Description copied from interface: AmazonKinesis

  request - Represents the input for DisableEnhancedMonitoring. - `com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest`

  returns: Result of the DisableEnhancedMonitoring operation returned by the service. - `com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult`"
  (^com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest request]
    (-> this (.disableEnhancedMonitoring request))))

(defn start-stream-encryption
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest`

  returns: Result of the StartStreamEncryption operation returned by the service. - `com.amazonaws.services.kinesis.model.StartStreamEncryptionResult`"
  (^com.amazonaws.services.kinesis.model.StartStreamEncryptionResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest request]
    (-> this (.startStreamEncryption request))))

(defn shutdown
  "Description copied from interface: AmazonKinesis"
  ([^AbstractAmazonKinesis this]
    (-> this (.shutdown))))

(defn list-stream-consumers
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.ListStreamConsumersRequest`

  returns: Result of the ListStreamConsumers operation returned by the service. - `com.amazonaws.services.kinesis.model.ListStreamConsumersResult`"
  (^com.amazonaws.services.kinesis.model.ListStreamConsumersResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.ListStreamConsumersRequest request]
    (-> this (.listStreamConsumers request))))

(defn list-streams
  "Description copied from interface: AmazonKinesis

  limit - `java.lang.Integer`
  exclusive-start-stream-name - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.ListStreamsResult`"
  (^com.amazonaws.services.kinesis.model.ListStreamsResult [^AbstractAmazonKinesis this ^java.lang.Integer limit ^java.lang.String exclusive-start-stream-name]
    (-> this (.listStreams limit exclusive-start-stream-name)))
  (^com.amazonaws.services.kinesis.model.ListStreamsResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.ListStreamsRequest request]
    (-> this (.listStreams request)))
  (^com.amazonaws.services.kinesis.model.ListStreamsResult [^AbstractAmazonKinesis this]
    (-> this (.listStreams))))

(defn put-records
  "Description copied from interface: AmazonKinesis

  request - A PutRecords request. - `com.amazonaws.services.kinesis.model.PutRecordsRequest`

  returns: Result of the PutRecords operation returned by the service. - `com.amazonaws.services.kinesis.model.PutRecordsResult`"
  (^com.amazonaws.services.kinesis.model.PutRecordsResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.PutRecordsRequest request]
    (-> this (.putRecords request))))

(defn describe-stream-consumer
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.DescribeStreamConsumerRequest`

  returns: Result of the DescribeStreamConsumer operation returned by the service. - `com.amazonaws.services.kinesis.model.DescribeStreamConsumerResult`"
  (^com.amazonaws.services.kinesis.model.DescribeStreamConsumerResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.DescribeStreamConsumerRequest request]
    (-> this (.describeStreamConsumer request))))

(defn describe-stream-summary
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest`

  returns: Result of the DescribeStreamSummary operation returned by the service. - `com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult`"
  (^com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest request]
    (-> this (.describeStreamSummary request))))

(defn set-endpoint
  "Description copied from interface: AmazonKinesis

  endpoint - The endpoint (ex: \"kinesis.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://kinesis.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonKinesis this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn remove-tags-from-stream
  "Description copied from interface: AmazonKinesis

  request - Represents the input for RemoveTagsFromStream. - `com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest`

  returns: Result of the RemoveTagsFromStream operation returned by the service. - `com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult`"
  (^com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest request]
    (-> this (.removeTagsFromStream request))))

(defn merge-shards
  "Description copied from interface: AmazonKinesis

  stream-name - `java.lang.String`
  shard-to-merge - `java.lang.String`
  adjacent-shard-to-merge - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.MergeShardsResult`"
  (^com.amazonaws.services.kinesis.model.MergeShardsResult [^AbstractAmazonKinesis this ^java.lang.String stream-name ^java.lang.String shard-to-merge ^java.lang.String adjacent-shard-to-merge]
    (-> this (.mergeShards stream-name shard-to-merge adjacent-shard-to-merge)))
  (^com.amazonaws.services.kinesis.model.MergeShardsResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.MergeShardsRequest request]
    (-> this (.mergeShards request))))

(defn get-shard-iterator
  "Description copied from interface: AmazonKinesis

  stream-name - `java.lang.String`
  shard-id - `java.lang.String`
  shard-iterator-type - `java.lang.String`
  starting-sequence-number - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.GetShardIteratorResult`"
  (^com.amazonaws.services.kinesis.model.GetShardIteratorResult [^AbstractAmazonKinesis this ^java.lang.String stream-name ^java.lang.String shard-id ^java.lang.String shard-iterator-type ^java.lang.String starting-sequence-number]
    (-> this (.getShardIterator stream-name shard-id shard-iterator-type starting-sequence-number)))
  (^com.amazonaws.services.kinesis.model.GetShardIteratorResult [^AbstractAmazonKinesis this ^java.lang.String stream-name ^java.lang.String shard-id ^java.lang.String shard-iterator-type]
    (-> this (.getShardIterator stream-name shard-id shard-iterator-type)))
  (^com.amazonaws.services.kinesis.model.GetShardIteratorResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.GetShardIteratorRequest request]
    (-> this (.getShardIterator request))))

(defn split-shard
  "Description copied from interface: AmazonKinesis

  stream-name - `java.lang.String`
  shard-to-split - `java.lang.String`
  new-starting-hash-key - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.SplitShardResult`"
  (^com.amazonaws.services.kinesis.model.SplitShardResult [^AbstractAmazonKinesis this ^java.lang.String stream-name ^java.lang.String shard-to-split ^java.lang.String new-starting-hash-key]
    (-> this (.splitShard stream-name shard-to-split new-starting-hash-key)))
  (^com.amazonaws.services.kinesis.model.SplitShardResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.SplitShardRequest request]
    (-> this (.splitShard request))))

(defn put-record
  "Description copied from interface: AmazonKinesis

  stream-name - `java.lang.String`
  data - `java.nio.ByteBuffer`
  partition-key - `java.lang.String`
  sequence-number-for-ordering - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.PutRecordResult`"
  (^com.amazonaws.services.kinesis.model.PutRecordResult [^AbstractAmazonKinesis this ^java.lang.String stream-name ^java.nio.ByteBuffer data ^java.lang.String partition-key ^java.lang.String sequence-number-for-ordering]
    (-> this (.putRecord stream-name data partition-key sequence-number-for-ordering)))
  (^com.amazonaws.services.kinesis.model.PutRecordResult [^AbstractAmazonKinesis this ^java.lang.String stream-name ^java.nio.ByteBuffer data ^java.lang.String partition-key]
    (-> this (.putRecord stream-name data partition-key)))
  (^com.amazonaws.services.kinesis.model.PutRecordResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.PutRecordRequest request]
    (-> this (.putRecord request))))

(defn register-stream-consumer
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.RegisterStreamConsumerRequest`

  returns: Result of the RegisterStreamConsumer operation returned by the service. - `com.amazonaws.services.kinesis.model.RegisterStreamConsumerResult`"
  (^com.amazonaws.services.kinesis.model.RegisterStreamConsumerResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.RegisterStreamConsumerRequest request]
    (-> this (.registerStreamConsumer request))))

(defn get-records
  "Description copied from interface: AmazonKinesis

  request - Represents the input for GetRecords. - `com.amazonaws.services.kinesis.model.GetRecordsRequest`

  returns: Result of the GetRecords operation returned by the service. - `com.amazonaws.services.kinesis.model.GetRecordsResult`"
  (^com.amazonaws.services.kinesis.model.GetRecordsResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.GetRecordsRequest request]
    (-> this (.getRecords request))))

(defn decrease-stream-retention-period
  "Description copied from interface: AmazonKinesis

  request - Represents the input for DecreaseStreamRetentionPeriod. - `com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest`

  returns: Result of the DecreaseStreamRetentionPeriod operation returned by the service. - `com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult`"
  (^com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest request]
    (-> this (.decreaseStreamRetentionPeriod request))))

(defn list-shards
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.ListShardsRequest`

  returns: Result of the ListShards operation returned by the service. - `com.amazonaws.services.kinesis.model.ListShardsResult`"
  (^com.amazonaws.services.kinesis.model.ListShardsResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.ListShardsRequest request]
    (-> this (.listShards request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonKinesis

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonKinesis this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn stop-stream-encryption
  "Description copied from interface: AmazonKinesis

  request - `com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest`

  returns: Result of the StopStreamEncryption operation returned by the service. - `com.amazonaws.services.kinesis.model.StopStreamEncryptionResult`"
  (^com.amazonaws.services.kinesis.model.StopStreamEncryptionResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest request]
    (-> this (.stopStreamEncryption request))))

(defn create-stream
  "Description copied from interface: AmazonKinesis

  stream-name - `java.lang.String`
  shard-count - `java.lang.Integer`

  returns: `com.amazonaws.services.kinesis.model.CreateStreamResult`"
  (^com.amazonaws.services.kinesis.model.CreateStreamResult [^AbstractAmazonKinesis this ^java.lang.String stream-name ^java.lang.Integer shard-count]
    (-> this (.createStream stream-name shard-count)))
  (^com.amazonaws.services.kinesis.model.CreateStreamResult [^AbstractAmazonKinesis this ^com.amazonaws.services.kinesis.model.CreateStreamRequest request]
    (-> this (.createStream request))))

