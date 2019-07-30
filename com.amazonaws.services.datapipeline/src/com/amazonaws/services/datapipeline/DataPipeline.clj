(ns com.amazonaws.services.datapipeline.DataPipeline
  "Interface for accessing AWS Data Pipeline.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractDataPipeline instead.



  AWS Data Pipeline configures and manages a data-driven workflow called a pipeline. AWS Data Pipeline handles the
  details of scheduling and ensuring that data dependencies are met so that your application can focus on processing
  the data.


  AWS Data Pipeline provides a JAR implementation of a task runner called AWS Data Pipeline Task Runner. AWS Data
  Pipeline Task Runner provides logic for common data management scenarios, such as performing database queries and
  running data analysis using Amazon Elastic MapReduce (Amazon EMR). You can use AWS Data Pipeline Task Runner as your
  task runner, or you can write your own task runner to provide custom data management.


  AWS Data Pipeline implements two main sets of functionality. Use the first set to create a pipeline and define data
  sources, schedules, dependencies, and the transforms to be performed on the data. Use the second set in your task
  runner application to receive the next task ready for processing. The logic for performing the task, such as querying
  the data, running data analysis, or converting the data from one format to another, is contained within the task
  runner. The task runner performs the task assigned to it by the web service, reporting progress to the web service as
  it does so. When the task is done, the task runner reports the final success or failure of the task to the web
  service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datapipeline DataPipeline]))

(defn add-tags
  "Adds or modifies tags for the specified pipeline.

  add-tags-request - Contains the parameters for AddTags. - `com.amazonaws.services.datapipeline.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.datapipeline.model.AddTagsResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.AddTagsResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.AddTagsRequest add-tags-request]
    (-> this (.addTags add-tags-request))))

(defn set-task-status
  "Task runners call SetTaskStatus to notify AWS Data Pipeline that a task is completed and provide
   information about the final status. A task runner makes this call regardless of whether the task was sucessful. A
   task runner does not need to call SetTaskStatus for tasks that are canceled by the web service
   during a call to ReportTaskProgress.

  set-task-status-request - Contains the parameters for SetTaskStatus. - `com.amazonaws.services.datapipeline.model.SetTaskStatusRequest`

  returns: Result of the SetTaskStatus operation returned by the service. - `com.amazonaws.services.datapipeline.model.SetTaskStatusResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.SetTaskStatusResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.SetTaskStatusRequest set-task-status-request]
    (-> this (.setTaskStatus set-task-status-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^DataPipeline this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn evaluate-expression
  "Task runners call EvaluateExpression to evaluate a string in the context of the specified object.
   For example, a task runner can evaluate SQL queries stored in Amazon S3.

  evaluate-expression-request - Contains the parameters for EvaluateExpression. - `com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest`

  returns: Result of the EvaluateExpression operation returned by the service. - `com.amazonaws.services.datapipeline.model.EvaluateExpressionResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.EvaluateExpressionResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest evaluate-expression-request]
    (-> this (.evaluateExpression evaluate-expression-request))))

(defn validate-pipeline-definition
  "Validates the specified pipeline definition to ensure that it is well formed and can be run without error.

  validate-pipeline-definition-request - Contains the parameters for ValidatePipelineDefinition. - `com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest`

  returns: Result of the ValidatePipelineDefinition operation returned by the service. - `com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest validate-pipeline-definition-request]
    (-> this (.validatePipelineDefinition validate-pipeline-definition-request))))

(defn put-pipeline-definition
  "Adds tasks, schedules, and preconditions to the specified pipeline. You can use
   PutPipelineDefinition to populate a new pipeline.


   PutPipelineDefinition also validates the configuration as it adds it to the pipeline. Changes to the
   pipeline are saved unless one of the following three validation errors exists in the pipeline.


   An object is missing a name or identifier field.
   A string or reference field is empty.
   The number of objects in the pipeline exceeds the maximum allowed objects.
   The pipeline is in a FINISHED state.


   Pipeline object definitions are passed to the PutPipelineDefinition action and returned by the
   GetPipelineDefinition action.

  put-pipeline-definition-request - Contains the parameters for PutPipelineDefinition. - `com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest`

  returns: Result of the PutPipelineDefinition operation returned by the service. - `com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest put-pipeline-definition-request]
    (-> this (.putPipelineDefinition put-pipeline-definition-request))))

(defn remove-tags
  "Removes existing tags from the specified pipeline.

  remove-tags-request - Contains the parameters for RemoveTags. - `com.amazonaws.services.datapipeline.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.datapipeline.model.RemoveTagsResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.RemoveTagsResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.RemoveTagsRequest remove-tags-request]
    (-> this (.removeTags remove-tags-request))))

(defn poll-for-task
  "Task runners call PollForTask to receive a task to perform from AWS Data Pipeline. The task runner
   specifies which tasks it can perform by setting a value for the workerGroup parameter. The task
   returned can come from any of the pipelines that match the workerGroup value passed in by the task
   runner and that was launched using the IAM user credentials specified by the task runner.


   If tasks are ready in the work queue, PollForTask returns a response immediately. If no tasks are
   available in the queue, PollForTask uses long-polling and holds on to a poll connection for up to a
   90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this,
   set the socket timeout in your task runner to 90 seconds. The task runner should not call
   PollForTask again on the same workerGroup until it receives a response, and this can
   take up to 90 seconds.

  poll-for-task-request - Contains the parameters for PollForTask. - `com.amazonaws.services.datapipeline.model.PollForTaskRequest`

  returns: Result of the PollForTask operation returned by the service. - `com.amazonaws.services.datapipeline.model.PollForTaskResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.PollForTaskResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.PollForTaskRequest poll-for-task-request]
    (-> this (.pollForTask poll-for-task-request))))

(defn list-pipelines
  "Lists the pipeline identifiers for all active pipelines that you have permission to access.

  list-pipelines-request - Contains the parameters for ListPipelines. - `com.amazonaws.services.datapipeline.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.datapipeline.model.ListPipelinesResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.ListPipelinesResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.ListPipelinesRequest list-pipelines-request]
    (-> this (.listPipelines list-pipelines-request)))
  (^com.amazonaws.services.datapipeline.model.ListPipelinesResult [^DataPipeline this]
    (-> this (.listPipelines))))

(defn describe-objects
  "Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of
   a set of fields that define the properties of the object.

  describe-objects-request - Contains the parameters for DescribeObjects. - `com.amazonaws.services.datapipeline.model.DescribeObjectsRequest`

  returns: Result of the DescribeObjects operation returned by the service. - `com.amazonaws.services.datapipeline.model.DescribeObjectsResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.DescribeObjectsResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.DescribeObjectsRequest describe-objects-request]
    (-> this (.describeObjects describe-objects-request))))

(defn describe-pipelines
  "Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the
   pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials,
   you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user
   account, you can retrieve metadata about only those pipelines for which you have read permissions.


   To retrieve the full pipeline definition instead of metadata about the pipeline, call
   GetPipelineDefinition.

  describe-pipelines-request - Contains the parameters for DescribePipelines. - `com.amazonaws.services.datapipeline.model.DescribePipelinesRequest`

  returns: Result of the DescribePipelines operation returned by the service. - `com.amazonaws.services.datapipeline.model.DescribePipelinesResult`

  throws: com.amazonaws.services.datapipeline.model.PipelineNotFoundException - The specified pipeline was not found. Verify that you used the correct user and account identifiers."
  (^com.amazonaws.services.datapipeline.model.DescribePipelinesResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.DescribePipelinesRequest describe-pipelines-request]
    (-> this (.describePipelines describe-pipelines-request))))

(defn create-pipeline
  "Creates a new, empty pipeline. Use PutPipelineDefinition to populate the pipeline.

  create-pipeline-request - Contains the parameters for CreatePipeline. - `com.amazonaws.services.datapipeline.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.datapipeline.model.CreatePipelineResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.CreatePipelineResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.CreatePipelineRequest create-pipeline-request]
    (-> this (.createPipeline create-pipeline-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^DataPipeline this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"datapipeline.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"datapipeline.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^DataPipeline this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn report-task-progress
  "Task runners call ReportTaskProgress when assigned a task to acknowledge that it has the task. If
   the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent
   PollForTask call. After this initial acknowledgement, the task runner only needs to report progress every
   15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by
   specifying a reportProgressTimeout field in your pipeline.


   If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is
   unable to process the task and reassigns the task in a subsequent response to PollForTask. Task runners
   should call ReportTaskProgress every 60 seconds.

  report-task-progress-request - Contains the parameters for ReportTaskProgress. - `com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest`

  returns: Result of the ReportTaskProgress operation returned by the service. - `com.amazonaws.services.datapipeline.model.ReportTaskProgressResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.ReportTaskProgressResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest report-task-progress-request]
    (-> this (.reportTaskProgress report-task-progress-request))))

(defn report-task-runner-heartbeat
  "Task runners call ReportTaskRunnerHeartbeat every 15 minutes to indicate that they are operational.
   If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can
   use this call to detect when the task runner application has failed and restart a new instance.

  report-task-runner-heartbeat-request - Contains the parameters for ReportTaskRunnerHeartbeat. - `com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest`

  returns: Result of the ReportTaskRunnerHeartbeat operation returned by the service. - `com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest report-task-runner-heartbeat-request]
    (-> this (.reportTaskRunnerHeartbeat report-task-runner-heartbeat-request))))

(defn deactivate-pipeline
  "Deactivates the specified running pipeline. The pipeline is set to the DEACTIVATING state until the
   deactivation process completes.


   To resume a deactivated pipeline, use ActivatePipeline. By default, the pipeline resumes from the last
   completed execution. Optionally, you can specify the date and time to resume the pipeline.

  deactivate-pipeline-request - Contains the parameters for DeactivatePipeline. - `com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest`

  returns: Result of the DeactivatePipeline operation returned by the service. - `com.amazonaws.services.datapipeline.model.DeactivatePipelineResult`

  throws: com.amazonaws.services.datapipeline.model.PipelineNotFoundException - The specified pipeline was not found. Verify that you used the correct user and account identifiers."
  (^com.amazonaws.services.datapipeline.model.DeactivatePipelineResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest deactivate-pipeline-request]
    (-> this (.deactivatePipeline deactivate-pipeline-request))))

(defn activate-pipeline
  "Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation,
   activation fails.


   If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call
   DeactivatePipeline.


   To activate a finished pipeline, modify the end date for the pipeline and then activate it.

  activate-pipeline-request - Contains the parameters for ActivatePipeline. - `com.amazonaws.services.datapipeline.model.ActivatePipelineRequest`

  returns: Result of the ActivatePipeline operation returned by the service. - `com.amazonaws.services.datapipeline.model.ActivatePipelineResult`

  throws: com.amazonaws.services.datapipeline.model.PipelineNotFoundException - The specified pipeline was not found. Verify that you used the correct user and account identifiers."
  (^com.amazonaws.services.datapipeline.model.ActivatePipelineResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.ActivatePipelineRequest activate-pipeline-request]
    (-> this (.activatePipeline activate-pipeline-request))))

(defn query-objects
  "Queries the specified pipeline for the names of objects that match the specified set of conditions.

  query-objects-request - Contains the parameters for QueryObjects. - `com.amazonaws.services.datapipeline.model.QueryObjectsRequest`

  returns: Result of the QueryObjects operation returned by the service. - `com.amazonaws.services.datapipeline.model.QueryObjectsResult`

  throws: com.amazonaws.services.datapipeline.model.PipelineNotFoundException - The specified pipeline was not found. Verify that you used the correct user and account identifiers."
  (^com.amazonaws.services.datapipeline.model.QueryObjectsResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.QueryObjectsRequest query-objects-request]
    (-> this (.queryObjects query-objects-request))))

(defn get-pipeline-definition
  "Gets the definition of the specified pipeline. You can call GetPipelineDefinition to retrieve the
   pipeline definition that you provided using PutPipelineDefinition.

  get-pipeline-definition-request - Contains the parameters for GetPipelineDefinition. - `com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest`

  returns: Result of the GetPipelineDefinition operation returned by the service. - `com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult`

  throws: com.amazonaws.services.datapipeline.model.InternalServiceErrorException - An internal service error occurred."
  (^com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest get-pipeline-definition-request]
    (-> this (.getPipelineDefinition get-pipeline-definition-request))))

(defn delete-pipeline
  "Deletes a pipeline, its pipeline definition, and its run history. AWS Data Pipeline attempts to cancel instances
   associated with the pipeline that are currently being processed by task runners.


   Deleting a pipeline cannot be undone. You cannot query or restore a deleted pipeline. To temporarily pause a
   pipeline instead of deleting it, call SetStatus with the status set to PAUSE on individual
   components. Components that are paused by SetStatus can be resumed.

  delete-pipeline-request - Contains the parameters for DeletePipeline. - `com.amazonaws.services.datapipeline.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.datapipeline.model.DeletePipelineResult`

  throws: com.amazonaws.services.datapipeline.model.PipelineNotFoundException - The specified pipeline was not found. Verify that you used the correct user and account identifiers."
  (^com.amazonaws.services.datapipeline.model.DeletePipelineResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.DeletePipelineRequest delete-pipeline-request]
    (-> this (.deletePipeline delete-pipeline-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^DataPipeline this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-status
  "Requests that the status of the specified physical or logical pipeline objects be updated in the specified
   pipeline. This update might not occur immediately, but is eventually consistent. The status that can be set
   depends on the type of object (for example, DataNode or Activity). You cannot perform this operation on
   FINISHED pipelines and attempting to do so returns InvalidRequestException.

  set-status-request - Contains the parameters for SetStatus. - `com.amazonaws.services.datapipeline.model.SetStatusRequest`

  returns: Result of the SetStatus operation returned by the service. - `com.amazonaws.services.datapipeline.model.SetStatusResult`

  throws: com.amazonaws.services.datapipeline.model.PipelineNotFoundException - The specified pipeline was not found. Verify that you used the correct user and account identifiers."
  (^com.amazonaws.services.datapipeline.model.SetStatusResult [^DataPipeline this ^com.amazonaws.services.datapipeline.model.SetStatusRequest set-status-request]
    (-> this (.setStatus set-status-request))))

