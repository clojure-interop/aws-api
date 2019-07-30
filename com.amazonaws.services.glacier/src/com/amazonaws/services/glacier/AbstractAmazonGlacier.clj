(ns com.amazonaws.services.glacier.AbstractAmazonGlacier
  "Abstract implementation of AmazonGlacier. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.glacier AbstractAmazonGlacier]))

(defn get-job-output
  "Description copied from interface: AmazonGlacier

  request - Provides options for downloading output of an Amazon S3 Glacier job. - `com.amazonaws.services.glacier.model.GetJobOutputRequest`

  returns: Result of the GetJobOutput operation returned by the service. - `com.amazonaws.services.glacier.model.GetJobOutputResult`"
  (^com.amazonaws.services.glacier.model.GetJobOutputResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.GetJobOutputRequest request]
    (-> this (.getJobOutput request))))

(defn get-data-retrieval-policy
  "Description copied from interface: AmazonGlacier

  request - Input for GetDataRetrievalPolicy. - `com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest`

  returns: Result of the GetDataRetrievalPolicy operation returned by the service. - `com.amazonaws.services.glacier.model.GetDataRetrievalPolicyResult`"
  (^com.amazonaws.services.glacier.model.GetDataRetrievalPolicyResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.GetDataRetrievalPolicyRequest request]
    (-> this (.getDataRetrievalPolicy request))))

(defn set-region
  "Description copied from interface: AmazonGlacier

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonGlacier this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.glacier.waiters.AmazonGlacierWaiters`"
  (^com.amazonaws.services.glacier.waiters.AmazonGlacierWaiters [^AbstractAmazonGlacier this]
    (-> this (.waiters))))

(defn complete-multipart-upload
  "Description copied from interface: AmazonGlacier

  request - Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the archive parts have been uploaded and Amazon S3 Glacier (Glacier) can now assemble the archive from the uploaded parts. After assembling and saving the archive to the vault, Glacier returns the URI path of the newly created archive resource. - `com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest`

  returns: Result of the CompleteMultipartUpload operation returned by the service. - `com.amazonaws.services.glacier.model.CompleteMultipartUploadResult`"
  (^com.amazonaws.services.glacier.model.CompleteMultipartUploadResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest request]
    (-> this (.completeMultipartUpload request))))

(defn list-multipart-uploads
  "Description copied from interface: AmazonGlacier

  request - Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault. - `com.amazonaws.services.glacier.model.ListMultipartUploadsRequest`

  returns: Result of the ListMultipartUploads operation returned by the service. - `com.amazonaws.services.glacier.model.ListMultipartUploadsResult`"
  (^com.amazonaws.services.glacier.model.ListMultipartUploadsResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.ListMultipartUploadsRequest request]
    (-> this (.listMultipartUploads request))))

(defn set-vault-access-policy
  "Description copied from interface: AmazonGlacier

  request - SetVaultAccessPolicy input. - `com.amazonaws.services.glacier.model.SetVaultAccessPolicyRequest`

  returns: Result of the SetVaultAccessPolicy operation returned by the service. - `com.amazonaws.services.glacier.model.SetVaultAccessPolicyResult`"
  (^com.amazonaws.services.glacier.model.SetVaultAccessPolicyResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.SetVaultAccessPolicyRequest request]
    (-> this (.setVaultAccessPolicy request))))

(defn describe-job
  "Description copied from interface: AmazonGlacier

  request - Provides options for retrieving a job description. - `com.amazonaws.services.glacier.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.glacier.model.DescribeJobResult`"
  (^com.amazonaws.services.glacier.model.DescribeJobResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.DescribeJobRequest request]
    (-> this (.describeJob request))))

(defn purchase-provisioned-capacity
  "Description copied from interface: AmazonGlacier

  request - `com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest`

  returns: Result of the PurchaseProvisionedCapacity operation returned by the service. - `com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityResult`"
  (^com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.PurchaseProvisionedCapacityRequest request]
    (-> this (.purchaseProvisionedCapacity request))))

(defn add-tags-to-vault
  "Description copied from interface: AmazonGlacier

  request - The input values for AddTagsToVault. - `com.amazonaws.services.glacier.model.AddTagsToVaultRequest`

  returns: Result of the AddTagsToVault operation returned by the service. - `com.amazonaws.services.glacier.model.AddTagsToVaultResult`"
  (^com.amazonaws.services.glacier.model.AddTagsToVaultResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.AddTagsToVaultRequest request]
    (-> this (.addTagsToVault request))))

(defn remove-tags-from-vault
  "Description copied from interface: AmazonGlacier

  request - The input value for RemoveTagsFromVaultInput. - `com.amazonaws.services.glacier.model.RemoveTagsFromVaultRequest`

  returns: Result of the RemoveTagsFromVault operation returned by the service. - `com.amazonaws.services.glacier.model.RemoveTagsFromVaultResult`"
  (^com.amazonaws.services.glacier.model.RemoveTagsFromVaultResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.RemoveTagsFromVaultRequest request]
    (-> this (.removeTagsFromVault request))))

(defn delete-archive
  "Description copied from interface: AmazonGlacier

  request - Provides options for deleting an archive from an Amazon S3 Glacier vault. - `com.amazonaws.services.glacier.model.DeleteArchiveRequest`

  returns: Result of the DeleteArchive operation returned by the service. - `com.amazonaws.services.glacier.model.DeleteArchiveResult`"
  (^com.amazonaws.services.glacier.model.DeleteArchiveResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.DeleteArchiveRequest request]
    (-> this (.deleteArchive request))))

(defn set-data-retrieval-policy
  "Description copied from interface: AmazonGlacier

  request - SetDataRetrievalPolicy input. - `com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest`

  returns: Result of the SetDataRetrievalPolicy operation returned by the service. - `com.amazonaws.services.glacier.model.SetDataRetrievalPolicyResult`"
  (^com.amazonaws.services.glacier.model.SetDataRetrievalPolicyResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.SetDataRetrievalPolicyRequest request]
    (-> this (.setDataRetrievalPolicy request))))

(defn initiate-vault-lock
  "Description copied from interface: AmazonGlacier

  request - The input values for InitiateVaultLock. - `com.amazonaws.services.glacier.model.InitiateVaultLockRequest`

  returns: Result of the InitiateVaultLock operation returned by the service. - `com.amazonaws.services.glacier.model.InitiateVaultLockResult`"
  (^com.amazonaws.services.glacier.model.InitiateVaultLockResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.InitiateVaultLockRequest request]
    (-> this (.initiateVaultLock request))))

(defn upload-multipart-part
  "Description copied from interface: AmazonGlacier

  request - Provides options to upload a part of an archive in a multipart upload operation. - `com.amazonaws.services.glacier.model.UploadMultipartPartRequest`

  returns: Result of the UploadMultipartPart operation returned by the service. - `com.amazonaws.services.glacier.model.UploadMultipartPartResult`"
  (^com.amazonaws.services.glacier.model.UploadMultipartPartResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.UploadMultipartPartRequest request]
    (-> this (.uploadMultipartPart request))))

(defn list-provisioned-capacity
  "Description copied from interface: AmazonGlacier

  request - `com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest`

  returns: Result of the ListProvisionedCapacity operation returned by the service. - `com.amazonaws.services.glacier.model.ListProvisionedCapacityResult`"
  (^com.amazonaws.services.glacier.model.ListProvisionedCapacityResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.ListProvisionedCapacityRequest request]
    (-> this (.listProvisionedCapacity request))))

(defn list-parts
  "Description copied from interface: AmazonGlacier

  request - Provides options for retrieving a list of parts of an archive that have been uploaded in a specific multipart upload. - `com.amazonaws.services.glacier.model.ListPartsRequest`

  returns: Result of the ListParts operation returned by the service. - `com.amazonaws.services.glacier.model.ListPartsResult`"
  (^com.amazonaws.services.glacier.model.ListPartsResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.ListPartsRequest request]
    (-> this (.listParts request))))

(defn delete-vault-notifications
  "Description copied from interface: AmazonGlacier

  request - Provides options for deleting a vault notification configuration from an Amazon Glacier vault. - `com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest`

  returns: Result of the DeleteVaultNotifications operation returned by the service. - `com.amazonaws.services.glacier.model.DeleteVaultNotificationsResult`"
  (^com.amazonaws.services.glacier.model.DeleteVaultNotificationsResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.DeleteVaultNotificationsRequest request]
    (-> this (.deleteVaultNotifications request))))

(defn abort-vault-lock
  "Description copied from interface: AmazonGlacier

  request - The input values for AbortVaultLock. - `com.amazonaws.services.glacier.model.AbortVaultLockRequest`

  returns: Result of the AbortVaultLock operation returned by the service. - `com.amazonaws.services.glacier.model.AbortVaultLockResult`"
  (^com.amazonaws.services.glacier.model.AbortVaultLockResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.AbortVaultLockRequest request]
    (-> this (.abortVaultLock request))))

(defn get-vault-lock
  "Description copied from interface: AmazonGlacier

  request - The input values for GetVaultLock. - `com.amazonaws.services.glacier.model.GetVaultLockRequest`

  returns: Result of the GetVaultLock operation returned by the service. - `com.amazonaws.services.glacier.model.GetVaultLockResult`"
  (^com.amazonaws.services.glacier.model.GetVaultLockResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.GetVaultLockRequest request]
    (-> this (.getVaultLock request))))

(defn initiate-job
  "Description copied from interface: AmazonGlacier

  request - Provides options for initiating an Amazon S3 Glacier job. - `com.amazonaws.services.glacier.model.InitiateJobRequest`

  returns: Result of the InitiateJob operation returned by the service. - `com.amazonaws.services.glacier.model.InitiateJobResult`"
  (^com.amazonaws.services.glacier.model.InitiateJobResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.InitiateJobRequest request]
    (-> this (.initiateJob request))))

(defn set-vault-notifications
  "Description copied from interface: AmazonGlacier

  request - Provides options to configure notifications that will be sent when specific events happen to a vault. - `com.amazonaws.services.glacier.model.SetVaultNotificationsRequest`

  returns: Result of the SetVaultNotifications operation returned by the service. - `com.amazonaws.services.glacier.model.SetVaultNotificationsResult`"
  (^com.amazonaws.services.glacier.model.SetVaultNotificationsResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.SetVaultNotificationsRequest request]
    (-> this (.setVaultNotifications request))))

(defn describe-vault
  "Description copied from interface: AmazonGlacier

  request - Provides options for retrieving metadata for a specific vault in Amazon Glacier. - `com.amazonaws.services.glacier.model.DescribeVaultRequest`

  returns: Result of the DescribeVault operation returned by the service. - `com.amazonaws.services.glacier.model.DescribeVaultResult`"
  (^com.amazonaws.services.glacier.model.DescribeVaultResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.DescribeVaultRequest request]
    (-> this (.describeVault request))))

(defn shutdown
  "Description copied from interface: AmazonGlacier"
  ([^AbstractAmazonGlacier this]
    (-> this (.shutdown))))

(defn abort-multipart-upload
  "Description copied from interface: AmazonGlacier

  request - Provides options to abort a multipart upload identified by the upload ID. For information about the underlying REST API, see Abort Multipart Upload. For conceptual information, see Working with Archives in Amazon S3 Glacier. - `com.amazonaws.services.glacier.model.AbortMultipartUploadRequest`

  returns: Result of the AbortMultipartUpload operation returned by the service. - `com.amazonaws.services.glacier.model.AbortMultipartUploadResult`"
  (^com.amazonaws.services.glacier.model.AbortMultipartUploadResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.AbortMultipartUploadRequest request]
    (-> this (.abortMultipartUpload request))))

(defn set-endpoint
  "Description copied from interface: AmazonGlacier

  endpoint - The endpoint (ex: \"glacier.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://glacier.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonGlacier this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-tags-for-vault
  "Description copied from interface: AmazonGlacier

  request - The input value for ListTagsForVaultInput. - `com.amazonaws.services.glacier.model.ListTagsForVaultRequest`

  returns: Result of the ListTagsForVault operation returned by the service. - `com.amazonaws.services.glacier.model.ListTagsForVaultResult`"
  (^com.amazonaws.services.glacier.model.ListTagsForVaultResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.ListTagsForVaultRequest request]
    (-> this (.listTagsForVault request))))

(defn get-vault-notifications
  "Description copied from interface: AmazonGlacier

  request - Provides options for retrieving the notification configuration set on an Amazon Glacier vault. - `com.amazonaws.services.glacier.model.GetVaultNotificationsRequest`

  returns: Result of the GetVaultNotifications operation returned by the service. - `com.amazonaws.services.glacier.model.GetVaultNotificationsResult`"
  (^com.amazonaws.services.glacier.model.GetVaultNotificationsResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.GetVaultNotificationsRequest request]
    (-> this (.getVaultNotifications request))))

(defn initiate-multipart-upload
  "Description copied from interface: AmazonGlacier

  request - Provides options for initiating a multipart upload to an Amazon S3 Glacier vault. - `com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest`

  returns: Result of the InitiateMultipartUpload operation returned by the service. - `com.amazonaws.services.glacier.model.InitiateMultipartUploadResult`"
  (^com.amazonaws.services.glacier.model.InitiateMultipartUploadResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest request]
    (-> this (.initiateMultipartUpload request))))

(defn list-vaults
  "Description copied from interface: AmazonGlacier

  request - Provides options to retrieve the vault list owned by the calling user's account. The list provides metadata information for each vault. - `com.amazonaws.services.glacier.model.ListVaultsRequest`

  returns: Result of the ListVaults operation returned by the service. - `com.amazonaws.services.glacier.model.ListVaultsResult`"
  (^com.amazonaws.services.glacier.model.ListVaultsResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.ListVaultsRequest request]
    (-> this (.listVaults request))))

(defn list-jobs
  "Description copied from interface: AmazonGlacier

  request - Provides options for retrieving a job list for an Amazon S3 Glacier vault. - `com.amazonaws.services.glacier.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.glacier.model.ListJobsResult`"
  (^com.amazonaws.services.glacier.model.ListJobsResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn create-vault
  "Description copied from interface: AmazonGlacier

  request - Provides options to create a vault. - `com.amazonaws.services.glacier.model.CreateVaultRequest`

  returns: Result of the CreateVault operation returned by the service. - `com.amazonaws.services.glacier.model.CreateVaultResult`"
  (^com.amazonaws.services.glacier.model.CreateVaultResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.CreateVaultRequest request]
    (-> this (.createVault request))))

(defn get-vault-access-policy
  "Description copied from interface: AmazonGlacier

  request - Input for GetVaultAccessPolicy. - `com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest`

  returns: Result of the GetVaultAccessPolicy operation returned by the service. - `com.amazonaws.services.glacier.model.GetVaultAccessPolicyResult`"
  (^com.amazonaws.services.glacier.model.GetVaultAccessPolicyResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.GetVaultAccessPolicyRequest request]
    (-> this (.getVaultAccessPolicy request))))

(defn delete-vault
  "Description copied from interface: AmazonGlacier

  request - Provides options for deleting a vault from Amazon S3 Glacier. - `com.amazonaws.services.glacier.model.DeleteVaultRequest`

  returns: Result of the DeleteVault operation returned by the service. - `com.amazonaws.services.glacier.model.DeleteVaultResult`"
  (^com.amazonaws.services.glacier.model.DeleteVaultResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.DeleteVaultRequest request]
    (-> this (.deleteVault request))))

(defn delete-vault-access-policy
  "Description copied from interface: AmazonGlacier

  request - DeleteVaultAccessPolicy input. - `com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest`

  returns: Result of the DeleteVaultAccessPolicy operation returned by the service. - `com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyResult`"
  (^com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.DeleteVaultAccessPolicyRequest request]
    (-> this (.deleteVaultAccessPolicy request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonGlacier

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonGlacier this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn complete-vault-lock
  "Description copied from interface: AmazonGlacier

  request - The input values for CompleteVaultLock. - `com.amazonaws.services.glacier.model.CompleteVaultLockRequest`

  returns: Result of the CompleteVaultLock operation returned by the service. - `com.amazonaws.services.glacier.model.CompleteVaultLockResult`"
  (^com.amazonaws.services.glacier.model.CompleteVaultLockResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.CompleteVaultLockRequest request]
    (-> this (.completeVaultLock request))))

(defn upload-archive
  "Description copied from interface: AmazonGlacier

  request - Provides options to add an archive to a vault. - `com.amazonaws.services.glacier.model.UploadArchiveRequest`

  returns: Result of the UploadArchive operation returned by the service. - `com.amazonaws.services.glacier.model.UploadArchiveResult`"
  (^com.amazonaws.services.glacier.model.UploadArchiveResult [^AbstractAmazonGlacier this ^com.amazonaws.services.glacier.model.UploadArchiveRequest request]
    (-> this (.uploadArchive request))))

