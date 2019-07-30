(ns com.amazonaws.services.cloudhsmv2.AWSCloudHSMV2Client
  "Client for accessing CloudHSM V2. All service calls made using this client are blocking, and will not return until
  the service call completes.


  For more information about AWS CloudHSM, see AWS CloudHSM and the AWS CloudHSM User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsmv2 AWSCloudHSMV2Client]))

(defn *builder
  "returns: `com.amazonaws.services.cloudhsmv2.AWSCloudHSMV2ClientBuilder`"
  (^com.amazonaws.services.cloudhsmv2.AWSCloudHSMV2ClientBuilder []
    (AWSCloudHSMV2Client/builder )))

(defn list-tags
  "Gets a list of tags for the specified AWS CloudHSM cluster.


   This is a paginated operation, which means that each response might contain only a subset of all the tags. When
   the response contains only a subset of tags, it includes a NextToken value. Use this value in a
   subsequent ListTags request to get more tags. When you receive a response with no
   NextToken (or an empty or null value), that means there are no more tags to get.

  request - `com.amazonaws.services.cloudhsmv2.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.ListTagsResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.ListTagsResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn untag-resource
  "Removes the specified tag or tags from the specified AWS CloudHSM cluster.

  request - `com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.UntagResourceResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.UntagResourceResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn copy-backup-to-region
  "Copy an AWS CloudHSM cluster backup to a different region.

  request - `com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest`

  returns: Result of the CopyBackupToRegion operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.CopyBackupToRegionRequest request]
    (-> this (.copyBackupToRegion request))))

(defn restore-backup
  "Restores a specified AWS CloudHSM backup that is in the PENDING_DELETION state. For more information
   on deleting a backup, see DeleteBackup.

  request - `com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest`

  returns: Result of the RestoreBackup operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.RestoreBackupResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.RestoreBackupResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.RestoreBackupRequest request]
    (-> this (.restoreBackup request))))

(defn describe-backups
  "Gets information about backups of AWS CloudHSM clusters.


   This is a paginated operation, which means that each response might contain only a subset of all the backups.
   When the response contains only a subset of backups, it includes a NextToken value. Use this value
   in a subsequent DescribeBackups request to get more backups. When you receive a response with no
   NextToken (or an empty or null value), that means there are no more backups to get.

  request - `com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest`

  returns: Result of the DescribeBackups operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DescribeBackupsResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.DescribeBackupsResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.DescribeBackupsRequest request]
    (-> this (.describeBackups request))))

(defn create-hsm
  "Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.

  request - `com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest`

  returns: Result of the CreateHsm operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.CreateHsmResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.CreateHsmResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.CreateHsmRequest request]
    (-> this (.createHsm request))))

(defn delete-hsm
  "Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's
   elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To
   find these values, use DescribeClusters.

  request - `com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest`

  returns: Result of the DeleteHsm operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DeleteHsmResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.DeleteHsmResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.DeleteHsmRequest request]
    (-> this (.deleteHsm request))))

(defn delete-backup
  "Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request.
   For more information on restoring a backup, see RestoreBackup

  request - `com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest`

  returns: Result of the DeleteBackup operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DeleteBackupResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.DeleteBackupResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.DeleteBackupRequest request]
    (-> this (.deleteBackup request))))

(defn create-cluster
  "Creates a new AWS CloudHSM cluster.

  request - `com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.CreateClusterResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.CreateClusterResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn initialize-cluster
  "Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority
   (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate
   signing request (CSR) with your issuing CA. To get the cluster's CSR, use DescribeClusters.

  request - `com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest`

  returns: Result of the InitializeCluster operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.InitializeClusterResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.InitializeClusterResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.InitializeClusterRequest request]
    (-> this (.initializeCluster request))))

(defn delete-cluster
  "Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the
   cluster. To see if the cluster contains any HSMs, use DescribeClusters. To delete an HSM, use
   DeleteHsm.

  request - `com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest`

  returns: Result of the DeleteCluster operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DeleteClusterResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.DeleteClusterResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.DeleteClusterRequest request]
    (-> this (.deleteCluster request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCloudHSMV2Client this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.

  request - `com.amazonaws.services.cloudhsmv2.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.TagResourceResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.TagResourceResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-clusters
  "Gets information about AWS CloudHSM clusters.


   This is a paginated operation, which means that each response might contain only a subset of all the clusters.
   When the response contains only a subset of clusters, it includes a NextToken value. Use this value
   in a subsequent DescribeClusters request to get more clusters. When you receive a response with no
   NextToken (or an empty or null value), that means there are no more clusters to get.

  request - `com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest`

  returns: Result of the DescribeClusters operation returned by the service. - `com.amazonaws.services.cloudhsmv2.model.DescribeClustersResult`

  throws: com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException - The request was rejected because of an AWS CloudHSM internal failure. The request can be retried."
  (^com.amazonaws.services.cloudhsmv2.model.DescribeClustersResult [^AWSCloudHSMV2Client this ^com.amazonaws.services.cloudhsmv2.model.DescribeClustersRequest request]
    (-> this (.describeClusters request))))

