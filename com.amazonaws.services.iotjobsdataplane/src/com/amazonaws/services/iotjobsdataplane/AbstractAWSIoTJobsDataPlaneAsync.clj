(ns com.amazonaws.services.iotjobsdataplane.AbstractAWSIoTJobsDataPlaneAsync
  "Abstract implementation of AWSIoTJobsDataPlaneAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotjobsdataplane AbstractAWSIoTJobsDataPlaneAsync]))

(defn describe-job-execution-async
  "Description copied from interface: AWSIoTJobsDataPlaneAsync

  request - `com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest request]
    (-> this (.describeJobExecutionAsync request))))

(defn get-pending-job-executions-async
  "Description copied from interface: AWSIoTJobsDataPlaneAsync

  request - `com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPendingJobExecutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPendingJobExecutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest request]
    (-> this (.getPendingJobExecutionsAsync request))))

(defn start-next-pending-job-execution-async
  "Description copied from interface: AWSIoTJobsDataPlaneAsync

  request - `com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartNextPendingJobExecution operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startNextPendingJobExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest request]
    (-> this (.startNextPendingJobExecutionAsync request))))

(defn update-job-execution-async
  "Description copied from interface: AWSIoTJobsDataPlaneAsync

  request - `com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIoTJobsDataPlaneAsync this ^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest request]
    (-> this (.updateJobExecutionAsync request))))

