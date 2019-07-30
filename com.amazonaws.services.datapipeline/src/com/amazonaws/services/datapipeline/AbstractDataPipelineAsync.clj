(ns com.amazonaws.services.datapipeline.AbstractDataPipelineAsync
  "Abstract implementation of DataPipelineAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datapipeline AbstractDataPipelineAsync]))

(defn describe-objects-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for DescribeObjects. - `com.amazonaws.services.datapipeline.model.DescribeObjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeObjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.DescribeObjectsResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.DescribeObjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeObjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.DescribeObjectsRequest request]
    (-> this (.describeObjectsAsync request))))

(defn set-task-status-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for SetTaskStatus. - `com.amazonaws.services.datapipeline.model.SetTaskStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetTaskStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.SetTaskStatusResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.SetTaskStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTaskStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.SetTaskStatusRequest request]
    (-> this (.setTaskStatusAsync request))))

(defn validate-pipeline-definition-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for ValidatePipelineDefinition. - `com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ValidatePipelineDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.validatePipelineDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ValidatePipelineDefinitionRequest request]
    (-> this (.validatePipelineDefinitionAsync request))))

(defn deactivate-pipeline-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for DeactivatePipeline. - `com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeactivatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.DeactivatePipelineResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deactivatePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.DeactivatePipelineRequest request]
    (-> this (.deactivatePipelineAsync request))))

(defn poll-for-task-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for PollForTask. - `com.amazonaws.services.datapipeline.model.PollForTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PollForTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.PollForTaskResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.PollForTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.pollForTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.PollForTaskRequest request]
    (-> this (.pollForTaskAsync request))))

(defn set-status-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for SetStatus. - `com.amazonaws.services.datapipeline.model.SetStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.SetStatusResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.SetStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.SetStatusRequest request]
    (-> this (.setStatusAsync request))))

(defn query-objects-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for QueryObjects. - `com.amazonaws.services.datapipeline.model.QueryObjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the QueryObjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.QueryObjectsResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.QueryObjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.queryObjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.QueryObjectsRequest request]
    (-> this (.queryObjectsAsync request))))

(defn list-pipelines-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for ListPipelines. - `com.amazonaws.services.datapipeline.model.ListPipelinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.ListPipelinesResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ListPipelinesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelinesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ListPipelinesRequest request]
    (-> this (.listPipelinesAsync request)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this]
    (-> this (.listPipelinesAsync))))

(defn activate-pipeline-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for ActivatePipeline. - `com.amazonaws.services.datapipeline.model.ActivatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ActivatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.ActivatePipelineResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ActivatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.activatePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ActivatePipelineRequest request]
    (-> this (.activatePipelineAsync request))))

(defn delete-pipeline-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for DeletePipeline. - `com.amazonaws.services.datapipeline.model.DeletePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.DeletePipelineResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.DeletePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.DeletePipelineRequest request]
    (-> this (.deletePipelineAsync request))))

(defn put-pipeline-definition-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for PutPipelineDefinition. - `com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPipelineDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.PutPipelineDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPipelineDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.PutPipelineDefinitionRequest request]
    (-> this (.putPipelineDefinitionAsync request))))

(defn evaluate-expression-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for EvaluateExpression. - `com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EvaluateExpression operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.EvaluateExpressionResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.evaluateExpressionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.EvaluateExpressionRequest request]
    (-> this (.evaluateExpressionAsync request))))

(defn report-task-progress-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for ReportTaskProgress. - `com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReportTaskProgress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.ReportTaskProgressResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reportTaskProgressAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ReportTaskProgressRequest request]
    (-> this (.reportTaskProgressAsync request))))

(defn remove-tags-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for RemoveTags. - `com.amazonaws.services.datapipeline.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.RemoveTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.RemoveTagsRequest request]
    (-> this (.removeTagsAsync request))))

(defn create-pipeline-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for CreatePipeline. - `com.amazonaws.services.datapipeline.model.CreatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.CreatePipelineResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.CreatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.CreatePipelineRequest request]
    (-> this (.createPipelineAsync request))))

(defn report-task-runner-heartbeat-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for ReportTaskRunnerHeartbeat. - `com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReportTaskRunnerHeartbeat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reportTaskRunnerHeartbeatAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.ReportTaskRunnerHeartbeatRequest request]
    (-> this (.reportTaskRunnerHeartbeatAsync request))))

(defn get-pipeline-definition-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for GetPipelineDefinition. - `com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipelineDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.GetPipelineDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.GetPipelineDefinitionRequest request]
    (-> this (.getPipelineDefinitionAsync request))))

(defn describe-pipelines-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for DescribePipelines. - `com.amazonaws.services.datapipeline.model.DescribePipelinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePipelines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.DescribePipelinesResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.DescribePipelinesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePipelinesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.DescribePipelinesRequest request]
    (-> this (.describePipelinesAsync request))))

(defn add-tags-async
  "Description copied from interface: DataPipelineAsync

  request - Contains the parameters for AddTags. - `com.amazonaws.services.datapipeline.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datapipeline.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.AddTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractDataPipelineAsync this ^com.amazonaws.services.datapipeline.model.AddTagsRequest request]
    (-> this (.addTagsAsync request))))

