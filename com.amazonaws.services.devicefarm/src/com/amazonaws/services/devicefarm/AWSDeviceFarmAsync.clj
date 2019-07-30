(ns com.amazonaws.services.devicefarm.AWSDeviceFarmAsync
  "Interface for accessing AWS Device Farm asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSDeviceFarmAsync instead.



  AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
  phones, tablets, and other devices in the cloud."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.devicefarm AWSDeviceFarmAsync]))

(defn untag-resource-async
  "Deletes the specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.devicefarm.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn stop-remote-access-session-async
  "Ends a specified remote access session.

  stop-remote-access-session-request - Represents the request to stop the remote access session. - `com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopRemoteAccessSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest stop-remote-access-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopRemoteAccessSessionAsync stop-remote-access-session-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest stop-remote-access-session-request]
    (-> this (.stopRemoteAccessSessionAsync stop-remote-access-session-request))))

(defn get-device-async
  "Gets information about a unique device type.

  get-device-request - Represents a request to the get device request. - `com.amazonaws.services.devicefarm.model.GetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetDeviceResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDeviceRequest get-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceAsync get-device-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDeviceRequest get-device-request]
    (-> this (.getDeviceAsync get-device-request))))

(defn get-account-settings-async
  "Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.

  get-account-settings-request - Represents the request sent to retrieve the account settings. - `com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetAccountSettingsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest get-account-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSettingsAsync get-account-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest get-account-settings-request]
    (-> this (.getAccountSettingsAsync get-account-settings-request))))

(defn list-remote-access-sessions-async
  "Returns a list of all currently running remote access sessions.

  list-remote-access-sessions-request - Represents the request to return information about the remote access session. - `com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRemoteAccessSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest list-remote-access-sessions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRemoteAccessSessionsAsync list-remote-access-sessions-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest list-remote-access-sessions-request]
    (-> this (.listRemoteAccessSessionsAsync list-remote-access-sessions-request))))

(defn get-network-profile-async
  "Returns information about a network profile.

  get-network-profile-request - `com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest get-network-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNetworkProfileAsync get-network-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest get-network-profile-request]
    (-> this (.getNetworkProfileAsync get-network-profile-request))))

(defn update-instance-profile-async
  "Updates information about an existing private device instance profile.

  update-instance-profile-request - `com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest update-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInstanceProfileAsync update-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest update-instance-profile-request]
    (-> this (.updateInstanceProfileAsync update-instance-profile-request))))

(defn list-jobs-async
  "Gets information about jobs for a given test run.

  list-jobs-request - Represents a request to the list jobs operation. - `com.amazonaws.services.devicefarm.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListJobsRequest list-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync list-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobsAsync list-jobs-request))))

(defn update-project-async
  "Modifies the specified project name, given the project ARN and a new name.

  update-project-request - Represents a request to the update project operation. - `com.amazonaws.services.devicefarm.model.UpdateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateProjectRequest update-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync update-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateProjectRequest update-project-request]
    (-> this (.updateProjectAsync update-project-request))))

(defn renew-offering-async
  "Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of
   the next period. The API returns a NotEligible error if the user is not permitted to invoke the
   operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  renew-offering-request - A request representing an offering renewal. - `com.amazonaws.services.devicefarm.model.RenewOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RenewOffering operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.RenewOfferingResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.RenewOfferingRequest renew-offering-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.renewOfferingAsync renew-offering-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.RenewOfferingRequest renew-offering-request]
    (-> this (.renewOfferingAsync renew-offering-request))))

(defn create-project-async
  "Creates a new project.

  create-project-request - Represents a request to the create project operation. - `com.amazonaws.services.devicefarm.model.CreateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateProjectRequest create-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync create-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateProjectRequest create-project-request]
    (-> this (.createProjectAsync create-project-request))))

(defn delete-upload-async
  "Deletes an upload given the upload ARN.

  delete-upload-request - Represents a request to the delete upload operation. - `com.amazonaws.services.devicefarm.model.DeleteUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteUploadResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteUploadRequest delete-upload-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUploadAsync delete-upload-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteUploadRequest delete-upload-request]
    (-> this (.deleteUploadAsync delete-upload-request))))

(defn delete-run-async
  "Deletes the run, given the run ARN.


   Note Deleting this resource does not stop an in-progress run.

  delete-run-request - Represents a request to the delete run operation. - `com.amazonaws.services.devicefarm.model.DeleteRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteRunResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteRunRequest delete-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRunAsync delete-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteRunRequest delete-run-request]
    (-> this (.deleteRunAsync delete-run-request))))

(defn get-vpce-configuration-async
  "Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.

  get-vpce-configuration-request - `com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVPCEConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetVPCEConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest get-vpce-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVPCEConfigurationAsync get-vpce-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest get-vpce-configuration-request]
    (-> this (.getVPCEConfigurationAsync get-vpce-configuration-request))))

(defn list-suites-async
  "Gets information about test suites for a given job.

  list-suites-request - Represents a request to the list suites operation. - `com.amazonaws.services.devicefarm.model.ListSuitesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSuites operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListSuitesResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListSuitesRequest list-suites-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSuitesAsync list-suites-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListSuitesRequest list-suites-request]
    (-> this (.listSuitesAsync list-suites-request))))

(defn list-uploads-async
  "Gets information about uploads, given an AWS Device Farm project ARN.

  list-uploads-request - Represents a request to the list uploads operation. - `com.amazonaws.services.devicefarm.model.ListUploadsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUploads operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListUploadsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListUploadsRequest list-uploads-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUploadsAsync list-uploads-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListUploadsRequest list-uploads-request]
    (-> this (.listUploadsAsync list-uploads-request))))

(defn create-vpce-configuration-async
  "Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.

  create-vpce-configuration-request - `com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVPCEConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest create-vpce-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVPCEConfigurationAsync create-vpce-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest create-vpce-configuration-request]
    (-> this (.createVPCEConfigurationAsync create-vpce-configuration-request))))

(defn update-vpce-configuration-async
  "Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.

  update-vpce-configuration-request - `com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVPCEConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest update-vpce-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVPCEConfigurationAsync update-vpce-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest update-vpce-configuration-request]
    (-> this (.updateVPCEConfigurationAsync update-vpce-configuration-request))))

(defn update-upload-async
  "Update an uploaded test specification (test spec).

  update-upload-request - `com.amazonaws.services.devicefarm.model.UpdateUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateUploadResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateUploadRequest update-upload-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUploadAsync update-upload-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateUploadRequest update-upload-request]
    (-> this (.updateUploadAsync update-upload-request))))

(defn get-device-instance-async
  "Returns information about a device instance belonging to a private device fleet.

  get-device-instance-request - `com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeviceInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest get-device-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceInstanceAsync get-device-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest get-device-instance-request]
    (-> this (.getDeviceInstanceAsync get-device-instance-request))))

(defn list-projects-async
  "Gets information about projects.

  list-projects-request - Represents a request to the list projects operation. - `com.amazonaws.services.devicefarm.model.ListProjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListProjectsRequest list-projects-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync list-projects-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListProjectsRequest list-projects-request]
    (-> this (.listProjectsAsync list-projects-request))))

(defn update-device-instance-async
  "Updates information about an existing private device instance.

  update-device-instance-request - `com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeviceInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest update-device-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceInstanceAsync update-device-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest update-device-instance-request]
    (-> this (.updateDeviceInstanceAsync update-device-instance-request))))

(defn get-project-async
  "Gets information about a project.

  get-project-request - Represents a request to the get project operation. - `com.amazonaws.services.devicefarm.model.GetProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetProjectResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetProjectRequest get-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProjectAsync get-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetProjectRequest get-project-request]
    (-> this (.getProjectAsync get-project-request))))

(defn delete-network-profile-async
  "Deletes a network profile.

  delete-network-profile-request - `com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest delete-network-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkProfileAsync delete-network-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest delete-network-profile-request]
    (-> this (.deleteNetworkProfileAsync delete-network-profile-request))))

(defn get-remote-access-session-async
  "Returns a link to a currently running remote access session.

  get-remote-access-session-request - Represents the request to get information about the specified remote access session. - `com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRemoteAccessSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest get-remote-access-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRemoteAccessSessionAsync get-remote-access-session-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest get-remote-access-session-request]
    (-> this (.getRemoteAccessSessionAsync get-remote-access-session-request))))

(defn purchase-offering-async
  "Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for
   an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is
   not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  purchase-offering-request - Represents a request for a purchase offering. - `com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseOffering operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.PurchaseOfferingResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest purchase-offering-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseOfferingAsync purchase-offering-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest purchase-offering-request]
    (-> this (.purchaseOfferingAsync purchase-offering-request))))

(defn list-offering-transactions-async
  "Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The
   list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a
   NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  list-offering-transactions-request - Represents the request to list the offering transaction history. - `com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOfferingTransactions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest list-offering-transactions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOfferingTransactionsAsync list-offering-transactions-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest list-offering-transactions-request]
    (-> this (.listOfferingTransactionsAsync list-offering-transactions-request))))

(defn create-device-pool-async
  "Creates a device pool.

  create-device-pool-request - Represents a request to the create device pool operation. - `com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDevicePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateDevicePoolResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest create-device-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDevicePoolAsync create-device-pool-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest create-device-pool-request]
    (-> this (.createDevicePoolAsync create-device-pool-request))))

(defn install-to-remote-access-session-async
  "Installs an application to the device in a remote access session. For Android applications, the file must be in
   .apk format. For iOS applications, the file must be in .ipa format.

  install-to-remote-access-session-request - Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa format) as part of a remote access session. - `com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InstallToRemoteAccessSession operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest install-to-remote-access-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.installToRemoteAccessSessionAsync install-to-remote-access-session-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest install-to-remote-access-session-request]
    (-> this (.installToRemoteAccessSessionAsync install-to-remote-access-session-request))))

(defn get-test-async
  "Gets information about a test.

  get-test-request - Represents a request to the get test operation. - `com.amazonaws.services.devicefarm.model.GetTestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetTestResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetTestRequest get-test-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTestAsync get-test-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetTestRequest get-test-request]
    (-> this (.getTestAsync get-test-request))))

(defn delete-project-async
  "Deletes an AWS Device Farm project, given the project ARN.


   Note Deleting this resource does not stop an in-progress run.

  delete-project-request - Represents a request to the delete project operation. - `com.amazonaws.services.devicefarm.model.DeleteProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteProjectRequest delete-project-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync delete-project-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteProjectRequest delete-project-request]
    (-> this (.deleteProjectAsync delete-project-request))))

(defn update-network-profile-async
  "Updates the network profile with specific settings.

  update-network-profile-request - `com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest update-network-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNetworkProfileAsync update-network-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest update-network-profile-request]
    (-> this (.updateNetworkProfileAsync update-network-profile-request))))

(defn create-instance-profile-async
  "Creates a profile that can be applied to one or more private fleet device instances.

  create-instance-profile-request - `com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest create-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceProfileAsync create-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest create-instance-profile-request]
    (-> this (.createInstanceProfileAsync create-instance-profile-request))))

(defn list-device-pools-async
  "Gets information about device pools.

  list-device-pools-request - Represents the result of a list device pools request. - `com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevicePools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListDevicePoolsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest list-device-pools-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicePoolsAsync list-device-pools-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest list-device-pools-request]
    (-> this (.listDevicePoolsAsync list-device-pools-request))))

(defn get-device-pool-compatibility-async
  "Gets information about compatibility with a device pool.

  get-device-pool-compatibility-request - Represents a request to the get device pool compatibility operation. - `com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevicePoolCompatibility operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest get-device-pool-compatibility-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevicePoolCompatibilityAsync get-device-pool-compatibility-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest get-device-pool-compatibility-request]
    (-> this (.getDevicePoolCompatibilityAsync get-device-pool-compatibility-request))))

(defn delete-vpce-configuration-async
  "Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.

  delete-vpce-configuration-request - `com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVPCEConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest delete-vpce-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVPCEConfigurationAsync delete-vpce-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest delete-vpce-configuration-request]
    (-> this (.deleteVPCEConfigurationAsync delete-vpce-configuration-request))))

(defn list-tests-async
  "Gets information about tests in a given test suite.

  list-tests-request - Represents a request to the list tests operation. - `com.amazonaws.services.devicefarm.model.ListTestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListTestsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListTestsRequest list-tests-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTestsAsync list-tests-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListTestsRequest list-tests-request]
    (-> this (.listTestsAsync list-tests-request))))

(defn delete-remote-access-session-async
  "Deletes a completed remote access session and its results.

  delete-remote-access-session-request - Represents the request to delete the specified remote access session. - `com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRemoteAccessSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest delete-remote-access-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRemoteAccessSessionAsync delete-remote-access-session-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest delete-remote-access-session-request]
    (-> this (.deleteRemoteAccessSessionAsync delete-remote-access-session-request))))

(defn delete-device-pool-async
  "Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.

  delete-device-pool-request - Represents a request to the delete device pool operation. - `com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDevicePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest delete-device-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDevicePoolAsync delete-device-pool-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest delete-device-pool-request]
    (-> this (.deleteDevicePoolAsync delete-device-pool-request))))

(defn get-suite-async
  "Gets information about a suite.

  get-suite-request - Represents a request to the get suite operation. - `com.amazonaws.services.devicefarm.model.GetSuiteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSuite operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetSuiteResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetSuiteRequest get-suite-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSuiteAsync get-suite-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetSuiteRequest get-suite-request]
    (-> this (.getSuiteAsync get-suite-request))))

(defn list-devices-async
  "Gets information about unique device types.

  list-devices-request - Represents the result of a list devices request. - `com.amazonaws.services.devicefarm.model.ListDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListDevicesResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDevicesRequest list-devices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicesAsync list-devices-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDevicesRequest list-devices-request]
    (-> this (.listDevicesAsync list-devices-request))))

(defn get-offering-status-async
  "Gets the current status and future status of all offerings purchased by an AWS account. The response indicates
   how many offerings are currently available and the offerings that will be available in the next period. The API
   returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  get-offering-status-request - Represents the request to retrieve the offering status for the specified customer or account. - `com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOfferingStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetOfferingStatusResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest get-offering-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOfferingStatusAsync get-offering-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest get-offering-status-request]
    (-> this (.getOfferingStatusAsync get-offering-status-request))))

(defn list-tags-for-resource-async
  "List the tags for an AWS Device Farm resource.

  list-tags-for-resource-request - `com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn schedule-run-async
  "Schedules a run.

  schedule-run-request - Represents a request to the schedule run operation. - `com.amazonaws.services.devicefarm.model.ScheduleRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ScheduleRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ScheduleRunResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ScheduleRunRequest schedule-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scheduleRunAsync schedule-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ScheduleRunRequest schedule-run-request]
    (-> this (.scheduleRunAsync schedule-run-request))))

(defn list-unique-problems-async
  "Gets information about unique problems.

  list-unique-problems-request - Represents a request to the list unique problems operation. - `com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUniqueProblems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest list-unique-problems-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUniqueProblemsAsync list-unique-problems-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest list-unique-problems-request]
    (-> this (.listUniqueProblemsAsync list-unique-problems-request))))

(defn list-instance-profiles-async
  "Returns information about all the instance profiles in an AWS account.

  list-instance-profiles-request - `com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest list-instance-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceProfilesAsync list-instance-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest list-instance-profiles-request]
    (-> this (.listInstanceProfilesAsync list-instance-profiles-request))))

(defn list-network-profiles-async
  "Returns the list of available network profiles.

  list-network-profiles-request - `com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNetworkProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest list-network-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNetworkProfilesAsync list-network-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest list-network-profiles-request]
    (-> this (.listNetworkProfilesAsync list-network-profiles-request))))

(defn stop-run-async
  "Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where
   tests have not started executing, and you will not be billed for these devices. On devices where tests have
   started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those
   devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.

  stop-run-request - Represents the request to stop a specific run. - `com.amazonaws.services.devicefarm.model.StopRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.StopRunResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopRunRequest stop-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopRunAsync stop-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopRunRequest stop-run-request]
    (-> this (.stopRunAsync stop-run-request))))

(defn get-device-pool-async
  "Gets information about a device pool.

  get-device-pool-request - Represents a request to the get device pool operation. - `com.amazonaws.services.devicefarm.model.GetDevicePoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevicePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetDevicePoolResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDevicePoolRequest get-device-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevicePoolAsync get-device-pool-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDevicePoolRequest get-device-pool-request]
    (-> this (.getDevicePoolAsync get-device-pool-request))))

(defn list-device-instances-async
  "Returns information about the private device instances associated with one or more AWS accounts.

  list-device-instances-request - `com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest list-device-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceInstancesAsync list-device-instances-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest list-device-instances-request]
    (-> this (.listDeviceInstancesAsync list-device-instances-request))))

(defn list-offerings-async
  "Returns a list of products or offerings that the user can manage through the API. Each offering record indicates
   the recurring price per unit and the frequency for that offering. The API returns a NotEligible
   error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you
   should be able to invoke this operation.

  list-offerings-request - Represents the request to list all offerings. - `com.amazonaws.services.devicefarm.model.ListOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOfferings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListOfferingsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingsRequest list-offerings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOfferingsAsync list-offerings-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingsRequest list-offerings-request]
    (-> this (.listOfferingsAsync list-offerings-request))))

(defn list-samples-async
  "Gets information about samples, given an AWS Device Farm job ARN.

  list-samples-request - Represents a request to the list samples operation. - `com.amazonaws.services.devicefarm.model.ListSamplesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSamples operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListSamplesResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListSamplesRequest list-samples-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSamplesAsync list-samples-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListSamplesRequest list-samples-request]
    (-> this (.listSamplesAsync list-samples-request))))

(defn list-runs-async
  "Gets information about runs, given an AWS Device Farm project ARN.

  list-runs-request - Represents a request to the list runs operation. - `com.amazonaws.services.devicefarm.model.ListRunsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListRunsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListRunsRequest list-runs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRunsAsync list-runs-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListRunsRequest list-runs-request]
    (-> this (.listRunsAsync list-runs-request))))

(defn list-artifacts-async
  "Gets information about artifacts.

  list-artifacts-request - Represents a request to the list artifacts operation. - `com.amazonaws.services.devicefarm.model.ListArtifactsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListArtifacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListArtifactsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListArtifactsRequest list-artifacts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listArtifactsAsync list-artifacts-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListArtifactsRequest list-artifacts-request]
    (-> this (.listArtifactsAsync list-artifacts-request))))

(defn get-run-async
  "Gets information about a run.

  get-run-request - Represents a request to the get run operation. - `com.amazonaws.services.devicefarm.model.GetRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetRunResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetRunRequest get-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRunAsync get-run-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetRunRequest get-run-request]
    (-> this (.getRunAsync get-run-request))))

(defn delete-instance-profile-async
  "Deletes a profile that can be applied to one or more private device instances.

  delete-instance-profile-request - `com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest delete-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceProfileAsync delete-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest delete-instance-profile-request]
    (-> this (.deleteInstanceProfileAsync delete-instance-profile-request))))

(defn update-device-pool-async
  "Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates
   are all-or-nothing, meaning they can only be updated as a whole (or not at all).

  update-device-pool-request - Represents a request to the update device pool operation. - `com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDevicePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest update-device-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDevicePoolAsync update-device-pool-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest update-device-pool-request]
    (-> this (.updateDevicePoolAsync update-device-pool-request))))

(defn list-vpce-configurations-async
  "Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.

  list-vpce-configurations-request - `com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVPCEConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest list-vpce-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVPCEConfigurationsAsync list-vpce-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest list-vpce-configurations-request]
    (-> this (.listVPCEConfigurationsAsync list-vpce-configurations-request))))

(defn get-upload-async
  "Gets information about an upload.

  get-upload-request - Represents a request to the get upload operation. - `com.amazonaws.services.devicefarm.model.GetUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetUploadResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetUploadRequest get-upload-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUploadAsync get-upload-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetUploadRequest get-upload-request]
    (-> this (.getUploadAsync get-upload-request))))

(defn create-remote-access-session-async
  "Specifies and starts a remote access session.

  create-remote-access-session-request - Creates and submits a request to start a remote access session. - `com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRemoteAccessSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest create-remote-access-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRemoteAccessSessionAsync create-remote-access-session-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest create-remote-access-session-request]
    (-> this (.createRemoteAccessSessionAsync create-remote-access-session-request))))

(defn get-instance-profile-async
  "Returns information about the specified instance profile.

  get-instance-profile-request - `com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest get-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceProfileAsync get-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest get-instance-profile-request]
    (-> this (.getInstanceProfileAsync get-instance-profile-request))))

(defn tag-resource-async
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a
   resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
   associated with that resource are deleted as well.

  tag-resource-request - `com.amazonaws.services.devicefarm.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn get-job-async
  "Gets information about a job.

  get-job-request - Represents a request to the get job operation. - `com.amazonaws.services.devicefarm.model.GetJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetJobResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetJobRequest get-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobAsync get-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetJobRequest get-job-request]
    (-> this (.getJobAsync get-job-request))))

(defn list-offering-promotions-async
  "Returns a list of offering promotions. Each offering promotion record contains the ID and description of the
   promotion. The API returns a NotEligible error if the caller is not permitted to invoke the
   operation. Contact aws-devicefarm-support@amazon.com if
   you believe that you should be able to invoke this operation.

  list-offering-promotions-request - `com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOfferingPromotions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest list-offering-promotions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOfferingPromotionsAsync list-offering-promotions-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest list-offering-promotions-request]
    (-> this (.listOfferingPromotionsAsync list-offering-promotions-request))))

(defn create-network-profile-async
  "Creates a network profile.

  create-network-profile-request - `com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest create-network-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkProfileAsync create-network-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest create-network-profile-request]
    (-> this (.createNetworkProfileAsync create-network-profile-request))))

(defn stop-job-async
  "Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where
   tests have not started executing, and you will not be billed for this device. On the device where tests have
   started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the
   device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.

  stop-job-request - `com.amazonaws.services.devicefarm.model.StopJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.StopJobResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopJobRequest stop-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopJobAsync stop-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopJobRequest stop-job-request]
    (-> this (.stopJobAsync stop-job-request))))

(defn create-upload-async
  "Uploads an app or test scripts.

  create-upload-request - Represents a request to the create upload operation. - `com.amazonaws.services.devicefarm.model.CreateUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateUploadResult>`"
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateUploadRequest create-upload-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUploadAsync create-upload-request async-handler)))
  (^java.util.concurrent.Future [^AWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateUploadRequest create-upload-request]
    (-> this (.createUploadAsync create-upload-request))))

