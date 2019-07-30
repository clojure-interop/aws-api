(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
  "Interface for accessing DynamoDB asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDynamoDBAsync instead.


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
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBAsync]))

(defn untag-resource-async
  "Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to
   five times per second, per account.


   For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
   the Amazon DynamoDB Developer Guide.

  untag-resource-request - `com.amazonaws.services.dynamodbv2.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn describe-global-table-async
  "Returns information about the specified global table.

  describe-global-table-request - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGlobalTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest describe-global-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGlobalTableAsync describe-global-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest describe-global-table-request]
    (-> this (.describeGlobalTableAsync describe-global-table-request))))

(defn describe-time-to-live-async
  "Gives a description of the Time to Live (TTL) status on the specified table.

  describe-time-to-live-request - `com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTimeToLive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest describe-time-to-live-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTimeToLiveAsync describe-time-to-live-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest describe-time-to-live-request]
    (-> this (.describeTimeToLiveAsync describe-time-to-live-request))))

(defn update-item-async
  "Simplified method form for invoking the UpdateItem operation with an AsyncHandler.

  table-name - `java.lang.String`
  key - `java.util.Map`
  attribute-updates - `java.util.Map`
  return-values - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates ^java.lang.String return-values ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateItemAsync table-name key attribute-updates return-values async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateItemAsync table-name key attribute-updates async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates]
    (-> this (.updateItemAsync table-name key attribute-updates)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateItemRequest update-item-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateItemAsync update-item-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateItemRequest update-item-request]
    (-> this (.updateItemAsync update-item-request))))

(defn delete-table-async
  "The DeleteTable operation deletes a table and all of its items. After a DeleteTable
   request, the specified table is in the DELETING state until DynamoDB completes the deletion. If the
   table is in the ACTIVE state, you can delete it. If a table is in CREATING or
   UPDATING states, then DynamoDB returns a ResourceInUseException. If the specified table
   does not exist, DynamoDB returns a ResourceNotFoundException. If table is already in the
   DELETING state, no error is returned.



   DynamoDB might continue to accept data read and write operations, such as GetItem and
   PutItem, on a table in the DELETING state until the table deletion is complete.



   When you delete a table, any indexes on that table are also deleted.


   If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the
   DISABLED state, and the stream is automatically deleted after 24 hours.


   Use the DescribeTable action to check the status of the table.

  delete-table-request - Represents the input of a DeleteTable operation. - `com.amazonaws.services.dynamodbv2.model.DeleteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DeleteTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DeleteTableRequest delete-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTableAsync delete-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DeleteTableRequest delete-table-request]
    (-> this (.deleteTableAsync delete-table-request))))

(defn update-global-table-settings-async
  "Updates settings for a global table.

  update-global-table-settings-request - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGlobalTableSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest update-global-table-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGlobalTableSettingsAsync update-global-table-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest update-global-table-settings-request]
    (-> this (.updateGlobalTableSettingsAsync update-global-table-settings-request))))

(defn delete-item-async
  "Simplified method form for invoking the DeleteItem operation with an AsyncHandler.

  table-name - `java.lang.String`
  key - `java.util.Map`
  return-values - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DeleteItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.Map key ^java.lang.String return-values ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteItemAsync table-name key return-values async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.Map key ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteItemAsync table-name key async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DeleteItemRequest delete-item-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteItemAsync delete-item-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DeleteItemRequest delete-item-request]
    (-> this (.deleteItemAsync delete-item-request))))

(defn describe-global-table-settings-async
  "Describes Region-specific settings for a global table.

  describe-global-table-settings-request - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGlobalTableSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest describe-global-table-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGlobalTableSettingsAsync describe-global-table-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest describe-global-table-settings-request]
    (-> this (.describeGlobalTableSettingsAsync describe-global-table-settings-request))))

(defn update-continuous-backups-async
  "UpdateContinuousBackups enables or disables point in time recovery for the specified table. A
   successful UpdateContinuousBackups call returns the current
   ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table
   creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.


   Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
   EarliestRestorableDateTime and LatestRestorableDateTime.


   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table
   to any point in time during the last 35 days.

  update-continuous-backups-request - `com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateContinuousBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest update-continuous-backups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateContinuousBackupsAsync update-continuous-backups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest update-continuous-backups-request]
    (-> this (.updateContinuousBackupsAsync update-continuous-backups-request))))

(defn describe-endpoints-async
  "Returns the regional endpoint information.

  describe-endpoints-request - `com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest describe-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointsAsync describe-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest describe-endpoints-request]
    (-> this (.describeEndpointsAsync describe-endpoints-request))))

(defn put-item-async
  "Simplified method form for invoking the PutItem operation with an AsyncHandler.

  table-name - `java.lang.String`
  item - `java.util.Map`
  return-values - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.PutItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.Map item ^java.lang.String return-values ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putItemAsync table-name item return-values async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.Map item ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putItemAsync table-name item async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.PutItemRequest put-item-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putItemAsync put-item-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.PutItemRequest put-item-request]
    (-> this (.putItemAsync put-item-request))))

(defn batch-write-item-async
  "The BatchWriteItem operation puts or deletes multiple items in one or more tables. A single call to
   BatchWriteItem can write up to 16 MB of data, which can comprise as many as 25 put or delete
   requests. Individual items to be written can be as large as 400 KB.



   BatchWriteItem cannot update items. To update items, use the UpdateItem action.



   The individual PutItem and DeleteItem operations specified in
   BatchWriteItem are atomic; however BatchWriteItem as a whole is not. If any requested
   operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs,
   the failed operations are returned in the UnprocessedItems response parameter. You can investigate
   and optionally resend the requests. Typically, you would call BatchWriteItem in a loop. Each
   iteration would check for unprocessed items and submit a new BatchWriteItem request with those
   unprocessed items until all items have been processed.


   If none of the items can be processed due to insufficient provisioned throughput on all of the tables in
   the request, then BatchWriteItem returns a ProvisionedThroughputExceededException.



   If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we
   strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation
   immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If
   you delay the batch operation using exponential backoff, the individual requests in the batch are much more
   likely to succeed.


   For more information, see Batch Operations and Error Handling in the Amazon DynamoDB Developer Guide.



   With BatchWriteItem, you can efficiently write or delete large amounts of data, such as from Amazon
   EMR, or copy data from another database into DynamoDB. In order to improve performance with these large-scale
   operations, BatchWriteItem does not behave in the same way as individual PutItem and
   DeleteItem calls would. For example, you cannot specify conditions on individual put and delete
   requests, and BatchWriteItem does not return deleted items in the response.


   If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your
   application must include the necessary logic to manage the threads. With languages that don't support threading,
   you must update or delete the specified items one at a time. In both situations, BatchWriteItem
   performs the specified put and delete operations in parallel, giving you the power of the thread pool approach
   without having to introduce complexity into your application.


   Parallel processing reduces latency, but each specified put and delete request consumes the same number of write
   capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one
   write capacity unit.


   If one or more of the following is true, DynamoDB rejects the entire batch write operation:




   One or more tables specified in the BatchWriteItem request does not exist.




   Primary key attributes specified on an item in the request do not match those in the corresponding table's
   primary key schema.




   You try to perform multiple operations on the same item in the same BatchWriteItem request. For
   example, you cannot put and delete the same item in the same BatchWriteItem request.




   Your request contains at least two items with identical hash and range keys (which essentially is two put
   operations).




   There are more than 25 requests in the batch.




   Any individual item in a batch exceeds 400 KB.




   The total request size exceeds 16 MB.

  batch-write-item-request - Represents the input of a BatchWriteItem operation. - `com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchWriteItem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest batch-write-item-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchWriteItemAsync batch-write-item-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest batch-write-item-request]
    (-> this (.batchWriteItemAsync batch-write-item-request))))

(defn batch-get-item-async
  "Simplified method form for invoking the BatchGetItem operation with an AsyncHandler.

  request-items - `java.util.Map`
  return-consumed-capacity - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.BatchGetItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.util.Map request-items ^java.lang.String return-consumed-capacity ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetItemAsync request-items return-consumed-capacity async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest batch-get-item-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetItemAsync batch-get-item-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest batch-get-item-request]
    (-> this (.batchGetItemAsync batch-get-item-request))))

(defn update-global-table-async
  "Adds or removes replicas in the specified global table. The global table must already exist to be able to use
   this operation. Any replica to be added must be empty, have the same name as the global table, have the same key
   schema, have DynamoDB Streams enabled, and have the same provisioned and maximum write capacity units.



   Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for
   simplicity we recommend that you issue separate requests for adding or removing replicas.



   If global secondary indexes are specified, then the following conditions must also be met:




   The global secondary indexes must have the same name.




   The global secondary indexes must have the same hash key and sort key (if present).




   The global secondary indexes must have the same provisioned and maximum write capacity units.

  update-global-table-request - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGlobalTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest update-global-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGlobalTableAsync update-global-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest update-global-table-request]
    (-> this (.updateGlobalTableAsync update-global-table-request))))

(defn update-time-to-live-async
  "The UpdateTimeToLive method enables or disables Time to Live (TTL) for the specified table. A
   successful UpdateTimeToLive call returns the current TimeToLiveSpecification. It can
   take up to one hour for the change to fully process. Any additional UpdateTimeToLive calls for the
   same table during this one hour duration result in a ValidationException.


   TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the
   epoch time value stored in the attribute is less than the current time, the item is marked as expired and
   subsequently deleted.



   The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.



   DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data
   operations.



   DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item
   gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been
   deleted will still show up in reads, queries, and scans.



   As items are deleted, they are removed from any local secondary index and global secondary index immediately in
   the same eventually consistent way as a standard delete operation.


   For more information, see Time To Live in the Amazon
   DynamoDB Developer Guide.

  update-time-to-live-request - Represents the input of an UpdateTimeToLive operation. - `com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTimeToLive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest update-time-to-live-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTimeToLiveAsync update-time-to-live-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest update-time-to-live-request]
    (-> this (.updateTimeToLiveAsync update-time-to-live-request))))

(defn scan-async
  "Simplified method form for invoking the Scan operation with an AsyncHandler.

  table-name - `java.lang.String`
  attributes-to-get - `java.util.List`
  scan-filter - `java.util.Map`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ScanResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.List attributes-to-get ^java.util.Map scan-filter ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scanAsync table-name attributes-to-get scan-filter async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.List attributes-to-get ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scanAsync table-name attributes-to-get async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ScanRequest scan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scanAsync scan-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ScanRequest scan-request]
    (-> this (.scanAsync scan-request))))

(defn list-global-tables-async
  "Lists all global tables that have a replica in the specified Region.

  list-global-tables-request - `com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGlobalTables operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest list-global-tables-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGlobalTablesAsync list-global-tables-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest list-global-tables-request]
    (-> this (.listGlobalTablesAsync list-global-tables-request))))

(defn get-item-async
  "Simplified method form for invoking the GetItem operation with an AsyncHandler.

  table-name - `java.lang.String`
  key - `java.util.Map`
  consistent-read - `java.lang.Boolean`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.GetItemResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.Map key ^java.lang.Boolean consistent-read ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getItemAsync table-name key consistent-read async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^java.util.Map key ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getItemAsync table-name key async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.GetItemRequest get-item-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getItemAsync get-item-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.GetItemRequest get-item-request]
    (-> this (.getItemAsync get-item-request))))

(defn query-async
  "The Query operation finds items based on primary key values. You can query any table or secondary
   index that has a composite primary key (a partition key and a sort key).


   Use the KeyConditionExpression parameter to provide a specific value for the partition key. The
   Query operation will return all of the items from the table or index with that partition key value.
   You can optionally narrow the scope of the Query operation by specifying a sort key value and a
   comparison operator in KeyConditionExpression. To further refine the Query results, you
   can optionally provide a FilterExpression. A FilterExpression determines which items
   within the results should be returned to you. All of the other results are discarded.


   A Query operation always returns a result set. If no matching items are found, the result set will
   be empty. Queries that do not return results consume the minimum number of read capacity units for that type of
   read operation.



   DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that
   is returned to an application. The number of capacity units consumed will be the same whether you request all of
   the attributes (the default behavior) or just some of them (using a projection expression). The number will also
   be the same whether or not you use a FilterExpression.



   Query results are always sorted by the sort key value. If the data type of the sort key is Number,
   the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By
   default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to
   false.


   A single Query operation will read up to the maximum number of items set (if using the
   Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
   FilterExpression. If LastEvaluatedKey is present in the response, you will need to
   paginate the result set. For more information, see Paginating
   the Results in the Amazon DynamoDB Developer Guide.


   FilterExpression is applied after a Query finishes, but before the results are
   returned. A FilterExpression cannot contain partition key or sort key attributes. You need to
   specify those attributes in the KeyConditionExpression.



   A Query operation can return an empty result set and a LastEvaluatedKey if all the
   items read for the page of results are filtered out.



   You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local
   secondary index, you can set the ConsistentRead parameter to true and obtain a strongly
   consistent result. Global secondary indexes support eventually consistent reads only, so do not specify
   ConsistentRead when querying a global secondary index.

  query-request - Represents the input of a Query operation. - `com.amazonaws.services.dynamodbv2.model.QueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Query operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.QueryResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.QueryRequest query-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.queryAsync query-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.QueryRequest query-request]
    (-> this (.queryAsync query-request))))

(defn create-global-table-async
  "Creates a global table from an existing table. A global table creates a replication relationship between two or
   more DynamoDB tables with the same table name in the provided Regions.


   If you want to add a new replica table to a global table, each of the following conditions must be true:




   The table must have the same primary key as all of the other replicas.




   The table must have the same name as all of the other replicas.




   The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the
   item.




   None of the replica tables in the global table can contain any data.




   If global secondary indexes are specified, then the following conditions must also be met:




   The global secondary indexes must have the same name.




   The global secondary indexes must have the same hash key and sort key (if present).





   Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB
   strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables
   replicas and indexes.


   If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity
   units to your replica tables. You should also provision equal replicated write capacity units to matching
   secondary indexes across your global table.

  create-global-table-request - `com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGlobalTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest create-global-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGlobalTableAsync create-global-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest create-global-table-request]
    (-> this (.createGlobalTableAsync create-global-table-request))))

(defn describe-continuous-backups-async
  "Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are
   ENABLED on all tables at table creation. If point in time recovery is enabled,
   PointInTimeRecoveryStatus will be set to ENABLED.


   After continuous backups and point in time recovery are enabled, you can restore to any point in time within
   EarliestRestorableDateTime and LatestRestorableDateTime.


   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table
   to any point in time during the last 35 days.


   You can call DescribeContinuousBackups at a maximum rate of 10 times per second.

  describe-continuous-backups-request - `com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeContinuousBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest describe-continuous-backups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeContinuousBackupsAsync describe-continuous-backups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest describe-continuous-backups-request]
    (-> this (.describeContinuousBackupsAsync describe-continuous-backups-request))))

(defn create-backup-async
  "Creates a backup for an existing table.


   Each time you create an on-demand backup, the entire table data is backed up. There is no limit to the number of
   on-demand backups that can be taken.


   When you create an on-demand backup, a time marker of the request is cataloged, and the backup is created
   asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup
   requests are processed instantaneously and become available for restore within minutes.


   You can call CreateBackup at a maximum rate of 50 times per second.


   All backups in DynamoDB work without consuming any provisioned throughput on the table.


   If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed
   to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup might contain data
   modifications made between 14:24:00 and 14:26:00. On-demand backup does not support causal consistency.


   Along with data, the following are also included on the backups:




   Global secondary indexes (GSIs)




   Local secondary indexes (LSIs)




   Streams




   Provisioned read and write capacity

  create-backup-request - `com.amazonaws.services.dynamodbv2.model.CreateBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.CreateBackupResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.CreateBackupRequest create-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupAsync create-backup-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.CreateBackupRequest create-backup-request]
    (-> this (.createBackupAsync create-backup-request))))

(defn create-table-async
  "Simplified method form for invoking the CreateTable operation with an AsyncHandler.

  attribute-definitions - `java.util.List`
  table-name - `java.lang.String`
  key-schema - `java.util.List`
  provisioned-throughput - `com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.CreateTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.util.List attribute-definitions ^java.lang.String table-name ^java.util.List key-schema ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTableAsync attribute-definitions table-name key-schema provisioned-throughput async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.util.List attribute-definitions ^java.lang.String table-name ^java.util.List key-schema ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput]
    (-> this (.createTableAsync attribute-definitions table-name key-schema provisioned-throughput)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.CreateTableRequest create-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTableAsync create-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.CreateTableRequest create-table-request]
    (-> this (.createTableAsync create-table-request))))

(defn update-table-async
  "Simplified method form for invoking the UpdateTable operation with an AsyncHandler.

  table-name - `java.lang.String`
  provisioned-throughput - `com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.UpdateTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String table-name ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTableAsync table-name provisioned-throughput async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateTableRequest update-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTableAsync update-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.UpdateTableRequest update-table-request]
    (-> this (.updateTableAsync update-table-request))))

(defn restore-table-from-backup-async
  "Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any
   type of restore) in a given account.


   You can call RestoreTableFromBackup at a maximum rate of 10 times per second.


   You must manually set up the following on the restored table:




   Auto scaling policies




   IAM policies




   Amazon CloudWatch metrics and alarms




   Tags




   Stream settings




   Time to Live (TTL) settings

  restore-table-from-backup-request - `com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreTableFromBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest restore-table-from-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreTableFromBackupAsync restore-table-from-backup-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest restore-table-from-backup-request]
    (-> this (.restoreTableFromBackupAsync restore-table-from-backup-request))))

(defn restore-table-to-point-in-time-async
  "Restores the specified table to the specified point in time within EarliestRestorableDateTime and
   LatestRestorableDateTime. You can restore your table to any point in time during the last 35 days.
   Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.


   When you restore using point in time recovery, DynamoDB restores your table data to the state based on the
   selected date and time (day:hour:minute:second) to a new table.


   Along with data, the following are also included on the new restored table using point in time recovery:




   Global secondary indexes (GSIs)




   Local secondary indexes (LSIs)




   Provisioned read and write capacity




   Encryption settings



   All these settings come from the current settings of the source table at the time of restore.




   You must manually set up the following on the restored table:




   Auto scaling policies




   IAM policies




   Amazon CloudWatch metrics and alarms




   Tags




   Stream settings




   Time to Live (TTL) settings




   Point in time recovery settings

  restore-table-to-point-in-time-request - `com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreTableToPointInTime operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest restore-table-to-point-in-time-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreTableToPointInTimeAsync restore-table-to-point-in-time-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest restore-table-to-point-in-time-request]
    (-> this (.restoreTableToPointInTimeAsync restore-table-to-point-in-time-request))))

(defn list-tags-of-resource-async
  "List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per
   account.


   For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
   the Amazon DynamoDB Developer Guide.

  list-tags-of-resource-request - `com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsOfResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest list-tags-of-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsOfResourceAsync list-tags-of-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest list-tags-of-resource-request]
    (-> this (.listTagsOfResourceAsync list-tags-of-resource-request))))

(defn transact-write-items-async
  "TransactWriteItems is a synchronous write operation that groups up to 25 action requests. These
   actions can target items in different tables, but not in different AWS accounts or Regions, and no two actions
   can target the same item. For example, you cannot both ConditionCheck and Update the
   same item. The aggregate size of the items in the transaction cannot exceed 4 MB.



   All AWS Regions and AWS GovCloud (US) support up to 25 items per transaction with up to 4 MB of data, except the
   following AWS Regions:




   China (Beijing)




   China (Ningxia)




   The China (Beijing) and China (Ningxia) Regions support up to 10 items per transaction with up to 4 MB of data.



   The actions are completed atomically so that either all of them succeed, or all of them fail. They are defined by
   the following objects:




   Put     Initiates a PutItem operation to write a new item. This structure
   specifies the primary key of the item to be written, the name of the table to write it in, an optional condition
   expression that must be satisfied for the write to succeed, a list of the item's attributes, and a field
   indicating whether to retrieve the item's attributes if the condition is not met.




   Update     Initiates an UpdateItem operation to update an existing item. This
   structure specifies the primary key of the item to be updated, the name of the table where it resides, an
   optional condition expression that must be satisfied for the update to succeed, an expression that defines one or
   more attributes to be updated, and a field indicating whether to retrieve the item's attributes if the condition
   is not met.




   Delete     Initiates a DeleteItem operation to delete an existing item. This
   structure specifies the primary key of the item to be deleted, the name of the table where it resides, an
   optional condition expression that must be satisfied for the deletion to succeed, and a field indicating whether
   to retrieve the item's attributes if the condition is not met.




   ConditionCheck     Applies a condition to an item that is not being modified by the
   transaction. This structure specifies the primary key of the item to be checked, the name of the table where it
   resides, a condition expression that must be satisfied for the transaction to succeed, and a field indicating
   whether to retrieve the item's attributes if the condition is not met.




   DynamoDB rejects the entire TransactWriteItems request if any of the following is true:




   A condition in one of the condition expressions is not met.




   An ongoing operation is in the process of updating the same item.




   There is insufficient provisioned capacity for the transaction to be completed.




   An item size becomes too large (bigger than 400 KB), a local secondary index (LSI) becomes too large, or a
   similar validation error occurs because of changes made by the transaction.




   The aggregate size of the items in the transaction exceeds 4 MB.




   There is a user error, such as an invalid data format.

  transact-write-items-request - `com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TransactWriteItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.TransactWriteItemsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest transact-write-items-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.transactWriteItemsAsync transact-write-items-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest transact-write-items-request]
    (-> this (.transactWriteItemsAsync transact-write-items-request))))

(defn describe-table-async
  "Returns information about the table, including the current status of the table, when it was created, the primary
   key schema, and any indexes on the table.



   If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB
   might return a ResourceNotFoundException. This is because DescribeTable uses an
   eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a
   few seconds, and then try the DescribeTable request again.

  describe-table-request - Represents the input of a DescribeTable operation. - `com.amazonaws.services.dynamodbv2.model.DescribeTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeTableResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeTableRequest describe-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTableAsync describe-table-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeTableRequest describe-table-request]
    (-> this (.describeTableAsync describe-table-request))))

(defn list-backups-async
  "List backups associated with an AWS account. To list backups for a given table, specify TableName.
   ListBackups returns a paginated list of results with at most 1 MB worth of items in a page. You can
   also specify a limit for the maximum number of entries to be returned in a page.


   In the request, start time is inclusive, but end time is exclusive. Note that these limits are for the time at
   which the original backup was requested.


   You can call ListBackups a maximum of five times per second.

  list-backups-request - `com.amazonaws.services.dynamodbv2.model.ListBackupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListBackupsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ListBackupsRequest list-backups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBackupsAsync list-backups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ListBackupsRequest list-backups-request]
    (-> this (.listBackupsAsync list-backups-request))))

(defn transact-get-items-async
  "TransactGetItems is a synchronous operation that atomically retrieves multiple items from one or
   more tables (but not from indexes) in a single account and Region. A TransactGetItems call can
   contain up to 25 TransactGetItem objects, each of which contains a Get structure that
   specifies an item to retrieve from a table in the account and Region. A call to TransactGetItems
   cannot retrieve items from tables in more than one AWS account or Region. The aggregate size of the items in the
   transaction cannot exceed 4 MB.



   All AWS Regions and AWS GovCloud (US) support up to 25 items per transaction with up to 4 MB of data, except the
   following AWS Regions:




   China (Beijing)




   China (Ningxia)




   The China (Beijing) and China (Ningxia) Regions support up to 10 items per transaction with up to 4 MB of data.



   DynamoDB rejects the entire TransactGetItems request if any of the following is true:




   A conflicting operation is in the process of updating an item to be read.




   There is insufficient provisioned capacity for the transaction to be completed.




   There is a user error, such as an invalid data format.




   The aggregate size of the items in the transaction cannot exceed 4 MB.

  transact-get-items-request - `com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TransactGetItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.TransactGetItemsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest transact-get-items-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.transactGetItemsAsync transact-get-items-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest transact-get-items-request]
    (-> this (.transactGetItemsAsync transact-get-items-request))))

(defn delete-backup-async
  "Deletes an existing backup of a table.


   You can call DeleteBackup at a maximum rate of 10 times per second.

  delete-backup-request - `com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DeleteBackupResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest delete-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupAsync delete-backup-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest delete-backup-request]
    (-> this (.deleteBackupAsync delete-backup-request))))

(defn describe-limits-async
  "Returns the current provisioned-capacity limits for your AWS account in a Region, both for the Region as a whole
   and for any one DynamoDB table that you create there.


   When you establish an AWS account, the account has initial limits on the maximum read capacity units and write
   capacity units that you can provision across all of your DynamoDB tables in a given Region. Also, there are
   per-table limits that apply when you create a table there. For more information, see Limits page in the
   Amazon DynamoDB Developer Guide.


   Although you can increase these limits by filing a case at AWS Support Center, obtaining the increase is not
   instantaneous. The DescribeLimits action lets you write code to compare the capacity you are
   currently using to those limits imposed by your account so that you have enough time to apply for an increase
   before you hit a limit.


   For example, you could use one of the AWS SDKs to do the following:




   Call DescribeLimits for a particular Region to obtain your current account limits on provisioned
   capacity there.




   Create a variable to hold the aggregate read capacity units provisioned for all your tables in that Region, and
   one to hold the aggregate write capacity units. Zero them both.




   Call ListTables to obtain a list of all your DynamoDB tables.




   For each table name listed by ListTables, do the following:




   Call DescribeTable with the table name.




   Use the data returned by DescribeTable to add the read capacity units and write capacity units
   provisioned for the table itself to your variables.




   If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned
   capacity values to your variables as well.






   Report the account limits for that Region returned by DescribeLimits, along with the total current
   provisioned capacity levels you have calculated.




   This will let you see whether you are getting close to your account-level limits.


   The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned
   capacity of the new table itself and all its global secondary indexes.


   For existing tables and their GSIs, DynamoDB doesn't let you increase provisioned capacity extremely rapidly. But
   the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs cannot
   exceed either of the per-account limits.



   DescribeLimits should only be called periodically. You can expect throttling errors if you call it
   more than once in a minute.



   The DescribeLimits Request element has no content.

  describe-limits-request - Represents the input of a DescribeLimits operation. Has no content. - `com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest describe-limits-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLimitsAsync describe-limits-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest describe-limits-request]
    (-> this (.describeLimitsAsync describe-limits-request))))

(defn describe-backup-async
  "Describes an existing backup of a table.


   You can call DescribeBackup at a maximum rate of 10 times per second.

  describe-backup-request - `com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.DescribeBackupResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest describe-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupAsync describe-backup-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest describe-backup-request]
    (-> this (.describeBackupAsync describe-backup-request))))

(defn list-tables-async
  "Simplified method form for invoking the ListTables operation with an AsyncHandler.

  exclusive-start-table-name - `java.lang.String`
  limit - `java.lang.Integer`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.ListTablesResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^java.lang.String exclusive-start-table-name ^java.lang.Integer limit ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTablesAsync exclusive-start-table-name limit async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ListTablesRequest list-tables-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTablesAsync list-tables-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.ListTablesRequest list-tables-request]
    (-> this (.listTablesAsync list-tables-request)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this]
    (-> this (.listTablesAsync))))

(defn tag-resource-async
  "Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that
   they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up
   to five times per second, per account.


   For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
   the Amazon DynamoDB Developer Guide.

  tag-resource-request - `com.amazonaws.services.dynamodbv2.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.dynamodbv2.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonDynamoDBAsync this ^com.amazonaws.services.dynamodbv2.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

