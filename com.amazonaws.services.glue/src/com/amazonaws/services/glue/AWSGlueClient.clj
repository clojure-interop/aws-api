(ns com.amazonaws.services.glue.AWSGlueClient
  "Client for accessing AWS Glue. All service calls made using this client are blocking, and will not return until the
  service call completes.

  AWS Glue

  Defines the public endpoint for the AWS Glue service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glue AWSGlueClient]))

(defn *builder
  "returns: `com.amazonaws.services.glue.AWSGlueClientBuilder`"
  (^com.amazonaws.services.glue.AWSGlueClientBuilder []
    (AWSGlueClient/builder )))

(defn update-connection
  "Updates a connection definition in the Data Catalog.

  request - `com.amazonaws.services.glue.model.UpdateConnectionRequest`

  returns: Result of the UpdateConnection operation returned by the service. - `com.amazonaws.services.glue.model.UpdateConnectionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateConnectionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateConnectionRequest request]
    (-> this (.updateConnection request))))

(defn batch-delete-connection
  "Deletes a list of connection definitions from the Data Catalog.

  request - `com.amazonaws.services.glue.model.BatchDeleteConnectionRequest`

  returns: Result of the BatchDeleteConnection operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeleteConnectionResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.BatchDeleteConnectionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchDeleteConnectionRequest request]
    (-> this (.batchDeleteConnection request))))

(defn update-table
  "Updates a metadata table in the Data Catalog.

  request - `com.amazonaws.services.glue.model.UpdateTableRequest`

  returns: Result of the UpdateTable operation returned by the service. - `com.amazonaws.services.glue.model.UpdateTableResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateTableResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateTableRequest request]
    (-> this (.updateTable request))))

(defn get-trigger
  "Retrieves the definition of a trigger.

  request - `com.amazonaws.services.glue.model.GetTriggerRequest`

  returns: Result of the GetTrigger operation returned by the service. - `com.amazonaws.services.glue.model.GetTriggerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTriggerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetTriggerRequest request]
    (-> this (.getTrigger request))))

(defn create-dev-endpoint
  "Creates a new development endpoint.

  request - `com.amazonaws.services.glue.model.CreateDevEndpointRequest`

  returns: Result of the CreateDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.CreateDevEndpointResult`

  throws: com.amazonaws.services.glue.model.AccessDeniedException - Access to a resource was denied."
  (^com.amazonaws.services.glue.model.CreateDevEndpointResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateDevEndpointRequest request]
    (-> this (.createDevEndpoint request))))

(defn delete-connection
  "Deletes a connection from the Data Catalog.

  request - `com.amazonaws.services.glue.model.DeleteConnectionRequest`

  returns: Result of the DeleteConnection operation returned by the service. - `com.amazonaws.services.glue.model.DeleteConnectionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteConnectionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteConnectionRequest request]
    (-> this (.deleteConnection request))))

(defn put-data-catalog-encryption-settings
  "Sets the security configuration for a specified catalog. After the configuration has been set, the specified
   encryption is applied to every catalog write thereafter.

  request - `com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest`

  returns: Result of the PutDataCatalogEncryptionSettings operation returned by the service. - `com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest request]
    (-> this (.putDataCatalogEncryptionSettings request))))

(defn get-job
  "Retrieves an existing job definition.

  request - `com.amazonaws.services.glue.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.glue.model.GetJobResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetJobRequest request]
    (-> this (.getJob request))))

(defn create-classifier
  "Creates a classifier in the user's account. This can be a GrokClassifier, an
   XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which
   field of the request is present.

  request - `com.amazonaws.services.glue.model.CreateClassifierRequest`

  returns: Result of the CreateClassifier operation returned by the service. - `com.amazonaws.services.glue.model.CreateClassifierResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateClassifierResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateClassifierRequest request]
    (-> this (.createClassifier request))))

(defn get-job-run
  "Retrieves the metadata for a given job run.

  request - `com.amazonaws.services.glue.model.GetJobRunRequest`

  returns: Result of the GetJobRun operation returned by the service. - `com.amazonaws.services.glue.model.GetJobRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobRunResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetJobRunRequest request]
    (-> this (.getJobRun request))))

(defn update-workflow
  "Updates an existing workflow.

  request - `com.amazonaws.services.glue.model.UpdateWorkflowRequest`

  returns: Result of the UpdateWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.UpdateWorkflowResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateWorkflowResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateWorkflowRequest request]
    (-> this (.updateWorkflow request))))

(defn delete-user-defined-function
  "Deletes an existing function definition from the Data Catalog.

  request - `com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest`

  returns: Result of the DeleteUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest request]
    (-> this (.deleteUserDefinedFunction request))))

(defn get-workflow-runs
  "Retrieves metadata for all runs of a given workflow.

  request - `com.amazonaws.services.glue.model.GetWorkflowRunsRequest`

  returns: Result of the GetWorkflowRuns operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowRunsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetWorkflowRunsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetWorkflowRunsRequest request]
    (-> this (.getWorkflowRuns request))))

(defn reset-job-bookmark
  "Resets a bookmark entry.

  request - `com.amazonaws.services.glue.model.ResetJobBookmarkRequest`

  returns: Result of the ResetJobBookmark operation returned by the service. - `com.amazonaws.services.glue.model.ResetJobBookmarkResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.ResetJobBookmarkResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.ResetJobBookmarkRequest request]
    (-> this (.resetJobBookmark request))))

(defn start-crawler
  "Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running,
   returns a CrawlerRunningException.

  request - `com.amazonaws.services.glue.model.StartCrawlerRequest`

  returns: Result of the StartCrawler operation returned by the service. - `com.amazonaws.services.glue.model.StartCrawlerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.StartCrawlerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.StartCrawlerRequest request]
    (-> this (.startCrawler request))))

(defn import-catalog-to-glue
  "Imports an existing Athena Data Catalog to AWS Glue

  request - `com.amazonaws.services.glue.model.ImportCatalogToGlueRequest`

  returns: Result of the ImportCatalogToGlue operation returned by the service. - `com.amazonaws.services.glue.model.ImportCatalogToGlueResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.ImportCatalogToGlueResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.ImportCatalogToGlueRequest request]
    (-> this (.importCatalogToGlue request))))

(defn get-triggers
  "Gets all the triggers associated with a job.

  request - `com.amazonaws.services.glue.model.GetTriggersRequest`

  returns: Result of the GetTriggers operation returned by the service. - `com.amazonaws.services.glue.model.GetTriggersResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTriggersResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetTriggersRequest request]
    (-> this (.getTriggers request))))

(defn get-database
  "Retrieves the definition of a specified database.

  request - `com.amazonaws.services.glue.model.GetDatabaseRequest`

  returns: Result of the GetDatabase operation returned by the service. - `com.amazonaws.services.glue.model.GetDatabaseResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetDatabaseResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetDatabaseRequest request]
    (-> this (.getDatabase request))))

(defn batch-create-partition
  "Creates one or more partitions in a batch operation.

  request - `com.amazonaws.services.glue.model.BatchCreatePartitionRequest`

  returns: Result of the BatchCreatePartition operation returned by the service. - `com.amazonaws.services.glue.model.BatchCreatePartitionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchCreatePartitionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchCreatePartitionRequest request]
    (-> this (.batchCreatePartition request))))

(defn get-job-bookmark
  "Returns information on a job bookmark entry.

  request - `com.amazonaws.services.glue.model.GetJobBookmarkRequest`

  returns: Result of the GetJobBookmark operation returned by the service. - `com.amazonaws.services.glue.model.GetJobBookmarkResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetJobBookmarkResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetJobBookmarkRequest request]
    (-> this (.getJobBookmark request))))

(defn delete-security-configuration
  "Deletes a specified security configuration.

  request - `com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest`

  returns: Result of the DeleteSecurityConfiguration operation returned by the service. - `com.amazonaws.services.glue.model.DeleteSecurityConfigurationResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteSecurityConfigurationResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest request]
    (-> this (.deleteSecurityConfiguration request))))

(defn get-databases
  "Retrieves all Databases defined in a given Data Catalog.

  request - `com.amazonaws.services.glue.model.GetDatabasesRequest`

  returns: Result of the GetDatabases operation returned by the service. - `com.amazonaws.services.glue.model.GetDatabasesResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetDatabasesResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetDatabasesRequest request]
    (-> this (.getDatabases request))))

(defn update-crawler-schedule
  "Updates the schedule of a crawler using a cron expression.

  request - `com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest`

  returns: Result of the UpdateCrawlerSchedule operation returned by the service. - `com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest request]
    (-> this (.updateCrawlerSchedule request))))

(defn get-dataflow-graph
  "Transforms a Python script into a directed acyclic graph (DAG).

  request - `com.amazonaws.services.glue.model.GetDataflowGraphRequest`

  returns: Result of the GetDataflowGraph operation returned by the service. - `com.amazonaws.services.glue.model.GetDataflowGraphResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetDataflowGraphResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetDataflowGraphRequest request]
    (-> this (.getDataflowGraph request))))

(defn stop-trigger
  "Stops a specified trigger.

  request - `com.amazonaws.services.glue.model.StopTriggerRequest`

  returns: Result of the StopTrigger operation returned by the service. - `com.amazonaws.services.glue.model.StopTriggerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.StopTriggerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.StopTriggerRequest request]
    (-> this (.stopTrigger request))))

(defn get-table-versions
  "Retrieves a list of strings that identify available versions of a specified table.

  request - `com.amazonaws.services.glue.model.GetTableVersionsRequest`

  returns: Result of the GetTableVersions operation returned by the service. - `com.amazonaws.services.glue.model.GetTableVersionsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTableVersionsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetTableVersionsRequest request]
    (-> this (.getTableVersions request))))

(defn batch-stop-job-run
  "Stops one or more job runs for a specified job definition.

  request - `com.amazonaws.services.glue.model.BatchStopJobRunRequest`

  returns: Result of the BatchStopJobRun operation returned by the service. - `com.amazonaws.services.glue.model.BatchStopJobRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchStopJobRunResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchStopJobRunRequest request]
    (-> this (.batchStopJobRun request))))

(defn delete-resource-policy
  "Deletes a specified policy.

  request - `com.amazonaws.services.glue.model.DeleteResourcePolicyRequest`

  returns: Result of the DeleteResourcePolicy operation returned by the service. - `com.amazonaws.services.glue.model.DeleteResourcePolicyResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteResourcePolicyResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteResourcePolicyRequest request]
    (-> this (.deleteResourcePolicy request))))

(defn untag-resource
  "Removes tags from a resource.

  request - `com.amazonaws.services.glue.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.glue.model.UntagResourceResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UntagResourceResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn start-crawler-schedule
  "Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already
   running or the schedule state is already SCHEDULED.

  request - `com.amazonaws.services.glue.model.StartCrawlerScheduleRequest`

  returns: Result of the StartCrawlerSchedule operation returned by the service. - `com.amazonaws.services.glue.model.StartCrawlerScheduleResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.StartCrawlerScheduleResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.StartCrawlerScheduleRequest request]
    (-> this (.startCrawlerSchedule request))))

(defn get-job-runs
  "Retrieves metadata for all runs of a given job definition.

  request - `com.amazonaws.services.glue.model.GetJobRunsRequest`

  returns: Result of the GetJobRuns operation returned by the service. - `com.amazonaws.services.glue.model.GetJobRunsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobRunsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetJobRunsRequest request]
    (-> this (.getJobRuns request))))

(defn update-trigger
  "Updates a trigger definition.

  request - `com.amazonaws.services.glue.model.UpdateTriggerRequest`

  returns: Result of the UpdateTrigger operation returned by the service. - `com.amazonaws.services.glue.model.UpdateTriggerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateTriggerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateTriggerRequest request]
    (-> this (.updateTrigger request))))

(defn get-table-version
  "Retrieves a specified version of a table.

  request - `com.amazonaws.services.glue.model.GetTableVersionRequest`

  returns: Result of the GetTableVersion operation returned by the service. - `com.amazonaws.services.glue.model.GetTableVersionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTableVersionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetTableVersionRequest request]
    (-> this (.getTableVersion request))))

(defn delete-dev-endpoint
  "Deletes a specified development endpoint.

  request - `com.amazonaws.services.glue.model.DeleteDevEndpointRequest`

  returns: Result of the DeleteDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.DeleteDevEndpointResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteDevEndpointResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteDevEndpointRequest request]
    (-> this (.deleteDevEndpoint request))))

(defn get-security-configuration
  "Retrieves a specified security configuration.

  request - `com.amazonaws.services.glue.model.GetSecurityConfigurationRequest`

  returns: Result of the GetSecurityConfiguration operation returned by the service. - `com.amazonaws.services.glue.model.GetSecurityConfigurationResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetSecurityConfigurationResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetSecurityConfigurationRequest request]
    (-> this (.getSecurityConfiguration request))))

(defn get-tables
  "Retrieves the definitions of some or all of the tables in a given Database.

  request - `com.amazonaws.services.glue.model.GetTablesRequest`

  returns: Result of the GetTables operation returned by the service. - `com.amazonaws.services.glue.model.GetTablesResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTablesResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetTablesRequest request]
    (-> this (.getTables request))))

(defn delete-classifier
  "Removes a classifier from the Data Catalog.

  request - `com.amazonaws.services.glue.model.DeleteClassifierRequest`

  returns: Result of the DeleteClassifier operation returned by the service. - `com.amazonaws.services.glue.model.DeleteClassifierResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteClassifierResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteClassifierRequest request]
    (-> this (.deleteClassifier request))))

(defn update-job
  "Updates an existing job definition.

  request - `com.amazonaws.services.glue.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.glue.model.UpdateJobResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateJobResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn delete-trigger
  "Deletes a specified trigger. If the trigger is not found, no exception is thrown.

  request - `com.amazonaws.services.glue.model.DeleteTriggerRequest`

  returns: Result of the DeleteTrigger operation returned by the service. - `com.amazonaws.services.glue.model.DeleteTriggerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.DeleteTriggerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteTriggerRequest request]
    (-> this (.deleteTrigger request))))

(defn get-crawler-metrics
  "Retrieves metrics about specified crawlers.

  request - `com.amazonaws.services.glue.model.GetCrawlerMetricsRequest`

  returns: Result of the GetCrawlerMetrics operation returned by the service. - `com.amazonaws.services.glue.model.GetCrawlerMetricsResult`

  throws: com.amazonaws.services.glue.model.OperationTimeoutException - The operation timed out."
  (^com.amazonaws.services.glue.model.GetCrawlerMetricsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetCrawlerMetricsRequest request]
    (-> this (.getCrawlerMetrics request))))

(defn update-crawler
  "Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.

  request - `com.amazonaws.services.glue.model.UpdateCrawlerRequest`

  returns: Result of the UpdateCrawler operation returned by the service. - `com.amazonaws.services.glue.model.UpdateCrawlerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateCrawlerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateCrawlerRequest request]
    (-> this (.updateCrawler request))))

(defn get-crawlers
  "Retrieves metadata for all crawlers defined in the customer account.

  request - `com.amazonaws.services.glue.model.GetCrawlersRequest`

  returns: Result of the GetCrawlers operation returned by the service. - `com.amazonaws.services.glue.model.GetCrawlersResult`

  throws: com.amazonaws.services.glue.model.OperationTimeoutException - The operation timed out."
  (^com.amazonaws.services.glue.model.GetCrawlersResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetCrawlersRequest request]
    (-> this (.getCrawlers request))))

(defn get-data-catalog-encryption-settings
  "Retrieves the security configuration for a specified catalog.

  request - `com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest`

  returns: Result of the GetDataCatalogEncryptionSettings operation returned by the service. - `com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest request]
    (-> this (.getDataCatalogEncryptionSettings request))))

(defn create-script
  "Transforms a directed acyclic graph (DAG) into code.

  request - `com.amazonaws.services.glue.model.CreateScriptRequest`

  returns: Result of the CreateScript operation returned by the service. - `com.amazonaws.services.glue.model.CreateScriptResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreateScriptResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateScriptRequest request]
    (-> this (.createScript request))))

(defn delete-partition
  "Deletes a specified partition.

  request - `com.amazonaws.services.glue.model.DeletePartitionRequest`

  returns: Result of the DeletePartition operation returned by the service. - `com.amazonaws.services.glue.model.DeletePartitionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeletePartitionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeletePartitionRequest request]
    (-> this (.deletePartition request))))

(defn delete-job
  "Deletes a specified job definition. If the job definition is not found, no exception is thrown.

  request - `com.amazonaws.services.glue.model.DeleteJobRequest`

  returns: Result of the DeleteJob operation returned by the service. - `com.amazonaws.services.glue.model.DeleteJobResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.DeleteJobResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteJobRequest request]
    (-> this (.deleteJob request))))

(defn update-dev-endpoint
  "Updates a specified development endpoint.

  request - `com.amazonaws.services.glue.model.UpdateDevEndpointRequest`

  returns: Result of the UpdateDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.UpdateDevEndpointResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateDevEndpointResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateDevEndpointRequest request]
    (-> this (.updateDevEndpoint request))))

(defn get-partitions
  "Retrieves information about the partitions in a table.

  request - `com.amazonaws.services.glue.model.GetPartitionsRequest`

  returns: Result of the GetPartitions operation returned by the service. - `com.amazonaws.services.glue.model.GetPartitionsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetPartitionsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetPartitionsRequest request]
    (-> this (.getPartitions request))))

(defn get-workflow-run-properties
  "Retrieves the workflow run properties which were set during the run.

  request - `com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest`

  returns: Result of the GetWorkflowRunProperties operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowRunPropertiesResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest request]
    (-> this (.getWorkflowRunProperties request))))

(defn create-user-defined-function
  "Creates a new function definition in the Data Catalog.

  request - `com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest`

  returns: Result of the CreateUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest request]
    (-> this (.createUserDefinedFunction request))))

(defn start-job-run
  "Starts a job run using a job definition.

  request - `com.amazonaws.services.glue.model.StartJobRunRequest`

  returns: Result of the StartJobRun operation returned by the service. - `com.amazonaws.services.glue.model.StartJobRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.StartJobRunResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.StartJobRunRequest request]
    (-> this (.startJobRun request))))

(defn create-partition
  "Creates a new partition.

  request - `com.amazonaws.services.glue.model.CreatePartitionRequest`

  returns: Result of the CreatePartition operation returned by the service. - `com.amazonaws.services.glue.model.CreatePartitionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreatePartitionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreatePartitionRequest request]
    (-> this (.createPartition request))))

(defn delete-table
  "Removes a table definition from the Data Catalog.



   After completing this operation, you will no longer have access to the table versions and partitions that belong
   to the deleted table. AWS Glue deletes these \"orphaned\" resources asynchronously in a timely manner, at the
   discretion of the service.


   To ensure immediate deletion of all related resources, before calling DeleteTable, use
   DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or
   BatchDeletePartition, to delete any resources that belong to the table.

  request - `com.amazonaws.services.glue.model.DeleteTableRequest`

  returns: Result of the DeleteTable operation returned by the service. - `com.amazonaws.services.glue.model.DeleteTableResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteTableResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteTableRequest request]
    (-> this (.deleteTable request))))

(defn list-crawlers
  "Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This
   operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  request - `com.amazonaws.services.glue.model.ListCrawlersRequest`

  returns: Result of the ListCrawlers operation returned by the service. - `com.amazonaws.services.glue.model.ListCrawlersResult`

  throws: com.amazonaws.services.glue.model.OperationTimeoutException - The operation timed out."
  (^com.amazonaws.services.glue.model.ListCrawlersResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.ListCrawlersRequest request]
    (-> this (.listCrawlers request))))

(defn get-user-defined-functions
  "Retrieves a multiple function definitions from the Data Catalog.

  request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest`

  returns: Result of the GetUserDefinedFunctions operation returned by the service. - `com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest request]
    (-> this (.getUserDefinedFunctions request))))

(defn put-resource-policy
  "Sets the Data Catalog resource policy for access control.

  request - `com.amazonaws.services.glue.model.PutResourcePolicyRequest`

  returns: Result of the PutResourcePolicy operation returned by the service. - `com.amazonaws.services.glue.model.PutResourcePolicyResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.PutResourcePolicyResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.PutResourcePolicyRequest request]
    (-> this (.putResourcePolicy request))))

(defn batch-get-jobs
  "Returns a list of resource metadata for a given list of job names. After calling the ListJobs
   operation, you can call this operation to access the data to which you have been granted permissions. This
   operation supports all IAM permissions, including permission conditions that uses tags.

  request - `com.amazonaws.services.glue.model.BatchGetJobsRequest`

  returns: Result of the BatchGetJobs operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetJobsResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.BatchGetJobsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchGetJobsRequest request]
    (-> this (.batchGetJobs request))))

(defn batch-delete-partition
  "Deletes one or more partitions in a batch operation.

  request - `com.amazonaws.services.glue.model.BatchDeletePartitionRequest`

  returns: Result of the BatchDeletePartition operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeletePartitionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchDeletePartitionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchDeletePartitionRequest request]
    (-> this (.batchDeletePartition request))))

(defn start-trigger
  "Starts an existing trigger. See Triggering
   Jobs for information about how different types of trigger are started.

  request - `com.amazonaws.services.glue.model.StartTriggerRequest`

  returns: Result of the StartTrigger operation returned by the service. - `com.amazonaws.services.glue.model.StartTriggerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.StartTriggerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.StartTriggerRequest request]
    (-> this (.startTrigger request))))

(defn create-security-configuration
  "Creates a new security configuration. A security configuration is a set of security properties that can be used
   by AWS Glue. You can use a security configuration to encrypt data at rest. For information about using security
   configurations in AWS Glue, see Encrypting Data Written
   by Crawlers, Jobs, and Development Endpoints.

  request - `com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest`

  returns: Result of the CreateSecurityConfiguration operation returned by the service. - `com.amazonaws.services.glue.model.CreateSecurityConfigurationResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateSecurityConfigurationResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest request]
    (-> this (.createSecurityConfiguration request))))

(defn batch-get-crawlers
  "Returns a list of resource metadata for a given list of crawler names. After calling the
   ListCrawlers operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  request - `com.amazonaws.services.glue.model.BatchGetCrawlersRequest`

  returns: Result of the BatchGetCrawlers operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetCrawlersResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchGetCrawlersResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchGetCrawlersRequest request]
    (-> this (.batchGetCrawlers request))))

(defn list-dev-endpoints
  "Retrieves the names of all DevEndpoint resources in this AWS account, or the resources with the
   specified tag. This operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  request - `com.amazonaws.services.glue.model.ListDevEndpointsRequest`

  returns: Result of the ListDevEndpoints operation returned by the service. - `com.amazonaws.services.glue.model.ListDevEndpointsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.ListDevEndpointsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.ListDevEndpointsRequest request]
    (-> this (.listDevEndpoints request))))

(defn get-plan
  "Gets code to perform a specified mapping.

  request - `com.amazonaws.services.glue.model.GetPlanRequest`

  returns: Result of the GetPlan operation returned by the service. - `com.amazonaws.services.glue.model.GetPlanResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetPlanResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetPlanRequest request]
    (-> this (.getPlan request))))

(defn batch-get-dev-endpoints
  "Returns a list of resource metadata for a given list of development endpoint names. After calling the
   ListDevEndpoints operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  request - `com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest`

  returns: Result of the BatchGetDevEndpoints operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetDevEndpointsResult`

  throws: com.amazonaws.services.glue.model.AccessDeniedException - Access to a resource was denied."
  (^com.amazonaws.services.glue.model.BatchGetDevEndpointsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest request]
    (-> this (.batchGetDevEndpoints request))))

(defn list-workflows
  "Lists names of workflows created in the account.

  request - `com.amazonaws.services.glue.model.ListWorkflowsRequest`

  returns: Result of the ListWorkflows operation returned by the service. - `com.amazonaws.services.glue.model.ListWorkflowsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.ListWorkflowsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.ListWorkflowsRequest request]
    (-> this (.listWorkflows request))))

(defn put-workflow-run-properties
  "Puts the specified workflow run properties for the given workflow run. If a property already exists for the
   specified run, then it overrides the value otherwise adds the property to existing properties.

  request - `com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest`

  returns: Result of the PutWorkflowRunProperties operation returned by the service. - `com.amazonaws.services.glue.model.PutWorkflowRunPropertiesResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest request]
    (-> this (.putWorkflowRunProperties request))))

(defn get-dev-endpoints
  "Retrieves all the development endpoints in this AWS account.



   When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
   address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
   Glue returns only a public IP address.

  request - `com.amazonaws.services.glue.model.GetDevEndpointsRequest`

  returns: Result of the GetDevEndpoints operation returned by the service. - `com.amazonaws.services.glue.model.GetDevEndpointsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetDevEndpointsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetDevEndpointsRequest request]
    (-> this (.getDevEndpoints request))))

(defn update-database
  "Updates an existing database definition in a Data Catalog.

  request - `com.amazonaws.services.glue.model.UpdateDatabaseRequest`

  returns: Result of the UpdateDatabase operation returned by the service. - `com.amazonaws.services.glue.model.UpdateDatabaseResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateDatabaseResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateDatabaseRequest request]
    (-> this (.updateDatabase request))))

(defn create-connection
  "Creates a connection definition in the Data Catalog.

  request - `com.amazonaws.services.glue.model.CreateConnectionRequest`

  returns: Result of the CreateConnection operation returned by the service. - `com.amazonaws.services.glue.model.CreateConnectionResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateConnectionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateConnectionRequest request]
    (-> this (.createConnection request))))

(defn get-user-defined-function
  "Retrieves a specified function definition from the Data Catalog.

  request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest`

  returns: Result of the GetUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.GetUserDefinedFunctionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetUserDefinedFunctionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest request]
    (-> this (.getUserDefinedFunction request))))

(defn create-workflow
  "Creates a new workflow.

  request - `com.amazonaws.services.glue.model.CreateWorkflowRequest`

  returns: Result of the CreateWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.CreateWorkflowResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateWorkflowResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateWorkflowRequest request]
    (-> this (.createWorkflow request))))

(defn delete-crawler
  "Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is RUNNING.

  request - `com.amazonaws.services.glue.model.DeleteCrawlerRequest`

  returns: Result of the DeleteCrawler operation returned by the service. - `com.amazonaws.services.glue.model.DeleteCrawlerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteCrawlerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteCrawlerRequest request]
    (-> this (.deleteCrawler request))))

(defn delete-workflow
  "Deletes a workflow.

  request - `com.amazonaws.services.glue.model.DeleteWorkflowRequest`

  returns: Result of the DeleteWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.DeleteWorkflowResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.DeleteWorkflowResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteWorkflowRequest request]
    (-> this (.deleteWorkflow request))))

(defn list-jobs
  "Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This
   operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  request - `com.amazonaws.services.glue.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.glue.model.ListJobsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.ListJobsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn get-tags
  "Retrieves a list of tags associated with a resource.

  request - `com.amazonaws.services.glue.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.glue.model.GetTagsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetTagsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetTagsRequest request]
    (-> this (.getTags request))))

(defn delete-table-version
  "Deletes a specified version of a table.

  request - `com.amazonaws.services.glue.model.DeleteTableVersionRequest`

  returns: Result of the DeleteTableVersion operation returned by the service. - `com.amazonaws.services.glue.model.DeleteTableVersionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteTableVersionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteTableVersionRequest request]
    (-> this (.deleteTableVersion request))))

(defn create-trigger
  "Creates a new trigger.

  request - `com.amazonaws.services.glue.model.CreateTriggerRequest`

  returns: Result of the CreateTrigger operation returned by the service. - `com.amazonaws.services.glue.model.CreateTriggerResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateTriggerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateTriggerRequest request]
    (-> this (.createTrigger request))))

(defn batch-get-triggers
  "Returns a list of resource metadata for a given list of trigger names. After calling the
   ListTriggers operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  request - `com.amazonaws.services.glue.model.BatchGetTriggersRequest`

  returns: Result of the BatchGetTriggers operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetTriggersResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.BatchGetTriggersResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchGetTriggersRequest request]
    (-> this (.batchGetTriggers request))))

(defn stop-crawler-schedule
  "Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if
   it is already running.

  request - `com.amazonaws.services.glue.model.StopCrawlerScheduleRequest`

  returns: Result of the StopCrawlerSchedule operation returned by the service. - `com.amazonaws.services.glue.model.StopCrawlerScheduleResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.StopCrawlerScheduleResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.StopCrawlerScheduleRequest request]
    (-> this (.stopCrawlerSchedule request))))

(defn get-jobs
  "Retrieves all current job definitions.

  request - `com.amazonaws.services.glue.model.GetJobsRequest`

  returns: Result of the GetJobs operation returned by the service. - `com.amazonaws.services.glue.model.GetJobsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetJobsRequest request]
    (-> this (.getJobs request))))

(defn get-classifiers
  "Lists all classifier objects in the Data Catalog.

  request - `com.amazonaws.services.glue.model.GetClassifiersRequest`

  returns: Result of the GetClassifiers operation returned by the service. - `com.amazonaws.services.glue.model.GetClassifiersResult`

  throws: com.amazonaws.services.glue.model.OperationTimeoutException - The operation timed out."
  (^com.amazonaws.services.glue.model.GetClassifiersResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetClassifiersRequest request]
    (-> this (.getClassifiers request))))

(defn get-job-bookmarks
  "Returns information on the job bookmark entries. The list is ordered on decreasing version numbers.

  request - `com.amazonaws.services.glue.model.GetJobBookmarksRequest`

  returns: Result of the GetJobBookmarks operation returned by the service. - `com.amazonaws.services.glue.model.GetJobBookmarksResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobBookmarksResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetJobBookmarksRequest request]
    (-> this (.getJobBookmarks request))))

(defn get-workflow-run
  "Retrieves the metadata for a given workflow run.

  request - `com.amazonaws.services.glue.model.GetWorkflowRunRequest`

  returns: Result of the GetWorkflowRun operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetWorkflowRunResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetWorkflowRunRequest request]
    (-> this (.getWorkflowRun request))))

(defn get-crawler
  "Retrieves metadata for a specified crawler.

  request - `com.amazonaws.services.glue.model.GetCrawlerRequest`

  returns: Result of the GetCrawler operation returned by the service. - `com.amazonaws.services.glue.model.GetCrawlerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetCrawlerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetCrawlerRequest request]
    (-> this (.getCrawler request))))

(defn get-partition
  "Retrieves information about a specified partition.

  request - `com.amazonaws.services.glue.model.GetPartitionRequest`

  returns: Result of the GetPartition operation returned by the service. - `com.amazonaws.services.glue.model.GetPartitionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetPartitionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetPartitionRequest request]
    (-> this (.getPartition request))))

(defn get-resource-policy
  "Retrieves a specified resource policy.

  request - `com.amazonaws.services.glue.model.GetResourcePolicyRequest`

  returns: Result of the GetResourcePolicy operation returned by the service. - `com.amazonaws.services.glue.model.GetResourcePolicyResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetResourcePolicyResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetResourcePolicyRequest request]
    (-> this (.getResourcePolicy request))))

(defn get-connection
  "Retrieves a connection definition from the Data Catalog.

  request - `com.amazonaws.services.glue.model.GetConnectionRequest`

  returns: Result of the GetConnection operation returned by the service. - `com.amazonaws.services.glue.model.GetConnectionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetConnectionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetConnectionRequest request]
    (-> this (.getConnection request))))

(defn create-table
  "Creates a new table definition in the Data Catalog.

  request - `com.amazonaws.services.glue.model.CreateTableRequest`

  returns: Result of the CreateTable operation returned by the service. - `com.amazonaws.services.glue.model.CreateTableResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateTableResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateTableRequest request]
    (-> this (.createTable request))))

(defn update-partition
  "Updates a partition.

  request - `com.amazonaws.services.glue.model.UpdatePartitionRequest`

  returns: Result of the UpdatePartition operation returned by the service. - `com.amazonaws.services.glue.model.UpdatePartitionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdatePartitionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdatePartitionRequest request]
    (-> this (.updatePartition request))))

(defn update-classifier
  "Modifies an existing classifier (a GrokClassifier, an XMLClassifier, a
   JsonClassifier, or a CsvClassifier, depending on which field is present).

  request - `com.amazonaws.services.glue.model.UpdateClassifierRequest`

  returns: Result of the UpdateClassifier operation returned by the service. - `com.amazonaws.services.glue.model.UpdateClassifierResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateClassifierResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateClassifierRequest request]
    (-> this (.updateClassifier request))))

(defn batch-get-workflows
  "Returns a list of resource metadata for a given list of workflow names. After calling the
   ListWorkflows operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  request - `com.amazonaws.services.glue.model.BatchGetWorkflowsRequest`

  returns: Result of the BatchGetWorkflows operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetWorkflowsResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.BatchGetWorkflowsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchGetWorkflowsRequest request]
    (-> this (.batchGetWorkflows request))))

(defn list-triggers
  "Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This
   operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  request - `com.amazonaws.services.glue.model.ListTriggersRequest`

  returns: Result of the ListTriggers operation returned by the service. - `com.amazonaws.services.glue.model.ListTriggersResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.ListTriggersResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.ListTriggersRequest request]
    (-> this (.listTriggers request))))

(defn get-dev-endpoint
  "Retrieves information about a specified development endpoint.



   When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
   address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
   Glue returns only a public IP address.

  request - `com.amazonaws.services.glue.model.GetDevEndpointRequest`

  returns: Result of the GetDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.GetDevEndpointResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetDevEndpointResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetDevEndpointRequest request]
    (-> this (.getDevEndpoint request))))

(defn get-table
  "Retrieves the Table definition in a Data Catalog for a specified table.

  request - `com.amazonaws.services.glue.model.GetTableRequest`

  returns: Result of the GetTable operation returned by the service. - `com.amazonaws.services.glue.model.GetTableResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTableResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetTableRequest request]
    (-> this (.getTable request))))

(defn get-workflow
  "Retrieves resource metadata for a workflow.

  request - `com.amazonaws.services.glue.model.GetWorkflowRequest`

  returns: Result of the GetWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetWorkflowResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetWorkflowRequest request]
    (-> this (.getWorkflow request))))

(defn get-mapping
  "Creates mappings.

  request - `com.amazonaws.services.glue.model.GetMappingRequest`

  returns: Result of the GetMapping operation returned by the service. - `com.amazonaws.services.glue.model.GetMappingResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetMappingResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetMappingRequest request]
    (-> this (.getMapping request))))

(defn get-security-configurations
  "Retrieves a list of all security configurations.

  request - `com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest`

  returns: Result of the GetSecurityConfigurations operation returned by the service. - `com.amazonaws.services.glue.model.GetSecurityConfigurationsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetSecurityConfigurationsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest request]
    (-> this (.getSecurityConfigurations request))))

(defn get-connections
  "Retrieves a list of connection definitions from the Data Catalog.

  request - `com.amazonaws.services.glue.model.GetConnectionsRequest`

  returns: Result of the GetConnections operation returned by the service. - `com.amazonaws.services.glue.model.GetConnectionsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetConnectionsResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetConnectionsRequest request]
    (-> this (.getConnections request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSGlueClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn stop-crawler
  "If the specified crawler is running, stops the crawl.

  request - `com.amazonaws.services.glue.model.StopCrawlerRequest`

  returns: Result of the StopCrawler operation returned by the service. - `com.amazonaws.services.glue.model.StopCrawlerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.StopCrawlerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.StopCrawlerRequest request]
    (-> this (.stopCrawler request))))

(defn create-job
  "Creates a new job definition.

  request - `com.amazonaws.services.glue.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.glue.model.CreateJobResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreateJobResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn create-database
  "Creates a new database in a Data Catalog.

  request - `com.amazonaws.services.glue.model.CreateDatabaseRequest`

  returns: Result of the CreateDatabase operation returned by the service. - `com.amazonaws.services.glue.model.CreateDatabaseResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreateDatabaseResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateDatabaseRequest request]
    (-> this (.createDatabase request))))

(defn tag-resource
  "Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only
   certain resources. For information about what resources you can tag, see AWS Tags in AWS Glue.

  request - `com.amazonaws.services.glue.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.glue.model.TagResourceResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.TagResourceResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-classifier
  "Retrieve a classifier by name.

  request - `com.amazonaws.services.glue.model.GetClassifierRequest`

  returns: Result of the GetClassifier operation returned by the service. - `com.amazonaws.services.glue.model.GetClassifierResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetClassifierResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetClassifierRequest request]
    (-> this (.getClassifier request))))

(defn start-workflow-run
  "Starts a new run of the specified workflow.

  request - `com.amazonaws.services.glue.model.StartWorkflowRunRequest`

  returns: Result of the StartWorkflowRun operation returned by the service. - `com.amazonaws.services.glue.model.StartWorkflowRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.StartWorkflowRunResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.StartWorkflowRunRequest request]
    (-> this (.startWorkflowRun request))))

(defn batch-delete-table
  "Deletes multiple tables at once.



   After completing this operation, you will no longer have access to the table versions and partitions that belong
   to the deleted table. AWS Glue deletes these \"orphaned\" resources asynchronously in a timely manner, at the
   discretion of the service.


   To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use
   DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or
   BatchDeletePartition, to delete any resources that belong to the table.

  request - `com.amazonaws.services.glue.model.BatchDeleteTableRequest`

  returns: Result of the BatchDeleteTable operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeleteTableResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchDeleteTableResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchDeleteTableRequest request]
    (-> this (.batchDeleteTable request))))

(defn update-user-defined-function
  "Updates an existing function definition in the Data Catalog.

  request - `com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest`

  returns: Result of the UpdateUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest request]
    (-> this (.updateUserDefinedFunction request))))

(defn delete-database
  "Removes a specified Database from a Data Catalog.



   After completing this operation, you will no longer have access to the tables (and all table versions and
   partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue
   deletes these \"orphaned\" resources asynchronously in a timely manner, at the discretion of the service.


   To ensure immediate deletion of all related resources, before calling DeleteDatabase, use
   DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or
   BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or
   BatchDeleteTable, to delete any resources that belong to the database.

  request - `com.amazonaws.services.glue.model.DeleteDatabaseRequest`

  returns: Result of the DeleteDatabase operation returned by the service. - `com.amazonaws.services.glue.model.DeleteDatabaseResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteDatabaseResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.DeleteDatabaseRequest request]
    (-> this (.deleteDatabase request))))

(defn batch-delete-table-version
  "Deletes a specified batch of versions of a table.

  request - `com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest`

  returns: Result of the BatchDeleteTableVersion operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeleteTableVersionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.BatchDeleteTableVersionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest request]
    (-> this (.batchDeleteTableVersion request))))

(defn get-catalog-import-status
  "Retrieves the status of a migration operation.

  request - `com.amazonaws.services.glue.model.GetCatalogImportStatusRequest`

  returns: Result of the GetCatalogImportStatus operation returned by the service. - `com.amazonaws.services.glue.model.GetCatalogImportStatusResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.GetCatalogImportStatusResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.GetCatalogImportStatusRequest request]
    (-> this (.getCatalogImportStatus request))))

(defn create-crawler
  "Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl
   target must be specified, in the s3Targets field, the jdbcTargets field, or the
   DynamoDBTargets field.

  request - `com.amazonaws.services.glue.model.CreateCrawlerRequest`

  returns: Result of the CreateCrawler operation returned by the service. - `com.amazonaws.services.glue.model.CreateCrawlerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreateCrawlerResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.CreateCrawlerRequest request]
    (-> this (.createCrawler request))))

(defn batch-get-partition
  "Retrieves partitions in a batch request.

  request - `com.amazonaws.services.glue.model.BatchGetPartitionRequest`

  returns: Result of the BatchGetPartition operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetPartitionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchGetPartitionResult [^AWSGlueClient this ^com.amazonaws.services.glue.model.BatchGetPartitionRequest request]
    (-> this (.batchGetPartition request))))

