(ns com.amazonaws.services.codepipeline.AWSCodePipelineClient
  "Client for accessing CodePipeline. All service calls made using this client are blocking, and will not return until
  the service call completes.

  AWS CodePipeline

  Overview


  This is the AWS CodePipeline API Reference. This guide provides descriptions of the actions and data types for AWS
  CodePipeline. Some functionality for your pipeline is only configurable through the API. For additional information,
  see the AWS CodePipeline User
  Guide.


  You can use the AWS CodePipeline API to work with pipelines, stages, actions, and transitions, as described below.


  Pipelines are models of automated release processes. Each pipeline is uniquely named, and consists of stages,
  actions, and transitions.


  You can work with pipelines by calling:




  CreatePipeline, which creates a uniquely-named pipeline.




  DeletePipeline, which deletes the specified pipeline.




  GetPipeline, which returns information about the pipeline structure and pipeline metadata, including the
  pipeline Amazon Resource Name (ARN).




  GetPipelineExecution, which returns information about a specific execution of a pipeline.




  GetPipelineState, which returns information about the current state of the stages and actions of a pipeline.




  ListActionExecutions, which returns action-level details for past executions. The details include full stage
  and action-level details, including individual action duration, status, any errors which occurred during the
  execution, and input and output artifact location details.




  ListPipelines, which gets a summary of all of the pipelines associated with your account.




  ListPipelineExecutions, which gets a summary of the most recent executions for a pipeline.




  StartPipelineExecution, which runs the the most recent revision of an artifact through the pipeline.




  UpdatePipeline, which updates a pipeline with edits or changes to the structure of the pipeline.




  Pipelines include stages. Each stage contains one or more actions that must complete before the next stage
  begins. A stage will result in success or failure. If a stage fails, then the pipeline stops at that stage and will
  remain stopped until either a new version of an artifact appears in the source location, or a user takes action to
  re-run the most recent artifact through the pipeline. You can call GetPipelineState, which displays the status
  of a pipeline, including the status of stages in the pipeline, or GetPipeline, which returns the entire
  structure of the pipeline, including the stages of that pipeline. For more information about the structure of stages
  and actions, also refer to the AWS CodePipeline Pipeline
  Structure Reference.


  Pipeline stages include actions, which are categorized into categories such as source or build actions
  performed within a stage of a pipeline. For example, you can use a source action to import artifacts into a pipeline
  from a source such as Amazon S3. Like stages, you do not work with actions directly in most cases, but you do define
  and interact with actions when working with pipeline operations such as CreatePipeline and
  GetPipelineState. Valid action categories are:




  Source




  Build




  Test




  Deploy




  Approval




  Invoke




  Pipelines also include transitions, which allow the transition of artifacts from one stage to the next in a
  pipeline after the actions in one stage complete.


  You can work with transitions by calling:




  DisableStageTransition, which prevents artifacts from transitioning to the next stage in a pipeline.




  EnableStageTransition, which enables transition of artifacts between stages in a pipeline.




  Using the API to integrate with AWS CodePipeline


  For third-party integrators or developers who want to create their own integrations with AWS CodePipeline, the
  expected sequence varies from the standard API user. In order to integrate with AWS CodePipeline, developers will
  need to work with the following items:


  Jobs, which are instances of an action. For example, a job for a source action might import a revision of an
  artifact from a source.


  You can work with jobs by calling:




  AcknowledgeJob, which confirms whether a job worker has received the specified job,




  GetJobDetails, which returns the details of a job,




  PollForJobs, which determines whether there are any jobs to act upon,




  PutJobFailureResult, which provides details of a job failure, and




  PutJobSuccessResult, which provides details of a job success.




  Third party jobs, which are instances of an action created by a partner action and integrated into AWS
  CodePipeline. Partner actions are created by members of the AWS Partner Network.


  You can work with third party jobs by calling:




  AcknowledgeThirdPartyJob, which confirms whether a job worker has received the specified job,




  GetThirdPartyJobDetails, which requests the details of a job for a partner action,




  PollForThirdPartyJobs, which determines whether there are any jobs to act upon,




  PutThirdPartyJobFailureResult, which provides details of a job failure, and




  PutThirdPartyJobSuccessResult, which provides details of a job success."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codepipeline AWSCodePipelineClient]))

(defn ->aws-code-pipeline-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSCodePipelineClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSCodePipelineClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSCodePipelineClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCodePipelineClient aws-credentials client-configuration))
  (^AWSCodePipelineClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCodePipelineClient client-configuration))
  (^AWSCodePipelineClient []
    (new AWSCodePipelineClient )))

(defn *builder
  "returns: `com.amazonaws.services.codepipeline.AWSCodePipelineClientBuilder`"
  (^com.amazonaws.services.codepipeline.AWSCodePipelineClientBuilder []
    (AWSCodePipelineClient/builder )))

(defn list-tags-for-resource
  "Gets the set of key/value pairs (metadata) that are used to manage the resource.

  request - `com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.ListTagsForResourceResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn delete-webhook
  "Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a
   pipeline every time an external event occurs. The API will return successfully when trying to delete a webhook
   that is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will
   have a different URL.

  request - `com.amazonaws.services.codepipeline.model.DeleteWebhookRequest`

  returns: Result of the DeleteWebhook operation returned by the service. - `com.amazonaws.services.codepipeline.model.DeleteWebhookResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.DeleteWebhookResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhook request))))

(defn update-pipeline
  "Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure
   in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the
   pipeline increases the version number of the pipeline by 1.

  request - `com.amazonaws.services.codepipeline.model.UpdatePipelineRequest`

  returns: Result of the UpdatePipeline operation returned by the service. - `com.amazonaws.services.codepipeline.model.UpdatePipelineResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.UpdatePipelineResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.UpdatePipelineRequest request]
    (-> this (.updatePipeline request))))

(defn put-action-revision
  "Provides information to AWS CodePipeline about new revisions to a source.

  request - `com.amazonaws.services.codepipeline.model.PutActionRevisionRequest`

  returns: Result of the PutActionRevision operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutActionRevisionResult`

  throws: com.amazonaws.services.codepipeline.model.PipelineNotFoundException - The specified pipeline was specified in an invalid format or cannot be found."
  (^com.amazonaws.services.codepipeline.model.PutActionRevisionResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.PutActionRevisionRequest request]
    (-> this (.putActionRevision request))))

(defn put-third-party-job-failure-result
  "Represents the failure of a third party job as returned to the pipeline by a job worker. Only used for partner
   actions.

  request - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest`

  returns: Result of the PutThirdPartyJobFailureResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest request]
    (-> this (.putThirdPartyJobFailureResult request))))

(defn put-third-party-job-success-result
  "Represents the success of a third party job as returned to the pipeline by a job worker. Only used for partner
   actions.

  request - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest`

  returns: Result of the PutThirdPartyJobSuccessResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest request]
    (-> this (.putThirdPartyJobSuccessResult request))))

(defn enable-stage-transition
  "Enables artifacts in a pipeline to transition to a stage in a pipeline.

  request - `com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest`

  returns: Result of the EnableStageTransition operation returned by the service. - `com.amazonaws.services.codepipeline.model.EnableStageTransitionResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.EnableStageTransitionResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest request]
    (-> this (.enableStageTransition request))))

(defn list-pipelines
  "Gets a summary of all of the pipelines associated with your account.

  request - `com.amazonaws.services.codepipeline.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListPipelinesResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.ListPipelinesResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.ListPipelinesRequest request]
    (-> this (.listPipelines request))))

(defn untag-resource
  "Removes tags from an AWS resource.

  request - `com.amazonaws.services.codepipeline.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.codepipeline.model.UntagResourceResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.UntagResourceResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-pipeline-execution
  "Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution
   ID, and the name, version, and status of the pipeline.

  request - `com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest`

  returns: Result of the GetPipelineExecution operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest request]
    (-> this (.getPipelineExecution request))))

(defn put-approval-result
  "Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and
   Rejected.

  request - `com.amazonaws.services.codepipeline.model.PutApprovalResultRequest`

  returns: Result of the PutApprovalResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutApprovalResultResult`

  throws: com.amazonaws.services.codepipeline.model.InvalidApprovalTokenException - The approval request already received a response or has expired."
  (^com.amazonaws.services.codepipeline.model.PutApprovalResultResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.PutApprovalResultRequest request]
    (-> this (.putApprovalResult request))))

(defn get-pipeline-state
  "Returns information about the state of a pipeline, including the stages and actions.



   Values returned in the revisionId and revisionUrl fields indicate the source revision
   information, such as the commit ID, for the current state.

  request - `com.amazonaws.services.codepipeline.model.GetPipelineStateRequest`

  returns: Result of the GetPipelineState operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetPipelineStateResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.GetPipelineStateResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.GetPipelineStateRequest request]
    (-> this (.getPipelineState request))))

(defn start-pipeline-execution
  "Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location
   specified as part of the pipeline.

  request - `com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest`

  returns: Result of the StartPipelineExecution operation returned by the service. - `com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest request]
    (-> this (.startPipelineExecution request))))

(defn list-action-executions
  "Lists the action executions that have occurred in a pipeline.

  request - `com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest`

  returns: Result of the ListActionExecutions operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListActionExecutionsResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.ListActionExecutionsResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest request]
    (-> this (.listActionExecutions request))))

(defn list-pipeline-executions
  "Gets a summary of the most recent executions for a pipeline.

  request - `com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest`

  returns: Result of the ListPipelineExecutions operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest request]
    (-> this (.listPipelineExecutions request))))

(defn create-pipeline
  "Creates a pipeline.

  request - `com.amazonaws.services.codepipeline.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.codepipeline.model.CreatePipelineResult`

  throws: com.amazonaws.services.codepipeline.model.LimitExceededException - The number of pipelines associated with the AWS account has exceeded the limit allowed for the account."
  (^com.amazonaws.services.codepipeline.model.CreatePipelineResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.CreatePipelineRequest request]
    (-> this (.createPipeline request))))

(defn deregister-webhook-with-third-party
  "Removes the connection between the webhook that was created by CodePipeline and the external tool with events to
   be detected. Currently only supported for webhooks that target an action type of GitHub.

  request - `com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest`

  returns: Result of the DeregisterWebhookWithThirdParty operation returned by the service. - `com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest request]
    (-> this (.deregisterWebhookWithThirdParty request))))

(defn retry-stage-execution
  "Resumes the pipeline execution by retrying the last failed actions in a stage.

  request - `com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest`

  returns: Result of the RetryStageExecution operation returned by the service. - `com.amazonaws.services.codepipeline.model.RetryStageExecutionResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.RetryStageExecutionResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest request]
    (-> this (.retryStageExecution request))))

(defn acknowledge-job
  "Returns information about a specified job and whether that job has been received by the job worker. Only used for
   custom actions.

  request - `com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest`

  returns: Result of the AcknowledgeJob operation returned by the service. - `com.amazonaws.services.codepipeline.model.AcknowledgeJobResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.AcknowledgeJobResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest request]
    (-> this (.acknowledgeJob request))))

(defn create-custom-action-type
  "Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for
   custom actions.

  request - `com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest`

  returns: Result of the CreateCustomActionType operation returned by the service. - `com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest request]
    (-> this (.createCustomActionType request))))

(defn register-webhook-with-third-party
  "Configures a connection between the webhook that was created and the external tool with events to be detected.

  request - `com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest`

  returns: Result of the RegisterWebhookWithThirdParty operation returned by the service. - `com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest request]
    (-> this (.registerWebhookWithThirdParty request))))

(defn list-webhooks
  "Gets a listing of all the webhooks in this region for this account. The output lists all webhooks and includes
   the webhook URL and ARN, as well the configuration for each webhook.

  request - `com.amazonaws.services.codepipeline.model.ListWebhooksRequest`

  returns: Result of the ListWebhooks operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListWebhooksResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.ListWebhooksResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.ListWebhooksRequest request]
    (-> this (.listWebhooks request))))

(defn list-action-types
  "Gets a summary of all AWS CodePipeline action types associated with your account.

  request - `com.amazonaws.services.codepipeline.model.ListActionTypesRequest`

  returns: Result of the ListActionTypes operation returned by the service. - `com.amazonaws.services.codepipeline.model.ListActionTypesResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.ListActionTypesResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.ListActionTypesRequest request]
    (-> this (.listActionTypes request))))

(defn put-job-failure-result
  "Represents the failure of a job as returned to the pipeline by a job worker. Only used for custom actions.

  request - `com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest`

  returns: Result of the PutJobFailureResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutJobFailureResultResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.PutJobFailureResultResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest request]
    (-> this (.putJobFailureResult request))))

(defn get-job-details
  "Returns information about a job. Only used for custom actions.



   When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
   artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
   Additionally, this API returns any secret values defined for the action.

  request - `com.amazonaws.services.codepipeline.model.GetJobDetailsRequest`

  returns: Result of the GetJobDetails operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetJobDetailsResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.GetJobDetailsResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.GetJobDetailsRequest request]
    (-> this (.getJobDetails request))))

(defn delete-custom-action-type
  "Marks a custom action as deleted. PollForJobs for the custom action will fail after the action is
   marked for deletion. Only used for custom actions.



   To re-create a custom action after it has been deleted you must use a string in the version field that has never
   been used before. This string can be an incremented version number, for example. To restore a deleted custom
   action, use a JSON file that is identical to the deleted action, including the original string in the version
   field.

  request - `com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest`

  returns: Result of the DeleteCustomActionType operation returned by the service. - `com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest request]
    (-> this (.deleteCustomActionType request))))

(defn put-webhook
  "Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third
   party source hosting providers to call every time there's a code change. When CodePipeline receives a POST
   request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the
   authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and
   DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the
   generated webhook URL.

  request - `com.amazonaws.services.codepipeline.model.PutWebhookRequest`

  returns: Result of the PutWebhook operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutWebhookResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.PutWebhookResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.PutWebhookRequest request]
    (-> this (.putWebhook request))))

(defn delete-pipeline
  "Deletes the specified pipeline.

  request - `com.amazonaws.services.codepipeline.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.codepipeline.model.DeletePipelineResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.DeletePipelineResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.DeletePipelineRequest request]
    (-> this (.deletePipeline request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCodePipelineClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-job-success-result
  "Represents the success of a job as returned to the pipeline by a job worker. Only used for custom actions.

  request - `com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest`

  returns: Result of the PutJobSuccessResult operation returned by the service. - `com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest request]
    (-> this (.putJobSuccessResult request))))

(defn poll-for-jobs
  "Returns information about any jobs for AWS CodePipeline to act upon. PollForJobs is only valid for
   action types with \"Custom\" in the owner field. If the action type contains \"AWS\" or \"ThirdParty\" in the owner
   field, the PollForJobs action returns an error.



   When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
   artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
   Additionally, this API returns any secret values defined for the action.

  request - `com.amazonaws.services.codepipeline.model.PollForJobsRequest`

  returns: Result of the PollForJobs operation returned by the service. - `com.amazonaws.services.codepipeline.model.PollForJobsResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.PollForJobsResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.PollForJobsRequest request]
    (-> this (.pollForJobs request))))

(defn tag-resource
  "Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.

  request - `com.amazonaws.services.codepipeline.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.codepipeline.model.TagResourceResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.TagResourceResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn disable-stage-transition
  "Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.

  request - `com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest`

  returns: Result of the DisableStageTransition operation returned by the service. - `com.amazonaws.services.codepipeline.model.DisableStageTransitionResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.DisableStageTransitionResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest request]
    (-> this (.disableStageTransition request))))

(defn get-pipeline
  "Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of
   a pipeline in JSON format, which can then be modified and used to update the pipeline structure with
   UpdatePipeline.

  request - `com.amazonaws.services.codepipeline.model.GetPipelineRequest`

  returns: Result of the GetPipeline operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetPipelineResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.GetPipelineResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.GetPipelineRequest request]
    (-> this (.getPipeline request))))

(defn acknowledge-third-party-job
  "Confirms a job worker has received the specified job. Only used for partner actions.

  request - `com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest`

  returns: Result of the AcknowledgeThirdPartyJob operation returned by the service. - `com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult`

  throws: com.amazonaws.services.codepipeline.model.ValidationException - The validation was specified in an invalid format."
  (^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest request]
    (-> this (.acknowledgeThirdPartyJob request))))

(defn get-third-party-job-details
  "Requests the details of a job for a third party action. Only used for partner actions.



   When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
   artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
   Additionally, this API returns any secret values defined for the action.

  request - `com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest`

  returns: Result of the GetThirdPartyJobDetails operation returned by the service. - `com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult`

  throws: com.amazonaws.services.codepipeline.model.JobNotFoundException - The specified job was specified in an invalid format or cannot be found."
  (^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest request]
    (-> this (.getThirdPartyJobDetails request))))

(defn poll-for-third-party-jobs
  "Determines whether there are any third party jobs for a job worker to act on. Only used for partner actions.



   When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
   artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.

  request - `com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest`

  returns: Result of the PollForThirdPartyJobs operation returned by the service. - `com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult`

  throws: com.amazonaws.services.codepipeline.model.ActionTypeNotFoundException - The specified action type cannot be found."
  (^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult [^AWSCodePipelineClient this ^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest request]
    (-> this (.pollForThirdPartyJobs request))))

