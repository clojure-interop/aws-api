(ns com.amazonaws.services.datasync.AbstractAWSDataSync
  "Abstract implementation of AWSDataSync. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datasync AbstractAWSDataSync]))

(defn create-agent
  "Description copied from interface: AWSDataSync

  request - CreateAgentRequest - `com.amazonaws.services.datasync.model.CreateAgentRequest`

  returns: Result of the CreateAgent operation returned by the service. - `com.amazonaws.services.datasync.model.CreateAgentResult`"
  (^com.amazonaws.services.datasync.model.CreateAgentResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.CreateAgentRequest request]
    (-> this (.createAgent request))))

(defn update-task
  "Description copied from interface: AWSDataSync

  request - UpdateTaskResponse - `com.amazonaws.services.datasync.model.UpdateTaskRequest`

  returns: Result of the UpdateTask operation returned by the service. - `com.amazonaws.services.datasync.model.UpdateTaskResult`"
  (^com.amazonaws.services.datasync.model.UpdateTaskResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.UpdateTaskRequest request]
    (-> this (.updateTask request))))

(defn start-task-execution
  "Description copied from interface: AWSDataSync

  request - StartTaskExecutionRequest - `com.amazonaws.services.datasync.model.StartTaskExecutionRequest`

  returns: Result of the StartTaskExecution operation returned by the service. - `com.amazonaws.services.datasync.model.StartTaskExecutionResult`"
  (^com.amazonaws.services.datasync.model.StartTaskExecutionResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.StartTaskExecutionRequest request]
    (-> this (.startTaskExecution request))))

(defn create-location-efs
  "Description copied from interface: AWSDataSync

  request - CreateLocationEfsRequest - `com.amazonaws.services.datasync.model.CreateLocationEfsRequest`

  returns: Result of the CreateLocationEfs operation returned by the service. - `com.amazonaws.services.datasync.model.CreateLocationEfsResult`"
  (^com.amazonaws.services.datasync.model.CreateLocationEfsResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.CreateLocationEfsRequest request]
    (-> this (.createLocationEfs request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSDataSync

  request - ListTagsForResourceRequest - `com.amazonaws.services.datasync.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.datasync.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.datasync.model.ListTagsForResourceResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn create-location-nfs
  "Description copied from interface: AWSDataSync

  request - CreateLocationNfsRequest - `com.amazonaws.services.datasync.model.CreateLocationNfsRequest`

  returns: Result of the CreateLocationNfs operation returned by the service. - `com.amazonaws.services.datasync.model.CreateLocationNfsResult`"
  (^com.amazonaws.services.datasync.model.CreateLocationNfsResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.CreateLocationNfsRequest request]
    (-> this (.createLocationNfs request))))

(defn describe-location-s-3
  "Description copied from interface: AWSDataSync

  request - DescribeLocationS3Request - `com.amazonaws.services.datasync.model.DescribeLocationS3Request`

  returns: Result of the DescribeLocationS3 operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeLocationS3Result`"
  (^com.amazonaws.services.datasync.model.DescribeLocationS3Result [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.DescribeLocationS3Request request]
    (-> this (.describeLocationS3 request))))

(defn create-task
  "Description copied from interface: AWSDataSync

  request - CreateTaskRequest - `com.amazonaws.services.datasync.model.CreateTaskRequest`

  returns: Result of the CreateTask operation returned by the service. - `com.amazonaws.services.datasync.model.CreateTaskResult`"
  (^com.amazonaws.services.datasync.model.CreateTaskResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.CreateTaskRequest request]
    (-> this (.createTask request))))

(defn untag-resource
  "Description copied from interface: AWSDataSync

  request - UntagResourceRequest - `com.amazonaws.services.datasync.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.datasync.model.UntagResourceResult`"
  (^com.amazonaws.services.datasync.model.UntagResourceResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn cancel-task-execution
  "Description copied from interface: AWSDataSync

  request - CancelTaskExecutionRequest - `com.amazonaws.services.datasync.model.CancelTaskExecutionRequest`

  returns: Result of the CancelTaskExecution operation returned by the service. - `com.amazonaws.services.datasync.model.CancelTaskExecutionResult`"
  (^com.amazonaws.services.datasync.model.CancelTaskExecutionResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.CancelTaskExecutionRequest request]
    (-> this (.cancelTaskExecution request))))

(defn list-agents
  "Description copied from interface: AWSDataSync

  request - ListAgentsRequest - `com.amazonaws.services.datasync.model.ListAgentsRequest`

  returns: Result of the ListAgents operation returned by the service. - `com.amazonaws.services.datasync.model.ListAgentsResult`"
  (^com.amazonaws.services.datasync.model.ListAgentsResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.ListAgentsRequest request]
    (-> this (.listAgents request))))

(defn shutdown
  "Description copied from interface: AWSDataSync"
  ([^AbstractAWSDataSync this]
    (-> this (.shutdown))))

(defn list-locations
  "Description copied from interface: AWSDataSync

  request - ListLocationsRequest - `com.amazonaws.services.datasync.model.ListLocationsRequest`

  returns: Result of the ListLocations operation returned by the service. - `com.amazonaws.services.datasync.model.ListLocationsResult`"
  (^com.amazonaws.services.datasync.model.ListLocationsResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.ListLocationsRequest request]
    (-> this (.listLocations request))))

(defn delete-task
  "Description copied from interface: AWSDataSync

  request - DeleteTask - `com.amazonaws.services.datasync.model.DeleteTaskRequest`

  returns: Result of the DeleteTask operation returned by the service. - `com.amazonaws.services.datasync.model.DeleteTaskResult`"
  (^com.amazonaws.services.datasync.model.DeleteTaskResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.DeleteTaskRequest request]
    (-> this (.deleteTask request))))

(defn describe-task
  "Description copied from interface: AWSDataSync

  request - DescribeTaskRequest - `com.amazonaws.services.datasync.model.DescribeTaskRequest`

  returns: Result of the DescribeTask operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeTaskResult`"
  (^com.amazonaws.services.datasync.model.DescribeTaskResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.DescribeTaskRequest request]
    (-> this (.describeTask request))))

(defn describe-agent
  "Description copied from interface: AWSDataSync

  request - DescribeAgent - `com.amazonaws.services.datasync.model.DescribeAgentRequest`

  returns: Result of the DescribeAgent operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeAgentResult`"
  (^com.amazonaws.services.datasync.model.DescribeAgentResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.DescribeAgentRequest request]
    (-> this (.describeAgent request))))

(defn create-location-s-3
  "Description copied from interface: AWSDataSync

  request - CreateLocationS3Request - `com.amazonaws.services.datasync.model.CreateLocationS3Request`

  returns: Result of the CreateLocationS3 operation returned by the service. - `com.amazonaws.services.datasync.model.CreateLocationS3Result`"
  (^com.amazonaws.services.datasync.model.CreateLocationS3Result [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.CreateLocationS3Request request]
    (-> this (.createLocationS3 request))))

(defn describe-task-execution
  "Description copied from interface: AWSDataSync

  request - DescribeTaskExecutionRequest - `com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest`

  returns: Result of the DescribeTaskExecution operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeTaskExecutionResult`"
  (^com.amazonaws.services.datasync.model.DescribeTaskExecutionResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest request]
    (-> this (.describeTaskExecution request))))

(defn update-agent
  "Description copied from interface: AWSDataSync

  request - UpdateAgentRequest - `com.amazonaws.services.datasync.model.UpdateAgentRequest`

  returns: Result of the UpdateAgent operation returned by the service. - `com.amazonaws.services.datasync.model.UpdateAgentResult`"
  (^com.amazonaws.services.datasync.model.UpdateAgentResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.UpdateAgentRequest request]
    (-> this (.updateAgent request))))

(defn delete-location
  "Description copied from interface: AWSDataSync

  request - DeleteLocation - `com.amazonaws.services.datasync.model.DeleteLocationRequest`

  returns: Result of the DeleteLocation operation returned by the service. - `com.amazonaws.services.datasync.model.DeleteLocationResult`"
  (^com.amazonaws.services.datasync.model.DeleteLocationResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.DeleteLocationRequest request]
    (-> this (.deleteLocation request))))

(defn describe-location-nfs
  "Description copied from interface: AWSDataSync

  request - DescribeLocationNfsRequest - `com.amazonaws.services.datasync.model.DescribeLocationNfsRequest`

  returns: Result of the DescribeLocationNfs operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeLocationNfsResult`"
  (^com.amazonaws.services.datasync.model.DescribeLocationNfsResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.DescribeLocationNfsRequest request]
    (-> this (.describeLocationNfs request))))

(defn list-task-executions
  "Description copied from interface: AWSDataSync

  request - ListTaskExecutions - `com.amazonaws.services.datasync.model.ListTaskExecutionsRequest`

  returns: Result of the ListTaskExecutions operation returned by the service. - `com.amazonaws.services.datasync.model.ListTaskExecutionsResult`"
  (^com.amazonaws.services.datasync.model.ListTaskExecutionsResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.ListTaskExecutionsRequest request]
    (-> this (.listTaskExecutions request))))

(defn delete-agent
  "Description copied from interface: AWSDataSync

  request - DeleteAgentRequest - `com.amazonaws.services.datasync.model.DeleteAgentRequest`

  returns: Result of the DeleteAgent operation returned by the service. - `com.amazonaws.services.datasync.model.DeleteAgentResult`"
  (^com.amazonaws.services.datasync.model.DeleteAgentResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.DeleteAgentRequest request]
    (-> this (.deleteAgent request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSDataSync

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSDataSync this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-tasks
  "Description copied from interface: AWSDataSync

  request - ListTasksRequest - `com.amazonaws.services.datasync.model.ListTasksRequest`

  returns: Result of the ListTasks operation returned by the service. - `com.amazonaws.services.datasync.model.ListTasksResult`"
  (^com.amazonaws.services.datasync.model.ListTasksResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.ListTasksRequest request]
    (-> this (.listTasks request))))

(defn describe-location-efs
  "Description copied from interface: AWSDataSync

  request - DescribeLocationEfsRequest - `com.amazonaws.services.datasync.model.DescribeLocationEfsRequest`

  returns: Result of the DescribeLocationEfs operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeLocationEfsResult`"
  (^com.amazonaws.services.datasync.model.DescribeLocationEfsResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.DescribeLocationEfsRequest request]
    (-> this (.describeLocationEfs request))))

(defn tag-resource
  "Description copied from interface: AWSDataSync

  request - TagResourceRequest - `com.amazonaws.services.datasync.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.datasync.model.TagResourceResult`"
  (^com.amazonaws.services.datasync.model.TagResourceResult [^AbstractAWSDataSync this ^com.amazonaws.services.datasync.model.TagResourceRequest request]
    (-> this (.tagResource request))))

