(ns com.amazonaws.services.stepfunctions.AWSStepFunctionsClient
  "Client for accessing AWS SFN. All service calls made using this client are blocking, and will not return until the
  service call completes.

  AWS Step Functions

  AWS Step Functions is a service that lets you coordinate the components of distributed applications and microservices
  using visual workflows.


  You can use Step Functions to build applications from individual components, each of which performs a discrete
  function, or task, allowing you to scale and change applications quickly. Step Functions provides a console
  that helps visualize the components of your application as a series of steps. Step Functions automatically triggers
  and tracks each step, and retries steps when there are errors, so your application executes predictably and in the
  right order every time. Step Functions logs the state of each step, so you can quickly diagnose and debug any issues.


  Step Functions manages operations and underlying infrastructure to ensure your application is available at any scale.
  You can run tasks on AWS, your own servers, or any system that has access to AWS. You can access and use Step
  Functions using the console, the AWS SDKs, or an HTTP API. For more information about Step Functions, see the  AWS Step Functions Developer Guide ."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.stepfunctions AWSStepFunctionsClient]))

(defn ->aws-step-functions-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSStepFunctionsClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSStepFunctionsClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSStepFunctionsClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSStepFunctionsClient aws-credentials client-configuration))
  (^AWSStepFunctionsClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSStepFunctionsClient client-configuration))
  (^AWSStepFunctionsClient []
    (new AWSStepFunctionsClient )))

(defn *builder
  "returns: `com.amazonaws.services.stepfunctions.AWSStepFunctionsClientBuilder`"
  (^com.amazonaws.services.stepfunctions.AWSStepFunctionsClientBuilder []
    (AWSStepFunctionsClient/builder )))

(defn send-task-failure
  "Used by workers to report that the task identified by the taskToken failed.

  request - `com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest`

  returns: Result of the SendTaskFailure operation returned by the service. - `com.amazonaws.services.stepfunctions.model.SendTaskFailureResult`

  throws: com.amazonaws.services.stepfunctions.model.TaskDoesNotExistException"
  (^com.amazonaws.services.stepfunctions.model.SendTaskFailureResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest request]
    (-> this (.sendTaskFailure request))))

(defn create-state-machine
  "Creates a state machine. A state machine consists of a collection of states that can do work (Task
   states), determine to which states to transition next (Choice states), stop an execution with an
   error (Fail states), and so on. State machines are specified using a JSON-based, structured
   language.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  request - `com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest`

  returns: Result of the CreateStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.CreateStateMachineResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.CreateStateMachineResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest request]
    (-> this (.createStateMachine request))))

(defn list-tags-for-resource
  "List tags for a given resource.

  request - `com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.ListTagsForResourceResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-activities
  "Lists the existing activities.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  request - `com.amazonaws.services.stepfunctions.model.ListActivitiesRequest`

  returns: Result of the ListActivities operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListActivitiesResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidTokenException - The provided token is invalid."
  (^com.amazonaws.services.stepfunctions.model.ListActivitiesResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.ListActivitiesRequest request]
    (-> this (.listActivities request))))

(defn untag-resource
  "Remove a tag from a Step Functions resource

  request - `com.amazonaws.services.stepfunctions.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.stepfunctions.model.UntagResourceResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.UntagResourceResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn send-task-success
  "Used by workers to report that the task identified by the taskToken completed successfully.

  request - `com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest`

  returns: Result of the SendTaskSuccess operation returned by the service. - `com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult`

  throws: com.amazonaws.services.stepfunctions.model.TaskDoesNotExistException"
  (^com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest request]
    (-> this (.sendTaskSuccess request))))

(defn list-state-machines
  "Lists the existing state machines.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  request - `com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest`

  returns: Result of the ListStateMachines operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListStateMachinesResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidTokenException - The provided token is invalid."
  (^com.amazonaws.services.stepfunctions.model.ListStateMachinesResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest request]
    (-> this (.listStateMachines request))))

(defn update-state-machine
  "Updates an existing state machine by modifying its definition and/or roleArn. Running
   executions will continue to use the previous definition and roleArn. You must include
   at least one of definition or roleArn or you will receive a
   MissingRequiredParameter error.



   All StartExecution calls within a few seconds will use the updated definition and
   roleArn. Executions started immediately after calling UpdateStateMachine may use the
   previous state machine definition and roleArn.

  request - `com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest`

  returns: Result of the UpdateStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest request]
    (-> this (.updateStateMachine request))))

(defn delete-activity
  "Deletes an activity.

  request - `com.amazonaws.services.stepfunctions.model.DeleteActivityRequest`

  returns: Result of the DeleteActivity operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DeleteActivityResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.DeleteActivityResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.DeleteActivityRequest request]
    (-> this (.deleteActivity request))))

(defn send-task-heartbeat
  "Used by workers to report to the service that the task represented by the specified taskToken is
   still making progress. This action resets the Heartbeat clock. The Heartbeat threshold
   is specified in the state machine's Amazon States Language definition. This action does not in itself create an
   event in the execution history. However, if the task times out, the execution history contains an
   ActivityTimedOut event.



   The Timeout of a task, defined in the state machine's Amazon States Language definition, is its
   maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.



   This operation is only useful for long-lived tasks to report the liveliness of the task.

  request - `com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest`

  returns: Result of the SendTaskHeartbeat operation returned by the service. - `com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult`

  throws: com.amazonaws.services.stepfunctions.model.TaskDoesNotExistException"
  (^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest request]
    (-> this (.sendTaskHeartbeat request))))

(defn list-executions
  "Lists the executions of a state machine that meet the filtering criteria. Results are sorted by time, with the
   most recent execution first.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  request - `com.amazonaws.services.stepfunctions.model.ListExecutionsRequest`

  returns: Result of the ListExecutions operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListExecutionsResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.ListExecutionsResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.ListExecutionsRequest request]
    (-> this (.listExecutions request))))

(defn delete-state-machine
  "Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to
   DELETING and begins the deletion process. Each state machine execution is deleted the next time it
   makes a state transition.



   The state machine itself is deleted after all executions are completed or deleted.

  request - `com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest`

  returns: Result of the DeleteStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest request]
    (-> this (.deleteStateMachine request))))

(defn describe-activity
  "Describes an activity.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  request - `com.amazonaws.services.stepfunctions.model.DescribeActivityRequest`

  returns: Result of the DescribeActivity operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeActivityResult`

  throws: com.amazonaws.services.stepfunctions.model.ActivityDoesNotExistException - The specified activity does not exist."
  (^com.amazonaws.services.stepfunctions.model.DescribeActivityResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.DescribeActivityRequest request]
    (-> this (.describeActivity request))))

(defn describe-state-machine
  "Describes a state machine.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest`

  returns: Result of the DescribeStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest request]
    (-> this (.describeStateMachine request))))

(defn get-execution-history
  "Returns the history of the specified execution as a list of events. By default, the results are returned in
   ascending order of the timeStamp of the events. Use the reverseOrder parameter to get
   the latest events first.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.

  request - `com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest`

  returns: Result of the GetExecutionHistory operation returned by the service. - `com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionDoesNotExistException - The specified execution does not exist."
  (^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest request]
    (-> this (.getExecutionHistory request))))

(defn stop-execution
  "Stops an execution.

  request - `com.amazonaws.services.stepfunctions.model.StopExecutionRequest`

  returns: Result of the StopExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.StopExecutionResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionDoesNotExistException - The specified execution does not exist."
  (^com.amazonaws.services.stepfunctions.model.StopExecutionResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.StopExecutionRequest request]
    (-> this (.stopExecution request))))

(defn create-activity
  "Creates an activity. An activity is a task that you write in any programming language and host on any machine
   that has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask
   API action and respond using SendTask* API actions. This function lets Step Functions know the
   existence of your activity and returns an identifier for use in a state machine and when polling from the
   activity.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  request - `com.amazonaws.services.stepfunctions.model.CreateActivityRequest`

  returns: Result of the CreateActivity operation returned by the service. - `com.amazonaws.services.stepfunctions.model.CreateActivityResult`

  throws: com.amazonaws.services.stepfunctions.model.ActivityLimitExceededException - The maximum number of activities has been reached. Existing activities must be deleted before a new activity can be created."
  (^com.amazonaws.services.stepfunctions.model.CreateActivityResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.CreateActivityRequest request]
    (-> this (.createActivity request))))

(defn get-activity-task
  "Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a
   running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds
   as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the
   service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the
   poll returns a taskToken with a null string.



   Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum
   time the service may hold the poll request).


   Polling with GetActivityTask can cause latency in some implementations. See Avoid Latency When Polling
   for Activity Tasks in the Step Functions Developer Guide.

  request - `com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest`

  returns: Result of the GetActivityTask operation returned by the service. - `com.amazonaws.services.stepfunctions.model.GetActivityTaskResult`

  throws: com.amazonaws.services.stepfunctions.model.ActivityDoesNotExistException - The specified activity does not exist."
  (^com.amazonaws.services.stepfunctions.model.GetActivityTaskResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest request]
    (-> this (.getActivityTask request))))

(defn describe-state-machine-for-execution
  "Describes the state machine associated with a specific execution.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest`

  returns: Result of the DescribeStateMachineForExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionDoesNotExistException - The specified execution does not exist."
  (^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest request]
    (-> this (.describeStateMachineForExecution request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSStepFunctionsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-execution
  "Describes an execution.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  request - `com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest`

  returns: Result of the DescribeExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeExecutionResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionDoesNotExistException - The specified execution does not exist."
  (^com.amazonaws.services.stepfunctions.model.DescribeExecutionResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest request]
    (-> this (.describeExecution request))))

(defn tag-resource
  "Add a tag to a Step Functions resource.

  request - `com.amazonaws.services.stepfunctions.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.stepfunctions.model.TagResourceResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.TagResourceResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn start-execution
  "Starts a state machine execution.



   StartExecution is idempotent. If StartExecution is called with the same name and input
   as a running execution, the call will succeed and return the same response as the original request. If the
   execution is closed or if the input is different, it will return a 400 ExecutionAlreadyExists error.
   Names can be reused after 90 days.

  request - `com.amazonaws.services.stepfunctions.model.StartExecutionRequest`

  returns: Result of the StartExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.StartExecutionResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionLimitExceededException - The maximum number of running executions has been reached. Running executions must end or be stopped before a new execution can be started."
  (^com.amazonaws.services.stepfunctions.model.StartExecutionResult [^AWSStepFunctionsClient this ^com.amazonaws.services.stepfunctions.model.StartExecutionRequest request]
    (-> this (.startExecution request))))

