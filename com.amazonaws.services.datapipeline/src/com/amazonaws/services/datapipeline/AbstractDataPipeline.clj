(ns com.amazonaws.services.datapipeline.AbstractDataPipeline
  "Abstract implementation of DataPipeline. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datapipeline AbstractDataPipeline]))

(defn add-tags
  "Description copied from interface: DataPipeline

  request - Contains the parameters for AddTags. - `com.amazonaws.services.datapipeline.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.datapipeline.model.AddTagsResult`"
  (^com.amazonaws.services.datapipeline.model.AddTagsResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn set-task-status
  "Description copied from interface: DataPipeline

  request - Contains the parameters for SetTaskStatus. - `com.amazonaws.services.datapipeline.model.SetTaskStatusRequest`

  returns: Result of the SetTaskStatus operation returned by the service. - `com.amazonaws.services.datapipeline.model.SetTaskStatusResult`"
  (^com.amazonaws.services.datapipeline.model.SetTaskStatusResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.SetTaskStatusRequest request]
    (-> this (.setTaskStatus request))))

(defn set-region
  "Description copied from interface: DataPipeline

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractDataPipeline this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn evaluate-expression
  "Description copied from interface: DataPipeline

  request - Contains the parameters for EvaluateExpression. - `com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest`

  returns: Result of the EvaluateExpression operation returned by the service. - `com.amazonaws.services.datapipeline.model.EvaluateExpressionResult`"
  (^com.amazonaws.services.datapipeline.model.EvaluateExpressionResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest request]
    (-> this (.evaluateExpression request))))

(defn validate-pipeline-definition
  "Description copied from interface: DataPipeline

  request - Contains the parameters for ValidatePipelineDefinition. - `com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest`

  returns: Result of the ValidatePipelineDefinition operation returned by the service. - `com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult`"
  (^com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest request]
    (-> this (.validatePipelineDefinition request))))

(defn put-pipeline-definition
  "Description copied from interface: DataPipeline

  request - Contains the parameters for PutPipelineDefinition. - `com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest`

  returns: Result of the PutPipelineDefinition operation returned by the service. - `com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult`"
  (^com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest request]
    (-> this (.putPipelineDefinition request))))

(defn remove-tags
  "Description copied from interface: DataPipeline

  request - Contains the parameters for RemoveTags. - `com.amazonaws.services.datapipeline.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.datapipeline.model.RemoveTagsResult`"
  (^com.amazonaws.services.datapipeline.model.RemoveTagsResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.RemoveTagsRequest request]
    (-> this (.removeTags request))))

(defn poll-for-task
  "Description copied from interface: DataPipeline

  request - Contains the parameters for PollForTask. - `com.amazonaws.services.datapipeline.model.PollForTaskRequest`

  returns: Result of the PollForTask operation returned by the service. - `com.amazonaws.services.datapipeline.model.PollForTaskResult`"
  (^com.amazonaws.services.datapipeline.model.PollForTaskResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.PollForTaskRequest request]
    (-> this (.pollForTask request))))

(defn list-pipelines
  "Description copied from interface: DataPipeline

  request - Contains the parameters for ListPipelines. - `com.amazonaws.services.datapipeline.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.datapipeline.model.ListPipelinesResult`"
  (^com.amazonaws.services.datapipeline.model.ListPipelinesResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.ListPipelinesRequest request]
    (-> this (.listPipelines request)))
  (^com.amazonaws.services.datapipeline.model.ListPipelinesResult [^AbstractDataPipeline this]
    (-> this (.listPipelines))))

(defn describe-objects
  "Description copied from interface: DataPipeline

  request - Contains the parameters for DescribeObjects. - `com.amazonaws.services.datapipeline.model.DescribeObjectsRequest`

  returns: Result of the DescribeObjects operation returned by the service. - `com.amazonaws.services.datapipeline.model.DescribeObjectsResult`"
  (^com.amazonaws.services.datapipeline.model.DescribeObjectsResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.DescribeObjectsRequest request]
    (-> this (.describeObjects request))))

(defn describe-pipelines
  "Description copied from interface: DataPipeline

  request - Contains the parameters for DescribePipelines. - `com.amazonaws.services.datapipeline.model.DescribePipelinesRequest`

  returns: Result of the DescribePipelines operation returned by the service. - `com.amazonaws.services.datapipeline.model.DescribePipelinesResult`"
  (^com.amazonaws.services.datapipeline.model.DescribePipelinesResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.DescribePipelinesRequest request]
    (-> this (.describePipelines request))))

(defn create-pipeline
  "Description copied from interface: DataPipeline

  request - Contains the parameters for CreatePipeline. - `com.amazonaws.services.datapipeline.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.datapipeline.model.CreatePipelineResult`"
  (^com.amazonaws.services.datapipeline.model.CreatePipelineResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.CreatePipelineRequest request]
    (-> this (.createPipeline request))))

(defn shutdown
  "Description copied from interface: DataPipeline"
  ([^AbstractDataPipeline this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: DataPipeline

  endpoint - The endpoint (ex: \"datapipeline.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"datapipeline.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractDataPipeline this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn report-task-progress
  "Description copied from interface: DataPipeline

  request - Contains the parameters for ReportTaskProgress. - `com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest`

  returns: Result of the ReportTaskProgress operation returned by the service. - `com.amazonaws.services.datapipeline.model.ReportTaskProgressResult`"
  (^com.amazonaws.services.datapipeline.model.ReportTaskProgressResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest request]
    (-> this (.reportTaskProgress request))))

(defn report-task-runner-heartbeat
  "Description copied from interface: DataPipeline

  request - Contains the parameters for ReportTaskRunnerHeartbeat. - `com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest`

  returns: Result of the ReportTaskRunnerHeartbeat operation returned by the service. - `com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult`"
  (^com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest request]
    (-> this (.reportTaskRunnerHeartbeat request))))

(defn deactivate-pipeline
  "Description copied from interface: DataPipeline

  request - Contains the parameters for DeactivatePipeline. - `com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest`

  returns: Result of the DeactivatePipeline operation returned by the service. - `com.amazonaws.services.datapipeline.model.DeactivatePipelineResult`"
  (^com.amazonaws.services.datapipeline.model.DeactivatePipelineResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest request]
    (-> this (.deactivatePipeline request))))

(defn activate-pipeline
  "Description copied from interface: DataPipeline

  request - Contains the parameters for ActivatePipeline. - `com.amazonaws.services.datapipeline.model.ActivatePipelineRequest`

  returns: Result of the ActivatePipeline operation returned by the service. - `com.amazonaws.services.datapipeline.model.ActivatePipelineResult`"
  (^com.amazonaws.services.datapipeline.model.ActivatePipelineResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.ActivatePipelineRequest request]
    (-> this (.activatePipeline request))))

(defn query-objects
  "Description copied from interface: DataPipeline

  request - Contains the parameters for QueryObjects. - `com.amazonaws.services.datapipeline.model.QueryObjectsRequest`

  returns: Result of the QueryObjects operation returned by the service. - `com.amazonaws.services.datapipeline.model.QueryObjectsResult`"
  (^com.amazonaws.services.datapipeline.model.QueryObjectsResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.QueryObjectsRequest request]
    (-> this (.queryObjects request))))

(defn get-pipeline-definition
  "Description copied from interface: DataPipeline

  request - Contains the parameters for GetPipelineDefinition. - `com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest`

  returns: Result of the GetPipelineDefinition operation returned by the service. - `com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult`"
  (^com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest request]
    (-> this (.getPipelineDefinition request))))

(defn delete-pipeline
  "Description copied from interface: DataPipeline

  request - Contains the parameters for DeletePipeline. - `com.amazonaws.services.datapipeline.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.datapipeline.model.DeletePipelineResult`"
  (^com.amazonaws.services.datapipeline.model.DeletePipelineResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.DeletePipelineRequest request]
    (-> this (.deletePipeline request))))

(defn get-cached-response-metadata
  "Description copied from interface: DataPipeline

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractDataPipeline this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-status
  "Description copied from interface: DataPipeline

  request - Contains the parameters for SetStatus. - `com.amazonaws.services.datapipeline.model.SetStatusRequest`

  returns: Result of the SetStatus operation returned by the service. - `com.amazonaws.services.datapipeline.model.SetStatusResult`"
  (^com.amazonaws.services.datapipeline.model.SetStatusResult [^AbstractDataPipeline this ^com.amazonaws.services.datapipeline.model.SetStatusRequest request]
    (-> this (.setStatus request))))

