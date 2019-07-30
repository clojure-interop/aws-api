(ns com.amazonaws.services.glue.AbstractAWSGlueAsync
  "Abstract implementation of AWSGlueAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glue AbstractAWSGlueAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn delete-job-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteJobRequest request]
    (-> this (.deleteJobAsync request))))

(defn update-workflow-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateWorkflowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWorkflow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateWorkflowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateWorkflowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWorkflowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateWorkflowRequest request]
    (-> this (.updateWorkflowAsync request))))

(defn batch-get-triggers-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchGetTriggersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetTriggersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetTriggersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetTriggersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetTriggersRequest request]
    (-> this (.batchGetTriggersAsync request))))

(defn put-data-catalog-encryption-settings-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDataCatalogEncryptionSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDataCatalogEncryptionSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest request]
    (-> this (.putDataCatalogEncryptionSettingsAsync request))))

(defn get-tables-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetTablesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTables operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTablesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTablesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTablesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTablesRequest request]
    (-> this (.getTablesAsync request))))

(defn get-user-defined-functions-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserDefinedFunctions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserDefinedFunctionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest request]
    (-> this (.getUserDefinedFunctionsAsync request))))

(defn create-trigger-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateTriggerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateTriggerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateTriggerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTriggerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateTriggerRequest request]
    (-> this (.createTriggerAsync request))))

(defn get-database-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDatabaseResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDatabaseRequest request]
    (-> this (.getDatabaseAsync request))))

(defn stop-trigger-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.StopTriggerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StopTriggerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StopTriggerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTriggerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StopTriggerRequest request]
    (-> this (.stopTriggerAsync request))))

(defn get-trigger-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetTriggerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTriggerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTriggerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTriggerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTriggerRequest request]
    (-> this (.getTriggerAsync request))))

(defn delete-table-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteTableResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTableRequest request]
    (-> this (.deleteTableAsync request))))

(defn list-workflows-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.ListWorkflowsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWorkflows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListWorkflowsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListWorkflowsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWorkflowsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListWorkflowsRequest request]
    (-> this (.listWorkflowsAsync request))))

(defn list-jobs-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.ListJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn delete-workflow-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteWorkflowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWorkflow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteWorkflowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteWorkflowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWorkflowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteWorkflowRequest request]
    (-> this (.deleteWorkflowAsync request))))

(defn batch-get-partition-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchGetPartitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetPartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetPartitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetPartitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetPartitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetPartitionRequest request]
    (-> this (.batchGetPartitionAsync request))))

(defn get-mapping-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetMappingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMapping operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetMappingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetMappingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMappingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetMappingRequest request]
    (-> this (.getMappingAsync request))))

(defn get-crawler-metrics-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetCrawlerMetricsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCrawlerMetrics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetCrawlerMetricsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlerMetricsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCrawlerMetricsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlerMetricsRequest request]
    (-> this (.getCrawlerMetricsAsync request))))

(defn batch-delete-table-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchDeleteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchDeleteTableResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteTableRequest request]
    (-> this (.batchDeleteTableAsync request))))

(defn get-table-versions-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetTableVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTableVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTableVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTableVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableVersionsRequest request]
    (-> this (.getTableVersionsAsync request))))

(defn create-security-configuration-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecurityConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest request]
    (-> this (.createSecurityConfigurationAsync request))))

(defn start-trigger-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.StartTriggerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartTriggerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartTriggerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startTriggerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartTriggerRequest request]
    (-> this (.startTriggerAsync request))))

(defn create-workflow-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateWorkflowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWorkflow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateWorkflowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateWorkflowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWorkflowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateWorkflowRequest request]
    (-> this (.createWorkflowAsync request))))

(defn delete-classifier-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteClassifierRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteClassifierResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteClassifierRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClassifierAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteClassifierRequest request]
    (-> this (.deleteClassifierAsync request))))

(defn get-security-configurations-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSecurityConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetSecurityConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSecurityConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest request]
    (-> this (.getSecurityConfigurationsAsync request))))

(defn get-job-bookmarks-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetJobBookmarksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobBookmarks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobBookmarksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobBookmarksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobBookmarksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobBookmarksRequest request]
    (-> this (.getJobBookmarksAsync request))))

(defn update-partition-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdatePartitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdatePartitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdatePartitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePartitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdatePartitionRequest request]
    (-> this (.updatePartitionAsync request))))

(defn get-jobs-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobsRequest request]
    (-> this (.getJobsAsync request))))

(defn get-plan-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetPlanRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPlan operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetPlanResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetPlanRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPlanAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetPlanRequest request]
    (-> this (.getPlanAsync request))))

(defn batch-get-workflows-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchGetWorkflowsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetWorkflows operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetWorkflowsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetWorkflowsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetWorkflowsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetWorkflowsRequest request]
    (-> this (.batchGetWorkflowsAsync request))))

(defn get-crawlers-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetCrawlersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCrawlers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetCrawlersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCrawlersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlersRequest request]
    (-> this (.getCrawlersAsync request))))

(defn update-database-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateDatabaseResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateDatabaseRequest request]
    (-> this (.updateDatabaseAsync request))))

(defn batch-get-dev-endpoints-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetDevEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetDevEndpointsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetDevEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest request]
    (-> this (.batchGetDevEndpointsAsync request))))

(defn create-database-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateDatabaseResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateDatabaseRequest request]
    (-> this (.createDatabaseAsync request))))

(defn get-triggers-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetTriggersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTriggersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTriggersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTriggersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTriggersRequest request]
    (-> this (.getTriggersAsync request))))

(defn delete-trigger-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteTriggerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteTriggerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTriggerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTriggerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTriggerRequest request]
    (-> this (.deleteTriggerAsync request))))

(defn delete-security-configuration-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecurityConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest request]
    (-> this (.deleteSecurityConfigurationAsync request))))

(defn create-crawler-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateCrawlerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateCrawlerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateCrawlerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCrawlerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateCrawlerRequest request]
    (-> this (.createCrawlerAsync request))))

(defn list-dev-endpoints-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.ListDevEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListDevEndpointsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListDevEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListDevEndpointsRequest request]
    (-> this (.listDevEndpointsAsync request))))

(defn get-dev-endpoint-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetDevEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDevEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDevEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDevEndpointRequest request]
    (-> this (.getDevEndpointAsync request))))

(defn get-connections-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetConnectionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetConnectionsRequest request]
    (-> this (.getConnectionsAsync request))))

(defn get-job-bookmark-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetJobBookmarkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobBookmark operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobBookmarkResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobBookmarkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobBookmarkAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobBookmarkRequest request]
    (-> this (.getJobBookmarkAsync request))))

(defn reset-job-bookmark-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.ResetJobBookmarkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetJobBookmark operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ResetJobBookmarkResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ResetJobBookmarkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetJobBookmarkAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ResetJobBookmarkRequest request]
    (-> this (.resetJobBookmarkAsync request))))

(defn delete-database-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteDatabaseResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteDatabaseRequest request]
    (-> this (.deleteDatabaseAsync request))))

(defn batch-delete-table-version-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteTableVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchDeleteTableVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteTableVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest request]
    (-> this (.batchDeleteTableVersionAsync request))))

(defn create-user-defined-function-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserDefinedFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserDefinedFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest request]
    (-> this (.createUserDefinedFunctionAsync request))))

(defn batch-get-jobs-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchGetJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetJobsRequest request]
    (-> this (.batchGetJobsAsync request))))

(defn delete-table-version-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteTableVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTableVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteTableVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTableVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTableVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteTableVersionRequest request]
    (-> this (.deleteTableVersionAsync request))))

(defn get-catalog-import-status-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetCatalogImportStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCatalogImportStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetCatalogImportStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetCatalogImportStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCatalogImportStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetCatalogImportStatusRequest request]
    (-> this (.getCatalogImportStatusAsync request))))

(defn get-workflow-run-properties-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkflowRunProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetWorkflowRunPropertiesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkflowRunPropertiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest request]
    (-> this (.getWorkflowRunPropertiesAsync request))))

(defn update-classifier-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateClassifierRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateClassifierResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateClassifierRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClassifierAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateClassifierRequest request]
    (-> this (.updateClassifierAsync request))))

(defn stop-crawler-schedule-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.StopCrawlerScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopCrawlerSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StopCrawlerScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StopCrawlerScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopCrawlerScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StopCrawlerScheduleRequest request]
    (-> this (.stopCrawlerScheduleAsync request))))

(defn delete-user-defined-function-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserDefinedFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserDefinedFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest request]
    (-> this (.deleteUserDefinedFunctionAsync request))))

(defn list-crawlers-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.ListCrawlersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCrawlers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListCrawlersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListCrawlersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCrawlersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListCrawlersRequest request]
    (-> this (.listCrawlersAsync request))))

(defn update-trigger-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateTriggerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrigger operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateTriggerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateTriggerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTriggerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateTriggerRequest request]
    (-> this (.updateTriggerAsync request))))

(defn get-classifier-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetClassifierRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetClassifierResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetClassifierRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClassifierAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetClassifierRequest request]
    (-> this (.getClassifierAsync request))))

(defn stop-crawler-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.StopCrawlerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StopCrawlerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StopCrawlerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopCrawlerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StopCrawlerRequest request]
    (-> this (.stopCrawlerAsync request))))

(defn batch-stop-job-run-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchStopJobRunRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchStopJobRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchStopJobRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchStopJobRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchStopJobRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchStopJobRunRequest request]
    (-> this (.batchStopJobRunAsync request))))

(defn delete-connection-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteConnectionRequest request]
    (-> this (.deleteConnectionAsync request))))

(defn get-workflow-run-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetWorkflowRunRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkflowRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetWorkflowRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkflowRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunRequest request]
    (-> this (.getWorkflowRunAsync request))))

(defn import-catalog-to-glue-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.ImportCatalogToGlueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportCatalogToGlue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ImportCatalogToGlueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ImportCatalogToGlueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importCatalogToGlueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ImportCatalogToGlueRequest request]
    (-> this (.importCatalogToGlueAsync request))))

(defn get-partitions-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetPartitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPartitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetPartitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetPartitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPartitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetPartitionsRequest request]
    (-> this (.getPartitionsAsync request))))

(defn get-table-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTableResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableRequest request]
    (-> this (.getTableAsync request))))

(defn start-workflow-run-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.StartWorkflowRunRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartWorkflowRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartWorkflowRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartWorkflowRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startWorkflowRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartWorkflowRunRequest request]
    (-> this (.startWorkflowRunAsync request))))

(defn update-dev-endpoint-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateDevEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDevEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateDevEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateDevEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDevEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateDevEndpointRequest request]
    (-> this (.updateDevEndpointAsync request))))

(defn get-classifiers-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetClassifiersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetClassifiers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetClassifiersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetClassifiersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getClassifiersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetClassifiersRequest request]
    (-> this (.getClassifiersAsync request))))

(defn get-user-defined-function-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserDefinedFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetUserDefinedFunctionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserDefinedFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest request]
    (-> this (.getUserDefinedFunctionAsync request))))

(defn start-job-run-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.StartJobRunRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartJobRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartJobRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartJobRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startJobRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartJobRunRequest request]
    (-> this (.startJobRunAsync request))))

(defn get-dataflow-graph-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetDataflowGraphRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataflowGraph operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDataflowGraphResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDataflowGraphRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataflowGraphAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDataflowGraphRequest request]
    (-> this (.getDataflowGraphAsync request))))

(defn create-job-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateJobRequest request]
    (-> this (.createJobAsync request))))

(defn batch-get-crawlers-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchGetCrawlersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetCrawlers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchGetCrawlersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetCrawlersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetCrawlersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchGetCrawlersRequest request]
    (-> this (.batchGetCrawlersAsync request))))

(defn update-job-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateJobRequest request]
    (-> this (.updateJobAsync request))))

(defn create-table-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateTableResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateTableRequest request]
    (-> this (.createTableAsync request))))

(defn update-table-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateTableResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateTableRequest request]
    (-> this (.updateTableAsync request))))

(defn delete-crawler-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteCrawlerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteCrawlerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteCrawlerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCrawlerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteCrawlerRequest request]
    (-> this (.deleteCrawlerAsync request))))

(defn get-data-catalog-encryption-settings-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataCatalogEncryptionSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataCatalogEncryptionSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest request]
    (-> this (.getDataCatalogEncryptionSettingsAsync request))))

(defn delete-dev-endpoint-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteDevEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDevEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteDevEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteDevEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDevEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteDevEndpointRequest request]
    (-> this (.deleteDevEndpointAsync request))))

(defn batch-delete-partition-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchDeletePartitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeletePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchDeletePartitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeletePartitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeletePartitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeletePartitionRequest request]
    (-> this (.batchDeletePartitionAsync request))))

(defn delete-resource-policy-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeleteResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeleteResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeleteResourcePolicyRequest request]
    (-> this (.deleteResourcePolicyAsync request))))

(defn update-crawler-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateCrawlerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateCrawlerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateCrawlerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCrawlerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateCrawlerRequest request]
    (-> this (.updateCrawlerAsync request))))

(defn get-workflow-runs-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetWorkflowRunsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkflowRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetWorkflowRunsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkflowRunsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRunsRequest request]
    (-> this (.getWorkflowRunsAsync request))))

(defn batch-delete-connection-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchDeleteConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchDeleteConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchDeleteConnectionRequest request]
    (-> this (.batchDeleteConnectionAsync request))))

(defn get-partition-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetPartitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetPartitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetPartitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPartitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetPartitionRequest request]
    (-> this (.getPartitionAsync request))))

(defn create-classifier-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateClassifierRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClassifier operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateClassifierResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateClassifierRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClassifierAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateClassifierRequest request]
    (-> this (.createClassifierAsync request))))

(defn get-connection-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetConnectionRequest request]
    (-> this (.getConnectionAsync request))))

(defn get-databases-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetDatabasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDatabases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDatabasesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDatabasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDatabasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDatabasesRequest request]
    (-> this (.getDatabasesAsync request))))

(defn delete-partition-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.DeletePartitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.DeletePartitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeletePartitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePartitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.DeletePartitionRequest request]
    (-> this (.deletePartitionAsync request))))

(defn get-dev-endpoints-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetDevEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetDevEndpointsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDevEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetDevEndpointsRequest request]
    (-> this (.getDevEndpointsAsync request))))

(defn put-workflow-run-properties-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutWorkflowRunProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.PutWorkflowRunPropertiesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putWorkflowRunPropertiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest request]
    (-> this (.putWorkflowRunPropertiesAsync request))))

(defn list-triggers-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.ListTriggersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTriggers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.ListTriggersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListTriggersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTriggersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.ListTriggersRequest request]
    (-> this (.listTriggersAsync request))))

(defn create-partition-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreatePartitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreatePartitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreatePartitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPartitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreatePartitionRequest request]
    (-> this (.createPartitionAsync request))))

(defn create-connection-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateConnectionRequest request]
    (-> this (.createConnectionAsync request))))

(defn get-workflow-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetWorkflowRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetWorkflow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetWorkflowResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getWorkflowAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetWorkflowRequest request]
    (-> this (.getWorkflowAsync request))))

(defn get-table-version-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetTableVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTableVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTableVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTableVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTableVersionRequest request]
    (-> this (.getTableVersionAsync request))))

(defn get-security-configuration-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetSecurityConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSecurityConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetSecurityConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetSecurityConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSecurityConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetSecurityConfigurationRequest request]
    (-> this (.getSecurityConfigurationAsync request))))

(defn put-resource-policy-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.PutResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.PutResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.PutResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.PutResourcePolicyRequest request]
    (-> this (.putResourcePolicyAsync request))))

(defn start-crawler-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.StartCrawlerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartCrawlerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartCrawlerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startCrawlerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartCrawlerRequest request]
    (-> this (.startCrawlerAsync request))))

(defn batch-create-partition-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.BatchCreatePartitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchCreatePartition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.BatchCreatePartitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchCreatePartitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchCreatePartitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.BatchCreatePartitionRequest request]
    (-> this (.batchCreatePartitionAsync request))))

(defn update-connection-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateConnectionRequest request]
    (-> this (.updateConnectionAsync request))))

(defn update-crawler-schedule-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCrawlerSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCrawlerScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest request]
    (-> this (.updateCrawlerScheduleAsync request))))

(defn get-resource-policy-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetResourcePolicyRequest request]
    (-> this (.getResourcePolicyAsync request))))

(defn create-dev-endpoint-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateDevEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDevEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateDevEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateDevEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDevEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateDevEndpointRequest request]
    (-> this (.createDevEndpointAsync request))))

(defn get-job-runs-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetJobRunsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobRunsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRunsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobRunsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRunsRequest request]
    (-> this (.getJobRunsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn get-job-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRequest request]
    (-> this (.getJobAsync request))))

(defn get-job-run-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetJobRunRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetJobRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetJobRunRequest request]
    (-> this (.getJobRunAsync request))))

(defn create-script-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.CreateScriptRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateScript operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.CreateScriptResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateScriptRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createScriptAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.CreateScriptRequest request]
    (-> this (.createScriptAsync request))))

(defn get-crawler-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetCrawlerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCrawler operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetCrawlerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCrawlerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetCrawlerRequest request]
    (-> this (.getCrawlerAsync request))))

(defn update-user-defined-function-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserDefinedFunction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserDefinedFunctionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest request]
    (-> this (.updateUserDefinedFunctionAsync request))))

(defn start-crawler-schedule-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.StartCrawlerScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartCrawlerSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.StartCrawlerScheduleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartCrawlerScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startCrawlerScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.StartCrawlerScheduleRequest request]
    (-> this (.startCrawlerScheduleAsync request))))

(defn get-tags-async
  "Description copied from interface: AWSGlueAsync

  request - `com.amazonaws.services.glue.model.GetTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glue.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGlueAsync this ^com.amazonaws.services.glue.model.GetTagsRequest request]
    (-> this (.getTagsAsync request))))

