(ns com.amazonaws.services.datasync.AWSDataSyncAsync
  "Interface for accessing DataSync asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSDataSyncAsync instead.


  AWS DataSync

  AWS DataSync is a managed data transfer service that makes it simpler for you to automate moving data between
  on-premises storage and Amazon Simple Storage Service (Amazon S3) or Amazon Elastic File System (Amazon EFS).


  This API interface reference for AWS DataSync contains documentation for a programming interface that you can use to
  manage AWS DataSync."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datasync AWSDataSyncAsync]))

(defn untag-resource-async
  "Removes a tag from an AWS resource.

  untag-resource-request - UntagResourceRequest - `com.amazonaws.services.datasync.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn create-location-efs-async
  "Creates an endpoint for an Amazon EFS file system.

  create-location-efs-request - CreateLocationEfsRequest - `com.amazonaws.services.datasync.model.CreateLocationEfsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLocationEfs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateLocationEfsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateLocationEfsRequest create-location-efs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLocationEfsAsync create-location-efs-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateLocationEfsRequest create-location-efs-request]
    (-> this (.createLocationEfsAsync create-location-efs-request))))

(defn describe-agent-async
  "Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running
   or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your
   request.

  describe-agent-request - DescribeAgent - `com.amazonaws.services.datasync.model.DescribeAgentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAgent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeAgentResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeAgentRequest describe-agent-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAgentAsync describe-agent-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeAgentRequest describe-agent-request]
    (-> this (.describeAgentAsync describe-agent-request))))

(defn list-task-executions-async
  "Returns a list of executed tasks.

  list-task-executions-request - ListTaskExecutions - `com.amazonaws.services.datasync.model.ListTaskExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTaskExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListTaskExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListTaskExecutionsRequest list-task-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTaskExecutionsAsync list-task-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListTaskExecutionsRequest list-task-executions-request]
    (-> this (.listTaskExecutionsAsync list-task-executions-request))))

(defn update-agent-async
  "Updates the name of an agent.

  update-agent-request - UpdateAgentRequest - `com.amazonaws.services.datasync.model.UpdateAgentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAgent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.UpdateAgentResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.UpdateAgentRequest update-agent-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAgentAsync update-agent-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.UpdateAgentRequest update-agent-request]
    (-> this (.updateAgentAsync update-agent-request))))

(defn cancel-task-execution-async
  "Cancels execution of a task.


   When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that
   are transferred to the destination might be incomplete or inconsistent with the source files. However, if you
   start a new task execution on the same task and you allow the task execution to complete, file content on the
   destination is complete and consistent. This applies to other unexpected failures that interrupt a task
   execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task
   execution.

  cancel-task-execution-request - CancelTaskExecutionRequest - `com.amazonaws.services.datasync.model.CancelTaskExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelTaskExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CancelTaskExecutionResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CancelTaskExecutionRequest cancel-task-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelTaskExecutionAsync cancel-task-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CancelTaskExecutionRequest cancel-task-execution-request]
    (-> this (.cancelTaskExecutionAsync cancel-task-execution-request))))

(defn list-agents-async
  "Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is
   ordered by agent Amazon Resource Name (ARN).


   By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you
   to optionally reduce the number of agents returned in a response.


   If you have more agents than are returned in a response (that is, the response returns only a truncated list of
   your agents), the response contains a marker that you can specify in your next request to fetch the next page of
   agents.

  list-agents-request - ListAgentsRequest - `com.amazonaws.services.datasync.model.ListAgentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAgents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListAgentsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListAgentsRequest list-agents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAgentsAsync list-agents-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListAgentsRequest list-agents-request]
    (-> this (.listAgentsAsync list-agents-request))))

(defn delete-location-async
  "Deletes the configuration of a location used by AWS DataSync.

  delete-location-request - DeleteLocation - `com.amazonaws.services.datasync.model.DeleteLocationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLocation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DeleteLocationResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DeleteLocationRequest delete-location-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLocationAsync delete-location-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DeleteLocationRequest delete-location-request]
    (-> this (.deleteLocationAsync delete-location-request))))

(defn describe-location-s-3-async
  "Returns metadata, such as bucket name, about an Amazon S3 bucket location.

  describe-location-s-3-request - DescribeLocationS3Request - `com.amazonaws.services.datasync.model.DescribeLocationS3Request`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLocationS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeLocationS3Result>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeLocationS3Request describe-location-s-3-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLocationS3Async describe-location-s-3-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeLocationS3Request describe-location-s-3-request]
    (-> this (.describeLocationS3Async describe-location-s-3-request))))

(defn list-tasks-async
  "Returns a list of all the tasks.

  list-tasks-request - ListTasksRequest - `com.amazonaws.services.datasync.model.ListTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListTasksResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListTasksRequest list-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTasksAsync list-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListTasksRequest list-tasks-request]
    (-> this (.listTasksAsync list-tasks-request))))

(defn start-task-execution-async
  "Starts a specific invocation of a task. A TaskExecution value represents an individual run of a
   task. Each task can have at most one TaskExecution at a time.


   TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING |
   VERIFYING | SUCCESS/FAILURE.


   For detailed information, see Task Execution in
   \"https://docs.aws.amazon.com/datasync/latest/userguide/how-datasync-works.html#terminology\" (Components and
   Terminology) in the AWS DataSync User Guide.

  start-task-execution-request - StartTaskExecutionRequest - `com.amazonaws.services.datasync.model.StartTaskExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartTaskExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.StartTaskExecutionResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.StartTaskExecutionRequest start-task-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startTaskExecutionAsync start-task-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.StartTaskExecutionRequest start-task-execution-request]
    (-> this (.startTaskExecutionAsync start-task-execution-request))))

(defn delete-agent-async
  "Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your
   request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent
   virtual machine (VM) from your on-premises environment.

  delete-agent-request - DeleteAgentRequest - `com.amazonaws.services.datasync.model.DeleteAgentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAgent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DeleteAgentResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DeleteAgentRequest delete-agent-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAgentAsync delete-agent-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DeleteAgentRequest delete-agent-request]
    (-> this (.deleteAgentAsync delete-agent-request))))

(defn describe-task-async
  "Returns metadata about a task.

  describe-task-request - DescribeTaskRequest - `com.amazonaws.services.datasync.model.DescribeTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeTaskResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeTaskRequest describe-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTaskAsync describe-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeTaskRequest describe-task-request]
    (-> this (.describeTaskAsync describe-task-request))))

(defn create-location-nfs-async
  "Creates an endpoint for a Network File System (NFS) file system.

  create-location-nfs-request - CreateLocationNfsRequest - `com.amazonaws.services.datasync.model.CreateLocationNfsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLocationNfs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateLocationNfsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateLocationNfsRequest create-location-nfs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLocationNfsAsync create-location-nfs-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateLocationNfsRequest create-location-nfs-request]
    (-> this (.createLocationNfsAsync create-location-nfs-request))))

(defn describe-location-nfs-async
  "Returns metadata, such as the path information, about a NFS location.

  describe-location-nfs-request - DescribeLocationNfsRequest - `com.amazonaws.services.datasync.model.DescribeLocationNfsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLocationNfs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeLocationNfsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeLocationNfsRequest describe-location-nfs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLocationNfsAsync describe-location-nfs-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeLocationNfsRequest describe-location-nfs-request]
    (-> this (.describeLocationNfsAsync describe-location-nfs-request))))

(defn describe-location-efs-async
  "Returns metadata, such as the path information about an Amazon EFS location.

  describe-location-efs-request - DescribeLocationEfsRequest - `com.amazonaws.services.datasync.model.DescribeLocationEfsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLocationEfs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeLocationEfsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeLocationEfsRequest describe-location-efs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLocationEfsAsync describe-location-efs-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeLocationEfsRequest describe-location-efs-request]
    (-> this (.describeLocationEfsAsync describe-location-efs-request))))

(defn list-tags-for-resource-async
  "Returns all the tags associated with a specified resources.

  list-tags-for-resource-request - ListTagsForResourceRequest - `com.amazonaws.services.datasync.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn create-task-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateTaskResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateTaskRequest create-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTaskAsync create-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateTaskRequest create-task-request]
    (-> this (.createTaskAsync create-task-request))))

(defn describe-task-execution-async
  "Returns detailed metadata about a task that is being executed.

  describe-task-execution-request - DescribeTaskExecutionRequest - `com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTaskExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeTaskExecutionResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest describe-task-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTaskExecutionAsync describe-task-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest describe-task-execution-request]
    (-> this (.describeTaskExecutionAsync describe-task-execution-request))))

(defn create-location-s-3-async
  "Creates an endpoint for an Amazon S3 bucket.


   For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role
   that has the required permissions. You can set up the required permissions by creating an IAM policy that grants
   the required permissions and attaching the policy to the role. An example of such a policy is shown in the
   examples section.


   For more information, see
   \"https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location\"
   (Configuring Amazon S3 Location Settings) in the AWS DataSync User Guide.

  create-location-s-3-request - CreateLocationS3Request - `com.amazonaws.services.datasync.model.CreateLocationS3Request`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLocationS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateLocationS3Result>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateLocationS3Request create-location-s-3-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLocationS3Async create-location-s-3-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateLocationS3Request create-location-s-3-request]
    (-> this (.createLocationS3Async create-location-s-3-request))))

(defn update-task-async
  "Updates the metadata associated with a task.

  update-task-request - UpdateTaskResponse - `com.amazonaws.services.datasync.model.UpdateTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.UpdateTaskResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.UpdateTaskRequest update-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTaskAsync update-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.UpdateTaskRequest update-task-request]
    (-> this (.updateTaskAsync update-task-request))))

(defn delete-task-async
  "Deletes a task.

  delete-task-request - DeleteTask - `com.amazonaws.services.datasync.model.DeleteTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DeleteTaskResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DeleteTaskRequest delete-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTaskAsync delete-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.DeleteTaskRequest delete-task-request]
    (-> this (.deleteTaskAsync delete-task-request))))

(defn list-locations-async
  "Returns a lists of source and destination locations.


   If you have more locations than are returned in a response (that is, the response returns only a truncated list
   of your agents), the response contains a token that you can specify in your next request to fetch the next page
   of locations.

  list-locations-request - ListLocationsRequest - `com.amazonaws.services.datasync.model.ListLocationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLocations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListLocationsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListLocationsRequest list-locations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLocationsAsync list-locations-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.ListLocationsRequest list-locations-request]
    (-> this (.listLocationsAsync list-locations-request))))

(defn create-agent-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAgent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateAgentResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateAgentRequest create-agent-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAgentAsync create-agent-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.CreateAgentRequest create-agent-request]
    (-> this (.createAgentAsync create-agent-request))))

(defn tag-resource-async
  "Applies a key-value pair to an AWS resource.

  tag-resource-request - TagResourceRequest - `com.amazonaws.services.datasync.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsync this ^com.amazonaws.services.datasync.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

