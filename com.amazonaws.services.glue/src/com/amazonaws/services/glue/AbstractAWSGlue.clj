(ns com.amazonaws.services.glue.AbstractAWSGlue
  "Abstract implementation of AWSGlue. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glue AbstractAWSGlue]))

(defn update-connection
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateConnectionRequest`

  returns: Result of the UpdateConnection operation returned by the service. - `com.amazonaws.services.glue.model.UpdateConnectionResult`"
  (^com.amazonaws.services.glue.model.UpdateConnectionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateConnectionRequest request]
    (-> this (.updateConnection request))))

(defn batch-delete-connection
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchDeleteConnectionRequest`

  returns: Result of the BatchDeleteConnection operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeleteConnectionResult`"
  (^com.amazonaws.services.glue.model.BatchDeleteConnectionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchDeleteConnectionRequest request]
    (-> this (.batchDeleteConnection request))))

(defn update-table
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateTableRequest`

  returns: Result of the UpdateTable operation returned by the service. - `com.amazonaws.services.glue.model.UpdateTableResult`"
  (^com.amazonaws.services.glue.model.UpdateTableResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateTableRequest request]
    (-> this (.updateTable request))))

(defn get-trigger
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetTriggerRequest`

  returns: Result of the GetTrigger operation returned by the service. - `com.amazonaws.services.glue.model.GetTriggerResult`"
  (^com.amazonaws.services.glue.model.GetTriggerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetTriggerRequest request]
    (-> this (.getTrigger request))))

(defn create-dev-endpoint
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateDevEndpointRequest`

  returns: Result of the CreateDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.CreateDevEndpointResult`"
  (^com.amazonaws.services.glue.model.CreateDevEndpointResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateDevEndpointRequest request]
    (-> this (.createDevEndpoint request))))

(defn delete-connection
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteConnectionRequest`

  returns: Result of the DeleteConnection operation returned by the service. - `com.amazonaws.services.glue.model.DeleteConnectionResult`"
  (^com.amazonaws.services.glue.model.DeleteConnectionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteConnectionRequest request]
    (-> this (.deleteConnection request))))

(defn put-data-catalog-encryption-settings
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest`

  returns: Result of the PutDataCatalogEncryptionSettings operation returned by the service. - `com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsResult`"
  (^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest request]
    (-> this (.putDataCatalogEncryptionSettings request))))

(defn get-job
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.glue.model.GetJobResult`"
  (^com.amazonaws.services.glue.model.GetJobResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetJobRequest request]
    (-> this (.getJob request))))

(defn create-classifier
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateClassifierRequest`

  returns: Result of the CreateClassifier operation returned by the service. - `com.amazonaws.services.glue.model.CreateClassifierResult`"
  (^com.amazonaws.services.glue.model.CreateClassifierResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateClassifierRequest request]
    (-> this (.createClassifier request))))

(defn get-job-run
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetJobRunRequest`

  returns: Result of the GetJobRun operation returned by the service. - `com.amazonaws.services.glue.model.GetJobRunResult`"
  (^com.amazonaws.services.glue.model.GetJobRunResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetJobRunRequest request]
    (-> this (.getJobRun request))))

(defn update-workflow
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateWorkflowRequest`

  returns: Result of the UpdateWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.UpdateWorkflowResult`"
  (^com.amazonaws.services.glue.model.UpdateWorkflowResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateWorkflowRequest request]
    (-> this (.updateWorkflow request))))

(defn delete-user-defined-function
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest`

  returns: Result of the DeleteUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult`"
  (^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest request]
    (-> this (.deleteUserDefinedFunction request))))

(defn get-workflow-runs
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetWorkflowRunsRequest`

  returns: Result of the GetWorkflowRuns operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowRunsResult`"
  (^com.amazonaws.services.glue.model.GetWorkflowRunsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetWorkflowRunsRequest request]
    (-> this (.getWorkflowRuns request))))

(defn reset-job-bookmark
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.ResetJobBookmarkRequest`

  returns: Result of the ResetJobBookmark operation returned by the service. - `com.amazonaws.services.glue.model.ResetJobBookmarkResult`"
  (^com.amazonaws.services.glue.model.ResetJobBookmarkResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.ResetJobBookmarkRequest request]
    (-> this (.resetJobBookmark request))))

(defn start-crawler
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.StartCrawlerRequest`

  returns: Result of the StartCrawler operation returned by the service. - `com.amazonaws.services.glue.model.StartCrawlerResult`"
  (^com.amazonaws.services.glue.model.StartCrawlerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.StartCrawlerRequest request]
    (-> this (.startCrawler request))))

(defn import-catalog-to-glue
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.ImportCatalogToGlueRequest`

  returns: Result of the ImportCatalogToGlue operation returned by the service. - `com.amazonaws.services.glue.model.ImportCatalogToGlueResult`"
  (^com.amazonaws.services.glue.model.ImportCatalogToGlueResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.ImportCatalogToGlueRequest request]
    (-> this (.importCatalogToGlue request))))

(defn get-triggers
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetTriggersRequest`

  returns: Result of the GetTriggers operation returned by the service. - `com.amazonaws.services.glue.model.GetTriggersResult`"
  (^com.amazonaws.services.glue.model.GetTriggersResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetTriggersRequest request]
    (-> this (.getTriggers request))))

(defn get-database
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetDatabaseRequest`

  returns: Result of the GetDatabase operation returned by the service. - `com.amazonaws.services.glue.model.GetDatabaseResult`"
  (^com.amazonaws.services.glue.model.GetDatabaseResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetDatabaseRequest request]
    (-> this (.getDatabase request))))

(defn batch-create-partition
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchCreatePartitionRequest`

  returns: Result of the BatchCreatePartition operation returned by the service. - `com.amazonaws.services.glue.model.BatchCreatePartitionResult`"
  (^com.amazonaws.services.glue.model.BatchCreatePartitionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchCreatePartitionRequest request]
    (-> this (.batchCreatePartition request))))

(defn get-job-bookmark
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetJobBookmarkRequest`

  returns: Result of the GetJobBookmark operation returned by the service. - `com.amazonaws.services.glue.model.GetJobBookmarkResult`"
  (^com.amazonaws.services.glue.model.GetJobBookmarkResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetJobBookmarkRequest request]
    (-> this (.getJobBookmark request))))

(defn delete-security-configuration
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest`

  returns: Result of the DeleteSecurityConfiguration operation returned by the service. - `com.amazonaws.services.glue.model.DeleteSecurityConfigurationResult`"
  (^com.amazonaws.services.glue.model.DeleteSecurityConfigurationResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest request]
    (-> this (.deleteSecurityConfiguration request))))

(defn get-databases
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetDatabasesRequest`

  returns: Result of the GetDatabases operation returned by the service. - `com.amazonaws.services.glue.model.GetDatabasesResult`"
  (^com.amazonaws.services.glue.model.GetDatabasesResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetDatabasesRequest request]
    (-> this (.getDatabases request))))

(defn update-crawler-schedule
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest`

  returns: Result of the UpdateCrawlerSchedule operation returned by the service. - `com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult`"
  (^com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest request]
    (-> this (.updateCrawlerSchedule request))))

(defn get-dataflow-graph
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetDataflowGraphRequest`

  returns: Result of the GetDataflowGraph operation returned by the service. - `com.amazonaws.services.glue.model.GetDataflowGraphResult`"
  (^com.amazonaws.services.glue.model.GetDataflowGraphResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetDataflowGraphRequest request]
    (-> this (.getDataflowGraph request))))

(defn stop-trigger
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.StopTriggerRequest`

  returns: Result of the StopTrigger operation returned by the service. - `com.amazonaws.services.glue.model.StopTriggerResult`"
  (^com.amazonaws.services.glue.model.StopTriggerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.StopTriggerRequest request]
    (-> this (.stopTrigger request))))

(defn get-table-versions
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetTableVersionsRequest`

  returns: Result of the GetTableVersions operation returned by the service. - `com.amazonaws.services.glue.model.GetTableVersionsResult`"
  (^com.amazonaws.services.glue.model.GetTableVersionsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetTableVersionsRequest request]
    (-> this (.getTableVersions request))))

(defn batch-stop-job-run
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchStopJobRunRequest`

  returns: Result of the BatchStopJobRun operation returned by the service. - `com.amazonaws.services.glue.model.BatchStopJobRunResult`"
  (^com.amazonaws.services.glue.model.BatchStopJobRunResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchStopJobRunRequest request]
    (-> this (.batchStopJobRun request))))

(defn delete-resource-policy
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteResourcePolicyRequest`

  returns: Result of the DeleteResourcePolicy operation returned by the service. - `com.amazonaws.services.glue.model.DeleteResourcePolicyResult`"
  (^com.amazonaws.services.glue.model.DeleteResourcePolicyResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteResourcePolicyRequest request]
    (-> this (.deleteResourcePolicy request))))

(defn untag-resource
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.glue.model.UntagResourceResult`"
  (^com.amazonaws.services.glue.model.UntagResourceResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn start-crawler-schedule
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.StartCrawlerScheduleRequest`

  returns: Result of the StartCrawlerSchedule operation returned by the service. - `com.amazonaws.services.glue.model.StartCrawlerScheduleResult`"
  (^com.amazonaws.services.glue.model.StartCrawlerScheduleResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.StartCrawlerScheduleRequest request]
    (-> this (.startCrawlerSchedule request))))

(defn get-job-runs
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetJobRunsRequest`

  returns: Result of the GetJobRuns operation returned by the service. - `com.amazonaws.services.glue.model.GetJobRunsResult`"
  (^com.amazonaws.services.glue.model.GetJobRunsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetJobRunsRequest request]
    (-> this (.getJobRuns request))))

(defn update-trigger
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateTriggerRequest`

  returns: Result of the UpdateTrigger operation returned by the service. - `com.amazonaws.services.glue.model.UpdateTriggerResult`"
  (^com.amazonaws.services.glue.model.UpdateTriggerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateTriggerRequest request]
    (-> this (.updateTrigger request))))

(defn get-table-version
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetTableVersionRequest`

  returns: Result of the GetTableVersion operation returned by the service. - `com.amazonaws.services.glue.model.GetTableVersionResult`"
  (^com.amazonaws.services.glue.model.GetTableVersionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetTableVersionRequest request]
    (-> this (.getTableVersion request))))

(defn delete-dev-endpoint
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteDevEndpointRequest`

  returns: Result of the DeleteDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.DeleteDevEndpointResult`"
  (^com.amazonaws.services.glue.model.DeleteDevEndpointResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteDevEndpointRequest request]
    (-> this (.deleteDevEndpoint request))))

(defn get-security-configuration
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetSecurityConfigurationRequest`

  returns: Result of the GetSecurityConfiguration operation returned by the service. - `com.amazonaws.services.glue.model.GetSecurityConfigurationResult`"
  (^com.amazonaws.services.glue.model.GetSecurityConfigurationResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetSecurityConfigurationRequest request]
    (-> this (.getSecurityConfiguration request))))

(defn get-tables
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetTablesRequest`

  returns: Result of the GetTables operation returned by the service. - `com.amazonaws.services.glue.model.GetTablesResult`"
  (^com.amazonaws.services.glue.model.GetTablesResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetTablesRequest request]
    (-> this (.getTables request))))

(defn delete-classifier
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteClassifierRequest`

  returns: Result of the DeleteClassifier operation returned by the service. - `com.amazonaws.services.glue.model.DeleteClassifierResult`"
  (^com.amazonaws.services.glue.model.DeleteClassifierResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteClassifierRequest request]
    (-> this (.deleteClassifier request))))

(defn update-job
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.glue.model.UpdateJobResult`"
  (^com.amazonaws.services.glue.model.UpdateJobResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn delete-trigger
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteTriggerRequest`

  returns: Result of the DeleteTrigger operation returned by the service. - `com.amazonaws.services.glue.model.DeleteTriggerResult`"
  (^com.amazonaws.services.glue.model.DeleteTriggerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteTriggerRequest request]
    (-> this (.deleteTrigger request))))

(defn get-crawler-metrics
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetCrawlerMetricsRequest`

  returns: Result of the GetCrawlerMetrics operation returned by the service. - `com.amazonaws.services.glue.model.GetCrawlerMetricsResult`"
  (^com.amazonaws.services.glue.model.GetCrawlerMetricsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetCrawlerMetricsRequest request]
    (-> this (.getCrawlerMetrics request))))

(defn update-crawler
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateCrawlerRequest`

  returns: Result of the UpdateCrawler operation returned by the service. - `com.amazonaws.services.glue.model.UpdateCrawlerResult`"
  (^com.amazonaws.services.glue.model.UpdateCrawlerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateCrawlerRequest request]
    (-> this (.updateCrawler request))))

(defn get-crawlers
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetCrawlersRequest`

  returns: Result of the GetCrawlers operation returned by the service. - `com.amazonaws.services.glue.model.GetCrawlersResult`"
  (^com.amazonaws.services.glue.model.GetCrawlersResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetCrawlersRequest request]
    (-> this (.getCrawlers request))))

(defn get-data-catalog-encryption-settings
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest`

  returns: Result of the GetDataCatalogEncryptionSettings operation returned by the service. - `com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsResult`"
  (^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest request]
    (-> this (.getDataCatalogEncryptionSettings request))))

(defn create-script
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateScriptRequest`

  returns: Result of the CreateScript operation returned by the service. - `com.amazonaws.services.glue.model.CreateScriptResult`"
  (^com.amazonaws.services.glue.model.CreateScriptResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateScriptRequest request]
    (-> this (.createScript request))))

(defn delete-partition
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeletePartitionRequest`

  returns: Result of the DeletePartition operation returned by the service. - `com.amazonaws.services.glue.model.DeletePartitionResult`"
  (^com.amazonaws.services.glue.model.DeletePartitionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeletePartitionRequest request]
    (-> this (.deletePartition request))))

(defn delete-job
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteJobRequest`

  returns: Result of the DeleteJob operation returned by the service. - `com.amazonaws.services.glue.model.DeleteJobResult`"
  (^com.amazonaws.services.glue.model.DeleteJobResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteJobRequest request]
    (-> this (.deleteJob request))))

(defn update-dev-endpoint
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateDevEndpointRequest`

  returns: Result of the UpdateDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.UpdateDevEndpointResult`"
  (^com.amazonaws.services.glue.model.UpdateDevEndpointResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateDevEndpointRequest request]
    (-> this (.updateDevEndpoint request))))

(defn get-partitions
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetPartitionsRequest`

  returns: Result of the GetPartitions operation returned by the service. - `com.amazonaws.services.glue.model.GetPartitionsResult`"
  (^com.amazonaws.services.glue.model.GetPartitionsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetPartitionsRequest request]
    (-> this (.getPartitions request))))

(defn get-workflow-run-properties
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest`

  returns: Result of the GetWorkflowRunProperties operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowRunPropertiesResult`"
  (^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest request]
    (-> this (.getWorkflowRunProperties request))))

(defn create-user-defined-function
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest`

  returns: Result of the CreateUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult`"
  (^com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest request]
    (-> this (.createUserDefinedFunction request))))

(defn start-job-run
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.StartJobRunRequest`

  returns: Result of the StartJobRun operation returned by the service. - `com.amazonaws.services.glue.model.StartJobRunResult`"
  (^com.amazonaws.services.glue.model.StartJobRunResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.StartJobRunRequest request]
    (-> this (.startJobRun request))))

(defn create-partition
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreatePartitionRequest`

  returns: Result of the CreatePartition operation returned by the service. - `com.amazonaws.services.glue.model.CreatePartitionResult`"
  (^com.amazonaws.services.glue.model.CreatePartitionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreatePartitionRequest request]
    (-> this (.createPartition request))))

(defn delete-table
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteTableRequest`

  returns: Result of the DeleteTable operation returned by the service. - `com.amazonaws.services.glue.model.DeleteTableResult`"
  (^com.amazonaws.services.glue.model.DeleteTableResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteTableRequest request]
    (-> this (.deleteTable request))))

(defn list-crawlers
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.ListCrawlersRequest`

  returns: Result of the ListCrawlers operation returned by the service. - `com.amazonaws.services.glue.model.ListCrawlersResult`"
  (^com.amazonaws.services.glue.model.ListCrawlersResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.ListCrawlersRequest request]
    (-> this (.listCrawlers request))))

(defn get-user-defined-functions
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest`

  returns: Result of the GetUserDefinedFunctions operation returned by the service. - `com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult`"
  (^com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest request]
    (-> this (.getUserDefinedFunctions request))))

(defn put-resource-policy
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.PutResourcePolicyRequest`

  returns: Result of the PutResourcePolicy operation returned by the service. - `com.amazonaws.services.glue.model.PutResourcePolicyResult`"
  (^com.amazonaws.services.glue.model.PutResourcePolicyResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.PutResourcePolicyRequest request]
    (-> this (.putResourcePolicy request))))

(defn batch-get-jobs
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchGetJobsRequest`

  returns: Result of the BatchGetJobs operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetJobsResult`"
  (^com.amazonaws.services.glue.model.BatchGetJobsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchGetJobsRequest request]
    (-> this (.batchGetJobs request))))

(defn batch-delete-partition
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchDeletePartitionRequest`

  returns: Result of the BatchDeletePartition operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeletePartitionResult`"
  (^com.amazonaws.services.glue.model.BatchDeletePartitionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchDeletePartitionRequest request]
    (-> this (.batchDeletePartition request))))

(defn start-trigger
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.StartTriggerRequest`

  returns: Result of the StartTrigger operation returned by the service. - `com.amazonaws.services.glue.model.StartTriggerResult`"
  (^com.amazonaws.services.glue.model.StartTriggerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.StartTriggerRequest request]
    (-> this (.startTrigger request))))

(defn create-security-configuration
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest`

  returns: Result of the CreateSecurityConfiguration operation returned by the service. - `com.amazonaws.services.glue.model.CreateSecurityConfigurationResult`"
  (^com.amazonaws.services.glue.model.CreateSecurityConfigurationResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest request]
    (-> this (.createSecurityConfiguration request))))

(defn batch-get-crawlers
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchGetCrawlersRequest`

  returns: Result of the BatchGetCrawlers operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetCrawlersResult`"
  (^com.amazonaws.services.glue.model.BatchGetCrawlersResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchGetCrawlersRequest request]
    (-> this (.batchGetCrawlers request))))

(defn shutdown
  "Description copied from interface: AWSGlue"
  ([^AbstractAWSGlue this]
    (-> this (.shutdown))))

(defn list-dev-endpoints
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.ListDevEndpointsRequest`

  returns: Result of the ListDevEndpoints operation returned by the service. - `com.amazonaws.services.glue.model.ListDevEndpointsResult`"
  (^com.amazonaws.services.glue.model.ListDevEndpointsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.ListDevEndpointsRequest request]
    (-> this (.listDevEndpoints request))))

(defn get-plan
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetPlanRequest`

  returns: Result of the GetPlan operation returned by the service. - `com.amazonaws.services.glue.model.GetPlanResult`"
  (^com.amazonaws.services.glue.model.GetPlanResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetPlanRequest request]
    (-> this (.getPlan request))))

(defn batch-get-dev-endpoints
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest`

  returns: Result of the BatchGetDevEndpoints operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetDevEndpointsResult`"
  (^com.amazonaws.services.glue.model.BatchGetDevEndpointsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest request]
    (-> this (.batchGetDevEndpoints request))))

(defn list-workflows
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.ListWorkflowsRequest`

  returns: Result of the ListWorkflows operation returned by the service. - `com.amazonaws.services.glue.model.ListWorkflowsResult`"
  (^com.amazonaws.services.glue.model.ListWorkflowsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.ListWorkflowsRequest request]
    (-> this (.listWorkflows request))))

(defn put-workflow-run-properties
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest`

  returns: Result of the PutWorkflowRunProperties operation returned by the service. - `com.amazonaws.services.glue.model.PutWorkflowRunPropertiesResult`"
  (^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest request]
    (-> this (.putWorkflowRunProperties request))))

(defn get-dev-endpoints
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetDevEndpointsRequest`

  returns: Result of the GetDevEndpoints operation returned by the service. - `com.amazonaws.services.glue.model.GetDevEndpointsResult`"
  (^com.amazonaws.services.glue.model.GetDevEndpointsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetDevEndpointsRequest request]
    (-> this (.getDevEndpoints request))))

(defn update-database
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateDatabaseRequest`

  returns: Result of the UpdateDatabase operation returned by the service. - `com.amazonaws.services.glue.model.UpdateDatabaseResult`"
  (^com.amazonaws.services.glue.model.UpdateDatabaseResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateDatabaseRequest request]
    (-> this (.updateDatabase request))))

(defn create-connection
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateConnectionRequest`

  returns: Result of the CreateConnection operation returned by the service. - `com.amazonaws.services.glue.model.CreateConnectionResult`"
  (^com.amazonaws.services.glue.model.CreateConnectionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateConnectionRequest request]
    (-> this (.createConnection request))))

(defn get-user-defined-function
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest`

  returns: Result of the GetUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.GetUserDefinedFunctionResult`"
  (^com.amazonaws.services.glue.model.GetUserDefinedFunctionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest request]
    (-> this (.getUserDefinedFunction request))))

(defn create-workflow
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateWorkflowRequest`

  returns: Result of the CreateWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.CreateWorkflowResult`"
  (^com.amazonaws.services.glue.model.CreateWorkflowResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateWorkflowRequest request]
    (-> this (.createWorkflow request))))

(defn delete-crawler
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteCrawlerRequest`

  returns: Result of the DeleteCrawler operation returned by the service. - `com.amazonaws.services.glue.model.DeleteCrawlerResult`"
  (^com.amazonaws.services.glue.model.DeleteCrawlerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteCrawlerRequest request]
    (-> this (.deleteCrawler request))))

(defn delete-workflow
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteWorkflowRequest`

  returns: Result of the DeleteWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.DeleteWorkflowResult`"
  (^com.amazonaws.services.glue.model.DeleteWorkflowResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteWorkflowRequest request]
    (-> this (.deleteWorkflow request))))

(defn list-jobs
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.glue.model.ListJobsResult`"
  (^com.amazonaws.services.glue.model.ListJobsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn get-tags
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.glue.model.GetTagsResult`"
  (^com.amazonaws.services.glue.model.GetTagsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetTagsRequest request]
    (-> this (.getTags request))))

(defn delete-table-version
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteTableVersionRequest`

  returns: Result of the DeleteTableVersion operation returned by the service. - `com.amazonaws.services.glue.model.DeleteTableVersionResult`"
  (^com.amazonaws.services.glue.model.DeleteTableVersionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteTableVersionRequest request]
    (-> this (.deleteTableVersion request))))

(defn create-trigger
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateTriggerRequest`

  returns: Result of the CreateTrigger operation returned by the service. - `com.amazonaws.services.glue.model.CreateTriggerResult`"
  (^com.amazonaws.services.glue.model.CreateTriggerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateTriggerRequest request]
    (-> this (.createTrigger request))))

(defn batch-get-triggers
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchGetTriggersRequest`

  returns: Result of the BatchGetTriggers operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetTriggersResult`"
  (^com.amazonaws.services.glue.model.BatchGetTriggersResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchGetTriggersRequest request]
    (-> this (.batchGetTriggers request))))

(defn stop-crawler-schedule
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.StopCrawlerScheduleRequest`

  returns: Result of the StopCrawlerSchedule operation returned by the service. - `com.amazonaws.services.glue.model.StopCrawlerScheduleResult`"
  (^com.amazonaws.services.glue.model.StopCrawlerScheduleResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.StopCrawlerScheduleRequest request]
    (-> this (.stopCrawlerSchedule request))))

(defn get-jobs
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetJobsRequest`

  returns: Result of the GetJobs operation returned by the service. - `com.amazonaws.services.glue.model.GetJobsResult`"
  (^com.amazonaws.services.glue.model.GetJobsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetJobsRequest request]
    (-> this (.getJobs request))))

(defn get-classifiers
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetClassifiersRequest`

  returns: Result of the GetClassifiers operation returned by the service. - `com.amazonaws.services.glue.model.GetClassifiersResult`"
  (^com.amazonaws.services.glue.model.GetClassifiersResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetClassifiersRequest request]
    (-> this (.getClassifiers request))))

(defn get-job-bookmarks
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetJobBookmarksRequest`

  returns: Result of the GetJobBookmarks operation returned by the service. - `com.amazonaws.services.glue.model.GetJobBookmarksResult`"
  (^com.amazonaws.services.glue.model.GetJobBookmarksResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetJobBookmarksRequest request]
    (-> this (.getJobBookmarks request))))

(defn get-workflow-run
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetWorkflowRunRequest`

  returns: Result of the GetWorkflowRun operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowRunResult`"
  (^com.amazonaws.services.glue.model.GetWorkflowRunResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetWorkflowRunRequest request]
    (-> this (.getWorkflowRun request))))

(defn get-crawler
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetCrawlerRequest`

  returns: Result of the GetCrawler operation returned by the service. - `com.amazonaws.services.glue.model.GetCrawlerResult`"
  (^com.amazonaws.services.glue.model.GetCrawlerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetCrawlerRequest request]
    (-> this (.getCrawler request))))

(defn get-partition
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetPartitionRequest`

  returns: Result of the GetPartition operation returned by the service. - `com.amazonaws.services.glue.model.GetPartitionResult`"
  (^com.amazonaws.services.glue.model.GetPartitionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetPartitionRequest request]
    (-> this (.getPartition request))))

(defn get-resource-policy
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetResourcePolicyRequest`

  returns: Result of the GetResourcePolicy operation returned by the service. - `com.amazonaws.services.glue.model.GetResourcePolicyResult`"
  (^com.amazonaws.services.glue.model.GetResourcePolicyResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetResourcePolicyRequest request]
    (-> this (.getResourcePolicy request))))

(defn get-connection
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetConnectionRequest`

  returns: Result of the GetConnection operation returned by the service. - `com.amazonaws.services.glue.model.GetConnectionResult`"
  (^com.amazonaws.services.glue.model.GetConnectionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetConnectionRequest request]
    (-> this (.getConnection request))))

(defn create-table
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateTableRequest`

  returns: Result of the CreateTable operation returned by the service. - `com.amazonaws.services.glue.model.CreateTableResult`"
  (^com.amazonaws.services.glue.model.CreateTableResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateTableRequest request]
    (-> this (.createTable request))))

(defn update-partition
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdatePartitionRequest`

  returns: Result of the UpdatePartition operation returned by the service. - `com.amazonaws.services.glue.model.UpdatePartitionResult`"
  (^com.amazonaws.services.glue.model.UpdatePartitionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdatePartitionRequest request]
    (-> this (.updatePartition request))))

(defn update-classifier
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateClassifierRequest`

  returns: Result of the UpdateClassifier operation returned by the service. - `com.amazonaws.services.glue.model.UpdateClassifierResult`"
  (^com.amazonaws.services.glue.model.UpdateClassifierResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateClassifierRequest request]
    (-> this (.updateClassifier request))))

(defn batch-get-workflows
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchGetWorkflowsRequest`

  returns: Result of the BatchGetWorkflows operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetWorkflowsResult`"
  (^com.amazonaws.services.glue.model.BatchGetWorkflowsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchGetWorkflowsRequest request]
    (-> this (.batchGetWorkflows request))))

(defn list-triggers
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.ListTriggersRequest`

  returns: Result of the ListTriggers operation returned by the service. - `com.amazonaws.services.glue.model.ListTriggersResult`"
  (^com.amazonaws.services.glue.model.ListTriggersResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.ListTriggersRequest request]
    (-> this (.listTriggers request))))

(defn get-dev-endpoint
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetDevEndpointRequest`

  returns: Result of the GetDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.GetDevEndpointResult`"
  (^com.amazonaws.services.glue.model.GetDevEndpointResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetDevEndpointRequest request]
    (-> this (.getDevEndpoint request))))

(defn get-table
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetTableRequest`

  returns: Result of the GetTable operation returned by the service. - `com.amazonaws.services.glue.model.GetTableResult`"
  (^com.amazonaws.services.glue.model.GetTableResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetTableRequest request]
    (-> this (.getTable request))))

(defn get-workflow
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetWorkflowRequest`

  returns: Result of the GetWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowResult`"
  (^com.amazonaws.services.glue.model.GetWorkflowResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetWorkflowRequest request]
    (-> this (.getWorkflow request))))

(defn get-mapping
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetMappingRequest`

  returns: Result of the GetMapping operation returned by the service. - `com.amazonaws.services.glue.model.GetMappingResult`"
  (^com.amazonaws.services.glue.model.GetMappingResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetMappingRequest request]
    (-> this (.getMapping request))))

(defn get-security-configurations
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest`

  returns: Result of the GetSecurityConfigurations operation returned by the service. - `com.amazonaws.services.glue.model.GetSecurityConfigurationsResult`"
  (^com.amazonaws.services.glue.model.GetSecurityConfigurationsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest request]
    (-> this (.getSecurityConfigurations request))))

(defn get-connections
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetConnectionsRequest`

  returns: Result of the GetConnections operation returned by the service. - `com.amazonaws.services.glue.model.GetConnectionsResult`"
  (^com.amazonaws.services.glue.model.GetConnectionsResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetConnectionsRequest request]
    (-> this (.getConnections request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSGlue

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSGlue this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn stop-crawler
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.StopCrawlerRequest`

  returns: Result of the StopCrawler operation returned by the service. - `com.amazonaws.services.glue.model.StopCrawlerResult`"
  (^com.amazonaws.services.glue.model.StopCrawlerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.StopCrawlerRequest request]
    (-> this (.stopCrawler request))))

(defn create-job
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.glue.model.CreateJobResult`"
  (^com.amazonaws.services.glue.model.CreateJobResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn create-database
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateDatabaseRequest`

  returns: Result of the CreateDatabase operation returned by the service. - `com.amazonaws.services.glue.model.CreateDatabaseResult`"
  (^com.amazonaws.services.glue.model.CreateDatabaseResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateDatabaseRequest request]
    (-> this (.createDatabase request))))

(defn tag-resource
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.glue.model.TagResourceResult`"
  (^com.amazonaws.services.glue.model.TagResourceResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-classifier
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetClassifierRequest`

  returns: Result of the GetClassifier operation returned by the service. - `com.amazonaws.services.glue.model.GetClassifierResult`"
  (^com.amazonaws.services.glue.model.GetClassifierResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetClassifierRequest request]
    (-> this (.getClassifier request))))

(defn start-workflow-run
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.StartWorkflowRunRequest`

  returns: Result of the StartWorkflowRun operation returned by the service. - `com.amazonaws.services.glue.model.StartWorkflowRunResult`"
  (^com.amazonaws.services.glue.model.StartWorkflowRunResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.StartWorkflowRunRequest request]
    (-> this (.startWorkflowRun request))))

(defn batch-delete-table
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchDeleteTableRequest`

  returns: Result of the BatchDeleteTable operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeleteTableResult`"
  (^com.amazonaws.services.glue.model.BatchDeleteTableResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchDeleteTableRequest request]
    (-> this (.batchDeleteTable request))))

(defn update-user-defined-function
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest`

  returns: Result of the UpdateUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult`"
  (^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest request]
    (-> this (.updateUserDefinedFunction request))))

(defn delete-database
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.DeleteDatabaseRequest`

  returns: Result of the DeleteDatabase operation returned by the service. - `com.amazonaws.services.glue.model.DeleteDatabaseResult`"
  (^com.amazonaws.services.glue.model.DeleteDatabaseResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.DeleteDatabaseRequest request]
    (-> this (.deleteDatabase request))))

(defn batch-delete-table-version
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest`

  returns: Result of the BatchDeleteTableVersion operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeleteTableVersionResult`"
  (^com.amazonaws.services.glue.model.BatchDeleteTableVersionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest request]
    (-> this (.batchDeleteTableVersion request))))

(defn get-catalog-import-status
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.GetCatalogImportStatusRequest`

  returns: Result of the GetCatalogImportStatus operation returned by the service. - `com.amazonaws.services.glue.model.GetCatalogImportStatusResult`"
  (^com.amazonaws.services.glue.model.GetCatalogImportStatusResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.GetCatalogImportStatusRequest request]
    (-> this (.getCatalogImportStatus request))))

(defn create-crawler
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.CreateCrawlerRequest`

  returns: Result of the CreateCrawler operation returned by the service. - `com.amazonaws.services.glue.model.CreateCrawlerResult`"
  (^com.amazonaws.services.glue.model.CreateCrawlerResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.CreateCrawlerRequest request]
    (-> this (.createCrawler request))))

(defn batch-get-partition
  "Description copied from interface: AWSGlue

  request - `com.amazonaws.services.glue.model.BatchGetPartitionRequest`

  returns: Result of the BatchGetPartition operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetPartitionResult`"
  (^com.amazonaws.services.glue.model.BatchGetPartitionResult [^AbstractAWSGlue this ^com.amazonaws.services.glue.model.BatchGetPartitionRequest request]
    (-> this (.batchGetPartition request))))

