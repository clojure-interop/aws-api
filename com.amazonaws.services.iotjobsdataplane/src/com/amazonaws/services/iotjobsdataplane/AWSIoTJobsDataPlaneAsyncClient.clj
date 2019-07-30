(ns com.amazonaws.services.iotjobsdataplane.AWSIoTJobsDataPlaneAsyncClient
  "Client for accessing AWS IoT Jobs Data Plane asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  AWS IoT Jobs is a service that allows you to define a set of jobs — remote operations that are sent to and executed
  on one or more devices connected to AWS IoT. For example, you can define a job that instructs a set of devices to
  download and install application or firmware updates, reboot, rotate certificates, or perform remote troubleshooting
  operations.


  To create a job, you make a job document which is a description of the remote operations to be performed, and you
  specify a list of targets that should perform the operations. The targets can be individual things, thing groups or
  both.


  AWS IoT Jobs sends a message to inform the targets that a job is available. The target starts the execution of the
  job by downloading the job document, performing the operations it specifies, and reporting its progress to AWS IoT.
  The Jobs service provides commands to track the progress of a job on a specific target and for all the targets of the
  job"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotjobsdataplane AWSIoTJobsDataPlaneAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.iotjobsdataplane.AWSIoTJobsDataPlaneAsyncClientBuilder`"
  (^com.amazonaws.services.iotjobsdataplane.AWSIoTJobsDataPlaneAsyncClientBuilder []
    (AWSIoTJobsDataPlaneAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSIoTJobsDataPlaneAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-job-execution-async
  "Description copied from interface: AWSIoTJobsDataPlaneAsync

  request - `com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult>`"
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsyncClient this ^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsyncClient this ^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest request]
    (-> this (.describeJobExecutionAsync request))))

(defn get-pending-job-executions-async
  "Description copied from interface: AWSIoTJobsDataPlaneAsync

  request - `com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPendingJobExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsyncClient this ^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPendingJobExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsyncClient this ^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest request]
    (-> this (.getPendingJobExecutionsAsync request))))

(defn start-next-pending-job-execution-async
  "Description copied from interface: AWSIoTJobsDataPlaneAsync

  request - `com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartNextPendingJobExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult>`"
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsyncClient this ^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startNextPendingJobExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsyncClient this ^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest request]
    (-> this (.startNextPendingJobExecutionAsync request))))

(defn update-job-execution-async
  "Description copied from interface: AWSIoTJobsDataPlaneAsync

  request - `com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult>`"
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsyncClient this ^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsyncClient this ^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest request]
    (-> this (.updateJobExecutionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSIoTJobsDataPlaneAsyncClient this]
    (-> this (.shutdown))))

