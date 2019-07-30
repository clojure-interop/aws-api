(ns com.amazonaws.services.fsx.AbstractAmazonFSx
  "Abstract implementation of AmazonFSx. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fsx AbstractAmazonFSx]))

(defn list-tags-for-resource
  "Description copied from interface: AmazonFSx

  request - The request object for ListTagsForResource operation. - `com.amazonaws.services.fsx.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.fsx.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.fsx.model.ListTagsForResourceResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn untag-resource
  "Description copied from interface: AmazonFSx

  request - The request object for UntagResource action. - `com.amazonaws.services.fsx.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.fsx.model.UntagResourceResult`"
  (^com.amazonaws.services.fsx.model.UntagResourceResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-file-system-from-backup
  "Description copied from interface: AmazonFSx

  request - The request object for the CreateFileSystemFromBackup operation. - `com.amazonaws.services.fsx.model.CreateFileSystemFromBackupRequest`

  returns: Result of the CreateFileSystemFromBackup operation returned by the service. - `com.amazonaws.services.fsx.model.CreateFileSystemFromBackupResult`"
  (^com.amazonaws.services.fsx.model.CreateFileSystemFromBackupResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.CreateFileSystemFromBackupRequest request]
    (-> this (.createFileSystemFromBackup request))))

(defn describe-backups
  "Description copied from interface: AmazonFSx

  request - The request object for DescribeBackups operation. - `com.amazonaws.services.fsx.model.DescribeBackupsRequest`

  returns: Result of the DescribeBackups operation returned by the service. - `com.amazonaws.services.fsx.model.DescribeBackupsResult`"
  (^com.amazonaws.services.fsx.model.DescribeBackupsResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.DescribeBackupsRequest request]
    (-> this (.describeBackups request))))

(defn delete-backup
  "Description copied from interface: AmazonFSx

  request - The request object for DeleteBackup operation. - `com.amazonaws.services.fsx.model.DeleteBackupRequest`

  returns: Result of the DeleteBackup operation returned by the service. - `com.amazonaws.services.fsx.model.DeleteBackupResult`"
  (^com.amazonaws.services.fsx.model.DeleteBackupResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.DeleteBackupRequest request]
    (-> this (.deleteBackup request))))

(defn shutdown
  "Description copied from interface: AmazonFSx"
  ([^AbstractAmazonFSx this]
    (-> this (.shutdown))))

(defn delete-file-system
  "Description copied from interface: AmazonFSx

  request - The request object for DeleteFileSystem operation. - `com.amazonaws.services.fsx.model.DeleteFileSystemRequest`

  returns: Result of the DeleteFileSystem operation returned by the service. - `com.amazonaws.services.fsx.model.DeleteFileSystemResult`"
  (^com.amazonaws.services.fsx.model.DeleteFileSystemResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.DeleteFileSystemRequest request]
    (-> this (.deleteFileSystem request))))

(defn create-file-system
  "Description copied from interface: AmazonFSx

  request - The request object used to create a new Amazon FSx file system. - `com.amazonaws.services.fsx.model.CreateFileSystemRequest`

  returns: Result of the CreateFileSystem operation returned by the service. - `com.amazonaws.services.fsx.model.CreateFileSystemResult`"
  (^com.amazonaws.services.fsx.model.CreateFileSystemResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.CreateFileSystemRequest request]
    (-> this (.createFileSystem request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonFSx

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonFSx this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-file-systems
  "Description copied from interface: AmazonFSx

  request - The request object for DescribeFileSystems operation. - `com.amazonaws.services.fsx.model.DescribeFileSystemsRequest`

  returns: Result of the DescribeFileSystems operation returned by the service. - `com.amazonaws.services.fsx.model.DescribeFileSystemsResult`"
  (^com.amazonaws.services.fsx.model.DescribeFileSystemsResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.DescribeFileSystemsRequest request]
    (-> this (.describeFileSystems request))))

(defn tag-resource
  "Description copied from interface: AmazonFSx

  request - The request object for the TagResource operation. - `com.amazonaws.services.fsx.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.fsx.model.TagResourceResult`"
  (^com.amazonaws.services.fsx.model.TagResourceResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn create-backup
  "Description copied from interface: AmazonFSx

  request - The request object for the CreateBackup operation. - `com.amazonaws.services.fsx.model.CreateBackupRequest`

  returns: Result of the CreateBackup operation returned by the service. - `com.amazonaws.services.fsx.model.CreateBackupResult`"
  (^com.amazonaws.services.fsx.model.CreateBackupResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.CreateBackupRequest request]
    (-> this (.createBackup request))))

(defn update-file-system
  "Description copied from interface: AmazonFSx

  request - The request object for the UpdateFileSystem operation. - `com.amazonaws.services.fsx.model.UpdateFileSystemRequest`

  returns: Result of the UpdateFileSystem operation returned by the service. - `com.amazonaws.services.fsx.model.UpdateFileSystemResult`"
  (^com.amazonaws.services.fsx.model.UpdateFileSystemResult [^AbstractAmazonFSx this ^com.amazonaws.services.fsx.model.UpdateFileSystemRequest request]
    (-> this (.updateFileSystem request))))

