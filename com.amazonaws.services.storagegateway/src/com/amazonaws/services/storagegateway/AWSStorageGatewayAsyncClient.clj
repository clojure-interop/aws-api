(ns com.amazonaws.services.storagegateway.AWSStorageGatewayAsyncClient
  "Client for accessing AWS Storage Gateway asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

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
  (:import [com.amazonaws.services.storagegateway AWSStorageGatewayAsyncClient]))

(defn ->aws-storage-gateway-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSStorageGatewayAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSStorageGatewayAsyncClient aws-credentials client-configuration executor-service))
  (^AWSStorageGatewayAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSStorageGatewayAsyncClient aws-credentials executor-service))
  (^AWSStorageGatewayAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSStorageGatewayAsyncClient client-configuration))
  (^AWSStorageGatewayAsyncClient []
    (new AWSStorageGatewayAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.storagegateway.AWSStorageGatewayAsyncClientBuilder`"
  (^com.amazonaws.services.storagegateway.AWSStorageGatewayAsyncClientBuilder []
    (AWSStorageGatewayAsyncClient/asyncBuilder )))

(defn create-tapes-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - CreateTapesInput - `com.amazonaws.services.storagegateway.model.CreateTapesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTapes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateTapesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateTapesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTapesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateTapesRequest request]
    (-> this (.createTapesAsync request))))

(defn update-vtl-device-type-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVTLDeviceType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVTLDeviceTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest request]
    (-> this (.updateVTLDeviceTypeAsync request))))

(defn describe-cache-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.DescribeCacheRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeCacheResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeCacheRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCacheAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeCacheRequest request]
    (-> this (.describeCacheAsync request))))

(defn activate-gateway-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing one or more of the following fields: ActivateGatewayInput$ActivationKey ActivateGatewayInput$GatewayName ActivateGatewayInput$GatewayRegion ActivateGatewayInput$GatewayTimezone ActivateGatewayInput$GatewayType ActivateGatewayInput$TapeDriveType ActivateGatewayInput$MediumChangerType - `com.amazonaws.services.storagegateway.model.ActivateGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ActivateGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ActivateGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ActivateGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.activateGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ActivateGatewayRequest request]
    (-> this (.activateGatewayAsync request))))

(defn disable-gateway-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DisableGatewayInput - `com.amazonaws.services.storagegateway.model.DisableGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DisableGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DisableGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DisableGatewayRequest request]
    (-> this (.disableGatewayAsync request))))

(defn start-gateway-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the of the gateway to start. - `com.amazonaws.services.storagegateway.model.StartGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.StartGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.StartGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.StartGatewayRequest request]
    (-> this (.startGatewayAsync request))))

(defn describe-snapshot-schedule-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the DescribeSnapshotScheduleInput$VolumeARN of the volume. - `com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest request]
    (-> this (.describeSnapshotScheduleAsync request))))

(defn retrieve-tape-archive-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - RetrieveTapeArchiveInput - `com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetrieveTapeArchive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retrieveTapeArchiveAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest request]
    (-> this (.retrieveTapeArchiveAsync request))))

(defn assign-tape-pool-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.AssignTapePoolRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignTapePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AssignTapePoolResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AssignTapePoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignTapePoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AssignTapePoolRequest request]
    (-> this (.assignTapePoolAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSStorageGatewayAsyncClient this]
    (-> this (.getExecutorService))))

(defn set-local-console-password-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - SetLocalConsolePasswordInput - `com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLocalConsolePassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLocalConsolePasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest request]
    (-> this (.setLocalConsolePasswordAsync request))))

(defn retrieve-tape-recovery-point-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - RetrieveTapeRecoveryPointInput - `com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetrieveTapeRecoveryPoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retrieveTapeRecoveryPointAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest request]
    (-> this (.retrieveTapeRecoveryPointAsync request))))

(defn create-storedi-scsi-volume-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing one or more of the following fields: CreateStorediSCSIVolumeInput$DiskId CreateStorediSCSIVolumeInput$NetworkInterfaceId CreateStorediSCSIVolumeInput$PreserveExistingData CreateStorediSCSIVolumeInput$SnapshotId CreateStorediSCSIVolumeInput$TargetName - `com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStorediSCSIVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStorediSCSIVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest request]
    (-> this (.createStorediSCSIVolumeAsync request))))

(defn add-cache-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.AddCacheRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AddCacheResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AddCacheRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addCacheAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AddCacheRequest request]
    (-> this (.addCacheAsync request))))

(defn reset-cache-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.ResetCacheRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ResetCacheResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ResetCacheRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetCacheAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ResetCacheRequest request]
    (-> this (.resetCacheAsync request))))

(defn join-domain-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - JoinDomainInput - `com.amazonaws.services.storagegateway.model.JoinDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the JoinDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.JoinDomainResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.JoinDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.joinDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.JoinDomainRequest request]
    (-> this (.joinDomainAsync request))))

(defn create-cachedi-scsi-volume-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCachediSCSIVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCachediSCSIVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest request]
    (-> this (.createCachediSCSIVolumeAsync request))))

(defn create-snapshot-from-volume-recovery-point-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshotFromVolumeRecoveryPoint operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotFromVolumeRecoveryPointAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest request]
    (-> this (.createSnapshotFromVolumeRecoveryPointAsync request))))

(defn describe-smb-file-shares-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DescribeSMBFileSharesInput - `com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSMBFileShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSMBFileSharesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest request]
    (-> this (.describeSMBFileSharesAsync request))))

(defn describe-working-storage-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkingStorage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkingStorageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest request]
    (-> this (.describeWorkingStorageAsync request))))

(defn update-chap-credentials-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing one or more of the following fields: UpdateChapCredentialsInput$InitiatorName UpdateChapCredentialsInput$SecretToAuthenticateInitiator UpdateChapCredentialsInput$SecretToAuthenticateTarget UpdateChapCredentialsInput$TargetARN - `com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChapCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChapCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest request]
    (-> this (.updateChapCredentialsAsync request))))

(defn delete-file-share-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DeleteFileShareInput - `com.amazonaws.services.storagegateway.model.DeleteFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteFileShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFileShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteFileShareRequest request]
    (-> this (.deleteFileShareAsync request))))

(defn delete-volume-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the DeleteVolumeInput$VolumeARN to delete. - `com.amazonaws.services.storagegateway.model.DeleteVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteVolumeRequest request]
    (-> this (.deleteVolumeAsync request))))

(defn create-smb-file-share-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - CreateSMBFileShareInput - `com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSMBFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateSMBFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSMBFileShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest request]
    (-> this (.createSMBFileShareAsync request))))

(defn update-snapshot-schedule-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing one or more of the following fields: UpdateSnapshotScheduleInput$Description UpdateSnapshotScheduleInput$RecurrenceInHours UpdateSnapshotScheduleInput$StartAt UpdateSnapshotScheduleInput$VolumeARN - `com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSnapshotScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest request]
    (-> this (.updateSnapshotScheduleAsync request))))

(defn describe-vtl-devices-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DescribeVTLDevicesInput - `com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVTLDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVTLDevicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest request]
    (-> this (.describeVTLDevicesAsync request))))

(defn create-tape-with-barcode-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - CreateTapeWithBarcodeInput - `com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTapeWithBarcode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTapeWithBarcodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest request]
    (-> this (.createTapeWithBarcodeAsync request))))

(defn create-snapshot-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing one or more of the following fields: CreateSnapshotInput$SnapshotDescription CreateSnapshotInput$VolumeARN - `com.amazonaws.services.storagegateway.model.CreateSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateSnapshotResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateSnapshotRequest request]
    (-> this (.createSnapshotAsync request))))

(defn update-gateway-software-now-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the of the gateway to update. - `com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGatewaySoftwareNow operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewaySoftwareNowAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest request]
    (-> this (.updateGatewaySoftwareNowAsync request))))

(defn shutdown-gateway-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the of the gateway to shut down. - `com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ShutdownGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ShutdownGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.shutdownGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest request]
    (-> this (.shutdownGatewayAsync request))))

(defn list-volume-recovery-points-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVolumeRecoveryPoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVolumeRecoveryPointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest request]
    (-> this (.listVolumeRecoveryPointsAsync request))))

(defn list-volumes-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object that contains one or more of the following fields: ListVolumesInput$Limit ListVolumesInput$Marker - `com.amazonaws.services.storagegateway.model.ListVolumesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListVolumesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListVolumesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVolumesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListVolumesRequest request]
    (-> this (.listVolumesAsync request))))

(defn list-gateways-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing zero or more of the following fields: ListGatewaysInput$Limit ListGatewaysInput$Marker - `com.amazonaws.services.storagegateway.model.ListGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListGatewaysResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListGatewaysRequest request]
    (-> this (.listGatewaysAsync request)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this]
    (-> this (.listGatewaysAsync))))

(defn describe-tape-archives-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DescribeTapeArchivesInput - `com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTapeArchives operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTapeArchivesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest request]
    (-> this (.describeTapeArchivesAsync request)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this]
    (-> this (.describeTapeArchivesAsync))))

(defn detach-volume-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - AttachVolumeInput - `com.amazonaws.services.storagegateway.model.DetachVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DetachVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DetachVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DetachVolumeRequest request]
    (-> this (.detachVolumeAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSStorageGatewayAsyncClient this]
    (-> this (.shutdown))))

(defn delete-bandwidth-rate-limit-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the following fields: DeleteBandwidthRateLimitInput$BandwidthType - `com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBandwidthRateLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBandwidthRateLimitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest request]
    (-> this (.deleteBandwidthRateLimitAsync request))))

(defn describe-tapes-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DescribeTapesInput - `com.amazonaws.services.storagegateway.model.DescribeTapesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTapes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeTapesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeTapesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTapesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeTapesRequest request]
    (-> this (.describeTapesAsync request))))

(defn describe-bandwidth-rate-limit-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBandwidthRateLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBandwidthRateLimitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest request]
    (-> this (.describeBandwidthRateLimitAsync request))))

(defn describe-gateway-information-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the ID of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGatewayInformation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGatewayInformationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest request]
    (-> this (.describeGatewayInformationAsync request))))

(defn update-smb-file-share-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - UpdateSMBFileShareInput - `com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSMBFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateSMBFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSMBFileShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest request]
    (-> this (.updateSMBFileShareAsync request))))

(defn update-gateway-information-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGatewayInformation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGatewayInformationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest request]
    (-> this (.updateGatewayInformationAsync request))))

(defn notify-when-uploaded-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the NotifyWhenUploaded operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.notifyWhenUploadedAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest request]
    (-> this (.notifyWhenUploadedAsync request))))

(defn list-volume-initiators-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - ListVolumeInitiatorsInput - `com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVolumeInitiators operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVolumeInitiatorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest request]
    (-> this (.listVolumeInitiatorsAsync request))))

(defn update-nfs-file-share-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - UpdateNFSFileShareInput - `com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNFSFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNFSFileShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest request]
    (-> this (.updateNFSFileShareAsync request))))

(defn describe-nfs-file-shares-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DescribeNFSFileSharesInput - `com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNFSFileShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNFSFileSharesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest request]
    (-> this (.describeNFSFileSharesAsync request))))

(defn describe-upload-buffer-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUploadBuffer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUploadBufferAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest request]
    (-> this (.describeUploadBufferAsync request))))

(defn list-file-shares-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - ListFileShareInput - `com.amazonaws.services.storagegateway.model.ListFileSharesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFileShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListFileSharesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListFileSharesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFileSharesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListFileSharesRequest request]
    (-> this (.listFileSharesAsync request))))

(defn remove-tags-from-resource-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - RemoveTagsFromResourceInput - `com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResourceAsync request)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this]
    (-> this (.removeTagsFromResourceAsync))))

(defn create-nfs-file-share-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - CreateNFSFileShareInput - `com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNFSFileShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNFSFileShareAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest request]
    (-> this (.createNFSFileShareAsync request))))

(defn describe-storedi-scsi-volumes-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing a list of DescribeStorediSCSIVolumesInput$VolumeARNs. - `com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStorediSCSIVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStorediSCSIVolumesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest request]
    (-> this (.describeStorediSCSIVolumesAsync request))))

(defn delete-chap-credentials-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing one or more of the following fields: DeleteChapCredentialsInput$InitiatorName DeleteChapCredentialsInput$TargetARN - `com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChapCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChapCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest request]
    (-> this (.deleteChapCredentialsAsync request))))

(defn delete-tape-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DeleteTapeInput - `com.amazonaws.services.storagegateway.model.DeleteTapeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTape operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteTapeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteTapeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTapeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteTapeRequest request]
    (-> this (.deleteTapeAsync request))))

(defn list-tapes-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object that contains one or more of the following fields: ListTapesInput$Limit ListTapesInput$Marker ListTapesInput$TapeARNs - `com.amazonaws.services.storagegateway.model.ListTapesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTapes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListTapesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListTapesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTapesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListTapesRequest request]
    (-> this (.listTapesAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - ListTagsForResourceInput - `com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this]
    (-> this (.listTagsForResourceAsync))))

(defn update-smb-security-strategy-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSMBSecurityStrategy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSMBSecurityStrategyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest request]
    (-> this (.updateSMBSecurityStrategyAsync request))))

(defn describe-smb-settings-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSMBSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeSMBSettingsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSMBSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest request]
    (-> this (.describeSMBSettingsAsync request))))

(defn list-local-disks-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.ListLocalDisksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLocalDisks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.ListLocalDisksResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListLocalDisksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLocalDisksAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.ListLocalDisksRequest request]
    (-> this (.listLocalDisksAsync request))))

(defn update-maintenance-start-time-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the following fields: UpdateMaintenanceStartTimeInput$DayOfMonth UpdateMaintenanceStartTimeInput$DayOfWeek UpdateMaintenanceStartTimeInput$HourOfDay UpdateMaintenanceStartTimeInput$MinuteOfHour - `com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMaintenanceStartTime operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMaintenanceStartTimeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest request]
    (-> this (.updateMaintenanceStartTimeAsync request))))

(defn refresh-cache-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - RefreshCacheInput - `com.amazonaws.services.storagegateway.model.RefreshCacheRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RefreshCache operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.RefreshCacheResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.RefreshCacheRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.refreshCacheAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.RefreshCacheRequest request]
    (-> this (.refreshCacheAsync request))))

(defn describe-chap-credentials-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target. - `com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChapCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChapCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest request]
    (-> this (.describeChapCredentialsAsync request))))

(defn attach-volume-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - AttachVolumeInput - `com.amazonaws.services.storagegateway.model.AttachVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AttachVolumeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AttachVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AttachVolumeRequest request]
    (-> this (.attachVolumeAsync request))))

(defn set-smb-guest-password-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - SetSMBGuestPasswordInput - `com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSMBGuestPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSMBGuestPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest request]
    (-> this (.setSMBGuestPasswordAsync request))))

(defn update-bandwidth-rate-limit-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing one or more of the following fields: UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec - `com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBandwidthRateLimit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBandwidthRateLimitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest request]
    (-> this (.updateBandwidthRateLimitAsync request))))

(defn delete-tape-archive-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DeleteTapeArchiveInput - `com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTapeArchive operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTapeArchiveAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest request]
    (-> this (.deleteTapeArchiveAsync request))))

(defn add-working-storage-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing one or more of the following fields: AddWorkingStorageInput$DiskIds - `com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddWorkingStorage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AddWorkingStorageResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addWorkingStorageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest request]
    (-> this (.addWorkingStorageAsync request))))

(defn cancel-retrieval-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - CancelRetrievalInput - `com.amazonaws.services.storagegateway.model.CancelRetrievalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelRetrieval operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CancelRetrievalResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CancelRetrievalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelRetrievalAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CancelRetrievalRequest request]
    (-> this (.cancelRetrievalAsync request))))

(defn describe-tape-recovery-points-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - DescribeTapeRecoveryPointsInput - `com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTapeRecoveryPoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTapeRecoveryPointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest request]
    (-> this (.describeTapeRecoveryPointsAsync request))))

(defn delete-snapshot-schedule-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshotSchedule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotScheduleAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest request]
    (-> this (.deleteSnapshotScheduleAsync request))))

(defn add-upload-buffer-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.AddUploadBufferRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddUploadBuffer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AddUploadBufferResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AddUploadBufferRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addUploadBufferAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AddUploadBufferRequest request]
    (-> this (.addUploadBufferAsync request))))

(defn add-tags-to-resource-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - AddTagsToResourceInput - `com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResourceAsync request))))

(defn cancel-archival-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - CancelArchivalInput - `com.amazonaws.services.storagegateway.model.CancelArchivalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelArchival operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.CancelArchivalResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CancelArchivalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelArchivalAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.CancelArchivalRequest request]
    (-> this (.cancelArchivalAsync request))))

(defn describe-cachedi-scsi-volumes-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - `com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCachediSCSIVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCachediSCSIVolumesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest request]
    (-> this (.describeCachediSCSIVolumesAsync request))))

(defn delete-gateway-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the ID of the gateway to delete. - `com.amazonaws.services.storagegateway.model.DeleteGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DeleteGatewayResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DeleteGatewayRequest request]
    (-> this (.deleteGatewayAsync request))))

(defn describe-maintenance-start-time-async
  "Description copied from interface: AWSStorageGatewayAsync

  request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMaintenanceStartTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult>`"
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMaintenanceStartTimeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSStorageGatewayAsyncClient this ^com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest request]
    (-> this (.describeMaintenanceStartTimeAsync request))))

