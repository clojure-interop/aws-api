(ns com.amazonaws.services.s3.AbstractAmazonS3
  "An Abstract class that users needs to extend instead of AmazonS3
  interface. This abstract class is provided so we don't break any customers
  when we introduce new methods in AmazonS3 interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 AbstractAmazonS3]))

(defn ->abstract-amazon-s-3
  "Constructor."
  (^AbstractAmazonS3 []
    (new AbstractAmazonS3 )))

(defn set-object-lock-configuration
  "Description copied from interface: AmazonS3

  set-object-lock-configuration-request - The request object for setting the object lock configuration. - `com.amazonaws.services.s3.model.SetObjectLockConfigurationRequest`

  returns: A SetObjectLockConfigurationResult. - `com.amazonaws.services.s3.model.SetObjectLockConfigurationResult`"
  (^com.amazonaws.services.s3.model.SetObjectLockConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetObjectLockConfigurationRequest set-object-lock-configuration-request]
    (-> this (.setObjectLockConfiguration set-object-lock-configuration-request))))

(defn get-object-as-string
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object to retrieve. - `java.lang.String`
  key - The key of the object to retrieve. - `java.lang.String`

  returns: contents of the object as a String - `java.lang.String`

  throws: com.amazonaws.AmazonServiceException"
  (^java.lang.String [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObjectAsString bucket-name key))))

(defn upload-part
  "Description copied from interface: AmazonS3

  request - The UploadPartRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.UploadPartRequest`

  returns: An UploadPartResult from Amazon S3 containing the part number and
           ETag of the new part. - `com.amazonaws.services.s3.model.UploadPartResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.UploadPartResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.UploadPartRequest request]
    (-> this (.uploadPart request))))

(defn get-bucket-encryption
  "Description copied from interface: AmazonS3

  bucket-name - Name of the bucket to retrieve encryption configuration for. - `java.lang.String`

  returns: A GetBucketEncryptionResult. - `com.amazonaws.services.s3.model.GetBucketEncryptionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketEncryptionResult [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketEncryption bucket-name))))

(defn set-region
  "Description copied from interface: AmazonS3

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. - `com.amazonaws.regions.Region`

  throws: java.lang.IllegalArgumentException - If the given region is null, or if this service isn't available in the given region. See Region.isServiceSupported(String)"
  ([^AbstractAmazonS3 this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn set-s-3-client-options
  "Description copied from interface: AmazonS3

  client-options - The S3 client options to use. - `com.amazonaws.services.s3.S3ClientOptions`"
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.S3ClientOptions client-options]
    (-> this (.setS3ClientOptions client-options))))

(defn get-object-tagging
  "Description copied from interface: AmazonS3

  object-tagging-request - The request object containing all the options on how to retrieve the Amazon S3 object tags. - `com.amazonaws.services.s3.model.GetObjectTaggingRequest`

  returns: The tags for the specified object. - `com.amazonaws.services.s3.model.GetObjectTaggingResult`"
  (^com.amazonaws.services.s3.model.GetObjectTaggingResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetObjectTaggingRequest object-tagging-request]
    (-> this (.getObjectTagging object-tagging-request))))

(defn delete-bucket-metrics-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket from which the metrics configuration is to be deleted - `java.lang.String`
  id - The ID of the metrics configuration to delete. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.deleteBucketMetricsConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationRequest delete-bucket-metrics-configuration-request]
    (-> this (.deleteBucketMetricsConfiguration delete-bucket-metrics-configuration-request))))

(defn get-bucket-acl
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose ACL is being retrieved. - `java.lang.String`

  returns: The AccessControlList for the specified S3 bucket. - `com.amazonaws.services.s3.model.AccessControlList`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.AccessControlList [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketAcl bucket-name))))

(defn complete-multipart-upload
  "Description copied from interface: AmazonS3

  request - The CompleteMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.CompleteMultipartUploadRequest`

  returns: A CompleteMultipartUploadResult from S3 containing the ETag for
           the new object composed of the individual parts. - `com.amazonaws.services.s3.model.CompleteMultipartUploadResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.CompleteMultipartUploadResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.CompleteMultipartUploadRequest request]
    (-> this (.completeMultipartUpload request))))

(defn list-multipart-uploads
  "Description copied from interface: AmazonS3

  request - The ListMultipartUploadsRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.ListMultipartUploadsRequest`

  returns: A MultipartUploadListing from Amazon S3. - `com.amazonaws.services.s3.model.MultipartUploadListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.MultipartUploadListing [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.ListMultipartUploadsRequest request]
    (-> this (.listMultipartUploads request))))

(defn enable-requester-pays
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket being enabled for Requester Pays. - `java.lang.String`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.enableRequesterPays bucket-name))))

(defn delete-version
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket containing the object to delete. - `java.lang.String`
  key - The key of the object to delete. - `java.lang.String`
  version-id - The version of the object to delete. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id]
    (-> this (.deleteVersion bucket-name key version-id)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.DeleteVersionRequest delete-version-request]
    (-> this (.deleteVersion delete-version-request))))

(defn delete-bucket-replication-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The bucket name for which the replication configuration is to be deleted. - `java.lang.String`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketReplicationConfiguration bucket-name))))

(defn delete-bucket-tagging-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to remove the tagging configuration. - `java.lang.String`"
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketTaggingConfiguration bucket-name))))

(defn set-bucket-analytics-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to set the analytics configuration. - `java.lang.String`
  analytics-configuration - The analytics configuration to set. - `com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration`

  returns: `com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration analytics-configuration]
    (-> this (.setBucketAnalyticsConfiguration bucket-name analytics-configuration)))
  (^com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationRequest set-bucket-analytics-configuration-request]
    (-> this (.setBucketAnalyticsConfiguration set-bucket-analytics-configuration-request))))

(defn delete-bucket-encryption
  "Description copied from interface: AmazonS3

  bucket-name - `java.lang.String`

  returns: A DeleteBucketEncryptionResult. - `com.amazonaws.services.s3.model.DeleteBucketEncryptionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeleteBucketEncryptionResult [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketEncryption bucket-name))))

(defn create-bucket
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to create. - `java.lang.String`
  region - The Amazon S3 region in which to create the new bucket. - `com.amazonaws.services.s3.model.Region`

  returns: The newly created bucket. - `com.amazonaws.services.s3.model.Bucket`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.Bucket [^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.Region region]
    (-> this (.createBucket bucket-name region)))
  (^com.amazonaws.services.s3.model.Bucket [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.CreateBucketRequest create-bucket-request]
    (-> this (.createBucket create-bucket-request))))

(defn get-bucket-notification-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The bucket whose notification configuration will be retrieved. - `java.lang.String`

  returns: The bucket notification configuration for the specified bucket. - `com.amazonaws.services.s3.model.BucketNotificationConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketNotificationConfiguration [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketNotificationConfiguration bucket-name))))

(defn get-bucket-location
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket to look up. This must be a bucket the user owns. - `java.lang.String`

  returns: The location of the specified Amazon S3 bucket. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^java.lang.String [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketLocation bucket-name))))

(defn list-bucket-analytics-configurations
  "Description copied from interface: AmazonS3

  list-bucket-analytics-configurations-request - The request object to list all the analytics configurations for a bucket. - `com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsRequest`

  returns: All the analytics configurations for the bucket. - `com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsRequest list-bucket-analytics-configurations-request]
    (-> this (.listBucketAnalyticsConfigurations list-bucket-analytics-configurations-request))))

(defn delete-objects
  "Description copied from interface: AmazonS3

  delete-objects-request - The request object containing all options for deleting multiple objects. - `com.amazonaws.services.s3.model.DeleteObjectsRequest`

  returns: `com.amazonaws.services.s3.model.DeleteObjectsResult`

  throws: com.amazonaws.services.s3.model.MultiObjectDeleteException - if one or more of the objects couldn't be deleted."
  (^com.amazonaws.services.s3.model.DeleteObjectsResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.DeleteObjectsRequest delete-objects-request]
    (-> this (.deleteObjects delete-objects-request))))

(defn set-bucket-tagging-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to set the tagging configuration. - `java.lang.String`
  bucket-tagging-configuration - The new tagging configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketTaggingConfiguration`"
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketTaggingConfiguration bucket-tagging-configuration]
    (-> this (.setBucketTaggingConfiguration bucket-name bucket-tagging-configuration)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketTaggingConfigurationRequest set-bucket-tagging-configuration-request]
    (-> this (.setBucketTaggingConfiguration set-bucket-tagging-configuration-request))))

(defn list-versions
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose versions are to be listed. - `java.lang.String`
  prefix - An optional parameter restricting the response to keys that begin with the specified prefix. Use prefixes to separate a bucket into different sets of keys, similar to how a file system organizes files into directories. - `java.lang.String`
  key-marker - Optional parameter indicating where in the sorted list of all versions in the specified bucket to begin returning results. Results are always ordered first lexicographically (i.e. alphabetically) and then from most recent version to least recent version. If a keyMarker is used without a versionIdMarker, results begin immediately after that key's last version. When a keyMarker is used with a versionIdMarker, results begin immediately after the version with the specified key and version ID. This enables pagination; to get the next page of results use the next key marker and next version ID marker (from VersionListing.getNextKeyMarker() and VersionListing.getNextVersionIdMarker()) as the markers for the next request to list versions, or use the convenience method AmazonS3.listNextBatchOfVersions(VersionListing) - `java.lang.String`
  version-id-marker - Optional parameter indicating where in the sorted list of all versions in the specified bucket to begin returning results. Results are always ordered first lexicographically (i.e. alphabetically) and then from most recent version to least recent version. A keyMarker must be specified when specifying a versionIdMarker. Results begin immediately after the version with the specified key and version ID. This enables pagination; to get the next page of results use the next key marker and next version ID marker (from VersionListing.getNextKeyMarker() and VersionListing.getNextVersionIdMarker()) as the markers for the next request to list versions, or use the convenience method AmazonS3.listNextBatchOfVersions(VersionListing) - `java.lang.String`
  delimiter - Optional parameter that causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be rolled up into a single result element in the VersionListing.getCommonPrefixes() list. These rolled-up keys are not returned elsewhere in the response. The most commonly used delimiter is \"/\", which simulates a hierarchical organization similar to a file system directory structure. - `java.lang.String`
  max-results - Optional parameter indicating the maximum number of results to include in the response. Amazon S3 might return fewer than this, but will not return more. Even if maxKeys is not specified, Amazon S3 will limit the number of results in the response. - `java.lang.Integer`

  returns: A listing of the versions in the specified bucket, along with any
           other associated information such as common prefixes (if a
           delimiter was specified), the original request parameters, etc. - `com.amazonaws.services.s3.model.VersionListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.VersionListing [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String prefix ^java.lang.String key-marker ^java.lang.String version-id-marker ^java.lang.String delimiter ^java.lang.Integer max-results]
    (-> this (.listVersions bucket-name prefix key-marker version-id-marker delimiter max-results)))
  (^com.amazonaws.services.s3.model.VersionListing [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String prefix]
    (-> this (.listVersions bucket-name prefix)))
  (^com.amazonaws.services.s3.model.VersionListing [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.ListVersionsRequest list-versions-request]
    (-> this (.listVersions list-versions-request))))

(defn copy-object
  "Description copied from interface: AmazonS3

  source-bucket-name - The name of the bucket containing the source object to copy. - `java.lang.String`
  source-key - The key in the source bucket under which the source object is stored. - `java.lang.String`
  destination-bucket-name - The name of the bucket in which the new object will be created. This can be the same name as the source bucket's. - `java.lang.String`
  destination-key - The key in the destination bucket under which the new object will be created. - `java.lang.String`

  returns: A CopyObjectResult object containing the information
           returned by Amazon S3 for the newly created object. - `com.amazonaws.services.s3.model.CopyObjectResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.CopyObjectResult [^AbstractAmazonS3 this ^java.lang.String source-bucket-name ^java.lang.String source-key ^java.lang.String destination-bucket-name ^java.lang.String destination-key]
    (-> this (.copyObject source-bucket-name source-key destination-bucket-name destination-key)))
  (^com.amazonaws.services.s3.model.CopyObjectResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.CopyObjectRequest copy-object-request]
    (-> this (.copyObject copy-object-request))))

(defn get-object-lock-configuration
  "Description copied from interface: AmazonS3

  get-object-lock-configuration-request - The request object for getting the object lock configuration. - `com.amazonaws.services.s3.model.GetObjectLockConfigurationRequest`

  returns: A GetObjectLockConfigurationResult. - `com.amazonaws.services.s3.model.GetObjectLockConfigurationResult`"
  (^com.amazonaws.services.s3.model.GetObjectLockConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetObjectLockConfigurationRequest get-object-lock-configuration-request]
    (-> this (.getObjectLockConfiguration get-object-lock-configuration-request))))

(defn get-bucket-cross-origin-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve cross origin configuration. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.BucketCrossOriginConfiguration`"
  (^com.amazonaws.services.s3.model.BucketCrossOriginConfiguration [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketCrossOriginConfiguration bucket-name))))

(defn list-next-batch-of-versions
  "Description copied from interface: AmazonS3

  previous-version-listing - The previous truncated VersionListing. If a non-truncated VersionListing is passed in, an empty VersionListing is returned without ever contacting Amazon S3. - `com.amazonaws.services.s3.model.VersionListing`

  returns: The next set of VersionListing results, beginning immediately
           after the last result in the specified previous VersionListing. - `com.amazonaws.services.s3.model.VersionListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.VersionListing [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.VersionListing previous-version-listing]
    (-> this (.listNextBatchOfVersions previous-version-listing))))

(defn download
  "Description copied from interface: AmazonS3

  presigned-url-download-request - The request object to download the object. - `com.amazonaws.services.s3.model.PresignedUrlDownloadRequest`
  destination-file - Indicates the file (which might already exist) where to save the object content being downloading from Amazon S3. - `java.io.File`"
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.PresignedUrlDownloadRequest presigned-url-download-request ^java.io.File destination-file]
    (-> this (.download presigned-url-download-request destination-file)))
  (^com.amazonaws.services.s3.model.PresignedUrlDownloadResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.PresignedUrlDownloadRequest presigned-url-download-request]
    (-> this (.download presigned-url-download-request))))

(defn set-bucket-lifecycle-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to set the lifecycle configuration. - `java.lang.String`
  bucket-lifecycle-configuration - The new lifecycle configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketLifecycleConfiguration`"
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketLifecycleConfiguration bucket-lifecycle-configuration]
    (-> this (.setBucketLifecycleConfiguration bucket-name bucket-lifecycle-configuration)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketLifecycleConfigurationRequest set-bucket-lifecycle-configuration-request]
    (-> this (.setBucketLifecycleConfiguration set-bucket-lifecycle-configuration-request))))

(defn get-s-3-account-owner
  "Description copied from interface: AmazonS3

  get-s-3-account-owner-request - The request object for retrieving the S3 account owner. - `com.amazonaws.services.s3.model.GetS3AccountOwnerRequest`

  returns: The account of the authenticated sender - `com.amazonaws.services.s3.model.Owner`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.Owner [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetS3AccountOwnerRequest get-s-3-account-owner-request]
    (-> this (.getS3AccountOwner get-s-3-account-owner-request)))
  (^com.amazonaws.services.s3.model.Owner [^AbstractAmazonS3 this]
    (-> this (.getS3AccountOwner))))

(defn delete-bucket-website-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose website configuration is being deleted. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketWebsiteConfiguration bucket-name))))

(defn get-object-legal-hold
  "Description copied from interface: AmazonS3

  get-object-legal-hold-request - The request object for getting an object legal hold status. - `com.amazonaws.services.s3.model.GetObjectLegalHoldRequest`

  returns: A GetObjectLegalHoldResult. - `com.amazonaws.services.s3.model.GetObjectLegalHoldResult`"
  (^com.amazonaws.services.s3.model.GetObjectLegalHoldResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetObjectLegalHoldRequest get-object-legal-hold-request]
    (-> this (.getObjectLegalHold get-object-legal-hold-request))))

(defn upload
  "Description copied from interface: AmazonS3

  presigned-url-upload-request - `com.amazonaws.services.s3.model.PresignedUrlUploadRequest`

  returns: `com.amazonaws.services.s3.model.PresignedUrlUploadResult`"
  (^com.amazonaws.services.s3.model.PresignedUrlUploadResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.PresignedUrlUploadRequest presigned-url-upload-request]
    (-> this (.upload presigned-url-upload-request))))

(defn generate-presigned-url
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the desired object. - `java.lang.String`
  key - The key in the specified bucket under which the desired object is stored. - `java.lang.String`
  expiration - The time at which the returned pre-signed URL will expire. - `java.util.Date`
  method - The HTTP method verb to use for this URL - `com.amazonaws.HttpMethod`

  returns: A pre-signed URL which expires at the specified time, and can be
           used to allow anyone to download the specified object from S3,
           without exposing the owner's AWS secret access key. - `java.net.URL`

  throws: com.amazonaws.SdkClientException - If there were any problems pre-signing the request for the specified S3 object."
  (^java.net.URL [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.util.Date expiration ^com.amazonaws.HttpMethod method]
    (-> this (.generatePresignedUrl bucket-name key expiration method)))
  (^java.net.URL [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.util.Date expiration]
    (-> this (.generatePresignedUrl bucket-name key expiration)))
  (^java.net.URL [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GeneratePresignedUrlRequest generate-presigned-url-request]
    (-> this (.generatePresignedUrl generate-presigned-url-request))))

(defn select-object-content
  "Description copied from interface: AmazonS3

  select-request - The request object for selecting object content. - `com.amazonaws.services.s3.model.SelectObjectContentRequest`

  returns: A SelectObjectContentResult. - `com.amazonaws.services.s3.model.SelectObjectContentResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SelectObjectContentResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SelectObjectContentRequest select-request]
    (-> this (.selectObjectContent select-request))))

(defn list-parts
  "Description copied from interface: AmazonS3

  request - The ListPartsRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.ListPartsRequest`

  returns: Returns a PartListing from Amazon S3. - `com.amazonaws.services.s3.model.PartListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.PartListing [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.ListPartsRequest request]
    (-> this (.listParts request))))

(defn delete-public-access-block
  "Description copied from interface: AmazonS3

  request - The request object for deleting the buckets Public Access Block configuration. - `com.amazonaws.services.s3.model.DeletePublicAccessBlockRequest`

  returns: A DeletePublicAccessBlockResult. - `com.amazonaws.services.s3.model.DeletePublicAccessBlockResult`"
  (^com.amazonaws.services.s3.model.DeletePublicAccessBlockResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.DeletePublicAccessBlockRequest request]
    (-> this (.deletePublicAccessBlock request))))

(defn delete-bucket-inventory-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket from which the inventory configuration is to be deleted. - `java.lang.String`
  id - The ID of the inventory configuration to delete. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.deleteBucketInventoryConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationRequest delete-bucket-inventory-configuration-request]
    (-> this (.deleteBucketInventoryConfiguration delete-bucket-inventory-configuration-request))))

(defn get-object
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the desired object. - `java.lang.String`
  key - The key under which the desired object is stored. - `java.lang.String`

  returns: The object stored in Amazon S3 in the specified bucket and key. - `com.amazonaws.services.s3.model.S3Object`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.S3Object [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObject bucket-name key)))
  (^com.amazonaws.services.s3.model.S3Object [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetObjectRequest get-object-request]
    (-> this (.getObject get-object-request))))

(defn delete-object-tagging
  "Description copied from interface: AmazonS3

  delete-object-tagging-request - The request object containing all the options for deleting the tags for the specified object. - `com.amazonaws.services.s3.model.DeleteObjectTaggingRequest`

  returns: a DeleteObjectTaggingResult object containing the
   information returned by S3 for the the tag deletion. - `com.amazonaws.services.s3.model.DeleteObjectTaggingResult`"
  (^com.amazonaws.services.s3.model.DeleteObjectTaggingResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.DeleteObjectTaggingRequest delete-object-tagging-request]
    (-> this (.deleteObjectTagging delete-object-tagging-request))))

(defn requester-pays-enabled?
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket being checked for Requester Pays. - `java.lang.String`

  returns: true if the bucket is enabled for Requester Pays else false. - `boolean`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^Boolean [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.isRequesterPaysEnabled bucket-name))))

(defn set-public-access-block
  "Description copied from interface: AmazonS3

  request - The request object for setting the buckets Public Access Block configuration. - `com.amazonaws.services.s3.model.SetPublicAccessBlockRequest`

  returns: A SetPublicAccessBlockResult. - `com.amazonaws.services.s3.model.SetPublicAccessBlockResult`"
  (^com.amazonaws.services.s3.model.SetPublicAccessBlockResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetPublicAccessBlockRequest request]
    (-> this (.setPublicAccessBlock request))))

(defn get-bucket-accelerate-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose accelerate configuration is being fetched. - `java.lang.String`

  returns: the accelerate configuration of the bucket. - `com.amazonaws.services.s3.model.BucketAccelerateConfiguration`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^com.amazonaws.services.s3.model.BucketAccelerateConfiguration [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketAccelerateConfiguration bucket-name))))

(defn restore-object
  "Description copied from interface: AmazonS3

  bucket-name - The name of an existing bucket. - `java.lang.String`
  key - The key under which to store the specified file. - `java.lang.String`
  expiration-in-days - The number of days after which the object will expire. - `int`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^Integer expiration-in-days]
    (-> this (.restoreObject bucket-name key expiration-in-days)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.RestoreObjectRequest request]
    (-> this (.restoreObject request))))

(defn delete-bucket-lifecycle-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to remove the lifecycle configuration. - `java.lang.String`"
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketLifecycleConfiguration bucket-name))))

(defn set-bucket-inventory-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to set the inventory configuration to. - `java.lang.String`
  inventory-configuration - The inventory configuration to set. - `com.amazonaws.services.s3.model.inventory.InventoryConfiguration`

  returns: `com.amazonaws.services.s3.model.SetBucketInventoryConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetBucketInventoryConfigurationResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.inventory.InventoryConfiguration inventory-configuration]
    (-> this (.setBucketInventoryConfiguration bucket-name inventory-configuration)))
  (^com.amazonaws.services.s3.model.SetBucketInventoryConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketInventoryConfigurationRequest set-bucket-inventory-configuration-request]
    (-> this (.setBucketInventoryConfiguration set-bucket-inventory-configuration-request))))

(defn list-objects-v-2
  "bucket-name - `java.lang.String`
  prefix - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.ListObjectsV2Result`

  throws: com.amazonaws.SdkClientException"
  (^com.amazonaws.services.s3.model.ListObjectsV2Result [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String prefix]
    (-> this (.listObjectsV2 bucket-name prefix)))
  (^com.amazonaws.services.s3.model.ListObjectsV2Result [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.listObjectsV2 bucket-name))))

(defn get-bucket-website-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose website configuration is being retrieved. - `java.lang.String`

  returns: The bucket website configuration for the specified bucket,
           otherwise null if there is no website configuration set for the
           specified bucket. - `com.amazonaws.services.s3.model.BucketWebsiteConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketWebsiteConfiguration [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketWebsiteConfiguration bucket-name))))

(defn set-bucket-logging-configuration
  "Description copied from interface: AmazonS3

  set-bucket-logging-configuration-request - The request object containing all options for setting the bucket logging configuration. - `com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest set-bucket-logging-configuration-request]
    (-> this (.setBucketLoggingConfiguration set-bucket-logging-configuration-request))))

(defn set-bucket-website-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose website configuration is being set. - `java.lang.String`
  configuration - The configuration describing how the specified bucket will serve web requests (i.e. default index page, error page). - `com.amazonaws.services.s3.model.BucketWebsiteConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketWebsiteConfiguration configuration]
    (-> this (.setBucketWebsiteConfiguration bucket-name configuration)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest set-bucket-website-configuration-request]
    (-> this (.setBucketWebsiteConfiguration set-bucket-website-configuration-request))))

(defn get-public-access-block
  "Description copied from interface: AmazonS3

  request - The request object for getting the buckets Public Access Block configuration. - `com.amazonaws.services.s3.model.GetPublicAccessBlockRequest`

  returns: A GetPublicAccessBlockResult. - `com.amazonaws.services.s3.model.GetPublicAccessBlockResult`"
  (^com.amazonaws.services.s3.model.GetPublicAccessBlockResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetPublicAccessBlockRequest request]
    (-> this (.getPublicAccessBlock request))))

(defn set-bucket-replication-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The Amazon S3 bucket for which the replication configuration is set. - `java.lang.String`
  configuration - The replication configuration. - `com.amazonaws.services.s3.model.BucketReplicationConfiguration`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketReplicationConfiguration configuration]
    (-> this (.setBucketReplicationConfiguration bucket-name configuration)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketReplicationConfigurationRequest set-bucket-replication-configuration-request]
    (-> this (.setBucketReplicationConfiguration set-bucket-replication-configuration-request))))

(defn list-next-batch-of-objects
  "Description copied from interface: AmazonS3

  previous-object-listing - The previous truncated ObjectListing. If a non-truncated ObjectListing is passed in, an empty ObjectListing is returned without ever contacting Amazon S3. - `com.amazonaws.services.s3.model.ObjectListing`

  returns: The next set of ObjectListing results, beginning immediately
           after the last result in the specified previous ObjectListing. - `com.amazonaws.services.s3.model.ObjectListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.ObjectListing [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.ObjectListing previous-object-listing]
    (-> this (.listNextBatchOfObjects previous-object-listing))))

(defn set-object-redirect-location
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object. - `java.lang.String`
  key - The key of the object within the specified bucket. - `java.lang.String`
  new-redirect-location - The new redirect location for the specified object. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String new-redirect-location]
    (-> this (.setObjectRedirectLocation bucket-name key new-redirect-location))))

(defn get-bucket-policy-status
  "Description copied from interface: AmazonS3

  request - The request object for getting the current policy status of the bucket. - `com.amazonaws.services.s3.model.GetBucketPolicyStatusRequest`

  returns: A DeletePublicAccessBlockResult. - `com.amazonaws.services.s3.model.GetBucketPolicyStatusResult`"
  (^com.amazonaws.services.s3.model.GetBucketPolicyStatusResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetBucketPolicyStatusRequest request]
    (-> this (.getBucketPolicyStatus request))))

(defn set-bucket-accelerate-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose accelerate configuration is being set. - `java.lang.String`
  accelerate-configuration - The new accelerate configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketAccelerateConfiguration`

  throws: com.amazonaws.AmazonServiceException"
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketAccelerateConfiguration accelerate-configuration]
    (-> this (.setBucketAccelerateConfiguration bucket-name accelerate-configuration)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest set-bucket-accelerate-configuration-request]
    (-> this (.setBucketAccelerateConfiguration set-bucket-accelerate-configuration-request))))

(defn abort-multipart-upload
  "Description copied from interface: AmazonS3

  request - The AbortMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.AbortMultipartUploadRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.AbortMultipartUploadRequest request]
    (-> this (.abortMultipartUpload request))))

(defn list-bucket-metrics-configurations
  "Description copied from interface: AmazonS3

  list-bucket-metrics-configurations-request - The request object to list all the metrics configurations for a bucket. - `com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsRequest`

  returns: The result containing the list of all the metrics configurations for the bucket. - `com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsRequest list-bucket-metrics-configurations-request]
    (-> this (.listBucketMetricsConfigurations list-bucket-metrics-configurations-request))))

(defn get-bucket-logging-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose bucket logging configuration is being retrieved. - `java.lang.String`

  returns: The bucket logging configuration for the specified bucket. - `com.amazonaws.services.s3.model.BucketLoggingConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketLoggingConfiguration [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketLoggingConfiguration bucket-name))))

(defn delete-bucket-cross-origin-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve cross origin configuration. - `java.lang.String`"
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketCrossOriginConfiguration bucket-name))))

(defn set-bucket-acl
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose ACL is being set. - `java.lang.String`
  acl - The new AccessControlList for the specified bucket. - `com.amazonaws.services.s3.model.AccessControlList`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.AccessControlList acl]
    (-> this (.setBucketAcl bucket-name acl)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketAclRequest set-bucket-acl-request]
    (-> this (.setBucketAcl set-bucket-acl-request))))

(defn set-object-retention
  "Description copied from interface: AmazonS3

  set-object-retention-request - The request object for setting the object retention. - `com.amazonaws.services.s3.model.SetObjectRetentionRequest`

  returns: A SetObjectRetentionResult. - `com.amazonaws.services.s3.model.SetObjectRetentionResult`"
  (^com.amazonaws.services.s3.model.SetObjectRetentionResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetObjectRetentionRequest set-object-retention-request]
    (-> this (.setObjectRetention set-object-retention-request))))

(defn set-endpoint
  "Description copied from interface: AmazonS3

  endpoint - The endpoint (e.g. \"s3.amazonaws.com\") or the full URL, including the protocol (e.g. \"https://s3.amazonaws.com\"), of the region-specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonS3 this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-bucket-lifecycle-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve lifecycle configuration. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.BucketLifecycleConfiguration`"
  (^com.amazonaws.services.s3.model.BucketLifecycleConfiguration [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketLifecycleConfiguration bucket-name))))

(defn delete-bucket
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to delete. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucket bucket-name))))

(defn restore-object-v-2
  "Description copied from interface: AmazonS3

  request - The request object containing all the options for restoring an Amazon S3 object. - `com.amazonaws.services.s3.model.RestoreObjectRequest`

  returns: A RestoreObjectResult from Amazon S3. - `com.amazonaws.services.s3.model.RestoreObjectResult`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^com.amazonaws.services.s3.model.RestoreObjectResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.RestoreObjectRequest request]
    (-> this (.restoreObjectV2 request))))

(defn initiate-multipart-upload
  "Description copied from interface: AmazonS3

  request - The InitiateMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.InitiateMultipartUploadRequest`

  returns: An InitiateMultipartUploadResult from Amazon S3. - `com.amazonaws.services.s3.model.InitiateMultipartUploadResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.InitiateMultipartUploadResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.InitiateMultipartUploadRequest request]
    (-> this (.initiateMultipartUpload request))))

(defn list-bucket-inventory-configurations
  "Description copied from interface: AmazonS3

  list-bucket-inventory-configurations-request - The request object to list the inventory configurations in a bucket. - `com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsRequest`

  returns: An ListBucketInventoryConfigurationsResult object containing the list of InventoryConfigurations. - `com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsRequest list-bucket-inventory-configurations-request]
    (-> this (.listBucketInventoryConfigurations list-bucket-inventory-configurations-request))))

(defn get-bucket-analytics-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to get the analytics configuration from. - `java.lang.String`
  id - The ID of the analytics configuration to get. - `java.lang.String`

  returns: The result containing the requested analytics configuration. - `com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.getBucketAnalyticsConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationRequest get-bucket-analytics-configuration-request]
    (-> this (.getBucketAnalyticsConfiguration get-bucket-analytics-configuration-request))))

(defn get-object-metadata
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object's whose metadata is being retrieved. - `java.lang.String`
  key - The key of the object whose metadata is being retrieved. - `java.lang.String`

  returns: All Amazon S3 object metadata for the specified object. - `com.amazonaws.services.s3.model.ObjectMetadata`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.ObjectMetadata [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObjectMetadata bucket-name key)))
  (^com.amazonaws.services.s3.model.ObjectMetadata [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetObjectMetadataRequest get-object-metadata-request]
    (-> this (.getObjectMetadata get-object-metadata-request))))

(defn set-bucket-cross-origin-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve cross origin configuration. - `java.lang.String`
  bucket-cross-origin-configuration - The new cross origin configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketCrossOriginConfiguration`"
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketCrossOriginConfiguration bucket-cross-origin-configuration]
    (-> this (.setBucketCrossOriginConfiguration bucket-name bucket-cross-origin-configuration)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketCrossOriginConfigurationRequest set-bucket-cross-origin-configuration-request]
    (-> this (.setBucketCrossOriginConfiguration set-bucket-cross-origin-configuration-request))))

(defn delete-bucket-policy
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose policy is being deleted. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketPolicy bucket-name))))

(defn head-bucket
  "Description copied from interface: AmazonS3

  head-bucket-request - The request containing the bucket name. - `com.amazonaws.services.s3.model.HeadBucketRequest`

  returns: This method returns a HeadBucketResult if the bucket exists and you have
           permission to access it. Otherwise, the method will throw an
           AmazonServiceException with status code '404 Not Found' if the bucket
           does not exist, '403 Forbidden' if the user does not have access to the
           bucket, or '301 Moved Permanently' if the bucket is in a different region
           than the client is configured with - `com.amazonaws.services.s3.model.HeadBucketResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.HeadBucketResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.HeadBucketRequest head-bucket-request]
    (-> this (.headBucket head-bucket-request))))

(defn list-buckets
  "Description copied from interface: AmazonS3

  list-buckets-request - The request containing all of the options related to the listing of buckets. - `com.amazonaws.services.s3.model.ListBucketsRequest`

  returns: A list of all of the Amazon S3 buckets owned by the authenticated
           sender of the request. - `java.util.List<com.amazonaws.services.s3.model.Bucket>`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^java.util.List [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.ListBucketsRequest list-buckets-request]
    (-> this (.listBuckets list-buckets-request)))
  (^java.util.List [^AbstractAmazonS3 this]
    (-> this (.listBuckets))))

(defn set-bucket-encryption
  "Description copied from interface: AmazonS3

  request - The request object for setting the bucket encryption configuration. - `com.amazonaws.services.s3.model.SetBucketEncryptionRequest`

  returns: A SetBucketEncryptionResult. - `com.amazonaws.services.s3.model.SetBucketEncryptionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetBucketEncryptionResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketEncryptionRequest request]
    (-> this (.setBucketEncryption request))))

(defn set-object-acl
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object whose ACL is being set. - `java.lang.String`
  key - The key of the object within the specified bucket whose ACL is being set. - `java.lang.String`
  version-id - The version ID of the object version whose ACL is being set. - `java.lang.String`
  acl - The new AccessControlList for the specified object. - `com.amazonaws.services.s3.model.AccessControlList`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id ^com.amazonaws.services.s3.model.AccessControlList acl]
    (-> this (.setObjectAcl bucket-name key version-id acl)))
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^com.amazonaws.services.s3.model.AccessControlList acl]
    (-> this (.setObjectAcl bucket-name key acl)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetObjectAclRequest set-object-acl-request]
    (-> this (.setObjectAcl set-object-acl-request))))

(defn get-bucket-metrics-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to get the metrics configuration from. - `java.lang.String`
  id - The ID of the metrics configuration to get. - `java.lang.String`

  returns: The result containing the requested metrics configuration. - `com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.getBucketMetricsConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetBucketMetricsConfigurationRequest get-bucket-metrics-configuration-request]
    (-> this (.getBucketMetricsConfiguration get-bucket-metrics-configuration-request))))

(defn get-object-acl
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object whose ACL is being retrieved. - `java.lang.String`
  key - The key of the object within the specified bucket whose ACL is being retrieved. - `java.lang.String`
  version-id - The version ID of the object version whose ACL is being retrieved. - `java.lang.String`

  returns: The AccessControlList for the specified Amazon S3 object. - `com.amazonaws.services.s3.model.AccessControlList`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.AccessControlList [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id]
    (-> this (.getObjectAcl bucket-name key version-id)))
  (^com.amazonaws.services.s3.model.AccessControlList [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObjectAcl bucket-name key)))
  (^com.amazonaws.services.s3.model.AccessControlList [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetObjectAclRequest get-object-acl-request]
    (-> this (.getObjectAcl get-object-acl-request))))

(defn get-bucket-policy
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose policy is being retrieved. - `java.lang.String`

  returns: The Amazon S3 bucket policy for the specified bucket. - `com.amazonaws.services.s3.model.BucketPolicy`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketPolicy [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketPolicy bucket-name))))

(defn list-objects
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket to list. - `java.lang.String`
  prefix - An optional parameter restricting the response to keys beginning with the specified prefix. Use prefixes to separate a bucket into different sets of keys, similar to how a file system organizes files into directories. - `java.lang.String`

  returns: A listing of the objects in the specified bucket, along with any
           other associated information, such as common prefixes (if a
           delimiter was specified), the original request parameters, etc. - `com.amazonaws.services.s3.model.ObjectListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.ObjectListing [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String prefix]
    (-> this (.listObjects bucket-name prefix)))
  (^com.amazonaws.services.s3.model.ObjectListing [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.listObjects bucket-name))))

(defn delete-bucket-analytics-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket from which the analytics configuration is to be deleted - `java.lang.String`
  id - The ID of the analytics configuration to delete. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.deleteBucketAnalyticsConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationRequest delete-bucket-analytics-configuration-request]
    (-> this (.deleteBucketAnalyticsConfiguration delete-bucket-analytics-configuration-request))))

(defn change-object-storage-class
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object. - `java.lang.String`
  key - The key of the object within the specified bucket. - `java.lang.String`
  new-storage-class - The new storage class for the specified object. - `com.amazonaws.services.s3.model.StorageClass`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^com.amazonaws.services.s3.model.StorageClass new-storage-class]
    (-> this (.changeObjectStorageClass bucket-name key new-storage-class))))

(defn set-bucket-notification-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose notification configuration is being set. - `java.lang.String`
  bucket-notification-configuration - The request object containing all options for setting the bucket notification configuration. - `com.amazonaws.services.s3.model.BucketNotificationConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketNotificationConfiguration bucket-notification-configuration]
    (-> this (.setBucketNotificationConfiguration bucket-name bucket-notification-configuration)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketNotificationConfigurationRequest set-bucket-notification-configuration-request]
    (-> this (.setBucketNotificationConfiguration set-bucket-notification-configuration-request))))

(defn set-bucket-policy
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose policy is being set. - `java.lang.String`
  policy-text - The policy to apply to the specified bucket. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String policy-text]
    (-> this (.setBucketPolicy bucket-name policy-text)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketPolicyRequest set-bucket-policy-request]
    (-> this (.setBucketPolicy set-bucket-policy-request))))

(defn delete-object
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket containing the object to delete. - `java.lang.String`
  key - The key of the object to delete. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.deleteObject bucket-name key)))
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.DeleteObjectRequest delete-object-request]
    (-> this (.deleteObject delete-object-request))))

(defn set-object-tagging
  "Description copied from interface: AmazonS3

  set-object-tagging-request - The request object containing all the options for setting the tags for the specified object. - `com.amazonaws.services.s3.model.SetObjectTaggingRequest`

  returns: `com.amazonaws.services.s3.model.SetObjectTaggingResult`"
  (^com.amazonaws.services.s3.model.SetObjectTaggingResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetObjectTaggingRequest set-object-tagging-request]
    (-> this (.setObjectTagging set-object-tagging-request))))

(defn copy-part
  "Description copied from interface: AmazonS3

  copy-part-request - The request object containing all the options for copying an Amazon S3 object. - `com.amazonaws.services.s3.model.CopyPartRequest`

  returns: A CopyPartResult object containing the information
           returned by Amazon S3 about the newly created object, or null if
           constraints were specified that weren't met when Amazon S3 attempted
           to copy the object. - `com.amazonaws.services.s3.model.CopyPartResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.CopyPartResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.CopyPartRequest copy-part-request]
    (-> this (.copyPart copy-part-request))))

(defn does-bucket-exist-v-2
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to check. - `java.lang.String`

  returns: The value true if the specified bucket exists in
           Amazon S3; the value false if there is no bucket in
           Amazon S3 with that name. - `boolean`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^Boolean [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.doesBucketExistV2 bucket-name))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonS3

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or
           null if none is available. - `com.amazonaws.services.s3.S3ResponseMetadata`"
  (^com.amazonaws.services.s3.S3ResponseMetadata [^AbstractAmazonS3 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-object-legal-hold
  "Description copied from interface: AmazonS3

  set-object-legal-hold-request - The request object for setting the object legal hold. - `com.amazonaws.services.s3.model.SetObjectLegalHoldRequest`

  returns: A SetObjectLegalHoldResult. - `com.amazonaws.services.s3.model.SetObjectLegalHoldResult`"
  (^com.amazonaws.services.s3.model.SetObjectLegalHoldResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetObjectLegalHoldRequest set-object-legal-hold-request]
    (-> this (.setObjectLegalHold set-object-legal-hold-request))))

(defn disable-requester-pays
  "Description copied from interface: AmazonS3

  bucket-name - The name of bucket being disabled for Requester Pays. - `java.lang.String`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.disableRequesterPays bucket-name))))

(defn put-object
  "Description copied from interface: AmazonS3

  bucket-name - The name of an existing bucket, to which you have Permission.Write permission. - `java.lang.String`
  key - The key under which to store the specified file. - `java.lang.String`
  input - The input stream containing the data to be uploaded to Amazon S3. - `java.io.InputStream`
  metadata - Additional metadata instructing Amazon S3 how to handle the uploaded data (e.g. custom user metadata, hooks for specifying content type, etc.). - `com.amazonaws.services.s3.model.ObjectMetadata`

  returns: A PutObjectResult object containing the information
           returned by Amazon S3 for the newly created object. - `com.amazonaws.services.s3.model.PutObjectResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.PutObjectResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.io.InputStream input ^com.amazonaws.services.s3.model.ObjectMetadata metadata]
    (-> this (.putObject bucket-name key input metadata)))
  (^com.amazonaws.services.s3.model.PutObjectResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.io.File file]
    (-> this (.putObject bucket-name key file)))
  (^com.amazonaws.services.s3.model.PutObjectResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.PutObjectRequest put-object-request]
    (-> this (.putObject put-object-request))))

(defn get-bucket-tagging-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve tagging configuration. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.BucketTaggingConfiguration`"
  (^com.amazonaws.services.s3.model.BucketTaggingConfiguration [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketTaggingConfiguration bucket-name))))

(defn get-bucket-versioning-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The bucket whose versioning configuration will be retrieved. - `java.lang.String`

  returns: The bucket versioning configuration for the specified bucket. - `com.amazonaws.services.s3.model.BucketVersioningConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketVersioningConfiguration [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketVersioningConfiguration bucket-name))))

(defn get-bucket-replication-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The bucket name for which the replication configuration is to be retrieved. - `java.lang.String`

  returns: the replication configuration of the bucket. - `com.amazonaws.services.s3.model.BucketReplicationConfiguration`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^com.amazonaws.services.s3.model.BucketReplicationConfiguration [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketReplicationConfiguration bucket-name))))

(defn set-bucket-versioning-configuration
  "Description copied from interface: AmazonS3

  set-bucket-versioning-configuration-request - The request object containing all options for setting the bucket versioning configuration. - `com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest set-bucket-versioning-configuration-request]
    (-> this (.setBucketVersioningConfiguration set-bucket-versioning-configuration-request))))

(defn set-bucket-metrics-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to set the metrics configuration. - `java.lang.String`
  metrics-configuration - The metrics configuration to set. - `com.amazonaws.services.s3.model.metrics.MetricsConfiguration`

  returns: `com.amazonaws.services.s3.model.SetBucketMetricsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetBucketMetricsConfigurationResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.metrics.MetricsConfiguration metrics-configuration]
    (-> this (.setBucketMetricsConfiguration bucket-name metrics-configuration)))
  (^com.amazonaws.services.s3.model.SetBucketMetricsConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.SetBucketMetricsConfigurationRequest set-bucket-metrics-configuration-request]
    (-> this (.setBucketMetricsConfiguration set-bucket-metrics-configuration-request))))

(defn get-object-retention
  "Description copied from interface: AmazonS3

  get-object-retention-request - The request object for getting the object retention. - `com.amazonaws.services.s3.model.GetObjectRetentionRequest`

  returns: A GetObjectRetentionResult. - `com.amazonaws.services.s3.model.GetObjectRetentionResult`"
  (^com.amazonaws.services.s3.model.GetObjectRetentionResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetObjectRetentionRequest get-object-retention-request]
    (-> this (.getObjectRetention get-object-retention-request))))

(defn does-object-exist
  "bucket-name - Name of bucket that presumably contains object - `java.lang.String`
  object-name - Name of object that has to be checked - `java.lang.String`

  returns: result of the search - `boolean`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^Boolean [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String object-name]
    (-> this (.doesObjectExist bucket-name object-name))))

(defn does-bucket-exist
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to check. - `java.lang.String`

  returns: The value true if the specified bucket exists in
           Amazon S3; the value false if there is no bucket in
           Amazon S3 with that name. - `boolean`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^Boolean [^AbstractAmazonS3 this ^java.lang.String bucket-name]
    (-> this (.doesBucketExist bucket-name))))

(defn get-bucket-inventory-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to get the inventory configuration from. - `java.lang.String`
  id - The ID of the inventory configuration to delete. - `java.lang.String`

  returns: An GetBucketInventoryConfigurationResult object containing the inventory configuration. - `com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult [^AbstractAmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.getBucketInventoryConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult [^AbstractAmazonS3 this ^com.amazonaws.services.s3.model.GetBucketInventoryConfigurationRequest get-bucket-inventory-configuration-request]
    (-> this (.getBucketInventoryConfiguration get-bucket-inventory-configuration-request))))

