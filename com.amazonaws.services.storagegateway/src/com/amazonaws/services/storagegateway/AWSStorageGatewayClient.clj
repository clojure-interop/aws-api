(ns com.amazonaws.services.storagegateway.AWSStorageGatewayClient
  "Client for accessing AWS Storage Gateway. All service calls made using this client are blocking, and will not return
  until the service call completes.

  AWS Storage Gateway Service

  AWS Storage Gateway is the service that connects an on-premises software appliance with cloud-based storage to
  provide seamless and secure integration between an organization's on-premises IT environment and the AWS storage
  infrastructure. The service enables you to securely upload data to the AWS cloud for cost effective backup and rapid
  disaster recovery.


  Use the following links to get started using the AWS Storage Gateway Service API Reference:




  AWS Storage Gateway Required Request Headers: Describes the required headers that you must send with every POST
  request to AWS Storage Gateway.




  Signing Requests: AWS Storage Gateway requires that you authenticate every request you send; this topic
  describes how sign such a request.





  Error Responses: Provides reference information about AWS Storage Gateway errors.




  Operations in AWS
  Storage Gateway: Contains detailed descriptions of all AWS Storage Gateway operations, their request parameters,
  response elements, possible errors, and examples of requests and responses.




  AWS Storage Gateway Regions and
  Endpoints: Provides a list of each AWS region and endpoints available for use with AWS Storage Gateway.





  AWS Storage Gateway resource IDs are in uppercase. When you use these resource IDs with the Amazon EC2 API, EC2
  expects resource IDs in lowercase. You must change your resource ID to lowercase to use it with the EC2 API. For
  example, in Storage Gateway the ID for a volume might be vol-AA22BB012345DAF670. When you use this ID
  with the EC2 API, you must change it to vol-aa22bb012345daf670. Otherwise, the EC2 API might not behave
  as expected.



  IDs for Storage Gateway volumes and Amazon EBS snapshots created from gateway volumes are changing to a longer
  format. Starting in December 2016, all new volumes and snapshots will be created with a 17-character string. Starting
  in April 2016, you will be able to use these longer IDs so you can test your systems with the new format. For more
  information, see Longer EC2 and EBS Resource IDs.


  For example, a volume Amazon Resource Name (ARN) with the longer volume ID format looks like the following:


  arn:aws:storagegateway:us-west-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABBCCDDEEFFG.


  A snapshot ID with the longer ID format looks like the following: snap-78e226633445566ee.


  For more information, see Announcement: Heads-up – Longer
  AWS Storage Gateway volume and snapshot IDs coming in 2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.storagegateway AWSStorageGatewayClient]))

(defn ->aws-storage-gateway-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Storage Gateway (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSStorageGatewayClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSStorageGatewayClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSStorageGatewayClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSStorageGatewayClient aws-credentials client-configuration))
  (^AWSStorageGatewayClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSStorageGatewayClient client-configuration))
  (^AWSStorageGatewayClient []
    (new AWSStorageGatewayClient )))

(defn *builder
  "returns: `com.amazonaws.services.storagegateway.AWSStorageGatewayClientBuilder`"
  (^com.amazonaws.services.storagegateway.AWSStorageGatewayClientBuilder []
    (AWSStorageGatewayClient/builder )))

(defn join-domain
  "Adds a file gateway to an Active Directory domain. This operation is only supported for file gateways that
   support the SMB file protocol.

  request - `com.amazonaws.services.storagegateway.model.JoinDomainRequest`

  returns: Result of the JoinDomain operation returned by the service. - `com.amazonaws.services.storagegateway.model.JoinDomainResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.JoinDomainResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.JoinDomainRequest request]
    (-> this (.joinDomain request))))

(defn create-cachedi-scsi-volume
  "Creates a cached volume on a specified cached volume gateway. This operation is only supported in the cached
   volume gateway type.



   Cache storage must be allocated to the gateway before you can create a cached volume. Use the AddCache
   operation to add cache storage to a gateway.



   In the request, you must specify the gateway, size of the volume in bytes, the iSCSI target name, an IP address
   on which to expose the target, and a unique client token. In response, the gateway creates the volume and returns
   information about it. This information includes the volume Amazon Resource Name (ARN), its size, and the iSCSI
   target ARN that initiators can use to connect to the volume target.


   Optionally, you can provide the ARN for an existing volume as the SourceVolumeARN for this cached
   volume, which creates an exact copy of the existing volume’s latest recovery point. The
   VolumeSizeInBytes value must be equal to or larger than the size of the copied volume, in bytes.

  request - `com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest`

  returns: Result of the CreateCachediSCSIVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest request]
    (-> this (.createCachediSCSIVolume request))))

(defn add-cache
  "Configures one or more gateway local disks as cache for a gateway. This operation is only supported in the cached
   volume, tape and file gateway type (see Storage Gateway
   Concepts).


   In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or
   more disk IDs that you want to configure as cache.

  request - `com.amazonaws.services.storagegateway.model.AddCacheRequest`

  returns: Result of the AddCache operation returned by the service. - `com.amazonaws.services.storagegateway.model.AddCacheResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.AddCacheResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.AddCacheRequest request]
    (-> this (.addCache request))))

(defn describe-nfs-file-shares
  "Gets a description for one or more Network File System (NFS) file shares from a file gateway. This operation is
   only supported for file gateways.

  request - `com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest`

  returns: Result of the DescribeNFSFileShares operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest request]
    (-> this (.describeNFSFileShares request))))

(defn describe-maintenance-start-time
  "Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
   in terms of the gateway's time zone.

  request - `com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest`

  returns: Result of the DescribeMaintenanceStartTime operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest request]
    (-> this (.describeMaintenanceStartTime request))))

(defn describe-cache
  "Returns information about the cache of a gateway. This operation is only supported in the cached volume, tape and
   file gateway types.


   The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and
   used.

  request - `com.amazonaws.services.storagegateway.model.DescribeCacheRequest`

  returns: Result of the DescribeCache operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeCacheResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeCacheResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeCacheRequest request]
    (-> this (.describeCache request))))

(defn list-tags-for-resource
  "Lists the tags that have been added to the specified resource. This operation is only supported in the cached
   volume, stored volume and tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ListTagsForResourceResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request)))
  (^com.amazonaws.services.storagegateway.model.ListTagsForResourceResult [^AWSStorageGatewayClient this]
    (-> this (.listTagsForResource))))

(defn assign-tape-pool
  "Assigns a tape to a tape pool for archiving. The tape assigned to a pool is archived in the S3 storage class that
   is associated with the pool. When you use your backup application to eject the tape, the tape is archived
   directly into the S3 storage class (Glacier or Deep Archive) that corresponds to the pool.


   Valid values: \"GLACIER\", \"DEEP_ARCHIVE\"

  request - `com.amazonaws.services.storagegateway.model.AssignTapePoolRequest`

  returns: Result of the AssignTapePool operation returned by the service. - `com.amazonaws.services.storagegateway.model.AssignTapePoolResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.AssignTapePoolResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.AssignTapePoolRequest request]
    (-> this (.assignTapePool request))))

(defn shutdown-gateway
  "Shuts down a gateway. To specify which gateway to shut down, use the Amazon Resource Name (ARN) of the gateway in
   the body of your request.


   The operation shuts down the gateway service component running in the gateway's virtual machine (VM) and not the
   host VM.



   If you want to shut down the VM, it is recommended that you first shut down the gateway component in the VM to
   avoid unpredictable conditions.



   After the gateway is shutdown, you cannot call any other API except StartGateway,
   DescribeGatewayInformation, and ListGateways. For more information, see ActivateGateway.
   Your applications cannot read from or write to the gateway's storage volumes, and there are no snapshots taken.



   When you make a shutdown request, you will get a 200 OK success response immediately. However, it
   might take some time for the gateway to shut down. You can call the DescribeGatewayInformation API to
   check the status. For more information, see ActivateGateway.



   If do not intend to use the gateway again, you must delete the gateway (using DeleteGateway) to no longer
   pay software charges associated with the gateway.

  request - `com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest`

  returns: Result of the ShutdownGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.ShutdownGatewayResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ShutdownGatewayResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest request]
    (-> this (.shutdownGateway request))))

(defn describe-tape-recovery-points
  "Returns a list of virtual tape recovery points that are available for the specified tape gateway.


   A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is
   consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
   This operation is only supported in the tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest`

  returns: Result of the DescribeTapeRecoveryPoints operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest request]
    (-> this (.describeTapeRecoveryPoints request))))

(defn update-smb-file-share
  "Updates a Server Message Block (SMB) file share.



   To leave a file share field unchanged, set the corresponding input field to null. This operation is only
   supported for file gateways.



   File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
   Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
   activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and
   Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.


   File gateways don't support creating hard or symbolic links on a file share.

  request - `com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest`

  returns: Result of the UpdateSMBFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateSMBFileShareResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateSMBFileShareResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest request]
    (-> this (.updateSMBFileShare request))))

(defn list-local-disks
  "Returns a list of the gateway's local disks. To specify which gateway to describe, you use the Amazon Resource
   Name (ARN) of the gateway in the body of the request.


   The request returns a list of all disks, specifying which are configured as working storage, cache storage, or
   stored volume or not configured at all. The response includes a DiskStatus field. This field can
   have a value of present (the disk is available to use), missing (the disk is no longer connected to the gateway),
   or mismatch (the disk node is occupied by a disk that has incorrect metadata or the disk content is corrupted).

  request - `com.amazonaws.services.storagegateway.model.ListLocalDisksRequest`

  returns: Result of the ListLocalDisks operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListLocalDisksResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ListLocalDisksResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ListLocalDisksRequest request]
    (-> this (.listLocalDisks request))))

(defn update-smb-security-strategy
  "Updates the SMB security strategy on a file gateway. This action is only supported in file gateways.

  request - `com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest`

  returns: Result of the UpdateSMBSecurityStrategy operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest request]
    (-> this (.updateSMBSecurityStrategy request))))

(defn describe-chap-credentials
  "Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified
   iSCSI target, one for each target-initiator pair.

  request - `com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest`

  returns: Result of the DescribeChapCredentials operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest request]
    (-> this (.describeChapCredentials request))))

(defn describe-smb-file-shares
  "Gets a description for one or more Server Message Block (SMB) file shares from a file gateway. This operation is
   only supported for file gateways.

  request - `com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest`

  returns: Result of the DescribeSMBFileShares operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest request]
    (-> this (.describeSMBFileShares request))))

(defn delete-volume
  "Deletes the specified storage volume that you previously created using the CreateCachediSCSIVolume or
   CreateStorediSCSIVolume API. This operation is only supported in the cached volume and stored volume
   types. For stored volume gateways, the local disk that was configured as the storage volume is not deleted. You
   can reuse the local disk to create another storage volume.


   Before you delete a volume, make sure there are no iSCSI connections to the volume you are deleting. You should
   also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to
   query snapshots on the volume you are deleting and check the snapshot status. For more information, go to
   DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference.


   In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.

  request - `com.amazonaws.services.storagegateway.model.DeleteVolumeRequest`

  returns: Result of the DeleteVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteVolumeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DeleteVolumeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DeleteVolumeRequest request]
    (-> this (.deleteVolume request))))

(defn delete-chap-credentials
  "Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator
   pair.

  request - `com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest`

  returns: Result of the DeleteChapCredentials operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest request]
    (-> this (.deleteChapCredentials request))))

(defn delete-tape
  "Deletes the specified virtual tape. This operation is only supported in the tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.DeleteTapeRequest`

  returns: Result of the DeleteTape operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteTapeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DeleteTapeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DeleteTapeRequest request]
    (-> this (.deleteTape request))))

(defn create-tape-with-barcode
  "Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape. A
   barcode is unique and can not be reused if it has already been used on a tape . This applies to barcodes used on
   deleted tapes. This operation is only supported in the tape gateway type.



   Cache storage must be allocated to the gateway before you can create a virtual tape. Use the AddCache
   operation to add cache storage to a gateway.

  request - `com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest`

  returns: Result of the CreateTapeWithBarcode operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest request]
    (-> this (.createTapeWithBarcode request))))

(defn delete-snapshot-schedule
  "Deletes a snapshot of a volume.


   You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to
   delete a snapshot schedule for a volume. For more information, see Working with
   Snapshots. In the DeleteSnapshotSchedule request, you identify the volume by providing its
   Amazon Resource Name (ARN). This operation is only supported in stored and cached volume gateway types.



   To list or delete a snapshot, you must use the Amazon EC2 API. in Amazon Elastic Compute Cloud API
   Reference.

  request - `com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest`

  returns: Result of the DeleteSnapshotSchedule operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest request]
    (-> this (.deleteSnapshotSchedule request))))

(defn attach-volume
  "Connects a volume to an iSCSI connection and then attaches the volume to the specified gateway. Detaching and
   attaching a volume enables you to recover your data from one gateway to a different gateway without creating a
   snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
   Amazon EC2 instance.

  request - `com.amazonaws.services.storagegateway.model.AttachVolumeRequest`

  returns: Result of the AttachVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.AttachVolumeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.AttachVolumeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.AttachVolumeRequest request]
    (-> this (.attachVolume request))))

(defn describe-working-storage
  "Returns information about the working storage of a gateway. This operation is only supported in the stored
   volumes gateway type. This operation is deprecated in cached volumes API version (20120630). Use
   DescribeUploadBuffer instead.



   Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add
   upload buffer to a stored volume gateway.



   The response includes disk IDs that are configured as working storage, and it includes the amount of working
   storage allocated and used.

  request - `com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest`

  returns: Result of the DescribeWorkingStorage operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest request]
    (-> this (.describeWorkingStorage request))))

(defn describe-vtl-devices
  "Returns a description of virtual tape library (VTL) devices for the specified tape gateway. In the response, AWS
   Storage Gateway returns VTL device information.


   This operation is only supported in the tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest`

  returns: Result of the DescribeVTLDevices operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest request]
    (-> this (.describeVTLDevices request))))

(defn cancel-archival
  "Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated.
   This operation is only supported in the tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.CancelArchivalRequest`

  returns: Result of the CancelArchival operation returned by the service. - `com.amazonaws.services.storagegateway.model.CancelArchivalResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CancelArchivalResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CancelArchivalRequest request]
    (-> this (.cancelArchival request))))

(defn update-maintenance-start-time
  "Updates a gateway's weekly maintenance start time information, including day and time of the week. The
   maintenance time is the time in your gateway's time zone.

  request - `com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest`

  returns: Result of the UpdateMaintenanceStartTime operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest request]
    (-> this (.updateMaintenanceStartTime request))))

(defn delete-file-share
  "Deletes a file share from a file gateway. This operation is only supported for file gateways.

  request - `com.amazonaws.services.storagegateway.model.DeleteFileShareRequest`

  returns: Result of the DeleteFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteFileShareResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DeleteFileShareResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DeleteFileShareRequest request]
    (-> this (.deleteFileShare request))))

(defn update-snapshot-schedule
  "Updates a snapshot schedule configured for a gateway volume. This operation is only supported in the cached
   volume and stored volume gateway types.


   The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You
   can use this API to change the snapshot schedule configured for the volume.


   In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule
   information, including when you want the snapshot to begin on a day and the frequency (in hours) of snapshots.

  request - `com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest`

  returns: Result of the UpdateSnapshotSchedule operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest request]
    (-> this (.updateSnapshotSchedule request))))

(defn activate-gateway
  "Activates the gateway you previously deployed on your host. In the activation process, you specify information
   such as the region you want to use for storing snapshots or tapes, the time zone for scheduled snapshots the
   gateway snapshot schedule window, an activation key, and a name for your gateway. The activation process also
   associates your gateway with your account; for more information, see UpdateGatewayInformation.



   You must turn on the gateway VM before you can activate your gateway.

  request - `com.amazonaws.services.storagegateway.model.ActivateGatewayRequest`

  returns: Result of the ActivateGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.ActivateGatewayResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ActivateGatewayResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ActivateGatewayRequest request]
    (-> this (.activateGateway request))))

(defn list-volume-recovery-points
  "Lists the recovery points for a specified gateway. This operation is only supported in the cached volume gateway
   type.


   Each cache volume has one recovery point. A volume recovery point is a point in time at which all data of the
   volume is consistent and from which you can create a snapshot or clone a new cached volume from a source volume.
   To create a snapshot from a volume recovery point use the CreateSnapshotFromVolumeRecoveryPoint operation.

  request - `com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest`

  returns: Result of the ListVolumeRecoveryPoints operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest request]
    (-> this (.listVolumeRecoveryPoints request))))

(defn list-tapes
  "Lists virtual tapes in your virtual tape library (VTL) and your virtual tape shelf (VTS). You specify the tapes
   to list by specifying one or more tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the
   operation lists all virtual tapes in both your VTL and VTS.


   This operation supports pagination. By default, the operation returns a maximum of up to 100 tapes. You can
   optionally specify the Limit parameter in the body to limit the number of tapes in the response. If
   the number of tapes returned in the response is truncated, the response includes a Marker element
   that you can use in your subsequent request to retrieve the next set of tapes. This operation is only supported
   in the tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.ListTapesRequest`

  returns: Result of the ListTapes operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListTapesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ListTapesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ListTapesRequest request]
    (-> this (.listTapes request))))

(defn describe-upload-buffer
  "Returns information about the upload buffer of a gateway. This operation is supported for the stored volume,
   cached volume and tape gateway types.


   The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload
   buffer space allocated and used.

  request - `com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest`

  returns: Result of the DescribeUploadBuffer operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest request]
    (-> this (.describeUploadBuffer request))))

(defn start-gateway
  "Starts a gateway that you previously shut down (see ShutdownGateway). After the gateway starts, you can
   then make other API calls, your applications can read from or write to the gateway's storage volumes and you will
   be able to take snapshot backups.



   When you make a request, you will get a 200 OK success response immediately. However, it might take some time for
   the gateway to be ready. You should call DescribeGatewayInformation and check the status before making any
   additional API calls. For more information, see ActivateGateway.



   To specify which gateway to start, use the Amazon Resource Name (ARN) of the gateway in your request.

  request - `com.amazonaws.services.storagegateway.model.StartGatewayRequest`

  returns: Result of the StartGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.StartGatewayResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.StartGatewayResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.StartGatewayRequest request]
    (-> this (.startGateway request))))

(defn set-local-console-password
  "Sets the password for your VM local console. When you log in to the local console for the first time, you log in
   to the VM with the default credentials. We recommend that you set a new password. You don't need to know the
   default password to set a new password.

  request - `com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest`

  returns: Result of the SetLocalConsolePassword operation returned by the service. - `com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest request]
    (-> this (.setLocalConsolePassword request))))

(defn disable-gateway
  "Disables a tape gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged,
   you can disable the gateway so you can recover virtual tapes.


   Use this operation for a tape gateway that is not reachable or not functioning. This operation is only supported
   in the tape gateway type.



   Once a gateway is disabled it cannot be enabled.

  request - `com.amazonaws.services.storagegateway.model.DisableGatewayRequest`

  returns: Result of the DisableGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.DisableGatewayResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DisableGatewayResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DisableGatewayRequest request]
    (-> this (.disableGateway request))))

(defn retrieve-tape-archive
  "Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape gateway. Virtual tapes archived in
   the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway,
   even though it is also listed in the VTS, that is, archive. This operation is only supported in the tape gateway
   type.


   Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must
   archive the tape again before you can retrieve it to another gateway. This operation is only supported in the
   tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest`

  returns: Result of the RetrieveTapeArchive operation returned by the service. - `com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest request]
    (-> this (.retrieveTapeArchive request))))

(defn detach-volume
  "Disconnects a volume from an iSCSI connection and then detaches the volume from the specified gateway. Detaching
   and attaching a volume enables you to recover your data from one gateway to a different gateway without creating
   a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
   Amazon EC2 instance.

  request - `com.amazonaws.services.storagegateway.model.DetachVolumeRequest`

  returns: Result of the DetachVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.DetachVolumeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DetachVolumeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DetachVolumeRequest request]
    (-> this (.detachVolume request))))

(defn list-gateways
  "Lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by
   gateway Amazon Resource Name (ARN).


   By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you
   to optionally reduce the number of gateways returned in a response.


   If you have more gateways than are returned in a response (that is, the response returns only a truncated list of
   your gateways), the response contains a marker that you can specify in your next request to fetch the next page
   of gateways.

  request - `com.amazonaws.services.storagegateway.model.ListGatewaysRequest`

  returns: Result of the ListGateways operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListGatewaysResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ListGatewaysResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ListGatewaysRequest request]
    (-> this (.listGateways request)))
  (^com.amazonaws.services.storagegateway.model.ListGatewaysResult [^AWSStorageGatewayClient this]
    (-> this (.listGateways))))

(defn create-tapes
  "Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes. This operation
   is only supported in the tape gateway type.



   Cache storage must be allocated to the gateway before you can create virtual tapes. Use the AddCache
   operation to add cache storage to a gateway.

  request - `com.amazonaws.services.storagegateway.model.CreateTapesRequest`

  returns: Result of the CreateTapes operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateTapesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CreateTapesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CreateTapesRequest request]
    (-> this (.createTapes request))))

(defn update-chap-credentials
  "Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By
   default, a gateway does not have CHAP enabled; however, for added security, you might use it.



   When you update CHAP credentials, all existing connections on the target are closed and initiators must reconnect
   with the new credentials.

  request - `com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest`

  returns: Result of the UpdateChapCredentials operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest request]
    (-> this (.updateChapCredentials request))))

(defn add-working-storage
  "Configures one or more gateway local disks as working storage for a gateway. This operation is only supported in
   the stored volume gateway type. This operation is deprecated in cached volume API version 20120630. Use
   AddUploadBuffer instead.



   Working storage is also referred to as upload buffer. You can also use the AddUploadBuffer operation to
   add upload buffer to a stored volume gateway.



   In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and
   one or more disk IDs that you want to configure as working storage.

  request - `com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest`

  returns: Result of the AddWorkingStorage operation returned by the service. - `com.amazonaws.services.storagegateway.model.AddWorkingStorageResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.AddWorkingStorageResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest request]
    (-> this (.addWorkingStorage request))))

(defn refresh-cache
  "Refreshes the cache for the specified file share. This operation finds objects in the Amazon S3 bucket that were
   added, removed or replaced since the gateway last listed the bucket's contents and cached the results. This
   operation is only supported in the file gateway type. You can subscribe to be notified through an Amazon
   CloudWatch event when your RefreshCache operation completes. For more information, see Getting Notified About File Operations.


   When this API is called, it only initiates the refresh operation. When the API call completes and returns a
   success code, it doesn't necessarily mean that the file refresh has completed. You should use the
   refresh-complete notification to determine that the operation has completed before you check for new files on the
   gateway file share. You can subscribe to be notified through an CloudWatch event when your
   RefreshCache operation completes.

  request - `com.amazonaws.services.storagegateway.model.RefreshCacheRequest`

  returns: Result of the RefreshCache operation returned by the service. - `com.amazonaws.services.storagegateway.model.RefreshCacheResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.RefreshCacheResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.RefreshCacheRequest request]
    (-> this (.refreshCache request))))

(defn create-nfs-file-share
  "Creates a Network File System (NFS) file share on an existing file gateway. In Storage Gateway, a file share is a
   file system mount point backed by Amazon S3 cloud storage. Storage Gateway exposes file shares using a NFS
   interface. This operation is only supported for file gateways.



   File gateway requires AWS Security Token Service (AWS STS) to be activated to enable you create a file share.
   Make sure AWS STS is activated in the region you are creating your file gateway in. If AWS STS is not activated
   in the region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS
   STS in an AWS Region in the AWS Identity and Access Management User Guide.


   File gateway does not support creating hard or symbolic links on a file share.

  request - `com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest`

  returns: Result of the CreateNFSFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest request]
    (-> this (.createNFSFileShare request))))

(defn delete-tape-archive
  "Deletes the specified virtual tape from the virtual tape shelf (VTS). This operation is only supported in the
   tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest`

  returns: Result of the DeleteTapeArchive operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest request]
    (-> this (.deleteTapeArchive request))))

(defn update-nfs-file-share
  "Updates a Network File System (NFS) file share. This operation is only supported in the file gateway type.



   To leave a file share field unchanged, set the corresponding input field to null.



   Updates the following file share setting:




   Default storage class for your S3 bucket




   Metadata defaults for your S3 bucket




   Allowed NFS clients for your file share




   Squash settings




   Write status of your file share





   To leave a file share field unchanged, set the corresponding input field to null. This operation is only
   supported in file gateways.

  request - `com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest`

  returns: Result of the UpdateNFSFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest request]
    (-> this (.updateNFSFileShare request))))

(defn update-gateway-software-now
  "Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.



   When you make this request, you get a 200 OK success response immediately. However, it might take
   some time for the update to complete. You can call DescribeGatewayInformation to verify the gateway is in
   the STATE_RUNNING state.



   A software update forces a system restart of your gateway. You can minimize the chance of any disruption to your
   applications by increasing your iSCSI Initiators' timeouts. For more information about increasing iSCSI Initiator
   timeouts for Windows and Linux, see Customizing Your Windows iSCSI Settings and Customizing Your Linux iSCSI Settings, respectively.

  request - `com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest`

  returns: Result of the UpdateGatewaySoftwareNow operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest request]
    (-> this (.updateGatewaySoftwareNow request))))

(defn list-volume-initiators
  "Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume
   is being used or not. This operation is only supported in the cached volume and stored volume gateway types.

  request - `com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest`

  returns: Result of the ListVolumeInitiators operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest request]
    (-> this (.listVolumeInitiators request))))

(defn remove-tags-from-resource
  "Removes one or more tags from the specified resource. This operation is only supported in the cached volume,
   stored volume and tape gateway types.

  request - `com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request)))
  (^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult [^AWSStorageGatewayClient this]
    (-> this (.removeTagsFromResource))))

(defn reset-cache
  "Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache
   storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes
   in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a
   cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks.
   This operation is only supported in the cached volume and tape types.



   If the cache disk you are resetting contains data that has not been uploaded to Amazon S3 yet, that data can be
   lost. After you reset cache disks, there will be no configured cache disks left in the gateway, so you must
   configure at least one new cache disk for your gateway to function properly.

  request - `com.amazonaws.services.storagegateway.model.ResetCacheRequest`

  returns: Result of the ResetCache operation returned by the service. - `com.amazonaws.services.storagegateway.model.ResetCacheResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ResetCacheResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ResetCacheRequest request]
    (-> this (.resetCache request))))

(defn describe-storedi-scsi-volumes
  "Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the
   request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by
   volume ARNs. This operation is only supported in stored volume gateway type.

  request - `com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest`

  returns: Result of the DescribeStorediSCSIVolumes operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest request]
    (-> this (.describeStorediSCSIVolumes request))))

(defn describe-smb-settings
  "Gets a description of a Server Message Block (SMB) file share settings from a file gateway. This operation is
   only supported for file gateways.

  request - `com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest`

  returns: Result of the DescribeSMBSettings operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeSMBSettingsResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeSMBSettingsResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest request]
    (-> this (.describeSMBSettings request))))

(defn describe-tape-archives
  "Returns a description of specified virtual tapes in the virtual tape shelf (VTS). This operation is only
   supported in the tape gateway type.


   If a specific TapeARN is not specified, AWS Storage Gateway returns a description of all virtual
   tapes found in the VTS associated with your account.

  request - `com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest`

  returns: Result of the DescribeTapeArchives operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest request]
    (-> this (.describeTapeArchives request)))
  (^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult [^AWSStorageGatewayClient this]
    (-> this (.describeTapeArchives))))

(defn update-vtl-device-type
  "Updates the type of medium changer in a tape gateway. When you activate a tape gateway, you select a medium
   changer type for the tape gateway. This operation enables you to select a different type of medium changer after
   a tape gateway is activated. This operation is only supported in the tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest`

  returns: Result of the UpdateVTLDeviceType operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest request]
    (-> this (.updateVTLDeviceType request))))

(defn describe-bandwidth-rate-limit
  "Returns the bandwidth rate limits of a gateway. By default, these limits are not set, which means no bandwidth
   rate limiting is in effect.


   This operation only returns a value for a bandwidth rate limit only if the limit is set. If no limits are set for
   the gateway, then this operation returns only the gateway ARN in the response body. To specify which gateway to
   describe, use the Amazon Resource Name (ARN) of the gateway in your request.

  request - `com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest`

  returns: Result of the DescribeBandwidthRateLimit operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest request]
    (-> this (.describeBandwidthRateLimit request))))

(defn describe-tapes
  "Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a TapeARN is
   not specified, returns a description of all virtual tapes associated with the specified gateway. This operation
   is only supported in the tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.DescribeTapesRequest`

  returns: Result of the DescribeTapes operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeTapesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeTapesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeTapesRequest request]
    (-> this (.describeTapes request))))

(defn create-smb-file-share
  "Creates a Server Message Block (SMB) file share on an existing file gateway. In Storage Gateway, a file share is
   a file system mount point backed by Amazon S3 cloud storage. Storage Gateway expose file shares using a SMB
   interface. This operation is only supported for file gateways.



   File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
   Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
   activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and
   Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.


   File gateways don't support creating hard or symbolic links on a file share.

  request - `com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest`

  returns: Result of the CreateSMBFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateSMBFileShareResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CreateSMBFileShareResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest request]
    (-> this (.createSMBFileShare request))))

(defn set-smb-guest-password
  "Sets the password for the guest user smbguest. The smbguest user is the user when the
   authentication method for the file share is set to GuestAccess.

  request - `com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest`

  returns: Result of the SetSMBGuestPassword operation returned by the service. - `com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest request]
    (-> this (.setSMBGuestPassword request))))

(defn delete-bandwidth-rate-limit
  "Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate
   limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To
   specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.

  request - `com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest`

  returns: Result of the DeleteBandwidthRateLimit operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest request]
    (-> this (.deleteBandwidthRateLimit request))))

(defn add-tags-to-resource
  "Adds one or more tags to the specified resource. You use tags to add metadata to resources, which you can use to
   categorize these resources. For example, you can categorize resources by purpose, owner, environment, or team.
   Each tag consists of a key and a value, which you define. You can add tags to the following AWS Storage Gateway
   resources:




   Storage gateways of all types




   Storage volumes




   Virtual tapes




   NFS and SMB file shares




   You can create a maximum of 50 tags for each resource. Virtual tapes and storage volumes that are recovered to a
   new gateway maintain their tags.

  request - `com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.storagegateway.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.AddTagsToResourceResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn describe-cachedi-scsi-volumes
  "Returns a description of the gateway volumes specified in the request. This operation is only supported in the
   cached volume gateway types.


   The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway
   returns volume information sorted by volume Amazon Resource Name (ARN).

  request - `com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest`

  returns: Result of the DescribeCachediSCSIVolumes operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest request]
    (-> this (.describeCachediSCSIVolumes request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSStorageGatewayClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn notify-when-uploaded
  "Sends you notification through CloudWatch Events when all files written to your NFS file share have been uploaded
   to Amazon S3.


   AWS Storage Gateway can send a notification through Amazon CloudWatch Events when all files written to your file
   share up to that point in time have been uploaded to Amazon S3. These files include files written to the NFS file
   share up to the time that you make a request for notification. When the upload is done, Storage Gateway sends you
   notification through an Amazon CloudWatch Event. You can configure CloudWatch Events to send the notification
   through event targets such as Amazon SNS or AWS Lambda function. This operation is only supported for file
   gateways.


   For more information, see Getting File Upload Notification in the Storage Gateway User Guide
   (https://docs.aws.amazon
   .com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification).

  request - `com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest`

  returns: Result of the NotifyWhenUploaded operation returned by the service. - `com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest request]
    (-> this (.notifyWhenUploaded request))))

(defn list-volumes
  "Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the
   volume ARNs. If you want additional volume information, use the DescribeStorediSCSIVolumes or the
   DescribeCachediSCSIVolumes API.


   The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can
   optionally specify the Limit field in the body to limit the number of volumes in the response. If
   the number of volumes returned in the response is truncated, the response includes a Marker field. You can use
   this Marker value in your subsequent request to retrieve the next set of volumes. This operation is only
   supported in the cached volume and stored volume gateway types.

  request - `com.amazonaws.services.storagegateway.model.ListVolumesRequest`

  returns: Result of the ListVolumes operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListVolumesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ListVolumesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ListVolumesRequest request]
    (-> this (.listVolumes request))))

(defn retrieve-tape-recovery-point
  "Retrieves the recovery point for the specified virtual tape. This operation is only supported in the tape gateway
   type.


   A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If
   your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.



   The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be
   retrieved to only a tape gateway. There is no charge for retrieving recovery points.

  request - `com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest`

  returns: Result of the RetrieveTapeRecoveryPoint operation returned by the service. - `com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest request]
    (-> this (.retrieveTapeRecoveryPoint request))))

(defn delete-gateway
  "Deletes a gateway. To specify which gateway to delete, use the Amazon Resource Name (ARN) of the gateway in your
   request. The operation deletes the gateway; however, it does not delete the gateway virtual machine (VM) from
   your host computer.


   After you delete a gateway, you cannot reactivate it. Completed snapshots of the gateway volumes are not deleted
   upon deleting the gateway, however, pending snapshots will not complete. After you delete a gateway, your next
   step is to remove it from your environment.



   You no longer pay software charges after the gateway is deleted; however, your existing Amazon EBS snapshots
   persist and you will continue to be billed for these snapshots. You can choose to remove all remaining Amazon EBS
   snapshots by canceling your Amazon EC2 subscription.  If you prefer not to cancel your Amazon EC2 subscription,
   you can delete your snapshots using the Amazon EC2 console. For more information, see the  AWS Storage Gateway Detail Page.

  request - `com.amazonaws.services.storagegateway.model.DeleteGatewayRequest`

  returns: Result of the DeleteGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteGatewayResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DeleteGatewayResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DeleteGatewayRequest request]
    (-> this (.deleteGateway request))))

(defn add-upload-buffer
  "Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported
   for the stored volume, cached volume and tape gateway types.


   In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and
   one or more disk IDs that you want to configure as upload buffer.

  request - `com.amazonaws.services.storagegateway.model.AddUploadBufferRequest`

  returns: Result of the AddUploadBuffer operation returned by the service. - `com.amazonaws.services.storagegateway.model.AddUploadBufferResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.AddUploadBufferResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.AddUploadBufferRequest request]
    (-> this (.addUploadBuffer request))))

(defn describe-gateway-information
  "Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state
   (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN)
   of the gateway in your request.

  request - `com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest`

  returns: Result of the DescribeGatewayInformation operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest request]
    (-> this (.describeGatewayInformation request))))

(defn create-storedi-scsi-volume
  "Creates a volume on a specified gateway. This operation is only supported in the stored volume gateway type.


   The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the
   disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty
   gateway volume, then any existing data on the disk is erased.


   In the request you must specify the gateway and the disk information on which you are creating the volume. In
   response, the gateway creates the volume and returns volume information such as the volume Amazon Resource Name
   (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.

  request - `com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest`

  returns: Result of the CreateStorediSCSIVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest request]
    (-> this (.createStorediSCSIVolume request))))

(defn create-snapshot-from-volume-recovery-point
  "Initiates a snapshot of a gateway from a volume recovery point. This operation is only supported in the cached
   volume gateway type.


   A volume recovery point is a point in time at which all data of the volume is consistent and from which you can
   create a snapshot. To get a list of volume recovery point for cached volume gateway, use
   ListVolumeRecoveryPoints.


   In the CreateSnapshotFromVolumeRecoveryPoint request, you identify the volume by providing its
   Amazon Resource Name (ARN). You must also provide a description for the snapshot. When the gateway takes a
   snapshot of the specified volume, the snapshot and its description appear in the AWS Storage Gateway console. In
   response, the gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or
   later use it when you want to create a volume from a snapshot.



   To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in Amazon Elastic Compute
   Cloud API Reference.

  request - `com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest`

  returns: Result of the CreateSnapshotFromVolumeRecoveryPoint operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest request]
    (-> this (.createSnapshotFromVolumeRecoveryPoint request))))

(defn list-file-shares
  "Gets a list of the file shares for a specific file gateway, or the list of file shares that belong to the calling
   user account. This operation is only supported for file gateways.

  request - `com.amazonaws.services.storagegateway.model.ListFileSharesRequest`

  returns: Result of the ListFileShares operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListFileSharesResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.ListFileSharesResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.ListFileSharesRequest request]
    (-> this (.listFileShares request))))

(defn cancel-retrieval
  "Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is
   initiated. The virtual tape is returned to the VTS. This operation is only supported in the tape gateway type.

  request - `com.amazonaws.services.storagegateway.model.CancelRetrievalRequest`

  returns: Result of the CancelRetrieval operation returned by the service. - `com.amazonaws.services.storagegateway.model.CancelRetrievalResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CancelRetrievalResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CancelRetrievalRequest request]
    (-> this (.cancelRetrieval request))))

(defn update-gateway-information
  "Updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to
   update, use the Amazon Resource Name (ARN) of the gateway in your request.



   For Gateways activated after September 2, 2015, the gateway's ARN contains the gateway ID rather than the gateway
   name. However, changing the name of the gateway has no effect on the gateway's ARN.

  request - `com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest`

  returns: Result of the UpdateGatewayInformation operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest request]
    (-> this (.updateGatewayInformation request))))

(defn create-snapshot
  "Initiates a snapshot of a volume.


   AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage
   (S3) for durable off-site recovery, as well as import the data to an Amazon Elastic Block Store (EBS) volume in
   Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a scheduled or ad hoc basis.
   This API enables you to take ad-hoc snapshot. For more information, see Editing a Snapshot Schedule.


   In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also
   provide description for the snapshot. When AWS Storage Gateway takes the snapshot of specified volume, the
   snapshot and description appears in the AWS Storage Gateway Console. In response, AWS Storage Gateway returns you
   a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to
   create a volume from a snapshot. This operation is only supported in stored and cached volume gateway type.



   To list or delete a snapshot, you must use the Amazon EC2 API. For more information, see DescribeSnapshots or
   DeleteSnapshot in the EC2
   API reference.



   Volume and snapshot IDs are changing to a longer length ID format. For more information, see the important note
   on the Welcome page.

  request - `com.amazonaws.services.storagegateway.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateSnapshotResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.CreateSnapshotResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.CreateSnapshotRequest request]
    (-> this (.createSnapshot request))))

(defn update-bandwidth-rate-limit
  "Updates the bandwidth rate limits of a gateway. You can update both the upload and download bandwidth rate limit
   or specify only one of the two. If you don't set a bandwidth rate limit, the existing rate limit remains.


   By default, a gateway's bandwidth rate limits are not set. If you don't set any limit, the gateway does not have
   any limitations on its bandwidth usage and could potentially use the maximum available bandwidth.


   To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.

  request - `com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest`

  returns: Result of the UpdateBandwidthRateLimit operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest request]
    (-> this (.updateBandwidthRateLimit request))))

(defn describe-snapshot-schedule
  "Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes
   intervals at which snapshots are automatically initiated on the volume. This operation is only supported in the
   cached volume and stored volume types.

  request - `com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest`

  returns: Result of the DescribeSnapshotSchedule operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult`

  throws: com.amazonaws.services.storagegateway.model.InvalidGatewayRequestException - An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields."
  (^com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult [^AWSStorageGatewayClient this ^com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest request]
    (-> this (.describeSnapshotSchedule request))))

