(ns com.amazonaws.services.cloudhsmv2.AWSCloudHSMV2Async
  "Interface for accessing CloudHSM V2 asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCloudHSMV2Async instead.



  For more information about AWS CloudHSM, see AWS CloudHSM and the AWS CloudHSM User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsmv2 AWSCloudHSMV2Async]))

(defn untag-resource-async
  "Removes the specified tag or tags from the specified AWS CloudHSM cluster.

  untag-resource-request - `com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn delete-hsm-async
  "Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's
   elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To
   find these values, use DescribeClusters.

  delete-hsm-request - `com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DeleteHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest delete-hsm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHsmAsync delete-hsm-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest delete-hsm-request]
    (-> this (.deleteHsmAsync delete-hsm-request))))

(defn create-cluster-async
  "Creates a new AWS CloudHSM cluster.

  create-cluster-request - `com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest create-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync create-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest create-cluster-request]
    (-> this (.createClusterAsync create-cluster-request))))

(defn list-tags-async
  "Gets a list of tags for the specified AWS CloudHSM cluster.


   This is a paginated operation, which means that each response might contain only a subset of all the tags. When
   the response contains only a subset of tags, it includes a NextToken value. Use this value in a
   subsequent ListTags request to get more tags. When you receive a response with no
   NextToken (or an empty or null value), that means there are no more tags to get.

  list-tags-request - `com.amazonaws.services.cloudhsmv2.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn delete-cluster-async
  "Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the
   cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use
   DeleteHsm.

  delete-cluster-request - `com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest delete-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync delete-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest delete-cluster-request]
    (-> this (.deleteClusterAsync delete-cluster-request))))

(defn describe-clusters-async
  "Gets information about AWS CloudHSM clusters.


   This is a paginated operation, which means that each response might contain only a subset of all the clusters.
   When the response contains only a subset of clusters, it includes a NextToken value. Use this value
   in a subsequent DescribeClusters request to get more clusters. When you receive a response with no
   NextToken (or an empty or null value), that means there are no more clusters to get.

  describe-clusters-request - `com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DescribeClustersResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest describe-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClustersAsync describe-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest describe-clusters-request]
    (-> this (.describeClustersAsync describe-clusters-request))))

(defn initialize-cluster-async
  "Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority
   (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate
   signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.

  initialize-cluster-request - `com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitializeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.InitializeClusterResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest initialize-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initializeClusterAsync initialize-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest initialize-cluster-request]
    (-> this (.initializeClusterAsync initialize-cluster-request))))

(defn copy-backup-to-region-async
  "Copy an AWS CloudHSM cluster backup to a different region.

  copy-backup-to-region-request - `com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyBackupToRegion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest copy-backup-to-region-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyBackupToRegionAsync copy-backup-to-region-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest copy-backup-to-region-request]
    (-> this (.copyBackupToRegionAsync copy-backup-to-region-request))))

(defn restore-backup-async
  "Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For more information
   on deleting a backup, see DeleteBackup.

  restore-backup-request - `com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.RestoreBackupResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest restore-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreBackupAsync restore-backup-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest restore-backup-request]
    (-> this (.restoreBackupAsync restore-backup-request))))

(defn delete-backup-async
  "Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request.
   For more information on restoring a backup, see RestoreBackup

  delete-backup-request - `com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DeleteBackupResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest delete-backup-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupAsync delete-backup-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest delete-backup-request]
    (-> this (.deleteBackupAsync delete-backup-request))))

(defn tag-resource-async
  "Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.

  tag-resource-request - `com.amazonaws.services.cloudhsmv2.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn create-hsm-async
  "Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.

  create-hsm-request - `com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.CreateHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest create-hsm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHsmAsync create-hsm-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest create-hsm-request]
    (-> this (.createHsmAsync create-hsm-request))))

(defn describe-backups-async
  "Gets information about backups of AWS CloudHSM clusters.


   This is a paginated operation, which means that each response might contain only a subset of all the backups.
   When the response contains only a subset of backups, it includes a NextToken value. Use this value
   in a subsequent DescribeBackups request to get more backups. When you receive a response with no
   NextToken (or an empty or null value), that means there are no more backups to get.

  describe-backups-request - `com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DescribeBackupsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest describe-backups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupsAsync describe-backups-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2Async this ^com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest describe-backups-request]
    (-> this (.describeBackupsAsync describe-backups-request))))

