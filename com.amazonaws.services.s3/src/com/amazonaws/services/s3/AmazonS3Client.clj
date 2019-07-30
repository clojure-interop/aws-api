(ns com.amazonaws.services.s3.AmazonS3Client
  " Provides the client for accessing the Amazon S3 web service.


  Amazon S3 provides storage for the Internet,
  and is designed to make web-scale computing easier for developers.


  The Amazon S3 Java Client provides a simple interface that can be
  used to store and retrieve any amount of data, at any time,
  from anywhere on the web. It gives any developer access to the same
  highly scalable, reliable, secure, fast, inexpensive infrastructure
  that Amazon uses to run its own global network of web sites.
  The service aims to maximize benefits of scale and to pass those
  benefits on to developers.


  For more information about Amazon S3, please see

  http://aws.amazon.com/s3"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 AmazonS3Client]))

(defn ->amazon-s-3-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon S3 (e.g. proxy settings, retry counts, etc). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonS3Client [^com.amazonaws.auth.AWSCredentialsProvider credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonS3Client credentials-provider client-configuration request-metric-collector))
  (^AmazonS3Client [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonS3Client aws-credentials client-configuration))
  (^AmazonS3Client [^com.amazonaws.auth.AWSCredentials aws-credentials]
    (new AmazonS3Client aws-credentials))
  (^AmazonS3Client []
    (new AmazonS3Client )))

(def *-s-3-service-name
  "Static Constant.

  type: java.lang.String"
  AmazonS3Client/S3_SERVICE_NAME)

(defn *builder
  "returns: `com.amazonaws.services.s3.AmazonS3ClientBuilder`"
  (^com.amazonaws.services.s3.AmazonS3ClientBuilder []
    (AmazonS3Client/builder )))

(defn set-object-lock-configuration
  "Description copied from interface: AmazonS3

  set-object-lock-configuration-request - The request object for setting the object lock configuration. - `com.amazonaws.services.s3.model.SetObjectLockConfigurationRequest`

  returns: A SetObjectLockConfigurationResult. - `com.amazonaws.services.s3.model.SetObjectLockConfigurationResult`"
  (^com.amazonaws.services.s3.model.SetObjectLockConfigurationResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.SetObjectLockConfigurationRequest set-object-lock-configuration-request]
    (-> this (.setObjectLockConfiguration set-object-lock-configuration-request))))

(defn get-object-as-string
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object to retrieve. - `java.lang.String`
  key - The key of the object to retrieve. - `java.lang.String`

  returns: contents of the object as a String - `java.lang.String`

  throws: com.amazonaws.AmazonServiceException"
  (^java.lang.String [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObjectAsString bucket-name key))))

(defn upload-part
  "Description copied from interface: AmazonS3

  upload-part-request - The UploadPartRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.UploadPartRequest`

  returns: An UploadPartResult from Amazon S3 containing the part number and
           ETag of the new part. - `com.amazonaws.services.s3.model.UploadPartResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.UploadPartResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.UploadPartRequest upload-part-request]
    (-> this (.uploadPart upload-part-request))))

(defn get-bucket-encryption
  "Description copied from interface: AmazonS3

  bucket-name - Name of the bucket to retrieve encryption configuration for. - `java.lang.String`

  returns: A GetBucketEncryptionResult. - `com.amazonaws.services.s3.model.GetBucketEncryptionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketEncryptionResult [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketEncryption bucket-name))))

(defn set-region
  "Deprecated. use AwsClientBuilder.setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. - `com.amazonaws.regions.Region`"
  ([^AmazonS3Client this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn set-s-3-client-options
  "Override the default S3 client options for this client. Also set the
   endpoint to s3-accelerate if such is specified in the S3 client options.

  client-options - The S3 client options to use. - `com.amazonaws.services.s3.S3ClientOptions`"
  ([^AmazonS3Client this ^com.amazonaws.services.s3.S3ClientOptions client-options]
    (-> this (.setS3ClientOptions client-options))))

(defn get-object-tagging
  "Description copied from interface: AmazonS3

  get-object-tagging-request - The request object containing all the options on how to retrieve the Amazon S3 object tags. - `com.amazonaws.services.s3.model.GetObjectTaggingRequest`

  returns: The tags for the specified object. - `com.amazonaws.services.s3.model.GetObjectTaggingResult`"
  (^com.amazonaws.services.s3.model.GetObjectTaggingResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetObjectTaggingRequest get-object-tagging-request]
    (-> this (.getObjectTagging get-object-tagging-request))))

(defn get-bucket-acl
  "Gets the AccessControlList (ACL) for the specified Amazon S3 bucket.


   Each bucket and object in Amazon S3 has an ACL that defines its access
   control policy. When a request is made, Amazon S3 authenticates the
   request using its standard authentication procedure and then checks the
   ACL to verify the sender was granted access to the bucket or object. If
   the sender is approved, the request proceeds. Otherwise, Amazon S3
   returns an error.

  bucket-name - The name of the bucket whose ACL is being retrieved. - `java.lang.String`

  returns: The AccessControlList for the specified S3 bucket. - `com.amazonaws.services.s3.model.AccessControlList`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.AccessControlList [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketAcl bucket-name))))

(defn complete-multipart-upload
  "Description copied from interface: AmazonS3

  complete-multipart-upload-request - The CompleteMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.CompleteMultipartUploadRequest`

  returns: A CompleteMultipartUploadResult from S3 containing the ETag for
           the new object composed of the individual parts. - `com.amazonaws.services.s3.model.CompleteMultipartUploadResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.CompleteMultipartUploadResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.CompleteMultipartUploadRequest complete-multipart-upload-request]
    (-> this (.completeMultipartUpload complete-multipart-upload-request))))

(defn list-multipart-uploads
  "Description copied from interface: AmazonS3

  list-multipart-uploads-request - The ListMultipartUploadsRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.ListMultipartUploadsRequest`

  returns: A MultipartUploadListing from Amazon S3. - `com.amazonaws.services.s3.model.MultipartUploadListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.MultipartUploadListing [^AmazonS3Client this ^com.amazonaws.services.s3.model.ListMultipartUploadsRequest list-multipart-uploads-request]
    (-> this (.listMultipartUploads list-multipart-uploads-request))))

(defn get-url
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object whose URL is being requested. - `java.lang.String`
  key - The key under which the object whose URL is being requested is stored. - `java.lang.String`

  returns: A unique URL for the object stored in the specified bucket and
           key. - `java.net.URL`"
  (^java.net.URL [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getUrl bucket-name key))))

(defn delete-version
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket containing the object to delete. - `java.lang.String`
  key - The key of the object to delete. - `java.lang.String`
  version-id - The version of the object to delete. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id]
    (-> this (.deleteVersion bucket-name key version-id)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.DeleteVersionRequest delete-version-request]
    (-> this (.deleteVersion delete-version-request))))

(defn delete-bucket-tagging-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to remove the tagging configuration. - `java.lang.String`"
  ([^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.deleteBucketTaggingConfiguration bucket-name))))

(defn delete-bucket-encryption
  "Description copied from interface: AmazonS3

  bucket-name - `java.lang.String`

  returns: A DeleteBucketEncryptionResult. - `com.amazonaws.services.s3.model.DeleteBucketEncryptionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeleteBucketEncryptionResult [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.deleteBucketEncryption bucket-name))))

(defn create-bucket
  "Deprecated.

  bucket-name - The name of the bucket to create. - `java.lang.String`
  region - The Amazon S3 region in which to create the new bucket. - `com.amazonaws.services.s3.model.Region`

  returns: The newly created bucket. - `com.amazonaws.services.s3.model.Bucket`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.Bucket [^AmazonS3Client this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.Region region]
    (-> this (.createBucket bucket-name region)))
  (^com.amazonaws.services.s3.model.Bucket [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.createBucket bucket-name))))

(defn get-bucket-notification-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The bucket whose notification configuration will be retrieved. - `java.lang.String`

  returns: The bucket notification configuration for the specified bucket. - `com.amazonaws.services.s3.model.BucketNotificationConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketNotificationConfiguration [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketNotificationConfiguration bucket-name))))

(defn get-bucket-location
  "Description copied from interface: AmazonS3

  get-bucket-location-request - The request object containing the name of the Amazon S3 bucket to look up. This must be a bucket the user owns. - `com.amazonaws.services.s3.model.GetBucketLocationRequest`

  returns: The location of the specified Amazon S3 bucket. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^java.lang.String [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetBucketLocationRequest get-bucket-location-request]
    (-> this (.getBucketLocation get-bucket-location-request))))

(defn delete-objects
  "Description copied from interface: AmazonS3

  delete-objects-request - The request object containing all options for deleting multiple objects. - `com.amazonaws.services.s3.model.DeleteObjectsRequest`

  returns: `com.amazonaws.services.s3.model.DeleteObjectsResult`"
  (^com.amazonaws.services.s3.model.DeleteObjectsResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.DeleteObjectsRequest delete-objects-request]
    (-> this (.deleteObjects delete-objects-request))))

(defn set-bucket-tagging-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to set the tagging configuration. - `java.lang.String`
  bucket-tagging-configuration - The new tagging configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketTaggingConfiguration`"
  ([^AmazonS3Client this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketTaggingConfiguration bucket-tagging-configuration]
    (-> this (.setBucketTaggingConfiguration bucket-name bucket-tagging-configuration)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketTaggingConfigurationRequest set-bucket-tagging-configuration-request]
    (-> this (.setBucketTaggingConfiguration set-bucket-tagging-configuration-request))))

(defn list-versions
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose versions are to be listed. - `java.lang.String`
  prefix - An optional parameter restricting the response to keys that begin with the specified prefix. Use prefixes to separate a bucket into different sets of keys, similar to how a file system organizes files into directories. - `java.lang.String`
  key-marker - Optional parameter indicating where in the sorted list of all versions in the specified bucket to begin returning results. Results are always ordered first lexicographically (i.e. alphabetically) and then from most recent version to least recent version. If a keyMarker is used without a versionIdMarker, results begin immediately after that key's last version. When a keyMarker is used with a versionIdMarker, results begin immediately after the version with the specified key and version ID. This enables pagination; to get the next page of results use the next key marker and next version ID marker (from VersionListing.getNextKeyMarker() and VersionListing.getNextVersionIdMarker()) as the markers for the next request to list versions, or use the convenience method AmazonS3.listNextBatchOfVersions(VersionListing) - `java.lang.String`
  version-id-marker - Optional parameter indicating where in the sorted list of all versions in the specified bucket to begin returning results. Results are always ordered first lexicographically (i.e. alphabetically) and then from most recent version to least recent version. A keyMarker must be specified when specifying a versionIdMarker. Results begin immediately after the version with the specified key and version ID. This enables pagination; to get the next page of results use the next key marker and next version ID marker (from VersionListing.getNextKeyMarker() and VersionListing.getNextVersionIdMarker()) as the markers for the next request to list versions, or use the convenience method AmazonS3.listNextBatchOfVersions(VersionListing) - `java.lang.String`
  delimiter - Optional parameter that causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be rolled up into a single result element in the VersionListing.getCommonPrefixes() list. These rolled-up keys are not returned elsewhere in the response. The most commonly used delimiter is \"/\", which simulates a hierarchical organization similar to a file system directory structure. - `java.lang.String`
  max-keys - Optional parameter indicating the maximum number of results to include in the response. Amazon S3 might return fewer than this, but will not return more. Even if maxKeys is not specified, Amazon S3 will limit the number of results in the response. - `java.lang.Integer`

  returns: A listing of the versions in the specified bucket, along with any
           other associated information such as common prefixes (if a
           delimiter was specified), the original request parameters, etc. - `com.amazonaws.services.s3.model.VersionListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.VersionListing [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String prefix ^java.lang.String key-marker ^java.lang.String version-id-marker ^java.lang.String delimiter ^java.lang.Integer max-keys]
    (-> this (.listVersions bucket-name prefix key-marker version-id-marker delimiter max-keys)))
  (^com.amazonaws.services.s3.model.VersionListing [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String prefix]
    (-> this (.listVersions bucket-name prefix)))
  (^com.amazonaws.services.s3.model.VersionListing [^AmazonS3Client this ^com.amazonaws.services.s3.model.ListVersionsRequest list-versions-request]
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
  (^com.amazonaws.services.s3.model.CopyObjectResult [^AmazonS3Client this ^java.lang.String source-bucket-name ^java.lang.String source-key ^java.lang.String destination-bucket-name ^java.lang.String destination-key]
    (-> this (.copyObject source-bucket-name source-key destination-bucket-name destination-key)))
  (^com.amazonaws.services.s3.model.CopyObjectResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.CopyObjectRequest copy-object-request]
    (-> this (.copyObject copy-object-request))))

(defn get-object-lock-configuration
  "Description copied from interface: AmazonS3

  get-object-lock-configuration-request - The request object for getting the object lock configuration. - `com.amazonaws.services.s3.model.GetObjectLockConfigurationRequest`

  returns: A GetObjectLockConfigurationResult. - `com.amazonaws.services.s3.model.GetObjectLockConfigurationResult`"
  (^com.amazonaws.services.s3.model.GetObjectLockConfigurationResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetObjectLockConfigurationRequest get-object-lock-configuration-request]
    (-> this (.getObjectLockConfiguration get-object-lock-configuration-request))))

(defn get-bucket-cross-origin-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve cross origin configuration. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.BucketCrossOriginConfiguration`"
  (^com.amazonaws.services.s3.model.BucketCrossOriginConfiguration [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketCrossOriginConfiguration bucket-name))))

(defn list-next-batch-of-versions
  "Description copied from interface: AmazonS3

  previous-version-listing - The previous truncated VersionListing. If a non-truncated VersionListing is passed in, an empty VersionListing is returned without ever contacting Amazon S3. - `com.amazonaws.services.s3.model.VersionListing`

  returns: The next set of VersionListing results, beginning immediately
           after the last result in the specified previous VersionListing. - `com.amazonaws.services.s3.model.VersionListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.VersionListing [^AmazonS3Client this ^com.amazonaws.services.s3.model.VersionListing previous-version-listing]
    (-> this (.listNextBatchOfVersions previous-version-listing))))

(defn download
  "Description copied from interface: AmazonS3

  presigned-url-download-request - The request object to download the object. - `com.amazonaws.services.s3.model.PresignedUrlDownloadRequest`
  destination-file - Indicates the file (which might already exist) where to save the object content being downloading from Amazon S3. - `java.io.File`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.PresignedUrlDownloadRequest presigned-url-download-request ^java.io.File destination-file]
    (-> this (.download presigned-url-download-request destination-file)))
  (^com.amazonaws.services.s3.model.PresignedUrlDownloadResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.PresignedUrlDownloadRequest presigned-url-download-request]
    (-> this (.download presigned-url-download-request))))

(defn set-bucket-lifecycle-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to set the lifecycle configuration. - `java.lang.String`
  bucket-lifecycle-configuration - The new lifecycle configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketLifecycleConfiguration`"
  ([^AmazonS3Client this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketLifecycleConfiguration bucket-lifecycle-configuration]
    (-> this (.setBucketLifecycleConfiguration bucket-name bucket-lifecycle-configuration)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketLifecycleConfigurationRequest set-bucket-lifecycle-configuration-request]
    (-> this (.setBucketLifecycleConfiguration set-bucket-lifecycle-configuration-request))))

(defn get-s-3-account-owner
  "Description copied from interface: AmazonS3

  get-s-3-account-owner-request - The request object for retrieving the S3 account owner. - `com.amazonaws.services.s3.model.GetS3AccountOwnerRequest`

  returns: The account of the authenticated sender - `com.amazonaws.services.s3.model.Owner`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.Owner [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetS3AccountOwnerRequest get-s-3-account-owner-request]
    (-> this (.getS3AccountOwner get-s-3-account-owner-request)))
  (^com.amazonaws.services.s3.model.Owner [^AmazonS3Client this]
    (-> this (.getS3AccountOwner))))

(defn delete-bucket-website-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose website configuration is being deleted. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.deleteBucketWebsiteConfiguration bucket-name))))

(defn get-object-legal-hold
  "Description copied from interface: AmazonS3

  get-object-legal-hold-request - The request object for getting an object legal hold status. - `com.amazonaws.services.s3.model.GetObjectLegalHoldRequest`

  returns: A GetObjectLegalHoldResult. - `com.amazonaws.services.s3.model.GetObjectLegalHoldResult`"
  (^com.amazonaws.services.s3.model.GetObjectLegalHoldResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetObjectLegalHoldRequest get-object-legal-hold-request]
    (-> this (.getObjectLegalHold get-object-legal-hold-request))))

(defn upload
  "Description copied from interface: AmazonS3

  presigned-url-upload-request - `com.amazonaws.services.s3.model.PresignedUrlUploadRequest`

  returns: `com.amazonaws.services.s3.model.PresignedUrlUploadResult`"
  (^com.amazonaws.services.s3.model.PresignedUrlUploadResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.PresignedUrlUploadRequest presigned-url-upload-request]
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
  (^java.net.URL [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^java.util.Date expiration ^com.amazonaws.HttpMethod method]
    (-> this (.generatePresignedUrl bucket-name key expiration method)))
  (^java.net.URL [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^java.util.Date expiration]
    (-> this (.generatePresignedUrl bucket-name key expiration)))
  (^java.net.URL [^AmazonS3Client this ^com.amazonaws.services.s3.model.GeneratePresignedUrlRequest req]
    (-> this (.generatePresignedUrl req))))

(defn select-object-content
  "Description copied from interface: AmazonS3

  select-request - The request object for selecting object content. - `com.amazonaws.services.s3.model.SelectObjectContentRequest`

  returns: A SelectObjectContentResult. - `com.amazonaws.services.s3.model.SelectObjectContentResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SelectObjectContentResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.SelectObjectContentRequest select-request]
    (-> this (.selectObjectContent select-request))))

(defn list-parts
  "Description copied from interface: AmazonS3

  list-parts-request - The ListPartsRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.ListPartsRequest`

  returns: Returns a PartListing from Amazon S3. - `com.amazonaws.services.s3.model.PartListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.PartListing [^AmazonS3Client this ^com.amazonaws.services.s3.model.ListPartsRequest list-parts-request]
    (-> this (.listParts list-parts-request))))

(defn delete-public-access-block
  "Description copied from interface: AmazonS3

  delete-public-access-block-request - The request object for deleting the buckets Public Access Block configuration. - `com.amazonaws.services.s3.model.DeletePublicAccessBlockRequest`

  returns: A DeletePublicAccessBlockResult. - `com.amazonaws.services.s3.model.DeletePublicAccessBlockResult`"
  (^com.amazonaws.services.s3.model.DeletePublicAccessBlockResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.DeletePublicAccessBlockRequest delete-public-access-block-request]
    (-> this (.deletePublicAccessBlock delete-public-access-block-request))))

(defn get-object
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the desired object. - `java.lang.String`
  key - The key under which the desired object is stored. - `java.lang.String`

  returns: The object stored in Amazon S3 in the specified bucket and key. - `com.amazonaws.services.s3.model.S3Object`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.S3Object [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObject bucket-name key)))
  (^com.amazonaws.services.s3.model.S3Object [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetObjectRequest get-object-request]
    (-> this (.getObject get-object-request))))

(defn delete-object-tagging
  "Description copied from interface: AmazonS3

  delete-object-tagging-request - The request object containing all the options for deleting the tags for the specified object. - `com.amazonaws.services.s3.model.DeleteObjectTaggingRequest`

  returns: a DeleteObjectTaggingResult object containing the
   information returned by S3 for the the tag deletion. - `com.amazonaws.services.s3.model.DeleteObjectTaggingResult`"
  (^com.amazonaws.services.s3.model.DeleteObjectTaggingResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.DeleteObjectTaggingRequest delete-object-tagging-request]
    (-> this (.deleteObjectTagging delete-object-tagging-request))))

(defn set-public-access-block
  "Description copied from interface: AmazonS3

  set-public-access-block-request - The request object for setting the buckets Public Access Block configuration. - `com.amazonaws.services.s3.model.SetPublicAccessBlockRequest`

  returns: A SetPublicAccessBlockResult. - `com.amazonaws.services.s3.model.SetPublicAccessBlockResult`"
  (^com.amazonaws.services.s3.model.SetPublicAccessBlockResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.SetPublicAccessBlockRequest set-public-access-block-request]
    (-> this (.setPublicAccessBlock set-public-access-block-request))))

(defn get-bucket-accelerate-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose accelerate configuration is being fetched. - `java.lang.String`

  returns: the accelerate configuration of the bucket. - `com.amazonaws.services.s3.model.BucketAccelerateConfiguration`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^com.amazonaws.services.s3.model.BucketAccelerateConfiguration [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketAccelerateConfiguration bucket-name))))

(defn restore-object
  "Description copied from interface: AmazonS3

  bucket-name - The name of an existing bucket. - `java.lang.String`
  key - The key under which to store the specified file. - `java.lang.String`
  expiration-in-days - The number of days after which the object will expire. - `int`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^Integer expiration-in-days]
    (-> this (.restoreObject bucket-name key expiration-in-days)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.RestoreObjectRequest restore-object-request]
    (-> this (.restoreObject restore-object-request))))

(defn delete-bucket-lifecycle-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to remove the lifecycle configuration. - `java.lang.String`"
  ([^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.deleteBucketLifecycleConfiguration bucket-name))))

(defn list-objects-v-2
  "bucket-name - `java.lang.String`
  prefix - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.ListObjectsV2Result`

  throws: com.amazonaws.SdkClientException"
  (^com.amazonaws.services.s3.model.ListObjectsV2Result [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String prefix]
    (-> this (.listObjectsV2 bucket-name prefix)))
  (^com.amazonaws.services.s3.model.ListObjectsV2Result [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.listObjectsV2 bucket-name))))

(defn get-bucket-website-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose website configuration is being retrieved. - `java.lang.String`

  returns: The bucket website configuration for the specified bucket,
           otherwise null if there is no website configuration set for the
           specified bucket. - `com.amazonaws.services.s3.model.BucketWebsiteConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketWebsiteConfiguration [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketWebsiteConfiguration bucket-name))))

(defn set-bucket-logging-configuration
  "Description copied from interface: AmazonS3

  set-bucket-logging-configuration-request - The request object containing all options for setting the bucket logging configuration. - `com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest set-bucket-logging-configuration-request]
    (-> this (.setBucketLoggingConfiguration set-bucket-logging-configuration-request))))

(defn set-bucket-website-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose website configuration is being set. - `java.lang.String`
  configuration - The configuration describing how the specified bucket will serve web requests (i.e. default index page, error page). - `com.amazonaws.services.s3.model.BucketWebsiteConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketWebsiteConfiguration configuration]
    (-> this (.setBucketWebsiteConfiguration bucket-name configuration)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest set-bucket-website-configuration-request]
    (-> this (.setBucketWebsiteConfiguration set-bucket-website-configuration-request))))

(defn get-public-access-block
  "Description copied from interface: AmazonS3

  get-public-access-block-request - The request object for getting the buckets Public Access Block configuration. - `com.amazonaws.services.s3.model.GetPublicAccessBlockRequest`

  returns: A GetPublicAccessBlockResult. - `com.amazonaws.services.s3.model.GetPublicAccessBlockResult`"
  (^com.amazonaws.services.s3.model.GetPublicAccessBlockResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetPublicAccessBlockRequest get-public-access-block-request]
    (-> this (.getPublicAccessBlock get-public-access-block-request))))

(defn list-next-batch-of-objects
  "Description copied from interface: AmazonS3

  previous-object-listing - The previous truncated ObjectListing. If a non-truncated ObjectListing is passed in, an empty ObjectListing is returned without ever contacting Amazon S3. - `com.amazonaws.services.s3.model.ObjectListing`

  returns: The next set of ObjectListing results, beginning immediately
           after the last result in the specified previous ObjectListing. - `com.amazonaws.services.s3.model.ObjectListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.ObjectListing [^AmazonS3Client this ^com.amazonaws.services.s3.model.ObjectListing previous-object-listing]
    (-> this (.listNextBatchOfObjects previous-object-listing))))

(defn set-object-redirect-location
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object. - `java.lang.String`
  key - The key of the object within the specified bucket. - `java.lang.String`
  new-redirect-location - The new redirect location for the specified object. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String new-redirect-location]
    (-> this (.setObjectRedirectLocation bucket-name key new-redirect-location))))

(defn get-region-name
  "Description copied from interface: AmazonS3

  returns: String value representing the region this client will
   communicate with - `java.lang.String`"
  (^java.lang.String [^AmazonS3Client this]
    (-> this (.getRegionName))))

(defn get-bucket-policy-status
  "Description copied from interface: AmazonS3

  get-bucket-policy-status-request - The request object for getting the current policy status of the bucket. - `com.amazonaws.services.s3.model.GetBucketPolicyStatusRequest`

  returns: A DeletePublicAccessBlockResult. - `com.amazonaws.services.s3.model.GetBucketPolicyStatusResult`"
  (^com.amazonaws.services.s3.model.GetBucketPolicyStatusResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetBucketPolicyStatusRequest get-bucket-policy-status-request]
    (-> this (.getBucketPolicyStatus get-bucket-policy-status-request))))

(defn set-bucket-accelerate-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose accelerate configuration is being set. - `java.lang.String`
  accelerate-configuration - The new accelerate configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketAccelerateConfiguration`

  throws: com.amazonaws.AmazonServiceException"
  ([^AmazonS3Client this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketAccelerateConfiguration accelerate-configuration]
    (-> this (.setBucketAccelerateConfiguration bucket-name accelerate-configuration)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest set-bucket-accelerate-configuration-request]
    (-> this (.setBucketAccelerateConfiguration set-bucket-accelerate-configuration-request))))

(defn abort-multipart-upload
  "Description copied from interface: AmazonS3

  abort-multipart-upload-request - The AbortMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.AbortMultipartUploadRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.AbortMultipartUploadRequest abort-multipart-upload-request]
    (-> this (.abortMultipartUpload abort-multipart-upload-request))))

(defn get-bucket-logging-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket whose bucket logging configuration is being retrieved. - `java.lang.String`

  returns: The bucket logging configuration for the specified bucket. - `com.amazonaws.services.s3.model.BucketLoggingConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketLoggingConfiguration [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketLoggingConfiguration bucket-name))))

(defn delete-bucket-cross-origin-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve cross origin configuration. - `java.lang.String`"
  ([^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.deleteBucketCrossOriginConfiguration bucket-name))))

(defn set-bucket-acl
  "Same as setBucketAcl(String, AccessControlList)
   but allows specifying a request metric collector.

  bucket-name - `java.lang.String`
  acl - `com.amazonaws.services.s3.model.AccessControlList`
  request-metric-collector - `com.amazonaws.metrics.RequestMetricCollector`"
  ([^AmazonS3Client this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.AccessControlList acl ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (-> this (.setBucketAcl bucket-name acl request-metric-collector)))
  ([^AmazonS3Client this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.AccessControlList acl]
    (-> this (.setBucketAcl bucket-name acl)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketAclRequest set-bucket-acl-request]
    (-> this (.setBucketAcl set-bucket-acl-request))))

(defn set-object-retention
  "Description copied from interface: AmazonS3

  set-object-retention-request - The request object for setting the object retention. - `com.amazonaws.services.s3.model.SetObjectRetentionRequest`

  returns: A SetObjectRetentionResult. - `com.amazonaws.services.s3.model.SetObjectRetentionResult`"
  (^com.amazonaws.services.s3.model.SetObjectRetentionResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.SetObjectRetentionRequest set-object-retention-request]
    (-> this (.setObjectRetention set-object-retention-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder.setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)

  endpoint - The endpoint (ex: \"ec2.amazonaws.com\") or a full URL, including the protocol (ex: \"https://ec2.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonS3Client this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-bucket-lifecycle-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve lifecycle configuration. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.BucketLifecycleConfiguration`"
  (^com.amazonaws.services.s3.model.BucketLifecycleConfiguration [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketLifecycleConfiguration bucket-name))))

(defn delete-bucket
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to delete. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.deleteBucket bucket-name))))

(defn restore-object-v-2
  "Description copied from interface: AmazonS3

  restore-object-request - The request object containing all the options for restoring an Amazon S3 object. - `com.amazonaws.services.s3.model.RestoreObjectRequest`

  returns: A RestoreObjectResult from Amazon S3. - `com.amazonaws.services.s3.model.RestoreObjectResult`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^com.amazonaws.services.s3.model.RestoreObjectResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.RestoreObjectRequest restore-object-request]
    (-> this (.restoreObjectV2 restore-object-request))))

(defn initiate-multipart-upload
  "Description copied from interface: AmazonS3

  initiate-multipart-upload-request - The InitiateMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.InitiateMultipartUploadRequest`

  returns: An InitiateMultipartUploadResult from Amazon S3. - `com.amazonaws.services.s3.model.InitiateMultipartUploadResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.InitiateMultipartUploadResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.InitiateMultipartUploadRequest initiate-multipart-upload-request]
    (-> this (.initiateMultipartUpload initiate-multipart-upload-request))))

(defn get-object-metadata
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object's whose metadata is being retrieved. - `java.lang.String`
  key - The key of the object whose metadata is being retrieved. - `java.lang.String`

  returns: All Amazon S3 object metadata for the specified object. - `com.amazonaws.services.s3.model.ObjectMetadata`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.ObjectMetadata [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObjectMetadata bucket-name key)))
  (^com.amazonaws.services.s3.model.ObjectMetadata [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetObjectMetadataRequest get-object-metadata-request]
    (-> this (.getObjectMetadata get-object-metadata-request))))

(defn set-bucket-cross-origin-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve cross origin configuration. - `java.lang.String`
  bucket-cross-origin-configuration - The new cross origin configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketCrossOriginConfiguration`"
  ([^AmazonS3Client this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketCrossOriginConfiguration bucket-cross-origin-configuration]
    (-> this (.setBucketCrossOriginConfiguration bucket-name bucket-cross-origin-configuration)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketCrossOriginConfigurationRequest set-bucket-cross-origin-configuration-request]
    (-> this (.setBucketCrossOriginConfiguration set-bucket-cross-origin-configuration-request))))

(defn delete-bucket-policy
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose policy is being deleted. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name]
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
  (^com.amazonaws.services.s3.model.HeadBucketResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.HeadBucketRequest head-bucket-request]
    (-> this (.headBucket head-bucket-request))))

(defn list-buckets
  "Description copied from interface: AmazonS3

  list-buckets-request - The request containing all of the options related to the listing of buckets. - `com.amazonaws.services.s3.model.ListBucketsRequest`

  returns: A list of all of the Amazon S3 buckets owned by the authenticated
           sender of the request. - `java.util.List<com.amazonaws.services.s3.model.Bucket>`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^java.util.List [^AmazonS3Client this ^com.amazonaws.services.s3.model.ListBucketsRequest list-buckets-request]
    (-> this (.listBuckets list-buckets-request)))
  (^java.util.List [^AmazonS3Client this]
    (-> this (.listBuckets))))

(defn set-bucket-encryption
  "Description copied from interface: AmazonS3

  set-bucket-encryption-request - The request object for setting the bucket encryption configuration. - `com.amazonaws.services.s3.model.SetBucketEncryptionRequest`

  returns: A SetBucketEncryptionResult. - `com.amazonaws.services.s3.model.SetBucketEncryptionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetBucketEncryptionResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketEncryptionRequest set-bucket-encryption-request]
    (-> this (.setBucketEncryption set-bucket-encryption-request))))

(defn set-object-acl
  "Same as setObjectAcl(String, String, String, AccessControlList)
   but allows specifying a request metric collector.

  bucket-name - `java.lang.String`
  key - `java.lang.String`
  version-id - `java.lang.String`
  acl - `com.amazonaws.services.s3.model.AccessControlList`
  request-metric-collector - `com.amazonaws.metrics.RequestMetricCollector`

  throws: com.amazonaws.SdkClientException"
  ([^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id ^com.amazonaws.services.s3.model.AccessControlList acl ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (-> this (.setObjectAcl bucket-name key version-id acl request-metric-collector)))
  ([^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id ^com.amazonaws.services.s3.model.AccessControlList acl]
    (-> this (.setObjectAcl bucket-name key version-id acl)))
  ([^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^com.amazonaws.services.s3.model.AccessControlList acl]
    (-> this (.setObjectAcl bucket-name key acl)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetObjectAclRequest set-object-acl-request]
    (-> this (.setObjectAcl set-object-acl-request))))

(defn get-object-acl
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object whose ACL is being retrieved. - `java.lang.String`
  key - The key of the object within the specified bucket whose ACL is being retrieved. - `java.lang.String`
  version-id - The version ID of the object version whose ACL is being retrieved. - `java.lang.String`

  returns: The AccessControlList for the specified Amazon S3 object. - `com.amazonaws.services.s3.model.AccessControlList`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.AccessControlList [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id]
    (-> this (.getObjectAcl bucket-name key version-id)))
  (^com.amazonaws.services.s3.model.AccessControlList [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObjectAcl bucket-name key)))
  (^com.amazonaws.services.s3.model.AccessControlList [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetObjectAclRequest get-object-acl-request]
    (-> this (.getObjectAcl get-object-acl-request))))

(defn get-bucket-policy
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose policy is being retrieved. - `java.lang.String`

  returns: The Amazon S3 bucket policy for the specified bucket. - `com.amazonaws.services.s3.model.BucketPolicy`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketPolicy [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketPolicy bucket-name))))

(defn list-objects
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket to list. - `java.lang.String`
  prefix - An optional parameter restricting the response to keys beginning with the specified prefix. Use prefixes to separate a bucket into different sets of keys, similar to how a file system organizes files into directories. - `java.lang.String`

  returns: A listing of the objects in the specified bucket, along with any
           other associated information, such as common prefixes (if a
           delimiter was specified), the original request parameters, etc. - `com.amazonaws.services.s3.model.ObjectListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.ObjectListing [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String prefix]
    (-> this (.listObjects bucket-name prefix)))
  (^com.amazonaws.services.s3.model.ObjectListing [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.listObjects bucket-name))))

(defn change-object-storage-class
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket containing the object. - `java.lang.String`
  key - The key of the object within the specified bucket. - `java.lang.String`
  new-storage-class - The new storage class for the specified object. - `com.amazonaws.services.s3.model.StorageClass`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^com.amazonaws.services.s3.model.StorageClass new-storage-class]
    (-> this (.changeObjectStorageClass bucket-name key new-storage-class))))

(defn set-bucket-notification-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose notification configuration is being set. - `java.lang.String`
  bucket-notification-configuration - The request object containing all options for setting the bucket notification configuration. - `com.amazonaws.services.s3.model.BucketNotificationConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketNotificationConfiguration bucket-notification-configuration]
    (-> this (.setBucketNotificationConfiguration bucket-name bucket-notification-configuration)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketNotificationConfigurationRequest set-bucket-notification-configuration-request]
    (-> this (.setBucketNotificationConfiguration set-bucket-notification-configuration-request))))

(defn set-bucket-policy
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket whose policy is being set. - `java.lang.String`
  policy-text - The policy to apply to the specified bucket. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String policy-text]
    (-> this (.setBucketPolicy bucket-name policy-text)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketPolicyRequest set-bucket-policy-request]
    (-> this (.setBucketPolicy set-bucket-policy-request))))

(defn delete-object
  "Description copied from interface: AmazonS3

  bucket-name - The name of the Amazon S3 bucket containing the object to delete. - `java.lang.String`
  key - The key of the object to delete. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.deleteObject bucket-name key)))
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.DeleteObjectRequest delete-object-request]
    (-> this (.deleteObject delete-object-request))))

(defn set-object-tagging
  "Description copied from interface: AmazonS3

  set-object-tagging-request - The request object containing all the options for setting the tags for the specified object. - `com.amazonaws.services.s3.model.SetObjectTaggingRequest`

  returns: `com.amazonaws.services.s3.model.SetObjectTaggingResult`"
  (^com.amazonaws.services.s3.model.SetObjectTaggingResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.SetObjectTaggingRequest set-object-tagging-request]
    (-> this (.setObjectTagging set-object-tagging-request))))

(defn copy-part
  "Copies a source object to a part of a multipart upload.

   To copy an object, the caller's account must have read access to the source object and
   write access to the destination bucket.


   If constraints are specified in the CopyPartRequest
   (e.g.
   CopyPartRequest.setMatchingETagConstraints(List))
   and are not satisfied when Amazon S3 receives the
   request, this method returns null.
   This method returns a non-null result under all other
   circumstances.

  copy-part-request - The request object containing all the options for copying an Amazon S3 object. - `com.amazonaws.services.s3.model.CopyPartRequest`

  returns: A CopyPartResult object containing the information
           returned by Amazon S3 about the newly created object, or null if
           constraints were specified that weren't met when Amazon S3 attempted
           to copy the object. - `com.amazonaws.services.s3.model.CopyPartResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.CopyPartResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.CopyPartRequest copy-part-request]
    (-> this (.copyPart copy-part-request))))

(defn get-resource-url
  "Returns the URL to the key in the bucket given, using the client's scheme
   and endpoint. Returns null if the given bucket and key cannot be
   converted to a URL.

  bucket-name - `java.lang.String`
  key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getResourceUrl bucket-name key))))

(defn does-bucket-exist-v-2
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to check. - `java.lang.String`

  returns: The value true if the specified bucket exists in
           Amazon S3; the value false if there is no bucket in
           Amazon S3 with that name. - `boolean`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^Boolean [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.doesBucketExistV2 bucket-name))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonS3

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or
           null if none is available. - `com.amazonaws.services.s3.S3ResponseMetadata`"
  (^com.amazonaws.services.s3.S3ResponseMetadata [^AmazonS3Client this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-object-legal-hold
  "Description copied from interface: AmazonS3

  set-object-legal-hold-request - The request object for setting the object legal hold. - `com.amazonaws.services.s3.model.SetObjectLegalHoldRequest`

  returns: A SetObjectLegalHoldResult. - `com.amazonaws.services.s3.model.SetObjectLegalHoldResult`"
  (^com.amazonaws.services.s3.model.SetObjectLegalHoldResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.SetObjectLegalHoldRequest set-object-legal-hold-request]
    (-> this (.setObjectLegalHold set-object-legal-hold-request))))

(defn put-object
  "Description copied from interface: AmazonS3

  bucket-name - The name of an existing bucket, to which you have Permission.Write permission. - `java.lang.String`
  key - The key under which to store the specified file. - `java.lang.String`
  input - The input stream containing the data to be uploaded to Amazon S3. - `java.io.InputStream`
  metadata - Additional metadata instructing Amazon S3 how to handle the uploaded data (e.g. custom user metadata, hooks for specifying content type, etc.). - `com.amazonaws.services.s3.model.ObjectMetadata`

  returns: A PutObjectResult object containing the information
           returned by Amazon S3 for the newly created object. - `com.amazonaws.services.s3.model.PutObjectResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.PutObjectResult [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^java.io.InputStream input ^com.amazonaws.services.s3.model.ObjectMetadata metadata]
    (-> this (.putObject bucket-name key input metadata)))
  (^com.amazonaws.services.s3.model.PutObjectResult [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String key ^java.io.File file]
    (-> this (.putObject bucket-name key file)))
  (^com.amazonaws.services.s3.model.PutObjectResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.PutObjectRequest put-object-request]
    (-> this (.putObject put-object-request))))

(defn get-bucket-tagging-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket for which to retrieve tagging configuration. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.BucketTaggingConfiguration`"
  (^com.amazonaws.services.s3.model.BucketTaggingConfiguration [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketTaggingConfiguration bucket-name))))

(defn get-bucket-versioning-configuration
  "Description copied from interface: AmazonS3

  bucket-name - The bucket whose versioning configuration will be retrieved. - `java.lang.String`

  returns: The bucket versioning configuration for the specified bucket. - `com.amazonaws.services.s3.model.BucketVersioningConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketVersioningConfiguration [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.getBucketVersioningConfiguration bucket-name))))

(defn set-bucket-versioning-configuration
  "Description copied from interface: AmazonS3

  set-bucket-versioning-configuration-request - The request object containing all options for setting the bucket versioning configuration. - `com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3Client this ^com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest set-bucket-versioning-configuration-request]
    (-> this (.setBucketVersioningConfiguration set-bucket-versioning-configuration-request))))

(defn get-object-retention
  "Description copied from interface: AmazonS3

  get-object-retention-request - The request object for getting the object retention. - `com.amazonaws.services.s3.model.GetObjectRetentionRequest`

  returns: A GetObjectRetentionResult. - `com.amazonaws.services.s3.model.GetObjectRetentionResult`"
  (^com.amazonaws.services.s3.model.GetObjectRetentionResult [^AmazonS3Client this ^com.amazonaws.services.s3.model.GetObjectRetentionRequest get-object-retention-request]
    (-> this (.getObjectRetention get-object-retention-request))))

(defn does-object-exist
  "bucket-name - Name of bucket that presumably contains object - `java.lang.String`
  object-name - Name of object that has to be checked - `java.lang.String`

  returns: result of the search - `boolean`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^Boolean [^AmazonS3Client this ^java.lang.String bucket-name ^java.lang.String object-name]
    (-> this (.doesObjectExist bucket-name object-name))))

(defn does-bucket-exist
  "Description copied from interface: AmazonS3

  bucket-name - The name of the bucket to check. - `java.lang.String`

  returns: The value true if the specified bucket exists in
           Amazon S3; the value false if there is no bucket in
           Amazon S3 with that name. - `boolean`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^Boolean [^AmazonS3Client this ^java.lang.String bucket-name]
    (-> this (.doesBucketExist bucket-name))))

(defn get-region
  "Description copied from interface: AmazonS3

  returns: The region this client will communicate with. - `com.amazonaws.services.s3.model.Region`"
  (^com.amazonaws.services.s3.model.Region [^AmazonS3Client this]
    (-> this (.getRegion))))

