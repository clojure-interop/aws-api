(ns com.amazonaws.services.s3control.AWSS3ControlAsync
  "Interface for accessing AWS S3 Control asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSS3ControlAsync instead.



  AWS S3 Control provides access to Amazon S3 control plane operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3control AWSS3ControlAsync]))

(defn create-job-async
  "Creates an Amazon S3 batch operations job.

  create-job-request - `com.amazonaws.services.s3control.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.CreateJobRequest create-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync create-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.CreateJobRequest create-job-request]
    (-> this (.createJobAsync create-job-request))))

(defn delete-public-access-block-async
  "Deletes the block public access configuration for the specified account.

  delete-public-access-block-request - `com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePublicAccessBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.DeletePublicAccessBlockResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest delete-public-access-block-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePublicAccessBlockAsync delete-public-access-block-request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest delete-public-access-block-request]
    (-> this (.deletePublicAccessBlockAsync delete-public-access-block-request))))

(defn describe-job-async
  "Retrieves the configuration parameters and status for a batch operations job.

  describe-job-request - `com.amazonaws.services.s3control.model.DescribeJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.DescribeJobResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.DescribeJobRequest describe-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobAsync describe-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.DescribeJobRequest describe-job-request]
    (-> this (.describeJobAsync describe-job-request))))

(defn get-public-access-block-async
  "get-public-access-block-request - `com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPublicAccessBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.GetPublicAccessBlockResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest get-public-access-block-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPublicAccessBlockAsync get-public-access-block-request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest get-public-access-block-request]
    (-> this (.getPublicAccessBlockAsync get-public-access-block-request))))

(defn list-jobs-async
  "Lists current jobs and jobs that have ended within the last 30 days for the AWS account making the request.

  list-jobs-request - `com.amazonaws.services.s3control.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.ListJobsRequest list-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync list-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobsAsync list-jobs-request))))

(defn put-public-access-block-async
  "put-public-access-block-request - `com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPublicAccessBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.PutPublicAccessBlockResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest put-public-access-block-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPublicAccessBlockAsync put-public-access-block-request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest put-public-access-block-request]
    (-> this (.putPublicAccessBlockAsync put-public-access-block-request))))

(defn update-job-priority-async
  "Updates an existing job's priority.

  update-job-priority-request - `com.amazonaws.services.s3control.model.UpdateJobPriorityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobPriority operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.UpdateJobPriorityResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.UpdateJobPriorityRequest update-job-priority-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobPriorityAsync update-job-priority-request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.UpdateJobPriorityRequest update-job-priority-request]
    (-> this (.updateJobPriorityAsync update-job-priority-request))))

(defn update-job-status-async
  "Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel
   an existing job.

  update-job-status-request - `com.amazonaws.services.s3control.model.UpdateJobStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.UpdateJobStatusResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.UpdateJobStatusRequest update-job-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobStatusAsync update-job-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsync this ^com.amazonaws.services.s3control.model.UpdateJobStatusRequest update-job-status-request]
    (-> this (.updateJobStatusAsync update-job-status-request))))

