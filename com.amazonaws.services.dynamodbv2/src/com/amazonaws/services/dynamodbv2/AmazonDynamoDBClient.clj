(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
  "Client for accessing DynamoDB. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBClient]))

(defn ->amazon-dynamo-db-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to DynamoDB (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonDynamoDBClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonDynamoDBClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonDynamoDBClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonDynamoDBClient aws-credentials client-configuration))
  (^AmazonDynamoDBClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonDynamoDBClient client-configuration))
  (^AmazonDynamoDBClient []
    (new AmazonDynamoDBClient )))

(defn *builder
  "returns: `com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder []
    (AmazonDynamoDBClient/builder )))

(defn delete-item
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  key - `java.util.Map`
  return-values - `java.lang.String`

  returns: `com.amazonaws.services.dynamodbv2.model.DeleteItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.DeleteItemResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.Map key ^java.lang.String return-values]
    (-> this (.deleteItem table-name key return-values)))
  (^com.amazonaws.services.dynamodbv2.model.DeleteItemResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.Map key]
    (-> this (.deleteItem table-name key)))
  (^com.amazonaws.services.dynamodbv2.model.DeleteItemResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DeleteItemRequest request]
    (-> this (.deleteItem request))))

(defn update-table
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  provisioned-throughput - `com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput`

  returns: `com.amazonaws.services.dynamodbv2.model.UpdateTableResult`"
  (^com.amazonaws.services.dynamodbv2.model.UpdateTableResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput]
    (-> this (.updateTable table-name provisioned-throughput)))
  (^com.amazonaws.services.dynamodbv2.model.UpdateTableResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.UpdateTableRequest request]
    (-> this (.updateTable request))))

(defn get-item
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  key - `java.util.Map`
  consistent-read - `java.lang.Boolean`

  returns: `com.amazonaws.services.dynamodbv2.model.GetItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.GetItemResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.Map key ^java.lang.Boolean consistent-read]
    (-> this (.getItem table-name key consistent-read)))
  (^com.amazonaws.services.dynamodbv2.model.GetItemResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.Map key]
    (-> this (.getItem table-name key)))
  (^com.amazonaws.services.dynamodbv2.model.GetItemResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.GetItemRequest request]
    (-> this (.getItem request))))

(defn waiters
  "returns: `com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters`"
  (^com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters [^AmazonDynamoDBClient this]
    (-> this (.waiters))))

(defn describe-global-table-settings
  "Describes Region-specific settings for a global table.

  request - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest`

  returns: Result of the DescribeGlobalTableSettings operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsResult`

  throws: com.amazonaws.services.dynamodbv2.model.GlobalTableNotFoundException - The specified global table does not exist."
  (^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest request]
    (-> this (.describeGlobalTableSettings request))))

(defn update-item
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  key - `java.util.Map`
  attribute-updates - `java.util.Map`
  return-values - `java.lang.String`

  returns: `com.amazonaws.services.dynamodbv2.model.UpdateItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.UpdateItemResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates ^java.lang.String return-values]
    (-> this (.updateItem table-name key attribute-updates return-values)))
  (^com.amazonaws.services.dynamodbv2.model.UpdateItemResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates]
    (-> this (.updateItem table-name key attribute-updates)))
  (^com.amazonaws.services.dynamodbv2.model.UpdateItemResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.UpdateItemRequest request]
    (-> this (.updateItem request))))

(defn describe-time-to-live
  "Gives a description of the Time to Live (TTL) status on the specified table.

  request - `com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest`

  returns: Result of the DescribeTimeToLive operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent table or index. The resource might not be specified correctly, or its status might not be ACTIVE."
  (^com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest request]
    (-> this (.describeTimeToLive request))))

(defn list-tags-of-resource
  "List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per
   account.


   For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
   the Amazon DynamoDB Developer Guide.

  request - `com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest`

  returns: Result of the ListTagsOfResource operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent table or index. The resource might not be specified correctly, or its status might not be ACTIVE."
  (^com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest request]
    (-> this (.listTagsOfResource request))))

(defn untag-resource
  "Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to
   five times per second, per account.


   For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
   the Amazon DynamoDB Developer Guide.

  request - `com.amazonaws.services.dynamodbv2.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UntagResourceResult`

  throws: com.amazonaws.services.dynamodbv2.model.LimitExceededException - There is no limit to the number of daily on-demand backups that can be taken. Up to 50 simultaneous table operations are allowed per account. These operations include CreateTable, UpdateTable, DeleteTable, UpdateTimeToLive, RestoreTableFromBackup, and RestoreTableToPointInTime. The only exception is when you are creating a table with one or more secondary indexes. You can have up to 25 such requests running at a time; however, if the table or index specifications are complex, DynamoDB might temporarily reduce the number of concurrent operations. There is a soft account limit of 256 tables."
  (^com.amazonaws.services.dynamodbv2.model.UntagResourceResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn describe-limits
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

  request - `com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest`

  returns: Result of the DescribeLimits operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult`

  throws: com.amazonaws.services.dynamodbv2.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest request]
    (-> this (.describeLimits request))))

(defn query
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

  request - `com.amazonaws.services.dynamodbv2.model.QueryRequest`

  returns: Result of the Query operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.QueryResult`

  throws: com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputExceededException - Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of requests and use exponential backoff. For more information, go to Error Retries and Exponential Backoff in the Amazon DynamoDB Developer Guide."
  (^com.amazonaws.services.dynamodbv2.model.QueryResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.QueryRequest request]
    (-> this (.query request))))

(defn transact-get-items
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

  request - `com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest`

  returns: Result of the TransactGetItems operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.TransactGetItemsResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent table or index. The resource might not be specified correctly, or its status might not be ACTIVE."
  (^com.amazonaws.services.dynamodbv2.model.TransactGetItemsResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest request]
    (-> this (.transactGetItems request))))

(defn create-global-table
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

  request - `com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest`

  returns: Result of the CreateGlobalTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult`

  throws: com.amazonaws.services.dynamodbv2.model.LimitExceededException - There is no limit to the number of daily on-demand backups that can be taken. Up to 50 simultaneous table operations are allowed per account. These operations include CreateTable, UpdateTable, DeleteTable, UpdateTimeToLive, RestoreTableFromBackup, and RestoreTableToPointInTime. The only exception is when you are creating a table with one or more secondary indexes. You can have up to 25 such requests running at a time; however, if the table or index specifications are complex, DynamoDB might temporarily reduce the number of concurrent operations. There is a soft account limit of 256 tables."
  (^com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest request]
    (-> this (.createGlobalTable request))))

(defn update-time-to-live
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

  request - `com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest`

  returns: Result of the UpdateTimeToLive operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceInUseException - The operation conflicts with the resource's availability. For example, you attempted to recreate an existing table, or tried to delete a table currently in the CREATING state."
  (^com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest request]
    (-> this (.updateTimeToLive request))))

(defn batch-get-item
  "Description copied from interface: AmazonDynamoDB

  request-items - `java.util.Map`
  return-consumed-capacity - `java.lang.String`

  returns: `com.amazonaws.services.dynamodbv2.model.BatchGetItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.BatchGetItemResult [^AmazonDynamoDBClient this ^java.util.Map request-items ^java.lang.String return-consumed-capacity]
    (-> this (.batchGetItem request-items return-consumed-capacity)))
  (^com.amazonaws.services.dynamodbv2.model.BatchGetItemResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest request]
    (-> this (.batchGetItem request))))

(defn list-tables
  "Description copied from interface: AmazonDynamoDB

  exclusive-start-table-name - `java.lang.String`
  limit - `java.lang.Integer`

  returns: `com.amazonaws.services.dynamodbv2.model.ListTablesResult`"
  (^com.amazonaws.services.dynamodbv2.model.ListTablesResult [^AmazonDynamoDBClient this ^java.lang.String exclusive-start-table-name ^java.lang.Integer limit]
    (-> this (.listTables exclusive-start-table-name limit)))
  (^com.amazonaws.services.dynamodbv2.model.ListTablesResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.ListTablesRequest request]
    (-> this (.listTables request)))
  (^com.amazonaws.services.dynamodbv2.model.ListTablesResult [^AmazonDynamoDBClient this]
    (-> this (.listTables))))

(defn delete-table
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

  request - `com.amazonaws.services.dynamodbv2.model.DeleteTableRequest`

  returns: Result of the DeleteTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DeleteTableResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceInUseException - The operation conflicts with the resource's availability. For example, you attempted to recreate an existing table, or tried to delete a table currently in the CREATING state."
  (^com.amazonaws.services.dynamodbv2.model.DeleteTableResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DeleteTableRequest request]
    (-> this (.deleteTable request))))

(defn scan
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  attributes-to-get - `java.util.List`
  scan-filter - `java.util.Map`

  returns: `com.amazonaws.services.dynamodbv2.model.ScanResult`"
  (^com.amazonaws.services.dynamodbv2.model.ScanResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.List attributes-to-get ^java.util.Map scan-filter]
    (-> this (.scan table-name attributes-to-get scan-filter)))
  (^com.amazonaws.services.dynamodbv2.model.ScanResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.List attributes-to-get]
    (-> this (.scan table-name attributes-to-get)))
  (^com.amazonaws.services.dynamodbv2.model.ScanResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.ScanRequest request]
    (-> this (.scan request))))

(defn delete-backup
  "Deletes an existing backup of a table.


   You can call DeleteBackup at a maximum rate of 10 times per second.

  request - `com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest`

  returns: Result of the DeleteBackup operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DeleteBackupResult`

  throws: com.amazonaws.services.dynamodbv2.model.BackupNotFoundException - Backup not found for the given BackupARN."
  (^com.amazonaws.services.dynamodbv2.model.DeleteBackupResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest request]
    (-> this (.deleteBackup request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonDynamoDBClient this]
    (-> this (.shutdown))))

(defn update-continuous-backups
  "UpdateContinuousBackups enables or disables point in time recovery for the specified table. A
   successful UpdateContinuousBackups call returns the current
   ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table
   creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.


   Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
   EarliestRestorableDateTime and LatestRestorableDateTime.


   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table
   to any point in time during the last 35 days.

  request - `com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest`

  returns: Result of the UpdateContinuousBackups operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult`

  throws: com.amazonaws.services.dynamodbv2.model.TableNotFoundException - A source table with the name TableName does not currently exist within the subscriber's account."
  (^com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest request]
    (-> this (.updateContinuousBackups request))))

(defn batch-write-item
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

  request - `com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest`

  returns: Result of the BatchWriteItem operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult`

  throws: com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputExceededException - Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of requests and use exponential backoff. For more information, go to Error Retries and Exponential Backoff in the Amazon DynamoDB Developer Guide."
  (^com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest request]
    (-> this (.batchWriteItem request))))

(defn put-item
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  item - `java.util.Map`
  return-values - `java.lang.String`

  returns: `com.amazonaws.services.dynamodbv2.model.PutItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.PutItemResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.Map item ^java.lang.String return-values]
    (-> this (.putItem table-name item return-values)))
  (^com.amazonaws.services.dynamodbv2.model.PutItemResult [^AmazonDynamoDBClient this ^java.lang.String table-name ^java.util.Map item]
    (-> this (.putItem table-name item)))
  (^com.amazonaws.services.dynamodbv2.model.PutItemResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.PutItemRequest request]
    (-> this (.putItem request))))

(defn describe-continuous-backups
  "Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are
   ENABLED on all tables at table creation. If point in time recovery is enabled,
   PointInTimeRecoveryStatus will be set to ENABLED.


   After continuous backups and point in time recovery are enabled, you can restore to any point in time within
   EarliestRestorableDateTime and LatestRestorableDateTime.


   LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table
   to any point in time during the last 35 days.


   You can call DescribeContinuousBackups at a maximum rate of 10 times per second.

  request - `com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest`

  returns: Result of the DescribeContinuousBackups operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult`

  throws: com.amazonaws.services.dynamodbv2.model.TableNotFoundException - A source table with the name TableName does not currently exist within the subscriber's account."
  (^com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest request]
    (-> this (.describeContinuousBackups request))))

(defn update-global-table
  "Adds or removes replicas in the specified global table. The global table must already exist to be able to use
   this operation. Any replica to be added must be empty, have the same name as the global table, have the same key
   schema, have DynamoDB Streams enabled, and have the same provisioned and maximum write capacity units.



   Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for
   simplicity we recommend that you issue separate requests for adding or removing replicas.



   If global secondary indexes are specified, then the following conditions must also be met:




   The global secondary indexes must have the same name.




   The global secondary indexes must have the same hash key and sort key (if present).




   The global secondary indexes must have the same provisioned and maximum write capacity units.

  request - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest`

  returns: Result of the UpdateGlobalTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult`

  throws: com.amazonaws.services.dynamodbv2.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest request]
    (-> this (.updateGlobalTable request))))

(defn create-table
  "Description copied from interface: AmazonDynamoDB

  attribute-definitions - `java.util.List`
  table-name - `java.lang.String`
  key-schema - `java.util.List`
  provisioned-throughput - `com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput`

  returns: `com.amazonaws.services.dynamodbv2.model.CreateTableResult`"
  (^com.amazonaws.services.dynamodbv2.model.CreateTableResult [^AmazonDynamoDBClient this ^java.util.List attribute-definitions ^java.lang.String table-name ^java.util.List key-schema ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput]
    (-> this (.createTable attribute-definitions table-name key-schema provisioned-throughput)))
  (^com.amazonaws.services.dynamodbv2.model.CreateTableResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.CreateTableRequest request]
    (-> this (.createTable request))))

(defn describe-table
  "Returns information about the table, including the current status of the table, when it was created, the primary
   key schema, and any indexes on the table.



   If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB
   might return a ResourceNotFoundException. This is because DescribeTable uses an
   eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a
   few seconds, and then try the DescribeTable request again.

  request - `com.amazonaws.services.dynamodbv2.model.DescribeTableRequest`

  returns: Result of the DescribeTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeTableResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent table or index. The resource might not be specified correctly, or its status might not be ACTIVE."
  (^com.amazonaws.services.dynamodbv2.model.DescribeTableResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DescribeTableRequest request]
    (-> this (.describeTable request))))

(defn describe-global-table
  "Returns information about the specified global table.

  request - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest`

  returns: Result of the DescribeGlobalTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult`

  throws: com.amazonaws.services.dynamodbv2.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest request]
    (-> this (.describeGlobalTable request))))

(defn update-global-table-settings
  "Updates settings for a global table.

  request - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest`

  returns: Result of the UpdateGlobalTableSettings operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsResult`

  throws: com.amazonaws.services.dynamodbv2.model.GlobalTableNotFoundException - The specified global table does not exist."
  (^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest request]
    (-> this (.updateGlobalTableSettings request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonDynamoDBClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn restore-table-to-point-in-time
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

  request - `com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest`

  returns: Result of the RestoreTableToPointInTime operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult`

  throws: com.amazonaws.services.dynamodbv2.model.TableAlreadyExistsException - A target table with the specified name already exists."
  (^com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest request]
    (-> this (.restoreTableToPointInTime request))))

(defn describe-backup
  "Describes an existing backup of a table.


   You can call DescribeBackup at a maximum rate of 10 times per second.

  request - `com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest`

  returns: Result of the DescribeBackup operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeBackupResult`

  throws: com.amazonaws.services.dynamodbv2.model.BackupNotFoundException - Backup not found for the given BackupARN."
  (^com.amazonaws.services.dynamodbv2.model.DescribeBackupResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest request]
    (-> this (.describeBackup request))))

(defn list-backups
  "List backups associated with an AWS account. To list backups for a given table, specify TableName.
   ListBackups returns a paginated list of results with at most 1 MB worth of items in a page. You can
   also specify a limit for the maximum number of entries to be returned in a page.


   In the request, start time is inclusive, but end time is exclusive. Note that these limits are for the time at
   which the original backup was requested.


   You can call ListBackups a maximum of five times per second.

  request - `com.amazonaws.services.dynamodbv2.model.ListBackupsRequest`

  returns: Result of the ListBackups operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.ListBackupsResult`

  throws: com.amazonaws.services.dynamodbv2.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.dynamodbv2.model.ListBackupsResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.ListBackupsRequest request]
    (-> this (.listBackups request))))

(defn transact-write-items
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

  request - `com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest`

  returns: Result of the TransactWriteItems operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.TransactWriteItemsResult`

  throws: com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException - The operation tried to access a nonexistent table or index. The resource might not be specified correctly, or its status might not be ACTIVE."
  (^com.amazonaws.services.dynamodbv2.model.TransactWriteItemsResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest request]
    (-> this (.transactWriteItems request))))

(defn describe-endpoints
  "Returns the regional endpoint information.

  request - `com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest`

  returns: Result of the DescribeEndpoints operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeEndpointsResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeEndpointsResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest request]
    (-> this (.describeEndpoints request))))

(defn tag-resource
  "Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that
   they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up
   to five times per second, per account.


   For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
   the Amazon DynamoDB Developer Guide.

  request - `com.amazonaws.services.dynamodbv2.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.TagResourceResult`

  throws: com.amazonaws.services.dynamodbv2.model.LimitExceededException - There is no limit to the number of daily on-demand backups that can be taken. Up to 50 simultaneous table operations are allowed per account. These operations include CreateTable, UpdateTable, DeleteTable, UpdateTimeToLive, RestoreTableFromBackup, and RestoreTableToPointInTime. The only exception is when you are creating a table with one or more secondary indexes. You can have up to 25 such requests running at a time; however, if the table or index specifications are complex, DynamoDB might temporarily reduce the number of concurrent operations. There is a soft account limit of 256 tables."
  (^com.amazonaws.services.dynamodbv2.model.TagResourceResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn restore-table-from-backup
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

  request - `com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest`

  returns: Result of the RestoreTableFromBackup operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult`

  throws: com.amazonaws.services.dynamodbv2.model.TableAlreadyExistsException - A target table with the specified name already exists."
  (^com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest request]
    (-> this (.restoreTableFromBackup request))))

(defn list-global-tables
  "Lists all global tables that have a replica in the specified Region.

  request - `com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest`

  returns: Result of the ListGlobalTables operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult`

  throws: com.amazonaws.services.dynamodbv2.model.InternalServerErrorException - An error occurred on the server side."
  (^com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest request]
    (-> this (.listGlobalTables request))))

(defn create-backup
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

  request - `com.amazonaws.services.dynamodbv2.model.CreateBackupRequest`

  returns: Result of the CreateBackup operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.CreateBackupResult`

  throws: com.amazonaws.services.dynamodbv2.model.TableNotFoundException - A source table with the name TableName does not currently exist within the subscriber's account."
  (^com.amazonaws.services.dynamodbv2.model.CreateBackupResult [^AmazonDynamoDBClient this ^com.amazonaws.services.dynamodbv2.model.CreateBackupRequest request]
    (-> this (.createBackup request))))

