(ns com.amazonaws.services.fsx.AmazonFSxAsync
  "Interface for accessing Amazon FSx asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonFSxAsync instead.



  Amazon FSx is a fully managed service that makes it easy for storage and application administrators to launch and use
  shared file storage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fsx AmazonFSxAsync]))

(defn untag-resource-async
  "This action removes a tag from an Amazon FSx resource.

  untag-resource-request - The request object for UntagResource action. - `com.amazonaws.services.fsx.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn update-file-system-async
  "Updates a file system configuration.

  update-file-system-request - The request object for the UpdateFileSystem operation. - `com.amazonaws.services.fsx.model.UpdateFileSystemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.UpdateFileSystemResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.UpdateFileSystemRequest update-file-system-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFileSystemAsync update-file-system-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.UpdateFileSystemRequest update-file-system-request]
    (-> this (.updateFileSystemAsync update-file-system-request))))

(defn create-file-system-from-backup-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFileSystemFromBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.CreateFileSystemFromBackupResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateFileSystemFromBackupRequest create-file-system-from-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFileSystemFromBackupAsync create-file-system-from-backup-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateFileSystemFromBackupRequest create-file-system-from-backup-request]
    (-> this (.createFileSystemFromBackupAsync create-file-system-from-backup-request))))

(defn create-file-system-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.CreateFileSystemResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateFileSystemRequest create-file-system-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFileSystemAsync create-file-system-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateFileSystemRequest create-file-system-request]
    (-> this (.createFileSystemAsync create-file-system-request))))

(defn create-backup-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.CreateBackupResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateBackupRequest create-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupAsync create-backup-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateBackupRequest create-backup-request]
    (-> this (.createBackupAsync create-backup-request))))

(defn list-tags-for-resource-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-file-system-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.DeleteFileSystemResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.DeleteFileSystemRequest delete-file-system-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFileSystemAsync delete-file-system-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.DeleteFileSystemRequest delete-file-system-request]
    (-> this (.deleteFileSystemAsync delete-file-system-request))))

(defn describe-file-systems-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFileSystems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.DescribeFileSystemsResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.DescribeFileSystemsRequest describe-file-systems-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFileSystemsAsync describe-file-systems-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.DescribeFileSystemsRequest describe-file-systems-request]
    (-> this (.describeFileSystemsAsync describe-file-systems-request))))

(defn delete-backup-async
  "Deletes an Amazon FSx for Windows File Server backup, deleting its contents. After deletion, the backup no longer
   exists, and its data is gone.


   The DeleteBackup call returns instantly. The backup will not show up in later
   DescribeBackups calls.



   The data in a deleted backup is also deleted and can't be recovered by any means.

  delete-backup-request - The request object for DeleteBackup operation. - `com.amazonaws.services.fsx.model.DeleteBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.DeleteBackupResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.DeleteBackupRequest delete-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupAsync delete-backup-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.DeleteBackupRequest delete-backup-request]
    (-> this (.deleteBackupAsync delete-backup-request))))

(defn tag-resource-async
  "Tags an Amazon FSx resource.

  tag-resource-request - The request object for the TagResource operation. - `com.amazonaws.services.fsx.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn describe-backups-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.DescribeBackupsResult>`"
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.DescribeBackupsRequest describe-backups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupsAsync describe-backups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonFSxAsync this ^com.amazonaws.services.fsx.model.DescribeBackupsRequest describe-backups-request]
    (-> this (.describeBackupsAsync describe-backups-request))))

