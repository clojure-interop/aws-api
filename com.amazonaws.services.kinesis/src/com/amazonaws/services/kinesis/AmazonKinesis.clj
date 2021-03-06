(ns com.amazonaws.services.kinesis.AmazonKinesis
  "Interface for accessing Kinesis.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonKinesis instead.


  Amazon Kinesis Data Streams Service API Reference

  Amazon Kinesis Data Streams is a managed service that scales elastically for real-time processing of streaming big
  data."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesis AmazonKinesis]))

(defn list-tags-for-stream
  "Lists the tags for the specified Kinesis data stream. This operation has a limit of five transactions per second
   per account.

  list-tags-for-stream-request - Represents the input for ListTagsForStream. - `com.amazonaws.services.kinesis.model.ListTagsForStreamRequest`

  returns: Result of the ListTagsForStream operation returned by the service. - `com.amazonaws.services.kinesis.model.ListTagsForStreamResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.ListTagsForStreamResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.ListTagsForStreamRequest list-tags-for-stream-request]
    (-> this (.listTagsForStream list-tags-for-stream-request))))

(defn describe-stream
  "Simplified method form for invoking the DescribeStream operation.

  stream-name - `java.lang.String`
  limit - `java.lang.Integer`
  exclusive-start-shard-id - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.DescribeStreamResult`"
  (^com.amazonaws.services.kinesis.model.DescribeStreamResult [^AmazonKinesis this ^java.lang.String stream-name ^java.lang.Integer limit ^java.lang.String exclusive-start-shard-id]
    (-> this (.describeStream stream-name limit exclusive-start-shard-id)))
  (^com.amazonaws.services.kinesis.model.DescribeStreamResult [^AmazonKinesis this ^java.lang.String stream-name ^java.lang.String exclusive-start-shard-id]
    (-> this (.describeStream stream-name exclusive-start-shard-id)))
  (^com.amazonaws.services.kinesis.model.DescribeStreamResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.DescribeStreamRequest describe-stream-request]
    (-> this (.describeStream describe-stream-request))))

(defn update-shard-count
  "Updates the shard count of the specified stream to the specified number of shards.


   Updating the shard count is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns
   immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis
   Data Streams sets the status of the stream back to ACTIVE. Depending on the size of the stream, the
   scaling action could take a few minutes to complete. You can continue to read and write data to your stream while
   its status is UPDATING.


   To update the shard count, Kinesis Data Streams performs splits or merges on individual shards. This can cause
   short-lived shards to be created, in addition to the final shards. We recommend that you double or halve the
   shard count, as this results in the fewest number of splits or merges.


   This operation has the following default limits. By default, you cannot do the following:




   Scale more than twice per rolling 24-hour period per stream




   Scale up to more than double your current shard count for a stream




   Scale down below half your current shard count for a stream




   Scale up to more than 500 shards in a stream




   Scale a stream with more than 500 shards down unless the result is less than 500 shards




   Scale up to more than the shard limit for your account




   For the default limits for an AWS account, see Streams Limits in the
   Amazon Kinesis Data Streams Developer Guide. To request an increase in the call rate limit, the shard
   limit for this API, or your overall shard limit, use the limits form.

  update-shard-count-request - `com.amazonaws.services.kinesis.model.UpdateShardCountRequest`

  returns: Result of the UpdateShardCount operation returned by the service. - `com.amazonaws.services.kinesis.model.UpdateShardCountResult`

  throws: com.amazonaws.services.kinesis.model.InvalidArgumentException - A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information, see the returned message."
  (^com.amazonaws.services.kinesis.model.UpdateShardCountResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.UpdateShardCountRequest update-shard-count-request]
    (-> this (.updateShardCount update-shard-count-request))))

(defn delete-stream
  "Deletes a Kinesis data stream and all its shards and data. You must shut down any applications that are operating
   on the stream before you delete the stream. If an application attempts to operate on a deleted stream, it
   receives the exception ResourceNotFoundException.


   If the stream is in the ACTIVE state, you can delete it. After a DeleteStream request,
   the specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.


   Note: Kinesis Data Streams might continue to accept data read and write operations, such as
   PutRecord, PutRecords, and GetRecords, on a stream in the DELETING state until
   the stream deletion is complete.


   When you delete a stream, any shards in that stream are also deleted, and any tags are dissociated from the
   stream.


   You can use the DescribeStream operation to check the state of the stream, which is returned in
   StreamStatus.


   DeleteStream has a limit of five transactions per second per account.

  delete-stream-request - Represents the input for DeleteStream. - `com.amazonaws.services.kinesis.model.DeleteStreamRequest`

  returns: Result of the DeleteStream operation returned by the service. - `com.amazonaws.services.kinesis.model.DeleteStreamResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.DeleteStreamResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.DeleteStreamRequest delete-stream-request]
    (-> this (.deleteStream delete-stream-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonKinesis this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn deregister-stream-consumer
  "To deregister a consumer, provide its ARN. Alternatively, you can provide the ARN of the data stream and the name
   you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't
   conflict with each other. If you don't know the name or ARN of the consumer that you want to deregister, you can
   use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are
   currently registered with a given data stream. The description of a consumer contains its name and ARN.


   This operation has a limit of five transactions per second per account.

  deregister-stream-consumer-request - `com.amazonaws.services.kinesis.model.DeregisterStreamConsumerRequest`

  returns: Result of the DeregisterStreamConsumer operation returned by the service. - `com.amazonaws.services.kinesis.model.DeregisterStreamConsumerResult`

  throws: com.amazonaws.services.kinesis.model.LimitExceededException - The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed."
  (^com.amazonaws.services.kinesis.model.DeregisterStreamConsumerResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.DeregisterStreamConsumerRequest deregister-stream-consumer-request]
    (-> this (.deregisterStreamConsumer deregister-stream-consumer-request))))

(defn waiters
  "returns: `com.amazonaws.services.kinesis.waiters.AmazonKinesisWaiters`"
  (^com.amazonaws.services.kinesis.waiters.AmazonKinesisWaiters [^AmazonKinesis this]
    (-> this (.waiters))))

(defn increase-stream-retention-period
  "Increases the Kinesis data stream's retention period, which is the length of time data records are accessible
   after they are added to the stream. The maximum value of a stream's retention period is 168 hours (7 days).


   If you choose a longer stream retention period, this operation increases the time period during which records
   that have not yet expired are accessible. However, it does not make previous, expired data (older than the
   stream's previous retention period) accessible after the operation has been called. For example, if a stream's
   retention period is set to 24 hours and is increased to 168 hours, any data that is older than 24 hours remains
   inaccessible to consumer applications.

  increase-stream-retention-period-request - Represents the input for IncreaseStreamRetentionPeriod. - `com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest`

  returns: Result of the IncreaseStreamRetentionPeriod operation returned by the service. - `com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult`

  throws: com.amazonaws.services.kinesis.model.ResourceInUseException - The resource is not available for this operation. For successful operation, the resource must be in the ACTIVE state."
  (^com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest increase-stream-retention-period-request]
    (-> this (.increaseStreamRetentionPeriod increase-stream-retention-period-request))))

(defn describe-limits
  "Describes the shard limits and usage for the account.


   If you update your account limits, the old limits might be returned for a few minutes.


   This operation has a limit of one transaction per second per account.

  describe-limits-request - `com.amazonaws.services.kinesis.model.DescribeLimitsRequest`

  returns: Result of the DescribeLimits operation returned by the service. - `com.amazonaws.services.kinesis.model.DescribeLimitsResult`

  throws: com.amazonaws.services.kinesis.model.LimitExceededException - The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed."
  (^com.amazonaws.services.kinesis.model.DescribeLimitsResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.DescribeLimitsRequest describe-limits-request]
    (-> this (.describeLimits describe-limits-request))))

(defn enable-enhanced-monitoring
  "Enables enhanced Kinesis data stream monitoring for shard-level metrics.

  enable-enhanced-monitoring-request - Represents the input for EnableEnhancedMonitoring. - `com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest`

  returns: Result of the EnableEnhancedMonitoring operation returned by the service. - `com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult`

  throws: com.amazonaws.services.kinesis.model.InvalidArgumentException - A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information, see the returned message."
  (^com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest enable-enhanced-monitoring-request]
    (-> this (.enableEnhancedMonitoring enable-enhanced-monitoring-request))))

(defn add-tags-to-stream
  "Adds or updates tags for the specified Kinesis data stream. Each time you invoke this operation, you can specify
   up to 10 tags. If you want to add more than 10 tags to your stream, you can invoke this operation multiple times.
   In total, each stream can have up to 50 tags.


   If tags have already been assigned to the stream, AddTagsToStream overwrites any existing tags that
   correspond to the specified tag keys.


   AddTagsToStream has a limit of five transactions per second per account.

  add-tags-to-stream-request - Represents the input for AddTagsToStream. - `com.amazonaws.services.kinesis.model.AddTagsToStreamRequest`

  returns: Result of the AddTagsToStream operation returned by the service. - `com.amazonaws.services.kinesis.model.AddTagsToStreamResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.AddTagsToStreamResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.AddTagsToStreamRequest add-tags-to-stream-request]
    (-> this (.addTagsToStream add-tags-to-stream-request))))

(defn disable-enhanced-monitoring
  "Disables enhanced monitoring.

  disable-enhanced-monitoring-request - Represents the input for DisableEnhancedMonitoring. - `com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest`

  returns: Result of the DisableEnhancedMonitoring operation returned by the service. - `com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult`

  throws: com.amazonaws.services.kinesis.model.InvalidArgumentException - A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information, see the returned message."
  (^com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest disable-enhanced-monitoring-request]
    (-> this (.disableEnhancedMonitoring disable-enhanced-monitoring-request))))

(defn start-stream-encryption
  "Enables or updates server-side encryption using an AWS KMS key for a specified stream.


   Starting encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns
   immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis
   Data Streams sets the status of the stream back to ACTIVE. Updating or applying encryption normally
   takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream
   while its status is UPDATING. Once the status of the stream is ACTIVE, encryption
   begins for records written to the stream.


   API Limits: You can successfully apply a new AWS KMS key for server-side encryption 25 times in a rolling 24-hour
   period.


   Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written
   to the stream are encrypted. After you enable encryption, you can verify that encryption is applied by inspecting
   the API response from PutRecord or PutRecords.

  start-stream-encryption-request - `com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest`

  returns: Result of the StartStreamEncryption operation returned by the service. - `com.amazonaws.services.kinesis.model.StartStreamEncryptionResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.StartStreamEncryptionResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest start-stream-encryption-request]
    (-> this (.startStreamEncryption start-stream-encryption-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonKinesis this]
    (-> this (.shutdown))))

(defn list-stream-consumers
  "Lists the consumers registered to receive data from a stream using enhanced fan-out, and provides information
   about each consumer.


   This operation has a limit of 10 transactions per second per account.

  list-stream-consumers-request - `com.amazonaws.services.kinesis.model.ListStreamConsumersRequest`

  returns: Result of the ListStreamConsumers operation returned by the service. - `com.amazonaws.services.kinesis.model.ListStreamConsumersResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.ListStreamConsumersResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.ListStreamConsumersRequest list-stream-consumers-request]
    (-> this (.listStreamConsumers list-stream-consumers-request))))

(defn list-streams
  "Simplified method form for invoking the ListStreams operation.

  limit - `java.lang.Integer`
  exclusive-start-stream-name - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.ListStreamsResult`"
  (^com.amazonaws.services.kinesis.model.ListStreamsResult [^AmazonKinesis this ^java.lang.Integer limit ^java.lang.String exclusive-start-stream-name]
    (-> this (.listStreams limit exclusive-start-stream-name)))
  (^com.amazonaws.services.kinesis.model.ListStreamsResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.ListStreamsRequest list-streams-request]
    (-> this (.listStreams list-streams-request)))
  (^com.amazonaws.services.kinesis.model.ListStreamsResult [^AmazonKinesis this]
    (-> this (.listStreams))))

(defn put-records
  "Writes multiple data records into a Kinesis data stream in a single call (also referred to as a
   PutRecords request). Use this operation to send data into the stream for data ingestion and
   processing.


   Each PutRecords request can support up to 500 records. Each record in the request can be as large as
   1 MB, up to a limit of 5 MB for the entire request, including partition keys. Each shard can support writes up to
   1,000 records per second, up to a maximum data write total of 1 MB per second.


   You must specify the name of the stream that captures, stores, and transports the data; and an array of request
   Records, with each record in the array requiring a partition key and data blob. The record size
   limit applies to the total size of the partition key and data blob.


   The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website
   clickstream data, and so on.


   The partition key is used by Kinesis Data Streams as input to a hash function that maps the partition key and
   associated data to a specific shard. An MD5 hash function is used to map partition keys to 128-bit integer values
   and to map associated data records to shards. As a result of this hashing mechanism, all data records with the
   same partition key map to the same shard within the stream. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide.


   Each record in the Records array may include an optional parameter, ExplicitHashKey,
   which overrides the partition key to shard mapping. This parameter allows a data producer to determine explicitly
   the shard where the record is stored. For more information, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide.


   The PutRecords response includes an array of response Records. Each record in the
   response array directly correlates with a record in the request array using natural ordering, from the top to the
   bottom of the request and response. The response Records array always includes the same number of
   records as the request array.


   The response Records array includes both successfully and unsuccessfully processed records. Kinesis
   Data Streams attempts to process all records in each PutRecords request. A single record failure
   does not stop the processing of subsequent records.


   A successfully processed record includes ShardId and SequenceNumber values. The
   ShardId parameter identifies the shard in the stream where the record is stored. The
   SequenceNumber parameter is an identifier assigned to the put record, unique to all records in the
   stream.


   An unsuccessfully processed record includes ErrorCode and ErrorMessage values.
   ErrorCode reflects the type of error and can be one of the following values:
   ProvisionedThroughputExceededException or InternalFailure. ErrorMessage
   provides more detailed information about the ProvisionedThroughputExceededException exception
   including the account ID, stream name, and shard ID of the record that was throttled. For more information about
   partially successful responses, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide.


   By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use
   IncreaseStreamRetentionPeriod or DecreaseStreamRetentionPeriod to modify this retention period.

  put-records-request - A PutRecords request. - `com.amazonaws.services.kinesis.model.PutRecordsRequest`

  returns: Result of the PutRecords operation returned by the service. - `com.amazonaws.services.kinesis.model.PutRecordsResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.PutRecordsResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.PutRecordsRequest put-records-request]
    (-> this (.putRecords put-records-request))))

(defn describe-stream-consumer
  "To get the description of a registered consumer, provide the ARN of the consumer. Alternatively, you can provide
   the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all
   three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the
   consumer that you want to describe, you can use the ListStreamConsumers operation to get a list of the
   descriptions of all the consumers that are currently registered with a given data stream.


   This operation has a limit of 20 transactions per second per account.

  describe-stream-consumer-request - `com.amazonaws.services.kinesis.model.DescribeStreamConsumerRequest`

  returns: Result of the DescribeStreamConsumer operation returned by the service. - `com.amazonaws.services.kinesis.model.DescribeStreamConsumerResult`

  throws: com.amazonaws.services.kinesis.model.LimitExceededException - The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed."
  (^com.amazonaws.services.kinesis.model.DescribeStreamConsumerResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.DescribeStreamConsumerRequest describe-stream-consumer-request]
    (-> this (.describeStreamConsumer describe-stream-consumer-request))))

(defn describe-stream-summary
  "Provides a summarized description of the specified Kinesis data stream without the shard list.


   The information returned includes the stream name, Amazon Resource Name (ARN), status, record retention period,
   approximate creation time, monitoring, encryption details, and open shard count.

  describe-stream-summary-request - `com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest`

  returns: Result of the DescribeStreamSummary operation returned by the service. - `com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest describe-stream-summary-request]
    (-> this (.describeStreamSummary describe-stream-summary-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"kinesis.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://kinesis.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonKinesis this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn remove-tags-from-stream
  "Removes tags from the specified Kinesis data stream. Removed tags are deleted and cannot be recovered after this
   operation successfully completes.


   If you specify a tag that does not exist, it is ignored.


   RemoveTagsFromStream has a limit of five transactions per second per account.

  remove-tags-from-stream-request - Represents the input for RemoveTagsFromStream. - `com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest`

  returns: Result of the RemoveTagsFromStream operation returned by the service. - `com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest remove-tags-from-stream-request]
    (-> this (.removeTagsFromStream remove-tags-from-stream-request))))

(defn merge-shards
  "Simplified method form for invoking the MergeShards operation.

  stream-name - `java.lang.String`
  shard-to-merge - `java.lang.String`
  adjacent-shard-to-merge - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.MergeShardsResult`"
  (^com.amazonaws.services.kinesis.model.MergeShardsResult [^AmazonKinesis this ^java.lang.String stream-name ^java.lang.String shard-to-merge ^java.lang.String adjacent-shard-to-merge]
    (-> this (.mergeShards stream-name shard-to-merge adjacent-shard-to-merge)))
  (^com.amazonaws.services.kinesis.model.MergeShardsResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.MergeShardsRequest merge-shards-request]
    (-> this (.mergeShards merge-shards-request))))

(defn get-shard-iterator
  "Simplified method form for invoking the GetShardIterator operation.

  stream-name - `java.lang.String`
  shard-id - `java.lang.String`
  shard-iterator-type - `java.lang.String`
  starting-sequence-number - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.GetShardIteratorResult`"
  (^com.amazonaws.services.kinesis.model.GetShardIteratorResult [^AmazonKinesis this ^java.lang.String stream-name ^java.lang.String shard-id ^java.lang.String shard-iterator-type ^java.lang.String starting-sequence-number]
    (-> this (.getShardIterator stream-name shard-id shard-iterator-type starting-sequence-number)))
  (^com.amazonaws.services.kinesis.model.GetShardIteratorResult [^AmazonKinesis this ^java.lang.String stream-name ^java.lang.String shard-id ^java.lang.String shard-iterator-type]
    (-> this (.getShardIterator stream-name shard-id shard-iterator-type)))
  (^com.amazonaws.services.kinesis.model.GetShardIteratorResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.GetShardIteratorRequest get-shard-iterator-request]
    (-> this (.getShardIterator get-shard-iterator-request))))

(defn split-shard
  "Simplified method form for invoking the SplitShard operation.

  stream-name - `java.lang.String`
  shard-to-split - `java.lang.String`
  new-starting-hash-key - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.SplitShardResult`"
  (^com.amazonaws.services.kinesis.model.SplitShardResult [^AmazonKinesis this ^java.lang.String stream-name ^java.lang.String shard-to-split ^java.lang.String new-starting-hash-key]
    (-> this (.splitShard stream-name shard-to-split new-starting-hash-key)))
  (^com.amazonaws.services.kinesis.model.SplitShardResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.SplitShardRequest split-shard-request]
    (-> this (.splitShard split-shard-request))))

(defn put-record
  "Simplified method form for invoking the PutRecord operation.

  stream-name - `java.lang.String`
  data - `java.nio.ByteBuffer`
  partition-key - `java.lang.String`
  sequence-number-for-ordering - `java.lang.String`

  returns: `com.amazonaws.services.kinesis.model.PutRecordResult`"
  (^com.amazonaws.services.kinesis.model.PutRecordResult [^AmazonKinesis this ^java.lang.String stream-name ^java.nio.ByteBuffer data ^java.lang.String partition-key ^java.lang.String sequence-number-for-ordering]
    (-> this (.putRecord stream-name data partition-key sequence-number-for-ordering)))
  (^com.amazonaws.services.kinesis.model.PutRecordResult [^AmazonKinesis this ^java.lang.String stream-name ^java.nio.ByteBuffer data ^java.lang.String partition-key]
    (-> this (.putRecord stream-name data partition-key)))
  (^com.amazonaws.services.kinesis.model.PutRecordResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.PutRecordRequest put-record-request]
    (-> this (.putRecord put-record-request))))

(defn register-stream-consumer
  "Registers a consumer with a Kinesis data stream. When you use this operation, the consumer you register can read
   data from the stream at a rate of up to 2 MiB per second. This rate is unaffected by the total number of
   consumers that read from the same stream.


   You can register up to 5 consumers per stream. A given consumer can only be registered with one stream.


   This operation has a limit of five transactions per second per account.

  register-stream-consumer-request - `com.amazonaws.services.kinesis.model.RegisterStreamConsumerRequest`

  returns: Result of the RegisterStreamConsumer operation returned by the service. - `com.amazonaws.services.kinesis.model.RegisterStreamConsumerResult`

  throws: com.amazonaws.services.kinesis.model.InvalidArgumentException - A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information, see the returned message."
  (^com.amazonaws.services.kinesis.model.RegisterStreamConsumerResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.RegisterStreamConsumerRequest register-stream-consumer-request]
    (-> this (.registerStreamConsumer register-stream-consumer-request))))

(defn get-records
  "Gets data records from a Kinesis data stream's shard.


   Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the
   position in the shard from which you want to start reading data records sequentially. If there are no records
   available in the portion of the shard that the iterator points to, GetRecords returns an empty list. It
   might take multiple calls to get to a portion of the shard that contains records.


   You can scale by provisioning multiple shards per stream while considering service limits (for more information,
   see Amazon Kinesis Data
   Streams Limits in the Amazon Kinesis Data Streams Developer Guide). Your application should have one
   thread per shard, each reading continuously from its stream. To read from a stream continually, call
   GetRecords in a loop. Use GetShardIterator to get the shard iterator to specify in the first
   GetRecords call. GetRecords returns a new shard iterator in NextShardIterator. Specify
   the shard iterator returned in NextShardIterator in subsequent calls to GetRecords. If the
   shard has been closed, the shard iterator can't return more data and GetRecords returns null
   in NextShardIterator. You can terminate the loop when the shard is closed, or when the shard
   iterator reaches the record with the sequence number or other attribute that marks it as the last record to
   process.


   Each data record can be up to 1 MiB in size, and each shard can read up to 2 MiB per second. You can ensure that
   your calls don't exceed the maximum supported size or throughput by using the Limit parameter to
   specify the maximum number of records that GetRecords can return. Consider your average record size when
   determining this limit. The maximum number of records that can be returned per call is 10,000.


   The size of the data returned by GetRecords varies depending on the utilization of the shard. The maximum
   size of data that GetRecords can return is 10 MiB. If a call returns this amount of data, subsequent calls
   made within the next 5 seconds throw ProvisionedThroughputExceededException. If there is
   insufficient provisioned throughput on the stream, subsequent calls made within the next 1 second throw
   ProvisionedThroughputExceededException. GetRecords doesn't return any data when it throws an
   exception. For this reason, we recommend that you wait 1 second between calls to GetRecords. However, it's
   possible that the application will get exceptions for longer than 1 second.


   To detect whether the application is falling behind in processing, you can use the
   MillisBehindLatest response attribute. You can also monitor the stream using CloudWatch metrics and
   other mechanisms (see Monitoring in
   the Amazon Kinesis Data Streams Developer Guide).


   Each Amazon Kinesis record includes a value, ApproximateArrivalTimestamp, that is set when a stream
   successfully receives and stores a record. This is commonly referred to as a server-side time stamp, whereas a
   client-side time stamp is set when a data producer creates or sends the record to a stream (a data producer is
   any data source putting data records into a stream, for example with PutRecords). The time stamp has
   millisecond precision. There are no guarantees about the time stamp accuracy, or that the time stamp is always
   increasing. For example, records in a shard or across a stream might have time stamps that are out of order.


   This operation has a limit of five transactions per second per account.

  get-records-request - Represents the input for GetRecords. - `com.amazonaws.services.kinesis.model.GetRecordsRequest`

  returns: Result of the GetRecords operation returned by the service. - `com.amazonaws.services.kinesis.model.GetRecordsResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.GetRecordsResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.GetRecordsRequest get-records-request]
    (-> this (.getRecords get-records-request))))

(defn decrease-stream-retention-period
  "Decreases the Kinesis data stream's retention period, which is the length of time data records are accessible
   after they are added to the stream. The minimum value of a stream's retention period is 24 hours.


   This operation may result in lost data. For example, if the stream's retention period is 48 hours and is
   decreased to 24 hours, any data already in the stream that is older than 24 hours is inaccessible.

  decrease-stream-retention-period-request - Represents the input for DecreaseStreamRetentionPeriod. - `com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest`

  returns: Result of the DecreaseStreamRetentionPeriod operation returned by the service. - `com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult`

  throws: com.amazonaws.services.kinesis.model.ResourceInUseException - The resource is not available for this operation. For successful operation, the resource must be in the ACTIVE state."
  (^com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest decrease-stream-retention-period-request]
    (-> this (.decreaseStreamRetentionPeriod decrease-stream-retention-period-request))))

(defn list-shards
  "Lists the shards in a stream and provides information about each shard. This operation has a limit of 100
   transactions per second per data stream.



   This API is a new operation that is used by the Amazon Kinesis Client Library (KCL). If you have a fine-grained
   IAM policy that only allows specific operations, you must update your policy to allow calls to this API. For more
   information, see Controlling
   Access to Amazon Kinesis Data Streams Resources Using IAM.

  list-shards-request - `com.amazonaws.services.kinesis.model.ListShardsRequest`

  returns: Result of the ListShards operation returned by the service. - `com.amazonaws.services.kinesis.model.ListShardsResult`

  throws: com.amazonaws.services.kinesis.model.ResourceNotFoundException - The requested resource could not be found. The stream might not be specified correctly."
  (^com.amazonaws.services.kinesis.model.ListShardsResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.ListShardsRequest list-shards-request]
    (-> this (.listShards list-shards-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonKinesis this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn stop-stream-encryption
  "Disables server-side encryption for a specified stream.


   Stopping encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns
   immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis
   Data Streams sets the status of the stream back to ACTIVE. Stopping encryption normally takes a few
   seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its
   status is UPDATING. Once the status of the stream is ACTIVE, records written to the
   stream are no longer encrypted by Kinesis Data Streams.


   API Limits: You can successfully disable server-side encryption 25 times in a rolling 24-hour period.


   Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written
   to the stream are no longer subject to encryption. After you disabled encryption, you can verify that encryption
   is not applied by inspecting the API response from PutRecord or PutRecords.

  stop-stream-encryption-request - `com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest`

  returns: Result of the StopStreamEncryption operation returned by the service. - `com.amazonaws.services.kinesis.model.StopStreamEncryptionResult`

  throws: com.amazonaws.services.kinesis.model.InvalidArgumentException - A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information, see the returned message."
  (^com.amazonaws.services.kinesis.model.StopStreamEncryptionResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest stop-stream-encryption-request]
    (-> this (.stopStreamEncryption stop-stream-encryption-request))))

(defn create-stream
  "Simplified method form for invoking the CreateStream operation.

  stream-name - `java.lang.String`
  shard-count - `java.lang.Integer`

  returns: `com.amazonaws.services.kinesis.model.CreateStreamResult`"
  (^com.amazonaws.services.kinesis.model.CreateStreamResult [^AmazonKinesis this ^java.lang.String stream-name ^java.lang.Integer shard-count]
    (-> this (.createStream stream-name shard-count)))
  (^com.amazonaws.services.kinesis.model.CreateStreamResult [^AmazonKinesis this ^com.amazonaws.services.kinesis.model.CreateStreamRequest create-stream-request]
    (-> this (.createStream create-stream-request))))

