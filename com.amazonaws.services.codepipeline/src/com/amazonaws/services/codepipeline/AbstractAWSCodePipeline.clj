(ns com.amazonaws.services.codepipeline.AbstractAWSCodePipeline
  "Abstract implementation of AWSCodePipeline. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codepipeline AbstractAWSCodePipeline]))

(defn list-tags-for-resource
  "Description copied from interface: AWSCodePipeline

  request - `com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.codepipeline.model.ListTagsForResourceResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-webhook
  "Description copied from interface: AWSCodePipeline

  request - `com.amazonaws.services.codepipeline.model.DeleteWebhookRequest`

  returns: Result of the DeleteWebhook operation returned by the service. - `com.amazonaws.services.codepipeline.model.DeleteWebhookResult`"
  (^com.amazonaws.services.codepipeline.model.DeleteWebhookResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhook request))))

(defn set-region
  "Description copied from interface: AWSCodePipeline

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSCodePipeline this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-pipeline
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of an UpdatePipeline action. - `com.amazonaws.services.codepipeline.model.UpdatePipelineRequest`

  returns: Result of the UpdatePipeline operation returned by the service. - `com.amazonaws.services.codepipeline.model.UpdatePipelineResult`"
  (^com.amazonaws.services.codepipeline.model.UpdatePipelineResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.UpdatePipelineRequest request]
    (-> this (.updatePipeline request))))

(defn put-action-revision
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a PutActionRevision action. - `com.amazonaws.services.codepipeline.model.PutActionRevisionRequest`

  returns: Result of the PutActionRevision operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutActionRevisionResult`"
  (^com.amazonaws.services.codepipeline.model.PutActionRevisionResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.PutActionRevisionRequest request]
    (-> this (.putActionRevision request))))

(defn put-third-party-job-failure-result
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a PutThirdPartyJobFailureResult action. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest`

  returns: Result of the PutThirdPartyJobFailureResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult`"
  (^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest request]
    (-> this (.putThirdPartyJobFailureResult request))))

(defn put-third-party-job-success-result
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a PutThirdPartyJobSuccessResult action. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest`

  returns: Result of the PutThirdPartyJobSuccessResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult`"
  (^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest request]
    (-> this (.putThirdPartyJobSuccessResult request))))

(defn enable-stage-transition
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of an EnableStageTransition action. - `com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest`

  returns: Result of the EnableStageTransition operation returned by the service. - `com.amazonaws.services.codepipeline.model.EnableStageTransitionResult`"
  (^com.amazonaws.services.codepipeline.model.EnableStageTransitionResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest request]
    (-> this (.enableStageTransition request))))

(defn list-pipelines
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a ListPipelines action. - `com.amazonaws.services.codepipeline.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListPipelinesResult`"
  (^com.amazonaws.services.codepipeline.model.ListPipelinesResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.ListPipelinesRequest request]
    (-> this (.listPipelines request))))

(defn untag-resource
  "Description copied from interface: AWSCodePipeline

  request - `com.amazonaws.services.codepipeline.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.codepipeline.model.UntagResourceResult`"
  (^com.amazonaws.services.codepipeline.model.UntagResourceResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-pipeline-execution
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a GetPipelineExecution action. - `com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest`

  returns: Result of the GetPipelineExecution operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult`"
  (^com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest request]
    (-> this (.getPipelineExecution request))))

(defn put-approval-result
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a PutApprovalResult action. - `com.amazonaws.services.codepipeline.model.PutApprovalResultRequest`

  returns: Result of the PutApprovalResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutApprovalResultResult`"
  (^com.amazonaws.services.codepipeline.model.PutApprovalResultResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.PutApprovalResultRequest request]
    (-> this (.putApprovalResult request))))

(defn get-pipeline-state
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a GetPipelineState action. - `com.amazonaws.services.codepipeline.model.GetPipelineStateRequest`

  returns: Result of the GetPipelineState operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetPipelineStateResult`"
  (^com.amazonaws.services.codepipeline.model.GetPipelineStateResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.GetPipelineStateRequest request]
    (-> this (.getPipelineState request))))

(defn start-pipeline-execution
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a StartPipelineExecution action. - `com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest`

  returns: Result of the StartPipelineExecution operation returned by the service. - `com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult`"
  (^com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest request]
    (-> this (.startPipelineExecution request))))

(defn list-action-executions
  "Description copied from interface: AWSCodePipeline

  request - `com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest`

  returns: Result of the ListActionExecutions operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListActionExecutionsResult`"
  (^com.amazonaws.services.codepipeline.model.ListActionExecutionsResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest request]
    (-> this (.listActionExecutions request))))

(defn list-pipeline-executions
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a ListPipelineExecutions action. - `com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest`

  returns: Result of the ListPipelineExecutions operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult`"
  (^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest request]
    (-> this (.listPipelineExecutions request))))

(defn create-pipeline
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a CreatePipeline action. - `com.amazonaws.services.codepipeline.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.codepipeline.model.CreatePipelineResult`"
  (^com.amazonaws.services.codepipeline.model.CreatePipelineResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.CreatePipelineRequest request]
    (-> this (.createPipeline request))))

(defn deregister-webhook-with-third-party
  "Description copied from interface: AWSCodePipeline

  request - `com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest`

  returns: Result of the DeregisterWebhookWithThirdParty operation returned by the service. - `com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyResult`"
  (^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest request]
    (-> this (.deregisterWebhookWithThirdParty request))))

(defn retry-stage-execution
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a RetryStageExecution action. - `com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest`

  returns: Result of the RetryStageExecution operation returned by the service. - `com.amazonaws.services.codepipeline.model.RetryStageExecutionResult`"
  (^com.amazonaws.services.codepipeline.model.RetryStageExecutionResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest request]
    (-> this (.retryStageExecution request))))

(defn shutdown
  "Description copied from interface: AWSCodePipeline"
  ([^AbstractAWSCodePipeline this]
    (-> this (.shutdown))))

(defn acknowledge-job
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of an AcknowledgeJob action. - `com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest`

  returns: Result of the AcknowledgeJob operation returned by the service. - `com.amazonaws.services.codepipeline.model.AcknowledgeJobResult`"
  (^com.amazonaws.services.codepipeline.model.AcknowledgeJobResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest request]
    (-> this (.acknowledgeJob request))))

(defn set-endpoint
  "Description copied from interface: AWSCodePipeline

  endpoint - The endpoint (ex: \"codepipeline.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://codepipeline.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSCodePipeline this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-custom-action-type
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a CreateCustomActionType operation. - `com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest`

  returns: Result of the CreateCustomActionType operation returned by the service. - `com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult`"
  (^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest request]
    (-> this (.createCustomActionType request))))

(defn register-webhook-with-third-party
  "Description copied from interface: AWSCodePipeline

  request - `com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest`

  returns: Result of the RegisterWebhookWithThirdParty operation returned by the service. - `com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyResult`"
  (^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest request]
    (-> this (.registerWebhookWithThirdParty request))))

(defn list-webhooks
  "Description copied from interface: AWSCodePipeline

  request - `com.amazonaws.services.codepipeline.model.ListWebhooksRequest`

  returns: Result of the ListWebhooks operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListWebhooksResult`"
  (^com.amazonaws.services.codepipeline.model.ListWebhooksResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.ListWebhooksRequest request]
    (-> this (.listWebhooks request))))

(defn list-action-types
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a ListActionTypes action. - `com.amazonaws.services.codepipeline.model.ListActionTypesRequest`

  returns: Result of the ListActionTypes operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListActionTypesResult`"
  (^com.amazonaws.services.codepipeline.model.ListActionTypesResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.ListActionTypesRequest request]
    (-> this (.listActionTypes request))))

(defn put-job-failure-result
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a PutJobFailureResult action. - `com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest`

  returns: Result of the PutJobFailureResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutJobFailureResultResult`"
  (^com.amazonaws.services.codepipeline.model.PutJobFailureResultResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest request]
    (-> this (.putJobFailureResult request))))

(defn get-job-details
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a GetJobDetails action. - `com.amazonaws.services.codepipeline.model.GetJobDetailsRequest`

  returns: Result of the GetJobDetails operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetJobDetailsResult`"
  (^com.amazonaws.services.codepipeline.model.GetJobDetailsResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.GetJobDetailsRequest request]
    (-> this (.getJobDetails request))))

(defn delete-custom-action-type
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a DeleteCustomActionType operation. The custom action will be marked as deleted. - `com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest`

  returns: Result of the DeleteCustomActionType operation returned by the service. - `com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult`"
  (^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest request]
    (-> this (.deleteCustomActionType request))))

(defn put-webhook
  "Description copied from interface: AWSCodePipeline

  request - `com.amazonaws.services.codepipeline.model.PutWebhookRequest`

  returns: Result of the PutWebhook operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutWebhookResult`"
  (^com.amazonaws.services.codepipeline.model.PutWebhookResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.PutWebhookRequest request]
    (-> this (.putWebhook request))))

(defn delete-pipeline
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a DeletePipeline action. - `com.amazonaws.services.codepipeline.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.codepipeline.model.DeletePipelineResult`"
  (^com.amazonaws.services.codepipeline.model.DeletePipelineResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.DeletePipelineRequest request]
    (-> this (.deletePipeline request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCodePipeline

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCodePipeline this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-job-success-result
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a PutJobSuccessResult action. - `com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest`

  returns: Result of the PutJobSuccessResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult`"
  (^com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest request]
    (-> this (.putJobSuccessResult request))))

(defn poll-for-jobs
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a PollForJobs action. - `com.amazonaws.services.codepipeline.model.PollForJobsRequest`

  returns: Result of the PollForJobs operation returned by the service. - `com.amazonaws.services.codepipeline.model.PollForJobsResult`"
  (^com.amazonaws.services.codepipeline.model.PollForJobsResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.PollForJobsRequest request]
    (-> this (.pollForJobs request))))

(defn tag-resource
  "Description copied from interface: AWSCodePipeline

  request - `com.amazonaws.services.codepipeline.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.codepipeline.model.TagResourceResult`"
  (^com.amazonaws.services.codepipeline.model.TagResourceResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn disable-stage-transition
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a DisableStageTransition action. - `com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest`

  returns: Result of the DisableStageTransition operation returned by the service. - `com.amazonaws.services.codepipeline.model.DisableStageTransitionResult`"
  (^com.amazonaws.services.codepipeline.model.DisableStageTransitionResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest request]
    (-> this (.disableStageTransition request))))

(defn get-pipeline
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a GetPipeline action. - `com.amazonaws.services.codepipeline.model.GetPipelineRequest`

  returns: Result of the GetPipeline operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetPipelineResult`"
  (^com.amazonaws.services.codepipeline.model.GetPipelineResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.GetPipelineRequest request]
    (-> this (.getPipeline request))))

(defn acknowledge-third-party-job
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of an AcknowledgeThirdPartyJob action. - `com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest`

  returns: Result of the AcknowledgeThirdPartyJob operation returned by the service. - `com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult`"
  (^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest request]
    (-> this (.acknowledgeThirdPartyJob request))))

(defn get-third-party-job-details
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a GetThirdPartyJobDetails action. - `com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest`

  returns: Result of the GetThirdPartyJobDetails operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult`"
  (^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest request]
    (-> this (.getThirdPartyJobDetails request))))

(defn poll-for-third-party-jobs
  "Description copied from interface: AWSCodePipeline

  request - Represents the input of a PollForThirdPartyJobs action. - `com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest`

  returns: Result of the PollForThirdPartyJobs operation returned by the service. - `com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult`"
  (^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult [^AbstractAWSCodePipeline this ^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest request]
    (-> this (.pollForThirdPartyJobs request))))

