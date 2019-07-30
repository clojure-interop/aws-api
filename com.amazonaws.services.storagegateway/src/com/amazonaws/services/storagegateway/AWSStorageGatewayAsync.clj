(ns com.amazonaws.services.storagegateway.AWSStorageGatewayAsync
  "Interface for accessing AWS Storage Gateway asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSStorageGatewayAsync instead.


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
  (:import [com.amazonaws.services.storagegateway AWSStorageGatewayAsync]))

(defn create-tapes-async
  "Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes. This operation
   is only supported in the tape gateway type.



   Cache storage must be allocated to the gateway before you can create virtual tapes. Use the AddCache
   operation to add cache storage to a gateway.

  create-tapes-request - CreateTapesInput - `com.amazonaws.services.storagegateway.model.CreateTapesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTapes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateTapesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateTapesRequest create-tapes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTapesAsync create-tapes-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateTapesRequest create-tapes-request]
    (-> this (.createTapesAsync create-tapes-request))))

(defn update-vtl-device-type-async
  "Updates the type of medium changer in a tape gateway. When you activate a tape gateway, you select a medium
   changer type for the tape gateway. This operation enables you to select a different type of medium changer after
   a tape gateway is activated. This operation is only supported in the tape gateway type.

  update-vtl-device-type-request - `com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVTLDeviceType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest update-vtl-device-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVTLDeviceTypeAsync update-vtl-device-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest update-vtl-device-type-request]
    (-> this (.updateVTLDeviceTypeAsync update-vtl-device-type-request))))

(defn describe-cache-async
  "Returns information about the cache of a gateway. This operation is only supported in the cached volume, tape and
   file gateway types.


   The response includes disk IDs that are configured as cache, and it includes the amount of cache allocated and
   used.

  describe-cache-request - `com.amazonaws.services.storagegateway.model.DescribeCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeCacheResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeCacheRequest describe-cache-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheAsync describe-cache-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeCacheRequest describe-cache-request]
    (-> this (.describeCacheAsync describe-cache-request))))

(defn activate-gateway-async
  "Activates the gateway you previously deployed on your host. In the activation process, you specify information
   such as the region you want to use for storing snapshots or tapes, the time zone for scheduled snapshots the
   gateway snapshot schedule window, an activation key, and a name for your gateway. The activation process also
   associates your gateway with your account; for more information, see UpdateGatewayInformation.



   You must turn on the gateway VM before you can activate your gateway.

  activate-gateway-request - A JSON object containing one or more of the following fields: ActivateGatewayInput$ActivationKey ActivateGatewayInput$GatewayName ActivateGatewayInput$GatewayRegion ActivateGatewayInput$GatewayTimezone ActivateGatewayInput$GatewayType ActivateGatewayInput$TapeDriveType ActivateGatewayInput$MediumChangerType - `com.amazonaws.services.storagegateway.model.ActivateGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ActivateGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ActivateGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ActivateGatewayRequest activate-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.activateGatewayAsync activate-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ActivateGatewayRequest activate-gateway-request]
    (-> this (.activateGatewayAsync activate-gateway-request))))

(defn disable-gateway-async
  "Disables a tape gateway when the gateway is no longer functioning. For example, if your gateway VM is damaged,
   you can disable the gateway so you can recover virtual tapes.


   Use this operation for a tape gateway that is not reachable or not functioning. This operation is only supported
   in the tape gateway type.



   Once a gateway is disabled it cannot be enabled.

  disable-gateway-request - DisableGatewayInput - `com.amazonaws.services.storagegateway.model.DisableGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DisableGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DisableGatewayRequest disable-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableGatewayAsync disable-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DisableGatewayRequest disable-gateway-request]
    (-> this (.disableGatewayAsync disable-gateway-request))))

(defn start-gateway-async
  "Starts a gateway that you previously shut down (see ShutdownGateway). After the gateway starts, you can
   then make other API calls, your applications can read from or write to the gateway's storage volumes and you will
   be able to take snapshot backups.



   When you make a request, you will get a 200 OK success response immediately. However, it might take some time for
   the gateway to be ready. You should call DescribeGatewayInformation and check the status before making any
   additional API calls. For more information, see ActivateGateway.



   To specify which gateway to start, use the Amazon Resource Name (ARN) of the gateway in your request.

  start-gateway-request - A JSON object containing the of the gateway to start. - `com.amazonaws.services.storagegateway.model.StartGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.StartGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.StartGatewayRequest start-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startGatewayAsync start-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.StartGatewayRequest start-gateway-request]
    (-> this (.startGatewayAsync start-gateway-request))))

(defn describe-snapshot-schedule-async
  "Describes the snapshot schedule for the specified gateway volume. The snapshot schedule information includes
   intervals at which snapshots are automatically initiated on the volume. This operation is only supported in the
   cached volume and stored volume types.

  describe-snapshot-schedule-request - A JSON object containing the DescribeSnapshotScheduleInput$VolumeARN of the volume. - `com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest describe-snapshot-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotScheduleAsync describe-snapshot-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest describe-snapshot-schedule-request]
    (-> this (.describeSnapshotScheduleAsync describe-snapshot-schedule-request))))

(defn retrieve-tape-archive-async
  "Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape gateway. Virtual tapes archived in
   the VTS are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway,
   even though it is also listed in the VTS, that is, archive. This operation is only supported in the tape gateway
   type.


   Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must
   archive the tape again before you can retrieve it to another gateway. This operation is only supported in the
   tape gateway type.

  retrieve-tape-archive-request - RetrieveTapeArchiveInput - `com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetrieveTapeArchive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest retrieve-tape-archive-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retrieveTapeArchiveAsync retrieve-tape-archive-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest retrieve-tape-archive-request]
    (-> this (.retrieveTapeArchiveAsync retrieve-tape-archive-request))))

(defn assign-tape-pool-async
  "Assigns a tape to a tape pool for archiving. The tape assigned to a pool is archived in the S3 storage class that
   is associated with the pool. When you use your backup application to eject the tape, the tape is archived
   directly into the S3 storage class (Glacier or Deep Archive) that corresponds to the pool.


   Valid values: \"GLACIER\", \"DEEP_ARCHIVE\"

  assign-tape-pool-request - `com.amazonaws.services.storagegateway.model.AssignTapePoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignTapePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AssignTapePoolResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AssignTapePoolRequest assign-tape-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignTapePoolAsync assign-tape-pool-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AssignTapePoolRequest assign-tape-pool-request]
    (-> this (.assignTapePoolAsync assign-tape-pool-request))))

(defn set-local-console-password-async
  "Sets the password for your VM local console. When you log in to the local console for the first time, you log in
   to the VM with the default credentials. We recommend that you set a new password. You don't need to know the
   default password to set a new password.

  set-local-console-password-request - SetLocalConsolePasswordInput - `com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLocalConsolePassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest set-local-console-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLocalConsolePasswordAsync set-local-console-password-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest set-local-console-password-request]
    (-> this (.setLocalConsolePasswordAsync set-local-console-password-request))))

(defn retrieve-tape-recovery-point-async
  "Retrieves the recovery point for the specified virtual tape. This operation is only supported in the tape gateway
   type.


   A recovery point is a point in time view of a virtual tape at which all the data on the tape is consistent. If
   your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.



   The virtual tape can be retrieved to only one gateway. The retrieved tape is read-only. The virtual tape can be
   retrieved to only a tape gateway. There is no charge for retrieving recovery points.

  retrieve-tape-recovery-point-request - RetrieveTapeRecoveryPointInput - `com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetrieveTapeRecoveryPoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest retrieve-tape-recovery-point-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retrieveTapeRecoveryPointAsync retrieve-tape-recovery-point-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest retrieve-tape-recovery-point-request]
    (-> this (.retrieveTapeRecoveryPointAsync retrieve-tape-recovery-point-request))))

(defn create-storedi-scsi-volume-async
  "Creates a volume on a specified gateway. This operation is only supported in the stored volume gateway type.


   The size of the volume to create is inferred from the disk size. You can choose to preserve existing data on the
   disk, create volume from an existing snapshot, or create an empty volume. If you choose to create an empty
   gateway volume, then any existing data on the disk is erased.


   In the request you must specify the gateway and the disk information on which you are creating the volume. In
   response, the gateway creates the volume and returns volume information such as the volume Amazon Resource Name
   (ARN), its size, and the iSCSI target ARN that initiators can use to connect to the volume target.

  create-storedi-scsi-volume-request - A JSON object containing one or more of the following fields: CreateStorediSCSIVolumeInput$DiskId CreateStorediSCSIVolumeInput$NetworkInterfaceId CreateStorediSCSIVolumeInput$PreserveExistingData CreateStorediSCSIVolumeInput$SnapshotId CreateStorediSCSIVolumeInput$TargetName - `com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStorediSCSIVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest create-storedi-scsi-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStorediSCSIVolumeAsync create-storedi-scsi-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest create-storedi-scsi-volume-request]
    (-> this (.createStorediSCSIVolumeAsync create-storedi-scsi-volume-request))))

(defn add-cache-async
  "Configures one or more gateway local disks as cache for a gateway. This operation is only supported in the cached
   volume, tape and file gateway type (see Storage Gateway
   Concepts).


   In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add cache, and one or
   more disk IDs that you want to configure as cache.

  add-cache-request - `com.amazonaws.services.storagegateway.model.AddCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AddCacheResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AddCacheRequest add-cache-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addCacheAsync add-cache-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AddCacheRequest add-cache-request]
    (-> this (.addCacheAsync add-cache-request))))

(defn reset-cache-async
  "Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache
   storage. If your cache disk encounters a error, the gateway prevents read and write operations on virtual tapes
   in the gateway. For example, an error can occur when a disk is corrupted or removed from the gateway. When a
   cache is reset, the gateway loses its cache storage. At this point you can reconfigure the disks as cache disks.
   This operation is only supported in the cached volume and tape types.



   If the cache disk you are resetting contains data that has not been uploaded to Amazon S3 yet, that data can be
   lost. After you reset cache disks, there will be no configured cache disks left in the gateway, so you must
   configure at least one new cache disk for your gateway to function properly.

  reset-cache-request - `com.amazonaws.services.storagegateway.model.ResetCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ResetCacheResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ResetCacheRequest reset-cache-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetCacheAsync reset-cache-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ResetCacheRequest reset-cache-request]
    (-> this (.resetCacheAsync reset-cache-request))))

(defn join-domain-async
  "Adds a file gateway to an Active Directory domain. This operation is only supported for file gateways that
   support the SMB file protocol.

  join-domain-request - JoinDomainInput - `com.amazonaws.services.storagegateway.model.JoinDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the JoinDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.JoinDomainResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.JoinDomainRequest join-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.joinDomainAsync join-domain-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.JoinDomainRequest join-domain-request]
    (-> this (.joinDomainAsync join-domain-request))))

(defn create-cachedi-scsi-volume-async
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

  create-cachedi-scsi-volume-request - `com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCachediSCSIVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest create-cachedi-scsi-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCachediSCSIVolumeAsync create-cachedi-scsi-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest create-cachedi-scsi-volume-request]
    (-> this (.createCachediSCSIVolumeAsync create-cachedi-scsi-volume-request))))

(defn create-snapshot-from-volume-recovery-point-async
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

  create-snapshot-from-volume-recovery-point-request - `com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshotFromVolumeRecoveryPoint operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest create-snapshot-from-volume-recovery-point-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotFromVolumeRecoveryPointAsync create-snapshot-from-volume-recovery-point-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest create-snapshot-from-volume-recovery-point-request]
    (-> this (.createSnapshotFromVolumeRecoveryPointAsync create-snapshot-from-volume-recovery-point-request))))

(defn describe-smb-file-shares-async
  "Gets a description for one or more Server Message Block (SMB) file shares from a file gateway. This operation is
   only supported for file gateways.

  describe-smb-file-shares-request - DescribeSMBFileSharesInput - `com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSMBFileShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest describe-smb-file-shares-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSMBFileSharesAsync describe-smb-file-shares-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest describe-smb-file-shares-request]
    (-> this (.describeSMBFileSharesAsync describe-smb-file-shares-request))))

(defn describe-working-storage-async
  "Returns information about the working storage of a gateway. This operation is only supported in the stored
   volumes gateway type. This operation is deprecated in cached volumes API version (20120630). Use
   DescribeUploadBuffer instead.



   Working storage is also referred to as upload buffer. You can also use the DescribeUploadBuffer operation to add
   upload buffer to a stored volume gateway.



   The response includes disk IDs that are configured as working storage, and it includes the amount of working
   storage allocated and used.

  describe-working-storage-request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkingStorage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest describe-working-storage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkingStorageAsync describe-working-storage-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest describe-working-storage-request]
    (-> this (.describeWorkingStorageAsync describe-working-storage-request))))

(defn update-chap-credentials-async
  "Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By
   default, a gateway does not have CHAP enabled; however, for added security, you might use it.



   When you update CHAP credentials, all existing connections on the target are closed and initiators must reconnect
   with the new credentials.

  update-chap-credentials-request - A JSON object containing one or more of the following fields: UpdateChapCredentialsInput$InitiatorName UpdateChapCredentialsInput$SecretToAuthenticateInitiator UpdateChapCredentialsInput$SecretToAuthenticateTarget UpdateChapCredentialsInput$TargetARN - `com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChapCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest update-chap-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChapCredentialsAsync update-chap-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest update-chap-credentials-request]
    (-> this (.updateChapCredentialsAsync update-chap-credentials-request))))

(defn delete-file-share-async
  "Deletes a file share from a file gateway. This operation is only supported for file gateways.

  delete-file-share-request - DeleteFileShareInput - `com.amazonaws.services.storagegateway.model.DeleteFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteFileShareRequest delete-file-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFileShareAsync delete-file-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteFileShareRequest delete-file-share-request]
    (-> this (.deleteFileShareAsync delete-file-share-request))))

(defn delete-volume-async
  "Deletes the specified storage volume that you previously created using the CreateCachediSCSIVolume or
   CreateStorediSCSIVolume API. This operation is only supported in the cached volume and stored volume
   types. For stored volume gateways, the local disk that was configured as the storage volume is not deleted. You
   can reuse the local disk to create another storage volume.


   Before you delete a volume, make sure there are no iSCSI connections to the volume you are deleting. You should
   also make sure there is no snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to
   query snapshots on the volume you are deleting and check the snapshot status. For more information, go to
   DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference.


   In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.

  delete-volume-request - A JSON object containing the DeleteVolumeInput$VolumeARN to delete. - `com.amazonaws.services.storagegateway.model.DeleteVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteVolumeRequest delete-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVolumeAsync delete-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteVolumeRequest delete-volume-request]
    (-> this (.deleteVolumeAsync delete-volume-request))))

(defn create-smb-file-share-async
  "Creates a Server Message Block (SMB) file share on an existing file gateway. In Storage Gateway, a file share is
   a file system mount point backed by Amazon S3 cloud storage. Storage Gateway expose file shares using a SMB
   interface. This operation is only supported for file gateways.



   File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
   Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
   activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and
   Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.


   File gateways don't support creating hard or symbolic links on a file share.

  create-smb-file-share-request - CreateSMBFileShareInput - `com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSMBFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateSMBFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest create-smb-file-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSMBFileShareAsync create-smb-file-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest create-smb-file-share-request]
    (-> this (.createSMBFileShareAsync create-smb-file-share-request))))

(defn update-snapshot-schedule-async
  "Updates a snapshot schedule configured for a gateway volume. This operation is only supported in the cached
   volume and stored volume gateway types.


   The default snapshot schedule for volume is once every 24 hours, starting at the creation time of the volume. You
   can use this API to change the snapshot schedule configured for the volume.


   In the request you must identify the gateway volume whose snapshot schedule you want to update, and the schedule
   information, including when you want the snapshot to begin on a day and the frequency (in hours) of snapshots.

  update-snapshot-schedule-request - A JSON object containing one or more of the following fields: UpdateSnapshotScheduleInput$Description UpdateSnapshotScheduleInput$RecurrenceInHours UpdateSnapshotScheduleInput$StartAt UpdateSnapshotScheduleInput$VolumeARN - `com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest update-snapshot-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSnapshotScheduleAsync update-snapshot-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest update-snapshot-schedule-request]
    (-> this (.updateSnapshotScheduleAsync update-snapshot-schedule-request))))

(defn describe-vtl-devices-async
  "Returns a description of virtual tape library (VTL) devices for the specified tape gateway. In the response, AWS
   Storage Gateway returns VTL device information.


   This operation is only supported in the tape gateway type.

  describe-vtl-devices-request - DescribeVTLDevicesInput - `com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVTLDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest describe-vtl-devices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVTLDevicesAsync describe-vtl-devices-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest describe-vtl-devices-request]
    (-> this (.describeVTLDevicesAsync describe-vtl-devices-request))))

(defn create-tape-with-barcode-async
  "Creates a virtual tape by using your own barcode. You write data to the virtual tape and then archive the tape. A
   barcode is unique and can not be reused if it has already been used on a tape . This applies to barcodes used on
   deleted tapes. This operation is only supported in the tape gateway type.



   Cache storage must be allocated to the gateway before you can create a virtual tape. Use the AddCache
   operation to add cache storage to a gateway.

  create-tape-with-barcode-request - CreateTapeWithBarcodeInput - `com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTapeWithBarcode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest create-tape-with-barcode-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTapeWithBarcodeAsync create-tape-with-barcode-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest create-tape-with-barcode-request]
    (-> this (.createTapeWithBarcodeAsync create-tape-with-barcode-request))))

(defn create-snapshot-async
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

  create-snapshot-request - A JSON object containing one or more of the following fields: CreateSnapshotInput$SnapshotDescription CreateSnapshotInput$VolumeARN - `com.amazonaws.services.storagegateway.model.CreateSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateSnapshotResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateSnapshotRequest create-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotAsync create-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateSnapshotRequest create-snapshot-request]
    (-> this (.createSnapshotAsync create-snapshot-request))))

(defn update-gateway-software-now-async
  "Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.



   When you make this request, you get a 200 OK success response immediately. However, it might take
   some time for the update to complete. You can call DescribeGatewayInformation to verify the gateway is in
   the STATE_RUNNING state.



   A software update forces a system restart of your gateway. You can minimize the chance of any disruption to your
   applications by increasing your iSCSI Initiators' timeouts. For more information about increasing iSCSI Initiator
   timeouts for Windows and Linux, see Customizing Your Windows iSCSI Settings and Customizing Your Linux iSCSI Settings, respectively.

  update-gateway-software-now-request - A JSON object containing the of the gateway to update. - `com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGatewaySoftwareNow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest update-gateway-software-now-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewaySoftwareNowAsync update-gateway-software-now-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest update-gateway-software-now-request]
    (-> this (.updateGatewaySoftwareNowAsync update-gateway-software-now-request))))

(defn shutdown-gateway-async
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

  shutdown-gateway-request - A JSON object containing the of the gateway to shut down. - `com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ShutdownGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ShutdownGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest shutdown-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.shutdownGatewayAsync shutdown-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest shutdown-gateway-request]
    (-> this (.shutdownGatewayAsync shutdown-gateway-request))))

(defn list-volume-recovery-points-async
  "Lists the recovery points for a specified gateway. This operation is only supported in the cached volume gateway
   type.


   Each cache volume has one recovery point. A volume recovery point is a point in time at which all data of the
   volume is consistent and from which you can create a snapshot or clone a new cached volume from a source volume.
   To create a snapshot from a volume recovery point use the CreateSnapshotFromVolumeRecoveryPoint operation.

  list-volume-recovery-points-request - `com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVolumeRecoveryPoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest list-volume-recovery-points-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVolumeRecoveryPointsAsync list-volume-recovery-points-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest list-volume-recovery-points-request]
    (-> this (.listVolumeRecoveryPointsAsync list-volume-recovery-points-request))))

(defn list-volumes-async
  "Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN. The response includes only the
   volume ARNs. If you want additional volume information, use the DescribeStorediSCSIVolumes or the
   DescribeCachediSCSIVolumes API.


   The operation supports pagination. By default, the operation returns a maximum of up to 100 volumes. You can
   optionally specify the Limit field in the body to limit the number of volumes in the response. If
   the number of volumes returned in the response is truncated, the response includes a Marker field. You can use
   this Marker value in your subsequent request to retrieve the next set of volumes. This operation is only
   supported in the cached volume and stored volume gateway types.

  list-volumes-request - A JSON object that contains one or more of the following fields: ListVolumesInput$Limit ListVolumesInput$Marker - `com.amazonaws.services.storagegateway.model.ListVolumesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListVolumesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListVolumesRequest list-volumes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVolumesAsync list-volumes-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListVolumesRequest list-volumes-request]
    (-> this (.listVolumesAsync list-volumes-request))))

(defn list-gateways-async
  "Lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by
   gateway Amazon Resource Name (ARN).


   By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you
   to optionally reduce the number of gateways returned in a response.


   If you have more gateways than are returned in a response (that is, the response returns only a truncated list of
   your gateways), the response contains a marker that you can specify in your next request to fetch the next page
   of gateways.

  list-gateways-request - A JSON object containing zero or more of the following fields: ListGatewaysInput$Limit ListGatewaysInput$Marker - `com.amazonaws.services.storagegateway.model.ListGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListGatewaysResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListGatewaysRequest list-gateways-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGatewaysAsync list-gateways-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListGatewaysRequest list-gateways-request]
    (-> this (.listGatewaysAsync list-gateways-request)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this]
    (-> this (.listGatewaysAsync))))

(defn describe-tape-archives-async
  "Returns a description of specified virtual tapes in the virtual tape shelf (VTS). This operation is only
   supported in the tape gateway type.


   If a specific TapeARN is not specified, AWS Storage Gateway returns a description of all virtual
   tapes found in the VTS associated with your account.

  describe-tape-archives-request - DescribeTapeArchivesInput - `com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTapeArchives operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest describe-tape-archives-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTapeArchivesAsync describe-tape-archives-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest describe-tape-archives-request]
    (-> this (.describeTapeArchivesAsync describe-tape-archives-request)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this]
    (-> this (.describeTapeArchivesAsync))))

(defn detach-volume-async
  "Disconnects a volume from an iSCSI connection and then detaches the volume from the specified gateway. Detaching
   and attaching a volume enables you to recover your data from one gateway to a different gateway without creating
   a snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
   Amazon EC2 instance.

  detach-volume-request - AttachVolumeInput - `com.amazonaws.services.storagegateway.model.DetachVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DetachVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DetachVolumeRequest detach-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachVolumeAsync detach-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DetachVolumeRequest detach-volume-request]
    (-> this (.detachVolumeAsync detach-volume-request))))

(defn delete-bandwidth-rate-limit-async
  "Deletes the bandwidth rate limits of a gateway. You can delete either the upload and download bandwidth rate
   limit, or you can delete both. If you delete only one of the limits, the other limit remains unchanged. To
   specify which gateway to work with, use the Amazon Resource Name (ARN) of the gateway in your request.

  delete-bandwidth-rate-limit-request - A JSON object containing the following fields: DeleteBandwidthRateLimitInput$BandwidthType - `com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBandwidthRateLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest delete-bandwidth-rate-limit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBandwidthRateLimitAsync delete-bandwidth-rate-limit-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest delete-bandwidth-rate-limit-request]
    (-> this (.deleteBandwidthRateLimitAsync delete-bandwidth-rate-limit-request))))

(defn describe-tapes-async
  "Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes. If a TapeARN is
   not specified, returns a description of all virtual tapes associated with the specified gateway. This operation
   is only supported in the tape gateway type.

  describe-tapes-request - DescribeTapesInput - `com.amazonaws.services.storagegateway.model.DescribeTapesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTapes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeTapesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeTapesRequest describe-tapes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTapesAsync describe-tapes-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeTapesRequest describe-tapes-request]
    (-> this (.describeTapesAsync describe-tapes-request))))

(defn describe-bandwidth-rate-limit-async
  "Returns the bandwidth rate limits of a gateway. By default, these limits are not set, which means no bandwidth
   rate limiting is in effect.


   This operation only returns a value for a bandwidth rate limit only if the limit is set. If no limits are set for
   the gateway, then this operation returns only the gateway ARN in the response body. To specify which gateway to
   describe, use the Amazon Resource Name (ARN) of the gateway in your request.

  describe-bandwidth-rate-limit-request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBandwidthRateLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest describe-bandwidth-rate-limit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBandwidthRateLimitAsync describe-bandwidth-rate-limit-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest describe-bandwidth-rate-limit-request]
    (-> this (.describeBandwidthRateLimitAsync describe-bandwidth-rate-limit-request))))

(defn describe-gateway-information-async
  "Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state
   (whether the gateway is running or not). To specify which gateway to describe, use the Amazon Resource Name (ARN)
   of the gateway in your request.

  describe-gateway-information-request - A JSON object containing the ID of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGatewayInformation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest describe-gateway-information-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGatewayInformationAsync describe-gateway-information-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest describe-gateway-information-request]
    (-> this (.describeGatewayInformationAsync describe-gateway-information-request))))

(defn update-smb-file-share-async
  "Updates a Server Message Block (SMB) file share.



   To leave a file share field unchanged, set the corresponding input field to null. This operation is only
   supported for file gateways.



   File gateways require AWS Security Token Service (AWS STS) to be activated to enable you to create a file share.
   Make sure that AWS STS is activated in the AWS Region you are creating your file gateway in. If AWS STS is not
   activated in this AWS Region, activate it. For information about how to activate AWS STS, see Activating and
   Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.


   File gateways don't support creating hard or symbolic links on a file share.

  update-smb-file-share-request - UpdateSMBFileShareInput - `com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSMBFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateSMBFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest update-smb-file-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSMBFileShareAsync update-smb-file-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest update-smb-file-share-request]
    (-> this (.updateSMBFileShareAsync update-smb-file-share-request))))

(defn update-gateway-information-async
  "Updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to
   update, use the Amazon Resource Name (ARN) of the gateway in your request.



   For Gateways activated after September 2, 2015, the gateway's ARN contains the gateway ID rather than the gateway
   name. However, changing the name of the gateway has no effect on the gateway's ARN.

  update-gateway-information-request - `com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGatewayInformation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest update-gateway-information-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewayInformationAsync update-gateway-information-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest update-gateway-information-request]
    (-> this (.updateGatewayInformationAsync update-gateway-information-request))))

(defn notify-when-uploaded-async
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

  notify-when-uploaded-request - `com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the NotifyWhenUploaded operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest notify-when-uploaded-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.notifyWhenUploadedAsync notify-when-uploaded-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest notify-when-uploaded-request]
    (-> this (.notifyWhenUploadedAsync notify-when-uploaded-request))))

(defn list-volume-initiators-async
  "Lists iSCSI initiators that are connected to a volume. You can use this operation to determine whether a volume
   is being used or not. This operation is only supported in the cached volume and stored volume gateway types.

  list-volume-initiators-request - ListVolumeInitiatorsInput - `com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVolumeInitiators operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest list-volume-initiators-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVolumeInitiatorsAsync list-volume-initiators-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest list-volume-initiators-request]
    (-> this (.listVolumeInitiatorsAsync list-volume-initiators-request))))

(defn update-nfs-file-share-async
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

  update-nfs-file-share-request - UpdateNFSFileShareInput - `com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNFSFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest update-nfs-file-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNFSFileShareAsync update-nfs-file-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest update-nfs-file-share-request]
    (-> this (.updateNFSFileShareAsync update-nfs-file-share-request))))

(defn describe-nfs-file-shares-async
  "Gets a description for one or more Network File System (NFS) file shares from a file gateway. This operation is
   only supported for file gateways.

  describe-nfs-file-shares-request - DescribeNFSFileSharesInput - `com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNFSFileShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest describe-nfs-file-shares-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNFSFileSharesAsync describe-nfs-file-shares-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest describe-nfs-file-shares-request]
    (-> this (.describeNFSFileSharesAsync describe-nfs-file-shares-request))))

(defn describe-upload-buffer-async
  "Returns information about the upload buffer of a gateway. This operation is supported for the stored volume,
   cached volume and tape gateway types.


   The response includes disk IDs that are configured as upload buffer space, and it includes the amount of upload
   buffer space allocated and used.

  describe-upload-buffer-request - `com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUploadBuffer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest describe-upload-buffer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUploadBufferAsync describe-upload-buffer-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest describe-upload-buffer-request]
    (-> this (.describeUploadBufferAsync describe-upload-buffer-request))))

(defn list-file-shares-async
  "Gets a list of the file shares for a specific file gateway, or the list of file shares that belong to the calling
   user account. This operation is only supported for file gateways.

  list-file-shares-request - ListFileShareInput - `com.amazonaws.services.storagegateway.model.ListFileSharesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFileShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListFileSharesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListFileSharesRequest list-file-shares-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFileSharesAsync list-file-shares-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListFileSharesRequest list-file-shares-request]
    (-> this (.listFileSharesAsync list-file-shares-request))))

(defn remove-tags-from-resource-async
  "Removes one or more tags from the specified resource. This operation is only supported in the cached volume,
   stored volume and tape gateway types.

  remove-tags-from-resource-request - RemoveTagsFromResourceInput - `com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this]
    (-> this (.removeTagsFromResourceAsync))))

(defn create-nfs-file-share-async
  "Creates a Network File System (NFS) file share on an existing file gateway. In Storage Gateway, a file share is a
   file system mount point backed by Amazon S3 cloud storage. Storage Gateway exposes file shares using a NFS
   interface. This operation is only supported for file gateways.



   File gateway requires AWS Security Token Service (AWS STS) to be activated to enable you create a file share.
   Make sure AWS STS is activated in the region you are creating your file gateway in. If AWS STS is not activated
   in the region, activate it. For information about how to activate AWS STS, see Activating and Deactivating AWS
   STS in an AWS Region in the AWS Identity and Access Management User Guide.


   File gateway does not support creating hard or symbolic links on a file share.

  create-nfs-file-share-request - CreateNFSFileShareInput - `com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNFSFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest create-nfs-file-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNFSFileShareAsync create-nfs-file-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest create-nfs-file-share-request]
    (-> this (.createNFSFileShareAsync create-nfs-file-share-request))))

(defn describe-storedi-scsi-volumes-async
  "Returns the description of the gateway volumes specified in the request. The list of gateway volumes in the
   request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by
   volume ARNs. This operation is only supported in stored volume gateway type.

  describe-storedi-scsi-volumes-request - A JSON object containing a list of DescribeStorediSCSIVolumesInput$VolumeARNs. - `com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStorediSCSIVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest describe-storedi-scsi-volumes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStorediSCSIVolumesAsync describe-storedi-scsi-volumes-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest describe-storedi-scsi-volumes-request]
    (-> this (.describeStorediSCSIVolumesAsync describe-storedi-scsi-volumes-request))))

(defn delete-chap-credentials-async
  "Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator
   pair.

  delete-chap-credentials-request - A JSON object containing one or more of the following fields: DeleteChapCredentialsInput$InitiatorName DeleteChapCredentialsInput$TargetARN - `com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChapCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest delete-chap-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChapCredentialsAsync delete-chap-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest delete-chap-credentials-request]
    (-> this (.deleteChapCredentialsAsync delete-chap-credentials-request))))

(defn delete-tape-async
  "Deletes the specified virtual tape. This operation is only supported in the tape gateway type.

  delete-tape-request - DeleteTapeInput - `com.amazonaws.services.storagegateway.model.DeleteTapeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTape operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteTapeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteTapeRequest delete-tape-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTapeAsync delete-tape-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteTapeRequest delete-tape-request]
    (-> this (.deleteTapeAsync delete-tape-request))))

(defn list-tapes-async
  "Lists virtual tapes in your virtual tape library (VTL) and your virtual tape shelf (VTS). You specify the tapes
   to list by specifying one or more tape Amazon Resource Names (ARNs). If you don't specify a tape ARN, the
   operation lists all virtual tapes in both your VTL and VTS.


   This operation supports pagination. By default, the operation returns a maximum of up to 100 tapes. You can
   optionally specify the Limit parameter in the body to limit the number of tapes in the response. If
   the number of tapes returned in the response is truncated, the response includes a Marker element
   that you can use in your subsequent request to retrieve the next set of tapes. This operation is only supported
   in the tape gateway type.

  list-tapes-request - A JSON object that contains one or more of the following fields: ListTapesInput$Limit ListTapesInput$Marker ListTapesInput$TapeARNs - `com.amazonaws.services.storagegateway.model.ListTapesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTapes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListTapesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListTapesRequest list-tapes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTapesAsync list-tapes-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListTapesRequest list-tapes-request]
    (-> this (.listTapesAsync list-tapes-request))))

(defn list-tags-for-resource-async
  "Lists the tags that have been added to the specified resource. This operation is only supported in the cached
   volume, stored volume and tape gateway type.

  list-tags-for-resource-request - ListTagsForResourceInput - `com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this]
    (-> this (.listTagsForResourceAsync))))

(defn update-smb-security-strategy-async
  "Updates the SMB security strategy on a file gateway. This action is only supported in file gateways.

  update-smb-security-strategy-request - `com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSMBSecurityStrategy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest update-smb-security-strategy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSMBSecurityStrategyAsync update-smb-security-strategy-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest update-smb-security-strategy-request]
    (-> this (.updateSMBSecurityStrategyAsync update-smb-security-strategy-request))))

(defn describe-smb-settings-async
  "Gets a description of a Server Message Block (SMB) file share settings from a file gateway. This operation is
   only supported for file gateways.

  describe-smb-settings-request - `com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSMBSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeSMBSettingsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest describe-smb-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSMBSettingsAsync describe-smb-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest describe-smb-settings-request]
    (-> this (.describeSMBSettingsAsync describe-smb-settings-request))))

(defn list-local-disks-async
  "Returns a list of the gateway's local disks. To specify which gateway to describe, you use the Amazon Resource
   Name (ARN) of the gateway in the body of the request.


   The request returns a list of all disks, specifying which are configured as working storage, cache storage, or
   stored volume or not configured at all. The response includes a DiskStatus field. This field can
   have a value of present (the disk is available to use), missing (the disk is no longer connected to the gateway),
   or mismatch (the disk node is occupied by a disk that has incorrect metadata or the disk content is corrupted).

  list-local-disks-request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.ListLocalDisksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLocalDisks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListLocalDisksResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListLocalDisksRequest list-local-disks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLocalDisksAsync list-local-disks-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.ListLocalDisksRequest list-local-disks-request]
    (-> this (.listLocalDisksAsync list-local-disks-request))))

(defn update-maintenance-start-time-async
  "Updates a gateway's weekly maintenance start time information, including day and time of the week. The
   maintenance time is the time in your gateway's time zone.

  update-maintenance-start-time-request - A JSON object containing the following fields: UpdateMaintenanceStartTimeInput$DayOfMonth UpdateMaintenanceStartTimeInput$DayOfWeek UpdateMaintenanceStartTimeInput$HourOfDay UpdateMaintenanceStartTimeInput$MinuteOfHour - `com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMaintenanceStartTime operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest update-maintenance-start-time-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMaintenanceStartTimeAsync update-maintenance-start-time-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest update-maintenance-start-time-request]
    (-> this (.updateMaintenanceStartTimeAsync update-maintenance-start-time-request))))

(defn refresh-cache-async
  "Refreshes the cache for the specified file share. This operation finds objects in the Amazon S3 bucket that were
   added, removed or replaced since the gateway last listed the bucket's contents and cached the results. This
   operation is only supported in the file gateway type. You can subscribe to be notified through an Amazon
   CloudWatch event when your RefreshCache operation completes. For more information, see Getting Notified About File Operations.


   When this API is called, it only initiates the refresh operation. When the API call completes and returns a
   success code, it doesn't necessarily mean that the file refresh has completed. You should use the
   refresh-complete notification to determine that the operation has completed before you check for new files on the
   gateway file share. You can subscribe to be notified through an CloudWatch event when your
   RefreshCache operation completes.

  refresh-cache-request - RefreshCacheInput - `com.amazonaws.services.storagegateway.model.RefreshCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RefreshCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.RefreshCacheResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.RefreshCacheRequest refresh-cache-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.refreshCacheAsync refresh-cache-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.RefreshCacheRequest refresh-cache-request]
    (-> this (.refreshCacheAsync refresh-cache-request))))

(defn describe-chap-credentials-async
  "Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified
   iSCSI target, one for each target-initiator pair.

  describe-chap-credentials-request - A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target. - `com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChapCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest describe-chap-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChapCredentialsAsync describe-chap-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest describe-chap-credentials-request]
    (-> this (.describeChapCredentialsAsync describe-chap-credentials-request))))

(defn attach-volume-async
  "Connects a volume to an iSCSI connection and then attaches the volume to the specified gateway. Detaching and
   attaching a volume enables you to recover your data from one gateway to a different gateway without creating a
   snapshot. It also makes it easier to move your volumes from an on-premises gateway to a gateway hosted on an
   Amazon EC2 instance.

  attach-volume-request - AttachVolumeInput - `com.amazonaws.services.storagegateway.model.AttachVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AttachVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AttachVolumeRequest attach-volume-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachVolumeAsync attach-volume-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AttachVolumeRequest attach-volume-request]
    (-> this (.attachVolumeAsync attach-volume-request))))

(defn set-smb-guest-password-async
  "Sets the password for the guest user smbguest. The smbguest user is the user when the
   authentication method for the file share is set to GuestAccess.

  set-smb-guest-password-request - SetSMBGuestPasswordInput - `com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSMBGuestPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest set-smb-guest-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSMBGuestPasswordAsync set-smb-guest-password-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest set-smb-guest-password-request]
    (-> this (.setSMBGuestPasswordAsync set-smb-guest-password-request))))

(defn update-bandwidth-rate-limit-async
  "Updates the bandwidth rate limits of a gateway. You can update both the upload and download bandwidth rate limit
   or specify only one of the two. If you don't set a bandwidth rate limit, the existing rate limit remains.


   By default, a gateway's bandwidth rate limits are not set. If you don't set any limit, the gateway does not have
   any limitations on its bandwidth usage and could potentially use the maximum available bandwidth.


   To specify which gateway to update, use the Amazon Resource Name (ARN) of the gateway in your request.

  update-bandwidth-rate-limit-request - A JSON object containing one or more of the following fields: UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec - `com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBandwidthRateLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest update-bandwidth-rate-limit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBandwidthRateLimitAsync update-bandwidth-rate-limit-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest update-bandwidth-rate-limit-request]
    (-> this (.updateBandwidthRateLimitAsync update-bandwidth-rate-limit-request))))

(defn delete-tape-archive-async
  "Deletes the specified virtual tape from the virtual tape shelf (VTS). This operation is only supported in the
   tape gateway type.

  delete-tape-archive-request - DeleteTapeArchiveInput - `com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTapeArchive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest delete-tape-archive-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTapeArchiveAsync delete-tape-archive-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest delete-tape-archive-request]
    (-> this (.deleteTapeArchiveAsync delete-tape-archive-request))))

(defn add-working-storage-async
  "Configures one or more gateway local disks as working storage for a gateway. This operation is only supported in
   the stored volume gateway type. This operation is deprecated in cached volume API version 20120630. Use
   AddUploadBuffer instead.



   Working storage is also referred to as upload buffer. You can also use the AddUploadBuffer operation to
   add upload buffer to a stored volume gateway.



   In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and
   one or more disk IDs that you want to configure as working storage.

  add-working-storage-request - A JSON object containing one or more of the following fields: AddWorkingStorageInput$DiskIds - `com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddWorkingStorage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AddWorkingStorageResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest add-working-storage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addWorkingStorageAsync add-working-storage-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest add-working-storage-request]
    (-> this (.addWorkingStorageAsync add-working-storage-request))))

(defn cancel-retrieval-async
  "Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is
   initiated. The virtual tape is returned to the VTS. This operation is only supported in the tape gateway type.

  cancel-retrieval-request - CancelRetrievalInput - `com.amazonaws.services.storagegateway.model.CancelRetrievalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelRetrieval operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CancelRetrievalResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CancelRetrievalRequest cancel-retrieval-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelRetrievalAsync cancel-retrieval-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CancelRetrievalRequest cancel-retrieval-request]
    (-> this (.cancelRetrievalAsync cancel-retrieval-request))))

(defn describe-tape-recovery-points-async
  "Returns a list of virtual tape recovery points that are available for the specified tape gateway.


   A recovery point is a point-in-time view of a virtual tape at which all the data on the virtual tape is
   consistent. If your gateway crashes, virtual tapes that have recovery points can be recovered to a new gateway.
   This operation is only supported in the tape gateway type.

  describe-tape-recovery-points-request - DescribeTapeRecoveryPointsInput - `com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTapeRecoveryPoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest describe-tape-recovery-points-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTapeRecoveryPointsAsync describe-tape-recovery-points-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest describe-tape-recovery-points-request]
    (-> this (.describeTapeRecoveryPointsAsync describe-tape-recovery-points-request))))

(defn delete-snapshot-schedule-async
  "Deletes a snapshot of a volume.


   You can take snapshots of your gateway volumes on a scheduled or ad hoc basis. This API action enables you to
   delete a snapshot schedule for a volume. For more information, see Working with
   Snapshots. In the DeleteSnapshotSchedule request, you identify the volume by providing its
   Amazon Resource Name (ARN). This operation is only supported in stored and cached volume gateway types.



   To list or delete a snapshot, you must use the Amazon EC2 API. in Amazon Elastic Compute Cloud API
   Reference.

  delete-snapshot-schedule-request - `com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest delete-snapshot-schedule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotScheduleAsync delete-snapshot-schedule-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest delete-snapshot-schedule-request]
    (-> this (.deleteSnapshotScheduleAsync delete-snapshot-schedule-request))))

(defn add-upload-buffer-async
  "Configures one or more gateway local disks as upload buffer for a specified gateway. This operation is supported
   for the stored volume, cached volume and tape gateway types.


   In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add upload buffer, and
   one or more disk IDs that you want to configure as upload buffer.

  add-upload-buffer-request - `com.amazonaws.services.storagegateway.model.AddUploadBufferRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddUploadBuffer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AddUploadBufferResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AddUploadBufferRequest add-upload-buffer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addUploadBufferAsync add-upload-buffer-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AddUploadBufferRequest add-upload-buffer-request]
    (-> this (.addUploadBufferAsync add-upload-buffer-request))))

(defn add-tags-to-resource-async
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

  add-tags-to-resource-request - AddTagsToResourceInput - `com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest add-tags-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request))))

(defn cancel-archival-async
  "Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated.
   This operation is only supported in the tape gateway type.

  cancel-archival-request - CancelArchivalInput - `com.amazonaws.services.storagegateway.model.CancelArchivalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelArchival operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CancelArchivalResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CancelArchivalRequest cancel-archival-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelArchivalAsync cancel-archival-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.CancelArchivalRequest cancel-archival-request]
    (-> this (.cancelArchivalAsync cancel-archival-request))))

(defn describe-cachedi-scsi-volumes-async
  "Returns a description of the gateway volumes specified in the request. This operation is only supported in the
   cached volume gateway types.


   The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway
   returns volume information sorted by volume Amazon Resource Name (ARN).

  describe-cachedi-scsi-volumes-request - `com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCachediSCSIVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest describe-cachedi-scsi-volumes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCachediSCSIVolumesAsync describe-cachedi-scsi-volumes-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest describe-cachedi-scsi-volumes-request]
    (-> this (.describeCachediSCSIVolumesAsync describe-cachedi-scsi-volumes-request))))

(defn delete-gateway-async
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

  delete-gateway-request - A JSON object containing the ID of the gateway to delete. - `com.amazonaws.services.storagegateway.model.DeleteGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteGatewayRequest delete-gateway-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGatewayAsync delete-gateway-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DeleteGatewayRequest delete-gateway-request]
    (-> this (.deleteGatewayAsync delete-gateway-request))))

(defn describe-maintenance-start-time-async
  "Returns your gateway's weekly maintenance start time including the day and time of the week. Note that values are
   in terms of the gateway's time zone.

  describe-maintenance-start-time-request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceStartTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest describe-maintenance-start-time-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceStartTimeAsync describe-maintenance-start-time-request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsync this ^com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest describe-maintenance-start-time-request]
    (-> this (.describeMaintenanceStartTimeAsync describe-maintenance-start-time-request))))

