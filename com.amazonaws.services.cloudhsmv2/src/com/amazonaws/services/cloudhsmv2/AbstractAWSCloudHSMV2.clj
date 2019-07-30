(ns com.amazonaws.services.cloudhsmv2.AbstractAWSCloudHSMV2
  "Abstract implementation of AWSCloudHSMV2. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsmv2 AbstractAWSCloudHSMV2]))

(defn list-tags
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.ListTagsResult`"
  (^com.amazonaws.services.cloudhsmv2.model.ListTagsResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn untag-resource
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.UntagResourceResult`"
  (^com.amazonaws.services.cloudhsmv2.model.UntagResourceResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn copy-backup-to-region
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest`

  returns: Result of the CopyBackupToRegion operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionResult`"
  (^com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest request]
    (-> this (.copyBackupToRegion request))))

(defn restore-backup
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest`

  returns: Result of the RestoreBackup operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.RestoreBackupResult`"
  (^com.amazonaws.services.cloudhsmv2.model.RestoreBackupResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest request]
    (-> this (.restoreBackup request))))

(defn describe-backups
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest`

  returns: Result of the DescribeBackups operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DescribeBackupsResult`"
  (^com.amazonaws.services.cloudhsmv2.model.DescribeBackupsResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest request]
    (-> this (.describeBackups request))))

(defn create-hsm
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest`

  returns: Result of the CreateHsm operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.CreateHsmResult`"
  (^com.amazonaws.services.cloudhsmv2.model.CreateHsmResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest request]
    (-> this (.createHsm request))))

(defn delete-hsm
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest`

  returns: Result of the DeleteHsm operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DeleteHsmResult`"
  (^com.amazonaws.services.cloudhsmv2.model.DeleteHsmResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest request]
    (-> this (.deleteHsm request))))

(defn delete-backup
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest`

  returns: Result of the DeleteBackup operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DeleteBackupResult`"
  (^com.amazonaws.services.cloudhsmv2.model.DeleteBackupResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest request]
    (-> this (.deleteBackup request))))

(defn shutdown
  "Description copied from interface: AWSCloudHSMV2"
  ([^AbstractAWSCloudHSMV2 this]
    (-> this (.shutdown))))

(defn create-cluster
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.CreateClusterResult`"
  (^com.amazonaws.services.cloudhsmv2.model.CreateClusterResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn initialize-cluster
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest`

  returns: Result of the InitializeCluster operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.InitializeClusterResult`"
  (^com.amazonaws.services.cloudhsmv2.model.InitializeClusterResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest request]
    (-> this (.initializeCluster request))))

(defn delete-cluster
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DeleteClusterResult`"
  (^com.amazonaws.services.cloudhsmv2.model.DeleteClusterResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest request]
    (-> this (.deleteCluster request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCloudHSMV2

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCloudHSMV2 this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.TagResourceResult`"
  (^com.amazonaws.services.cloudhsmv2.model.TagResourceResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-clusters
  "Description copied from interface: AWSCloudHSMV2

  request - `com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest`

  returns: Result of the DescribeClusters operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DescribeClustersResult`"
  (^com.amazonaws.services.cloudhsmv2.model.DescribeClustersResult [^AbstractAWSCloudHSMV2 this ^com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest request]
    (-> this (.describeClusters request))))

