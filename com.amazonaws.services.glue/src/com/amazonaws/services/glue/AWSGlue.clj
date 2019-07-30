(ns com.amazonaws.services.glue.AWSGlue
  "Interface for accessing AWS Glue.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSGlue instead.


  AWS Glue

  Defines the public endpoint for the AWS Glue service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glue AWSGlue]))

(defn update-connection
  "Updates a connection definition in the Data Catalog.

  update-connection-request - `com.amazonaws.services.glue.model.UpdateConnectionRequest`

  returns: Result of the UpdateConnection operation returned by the service. - `com.amazonaws.services.glue.model.UpdateConnectionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateConnectionResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateConnectionRequest update-connection-request]
    (-> this (.updateConnection update-connection-request))))

(defn batch-delete-connection
  "Deletes a list of connection definitions from the Data Catalog.

  batch-delete-connection-request - `com.amazonaws.services.glue.model.BatchDeleteConnectionRequest`

  returns: Result of the BatchDeleteConnection operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeleteConnectionResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.BatchDeleteConnectionResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchDeleteConnectionRequest batch-delete-connection-request]
    (-> this (.batchDeleteConnection batch-delete-connection-request))))

(defn update-table
  "Updates a metadata table in the Data Catalog.

  update-table-request - `com.amazonaws.services.glue.model.UpdateTableRequest`

  returns: Result of the UpdateTable operation returned by the service. - `com.amazonaws.services.glue.model.UpdateTableResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateTableResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateTableRequest update-table-request]
    (-> this (.updateTable update-table-request))))

(defn get-trigger
  "Retrieves the definition of a trigger.

  get-trigger-request - `com.amazonaws.services.glue.model.GetTriggerRequest`

  returns: Result of the GetTrigger operation returned by the service. - `com.amazonaws.services.glue.model.GetTriggerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTriggerResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetTriggerRequest get-trigger-request]
    (-> this (.getTrigger get-trigger-request))))

(defn create-dev-endpoint
  "Creates a new development endpoint.

  create-dev-endpoint-request - `com.amazonaws.services.glue.model.CreateDevEndpointRequest`

  returns: Result of the CreateDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.CreateDevEndpointResult`

  throws: com.amazonaws.services.glue.model.AccessDeniedException - Access to a resource was denied."
  (^com.amazonaws.services.glue.model.CreateDevEndpointResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateDevEndpointRequest create-dev-endpoint-request]
    (-> this (.createDevEndpoint create-dev-endpoint-request))))

(defn delete-connection
  "Deletes a connection from the Data Catalog.

  delete-connection-request - `com.amazonaws.services.glue.model.DeleteConnectionRequest`

  returns: Result of the DeleteConnection operation returned by the service. - `com.amazonaws.services.glue.model.DeleteConnectionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteConnectionResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteConnectionRequest delete-connection-request]
    (-> this (.deleteConnection delete-connection-request))))

(defn put-data-catalog-encryption-settings
  "Sets the security configuration for a specified catalog. After the configuration has been set, the specified
   encryption is applied to every catalog write thereafter.

  put-data-catalog-encryption-settings-request - `com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest`

  returns: Result of the PutDataCatalogEncryptionSettings operation returned by the service. - `com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsResult [^AWSGlue this ^com.amazonaws.services.glue.model.PutDataCatalogEncryptionSettingsRequest put-data-catalog-encryption-settings-request]
    (-> this (.putDataCatalogEncryptionSettings put-data-catalog-encryption-settings-request))))

(defn get-job
  "Retrieves an existing job definition.

  get-job-request - `com.amazonaws.services.glue.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.glue.model.GetJobResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetJobRequest get-job-request]
    (-> this (.getJob get-job-request))))

(defn create-classifier
  "Creates a classifier in the user's account. This can be a GrokClassifier, an
   XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which
   field of the request is present.

  create-classifier-request - `com.amazonaws.services.glue.model.CreateClassifierRequest`

  returns: Result of the CreateClassifier operation returned by the service. - `com.amazonaws.services.glue.model.CreateClassifierResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateClassifierResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateClassifierRequest create-classifier-request]
    (-> this (.createClassifier create-classifier-request))))

(defn get-job-run
  "Retrieves the metadata for a given job run.

  get-job-run-request - `com.amazonaws.services.glue.model.GetJobRunRequest`

  returns: Result of the GetJobRun operation returned by the service. - `com.amazonaws.services.glue.model.GetJobRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobRunResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetJobRunRequest get-job-run-request]
    (-> this (.getJobRun get-job-run-request))))

(defn update-workflow
  "Updates an existing workflow.

  update-workflow-request - `com.amazonaws.services.glue.model.UpdateWorkflowRequest`

  returns: Result of the UpdateWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.UpdateWorkflowResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateWorkflowResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateWorkflowRequest update-workflow-request]
    (-> this (.updateWorkflow update-workflow-request))))

(defn delete-user-defined-function
  "Deletes an existing function definition from the Data Catalog.

  delete-user-defined-function-request - `com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest`

  returns: Result of the DeleteUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteUserDefinedFunctionRequest delete-user-defined-function-request]
    (-> this (.deleteUserDefinedFunction delete-user-defined-function-request))))

(defn get-workflow-runs
  "Retrieves metadata for all runs of a given workflow.

  get-workflow-runs-request - `com.amazonaws.services.glue.model.GetWorkflowRunsRequest`

  returns: Result of the GetWorkflowRuns operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowRunsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetWorkflowRunsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetWorkflowRunsRequest get-workflow-runs-request]
    (-> this (.getWorkflowRuns get-workflow-runs-request))))

(defn reset-job-bookmark
  "Resets a bookmark entry.

  reset-job-bookmark-request - `com.amazonaws.services.glue.model.ResetJobBookmarkRequest`

  returns: Result of the ResetJobBookmark operation returned by the service. - `com.amazonaws.services.glue.model.ResetJobBookmarkResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.ResetJobBookmarkResult [^AWSGlue this ^com.amazonaws.services.glue.model.ResetJobBookmarkRequest reset-job-bookmark-request]
    (-> this (.resetJobBookmark reset-job-bookmark-request))))

(defn start-crawler
  "Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running,
   returns a CrawlerRunningException.

  start-crawler-request - `com.amazonaws.services.glue.model.StartCrawlerRequest`

  returns: Result of the StartCrawler operation returned by the service. - `com.amazonaws.services.glue.model.StartCrawlerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.StartCrawlerResult [^AWSGlue this ^com.amazonaws.services.glue.model.StartCrawlerRequest start-crawler-request]
    (-> this (.startCrawler start-crawler-request))))

(defn import-catalog-to-glue
  "Imports an existing Athena Data Catalog to AWS Glue

  import-catalog-to-glue-request - `com.amazonaws.services.glue.model.ImportCatalogToGlueRequest`

  returns: Result of the ImportCatalogToGlue operation returned by the service. - `com.amazonaws.services.glue.model.ImportCatalogToGlueResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.ImportCatalogToGlueResult [^AWSGlue this ^com.amazonaws.services.glue.model.ImportCatalogToGlueRequest import-catalog-to-glue-request]
    (-> this (.importCatalogToGlue import-catalog-to-glue-request))))

(defn get-triggers
  "Gets all the triggers associated with a job.

  get-triggers-request - `com.amazonaws.services.glue.model.GetTriggersRequest`

  returns: Result of the GetTriggers operation returned by the service. - `com.amazonaws.services.glue.model.GetTriggersResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTriggersResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetTriggersRequest get-triggers-request]
    (-> this (.getTriggers get-triggers-request))))

(defn get-database
  "Retrieves the definition of a specified database.

  get-database-request - `com.amazonaws.services.glue.model.GetDatabaseRequest`

  returns: Result of the GetDatabase operation returned by the service. - `com.amazonaws.services.glue.model.GetDatabaseResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetDatabaseResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetDatabaseRequest get-database-request]
    (-> this (.getDatabase get-database-request))))

(defn batch-create-partition
  "Creates one or more partitions in a batch operation.

  batch-create-partition-request - `com.amazonaws.services.glue.model.BatchCreatePartitionRequest`

  returns: Result of the BatchCreatePartition operation returned by the service. - `com.amazonaws.services.glue.model.BatchCreatePartitionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchCreatePartitionResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchCreatePartitionRequest batch-create-partition-request]
    (-> this (.batchCreatePartition batch-create-partition-request))))

(defn get-job-bookmark
  "Returns information on a job bookmark entry.

  get-job-bookmark-request - `com.amazonaws.services.glue.model.GetJobBookmarkRequest`

  returns: Result of the GetJobBookmark operation returned by the service. - `com.amazonaws.services.glue.model.GetJobBookmarkResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetJobBookmarkResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetJobBookmarkRequest get-job-bookmark-request]
    (-> this (.getJobBookmark get-job-bookmark-request))))

(defn delete-security-configuration
  "Deletes a specified security configuration.

  delete-security-configuration-request - `com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest`

  returns: Result of the DeleteSecurityConfiguration operation returned by the service. - `com.amazonaws.services.glue.model.DeleteSecurityConfigurationResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteSecurityConfigurationResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteSecurityConfigurationRequest delete-security-configuration-request]
    (-> this (.deleteSecurityConfiguration delete-security-configuration-request))))

(defn get-databases
  "Retrieves all Databases defined in a given Data Catalog.

  get-databases-request - `com.amazonaws.services.glue.model.GetDatabasesRequest`

  returns: Result of the GetDatabases operation returned by the service. - `com.amazonaws.services.glue.model.GetDatabasesResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetDatabasesResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetDatabasesRequest get-databases-request]
    (-> this (.getDatabases get-databases-request))))

(defn update-crawler-schedule
  "Updates the schedule of a crawler using a cron expression.

  update-crawler-schedule-request - `com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest`

  returns: Result of the UpdateCrawlerSchedule operation returned by the service. - `com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateCrawlerScheduleResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateCrawlerScheduleRequest update-crawler-schedule-request]
    (-> this (.updateCrawlerSchedule update-crawler-schedule-request))))

(defn get-dataflow-graph
  "Transforms a Python script into a directed acyclic graph (DAG).

  get-dataflow-graph-request - `com.amazonaws.services.glue.model.GetDataflowGraphRequest`

  returns: Result of the GetDataflowGraph operation returned by the service. - `com.amazonaws.services.glue.model.GetDataflowGraphResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetDataflowGraphResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetDataflowGraphRequest get-dataflow-graph-request]
    (-> this (.getDataflowGraph get-dataflow-graph-request))))

(defn stop-trigger
  "Stops a specified trigger.

  stop-trigger-request - `com.amazonaws.services.glue.model.StopTriggerRequest`

  returns: Result of the StopTrigger operation returned by the service. - `com.amazonaws.services.glue.model.StopTriggerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.StopTriggerResult [^AWSGlue this ^com.amazonaws.services.glue.model.StopTriggerRequest stop-trigger-request]
    (-> this (.stopTrigger stop-trigger-request))))

(defn get-table-versions
  "Retrieves a list of strings that identify available versions of a specified table.

  get-table-versions-request - `com.amazonaws.services.glue.model.GetTableVersionsRequest`

  returns: Result of the GetTableVersions operation returned by the service. - `com.amazonaws.services.glue.model.GetTableVersionsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTableVersionsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetTableVersionsRequest get-table-versions-request]
    (-> this (.getTableVersions get-table-versions-request))))

(defn batch-stop-job-run
  "Stops one or more job runs for a specified job definition.

  batch-stop-job-run-request - `com.amazonaws.services.glue.model.BatchStopJobRunRequest`

  returns: Result of the BatchStopJobRun operation returned by the service. - `com.amazonaws.services.glue.model.BatchStopJobRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchStopJobRunResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchStopJobRunRequest batch-stop-job-run-request]
    (-> this (.batchStopJobRun batch-stop-job-run-request))))

(defn delete-resource-policy
  "Deletes a specified policy.

  delete-resource-policy-request - `com.amazonaws.services.glue.model.DeleteResourcePolicyRequest`

  returns: Result of the DeleteResourcePolicy operation returned by the service. - `com.amazonaws.services.glue.model.DeleteResourcePolicyResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteResourcePolicyResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteResourcePolicyRequest delete-resource-policy-request]
    (-> this (.deleteResourcePolicy delete-resource-policy-request))))

(defn untag-resource
  "Removes tags from a resource.

  untag-resource-request - `com.amazonaws.services.glue.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.glue.model.UntagResourceResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UntagResourceResult [^AWSGlue this ^com.amazonaws.services.glue.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn start-crawler-schedule
  "Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already
   running or the schedule state is already SCHEDULED.

  start-crawler-schedule-request - `com.amazonaws.services.glue.model.StartCrawlerScheduleRequest`

  returns: Result of the StartCrawlerSchedule operation returned by the service. - `com.amazonaws.services.glue.model.StartCrawlerScheduleResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.StartCrawlerScheduleResult [^AWSGlue this ^com.amazonaws.services.glue.model.StartCrawlerScheduleRequest start-crawler-schedule-request]
    (-> this (.startCrawlerSchedule start-crawler-schedule-request))))

(defn get-job-runs
  "Retrieves metadata for all runs of a given job definition.

  get-job-runs-request - `com.amazonaws.services.glue.model.GetJobRunsRequest`

  returns: Result of the GetJobRuns operation returned by the service. - `com.amazonaws.services.glue.model.GetJobRunsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobRunsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetJobRunsRequest get-job-runs-request]
    (-> this (.getJobRuns get-job-runs-request))))

(defn update-trigger
  "Updates a trigger definition.

  update-trigger-request - `com.amazonaws.services.glue.model.UpdateTriggerRequest`

  returns: Result of the UpdateTrigger operation returned by the service. - `com.amazonaws.services.glue.model.UpdateTriggerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateTriggerResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateTriggerRequest update-trigger-request]
    (-> this (.updateTrigger update-trigger-request))))

(defn get-table-version
  "Retrieves a specified version of a table.

  get-table-version-request - `com.amazonaws.services.glue.model.GetTableVersionRequest`

  returns: Result of the GetTableVersion operation returned by the service. - `com.amazonaws.services.glue.model.GetTableVersionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTableVersionResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetTableVersionRequest get-table-version-request]
    (-> this (.getTableVersion get-table-version-request))))

(defn delete-dev-endpoint
  "Deletes a specified development endpoint.

  delete-dev-endpoint-request - `com.amazonaws.services.glue.model.DeleteDevEndpointRequest`

  returns: Result of the DeleteDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.DeleteDevEndpointResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteDevEndpointResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteDevEndpointRequest delete-dev-endpoint-request]
    (-> this (.deleteDevEndpoint delete-dev-endpoint-request))))

(defn get-security-configuration
  "Retrieves a specified security configuration.

  get-security-configuration-request - `com.amazonaws.services.glue.model.GetSecurityConfigurationRequest`

  returns: Result of the GetSecurityConfiguration operation returned by the service. - `com.amazonaws.services.glue.model.GetSecurityConfigurationResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetSecurityConfigurationResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetSecurityConfigurationRequest get-security-configuration-request]
    (-> this (.getSecurityConfiguration get-security-configuration-request))))

(defn get-tables
  "Retrieves the definitions of some or all of the tables in a given Database.

  get-tables-request - `com.amazonaws.services.glue.model.GetTablesRequest`

  returns: Result of the GetTables operation returned by the service. - `com.amazonaws.services.glue.model.GetTablesResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTablesResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetTablesRequest get-tables-request]
    (-> this (.getTables get-tables-request))))

(defn delete-classifier
  "Removes a classifier from the Data Catalog.

  delete-classifier-request - `com.amazonaws.services.glue.model.DeleteClassifierRequest`

  returns: Result of the DeleteClassifier operation returned by the service. - `com.amazonaws.services.glue.model.DeleteClassifierResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteClassifierResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteClassifierRequest delete-classifier-request]
    (-> this (.deleteClassifier delete-classifier-request))))

(defn update-job
  "Updates an existing job definition.

  update-job-request - `com.amazonaws.services.glue.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.glue.model.UpdateJobResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateJobResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateJobRequest update-job-request]
    (-> this (.updateJob update-job-request))))

(defn delete-trigger
  "Deletes a specified trigger. If the trigger is not found, no exception is thrown.

  delete-trigger-request - `com.amazonaws.services.glue.model.DeleteTriggerRequest`

  returns: Result of the DeleteTrigger operation returned by the service. - `com.amazonaws.services.glue.model.DeleteTriggerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.DeleteTriggerResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteTriggerRequest delete-trigger-request]
    (-> this (.deleteTrigger delete-trigger-request))))

(defn get-crawler-metrics
  "Retrieves metrics about specified crawlers.

  get-crawler-metrics-request - `com.amazonaws.services.glue.model.GetCrawlerMetricsRequest`

  returns: Result of the GetCrawlerMetrics operation returned by the service. - `com.amazonaws.services.glue.model.GetCrawlerMetricsResult`

  throws: com.amazonaws.services.glue.model.OperationTimeoutException - The operation timed out."
  (^com.amazonaws.services.glue.model.GetCrawlerMetricsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetCrawlerMetricsRequest get-crawler-metrics-request]
    (-> this (.getCrawlerMetrics get-crawler-metrics-request))))

(defn update-crawler
  "Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.

  update-crawler-request - `com.amazonaws.services.glue.model.UpdateCrawlerRequest`

  returns: Result of the UpdateCrawler operation returned by the service. - `com.amazonaws.services.glue.model.UpdateCrawlerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateCrawlerResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateCrawlerRequest update-crawler-request]
    (-> this (.updateCrawler update-crawler-request))))

(defn get-crawlers
  "Retrieves metadata for all crawlers defined in the customer account.

  get-crawlers-request - `com.amazonaws.services.glue.model.GetCrawlersRequest`

  returns: Result of the GetCrawlers operation returned by the service. - `com.amazonaws.services.glue.model.GetCrawlersResult`

  throws: com.amazonaws.services.glue.model.OperationTimeoutException - The operation timed out."
  (^com.amazonaws.services.glue.model.GetCrawlersResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetCrawlersRequest get-crawlers-request]
    (-> this (.getCrawlers get-crawlers-request))))

(defn get-data-catalog-encryption-settings
  "Retrieves the security configuration for a specified catalog.

  get-data-catalog-encryption-settings-request - `com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest`

  returns: Result of the GetDataCatalogEncryptionSettings operation returned by the service. - `com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetDataCatalogEncryptionSettingsRequest get-data-catalog-encryption-settings-request]
    (-> this (.getDataCatalogEncryptionSettings get-data-catalog-encryption-settings-request))))

(defn create-script
  "Transforms a directed acyclic graph (DAG) into code.

  create-script-request - `com.amazonaws.services.glue.model.CreateScriptRequest`

  returns: Result of the CreateScript operation returned by the service. - `com.amazonaws.services.glue.model.CreateScriptResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreateScriptResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateScriptRequest create-script-request]
    (-> this (.createScript create-script-request))))

(defn delete-partition
  "Deletes a specified partition.

  delete-partition-request - `com.amazonaws.services.glue.model.DeletePartitionRequest`

  returns: Result of the DeletePartition operation returned by the service. - `com.amazonaws.services.glue.model.DeletePartitionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeletePartitionResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeletePartitionRequest delete-partition-request]
    (-> this (.deletePartition delete-partition-request))))

(defn delete-job
  "Deletes a specified job definition. If the job definition is not found, no exception is thrown.

  delete-job-request - `com.amazonaws.services.glue.model.DeleteJobRequest`

  returns: Result of the DeleteJob operation returned by the service. - `com.amazonaws.services.glue.model.DeleteJobResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.DeleteJobResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteJobRequest delete-job-request]
    (-> this (.deleteJob delete-job-request))))

(defn update-dev-endpoint
  "Updates a specified development endpoint.

  update-dev-endpoint-request - `com.amazonaws.services.glue.model.UpdateDevEndpointRequest`

  returns: Result of the UpdateDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.UpdateDevEndpointResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateDevEndpointResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateDevEndpointRequest update-dev-endpoint-request]
    (-> this (.updateDevEndpoint update-dev-endpoint-request))))

(defn get-partitions
  "Retrieves information about the partitions in a table.

  get-partitions-request - `com.amazonaws.services.glue.model.GetPartitionsRequest`

  returns: Result of the GetPartitions operation returned by the service. - `com.amazonaws.services.glue.model.GetPartitionsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetPartitionsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetPartitionsRequest get-partitions-request]
    (-> this (.getPartitions get-partitions-request))))

(defn get-workflow-run-properties
  "Retrieves the workflow run properties which were set during the run.

  get-workflow-run-properties-request - `com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest`

  returns: Result of the GetWorkflowRunProperties operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowRunPropertiesResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetWorkflowRunPropertiesRequest get-workflow-run-properties-request]
    (-> this (.getWorkflowRunProperties get-workflow-run-properties-request))))

(defn create-user-defined-function
  "Creates a new function definition in the Data Catalog.

  create-user-defined-function-request - `com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest`

  returns: Result of the CreateUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateUserDefinedFunctionResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateUserDefinedFunctionRequest create-user-defined-function-request]
    (-> this (.createUserDefinedFunction create-user-defined-function-request))))

(defn start-job-run
  "Starts a job run using a job definition.

  start-job-run-request - `com.amazonaws.services.glue.model.StartJobRunRequest`

  returns: Result of the StartJobRun operation returned by the service. - `com.amazonaws.services.glue.model.StartJobRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.StartJobRunResult [^AWSGlue this ^com.amazonaws.services.glue.model.StartJobRunRequest start-job-run-request]
    (-> this (.startJobRun start-job-run-request))))

(defn create-partition
  "Creates a new partition.

  create-partition-request - `com.amazonaws.services.glue.model.CreatePartitionRequest`

  returns: Result of the CreatePartition operation returned by the service. - `com.amazonaws.services.glue.model.CreatePartitionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreatePartitionResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreatePartitionRequest create-partition-request]
    (-> this (.createPartition create-partition-request))))

(defn delete-table
  "Removes a table definition from the Data Catalog.



   After completing this operation, you will no longer have access to the table versions and partitions that belong
   to the deleted table. AWS Glue deletes these \"orphaned\" resources asynchronously in a timely manner, at the
   discretion of the service.


   To ensure immediate deletion of all related resources, before calling DeleteTable, use
   DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or
   BatchDeletePartition, to delete any resources that belong to the table.

  delete-table-request - `com.amazonaws.services.glue.model.DeleteTableRequest`

  returns: Result of the DeleteTable operation returned by the service. - `com.amazonaws.services.glue.model.DeleteTableResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteTableResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteTableRequest delete-table-request]
    (-> this (.deleteTable delete-table-request))))

(defn list-crawlers
  "Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This
   operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  list-crawlers-request - `com.amazonaws.services.glue.model.ListCrawlersRequest`

  returns: Result of the ListCrawlers operation returned by the service. - `com.amazonaws.services.glue.model.ListCrawlersResult`

  throws: com.amazonaws.services.glue.model.OperationTimeoutException - The operation timed out."
  (^com.amazonaws.services.glue.model.ListCrawlersResult [^AWSGlue this ^com.amazonaws.services.glue.model.ListCrawlersRequest list-crawlers-request]
    (-> this (.listCrawlers list-crawlers-request))))

(defn get-user-defined-functions
  "Retrieves a multiple function definitions from the Data Catalog.

  get-user-defined-functions-request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest`

  returns: Result of the GetUserDefinedFunctions operation returned by the service. - `com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetUserDefinedFunctionsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionsRequest get-user-defined-functions-request]
    (-> this (.getUserDefinedFunctions get-user-defined-functions-request))))

(defn put-resource-policy
  "Sets the Data Catalog resource policy for access control.

  put-resource-policy-request - `com.amazonaws.services.glue.model.PutResourcePolicyRequest`

  returns: Result of the PutResourcePolicy operation returned by the service. - `com.amazonaws.services.glue.model.PutResourcePolicyResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.PutResourcePolicyResult [^AWSGlue this ^com.amazonaws.services.glue.model.PutResourcePolicyRequest put-resource-policy-request]
    (-> this (.putResourcePolicy put-resource-policy-request))))

(defn batch-get-jobs
  "Returns a list of resource metadata for a given list of job names. After calling the ListJobs
   operation, you can call this operation to access the data to which you have been granted permissions. This
   operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-jobs-request - `com.amazonaws.services.glue.model.BatchGetJobsRequest`

  returns: Result of the BatchGetJobs operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetJobsResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.BatchGetJobsResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchGetJobsRequest batch-get-jobs-request]
    (-> this (.batchGetJobs batch-get-jobs-request))))

(defn batch-delete-partition
  "Deletes one or more partitions in a batch operation.

  batch-delete-partition-request - `com.amazonaws.services.glue.model.BatchDeletePartitionRequest`

  returns: Result of the BatchDeletePartition operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeletePartitionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchDeletePartitionResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchDeletePartitionRequest batch-delete-partition-request]
    (-> this (.batchDeletePartition batch-delete-partition-request))))

(defn start-trigger
  "Starts an existing trigger. See Triggering
   Jobs for information about how different types of trigger are started.

  start-trigger-request - `com.amazonaws.services.glue.model.StartTriggerRequest`

  returns: Result of the StartTrigger operation returned by the service. - `com.amazonaws.services.glue.model.StartTriggerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.StartTriggerResult [^AWSGlue this ^com.amazonaws.services.glue.model.StartTriggerRequest start-trigger-request]
    (-> this (.startTrigger start-trigger-request))))

(defn create-security-configuration
  "Creates a new security configuration. A security configuration is a set of security properties that can be used
   by AWS Glue. You can use a security configuration to encrypt data at rest. For information about using security
   configurations in AWS Glue, see Encrypting Data Written
   by Crawlers, Jobs, and Development Endpoints.

  create-security-configuration-request - `com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest`

  returns: Result of the CreateSecurityConfiguration operation returned by the service. - `com.amazonaws.services.glue.model.CreateSecurityConfigurationResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateSecurityConfigurationResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateSecurityConfigurationRequest create-security-configuration-request]
    (-> this (.createSecurityConfiguration create-security-configuration-request))))

(defn batch-get-crawlers
  "Returns a list of resource metadata for a given list of crawler names. After calling the
   ListCrawlers operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-crawlers-request - `com.amazonaws.services.glue.model.BatchGetCrawlersRequest`

  returns: Result of the BatchGetCrawlers operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetCrawlersResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchGetCrawlersResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchGetCrawlersRequest batch-get-crawlers-request]
    (-> this (.batchGetCrawlers batch-get-crawlers-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSGlue this]
    (-> this (.shutdown))))

(defn list-dev-endpoints
  "Retrieves the names of all DevEndpoint resources in this AWS account, or the resources with the
   specified tag. This operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  list-dev-endpoints-request - `com.amazonaws.services.glue.model.ListDevEndpointsRequest`

  returns: Result of the ListDevEndpoints operation returned by the service. - `com.amazonaws.services.glue.model.ListDevEndpointsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.ListDevEndpointsResult [^AWSGlue this ^com.amazonaws.services.glue.model.ListDevEndpointsRequest list-dev-endpoints-request]
    (-> this (.listDevEndpoints list-dev-endpoints-request))))

(defn get-plan
  "Gets code to perform a specified mapping.

  get-plan-request - `com.amazonaws.services.glue.model.GetPlanRequest`

  returns: Result of the GetPlan operation returned by the service. - `com.amazonaws.services.glue.model.GetPlanResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetPlanResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetPlanRequest get-plan-request]
    (-> this (.getPlan get-plan-request))))

(defn batch-get-dev-endpoints
  "Returns a list of resource metadata for a given list of development endpoint names. After calling the
   ListDevEndpoints operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-dev-endpoints-request - `com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest`

  returns: Result of the BatchGetDevEndpoints operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetDevEndpointsResult`

  throws: com.amazonaws.services.glue.model.AccessDeniedException - Access to a resource was denied."
  (^com.amazonaws.services.glue.model.BatchGetDevEndpointsResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchGetDevEndpointsRequest batch-get-dev-endpoints-request]
    (-> this (.batchGetDevEndpoints batch-get-dev-endpoints-request))))

(defn list-workflows
  "Lists names of workflows created in the account.

  list-workflows-request - `com.amazonaws.services.glue.model.ListWorkflowsRequest`

  returns: Result of the ListWorkflows operation returned by the service. - `com.amazonaws.services.glue.model.ListWorkflowsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.ListWorkflowsResult [^AWSGlue this ^com.amazonaws.services.glue.model.ListWorkflowsRequest list-workflows-request]
    (-> this (.listWorkflows list-workflows-request))))

(defn put-workflow-run-properties
  "Puts the specified workflow run properties for the given workflow run. If a property already exists for the
   specified run, then it overrides the value otherwise adds the property to existing properties.

  put-workflow-run-properties-request - `com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest`

  returns: Result of the PutWorkflowRunProperties operation returned by the service. - `com.amazonaws.services.glue.model.PutWorkflowRunPropertiesResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesResult [^AWSGlue this ^com.amazonaws.services.glue.model.PutWorkflowRunPropertiesRequest put-workflow-run-properties-request]
    (-> this (.putWorkflowRunProperties put-workflow-run-properties-request))))

(defn get-dev-endpoints
  "Retrieves all the development endpoints in this AWS account.



   When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
   address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
   Glue returns only a public IP address.

  get-dev-endpoints-request - `com.amazonaws.services.glue.model.GetDevEndpointsRequest`

  returns: Result of the GetDevEndpoints operation returned by the service. - `com.amazonaws.services.glue.model.GetDevEndpointsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetDevEndpointsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetDevEndpointsRequest get-dev-endpoints-request]
    (-> this (.getDevEndpoints get-dev-endpoints-request))))

(defn update-database
  "Updates an existing database definition in a Data Catalog.

  update-database-request - `com.amazonaws.services.glue.model.UpdateDatabaseRequest`

  returns: Result of the UpdateDatabase operation returned by the service. - `com.amazonaws.services.glue.model.UpdateDatabaseResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateDatabaseResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateDatabaseRequest update-database-request]
    (-> this (.updateDatabase update-database-request))))

(defn create-connection
  "Creates a connection definition in the Data Catalog.

  create-connection-request - `com.amazonaws.services.glue.model.CreateConnectionRequest`

  returns: Result of the CreateConnection operation returned by the service. - `com.amazonaws.services.glue.model.CreateConnectionResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateConnectionResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateConnectionRequest create-connection-request]
    (-> this (.createConnection create-connection-request))))

(defn get-user-defined-function
  "Retrieves a specified function definition from the Data Catalog.

  get-user-defined-function-request - `com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest`

  returns: Result of the GetUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.GetUserDefinedFunctionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetUserDefinedFunctionResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetUserDefinedFunctionRequest get-user-defined-function-request]
    (-> this (.getUserDefinedFunction get-user-defined-function-request))))

(defn create-workflow
  "Creates a new workflow.

  create-workflow-request - `com.amazonaws.services.glue.model.CreateWorkflowRequest`

  returns: Result of the CreateWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.CreateWorkflowResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateWorkflowResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateWorkflowRequest create-workflow-request]
    (-> this (.createWorkflow create-workflow-request))))

(defn delete-crawler
  "Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is RUNNING.

  delete-crawler-request - `com.amazonaws.services.glue.model.DeleteCrawlerRequest`

  returns: Result of the DeleteCrawler operation returned by the service. - `com.amazonaws.services.glue.model.DeleteCrawlerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteCrawlerResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteCrawlerRequest delete-crawler-request]
    (-> this (.deleteCrawler delete-crawler-request))))

(defn delete-workflow
  "Deletes a workflow.

  delete-workflow-request - `com.amazonaws.services.glue.model.DeleteWorkflowRequest`

  returns: Result of the DeleteWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.DeleteWorkflowResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.DeleteWorkflowResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteWorkflowRequest delete-workflow-request]
    (-> this (.deleteWorkflow delete-workflow-request))))

(defn list-jobs
  "Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This
   operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  list-jobs-request - `com.amazonaws.services.glue.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.glue.model.ListJobsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.ListJobsResult [^AWSGlue this ^com.amazonaws.services.glue.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobs list-jobs-request))))

(defn get-tags
  "Retrieves a list of tags associated with a resource.

  get-tags-request - `com.amazonaws.services.glue.model.GetTagsRequest`

  returns: Result of the GetTags operation returned by the service. - `com.amazonaws.services.glue.model.GetTagsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetTagsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetTagsRequest get-tags-request]
    (-> this (.getTags get-tags-request))))

(defn delete-table-version
  "Deletes a specified version of a table.

  delete-table-version-request - `com.amazonaws.services.glue.model.DeleteTableVersionRequest`

  returns: Result of the DeleteTableVersion operation returned by the service. - `com.amazonaws.services.glue.model.DeleteTableVersionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteTableVersionResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteTableVersionRequest delete-table-version-request]
    (-> this (.deleteTableVersion delete-table-version-request))))

(defn create-trigger
  "Creates a new trigger.

  create-trigger-request - `com.amazonaws.services.glue.model.CreateTriggerRequest`

  returns: Result of the CreateTrigger operation returned by the service. - `com.amazonaws.services.glue.model.CreateTriggerResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateTriggerResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateTriggerRequest create-trigger-request]
    (-> this (.createTrigger create-trigger-request))))

(defn batch-get-triggers
  "Returns a list of resource metadata for a given list of trigger names. After calling the
   ListTriggers operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-triggers-request - `com.amazonaws.services.glue.model.BatchGetTriggersRequest`

  returns: Result of the BatchGetTriggers operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetTriggersResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.BatchGetTriggersResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchGetTriggersRequest batch-get-triggers-request]
    (-> this (.batchGetTriggers batch-get-triggers-request))))

(defn stop-crawler-schedule
  "Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if
   it is already running.

  stop-crawler-schedule-request - `com.amazonaws.services.glue.model.StopCrawlerScheduleRequest`

  returns: Result of the StopCrawlerSchedule operation returned by the service. - `com.amazonaws.services.glue.model.StopCrawlerScheduleResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.StopCrawlerScheduleResult [^AWSGlue this ^com.amazonaws.services.glue.model.StopCrawlerScheduleRequest stop-crawler-schedule-request]
    (-> this (.stopCrawlerSchedule stop-crawler-schedule-request))))

(defn get-jobs
  "Retrieves all current job definitions.

  get-jobs-request - `com.amazonaws.services.glue.model.GetJobsRequest`

  returns: Result of the GetJobs operation returned by the service. - `com.amazonaws.services.glue.model.GetJobsResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetJobsRequest get-jobs-request]
    (-> this (.getJobs get-jobs-request))))

(defn get-classifiers
  "Lists all classifier objects in the Data Catalog.

  get-classifiers-request - `com.amazonaws.services.glue.model.GetClassifiersRequest`

  returns: Result of the GetClassifiers operation returned by the service. - `com.amazonaws.services.glue.model.GetClassifiersResult`

  throws: com.amazonaws.services.glue.model.OperationTimeoutException - The operation timed out."
  (^com.amazonaws.services.glue.model.GetClassifiersResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetClassifiersRequest get-classifiers-request]
    (-> this (.getClassifiers get-classifiers-request))))

(defn get-job-bookmarks
  "Returns information on the job bookmark entries. The list is ordered on decreasing version numbers.

  get-job-bookmarks-request - `com.amazonaws.services.glue.model.GetJobBookmarksRequest`

  returns: Result of the GetJobBookmarks operation returned by the service. - `com.amazonaws.services.glue.model.GetJobBookmarksResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetJobBookmarksResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetJobBookmarksRequest get-job-bookmarks-request]
    (-> this (.getJobBookmarks get-job-bookmarks-request))))

(defn get-workflow-run
  "Retrieves the metadata for a given workflow run.

  get-workflow-run-request - `com.amazonaws.services.glue.model.GetWorkflowRunRequest`

  returns: Result of the GetWorkflowRun operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetWorkflowRunResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetWorkflowRunRequest get-workflow-run-request]
    (-> this (.getWorkflowRun get-workflow-run-request))))

(defn get-crawler
  "Retrieves metadata for a specified crawler.

  get-crawler-request - `com.amazonaws.services.glue.model.GetCrawlerRequest`

  returns: Result of the GetCrawler operation returned by the service. - `com.amazonaws.services.glue.model.GetCrawlerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetCrawlerResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetCrawlerRequest get-crawler-request]
    (-> this (.getCrawler get-crawler-request))))

(defn get-partition
  "Retrieves information about a specified partition.

  get-partition-request - `com.amazonaws.services.glue.model.GetPartitionRequest`

  returns: Result of the GetPartition operation returned by the service. - `com.amazonaws.services.glue.model.GetPartitionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetPartitionResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetPartitionRequest get-partition-request]
    (-> this (.getPartition get-partition-request))))

(defn get-resource-policy
  "Retrieves a specified resource policy.

  get-resource-policy-request - `com.amazonaws.services.glue.model.GetResourcePolicyRequest`

  returns: Result of the GetResourcePolicy operation returned by the service. - `com.amazonaws.services.glue.model.GetResourcePolicyResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetResourcePolicyResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetResourcePolicyRequest get-resource-policy-request]
    (-> this (.getResourcePolicy get-resource-policy-request))))

(defn get-connection
  "Retrieves a connection definition from the Data Catalog.

  get-connection-request - `com.amazonaws.services.glue.model.GetConnectionRequest`

  returns: Result of the GetConnection operation returned by the service. - `com.amazonaws.services.glue.model.GetConnectionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetConnectionResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetConnectionRequest get-connection-request]
    (-> this (.getConnection get-connection-request))))

(defn create-table
  "Creates a new table definition in the Data Catalog.

  create-table-request - `com.amazonaws.services.glue.model.CreateTableRequest`

  returns: Result of the CreateTable operation returned by the service. - `com.amazonaws.services.glue.model.CreateTableResult`

  throws: com.amazonaws.services.glue.model.AlreadyExistsException - A resource to be created or added already exists."
  (^com.amazonaws.services.glue.model.CreateTableResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateTableRequest create-table-request]
    (-> this (.createTable create-table-request))))

(defn update-partition
  "Updates a partition.

  update-partition-request - `com.amazonaws.services.glue.model.UpdatePartitionRequest`

  returns: Result of the UpdatePartition operation returned by the service. - `com.amazonaws.services.glue.model.UpdatePartitionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdatePartitionResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdatePartitionRequest update-partition-request]
    (-> this (.updatePartition update-partition-request))))

(defn update-classifier
  "Modifies an existing classifier (a GrokClassifier, an XMLClassifier, a
   JsonClassifier, or a CsvClassifier, depending on which field is present).

  update-classifier-request - `com.amazonaws.services.glue.model.UpdateClassifierRequest`

  returns: Result of the UpdateClassifier operation returned by the service. - `com.amazonaws.services.glue.model.UpdateClassifierResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.UpdateClassifierResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateClassifierRequest update-classifier-request]
    (-> this (.updateClassifier update-classifier-request))))

(defn batch-get-workflows
  "Returns a list of resource metadata for a given list of workflow names. After calling the
   ListWorkflows operation, you can call this operation to access the data to which you have been
   granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.

  batch-get-workflows-request - `com.amazonaws.services.glue.model.BatchGetWorkflowsRequest`

  returns: Result of the BatchGetWorkflows operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetWorkflowsResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.BatchGetWorkflowsResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchGetWorkflowsRequest batch-get-workflows-request]
    (-> this (.batchGetWorkflows batch-get-workflows-request))))

(defn list-triggers
  "Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This
   operation allows you to see which resources are available in your account, and their names.


   This operation takes the optional Tags field, which you can use as a filter on the response so that
   tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag
   are retrieved.

  list-triggers-request - `com.amazonaws.services.glue.model.ListTriggersRequest`

  returns: Result of the ListTriggers operation returned by the service. - `com.amazonaws.services.glue.model.ListTriggersResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.ListTriggersResult [^AWSGlue this ^com.amazonaws.services.glue.model.ListTriggersRequest list-triggers-request]
    (-> this (.listTriggers list-triggers-request))))

(defn get-dev-endpoint
  "Retrieves information about a specified development endpoint.



   When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP
   address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS
   Glue returns only a public IP address.

  get-dev-endpoint-request - `com.amazonaws.services.glue.model.GetDevEndpointRequest`

  returns: Result of the GetDevEndpoint operation returned by the service. - `com.amazonaws.services.glue.model.GetDevEndpointResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetDevEndpointResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetDevEndpointRequest get-dev-endpoint-request]
    (-> this (.getDevEndpoint get-dev-endpoint-request))))

(defn get-table
  "Retrieves the Table definition in a Data Catalog for a specified table.

  get-table-request - `com.amazonaws.services.glue.model.GetTableRequest`

  returns: Result of the GetTable operation returned by the service. - `com.amazonaws.services.glue.model.GetTableResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetTableResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetTableRequest get-table-request]
    (-> this (.getTable get-table-request))))

(defn get-workflow
  "Retrieves resource metadata for a workflow.

  get-workflow-request - `com.amazonaws.services.glue.model.GetWorkflowRequest`

  returns: Result of the GetWorkflow operation returned by the service. - `com.amazonaws.services.glue.model.GetWorkflowResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetWorkflowResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetWorkflowRequest get-workflow-request]
    (-> this (.getWorkflow get-workflow-request))))

(defn get-mapping
  "Creates mappings.

  get-mapping-request - `com.amazonaws.services.glue.model.GetMappingRequest`

  returns: Result of the GetMapping operation returned by the service. - `com.amazonaws.services.glue.model.GetMappingResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.GetMappingResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetMappingRequest get-mapping-request]
    (-> this (.getMapping get-mapping-request))))

(defn get-security-configurations
  "Retrieves a list of all security configurations.

  get-security-configurations-request - `com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest`

  returns: Result of the GetSecurityConfigurations operation returned by the service. - `com.amazonaws.services.glue.model.GetSecurityConfigurationsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetSecurityConfigurationsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetSecurityConfigurationsRequest get-security-configurations-request]
    (-> this (.getSecurityConfigurations get-security-configurations-request))))

(defn get-connections
  "Retrieves a list of connection definitions from the Data Catalog.

  get-connections-request - `com.amazonaws.services.glue.model.GetConnectionsRequest`

  returns: Result of the GetConnections operation returned by the service. - `com.amazonaws.services.glue.model.GetConnectionsResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetConnectionsResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetConnectionsRequest get-connections-request]
    (-> this (.getConnections get-connections-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSGlue this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn stop-crawler
  "If the specified crawler is running, stops the crawl.

  stop-crawler-request - `com.amazonaws.services.glue.model.StopCrawlerRequest`

  returns: Result of the StopCrawler operation returned by the service. - `com.amazonaws.services.glue.model.StopCrawlerResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.StopCrawlerResult [^AWSGlue this ^com.amazonaws.services.glue.model.StopCrawlerRequest stop-crawler-request]
    (-> this (.stopCrawler stop-crawler-request))))

(defn create-job
  "Creates a new job definition.

  create-job-request - `com.amazonaws.services.glue.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.glue.model.CreateJobResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreateJobResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateJobRequest create-job-request]
    (-> this (.createJob create-job-request))))

(defn create-database
  "Creates a new database in a Data Catalog.

  create-database-request - `com.amazonaws.services.glue.model.CreateDatabaseRequest`

  returns: Result of the CreateDatabase operation returned by the service. - `com.amazonaws.services.glue.model.CreateDatabaseResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreateDatabaseResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateDatabaseRequest create-database-request]
    (-> this (.createDatabase create-database-request))))

(defn tag-resource
  "Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only
   certain resources. For information about what resources you can tag, see AWS Tags in AWS Glue.

  tag-resource-request - `com.amazonaws.services.glue.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.glue.model.TagResourceResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.TagResourceResult [^AWSGlue this ^com.amazonaws.services.glue.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn get-classifier
  "Retrieve a classifier by name.

  get-classifier-request - `com.amazonaws.services.glue.model.GetClassifierRequest`

  returns: Result of the GetClassifier operation returned by the service. - `com.amazonaws.services.glue.model.GetClassifierResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.GetClassifierResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetClassifierRequest get-classifier-request]
    (-> this (.getClassifier get-classifier-request))))

(defn start-workflow-run
  "Starts a new run of the specified workflow.

  start-workflow-run-request - `com.amazonaws.services.glue.model.StartWorkflowRunRequest`

  returns: Result of the StartWorkflowRun operation returned by the service. - `com.amazonaws.services.glue.model.StartWorkflowRunResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.StartWorkflowRunResult [^AWSGlue this ^com.amazonaws.services.glue.model.StartWorkflowRunRequest start-workflow-run-request]
    (-> this (.startWorkflowRun start-workflow-run-request))))

(defn batch-delete-table
  "Deletes multiple tables at once.



   After completing this operation, you will no longer have access to the table versions and partitions that belong
   to the deleted table. AWS Glue deletes these \"orphaned\" resources asynchronously in a timely manner, at the
   discretion of the service.


   To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use
   DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or
   BatchDeletePartition, to delete any resources that belong to the table.

  batch-delete-table-request - `com.amazonaws.services.glue.model.BatchDeleteTableRequest`

  returns: Result of the BatchDeleteTable operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeleteTableResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchDeleteTableResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchDeleteTableRequest batch-delete-table-request]
    (-> this (.batchDeleteTable batch-delete-table-request))))

(defn update-user-defined-function
  "Updates an existing function definition in the Data Catalog.

  update-user-defined-function-request - `com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest`

  returns: Result of the UpdateUserDefinedFunction operation returned by the service. - `com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionResult [^AWSGlue this ^com.amazonaws.services.glue.model.UpdateUserDefinedFunctionRequest update-user-defined-function-request]
    (-> this (.updateUserDefinedFunction update-user-defined-function-request))))

(defn delete-database
  "Removes a specified Database from a Data Catalog.



   After completing this operation, you will no longer have access to the tables (and all table versions and
   partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue
   deletes these \"orphaned\" resources asynchronously in a timely manner, at the discretion of the service.


   To ensure immediate deletion of all related resources, before calling DeleteDatabase, use
   DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or
   BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or
   BatchDeleteTable, to delete any resources that belong to the database.

  delete-database-request - `com.amazonaws.services.glue.model.DeleteDatabaseRequest`

  returns: Result of the DeleteDatabase operation returned by the service. - `com.amazonaws.services.glue.model.DeleteDatabaseResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.DeleteDatabaseResult [^AWSGlue this ^com.amazonaws.services.glue.model.DeleteDatabaseRequest delete-database-request]
    (-> this (.deleteDatabase delete-database-request))))

(defn batch-delete-table-version
  "Deletes a specified batch of versions of a table.

  batch-delete-table-version-request - `com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest`

  returns: Result of the BatchDeleteTableVersion operation returned by the service. - `com.amazonaws.services.glue.model.BatchDeleteTableVersionResult`

  throws: com.amazonaws.services.glue.model.EntityNotFoundException - A specified entity does not exist"
  (^com.amazonaws.services.glue.model.BatchDeleteTableVersionResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchDeleteTableVersionRequest batch-delete-table-version-request]
    (-> this (.batchDeleteTableVersion batch-delete-table-version-request))))

(defn get-catalog-import-status
  "Retrieves the status of a migration operation.

  get-catalog-import-status-request - `com.amazonaws.services.glue.model.GetCatalogImportStatusRequest`

  returns: Result of the GetCatalogImportStatus operation returned by the service. - `com.amazonaws.services.glue.model.GetCatalogImportStatusResult`

  throws: com.amazonaws.services.glue.model.InternalServiceException - An internal service error occurred."
  (^com.amazonaws.services.glue.model.GetCatalogImportStatusResult [^AWSGlue this ^com.amazonaws.services.glue.model.GetCatalogImportStatusRequest get-catalog-import-status-request]
    (-> this (.getCatalogImportStatus get-catalog-import-status-request))))

(defn create-crawler
  "Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl
   target must be specified, in the s3Targets field, the jdbcTargets field, or the
   DynamoDBTargets field.

  create-crawler-request - `com.amazonaws.services.glue.model.CreateCrawlerRequest`

  returns: Result of the CreateCrawler operation returned by the service. - `com.amazonaws.services.glue.model.CreateCrawlerResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.CreateCrawlerResult [^AWSGlue this ^com.amazonaws.services.glue.model.CreateCrawlerRequest create-crawler-request]
    (-> this (.createCrawler create-crawler-request))))

(defn batch-get-partition
  "Retrieves partitions in a batch request.

  batch-get-partition-request - `com.amazonaws.services.glue.model.BatchGetPartitionRequest`

  returns: Result of the BatchGetPartition operation returned by the service. - `com.amazonaws.services.glue.model.BatchGetPartitionResult`

  throws: com.amazonaws.services.glue.model.InvalidInputException - The input provided was not valid."
  (^com.amazonaws.services.glue.model.BatchGetPartitionResult [^AWSGlue this ^com.amazonaws.services.glue.model.BatchGetPartitionRequest batch-get-partition-request]
    (-> this (.batchGetPartition batch-get-partition-request))))

