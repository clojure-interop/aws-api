(ns com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDBStreamsAsync
  "Abstract implementation of AmazonDynamoDBStreamsAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AbstractAmazonDynamoDBStreamsAsync]))

(defn describe-stream-async
  "Description copied from interface: AmazonDynamoDBStreamsAsync

  request - Represents the input of a DescribeStream operation. - `com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest request]
    (-> this (.describeStreamAsync request))))

(defn get-records-async
  "Description copied from interface: AmazonDynamoDBStreamsAsync

  request - Represents the input of a GetRecords operation. - `com.amazonaws.services.dynamodbv2.model.GetRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.GetRecordsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.GetRecordsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRecordsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.GetRecordsRequest request]
    (-> this (.getRecordsAsync request))))

(defn get-shard-iterator-async
  "Description copied from interface: AmazonDynamoDBStreamsAsync

  request - Represents the input of a GetShardIterator operation. - `com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetShardIterator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getShardIteratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest request]
    (-> this (.getShardIteratorAsync request))))

(defn list-streams-async
  "Description copied from interface: AmazonDynamoDBStreamsAsync

  request - Represents the input of a ListStreams operation. - `com.amazonaws.services.dynamodbv2.model.ListStreamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListStreamsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.ListStreamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonDynamoDBStreamsAsync this ^com.amazonaws.services.dynamodbv2.model.ListStreamsRequest request]
    (-> this (.listStreamsAsync request))))

