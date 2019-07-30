(ns com.amazonaws.services.batch.AWSBatchAsync
  "Interface for accessing AWS Batch asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSBatchAsync instead.



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
  (:import [com.amazonaws.services.batch AWSBatchAsync]))

(defn list-jobs-async
  "Returns a list of AWS Batch jobs.


   You must specify only one of the following:




   a job queue ID to return a list of jobs in that job queue




   a multi-node parallel job ID to return a list of that job's nodes




   an array job ID to return a list of that job's children




   You can filter the results by job status with the jobStatus parameter. If you do not specify a
   status, only RUNNING jobs are returned.

  list-jobs-request - `com.amazonaws.services.batch.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.ListJobsRequest list-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync list-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobsAsync list-jobs-request))))

(defn update-compute-environment-async
  "Updates an AWS Batch compute environment.

  update-compute-environment-request - `com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateComputeEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest update-compute-environment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateComputeEnvironmentAsync update-compute-environment-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest update-compute-environment-request]
    (-> this (.updateComputeEnvironmentAsync update-compute-environment-request))))

(defn delete-job-queue-async
  "Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue
   operation. All jobs in the queue are terminated when you delete a job queue.


   It is not necessary to disassociate compute environments from a queue before submitting a
   DeleteJobQueue request.

  delete-job-queue-request - `com.amazonaws.services.batch.model.DeleteJobQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJobQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DeleteJobQueueResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DeleteJobQueueRequest delete-job-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobQueueAsync delete-job-queue-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DeleteJobQueueRequest delete-job-queue-request]
    (-> this (.deleteJobQueueAsync delete-job-queue-request))))

(defn describe-compute-environments-async
  "Describes one or more of your compute environments.


   If you are using an unmanaged compute environment, you can use the DescribeComputeEnvironment
   operation to determine the ecsClusterArn that you should launch your Amazon ECS container instances
   into.

  describe-compute-environments-request - `com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComputeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest describe-compute-environments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComputeEnvironmentsAsync describe-compute-environments-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest describe-compute-environments-request]
    (-> this (.describeComputeEnvironmentsAsync describe-compute-environments-request))))

(defn create-job-queue-async
  "Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to
   the queue and assign an order of preference for the compute environments.


   You also set a priority to the job queue that determines the order in which the AWS Batch scheduler places jobs
   onto its associated compute environments. For example, if a compute environment is associated with more than one
   job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute
   environment.

  create-job-queue-request - `com.amazonaws.services.batch.model.CreateJobQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJobQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.CreateJobQueueResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.CreateJobQueueRequest create-job-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobQueueAsync create-job-queue-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.CreateJobQueueRequest create-job-queue-request]
    (-> this (.createJobQueueAsync create-job-queue-request))))

(defn delete-compute-environment-async
  "Deletes an AWS Batch compute environment.


   Before you can delete a compute environment, you must set its state to DISABLED with the
   UpdateComputeEnvironment API operation and disassociate it from any job queues with the
   UpdateJobQueue API operation.

  delete-compute-environment-request - `com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteComputeEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest delete-compute-environment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteComputeEnvironmentAsync delete-compute-environment-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest delete-compute-environment-request]
    (-> this (.deleteComputeEnvironmentAsync delete-compute-environment-request))))

(defn update-job-queue-async
  "Updates a job queue.

  update-job-queue-request - `com.amazonaws.services.batch.model.UpdateJobQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.UpdateJobQueueResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.UpdateJobQueueRequest update-job-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobQueueAsync update-job-queue-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.UpdateJobQueueRequest update-job-queue-request]
    (-> this (.updateJobQueueAsync update-job-queue-request))))

(defn cancel-job-async
  "Cancels a job in an AWS Batch job queue. Jobs that are in the SUBMITTED, PENDING, or
   RUNNABLE state are cancelled. Jobs that have progressed to STARTING or
   RUNNING are not cancelled (but the API operation still succeeds, even if no job is cancelled); these
   jobs must be terminated with the TerminateJob operation.

  cancel-job-request - `com.amazonaws.services.batch.model.CancelJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.CancelJobRequest cancel-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync cancel-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJobAsync cancel-job-request))))

(defn describe-job-queues-async
  "Describes one or more of your job queues.

  describe-job-queues-request - `com.amazonaws.services.batch.model.DescribeJobQueuesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeJobQueuesResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobQueuesRequest describe-job-queues-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobQueuesAsync describe-job-queues-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobQueuesRequest describe-job-queues-request]
    (-> this (.describeJobQueuesAsync describe-job-queues-request))))

(defn terminate-job-async
  "Terminates a job in a job queue. Jobs that are in the STARTING or RUNNING state are
   terminated, which causes them to transition to FAILED. Jobs that have not progressed to the
   STARTING state are cancelled.

  terminate-job-request - `com.amazonaws.services.batch.model.TerminateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.TerminateJobResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.TerminateJobRequest terminate-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateJobAsync terminate-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.TerminateJobRequest terminate-job-request]
    (-> this (.terminateJobAsync terminate-job-request))))

(defn describe-jobs-async
  "Describes a list of AWS Batch jobs.

  describe-jobs-request - `com.amazonaws.services.batch.model.DescribeJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeJobsResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobsRequest describe-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobsAsync describe-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobsRequest describe-jobs-request]
    (-> this (.describeJobsAsync describe-jobs-request))))

(defn describe-job-definitions-async
  "Describes a list of job definitions. You can specify a status (such as ACTIVE) to only
   return job definitions that match that status.

  describe-job-definitions-request - `com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DescribeJobDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest describe-job-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobDefinitionsAsync describe-job-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest describe-job-definitions-request]
    (-> this (.describeJobDefinitionsAsync describe-job-definitions-request))))

(defn create-compute-environment-async
  "Creates an AWS Batch compute environment. You can create MANAGED or UNMANAGED compute
   environments.


   In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources
   within the environment. This is based on the compute resource specification that you define or the launch template that you
   specify when you create the compute environment. You can choose to use Amazon EC2 On-Demand Instances or Spot
   Instances in your managed compute environment. You can optionally set a maximum price so that Spot Instances only
   launch when the Spot Instance price is below a specified percentage of the On-Demand price.



   Multi-node parallel jobs are not supported on Spot Instances.



   In an unmanaged compute environment, you can manage your own compute resources. This provides more compute
   resource configuration options, such as using a custom AMI, but you must ensure that your AMI meets the Amazon
   ECS container instance AMI specification. For more information, see Container
   Instance AMIs in the Amazon Elastic Container Service Developer Guide. After you have created your
   unmanaged compute environment, you can use the DescribeComputeEnvironments operation to find the Amazon
   ECS cluster that is associated with it. Then, manually launch your container instances into that Amazon ECS
   cluster. For more information, see Launching an
   Amazon ECS Container Instance in the Amazon Elastic Container Service Developer Guide.



   AWS Batch does not upgrade the AMIs in a compute environment after it is created (for example, when a newer
   version of the Amazon ECS-optimized AMI is available). You are responsible for the management of the guest
   operating system (including updates and security patches) and any additional application software or utilities
   that you install on the compute resources. To use a new AMI for your AWS Batch jobs:




   Create a new compute environment with the new AMI.




   Add the compute environment to an existing job queue.




   Remove the old compute environment from your job queue.




   Delete the old compute environment.

  create-compute-environment-request - `com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComputeEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.CreateComputeEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest create-compute-environment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createComputeEnvironmentAsync create-compute-environment-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest create-compute-environment-request]
    (-> this (.createComputeEnvironmentAsync create-compute-environment-request))))

(defn register-job-definition-async
  "Registers an AWS Batch job definition.

  register-job-definition-request - `com.amazonaws.services.batch.model.RegisterJobDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterJobDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.RegisterJobDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.RegisterJobDefinitionRequest register-job-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerJobDefinitionAsync register-job-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.RegisterJobDefinitionRequest register-job-definition-request]
    (-> this (.registerJobDefinitionAsync register-job-definition-request))))

(defn deregister-job-definition-async
  "Deregisters an AWS Batch job definition.

  deregister-job-definition-request - `com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterJobDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.DeregisterJobDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest deregister-job-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterJobDefinitionAsync deregister-job-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest deregister-job-definition-request]
    (-> this (.deregisterJobDefinitionAsync deregister-job-definition-request))))

(defn submit-job-async
  "Submits an AWS Batch job from a job definition. Parameters specified during SubmitJob override parameters
   defined in the job definition.

  submit-job-request - `com.amazonaws.services.batch.model.SubmitJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubmitJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.batch.model.SubmitJobResult>`"
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.SubmitJobRequest submit-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.submitJobAsync submit-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSBatchAsync this ^com.amazonaws.services.batch.model.SubmitJobRequest submit-job-request]
    (-> this (.submitJobAsync submit-job-request))))

