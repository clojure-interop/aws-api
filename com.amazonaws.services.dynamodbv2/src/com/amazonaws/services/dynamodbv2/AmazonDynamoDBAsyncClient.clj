(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient
  "Client for accessing DynamoDB asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  Amazon DynamoDB

  Amazon DynamoDB is a fully managed NoSQL database service that provides fast and predictable performance with
  seamless scalability. DynamoDB lets you offload the administrative burdens of operating and scaling a distributed
  database, so that you don't have to worry about hardware provisioning, setup and configuration, replication, software
  patching, or cluster scaling.


  With DynamoDB, you can create database tables that can store and retrieve any amount of data, and serve any level of
  request traffic. You can scale up or scale down your tables' throughput capacity without downtime or performance
  degradation, and use the AWS Management Console to monitor resource utilization and performance metrics.


  DynamoDB automatically spreads the data and traffic for your tables over a sufficient number of servers to handle
  your throughput and storage requirements, while maintaining consistent and fast performance. All of your data is
  stored on solid state disks (SSDs) and automatically replicated across multiple Availability Zones in an AWS region,
  providing built-in high availability and data durability."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBAsyncClient]))

(defn ->amazon-dynamo-db-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonDynamoDBAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonDynamoDBAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonDynamoDBAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonDynamoDBAsyncClient aws-credentials executor-service))
  (^AmazonDynamoDBAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonDynamoDBAsyncClient client-configuration))
  (^AmazonDynamoDBAsyncClient []
    (new AmazonDynamoDBAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder []
    (AmazonDynamoDBAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn describe-global-table-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGlobalTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGlobalTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest request]
    (-> this (.describeGlobalTableAsync request))))

(defn describe-time-to-live-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTimeToLive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTimeToLiveAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest request]
    (-> this (.describeTimeToLiveAsync request))))

(defn update-item-async
  "Simplified method form for invoking the UpdateItem operation with an AsyncHandler.

  table-name - `java.lang.String`
  key - `java.util.Map`
  attribute-updates - `java.util.Map`
  return-values - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates ^java.lang.String return-values ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateItemAsync table-name key attribute-updates return-values async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateItemAsync table-name key attribute-updates async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates]
    (-> this (.updateItemAsync table-name key attribute-updates)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateItemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateItemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateItemRequest request]
    (-> this (.updateItemAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonDynamoDBAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-table-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - Represents the input of a DeleteTable operation. - `com.amazonaws.services.dynamodbv2.model.DeleteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DeleteTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DeleteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DeleteTableRequest request]
    (-> this (.deleteTableAsync request))))

(defn update-global-table-settings-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGlobalTableSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGlobalTableSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest request]
    (-> this (.updateGlobalTableSettingsAsync request))))

(defn delete-item-async
  "Simplified method form for invoking the DeleteItem operation with an AsyncHandler.

  table-name - `java.lang.String`
  key - `java.util.Map`
  return-values - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DeleteItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.Map key ^java.lang.String return-values ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteItemAsync table-name key return-values async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.Map key ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteItemAsync table-name key async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DeleteItemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteItemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DeleteItemRequest request]
    (-> this (.deleteItemAsync request))))

(defn describe-global-table-settings-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGlobalTableSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGlobalTableSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest request]
    (-> this (.describeGlobalTableSettingsAsync request))))

(defn update-continuous-backups-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateContinuousBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateContinuousBackupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest request]
    (-> this (.updateContinuousBackupsAsync request))))

(defn describe-endpoints-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest request]
    (-> this (.describeEndpointsAsync request))))

(defn put-item-async
  "Simplified method form for invoking the PutItem operation with an AsyncHandler.

  table-name - `java.lang.String`
  item - `java.util.Map`
  return-values - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.PutItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.Map item ^java.lang.String return-values ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putItemAsync table-name item return-values async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.Map item ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putItemAsync table-name item async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.PutItemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putItemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.PutItemRequest request]
    (-> this (.putItemAsync request))))

(defn batch-write-item-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - Represents the input of a BatchWriteItem operation. - `com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchWriteItem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchWriteItemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest request]
    (-> this (.batchWriteItemAsync request))))

(defn batch-get-item-async
  "Simplified method form for invoking the BatchGetItem operation with an AsyncHandler.

  request-items - `java.util.Map`
  return-consumed-capacity - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.BatchGetItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.util.Map request-items ^java.lang.String return-consumed-capacity ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetItemAsync request-items return-consumed-capacity async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetItemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest request]
    (-> this (.batchGetItemAsync request))))

(defn update-global-table-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGlobalTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGlobalTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest request]
    (-> this (.updateGlobalTableAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonDynamoDBAsyncClient this]
    (-> this (.shutdown))))

(defn update-time-to-live-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - Represents the input of an UpdateTimeToLive operation. - `com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTimeToLive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTimeToLiveAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest request]
    (-> this (.updateTimeToLiveAsync request))))

(defn scan-async
  "Simplified method form for invoking the Scan operation with an AsyncHandler.

  table-name - `java.lang.String`
  attributes-to-get - `java.util.List`
  scan-filter - `java.util.Map`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ScanResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.List attributes-to-get ^java.util.Map scan-filter ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scanAsync table-name attributes-to-get scan-filter async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.List attributes-to-get ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scanAsync table-name attributes-to-get async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ScanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scanAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ScanRequest request]
    (-> this (.scanAsync request))))

(defn list-global-tables-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGlobalTables operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGlobalTablesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest request]
    (-> this (.listGlobalTablesAsync request))))

(defn get-item-async
  "Simplified method form for invoking the GetItem operation with an AsyncHandler.

  table-name - `java.lang.String`
  key - `java.util.Map`
  consistent-read - `java.lang.Boolean`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.GetItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.Map key ^java.lang.Boolean consistent-read ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getItemAsync table-name key consistent-read async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^java.util.Map key ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getItemAsync table-name key async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.GetItemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getItemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.GetItemRequest request]
    (-> this (.getItemAsync request))))

(defn query-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - Represents the input of a Query operation. - `com.amazonaws.services.dynamodbv2.model.QueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Query operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.QueryResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.QueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.queryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.QueryRequest request]
    (-> this (.queryAsync request))))

(defn create-global-table-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGlobalTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGlobalTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest request]
    (-> this (.createGlobalTableAsync request))))

(defn describe-continuous-backups-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeContinuousBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeContinuousBackupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest request]
    (-> this (.describeContinuousBackupsAsync request))))

(defn create-backup-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.CreateBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.CreateBackupResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.CreateBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.CreateBackupRequest request]
    (-> this (.createBackupAsync request))))

(defn create-table-async
  "Simplified method form for invoking the CreateTable operation with an AsyncHandler.

  attribute-definitions - `java.util.List`
  table-name - `java.lang.String`
  key-schema - `java.util.List`
  provisioned-throughput - `com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.CreateTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.util.List attribute-definitions ^java.lang.String table-name ^java.util.List key-schema ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTableAsync attribute-definitions table-name key-schema provisioned-throughput async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.util.List attribute-definitions ^java.lang.String table-name ^java.util.List key-schema ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput]
    (-> this (.createTableAsync attribute-definitions table-name key-schema provisioned-throughput)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.CreateTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.CreateTableRequest request]
    (-> this (.createTableAsync request))))

(defn update-table-async
  "Simplified method form for invoking the UpdateTable operation with an AsyncHandler.

  table-name - `java.lang.String`
  provisioned-throughput - `com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String table-name ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTableAsync table-name provisioned-throughput async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.UpdateTableRequest request]
    (-> this (.updateTableAsync request))))

(defn restore-table-from-backup-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreTableFromBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreTableFromBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest request]
    (-> this (.restoreTableFromBackupAsync request))))

(defn restore-table-to-point-in-time-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreTableToPointInTime operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreTableToPointInTimeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest request]
    (-> this (.restoreTableToPointInTimeAsync request))))

(defn list-tags-of-resource-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsOfResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsOfResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest request]
    (-> this (.listTagsOfResourceAsync request))))

(defn transact-write-items-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TransactWriteItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.TransactWriteItemsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.transactWriteItemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest request]
    (-> this (.transactWriteItemsAsync request))))

(defn describe-table-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - Represents the input of a DescribeTable operation. - `com.amazonaws.services.dynamodbv2.model.DescribeTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeTableRequest request]
    (-> this (.describeTableAsync request))))

(defn list-backups-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.ListBackupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListBackupsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListBackupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListBackupsRequest request]
    (-> this (.listBackupsAsync request))))

(defn transact-get-items-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TransactGetItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.TransactGetItemsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.transactGetItemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest request]
    (-> this (.transactGetItemsAsync request))))

(defn delete-backup-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DeleteBackupResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest request]
    (-> this (.deleteBackupAsync request))))

(defn describe-limits-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - Represents the input of a DescribeLimits operation. Has no content. - `com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest request]
    (-> this (.describeLimitsAsync request))))

(defn describe-backup-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeBackupResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest request]
    (-> this (.describeBackupAsync request))))

(defn list-tables-async
  "Simplified method form for invoking the ListTables operation with an AsyncHandler.

  exclusive-start-table-name - `java.lang.String`
  limit - `java.lang.Integer`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListTablesResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^java.lang.String exclusive-start-table-name ^java.lang.Integer limit ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTablesAsync exclusive-start-table-name limit async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListTablesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTablesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.ListTablesRequest request]
    (-> this (.listTablesAsync request)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this]
    (-> this (.listTablesAsync))))

(defn tag-resource-async
  "Description copied from interface: AmazonDynamoDBAsync

  request - `com.amazonaws.services.dynamodbv2.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsyncClient this ^com.amazonaws.services.dynamodbv2.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

