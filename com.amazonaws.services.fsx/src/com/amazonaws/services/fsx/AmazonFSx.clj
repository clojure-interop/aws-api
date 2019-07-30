(ns com.amazonaws.services.fsx.AmazonFSx
  "Interface for accessing Amazon FSx.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonFSx instead.



  Amazon FSx is a fully managed service that makes it easy for storage and application administrators to launch and use
  shared file storage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fsx AmazonFSx]))

(defn list-tags-for-resource
  "Lists tags for an Amazon FSx file systems and backups in the case of Amazon FSx for Windows File Server.


   When retrieving all tags, you can optionally specify the MaxResults parameter to limit the number of
   tags in a response. If more tags remain, Amazon FSx returns a NextToken value in the response. In
   this case, send a later request with the NextToken request parameter set to the value of
   NextToken from the last response.


   This action is used in an iterative process to retrieve a list of your tags. ListTagsForResource is
   called first without a NextTokenvalue. Then the action continues to be called with the
   NextToken parameter set to the value of the last NextToken value until a response has
   no NextToken.


   When using this action, keep the following in mind:




   The implementation might return fewer than MaxResults file system descriptions while still including
   a NextToken value.




   The order of tags returned in the response of one ListTagsForResource call and the order of tags
   returned across the responses of a multi-call iteration is unspecified.

  list-tags-for-resource-request - The request object for ListTagsForResource operation. - `com.amazonaws.services.fsx.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.fsx.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.ListTagsForResourceResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn untag-resource
  "This action removes a tag from an Amazon FSx resource.

  untag-resource-request - The request object for UntagResource action. - `com.amazonaws.services.fsx.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.fsx.model.UntagResourceResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.UntagResourceResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn create-file-system-from-backup
  "Creates a new Amazon FSx file system from an existing Amazon FSx for Windows File Server backup.


   If a file system with the specified client request token exists and the parameters match, this operation returns
   the description of the file system. If a client request token specified by the file system exists and the
   parameters don't match, this call returns IncompatibleParameterError. If a file system with the
   specified client request token doesn't exist, this operation does the following:




   Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of
   CREATING.




   Returns the description of the file system.




   Parameters like Active Directory, default share name, automatic backup, and backup settings default to the
   parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings.


   By using the idempotent operation, you can retry a CreateFileSystemFromBackup call without the risk
   of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it
   unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection
   was reset. If you use the same client request token and the initial call created a file system, the client
   receives success as long as the parameters are the same.



   The CreateFileSystemFromBackup call returns while the file system's lifecycle state is still
   CREATING. You can check the file-system creation status by calling the DescribeFileSystems
   operation, which returns the file system state along with other information.

  create-file-system-from-backup-request - The request object for the CreateFileSystemFromBackup operation. - `com.amazonaws.services.fsx.model.CreateFileSystemFromBackupRequest`

  returns: Result of the CreateFileSystemFromBackup operation returned by the service. - `com.amazonaws.services.fsx.model.CreateFileSystemFromBackupResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.CreateFileSystemFromBackupResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.CreateFileSystemFromBackupRequest create-file-system-from-backup-request]
    (-> this (.createFileSystemFromBackup create-file-system-from-backup-request))))

(defn describe-backups
  "Returns the description of specific Amazon FSx for Windows File Server backups, if a BackupIds value
   is provided for that backup. Otherwise, it returns all backups owned by your AWS account in the AWS Region of the
   endpoint that you're calling.


   When retrieving all backups, you can optionally specify the MaxResults parameter to limit the number
   of backups in a response. If more backups remain, Amazon FSx returns a NextToken value in the
   response. In this case, send a later request with the NextToken request parameter set to the value
   of NextToken from the last response.


   This action is used in an iterative process to retrieve a list of your backups. DescribeBackups is
   called first without a NextTokenvalue. Then the action continues to be called with the
   NextToken parameter set to the value of the last NextToken value until a response has
   no NextToken.


   When using this action, keep the following in mind:




   The implementation might return fewer than MaxResults file system descriptions while still including
   a NextToken value.




   The order of backups returned in the response of one DescribeBackups call and the order of backups
   returned across the responses of a multi-call iteration is unspecified.

  describe-backups-request - The request object for DescribeBackups operation. - `com.amazonaws.services.fsx.model.DescribeBackupsRequest`

  returns: Result of the DescribeBackups operation returned by the service. - `com.amazonaws.services.fsx.model.DescribeBackupsResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.DescribeBackupsResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.DescribeBackupsRequest describe-backups-request]
    (-> this (.describeBackups describe-backups-request))))

(defn delete-backup
  "Deletes an Amazon FSx for Windows File Server backup, deleting its contents. After deletion, the backup no longer
   exists, and its data is gone.


   The DeleteBackup call returns instantly. The backup will not show up in later
   DescribeBackups calls.



   The data in a deleted backup is also deleted and can't be recovered by any means.

  delete-backup-request - The request object for DeleteBackup operation. - `com.amazonaws.services.fsx.model.DeleteBackupRequest`

  returns: Result of the DeleteBackup operation returned by the service. - `com.amazonaws.services.fsx.model.DeleteBackupResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.DeleteBackupResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.DeleteBackupRequest delete-backup-request]
    (-> this (.deleteBackup delete-backup-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonFSx this]
    (-> this (.shutdown))))

(defn delete-file-system
  "Deletes a file system, deleting its contents. After deletion, the file system no longer exists, and its data is
   gone. Any existing automatic backups will also be deleted.


   By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon
   deletion. This final backup is not subject to the file system's retention policy, and must be manually deleted.


   The DeleteFileSystem action returns while the file system has the DELETING status. You
   can check the file system deletion status by calling the DescribeFileSystems action, which returns a list
   of file systems in your account. If you pass the file system ID for a deleted file system, the
   DescribeFileSystems returns a FileSystemNotFound error.



   The data in a deleted file system is also deleted and can't be recovered by any means.

  delete-file-system-request - The request object for DeleteFileSystem operation. - `com.amazonaws.services.fsx.model.DeleteFileSystemRequest`

  returns: Result of the DeleteFileSystem operation returned by the service. - `com.amazonaws.services.fsx.model.DeleteFileSystemResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.DeleteFileSystemResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.DeleteFileSystemRequest delete-file-system-request]
    (-> this (.deleteFileSystem delete-file-system-request))))

(defn create-file-system
  "Creates a new, empty Amazon FSx file system.


   If a file system with the specified client request token exists and the parameters match,
   CreateFileSystem returns the description of the existing file system. If a file system specified
   client request token exists and the parameters don't match, this call returns
   IncompatibleParameterError. If a file system with the specified client request token doesn't exist,
   CreateFileSystem does the following:




   Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of
   CREATING.




   Returns the description of the file system.




   This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation.
   This means that calling the operation multiple times with the same client request token has no effect. By using
   the idempotent operation, you can retry a CreateFileSystem operation without the risk of creating an
   extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether
   a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If
   you use the same client request token and the initial call created a file system, the client receives success as
   long as the parameters are the same.



   The CreateFileSystem call returns while the file system's lifecycle state is still
   CREATING. You can check the file-system creation status by calling the DescribeFileSystems
   operation, which returns the file system state along with other information.

  create-file-system-request - The request object used to create a new Amazon FSx file system. - `com.amazonaws.services.fsx.model.CreateFileSystemRequest`

  returns: Result of the CreateFileSystem operation returned by the service. - `com.amazonaws.services.fsx.model.CreateFileSystemResult`

  throws: com.amazonaws.services.fsx.model.ServiceLimitExceededException - An error indicating that a particular service limit was exceeded. You can increase some service limits by contacting AWS Support."
  (^com.amazonaws.services.fsx.model.CreateFileSystemResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.CreateFileSystemRequest create-file-system-request]
    (-> this (.createFileSystem create-file-system-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonFSx this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-file-systems
  "Returns the description of specific Amazon FSx file systems, if a FileSystemIds value is provided
   for that file system. Otherwise, it returns descriptions of all file systems owned by your AWS account in the AWS
   Region of the endpoint that you're calling.


   When retrieving all file system descriptions, you can optionally specify the MaxResults parameter to
   limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a
   NextToken value in the response. In this case, send a later request with the NextToken
   request parameter set to the value of NextToken from the last response.


   This action is used in an iterative process to retrieve a list of your file system descriptions.
   DescribeFileSystems is called first without a NextTokenvalue. Then the action continues
   to be called with the NextToken parameter set to the value of the last NextToken value
   until a response has no NextToken.


   When using this action, keep the following in mind:




   The implementation might return fewer than MaxResults file system descriptions while still including
   a NextToken value.




   The order of file systems returned in the response of one DescribeFileSystems call and the order of
   file systems returned across the responses of a multicall iteration is unspecified.

  describe-file-systems-request - The request object for DescribeFileSystems operation. - `com.amazonaws.services.fsx.model.DescribeFileSystemsRequest`

  returns: Result of the DescribeFileSystems operation returned by the service. - `com.amazonaws.services.fsx.model.DescribeFileSystemsResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.DescribeFileSystemsResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.DescribeFileSystemsRequest describe-file-systems-request]
    (-> this (.describeFileSystems describe-file-systems-request))))

(defn tag-resource
  "Tags an Amazon FSx resource.

  tag-resource-request - The request object for the TagResource operation. - `com.amazonaws.services.fsx.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.fsx.model.TagResourceResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.TagResourceResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn create-backup
  "Creates a backup of an existing Amazon FSx for Windows File Server file system. Creating regular backups for your
   file system is a best practice that complements the replication that Amazon FSx for Windows File Server performs
   for your file system. It also enables you to restore from user modification of data.


   If a backup with the specified client request token exists, and the parameters match, this operation returns the
   description of the existing backup. If a backup specified client request token exists, and the parameters don't
   match, this operation returns IncompatibleParameterError. If a backup with the specified client
   request token doesn't exist, CreateBackup does the following:




   Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of CREATING.




   Returns the description of the backup.




   By using the idempotent operation, you can retry a CreateBackup operation without the risk of
   creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear
   whether a backup was created. If you use the same client request token and the initial call created a backup, the
   operation returns a successful result because all the parameters are the same.


   The CreateFileSystem operation returns while the backup's lifecycle state is still
   CREATING. You can check the file system creation status by calling the DescribeBackups
   operation, which returns the backup state along with other information.

  create-backup-request - The request object for the CreateBackup operation. - `com.amazonaws.services.fsx.model.CreateBackupRequest`

  returns: Result of the CreateBackup operation returned by the service. - `com.amazonaws.services.fsx.model.CreateBackupResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.CreateBackupResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.CreateBackupRequest create-backup-request]
    (-> this (.createBackup create-backup-request))))

(defn update-file-system
  "Updates a file system configuration.

  update-file-system-request - The request object for the UpdateFileSystem operation. - `com.amazonaws.services.fsx.model.UpdateFileSystemRequest`

  returns: Result of the UpdateFileSystem operation returned by the service. - `com.amazonaws.services.fsx.model.UpdateFileSystemResult`

  throws: com.amazonaws.services.fsx.model.BadRequestException - A generic error indicating a failure with a client request."
  (^com.amazonaws.services.fsx.model.UpdateFileSystemResult [^AmazonFSx this ^com.amazonaws.services.fsx.model.UpdateFileSystemRequest update-file-system-request]
    (-> this (.updateFileSystem update-file-system-request))))

