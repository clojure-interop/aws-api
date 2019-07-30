(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams
  "Interface for accessing Amazon DynamoDB Streams.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDynamoDBStreams instead.


  Amazon DynamoDB

  Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about
  application development with Streams, see Capturing Table Activity with
  DynamoDB Streams in the Amazon DynamoDB Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBStreams]))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"streams.dynamodb.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://streams.dynamodb.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonDynamoDBStreams this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonDynamoDBStreams this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-stream
  "Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN),
   the composition of its shards, and its corresponding DynamoDB table.



   You can call DescribeStream at a maximum rate of 10 times per second.



   Each shard in the stream has a SequenceNumberRange associated with it. If the
   SequenceNumberRange has a StartingSequenceNumber but no
   EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both
   StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed
   and can no longer receive more data.

  describe-stream-request - Represents the input of a DescribeStream operation. - `com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest`

  returns: Result of the DescribeStream operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeStreamResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent stream."
  (^com.amazonaws.services.dynamodbv2.model.DescribeStreamResult [^AmazonDynamoDBStreams this ^com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest describe-stream-request]
    (-> this (.describeStream describe-stream-request))))

(defn get-records
  "Retrieves the stream records from a given shard.


   Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the
   position in the shard from which you want to start reading stream records sequentially. If there are no stream
   records available in the portion of the shard that the iterator points to, GetRecords returns an
   empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.



   GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first.

  get-records-request - Represents the input of a GetRecords operation. - `com.amazonaws.services.dynamodbv2.model.GetRecordsRequest`

  returns: Result of the GetRecords operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.GetRecordsResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent stream."
  (^com.amazonaws.services.dynamodbv2.model.GetRecordsResult [^AmazonDynamoDBStreams this ^com.amazonaws.services.dynamodbv2.model.GetRecordsRequest get-records-request]
    (-> this (.getRecords get-records-request))))

(defn get-shard-iterator
  "Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from
   within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records
   from the shard.



   A shard iterator expires 15 minutes after it is returned to the requester.

  get-shard-iterator-request - Represents the input of a GetShardIterator operation. - `com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest`

  returns: Result of the GetShardIterator operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent stream."
  (^com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult [^AmazonDynamoDBStreams this ^com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest get-shard-iterator-request]
    (-> this (.getShardIterator get-shard-iterator-request))))

(defn list-streams
  "Returns an array of stream ARNs associated with the current account and endpoint. If the TableName
   parameter is present, then ListStreams will return only the streams ARNs for that table.



   You can call ListStreams at a maximum rate of 5 times per second.

  list-streams-request - Represents the input of a ListStreams operation. - `com.amazonaws.services.dynamodbv2.model.ListStreamsRequest`

  returns: Result of the ListStreams operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.ListStreamsResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent stream."
  (^com.amazonaws.services.dynamodbv2.model.ListStreamsResult [^AmazonDynamoDBStreams this ^com.amazonaws.services.dynamodbv2.model.ListStreamsRequest list-streams-request]
    (-> this (.listStreams list-streams-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonDynamoDBStreams this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonDynamoDBStreams this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

