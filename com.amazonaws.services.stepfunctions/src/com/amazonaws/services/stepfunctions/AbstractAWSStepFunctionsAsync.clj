(ns com.amazonaws.services.stepfunctions.AbstractAWSStepFunctionsAsync
  "Abstract implementation of AWSStepFunctionsAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.stepfunctions AbstractAWSStepFunctionsAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-state-machine-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStateMachineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest request]
    (-> this (.updateStateMachineAsync request))))

(defn describe-activity-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DescribeActivityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeActivityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeActivityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActivityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeActivityRequest request]
    (-> this (.describeActivityAsync request))))

(defn create-state-machine-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.CreateStateMachineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStateMachineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest request]
    (-> this (.createStateMachineAsync request))))

(defn list-activities-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.ListActivitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListActivitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListActivitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActivitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListActivitiesRequest request]
    (-> this (.listActivitiesAsync request))))

(defn get-execution-history-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExecutionHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExecutionHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest request]
    (-> this (.getExecutionHistoryAsync request))))

(defn describe-execution-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest request]
    (-> this (.describeExecutionAsync request))))

(defn send-task-heartbeat-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTaskHeartbeat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTaskHeartbeatAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest request]
    (-> this (.sendTaskHeartbeatAsync request))))

(defn create-activity-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.CreateActivityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.CreateActivityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.CreateActivityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createActivityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.CreateActivityRequest request]
    (-> this (.createActivityAsync request))))

(defn send-task-success-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTaskSuccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTaskSuccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest request]
    (-> this (.sendTaskSuccessAsync request))))

(defn list-executions-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.ListExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListExecutionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListExecutionsRequest request]
    (-> this (.listExecutionsAsync request))))

(defn start-execution-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.StartExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.StartExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.StartExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.StartExecutionRequest request]
    (-> this (.startExecutionAsync request))))

(defn get-activity-task-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetActivityTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.GetActivityTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getActivityTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest request]
    (-> this (.getActivityTaskAsync request))))

(defn send-task-failure-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTaskFailure operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.SendTaskFailureResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTaskFailureAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest request]
    (-> this (.sendTaskFailureAsync request))))

(defn delete-activity-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DeleteActivityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DeleteActivityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DeleteActivityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteActivityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DeleteActivityRequest request]
    (-> this (.deleteActivityAsync request))))

(defn describe-state-machine-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStateMachineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest request]
    (-> this (.describeStateMachineAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn stop-execution-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.StopExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.StopExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.StopExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.StopExecutionRequest request]
    (-> this (.stopExecutionAsync request))))

(defn delete-state-machine-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStateMachineAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest request]
    (-> this (.deleteStateMachineAsync request))))

(defn describe-state-machine-for-execution-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStateMachineForExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStateMachineForExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest request]
    (-> this (.describeStateMachineForExecutionAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn list-state-machines-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStateMachines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListStateMachinesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStateMachinesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSStepFunctionsAsync this ^com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest request]
    (-> this (.listStateMachinesAsync request))))

