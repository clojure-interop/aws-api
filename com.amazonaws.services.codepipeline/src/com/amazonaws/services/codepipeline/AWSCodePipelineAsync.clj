(ns com.amazonaws.services.codepipeline.AWSCodePipelineAsync
  "Interface for accessing CodePipeline asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCodePipelineAsync instead.


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
  (:import [com.amazonaws.services.codepipeline AWSCodePipelineAsync]))

(defn untag-resource-async
  "Removes tags from an AWS resource.

  untag-resource-request - `com.amazonaws.services.codepipeline.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-third-party-job-details-async
  "Requests the details of a job for a third party action. Only used for partner actions.



   When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
   artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
   Additionally, this API returns any secret values defined for the action.

  get-third-party-job-details-request - Represents the input of a GetThirdPartyJobDetails action. - `com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetThirdPartyJobDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest get-third-party-job-details-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getThirdPartyJobDetailsAsync get-third-party-job-details-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest get-third-party-job-details-request]
    (-> this (.getThirdPartyJobDetailsAsync get-third-party-job-details-request))))

(defn put-webhook-async
  "Defines a webhook and returns a unique webhook URL generated by CodePipeline. This URL can be supplied to third
   party source hosting providers to call every time there's a code change. When CodePipeline receives a POST
   request on this URL, the pipeline defined in the webhook is started as long as the POST request satisfied the
   authentication and filtering requirements supplied when defining the webhook. RegisterWebhookWithThirdParty and
   DeregisterWebhookWithThirdParty APIs can be used to automatically configure supported third parties to call the
   generated webhook URL.

  put-webhook-request - `com.amazonaws.services.codepipeline.model.PutWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutWebhookRequest put-webhook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putWebhookAsync put-webhook-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutWebhookRequest put-webhook-request]
    (-> this (.putWebhookAsync put-webhook-request))))

(defn create-custom-action-type-async
  "Creates a new custom action that can be used in all pipelines associated with the AWS account. Only used for
   custom actions.

  create-custom-action-type-request - Represents the input of a CreateCustomActionType operation. - `com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomActionType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest create-custom-action-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomActionTypeAsync create-custom-action-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest create-custom-action-type-request]
    (-> this (.createCustomActionTypeAsync create-custom-action-type-request))))

(defn update-pipeline-async
  "Updates a specified pipeline with edits or changes to its structure. Use a JSON file with the pipeline structure
   in conjunction with UpdatePipeline to provide the full structure of the pipeline. Updating the
   pipeline increases the version number of the pipeline by 1.

  update-pipeline-request - Represents the input of an UpdatePipeline action. - `com.amazonaws.services.codepipeline.model.UpdatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.UpdatePipelineResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.UpdatePipelineRequest update-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineAsync update-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.UpdatePipelineRequest update-pipeline-request]
    (-> this (.updatePipelineAsync update-pipeline-request))))

(defn register-webhook-with-third-party-async
  "Configures a connection between the webhook that was created and the external tool with events to be detected.

  register-webhook-with-third-party-request - `com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterWebhookWithThirdParty operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest register-webhook-with-third-party-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerWebhookWithThirdPartyAsync register-webhook-with-third-party-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest register-webhook-with-third-party-request]
    (-> this (.registerWebhookWithThirdPartyAsync register-webhook-with-third-party-request))))

(defn put-job-success-result-async
  "Represents the success of a job as returned to the pipeline by a job worker. Only used for custom actions.

  put-job-success-result-request - Represents the input of a PutJobSuccessResult action. - `com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutJobSuccessResult operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest put-job-success-result-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putJobSuccessResultAsync put-job-success-result-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest put-job-success-result-request]
    (-> this (.putJobSuccessResultAsync put-job-success-result-request))))

(defn acknowledge-third-party-job-async
  "Confirms a job worker has received the specified job. Only used for partner actions.

  acknowledge-third-party-job-request - Represents the input of an AcknowledgeThirdPartyJob action. - `com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcknowledgeThirdPartyJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest acknowledge-third-party-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acknowledgeThirdPartyJobAsync acknowledge-third-party-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest acknowledge-third-party-job-request]
    (-> this (.acknowledgeThirdPartyJobAsync acknowledge-third-party-job-request))))

(defn enable-stage-transition-async
  "Enables artifacts in a pipeline to transition to a stage in a pipeline.

  enable-stage-transition-request - Represents the input of an EnableStageTransition action. - `com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableStageTransition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.EnableStageTransitionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest enable-stage-transition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableStageTransitionAsync enable-stage-transition-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest enable-stage-transition-request]
    (-> this (.enableStageTransitionAsync enable-stage-transition-request))))

(defn acknowledge-job-async
  "Returns information about a specified job and whether that job has been received by the job worker. Only used for
   custom actions.

  acknowledge-job-request - Represents the input of an AcknowledgeJob action. - `com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcknowledgeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.AcknowledgeJobResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest acknowledge-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acknowledgeJobAsync acknowledge-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest acknowledge-job-request]
    (-> this (.acknowledgeJobAsync acknowledge-job-request))))

(defn put-approval-result-async
  "Provides the response to a manual approval request to AWS CodePipeline. Valid responses include Approved and
   Rejected.

  put-approval-result-request - Represents the input of a PutApprovalResult action. - `com.amazonaws.services.codepipeline.model.PutApprovalResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutApprovalResult operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutApprovalResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutApprovalResultRequest put-approval-result-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putApprovalResultAsync put-approval-result-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutApprovalResultRequest put-approval-result-request]
    (-> this (.putApprovalResultAsync put-approval-result-request))))

(defn poll-for-third-party-jobs-async
  "Determines whether there are any third party jobs for a job worker to act on. Only used for partner actions.



   When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
   artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.

  poll-for-third-party-jobs-request - Represents the input of a PollForThirdPartyJobs action. - `com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PollForThirdPartyJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest poll-for-third-party-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.pollForThirdPartyJobsAsync poll-for-third-party-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest poll-for-third-party-jobs-request]
    (-> this (.pollForThirdPartyJobsAsync poll-for-third-party-jobs-request))))

(defn start-pipeline-execution-async
  "Starts the specified pipeline. Specifically, it begins processing the latest commit to the source location
   specified as part of the pipeline.

  start-pipeline-execution-request - Represents the input of a StartPipelineExecution action. - `com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartPipelineExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest start-pipeline-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startPipelineExecutionAsync start-pipeline-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest start-pipeline-execution-request]
    (-> this (.startPipelineExecutionAsync start-pipeline-execution-request))))

(defn put-third-party-job-failure-result-async
  "Represents the failure of a third party job as returned to the pipeline by a job worker. Only used for partner
   actions.

  put-third-party-job-failure-result-request - Represents the input of a PutThirdPartyJobFailureResult action. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutThirdPartyJobFailureResult operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest put-third-party-job-failure-result-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putThirdPartyJobFailureResultAsync put-third-party-job-failure-result-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest put-third-party-job-failure-result-request]
    (-> this (.putThirdPartyJobFailureResultAsync put-third-party-job-failure-result-request))))

(defn delete-custom-action-type-async
  "Marks a custom action as deleted. PollForJobs for the custom action will fail after the action is
   marked for deletion. Only used for custom actions.



   To re-create a custom action after it has been deleted you must use a string in the version field that has never
   been used before. This string can be an incremented version number, for example. To restore a deleted custom
   action, use a JSON file that is identical to the deleted action, including the original string in the version
   field.

  delete-custom-action-type-request - Represents the input of a DeleteCustomActionType operation. The custom action will be marked as deleted. - `com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomActionType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest delete-custom-action-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomActionTypeAsync delete-custom-action-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest delete-custom-action-type-request]
    (-> this (.deleteCustomActionTypeAsync delete-custom-action-type-request))))

(defn put-job-failure-result-async
  "Represents the failure of a job as returned to the pipeline by a job worker. Only used for custom actions.

  put-job-failure-result-request - Represents the input of a PutJobFailureResult action. - `com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutJobFailureResult operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutJobFailureResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest put-job-failure-result-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putJobFailureResultAsync put-job-failure-result-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest put-job-failure-result-request]
    (-> this (.putJobFailureResultAsync put-job-failure-result-request))))

(defn put-third-party-job-success-result-async
  "Represents the success of a third party job as returned to the pipeline by a job worker. Only used for partner
   actions.

  put-third-party-job-success-result-request - Represents the input of a PutThirdPartyJobSuccessResult action. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutThirdPartyJobSuccessResult operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest put-third-party-job-success-result-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putThirdPartyJobSuccessResultAsync put-third-party-job-success-result-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest put-third-party-job-success-result-request]
    (-> this (.putThirdPartyJobSuccessResultAsync put-third-party-job-success-result-request))))

(defn list-pipelines-async
  "Gets a summary of all of the pipelines associated with your account.

  list-pipelines-request - Represents the input of a ListPipelines action. - `com.amazonaws.services.codepipeline.model.ListPipelinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListPipelinesResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListPipelinesRequest list-pipelines-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelinesAsync list-pipelines-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListPipelinesRequest list-pipelines-request]
    (-> this (.listPipelinesAsync list-pipelines-request))))

(defn delete-webhook-async
  "Deletes a previously created webhook by name. Deleting the webhook stops AWS CodePipeline from starting a
   pipeline every time an external event occurs. The API will return successfully when trying to delete a webhook
   that is already deleted. If a deleted webhook is re-created by calling PutWebhook with the same name, it will
   have a different URL.

  delete-webhook-request - `com.amazonaws.services.codepipeline.model.DeleteWebhookRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeleteWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeleteWebhookRequest delete-webhook-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWebhookAsync delete-webhook-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeleteWebhookRequest delete-webhook-request]
    (-> this (.deleteWebhookAsync delete-webhook-request))))

(defn delete-pipeline-async
  "Deletes the specified pipeline.

  delete-pipeline-request - Represents the input of a DeletePipeline action. - `com.amazonaws.services.codepipeline.model.DeletePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeletePipelineResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeletePipelineRequest delete-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePipelineAsync delete-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeletePipelineRequest delete-pipeline-request]
    (-> this (.deletePipelineAsync delete-pipeline-request))))

(defn poll-for-jobs-async
  "Returns information about any jobs for AWS CodePipeline to act upon. PollForJobs is only valid for
   action types with \"Custom\" in the owner field. If the action type contains \"AWS\" or \"ThirdParty\" in the owner
   field, the PollForJobs action returns an error.



   When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
   artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
   Additionally, this API returns any secret values defined for the action.

  poll-for-jobs-request - Represents the input of a PollForJobs action. - `com.amazonaws.services.codepipeline.model.PollForJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PollForJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PollForJobsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PollForJobsRequest poll-for-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.pollForJobsAsync poll-for-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PollForJobsRequest poll-for-jobs-request]
    (-> this (.pollForJobsAsync poll-for-jobs-request))))

(defn deregister-webhook-with-third-party-async
  "Removes the connection between the webhook that was created by CodePipeline and the external tool with events to
   be detected. Currently only supported for webhooks that target an action type of GitHub.

  deregister-webhook-with-third-party-request - `com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterWebhookWithThirdParty operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest deregister-webhook-with-third-party-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterWebhookWithThirdPartyAsync deregister-webhook-with-third-party-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest deregister-webhook-with-third-party-request]
    (-> this (.deregisterWebhookWithThirdPartyAsync deregister-webhook-with-third-party-request))))

(defn list-action-types-async
  "Gets a summary of all AWS CodePipeline action types associated with your account.

  list-action-types-request - Represents the input of a ListActionTypes action. - `com.amazonaws.services.codepipeline.model.ListActionTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActionTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListActionTypesResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListActionTypesRequest list-action-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActionTypesAsync list-action-types-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListActionTypesRequest list-action-types-request]
    (-> this (.listActionTypesAsync list-action-types-request))))

(defn list-action-executions-async
  "Lists the action executions that have occurred in a pipeline.

  list-action-executions-request - `com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActionExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListActionExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest list-action-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActionExecutionsAsync list-action-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest list-action-executions-request]
    (-> this (.listActionExecutionsAsync list-action-executions-request))))

(defn create-pipeline-async
  "Creates a pipeline.

  create-pipeline-request - Represents the input of a CreatePipeline action. - `com.amazonaws.services.codepipeline.model.CreatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.CreatePipelineResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.CreatePipelineRequest create-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPipelineAsync create-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.CreatePipelineRequest create-pipeline-request]
    (-> this (.createPipelineAsync create-pipeline-request))))

(defn list-tags-for-resource-async
  "Gets the set of key/value pairs (metadata) that are used to manage the resource.

  list-tags-for-resource-request - `com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn put-action-revision-async
  "Provides information to AWS CodePipeline about new revisions to a source.

  put-action-revision-request - Represents the input of a PutActionRevision action. - `com.amazonaws.services.codepipeline.model.PutActionRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutActionRevision operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutActionRevisionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutActionRevisionRequest put-action-revision-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putActionRevisionAsync put-action-revision-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.PutActionRevisionRequest put-action-revision-request]
    (-> this (.putActionRevisionAsync put-action-revision-request))))

(defn list-pipeline-executions-async
  "Gets a summary of the most recent executions for a pipeline.

  list-pipeline-executions-request - Represents the input of a ListPipelineExecutions action. - `com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelineExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest list-pipeline-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelineExecutionsAsync list-pipeline-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest list-pipeline-executions-request]
    (-> this (.listPipelineExecutionsAsync list-pipeline-executions-request))))

(defn disable-stage-transition-async
  "Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.

  disable-stage-transition-request - Represents the input of a DisableStageTransition action. - `com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableStageTransition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DisableStageTransitionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest disable-stage-transition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableStageTransitionAsync disable-stage-transition-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest disable-stage-transition-request]
    (-> this (.disableStageTransitionAsync disable-stage-transition-request))))

(defn get-job-details-async
  "Returns information about a job. Only used for custom actions.



   When this API is called, AWS CodePipeline returns temporary credentials for the Amazon S3 bucket used to store
   artifacts for the pipeline, if the action requires access to that Amazon S3 bucket for input or output artifacts.
   Additionally, this API returns any secret values defined for the action.

  get-job-details-request - Represents the input of a GetJobDetails action. - `com.amazonaws.services.codepipeline.model.GetJobDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetJobDetailsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetJobDetailsRequest get-job-details-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobDetailsAsync get-job-details-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetJobDetailsRequest get-job-details-request]
    (-> this (.getJobDetailsAsync get-job-details-request))))

(defn get-pipeline-async
  "Returns the metadata, structure, stages, and actions of a pipeline. Can be used to return the entire structure of
   a pipeline in JSON format, which can then be modified and used to update the pipeline structure with
   UpdatePipeline.

  get-pipeline-request - Represents the input of a GetPipeline action. - `com.amazonaws.services.codepipeline.model.GetPipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetPipelineResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineRequest get-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineAsync get-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineRequest get-pipeline-request]
    (-> this (.getPipelineAsync get-pipeline-request))))

(defn get-pipeline-state-async
  "Returns information about the state of a pipeline, including the stages and actions.



   Values returned in the revisionId and revisionUrl fields indicate the source revision
   information, such as the commit ID, for the current state.

  get-pipeline-state-request - Represents the input of a GetPipelineState action. - `com.amazonaws.services.codepipeline.model.GetPipelineStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipelineState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetPipelineStateResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineStateRequest get-pipeline-state-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineStateAsync get-pipeline-state-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineStateRequest get-pipeline-state-request]
    (-> this (.getPipelineStateAsync get-pipeline-state-request))))

(defn list-webhooks-async
  "Gets a listing of all the webhooks in this region for this account. The output lists all webhooks and includes
   the webhook URL and ARN, as well the configuration for each webhook.

  list-webhooks-request - `com.amazonaws.services.codepipeline.model.ListWebhooksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebhooks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListWebhooksResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListWebhooksRequest list-webhooks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebhooksAsync list-webhooks-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.ListWebhooksRequest list-webhooks-request]
    (-> this (.listWebhooksAsync list-webhooks-request))))

(defn tag-resource-async
  "Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.

  tag-resource-request - `com.amazonaws.services.codepipeline.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn retry-stage-execution-async
  "Resumes the pipeline execution by retrying the last failed actions in a stage.

  retry-stage-execution-request - Represents the input of a RetryStageExecution action. - `com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetryStageExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.RetryStageExecutionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest retry-stage-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retryStageExecutionAsync retry-stage-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest retry-stage-execution-request]
    (-> this (.retryStageExecutionAsync retry-stage-execution-request))))

(defn get-pipeline-execution-async
  "Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution
   ID, and the name, version, and status of the pipeline.

  get-pipeline-execution-request - Represents the input of a GetPipelineExecution action. - `com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipelineExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest get-pipeline-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineExecutionAsync get-pipeline-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsync this ^com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest get-pipeline-execution-request]
    (-> this (.getPipelineExecutionAsync get-pipeline-execution-request))))

