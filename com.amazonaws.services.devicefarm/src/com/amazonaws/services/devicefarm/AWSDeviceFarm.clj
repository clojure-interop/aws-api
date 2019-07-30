(ns com.amazonaws.services.devicefarm.AWSDeviceFarm
  "Interface for accessing AWS Device Farm.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSDeviceFarm instead.



  AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
  phones, tablets, and other devices in the cloud."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.devicefarm AWSDeviceFarm]))

(defn get-instance-profile
  "Returns information about the specified instance profile.

  get-instance-profile-request - `com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest`

  returns: Result of the GetInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetInstanceProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetInstanceProfileResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest get-instance-profile-request]
    (-> this (.getInstanceProfile get-instance-profile-request))))

(defn purchase-offering
  "Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for
   an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is
   not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  purchase-offering-request - Represents a request for a purchase offering. - `com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest`

  returns: Result of the PurchaseOffering operation returned by the service. - `com.amazonaws.services.devicefarm.model.PurchaseOfferingResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.PurchaseOfferingResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest purchase-offering-request]
    (-> this (.purchaseOffering purchase-offering-request))))

(defn list-tags-for-resource
  "List the tags for an AWS Device Farm resource.

  list-tags-for-resource-request - `com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.devicefarm.model.NotFoundException - The specified entity was not found."
  (^com.amazonaws.services.devicefarm.model.ListTagsForResourceResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn list-suites
  "Gets information about test suites for a given job.

  list-suites-request - Represents a request to the list suites operation. - `com.amazonaws.services.devicefarm.model.ListSuitesRequest`

  returns: Result of the ListSuites operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListSuitesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListSuitesResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListSuitesRequest list-suites-request]
    (-> this (.listSuites list-suites-request))))

(defn get-job
  "Gets information about a job.

  get-job-request - Represents a request to the get job operation. - `com.amazonaws.services.devicefarm.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetJobResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetJobResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetJobRequest get-job-request]
    (-> this (.getJob get-job-request))))

(defn list-uploads
  "Gets information about uploads, given an AWS Device Farm project ARN.

  list-uploads-request - Represents a request to the list uploads operation. - `com.amazonaws.services.devicefarm.model.ListUploadsRequest`

  returns: Result of the ListUploads operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListUploadsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListUploadsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListUploadsRequest list-uploads-request]
    (-> this (.listUploads list-uploads-request))))

(defn update-upload
  "Update an uploaded test specification (test spec).

  update-upload-request - `com.amazonaws.services.devicefarm.model.UpdateUploadRequest`

  returns: Result of the UpdateUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateUploadResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateUploadResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateUploadRequest update-upload-request]
    (-> this (.updateUpload update-upload-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSDeviceFarm this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-offerings
  "Returns a list of products or offerings that the user can manage through the API. Each offering record indicates
   the recurring price per unit and the frequency for that offering. The API returns a NotEligible
   error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  list-offerings-request - Represents the request to list all offerings. - `com.amazonaws.services.devicefarm.model.ListOfferingsRequest`

  returns: Result of the ListOfferings operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListOfferingsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListOfferingsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListOfferingsRequest list-offerings-request]
    (-> this (.listOfferings list-offerings-request))))

(defn renew-offering
  "Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of
   the next period. The API returns a NotEligible error if the user is not permitted to invoke the
   operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  renew-offering-request - A request representing an offering renewal. - `com.amazonaws.services.devicefarm.model.RenewOfferingRequest`

  returns: Result of the RenewOffering operation returned by the service. - `com.amazonaws.services.devicefarm.model.RenewOfferingResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.RenewOfferingResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.RenewOfferingRequest renew-offering-request]
    (-> this (.renewOffering renew-offering-request))))

(defn create-network-profile
  "Creates a network profile.

  create-network-profile-request - `com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest`

  returns: Result of the CreateNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest create-network-profile-request]
    (-> this (.createNetworkProfile create-network-profile-request))))

(defn list-offering-promotions
  "Returns a list of offering promotions. Each offering promotion record contains the ID and description of the
   promotion. The API returns a NotEligible error if the caller is not permitted to invoke the
   operation. Contact aws-devicefarm-support@amazon.com if
   you believe that you should be able to invoke this operation.

  list-offering-promotions-request - `com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest`

  returns: Result of the ListOfferingPromotions operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest list-offering-promotions-request]
    (-> this (.listOfferingPromotions list-offering-promotions-request))))

(defn get-device-pool-compatibility
  "Gets information about compatibility with a device pool.

  get-device-pool-compatibility-request - Represents a request to the get device pool compatibility operation. - `com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest`

  returns: Result of the GetDevicePoolCompatibility operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest get-device-pool-compatibility-request]
    (-> this (.getDevicePoolCompatibility get-device-pool-compatibility-request))))

(defn list-vpce-configurations
  "Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.

  list-vpce-configurations-request - `com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest`

  returns: Result of the ListVPCEConfigurations operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest list-vpce-configurations-request]
    (-> this (.listVPCEConfigurations list-vpce-configurations-request))))

(defn delete-network-profile
  "Deletes a network profile.

  delete-network-profile-request - `com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest`

  returns: Result of the DeleteNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest delete-network-profile-request]
    (-> this (.deleteNetworkProfile delete-network-profile-request))))

(defn create-remote-access-session
  "Specifies and starts a remote access session.

  create-remote-access-session-request - Creates and submits a request to start a remote access session. - `com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest`

  returns: Result of the CreateRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest create-remote-access-session-request]
    (-> this (.createRemoteAccessSession create-remote-access-session-request))))

(defn get-network-profile
  "Returns information about a network profile.

  get-network-profile-request - `com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest`

  returns: Result of the GetNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetNetworkProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetNetworkProfileResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest get-network-profile-request]
    (-> this (.getNetworkProfile get-network-profile-request))))

(defn get-upload
  "Gets information about an upload.

  get-upload-request - Represents a request to the get upload operation. - `com.amazonaws.services.devicefarm.model.GetUploadRequest`

  returns: Result of the GetUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetUploadResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetUploadResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetUploadRequest get-upload-request]
    (-> this (.getUpload get-upload-request))))

(defn list-artifacts
  "Gets information about artifacts.

  list-artifacts-request - Represents a request to the list artifacts operation. - `com.amazonaws.services.devicefarm.model.ListArtifactsRequest`

  returns: Result of the ListArtifacts operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListArtifactsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListArtifactsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListArtifactsRequest list-artifacts-request]
    (-> this (.listArtifacts list-artifacts-request))))

(defn untag-resource
  "Deletes the specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.devicefarm.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.devicefarm.model.UntagResourceResult`

  throws: com.amazonaws.services.devicefarm.model.NotFoundException - The specified entity was not found."
  (^com.amazonaws.services.devicefarm.model.UntagResourceResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn delete-run
  "Deletes the run, given the run ARN.


   Note Deleting this resource does not stop an in-progress run.

  delete-run-request - Represents a request to the delete run operation. - `com.amazonaws.services.devicefarm.model.DeleteRunRequest`

  returns: Result of the DeleteRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteRunResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteRunResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteRunRequest delete-run-request]
    (-> this (.deleteRun delete-run-request))))

(defn update-network-profile
  "Updates the network profile with specific settings.

  update-network-profile-request - `com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest`

  returns: Result of the UpdateNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest update-network-profile-request]
    (-> this (.updateNetworkProfile update-network-profile-request))))

(defn list-device-pools
  "Gets information about device pools.

  list-device-pools-request - Represents the result of a list device pools request. - `com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest`

  returns: Result of the ListDevicePools operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListDevicePoolsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListDevicePoolsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest list-device-pools-request]
    (-> this (.listDevicePools list-device-pools-request))))

(defn create-project
  "Creates a new project.

  create-project-request - Represents a request to the create project operation. - `com.amazonaws.services.devicefarm.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateProjectResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateProjectResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateProjectRequest create-project-request]
    (-> this (.createProject create-project-request))))

(defn list-instance-profiles
  "Returns information about all the instance profiles in an AWS account.

  list-instance-profiles-request - `com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest`

  returns: Result of the ListInstanceProfiles operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest list-instance-profiles-request]
    (-> this (.listInstanceProfiles list-instance-profiles-request))))

(defn list-tests
  "Gets information about tests in a given test suite.

  list-tests-request - Represents a request to the list tests operation. - `com.amazonaws.services.devicefarm.model.ListTestsRequest`

  returns: Result of the ListTests operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListTestsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListTestsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListTestsRequest list-tests-request]
    (-> this (.listTests list-tests-request))))

(defn list-samples
  "Gets information about samples, given an AWS Device Farm job ARN.

  list-samples-request - Represents a request to the list samples operation. - `com.amazonaws.services.devicefarm.model.ListSamplesRequest`

  returns: Result of the ListSamples operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListSamplesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListSamplesResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListSamplesRequest list-samples-request]
    (-> this (.listSamples list-samples-request))))

(defn list-runs
  "Gets information about runs, given an AWS Device Farm project ARN.

  list-runs-request - Represents a request to the list runs operation. - `com.amazonaws.services.devicefarm.model.ListRunsRequest`

  returns: Result of the ListRuns operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListRunsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListRunsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListRunsRequest list-runs-request]
    (-> this (.listRuns list-runs-request))))

(defn get-project
  "Gets information about a project.

  get-project-request - Represents a request to the get project operation. - `com.amazonaws.services.devicefarm.model.GetProjectRequest`

  returns: Result of the GetProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetProjectResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetProjectResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetProjectRequest get-project-request]
    (-> this (.getProject get-project-request))))

(defn stop-run
  "Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where
   tests have not started executing, and you will not be billed for these devices. On devices where tests have
   started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those
   devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.

  stop-run-request - Represents the request to stop a specific run. - `com.amazonaws.services.devicefarm.model.StopRunRequest`

  returns: Result of the StopRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.StopRunResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.StopRunResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.StopRunRequest stop-run-request]
    (-> this (.stopRun stop-run-request))))

(defn list-devices
  "Gets information about unique device types.

  list-devices-request - Represents the result of a list devices request. - `com.amazonaws.services.devicefarm.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListDevicesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListDevicesResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListDevicesRequest list-devices-request]
    (-> this (.listDevices list-devices-request))))

(defn list-remote-access-sessions
  "Returns a list of all currently running remote access sessions.

  list-remote-access-sessions-request - Represents the request to return information about the remote access session. - `com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest`

  returns: Result of the ListRemoteAccessSessions operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest list-remote-access-sessions-request]
    (-> this (.listRemoteAccessSessions list-remote-access-sessions-request))))

(defn list-network-profiles
  "Returns the list of available network profiles.

  list-network-profiles-request - `com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest`

  returns: Result of the ListNetworkProfiles operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest list-network-profiles-request]
    (-> this (.listNetworkProfiles list-network-profiles-request))))

(defn stop-remote-access-session
  "Ends a specified remote access session.

  stop-remote-access-session-request - Represents the request to stop the remote access session. - `com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest`

  returns: Result of the StopRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest stop-remote-access-session-request]
    (-> this (.stopRemoteAccessSession stop-remote-access-session-request))))

(defn delete-vpce-configuration
  "Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.

  delete-vpce-configuration-request - `com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest`

  returns: Result of the DeleteVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest delete-vpce-configuration-request]
    (-> this (.deleteVPCEConfiguration delete-vpce-configuration-request))))

(defn update-vpce-configuration
  "Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.

  update-vpce-configuration-request - `com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest`

  returns: Result of the UpdateVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest update-vpce-configuration-request]
    (-> this (.updateVPCEConfiguration update-vpce-configuration-request))))

(defn install-to-remote-access-session
  "Installs an application to the device in a remote access session. For Android applications, the file must be in
   .apk format. For iOS applications, the file must be in .ipa format.

  install-to-remote-access-session-request - Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa format) as part of a remote access session. - `com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest`

  returns: Result of the InstallToRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest install-to-remote-access-session-request]
    (-> this (.installToRemoteAccessSession install-to-remote-access-session-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSDeviceFarm this]
    (-> this (.shutdown))))

(defn get-suite
  "Gets information about a suite.

  get-suite-request - Represents a request to the get suite operation. - `com.amazonaws.services.devicefarm.model.GetSuiteRequest`

  returns: Result of the GetSuite operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetSuiteResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetSuiteResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetSuiteRequest get-suite-request]
    (-> this (.getSuite get-suite-request))))

(defn update-device-pool
  "Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates
   are all-or-nothing, meaning they can only be updated as a whole (or not at all).

  update-device-pool-request - Represents a request to the update device pool operation. - `com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest`

  returns: Result of the UpdateDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest update-device-pool-request]
    (-> this (.updateDevicePool update-device-pool-request))))

(defn create-device-pool
  "Creates a device pool.

  create-device-pool-request - Represents a request to the create device pool operation. - `com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest`

  returns: Result of the CreateDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateDevicePoolResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateDevicePoolResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest create-device-pool-request]
    (-> this (.createDevicePool create-device-pool-request))))

(defn delete-device-pool
  "Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.

  delete-device-pool-request - Represents a request to the delete device pool operation. - `com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest`

  returns: Result of the DeleteDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest delete-device-pool-request]
    (-> this (.deleteDevicePool delete-device-pool-request))))

(defn create-vpce-configuration
  "Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.

  create-vpce-configuration-request - `com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest`

  returns: Result of the CreateVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest create-vpce-configuration-request]
    (-> this (.createVPCEConfiguration create-vpce-configuration-request))))

(defn update-instance-profile
  "Updates information about an existing private device instance profile.

  update-instance-profile-request - `com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest`

  returns: Result of the UpdateInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest update-instance-profile-request]
    (-> this (.updateInstanceProfile update-instance-profile-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"devicefarm.us-west-2.amazonaws.com\") or a full URL, including the protocol (ex: \"https://devicefarm.us-west-2.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSDeviceFarm this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-projects
  "Gets information about projects.

  list-projects-request - Represents a request to the list projects operation. - `com.amazonaws.services.devicefarm.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListProjectsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListProjectsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjects list-projects-request))))

(defn delete-upload
  "Deletes an upload given the upload ARN.

  delete-upload-request - Represents a request to the delete upload operation. - `com.amazonaws.services.devicefarm.model.DeleteUploadRequest`

  returns: Result of the DeleteUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteUploadResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteUploadResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteUploadRequest delete-upload-request]
    (-> this (.deleteUpload delete-upload-request))))

(defn get-device
  "Gets information about a unique device type.

  get-device-request - Represents a request to the get device request. - `com.amazonaws.services.devicefarm.model.GetDeviceRequest`

  returns: Result of the GetDevice operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDeviceResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetDeviceResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetDeviceRequest get-device-request]
    (-> this (.getDevice get-device-request))))

(defn get-vpce-configuration
  "Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.

  get-vpce-configuration-request - `com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest`

  returns: Result of the GetVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetVPCEConfigurationResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest get-vpce-configuration-request]
    (-> this (.getVPCEConfiguration get-vpce-configuration-request))))

(defn list-jobs
  "Gets information about jobs for a given test run.

  list-jobs-request - Represents a request to the list jobs operation. - `com.amazonaws.services.devicefarm.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListJobsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListJobsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobs list-jobs-request))))

(defn schedule-run
  "Schedules a run.

  schedule-run-request - Represents a request to the schedule run operation. - `com.amazonaws.services.devicefarm.model.ScheduleRunRequest`

  returns: Result of the ScheduleRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.ScheduleRunResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ScheduleRunResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ScheduleRunRequest schedule-run-request]
    (-> this (.scheduleRun schedule-run-request))))

(defn update-project
  "Modifies the specified project name, given the project ARN and a new name.

  update-project-request - Represents a request to the update project operation. - `com.amazonaws.services.devicefarm.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateProjectResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateProjectResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProject update-project-request))))

(defn list-offering-transactions
  "Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The
   list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a
   NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  list-offering-transactions-request - Represents the request to list the offering transaction history. - `com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest`

  returns: Result of the ListOfferingTransactions operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest list-offering-transactions-request]
    (-> this (.listOfferingTransactions list-offering-transactions-request))))

(defn list-unique-problems
  "Gets information about unique problems.

  list-unique-problems-request - Represents a request to the list unique problems operation. - `com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest`

  returns: Result of the ListUniqueProblems operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest list-unique-problems-request]
    (-> this (.listUniqueProblems list-unique-problems-request))))

(defn get-run
  "Gets information about a run.

  get-run-request - Represents a request to the get run operation. - `com.amazonaws.services.devicefarm.model.GetRunRequest`

  returns: Result of the GetRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetRunResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetRunResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetRunRequest get-run-request]
    (-> this (.getRun get-run-request))))

(defn delete-remote-access-session
  "Deletes a completed remote access session and its results.

  delete-remote-access-session-request - Represents the request to delete the specified remote access session. - `com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest`

  returns: Result of the DeleteRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest delete-remote-access-session-request]
    (-> this (.deleteRemoteAccessSession delete-remote-access-session-request))))

(defn get-offering-status
  "Gets the current status and future status of all offerings purchased by an AWS account. The response indicates
   how many offerings are currently available and the offerings that will be available in the next period. The API
   returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  get-offering-status-request - Represents the request to retrieve the offering status for the specified customer or account. - `com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest`

  returns: Result of the GetOfferingStatus operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetOfferingStatusResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetOfferingStatusResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest get-offering-status-request]
    (-> this (.getOfferingStatus get-offering-status-request))))

(defn delete-instance-profile
  "Deletes a profile that can be applied to one or more private device instances.

  delete-instance-profile-request - `com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest`

  returns: Result of the DeleteInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest delete-instance-profile-request]
    (-> this (.deleteInstanceProfile delete-instance-profile-request))))

(defn list-device-instances
  "Returns information about the private device instances associated with one or more AWS accounts.

  list-device-instances-request - `com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest`

  returns: Result of the ListDeviceInstances operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest list-device-instances-request]
    (-> this (.listDeviceInstances list-device-instances-request))))

(defn create-upload
  "Uploads an app or test scripts.

  create-upload-request - Represents a request to the create upload operation. - `com.amazonaws.services.devicefarm.model.CreateUploadRequest`

  returns: Result of the CreateUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateUploadResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateUploadResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateUploadRequest create-upload-request]
    (-> this (.createUpload create-upload-request))))

(defn stop-job
  "Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where
   tests have not started executing, and you will not be billed for this device. On the device where tests have
   started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the
   device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.

  stop-job-request - `com.amazonaws.services.devicefarm.model.StopJobRequest`

  returns: Result of the StopJob operation returned by the service. - `com.amazonaws.services.devicefarm.model.StopJobResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.StopJobResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.StopJobRequest stop-job-request]
    (-> this (.stopJob stop-job-request))))

(defn get-test
  "Gets information about a test.

  get-test-request - Represents a request to the get test operation. - `com.amazonaws.services.devicefarm.model.GetTestRequest`

  returns: Result of the GetTest operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetTestResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetTestResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetTestRequest get-test-request]
    (-> this (.getTest get-test-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSDeviceFarm this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-device-instance
  "Returns information about a device instance belonging to a private device fleet.

  get-device-instance-request - `com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest`

  returns: Result of the GetDeviceInstance operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest get-device-instance-request]
    (-> this (.getDeviceInstance get-device-instance-request))))

(defn get-device-pool
  "Gets information about a device pool.

  get-device-pool-request - Represents a request to the get device pool operation. - `com.amazonaws.services.devicefarm.model.GetDevicePoolRequest`

  returns: Result of the GetDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDevicePoolResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetDevicePoolResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetDevicePoolRequest get-device-pool-request]
    (-> this (.getDevicePool get-device-pool-request))))

(defn delete-project
  "Deletes an AWS Device Farm project, given the project ARN.


   Note Deleting this resource does not stop an in-progress run.

  delete-project-request - Represents a request to the delete project operation. - `com.amazonaws.services.devicefarm.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteProjectResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteProjectResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProject delete-project-request))))

(defn get-account-settings
  "Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.

  get-account-settings-request - Represents the request sent to retrieve the account settings. - `com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest`

  returns: Result of the GetAccountSettings operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetAccountSettingsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetAccountSettingsResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest get-account-settings-request]
    (-> this (.getAccountSettings get-account-settings-request))))

(defn tag-resource
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a
   resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
   associated with that resource are deleted as well.

  tag-resource-request - `com.amazonaws.services.devicefarm.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.devicefarm.model.TagResourceResult`

  throws: com.amazonaws.services.devicefarm.model.NotFoundException - The specified entity was not found."
  (^com.amazonaws.services.devicefarm.model.TagResourceResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn create-instance-profile
  "Creates a profile that can be applied to one or more private fleet device instances.

  create-instance-profile-request - `com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest`

  returns: Result of the CreateInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest create-instance-profile-request]
    (-> this (.createInstanceProfile create-instance-profile-request))))

(defn update-device-instance
  "Updates information about an existing private device instance.

  update-device-instance-request - `com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest`

  returns: Result of the UpdateDeviceInstance operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest update-device-instance-request]
    (-> this (.updateDeviceInstance update-device-instance-request))))

(defn get-remote-access-session
  "Returns a link to a currently running remote access session.

  get-remote-access-session-request - Represents the request to get information about the specified remote access session. - `com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest`

  returns: Result of the GetRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult [^AWSDeviceFarm this ^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest get-remote-access-session-request]
    (-> this (.getRemoteAccessSession get-remote-access-session-request))))

