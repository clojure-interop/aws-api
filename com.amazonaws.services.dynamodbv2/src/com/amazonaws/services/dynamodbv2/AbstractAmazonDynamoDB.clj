(ns com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDB
  "Abstract implementation of AmazonDynamoDB. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AbstractAmazonDynamoDB]))

(defn delete-item
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  key - `java.util.Map`
  return-values - `java.lang.String`

  returns: `com.amazonaws.services.dynamodbv2.model.DeleteItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.DeleteItemResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.Map key ^java.lang.String return-values]
    (-> this (.deleteItem table-name key return-values)))
  (^com.amazonaws.services.dynamodbv2.model.DeleteItemResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.Map key]
    (-> this (.deleteItem table-name key)))
  (^com.amazonaws.services.dynamodbv2.model.DeleteItemResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DeleteItemRequest request]
    (-> this (.deleteItem request))))

(defn update-table
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  provisioned-throughput - `com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput`

  returns: `com.amazonaws.services.dynamodbv2.model.UpdateTableResult`"
  (^com.amazonaws.services.dynamodbv2.model.UpdateTableResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput]
    (-> this (.updateTable table-name provisioned-throughput)))
  (^com.amazonaws.services.dynamodbv2.model.UpdateTableResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.UpdateTableRequest request]
    (-> this (.updateTable request))))

(defn set-region
  "Description copied from interface: AmazonDynamoDB

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonDynamoDB this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-item
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  key - `java.util.Map`
  consistent-read - `java.lang.Boolean`

  returns: `com.amazonaws.services.dynamodbv2.model.GetItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.GetItemResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.Map key ^java.lang.Boolean consistent-read]
    (-> this (.getItem table-name key consistent-read)))
  (^com.amazonaws.services.dynamodbv2.model.GetItemResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.Map key]
    (-> this (.getItem table-name key)))
  (^com.amazonaws.services.dynamodbv2.model.GetItemResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.GetItemRequest request]
    (-> this (.getItem request))))

(defn waiters
  "returns: `com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters`"
  (^com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters [^AbstractAmazonDynamoDB this]
    (-> this (.waiters))))

(defn describe-global-table-settings
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest`

  returns: Result of the DescribeGlobalTableSettings operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest request]
    (-> this (.describeGlobalTableSettings request))))

(defn update-item
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  key - `java.util.Map`
  attribute-updates - `java.util.Map`
  return-values - `java.lang.String`

  returns: `com.amazonaws.services.dynamodbv2.model.UpdateItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.UpdateItemResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates ^java.lang.String return-values]
    (-> this (.updateItem table-name key attribute-updates return-values)))
  (^com.amazonaws.services.dynamodbv2.model.UpdateItemResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.Map key ^java.util.Map attribute-updates]
    (-> this (.updateItem table-name key attribute-updates)))
  (^com.amazonaws.services.dynamodbv2.model.UpdateItemResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.UpdateItemRequest request]
    (-> this (.updateItem request))))

(defn describe-time-to-live
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest`

  returns: Result of the DescribeTimeToLive operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest request]
    (-> this (.describeTimeToLive request))))

(defn list-tags-of-resource
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest`

  returns: Result of the ListTagsOfResource operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult`"
  (^com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest request]
    (-> this (.listTagsOfResource request))))

(defn untag-resource
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UntagResourceResult`"
  (^com.amazonaws.services.dynamodbv2.model.UntagResourceResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn describe-limits
  "Description copied from interface: AmazonDynamoDB

  request - Represents the input of a DescribeLimits operation. Has no content. - `com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest`

  returns: Result of the DescribeLimits operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeLimitsResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DescribeLimitsRequest request]
    (-> this (.describeLimits request))))

(defn query
  "Description copied from interface: AmazonDynamoDB

  request - Represents the input of a Query operation. - `com.amazonaws.services.dynamodbv2.model.QueryRequest`

  returns: Result of the Query operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.QueryResult`"
  (^com.amazonaws.services.dynamodbv2.model.QueryResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.QueryRequest request]
    (-> this (.query request))))

(defn transact-get-items
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest`

  returns: Result of the TransactGetItems operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.TransactGetItemsResult`"
  (^com.amazonaws.services.dynamodbv2.model.TransactGetItemsResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest request]
    (-> this (.transactGetItems request))))

(defn create-global-table
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest`

  returns: Result of the CreateGlobalTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult`"
  (^com.amazonaws.services.dynamodbv2.model.CreateGlobalTableResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest request]
    (-> this (.createGlobalTable request))))

(defn update-time-to-live
  "Description copied from interface: AmazonDynamoDB

  request - Represents the input of an UpdateTimeToLive operation. - `com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest`

  returns: Result of the UpdateTimeToLive operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult`"
  (^com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest request]
    (-> this (.updateTimeToLive request))))

(defn batch-get-item
  "Description copied from interface: AmazonDynamoDB

  request-items - `java.util.Map`
  return-consumed-capacity - `java.lang.String`

  returns: `com.amazonaws.services.dynamodbv2.model.BatchGetItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.BatchGetItemResult [^AbstractAmazonDynamoDB this ^java.util.Map request-items ^java.lang.String return-consumed-capacity]
    (-> this (.batchGetItem request-items return-consumed-capacity)))
  (^com.amazonaws.services.dynamodbv2.model.BatchGetItemResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest request]
    (-> this (.batchGetItem request))))

(defn list-tables
  "Description copied from interface: AmazonDynamoDB

  exclusive-start-table-name - `java.lang.String`
  limit - `java.lang.Integer`

  returns: `com.amazonaws.services.dynamodbv2.model.ListTablesResult`"
  (^com.amazonaws.services.dynamodbv2.model.ListTablesResult [^AbstractAmazonDynamoDB this ^java.lang.String exclusive-start-table-name ^java.lang.Integer limit]
    (-> this (.listTables exclusive-start-table-name limit)))
  (^com.amazonaws.services.dynamodbv2.model.ListTablesResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.ListTablesRequest request]
    (-> this (.listTables request)))
  (^com.amazonaws.services.dynamodbv2.model.ListTablesResult [^AbstractAmazonDynamoDB this]
    (-> this (.listTables))))

(defn delete-table
  "Description copied from interface: AmazonDynamoDB

  request - Represents the input of a DeleteTable operation. - `com.amazonaws.services.dynamodbv2.model.DeleteTableRequest`

  returns: Result of the DeleteTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DeleteTableResult`"
  (^com.amazonaws.services.dynamodbv2.model.DeleteTableResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DeleteTableRequest request]
    (-> this (.deleteTable request))))

(defn scan
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  attributes-to-get - `java.util.List`
  scan-filter - `java.util.Map`

  returns: `com.amazonaws.services.dynamodbv2.model.ScanResult`"
  (^com.amazonaws.services.dynamodbv2.model.ScanResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.List attributes-to-get ^java.util.Map scan-filter]
    (-> this (.scan table-name attributes-to-get scan-filter)))
  (^com.amazonaws.services.dynamodbv2.model.ScanResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.List attributes-to-get]
    (-> this (.scan table-name attributes-to-get)))
  (^com.amazonaws.services.dynamodbv2.model.ScanResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.ScanRequest request]
    (-> this (.scan request))))

(defn delete-backup
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest`

  returns: Result of the DeleteBackup operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DeleteBackupResult`"
  (^com.amazonaws.services.dynamodbv2.model.DeleteBackupResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest request]
    (-> this (.deleteBackup request))))

(defn shutdown
  "Description copied from interface: AmazonDynamoDB"
  ([^AbstractAmazonDynamoDB this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AmazonDynamoDB

  endpoint - The endpoint (ex: \"dynamodb.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://dynamodb.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonDynamoDB this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-continuous-backups
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest`

  returns: Result of the UpdateContinuousBackups operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult`"
  (^com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest request]
    (-> this (.updateContinuousBackups request))))

(defn batch-write-item
  "Description copied from interface: AmazonDynamoDB

  request - Represents the input of a BatchWriteItem operation. - `com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest`

  returns: Result of the BatchWriteItem operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest request]
    (-> this (.batchWriteItem request))))

(defn put-item
  "Description copied from interface: AmazonDynamoDB

  table-name - `java.lang.String`
  item - `java.util.Map`
  return-values - `java.lang.String`

  returns: `com.amazonaws.services.dynamodbv2.model.PutItemResult`"
  (^com.amazonaws.services.dynamodbv2.model.PutItemResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.Map item ^java.lang.String return-values]
    (-> this (.putItem table-name item return-values)))
  (^com.amazonaws.services.dynamodbv2.model.PutItemResult [^AbstractAmazonDynamoDB this ^java.lang.String table-name ^java.util.Map item]
    (-> this (.putItem table-name item)))
  (^com.amazonaws.services.dynamodbv2.model.PutItemResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.PutItemRequest request]
    (-> this (.putItem request))))

(defn describe-continuous-backups
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest`

  returns: Result of the DescribeContinuousBackups operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest request]
    (-> this (.describeContinuousBackups request))))

(defn update-global-table
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest`

  returns: Result of the UpdateGlobalTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult`"
  (^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest request]
    (-> this (.updateGlobalTable request))))

(defn create-table
  "Description copied from interface: AmazonDynamoDB

  attribute-definitions - `java.util.List`
  table-name - `java.lang.String`
  key-schema - `java.util.List`
  provisioned-throughput - `com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput`

  returns: `com.amazonaws.services.dynamodbv2.model.CreateTableResult`"
  (^com.amazonaws.services.dynamodbv2.model.CreateTableResult [^AbstractAmazonDynamoDB this ^java.util.List attribute-definitions ^java.lang.String table-name ^java.util.List key-schema ^com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput provisioned-throughput]
    (-> this (.createTable attribute-definitions table-name key-schema provisioned-throughput)))
  (^com.amazonaws.services.dynamodbv2.model.CreateTableResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.CreateTableRequest request]
    (-> this (.createTable request))))

(defn describe-table
  "Description copied from interface: AmazonDynamoDB

  request - Represents the input of a DescribeTable operation. - `com.amazonaws.services.dynamodbv2.model.DescribeTableRequest`

  returns: Result of the DescribeTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeTableResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeTableResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DescribeTableRequest request]
    (-> this (.describeTable request))))

(defn describe-global-table
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest`

  returns: Result of the DescribeGlobalTable operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest request]
    (-> this (.describeGlobalTable request))))

(defn update-global-table-settings
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest`

  returns: Result of the UpdateGlobalTableSettings operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsResult`"
  (^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest request]
    (-> this (.updateGlobalTableSettings request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonDynamoDB

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonDynamoDB this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn restore-table-to-point-in-time
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest`

  returns: Result of the RestoreTableToPointInTime operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult`"
  (^com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest request]
    (-> this (.restoreTableToPointInTime request))))

(defn describe-backup
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest`

  returns: Result of the DescribeBackup operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeBackupResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeBackupResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest request]
    (-> this (.describeBackup request))))

(defn list-backups
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.ListBackupsRequest`

  returns: Result of the ListBackups operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.ListBackupsResult`"
  (^com.amazonaws.services.dynamodbv2.model.ListBackupsResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.ListBackupsRequest request]
    (-> this (.listBackups request))))

(defn transact-write-items
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest`

  returns: Result of the TransactWriteItems operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.TransactWriteItemsResult`"
  (^com.amazonaws.services.dynamodbv2.model.TransactWriteItemsResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest request]
    (-> this (.transactWriteItems request))))

(defn describe-endpoints
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest`

  returns: Result of the DescribeEndpoints operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeEndpointsResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeEndpointsResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest request]
    (-> this (.describeEndpoints request))))

(defn tag-resource
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.TagResourceResult`"
  (^com.amazonaws.services.dynamodbv2.model.TagResourceResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn restore-table-from-backup
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest`

  returns: Result of the RestoreTableFromBackup operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult`"
  (^com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest request]
    (-> this (.restoreTableFromBackup request))))

(defn list-global-tables
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest`

  returns: Result of the ListGlobalTables operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult`"
  (^com.amazonaws.services.dynamodbv2.model.ListGlobalTablesResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.ListGlobalTablesRequest request]
    (-> this (.listGlobalTables request))))

(defn create-backup
  "Description copied from interface: AmazonDynamoDB

  request - `com.amazonaws.services.dynamodbv2.model.CreateBackupRequest`

  returns: Result of the CreateBackup operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.CreateBackupResult`"
  (^com.amazonaws.services.dynamodbv2.model.CreateBackupResult [^AbstractAmazonDynamoDB this ^com.amazonaws.services.dynamodbv2.model.CreateBackupRequest request]
    (-> this (.createBackup request))))

