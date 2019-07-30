(ns com.amazonaws.services.devicefarm.AWSDeviceFarmClient
  "Client for accessing AWS Device Farm. All service calls made using this client are blocking, and will not return
  until the service call completes.


  AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
  phones, tablets, and other devices in the cloud."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.devicefarm AWSDeviceFarmClient]))

(defn ->aws-device-farm-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Device Farm (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSDeviceFarmClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSDeviceFarmClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSDeviceFarmClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSDeviceFarmClient aws-credentials client-configuration))
  (^AWSDeviceFarmClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSDeviceFarmClient client-configuration))
  (^AWSDeviceFarmClient []
    (new AWSDeviceFarmClient )))

(defn *builder
  "returns: `com.amazonaws.services.devicefarm.AWSDeviceFarmClientBuilder`"
  (^com.amazonaws.services.devicefarm.AWSDeviceFarmClientBuilder []
    (AWSDeviceFarmClient/builder )))

(defn get-instance-profile
  "Returns information about the specified instance profile.

  request - `com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest`

  returns: Result of the GetInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetInstanceProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetInstanceProfileResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest request]
    (-> this (.getInstanceProfile request))))

(defn purchase-offering
  "Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for
   an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is
   not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  request - `com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest`

  returns: Result of the PurchaseOffering operation returned by the service. - `com.amazonaws.services.devicefarm.model.PurchaseOfferingResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.PurchaseOfferingResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest request]
    (-> this (.purchaseOffering request))))

(defn list-tags-for-resource
  "List the tags for an AWS Device Farm resource.

  request - `com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.devicefarm.model.NotFoundException - The specified entity was not found."
  (^com.amazonaws.services.devicefarm.model.ListTagsForResourceResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-suites
  "Gets information about test suites for a given job.

  request - `com.amazonaws.services.devicefarm.model.ListSuitesRequest`

  returns: Result of the ListSuites operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListSuitesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListSuitesResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListSuitesRequest request]
    (-> this (.listSuites request))))

(defn get-job
  "Gets information about a job.

  request - `com.amazonaws.services.devicefarm.model.GetJobRequest`

  returns: Result of the GetJob operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetJobResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetJobResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetJobRequest request]
    (-> this (.getJob request))))

(defn list-uploads
  "Gets information about uploads, given an AWS Device Farm project ARN.

  request - `com.amazonaws.services.devicefarm.model.ListUploadsRequest`

  returns: Result of the ListUploads operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListUploadsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListUploadsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListUploadsRequest request]
    (-> this (.listUploads request))))

(defn update-upload
  "Update an uploaded test specification (test spec).

  request - `com.amazonaws.services.devicefarm.model.UpdateUploadRequest`

  returns: Result of the UpdateUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateUploadResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateUploadResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.UpdateUploadRequest request]
    (-> this (.updateUpload request))))

(defn list-offerings
  "Returns a list of products or offerings that the user can manage through the API. Each offering record indicates
   the recurring price per unit and the frequency for that offering. The API returns a NotEligible
   error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  request - `com.amazonaws.services.devicefarm.model.ListOfferingsRequest`

  returns: Result of the ListOfferings operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListOfferingsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListOfferingsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListOfferingsRequest request]
    (-> this (.listOfferings request))))

(defn renew-offering
  "Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of
   the next period. The API returns a NotEligible error if the user is not permitted to invoke the
   operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  request - `com.amazonaws.services.devicefarm.model.RenewOfferingRequest`

  returns: Result of the RenewOffering operation returned by the service. - `com.amazonaws.services.devicefarm.model.RenewOfferingResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.RenewOfferingResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.RenewOfferingRequest request]
    (-> this (.renewOffering request))))

(defn create-network-profile
  "Creates a network profile.

  request - `com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest`

  returns: Result of the CreateNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest request]
    (-> this (.createNetworkProfile request))))

(defn list-offering-promotions
  "Returns a list of offering promotions. Each offering promotion record contains the ID and description of the
   promotion. The API returns a NotEligible error if the caller is not permitted to invoke the
   operation. Contact aws-devicefarm-support@amazon.com if
   you believe that you should be able to invoke this operation.

  request - `com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest`

  returns: Result of the ListOfferingPromotions operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest request]
    (-> this (.listOfferingPromotions request))))

(defn get-device-pool-compatibility
  "Gets information about compatibility with a device pool.

  request - `com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest`

  returns: Result of the GetDevicePoolCompatibility operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest request]
    (-> this (.getDevicePoolCompatibility request))))

(defn list-vpce-configurations
  "Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.

  request - `com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest`

  returns: Result of the ListVPCEConfigurations operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest request]
    (-> this (.listVPCEConfigurations request))))

(defn delete-network-profile
  "Deletes a network profile.

  request - `com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest`

  returns: Result of the DeleteNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest request]
    (-> this (.deleteNetworkProfile request))))

(defn create-remote-access-session
  "Specifies and starts a remote access session.

  request - `com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest`

  returns: Result of the CreateRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest request]
    (-> this (.createRemoteAccessSession request))))

(defn get-network-profile
  "Returns information about a network profile.

  request - `com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest`

  returns: Result of the GetNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetNetworkProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetNetworkProfileResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest request]
    (-> this (.getNetworkProfile request))))

(defn get-upload
  "Gets information about an upload.

  request - `com.amazonaws.services.devicefarm.model.GetUploadRequest`

  returns: Result of the GetUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetUploadResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetUploadResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetUploadRequest request]
    (-> this (.getUpload request))))

(defn list-artifacts
  "Gets information about artifacts.

  request - `com.amazonaws.services.devicefarm.model.ListArtifactsRequest`

  returns: Result of the ListArtifacts operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListArtifactsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListArtifactsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListArtifactsRequest request]
    (-> this (.listArtifacts request))))

(defn untag-resource
  "Deletes the specified tags from a resource.

  request - `com.amazonaws.services.devicefarm.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.devicefarm.model.UntagResourceResult`

  throws: com.amazonaws.services.devicefarm.model.NotFoundException - The specified entity was not found."
  (^com.amazonaws.services.devicefarm.model.UntagResourceResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-run
  "Deletes the run, given the run ARN.


   Note Deleting this resource does not stop an in-progress run.

  request - `com.amazonaws.services.devicefarm.model.DeleteRunRequest`

  returns: Result of the DeleteRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteRunResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteRunResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.DeleteRunRequest request]
    (-> this (.deleteRun request))))

(defn update-network-profile
  "Updates the network profile with specific settings.

  request - `com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest`

  returns: Result of the UpdateNetworkProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest request]
    (-> this (.updateNetworkProfile request))))

(defn list-device-pools
  "Gets information about device pools.

  request - `com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest`

  returns: Result of the ListDevicePools operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListDevicePoolsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListDevicePoolsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest request]
    (-> this (.listDevicePools request))))

(defn create-project
  "Creates a new project.

  request - `com.amazonaws.services.devicefarm.model.CreateProjectRequest`

  returns: Result of the CreateProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateProjectResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateProjectResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.CreateProjectRequest request]
    (-> this (.createProject request))))

(defn list-instance-profiles
  "Returns information about all the instance profiles in an AWS account.

  request - `com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest`

  returns: Result of the ListInstanceProfiles operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest request]
    (-> this (.listInstanceProfiles request))))

(defn list-tests
  "Gets information about tests in a given test suite.

  request - `com.amazonaws.services.devicefarm.model.ListTestsRequest`

  returns: Result of the ListTests operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListTestsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListTestsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListTestsRequest request]
    (-> this (.listTests request))))

(defn list-samples
  "Gets information about samples, given an AWS Device Farm job ARN.

  request - `com.amazonaws.services.devicefarm.model.ListSamplesRequest`

  returns: Result of the ListSamples operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListSamplesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListSamplesResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListSamplesRequest request]
    (-> this (.listSamples request))))

(defn list-runs
  "Gets information about runs, given an AWS Device Farm project ARN.

  request - `com.amazonaws.services.devicefarm.model.ListRunsRequest`

  returns: Result of the ListRuns operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListRunsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListRunsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListRunsRequest request]
    (-> this (.listRuns request))))

(defn get-project
  "Gets information about a project.

  request - `com.amazonaws.services.devicefarm.model.GetProjectRequest`

  returns: Result of the GetProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetProjectResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetProjectResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetProjectRequest request]
    (-> this (.getProject request))))

(defn stop-run
  "Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where
   tests have not started executing, and you will not be billed for these devices. On devices where tests have
   started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those
   devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.

  request - `com.amazonaws.services.devicefarm.model.StopRunRequest`

  returns: Result of the StopRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.StopRunResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.StopRunResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.StopRunRequest request]
    (-> this (.stopRun request))))

(defn list-devices
  "Gets information about unique device types.

  request - `com.amazonaws.services.devicefarm.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListDevicesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListDevicesResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListDevicesRequest request]
    (-> this (.listDevices request))))

(defn list-remote-access-sessions
  "Returns a list of all currently running remote access sessions.

  request - `com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest`

  returns: Result of the ListRemoteAccessSessions operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest request]
    (-> this (.listRemoteAccessSessions request))))

(defn list-network-profiles
  "Returns the list of available network profiles.

  request - `com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest`

  returns: Result of the ListNetworkProfiles operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest request]
    (-> this (.listNetworkProfiles request))))

(defn stop-remote-access-session
  "Ends a specified remote access session.

  request - `com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest`

  returns: Result of the StopRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest request]
    (-> this (.stopRemoteAccessSession request))))

(defn delete-vpce-configuration
  "Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.

  request - `com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest`

  returns: Result of the DeleteVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest request]
    (-> this (.deleteVPCEConfiguration request))))

(defn update-vpce-configuration
  "Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.

  request - `com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest`

  returns: Result of the UpdateVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest request]
    (-> this (.updateVPCEConfiguration request))))

(defn install-to-remote-access-session
  "Installs an application to the device in a remote access session. For Android applications, the file must be in
   .apk format. For iOS applications, the file must be in .ipa format.

  request - `com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest`

  returns: Result of the InstallToRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest request]
    (-> this (.installToRemoteAccessSession request))))

(defn get-suite
  "Gets information about a suite.

  request - `com.amazonaws.services.devicefarm.model.GetSuiteRequest`

  returns: Result of the GetSuite operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetSuiteResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetSuiteResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetSuiteRequest request]
    (-> this (.getSuite request))))

(defn update-device-pool
  "Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates
   are all-or-nothing, meaning they can only be updated as a whole (or not at all).

  request - `com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest`

  returns: Result of the UpdateDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest request]
    (-> this (.updateDevicePool request))))

(defn create-device-pool
  "Creates a device pool.

  request - `com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest`

  returns: Result of the CreateDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateDevicePoolResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateDevicePoolResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest request]
    (-> this (.createDevicePool request))))

(defn delete-device-pool
  "Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.

  request - `com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest`

  returns: Result of the DeleteDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest request]
    (-> this (.deleteDevicePool request))))

(defn create-vpce-configuration
  "Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.

  request - `com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest`

  returns: Result of the CreateVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest request]
    (-> this (.createVPCEConfiguration request))))

(defn update-instance-profile
  "Updates information about an existing private device instance profile.

  request - `com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest`

  returns: Result of the UpdateInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest request]
    (-> this (.updateInstanceProfile request))))

(defn list-projects
  "Gets information about projects.

  request - `com.amazonaws.services.devicefarm.model.ListProjectsRequest`

  returns: Result of the ListProjects operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListProjectsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListProjectsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListProjectsRequest request]
    (-> this (.listProjects request))))

(defn delete-upload
  "Deletes an upload given the upload ARN.

  request - `com.amazonaws.services.devicefarm.model.DeleteUploadRequest`

  returns: Result of the DeleteUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteUploadResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteUploadResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.DeleteUploadRequest request]
    (-> this (.deleteUpload request))))

(defn get-device
  "Gets information about a unique device type.

  request - `com.amazonaws.services.devicefarm.model.GetDeviceRequest`

  returns: Result of the GetDevice operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDeviceResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetDeviceResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetDeviceRequest request]
    (-> this (.getDevice request))))

(defn get-vpce-configuration
  "Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.

  request - `com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest`

  returns: Result of the GetVPCEConfiguration operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetVPCEConfigurationResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest request]
    (-> this (.getVPCEConfiguration request))))

(defn list-jobs
  "Gets information about jobs for a given test run.

  request - `com.amazonaws.services.devicefarm.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListJobsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListJobsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn schedule-run
  "Schedules a run.

  request - `com.amazonaws.services.devicefarm.model.ScheduleRunRequest`

  returns: Result of the ScheduleRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.ScheduleRunResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ScheduleRunResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ScheduleRunRequest request]
    (-> this (.scheduleRun request))))

(defn update-project
  "Modifies the specified project name, given the project ARN and a new name.

  request - `com.amazonaws.services.devicefarm.model.UpdateProjectRequest`

  returns: Result of the UpdateProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateProjectResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateProjectResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.UpdateProjectRequest request]
    (-> this (.updateProject request))))

(defn list-offering-transactions
  "Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The
   list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a
   NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  request - `com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest`

  returns: Result of the ListOfferingTransactions operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest request]
    (-> this (.listOfferingTransactions request))))

(defn list-unique-problems
  "Gets information about unique problems.

  request - `com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest`

  returns: Result of the ListUniqueProblems operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest request]
    (-> this (.listUniqueProblems request))))

(defn get-run
  "Gets information about a run.

  request - `com.amazonaws.services.devicefarm.model.GetRunRequest`

  returns: Result of the GetRun operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetRunResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetRunResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetRunRequest request]
    (-> this (.getRun request))))

(defn delete-remote-access-session
  "Deletes a completed remote access session and its results.

  request - `com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest`

  returns: Result of the DeleteRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest request]
    (-> this (.deleteRemoteAccessSession request))))

(defn get-offering-status
  "Gets the current status and future status of all offerings purchased by an AWS account. The response indicates
   how many offerings are currently available and the offerings that will be available in the next period. The API
   returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  request - `com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest`

  returns: Result of the GetOfferingStatus operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetOfferingStatusResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetOfferingStatusResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest request]
    (-> this (.getOfferingStatus request))))

(defn delete-instance-profile
  "Deletes a profile that can be applied to one or more private device instances.

  request - `com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest`

  returns: Result of the DeleteInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest request]
    (-> this (.deleteInstanceProfile request))))

(defn list-device-instances
  "Returns information about the private device instances associated with one or more AWS accounts.

  request - `com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest`

  returns: Result of the ListDeviceInstances operation returned by the service. - `com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest request]
    (-> this (.listDeviceInstances request))))

(defn create-upload
  "Uploads an app or test scripts.

  request - `com.amazonaws.services.devicefarm.model.CreateUploadRequest`

  returns: Result of the CreateUpload operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateUploadResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateUploadResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.CreateUploadRequest request]
    (-> this (.createUpload request))))

(defn stop-job
  "Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where
   tests have not started executing, and you will not be billed for this device. On the device where tests have
   started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the
   device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.

  request - `com.amazonaws.services.devicefarm.model.StopJobRequest`

  returns: Result of the StopJob operation returned by the service. - `com.amazonaws.services.devicefarm.model.StopJobResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.StopJobResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.StopJobRequest request]
    (-> this (.stopJob request))))

(defn get-test
  "Gets information about a test.

  request - `com.amazonaws.services.devicefarm.model.GetTestRequest`

  returns: Result of the GetTest operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetTestResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetTestResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetTestRequest request]
    (-> this (.getTest request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSDeviceFarmClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-device-instance
  "Returns information about a device instance belonging to a private device fleet.

  request - `com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest`

  returns: Result of the GetDeviceInstance operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest request]
    (-> this (.getDeviceInstance request))))

(defn get-device-pool
  "Gets information about a device pool.

  request - `com.amazonaws.services.devicefarm.model.GetDevicePoolRequest`

  returns: Result of the GetDevicePool operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetDevicePoolResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetDevicePoolResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetDevicePoolRequest request]
    (-> this (.getDevicePool request))))

(defn delete-project
  "Deletes an AWS Device Farm project, given the project ARN.


   Note Deleting this resource does not stop an in-progress run.

  request - `com.amazonaws.services.devicefarm.model.DeleteProjectRequest`

  returns: Result of the DeleteProject operation returned by the service. - `com.amazonaws.services.devicefarm.model.DeleteProjectResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.DeleteProjectResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.DeleteProjectRequest request]
    (-> this (.deleteProject request))))

(defn get-account-settings
  "Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.

  request - `com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest`

  returns: Result of the GetAccountSettings operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetAccountSettingsResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetAccountSettingsResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest request]
    (-> this (.getAccountSettings request))))

(defn tag-resource
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a
   resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
   associated with that resource are deleted as well.

  request - `com.amazonaws.services.devicefarm.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.devicefarm.model.TagResourceResult`

  throws: com.amazonaws.services.devicefarm.model.NotFoundException - The specified entity was not found."
  (^com.amazonaws.services.devicefarm.model.TagResourceResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn create-instance-profile
  "Creates a profile that can be applied to one or more private fleet device instances.

  request - `com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest`

  returns: Result of the CreateInstanceProfile operation returned by the service. - `com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest request]
    (-> this (.createInstanceProfile request))))

(defn update-device-instance
  "Updates information about an existing private device instance.

  request - `com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest`

  returns: Result of the UpdateDeviceInstance operation returned by the service. - `com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest request]
    (-> this (.updateDeviceInstance request))))

(defn get-remote-access-session
  "Returns a link to a currently running remote access session.

  request - `com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest`

  returns: Result of the GetRemoteAccessSession operation returned by the service. - `com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult`

  throws: com.amazonaws.services.devicefarm.model.ArgumentException - An invalid argument was specified."
  (^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult [^AWSDeviceFarmClient this ^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest request]
    (-> this (.getRemoteAccessSession request))))

