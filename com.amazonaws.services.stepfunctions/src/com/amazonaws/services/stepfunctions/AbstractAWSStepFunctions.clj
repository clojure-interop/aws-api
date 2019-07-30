(ns com.amazonaws.services.stepfunctions.AbstractAWSStepFunctions
  "Abstract implementation of AWSStepFunctions. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.stepfunctions AbstractAWSStepFunctions]))

(defn send-task-failure
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest`

  returns: Result of the SendTaskFailure operation returned by the service. - `com.amazonaws.services.stepfunctions.model.SendTaskFailureResult`"
  (^com.amazonaws.services.stepfunctions.model.SendTaskFailureResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest request]
    (-> this (.sendTaskFailure request))))

(defn create-state-machine
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest`

  returns: Result of the CreateStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.CreateStateMachineResult`"
  (^com.amazonaws.services.stepfunctions.model.CreateStateMachineResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest request]
    (-> this (.createStateMachine request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.stepfunctions.model.ListTagsForResourceResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn set-region
  "Description copied from interface: AWSStepFunctions

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSStepFunctions this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-activities
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.ListActivitiesRequest`

  returns: Result of the ListActivities operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListActivitiesResult`"
  (^com.amazonaws.services.stepfunctions.model.ListActivitiesResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.ListActivitiesRequest request]
    (-> this (.listActivities request))))

(defn untag-resource
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.stepfunctions.model.UntagResourceResult`"
  (^com.amazonaws.services.stepfunctions.model.UntagResourceResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn send-task-success
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest`

  returns: Result of the SendTaskSuccess operation returned by the service. - `com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult`"
  (^com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest request]
    (-> this (.sendTaskSuccess request))))

(defn list-state-machines
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest`

  returns: Result of the ListStateMachines operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListStateMachinesResult`"
  (^com.amazonaws.services.stepfunctions.model.ListStateMachinesResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest request]
    (-> this (.listStateMachines request))))

(defn update-state-machine
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest`

  returns: Result of the UpdateStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult`"
  (^com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest request]
    (-> this (.updateStateMachine request))))

(defn delete-activity
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.DeleteActivityRequest`

  returns: Result of the DeleteActivity operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DeleteActivityResult`"
  (^com.amazonaws.services.stepfunctions.model.DeleteActivityResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DeleteActivityRequest request]
    (-> this (.deleteActivity request))))

(defn send-task-heartbeat
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest`

  returns: Result of the SendTaskHeartbeat operation returned by the service. - `com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult`"
  (^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest request]
    (-> this (.sendTaskHeartbeat request))))

(defn list-executions
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.ListExecutionsRequest`

  returns: Result of the ListExecutions operation returned by the service. - `com.amazonaws.services.stepfunctions.model.ListExecutionsResult`"
  (^com.amazonaws.services.stepfunctions.model.ListExecutionsResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.ListExecutionsRequest request]
    (-> this (.listExecutions request))))

(defn delete-state-machine
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest`

  returns: Result of the DeleteStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult`"
  (^com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest request]
    (-> this (.deleteStateMachine request))))

(defn shutdown
  "Description copied from interface: AWSStepFunctions"
  ([^AbstractAWSStepFunctions this]
    (-> this (.shutdown))))

(defn describe-activity
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.DescribeActivityRequest`

  returns: Result of the DescribeActivity operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeActivityResult`"
  (^com.amazonaws.services.stepfunctions.model.DescribeActivityResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DescribeActivityRequest request]
    (-> this (.describeActivity request))))

(defn describe-state-machine
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest`

  returns: Result of the DescribeStateMachine operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult`"
  (^com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest request]
    (-> this (.describeStateMachine request))))

(defn get-execution-history
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest`

  returns: Result of the GetExecutionHistory operation returned by the service. - `com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult`"
  (^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest request]
    (-> this (.getExecutionHistory request))))

(defn stop-execution
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.StopExecutionRequest`

  returns: Result of the StopExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.StopExecutionResult`"
  (^com.amazonaws.services.stepfunctions.model.StopExecutionResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.StopExecutionRequest request]
    (-> this (.stopExecution request))))

(defn set-endpoint
  "Description copied from interface: AWSStepFunctions

  endpoint - The endpoint (ex: \"states.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"states.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSStepFunctions this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-activity
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.CreateActivityRequest`

  returns: Result of the CreateActivity operation returned by the service. - `com.amazonaws.services.stepfunctions.model.CreateActivityResult`"
  (^com.amazonaws.services.stepfunctions.model.CreateActivityResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.CreateActivityRequest request]
    (-> this (.createActivity request))))

(defn get-activity-task
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest`

  returns: Result of the GetActivityTask operation returned by the service. - `com.amazonaws.services.stepfunctions.model.GetActivityTaskResult`"
  (^com.amazonaws.services.stepfunctions.model.GetActivityTaskResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest request]
    (-> this (.getActivityTask request))))

(defn describe-state-machine-for-execution
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest`

  returns: Result of the DescribeStateMachineForExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult`"
  (^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest request]
    (-> this (.describeStateMachineForExecution request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSStepFunctions

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSStepFunctions this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-execution
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest`

  returns: Result of the DescribeExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.DescribeExecutionResult`"
  (^com.amazonaws.services.stepfunctions.model.DescribeExecutionResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest request]
    (-> this (.describeExecution request))))

(defn tag-resource
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.stepfunctions.model.TagResourceResult`"
  (^com.amazonaws.services.stepfunctions.model.TagResourceResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn start-execution
  "Description copied from interface: AWSStepFunctions

  request - `com.amazonaws.services.stepfunctions.model.StartExecutionRequest`

  returns: Result of the StartExecution operation returned by the service. - `com.amazonaws.services.stepfunctions.model.StartExecutionResult`"
  (^com.amazonaws.services.stepfunctions.model.StartExecutionResult [^AbstractAWSStepFunctions this ^com.amazonaws.services.stepfunctions.model.StartExecutionRequest request]
    (-> this (.startExecution request))))

