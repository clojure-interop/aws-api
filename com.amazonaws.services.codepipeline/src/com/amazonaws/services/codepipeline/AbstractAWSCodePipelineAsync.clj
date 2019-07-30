(ns com.amazonaws.services.codepipeline.AbstractAWSCodePipelineAsync
  "Abstract implementation of AWSCodePipelineAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codepipeline AbstractAWSCodePipelineAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-third-party-job-details-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetThirdPartyJobDetails action. - `com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetThirdPartyJobDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getThirdPartyJobDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest request]
    (-> this (.getThirdPartyJobDetailsAsync request))))

(defn put-webhook-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.PutWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutWebhookResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutWebhookRequest request]
    (-> this (.putWebhookAsync request))))

(defn create-custom-action-type-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a CreateCustomActionType operation. - `com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomActionType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomActionTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest request]
    (-> this (.createCustomActionTypeAsync request))))

(defn update-pipeline-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of an UpdatePipeline action. - `com.amazonaws.services.codepipeline.model.UpdatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.UpdatePipelineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.UpdatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.UpdatePipelineRequest request]
    (-> this (.updatePipelineAsync request))))

(defn register-webhook-with-third-party-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterWebhookWithThirdParty operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerWebhookWithThirdPartyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest request]
    (-> this (.registerWebhookWithThirdPartyAsync request))))

(defn put-job-success-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutJobSuccessResult action. - `com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutJobSuccessResult operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putJobSuccessResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest request]
    (-> this (.putJobSuccessResultAsync request))))

(defn acknowledge-third-party-job-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of an AcknowledgeThirdPartyJob action. - `com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcknowledgeThirdPartyJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acknowledgeThirdPartyJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest request]
    (-> this (.acknowledgeThirdPartyJobAsync request))))

(defn enable-stage-transition-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of an EnableStageTransition action. - `com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableStageTransition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.EnableStageTransitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableStageTransitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest request]
    (-> this (.enableStageTransitionAsync request))))

(defn acknowledge-job-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of an AcknowledgeJob action. - `com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcknowledgeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.AcknowledgeJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acknowledgeJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest request]
    (-> this (.acknowledgeJobAsync request))))

(defn put-approval-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutApprovalResult action. - `com.amazonaws.services.codepipeline.model.PutApprovalResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutApprovalResult operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutApprovalResultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutApprovalResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putApprovalResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutApprovalResultRequest request]
    (-> this (.putApprovalResultAsync request))))

(defn poll-for-third-party-jobs-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PollForThirdPartyJobs action. - `com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PollForThirdPartyJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.pollForThirdPartyJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest request]
    (-> this (.pollForThirdPartyJobsAsync request))))

(defn start-pipeline-execution-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a StartPipelineExecution action. - `com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartPipelineExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startPipelineExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest request]
    (-> this (.startPipelineExecutionAsync request))))

(defn put-third-party-job-failure-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutThirdPartyJobFailureResult action. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutThirdPartyJobFailureResult operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putThirdPartyJobFailureResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest request]
    (-> this (.putThirdPartyJobFailureResultAsync request))))

(defn delete-custom-action-type-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a DeleteCustomActionType operation. The custom action will be marked as deleted. - `com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomActionType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomActionTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest request]
    (-> this (.deleteCustomActionTypeAsync request))))

(defn put-job-failure-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutJobFailureResult action. - `com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutJobFailureResult operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutJobFailureResultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putJobFailureResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest request]
    (-> this (.putJobFailureResultAsync request))))

(defn put-third-party-job-success-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutThirdPartyJobSuccessResult action. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutThirdPartyJobSuccessResult operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putThirdPartyJobSuccessResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest request]
    (-> this (.putThirdPartyJobSuccessResultAsync request))))

(defn list-pipelines-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a ListPipelines action. - `com.amazonaws.services.codepipeline.model.ListPipelinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListPipelinesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListPipelinesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelinesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListPipelinesRequest request]
    (-> this (.listPipelinesAsync request))))

(defn delete-webhook-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.DeleteWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeleteWebhookResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeleteWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhookAsync request))))

(defn delete-pipeline-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a DeletePipeline action. - `com.amazonaws.services.codepipeline.model.DeletePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeletePipelineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeletePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeletePipelineRequest request]
    (-> this (.deletePipelineAsync request))))

(defn poll-for-jobs-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PollForJobs action. - `com.amazonaws.services.codepipeline.model.PollForJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PollForJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PollForJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PollForJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.pollForJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PollForJobsRequest request]
    (-> this (.pollForJobsAsync request))))

(defn deregister-webhook-with-third-party-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterWebhookWithThirdParty operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterWebhookWithThirdPartyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest request]
    (-> this (.deregisterWebhookWithThirdPartyAsync request))))

(defn list-action-types-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a ListActionTypes action. - `com.amazonaws.services.codepipeline.model.ListActionTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActionTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListActionTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListActionTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActionTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListActionTypesRequest request]
    (-> this (.listActionTypesAsync request))))

(defn list-action-executions-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActionExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListActionExecutionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActionExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest request]
    (-> this (.listActionExecutionsAsync request))))

(defn create-pipeline-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a CreatePipeline action. - `com.amazonaws.services.codepipeline.model.CreatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.CreatePipelineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.CreatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.CreatePipelineRequest request]
    (-> this (.createPipelineAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn put-action-revision-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutActionRevision action. - `com.amazonaws.services.codepipeline.model.PutActionRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutActionRevision operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutActionRevisionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutActionRevisionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putActionRevisionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutActionRevisionRequest request]
    (-> this (.putActionRevisionAsync request))))

(defn list-pipeline-executions-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a ListPipelineExecutions action. - `com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelineExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelineExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest request]
    (-> this (.listPipelineExecutionsAsync request))))

(defn disable-stage-transition-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a DisableStageTransition action. - `com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableStageTransition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DisableStageTransitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableStageTransitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest request]
    (-> this (.disableStageTransitionAsync request))))

(defn get-job-details-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetJobDetails action. - `com.amazonaws.services.codepipeline.model.GetJobDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetJobDetailsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetJobDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetJobDetailsRequest request]
    (-> this (.getJobDetailsAsync request))))

(defn get-pipeline-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetPipeline action. - `com.amazonaws.services.codepipeline.model.GetPipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetPipelineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineRequest request]
    (-> this (.getPipelineAsync request))))

(defn get-pipeline-state-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetPipelineState action. - `com.amazonaws.services.codepipeline.model.GetPipelineStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipelineState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetPipelineStateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineStateRequest request]
    (-> this (.getPipelineStateAsync request))))

(defn list-webhooks-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.ListWebhooksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebhooks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListWebhooksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListWebhooksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebhooksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListWebhooksRequest request]
    (-> this (.listWebhooksAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn retry-stage-execution-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a RetryStageExecution action. - `com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetryStageExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.RetryStageExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retryStageExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest request]
    (-> this (.retryStageExecutionAsync request))))

(defn get-pipeline-execution-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetPipelineExecution action. - `com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipelineExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest request]
    (-> this (.getPipelineExecutionAsync request))))

