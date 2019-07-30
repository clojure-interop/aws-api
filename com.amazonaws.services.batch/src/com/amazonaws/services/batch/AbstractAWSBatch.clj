(ns com.amazonaws.services.batch.AbstractAWSBatch
  "Abstract implementation of AWSBatch. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.batch AbstractAWSBatch]))

(defn delete-compute-environment
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest`

  returns: Result of the DeleteComputeEnvironment operation returned by the service. - `com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult`"
  (^com.amazonaws.services.batch.model.DeleteComputeEnvironmentResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.DeleteComputeEnvironmentRequest request]
    (-> this (.deleteComputeEnvironment request))))

(defn set-region
  "Description copied from interface: AWSBatch

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSBatch this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-compute-environment
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest`

  returns: Result of the UpdateComputeEnvironment operation returned by the service. - `com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult`"
  (^com.amazonaws.services.batch.model.UpdateComputeEnvironmentResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.UpdateComputeEnvironmentRequest request]
    (-> this (.updateComputeEnvironment request))))

(defn submit-job
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.SubmitJobRequest`

  returns: Result of the SubmitJob operation returned by the service. - `com.amazonaws.services.batch.model.SubmitJobResult`"
  (^com.amazonaws.services.batch.model.SubmitJobResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.SubmitJobRequest request]
    (-> this (.submitJob request))))

(defn describe-job-definitions
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest`

  returns: Result of the DescribeJobDefinitions operation returned by the service. - `com.amazonaws.services.batch.model.DescribeJobDefinitionsResult`"
  (^com.amazonaws.services.batch.model.DescribeJobDefinitionsResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.DescribeJobDefinitionsRequest request]
    (-> this (.describeJobDefinitions request))))

(defn create-compute-environment
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest`

  returns: Result of the CreateComputeEnvironment operation returned by the service. - `com.amazonaws.services.batch.model.CreateComputeEnvironmentResult`"
  (^com.amazonaws.services.batch.model.CreateComputeEnvironmentResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.CreateComputeEnvironmentRequest request]
    (-> this (.createComputeEnvironment request))))

(defn deregister-job-definition
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest`

  returns: Result of the DeregisterJobDefinition operation returned by the service. - `com.amazonaws.services.batch.model.DeregisterJobDefinitionResult`"
  (^com.amazonaws.services.batch.model.DeregisterJobDefinitionResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.DeregisterJobDefinitionRequest request]
    (-> this (.deregisterJobDefinition request))))

(defn shutdown
  "Description copied from interface: AWSBatch"
  ([^AbstractAWSBatch this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AWSBatch

  endpoint - The endpoint (ex: \"batch.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"batch.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSBatch this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn cancel-job
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.batch.model.CancelJobResult`"
  (^com.amazonaws.services.batch.model.CancelJobResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn describe-compute-environments
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest`

  returns: Result of the DescribeComputeEnvironments operation returned by the service. - `com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult`"
  (^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.DescribeComputeEnvironmentsRequest request]
    (-> this (.describeComputeEnvironments request))))

(defn register-job-definition
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.RegisterJobDefinitionRequest`

  returns: Result of the RegisterJobDefinition operation returned by the service. - `com.amazonaws.services.batch.model.RegisterJobDefinitionResult`"
  (^com.amazonaws.services.batch.model.RegisterJobDefinitionResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.RegisterJobDefinitionRequest request]
    (-> this (.registerJobDefinition request))))

(defn list-jobs
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.batch.model.ListJobsResult`"
  (^com.amazonaws.services.batch.model.ListJobsResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn update-job-queue
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.UpdateJobQueueRequest`

  returns: Result of the UpdateJobQueue operation returned by the service. - `com.amazonaws.services.batch.model.UpdateJobQueueResult`"
  (^com.amazonaws.services.batch.model.UpdateJobQueueResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.UpdateJobQueueRequest request]
    (-> this (.updateJobQueue request))))

(defn delete-job-queue
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.DeleteJobQueueRequest`

  returns: Result of the DeleteJobQueue operation returned by the service. - `com.amazonaws.services.batch.model.DeleteJobQueueResult`"
  (^com.amazonaws.services.batch.model.DeleteJobQueueResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.DeleteJobQueueRequest request]
    (-> this (.deleteJobQueue request))))

(defn describe-jobs
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.DescribeJobsRequest`

  returns: Result of the DescribeJobs operation returned by the service. - `com.amazonaws.services.batch.model.DescribeJobsResult`"
  (^com.amazonaws.services.batch.model.DescribeJobsResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.DescribeJobsRequest request]
    (-> this (.describeJobs request))))

(defn terminate-job
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.TerminateJobRequest`

  returns: Result of the TerminateJob operation returned by the service. - `com.amazonaws.services.batch.model.TerminateJobResult`"
  (^com.amazonaws.services.batch.model.TerminateJobResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.TerminateJobRequest request]
    (-> this (.terminateJob request))))

(defn describe-job-queues
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.DescribeJobQueuesRequest`

  returns: Result of the DescribeJobQueues operation returned by the service. - `com.amazonaws.services.batch.model.DescribeJobQueuesResult`"
  (^com.amazonaws.services.batch.model.DescribeJobQueuesResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.DescribeJobQueuesRequest request]
    (-> this (.describeJobQueues request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSBatch

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSBatch this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job-queue
  "Description copied from interface: AWSBatch

  request - `com.amazonaws.services.batch.model.CreateJobQueueRequest`

  returns: Result of the CreateJobQueue operation returned by the service. - `com.amazonaws.services.batch.model.CreateJobQueueResult`"
  (^com.amazonaws.services.batch.model.CreateJobQueueResult [^AbstractAWSBatch this ^com.amazonaws.services.batch.model.CreateJobQueueRequest request]
    (-> this (.createJobQueue request))))

