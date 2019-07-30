(ns com.amazonaws.services.batch.AWSBatchClient
  "Client for accessing AWS Batch. All service calls made using this client are blocking, and will not return until the
  service call completes.


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
  (:import [com.amazonaws.services.batch AWSBatchClient]))

(defn ->aws-batch-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Batch (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSBatchClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSBatchClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSBatchClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSBatchClient aws-credentials client-configuration))
  (^AWSBatchClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSBatchClient client-configuration))
  (^AWSBatchClient []
    (new AWSBatchClient )))

(defn *builder
  "returns: `com.amazonaws.services.batch.AWSBatchClientBuilder`"
  (^com.amazonaws.services.batch.AWSBatchClientBuilder []
    (AWSBatchClient/builder )))

(defn delete-compute-environment
  "Deletes an AWS Batch compute environment.


   Before you can delete a compute environment, you must set its state to DISABLED with the
   UpdateComputeEnvironment API operation and disassociate it from any job queues with the
   UpdateJobQueue API operation.

  request - `com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest`

  returns: Result of the DeleteComputeEnvironment operation returned by the service. - `com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest request]
    (-> this (.deleteComputeEnvironment request))))

(defn update-compute-environment
  "Updates an AWS Batch compute environment.

  request - `com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest`

  returns: Result of the UpdateComputeEnvironment operation returned by the service. - `com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest request]
    (-> this (.updateComputeEnvironment request))))

(defn submit-job
  "Submits an AWS Batch job from a job definition. Parameters specified during SubmitJob override parameters
   defined in the job definition.

  request - `com.amazonaws.services.batch.model.SubmitJobRequest`

  returns: Result of the SubmitJob operation returned by the service. - `com.amazonaws.services.batch.model.SubmitJobResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.SubmitJobResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.SubmitJobRequest request]
    (-> this (.submitJob request))))

(defn describe-job-definitions
  "Describes a list of job definitions. You can specify a status (such as ACTIVE) to only
   return job definitions that match that status.

  request - `com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest`

  returns: Result of the DescribeJobDefinitions operation returned by the service. - `com.amazonaws.services.batch.model.DescribeJobDefinitionsResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.DescribeJobDefinitionsResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest request]
    (-> this (.describeJobDefinitions request))))

(defn create-compute-environment
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

  request - `com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest`

  returns: Result of the CreateComputeEnvironment operation returned by the service. - `com.amazonaws.services.batch.model.CreateComputeEnvironmentResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.CreateComputeEnvironmentResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest request]
    (-> this (.createComputeEnvironment request))))

(defn deregister-job-definition
  "Deregisters an AWS Batch job definition.

  request - `com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest`

  returns: Result of the DeregisterJobDefinition operation returned by the service. - `com.amazonaws.services.batch.model.DeregisterJobDefinitionResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.DeregisterJobDefinitionResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest request]
    (-> this (.deregisterJobDefinition request))))

(defn cancel-job
  "Cancels a job in an AWS Batch job queue. Jobs that are in the SUBMITTED, PENDING, or
   RUNNABLE state are cancelled. Jobs that have progressed to STARTING or
   RUNNING are not cancelled (but the API operation still succeeds, even if no job is cancelled); these
   jobs must be terminated with the TerminateJob operation.

  request - `com.amazonaws.services.batch.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.batch.model.CancelJobResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.CancelJobResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn describe-compute-environments
  "Describes one or more of your compute environments.


   If you are using an unmanaged compute environment, you can use the DescribeComputeEnvironment
   operation to determine the ecsClusterArn that you should launch your Amazon ECS container instances
   into.

  request - `com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest`

  returns: Result of the DescribeComputeEnvironments operation returned by the service. - `com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest request]
    (-> this (.describeComputeEnvironments request))))

(defn register-job-definition
  "Registers an AWS Batch job definition.

  request - `com.amazonaws.services.batch.model.RegisterJobDefinitionRequest`

  returns: Result of the RegisterJobDefinition operation returned by the service. - `com.amazonaws.services.batch.model.RegisterJobDefinitionResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.RegisterJobDefinitionResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.RegisterJobDefinitionRequest request]
    (-> this (.registerJobDefinition request))))

(defn list-jobs
  "Returns a list of AWS Batch jobs.


   You must specify only one of the following:




   a job queue ID to return a list of jobs in that job queue




   a multi-node parallel job ID to return a list of that job's nodes




   an array job ID to return a list of that job's children




   You can filter the results by job status with the jobStatus parameter. If you do not specify a
   status, only RUNNING jobs are returned.

  request - `com.amazonaws.services.batch.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.batch.model.ListJobsResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.ListJobsResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn update-job-queue
  "Updates a job queue.

  request - `com.amazonaws.services.batch.model.UpdateJobQueueRequest`

  returns: Result of the UpdateJobQueue operation returned by the service. - `com.amazonaws.services.batch.model.UpdateJobQueueResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.UpdateJobQueueResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.UpdateJobQueueRequest request]
    (-> this (.updateJobQueue request))))

(defn delete-job-queue
  "Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue
   operation. All jobs in the queue are terminated when you delete a job queue.


   It is not necessary to disassociate compute environments from a queue before submitting a
   DeleteJobQueue request.

  request - `com.amazonaws.services.batch.model.DeleteJobQueueRequest`

  returns: Result of the DeleteJobQueue operation returned by the service. - `com.amazonaws.services.batch.model.DeleteJobQueueResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.DeleteJobQueueResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.DeleteJobQueueRequest request]
    (-> this (.deleteJobQueue request))))

(defn describe-jobs
  "Describes a list of AWS Batch jobs.

  request - `com.amazonaws.services.batch.model.DescribeJobsRequest`

  returns: Result of the DescribeJobs operation returned by the service. - `com.amazonaws.services.batch.model.DescribeJobsResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.DescribeJobsResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.DescribeJobsRequest request]
    (-> this (.describeJobs request))))

(defn terminate-job
  "Terminates a job in a job queue. Jobs that are in the STARTING or RUNNING state are
   terminated, which causes them to transition to FAILED. Jobs that have not progressed to the
   STARTING state are cancelled.

  request - `com.amazonaws.services.batch.model.TerminateJobRequest`

  returns: Result of the TerminateJob operation returned by the service. - `com.amazonaws.services.batch.model.TerminateJobResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.TerminateJobResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.TerminateJobRequest request]
    (-> this (.terminateJob request))))

(defn describe-job-queues
  "Describes one or more of your job queues.

  request - `com.amazonaws.services.batch.model.DescribeJobQueuesRequest`

  returns: Result of the DescribeJobQueues operation returned by the service. - `com.amazonaws.services.batch.model.DescribeJobQueuesResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.DescribeJobQueuesResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.DescribeJobQueuesRequest request]
    (-> this (.describeJobQueues request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSBatchClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job-queue
  "Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to
   the queue and assign an order of preference for the compute environments.


   You also set a priority to the job queue that determines the order in which the AWS Batch scheduler places jobs
   onto its associated compute environments. For example, if a compute environment is associated with more than one
   job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute
   environment.

  request - `com.amazonaws.services.batch.model.CreateJobQueueRequest`

  returns: Result of the CreateJobQueue operation returned by the service. - `com.amazonaws.services.batch.model.CreateJobQueueResult`

  throws: com.amazonaws.services.batch.model.ClientException - These errors are usually caused by a client action, such as using an action or resource on behalf of a user that doesn't have permissions to use the action or resource, or specifying an identifier that is not valid."
  (^com.amazonaws.services.batch.model.CreateJobQueueResult [^AWSBatchClient this ^com.amazonaws.services.batch.model.CreateJobQueueRequest request]
    (-> this (.createJobQueue request))))

