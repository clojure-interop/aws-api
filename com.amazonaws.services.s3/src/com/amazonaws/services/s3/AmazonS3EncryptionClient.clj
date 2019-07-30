(ns com.amazonaws.services.s3.AmazonS3EncryptionClient
  "Used to perform client-side encryption for storing data securely in S3. Data
  encryption is done using a one-time randomly generated content encryption
  key (CEK) per S3 object.

  The encryption materials specified in the constructor will be used to
  protect the CEK which is then stored along side with the S3 object."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 AmazonS3EncryptionClient]))

(defn ->amazon-s-3-encryption-client
  "Constructor.

  Deprecated. use AmazonS3EncryptionClientBuilder.withEncryptionMaterials(EncryptionMaterialsProvider) and
                   AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
                   AmazonS3EncryptionClientBuilder.withCryptoConfiguration(CryptoConfiguration) and
                   AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
                   AwsClientBuilder.withMetricsCollector(RequestMetricCollector) and
                   AmazonS3EncryptionClientBuilder.withKmsClient(AWSKMS)

  kms - `com.amazonaws.services.kms.AWSKMSClient`
  credentials-provider - `com.amazonaws.auth.AWSCredentialsProvider`
  kek-materials-provider - `com.amazonaws.services.s3.model.EncryptionMaterialsProvider`
  client-config - `com.amazonaws.ClientConfiguration`
  crypto-config - `com.amazonaws.services.s3.model.CryptoConfiguration`
  request-metric-collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonS3EncryptionClient [^com.amazonaws.services.kms.AWSKMSClient kms ^com.amazonaws.auth.AWSCredentialsProvider credentials-provider ^com.amazonaws.services.s3.model.EncryptionMaterialsProvider kek-materials-provider ^com.amazonaws.ClientConfiguration client-config ^com.amazonaws.services.s3.model.CryptoConfiguration crypto-config ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonS3EncryptionClient kms credentials-provider kek-materials-provider client-config crypto-config request-metric-collector))
  (^AmazonS3EncryptionClient [^com.amazonaws.auth.AWSCredentialsProvider credentials-provider ^com.amazonaws.services.s3.model.EncryptionMaterialsProvider kek-materials-provider ^com.amazonaws.ClientConfiguration client-config ^com.amazonaws.services.s3.model.CryptoConfiguration crypto-config ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonS3EncryptionClient credentials-provider kek-materials-provider client-config crypto-config request-metric-collector))
  (^AmazonS3EncryptionClient [^com.amazonaws.auth.AWSCredentials credentials ^com.amazonaws.services.s3.model.EncryptionMaterials encryption-materials ^com.amazonaws.ClientConfiguration client-config ^com.amazonaws.services.s3.model.CryptoConfiguration crypto-config]
    (new AmazonS3EncryptionClient credentials encryption-materials client-config crypto-config))
  (^AmazonS3EncryptionClient [^com.amazonaws.auth.AWSCredentials credentials ^com.amazonaws.services.s3.model.EncryptionMaterials encryption-materials ^com.amazonaws.services.s3.model.CryptoConfiguration crypto-config]
    (new AmazonS3EncryptionClient credentials encryption-materials crypto-config))
  (^AmazonS3EncryptionClient [^com.amazonaws.services.s3.model.EncryptionMaterials encryption-materials ^com.amazonaws.services.s3.model.CryptoConfiguration crypto-config]
    (new AmazonS3EncryptionClient encryption-materials crypto-config))
  (^AmazonS3EncryptionClient [^com.amazonaws.services.s3.model.EncryptionMaterials encryption-materials]
    (new AmazonS3EncryptionClient encryption-materials)))

(def *-user-agent
  "Static Constant.

  type: java.lang.String"
  AmazonS3EncryptionClient/USER_AGENT)

(defn *encryption-builder
  "returns: `com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder`"
  (^com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder []
    (AmazonS3EncryptionClient/encryptionBuilder )))

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



   NOTE: Because the encryption process requires context from block
   N-1 in order to encrypt block N, parts uploaded with the
   AmazonS3EncryptionClient (as opposed to the normal AmazonS3Client) must
   be uploaded serially, and in order. Otherwise, the previous encryption
   context isn't available to use when encrypting the current part.

  upload-part-request - The UploadPartRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.UploadPartRequest`

  returns: An UploadPartResult from Amazon S3 containing the part number and
           ETag of the new part. - `com.amazonaws.services.s3.model.UploadPartResult`

  throws: com.amazonaws.SdkClientException - If any errors are encountered in the client while making the request or handling the response."
  (^com.amazonaws.services.s3.model.UploadPartResult [^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.UploadPartRequest upload-part-request]
    (-> this (.uploadPart upload-part-request))))

(defn complete-multipart-upload
  "Description copied from interface: AmazonS3

  req - The CompleteMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.CompleteMultipartUploadRequest`

  returns: A CompleteMultipartUploadResult from S3 containing the ETag for
           the new object composed of the individual parts. - `com.amazonaws.services.s3.model.CompleteMultipartUploadResult`"
  (^com.amazonaws.services.s3.model.CompleteMultipartUploadResult [^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.CompleteMultipartUploadRequest req]
    (-> this (.completeMultipartUpload req))))

(defn get-object
  "Description copied from interface: AmazonS3

  req - The request object containing all the options on how to download the Amazon S3 object content. - `com.amazonaws.services.s3.model.GetObjectRequest`
  dest - Indicates the file (which might already exist) where to save the object content being downloading from Amazon S3. - `java.io.File`

  returns: All S3 object metadata for the specified object.
           Returns null if constraints were specified but not met. - `com.amazonaws.services.s3.model.ObjectMetadata`"
  (^com.amazonaws.services.s3.model.ObjectMetadata [^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.GetObjectRequest req ^java.io.File dest]
    (-> this (.getObject req dest)))
  (^com.amazonaws.services.s3.model.S3Object [^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.GetObjectRequest req]
    (-> this (.getObject req))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held
   open. If this method is not invoked, resources may be leaked. Once a client
   has been shutdown, it should not be used to make any more requests.

   If the a default internal KMS client has been constructed, it will also be
   shut down by calling this method.
   Otherwise, users who provided the KMS client would be responsible to
   shut down the KMS client extrinsic to this method."
  ([^AmazonS3EncryptionClient this]
    (-> this (.shutdown))))

(defn abort-multipart-upload
  "Description copied from interface: AmazonS3

  req - The AbortMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.AbortMultipartUploadRequest`"
  ([^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.AbortMultipartUploadRequest req]
    (-> this (.abortMultipartUpload req))))

(defn initiate-multipart-upload
  "Initiates a multipart upload and returns an InitiateMultipartUploadResult
   which contains an upload ID. This upload ID associates all the parts in
   the specific upload and is used in each of your subsequent
   AmazonS3.uploadPart(UploadPartRequest) requests. You also include this
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


   Use EncryptedInitiateMultipartUploadRequest to specify materialsDescription for the EncryptionMaterials to be used for this request.
   AmazonS3EncryptionClient would use EncryptionMaterialsAccessor.getEncryptionMaterials(java.util.Map) to retrieve encryption materials
   corresponding to the materialsDescription specified in the current request.

  req - The InitiateMultipartUploadRequest object that specifies all the parameters of this operation. - `com.amazonaws.services.s3.model.InitiateMultipartUploadRequest`

  returns: An InitiateMultipartUploadResult from Amazon S3. - `com.amazonaws.services.s3.model.InitiateMultipartUploadResult`"
  (^com.amazonaws.services.s3.model.InitiateMultipartUploadResult [^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.InitiateMultipartUploadRequest req]
    (-> this (.initiateMultipartUpload req))))

(defn upload-object
  "Used to encrypt data first to disk with pipelined concurrent multi-part
   uploads to S3. This method enables significant speed-up of encrypting and
   uploading large payloads to Amazon S3 via pipelining and parallel uploads
   by consuming temporary disk space.

   There are many ways you can customize the behavior of this method,
   including

   the configuration of your own custom thread pool
   the part size of each multi-part upload request; By default, a
   temporary ciphertext file is generated per part and gets uploaded
   immediately to S3
   the maximum temporary disk space that must not be exceeded by
   execution of this request; By default, the encryption will block upon
   hitting the limit and will only resume when the in-flight uploads catch
   up by releasing the temporary disk space upon successful uploads of the
   completed parts
   the configuration of your own MultiFileOutputStream for
   custom pipeline behavior
   the configuration of your own UploadObjectObserver for custom
   multi-part upload behavior


   A request is handled with the following life cycle, calling the necessary
   Service Provider Interface:

   A thread pool is constructed (or retrieved from the request) for the
   execution of concurrent upload tasks to be submitted by the
   UploadObjectObserver
   An UploadObjectObserver is constructed (or retrieved from the
   request) for execution of concurrent uploads to S3
   Initialize the UploadObjectObserver
   Initialize a multi-part upload request to S3 by calling
   UploadObjectObserver.onUploadInitiation(UploadObjectRequest)
   A MultiFileOutputStream is constructed (or retrieved from the
   request) which serves as the pipeline for incremental (but serial)
   encryption to disk with concurrent multipart uploads to S3 whenever the
   parts on the disk are ready
   Initialize the MultiFileOutputStream
   Kicks off the pipeline for incremental encryption to disk with
   pipelined concurrent multi-part uploads to S3
   For every part encrypted into a temporary file on disk, it is
   uploaded by calling
   UploadObjectObserver.onPartCreate(PartCreationEvent)
   Finally, clean up and complete the multi-part upload by calling
   UploadObjectObserver.onCompletion(List).

  req - `com.amazonaws.services.s3.model.UploadObjectRequest`

  returns: the result of the completed muti-part uploads - `com.amazonaws.services.s3.model.CompleteMultipartUploadResult`

  throws: java.io.IOException - if the encryption to disk failed"
  (^com.amazonaws.services.s3.model.CompleteMultipartUploadResult [^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.UploadObjectRequest req]
    (-> this (.uploadObject req))))

(defn delete-object
  "Description copied from interface: AmazonS3

  req - The request object containing all options for deleting an Amazon S3 object. - `com.amazonaws.services.s3.model.DeleteObjectRequest`"
  ([^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.DeleteObjectRequest req]
    (-> this (.deleteObject req))))

(defn copy-part
  "Description copied from class: AmazonS3Client

  copy-part-request - The request object containing all the options for copying an Amazon S3 object. - `com.amazonaws.services.s3.model.CopyPartRequest`

  returns: A CopyPartResult object containing the information
           returned by Amazon S3 about the newly created object, or null if
           constraints were specified that weren't met when Amazon S3 attempted
           to copy the object. - `com.amazonaws.services.s3.model.CopyPartResult`"
  (^com.amazonaws.services.s3.model.CopyPartResult [^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.CopyPartRequest copy-part-request]
    (-> this (.copyPart copy-part-request))))

(defn put-object
  "Uploads a new object to the specified Amazon S3 bucket. The
   PutObjectRequest contains all the details of the request,
   including the bucket to upload to, the key the object will be uploaded
   under, and the file or input stream containing the data to upload.


   Amazon S3 never stores partial objects; if during this call an exception
   wasn't thrown, the entire object was stored.


   If you are uploading or accessing AWS KMS-encrypted objects, you need to
   specify the correct region of the bucket on your client and configure AWS
   Signature Version 4 for added security. For more information on how to do
   this, see
   http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#
   specify-signature-version


   Depending on whether a file or input stream is being uploaded, this
   method has slightly different behavior.


   When uploading a file:



   The client automatically computes a checksum of the file. Amazon S3 uses
   checksums to validate the data in each file.

   Using the file extension, Amazon S3 attempts to determine the correct
   content type and content disposition to use for the object.


   When uploading directly from an input stream:


   Be careful to set the correct content type in the metadata object
   before directly sending a stream. Unlike file uploads, content types from
   input streams cannot be automatically determined. If the caller doesn't
   explicitly set the content type, it will not be set in Amazon S3.
   Content length must be specified before data can be uploaded
   to Amazon S3. Amazon S3 explicitly requires that the content length be
   sent in the request headers before it will accept any of the data. If the
   caller doesn't provide the length, the library must buffer the contents
   of the input stream in order to calculate it.


   If versioning is enabled for the specified bucket, this operation will
   never overwrite an existing object with the same key, but will keep the
   existing object as an older version until that version is explicitly
   deleted (see AmazonS3.deleteVersion(String, String, String).



   If versioning is not enabled, this operation will overwrite an existing
   object with the same key; Amazon S3 will store the last write request.
   Amazon S3 does not provide object locking. If Amazon S3 receives multiple
   write requests for the same object nearly simultaneously, all of the
   objects might be stored. However, a single object will be stored with the
   final write request.



   When specifying a location constraint when creating a bucket, all objects
   added to the bucket are stored in the bucket's region. For example, if
   specifying a Europe (EU) region constraint for a bucket, all of that
   bucket's objects are stored in the EU region.


   The specified bucket must already exist and the caller must have
   Permission.Write permission to the bucket to upload an object.


   Use EncryptedPutObjectRequest to specify materialsDescription for the EncryptionMaterials to be used for
   this request.AmazonS3EncryptionClient would use EncryptionMaterialsAccessor.getEncryptionMaterials(java.util.Map) to
   retrieve encryption materials corresponding to the materialsDescription specified in the current request.

  req - The request object containing all the parameters to upload a new object to Amazon S3. - `com.amazonaws.services.s3.model.PutObjectRequest`

  returns: A PutObjectResult object containing the information
           returned by Amazon S3 for the newly created object. - `com.amazonaws.services.s3.model.PutObjectResult`"
  (^com.amazonaws.services.s3.model.PutObjectResult [^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.PutObjectRequest req]
    (-> this (.putObject req))))

(defn put-instruction-file
  "Creates a new crypto instruction file by re-encrypting the CEK of an
   existing encrypted S3 object with a new encryption material identifiable
   via a new set of material description.

   User of this method is responsible for explicitly deleting/updating the
   instruction file so created should the corresponding S3 object is
   deleted/created.

  req - `com.amazonaws.services.s3.model.PutInstructionFileRequest`

  returns: the result of the put (instruction file) operation. - `com.amazonaws.services.s3.model.PutObjectResult`"
  (^com.amazonaws.services.s3.model.PutObjectResult [^AmazonS3EncryptionClient this ^com.amazonaws.services.s3.model.PutInstructionFileRequest req]
    (-> this (.putInstructionFile req))))

