(ns com.amazonaws.services.iotjobsdataplane.AbstractAWSIoTJobsDataPlane
  "Abstract implementation of AWSIoTJobsDataPlane. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotjobsdataplane AbstractAWSIoTJobsDataPlane]))

(defn describe-job-execution
  "Description copied from interface: AWSIoTJobsDataPlane

  request - `com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest`

  returns: Result of the DescribeJobExecution operation returned by the service. - `com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult`"
  (^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionResult [^AbstractAWSIoTJobsDataPlane this ^com.amazonaws.services.iotjobsdataplane.model.DescribeJobExecutionRequest request]
    (-> this (.describeJobExecution request))))

(defn get-pending-job-executions
  "Description copied from interface: AWSIoTJobsDataPlane

  request - `com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest`

  returns: Result of the GetPendingJobExecutions operation returned by the service. - `com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult`"
  (^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsResult [^AbstractAWSIoTJobsDataPlane this ^com.amazonaws.services.iotjobsdataplane.model.GetPendingJobExecutionsRequest request]
    (-> this (.getPendingJobExecutions request))))

(defn start-next-pending-job-execution
  "Description copied from interface: AWSIoTJobsDataPlane

  request - `com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest`

  returns: Result of the StartNextPendingJobExecution operation returned by the service. - `com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult`"
  (^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionResult [^AbstractAWSIoTJobsDataPlane this ^com.amazonaws.services.iotjobsdataplane.model.StartNextPendingJobExecutionRequest request]
    (-> this (.startNextPendingJobExecution request))))

(defn update-job-execution
  "Description copied from interface: AWSIoTJobsDataPlane

  request - `com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest`

  returns: Result of the UpdateJobExecution operation returned by the service. - `com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult`"
  (^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionResult [^AbstractAWSIoTJobsDataPlane this ^com.amazonaws.services.iotjobsdataplane.model.UpdateJobExecutionRequest request]
    (-> this (.updateJobExecution request))))

(defn shutdown
  "Description copied from interface: AWSIoTJobsDataPlane"
  ([^AbstractAWSIoTJobsDataPlane this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSIoTJobsDataPlane

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSIoTJobsDataPlane this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

