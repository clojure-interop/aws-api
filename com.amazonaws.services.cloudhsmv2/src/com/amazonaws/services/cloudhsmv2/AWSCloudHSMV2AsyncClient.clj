(ns com.amazonaws.services.cloudhsmv2.AWSCloudHSMV2AsyncClient
  "Client for accessing CloudHSM V2 asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  For more information about AWS CloudHSM, see AWS CloudHSM and the AWS CloudHSM User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsmv2 AWSCloudHSMV2AsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.cloudhsmv2.AWSCloudHSMV2AsyncClientBuilder`"
  (^com.amazonaws.services.cloudhsmv2.AWSCloudHSMV2AsyncClientBuilder []
    (AWSCloudHSMV2AsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn delete-hsm-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DeleteHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHsmAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest request]
    (-> this (.deleteHsmAsync request))))

(defn create-cluster-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest request]
    (-> this (.createClusterAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCloudHSMV2AsyncClient this]
    (-> this (.getExecutorService))))

(defn list-tags-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.ListTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn delete-cluster-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DeleteClusterResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest request]
    (-> this (.deleteClusterAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCloudHSMV2AsyncClient this]
    (-> this (.shutdown))))

(defn describe-clusters-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DescribeClustersResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest request]
    (-> this (.describeClustersAsync request))))

(defn initialize-cluster-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitializeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.InitializeClusterResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initializeClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest request]
    (-> this (.initializeClusterAsync request))))

(defn copy-backup-to-region-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyBackupToRegion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyBackupToRegionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest request]
    (-> this (.copyBackupToRegionAsync request))))

(defn restore-backup-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.RestoreBackupResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest request]
    (-> this (.restoreBackupAsync request))))

(defn delete-backup-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBackup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DeleteBackupResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBackupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest request]
    (-> this (.deleteBackupAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn create-hsm-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.CreateHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHsmAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest request]
    (-> this (.createHsmAsync request))))

(defn describe-backups-async
  "Description copied from interface: AWSCloudHSMV2Async

  request - `com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBackups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsmv2.model.DescribeBackupsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBackupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMV2AsyncClient this ^com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest request]
    (-> this (.describeBackupsAsync request))))

