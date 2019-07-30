(ns com.amazonaws.services.stepfunctions.AWSStepFunctionsAsyncClient
  "Client for accessing AWS SFN asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

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
  (:import [com.amazonaws.services.stepfunctions AWSStepFunctionsAsyncClient]))

(defn ->aws-step-functions-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSStepFunctionsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSStepFunctionsAsyncClient aws-credentials client-configuration executor-service))
  (^AWSStepFunctionsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSStepFunctionsAsyncClient aws-credentials executor-service))
  (^AWSStepFunctionsAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSStepFunctionsAsyncClient client-configuration))
  (^AWSStepFunctionsAsyncClient []
    (new AWSStepFunctionsAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.stepfunctions.AWSStepFunctionsAsyncClientBuilder`"
  (^com.amazonaws.services.stepfunctions.AWSStepFunctionsAsyncClientBuilder []
    (AWSStepFunctionsAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSStepFunctionsAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-state-machine-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.UpdateStateMachineResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStateMachineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.UpdateStateMachineRequest request]
    (-> this (.updateStateMachineAsync request))))

(defn describe-activity-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DescribeActivityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeActivityResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DescribeActivityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActivityAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DescribeActivityRequest request]
    (-> this (.describeActivityAsync request))))

(defn create-state-machine-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.CreateStateMachineResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStateMachineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.CreateStateMachineRequest request]
    (-> this (.createStateMachineAsync request))))

(defn list-activities-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.ListActivitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListActivitiesResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.ListActivitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActivitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.ListActivitiesRequest request]
    (-> this (.listActivitiesAsync request))))

(defn get-execution-history-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExecutionHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.GetExecutionHistoryResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExecutionHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.GetExecutionHistoryRequest request]
    (-> this (.getExecutionHistoryAsync request))))

(defn describe-execution-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeExecutionResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DescribeExecutionRequest request]
    (-> this (.describeExecutionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSStepFunctionsAsyncClient this]
    (-> this (.shutdown))))

(defn send-task-heartbeat-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTaskHeartbeat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTaskHeartbeatAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.SendTaskHeartbeatRequest request]
    (-> this (.sendTaskHeartbeatAsync request))))

(defn create-activity-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.CreateActivityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.CreateActivityResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.CreateActivityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createActivityAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.CreateActivityRequest request]
    (-> this (.createActivityAsync request))))

(defn send-task-success-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTaskSuccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.SendTaskSuccessResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTaskSuccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest request]
    (-> this (.sendTaskSuccessAsync request))))

(defn list-executions-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.ListExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.ListExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.ListExecutionsRequest request]
    (-> this (.listExecutionsAsync request))))

(defn start-execution-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.StartExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.StartExecutionResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.StartExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.StartExecutionRequest request]
    (-> this (.startExecutionAsync request))))

(defn get-activity-task-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetActivityTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.GetActivityTaskResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getActivityTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest request]
    (-> this (.getActivityTaskAsync request))))

(defn send-task-failure-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTaskFailure operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.SendTaskFailureResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTaskFailureAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest request]
    (-> this (.sendTaskFailureAsync request))))

(defn delete-activity-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DeleteActivityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DeleteActivityResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DeleteActivityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteActivityAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DeleteActivityRequest request]
    (-> this (.deleteActivityAsync request))))

(defn describe-state-machine-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeStateMachineResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStateMachineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineRequest request]
    (-> this (.describeStateMachineAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn stop-execution-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.StopExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.StopExecutionResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.StopExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.StopExecutionRequest request]
    (-> this (.stopExecutionAsync request))))

(defn delete-state-machine-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStateMachine operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DeleteStateMachineResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStateMachineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DeleteStateMachineRequest request]
    (-> this (.deleteStateMachineAsync request))))

(defn describe-state-machine-for-execution-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStateMachineForExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStateMachineForExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.DescribeStateMachineForExecutionRequest request]
    (-> this (.describeStateMachineForExecutionAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn list-state-machines-async
  "Description copied from interface: AWSStepFunctionsAsync

  request - `com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStateMachines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.stepfunctions.model.ListStateMachinesResult>`"
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStateMachinesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStepFunctionsAsyncClient this ^com.amazonaws.services.stepfunctions.model.ListStateMachinesRequest request]
    (-> this (.listStateMachinesAsync request))))

