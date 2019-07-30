(ns com.amazonaws.services.kinesis.AmazonKinesisAsyncClient
  "Client for accessing Kinesis asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  Amazon Kinesis Data Streams Service API Reference

  Amazon Kinesis Data Streams is a managed service that scales elastically for real-time processing of streaming big
  data."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesis AmazonKinesisAsyncClient]))

(defn ->amazon-kinesis-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonKinesisAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonKinesisAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonKinesisAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonKinesisAsyncClient aws-credentials executor-service))
  (^AmazonKinesisAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonKinesisAsyncClient client-configuration))
  (^AmazonKinesisAsyncClient []
    (new AmazonKinesisAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.kinesis.AmazonKinesisAsyncClientBuilder`"
  (^com.amazonaws.services.kinesis.AmazonKinesisAsyncClientBuilder []
    (AmazonKinesisAsyncClient/asyncBuilder )))

(defn increase-stream-retention-period-async
  "Description copied from interface: AmazonKinesisAsync

  request - Represents the input for IncreaseStreamRetentionPeriod. - `com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IncreaseStreamRetentionPeriod operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.increaseStreamRetentionPeriodAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest request]
    (-> this (.increaseStreamRetentionPeriodAsync request))))

(defn describe-stream-consumer-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.DescribeStreamConsumerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStreamConsumer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.DescribeStreamConsumerResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DescribeStreamConsumerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamConsumerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DescribeStreamConsumerRequest request]
    (-> this (.describeStreamConsumerAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonKinesisAsyncClient this]
    (-> this (.getExecutorService))))

(defn remove-tags-from-stream-async
  "Description copied from interface: AmazonKinesisAsync

  request - Represents the input for RemoveTagsFromStream. - `com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.RemoveTagsFromStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest request]
    (-> this (.removeTagsFromStreamAsync request))))

(defn deregister-stream-consumer-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.DeregisterStreamConsumerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterStreamConsumer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.DeregisterStreamConsumerResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DeregisterStreamConsumerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterStreamConsumerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DeregisterStreamConsumerRequest request]
    (-> this (.deregisterStreamConsumerAsync request))))

(defn create-stream-async
  "Simplified method form for invoking the CreateStream operation with an AsyncHandler.

  stream-name - `java.lang.String`
  shard-count - `java.lang.Integer`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.CreateStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.Integer shard-count ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamAsync stream-name shard-count async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.CreateStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.CreateStreamRequest request]
    (-> this (.createStreamAsync request))))

(defn list-shards-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.ListShardsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListShards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.ListShardsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.ListShardsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listShardsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.ListShardsRequest request]
    (-> this (.listShardsAsync request))))

(defn start-stream-encryption-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartStreamEncryption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.StartStreamEncryptionResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startStreamEncryptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest request]
    (-> this (.startStreamEncryptionAsync request))))

(defn put-records-async
  "Description copied from interface: AmazonKinesisAsync

  request - A PutRecords request. - `com.amazonaws.services.kinesis.model.PutRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.PutRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.PutRecordsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRecordsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.PutRecordsRequest request]
    (-> this (.putRecordsAsync request))))

(defn add-tags-to-stream-async
  "Description copied from interface: AmazonKinesisAsync

  request - Represents the input for AddTagsToStream. - `com.amazonaws.services.kinesis.model.AddTagsToStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.AddTagsToStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.AddTagsToStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.AddTagsToStreamRequest request]
    (-> this (.addTagsToStreamAsync request))))

(defn list-streams-async
  "Simplified method form for invoking the ListStreams operation with an AsyncHandler.

  limit - `java.lang.Integer`
  exclusive-start-stream-name - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.ListStreamsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.Integer limit ^java.lang.String exclusive-start-stream-name ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamsAsync limit exclusive-start-stream-name async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.ListStreamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.ListStreamsRequest request]
    (-> this (.listStreamsAsync request)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this]
    (-> this (.listStreamsAsync))))

(defn get-records-async
  "Description copied from interface: AmazonKinesisAsync

  request - Represents the input for GetRecords. - `com.amazonaws.services.kinesis.model.GetRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.GetRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.GetRecordsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRecordsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.GetRecordsRequest request]
    (-> this (.getRecordsAsync request))))

(defn list-stream-consumers-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.ListStreamConsumersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreamConsumers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.ListStreamConsumersResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.ListStreamConsumersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamConsumersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.ListStreamConsumersRequest request]
    (-> this (.listStreamConsumersAsync request))))

(defn disable-enhanced-monitoring-async
  "Description copied from interface: AmazonKinesisAsync

  request - Represents the input for DisableEnhancedMonitoring. - `com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableEnhancedMonitoring operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableEnhancedMonitoringAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest request]
    (-> this (.disableEnhancedMonitoringAsync request))))

(defn describe-stream-async
  "Simplified method form for invoking the DescribeStream operation with an AsyncHandler.

  stream-name - `java.lang.String`
  limit - `java.lang.Integer`
  exclusive-start-shard-id - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.DescribeStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.Integer limit ^java.lang.String exclusive-start-shard-id ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync stream-name limit exclusive-start-shard-id async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.String exclusive-start-shard-id ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync stream-name exclusive-start-shard-id async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DescribeStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DescribeStreamRequest request]
    (-> this (.describeStreamAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonKinesisAsyncClient this]
    (-> this (.shutdown))))

(defn merge-shards-async
  "Simplified method form for invoking the MergeShards operation with an AsyncHandler.

  stream-name - `java.lang.String`
  shard-to-merge - `java.lang.String`
  adjacent-shard-to-merge - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.MergeShardsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.String shard-to-merge ^java.lang.String adjacent-shard-to-merge ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeShardsAsync stream-name shard-to-merge adjacent-shard-to-merge async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.String shard-to-merge ^java.lang.String adjacent-shard-to-merge]
    (-> this (.mergeShardsAsync stream-name shard-to-merge adjacent-shard-to-merge)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.MergeShardsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.mergeShardsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.MergeShardsRequest request]
    (-> this (.mergeShardsAsync request))))

(defn describe-stream-summary-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStreamSummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamSummaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest request]
    (-> this (.describeStreamSummaryAsync request))))

(defn put-record-async
  "Simplified method form for invoking the PutRecord operation with an AsyncHandler.

  stream-name - `java.lang.String`
  data - `java.nio.ByteBuffer`
  partition-key - `java.lang.String`
  sequence-number-for-ordering - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.PutRecordResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.nio.ByteBuffer data ^java.lang.String partition-key ^java.lang.String sequence-number-for-ordering ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRecordAsync stream-name data partition-key sequence-number-for-ordering async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.nio.ByteBuffer data ^java.lang.String partition-key ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRecordAsync stream-name data partition-key async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.nio.ByteBuffer data ^java.lang.String partition-key]
    (-> this (.putRecordAsync stream-name data partition-key)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.PutRecordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRecordAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.PutRecordRequest request]
    (-> this (.putRecordAsync request))))

(defn list-tags-for-stream-async
  "Description copied from interface: AmazonKinesisAsync

  request - Represents the input for ListTagsForStream. - `com.amazonaws.services.kinesis.model.ListTagsForStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.ListTagsForStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.ListTagsForStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.ListTagsForStreamRequest request]
    (-> this (.listTagsForStreamAsync request))))

(defn stop-stream-encryption-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopStreamEncryption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.StopStreamEncryptionResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopStreamEncryptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest request]
    (-> this (.stopStreamEncryptionAsync request))))

(defn update-shard-count-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.UpdateShardCountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateShardCount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.UpdateShardCountResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.UpdateShardCountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateShardCountAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.UpdateShardCountRequest request]
    (-> this (.updateShardCountAsync request))))

(defn decrease-stream-retention-period-async
  "Description copied from interface: AmazonKinesisAsync

  request - Represents the input for DecreaseStreamRetentionPeriod. - `com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DecreaseStreamRetentionPeriod operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.decreaseStreamRetentionPeriodAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest request]
    (-> this (.decreaseStreamRetentionPeriodAsync request))))

(defn get-shard-iterator-async
  "Simplified method form for invoking the GetShardIterator operation with an AsyncHandler.

  stream-name - `java.lang.String`
  shard-id - `java.lang.String`
  shard-iterator-type - `java.lang.String`
  starting-sequence-number - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.GetShardIteratorResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.String shard-id ^java.lang.String shard-iterator-type ^java.lang.String starting-sequence-number ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getShardIteratorAsync stream-name shard-id shard-iterator-type starting-sequence-number async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.String shard-id ^java.lang.String shard-iterator-type ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getShardIteratorAsync stream-name shard-id shard-iterator-type async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.String shard-id ^java.lang.String shard-iterator-type]
    (-> this (.getShardIteratorAsync stream-name shard-id shard-iterator-type)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.GetShardIteratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getShardIteratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.GetShardIteratorRequest request]
    (-> this (.getShardIteratorAsync request))))

(defn describe-limits-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.DescribeLimitsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.DescribeLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DescribeLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DescribeLimitsRequest request]
    (-> this (.describeLimitsAsync request))))

(defn split-shard-async
  "Simplified method form for invoking the SplitShard operation with an AsyncHandler.

  stream-name - `java.lang.String`
  shard-to-split - `java.lang.String`
  new-starting-hash-key - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.SplitShardResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.String shard-to-split ^java.lang.String new-starting-hash-key ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.splitShardAsync stream-name shard-to-split new-starting-hash-key async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^java.lang.String stream-name ^java.lang.String shard-to-split ^java.lang.String new-starting-hash-key]
    (-> this (.splitShardAsync stream-name shard-to-split new-starting-hash-key)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.SplitShardRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.splitShardAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.SplitShardRequest request]
    (-> this (.splitShardAsync request))))

(defn register-stream-consumer-async
  "Description copied from interface: AmazonKinesisAsync

  request - `com.amazonaws.services.kinesis.model.RegisterStreamConsumerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterStreamConsumer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.RegisterStreamConsumerResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.RegisterStreamConsumerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerStreamConsumerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.RegisterStreamConsumerRequest request]
    (-> this (.registerStreamConsumerAsync request))))

(defn delete-stream-async
  "Description copied from interface: AmazonKinesisAsync

  request - Represents the input for DeleteStream. - `com.amazonaws.services.kinesis.model.DeleteStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.DeleteStreamResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DeleteStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.DeleteStreamRequest request]
    (-> this (.deleteStreamAsync request))))

(defn enable-enhanced-monitoring-async
  "Description copied from interface: AmazonKinesisAsync

  request - Represents the input for EnableEnhancedMonitoring. - `com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableEnhancedMonitoring operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableEnhancedMonitoringAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisAsyncClient this ^com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest request]
    (-> this (.enableEnhancedMonitoringAsync request))))

