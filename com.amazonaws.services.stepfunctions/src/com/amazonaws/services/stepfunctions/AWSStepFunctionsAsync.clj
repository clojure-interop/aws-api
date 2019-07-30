(ns com.amazonaws.services.stepfunctions.AWSStepFunctionsAsync
  "Interface for accessing AWS SFN asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSStepFunctionsAsync instead.


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
  (:import [com.amazonaws.services.stepfunctions AWSStepFunctionsAsync]))

(defn untag-resource-async
  "Remove a tag from a Step Functions resource

  untag-resource-request - `com.amazonaws.services.stepfunctions.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn update-state-machine-async
  "Updates an existing state machine by modifying its definition and/or roleArn. Running
   executions will continue to use the previous definition and roleArn. You must include
   at least one of definition or roleArn or you will receive a
   MissingRequiredParameter error.



   All StartExecution calls within a few seconds will use the updated definition and
   roleArn. Executions started immediately after calling UpdateStateMachine may use the
   previous state machine definition and roleArn.

  update-state-machine-request - `com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest update-state-machine-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStateMachineAsync update-state-machine-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest update-state-machine-request]
    (-> this (.updateStateMachineAsync update-state-machine-request))))

(defn describe-activity-async
  "Describes an activity.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  describe-activity-request - `com.amazonaws.services.stepfunctions.model.DescribeActivityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeActivityResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeActivityRequest describe-activity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActivityAsync describe-activity-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeActivityRequest describe-activity-request]
    (-> this (.describeActivityAsync describe-activity-request))))

(defn create-state-machine-async
  "Creates a state machine. A state machine consists of a collection of states that can do work (Task
   states), determine to which states to transition next (Choice states), stop an execution with an
   error (Fail states), and so on. State machines are specified using a JSON-based, structured
   language.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  create-state-machine-request - `com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.CreateStateMachineResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest create-state-machine-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStateMachineAsync create-state-machine-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest create-state-machine-request]
    (-> this (.createStateMachineAsync create-state-machine-request))))

(defn list-activities-async
  "Lists the existing activities.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  list-activities-request - `com.amazonaws.services.stepfunctions.model.ListActivitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListActivitiesResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListActivitiesRequest list-activities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActivitiesAsync list-activities-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListActivitiesRequest list-activities-request]
    (-> this (.listActivitiesAsync list-activities-request))))

(defn get-execution-history-async
  "Returns the history of the specified execution as a list of events. By default, the results are returned in
   ascending order of the timeStamp of the events. Use the reverseOrder parameter to get
   the latest events first.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.

  get-execution-history-request - `com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExecutionHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest get-execution-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExecutionHistoryAsync get-execution-history-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest get-execution-history-request]
    (-> this (.getExecutionHistoryAsync get-execution-history-request))))

(defn describe-execution-async
  "Describes an execution.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  describe-execution-request - `com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeExecutionResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest describe-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExecutionAsync describe-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest describe-execution-request]
    (-> this (.describeExecutionAsync describe-execution-request))))

(defn send-task-heartbeat-async
  "Used by workers to report to the service that the task represented by the specified taskToken is
   still making progress. This action resets the Heartbeat clock. The Heartbeat threshold
   is specified in the state machine's Amazon States Language definition. This action does not in itself create an
   event in the execution history. However, if the task times out, the execution history contains an
   ActivityTimedOut event.



   The Timeout of a task, defined in the state machine's Amazon States Language definition, is its
   maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.



   This operation is only useful for long-lived tasks to report the liveliness of the task.

  send-task-heartbeat-request - `com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTaskHeartbeat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest send-task-heartbeat-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTaskHeartbeatAsync send-task-heartbeat-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest send-task-heartbeat-request]
    (-> this (.sendTaskHeartbeatAsync send-task-heartbeat-request))))

(defn create-activity-async
  "Creates an activity. An activity is a task that you write in any programming language and host on any machine
   that has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask
   API action and respond using SendTask* API actions. This function lets Step Functions know the
   existence of your activity and returns an identifier for use in a state machine and when polling from the
   activity.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  create-activity-request - `com.amazonaws.services.stepfunctions.model.CreateActivityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.CreateActivityResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.CreateActivityRequest create-activity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createActivityAsync create-activity-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.CreateActivityRequest create-activity-request]
    (-> this (.createActivityAsync create-activity-request))))

(defn send-task-success-async
  "Used by workers to report that the task identified by the taskToken completed successfully.

  send-task-success-request - `com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTaskSuccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest send-task-success-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTaskSuccessAsync send-task-success-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest send-task-success-request]
    (-> this (.sendTaskSuccessAsync send-task-success-request))))

(defn list-executions-async
  "Lists the executions of a state machine that meet the filtering criteria. Results are sorted by time, with the
   most recent execution first.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  list-executions-request - `com.amazonaws.services.stepfunctions.model.ListExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListExecutionsRequest list-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listExecutionsAsync list-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListExecutionsRequest list-executions-request]
    (-> this (.listExecutionsAsync list-executions-request))))

(defn start-execution-async
  "Starts a state machine execution.



   StartExecution is idempotent. If StartExecution is called with the same name and input
   as a running execution, the call will succeed and return the same response as the original request. If the
   execution is closed or if the input is different, it will return a 400 ExecutionAlreadyExists error.
   Names can be reused after 90 days.

  start-execution-request - `com.amazonaws.services.stepfunctions.model.StartExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.StartExecutionResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.StartExecutionRequest start-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startExecutionAsync start-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.StartExecutionRequest start-execution-request]
    (-> this (.startExecutionAsync start-execution-request))))

(defn get-activity-task-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetActivityTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.GetActivityTaskResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest get-activity-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getActivityTaskAsync get-activity-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest get-activity-task-request]
    (-> this (.getActivityTaskAsync get-activity-task-request))))

(defn send-task-failure-async
  "Used by workers to report that the task identified by the taskToken failed.

  send-task-failure-request - `com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTaskFailure operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.SendTaskFailureResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest send-task-failure-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTaskFailureAsync send-task-failure-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest send-task-failure-request]
    (-> this (.sendTaskFailureAsync send-task-failure-request))))

(defn delete-activity-async
  "Deletes an activity.

  delete-activity-request - `com.amazonaws.services.stepfunctions.model.DeleteActivityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DeleteActivityResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DeleteActivityRequest delete-activity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteActivityAsync delete-activity-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DeleteActivityRequest delete-activity-request]
    (-> this (.deleteActivityAsync delete-activity-request))))

(defn describe-state-machine-async
  "Describes a state machine.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  describe-state-machine-request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest describe-state-machine-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStateMachineAsync describe-state-machine-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest describe-state-machine-request]
    (-> this (.describeStateMachineAsync describe-state-machine-request))))

(defn list-tags-for-resource-async
  "List tags for a given resource.

  list-tags-for-resource-request - `com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn stop-execution-async
  "Stops an execution.

  stop-execution-request - `com.amazonaws.services.stepfunctions.model.StopExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.StopExecutionResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.StopExecutionRequest stop-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopExecutionAsync stop-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.StopExecutionRequest stop-execution-request]
    (-> this (.stopExecutionAsync stop-execution-request))))

(defn delete-state-machine-async
  "Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to
   DELETING and begins the deletion process. Each state machine execution is deleted the next time it
   makes a state transition.



   The state machine itself is deleted after all executions are completed or deleted.

  delete-state-machine-request - `com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest delete-state-machine-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStateMachineAsync delete-state-machine-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest delete-state-machine-request]
    (-> this (.deleteStateMachineAsync delete-state-machine-request))))

(defn describe-state-machine-for-execution-async
  "Describes the state machine associated with a specific execution.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  describe-state-machine-for-execution-request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStateMachineForExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest describe-state-machine-for-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStateMachineForExecutionAsync describe-state-machine-for-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest describe-state-machine-for-execution-request]
    (-> this (.describeStateMachineForExecutionAsync describe-state-machine-for-execution-request))))

(defn tag-resource-async
  "Add a tag to a Step Functions resource.

  tag-resource-request - `com.amazonaws.services.stepfunctions.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn list-state-machines-async
  "Lists the existing state machines.


   If nextToken is returned, there are more results available. The value of nextToken is a
   unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
   Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
   token will return an HTTP 400 InvalidToken error.



   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
   changes.

  list-state-machines-request - `com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStateMachines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListStateMachinesResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest list-state-machines-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStateMachinesAsync list-state-machines-request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest list-state-machines-request]
    (-> this (.listStateMachinesAsync list-state-machines-request))))

