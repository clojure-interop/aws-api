(ns com.amazonaws.services.s3control.AWSS3ControlClient
  "Client for accessing AWS S3 Control. All service calls made using this client are blocking, and will not return until
  the service call completes.


  AWS S3 Control provides access to Amazon S3 control plane operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3control AWSS3ControlClient]))

(defn *builder
  "returns: `com.amazonaws.services.s3control.AWSS3ControlClientBuilder`"
  (^com.amazonaws.services.s3control.AWSS3ControlClientBuilder []
    (AWSS3ControlClient/builder )))

(defn describe-job
  "Retrieves the configuration parameters and status for a batch operations job.

  request - `com.amazonaws.services.s3control.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.s3control.model.DescribeJobResult`

  throws: com.amazonaws.services.s3control.model.BadRequestException"
  (^com.amazonaws.services.s3control.model.DescribeJobResult [^AWSS3ControlClient this ^com.amazonaws.services.s3control.model.DescribeJobRequest request]
    (-> this (.describeJob request))))

(defn put-public-access-block
  "request - `com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest`

  returns: Result of the PutPublicAccessBlock operation returned by the service. - `com.amazonaws.services.s3control.model.PutPublicAccessBlockResult`"
  (^com.amazonaws.services.s3control.model.PutPublicAccessBlockResult [^AWSS3ControlClient this ^com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest request]
    (-> this (.putPublicAccessBlock request))))

(defn delete-public-access-block
  "Deletes the block public access configuration for the specified account.

  request - `com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest`

  returns: Result of the DeletePublicAccessBlock operation returned by the service. - `com.amazonaws.services.s3control.model.DeletePublicAccessBlockResult`"
  (^com.amazonaws.services.s3control.model.DeletePublicAccessBlockResult [^AWSS3ControlClient this ^com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest request]
    (-> this (.deletePublicAccessBlock request))))

(defn get-public-access-block
  "request - `com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest`

  returns: Result of the GetPublicAccessBlock operation returned by the service. - `com.amazonaws.services.s3control.model.GetPublicAccessBlockResult`

  throws: com.amazonaws.services.s3control.model.NoSuchPublicAccessBlockConfigurationException"
  (^com.amazonaws.services.s3control.model.GetPublicAccessBlockResult [^AWSS3ControlClient this ^com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest request]
    (-> this (.getPublicAccessBlock request))))

(defn list-jobs
  "Lists current jobs and jobs that have ended within the last 30 days for the AWS account making the request.

  request - `com.amazonaws.services.s3control.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.s3control.model.ListJobsResult`

  throws: com.amazonaws.services.s3control.model.InvalidRequestException"
  (^com.amazonaws.services.s3control.model.ListJobsResult [^AWSS3ControlClient this ^com.amazonaws.services.s3control.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn update-job-priority
  "Updates an existing job's priority.

  request - `com.amazonaws.services.s3control.model.UpdateJobPriorityRequest`

  returns: Result of the UpdateJobPriority operation returned by the service. - `com.amazonaws.services.s3control.model.UpdateJobPriorityResult`

  throws: com.amazonaws.services.s3control.model.BadRequestException"
  (^com.amazonaws.services.s3control.model.UpdateJobPriorityResult [^AWSS3ControlClient this ^com.amazonaws.services.s3control.model.UpdateJobPriorityRequest request]
    (-> this (.updateJobPriority request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.services.s3control.S3ControlResponseMetadata`"
  (^com.amazonaws.services.s3control.S3ControlResponseMetadata [^AWSS3ControlClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "Creates an Amazon S3 batch operations job.

  request - `com.amazonaws.services.s3control.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.s3control.model.CreateJobResult`

  throws: com.amazonaws.services.s3control.model.TooManyRequestsException"
  (^com.amazonaws.services.s3control.model.CreateJobResult [^AWSS3ControlClient this ^com.amazonaws.services.s3control.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn update-job-status
  "Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel
   an existing job.

  request - `com.amazonaws.services.s3control.model.UpdateJobStatusRequest`

  returns: Result of the UpdateJobStatus operation returned by the service. - `com.amazonaws.services.s3control.model.UpdateJobStatusResult`

  throws: com.amazonaws.services.s3control.model.BadRequestException"
  (^com.amazonaws.services.s3control.model.UpdateJobStatusResult [^AWSS3ControlClient this ^com.amazonaws.services.s3control.model.UpdateJobStatusRequest request]
    (-> this (.updateJobStatus request))))

