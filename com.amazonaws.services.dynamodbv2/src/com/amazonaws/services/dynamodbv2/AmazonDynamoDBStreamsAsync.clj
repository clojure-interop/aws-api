(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsAsync
  "Interface for accessing Amazon DynamoDB Streams asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDynamoDBStreamsAsync instead.


  Amazon DynamoDB

  Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about
  application development with Streams, see Capturing Table Activity with
  DynamoDB Streams in the Amazon DynamoDB Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBStreamsAsync]))

(defn describe-stream-async
  "Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN),
   the composition of its shards, and its corresponding DynamoDB table.



   You can call DescribeStream at a maximum rate of 10 times per second.



   Each shard in the stream has a SequenceNumberRange associated with it. If the
   SequenceNumberRange has a StartingSequenceNumber but no
   EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both
   StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed
   and can no longer receive more data.

  describe-stream-request - Represents the input of a DescribeStream operation. - `com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeStreamResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest describe-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync describe-stream-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest describe-stream-request]
    (-> this (.describeStreamAsync describe-stream-request))))

(defn get-records-async
  "Retrieves the stream records from a given shard.


   Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the
   position in the shard from which you want to start reading stream records sequentially. If there are no stream
   records available in the portion of the shard that the iterator points to, GetRecords returns an
   empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.



   GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first.

  get-records-request - Represents the input of a GetRecords operation. - `com.amazonaws.services.dynamodbv2.model.GetRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.GetRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.GetRecordsRequest get-records-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRecordsAsync get-records-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.GetRecordsRequest get-records-request]
    (-> this (.getRecordsAsync get-records-request))))

(defn get-shard-iterator-async
  "Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from
   within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records
   from the shard.



   A shard iterator expires 15 minutes after it is returned to the requester.

  get-shard-iterator-request - Represents the input of a GetShardIterator operation. - `com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetShardIterator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest get-shard-iterator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getShardIteratorAsync get-shard-iterator-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest get-shard-iterator-request]
    (-> this (.getShardIteratorAsync get-shard-iterator-request))))

(defn list-streams-async
  "Returns an array of stream ARNs associated with the current account and endpoint. If the TableName
   parameter is present, then ListStreams will return only the streams ARNs for that table.



   You can call ListStreams at a maximum rate of 5 times per second.

  list-streams-request - Represents the input of a ListStreams operation. - `com.amazonaws.services.dynamodbv2.model.ListStreamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListStreamsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.ListStreamsRequest list-streams-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamsAsync list-streams-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.ListStreamsRequest list-streams-request]
    (-> this (.listStreamsAsync list-streams-request))))

