(ns com.amazonaws.services.s3.AmazonS3
  " Provides an interface for accessing the Amazon S3 web service.


      Note: Do not directly implement this interface, new methods are added to it regularly.
      Extend from AbstractAmazonS3 instead.


  Amazon S3 provides storage for the Internet, and is designed to make
  web-scale computing easier for developers.


  The Amazon S3 Java SDK provides a simple interface that can be used to store
  and retrieve any amount of data, at any time, from anywhere on the web. It
  gives any developer access to the same highly scalable, reliable, secure,
  fast, inexpensive infrastructure that Amazon uses to run its own global
  network of web sites. The service aims to maximize benefits of scale and to
  pass those benefits on to developers.


  For more information about Amazon S3, please see  http://aws.amazon.com/s3


  Extend AbstractAmazonS3 if you are implementing AmazonS3 interface.
  AbstractAmazonS3 provides a default implementation for all the methods in
  this interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 AmazonS3]))

(defn set-object-lock-configuration
  "Places an Object Lock configuration on the specified bucket. The rule specified in the Object Lock configuration will
   be applied by default to every new object placed in the specified bucket.

  set-object-lock-configuration-request - The request object for setting the object lock configuration. - `com.amazonaws.services.s3.model.SetObjectLockConfigurationRequest`

  returns: A SetObjectLockConfigurationResult. - `com.amazonaws.services.s3.model.SetObjectLockConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetObjectLockConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SetObjectLockConfigurationRequest set-object-lock-configuration-request]
    (-> this (.setObjectLockConfiguration set-object-lock-configuration-request))))

(defn get-object-as-string
  "Retrieves and decodes the contents of an S3 object to a String.

  bucket-name - The name of the bucket containing the object to retrieve. - `java.lang.String`
  key - The key of the object to retrieve. - `java.lang.String`

  returns: contents of the object as a String - `java.lang.String`

  throws: com.amazonaws.AmazonServiceException"
  (^java.lang.String [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObjectAsString bucket-name key))))

(defn upload-part
  "Uploads a part in a multipart upload. You must initiate a multipart
   upload before you can upload any part.

   Your UploadPart request must include an upload ID and a part number. The
   upload ID is the ID returned by Amazon S3 in response to your Initiate
   Multipart Upload request. Part number can be any number between 1 and
   10,000, inclusive. A part number uniquely identifies a part and also
   defines its position within the object being uploaded. If you upload a
   new part using the same part number that was specified in uploading a
   previous part, the previously uploaded part is overwritten.

   To ensure data is not corrupted traversing the network, specify the
   Content-MD5 header in the Upload Part request. Amazon S3 checks the part
   data against the provided MD5 value. If they do not match, Amazon S3
   returns an error.

   When you upload a part, the returned UploadPartResult contains an ETag
   property. You should record this ETag property value and the part number.
   After uploading all parts, you must send a CompleteMultipartUpload
   request. At that time Amazon S3 constructs a complete object by
   concatenating all the parts you uploaded, in ascending order based on the
   part numbers. The CompleteMultipartUpload request requires you to send
   all the part numbers and the corresponding ETag values.

   Note:
   After you initiate a multipart upload and upload one or more parts,
   you must either complete or abort the multipart upload in order to stop
   getting charged for storage of the uploaded parts.
   Once you complete or abort the multipart upload Amazon S3 will release the
   stored parts and stop charging you for their storage.


   If you are performing upload part for AWS KMS-encrypted objects, you need
   to specify the correct region of the bucket on your client and configure
   AWS Signature Version 4 for added security. For more information on how
   to do this, see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#
   specify-signature-version


   When supplying an InputStream using UploadPartRequest.withInputStream(InputStream) or UploadPartRequest.setInputStream(InputStream), the stream will only be
   closed by the client if UploadPartRequest.isLastPart() is true. If this is not the last part, the stream will be left open.

  request - The UploadPartRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.UploadPartRequest`

  returns: An UploadPartResult from Amazon S3 containing the part number and
           ETag of the new part. - `com.amazonaws.services.s3.model.UploadPartResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.UploadPartResult [^AmazonS3 this ^com.amazonaws.services.s3.model.UploadPartRequest request]
    (-> this (.uploadPart request))))

(defn get-bucket-encryption
  "Returns the server-side encryption configuration of a bucket.

  bucket-name - Name of the bucket to retrieve encryption configuration for. - `java.lang.String`

  returns: A GetBucketEncryptionResult. - `com.amazonaws.services.s3.model.GetBucketEncryptionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketEncryptionResult [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketEncryption bucket-name))))

(defn set-region
  "An alternative to setEndpoint(String), sets the
   regional endpoint for this client's service calls. Callers can use this
   method to control which AWS region they want to work with.

   This method is not threadsafe. A region should be configured when the
   client is created and before any service requests are made. Changing it
   afterwards creates inevitable race conditions for any service requests in
   transit or retrying.

   By default, all service endpoints in all regions use the https protocol.
   To use http instead, specify it in the ClientConfiguration
   supplied at construction.

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. - `com.amazonaws.regions.Region`

  throws: java.lang.IllegalArgumentException - If the given region is null, or if this service isn't available in the given region. See Region.isServiceSupported(String)"
  ([^AmazonS3 this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn set-s-3-client-options
  "Override the default S3 client options for this client.

  client-options - The S3 client options to use. - `com.amazonaws.services.s3.S3ClientOptions`"
  ([^AmazonS3 this ^com.amazonaws.services.s3.S3ClientOptions client-options]
    (-> this (.setS3ClientOptions client-options))))

(defn get-object-tagging
  "Returns the tags for the specified object.

  get-object-tagging-request - The request object containing all the options on how to retrieve the Amazon S3 object tags. - `com.amazonaws.services.s3.model.GetObjectTaggingRequest`

  returns: The tags for the specified object. - `com.amazonaws.services.s3.model.GetObjectTaggingResult`"
  (^com.amazonaws.services.s3.model.GetObjectTaggingResult [^AmazonS3 this ^com.amazonaws.services.s3.model.GetObjectTaggingRequest get-object-tagging-request]
    (-> this (.getObjectTagging get-object-tagging-request))))

(defn delete-bucket-metrics-configuration
  "Deletes a metrics configuration (specified by the metrics configuration ID) from the bucket.

  bucket-name - The name of the bucket from which the metrics configuration is to be deleted - `java.lang.String`
  id - The ID of the metrics configuration to delete. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationResult [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.deleteBucketMetricsConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationRequest delete-bucket-metrics-configuration-request]
    (-> this (.deleteBucketMetricsConfiguration delete-bucket-metrics-configuration-request))))

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
  (^com.amazonaws.services.s3.model.AccessControlList [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketAcl bucket-name))))

(defn complete-multipart-upload
  "Completes a multipart upload by assembling previously uploaded parts.

   You first upload all parts using the
   uploadPart(UploadPartRequest) method. After successfully
   uploading all individual parts of an upload, you call this operation to
   complete the upload. Upon receiving this request, Amazon S3 concatenates
   all the parts in ascending order by part number to create a new object.
   In the CompleteMultipartUpload request, you must provide the parts list.
   For each part in the list, you provide the part number and the ETag
   header value, returned after that part was uploaded.

   Processing of a CompleteMultipartUpload request may take several minutes
   to complete.


   If you are perfoming a complete multipart upload for AWS KMS-encrypted objects, you need
   to specify the correct region of the bucket on your client and configure
   AWS Signature Version 4 for added security. For more information on how
   to do this, see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#
   specify-signature-version

  request - The CompleteMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.CompleteMultipartUploadRequest`

  returns: A CompleteMultipartUploadResult from S3 containing the ETag for
           the new object composed of the individual parts. - `com.amazonaws.services.s3.model.CompleteMultipartUploadResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.CompleteMultipartUploadResult [^AmazonS3 this ^com.amazonaws.services.s3.model.CompleteMultipartUploadRequest request]
    (-> this (.completeMultipartUpload request))))

(defn list-multipart-uploads
  "Lists in-progress multipart uploads. An in-progress multipart upload is a
   multipart upload that has been initiated, using the
   InitiateMultipartUpload request, but has not yet been completed or
   aborted.

   This operation returns at most 1,000 multipart uploads in the response by
   default. The number of multipart uploads can be further limited using the
   MaxUploads property on the request parameter. If there are additional
   multipart uploads that satisfy the list criteria, the response will
   contain an IsTruncated property with the value set to true. To list the
   additional multipart uploads use the KeyMarker and UploadIdMarker
   properties on the request parameters.

  request - The ListMultipartUploadsRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.ListMultipartUploadsRequest`

  returns: A MultipartUploadListing from Amazon S3. - `com.amazonaws.services.s3.model.MultipartUploadListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.MultipartUploadListing [^AmazonS3 this ^com.amazonaws.services.s3.model.ListMultipartUploadsRequest request]
    (-> this (.listMultipartUploads request))))

(defn enable-requester-pays
  "Allows Amazon S3 bucket owner to enable the Requester Pays for the given
   bucket name. If enabled, the requester of an Amazon S3 object in the
   bucket is charged for the downloading the data from the bucket.


   If a bucket is enabled for Requester Pays, then any attempt to read an
   object from it without Requester Pays enabled in getObject will result in
   a 403 error and the bucket owner will be charged for the request.


   Enabling Requester Pays disables the ability to have anonymous access to
   this bucket


   For more information on Requester pays, @see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html

  bucket-name - The name of the bucket being enabled for Requester Pays. - `java.lang.String`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.enableRequesterPays bucket-name))))

(defn delete-version
  "Deletes a specific version of the specified object in the specified
   bucket. Once deleted, there is no method to restore or undelete an object
   version. This is the only way to permanently delete object versions that
   are protected by versioning.


   Deleting an object version is permanent and irreversible.
   It is a
   privileged operation that only the owner of the bucket containing the
   version can perform.


   Users can only delete a version of an object if versioning is enabled
   for the bucket.
   For more information about enabling versioning for a bucket, see
   setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest).


   If attempting to delete an object that does not exist,
   Amazon S3 will return
   a success message instead of an error message.

  bucket-name - The name of the Amazon S3 bucket containing the object to delete. - `java.lang.String`
  key - The key of the object to delete. - `java.lang.String`
  version-id - The version of the object to delete. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id]
    (-> this (.deleteVersion bucket-name key version-id)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.DeleteVersionRequest delete-version-request]
    (-> this (.deleteVersion delete-version-request))))

(defn delete-bucket-replication-configuration
  "Deletes the replication configuration for the given Amazon S3 bucket.

  bucket-name - The bucket name for which the replication configuration is to be deleted. - `java.lang.String`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketReplicationConfiguration bucket-name))))

(defn delete-bucket-tagging-configuration
  "Removes the tagging configuration for the bucket specified.

  bucket-name - The name of the bucket for which to remove the tagging configuration. - `java.lang.String`"
  ([^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketTaggingConfiguration bucket-name))))

(defn set-bucket-analytics-configuration
  "Sets an analytics configuration for the bucket (specified by the analytics configuration ID).

  bucket-name - The name of the bucket to set the analytics configuration. - `java.lang.String`
  analytics-configuration - The analytics configuration to set. - `com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration`

  returns: `com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationResult [^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration analytics-configuration]
    (-> this (.setBucketAnalyticsConfiguration bucket-name analytics-configuration)))
  (^com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationRequest set-bucket-analytics-configuration-request]
    (-> this (.setBucketAnalyticsConfiguration set-bucket-analytics-configuration-request))))

(defn delete-bucket-encryption
  "Deletes the server-side encryption configuration from the bucket.

  bucket-name - `java.lang.String`

  returns: A DeleteBucketEncryptionResult. - `com.amazonaws.services.s3.model.DeleteBucketEncryptionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeleteBucketEncryptionResult [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketEncryption bucket-name))))

(defn create-bucket
  "Deprecated. Use regional endpoint and call createBucket(String) instead.

  bucket-name - The name of the bucket to create. - `java.lang.String`
  region - The Amazon S3 region in which to create the new bucket. - `com.amazonaws.services.s3.model.Region`

  returns: The newly created bucket. - `com.amazonaws.services.s3.model.Bucket`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.Bucket [^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.Region region]
    (-> this (.createBucket bucket-name region)))
  (^com.amazonaws.services.s3.model.Bucket [^AmazonS3 this ^com.amazonaws.services.s3.model.CreateBucketRequest create-bucket-request]
    (-> this (.createBucket create-bucket-request))))

(defn get-bucket-notification-configuration
  "Gets the notification configuration for the specified bucket.

   By default, new buckets have no notification configuration.

   The notification configuration of a bucket provides near realtime notifications
   of events the user is interested in, using SNS as the delivery service.
   Notification is turned on by enabling configuration on a bucket, specifying
   the events and the SNS topic. This configuration can only be turned
   on by the bucket owner. If a notification configuration already exists for the
   specified bucket, the new notification configuration will replace the existing
   notification configuration.  To remove the notification configuration pass in
   an empty request.  Currently, buckets may only have a single event and topic
   configuration.

   S3 is eventually consistent. It may take time for the notification status
   of a bucket to be propagated throughout the system.

  bucket-name - The bucket whose notification configuration will be retrieved. - `java.lang.String`

  returns: The bucket notification configuration for the specified bucket. - `com.amazonaws.services.s3.model.BucketNotificationConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketNotificationConfiguration [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketNotificationConfiguration bucket-name))))

(defn get-bucket-location
  "Gets the geographical region where Amazon S3 stores the specified
   bucket.


   To view the location constraint of a bucket, the user must be the bucket
   owner.


   Use Region.fromValue(String) to get the Region
   enumeration value, but be prepared to
   handle an IllegalArgumentException
   if the value passed is not a known Region value.


   Note that Region enumeration values are not returned
   directly from this method.

  bucket-name - The name of the Amazon S3 bucket to look up. This must be a bucket the user owns. - `java.lang.String`

  returns: The location of the specified Amazon S3 bucket. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^java.lang.String [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketLocation bucket-name))))

(defn list-bucket-analytics-configurations
  "Lists the analytics configurations for the bucket.

  list-bucket-analytics-configurations-request - The request object to list all the analytics configurations for a bucket. - `com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsRequest`

  returns: All the analytics configurations for the bucket. - `com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult [^AmazonS3 this ^com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsRequest list-bucket-analytics-configurations-request]
    (-> this (.listBucketAnalyticsConfigurations list-bucket-analytics-configurations-request))))

(defn delete-objects
  "Deletes multiple objects in a single bucket from S3.

   In some cases, some objects will be successfully deleted, while some
   attempts will cause an error. If any object in the request cannot be
   deleted, this method throws a MultiObjectDeleteException with
   details of the error.

  delete-objects-request - The request object containing all options for deleting multiple objects. - `com.amazonaws.services.s3.model.DeleteObjectsRequest`

  returns: `com.amazonaws.services.s3.model.DeleteObjectsResult`

  throws: com.amazonaws.services.s3.model.MultiObjectDeleteException - if one or more of the objects couldn't be deleted."
  (^com.amazonaws.services.s3.model.DeleteObjectsResult [^AmazonS3 this ^com.amazonaws.services.s3.model.DeleteObjectsRequest delete-objects-request]
    (-> this (.deleteObjects delete-objects-request))))

(defn set-bucket-tagging-configuration
  "Sets the tagging configuration for the specified bucket.

  bucket-name - The name of the bucket for which to set the tagging configuration. - `java.lang.String`
  bucket-tagging-configuration - The new tagging configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketTaggingConfiguration`"
  ([^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketTaggingConfiguration bucket-tagging-configuration]
    (-> this (.setBucketTaggingConfiguration bucket-name bucket-tagging-configuration)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketTaggingConfigurationRequest set-bucket-tagging-configuration-request]
    (-> this (.setBucketTaggingConfiguration set-bucket-tagging-configuration-request))))

(defn list-versions
  "Returns a list of summary information about the versions in the specified
   bucket.


   The returned version summaries are ordered first by key and then by
   version. Keys are sorted lexicographically (alphabetically)
   and versions are sorted from most recent to least recent.
   Versions
   with data and delete markers are included in the results.


   Because buckets can contain a virtually unlimited number of versions, the
   complete results of a list query can be extremely large. To manage large
   result sets, Amazon S3 uses pagination to split them into multiple
   responses. Always check the
   VersionListing.isTruncated() method to determine if the
   returned listing is complete or if additional calls are needed
   to get more results.
   Callers are
   encouraged to use
   listNextBatchOfVersions(VersionListing) as an easy way
   to get the next page of results.


   The keyMarker and versionIdMarker parameters allow
   callers to specify where to start the version listing.


   The delimiter parameter allows groups of keys that share a
   delimiter-terminated prefix to be included
   in the returned listing. This allows applications to organize and browse
   their keys hierarchically, much like how a file system organizes
   files into directories. These common prefixes can be retrieved
   by calling the VersionListing.getCommonPrefixes() method.


   For example, consider a bucket that contains the following keys:

          \"foo/bar/baz\"
          \"foo/bar/bash\"
          \"foo/bar/bang\"
          \"foo/boo\"

   If calling listVersions with
   a prefix value of \"foo/\" and a delimiter value of \"/\"
   on this bucket, a VersionListing is returned that contains:

                  all the versions for one key (\"foo/boo\")
                  one entry in the common prefixes list (\"foo/bar/\")



   To see deeper into the virtual hierarchy, make
   another call to listVersions setting the prefix parameter to any
   interesting common prefix to list the individual versions under that
   prefix.


   For more information about enabling versioning for a bucket, see
   setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest).

  bucket-name - The name of the Amazon S3 bucket whose versions are to be listed. - `java.lang.String`
  prefix - An optional parameter restricting the response to keys that begin with the specified prefix. Use prefixes to separate a bucket into different sets of keys, similar to how a file system organizes files into directories. - `java.lang.String`
  key-marker - Optional parameter indicating where in the sorted list of all versions in the specified bucket to begin returning results. Results are always ordered first lexicographically (i.e. alphabetically) and then from most recent version to least recent version. If a keyMarker is used without a versionIdMarker, results begin immediately after that key's last version. When a keyMarker is used with a versionIdMarker, results begin immediately after the version with the specified key and version ID. This enables pagination; to get the next page of results use the next key marker and next version ID marker (from VersionListing.getNextKeyMarker() and VersionListing.getNextVersionIdMarker()) as the markers for the next request to list versions, or use the convenience method listNextBatchOfVersions(VersionListing) - `java.lang.String`
  version-id-marker - Optional parameter indicating where in the sorted list of all versions in the specified bucket to begin returning results. Results are always ordered first lexicographically (i.e. alphabetically) and then from most recent version to least recent version. A keyMarker must be specified when specifying a versionIdMarker. Results begin immediately after the version with the specified key and version ID. This enables pagination; to get the next page of results use the next key marker and next version ID marker (from VersionListing.getNextKeyMarker() and VersionListing.getNextVersionIdMarker()) as the markers for the next request to list versions, or use the convenience method listNextBatchOfVersions(VersionListing) - `java.lang.String`
  delimiter - Optional parameter that causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be rolled up into a single result element in the VersionListing.getCommonPrefixes() list. These rolled-up keys are not returned elsewhere in the response. The most commonly used delimiter is \"/\", which simulates a hierarchical organization similar to a file system directory structure. - `java.lang.String`
  max-results - Optional parameter indicating the maximum number of results to include in the response. Amazon S3 might return fewer than this, but will not return more. Even if maxKeys is not specified, Amazon S3 will limit the number of results in the response. - `java.lang.Integer`

  returns: A listing of the versions in the specified bucket, along with any
           other associated information such as common prefixes (if a
           delimiter was specified), the original request parameters, etc. - `com.amazonaws.services.s3.model.VersionListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.VersionListing [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String prefix ^java.lang.String key-marker ^java.lang.String version-id-marker ^java.lang.String delimiter ^java.lang.Integer max-results]
    (-> this (.listVersions bucket-name prefix key-marker version-id-marker delimiter max-results)))
  (^com.amazonaws.services.s3.model.VersionListing [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String prefix]
    (-> this (.listVersions bucket-name prefix)))
  (^com.amazonaws.services.s3.model.VersionListing [^AmazonS3 this ^com.amazonaws.services.s3.model.ListVersionsRequest list-versions-request]
    (-> this (.listVersions list-versions-request))))

(defn copy-object
  "Copies a source object to a new destination in Amazon S3.


   By default, all object metadata for the source object except
   server-side-encryption, storage-class and
   website-redirect-location are copied to the new destination
   object, unless new object metadata in the specified
   CopyObjectRequest is provided.


   The Amazon S3 Acccess Control List (ACL) is not copied to the new
   object. The new object will have the default Amazon S3 ACL,
   CannedAccessControlList.Private, unless one is explicitly
   provided in the specified CopyObjectRequest.


   To copy an object, the caller's account must have read access to the source object and
   write access to the destination bucket


   This method only exposes the basic options for copying an Amazon S3
   object. Additional options are available by calling the
   AmazonS3Client.copyObject(CopyObjectRequest) method, including
   conditional constraints for copying objects, setting ACLs, overwriting
   object metadata, etc.


   If you are copying AWS KMS-encrypted objects, you need to
   specify the correct region of the bucket on your client and configure AWS
   Signature Version 4 for added security. For more information on how to do
   this, see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#
   specify-signature-version

  source-bucket-name - The name of the bucket containing the source object to copy. - `java.lang.String`
  source-key - The key in the source bucket under which the source object is stored. - `java.lang.String`
  destination-bucket-name - The name of the bucket in which the new object will be created. This can be the same name as the source bucket's. - `java.lang.String`
  destination-key - The key in the destination bucket under which the new object will be created. - `java.lang.String`

  returns: A CopyObjectResult object containing the information
           returned by Amazon S3 for the newly created object. - `com.amazonaws.services.s3.model.CopyObjectResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.CopyObjectResult [^AmazonS3 this ^java.lang.String source-bucket-name ^java.lang.String source-key ^java.lang.String destination-bucket-name ^java.lang.String destination-key]
    (-> this (.copyObject source-bucket-name source-key destination-bucket-name destination-key)))
  (^com.amazonaws.services.s3.model.CopyObjectResult [^AmazonS3 this ^com.amazonaws.services.s3.model.CopyObjectRequest copy-object-request]
    (-> this (.copyObject copy-object-request))))

(defn get-object-lock-configuration
  "Gets the Object Lock configuration for a bucket. The rule specified in the Object Lock configuration will be applied
   by default to every new object placed in the specified bucket.

  get-object-lock-configuration-request - The request object for getting the object lock configuration. - `com.amazonaws.services.s3.model.GetObjectLockConfigurationRequest`

  returns: A GetObjectLockConfigurationResult. - `com.amazonaws.services.s3.model.GetObjectLockConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetObjectLockConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.GetObjectLockConfigurationRequest get-object-lock-configuration-request]
    (-> this (.getObjectLockConfiguration get-object-lock-configuration-request))))

(defn get-bucket-cross-origin-configuration
  "Gets the cross origin configuration for the specified bucket, or null if
   the specified bucket does not exist, or an empty list if no
   configuration has been established.

  bucket-name - The name of the bucket for which to retrieve cross origin configuration. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.BucketCrossOriginConfiguration`"
  (^com.amazonaws.services.s3.model.BucketCrossOriginConfiguration [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketCrossOriginConfiguration bucket-name))))

(defn list-next-batch-of-versions
  "Provides an easy way to continue a truncated VersionListing and retrieve
   the next page of results.


   Obtain the initial
   VersionListing from one of the listVersions methods. If the result
   is truncated (indicated when VersionListing.isTruncated() returns true),
   pass the VersionListing back into this method in order to retrieve the
   next page of results. From there, continue using this method to
   retrieve more results until the returned VersionListing indicates that
   it is not truncated.


   For more information about enabling versioning for a bucket, see
   setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest).

  previous-version-listing - The previous truncated VersionListing. If a non-truncated VersionListing is passed in, an empty VersionListing is returned without ever contacting Amazon S3. - `com.amazonaws.services.s3.model.VersionListing`

  returns: The next set of VersionListing results, beginning immediately
           after the last result in the specified previous VersionListing. - `com.amazonaws.services.s3.model.VersionListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.VersionListing [^AmazonS3 this ^com.amazonaws.services.s3.model.VersionListing previous-version-listing]
    (-> this (.listNextBatchOfVersions previous-version-listing))))

(defn download
  "Gets the object stored in Amazon S3 using a presigned url.

   The result contains S3Object representing the downloaded object.
   Be extremely careful when using this method; the returned Amazon S3
   object contains a direct stream of data from the HTTP connection. The
   underlying HTTP connection cannot be reused until the user finishes
   reading the data and closes the stream. Also note that if not all data
   is read from the stream then the SDK will abort the underlying connection,
   this may have a negative impact on performance. Therefore:


   Use the data from the input stream in Amazon S3 object as soon as possible
   Read all data from the stream
        (use PresignedUrlDownloadRequest.setRange(long, long) to request only the bytes you need)
   Close the input stream in Amazon S3 object as soon as possible

   If these rules are not followed, the client can run out of resources by
   allocating too many open, but unused, HTTP connections.

  presigned-url-download-request - The request object to download the object. - `com.amazonaws.services.s3.model.PresignedUrlDownloadRequest`
  destination-file - Indicates the file (which might already exist) where to save the object content being downloading from Amazon S3. - `java.io.File`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.PresignedUrlDownloadRequest presigned-url-download-request ^java.io.File destination-file]
    (-> this (.download presigned-url-download-request destination-file)))
  (^com.amazonaws.services.s3.model.PresignedUrlDownloadResult [^AmazonS3 this ^com.amazonaws.services.s3.model.PresignedUrlDownloadRequest presigned-url-download-request]
    (-> this (.download presigned-url-download-request))))

(defn set-bucket-lifecycle-configuration
  "Sets the lifecycle configuration for the specified bucket.

  bucket-name - The name of the bucket for which to set the lifecycle configuration. - `java.lang.String`
  bucket-lifecycle-configuration - The new lifecycle configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketLifecycleConfiguration`"
  ([^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketLifecycleConfiguration bucket-lifecycle-configuration]
    (-> this (.setBucketLifecycleConfiguration bucket-name bucket-lifecycle-configuration)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketLifecycleConfigurationRequest set-bucket-lifecycle-configuration-request]
    (-> this (.setBucketLifecycleConfiguration set-bucket-lifecycle-configuration-request))))

(defn get-s-3-account-owner
  "Gets the current owner of the AWS account
   that the authenticated sender of the request is using.


   The caller must authenticate with a valid AWS Access Key ID that is registered
   with AWS.

  get-s-3-account-owner-request - The request object for retrieving the S3 account owner. - `com.amazonaws.services.s3.model.GetS3AccountOwnerRequest`

  returns: The account of the authenticated sender - `com.amazonaws.services.s3.model.Owner`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.Owner [^AmazonS3 this ^com.amazonaws.services.s3.model.GetS3AccountOwnerRequest get-s-3-account-owner-request]
    (-> this (.getS3AccountOwner get-s-3-account-owner-request)))
  (^com.amazonaws.services.s3.model.Owner [^AmazonS3 this]
    (-> this (.getS3AccountOwner))))

(defn delete-bucket-website-configuration
  "This operation removes the website configuration for a bucket. Calling
   this operation on a bucket with no website configuration does not
   throw an exception. Calling this operation a bucket that does not exist
   will throw an exception.

   For more information on how to host a website on Amazon S3, see:
   http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html.

   This operation requires the S3:DeleteBucketWebsite
   permission. By default, only the bucket owner can delete the website
   configuration attached to a bucket. However, bucket owners can grant
   other users permission to delete the website configuration by writing a
   bucket policy granting them the S3:DeleteBucketWebsite
   permission.

  bucket-name - The name of the bucket whose website configuration is being deleted. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketWebsiteConfiguration bucket-name))))

(defn get-object-legal-hold
  "Gets an object's current Legal Hold status.

  get-object-legal-hold-request - The request object for getting an object legal hold status. - `com.amazonaws.services.s3.model.GetObjectLegalHoldRequest`

  returns: A GetObjectLegalHoldResult. - `com.amazonaws.services.s3.model.GetObjectLegalHoldResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetObjectLegalHoldResult [^AmazonS3 this ^com.amazonaws.services.s3.model.GetObjectLegalHoldRequest get-object-legal-hold-request]
    (-> this (.getObjectLegalHold get-object-legal-hold-request))))

(defn upload
  "Uploads a new object into S3 using the given presigned url.


   Depending on whether a file or input stream is being uploaded,
   this request has slightly different behavior.


   When uploading a file:



   The client automatically computes a checksum of the file. Amazon S3 uses
   checksums to validate the data in each file.

   Using the file extension, Amazon S3 attempts to determine the correct content
   type and content disposition to use for the object with some exceptions. See below.


   If the given presigned url is created using SigV2 signer and content type is not provided,
   then SDK will not attempt to determine the content type and instead sends an empty string for content type.
   This is because content type is signed header in SigV2 and so the content type can only be sent
   if it is used in creating presigned url.


   If the given presigned url is created using SigV4 signer, then SDK attempts to determine
   the correct content type and sends it with the request if not provided. Note that this only works
   if you have not used content type while creating the presigned url. If you have used content type while
   creating the url, then you should set the same content type while making this API call through
   PresignedUrlUploadRequest.setMetadata(ObjectMetadata) or
   AmazonWebServiceRequest.putCustomRequestHeader(String, String)



   When uploading directly from an input stream, content length must be
   specified before data can be uploaded to Amazon S3. If not provided, the
   library will have to buffer the contents of the input stream in order
   to calculate it. Amazon S3 explicitly requires that the content length be
   sent in the request headers before any of the data is sent.

  presigned-url-upload-request - `com.amazonaws.services.s3.model.PresignedUrlUploadRequest`

  returns: `com.amazonaws.services.s3.model.PresignedUrlUploadResult`"
  (^com.amazonaws.services.s3.model.PresignedUrlUploadResult [^AmazonS3 this ^com.amazonaws.services.s3.model.PresignedUrlUploadRequest presigned-url-upload-request]
    (-> this (.upload presigned-url-upload-request))))

(defn generate-presigned-url
  "Returns a pre-signed URL for accessing an Amazon S3 resource.


   Pre-signed URLs allow clients to form a URL for an Amazon S3 resource,
   and then sign it with the current AWS security credentials.
   The pre-signed URL
   can be shared to other users, allowing access to the resource without
   providing an account's AWS security credentials.


   Pre-signed URLs are useful in many situations where AWS security
   credentials aren't available from the client that needs to make the
   actual request to Amazon S3.


   For example, an application may need remote users to upload files to the
   application owner's Amazon S3 bucket, but doesn't need to ship the
   AWS security credentials with the application. A pre-signed URL
   to PUT an object into the owner's bucket can be generated from a remote
   location with the owner's AWS security credentials, then the pre-signed
   URL can be passed to the end user's application to use.


   If you are generating presigned url for AWS KMS-encrypted objects, you need to
   specify the correct region of the bucket on your client and configure AWS
   Signature Version 4 for added security. For more information on how to do
   this, see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#
   specify-signature-version

  bucket-name - The name of the bucket containing the desired object. - `java.lang.String`
  key - The key in the specified bucket under which the desired object is stored. - `java.lang.String`
  expiration - The time at which the returned pre-signed URL will expire. - `java.util.Date`
  method - The HTTP method verb to use for this URL - `com.amazonaws.HttpMethod`

  returns: A pre-signed URL which expires at the specified time, and can be
           used to allow anyone to download the specified object from S3,
           without exposing the owner's AWS secret access key. - `java.net.URL`

  throws: com.amazonaws.SdkClientException - If there were any problems pre-signing the request for the specified S3 object."
  (^java.net.URL [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.util.Date expiration ^com.amazonaws.HttpMethod method]
    (-> this (.generatePresignedUrl bucket-name key expiration method)))
  (^java.net.URL [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.util.Date expiration]
    (-> this (.generatePresignedUrl bucket-name key expiration)))
  (^java.net.URL [^AmazonS3 this ^com.amazonaws.services.s3.model.GeneratePresignedUrlRequest generate-presigned-url-request]
    (-> this (.generatePresignedUrl generate-presigned-url-request))))

(defn select-object-content
  "This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement.
   In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the
   object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL
   expression. You must also specify the data serialization format for the response.

  select-request - The request object for selecting object content. - `com.amazonaws.services.s3.model.SelectObjectContentRequest`

  returns: A SelectObjectContentResult. - `com.amazonaws.services.s3.model.SelectObjectContentResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SelectObjectContentResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SelectObjectContentRequest select-request]
    (-> this (.selectObjectContent select-request))))

(defn list-parts
  "Lists the parts that have been uploaded for a specific multipart upload.

   This method must include the upload ID, returned by the
   initiateMultipartUpload(InitiateMultipartUploadRequest)
   operation. This request returns a maximum of 1000 uploaded parts by
   default. You can restrict the number of parts returned by specifying the
   MaxParts property on the ListPartsRequest. If your multipart upload
   consists of more parts than allowed in the ListParts response, the
   response returns a IsTruncated field with value true, and a
   NextPartNumberMarker property. In subsequent ListParts request you can
   include the PartNumberMarker property and set its value to the
   NextPartNumberMarker property value from the previous response.

  request - The ListPartsRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.ListPartsRequest`

  returns: Returns a PartListing from Amazon S3. - `com.amazonaws.services.s3.model.PartListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.PartListing [^AmazonS3 this ^com.amazonaws.services.s3.model.ListPartsRequest request]
    (-> this (.listParts request))))

(defn delete-public-access-block
  "Removes the Public Access Block configuration for an Amazon S3 bucket.

  request - The request object for deleting the buckets Public Access Block configuration. - `com.amazonaws.services.s3.model.DeletePublicAccessBlockRequest`

  returns: A DeletePublicAccessBlockResult. - `com.amazonaws.services.s3.model.DeletePublicAccessBlockResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeletePublicAccessBlockResult [^AmazonS3 this ^com.amazonaws.services.s3.model.DeletePublicAccessBlockRequest request]
    (-> this (.deletePublicAccessBlock request))))

(defn delete-bucket-inventory-configuration
  "Deletes an inventory configuration (identified by the inventory ID) from the bucket.

  bucket-name - The name of the bucket from which the inventory configuration is to be deleted. - `java.lang.String`
  id - The ID of the inventory configuration to delete. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationResult [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.deleteBucketInventoryConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationRequest delete-bucket-inventory-configuration-request]
    (-> this (.deleteBucketInventoryConfiguration delete-bucket-inventory-configuration-request))))

(defn get-object
  "Gets the object stored in Amazon S3 under the specified bucket and key.


   Be extremely careful when using this method; the returned Amazon S3
   object contains a direct stream of data from the HTTP connection. The
   underlying HTTP connection cannot be reused until the user finishes
   reading the data and closes the stream. Also note that if not all data
   is read from the stream then the SDK will abort the underlying connection,
   this may have a negative impact on performance. Therefore:


   Use the data from the input stream in Amazon S3 object as soon as possible
   Read all data from the stream (use GetObjectRequest.setRange(long, long) to request only the bytes you need)
   Close the input stream in Amazon S3 object as soon as possible

   If these rules are not followed, the client can run out of resources by
   allocating too many open, but unused, HTTP connections.

   To get an object from Amazon S3, the caller must have
   Permission.Read access to the object.


   If the object fetched is publicly readable, it can also read it by
   pasting its URL into a browser.


   For more advanced options (such as downloading only a range of an
   object's content, or placing constraints on when the object should be
   downloaded) callers can use getObject(GetObjectRequest).


   If you are accessing AWS
   KMS-encrypted objects, you need to specify the correct region of the
   bucket on your client and configure AWS Signature Version 4 for added
   security. For more information on how to do this, see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#
   specify-signature-version

  bucket-name - The name of the bucket containing the desired object. - `java.lang.String`
  key - The key under which the desired object is stored. - `java.lang.String`

  returns: The object stored in Amazon S3 in the specified bucket and key. - `com.amazonaws.services.s3.model.S3Object`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.S3Object [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObject bucket-name key)))
  (^com.amazonaws.services.s3.model.S3Object [^AmazonS3 this ^com.amazonaws.services.s3.model.GetObjectRequest get-object-request]
    (-> this (.getObject get-object-request))))

(defn delete-object-tagging
  "Remove the tags for the specified object.

  delete-object-tagging-request - The request object containing all the options for deleting the tags for the specified object. - `com.amazonaws.services.s3.model.DeleteObjectTaggingRequest`

  returns: a DeleteObjectTaggingResult object containing the
   information returned by S3 for the the tag deletion. - `com.amazonaws.services.s3.model.DeleteObjectTaggingResult`"
  (^com.amazonaws.services.s3.model.DeleteObjectTaggingResult [^AmazonS3 this ^com.amazonaws.services.s3.model.DeleteObjectTaggingRequest delete-object-tagging-request]
    (-> this (.deleteObjectTagging delete-object-tagging-request))))

(defn requester-pays-enabled?
  "Retrieves the Requester Pays configuration associated with an Amazon S3
   bucket.

   Note:

   If a bucket is enabled for Requester Pays, then any attempt to read an
   object from it without Requester Pays enabled will result in a 403 error
   and the bucket owner will be charged for the request.


   Enabling Requester Pays disables the ability to have anonymous access to
   this bucket.


   For more information on Requester pays, @see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html

  bucket-name - The name of the bucket being checked for Requester Pays. - `java.lang.String`

  returns: true if the bucket is enabled for Requester Pays else false. - `boolean`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^Boolean [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.isRequesterPaysEnabled bucket-name))))

(defn set-public-access-block
  "Creates or modifies the Public Access Block configuration for an Amazon S3 bucket.

  request - The request object for setting the buckets Public Access Block configuration. - `com.amazonaws.services.s3.model.SetPublicAccessBlockRequest`

  returns: A SetPublicAccessBlockResult. - `com.amazonaws.services.s3.model.SetPublicAccessBlockResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetPublicAccessBlockResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SetPublicAccessBlockRequest request]
    (-> this (.setPublicAccessBlock request))))

(defn get-bucket-accelerate-configuration
  "Retrieves the accelerate configuration for the given bucket.

  bucket-name - The name of the bucket whose accelerate configuration is being fetched. - `java.lang.String`

  returns: the accelerate configuration of the bucket. - `com.amazonaws.services.s3.model.BucketAccelerateConfiguration`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^com.amazonaws.services.s3.model.BucketAccelerateConfiguration [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketAccelerateConfiguration bucket-name))))

(defn restore-object
  "Deprecated. use restoreObjectV2(RestoreObjectRequest)

  bucket-name - The name of an existing bucket. - `java.lang.String`
  key - The key under which to store the specified file. - `java.lang.String`
  expiration-in-days - The number of days after which the object will expire. - `int`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^Integer expiration-in-days]
    (-> this (.restoreObject bucket-name key expiration-in-days)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.RestoreObjectRequest request]
    (-> this (.restoreObject request))))

(defn delete-bucket-lifecycle-configuration
  "Removes the lifecycle configuration for the bucket specified.

  bucket-name - The name of the bucket for which to remove the lifecycle configuration. - `java.lang.String`"
  ([^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketLifecycleConfiguration bucket-name))))

(defn set-bucket-inventory-configuration
  "Sets an inventory configuration (identified by the inventory ID) to the bucket.

  bucket-name - The name of the bucket to set the inventory configuration to. - `java.lang.String`
  inventory-configuration - The inventory configuration to set. - `com.amazonaws.services.s3.model.inventory.InventoryConfiguration`

  returns: `com.amazonaws.services.s3.model.SetBucketInventoryConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetBucketInventoryConfigurationResult [^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.inventory.InventoryConfiguration inventory-configuration]
    (-> this (.setBucketInventoryConfiguration bucket-name inventory-configuration)))
  (^com.amazonaws.services.s3.model.SetBucketInventoryConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketInventoryConfigurationRequest set-bucket-inventory-configuration-request]
    (-> this (.setBucketInventoryConfiguration set-bucket-inventory-configuration-request))))

(defn list-objects-v-2
  "bucket-name - `java.lang.String`
  prefix - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.ListObjectsV2Result`

  throws: com.amazonaws.SdkClientException"
  (^com.amazonaws.services.s3.model.ListObjectsV2Result [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String prefix]
    (-> this (.listObjectsV2 bucket-name prefix)))
  (^com.amazonaws.services.s3.model.ListObjectsV2Result [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.listObjectsV2 bucket-name))))

(defn get-bucket-website-configuration
  "Returns the website configuration for the specified bucket. Bucket
   website configuration allows you to host your static websites entirely
   out of Amazon S3. To host your website in Amazon S3, create a bucket,
   upload your files, and configure it as a website. Once your bucket has
   been configured as a website, you can access all your content via the
   Amazon S3 website endpoint. To ensure that the existing Amazon S3 REST
   API will continue to behave the same, regardless of whether or not your
   bucket has been configured to host a website, a new HTTP endpoint has
   been introduced where you can access your content. The bucket content you
   want to make available via the website must be publicly readable.

   For more information on how to host a website on Amazon S3, see:
   http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html.

   This operation requires the S3:GetBucketWebsite permission.
   By default, only the bucket owner can read the bucket website
   configuration. However, bucket owners can allow other users to read the
   website configuration by writing a bucket policy granting them the
   S3:GetBucketWebsite permission.

  bucket-name - The name of the bucket whose website configuration is being retrieved. - `java.lang.String`

  returns: The bucket website configuration for the specified bucket,
           otherwise null if there is no website configuration set for the
           specified bucket. - `com.amazonaws.services.s3.model.BucketWebsiteConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketWebsiteConfiguration [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketWebsiteConfiguration bucket-name))))

(defn set-bucket-logging-configuration
  "Sets the logging configuration for the specified bucket.
   The bucket
   logging configuration object indicates whether server access logging is
   enabled or not for the specified bucket, the destination bucket
   where server access logs are delivered, and the optional log file prefix.


   In order to deliver server access logs, the destination bucket must have
   log delivery write permissions. You can use the
   CannedAccessControlList.LogDeliveryWrite ACL to quickly add the
   correct permissions to your destination bucket, or you can modify the
   bucket's existing ACL to grant the GroupGrantee.LogDelivery group
   grantee the Permission.Write permission.


   Changes to the logging status for a bucket are visible in the
   configuration API immediately, but they take time to actually affect the
   delivery of log files. For example, if logging is enabled for a bucket,
   some requests made in the following hour might be logged, while others
   might not. Or, if you change the target bucket for logging from bucket A
   to bucket B, some logs for the next hour might continue to be delivered
   to bucket A, while others might be delivered to the new target bucket B.
   In all cases, the new settings will eventually take effect without any
   further action on your part.

  set-bucket-logging-configuration-request - The request object containing all options for setting the bucket logging configuration. - `com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest set-bucket-logging-configuration-request]
    (-> this (.setBucketLoggingConfiguration set-bucket-logging-configuration-request))))

(defn set-bucket-website-configuration
  "Sets the website configuration for the specified bucket. Bucket
   website configuration allows you to host your static websites entirely
   out of Amazon S3. To host your website in Amazon S3, create a bucket,
   upload your files, and configure it as a website. Once your bucket has
   been configured as a website, you can access all your content via the
   Amazon S3 website endpoint. To ensure that the existing Amazon S3 REST
   API will continue to behave the same, regardless of whether or not your
   bucket has been configured to host a website, a new HTTP endpoint has
   been introduced where you can access your content. The bucket content you
   want to make available via the website must be publicly readable.

   For more information on how to host a website on Amazon S3, see:
   http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html.

   This operation requires the S3:PutBucketWebsite permission.
   By default, only the bucket owner can configure the website attached to a
   bucket. However, bucket owners can allow other users to set the website
   configuration by writing a bucket policy granting them the
   S3:PutBucketWebsite permission.

  bucket-name - The name of the bucket whose website configuration is being set. - `java.lang.String`
  configuration - The configuration describing how the specified bucket will serve web requests (i.e. default index page, error page). - `com.amazonaws.services.s3.model.BucketWebsiteConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketWebsiteConfiguration configuration]
    (-> this (.setBucketWebsiteConfiguration bucket-name configuration)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketWebsiteConfigurationRequest set-bucket-website-configuration-request]
    (-> this (.setBucketWebsiteConfiguration set-bucket-website-configuration-request))))

(defn get-public-access-block
  "Retrieves the Public Access Block configuration for an Amazon S3 bucket.

  request - The request object for getting the buckets Public Access Block configuration. - `com.amazonaws.services.s3.model.GetPublicAccessBlockRequest`

  returns: A GetPublicAccessBlockResult. - `com.amazonaws.services.s3.model.GetPublicAccessBlockResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetPublicAccessBlockResult [^AmazonS3 this ^com.amazonaws.services.s3.model.GetPublicAccessBlockRequest request]
    (-> this (.getPublicAccessBlock request))))

(defn set-bucket-replication-configuration
  "Sets a replication configuration for the Amazon S3 bucket.

  bucket-name - The Amazon S3 bucket for which the replication configuration is set. - `java.lang.String`
  configuration - The replication configuration. - `com.amazonaws.services.s3.model.BucketReplicationConfiguration`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketReplicationConfiguration configuration]
    (-> this (.setBucketReplicationConfiguration bucket-name configuration)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketReplicationConfigurationRequest set-bucket-replication-configuration-request]
    (-> this (.setBucketReplicationConfiguration set-bucket-replication-configuration-request))))

(defn list-next-batch-of-objects
  "Provides an easy way to continue a truncated object listing and retrieve
   the next page of results.


   To continue the object listing and retrieve the next page of results,
   call the initial ObjectListing from one of the
   listObjects methods.
   If truncated
   (indicated when ObjectListing.isTruncated() returns true),
   pass the ObjectListing back into this method
   in order to retrieve the
   next page of results. Continue using this method to
   retrieve more results until the returned ObjectListing indicates that
   it is not truncated.

  previous-object-listing - The previous truncated ObjectListing. If a non-truncated ObjectListing is passed in, an empty ObjectListing is returned without ever contacting Amazon S3. - `com.amazonaws.services.s3.model.ObjectListing`

  returns: The next set of ObjectListing results, beginning immediately
           after the last result in the specified previous ObjectListing. - `com.amazonaws.services.s3.model.ObjectListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.ObjectListing [^AmazonS3 this ^com.amazonaws.services.s3.model.ObjectListing previous-object-listing]
    (-> this (.listNextBatchOfObjects previous-object-listing))))

(defn set-object-redirect-location
  "Deprecated. this operation will not retain the ACL's or SSE parameters
   associated with the given Amazon S3 object. Use copyObject(CopyObjectRequest)
   instead.

  bucket-name - The name of the bucket containing the object. - `java.lang.String`
  key - The key of the object within the specified bucket. - `java.lang.String`
  new-redirect-location - The new redirect location for the specified object. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String new-redirect-location]
    (-> this (.setObjectRedirectLocation bucket-name key new-redirect-location))))

(defn get-bucket-policy-status
  "Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public

  request - The request object for getting the current policy status of the bucket. - `com.amazonaws.services.s3.model.GetBucketPolicyStatusRequest`

  returns: A DeletePublicAccessBlockResult. - `com.amazonaws.services.s3.model.GetBucketPolicyStatusResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketPolicyStatusResult [^AmazonS3 this ^com.amazonaws.services.s3.model.GetBucketPolicyStatusRequest request]
    (-> this (.getBucketPolicyStatus request))))

(defn set-bucket-accelerate-configuration
  "Sets the accelerate configuration for the specified bucket. *

  bucket-name - The name of the bucket whose accelerate configuration is being set. - `java.lang.String`
  accelerate-configuration - The new accelerate configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketAccelerateConfiguration`

  throws: com.amazonaws.AmazonServiceException"
  ([^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketAccelerateConfiguration accelerate-configuration]
    (-> this (.setBucketAccelerateConfiguration bucket-name accelerate-configuration)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest set-bucket-accelerate-configuration-request]
    (-> this (.setBucketAccelerateConfiguration set-bucket-accelerate-configuration-request))))

(defn abort-multipart-upload
  "Aborts a multipart upload. After a multipart upload is aborted, no
   additional parts can be uploaded using that upload ID. The storage
   consumed by any previously uploaded parts will be freed. However, if any
   part uploads are currently in progress, those part uploads may or may not
   succeed. As a result, it may be necessary to abort a given multipart
   upload multiple times in order to completely free all storage consumed by
   all parts.

  request - The AbortMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.AbortMultipartUploadRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.AbortMultipartUploadRequest request]
    (-> this (.abortMultipartUpload request))))

(defn list-bucket-metrics-configurations
  "Lists the metrics configurations for the bucket.

  list-bucket-metrics-configurations-request - The request object to list all the metrics configurations for a bucket. - `com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsRequest`

  returns: The result containing the list of all the metrics configurations for the bucket. - `com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult [^AmazonS3 this ^com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsRequest list-bucket-metrics-configurations-request]
    (-> this (.listBucketMetricsConfigurations list-bucket-metrics-configurations-request))))

(defn get-bucket-logging-configuration
  "Gets the logging configuration for the specified bucket.
   The bucket
   logging configuration object indicates if server access logging is
   enabled for the specified bucket, the destination bucket
   where server access logs are delivered, and the optional log file prefix.

  bucket-name - The name of the bucket whose bucket logging configuration is being retrieved. - `java.lang.String`

  returns: The bucket logging configuration for the specified bucket. - `com.amazonaws.services.s3.model.BucketLoggingConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketLoggingConfiguration [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketLoggingConfiguration bucket-name))))

(defn delete-bucket-cross-origin-configuration
  "Delete the cross origin configuration for the specified bucket.

  bucket-name - The name of the bucket for which to retrieve cross origin configuration. - `java.lang.String`"
  ([^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketCrossOriginConfiguration bucket-name))))

(defn set-bucket-acl
  "Sets the AccessControlList for the specified Amazon S3 bucket.


   Each bucket and object in Amazon S3 has an ACL that defines its access
   control policy. When a request is made, Amazon S3 authenticates the
   request using its standard authentication procedure and then checks the
   ACL to verify the sender was granted access to the bucket or object. If
   the sender is approved, the request proceeds. Otherwise, Amazon S3
   returns an error.


   When constructing a custom AccessControlList, callers typically retrieve
   the existing AccessControlList for a bucket (
   AmazonS3Client.getBucketAcl(String)), modify it as necessary, and
   then use this method to upload the new ACL.

  bucket-name - The name of the bucket whose ACL is being set. - `java.lang.String`
  acl - The new AccessControlList for the specified bucket. - `com.amazonaws.services.s3.model.AccessControlList`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.AccessControlList acl]
    (-> this (.setBucketAcl bucket-name acl)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketAclRequest set-bucket-acl-request]
    (-> this (.setBucketAcl set-bucket-acl-request))))

(defn set-object-retention
  "Places an Object Retention configuration on an object.

  set-object-retention-request - The request object for setting the object retention. - `com.amazonaws.services.s3.model.SetObjectRetentionRequest`

  returns: A SetObjectRetentionResult. - `com.amazonaws.services.s3.model.SetObjectRetentionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetObjectRetentionResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SetObjectRetentionRequest set-object-retention-request]
    (-> this (.setObjectRetention set-object-retention-request))))

(defn set-endpoint
  "Overrides the default endpoint for this client.
   Use this method to send requests to the specified AWS region.


   Pass the endpoint (e.g. \"s3.amazonaws.com\") or a full
   URL, including the protocol (e.g. \"https://s3.amazonaws.com\"). If the
   protocol is not specified, the protocol  from this client's
   ClientConfiguration is used.

  endpoint - The endpoint (e.g. \"s3.amazonaws.com\") or the full URL, including the protocol (e.g. \"https://s3.amazonaws.com\"), of the region-specific AWS endpoint this client will communicate with. - `java.lang.String`

  throws: java.lang.IllegalArgumentException - If the specified endpoint is not a valid URL endpoint."
  ([^AmazonS3 this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-bucket-lifecycle-configuration
  "Gets the lifecycle configuration for the specified bucket, or null if
   the specified bucket does not exist or if no configuration has been established.

  bucket-name - The name of the bucket for which to retrieve lifecycle configuration. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.BucketLifecycleConfiguration`"
  (^com.amazonaws.services.s3.model.BucketLifecycleConfiguration [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketLifecycleConfiguration bucket-name))))

(defn delete-bucket
  "Deletes the specified bucket. All objects (and all object versions, if versioning
   was ever enabled) in the bucket must be deleted before the bucket itself
   can be deleted.


   Only the owner of a bucket can delete it, regardless of the bucket's
   access control policy (ACL).

  delete-bucket-request - The request object containing all options for deleting an Amazon S3 bucket. - `com.amazonaws.services.s3.model.DeleteBucketRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.DeleteBucketRequest delete-bucket-request]
    (-> this (.deleteBucket delete-bucket-request))))

(defn restore-object-v-2
  "Restore an object, which was transitioned to Amazon Glacier from Amazon
   S3 when it was expired, into Amazon S3 again. This copy is by nature temporary
   and is always stored as RRS in Amazon S3. The customer will be able to set /
   re-adjust the lifetime of this copy. By re-adjust we mean the customer
   can call this API to shorten or extend the lifetime of the copy. Note the
   request will only be accepted when there is no ongoing restore request. One
   needs to have the new s3:RestoreObject permission to perform this
   operation.

  request - The request object containing all the options for restoring an Amazon S3 object. - `com.amazonaws.services.s3.model.RestoreObjectRequest`

  returns: A RestoreObjectResult from Amazon S3. - `com.amazonaws.services.s3.model.RestoreObjectResult`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^com.amazonaws.services.s3.model.RestoreObjectResult [^AmazonS3 this ^com.amazonaws.services.s3.model.RestoreObjectRequest request]
    (-> this (.restoreObjectV2 request))))

(defn initiate-multipart-upload
  "Initiates a multipart upload and returns an InitiateMultipartUploadResult
   which contains an upload ID. This upload ID associates all the parts in
   the specific upload and is used in each of your subsequent
   uploadPart(UploadPartRequest) requests. You also include this
   upload ID in the final request to either complete, or abort the multipart
   upload request.

   Note: After you initiate a multipart upload and upload one or more
   parts, you must either complete or abort the multipart upload in order to
   stop getting charged for storage of the uploaded parts. Once you complete
   or abort the multipart upload Amazon S3 will release the stored parts and
   stop charging you for their storage.


   If you are initiating a multipart upload for AWS KMS-encrypted objects, you need
   to specify the correct region of the bucket on your client and configure
   AWS Signature Version 4 for added security. For more information on how
   to do this, see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#
   specify-signature-version

  request - The InitiateMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.InitiateMultipartUploadRequest`

  returns: An InitiateMultipartUploadResult from Amazon S3. - `com.amazonaws.services.s3.model.InitiateMultipartUploadResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.InitiateMultipartUploadResult [^AmazonS3 this ^com.amazonaws.services.s3.model.InitiateMultipartUploadRequest request]
    (-> this (.initiateMultipartUpload request))))

(defn list-bucket-inventory-configurations
  "Returns the list of inventory configurations for the bucket.

  list-bucket-inventory-configurations-request - The request object to list the inventory configurations in a bucket. - `com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsRequest`

  returns: An ListBucketInventoryConfigurationsResult object containing the list of InventoryConfigurations. - `com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult [^AmazonS3 this ^com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsRequest list-bucket-inventory-configurations-request]
    (-> this (.listBucketInventoryConfigurations list-bucket-inventory-configurations-request))))

(defn get-bucket-analytics-configuration
  "Gets an analytics configuration for the bucket (specified by the analytics configuration ID).

  bucket-name - The name of the bucket to get the analytics configuration from. - `java.lang.String`
  id - The ID of the analytics configuration to get. - `java.lang.String`

  returns: The result containing the requested analytics configuration. - `com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.getBucketAnalyticsConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationRequest get-bucket-analytics-configuration-request]
    (-> this (.getBucketAnalyticsConfiguration get-bucket-analytics-configuration-request))))

(defn get-object-metadata
  "Gets the metadata for the specified Amazon S3 object without
   actually fetching the object itself.
   This is useful in obtaining only the object metadata,
   and avoids wasting bandwidth on fetching
   the object data.


   The object metadata contains information such as content type, content
   disposition, etc., as well as custom user metadata that can be associated
   with an object in Amazon S3.

  bucket-name - The name of the bucket containing the object's whose metadata is being retrieved. - `java.lang.String`
  key - The key of the object whose metadata is being retrieved. - `java.lang.String`

  returns: All Amazon S3 object metadata for the specified object. - `com.amazonaws.services.s3.model.ObjectMetadata`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.ObjectMetadata [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObjectMetadata bucket-name key)))
  (^com.amazonaws.services.s3.model.ObjectMetadata [^AmazonS3 this ^com.amazonaws.services.s3.model.GetObjectMetadataRequest get-object-metadata-request]
    (-> this (.getObjectMetadata get-object-metadata-request))))

(defn set-bucket-cross-origin-configuration
  "Sets the cross origin configuration for the specified bucket.

  bucket-name - The name of the bucket for which to retrieve cross origin configuration. - `java.lang.String`
  bucket-cross-origin-configuration - The new cross origin configuration for this bucket, which completely replaces any existing configuration. - `com.amazonaws.services.s3.model.BucketCrossOriginConfiguration`"
  ([^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketCrossOriginConfiguration bucket-cross-origin-configuration]
    (-> this (.setBucketCrossOriginConfiguration bucket-name bucket-cross-origin-configuration)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketCrossOriginConfigurationRequest set-bucket-cross-origin-configuration-request]
    (-> this (.setBucketCrossOriginConfiguration set-bucket-cross-origin-configuration-request))))

(defn delete-bucket-policy
  "Deletes the policy associated with the specified bucket. Only the owner
   of the bucket can delete the bucket policy.


   Bucket policies provide access control management at the bucket level for
   both the bucket resource and contained object resources. Only one policy
   can be specified per-bucket.


   See the
   Amazon S3 developer guide for more information on forming bucket
   polices.

  bucket-name - The name of the Amazon S3 bucket whose policy is being deleted. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.deleteBucketPolicy bucket-name))))

(defn head-bucket
  "Performs a head bucket operation on the requested bucket name. This operation is useful to
   determine if a bucket exists and you have permission to access it.

  head-bucket-request - The request containing the bucket name. - `com.amazonaws.services.s3.model.HeadBucketRequest`

  returns: This method returns a HeadBucketResult if the bucket exists and you have
           permission to access it. Otherwise, the method will throw an
           AmazonServiceException with status code '404 Not Found' if the bucket
           does not exist, '403 Forbidden' if the user does not have access to the
           bucket, or '301 Moved Permanently' if the bucket is in a different region
           than the client is configured with - `com.amazonaws.services.s3.model.HeadBucketResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.HeadBucketResult [^AmazonS3 this ^com.amazonaws.services.s3.model.HeadBucketRequest head-bucket-request]
    (-> this (.headBucket head-bucket-request))))

(defn list-buckets
  "Returns a list of all Amazon S3 buckets that the
   authenticated sender of the request owns.


   Users must authenticate with a valid AWS Access Key ID that is registered
   with Amazon S3. Anonymous requests cannot list buckets, and users cannot
   list buckets that they did not create.

  list-buckets-request - The request containing all of the options related to the listing of buckets. - `com.amazonaws.services.s3.model.ListBucketsRequest`

  returns: A list of all of the Amazon S3 buckets owned by the authenticated
           sender of the request. - `java.util.List<com.amazonaws.services.s3.model.Bucket>`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^java.util.List [^AmazonS3 this ^com.amazonaws.services.s3.model.ListBucketsRequest list-buckets-request]
    (-> this (.listBuckets list-buckets-request)))
  (^java.util.List [^AmazonS3 this]
    (-> this (.listBuckets))))

(defn set-bucket-encryption
  "Creates a new server-side encryption configuration (or replaces an existing one, if present).

  set-bucket-encryption-request - The request object for setting the bucket encryption configuration. - `com.amazonaws.services.s3.model.SetBucketEncryptionRequest`

  returns: A SetBucketEncryptionResult. - `com.amazonaws.services.s3.model.SetBucketEncryptionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetBucketEncryptionResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketEncryptionRequest set-bucket-encryption-request]
    (-> this (.setBucketEncryption set-bucket-encryption-request))))

(defn set-object-acl
  "Sets the CannedAccessControlList for the specified object
   with the specified version in Amazon S3.
   Each version of an object has its own associated
   ACL.


   Each bucket and object in Amazon S3 has an ACL that defines its access
   control policy. When a request is made, Amazon S3 authenticates the
   request using its standard authentication procedure and then checks the
   ACL to verify the sender was granted access to the bucket or object. If
   the sender is approved, the request proceeds. Otherwise, Amazon S3
   returns an error.


   When constructing a custom AccessControlList, callers typically retrieve
   the existing AccessControlList for an object (
   AmazonS3Client.getObjectAcl(String, String)), modify it as
   necessary, and then use this method to upload the new ACL.


   For more information about enabling versioning for a bucket, see
   setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest).

  bucket-name - The name of the bucket containing the object whose ACL is being set. - `java.lang.String`
  key - The key of the object within the specified bucket whose ACL is being set. - `java.lang.String`
  version-id - The version ID of the object version whose ACL is being set. - `java.lang.String`
  acl - The new AccessControlList for the specified object. - `com.amazonaws.services.s3.model.AccessControlList`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id ^com.amazonaws.services.s3.model.AccessControlList acl]
    (-> this (.setObjectAcl bucket-name key version-id acl)))
  ([^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^com.amazonaws.services.s3.model.AccessControlList acl]
    (-> this (.setObjectAcl bucket-name key acl)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetObjectAclRequest set-object-acl-request]
    (-> this (.setObjectAcl set-object-acl-request))))

(defn get-bucket-metrics-configuration
  "Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.

  bucket-name - The name of the bucket to get the metrics configuration from. - `java.lang.String`
  id - The ID of the metrics configuration to get. - `java.lang.String`

  returns: The result containing the requested metrics configuration. - `com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.getBucketMetricsConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.GetBucketMetricsConfigurationRequest get-bucket-metrics-configuration-request]
    (-> this (.getBucketMetricsConfiguration get-bucket-metrics-configuration-request))))

(defn get-object-acl
  "Gets the AccessControlList (ACL) for the specified object
   with the specified version in Amazon S3.
   Each version of an object has its own associated
   ACL.


   Each bucket and object in Amazon S3 has an ACL that defines its access
   control policy. When a request is made, Amazon S3 authenticates the
   request using its standard authentication procedure and then checks the
   ACL to verify the sender was granted access to the bucket or object. If
   the sender is approved, the request proceeds. Otherwise, Amazon S3
   returns an error.


   For more information about enabling versioning for a bucket, see
   setBucketVersioningConfiguration(SetBucketVersioningConfigurationRequest).

  bucket-name - The name of the bucket containing the object whose ACL is being retrieved. - `java.lang.String`
  key - The key of the object within the specified bucket whose ACL is being retrieved. - `java.lang.String`
  version-id - The version ID of the object version whose ACL is being retrieved. - `java.lang.String`

  returns: The AccessControlList for the specified Amazon S3 object. - `com.amazonaws.services.s3.model.AccessControlList`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.AccessControlList [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.lang.String version-id]
    (-> this (.getObjectAcl bucket-name key version-id)))
  (^com.amazonaws.services.s3.model.AccessControlList [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.getObjectAcl bucket-name key)))
  (^com.amazonaws.services.s3.model.AccessControlList [^AmazonS3 this ^com.amazonaws.services.s3.model.GetObjectAclRequest get-object-acl-request]
    (-> this (.getObjectAcl get-object-acl-request))))

(defn get-bucket-policy
  "Gets the policy for the specified bucket. Only the owner of the
   bucket can retrieve the policy. If no policy has been set for the bucket,
   then an empty result object with a null policy text field will be
   returned.


   Bucket policies provide access control management at the bucket level for
   both the bucket resource and contained object resources. Only one policy
   can be specified per-bucket.


   See the
   Amazon S3 developer guide for more information on forming bucket
   polices.

  bucket-name - The name of the Amazon S3 bucket whose policy is being retrieved. - `java.lang.String`

  returns: The Amazon S3 bucket policy for the specified bucket. - `com.amazonaws.services.s3.model.BucketPolicy`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketPolicy [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketPolicy bucket-name))))

(defn list-objects
  "Returns a list of summary information about the objects in the specified
   bucket. Depending on request parameters, additional information is returned,
   such as common prefixes if a delimiter was specified.  List
   results are always returned in lexicographic (alphabetical) order.


   Because buckets can contain a virtually unlimited number of keys, the
   complete results of a list query can be extremely large. To manage large
   result sets, Amazon S3 uses pagination to split them into multiple
   responses. Always check the
   ObjectListing.isTruncated() method to see if the returned
   listing is complete or if additional calls are needed to get
   more results. Alternatively, use the
   AmazonS3Client.listNextBatchOfObjects(ObjectListing) method as
   an easy way to get the next page of object listings.


   For example, consider a bucket that contains the following keys:

          \"foo/bar/baz\"
          \"foo/bar/bash\"
          \"foo/bar/bang\"
          \"foo/boo\"

   If calling listObjects with
   a prefix value of \"foo/\" and a delimiter value of \"/\"
   on this bucket, an ObjectListing is returned that contains one key
   (\"foo/boo\") and one entry in the common prefixes list (\"foo/bar/\").
   To see deeper into the virtual hierarchy, make another
   call to listObjects setting the prefix parameter to any interesting
   common prefix to list the individual keys under that prefix.


   The total number of keys in a bucket doesn't substantially
   affect list performance.

  bucket-name - The name of the Amazon S3 bucket to list. - `java.lang.String`
  prefix - An optional parameter restricting the response to keys beginning with the specified prefix. Use prefixes to separate a bucket into different sets of keys, similar to how a file system organizes files into directories. - `java.lang.String`

  returns: A listing of the objects in the specified bucket, along with any
           other associated information, such as common prefixes (if a
           delimiter was specified), the original request parameters, etc. - `com.amazonaws.services.s3.model.ObjectListing`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.ObjectListing [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String prefix]
    (-> this (.listObjects bucket-name prefix)))
  (^com.amazonaws.services.s3.model.ObjectListing [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.listObjects bucket-name))))

(defn delete-bucket-analytics-configuration
  "Deletes an analytics configuration for the bucket (specified by the analytics configuration ID).

  bucket-name - The name of the bucket from which the analytics configuration is to be deleted - `java.lang.String`
  id - The ID of the analytics configuration to delete. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationResult [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.deleteBucketAnalyticsConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationRequest delete-bucket-analytics-configuration-request]
    (-> this (.deleteBucketAnalyticsConfiguration delete-bucket-analytics-configuration-request))))

(defn change-object-storage-class
  "Deprecated. this operation will not retain the ACL's or SSE parameters
   associated with the given Amazon S3 object. Use copyObject(CopyObjectRequest)
   instead.

  bucket-name - The name of the bucket containing the object. - `java.lang.String`
  key - The key of the object within the specified bucket. - `java.lang.String`
  new-storage-class - The new storage class for the specified object. - `com.amazonaws.services.s3.model.StorageClass`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^com.amazonaws.services.s3.model.StorageClass new-storage-class]
    (-> this (.changeObjectStorageClass bucket-name key new-storage-class))))

(defn set-bucket-notification-configuration
  "Sets the notification configuration for the specified bucket.

   By default, new buckets have no notification configuration set.

   The notification configuration of a bucket provides near realtime notifications
   of events the user is interested in, using SNS as the delivery service.
   Notification is turned on by enabling configuration on a bucket, specifying
   the events and the SNS topic. This configuration can only be turned
   on by the bucket owner. If a notification configuration already exists for the
   specified bucket, the new notification configuration will replace the existing
   notification configuration.  To remove the notification configuration pass in
   an empty request.  Currently, buckets may only have a single event and topic
   configuration.

   S3 is eventually consistent. It may take time for the notification status
   of a bucket to be propagated throughout the system.

  bucket-name - The name of the Amazon S3 bucket whose notification configuration is being set. - `java.lang.String`
  bucket-notification-configuration - The request object containing all options for setting the bucket notification configuration. - `com.amazonaws.services.s3.model.BucketNotificationConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered on the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.BucketNotificationConfiguration bucket-notification-configuration]
    (-> this (.setBucketNotificationConfiguration bucket-name bucket-notification-configuration)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketNotificationConfigurationRequest set-bucket-notification-configuration-request]
    (-> this (.setBucketNotificationConfiguration set-bucket-notification-configuration-request))))

(defn set-bucket-policy
  "Sets the policy associated with the specified bucket. Only the owner of
   the bucket can set a bucket policy. If a policy already exists for the
   specified bucket, the new policy replaces the existing policy.


   Bucket policies provide access control management at the bucket level for
   both the bucket resource and contained object resources. Only one policy
   can be specified per-bucket.


   See the
   Amazon S3 developer guide for more information on forming bucket
   polices.

  bucket-name - The name of the Amazon S3 bucket whose policy is being set. - `java.lang.String`
  policy-text - The policy to apply to the specified bucket. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String policy-text]
    (-> this (.setBucketPolicy bucket-name policy-text)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketPolicyRequest set-bucket-policy-request]
    (-> this (.setBucketPolicy set-bucket-policy-request))))

(defn delete-object
  "Deletes the specified object in the specified bucket. Once deleted, the object
   can only be restored if versioning was enabled when the object was deleted.


   If attempting to delete an object that does not exist,
   Amazon S3 returns
   a success message instead of an error message.

  bucket-name - The name of the Amazon S3 bucket containing the object to delete. - `java.lang.String`
  key - The key of the object to delete. - `java.lang.String`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key]
    (-> this (.deleteObject bucket-name key)))
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.DeleteObjectRequest delete-object-request]
    (-> this (.deleteObject delete-object-request))))

(defn set-object-tagging
  "Set the tags for the specified object.

  set-object-tagging-request - The request object containing all the options for setting the tags for the specified object. - `com.amazonaws.services.s3.model.SetObjectTaggingRequest`

  returns: `com.amazonaws.services.s3.model.SetObjectTaggingResult`"
  (^com.amazonaws.services.s3.model.SetObjectTaggingResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SetObjectTaggingRequest set-object-tagging-request]
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


   If you are copying AWS KMS-encrypted objects, you need to
   specify the correct region of the bucket on your client and configure AWS
   Signature Version 4 for added security. For more information on how to do
   this, see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#
   specify-signature-version

  copy-part-request - The request object containing all the options for copying an Amazon S3 object. - `com.amazonaws.services.s3.model.CopyPartRequest`

  returns: A CopyPartResult object containing the information
           returned by Amazon S3 about the newly created object, or null if
           constraints were specified that weren't met when Amazon S3 attempted
           to copy the object. - `com.amazonaws.services.s3.model.CopyPartResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.CopyPartResult [^AmazonS3 this ^com.amazonaws.services.s3.model.CopyPartRequest copy-part-request]
    (-> this (.copyPart copy-part-request))))

(defn does-bucket-exist-v-2
  "Checks if the specified bucket exists. Amazon S3 buckets are named in a
   global namespace; use this method to determine if a specified bucket name
   already exists, and therefore can't be used to create a new bucket.


   Internally this uses the getBucketAcl(String) operation to determine
   whether the bucket exists.

  bucket-name - The name of the bucket to check. - `java.lang.String`

  returns: The value true if the specified bucket exists in
           Amazon S3; the value false if there is no bucket in
           Amazon S3 with that name. - `boolean`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^Boolean [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.doesBucketExistV2 bucket-name))))

(defn get-cached-response-metadata
  "Gets additional metadata for a previously executed successful request.
   The returned metadata is typically used for debugging issues when a
   service isn't acting as expected. This data isn't considered part of the
   result data returned by an operation; as so, it's available through this
   separate diagnostic interface.

   Response metadata is only cached for a limited period of time. Use this
   method to retrieve the response metadata as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or
           null if none is available. - `com.amazonaws.services.s3.S3ResponseMetadata`"
  (^com.amazonaws.services.s3.S3ResponseMetadata [^AmazonS3 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn set-object-legal-hold
  "Applies a Legal Hold configuration to the specified object.

  set-object-legal-hold-request - The request object for setting the object legal hold. - `com.amazonaws.services.s3.model.SetObjectLegalHoldRequest`

  returns: A SetObjectLegalHoldResult. - `com.amazonaws.services.s3.model.SetObjectLegalHoldResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetObjectLegalHoldResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SetObjectLegalHoldRequest set-object-legal-hold-request]
    (-> this (.setObjectLegalHold set-object-legal-hold-request))))

(defn disable-requester-pays
  "Allows Amazon S3 bucket owner to disable the Requester Pays for the
   given bucket name.

   Note:

   If a bucket is enabled for Requester Pays, then any attempt to read an
   object from it without Requester Pays enabled in getObject will result in
   a 403 error and the bucket owner will be charged for the request.


   Enabling Requester Pays disables the ability to have anonymous access to
   this bucket


   For more information on Requester pays, @see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html

  bucket-name - The name of bucket being disabled for Requester Pays. - `java.lang.String`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  ([^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.disableRequesterPays bucket-name))))

(defn put-object
  "Uploads the specified input stream and object metadata to Amazon S3 under
   the specified bucket and key name.


   Amazon S3 never stores partial objects;
   if during this call an exception wasn't thrown,
   the entire object was stored.


   If you are uploading or accessing AWS KMS-encrypted objects, you need to
   specify the correct region of the bucket on your client and configure AWS
   Signature Version 4 for added security. For more information on how to do
   this, see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#
   specify-signature-version


   The client automatically computes
   a checksum of the file. This checksum is verified against another checksum
   that is calculated once the data reaches Amazon S3, ensuring the data
   has not corrupted in transit over the network.


   Using the file extension, Amazon S3 attempts to determine
   the correct content type and content disposition to use
   for the object.


   Content length must be specified before data can be uploaded to
   Amazon S3. If the caller doesn't provide it, the library will make a best
   effort to compute the content length by buffer the contents of the input
   stream into the memory because Amazon S3 explicitly requires that the
   content length be sent in the request headers before any of the data is
   sent. Please note that this operation is not guaranteed to succeed.


   When using an BufferedInputStream as data source,
   please remember to use a buffer of size no less than
   RequestClientOptions.DEFAULT_STREAM_BUFFER_SIZE
   while initializing the BufferedInputStream.
   This is to ensure that the SDK can correctly mark and reset the stream with
   enough memory buffer during signing and retries.


   If versioning is enabled for the specified bucket, this operation will
   never overwrite an existing object at the same key, but instead will keep
   the existing object around as an older version until that version is
   explicitly deleted (see
   deleteVersion(String, String, String).



   If versioning is not enabled,
   this operation will overwrite an existing object
   with the same key; Amazon S3 will store the last write request.
   Amazon S3 does not provide object locking.
   If Amazon S3 receives multiple write requests for the same object nearly
   simultaneously, all of the objects might be stored.  However, a single
   object will be stored with the final write request.



   When specifying a location constraint when creating a bucket, all objects
   added to the bucket are stored in the bucket's region. For example, if
   specifying a Europe (EU) region constraint for a bucket, all of that
   bucket's objects are stored in EU region.


   The specified bucket must already exist and the caller must have
   Permission.Write permission to the bucket to upload an object.

  bucket-name - The name of an existing bucket, to which you have Permission.Write permission. - `java.lang.String`
  key - The key under which to store the specified file. - `java.lang.String`
  input - The input stream containing the data to be uploaded to Amazon S3. - `java.io.InputStream`
  metadata - Additional metadata instructing Amazon S3 how to handle the uploaded data (e.g. custom user metadata, hooks for specifying content type, etc.). - `com.amazonaws.services.s3.model.ObjectMetadata`

  returns: A PutObjectResult object containing the information
           returned by Amazon S3 for the newly created object. - `com.amazonaws.services.s3.model.PutObjectResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.PutObjectResult [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.io.InputStream input ^com.amazonaws.services.s3.model.ObjectMetadata metadata]
    (-> this (.putObject bucket-name key input metadata)))
  (^com.amazonaws.services.s3.model.PutObjectResult [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String key ^java.io.File file]
    (-> this (.putObject bucket-name key file)))
  (^com.amazonaws.services.s3.model.PutObjectResult [^AmazonS3 this ^com.amazonaws.services.s3.model.PutObjectRequest put-object-request]
    (-> this (.putObject put-object-request))))

(defn get-bucket-tagging-configuration
  "Gets the tagging configuration for the specified bucket, or null if
   the specified bucket does not exist, or if no configuration has been established.

  bucket-name - The name of the bucket for which to retrieve tagging configuration. - `java.lang.String`

  returns: `com.amazonaws.services.s3.model.BucketTaggingConfiguration`"
  (^com.amazonaws.services.s3.model.BucketTaggingConfiguration [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketTaggingConfiguration bucket-name))))

(defn get-bucket-versioning-configuration
  "Returns the versioning configuration for the specified bucket.


   A bucket's versioning configuration can be in one of three possible
   states:

        BucketVersioningConfiguration.OFF
        BucketVersioningConfiguration.ENABLED
        BucketVersioningConfiguration.SUSPENDED



   By default, new buckets are in the
   off state. Once versioning is
   enabled for a bucket the status can never be reverted to
   off.


   The versioning configuration of a bucket has different implications for
   each operation performed on that bucket or for objects within that
   bucket. For example, when versioning is enabled a PutObject
   operation creates a unique object version-id for the object being uploaded. The
   The PutObject API guarantees that, if versioning is enabled for a bucket at
   the time of the request, the new object can only be permanently deleted
   using a DeleteVersion operation. It can never be overwritten.
   Additionally, the PutObject API guarantees that,
   if versioning is enabled for a bucket the request,
   no other object will be overwritten by that request.
   Refer to the documentation sections for each API for information on how
   versioning status affects the semantics of that particular API.


   Amazon S3 is eventually consistent. It can take time for the versioning status
   of a bucket to be propagated throughout the system.

  bucket-name - The bucket whose versioning configuration will be retrieved. - `java.lang.String`

  returns: The bucket versioning configuration for the specified bucket. - `com.amazonaws.services.s3.model.BucketVersioningConfiguration`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.BucketVersioningConfiguration [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketVersioningConfiguration bucket-name))))

(defn get-bucket-replication-configuration
  "Retrieves the replication configuration for the given Amazon S3 bucket.

  bucket-name - The bucket name for which the replication configuration is to be retrieved. - `java.lang.String`

  returns: the replication configuration of the bucket. - `com.amazonaws.services.s3.model.BucketReplicationConfiguration`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^com.amazonaws.services.s3.model.BucketReplicationConfiguration [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.getBucketReplicationConfiguration bucket-name))))

(defn set-bucket-versioning-configuration
  "Sets the versioning configuration for the specified bucket.


   A bucket's versioning configuration can be in one of three possible
   states:

        BucketVersioningConfiguration.OFF
        BucketVersioningConfiguration.ENABLED
        BucketVersioningConfiguration.SUSPENDED



   By default, new buckets are in the
   off state. Once versioning is
   enabled for a bucket the status can never be reverted to
   off.


   Objects created before versioning was enabled or when versioning is
   suspended will be given the default null version ID (see
   Constants.NULL_VERSION_ID). Note that the
   null version ID is a valid version ID and is not the
   same as not having a version ID.


   The versioning configuration of a bucket has different implications for
   each operation performed on that bucket or for objects within that
   bucket. For example, when versioning is enabled a PutObject
   operation creates a unique object version-id for the object being uploaded. The
   The PutObject API guarantees that, if versioning is enabled for a bucket at
   the time of the request, the new object can only be permanently deleted
   using a DeleteVersion operation. It can never be overwritten.
   Additionally, the PutObject API guarantees that,
   if versioning is enabled for a bucket the request,
   no other object will be overwritten by that request.
   Refer to the documentation sections for each API for information on how
   versioning status affects the semantics of that particular API.


   Amazon S3 is eventually consistent. It can take time for the versioning status
   of a bucket to be propagated throughout the system.

  set-bucket-versioning-configuration-request - The request object containing all options for setting the bucket versioning configuration. - `com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  ([^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest set-bucket-versioning-configuration-request]
    (-> this (.setBucketVersioningConfiguration set-bucket-versioning-configuration-request))))

(defn set-bucket-metrics-configuration
  "Sets a metrics configuration (specified by the metrics configuration ID) for the bucket.

  bucket-name - The name of the bucket to set the metrics configuration. - `java.lang.String`
  metrics-configuration - The metrics configuration to set. - `com.amazonaws.services.s3.model.metrics.MetricsConfiguration`

  returns: `com.amazonaws.services.s3.model.SetBucketMetricsConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.SetBucketMetricsConfigurationResult [^AmazonS3 this ^java.lang.String bucket-name ^com.amazonaws.services.s3.model.metrics.MetricsConfiguration metrics-configuration]
    (-> this (.setBucketMetricsConfiguration bucket-name metrics-configuration)))
  (^com.amazonaws.services.s3.model.SetBucketMetricsConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.SetBucketMetricsConfigurationRequest set-bucket-metrics-configuration-request]
    (-> this (.setBucketMetricsConfiguration set-bucket-metrics-configuration-request))))

(defn get-object-retention
  "Retrieves an object's retention settings.

  get-object-retention-request - The request object for getting the object retention. - `com.amazonaws.services.s3.model.GetObjectRetentionRequest`

  returns: A GetObjectRetentionResult. - `com.amazonaws.services.s3.model.GetObjectRetentionResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetObjectRetentionResult [^AmazonS3 this ^com.amazonaws.services.s3.model.GetObjectRetentionRequest get-object-retention-request]
    (-> this (.getObjectRetention get-object-retention-request))))

(defn does-object-exist
  "bucket-name - Name of bucket that presumably contains object - `java.lang.String`
  object-name - Name of object that has to be checked - `java.lang.String`

  returns: result of the search - `boolean`

  throws: com.amazonaws.AmazonServiceException - If any errors occurred in Amazon S3 while processing the request."
  (^Boolean [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String object-name]
    (-> this (.doesObjectExist bucket-name object-name))))

(defn does-bucket-exist
  "Deprecated. By doesBucketExistV2(String) which will correctly throw an exception when
   credentials are invalid instead of returning true. See
   Issue #1256.

  bucket-name - The name of the bucket to check. - `java.lang.String`

  returns: The value true if the specified bucket exists in
           Amazon S3; the value false if there is no bucket in
           Amazon S3 with that name. - `boolean`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^Boolean [^AmazonS3 this ^java.lang.String bucket-name]
    (-> this (.doesBucketExist bucket-name))))

(defn get-bucket-inventory-configuration
  "Returns an inventory configuration (identified by the inventory ID) from the bucket.

  bucket-name - The name of the bucket to get the inventory configuration from. - `java.lang.String`
  id - The ID of the inventory configuration to delete. - `java.lang.String`

  returns: An GetBucketInventoryConfigurationResult object containing the inventory configuration. - `com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult`

  throws: com.amazonaws.AmazonServiceException"
  (^com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult [^AmazonS3 this ^java.lang.String bucket-name ^java.lang.String id]
    (-> this (.getBucketInventoryConfiguration bucket-name id)))
  (^com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult [^AmazonS3 this ^com.amazonaws.services.s3.model.GetBucketInventoryConfigurationRequest get-bucket-inventory-configuration-request]
    (-> this (.getBucketInventoryConfiguration get-bucket-inventory-configuration-request))))

