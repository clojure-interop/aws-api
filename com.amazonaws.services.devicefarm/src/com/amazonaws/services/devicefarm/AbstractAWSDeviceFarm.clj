(ns com.amazonaws.services.devicefarm.AbstractAWSDeviceFarm
  "Abstract implementation of AWSDeviceFarm. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.devicefarm AbstractAWSDeviceFarm]))

(defn get-instance-profile
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest`

  returns: Result of the GetInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetInstanceProfileResult`"
  (^com.amazonaws.services.devicefarm.model.GetInstanceProfileResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest request]
    (-> this (.getInstanceProfile request))))

(defn purchase-offering
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request for a purchase offering. - `com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest`

  returns: Result of the PurchaseOffering operation returned by the service. - `com.amazonaws.services.devicefarm.model.PurchaseOfferingResult`"
  (^com.amazonaws.services.devicefarm.model.PurchaseOfferingResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest request]
    (-> this (.purchaseOffering request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.devicefarm.model.ListTagsForResourceResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-suites
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the list suites operation. - `com.amazonaws.services.devicefarm.model.ListSuitesRequest`

  returns: Result of the ListSuites operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListSuitesResult`"
  (^com.amazonaws.services.devicefarm.model.ListSuitesResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListSuitesRequest request]
    (-> this (.listSuites request))))

(defn get-job
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the get job operation. - `com.amazonaws.services.devicefarm.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetJobResult`"
  (^com.amazonaws.services.devicefarm.model.GetJobResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetJobRequest request]
    (-> this (.getJob request))))

(defn list-uploads
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the list uploads operation. - `com.amazonaws.services.devicefarm.model.ListUploadsRequest`

  returns: Result of the ListUploads operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListUploadsResult`"
  (^com.amazonaws.services.devicefarm.model.ListUploadsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListUploadsRequest request]
    (-> this (.listUploads request))))

(defn update-upload
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.UpdateUploadRequest`

  returns: Result of the UpdateUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateUploadResult`"
  (^com.amazonaws.services.devicefarm.model.UpdateUploadResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateUploadRequest request]
    (-> this (.updateUpload request))))

(defn set-region
  "Description copied from interface: AWSDeviceFarm

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSDeviceFarm this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-offerings
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request to list all offerings. - `com.amazonaws.services.devicefarm.model.ListOfferingsRequest`

  returns: Result of the ListOfferings operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListOfferingsResult`"
  (^com.amazonaws.services.devicefarm.model.ListOfferingsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListOfferingsRequest request]
    (-> this (.listOfferings request))))

(defn renew-offering
  "Description copied from interface: AWSDeviceFarm

  request - A request representing an offering renewal. - `com.amazonaws.services.devicefarm.model.RenewOfferingRequest`

  returns: Result of the RenewOffering operation returned by the service. - `com.amazonaws.services.devicefarm.model.RenewOfferingResult`"
  (^com.amazonaws.services.devicefarm.model.RenewOfferingResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.RenewOfferingRequest request]
    (-> this (.renewOffering request))))

(defn create-network-profile
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest`

  returns: Result of the CreateNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult`"
  (^com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest request]
    (-> this (.createNetworkProfile request))))

(defn list-offering-promotions
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest`

  returns: Result of the ListOfferingPromotions operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult`"
  (^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest request]
    (-> this (.listOfferingPromotions request))))

(defn get-device-pool-compatibility
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the get device pool compatibility operation. - `com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest`

  returns: Result of the GetDevicePoolCompatibility operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult`"
  (^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest request]
    (-> this (.getDevicePoolCompatibility request))))

(defn list-vpce-configurations
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest`

  returns: Result of the ListVPCEConfigurations operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsResult`"
  (^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest request]
    (-> this (.listVPCEConfigurations request))))

(defn delete-network-profile
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest`

  returns: Result of the DeleteNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult`"
  (^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest request]
    (-> this (.deleteNetworkProfile request))))

(defn create-remote-access-session
  "Description copied from interface: AWSDeviceFarm

  request - Creates and submits a request to start a remote access session. - `com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest`

  returns: Result of the CreateRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult`"
  (^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest request]
    (-> this (.createRemoteAccessSession request))))

(defn get-network-profile
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest`

  returns: Result of the GetNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetNetworkProfileResult`"
  (^com.amazonaws.services.devicefarm.model.GetNetworkProfileResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest request]
    (-> this (.getNetworkProfile request))))

(defn get-upload
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the get upload operation. - `com.amazonaws.services.devicefarm.model.GetUploadRequest`

  returns: Result of the GetUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetUploadResult`"
  (^com.amazonaws.services.devicefarm.model.GetUploadResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetUploadRequest request]
    (-> this (.getUpload request))))

(defn list-artifacts
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the list artifacts operation. - `com.amazonaws.services.devicefarm.model.ListArtifactsRequest`

  returns: Result of the ListArtifacts operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListArtifactsResult`"
  (^com.amazonaws.services.devicefarm.model.ListArtifactsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListArtifactsRequest request]
    (-> this (.listArtifacts request))))

(defn untag-resource
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.devicefarm.model.UntagResourceResult`"
  (^com.amazonaws.services.devicefarm.model.UntagResourceResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-run
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the delete run operation. - `com.amazonaws.services.devicefarm.model.DeleteRunRequest`

  returns: Result of the DeleteRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteRunResult`"
  (^com.amazonaws.services.devicefarm.model.DeleteRunResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteRunRequest request]
    (-> this (.deleteRun request))))

(defn update-network-profile
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest`

  returns: Result of the UpdateNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult`"
  (^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest request]
    (-> this (.updateNetworkProfile request))))

(defn list-device-pools
  "Description copied from interface: AWSDeviceFarm

  request - Represents the result of a list device pools request. - `com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest`

  returns: Result of the ListDevicePools operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListDevicePoolsResult`"
  (^com.amazonaws.services.devicefarm.model.ListDevicePoolsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest request]
    (-> this (.listDevicePools request))))

(defn create-project
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the create project operation. - `com.amazonaws.services.devicefarm.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateProjectResult`"
  (^com.amazonaws.services.devicefarm.model.CreateProjectResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn list-instance-profiles
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest`

  returns: Result of the ListInstanceProfiles operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult`"
  (^com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest request]
    (-> this (.listInstanceProfiles request))))

(defn list-tests
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the list tests operation. - `com.amazonaws.services.devicefarm.model.ListTestsRequest`

  returns: Result of the ListTests operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListTestsResult`"
  (^com.amazonaws.services.devicefarm.model.ListTestsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListTestsRequest request]
    (-> this (.listTests request))))

(defn list-samples
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the list samples operation. - `com.amazonaws.services.devicefarm.model.ListSamplesRequest`

  returns: Result of the ListSamples operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListSamplesResult`"
  (^com.amazonaws.services.devicefarm.model.ListSamplesResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListSamplesRequest request]
    (-> this (.listSamples request))))

(defn list-runs
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the list runs operation. - `com.amazonaws.services.devicefarm.model.ListRunsRequest`

  returns: Result of the ListRuns operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListRunsResult`"
  (^com.amazonaws.services.devicefarm.model.ListRunsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListRunsRequest request]
    (-> this (.listRuns request))))

(defn get-project
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the get project operation. - `com.amazonaws.services.devicefarm.model.GetProjectRequest`

  returns: Result of the GetProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetProjectResult`"
  (^com.amazonaws.services.devicefarm.model.GetProjectResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetProjectRequest request]
    (-> this (.getProject request))))

(defn stop-run
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request to stop a specific run. - `com.amazonaws.services.devicefarm.model.StopRunRequest`

  returns: Result of the StopRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.StopRunResult`"
  (^com.amazonaws.services.devicefarm.model.StopRunResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.StopRunRequest request]
    (-> this (.stopRun request))))

(defn list-devices
  "Description copied from interface: AWSDeviceFarm

  request - Represents the result of a list devices request. - `com.amazonaws.services.devicefarm.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListDevicesResult`"
  (^com.amazonaws.services.devicefarm.model.ListDevicesResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListDevicesRequest request]
    (-> this (.listDevices request))))

(defn list-remote-access-sessions
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request to return information about the remote access session. - `com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest`

  returns: Result of the ListRemoteAccessSessions operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult`"
  (^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest request]
    (-> this (.listRemoteAccessSessions request))))

(defn list-network-profiles
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest`

  returns: Result of the ListNetworkProfiles operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult`"
  (^com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest request]
    (-> this (.listNetworkProfiles request))))

(defn stop-remote-access-session
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request to stop the remote access session. - `com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest`

  returns: Result of the StopRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult`"
  (^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest request]
    (-> this (.stopRemoteAccessSession request))))

(defn delete-vpce-configuration
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest`

  returns: Result of the DeleteVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationResult`"
  (^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest request]
    (-> this (.deleteVPCEConfiguration request))))

(defn update-vpce-configuration
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest`

  returns: Result of the UpdateVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationResult`"
  (^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest request]
    (-> this (.updateVPCEConfiguration request))))

(defn install-to-remote-access-session
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa format) as part of a remote access session. - `com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest`

  returns: Result of the InstallToRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult`"
  (^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest request]
    (-> this (.installToRemoteAccessSession request))))

(defn shutdown
  "Description copied from interface: AWSDeviceFarm"
  ([^AbstractAWSDeviceFarm this]
    (-> this (.shutdown))))

(defn get-suite
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the get suite operation. - `com.amazonaws.services.devicefarm.model.GetSuiteRequest`

  returns: Result of the GetSuite operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetSuiteResult`"
  (^com.amazonaws.services.devicefarm.model.GetSuiteResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetSuiteRequest request]
    (-> this (.getSuite request))))

(defn update-device-pool
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the update device pool operation. - `com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest`

  returns: Result of the UpdateDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult`"
  (^com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest request]
    (-> this (.updateDevicePool request))))

(defn create-device-pool
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the create device pool operation. - `com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest`

  returns: Result of the CreateDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateDevicePoolResult`"
  (^com.amazonaws.services.devicefarm.model.CreateDevicePoolResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest request]
    (-> this (.createDevicePool request))))

(defn delete-device-pool
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the delete device pool operation. - `com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest`

  returns: Result of the DeleteDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult`"
  (^com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest request]
    (-> this (.deleteDevicePool request))))

(defn create-vpce-configuration
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest`

  returns: Result of the CreateVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationResult`"
  (^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest request]
    (-> this (.createVPCEConfiguration request))))

(defn update-instance-profile
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest`

  returns: Result of the UpdateInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult`"
  (^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest request]
    (-> this (.updateInstanceProfile request))))

(defn set-endpoint
  "Description copied from interface: AWSDeviceFarm

  endpoint - The endpoint (ex: \"devicefarm.us-west-2.amazonaws.com\") or a full URL, including the protocol (ex: \"https://devicefarm.us-west-2.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSDeviceFarm this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-projects
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the list projects operation. - `com.amazonaws.services.devicefarm.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListProjectsResult`"
  (^com.amazonaws.services.devicefarm.model.ListProjectsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn delete-upload
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the delete upload operation. - `com.amazonaws.services.devicefarm.model.DeleteUploadRequest`

  returns: Result of the DeleteUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteUploadResult`"
  (^com.amazonaws.services.devicefarm.model.DeleteUploadResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteUploadRequest request]
    (-> this (.deleteUpload request))))

(defn get-device
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the get device request. - `com.amazonaws.services.devicefarm.model.GetDeviceRequest`

  returns: Result of the GetDevice operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDeviceResult`"
  (^com.amazonaws.services.devicefarm.model.GetDeviceResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetDeviceRequest request]
    (-> this (.getDevice request))))

(defn get-vpce-configuration
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest`

  returns: Result of the GetVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetVPCEConfigurationResult`"
  (^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest request]
    (-> this (.getVPCEConfiguration request))))

(defn list-jobs
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the list jobs operation. - `com.amazonaws.services.devicefarm.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListJobsResult`"
  (^com.amazonaws.services.devicefarm.model.ListJobsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn schedule-run
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the schedule run operation. - `com.amazonaws.services.devicefarm.model.ScheduleRunRequest`

  returns: Result of the ScheduleRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.ScheduleRunResult`"
  (^com.amazonaws.services.devicefarm.model.ScheduleRunResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ScheduleRunRequest request]
    (-> this (.scheduleRun request))))

(defn update-project
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the update project operation. - `com.amazonaws.services.devicefarm.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateProjectResult`"
  (^com.amazonaws.services.devicefarm.model.UpdateProjectResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn list-offering-transactions
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request to list the offering transaction history. - `com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest`

  returns: Result of the ListOfferingTransactions operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult`"
  (^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest request]
    (-> this (.listOfferingTransactions request))))

(defn list-unique-problems
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the list unique problems operation. - `com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest`

  returns: Result of the ListUniqueProblems operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult`"
  (^com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest request]
    (-> this (.listUniqueProblems request))))

(defn get-run
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the get run operation. - `com.amazonaws.services.devicefarm.model.GetRunRequest`

  returns: Result of the GetRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetRunResult`"
  (^com.amazonaws.services.devicefarm.model.GetRunResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetRunRequest request]
    (-> this (.getRun request))))

(defn delete-remote-access-session
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request to delete the specified remote access session. - `com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest`

  returns: Result of the DeleteRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult`"
  (^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest request]
    (-> this (.deleteRemoteAccessSession request))))

(defn get-offering-status
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request to retrieve the offering status for the specified customer or account. - `com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest`

  returns: Result of the GetOfferingStatus operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetOfferingStatusResult`"
  (^com.amazonaws.services.devicefarm.model.GetOfferingStatusResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest request]
    (-> this (.getOfferingStatus request))))

(defn delete-instance-profile
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest`

  returns: Result of the DeleteInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult`"
  (^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest request]
    (-> this (.deleteInstanceProfile request))))

(defn list-device-instances
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest`

  returns: Result of the ListDeviceInstances operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult`"
  (^com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest request]
    (-> this (.listDeviceInstances request))))

(defn create-upload
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the create upload operation. - `com.amazonaws.services.devicefarm.model.CreateUploadRequest`

  returns: Result of the CreateUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateUploadResult`"
  (^com.amazonaws.services.devicefarm.model.CreateUploadResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateUploadRequest request]
    (-> this (.createUpload request))))

(defn stop-job
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.StopJobRequest`

  returns: Result of the StopJob operation returned by the service. - `com.amazonaws.services.devicefarm.model.StopJobResult`"
  (^com.amazonaws.services.devicefarm.model.StopJobResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.StopJobRequest request]
    (-> this (.stopJob request))))

(defn get-test
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the get test operation. - `com.amazonaws.services.devicefarm.model.GetTestRequest`

  returns: Result of the GetTest operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetTestResult`"
  (^com.amazonaws.services.devicefarm.model.GetTestResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetTestRequest request]
    (-> this (.getTest request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSDeviceFarm

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSDeviceFarm this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-device-instance
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest`

  returns: Result of the GetDeviceInstance operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult`"
  (^com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest request]
    (-> this (.getDeviceInstance request))))

(defn get-device-pool
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the get device pool operation. - `com.amazonaws.services.devicefarm.model.GetDevicePoolRequest`

  returns: Result of the GetDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDevicePoolResult`"
  (^com.amazonaws.services.devicefarm.model.GetDevicePoolResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetDevicePoolRequest request]
    (-> this (.getDevicePool request))))

(defn delete-project
  "Description copied from interface: AWSDeviceFarm

  request - Represents a request to the delete project operation. - `com.amazonaws.services.devicefarm.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteProjectResult`"
  (^com.amazonaws.services.devicefarm.model.DeleteProjectResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

(defn get-account-settings
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request sent to retrieve the account settings. - `com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest`

  returns: Result of the GetAccountSettings operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetAccountSettingsResult`"
  (^com.amazonaws.services.devicefarm.model.GetAccountSettingsResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest request]
    (-> this (.getAccountSettings request))))

(defn tag-resource
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.devicefarm.model.TagResourceResult`"
  (^com.amazonaws.services.devicefarm.model.TagResourceResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn create-instance-profile
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest`

  returns: Result of the CreateInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult`"
  (^com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest request]
    (-> this (.createInstanceProfile request))))

(defn update-device-instance
  "Description copied from interface: AWSDeviceFarm

  request - `com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest`

  returns: Result of the UpdateDeviceInstance operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult`"
  (^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest request]
    (-> this (.updateDeviceInstance request))))

(defn get-remote-access-session
  "Description copied from interface: AWSDeviceFarm

  request - Represents the request to get information about the specified remote access session. - `com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest`

  returns: Result of the GetRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult`"
  (^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult [^AbstractAWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest request]
    (-> this (.getRemoteAccessSession request))))

