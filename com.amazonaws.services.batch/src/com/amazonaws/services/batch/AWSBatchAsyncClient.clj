(ns com.amazonaws.services.batch.AWSBatchAsyncClient
  "Client for accessing AWS Batch asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.


  AWS Batch enables you to run batch computing workloads on the AWS Cloud. Batch computing is a common way for
  developers, scientists, and engineers to access large amounts of compute resources, and AWS Batch removes the
  undifferentiated heavy lifting of configuring and managing the required infrastructure. AWS Batch will be familiar to
  users of traditional batch computing software. This service can efficiently provision resources in response to jobs
  submitted in order to eliminate capacity constraints, reduce compute costs, and deliver results quickly.


  As a fully managed service, AWS Batch enables developers, scientists, and engineers to run batch computing workloads
  of any scale. AWS Batch automatically provisions compute resources and optimizes the workload distribution based on
  the quantity and scale of the workloads. With AWS Batch, there is no need to install or manage batch computing
  software, which allows you to focus on analyzing results and solving problems. AWS Batch reduces operational
  complexities, saves time, and reduces costs, which makes it easy for developers, scientists, and engineers to run
  their batch jobs in the AWS Cloud."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.batch AWSBatchAsyncClient]))

(defn ->aws-batch-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSBatchAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSBatchAsyncClient aws-credentials client-configuration executor-service))
  (^AWSBatchAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSBatchAsyncClient aws-credentials executor-service))
  (^AWSBatchAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSBatchAsyncClient client-configuration))
  (^AWSBatchAsyncClient []
    (new AWSBatchAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.batch.AWSBatchAsyncClientBuilder`"
  (^com.amazonaws.services.batch.AWSBatchAsyncClientBuilder []
    (AWSBatchAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSBatchAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-jobs-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.ListJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn update-compute-environment-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComputeEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateComputeEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest request]
    (-> this (.updateComputeEnvironmentAsync request))))

(defn delete-job-queue-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DeleteJobQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJobQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DeleteJobQueueResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DeleteJobQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DeleteJobQueueRequest request]
    (-> this (.deleteJobQueueAsync request))))

(defn describe-compute-environments-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComputeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComputeEnvironmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest request]
    (-> this (.describeComputeEnvironmentsAsync request))))

(defn create-job-queue-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.CreateJobQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJobQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.CreateJobQueueResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.CreateJobQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.CreateJobQueueRequest request]
    (-> this (.createJobQueueAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSBatchAsyncClient this]
    (-> this (.shutdown))))

(defn delete-compute-environment-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteComputeEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteComputeEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest request]
    (-> this (.deleteComputeEnvironmentAsync request))))

(defn update-job-queue-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.UpdateJobQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.UpdateJobQueueResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.UpdateJobQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.UpdateJobQueueRequest request]
    (-> this (.updateJobQueueAsync request))))

(defn cancel-job-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.CancelJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.CancelJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.CancelJobRequest request]
    (-> this (.cancelJobAsync request))))

(defn describe-job-queues-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DescribeJobQueuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeJobQueuesResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DescribeJobQueuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobQueuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DescribeJobQueuesRequest request]
    (-> this (.describeJobQueuesAsync request))))

(defn terminate-job-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.TerminateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.TerminateJobResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.TerminateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.TerminateJobRequest request]
    (-> this (.terminateJobAsync request))))

(defn describe-jobs-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DescribeJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeJobsResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DescribeJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DescribeJobsRequest request]
    (-> this (.describeJobsAsync request))))

(defn describe-job-definitions-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeJobDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest request]
    (-> this (.describeJobDefinitionsAsync request))))

(defn create-compute-environment-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComputeEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.CreateComputeEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createComputeEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest request]
    (-> this (.createComputeEnvironmentAsync request))))

(defn register-job-definition-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.RegisterJobDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterJobDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.RegisterJobDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.RegisterJobDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerJobDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.RegisterJobDefinitionRequest request]
    (-> this (.registerJobDefinitionAsync request))))

(defn deregister-job-definition-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterJobDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DeregisterJobDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterJobDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest request]
    (-> this (.deregisterJobDefinitionAsync request))))

(defn submit-job-async
  "Description copied from interface: AWSBatchAsync

  request - `com.amazonaws.services.batch.model.SubmitJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubmitJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.SubmitJobResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.SubmitJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.submitJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsyncClient this ^com.amazonaws.services.batch.model.SubmitJobRequest request]
    (-> this (.submitJobAsync request))))

