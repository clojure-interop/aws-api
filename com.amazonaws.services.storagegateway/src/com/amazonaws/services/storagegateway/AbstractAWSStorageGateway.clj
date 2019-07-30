(ns com.amazonaws.services.storagegateway.AbstractAWSStorageGateway
  "Abstract implementation of AWSStorageGateway. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.storagegateway AbstractAWSStorageGateway]))

(defn join-domain
  "Description copied from interface: AWSStorageGateway

  request - JoinDomainInput - `com.amazonaws.services.storagegateway.model.JoinDomainRequest`

  returns: Result of the JoinDomain operation returned by the service. - `com.amazonaws.services.storagegateway.model.JoinDomainResult`"
  (^com.amazonaws.services.storagegateway.model.JoinDomainResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.JoinDomainRequest request]
    (-> this (.joinDomain request))))

(defn create-cachedi-scsi-volume
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest`

  returns: Result of the CreateCachediSCSIVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult`"
  (^com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest request]
    (-> this (.createCachediSCSIVolume request))))

(defn add-cache
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.AddCacheRequest`

  returns: Result of the AddCache operation returned by the service. - `com.amazonaws.services.storagegateway.model.AddCacheResult`"
  (^com.amazonaws.services.storagegateway.model.AddCacheResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.AddCacheRequest request]
    (-> this (.addCache request))))

(defn describe-nfs-file-shares
  "Description copied from interface: AWSStorageGateway

  request - DescribeNFSFileSharesInput - `com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest`

  returns: Result of the DescribeNFSFileShares operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeNFSFileSharesRequest request]
    (-> this (.describeNFSFileShares request))))

(defn describe-maintenance-start-time
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest`

  returns: Result of the DescribeMaintenanceStartTime operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeMaintenanceStartTimeRequest request]
    (-> this (.describeMaintenanceStartTime request))))

(defn describe-cache
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.DescribeCacheRequest`

  returns: Result of the DescribeCache operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeCacheResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeCacheResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeCacheRequest request]
    (-> this (.describeCache request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSStorageGateway

  request - ListTagsForResourceInput - `com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.storagegateway.model.ListTagsForResourceResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request)))
  (^com.amazonaws.services.storagegateway.model.ListTagsForResourceResult [^AbstractAWSStorageGateway this]
    (-> this (.listTagsForResource))))

(defn assign-tape-pool
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.AssignTapePoolRequest`

  returns: Result of the AssignTapePool operation returned by the service. - `com.amazonaws.services.storagegateway.model.AssignTapePoolResult`"
  (^com.amazonaws.services.storagegateway.model.AssignTapePoolResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.AssignTapePoolRequest request]
    (-> this (.assignTapePool request))))

(defn set-region
  "Description copied from interface: AWSStorageGateway

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSStorageGateway this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn shutdown-gateway
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the of the gateway to shut down. - `com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest`

  returns: Result of the ShutdownGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.ShutdownGatewayResult`"
  (^com.amazonaws.services.storagegateway.model.ShutdownGatewayResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ShutdownGatewayRequest request]
    (-> this (.shutdownGateway request))))

(defn describe-tape-recovery-points
  "Description copied from interface: AWSStorageGateway

  request - DescribeTapeRecoveryPointsInput - `com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest`

  returns: Result of the DescribeTapeRecoveryPoints operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeTapeRecoveryPointsRequest request]
    (-> this (.describeTapeRecoveryPoints request))))

(defn update-smb-file-share
  "Description copied from interface: AWSStorageGateway

  request - UpdateSMBFileShareInput - `com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest`

  returns: Result of the UpdateSMBFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateSMBFileShareResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateSMBFileShareResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateSMBFileShareRequest request]
    (-> this (.updateSMBFileShare request))))

(defn list-local-disks
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.ListLocalDisksRequest`

  returns: Result of the ListLocalDisks operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListLocalDisksResult`"
  (^com.amazonaws.services.storagegateway.model.ListLocalDisksResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ListLocalDisksRequest request]
    (-> this (.listLocalDisks request))))

(defn update-smb-security-strategy
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest`

  returns: Result of the UpdateSMBSecurityStrategy operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateSMBSecurityStrategyRequest request]
    (-> this (.updateSMBSecurityStrategy request))))

(defn describe-chap-credentials
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target. - `com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest`

  returns: Result of the DescribeChapCredentials operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeChapCredentialsResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeChapCredentialsRequest request]
    (-> this (.describeChapCredentials request))))

(defn describe-smb-file-shares
  "Description copied from interface: AWSStorageGateway

  request - DescribeSMBFileSharesInput - `com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest`

  returns: Result of the DescribeSMBFileShares operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeSMBFileSharesRequest request]
    (-> this (.describeSMBFileShares request))))

(defn delete-volume
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the DeleteVolumeInput$VolumeARN to delete. - `com.amazonaws.services.storagegateway.model.DeleteVolumeRequest`

  returns: Result of the DeleteVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteVolumeResult`"
  (^com.amazonaws.services.storagegateway.model.DeleteVolumeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DeleteVolumeRequest request]
    (-> this (.deleteVolume request))))

(defn delete-chap-credentials
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing one or more of the following fields: DeleteChapCredentialsInput$InitiatorName DeleteChapCredentialsInput$TargetARN - `com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest`

  returns: Result of the DeleteChapCredentials operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult`"
  (^com.amazonaws.services.storagegateway.model.DeleteChapCredentialsResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DeleteChapCredentialsRequest request]
    (-> this (.deleteChapCredentials request))))

(defn delete-tape
  "Description copied from interface: AWSStorageGateway

  request - DeleteTapeInput - `com.amazonaws.services.storagegateway.model.DeleteTapeRequest`

  returns: Result of the DeleteTape operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteTapeResult`"
  (^com.amazonaws.services.storagegateway.model.DeleteTapeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DeleteTapeRequest request]
    (-> this (.deleteTape request))))

(defn create-tape-with-barcode
  "Description copied from interface: AWSStorageGateway

  request - CreateTapeWithBarcodeInput - `com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest`

  returns: Result of the CreateTapeWithBarcode operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult`"
  (^com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CreateTapeWithBarcodeRequest request]
    (-> this (.createTapeWithBarcode request))))

(defn delete-snapshot-schedule
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest`

  returns: Result of the DeleteSnapshotSchedule operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult`"
  (^com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DeleteSnapshotScheduleRequest request]
    (-> this (.deleteSnapshotSchedule request))))

(defn attach-volume
  "Description copied from interface: AWSStorageGateway

  request - AttachVolumeInput - `com.amazonaws.services.storagegateway.model.AttachVolumeRequest`

  returns: Result of the AttachVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.AttachVolumeResult`"
  (^com.amazonaws.services.storagegateway.model.AttachVolumeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.AttachVolumeRequest request]
    (-> this (.attachVolume request))))

(defn describe-working-storage
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest`

  returns: Result of the DescribeWorkingStorage operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeWorkingStorageResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeWorkingStorageRequest request]
    (-> this (.describeWorkingStorage request))))

(defn describe-vtl-devices
  "Description copied from interface: AWSStorageGateway

  request - DescribeVTLDevicesInput - `com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest`

  returns: Result of the DescribeVTLDevices operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeVTLDevicesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeVTLDevicesRequest request]
    (-> this (.describeVTLDevices request))))

(defn cancel-archival
  "Description copied from interface: AWSStorageGateway

  request - CancelArchivalInput - `com.amazonaws.services.storagegateway.model.CancelArchivalRequest`

  returns: Result of the CancelArchival operation returned by the service. - `com.amazonaws.services.storagegateway.model.CancelArchivalResult`"
  (^com.amazonaws.services.storagegateway.model.CancelArchivalResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CancelArchivalRequest request]
    (-> this (.cancelArchival request))))

(defn update-maintenance-start-time
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the following fields: UpdateMaintenanceStartTimeInput$DayOfMonth UpdateMaintenanceStartTimeInput$DayOfWeek UpdateMaintenanceStartTimeInput$HourOfDay UpdateMaintenanceStartTimeInput$MinuteOfHour - `com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest`

  returns: Result of the UpdateMaintenanceStartTime operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateMaintenanceStartTimeRequest request]
    (-> this (.updateMaintenanceStartTime request))))

(defn delete-file-share
  "Description copied from interface: AWSStorageGateway

  request - DeleteFileShareInput - `com.amazonaws.services.storagegateway.model.DeleteFileShareRequest`

  returns: Result of the DeleteFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteFileShareResult`"
  (^com.amazonaws.services.storagegateway.model.DeleteFileShareResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DeleteFileShareRequest request]
    (-> this (.deleteFileShare request))))

(defn update-snapshot-schedule
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing one or more of the following fields: UpdateSnapshotScheduleInput$Description UpdateSnapshotScheduleInput$RecurrenceInHours UpdateSnapshotScheduleInput$StartAt UpdateSnapshotScheduleInput$VolumeARN - `com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest`

  returns: Result of the UpdateSnapshotSchedule operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateSnapshotScheduleRequest request]
    (-> this (.updateSnapshotSchedule request))))

(defn activate-gateway
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing one or more of the following fields: ActivateGatewayInput$ActivationKey ActivateGatewayInput$GatewayName ActivateGatewayInput$GatewayRegion ActivateGatewayInput$GatewayTimezone ActivateGatewayInput$GatewayType ActivateGatewayInput$TapeDriveType ActivateGatewayInput$MediumChangerType - `com.amazonaws.services.storagegateway.model.ActivateGatewayRequest`

  returns: Result of the ActivateGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.ActivateGatewayResult`"
  (^com.amazonaws.services.storagegateway.model.ActivateGatewayResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ActivateGatewayRequest request]
    (-> this (.activateGateway request))))

(defn list-volume-recovery-points
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest`

  returns: Result of the ListVolumeRecoveryPoints operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult`"
  (^com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ListVolumeRecoveryPointsRequest request]
    (-> this (.listVolumeRecoveryPoints request))))

(defn list-tapes
  "Description copied from interface: AWSStorageGateway

  request - A JSON object that contains one or more of the following fields: ListTapesInput$Limit ListTapesInput$Marker ListTapesInput$TapeARNs - `com.amazonaws.services.storagegateway.model.ListTapesRequest`

  returns: Result of the ListTapes operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListTapesResult`"
  (^com.amazonaws.services.storagegateway.model.ListTapesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ListTapesRequest request]
    (-> this (.listTapes request))))

(defn describe-upload-buffer
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest`

  returns: Result of the DescribeUploadBuffer operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeUploadBufferResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeUploadBufferRequest request]
    (-> this (.describeUploadBuffer request))))

(defn shutdown
  "Description copied from interface: AWSStorageGateway"
  ([^AbstractAWSStorageGateway this]
    (-> this (.shutdown))))

(defn start-gateway
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the of the gateway to start. - `com.amazonaws.services.storagegateway.model.StartGatewayRequest`

  returns: Result of the StartGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.StartGatewayResult`"
  (^com.amazonaws.services.storagegateway.model.StartGatewayResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.StartGatewayRequest request]
    (-> this (.startGateway request))))

(defn set-local-console-password
  "Description copied from interface: AWSStorageGateway

  request - SetLocalConsolePasswordInput - `com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest`

  returns: Result of the SetLocalConsolePassword operation returned by the service. - `com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult`"
  (^com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.SetLocalConsolePasswordRequest request]
    (-> this (.setLocalConsolePassword request))))

(defn disable-gateway
  "Description copied from interface: AWSStorageGateway

  request - DisableGatewayInput - `com.amazonaws.services.storagegateway.model.DisableGatewayRequest`

  returns: Result of the DisableGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.DisableGatewayResult`"
  (^com.amazonaws.services.storagegateway.model.DisableGatewayResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DisableGatewayRequest request]
    (-> this (.disableGateway request))))

(defn retrieve-tape-archive
  "Description copied from interface: AWSStorageGateway

  request - RetrieveTapeArchiveInput - `com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest`

  returns: Result of the RetrieveTapeArchive operation returned by the service. - `com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult`"
  (^com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.RetrieveTapeArchiveRequest request]
    (-> this (.retrieveTapeArchive request))))

(defn detach-volume
  "Description copied from interface: AWSStorageGateway

  request - AttachVolumeInput - `com.amazonaws.services.storagegateway.model.DetachVolumeRequest`

  returns: Result of the DetachVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.DetachVolumeResult`"
  (^com.amazonaws.services.storagegateway.model.DetachVolumeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DetachVolumeRequest request]
    (-> this (.detachVolume request))))

(defn list-gateways
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing zero or more of the following fields: ListGatewaysInput$Limit ListGatewaysInput$Marker - `com.amazonaws.services.storagegateway.model.ListGatewaysRequest`

  returns: Result of the ListGateways operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListGatewaysResult`"
  (^com.amazonaws.services.storagegateway.model.ListGatewaysResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ListGatewaysRequest request]
    (-> this (.listGateways request)))
  (^com.amazonaws.services.storagegateway.model.ListGatewaysResult [^AbstractAWSStorageGateway this]
    (-> this (.listGateways))))

(defn create-tapes
  "Description copied from interface: AWSStorageGateway

  request - CreateTapesInput - `com.amazonaws.services.storagegateway.model.CreateTapesRequest`

  returns: Result of the CreateTapes operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateTapesResult`"
  (^com.amazonaws.services.storagegateway.model.CreateTapesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CreateTapesRequest request]
    (-> this (.createTapes request))))

(defn set-endpoint
  "Description copied from interface: AWSStorageGateway

  endpoint - The endpoint (ex: \"storagegateway.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://storagegateway.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSStorageGateway this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-chap-credentials
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing one or more of the following fields: UpdateChapCredentialsInput$InitiatorName UpdateChapCredentialsInput$SecretToAuthenticateInitiator UpdateChapCredentialsInput$SecretToAuthenticateTarget UpdateChapCredentialsInput$TargetARN - `com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest`

  returns: Result of the UpdateChapCredentials operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateChapCredentialsResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateChapCredentialsRequest request]
    (-> this (.updateChapCredentials request))))

(defn add-working-storage
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing one or more of the following fields: AddWorkingStorageInput$DiskIds - `com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest`

  returns: Result of the AddWorkingStorage operation returned by the service. - `com.amazonaws.services.storagegateway.model.AddWorkingStorageResult`"
  (^com.amazonaws.services.storagegateway.model.AddWorkingStorageResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.AddWorkingStorageRequest request]
    (-> this (.addWorkingStorage request))))

(defn refresh-cache
  "Description copied from interface: AWSStorageGateway

  request - RefreshCacheInput - `com.amazonaws.services.storagegateway.model.RefreshCacheRequest`

  returns: Result of the RefreshCache operation returned by the service. - `com.amazonaws.services.storagegateway.model.RefreshCacheResult`"
  (^com.amazonaws.services.storagegateway.model.RefreshCacheResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.RefreshCacheRequest request]
    (-> this (.refreshCache request))))

(defn create-nfs-file-share
  "Description copied from interface: AWSStorageGateway

  request - CreateNFSFileShareInput - `com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest`

  returns: Result of the CreateNFSFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult`"
  (^com.amazonaws.services.storagegateway.model.CreateNFSFileShareResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CreateNFSFileShareRequest request]
    (-> this (.createNFSFileShare request))))

(defn delete-tape-archive
  "Description copied from interface: AWSStorageGateway

  request - DeleteTapeArchiveInput - `com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest`

  returns: Result of the DeleteTapeArchive operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult`"
  (^com.amazonaws.services.storagegateway.model.DeleteTapeArchiveResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DeleteTapeArchiveRequest request]
    (-> this (.deleteTapeArchive request))))

(defn update-nfs-file-share
  "Description copied from interface: AWSStorageGateway

  request - UpdateNFSFileShareInput - `com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest`

  returns: Result of the UpdateNFSFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateNFSFileShareResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateNFSFileShareRequest request]
    (-> this (.updateNFSFileShare request))))

(defn update-gateway-software-now
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the of the gateway to update. - `com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest`

  returns: Result of the UpdateGatewaySoftwareNow operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateGatewaySoftwareNowRequest request]
    (-> this (.updateGatewaySoftwareNow request))))

(defn list-volume-initiators
  "Description copied from interface: AWSStorageGateway

  request - ListVolumeInitiatorsInput - `com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest`

  returns: Result of the ListVolumeInitiators operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult`"
  (^com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ListVolumeInitiatorsRequest request]
    (-> this (.listVolumeInitiators request))))

(defn remove-tags-from-resource
  "Description copied from interface: AWSStorageGateway

  request - RemoveTagsFromResourceInput - `com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult`"
  (^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request)))
  (^com.amazonaws.services.storagegateway.model.RemoveTagsFromResourceResult [^AbstractAWSStorageGateway this]
    (-> this (.removeTagsFromResource))))

(defn reset-cache
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.ResetCacheRequest`

  returns: Result of the ResetCache operation returned by the service. - `com.amazonaws.services.storagegateway.model.ResetCacheResult`"
  (^com.amazonaws.services.storagegateway.model.ResetCacheResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ResetCacheRequest request]
    (-> this (.resetCache request))))

(defn describe-storedi-scsi-volumes
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing a list of DescribeStorediSCSIVolumesInput$VolumeARNs. - `com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest`

  returns: Result of the DescribeStorediSCSIVolumes operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeStorediSCSIVolumesRequest request]
    (-> this (.describeStorediSCSIVolumes request))))

(defn describe-smb-settings
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest`

  returns: Result of the DescribeSMBSettings operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeSMBSettingsResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeSMBSettingsResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeSMBSettingsRequest request]
    (-> this (.describeSMBSettings request))))

(defn describe-tape-archives
  "Description copied from interface: AWSStorageGateway

  request - DescribeTapeArchivesInput - `com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest`

  returns: Result of the DescribeTapeArchives operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesRequest request]
    (-> this (.describeTapeArchives request)))
  (^com.amazonaws.services.storagegateway.model.DescribeTapeArchivesResult [^AbstractAWSStorageGateway this]
    (-> this (.describeTapeArchives))))

(defn update-vtl-device-type
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest`

  returns: Result of the UpdateVTLDeviceType operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateVTLDeviceTypeRequest request]
    (-> this (.updateVTLDeviceType request))))

(defn describe-bandwidth-rate-limit
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest`

  returns: Result of the DescribeBandwidthRateLimit operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeBandwidthRateLimitRequest request]
    (-> this (.describeBandwidthRateLimit request))))

(defn describe-tapes
  "Description copied from interface: AWSStorageGateway

  request - DescribeTapesInput - `com.amazonaws.services.storagegateway.model.DescribeTapesRequest`

  returns: Result of the DescribeTapes operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeTapesResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeTapesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeTapesRequest request]
    (-> this (.describeTapes request))))

(defn create-smb-file-share
  "Description copied from interface: AWSStorageGateway

  request - CreateSMBFileShareInput - `com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest`

  returns: Result of the CreateSMBFileShare operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateSMBFileShareResult`"
  (^com.amazonaws.services.storagegateway.model.CreateSMBFileShareResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CreateSMBFileShareRequest request]
    (-> this (.createSMBFileShare request))))

(defn set-smb-guest-password
  "Description copied from interface: AWSStorageGateway

  request - SetSMBGuestPasswordInput - `com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest`

  returns: Result of the SetSMBGuestPassword operation returned by the service. - `com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordResult`"
  (^com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.SetSMBGuestPasswordRequest request]
    (-> this (.setSMBGuestPassword request))))

(defn delete-bandwidth-rate-limit
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the following fields: DeleteBandwidthRateLimitInput$BandwidthType - `com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest`

  returns: Result of the DeleteBandwidthRateLimit operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult`"
  (^com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DeleteBandwidthRateLimitRequest request]
    (-> this (.deleteBandwidthRateLimit request))))

(defn add-tags-to-resource
  "Description copied from interface: AWSStorageGateway

  request - AddTagsToResourceInput - `com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.storagegateway.model.AddTagsToResourceResult`"
  (^com.amazonaws.services.storagegateway.model.AddTagsToResourceResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn describe-cachedi-scsi-volumes
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest`

  returns: Result of the DescribeCachediSCSIVolumes operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeCachediSCSIVolumesRequest request]
    (-> this (.describeCachediSCSIVolumes request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSStorageGateway

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSStorageGateway this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn notify-when-uploaded
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest`

  returns: Result of the NotifyWhenUploaded operation returned by the service. - `com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult`"
  (^com.amazonaws.services.storagegateway.model.NotifyWhenUploadedResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.NotifyWhenUploadedRequest request]
    (-> this (.notifyWhenUploaded request))))

(defn list-volumes
  "Description copied from interface: AWSStorageGateway

  request - A JSON object that contains one or more of the following fields: ListVolumesInput$Limit ListVolumesInput$Marker - `com.amazonaws.services.storagegateway.model.ListVolumesRequest`

  returns: Result of the ListVolumes operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListVolumesResult`"
  (^com.amazonaws.services.storagegateway.model.ListVolumesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ListVolumesRequest request]
    (-> this (.listVolumes request))))

(defn retrieve-tape-recovery-point
  "Description copied from interface: AWSStorageGateway

  request - RetrieveTapeRecoveryPointInput - `com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest`

  returns: Result of the RetrieveTapeRecoveryPoint operation returned by the service. - `com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult`"
  (^com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.RetrieveTapeRecoveryPointRequest request]
    (-> this (.retrieveTapeRecoveryPoint request))))

(defn delete-gateway
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the ID of the gateway to delete. - `com.amazonaws.services.storagegateway.model.DeleteGatewayRequest`

  returns: Result of the DeleteGateway operation returned by the service. - `com.amazonaws.services.storagegateway.model.DeleteGatewayResult`"
  (^com.amazonaws.services.storagegateway.model.DeleteGatewayResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DeleteGatewayRequest request]
    (-> this (.deleteGateway request))))

(defn add-upload-buffer
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.AddUploadBufferRequest`

  returns: Result of the AddUploadBuffer operation returned by the service. - `com.amazonaws.services.storagegateway.model.AddUploadBufferResult`"
  (^com.amazonaws.services.storagegateway.model.AddUploadBufferResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.AddUploadBufferRequest request]
    (-> this (.addUploadBuffer request))))

(defn describe-gateway-information
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the ID of the gateway. - `com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest`

  returns: Result of the DescribeGatewayInformation operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeGatewayInformationResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeGatewayInformationRequest request]
    (-> this (.describeGatewayInformation request))))

(defn create-storedi-scsi-volume
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing one or more of the following fields: CreateStorediSCSIVolumeInput$DiskId CreateStorediSCSIVolumeInput$NetworkInterfaceId CreateStorediSCSIVolumeInput$PreserveExistingData CreateStorediSCSIVolumeInput$SnapshotId CreateStorediSCSIVolumeInput$TargetName - `com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest`

  returns: Result of the CreateStorediSCSIVolume operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult`"
  (^com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CreateStorediSCSIVolumeRequest request]
    (-> this (.createStorediSCSIVolume request))))

(defn create-snapshot-from-volume-recovery-point
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest`

  returns: Result of the CreateSnapshotFromVolumeRecoveryPoint operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult`"
  (^com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CreateSnapshotFromVolumeRecoveryPointRequest request]
    (-> this (.createSnapshotFromVolumeRecoveryPoint request))))

(defn list-file-shares
  "Description copied from interface: AWSStorageGateway

  request - ListFileShareInput - `com.amazonaws.services.storagegateway.model.ListFileSharesRequest`

  returns: Result of the ListFileShares operation returned by the service. - `com.amazonaws.services.storagegateway.model.ListFileSharesResult`"
  (^com.amazonaws.services.storagegateway.model.ListFileSharesResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.ListFileSharesRequest request]
    (-> this (.listFileShares request))))

(defn cancel-retrieval
  "Description copied from interface: AWSStorageGateway

  request - CancelRetrievalInput - `com.amazonaws.services.storagegateway.model.CancelRetrievalRequest`

  returns: Result of the CancelRetrieval operation returned by the service. - `com.amazonaws.services.storagegateway.model.CancelRetrievalResult`"
  (^com.amazonaws.services.storagegateway.model.CancelRetrievalResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CancelRetrievalRequest request]
    (-> this (.cancelRetrieval request))))

(defn update-gateway-information
  "Description copied from interface: AWSStorageGateway

  request - `com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest`

  returns: Result of the UpdateGatewayInformation operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateGatewayInformationResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateGatewayInformationRequest request]
    (-> this (.updateGatewayInformation request))))

(defn create-snapshot
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing one or more of the following fields: CreateSnapshotInput$SnapshotDescription CreateSnapshotInput$VolumeARN - `com.amazonaws.services.storagegateway.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.storagegateway.model.CreateSnapshotResult`"
  (^com.amazonaws.services.storagegateway.model.CreateSnapshotResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.CreateSnapshotRequest request]
    (-> this (.createSnapshot request))))

(defn update-bandwidth-rate-limit
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing one or more of the following fields: UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec - `com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest`

  returns: Result of the UpdateBandwidthRateLimit operation returned by the service. - `com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult`"
  (^com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.UpdateBandwidthRateLimitRequest request]
    (-> this (.updateBandwidthRateLimit request))))

(defn describe-snapshot-schedule
  "Description copied from interface: AWSStorageGateway

  request - A JSON object containing the DescribeSnapshotScheduleInput$VolumeARN of the volume. - `com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest`

  returns: Result of the DescribeSnapshotSchedule operation returned by the service. - `com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult`"
  (^com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleResult [^AbstractAWSStorageGateway this ^com.amazonaws.services.storagegateway.model.DescribeSnapshotScheduleRequest request]
    (-> this (.describeSnapshotSchedule request))))

