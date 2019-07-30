(ns com.amazonaws.services.s3control.AWSS3Control
  "Interface for accessing AWS S3 Control.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSS3Control instead.



  AWS S3 Control provides access to Amazon S3 control plane operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3control AWSS3Control]))

(defn describe-job
  "Retrieves the configuration parameters and status for a batch operations job.

  describe-job-request - `com.amazonaws.services.s3control.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.s3control.model.DescribeJobResult`

  throws: com.amazonaws.services.s3control.model.BadRequestException"
  (^com.amazonaws.services.s3control.model.DescribeJobResult [^AWSS3Control this ^com.amazonaws.services.s3control.model.DescribeJobRequest describe-job-request]
    (-> this (.describeJob describe-job-request))))

(defn put-public-access-block
  "put-public-access-block-request - `com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest`

  returns: Result of the PutPublicAccessBlock operation returned by the service. - `com.amazonaws.services.s3control.model.PutPublicAccessBlockResult`"
  (^com.amazonaws.services.s3control.model.PutPublicAccessBlockResult [^AWSS3Control this ^com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest put-public-access-block-request]
    (-> this (.putPublicAccessBlock put-public-access-block-request))))

(defn delete-public-access-block
  "Deletes the block public access configuration for the specified account.

  delete-public-access-block-request - `com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest`

  returns: Result of the DeletePublicAccessBlock operation returned by the service. - `com.amazonaws.services.s3control.model.DeletePublicAccessBlockResult`"
  (^com.amazonaws.services.s3control.model.DeletePublicAccessBlockResult [^AWSS3Control this ^com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest delete-public-access-block-request]
    (-> this (.deletePublicAccessBlock delete-public-access-block-request))))

(defn get-public-access-block
  "get-public-access-block-request - `com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest`

  returns: Result of the GetPublicAccessBlock operation returned by the service. - `com.amazonaws.services.s3control.model.GetPublicAccessBlockResult`

  throws: com.amazonaws.services.s3control.model.NoSuchPublicAccessBlockConfigurationException"
  (^com.amazonaws.services.s3control.model.GetPublicAccessBlockResult [^AWSS3Control this ^com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest get-public-access-block-request]
    (-> this (.getPublicAccessBlock get-public-access-block-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSS3Control this]
    (-> this (.shutdown))))

(defn list-jobs
  "Lists current jobs and jobs that have ended within the last 30 days for the AWS account making the request.

  list-jobs-request - `com.amazonaws.services.s3control.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.s3control.model.ListJobsResult`

  throws: com.amazonaws.services.s3control.model.InvalidRequestException"
  (^com.amazonaws.services.s3control.model.ListJobsResult [^AWSS3Control this ^com.amazonaws.services.s3control.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobs list-jobs-request))))

(defn update-job-priority
  "Updates an existing job's priority.

  update-job-priority-request - `com.amazonaws.services.s3control.model.UpdateJobPriorityRequest`

  returns: Result of the UpdateJobPriority operation returned by the service. - `com.amazonaws.services.s3control.model.UpdateJobPriorityResult`

  throws: com.amazonaws.services.s3control.model.BadRequestException"
  (^com.amazonaws.services.s3control.model.UpdateJobPriorityResult [^AWSS3Control this ^com.amazonaws.services.s3control.model.UpdateJobPriorityRequest update-job-priority-request]
    (-> this (.updateJobPriority update-job-priority-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.services.s3control.S3ControlResponseMetadata`"
  (^com.amazonaws.services.s3control.S3ControlResponseMetadata [^AWSS3Control this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "Creates an Amazon S3 batch operations job.

  create-job-request - `com.amazonaws.services.s3control.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.s3control.model.CreateJobResult`

  throws: com.amazonaws.services.s3control.model.TooManyRequestsException"
  (^com.amazonaws.services.s3control.model.CreateJobResult [^AWSS3Control this ^com.amazonaws.services.s3control.model.CreateJobRequest create-job-request]
    (-> this (.createJob create-job-request))))

(defn update-job-status
  "Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel
   an existing job.

  update-job-status-request - `com.amazonaws.services.s3control.model.UpdateJobStatusRequest`

  returns: Result of the UpdateJobStatus operation returned by the service. - `com.amazonaws.services.s3control.model.UpdateJobStatusResult`

  throws: com.amazonaws.services.s3control.model.BadRequestException"
  (^com.amazonaws.services.s3control.model.UpdateJobStatusResult [^AWSS3Control this ^com.amazonaws.services.s3control.model.UpdateJobStatusRequest update-job-status-request]
    (-> this (.updateJobStatus update-job-status-request))))

