(ns com.amazonaws.services.iotjobsdataplane.AWSIoTJobsDataPlaneAsync
  "Interface for accessing AWS IoT Jobs Data Plane asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoTJobsDataPlaneAsync instead.



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
  (:import [com.amazonaws.services.iotjobsdataplane AWSIoTJobsDataPlaneAsync]))

(defn describe-job-execution-async
  "Gets details of a job execution.

  describe-job-execution-request - `com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult>`"
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest describe-job-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobExecutionAsync describe-job-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest describe-job-execution-request]
    (-> this (.describeJobExecutionAsync describe-job-execution-request))))

(defn get-pending-job-executions-async
  "Gets the list of all jobs for a thing that are not in a terminal status.

  get-pending-job-executions-request - `com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPendingJobExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest get-pending-job-executions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPendingJobExecutionsAsync get-pending-job-executions-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest get-pending-job-executions-request]
    (-> this (.getPendingJobExecutionsAsync get-pending-job-executions-request))))

(defn start-next-pending-job-execution-async
  "Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.

  start-next-pending-job-execution-request - `com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartNextPendingJobExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult>`"
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest start-next-pending-job-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startNextPendingJobExecutionAsync start-next-pending-job-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest start-next-pending-job-execution-request]
    (-> this (.startNextPendingJobExecutionAsync start-next-pending-job-execution-request))))

(defn update-job-execution-async
  "Updates the status of a job execution.

  update-job-execution-request - `com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult>`"
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest update-job-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobExecutionAsync update-job-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest update-job-execution-request]
    (-> this (.updateJobExecutionAsync update-job-execution-request))))

