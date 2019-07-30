(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsAsyncClient
  "Client for accessing Amazon DynamoDB Streams asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon DynamoDB

  Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about
  application development with Streams, see Capturing Table Activity with
  DynamoDB Streams in the Amazon DynamoDB Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBStreamsAsyncClient]))

(defn ->amazon-dynamo-db-streams-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonDynamoDBStreamsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonDynamoDBStreamsAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonDynamoDBStreamsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonDynamoDBStreamsAsyncClient aws-credentials executor-service))
  (^AmazonDynamoDBStreamsAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonDynamoDBStreamsAsyncClient client-configuration))
  (^AmazonDynamoDBStreamsAsyncClient []
    (new AmazonDynamoDBStreamsAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsAsyncClientBuilder`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsAsyncClientBuilder []
    (AmazonDynamoDBStreamsAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonDynamoDBStreamsAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-stream-async
  "Description copied from interface: AmazonDynamoDBStreamsAsync

  request - Represents the input of a DescribeStream operation. - `com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeStreamResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest request]
    (-> this (.describeStreamAsync request))))

(defn get-records-async
  "Description copied from interface: AmazonDynamoDBStreamsAsync

  request - Represents the input of a GetRecords operation. - `com.amazonaws.services.dynamodbv2.model.GetRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.GetRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsyncClient this ^com.amazonaws.services.dynamodbv2.model.GetRecordsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRecordsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsyncClient this ^com.amazonaws.services.dynamodbv2.model.GetRecordsRequest request]
    (-> this (.getRecordsAsync request))))

(defn get-shard-iterator-async
  "Description copied from interface: AmazonDynamoDBStreamsAsync

  request - Represents the input of a GetShardIterator operation. - `com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetShardIterator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsyncClient this ^com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getShardIteratorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsyncClient this ^com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest request]
    (-> this (.getShardIteratorAsync request))))

(defn list-streams-async
  "Description copied from interface: AmazonDynamoDBStreamsAsync

  request - Represents the input of a ListStreams operation. - `com.amazonaws.services.dynamodbv2.model.ListStreamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListStreamsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListStreamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBStreamsAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListStreamsRequest request]
    (-> this (.listStreamsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonDynamoDBStreamsAsyncClient this]
    (-> this (.shutdown))))

