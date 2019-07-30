(ns com.amazonaws.services.devicefarm.AbstractAWSDeviceFarmAsync
  "Abstract implementation of AWSDeviceFarmAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.devicefarm AbstractAWSDeviceFarmAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn stop-remote-access-session-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request to stop the remote access session. - `com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopRemoteAccessSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopRemoteAccessSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopRemoteAccessSessionRequest request]
    (-> this (.stopRemoteAccessSessionAsync request))))

(defn get-device-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the get device request. - `com.amazonaws.services.devicefarm.model.GetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetDeviceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDeviceRequest request]
    (-> this (.getDeviceAsync request))))

(defn get-account-settings-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request sent to retrieve the account settings. - `com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetAccountSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetAccountSettingsRequest request]
    (-> this (.getAccountSettingsAsync request))))

(defn list-remote-access-sessions-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request to return information about the remote access session. - `com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRemoteAccessSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRemoteAccessSessionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListRemoteAccessSessionsRequest request]
    (-> this (.listRemoteAccessSessionsAsync request))))

(defn get-network-profile-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNetworkProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetNetworkProfileRequest request]
    (-> this (.getNetworkProfileAsync request))))

(defn update-instance-profile-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateInstanceProfileRequest request]
    (-> this (.updateInstanceProfileAsync request))))

(defn list-jobs-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the list jobs operation. - `com.amazonaws.services.devicefarm.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn update-project-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the update project operation. - `com.amazonaws.services.devicefarm.model.UpdateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateProjectRequest request]
    (-> this (.updateProjectAsync request))))

(defn renew-offering-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - A request representing an offering renewal. - `com.amazonaws.services.devicefarm.model.RenewOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RenewOffering operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.RenewOfferingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.RenewOfferingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.renewOfferingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.RenewOfferingRequest request]
    (-> this (.renewOfferingAsync request))))

(defn create-project-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the create project operation. - `com.amazonaws.services.devicefarm.model.CreateProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateProjectRequest request]
    (-> this (.createProjectAsync request))))

(defn delete-upload-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the delete upload operation. - `com.amazonaws.services.devicefarm.model.DeleteUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteUploadResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteUploadRequest request]
    (-> this (.deleteUploadAsync request))))

(defn delete-run-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the delete run operation. - `com.amazonaws.services.devicefarm.model.DeleteRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteRunRequest request]
    (-> this (.deleteRunAsync request))))

(defn get-vpce-configuration-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVPCEConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetVPCEConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVPCEConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetVPCEConfigurationRequest request]
    (-> this (.getVPCEConfigurationAsync request))))

(defn list-suites-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the list suites operation. - `com.amazonaws.services.devicefarm.model.ListSuitesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSuites operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListSuitesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListSuitesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSuitesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListSuitesRequest request]
    (-> this (.listSuitesAsync request))))

(defn list-uploads-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the list uploads operation. - `com.amazonaws.services.devicefarm.model.ListUploadsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUploads operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListUploadsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListUploadsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUploadsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListUploadsRequest request]
    (-> this (.listUploadsAsync request))))

(defn create-vpce-configuration-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVPCEConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVPCEConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateVPCEConfigurationRequest request]
    (-> this (.createVPCEConfigurationAsync request))))

(defn update-vpce-configuration-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVPCEConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVPCEConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateVPCEConfigurationRequest request]
    (-> this (.updateVPCEConfigurationAsync request))))

(defn update-upload-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.UpdateUploadRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateUploadResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateUploadRequest request]
    (-> this (.updateUploadAsync request))))

(defn get-device-instance-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeviceInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetDeviceInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDeviceInstanceRequest request]
    (-> this (.getDeviceInstanceAsync request))))

(defn list-projects-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the list projects operation. - `com.amazonaws.services.devicefarm.model.ListProjectsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProjects operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListProjectsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListProjectsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProjectsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListProjectsRequest request]
    (-> this (.listProjectsAsync request))))

(defn update-device-instance-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeviceInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateDeviceInstanceRequest request]
    (-> this (.updateDeviceInstanceAsync request))))

(defn get-project-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the get project operation. - `com.amazonaws.services.devicefarm.model.GetProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetProjectRequest request]
    (-> this (.getProjectAsync request))))

(defn delete-network-profile-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteNetworkProfileRequest request]
    (-> this (.deleteNetworkProfileAsync request))))

(defn get-remote-access-session-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request to get information about the specified remote access session. - `com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRemoteAccessSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRemoteAccessSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetRemoteAccessSessionRequest request]
    (-> this (.getRemoteAccessSessionAsync request))))

(defn purchase-offering-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request for a purchase offering. - `com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseOffering operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.PurchaseOfferingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseOfferingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.PurchaseOfferingRequest request]
    (-> this (.purchaseOfferingAsync request))))

(defn list-offering-transactions-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request to list the offering transaction history. - `com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOfferingTransactions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListOfferingTransactionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOfferingTransactionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingTransactionsRequest request]
    (-> this (.listOfferingTransactionsAsync request))))

(defn create-device-pool-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the create device pool operation. - `com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDevicePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateDevicePoolResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDevicePoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateDevicePoolRequest request]
    (-> this (.createDevicePoolAsync request))))

(defn install-to-remote-access-session-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa format) as part of a remote access session. - `com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InstallToRemoteAccessSession operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.installToRemoteAccessSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.InstallToRemoteAccessSessionRequest request]
    (-> this (.installToRemoteAccessSessionAsync request))))

(defn get-test-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the get test operation. - `com.amazonaws.services.devicefarm.model.GetTestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetTestResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetTestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTestAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetTestRequest request]
    (-> this (.getTestAsync request))))

(defn delete-project-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the delete project operation. - `com.amazonaws.services.devicefarm.model.DeleteProjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteProjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteProjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteProjectRequest request]
    (-> this (.deleteProjectAsync request))))

(defn update-network-profile-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNetworkProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateNetworkProfileRequest request]
    (-> this (.updateNetworkProfileAsync request))))

(defn create-instance-profile-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateInstanceProfileRequest request]
    (-> this (.createInstanceProfileAsync request))))

(defn list-device-pools-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the result of a list device pools request. - `com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevicePools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListDevicePoolsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicePoolsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDevicePoolsRequest request]
    (-> this (.listDevicePoolsAsync request))))

(defn get-device-pool-compatibility-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the get device pool compatibility operation. - `com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevicePoolCompatibility operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevicePoolCompatibilityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDevicePoolCompatibilityRequest request]
    (-> this (.getDevicePoolCompatibilityAsync request))))

(defn delete-vpce-configuration-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVPCEConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVPCEConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteVPCEConfigurationRequest request]
    (-> this (.deleteVPCEConfigurationAsync request))))

(defn list-tests-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the list tests operation. - `com.amazonaws.services.devicefarm.model.ListTestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListTestsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListTestsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTestsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListTestsRequest request]
    (-> this (.listTestsAsync request))))

(defn delete-remote-access-session-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request to delete the specified remote access session. - `com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRemoteAccessSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRemoteAccessSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteRemoteAccessSessionRequest request]
    (-> this (.deleteRemoteAccessSessionAsync request))))

(defn delete-device-pool-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the delete device pool operation. - `com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDevicePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteDevicePoolResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDevicePoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteDevicePoolRequest request]
    (-> this (.deleteDevicePoolAsync request))))

(defn get-suite-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the get suite operation. - `com.amazonaws.services.devicefarm.model.GetSuiteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSuite operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetSuiteResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetSuiteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSuiteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetSuiteRequest request]
    (-> this (.getSuiteAsync request))))

(defn list-devices-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the result of a list devices request. - `com.amazonaws.services.devicefarm.model.ListDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListDevicesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDevicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDevicesRequest request]
    (-> this (.listDevicesAsync request))))

(defn get-offering-status-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request to retrieve the offering status for the specified customer or account. - `com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOfferingStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetOfferingStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOfferingStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetOfferingStatusRequest request]
    (-> this (.getOfferingStatusAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn schedule-run-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the schedule run operation. - `com.amazonaws.services.devicefarm.model.ScheduleRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ScheduleRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ScheduleRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ScheduleRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scheduleRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ScheduleRunRequest request]
    (-> this (.scheduleRunAsync request))))

(defn list-unique-problems-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the list unique problems operation. - `com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUniqueProblems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListUniqueProblemsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUniqueProblemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListUniqueProblemsRequest request]
    (-> this (.listUniqueProblemsAsync request))))

(defn list-instance-profiles-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListInstanceProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListInstanceProfilesRequest request]
    (-> this (.listInstanceProfilesAsync request))))

(defn list-network-profiles-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNetworkProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListNetworkProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNetworkProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListNetworkProfilesRequest request]
    (-> this (.listNetworkProfilesAsync request))))

(defn stop-run-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request to stop a specific run. - `com.amazonaws.services.devicefarm.model.StopRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.StopRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopRunRequest request]
    (-> this (.stopRunAsync request))))

(defn get-device-pool-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the get device pool operation. - `com.amazonaws.services.devicefarm.model.GetDevicePoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevicePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetDevicePoolResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDevicePoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDevicePoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetDevicePoolRequest request]
    (-> this (.getDevicePoolAsync request))))

(defn list-device-instances-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeviceInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListDeviceInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeviceInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListDeviceInstancesRequest request]
    (-> this (.listDeviceInstancesAsync request))))

(defn list-offerings-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents the request to list all offerings. - `com.amazonaws.services.devicefarm.model.ListOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOfferings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListOfferingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOfferingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingsRequest request]
    (-> this (.listOfferingsAsync request))))

(defn list-samples-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the list samples operation. - `com.amazonaws.services.devicefarm.model.ListSamplesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSamples operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListSamplesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListSamplesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSamplesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListSamplesRequest request]
    (-> this (.listSamplesAsync request))))

(defn list-runs-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the list runs operation. - `com.amazonaws.services.devicefarm.model.ListRunsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListRunsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListRunsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRunsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListRunsRequest request]
    (-> this (.listRunsAsync request))))

(defn list-artifacts-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the list artifacts operation. - `com.amazonaws.services.devicefarm.model.ListArtifactsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListArtifacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListArtifactsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListArtifactsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listArtifactsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListArtifactsRequest request]
    (-> this (.listArtifactsAsync request))))

(defn get-run-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the get run operation. - `com.amazonaws.services.devicefarm.model.GetRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetRunResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetRunRequest request]
    (-> this (.getRunAsync request))))

(defn delete-instance-profile-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.DeleteInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.DeleteInstanceProfileRequest request]
    (-> this (.deleteInstanceProfileAsync request))))

(defn update-device-pool-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the update device pool operation. - `com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDevicePool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.UpdateDevicePoolResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDevicePoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.UpdateDevicePoolRequest request]
    (-> this (.updateDevicePoolAsync request))))

(defn list-vpce-configurations-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVPCEConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVPCEConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListVPCEConfigurationsRequest request]
    (-> this (.listVPCEConfigurationsAsync request))))

(defn get-upload-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the get upload operation. - `com.amazonaws.services.devicefarm.model.GetUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetUploadResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetUploadRequest request]
    (-> this (.getUploadAsync request))))

(defn create-remote-access-session-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Creates and submits a request to start a remote access session. - `com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRemoteAccessSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRemoteAccessSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateRemoteAccessSessionRequest request]
    (-> this (.createRemoteAccessSessionAsync request))))

(defn get-instance-profile-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetInstanceProfileRequest request]
    (-> this (.getInstanceProfileAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn get-job-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the get job operation. - `com.amazonaws.services.devicefarm.model.GetJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.GetJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.GetJobRequest request]
    (-> this (.getJobAsync request))))

(defn list-offering-promotions-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOfferingPromotions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.ListOfferingPromotionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOfferingPromotionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.ListOfferingPromotionsRequest request]
    (-> this (.listOfferingPromotionsAsync request))))

(defn create-network-profile-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateNetworkProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateNetworkProfileRequest request]
    (-> this (.createNetworkProfileAsync request))))

(defn stop-job-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - `com.amazonaws.services.devicefarm.model.StopJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.StopJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.StopJobRequest request]
    (-> this (.stopJobAsync request))))

(defn create-upload-async
  "Description copied from interface: AWSDeviceFarmAsync

  request - Represents a request to the create upload operation. - `com.amazonaws.services.devicefarm.model.CreateUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.devicefarm.model.CreateUploadResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDeviceFarmAsync this ^com.amazonaws.services.devicefarm.model.CreateUploadRequest request]
    (-> this (.createUploadAsync request))))

