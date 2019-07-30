(ns com.amazonaws.services.stepfunctions.AWSStepFunctions
  "Interface for accessing AWS SFN.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSStepFunctions instead.


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
  (:import [com.amazonaws.services.stepfunctions AWSStepFunctions]))

(defn send-task-failure
  "Used by workers to report that the task identified by the taskToken failed.

  send-task-failure-request - `com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest`

  returns: Result of the SendTaskFailure operation returned by the service. - `com.amazonaws.services.stepfunctions.model.SendTaskFailureResult`

  throws: com.amazonaws.services.stepfunctions.model.TaskDoesNotExistException"
  (^com.amazonaws.services.stepfunctions.model.SendTaskFailureResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest send-task-failure-request]
    (-> this (.sendTaskFailure send-task-failure-request))))

(defn create-state-machine
  "Creates a state machine. A state machine consists of a collection of states that can do work (Task
   states), determine to which states to transition next (Choice states), stop an execution with an
   error (Fail states), and so on. State machines are specified using a JSON-based, structured
   language.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  create-state-machine-request - `com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest`

  returns: Result of the CreateStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.CreateStateMachineResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.CreateStateMachineResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest create-state-machine-request]
    (-> this (.createStateMachine create-state-machine-request))))

(defn list-tags-for-resource
  "List tags for a given resource.

  list-tags-for-resource-request - `com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.ListTagsForResourceResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSStepFunctions this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-activities
  "Lists the existing activities.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  list-activities-request - `com.amazonaws.services.stepfunctions.model.ListActivitiesRequest`

  returns: Result of the ListActivities operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListActivitiesResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidTokenException - The provided token is invalid."
  (^com.amazonaws.services.stepfunctions.model.ListActivitiesResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.ListActivitiesRequest list-activities-request]
    (-> this (.listActivities list-activities-request))))

(defn untag-resource
  "Remove a tag from a Step Functions resource

  untag-resource-request - `com.amazonaws.services.stepfunctions.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.stepfunctions.model.UntagResourceResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.UntagResourceResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn send-task-success
  "Used by workers to report that the task identified by the taskToken completed successfully.

  send-task-success-request - `com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest`

  returns: Result of the SendTaskSuccess operation returned by the service. - `com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult`

  throws: com.amazonaws.services.stepfunctions.model.TaskDoesNotExistException"
  (^com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest send-task-success-request]
    (-> this (.sendTaskSuccess send-task-success-request))))

(defn list-state-machines
  "Lists the existing state machines.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  list-state-machines-request - `com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest`

  returns: Result of the ListStateMachines operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListStateMachinesResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidTokenException - The provided token is invalid."
  (^com.amazonaws.services.stepfunctions.model.ListStateMachinesResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest list-state-machines-request]
    (-> this (.listStateMachines list-state-machines-request))))

(defn update-state-machine
  "Updates an existing state machine by modifying its definition and/or roleArn. Running
   executions will continue to use the previous definition and roleArn. You must include
   at least one of definition or roleArn or you will receive a
   MissingRequiredParameter error.



   All StartExecution calls within a few seconds will use the updated definition and
   roleArn. Executions started immediately after calling UpdateStateMachine may use the
   previous state machine definition and roleArn.

  update-state-machine-request - `com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest`

  returns: Result of the UpdateStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest update-state-machine-request]
    (-> this (.updateStateMachine update-state-machine-request))))

(defn delete-activity
  "Deletes an activity.

  delete-activity-request - `com.amazonaws.services.stepfunctions.model.DeleteActivityRequest`

  returns: Result of the DeleteActivity operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DeleteActivityResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.DeleteActivityResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DeleteActivityRequest delete-activity-request]
    (-> this (.deleteActivity delete-activity-request))))

(defn send-task-heartbeat
  "Used by workers to report to the service that the task represented by the specified taskToken is
   still making progress. This action resets the Heartbeat clock. The Heartbeat threshold
   is specified in the state machine's Amazon States Language definition. This action does not in itself create an
   event in the execution history. However, if the task times out, the execution history contains an
   ActivityTimedOut event.



   The Timeout of a task, defined in the state machine's Amazon States Language definition, is its
   maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.



   This operation is only useful for long-lived tasks to report the liveliness of the task.

  send-task-heartbeat-request - `com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest`

  returns: Result of the SendTaskHeartbeat operation returned by the service. - `com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult`

  throws: com.amazonaws.services.stepfunctions.model.TaskDoesNotExistException"
  (^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest send-task-heartbeat-request]
    (-> this (.sendTaskHeartbeat send-task-heartbeat-request))))

(defn list-executions
  "Lists the executions of a state machine that meet the filtering criteria. Results are sorted by time, with the
   most recent execution first.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  list-executions-request - `com.amazonaws.services.stepfunctions.model.ListExecutionsRequest`

  returns: Result of the ListExecutions operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListExecutionsResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.ListExecutionsResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.ListExecutionsRequest list-executions-request]
    (-> this (.listExecutions list-executions-request))))

(defn delete-state-machine
  "Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to
   DELETING and begins the deletion process. Each state machine execution is deleted the next time it
   makes a state transition.



   The state machine itself is deleted after all executions are completed or deleted.

  delete-state-machine-request - `com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest`

  returns: Result of the DeleteStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest delete-state-machine-request]
    (-> this (.deleteStateMachine delete-state-machine-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSStepFunctions this]
    (-> this (.shutdown))))

(defn describe-activity
  "Describes an activity.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  describe-activity-request - `com.amazonaws.services.stepfunctions.model.DescribeActivityRequest`

  returns: Result of the DescribeActivity operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeActivityResult`

  throws: com.amazonaws.services.stepfunctions.model.ActivityDoesNotExistException - The specified activity does not exist."
  (^com.amazonaws.services.stepfunctions.model.DescribeActivityResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DescribeActivityRequest describe-activity-request]
    (-> this (.describeActivity describe-activity-request))))

(defn describe-state-machine
  "Describes a state machine.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  describe-state-machine-request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest`

  returns: Result of the DescribeStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest describe-state-machine-request]
    (-> this (.describeStateMachine describe-state-machine-request))))

(defn get-execution-history
  "Returns the history of the specified execution as a list of events. By default, the results are returned in
   ascending order of the timeStamp of the events. Use the reverseOrder parameter to get
   the latest events first.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.

  get-execution-history-request - `com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest`

  returns: Result of the GetExecutionHistory operation returned by the service. - `com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionDoesNotExistException - The specified execution does not exist."
  (^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest get-execution-history-request]
    (-> this (.getExecutionHistory get-execution-history-request))))

(defn stop-execution
  "Stops an execution.

  stop-execution-request - `com.amazonaws.services.stepfunctions.model.StopExecutionRequest`

  returns: Result of the StopExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.StopExecutionResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionDoesNotExistException - The specified execution does not exist."
  (^com.amazonaws.services.stepfunctions.model.StopExecutionResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.StopExecutionRequest stop-execution-request]
    (-> this (.stopExecution stop-execution-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"states.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"states.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSStepFunctions this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-activity
  "Creates an activity. An activity is a task that you write in any programming language and host on any machine
   that has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask
   API action and respond using SendTask* API actions. This function lets Step Functions know the
   existence of your activity and returns an identifier for use in a state machine and when polling from the
   activity.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  create-activity-request - `com.amazonaws.services.stepfunctions.model.CreateActivityRequest`

  returns: Result of the CreateActivity operation returned by the service. - `com.amazonaws.services.stepfunctions.model.CreateActivityResult`

  throws: com.amazonaws.services.stepfunctions.model.ActivityLimitExceededException - The maximum number of activities has been reached. Existing activities must be deleted before a new activity can be created."
  (^com.amazonaws.services.stepfunctions.model.CreateActivityResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.CreateActivityRequest create-activity-request]
    (-> this (.createActivity create-activity-request))))

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

  get-activity-task-request - `com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest`

  returns: Result of the GetActivityTask operation returned by the service. - `com.amazonaws.services.stepfunctions.model.GetActivityTaskResult`

  throws: com.amazonaws.services.stepfunctions.model.ActivityDoesNotExistException - The specified activity does not exist."
  (^com.amazonaws.services.stepfunctions.model.GetActivityTaskResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest get-activity-task-request]
    (-> this (.getActivityTask get-activity-task-request))))

(defn describe-state-machine-for-execution
  "Describes the state machine associated with a specific execution.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  describe-state-machine-for-execution-request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest`

  returns: Result of the DescribeStateMachineForExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionDoesNotExistException - The specified execution does not exist."
  (^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest describe-state-machine-for-execution-request]
    (-> this (.describeStateMachineForExecution describe-state-machine-for-execution-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSStepFunctions this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-execution
  "Describes an execution.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  describe-execution-request - `com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest`

  returns: Result of the DescribeExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeExecutionResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionDoesNotExistException - The specified execution does not exist."
  (^com.amazonaws.services.stepfunctions.model.DescribeExecutionResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest describe-execution-request]
    (-> this (.describeExecution describe-execution-request))))

(defn tag-resource
  "Add a tag to a Step Functions resource.

  tag-resource-request - `com.amazonaws.services.stepfunctions.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.stepfunctions.model.TagResourceResult`

  throws: com.amazonaws.services.stepfunctions.model.InvalidArnException - The provided Amazon Resource Name (ARN) is invalid."
  (^com.amazonaws.services.stepfunctions.model.TagResourceResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn start-execution
  "Starts a state machine execution.



   StartExecution is idempotent. If StartExecution is called with the same name and input
   as a running execution, the call will succeed and return the same response as the original request. If the
   execution is closed or if the input is different, it will return a 400 ExecutionAlreadyExists error.
   Names can be reused after 90 days.

  start-execution-request - `com.amazonaws.services.stepfunctions.model.StartExecutionRequest`

  returns: Result of the StartExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.StartExecutionResult`

  throws: com.amazonaws.services.stepfunctions.model.ExecutionLimitExceededException - The maximum number of running executions has been reached. Running executions must end or be stopped before a new execution can be started."
  (^com.amazonaws.services.stepfunctions.model.StartExecutionResult [^AWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.StartExecutionRequest start-execution-request]
    (-> this (.startExecution start-execution-request))))

