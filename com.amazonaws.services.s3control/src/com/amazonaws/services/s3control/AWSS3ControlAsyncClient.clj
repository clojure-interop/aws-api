(ns com.amazonaws.services.s3control.AWSS3ControlAsyncClient
  "Client for accessing AWS S3 Control asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  AWS S3 Control provides access to Amazon S3 control plane operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3control AWSS3ControlAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.s3control.AWSS3ControlAsyncClientBuilder`"
  (^com.amazonaws.services.s3control.AWSS3ControlAsyncClientBuilder []
    (AWSS3ControlAsyncClient/asyncBuilder )))

(defn update-job-status-async
  "Description copied from interface: AWSS3ControlAsync

  request - `com.amazonaws.services.s3control.model.UpdateJobStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.UpdateJobStatusResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.UpdateJobStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.UpdateJobStatusRequest request]
    (-> this (.updateJobStatusAsync request))))

(defn describe-job-async
  "Description copied from interface: AWSS3ControlAsync

  request - `com.amazonaws.services.s3control.model.DescribeJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.DescribeJobResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.DescribeJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.DescribeJobRequest request]
    (-> this (.describeJobAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSS3ControlAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-jobs-async
  "Description copied from interface: AWSS3ControlAsync

  request - `com.amazonaws.services.s3control.model.ListJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn get-public-access-block-async
  "Description copied from interface: AWSS3ControlAsync

  request - `com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPublicAccessBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.GetPublicAccessBlockResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPublicAccessBlockAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.GetPublicAccessBlockRequest request]
    (-> this (.getPublicAccessBlockAsync request))))

(defn put-public-access-block-async
  "Description copied from interface: AWSS3ControlAsync

  request - `com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPublicAccessBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.PutPublicAccessBlockResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPublicAccessBlockAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.PutPublicAccessBlockRequest request]
    (-> this (.putPublicAccessBlockAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSS3ControlAsyncClient this]
    (-> this (.shutdown))))

(defn create-job-async
  "Description copied from interface: AWSS3ControlAsync

  request - `com.amazonaws.services.s3control.model.CreateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.CreateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.CreateJobRequest request]
    (-> this (.createJobAsync request))))

(defn update-job-priority-async
  "Description copied from interface: AWSS3ControlAsync

  request - `com.amazonaws.services.s3control.model.UpdateJobPriorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJobPriority operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.UpdateJobPriorityResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.UpdateJobPriorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobPriorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.UpdateJobPriorityRequest request]
    (-> this (.updateJobPriorityAsync request))))

(defn delete-public-access-block-async
  "Description copied from interface: AWSS3ControlAsync

  request - `com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePublicAccessBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.s3control.model.DeletePublicAccessBlockResult>`"
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePublicAccessBlockAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSS3ControlAsyncClient this ^com.amazonaws.services.s3control.model.DeletePublicAccessBlockRequest request]
    (-> this (.deletePublicAccessBlockAsync request))))

