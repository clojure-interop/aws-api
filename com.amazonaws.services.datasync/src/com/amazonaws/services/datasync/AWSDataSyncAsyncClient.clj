(ns com.amazonaws.services.datasync.AWSDataSyncAsyncClient
  "Client for accessing DataSync asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  AWS DataSync

  AWS DataSync is a managed data transfer service that makes it simpler for you to automate moving data between
  on-premises storage and Amazon Simple Storage Service (Amazon S3) or Amazon Elastic File System (Amazon EFS).


  This API interface reference for AWS DataSync contains documentation for a programming interface that you can use to
  manage AWS DataSync."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.datasync AWSDataSyncAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.datasync.AWSDataSyncAsyncClientBuilder`"
  (^com.amazonaws.services.datasync.AWSDataSyncAsyncClientBuilder []
    (AWSDataSyncAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSDataSyncAsync

  request - UntagResourceRequest - `com.amazonaws.services.datasync.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn create-location-efs-async
  "Description copied from interface: AWSDataSyncAsync

  request - CreateLocationEfsRequest - `com.amazonaws.services.datasync.model.CreateLocationEfsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLocationEfs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateLocationEfsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateLocationEfsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLocationEfsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateLocationEfsRequest request]
    (-> this (.createLocationEfsAsync request))))

(defn describe-agent-async
  "Description copied from interface: AWSDataSyncAsync

  request - DescribeAgent - `com.amazonaws.services.datasync.model.DescribeAgentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAgent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeAgentResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeAgentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAgentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeAgentRequest request]
    (-> this (.describeAgentAsync request))))

(defn list-task-executions-async
  "Description copied from interface: AWSDataSyncAsync

  request - ListTaskExecutions - `com.amazonaws.services.datasync.model.ListTaskExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTaskExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListTaskExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListTaskExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTaskExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListTaskExecutionsRequest request]
    (-> this (.listTaskExecutionsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSDataSyncAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-agent-async
  "Description copied from interface: AWSDataSyncAsync

  request - UpdateAgentRequest - `com.amazonaws.services.datasync.model.UpdateAgentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAgent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.UpdateAgentResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.UpdateAgentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAgentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.UpdateAgentRequest request]
    (-> this (.updateAgentAsync request))))

(defn cancel-task-execution-async
  "Description copied from interface: AWSDataSyncAsync

  request - CancelTaskExecutionRequest - `com.amazonaws.services.datasync.model.CancelTaskExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelTaskExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CancelTaskExecutionResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CancelTaskExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelTaskExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CancelTaskExecutionRequest request]
    (-> this (.cancelTaskExecutionAsync request))))

(defn list-agents-async
  "Description copied from interface: AWSDataSyncAsync

  request - ListAgentsRequest - `com.amazonaws.services.datasync.model.ListAgentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAgents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListAgentsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListAgentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAgentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListAgentsRequest request]
    (-> this (.listAgentsAsync request))))

(defn delete-location-async
  "Description copied from interface: AWSDataSyncAsync

  request - DeleteLocation - `com.amazonaws.services.datasync.model.DeleteLocationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLocation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DeleteLocationResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DeleteLocationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLocationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DeleteLocationRequest request]
    (-> this (.deleteLocationAsync request))))

(defn describe-location-s-3-async
  "Description copied from interface: AWSDataSyncAsync

  request - DescribeLocationS3Request - `com.amazonaws.services.datasync.model.DescribeLocationS3Request`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLocationS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeLocationS3Result>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeLocationS3Request request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLocationS3Async request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeLocationS3Request request]
    (-> this (.describeLocationS3Async request))))

(defn list-tasks-async
  "Description copied from interface: AWSDataSyncAsync

  request - ListTasksRequest - `com.amazonaws.services.datasync.model.ListTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListTasksResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListTasksRequest request]
    (-> this (.listTasksAsync request))))

(defn start-task-execution-async
  "Description copied from interface: AWSDataSyncAsync

  request - StartTaskExecutionRequest - `com.amazonaws.services.datasync.model.StartTaskExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartTaskExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.StartTaskExecutionResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.StartTaskExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startTaskExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.StartTaskExecutionRequest request]
    (-> this (.startTaskExecutionAsync request))))

(defn delete-agent-async
  "Description copied from interface: AWSDataSyncAsync

  request - DeleteAgentRequest - `com.amazonaws.services.datasync.model.DeleteAgentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAgent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DeleteAgentResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DeleteAgentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAgentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DeleteAgentRequest request]
    (-> this (.deleteAgentAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSDataSyncAsyncClient this]
    (-> this (.shutdown))))

(defn describe-task-async
  "Description copied from interface: AWSDataSyncAsync

  request - DescribeTaskRequest - `com.amazonaws.services.datasync.model.DescribeTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeTaskResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeTaskRequest request]
    (-> this (.describeTaskAsync request))))

(defn create-location-nfs-async
  "Description copied from interface: AWSDataSyncAsync

  request - CreateLocationNfsRequest - `com.amazonaws.services.datasync.model.CreateLocationNfsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLocationNfs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateLocationNfsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateLocationNfsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLocationNfsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateLocationNfsRequest request]
    (-> this (.createLocationNfsAsync request))))

(defn describe-location-nfs-async
  "Description copied from interface: AWSDataSyncAsync

  request - DescribeLocationNfsRequest - `com.amazonaws.services.datasync.model.DescribeLocationNfsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLocationNfs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeLocationNfsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeLocationNfsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLocationNfsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeLocationNfsRequest request]
    (-> this (.describeLocationNfsAsync request))))

(defn describe-location-efs-async
  "Description copied from interface: AWSDataSyncAsync

  request - DescribeLocationEfsRequest - `com.amazonaws.services.datasync.model.DescribeLocationEfsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLocationEfs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeLocationEfsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeLocationEfsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLocationEfsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeLocationEfsRequest request]
    (-> this (.describeLocationEfsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSDataSyncAsync

  request - ListTagsForResourceRequest - `com.amazonaws.services.datasync.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn create-task-async
  "Description copied from interface: AWSDataSyncAsync

  request - CreateTaskRequest - `com.amazonaws.services.datasync.model.CreateTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateTaskResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateTaskRequest request]
    (-> this (.createTaskAsync request))))

(defn describe-task-execution-async
  "Description copied from interface: AWSDataSyncAsync

  request - DescribeTaskExecutionRequest - `com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTaskExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DescribeTaskExecutionResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTaskExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DescribeTaskExecutionRequest request]
    (-> this (.describeTaskExecutionAsync request))))

(defn create-location-s-3-async
  "Description copied from interface: AWSDataSyncAsync

  request - CreateLocationS3Request - `com.amazonaws.services.datasync.model.CreateLocationS3Request`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLocationS3 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateLocationS3Result>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateLocationS3Request request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLocationS3Async request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateLocationS3Request request]
    (-> this (.createLocationS3Async request))))

(defn update-task-async
  "Description copied from interface: AWSDataSyncAsync

  request - UpdateTaskResponse - `com.amazonaws.services.datasync.model.UpdateTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.UpdateTaskResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.UpdateTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.UpdateTaskRequest request]
    (-> this (.updateTaskAsync request))))

(defn delete-task-async
  "Description copied from interface: AWSDataSyncAsync

  request - DeleteTask - `com.amazonaws.services.datasync.model.DeleteTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.DeleteTaskResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DeleteTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.DeleteTaskRequest request]
    (-> this (.deleteTaskAsync request))))

(defn list-locations-async
  "Description copied from interface: AWSDataSyncAsync

  request - ListLocationsRequest - `com.amazonaws.services.datasync.model.ListLocationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLocations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.ListLocationsResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListLocationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLocationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.ListLocationsRequest request]
    (-> this (.listLocationsAsync request))))

(defn create-agent-async
  "Description copied from interface: AWSDataSyncAsync

  request - CreateAgentRequest - `com.amazonaws.services.datasync.model.CreateAgentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAgent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.CreateAgentResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateAgentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAgentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.CreateAgentRequest request]
    (-> this (.createAgentAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSDataSyncAsync

  request - TagResourceRequest - `com.amazonaws.services.datasync.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.datasync.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSDataSyncAsyncClient this ^com.amazonaws.services.datasync.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

