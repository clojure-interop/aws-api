(ns com.amazonaws.services.s3control.AbstractAWSS3Control
  "Abstract implementation of AWSS3Control. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3control AbstractAWSS3Control]))

(defn describe-job
  "Description copied from interface: AWSS3Control

  request - `com.amazonaws.services.s3control.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.s3control.model.DescribeJobResult`"
  (^com.amazonaws.services.s3control.model.DescribeJobResult [^AbstractAWSS3Control this ^com.amazonaws.services.s3control.model.DescribeJobRequest request]
    (-> this (.describeJob request))))

(defn put-public-access-block
  "Description copied from interface: AWSS3Control

  request - `com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest`

  returns: Result of the PutPublicAccessBlock operation returned by the service. - `com.amazonaws.services.s3control.model.PutPublicAccessBlockResult`"
  (^com.amazonaws.services.s3control.model.PutPublicAccessBlockResult [^AbstractAWSS3Control this ^com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest request]
    (-> this (.putPublicAccessBlock request))))

(defn delete-public-access-block
  "Description copied from interface: AWSS3Control

  request - `com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest`

  returns: Result of the DeletePublicAccessBlock operation returned by the service. - `com.amazonaws.services.s3control.model.DeletePublicAccessBlockResult`"
  (^com.amazonaws.services.s3control.model.DeletePublicAccessBlockResult [^AbstractAWSS3Control this ^com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest request]
    (-> this (.deletePublicAccessBlock request))))

(defn get-public-access-block
  "Description copied from interface: AWSS3Control

  request - `com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest`

  returns: Result of the GetPublicAccessBlock operation returned by the service. - `com.amazonaws.services.s3control.model.GetPublicAccessBlockResult`"
  (^com.amazonaws.services.s3control.model.GetPublicAccessBlockResult [^AbstractAWSS3Control this ^com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest request]
    (-> this (.getPublicAccessBlock request))))

(defn shutdown
  "Description copied from interface: AWSS3Control"
  ([^AbstractAWSS3Control this]
    (-> this (.shutdown))))

(defn list-jobs
  "Description copied from interface: AWSS3Control

  request - `com.amazonaws.services.s3control.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.s3control.model.ListJobsResult`"
  (^com.amazonaws.services.s3control.model.ListJobsResult [^AbstractAWSS3Control this ^com.amazonaws.services.s3control.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn update-job-priority
  "Description copied from interface: AWSS3Control

  request - `com.amazonaws.services.s3control.model.UpdateJobPriorityRequest`

  returns: Result of the UpdateJobPriority operation returned by the service. - `com.amazonaws.services.s3control.model.UpdateJobPriorityResult`"
  (^com.amazonaws.services.s3control.model.UpdateJobPriorityResult [^AbstractAWSS3Control this ^com.amazonaws.services.s3control.model.UpdateJobPriorityRequest request]
    (-> this (.updateJobPriority request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSS3Control

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.services.s3control.S3ControlResponseMetadata`"
  (^com.amazonaws.services.s3control.S3ControlResponseMetadata [^AbstractAWSS3Control this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-job
  "Description copied from interface: AWSS3Control

  request - `com.amazonaws.services.s3control.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.s3control.model.CreateJobResult`"
  (^com.amazonaws.services.s3control.model.CreateJobResult [^AbstractAWSS3Control this ^com.amazonaws.services.s3control.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn update-job-status
  "Description copied from interface: AWSS3Control

  request - `com.amazonaws.services.s3control.model.UpdateJobStatusRequest`

  returns: Result of the UpdateJobStatus operation returned by the service. - `com.amazonaws.services.s3control.model.UpdateJobStatusResult`"
  (^com.amazonaws.services.s3control.model.UpdateJobStatusResult [^AbstractAWSS3Control this ^com.amazonaws.services.s3control.model.UpdateJobStatusRequest request]
    (-> this (.updateJobStatus request))))

