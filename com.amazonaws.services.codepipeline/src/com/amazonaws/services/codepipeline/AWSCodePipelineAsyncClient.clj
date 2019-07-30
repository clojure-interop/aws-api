(ns com.amazonaws.services.codepipeline.AWSCodePipelineAsyncClient
  "Client for accessing CodePipeline asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

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
  (:import [com.amazonaws.services.codepipeline AWSCodePipelineAsyncClient]))

(defn ->aws-code-pipeline-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSCodePipelineAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCodePipelineAsyncClient aws-credentials client-configuration executor-service))
  (^AWSCodePipelineAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCodePipelineAsyncClient aws-credentials executor-service))
  (^AWSCodePipelineAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCodePipelineAsyncClient client-configuration))
  (^AWSCodePipelineAsyncClient []
    (new AWSCodePipelineAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.codepipeline.AWSCodePipelineAsyncClientBuilder`"
  (^com.amazonaws.services.codepipeline.AWSCodePipelineAsyncClientBuilder []
    (AWSCodePipelineAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-third-party-job-details-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetThirdPartyJobDetails action. - `com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetThirdPartyJobDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getThirdPartyJobDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetThirdPartyJobDetailsRequest request]
    (-> this (.getThirdPartyJobDetailsAsync request))))

(defn put-webhook-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.PutWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutWebhookRequest request]
    (-> this (.putWebhookAsync request))))

(defn create-custom-action-type-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a CreateCustomActionType operation. - `com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomActionType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.CreateCustomActionTypeResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomActionTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.CreateCustomActionTypeRequest request]
    (-> this (.createCustomActionTypeAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCodePipelineAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-pipeline-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of an UpdatePipeline action. - `com.amazonaws.services.codepipeline.model.UpdatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.UpdatePipelineResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.UpdatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.UpdatePipelineRequest request]
    (-> this (.updatePipelineAsync request))))

(defn register-webhook-with-third-party-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterWebhookWithThirdParty operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerWebhookWithThirdPartyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.RegisterWebhookWithThirdPartyRequest request]
    (-> this (.registerWebhookWithThirdPartyAsync request))))

(defn put-job-success-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutJobSuccessResult action. - `com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutJobSuccessResult operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutJobSuccessResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putJobSuccessResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutJobSuccessResultRequest request]
    (-> this (.putJobSuccessResultAsync request))))

(defn acknowledge-third-party-job-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of an AcknowledgeThirdPartyJob action. - `com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcknowledgeThirdPartyJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acknowledgeThirdPartyJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.AcknowledgeThirdPartyJobRequest request]
    (-> this (.acknowledgeThirdPartyJobAsync request))))

(defn enable-stage-transition-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of an EnableStageTransition action. - `com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableStageTransition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.EnableStageTransitionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableStageTransitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.EnableStageTransitionRequest request]
    (-> this (.enableStageTransitionAsync request))))

(defn acknowledge-job-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of an AcknowledgeJob action. - `com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcknowledgeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.AcknowledgeJobResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acknowledgeJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.AcknowledgeJobRequest request]
    (-> this (.acknowledgeJobAsync request))))

(defn put-approval-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutApprovalResult action. - `com.amazonaws.services.codepipeline.model.PutApprovalResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutApprovalResult operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutApprovalResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutApprovalResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putApprovalResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutApprovalResultRequest request]
    (-> this (.putApprovalResultAsync request))))

(defn poll-for-third-party-jobs-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PollForThirdPartyJobs action. - `com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PollForThirdPartyJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.pollForThirdPartyJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PollForThirdPartyJobsRequest request]
    (-> this (.pollForThirdPartyJobsAsync request))))

(defn start-pipeline-execution-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a StartPipelineExecution action. - `com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartPipelineExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.StartPipelineExecutionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startPipelineExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.StartPipelineExecutionRequest request]
    (-> this (.startPipelineExecutionAsync request))))

(defn put-third-party-job-failure-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutThirdPartyJobFailureResult action. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutThirdPartyJobFailureResult operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putThirdPartyJobFailureResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobFailureResultRequest request]
    (-> this (.putThirdPartyJobFailureResultAsync request))))

(defn delete-custom-action-type-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a DeleteCustomActionType operation. The custom action will be marked as deleted. - `com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomActionType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomActionTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DeleteCustomActionTypeRequest request]
    (-> this (.deleteCustomActionTypeAsync request))))

(defn put-job-failure-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutJobFailureResult action. - `com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutJobFailureResult operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutJobFailureResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putJobFailureResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutJobFailureResultRequest request]
    (-> this (.putJobFailureResultAsync request))))

(defn put-third-party-job-success-result-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutThirdPartyJobSuccessResult action. - `com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutThirdPartyJobSuccessResult operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putThirdPartyJobSuccessResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutThirdPartyJobSuccessResultRequest request]
    (-> this (.putThirdPartyJobSuccessResultAsync request))))

(defn list-pipelines-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a ListPipelines action. - `com.amazonaws.services.codepipeline.model.ListPipelinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListPipelinesResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListPipelinesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelinesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListPipelinesRequest request]
    (-> this (.listPipelinesAsync request))))

(defn delete-webhook-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.DeleteWebhookRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWebhook operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeleteWebhookResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DeleteWebhookRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWebhookAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DeleteWebhookRequest request]
    (-> this (.deleteWebhookAsync request))))

(defn delete-pipeline-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a DeletePipeline action. - `com.amazonaws.services.codepipeline.model.DeletePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeletePipelineResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DeletePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DeletePipelineRequest request]
    (-> this (.deletePipelineAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCodePipelineAsyncClient this]
    (-> this (.shutdown))))

(defn poll-for-jobs-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PollForJobs action. - `com.amazonaws.services.codepipeline.model.PollForJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PollForJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PollForJobsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PollForJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.pollForJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PollForJobsRequest request]
    (-> this (.pollForJobsAsync request))))

(defn deregister-webhook-with-third-party-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterWebhookWithThirdParty operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterWebhookWithThirdPartyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DeregisterWebhookWithThirdPartyRequest request]
    (-> this (.deregisterWebhookWithThirdPartyAsync request))))

(defn list-action-types-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a ListActionTypes action. - `com.amazonaws.services.codepipeline.model.ListActionTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActionTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListActionTypesResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListActionTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActionTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListActionTypesRequest request]
    (-> this (.listActionTypesAsync request))))

(defn list-action-executions-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActionExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListActionExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActionExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListActionExecutionsRequest request]
    (-> this (.listActionExecutionsAsync request))))

(defn create-pipeline-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a CreatePipeline action. - `com.amazonaws.services.codepipeline.model.CreatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.CreatePipelineResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.CreatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.CreatePipelineRequest request]
    (-> this (.createPipelineAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn put-action-revision-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a PutActionRevision action. - `com.amazonaws.services.codepipeline.model.PutActionRevisionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutActionRevision operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.PutActionRevisionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutActionRevisionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putActionRevisionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.PutActionRevisionRequest request]
    (-> this (.putActionRevisionAsync request))))

(defn list-pipeline-executions-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a ListPipelineExecutions action. - `com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelineExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListPipelineExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelineExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListPipelineExecutionsRequest request]
    (-> this (.listPipelineExecutionsAsync request))))

(defn disable-stage-transition-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a DisableStageTransition action. - `com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableStageTransition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.DisableStageTransitionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableStageTransitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.DisableStageTransitionRequest request]
    (-> this (.disableStageTransitionAsync request))))

(defn get-job-details-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetJobDetails action. - `com.amazonaws.services.codepipeline.model.GetJobDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetJobDetailsResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetJobDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetJobDetailsRequest request]
    (-> this (.getJobDetailsAsync request))))

(defn get-pipeline-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetPipeline action. - `com.amazonaws.services.codepipeline.model.GetPipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetPipelineResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetPipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetPipelineRequest request]
    (-> this (.getPipelineAsync request))))

(defn get-pipeline-state-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetPipelineState action. - `com.amazonaws.services.codepipeline.model.GetPipelineStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipelineState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetPipelineStateResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetPipelineStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetPipelineStateRequest request]
    (-> this (.getPipelineStateAsync request))))

(defn list-webhooks-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.ListWebhooksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebhooks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.ListWebhooksResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListWebhooksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebhooksAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.ListWebhooksRequest request]
    (-> this (.listWebhooksAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSCodePipelineAsync

  request - `com.amazonaws.services.codepipeline.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn retry-stage-execution-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a RetryStageExecution action. - `com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetryStageExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.RetryStageExecutionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retryStageExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.RetryStageExecutionRequest request]
    (-> this (.retryStageExecutionAsync request))))

(defn get-pipeline-execution-async
  "Description copied from interface: AWSCodePipelineAsync

  request - Represents the input of a GetPipelineExecution action. - `com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPipelineExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.codepipeline.model.GetPipelineExecutionResult>`"
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPipelineExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCodePipelineAsyncClient this ^com.amazonaws.services.codepipeline.model.GetPipelineExecutionRequest request]
    (-> this (.getPipelineExecutionAsync request))))

