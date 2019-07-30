(ns com.amazonaws.services.batch.AbstractAWSBatchAsync
  "Abstract implementation of AWSBatchAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.batch AbstractAWSBatchAsync]))

(defn list-jobs-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.ListJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn update-compute-environment-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComputeEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateComputeEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest request]
    (-> this (.updateComputeEnvironmentAsync request))))

(defn delete-job-queue-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DeleteJobQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJobQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DeleteJobQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DeleteJobQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DeleteJobQueueRequest request]
    (-> this (.deleteJobQueueAsync request))))

(defn describe-compute-environments-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComputeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComputeEnvironmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest request]
    (-> this (.describeComputeEnvironmentsAsync request))))

(defn create-job-queue-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.CreateJobQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJobQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.CreateJobQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.CreateJobQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.CreateJobQueueRequest request]
    (-> this (.createJobQueueAsync request))))

(defn delete-compute-environment-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteComputeEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteComputeEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest request]
    (-> this (.deleteComputeEnvironmentAsync request))))

(defn update-job-queue-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.UpdateJobQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.UpdateJobQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.UpdateJobQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.UpdateJobQueueRequest request]
    (-> this (.updateJobQueueAsync request))))

(defn cancel-job-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.CancelJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.CancelJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.CancelJobRequest request]
    (-> this (.cancelJobAsync request))))

(defn describe-job-queues-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DescribeJobQueuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeJobQueuesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobQueuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobQueuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobQueuesRequest request]
    (-> this (.describeJobQueuesAsync request))))

(defn terminate-job-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.TerminateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.TerminateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.TerminateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.TerminateJobRequest request]
    (-> this (.terminateJobAsync request))))

(defn describe-jobs-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DescribeJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobsRequest request]
    (-> this (.describeJobsAsync request))))

(defn describe-job-definitions-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeJobDefinitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest request]
    (-> this (.describeJobDefinitionsAsync request))))

(defn create-compute-environment-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComputeEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.CreateComputeEnvironmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createComputeEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest request]
    (-> this (.createComputeEnvironmentAsync request))))

(defn register-job-definition-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.RegisterJobDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterJobDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.RegisterJobDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.RegisterJobDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerJobDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.RegisterJobDefinitionRequest request]
    (-> this (.registerJobDefinitionAsync request))))

(defn deregister-job-definition-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterJobDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DeregisterJobDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterJobDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest request]
    (-> this (.deregisterJobDefinitionAsync request))))

(defn submit-job-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.SubmitJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubmitJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.SubmitJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.SubmitJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.submitJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSBatchAsync this ^com.amazonaws.services.batch.model.SubmitJobRequest request]
    (-> this (.submitJobAsync request))))

