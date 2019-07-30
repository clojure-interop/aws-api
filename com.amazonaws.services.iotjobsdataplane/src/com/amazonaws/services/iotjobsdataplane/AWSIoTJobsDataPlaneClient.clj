(ns com.amazonaws.services.iotjobsdataplane.AWSIoTJobsDataPlaneClient
  "Client for accessing AWS IoT Jobs Data Plane. All service calls made using this client are blocking, and will not
  return until the service call completes.


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
  (:import [com.amazonaws.services.iotjobsdataplane AWSIoTJobsDataPlaneClient]))

(defn *builder
  "returns: `com.amazonaws.services.iotjobsdataplane.AWSIoTJobsDataPlaneClientBuilder`"
  (^com.amazonaws.services.iotjobsdataplane.AWSIoTJobsDataPlaneClientBuilder []
    (AWSIoTJobsDataPlaneClient/builder )))

(defn describe-job-execution
  "Gets details of a job execution.

  request - `com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest`

  returns: Result of the DescribeJobExecution operation returned by the service. - `com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult`

  throws: com.amazonaws.services.iotjobsdataplane.model.InvalidRequestException - The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution request contains invalid status details. The message contains details about the error."
  (^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult [^AWSIoTJobsDataPlaneClient this ^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest request]
    (-> this (.describeJobExecution request))))

(defn get-pending-job-executions
  "Gets the list of all jobs for a thing that are not in a terminal status.

  request - `com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest`

  returns: Result of the GetPendingJobExecutions operation returned by the service. - `com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult`

  throws: com.amazonaws.services.iotjobsdataplane.model.InvalidRequestException - The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution request contains invalid status details. The message contains details about the error."
  (^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult [^AWSIoTJobsDataPlaneClient this ^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest request]
    (-> this (.getPendingJobExecutions request))))

(defn start-next-pending-job-execution
  "Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.

  request - `com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest`

  returns: Result of the StartNextPendingJobExecution operation returned by the service. - `com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult`

  throws: com.amazonaws.services.iotjobsdataplane.model.InvalidRequestException - The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution request contains invalid status details. The message contains details about the error."
  (^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult [^AWSIoTJobsDataPlaneClient this ^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest request]
    (-> this (.startNextPendingJobExecution request))))

(defn update-job-execution
  "Updates the status of a job execution.

  request - `com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest`

  returns: Result of the UpdateJobExecution operation returned by the service. - `com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult`

  throws: com.amazonaws.services.iotjobsdataplane.model.InvalidRequestException - The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution request contains invalid status details. The message contains details about the error."
  (^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult [^AWSIoTJobsDataPlaneClient this ^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest request]
    (-> this (.updateJobExecution request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoTJobsDataPlaneClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

