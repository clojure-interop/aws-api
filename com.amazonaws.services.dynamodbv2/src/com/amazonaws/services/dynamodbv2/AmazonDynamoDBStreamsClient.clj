(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsClient
  "Client for accessing Amazon DynamoDB Streams. All service calls made using this client are blocking, and will not
  return until the service call completes.

  Amazon DynamoDB

  Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about
  application development with Streams, see Capturing Table Activity with
  DynamoDB Streams in the Amazon DynamoDB Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBStreamsClient]))

(defn ->amazon-dynamo-db-streams-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon DynamoDB Streams (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonDynamoDBStreamsClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonDynamoDBStreamsClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonDynamoDBStreamsClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonDynamoDBStreamsClient aws-credentials client-configuration))
  (^AmazonDynamoDBStreamsClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonDynamoDBStreamsClient client-configuration))
  (^AmazonDynamoDBStreamsClient []
    (new AmazonDynamoDBStreamsClient )))

(defn *builder
  "returns: `com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsClientBuilder`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsClientBuilder []
    (AmazonDynamoDBStreamsClient/builder )))

(defn describe-stream
  "Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN),
   the composition of its shards, and its corresponding DynamoDB table.



   You can call DescribeStream at a maximum rate of 10 times per second.



   Each shard in the stream has a SequenceNumberRange associated with it. If the
   SequenceNumberRange has a StartingSequenceNumber but no
   EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both
   StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed
   and can no longer receive more data.

  request - `com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest`

  returns: Result of the DescribeStream operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeStreamResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent stream."
  (^com.amazonaws.services.dynamodbv2.model.DescribeStreamResult [^AmazonDynamoDBStreamsClient this ^com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest request]
    (-> this (.describeStream request))))

(defn get-records
  "Retrieves the stream records from a given shard.


   Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the
   position in the shard from which you want to start reading stream records sequentially. If there are no stream
   records available in the portion of the shard that the iterator points to, GetRecords returns an
   empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.



   GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first.

  request - `com.amazonaws.services.dynamodbv2.model.GetRecordsRequest`

  returns: Result of the GetRecords operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.GetRecordsResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent stream."
  (^com.amazonaws.services.dynamodbv2.model.GetRecordsResult [^AmazonDynamoDBStreamsClient this ^com.amazonaws.services.dynamodbv2.model.GetRecordsRequest request]
    (-> this (.getRecords request))))

(defn get-shard-iterator
  "Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from
   within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records
   from the shard.



   A shard iterator expires 15 minutes after it is returned to the requester.

  request - `com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest`

  returns: Result of the GetShardIterator operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent stream."
  (^com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult [^AmazonDynamoDBStreamsClient this ^com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest request]
    (-> this (.getShardIterator request))))

(defn list-streams
  "Returns an array of stream ARNs associated with the current account and endpoint. If the TableName
   parameter is present, then ListStreams will return only the streams ARNs for that table.



   You can call ListStreams at a maximum rate of 5 times per second.

  request - `com.amazonaws.services.dynamodbv2.model.ListStreamsRequest`

  returns: Result of the ListStreams operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.ListStreamsResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent stream."
  (^com.amazonaws.services.dynamodbv2.model.ListStreamsResult [^AmazonDynamoDBStreamsClient this ^com.amazonaws.services.dynamodbv2.model.ListStreamsRequest request]
    (-> this (.listStreams request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonDynamoDBStreamsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

