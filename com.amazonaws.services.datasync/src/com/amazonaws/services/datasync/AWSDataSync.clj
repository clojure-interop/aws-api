(ns com.amazonaws.services.datasync.AWSDataSync
  "Interface for accessing DataSync.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSDataSync instead.


  AWS DataSync

  AWS DataSync is a managed data transfer service that makes it simpler for you to automate moving data between
  on-premises storage and Amazon Simple Storage Service (Amazon S3) or Amazon Elastic File System (Amazon EFS).


  This API interface reference for AWS DataSync contains documentation for a programming interface that you can use to
  manage AWS DataSync."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datasync AWSDataSync]))

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

  create-agent-request - CreateAgentRequest - `com.amazonaws.services.datasync.model.CreateAgentRequest`

  returns: Result of the CreateAgent operation returned by the service. - `com.amazonaws.services.datasync.model.CreateAgentResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateAgentResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.CreateAgentRequest create-agent-request]
    (-> this (.createAgent create-agent-request))))

(defn update-task
  "Updates the metadata associated with a task.

  update-task-request - UpdateTaskResponse - `com.amazonaws.services.datasync.model.UpdateTaskRequest`

  returns: Result of the UpdateTask operation returned by the service. - `com.amazonaws.services.datasync.model.UpdateTaskResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.UpdateTaskResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.UpdateTaskRequest update-task-request]
    (-> this (.updateTask update-task-request))))

(defn start-task-execution
  "Starts a specific invocation of a task. A TaskExecution value represents an individual run of a
   task. Each task can have at most one TaskExecution at a time.


   TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING |
   VERIFYING | SUCCESS/FAILURE.


   For detailed information, see Task Execution in
   \"https://docs.aws.amazon.com/datasync/latest/userguide/how-datasync-works.html#terminology\" (Components and
   Terminology) in the AWS DataSync User Guide.

  start-task-execution-request - StartTaskExecutionRequest - `com.amazonaws.services.datasync.model.StartTaskExecutionRequest`

  returns: Result of the StartTaskExecution operation returned by the service. - `com.amazonaws.services.datasync.model.StartTaskExecutionResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.StartTaskExecutionResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.StartTaskExecutionRequest start-task-execution-request]
    (-> this (.startTaskExecution start-task-execution-request))))

(defn create-location-efs
  "Creates an endpoint for an Amazon EFS file system.

  create-location-efs-request - CreateLocationEfsRequest - `com.amazonaws.services.datasync.model.CreateLocationEfsRequest`

  returns: Result of the CreateLocationEfs operation returned by the service. - `com.amazonaws.services.datasync.model.CreateLocationEfsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateLocationEfsResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.CreateLocationEfsRequest create-location-efs-request]
    (-> this (.createLocationEfs create-location-efs-request))))

(defn list-tags-for-resource
  "Returns all the tags associated with a specified resources.

  list-tags-for-resource-request - ListTagsForResourceRequest - `com.amazonaws.services.datasync.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.datasync.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListTagsForResourceResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn create-location-nfs
  "Creates an endpoint for a Network File System (NFS) file system.

  create-location-nfs-request - CreateLocationNfsRequest - `com.amazonaws.services.datasync.model.CreateLocationNfsRequest`

  returns: Result of the CreateLocationNfs operation returned by the service. - `com.amazonaws.services.datasync.model.CreateLocationNfsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateLocationNfsResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.CreateLocationNfsRequest create-location-nfs-request]
    (-> this (.createLocationNfs create-location-nfs-request))))

(defn describe-location-s-3
  "Returns metadata, such as bucket name, about an Amazon S3 bucket location.

  describe-location-s-3-request - DescribeLocationS3Request - `com.amazonaws.services.datasync.model.DescribeLocationS3Request`

  returns: Result of the DescribeLocationS3 operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeLocationS3Result`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeLocationS3Result [^AWSDataSync this ^com.amazonaws.services.datasync.model.DescribeLocationS3Request describe-location-s-3-request]
    (-> this (.describeLocationS3 describe-location-s-3-request))))

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

  create-task-request - CreateTaskRequest - `com.amazonaws.services.datasync.model.CreateTaskRequest`

  returns: Result of the CreateTask operation returned by the service. - `com.amazonaws.services.datasync.model.CreateTaskResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateTaskResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.CreateTaskRequest create-task-request]
    (-> this (.createTask create-task-request))))

(defn untag-resource
  "Removes a tag from an AWS resource.

  untag-resource-request - UntagResourceRequest - `com.amazonaws.services.datasync.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.datasync.model.UntagResourceResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.UntagResourceResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn cancel-task-execution
  "Cancels execution of a task.


   When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that
   are transferred to the destination might be incomplete or inconsistent with the source files. However, if you
   start a new task execution on the same task and you allow the task execution to complete, file content on the
   destination is complete and consistent. This applies to other unexpected failures that interrupt a task
   execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task
   execution.

  cancel-task-execution-request - CancelTaskExecutionRequest - `com.amazonaws.services.datasync.model.CancelTaskExecutionRequest`

  returns: Result of the CancelTaskExecution operation returned by the service. - `com.amazonaws.services.datasync.model.CancelTaskExecutionResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CancelTaskExecutionResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.CancelTaskExecutionRequest cancel-task-execution-request]
    (-> this (.cancelTaskExecution cancel-task-execution-request))))

(defn list-agents
  "Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is
   ordered by agent Amazon Resource Name (ARN).


   By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you
   to optionally reduce the number of agents returned in a response.


   If you have more agents than are returned in a response (that is, the response returns only a truncated list of
   your agents), the response contains a marker that you can specify in your next request to fetch the next page of
   agents.

  list-agents-request - ListAgentsRequest - `com.amazonaws.services.datasync.model.ListAgentsRequest`

  returns: Result of the ListAgents operation returned by the service. - `com.amazonaws.services.datasync.model.ListAgentsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListAgentsResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.ListAgentsRequest list-agents-request]
    (-> this (.listAgents list-agents-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSDataSync this]
    (-> this (.shutdown))))

(defn list-locations
  "Returns a lists of source and destination locations.


   If you have more locations than are returned in a response (that is, the response returns only a truncated list
   of your agents), the response contains a token that you can specify in your next request to fetch the next page
   of locations.

  list-locations-request - ListLocationsRequest - `com.amazonaws.services.datasync.model.ListLocationsRequest`

  returns: Result of the ListLocations operation returned by the service. - `com.amazonaws.services.datasync.model.ListLocationsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListLocationsResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.ListLocationsRequest list-locations-request]
    (-> this (.listLocations list-locations-request))))

(defn delete-task
  "Deletes a task.

  delete-task-request - DeleteTask - `com.amazonaws.services.datasync.model.DeleteTaskRequest`

  returns: Result of the DeleteTask operation returned by the service. - `com.amazonaws.services.datasync.model.DeleteTaskResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DeleteTaskResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.DeleteTaskRequest delete-task-request]
    (-> this (.deleteTask delete-task-request))))

(defn describe-task
  "Returns metadata about a task.

  describe-task-request - DescribeTaskRequest - `com.amazonaws.services.datasync.model.DescribeTaskRequest`

  returns: Result of the DescribeTask operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeTaskResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeTaskResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.DescribeTaskRequest describe-task-request]
    (-> this (.describeTask describe-task-request))))

(defn describe-agent
  "Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running
   or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your
   request.

  describe-agent-request - DescribeAgent - `com.amazonaws.services.datasync.model.DescribeAgentRequest`

  returns: Result of the DescribeAgent operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeAgentResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeAgentResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.DescribeAgentRequest describe-agent-request]
    (-> this (.describeAgent describe-agent-request))))

(defn create-location-s-3
  "Creates an endpoint for an Amazon S3 bucket.


   For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role
   that has the required permissions. You can set up the required permissions by creating an IAM policy that grants
   the required permissions and attaching the policy to the role. An example of such a policy is shown in the
   examples section.


   For more information, see
   \"https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location\"
   (Configuring Amazon S3 Location Settings) in the AWS DataSync User Guide.

  create-location-s-3-request - CreateLocationS3Request - `com.amazonaws.services.datasync.model.CreateLocationS3Request`

  returns: Result of the CreateLocationS3 operation returned by the service. - `com.amazonaws.services.datasync.model.CreateLocationS3Result`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.CreateLocationS3Result [^AWSDataSync this ^com.amazonaws.services.datasync.model.CreateLocationS3Request create-location-s-3-request]
    (-> this (.createLocationS3 create-location-s-3-request))))

(defn describe-task-execution
  "Returns detailed metadata about a task that is being executed.

  describe-task-execution-request - DescribeTaskExecutionRequest - `com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest`

  returns: Result of the DescribeTaskExecution operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeTaskExecutionResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeTaskExecutionResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest describe-task-execution-request]
    (-> this (.describeTaskExecution describe-task-execution-request))))

(defn update-agent
  "Updates the name of an agent.

  update-agent-request - UpdateAgentRequest - `com.amazonaws.services.datasync.model.UpdateAgentRequest`

  returns: Result of the UpdateAgent operation returned by the service. - `com.amazonaws.services.datasync.model.UpdateAgentResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.UpdateAgentResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.UpdateAgentRequest update-agent-request]
    (-> this (.updateAgent update-agent-request))))

(defn delete-location
  "Deletes the configuration of a location used by AWS DataSync.

  delete-location-request - DeleteLocation - `com.amazonaws.services.datasync.model.DeleteLocationRequest`

  returns: Result of the DeleteLocation operation returned by the service. - `com.amazonaws.services.datasync.model.DeleteLocationResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DeleteLocationResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.DeleteLocationRequest delete-location-request]
    (-> this (.deleteLocation delete-location-request))))

(defn describe-location-nfs
  "Returns metadata, such as the path information, about a NFS location.

  describe-location-nfs-request - DescribeLocationNfsRequest - `com.amazonaws.services.datasync.model.DescribeLocationNfsRequest`

  returns: Result of the DescribeLocationNfs operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeLocationNfsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeLocationNfsResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.DescribeLocationNfsRequest describe-location-nfs-request]
    (-> this (.describeLocationNfs describe-location-nfs-request))))

(defn list-task-executions
  "Returns a list of executed tasks.

  list-task-executions-request - ListTaskExecutions - `com.amazonaws.services.datasync.model.ListTaskExecutionsRequest`

  returns: Result of the ListTaskExecutions operation returned by the service. - `com.amazonaws.services.datasync.model.ListTaskExecutionsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListTaskExecutionsResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.ListTaskExecutionsRequest list-task-executions-request]
    (-> this (.listTaskExecutions list-task-executions-request))))

(defn delete-agent
  "Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your
   request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent
   virtual machine (VM) from your on-premises environment.

  delete-agent-request - DeleteAgentRequest - `com.amazonaws.services.datasync.model.DeleteAgentRequest`

  returns: Result of the DeleteAgent operation returned by the service. - `com.amazonaws.services.datasync.model.DeleteAgentResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DeleteAgentResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.DeleteAgentRequest delete-agent-request]
    (-> this (.deleteAgent delete-agent-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSDataSync this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-tasks
  "Returns a list of all the tasks.

  list-tasks-request - ListTasksRequest - `com.amazonaws.services.datasync.model.ListTasksRequest`

  returns: Result of the ListTasks operation returned by the service. - `com.amazonaws.services.datasync.model.ListTasksResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.ListTasksResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.ListTasksRequest list-tasks-request]
    (-> this (.listTasks list-tasks-request))))

(defn describe-location-efs
  "Returns metadata, such as the path information about an Amazon EFS location.

  describe-location-efs-request - DescribeLocationEfsRequest - `com.amazonaws.services.datasync.model.DescribeLocationEfsRequest`

  returns: Result of the DescribeLocationEfs operation returned by the service. - `com.amazonaws.services.datasync.model.DescribeLocationEfsResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.DescribeLocationEfsResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.DescribeLocationEfsRequest describe-location-efs-request]
    (-> this (.describeLocationEfs describe-location-efs-request))))

(defn tag-resource
  "Applies a key-value pair to an AWS resource.

  tag-resource-request - TagResourceRequest - `com.amazonaws.services.datasync.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.datasync.model.TagResourceResult`

  throws: com.amazonaws.services.datasync.model.InvalidRequestException - This exception is thrown when the client submits a malformed request."
  (^com.amazonaws.services.datasync.model.TagResourceResult [^AWSDataSync this ^com.amazonaws.services.datasync.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

