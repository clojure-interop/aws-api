(ns com.amazonaws.services.datasync.AWSDataSyncClient
  "Client for accessing DataSync. All service calls made using this client are blocking, and will not return until the
  service call completes.

  AWS DataSync

  AWS DataSync is a managed data transfer service that makes it simpler for you to automate moving data between
  on-premises storage and Amazon Simple Storage Service (Amazon S3) or Amazon Elastic File System (Amazon EFS).


  This API interface reference for AWS DataSync contains documentation for a programming interface that you can use to
  manage AWS DataSync."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datasync AWSDataSyncClient]))

(defn *builder
  "returns: `com.amazonaws.services.datasync.AWSDataSyncClientBuilder`"
  (^com.amazonaws.services.datasync.AWSDataSyncClientBuilder []
    (AWSDataSyncClient/builder )))

(defn create-agent
  "Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent
   with your account. In the activation process, you specify information such as the AWS Region that you want to
   activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or
   Amazon EFS) reside. Your tasks are created in this AWS Region.


   You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status
   AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents
   must be AVAILABLE for the task to run.


   For more information, see
   \"https://docs.aws.amazon.com/datasync/latest/userguide/working-with-agents.html#activating-agent\" (Activating an
   Agent) in the AWS DataSync User Guide.


   Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption
   to your tasks.

  request - `com.amazonaws.services.datasync.model.CreateAgentRequest`

  returns: Result of the CreateAgent operation returned by the service. - `com.amazonaws.services.datasync.model.CreateAgentResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateAgentResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.CreateAgentRequest request]
    (-> this (.createAgent request))))

(defn update-task
  "Updates the metadata associated with a task.

  request - `com.amazonaws.services.datasync.model.UpdateTaskRequest`

  returns: Result of the UpdateTask operation returned by the service. - `com.amazonaws.services.datasync.model.UpdateTaskResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.UpdateTaskResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.UpdateTaskRequest request]
    (-> this (.updateTask request))))

(defn start-task-execution
  "Starts a specific invocation of a task. A TaskExecution value represents an individual run of a
   task. Each task can have at most one TaskExecution at a time.


   TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING |
   VERIFYING | SUCCESS/FAILURE.


   For detailed information, see Task Execution in
   \"https://docs.aws.amazon.com/datasync/latest/userguide/how-datasync-works.html#terminology\" (Components and
   Terminology) in the AWS DataSync User Guide.

  request - `com.amazonaws.services.datasync.model.StartTaskExecutionRequest`

  returns: Result of the StartTaskExecution operation returned by the service. - `com.amazonaws.services.datasync.model.StartTaskExecutionResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.StartTaskExecutionResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.StartTaskExecutionRequest request]
    (-> this (.startTaskExecution request))))

(defn create-location-efs
  "Creates an endpoint for an Amazon EFS file system.

  request - `com.amazonaws.services.datasync.model.CreateLocationEfsRequest`

  returns: Result of the CreateLocationEfs operation returned by the service. - `com.amazonaws.services.datasync.model.CreateLocationEfsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateLocationEfsResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.CreateLocationEfsRequest request]
    (-> this (.createLocationEfs request))))

(defn list-tags-for-resource
  "Returns all the tags associated with a specified resources.

  request - `com.amazonaws.services.datasync.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.datasync.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListTagsForResourceResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn create-location-nfs
  "Creates an endpoint for a Network File System (NFS) file system.

  request - `com.amazonaws.services.datasync.model.CreateLocationNfsRequest`

  returns: Result of the CreateLocationNfs operation returned by the service. - `com.amazonaws.services.datasync.model.CreateLocationNfsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateLocationNfsResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.CreateLocationNfsRequest request]
    (-> this (.createLocationNfs request))))

(defn describe-location-s-3
  "Returns metadata, such as bucket name, about an Amazon S3 bucket location.

  request - `com.amazonaws.services.datasync.model.DescribeLocationS3Request`

  returns: Result of the DescribeLocationS3 operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeLocationS3Result`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeLocationS3Result [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.DescribeLocationS3Request request]
    (-> this (.describeLocationS3 request))))

(defn create-task
  "Creates a task. A task is a set of two locations (source and destination) and a set of Options that you use to
   control the behavior of a task. If you don't specify Options when you create a task, AWS DataSync populates them
   with service defaults.


   When you create a task, it first enters the CREATING state. During CREATING AWS DataSync attempts to mount the
   on-premises Network File System (NFS) location. The task transitions to the AVAILABLE state without waiting for
   the AWS location to become mounted. If required, AWS DataSync mounts the AWS location before each task execution.


   If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE
   status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your
   agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail.
   Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.

  request - `com.amazonaws.services.datasync.model.CreateTaskRequest`

  returns: Result of the CreateTask operation returned by the service. - `com.amazonaws.services.datasync.model.CreateTaskResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateTaskResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.CreateTaskRequest request]
    (-> this (.createTask request))))

(defn untag-resource
  "Removes a tag from an AWS resource.

  request - `com.amazonaws.services.datasync.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.datasync.model.UntagResourceResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.UntagResourceResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn cancel-task-execution
  "Cancels execution of a task.


   When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that
   are transferred to the destination might be incomplete or inconsistent with the source files. However, if you
   start a new task execution on the same task and you allow the task execution to complete, file content on the
   destination is complete and consistent. This applies to other unexpected failures that interrupt a task
   execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task
   execution.

  request - `com.amazonaws.services.datasync.model.CancelTaskExecutionRequest`

  returns: Result of the CancelTaskExecution operation returned by the service. - `com.amazonaws.services.datasync.model.CancelTaskExecutionResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CancelTaskExecutionResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.CancelTaskExecutionRequest request]
    (-> this (.cancelTaskExecution request))))

(defn list-agents
  "Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is
   ordered by agent Amazon Resource Name (ARN).


   By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you
   to optionally reduce the number of agents returned in a response.


   If you have more agents than are returned in a response (that is, the response returns only a truncated list of
   your agents), the response contains a marker that you can specify in your next request to fetch the next page of
   agents.

  request - `com.amazonaws.services.datasync.model.ListAgentsRequest`

  returns: Result of the ListAgents operation returned by the service. - `com.amazonaws.services.datasync.model.ListAgentsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListAgentsResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.ListAgentsRequest request]
    (-> this (.listAgents request))))

(defn list-locations
  "Returns a lists of source and destination locations.


   If you have more locations than are returned in a response (that is, the response returns only a truncated list
   of your agents), the response contains a token that you can specify in your next request to fetch the next page
   of locations.

  request - `com.amazonaws.services.datasync.model.ListLocationsRequest`

  returns: Result of the ListLocations operation returned by the service. - `com.amazonaws.services.datasync.model.ListLocationsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListLocationsResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.ListLocationsRequest request]
    (-> this (.listLocations request))))

(defn delete-task
  "Deletes a task.

  request - `com.amazonaws.services.datasync.model.DeleteTaskRequest`

  returns: Result of the DeleteTask operation returned by the service. - `com.amazonaws.services.datasync.model.DeleteTaskResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DeleteTaskResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.DeleteTaskRequest request]
    (-> this (.deleteTask request))))

(defn describe-task
  "Returns metadata about a task.

  request - `com.amazonaws.services.datasync.model.DescribeTaskRequest`

  returns: Result of the DescribeTask operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeTaskResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeTaskResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.DescribeTaskRequest request]
    (-> this (.describeTask request))))

(defn describe-agent
  "Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running
   or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your
   request.

  request - `com.amazonaws.services.datasync.model.DescribeAgentRequest`

  returns: Result of the DescribeAgent operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeAgentResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeAgentResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.DescribeAgentRequest request]
    (-> this (.describeAgent request))))

(defn create-location-s-3
  "Creates an endpoint for an Amazon S3 bucket.


   For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role
   that has the required permissions. You can set up the required permissions by creating an IAM policy that grants
   the required permissions and attaching the policy to the role. An example of such a policy is shown in the
   examples section.


   For more information, see
   \"https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location\"
   (Configuring Amazon S3 Location Settings) in the AWS DataSync User Guide.

  request - `com.amazonaws.services.datasync.model.CreateLocationS3Request`

  returns: Result of the CreateLocationS3 operation returned by the service. - `com.amazonaws.services.datasync.model.CreateLocationS3Result`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateLocationS3Result [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.CreateLocationS3Request request]
    (-> this (.createLocationS3 request))))

(defn describe-task-execution
  "Returns detailed metadata about a task that is being executed.

  request - `com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest`

  returns: Result of the DescribeTaskExecution operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeTaskExecutionResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeTaskExecutionResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest request]
    (-> this (.describeTaskExecution request))))

(defn update-agent
  "Updates the name of an agent.

  request - `com.amazonaws.services.datasync.model.UpdateAgentRequest`

  returns: Result of the UpdateAgent operation returned by the service. - `com.amazonaws.services.datasync.model.UpdateAgentResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.UpdateAgentResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.UpdateAgentRequest request]
    (-> this (.updateAgent request))))

(defn delete-location
  "Deletes the configuration of a location used by AWS DataSync.

  request - `com.amazonaws.services.datasync.model.DeleteLocationRequest`

  returns: Result of the DeleteLocation operation returned by the service. - `com.amazonaws.services.datasync.model.DeleteLocationResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DeleteLocationResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.DeleteLocationRequest request]
    (-> this (.deleteLocation request))))

(defn describe-location-nfs
  "Returns metadata, such as the path information, about a NFS location.

  request - `com.amazonaws.services.datasync.model.DescribeLocationNfsRequest`

  returns: Result of the DescribeLocationNfs operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeLocationNfsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeLocationNfsResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.DescribeLocationNfsRequest request]
    (-> this (.describeLocationNfs request))))

(defn list-task-executions
  "Returns a list of executed tasks.

  request - `com.amazonaws.services.datasync.model.ListTaskExecutionsRequest`

  returns: Result of the ListTaskExecutions operation returned by the service. - `com.amazonaws.services.datasync.model.ListTaskExecutionsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListTaskExecutionsResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.ListTaskExecutionsRequest request]
    (-> this (.listTaskExecutions request))))

(defn delete-agent
  "Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your
   request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent
   virtual machine (VM) from your on-premises environment.

  request - `com.amazonaws.services.datasync.model.DeleteAgentRequest`

  returns: Result of the DeleteAgent operation returned by the service. - `com.amazonaws.services.datasync.model.DeleteAgentResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DeleteAgentResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.DeleteAgentRequest request]
    (-> this (.deleteAgent request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSDataSyncClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-tasks
  "Returns a list of all the tasks.

  request - `com.amazonaws.services.datasync.model.ListTasksRequest`

  returns: Result of the ListTasks operation returned by the service. - `com.amazonaws.services.datasync.model.ListTasksResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListTasksResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.ListTasksRequest request]
    (-> this (.listTasks request))))

(defn describe-location-efs
  "Returns metadata, such as the path information about an Amazon EFS location.

  request - `com.amazonaws.services.datasync.model.DescribeLocationEfsRequest`

  returns: Result of the DescribeLocationEfs operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeLocationEfsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeLocationEfsResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.DescribeLocationEfsRequest request]
    (-> this (.describeLocationEfs request))))

(defn tag-resource
  "Applies a key-value pair to an AWS resource.

  request - `com.amazonaws.services.datasync.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.datasync.model.TagResourceResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.TagResourceResult [^AWSDataSyncClient this ^com.amazonaws.services.datasync.model.TagResourceRequest request]
    (-> this (.tagResource request))))

