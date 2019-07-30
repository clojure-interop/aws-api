(ns com.amazonaws.services.glue.AWSGlueAsync
  "Interface for accessing AWS Glue asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSGlueAsync instead.


  AWS Glue

  Defines the public endpoint for the AWS Glue service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glue AWSGlueAsync]))

(defn untag-resource-async
  "Removes tags from a resource.

  untag-resource-request - `com.amazonaws.services.glue.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn delete-job-async
  "Deletes a specified job definition. If the job definition is not found, no exception is thrown.

  delete-job-request - `com.amazonaws.services.glue.model.DeleteJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteJobResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteJobRequest delete-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobAsync delete-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteJobRequest delete-job-request]
    (-> this (.deleteJobAsync delete-job-request))))

(defn update-workflow-async
  "Updates an existing workflow.

  update-workflow-request - `com.amazonaws.services.glue.model.UpdateWorkflowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWorkflow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateWorkflowResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateWorkflowRequest update-workflow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWorkflowAsync update-workflow-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateWorkflowRequest update-workflow-request]
    (-> this (.updateWorkflowAsync update-workflow-request))))

(defn batch-get-triggers-async
  "Returns a list of resource metadata for a given list of trigger names. After calling the
   ListTriggers operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-triggers-request - `com.amazonaws.services.glue.model.BatchGetTriggersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetTriggersResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetTriggersRequest batch-get-triggers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetTriggersAsync batch-get-triggers-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetTriggersRequest batch-get-triggers-request]
    (-> this (.batchGetTriggersAsync batch-get-triggers-request))))

(defn put-data-catalog-encryption-settings-async
  "Sets the security configuration for a specified catalog. After the configuration has been set, the specified
   encryption is applied to every catalog write thereafter.

  put-data-catalog-encryption-settings-request - `com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDataCatalogEncryptionSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest put-data-catalog-encryption-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDataCatalogEncryptionSettingsAsync put-data-catalog-encryption-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest put-data-catalog-encryption-settings-request]
    (-> this (.putDataCatalogEncryptionSettingsAsync put-data-catalog-encryption-settings-request))))

(defn get-tables-async
  "Retrieves the definitions of some or all of the tables in a given Database.

  get-tables-request - `com.amazonaws.services.glue.model.GetTablesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTables operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTablesResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTablesRequest get-tables-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTablesAsync get-tables-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTablesRequest get-tables-request]
    (-> this (.getTablesAsync get-tables-request))))

(defn get-user-defined-functions-async
  "Retrieves a multiple function definitions from the Data Catalog.

  get-user-defined-functions-request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserDefinedFunctions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest get-user-defined-functions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserDefinedFunctionsAsync get-user-defined-functions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest get-user-defined-functions-request]
    (-> this (.getUserDefinedFunctionsAsync get-user-defined-functions-request))))

(defn create-trigger-async
  "Creates a new trigger.

  create-trigger-request - `com.amazonaws.services.glue.model.CreateTriggerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateTriggerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateTriggerRequest create-trigger-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTriggerAsync create-trigger-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateTriggerRequest create-trigger-request]
    (-> this (.createTriggerAsync create-trigger-request))))

(defn get-database-async
  "Retrieves the definition of a specified database.

  get-database-request - `com.amazonaws.services.glue.model.GetDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDatabaseResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDatabaseRequest get-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDatabaseAsync get-database-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDatabaseRequest get-database-request]
    (-> this (.getDatabaseAsync get-database-request))))

(defn stop-trigger-async
  "Stops a specified trigger.

  stop-trigger-request - `com.amazonaws.services.glue.model.StopTriggerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StopTriggerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StopTriggerRequest stop-trigger-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTriggerAsync stop-trigger-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StopTriggerRequest stop-trigger-request]
    (-> this (.stopTriggerAsync stop-trigger-request))))

(defn get-trigger-async
  "Retrieves the definition of a trigger.

  get-trigger-request - `com.amazonaws.services.glue.model.GetTriggerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTriggerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTriggerRequest get-trigger-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTriggerAsync get-trigger-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTriggerRequest get-trigger-request]
    (-> this (.getTriggerAsync get-trigger-request))))

(defn delete-table-async
  "Removes a table definition from the Data Catalog.



   After completing this operation, you will no longer have access to the table versions and partitions that belong
   to the deleted table. AWS Glue deletes these \"orphaned\" resources asynchronously in a timely manner, at the
   discretion of the service.


   To ensure immediate deletion of all related resources, before calling DeleteTable, use
   DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or
   BatchDeletePartition, to delete any resources that belong to the table.

  delete-table-request - `com.amazonaws.services.glue.model.DeleteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteTableResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTableRequest delete-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTableAsync delete-table-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTableRequest delete-table-request]
    (-> this (.deleteTableAsync delete-table-request))))

(defn list-workflows-async
  "Lists names of workflows created in the account.

  list-workflows-request - `com.amazonaws.services.glue.model.ListWorkflowsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWorkflows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListWorkflowsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListWorkflowsRequest list-workflows-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWorkflowsAsync list-workflows-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListWorkflowsRequest list-workflows-request]
    (-> this (.listWorkflowsAsync list-workflows-request))))

(defn list-jobs-async
  "Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This
   operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  list-jobs-request - `com.amazonaws.services.glue.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListJobsRequest list-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync list-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobsAsync list-jobs-request))))

(defn delete-workflow-async
  "Deletes a workflow.

  delete-workflow-request - `com.amazonaws.services.glue.model.DeleteWorkflowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWorkflow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteWorkflowResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteWorkflowRequest delete-workflow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWorkflowAsync delete-workflow-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteWorkflowRequest delete-workflow-request]
    (-> this (.deleteWorkflowAsync delete-workflow-request))))

(defn batch-get-partition-async
  "Retrieves partitions in a batch request.

  batch-get-partition-request - `com.amazonaws.services.glue.model.BatchGetPartitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetPartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetPartitionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetPartitionRequest batch-get-partition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetPartitionAsync batch-get-partition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetPartitionRequest batch-get-partition-request]
    (-> this (.batchGetPartitionAsync batch-get-partition-request))))

(defn get-mapping-async
  "Creates mappings.

  get-mapping-request - `com.amazonaws.services.glue.model.GetMappingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetMappingResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetMappingRequest get-mapping-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMappingAsync get-mapping-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetMappingRequest get-mapping-request]
    (-> this (.getMappingAsync get-mapping-request))))

(defn get-crawler-metrics-async
  "Retrieves metrics about specified crawlers.

  get-crawler-metrics-request - `com.amazonaws.services.glue.model.GetCrawlerMetricsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCrawlerMetrics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetCrawlerMetricsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlerMetricsRequest get-crawler-metrics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCrawlerMetricsAsync get-crawler-metrics-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlerMetricsRequest get-crawler-metrics-request]
    (-> this (.getCrawlerMetricsAsync get-crawler-metrics-request))))

(defn batch-delete-table-async
  "Deletes multiple tables at once.



   After completing this operation, you will no longer have access to the table versions and partitions that belong
   to the deleted table. AWS Glue deletes these \"orphaned\" resources asynchronously in a timely manner, at the
   discretion of the service.


   To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use
   DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or
   BatchDeletePartition, to delete any resources that belong to the table.

  batch-delete-table-request - `com.amazonaws.services.glue.model.BatchDeleteTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchDeleteTableResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteTableRequest batch-delete-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteTableAsync batch-delete-table-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteTableRequest batch-delete-table-request]
    (-> this (.batchDeleteTableAsync batch-delete-table-request))))

(defn get-table-versions-async
  "Retrieves a list of strings that identify available versions of a specified table.

  get-table-versions-request - `com.amazonaws.services.glue.model.GetTableVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTableVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTableVersionsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableVersionsRequest get-table-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTableVersionsAsync get-table-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableVersionsRequest get-table-versions-request]
    (-> this (.getTableVersionsAsync get-table-versions-request))))

(defn create-security-configuration-async
  "Creates a new security configuration. A security configuration is a set of security properties that can be used
   by AWS Glue. You can use a security configuration to encrypt data at rest. For information about using security
   configurations in AWS Glue, see Encrypting Data Written
   by Crawlers, Jobs, and Development Endpoints.

  create-security-configuration-request - `com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest create-security-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecurityConfigurationAsync create-security-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest create-security-configuration-request]
    (-> this (.createSecurityConfigurationAsync create-security-configuration-request))))

(defn start-trigger-async
  "Starts an existing trigger. See Triggering
   Jobs for information about how different types of trigger are started.

  start-trigger-request - `com.amazonaws.services.glue.model.StartTriggerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartTriggerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartTriggerRequest start-trigger-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startTriggerAsync start-trigger-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartTriggerRequest start-trigger-request]
    (-> this (.startTriggerAsync start-trigger-request))))

(defn create-workflow-async
  "Creates a new workflow.

  create-workflow-request - `com.amazonaws.services.glue.model.CreateWorkflowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWorkflow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateWorkflowResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateWorkflowRequest create-workflow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWorkflowAsync create-workflow-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateWorkflowRequest create-workflow-request]
    (-> this (.createWorkflowAsync create-workflow-request))))

(defn delete-classifier-async
  "Removes a classifier from the Data Catalog.

  delete-classifier-request - `com.amazonaws.services.glue.model.DeleteClassifierRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteClassifierResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteClassifierRequest delete-classifier-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClassifierAsync delete-classifier-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteClassifierRequest delete-classifier-request]
    (-> this (.deleteClassifierAsync delete-classifier-request))))

(defn get-security-configurations-async
  "Retrieves a list of all security configurations.

  get-security-configurations-request - `com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSecurityConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetSecurityConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest get-security-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSecurityConfigurationsAsync get-security-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest get-security-configurations-request]
    (-> this (.getSecurityConfigurationsAsync get-security-configurations-request))))

(defn get-job-bookmarks-async
  "Returns information on the job bookmark entries. The list is ordered on decreasing version numbers.

  get-job-bookmarks-request - `com.amazonaws.services.glue.model.GetJobBookmarksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobBookmarks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobBookmarksResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobBookmarksRequest get-job-bookmarks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobBookmarksAsync get-job-bookmarks-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobBookmarksRequest get-job-bookmarks-request]
    (-> this (.getJobBookmarksAsync get-job-bookmarks-request))))

(defn update-partition-async
  "Updates a partition.

  update-partition-request - `com.amazonaws.services.glue.model.UpdatePartitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdatePartitionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdatePartitionRequest update-partition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePartitionAsync update-partition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdatePartitionRequest update-partition-request]
    (-> this (.updatePartitionAsync update-partition-request))))

(defn get-jobs-async
  "Retrieves all current job definitions.

  get-jobs-request - `com.amazonaws.services.glue.model.GetJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobsRequest get-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobsAsync get-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobsRequest get-jobs-request]
    (-> this (.getJobsAsync get-jobs-request))))

(defn get-plan-async
  "Gets code to perform a specified mapping.

  get-plan-request - `com.amazonaws.services.glue.model.GetPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetPlanResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetPlanRequest get-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPlanAsync get-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetPlanRequest get-plan-request]
    (-> this (.getPlanAsync get-plan-request))))

(defn batch-get-workflows-async
  "Returns a list of resource metadata for a given list of workflow names. After calling the
   ListWorkflows operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-workflows-request - `com.amazonaws.services.glue.model.BatchGetWorkflowsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetWorkflows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetWorkflowsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetWorkflowsRequest batch-get-workflows-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetWorkflowsAsync batch-get-workflows-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetWorkflowsRequest batch-get-workflows-request]
    (-> this (.batchGetWorkflowsAsync batch-get-workflows-request))))

(defn get-crawlers-async
  "Retrieves metadata for all crawlers defined in the customer account.

  get-crawlers-request - `com.amazonaws.services.glue.model.GetCrawlersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCrawlers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetCrawlersResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlersRequest get-crawlers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCrawlersAsync get-crawlers-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlersRequest get-crawlers-request]
    (-> this (.getCrawlersAsync get-crawlers-request))))

(defn update-database-async
  "Updates an existing database definition in a Data Catalog.

  update-database-request - `com.amazonaws.services.glue.model.UpdateDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateDatabaseResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateDatabaseRequest update-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDatabaseAsync update-database-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateDatabaseRequest update-database-request]
    (-> this (.updateDatabaseAsync update-database-request))))

(defn batch-get-dev-endpoints-async
  "Returns a list of resource metadata for a given list of development endpoint names. After calling the
   ListDevEndpoints operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-dev-endpoints-request - `com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDevEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetDevEndpointsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest batch-get-dev-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDevEndpointsAsync batch-get-dev-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest batch-get-dev-endpoints-request]
    (-> this (.batchGetDevEndpointsAsync batch-get-dev-endpoints-request))))

(defn create-database-async
  "Creates a new database in a Data Catalog.

  create-database-request - `com.amazonaws.services.glue.model.CreateDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateDatabaseResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateDatabaseRequest create-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatabaseAsync create-database-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateDatabaseRequest create-database-request]
    (-> this (.createDatabaseAsync create-database-request))))

(defn get-triggers-async
  "Gets all the triggers associated with a job.

  get-triggers-request - `com.amazonaws.services.glue.model.GetTriggersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTriggersResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTriggersRequest get-triggers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTriggersAsync get-triggers-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTriggersRequest get-triggers-request]
    (-> this (.getTriggersAsync get-triggers-request))))

(defn delete-trigger-async
  "Deletes a specified trigger. If the trigger is not found, no exception is thrown.

  delete-trigger-request - `com.amazonaws.services.glue.model.DeleteTriggerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteTriggerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTriggerRequest delete-trigger-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTriggerAsync delete-trigger-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTriggerRequest delete-trigger-request]
    (-> this (.deleteTriggerAsync delete-trigger-request))))

(defn delete-security-configuration-async
  "Deletes a specified security configuration.

  delete-security-configuration-request - `com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest delete-security-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecurityConfigurationAsync delete-security-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest delete-security-configuration-request]
    (-> this (.deleteSecurityConfigurationAsync delete-security-configuration-request))))

(defn create-crawler-async
  "Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl
   target must be specified, in the s3Targets field, the jdbcTargets field, or the
   DynamoDBTargets field.

  create-crawler-request - `com.amazonaws.services.glue.model.CreateCrawlerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateCrawlerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateCrawlerRequest create-crawler-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCrawlerAsync create-crawler-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateCrawlerRequest create-crawler-request]
    (-> this (.createCrawlerAsync create-crawler-request))))

(defn list-dev-endpoints-async
  "Retrieves the names of all DevEndpoint resources in this AWS account, or the resources with the
   specified tag. This operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  list-dev-endpoints-request - `com.amazonaws.services.glue.model.ListDevEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListDevEndpointsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListDevEndpointsRequest list-dev-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevEndpointsAsync list-dev-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListDevEndpointsRequest list-dev-endpoints-request]
    (-> this (.listDevEndpointsAsync list-dev-endpoints-request))))

(defn get-dev-endpoint-async
  "Retrieves information about a specified development endpoint.



   When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
   address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
   Glue returns only a public IP address.

  get-dev-endpoint-request - `com.amazonaws.services.glue.model.GetDevEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDevEndpointResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDevEndpointRequest get-dev-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevEndpointAsync get-dev-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDevEndpointRequest get-dev-endpoint-request]
    (-> this (.getDevEndpointAsync get-dev-endpoint-request))))

(defn get-connections-async
  "Retrieves a list of connection definitions from the Data Catalog.

  get-connections-request - `com.amazonaws.services.glue.model.GetConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetConnectionsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetConnectionsRequest get-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectionsAsync get-connections-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetConnectionsRequest get-connections-request]
    (-> this (.getConnectionsAsync get-connections-request))))

(defn get-job-bookmark-async
  "Returns information on a job bookmark entry.

  get-job-bookmark-request - `com.amazonaws.services.glue.model.GetJobBookmarkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobBookmark operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobBookmarkResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobBookmarkRequest get-job-bookmark-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobBookmarkAsync get-job-bookmark-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobBookmarkRequest get-job-bookmark-request]
    (-> this (.getJobBookmarkAsync get-job-bookmark-request))))

(defn reset-job-bookmark-async
  "Resets a bookmark entry.

  reset-job-bookmark-request - `com.amazonaws.services.glue.model.ResetJobBookmarkRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetJobBookmark operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ResetJobBookmarkResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ResetJobBookmarkRequest reset-job-bookmark-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetJobBookmarkAsync reset-job-bookmark-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ResetJobBookmarkRequest reset-job-bookmark-request]
    (-> this (.resetJobBookmarkAsync reset-job-bookmark-request))))

(defn delete-database-async
  "Removes a specified Database from a Data Catalog.



   After completing this operation, you will no longer have access to the tables (and all table versions and
   partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue
   deletes these \"orphaned\" resources asynchronously in a timely manner, at the discretion of the service.


   To ensure immediate deletion of all related resources, before calling DeleteDatabase, use
   DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or
   BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or
   BatchDeleteTable, to delete any resources that belong to the database.

  delete-database-request - `com.amazonaws.services.glue.model.DeleteDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteDatabaseResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteDatabaseRequest delete-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatabaseAsync delete-database-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteDatabaseRequest delete-database-request]
    (-> this (.deleteDatabaseAsync delete-database-request))))

(defn batch-delete-table-version-async
  "Deletes a specified batch of versions of a table.

  batch-delete-table-version-request - `com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteTableVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchDeleteTableVersionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest batch-delete-table-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteTableVersionAsync batch-delete-table-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest batch-delete-table-version-request]
    (-> this (.batchDeleteTableVersionAsync batch-delete-table-version-request))))

(defn create-user-defined-function-async
  "Creates a new function definition in the Data Catalog.

  create-user-defined-function-request - `com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserDefinedFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest create-user-defined-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserDefinedFunctionAsync create-user-defined-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest create-user-defined-function-request]
    (-> this (.createUserDefinedFunctionAsync create-user-defined-function-request))))

(defn batch-get-jobs-async
  "Returns a list of resource metadata for a given list of job names. After calling the ListJobs
   operation, you can call this operation to access the data to which you have been granted permissions. This
   operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-jobs-request - `com.amazonaws.services.glue.model.BatchGetJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetJobsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetJobsRequest batch-get-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetJobsAsync batch-get-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetJobsRequest batch-get-jobs-request]
    (-> this (.batchGetJobsAsync batch-get-jobs-request))))

(defn delete-table-version-async
  "Deletes a specified version of a table.

  delete-table-version-request - `com.amazonaws.services.glue.model.DeleteTableVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTableVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteTableVersionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTableVersionRequest delete-table-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTableVersionAsync delete-table-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTableVersionRequest delete-table-version-request]
    (-> this (.deleteTableVersionAsync delete-table-version-request))))

(defn get-catalog-import-status-async
  "Retrieves the status of a migration operation.

  get-catalog-import-status-request - `com.amazonaws.services.glue.model.GetCatalogImportStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCatalogImportStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetCatalogImportStatusResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetCatalogImportStatusRequest get-catalog-import-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCatalogImportStatusAsync get-catalog-import-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetCatalogImportStatusRequest get-catalog-import-status-request]
    (-> this (.getCatalogImportStatusAsync get-catalog-import-status-request))))

(defn get-workflow-run-properties-async
  "Retrieves the workflow run properties which were set during the run.

  get-workflow-run-properties-request - `com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkflowRunProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetWorkflowRunPropertiesResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest get-workflow-run-properties-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkflowRunPropertiesAsync get-workflow-run-properties-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest get-workflow-run-properties-request]
    (-> this (.getWorkflowRunPropertiesAsync get-workflow-run-properties-request))))

(defn update-classifier-async
  "Modifies an existing classifier (a GrokClassifier, an XMLClassifier, a
   JsonClassifier, or a CsvClassifier, depending on which field is present).

  update-classifier-request - `com.amazonaws.services.glue.model.UpdateClassifierRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateClassifierResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateClassifierRequest update-classifier-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClassifierAsync update-classifier-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateClassifierRequest update-classifier-request]
    (-> this (.updateClassifierAsync update-classifier-request))))

(defn stop-crawler-schedule-async
  "Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if
   it is already running.

  stop-crawler-schedule-request - `com.amazonaws.services.glue.model.StopCrawlerScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopCrawlerSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StopCrawlerScheduleResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StopCrawlerScheduleRequest stop-crawler-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopCrawlerScheduleAsync stop-crawler-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StopCrawlerScheduleRequest stop-crawler-schedule-request]
    (-> this (.stopCrawlerScheduleAsync stop-crawler-schedule-request))))

(defn delete-user-defined-function-async
  "Deletes an existing function definition from the Data Catalog.

  delete-user-defined-function-request - `com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserDefinedFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest delete-user-defined-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserDefinedFunctionAsync delete-user-defined-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest delete-user-defined-function-request]
    (-> this (.deleteUserDefinedFunctionAsync delete-user-defined-function-request))))

(defn list-crawlers-async
  "Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This
   operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  list-crawlers-request - `com.amazonaws.services.glue.model.ListCrawlersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCrawlers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListCrawlersResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListCrawlersRequest list-crawlers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCrawlersAsync list-crawlers-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListCrawlersRequest list-crawlers-request]
    (-> this (.listCrawlersAsync list-crawlers-request))))

(defn update-trigger-async
  "Updates a trigger definition.

  update-trigger-request - `com.amazonaws.services.glue.model.UpdateTriggerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateTriggerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateTriggerRequest update-trigger-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTriggerAsync update-trigger-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateTriggerRequest update-trigger-request]
    (-> this (.updateTriggerAsync update-trigger-request))))

(defn get-classifier-async
  "Retrieve a classifier by name.

  get-classifier-request - `com.amazonaws.services.glue.model.GetClassifierRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetClassifierResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetClassifierRequest get-classifier-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClassifierAsync get-classifier-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetClassifierRequest get-classifier-request]
    (-> this (.getClassifierAsync get-classifier-request))))

(defn stop-crawler-async
  "If the specified crawler is running, stops the crawl.

  stop-crawler-request - `com.amazonaws.services.glue.model.StopCrawlerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StopCrawlerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StopCrawlerRequest stop-crawler-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopCrawlerAsync stop-crawler-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StopCrawlerRequest stop-crawler-request]
    (-> this (.stopCrawlerAsync stop-crawler-request))))

(defn batch-stop-job-run-async
  "Stops one or more job runs for a specified job definition.

  batch-stop-job-run-request - `com.amazonaws.services.glue.model.BatchStopJobRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchStopJobRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchStopJobRunResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchStopJobRunRequest batch-stop-job-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchStopJobRunAsync batch-stop-job-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchStopJobRunRequest batch-stop-job-run-request]
    (-> this (.batchStopJobRunAsync batch-stop-job-run-request))))

(defn delete-connection-async
  "Deletes a connection from the Data Catalog.

  delete-connection-request - `com.amazonaws.services.glue.model.DeleteConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteConnectionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteConnectionRequest delete-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConnectionAsync delete-connection-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteConnectionRequest delete-connection-request]
    (-> this (.deleteConnectionAsync delete-connection-request))))

(defn get-workflow-run-async
  "Retrieves the metadata for a given workflow run.

  get-workflow-run-request - `com.amazonaws.services.glue.model.GetWorkflowRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkflowRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetWorkflowRunResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunRequest get-workflow-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkflowRunAsync get-workflow-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunRequest get-workflow-run-request]
    (-> this (.getWorkflowRunAsync get-workflow-run-request))))

(defn import-catalog-to-glue-async
  "Imports an existing Athena Data Catalog to AWS Glue

  import-catalog-to-glue-request - `com.amazonaws.services.glue.model.ImportCatalogToGlueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportCatalogToGlue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ImportCatalogToGlueResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ImportCatalogToGlueRequest import-catalog-to-glue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importCatalogToGlueAsync import-catalog-to-glue-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ImportCatalogToGlueRequest import-catalog-to-glue-request]
    (-> this (.importCatalogToGlueAsync import-catalog-to-glue-request))))

(defn get-partitions-async
  "Retrieves information about the partitions in a table.

  get-partitions-request - `com.amazonaws.services.glue.model.GetPartitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPartitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetPartitionsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetPartitionsRequest get-partitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPartitionsAsync get-partitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetPartitionsRequest get-partitions-request]
    (-> this (.getPartitionsAsync get-partitions-request))))

(defn get-table-async
  "Retrieves the Table definition in a Data Catalog for a specified table.

  get-table-request - `com.amazonaws.services.glue.model.GetTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTableResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableRequest get-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTableAsync get-table-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableRequest get-table-request]
    (-> this (.getTableAsync get-table-request))))

(defn start-workflow-run-async
  "Starts a new run of the specified workflow.

  start-workflow-run-request - `com.amazonaws.services.glue.model.StartWorkflowRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartWorkflowRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartWorkflowRunResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartWorkflowRunRequest start-workflow-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startWorkflowRunAsync start-workflow-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartWorkflowRunRequest start-workflow-run-request]
    (-> this (.startWorkflowRunAsync start-workflow-run-request))))

(defn update-dev-endpoint-async
  "Updates a specified development endpoint.

  update-dev-endpoint-request - `com.amazonaws.services.glue.model.UpdateDevEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDevEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateDevEndpointResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateDevEndpointRequest update-dev-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDevEndpointAsync update-dev-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateDevEndpointRequest update-dev-endpoint-request]
    (-> this (.updateDevEndpointAsync update-dev-endpoint-request))))

(defn get-classifiers-async
  "Lists all classifier objects in the Data Catalog.

  get-classifiers-request - `com.amazonaws.services.glue.model.GetClassifiersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClassifiers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetClassifiersResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetClassifiersRequest get-classifiers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClassifiersAsync get-classifiers-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetClassifiersRequest get-classifiers-request]
    (-> this (.getClassifiersAsync get-classifiers-request))))

(defn get-user-defined-function-async
  "Retrieves a specified function definition from the Data Catalog.

  get-user-defined-function-request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserDefinedFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetUserDefinedFunctionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest get-user-defined-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserDefinedFunctionAsync get-user-defined-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest get-user-defined-function-request]
    (-> this (.getUserDefinedFunctionAsync get-user-defined-function-request))))

(defn start-job-run-async
  "Starts a job run using a job definition.

  start-job-run-request - `com.amazonaws.services.glue.model.StartJobRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartJobRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartJobRunResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartJobRunRequest start-job-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startJobRunAsync start-job-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartJobRunRequest start-job-run-request]
    (-> this (.startJobRunAsync start-job-run-request))))

(defn get-dataflow-graph-async
  "Transforms a Python script into a directed acyclic graph (DAG).

  get-dataflow-graph-request - `com.amazonaws.services.glue.model.GetDataflowGraphRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataflowGraph operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDataflowGraphResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDataflowGraphRequest get-dataflow-graph-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataflowGraphAsync get-dataflow-graph-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDataflowGraphRequest get-dataflow-graph-request]
    (-> this (.getDataflowGraphAsync get-dataflow-graph-request))))

(defn create-job-async
  "Creates a new job definition.

  create-job-request - `com.amazonaws.services.glue.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateJobRequest create-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync create-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateJobRequest create-job-request]
    (-> this (.createJobAsync create-job-request))))

(defn batch-get-crawlers-async
  "Returns a list of resource metadata for a given list of crawler names. After calling the
   ListCrawlers operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-crawlers-request - `com.amazonaws.services.glue.model.BatchGetCrawlersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetCrawlers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetCrawlersResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetCrawlersRequest batch-get-crawlers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetCrawlersAsync batch-get-crawlers-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetCrawlersRequest batch-get-crawlers-request]
    (-> this (.batchGetCrawlersAsync batch-get-crawlers-request))))

(defn update-job-async
  "Updates an existing job definition.

  update-job-request - `com.amazonaws.services.glue.model.UpdateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateJobResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateJobRequest update-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobAsync update-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateJobRequest update-job-request]
    (-> this (.updateJobAsync update-job-request))))

(defn create-table-async
  "Creates a new table definition in the Data Catalog.

  create-table-request - `com.amazonaws.services.glue.model.CreateTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateTableResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateTableRequest create-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTableAsync create-table-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateTableRequest create-table-request]
    (-> this (.createTableAsync create-table-request))))

(defn update-table-async
  "Updates a metadata table in the Data Catalog.

  update-table-request - `com.amazonaws.services.glue.model.UpdateTableRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateTableResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateTableRequest update-table-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTableAsync update-table-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateTableRequest update-table-request]
    (-> this (.updateTableAsync update-table-request))))

(defn delete-crawler-async
  "Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is RUNNING.

  delete-crawler-request - `com.amazonaws.services.glue.model.DeleteCrawlerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteCrawlerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteCrawlerRequest delete-crawler-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCrawlerAsync delete-crawler-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteCrawlerRequest delete-crawler-request]
    (-> this (.deleteCrawlerAsync delete-crawler-request))))

(defn get-data-catalog-encryption-settings-async
  "Retrieves the security configuration for a specified catalog.

  get-data-catalog-encryption-settings-request - `com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataCatalogEncryptionSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest get-data-catalog-encryption-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataCatalogEncryptionSettingsAsync get-data-catalog-encryption-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest get-data-catalog-encryption-settings-request]
    (-> this (.getDataCatalogEncryptionSettingsAsync get-data-catalog-encryption-settings-request))))

(defn delete-dev-endpoint-async
  "Deletes a specified development endpoint.

  delete-dev-endpoint-request - `com.amazonaws.services.glue.model.DeleteDevEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDevEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteDevEndpointResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteDevEndpointRequest delete-dev-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDevEndpointAsync delete-dev-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteDevEndpointRequest delete-dev-endpoint-request]
    (-> this (.deleteDevEndpointAsync delete-dev-endpoint-request))))

(defn batch-delete-partition-async
  "Deletes one or more partitions in a batch operation.

  batch-delete-partition-request - `com.amazonaws.services.glue.model.BatchDeletePartitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeletePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchDeletePartitionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeletePartitionRequest batch-delete-partition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeletePartitionAsync batch-delete-partition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeletePartitionRequest batch-delete-partition-request]
    (-> this (.batchDeletePartitionAsync batch-delete-partition-request))))

(defn delete-resource-policy-async
  "Deletes a specified policy.

  delete-resource-policy-request - `com.amazonaws.services.glue.model.DeleteResourcePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteResourcePolicyRequest delete-resource-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourcePolicyAsync delete-resource-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteResourcePolicyRequest delete-resource-policy-request]
    (-> this (.deleteResourcePolicyAsync delete-resource-policy-request))))

(defn update-crawler-async
  "Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.

  update-crawler-request - `com.amazonaws.services.glue.model.UpdateCrawlerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateCrawlerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateCrawlerRequest update-crawler-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCrawlerAsync update-crawler-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateCrawlerRequest update-crawler-request]
    (-> this (.updateCrawlerAsync update-crawler-request))))

(defn get-workflow-runs-async
  "Retrieves metadata for all runs of a given workflow.

  get-workflow-runs-request - `com.amazonaws.services.glue.model.GetWorkflowRunsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkflowRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetWorkflowRunsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunsRequest get-workflow-runs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkflowRunsAsync get-workflow-runs-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunsRequest get-workflow-runs-request]
    (-> this (.getWorkflowRunsAsync get-workflow-runs-request))))

(defn batch-delete-connection-async
  "Deletes a list of connection definitions from the Data Catalog.

  batch-delete-connection-request - `com.amazonaws.services.glue.model.BatchDeleteConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchDeleteConnectionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteConnectionRequest batch-delete-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteConnectionAsync batch-delete-connection-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteConnectionRequest batch-delete-connection-request]
    (-> this (.batchDeleteConnectionAsync batch-delete-connection-request))))

(defn get-partition-async
  "Retrieves information about a specified partition.

  get-partition-request - `com.amazonaws.services.glue.model.GetPartitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetPartitionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetPartitionRequest get-partition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPartitionAsync get-partition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetPartitionRequest get-partition-request]
    (-> this (.getPartitionAsync get-partition-request))))

(defn create-classifier-async
  "Creates a classifier in the user's account. This can be a GrokClassifier, an
   XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which
   field of the request is present.

  create-classifier-request - `com.amazonaws.services.glue.model.CreateClassifierRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateClassifierResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateClassifierRequest create-classifier-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClassifierAsync create-classifier-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateClassifierRequest create-classifier-request]
    (-> this (.createClassifierAsync create-classifier-request))))

(defn get-connection-async
  "Retrieves a connection definition from the Data Catalog.

  get-connection-request - `com.amazonaws.services.glue.model.GetConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetConnectionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetConnectionRequest get-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectionAsync get-connection-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetConnectionRequest get-connection-request]
    (-> this (.getConnectionAsync get-connection-request))))

(defn get-databases-async
  "Retrieves all Databases defined in a given Data Catalog.

  get-databases-request - `com.amazonaws.services.glue.model.GetDatabasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDatabases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDatabasesResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDatabasesRequest get-databases-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDatabasesAsync get-databases-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDatabasesRequest get-databases-request]
    (-> this (.getDatabasesAsync get-databases-request))))

(defn delete-partition-async
  "Deletes a specified partition.

  delete-partition-request - `com.amazonaws.services.glue.model.DeletePartitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeletePartitionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeletePartitionRequest delete-partition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePartitionAsync delete-partition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.DeletePartitionRequest delete-partition-request]
    (-> this (.deletePartitionAsync delete-partition-request))))

(defn get-dev-endpoints-async
  "Retrieves all the development endpoints in this AWS account.



   When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
   address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
   Glue returns only a public IP address.

  get-dev-endpoints-request - `com.amazonaws.services.glue.model.GetDevEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDevEndpointsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDevEndpointsRequest get-dev-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevEndpointsAsync get-dev-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetDevEndpointsRequest get-dev-endpoints-request]
    (-> this (.getDevEndpointsAsync get-dev-endpoints-request))))

(defn put-workflow-run-properties-async
  "Puts the specified workflow run properties for the given workflow run. If a property already exists for the
   specified run, then it overrides the value otherwise adds the property to existing properties.

  put-workflow-run-properties-request - `com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutWorkflowRunProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.PutWorkflowRunPropertiesResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest put-workflow-run-properties-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putWorkflowRunPropertiesAsync put-workflow-run-properties-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest put-workflow-run-properties-request]
    (-> this (.putWorkflowRunPropertiesAsync put-workflow-run-properties-request))))

(defn list-triggers-async
  "Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This
   operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  list-triggers-request - `com.amazonaws.services.glue.model.ListTriggersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListTriggersResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListTriggersRequest list-triggers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTriggersAsync list-triggers-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.ListTriggersRequest list-triggers-request]
    (-> this (.listTriggersAsync list-triggers-request))))

(defn create-partition-async
  "Creates a new partition.

  create-partition-request - `com.amazonaws.services.glue.model.CreatePartitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreatePartitionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreatePartitionRequest create-partition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPartitionAsync create-partition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreatePartitionRequest create-partition-request]
    (-> this (.createPartitionAsync create-partition-request))))

(defn create-connection-async
  "Creates a connection definition in the Data Catalog.

  create-connection-request - `com.amazonaws.services.glue.model.CreateConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateConnectionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateConnectionRequest create-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConnectionAsync create-connection-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateConnectionRequest create-connection-request]
    (-> this (.createConnectionAsync create-connection-request))))

(defn get-workflow-async
  "Retrieves resource metadata for a workflow.

  get-workflow-request - `com.amazonaws.services.glue.model.GetWorkflowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkflow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetWorkflowResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRequest get-workflow-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkflowAsync get-workflow-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRequest get-workflow-request]
    (-> this (.getWorkflowAsync get-workflow-request))))

(defn get-table-version-async
  "Retrieves a specified version of a table.

  get-table-version-request - `com.amazonaws.services.glue.model.GetTableVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTableVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTableVersionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableVersionRequest get-table-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTableVersionAsync get-table-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableVersionRequest get-table-version-request]
    (-> this (.getTableVersionAsync get-table-version-request))))

(defn get-security-configuration-async
  "Retrieves a specified security configuration.

  get-security-configuration-request - `com.amazonaws.services.glue.model.GetSecurityConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetSecurityConfigurationRequest get-security-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSecurityConfigurationAsync get-security-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetSecurityConfigurationRequest get-security-configuration-request]
    (-> this (.getSecurityConfigurationAsync get-security-configuration-request))))

(defn put-resource-policy-async
  "Sets the Data Catalog resource policy for access control.

  put-resource-policy-request - `com.amazonaws.services.glue.model.PutResourcePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.PutResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.PutResourcePolicyRequest put-resource-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResourcePolicyAsync put-resource-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.PutResourcePolicyRequest put-resource-policy-request]
    (-> this (.putResourcePolicyAsync put-resource-policy-request))))

(defn start-crawler-async
  "Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running,
   returns a CrawlerRunningException.

  start-crawler-request - `com.amazonaws.services.glue.model.StartCrawlerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartCrawlerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartCrawlerRequest start-crawler-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startCrawlerAsync start-crawler-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartCrawlerRequest start-crawler-request]
    (-> this (.startCrawlerAsync start-crawler-request))))

(defn batch-create-partition-async
  "Creates one or more partitions in a batch operation.

  batch-create-partition-request - `com.amazonaws.services.glue.model.BatchCreatePartitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchCreatePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchCreatePartitionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchCreatePartitionRequest batch-create-partition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchCreatePartitionAsync batch-create-partition-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.BatchCreatePartitionRequest batch-create-partition-request]
    (-> this (.batchCreatePartitionAsync batch-create-partition-request))))

(defn update-connection-async
  "Updates a connection definition in the Data Catalog.

  update-connection-request - `com.amazonaws.services.glue.model.UpdateConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateConnectionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateConnectionRequest update-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConnectionAsync update-connection-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateConnectionRequest update-connection-request]
    (-> this (.updateConnectionAsync update-connection-request))))

(defn update-crawler-schedule-async
  "Updates the schedule of a crawler using a cron expression.

  update-crawler-schedule-request - `com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCrawlerSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest update-crawler-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCrawlerScheduleAsync update-crawler-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest update-crawler-schedule-request]
    (-> this (.updateCrawlerScheduleAsync update-crawler-schedule-request))))

(defn get-resource-policy-async
  "Retrieves a specified resource policy.

  get-resource-policy-request - `com.amazonaws.services.glue.model.GetResourcePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetResourcePolicyRequest get-resource-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcePolicyAsync get-resource-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetResourcePolicyRequest get-resource-policy-request]
    (-> this (.getResourcePolicyAsync get-resource-policy-request))))

(defn create-dev-endpoint-async
  "Creates a new development endpoint.

  create-dev-endpoint-request - `com.amazonaws.services.glue.model.CreateDevEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDevEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateDevEndpointResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateDevEndpointRequest create-dev-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDevEndpointAsync create-dev-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateDevEndpointRequest create-dev-endpoint-request]
    (-> this (.createDevEndpointAsync create-dev-endpoint-request))))

(defn get-job-runs-async
  "Retrieves metadata for all runs of a given job definition.

  get-job-runs-request - `com.amazonaws.services.glue.model.GetJobRunsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobRunsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRunsRequest get-job-runs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobRunsAsync get-job-runs-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRunsRequest get-job-runs-request]
    (-> this (.getJobRunsAsync get-job-runs-request))))

(defn tag-resource-async
  "Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only
   certain resources. For information about what resources you can tag, see AWS Tags in AWS Glue.

  tag-resource-request - `com.amazonaws.services.glue.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn get-job-async
  "Retrieves an existing job definition.

  get-job-request - `com.amazonaws.services.glue.model.GetJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRequest get-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobAsync get-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRequest get-job-request]
    (-> this (.getJobAsync get-job-request))))

(defn get-job-run-async
  "Retrieves the metadata for a given job run.

  get-job-run-request - `com.amazonaws.services.glue.model.GetJobRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobRunResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRunRequest get-job-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobRunAsync get-job-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRunRequest get-job-run-request]
    (-> this (.getJobRunAsync get-job-run-request))))

(defn create-script-async
  "Transforms a directed acyclic graph (DAG) into code.

  create-script-request - `com.amazonaws.services.glue.model.CreateScriptRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateScript operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateScriptResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateScriptRequest create-script-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createScriptAsync create-script-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.CreateScriptRequest create-script-request]
    (-> this (.createScriptAsync create-script-request))))

(defn get-crawler-async
  "Retrieves metadata for a specified crawler.

  get-crawler-request - `com.amazonaws.services.glue.model.GetCrawlerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetCrawlerResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlerRequest get-crawler-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCrawlerAsync get-crawler-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlerRequest get-crawler-request]
    (-> this (.getCrawlerAsync get-crawler-request))))

(defn update-user-defined-function-async
  "Updates an existing function definition in the Data Catalog.

  update-user-defined-function-request - `com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserDefinedFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest update-user-defined-function-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserDefinedFunctionAsync update-user-defined-function-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest update-user-defined-function-request]
    (-> this (.updateUserDefinedFunctionAsync update-user-defined-function-request))))

(defn start-crawler-schedule-async
  "Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already
   running or the schedule state is already SCHEDULED.

  start-crawler-schedule-request - `com.amazonaws.services.glue.model.StartCrawlerScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartCrawlerSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartCrawlerScheduleResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartCrawlerScheduleRequest start-crawler-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startCrawlerScheduleAsync start-crawler-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.StartCrawlerScheduleRequest start-crawler-schedule-request]
    (-> this (.startCrawlerScheduleAsync start-crawler-schedule-request))))

(defn get-tags-async
  "Retrieves a list of tags associated with a resource.

  get-tags-request - `com.amazonaws.services.glue.model.GetTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTagsRequest get-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync get-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSGlueAsync this ^com.amazonaws.services.glue.model.GetTagsRequest get-tags-request]
    (-> this (.getTagsAsync get-tags-request))))

