(ns com.amazonaws.services.fsx.AbstractAmazonFSxAsync
  "Abstract implementation of AmazonFSxAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fsx AbstractAmazonFSxAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for UntagResource action. - `com.amazonaws.services.fsx.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-file-system-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for the UpdateFileSystem operation. - `com.amazonaws.services.fsx.model.UpdateFileSystemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.UpdateFileSystemResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.UpdateFileSystemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFileSystemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.UpdateFileSystemRequest request]
    (-> this (.updateFileSystemAsync request))))

(defn create-file-system-from-backup-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for the CreateFileSystemFromBackup operation. - `com.amazonaws.services.fsx.model.CreateFileSystemFromBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFileSystemFromBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.CreateFileSystemFromBackupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateFileSystemFromBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFileSystemFromBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateFileSystemFromBackupRequest request]
    (-> this (.createFileSystemFromBackupAsync request))))

(defn create-file-system-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object used to create a new Amazon FSx file system. - `com.amazonaws.services.fsx.model.CreateFileSystemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.CreateFileSystemResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateFileSystemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFileSystemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateFileSystemRequest request]
    (-> this (.createFileSystemAsync request))))

(defn create-backup-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for the CreateBackup operation. - `com.amazonaws.services.fsx.model.CreateBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.CreateBackupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.CreateBackupRequest request]
    (-> this (.createBackupAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for ListTagsForResource operation. - `com.amazonaws.services.fsx.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-file-system-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for DeleteFileSystem operation. - `com.amazonaws.services.fsx.model.DeleteFileSystemRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.DeleteFileSystemResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.DeleteFileSystemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFileSystemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.DeleteFileSystemRequest request]
    (-> this (.deleteFileSystemAsync request))))

(defn describe-file-systems-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for DescribeFileSystems operation. - `com.amazonaws.services.fsx.model.DescribeFileSystemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFileSystems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.DescribeFileSystemsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.DescribeFileSystemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFileSystemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.DescribeFileSystemsRequest request]
    (-> this (.describeFileSystemsAsync request))))

(defn delete-backup-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for DeleteBackup operation. - `com.amazonaws.services.fsx.model.DeleteBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.DeleteBackupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.DeleteBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.DeleteBackupRequest request]
    (-> this (.deleteBackupAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for the TagResource operation. - `com.amazonaws.services.fsx.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-backups-async
  "Description copied from interface: AmazonFSxAsync

  request - The request object for DescribeBackups operation. - `com.amazonaws.services.fsx.model.DescribeBackupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fsx.model.DescribeBackupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.DescribeBackupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonFSxAsync this ^com.amazonaws.services.fsx.model.DescribeBackupsRequest request]
    (-> this (.describeBackupsAsync request))))

