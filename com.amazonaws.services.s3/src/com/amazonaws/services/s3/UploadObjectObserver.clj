(ns com.amazonaws.services.s3.UploadObjectObserver
  "An observer that gets notified of ciphertext file creation for the purpose of
  pipelined parallel multi-part uploads of encrypted data to S3. This observer
  is responsible for uploading the files to S3 via multi-part upload, including
  the multi-part upload initiation, individual part uploads, and multi-part
  upload completion.

  This observer is designed for extension so that custom behavior can be
  provided. A customer observer can be configured via
  UploadObjectRequest.withUploadObjectObserver(UploadObjectObserver)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 UploadObjectObserver]))

(defn ->upload-object-observer
  "Constructor."
  (^UploadObjectObserver []
    (new UploadObjectObserver )))

(defn init
  "Used to initialized this observer. This method is an SPI (service
   provider interface) that is called from
   AmazonS3EncryptionClient.

   Implementation of this method should never block.

  req - the upload object request - `com.amazonaws.services.s3.model.UploadObjectRequest`
  s-3direct - used to perform non-encrypting s3 operation via the current instance of s3 (encryption) client - `com.amazonaws.services.s3.internal.S3DirectSpi`
  s-3 - the current instance of s3 (encryption) client - `com.amazonaws.services.s3.AmazonS3`
  es - the executor service to be used for concurrent uploads - `java.util.concurrent.ExecutorService`

  returns: this object - `com.amazonaws.services.s3.UploadObjectObserver`"
  (^com.amazonaws.services.s3.UploadObjectObserver [^UploadObjectObserver this ^com.amazonaws.services.s3.model.UploadObjectRequest req ^com.amazonaws.services.s3.internal.S3DirectSpi s-3direct ^com.amazonaws.services.s3.AmazonS3 s-3 ^java.util.concurrent.ExecutorService es]
    (-> this (.init req s-3direct s-3 es))))

(defn on-upload-initiation
  "Notified from
   AmazonS3EncryptionClient.uploadObject(UploadObjectRequest) to
   initiate a multi-part upload.

  req - the upload object request - `com.amazonaws.services.s3.model.UploadObjectRequest`

  returns: the initiated multi-part uploadId - `java.lang.String`"
  (^java.lang.String [^UploadObjectObserver this ^com.amazonaws.services.s3.model.UploadObjectRequest req]
    (-> this (.onUploadInitiation req))))

(defn on-part-create
  "Notified from MultiFileOutputStream.fos() when a part ready for
   upload has been successfully created on disk. By default, this method
   performs the following:

   calls newUploadPartRequest(PartCreationEvent, File) to
   create an upload-part request for the newly created ciphertext file
   call appendUserAgent(AmazonWebServiceRequest, String) to
   append the necessary user agent string to the request
   and finally submit a concurrent task, which calls the method
   uploadPart(UploadPartRequest), to be performed


   To enable parallel uploads, implementation of this method should never
   block.

  event - to represent the completion of a ciphertext file creation which is ready for multipart upload to S3. - `com.amazonaws.services.s3.internal.PartCreationEvent`"
  ([^UploadObjectObserver this ^com.amazonaws.services.s3.internal.PartCreationEvent event]
    (-> this (.onPartCreate event))))

(defn on-completion
  "Notified from
   AmazonS3EncryptionClient.uploadObject(UploadObjectRequest) when
   all parts have been successfully uploaded to S3. This method is
   responsible for finishing off the upload by making a complete multi-part
   upload request to S3 with the given list of etags.

  part-e-tags - all the etags returned from S3 for the previous part uploads. - `java.util.List`

  returns: the completed multi-part upload result - `com.amazonaws.services.s3.model.CompleteMultipartUploadResult`"
  (^com.amazonaws.services.s3.model.CompleteMultipartUploadResult [^UploadObjectObserver this ^java.util.List part-e-tags]
    (-> this (.onCompletion part-e-tags))))

(defn on-abort
  "Notified from
   AmazonS3EncryptionClient.uploadObject(UploadObjectRequest) when
   failed to upload any part. This method is responsible for cancelling
   ongoing uploads and aborting the multi-part upload request."
  ([^UploadObjectObserver this]
    (-> this (.onAbort))))

(defn get-futures
  "returns: `java.util.List<java.util.concurrent.Future<com.amazonaws.services.s3.model.UploadPartResult>>`"
  (^java.util.List [^UploadObjectObserver this]
    (-> this (.getFutures))))

