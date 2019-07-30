(ns com.amazonaws.services.glacier.AmazonGlacierAsyncClient
  "Client for accessing Amazon Glacier asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon S3 Glacier (Glacier) is a storage solution for \"cold data.\"


  Glacier is an extremely low-cost storage service that provides secure, durable, and easy-to-use storage for data
  backup and archival. With Glacier, customers can store their data cost effectively for months, years, or decades.
  Glacier also enables customers to offload the administrative burdens of operating and scaling storage to AWS, so they
  don't have to worry about capacity planning, hardware provisioning, data replication, hardware failure and recovery,
  or time-consuming hardware migrations.


  Glacier is a great storage choice when low storage cost is paramount and your data is rarely retrieved. If your
  application requires fast or frequent access to your data, consider using Amazon S3. For more information, see Amazon Simple Storage Service (Amazon S3).


  You can store any kind of data in any format. There is no maximum limit on the total amount of data you can store in
  Glacier.


  If you are a first-time user of Glacier, we recommend that you begin by reading the following sections in the
  Amazon S3 Glacier Developer Guide:




  What is Amazon S3 Glacier - This
  section of the Developer Guide describes the underlying data model, the operations it supports, and the AWS SDKs that
  you can use to interact with the service.




  Getting Started
  with Amazon S3 Glacier - The Getting Started section walks you through the process of creating a vault, uploading
  archives, creating jobs to download archives, retrieving the job output, and deleting archives."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glacier AmazonGlacierAsyncClient]))

(defn ->amazon-glacier-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonGlacierAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonGlacierAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonGlacierAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonGlacierAsyncClient aws-credentials executor-service))
  (^AmazonGlacierAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonGlacierAsyncClient client-configuration))
  (^AmazonGlacierAsyncClient []
    (new AmazonGlacierAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.glacier.AmazonGlacierAsyncClientBuilder`"
  (^com.amazonaws.services.glacier.AmazonGlacierAsyncClientBuilder []
    (AmazonGlacierAsyncClient/asyncBuilder )))

(defn complete-vault-lock-async
  "Description copied from interface: AmazonGlacierAsync

  request - The input values for CompleteVaultLock. - `com.amazonaws.services.glacier.model.CompleteVaultLockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CompleteVaultLock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.CompleteVaultLockResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.CompleteVaultLockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.completeVaultLockAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.CompleteVaultLockRequest request]
    (-> this (.completeVaultLockAsync request))))

(defn describe-job-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for retrieving a job description. - `com.amazonaws.services.glacier.model.DescribeJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.DescribeJobResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DescribeJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DescribeJobRequest request]
    (-> this (.describeJobAsync request))))

(defn create-vault-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options to create a vault. - `com.amazonaws.services.glacier.model.CreateVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.CreateVaultResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.CreateVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.CreateVaultRequest request]
    (-> this (.createVaultAsync request))))

(defn describe-vault-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for retrieving metadata for a specific vault in Amazon Glacier. - `com.amazonaws.services.glacier.model.DescribeVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.DescribeVaultResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DescribeVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DescribeVaultRequest request]
    (-> this (.describeVaultAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonGlacierAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-multipart-uploads-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault. - `com.amazonaws.services.glacier.model.ListMultipartUploadsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMultipartUploads operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.ListMultipartUploadsResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListMultipartUploadsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMultipartUploadsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListMultipartUploadsRequest request]
    (-> this (.listMultipartUploadsAsync request))))

(defn list-jobs-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for retrieving a job list for an Amazon S3 Glacier vault. - `com.amazonaws.services.glacier.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn list-tags-for-vault-async
  "Description copied from interface: AmazonGlacierAsync

  request - The input value for ListTagsForVaultInput. - `com.amazonaws.services.glacier.model.ListTagsForVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.ListTagsForVaultResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListTagsForVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListTagsForVaultRequest request]
    (-> this (.listTagsForVaultAsync request))))

(defn initiate-vault-lock-async
  "Description copied from interface: AmazonGlacierAsync

  request - The input values for InitiateVaultLock. - `com.amazonaws.services.glacier.model.InitiateVaultLockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateVaultLock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.InitiateVaultLockResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.InitiateVaultLockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateVaultLockAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.InitiateVaultLockRequest request]
    (-> this (.initiateVaultLockAsync request))))

(defn get-job-output-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for downloading output of an Amazon S3 Glacier job. - `com.amazonaws.services.glacier.model.GetJobOutputRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.GetJobOutputResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetJobOutputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobOutputAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetJobOutputRequest request]
    (-> this (.getJobOutputAsync request))))

(defn get-vault-access-policy-async
  "Description copied from interface: AmazonGlacierAsync

  request - Input for GetVaultAccessPolicy. - `com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVaultAccessPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.GetVaultAccessPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVaultAccessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest request]
    (-> this (.getVaultAccessPolicyAsync request))))

(defn list-vaults-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options to retrieve the vault list owned by the calling user's account. The list provides metadata information for each vault. - `com.amazonaws.services.glacier.model.ListVaultsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVaults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.ListVaultsResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListVaultsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVaultsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListVaultsRequest request]
    (-> this (.listVaultsAsync request))))

(defn abort-multipart-upload-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options to abort a multipart upload identified by the upload ID. For information about the underlying REST API, see Abort Multipart Upload. For conceptual information, see Working with Archives in Amazon S3 Glacier. - `com.amazonaws.services.glacier.model.AbortMultipartUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AbortMultipartUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.AbortMultipartUploadResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.AbortMultipartUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.abortMultipartUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.AbortMultipartUploadRequest request]
    (-> this (.abortMultipartUploadAsync request))))

(defn initiate-job-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for initiating an Amazon S3 Glacier job. - `com.amazonaws.services.glacier.model.InitiateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.InitiateJobResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.InitiateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.InitiateJobRequest request]
    (-> this (.initiateJobAsync request))))

(defn abort-vault-lock-async
  "Description copied from interface: AmazonGlacierAsync

  request - The input values for AbortVaultLock. - `com.amazonaws.services.glacier.model.AbortVaultLockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AbortVaultLock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.AbortVaultLockResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.AbortVaultLockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.abortVaultLockAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.AbortVaultLockRequest request]
    (-> this (.abortVaultLockAsync request))))

(defn delete-vault-notifications-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for deleting a vault notification configuration from an Amazon Glacier vault. - `com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVaultNotifications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.DeleteVaultNotificationsResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVaultNotificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest request]
    (-> this (.deleteVaultNotificationsAsync request))))

(defn list-parts-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for retrieving a list of parts of an archive that have been uploaded in a specific multipart upload. - `com.amazonaws.services.glacier.model.ListPartsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListParts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.ListPartsResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListPartsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPartsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListPartsRequest request]
    (-> this (.listPartsAsync request))))

(defn delete-archive-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for deleting an archive from an Amazon S3 Glacier vault. - `com.amazonaws.services.glacier.model.DeleteArchiveRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteArchive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.DeleteArchiveResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DeleteArchiveRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteArchiveAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DeleteArchiveRequest request]
    (-> this (.deleteArchiveAsync request))))

(defn upload-archive-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options to add an archive to a vault. - `com.amazonaws.services.glacier.model.UploadArchiveRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadArchive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.UploadArchiveResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.UploadArchiveRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadArchiveAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.UploadArchiveRequest request]
    (-> this (.uploadArchiveAsync request))))

(defn get-vault-notifications-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for retrieving the notification configuration set on an Amazon Glacier vault. - `com.amazonaws.services.glacier.model.GetVaultNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVaultNotifications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.GetVaultNotificationsResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetVaultNotificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVaultNotificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetVaultNotificationsRequest request]
    (-> this (.getVaultNotificationsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonGlacierAsyncClient this]
    (-> this (.shutdown))))

(defn list-provisioned-capacity-async
  "Description copied from interface: AmazonGlacierAsync

  request - `com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProvisionedCapacity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.ListProvisionedCapacityResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProvisionedCapacityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest request]
    (-> this (.listProvisionedCapacityAsync request))))

(defn set-vault-access-policy-async
  "Description copied from interface: AmazonGlacierAsync

  request - SetVaultAccessPolicy input. - `com.amazonaws.services.glacier.model.SetVaultAccessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetVaultAccessPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.SetVaultAccessPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.SetVaultAccessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setVaultAccessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.SetVaultAccessPolicyRequest request]
    (-> this (.setVaultAccessPolicyAsync request))))

(defn delete-vault-access-policy-async
  "Description copied from interface: AmazonGlacierAsync

  request - DeleteVaultAccessPolicy input. - `com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVaultAccessPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVaultAccessPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest request]
    (-> this (.deleteVaultAccessPolicyAsync request))))

(defn delete-vault-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for deleting a vault from Amazon S3 Glacier. - `com.amazonaws.services.glacier.model.DeleteVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.DeleteVaultResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DeleteVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.DeleteVaultRequest request]
    (-> this (.deleteVaultAsync request))))

(defn remove-tags-from-vault-async
  "Description copied from interface: AmazonGlacierAsync

  request - The input value for RemoveTagsFromVaultInput. - `com.amazonaws.services.glacier.model.RemoveTagsFromVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.RemoveTagsFromVaultResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.RemoveTagsFromVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.RemoveTagsFromVaultRequest request]
    (-> this (.removeTagsFromVaultAsync request))))

(defn add-tags-to-vault-async
  "Description copied from interface: AmazonGlacierAsync

  request - The input values for AddTagsToVault. - `com.amazonaws.services.glacier.model.AddTagsToVaultRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToVault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.AddTagsToVaultResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.AddTagsToVaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToVaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.AddTagsToVaultRequest request]
    (-> this (.addTagsToVaultAsync request))))

(defn get-data-retrieval-policy-async
  "Description copied from interface: AmazonGlacierAsync

  request - Input for GetDataRetrievalPolicy. - `com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataRetrievalPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.GetDataRetrievalPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataRetrievalPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest request]
    (-> this (.getDataRetrievalPolicyAsync request))))

(defn initiate-multipart-upload-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options for initiating a multipart upload to an Amazon S3 Glacier vault. - `com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateMultipartUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.InitiateMultipartUploadResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateMultipartUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest request]
    (-> this (.initiateMultipartUploadAsync request))))

(defn set-data-retrieval-policy-async
  "Description copied from interface: AmazonGlacierAsync

  request - SetDataRetrievalPolicy input. - `com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetDataRetrievalPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.SetDataRetrievalPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setDataRetrievalPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest request]
    (-> this (.setDataRetrievalPolicyAsync request))))

(defn set-vault-notifications-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options to configure notifications that will be sent when specific events happen to a vault. - `com.amazonaws.services.glacier.model.SetVaultNotificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetVaultNotifications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.SetVaultNotificationsResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.SetVaultNotificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setVaultNotificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.SetVaultNotificationsRequest request]
    (-> this (.setVaultNotificationsAsync request))))

(defn upload-multipart-part-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options to upload a part of an archive in a multipart upload operation. - `com.amazonaws.services.glacier.model.UploadMultipartPartRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadMultipartPart operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.UploadMultipartPartResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.UploadMultipartPartRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadMultipartPartAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.UploadMultipartPartRequest request]
    (-> this (.uploadMultipartPartAsync request))))

(defn purchase-provisioned-capacity-async
  "Description copied from interface: AmazonGlacierAsync

  request - `com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseProvisionedCapacity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseProvisionedCapacityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest request]
    (-> this (.purchaseProvisionedCapacityAsync request))))

(defn complete-multipart-upload-async
  "Description copied from interface: AmazonGlacierAsync

  request - Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the archive parts have been uploaded and Amazon S3 Glacier (Glacier) can now assemble the archive from the uploaded parts. After assembling and saving the archive to the vault, Glacier returns the URI path of the newly created archive resource. - `com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CompleteMultipartUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.CompleteMultipartUploadResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.completeMultipartUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest request]
    (-> this (.completeMultipartUploadAsync request))))

(defn get-vault-lock-async
  "Description copied from interface: AmazonGlacierAsync

  request - The input values for GetVaultLock. - `com.amazonaws.services.glacier.model.GetVaultLockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVaultLock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.glacier.model.GetVaultLockResult>`"
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetVaultLockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVaultLockAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonGlacierAsyncClient this ^com.amazonaws.services.glacier.model.GetVaultLockRequest request]
    (-> this (.getVaultLockAsync request))))

