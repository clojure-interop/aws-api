(ns com.amazonaws.services.directory.AbstractAWSDirectoryServiceAsync
  "Abstract implementation of AWSDirectoryServiceAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.directory AbstractAWSDirectoryServiceAsync]))

(defn disable-radius-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the DisableRadius operation. - `com.amazonaws.services.directory.model.DisableRadiusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableRadius operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DisableRadiusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DisableRadiusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableRadiusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DisableRadiusRequest request]
    (-> this (.disableRadiusAsync request))))

(defn delete-trust-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory and the external domain. - `com.amazonaws.services.directory.model.DeleteTrustRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrust operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteTrustResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteTrustRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrustAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteTrustRequest request]
    (-> this (.deleteTrustAsync request))))

(defn describe-directories-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the DescribeDirectories operation. - `com.amazonaws.services.directory.model.DescribeDirectoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeDirectoriesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeDirectoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeDirectoriesRequest request]
    (-> this (.describeDirectoriesAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this]
    (-> this (.describeDirectoriesAsync))))

(defn verify-trust-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory and an external domain. - `com.amazonaws.services.directory.model.VerifyTrustRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyTrust operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.VerifyTrustResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.VerifyTrustRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyTrustAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.VerifyTrustRequest request]
    (-> this (.verifyTrustAsync request))))

(defn start-schema-extension-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.StartSchemaExtensionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSchemaExtension operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.StartSchemaExtensionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.StartSchemaExtensionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSchemaExtensionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.StartSchemaExtensionRequest request]
    (-> this (.startSchemaExtensionAsync request))))

(defn create-microsoft-ad-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Creates an AWS Managed Microsoft AD directory. - `com.amazonaws.services.directory.model.CreateMicrosoftADRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMicrosoftAD operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateMicrosoftADResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateMicrosoftADRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMicrosoftADAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateMicrosoftADRequest request]
    (-> this (.createMicrosoftADAsync request))))

(defn describe-domain-controllers-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.DescribeDomainControllersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDomainControllers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeDomainControllersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeDomainControllersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDomainControllersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeDomainControllersRequest request]
    (-> this (.describeDomainControllersAsync request))))

(defn connect-directory-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the ConnectDirectory operation. - `com.amazonaws.services.directory.model.ConnectDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConnectDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ConnectDirectoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ConnectDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.connectDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ConnectDirectoryRequest request]
    (-> this (.connectDirectoryAsync request))))

(defn reject-shared-directory-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.RejectSharedDirectoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectSharedDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RejectSharedDirectoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RejectSharedDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectSharedDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RejectSharedDirectoryRequest request]
    (-> this (.rejectSharedDirectoryAsync request))))

(defn enable-radius-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the EnableRadius operation. - `com.amazonaws.services.directory.model.EnableRadiusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableRadius operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.EnableRadiusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.EnableRadiusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableRadiusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.EnableRadiusRequest request]
    (-> this (.enableRadiusAsync request))))

(defn create-alias-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the CreateAlias operation. - `com.amazonaws.services.directory.model.CreateAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateAliasRequest request]
    (-> this (.createAliasAsync request))))

(defn accept-shared-directory-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptSharedDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.AcceptSharedDirectoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptSharedDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest request]
    (-> this (.acceptSharedDirectoryAsync request))))

(defn cancel-schema-extension-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.CancelSchemaExtensionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSchemaExtension operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CancelSchemaExtensionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CancelSchemaExtensionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSchemaExtensionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CancelSchemaExtensionRequest request]
    (-> this (.cancelSchemaExtensionAsync request))))

(defn create-conditional-forwarder-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active Directory. Conditional forwarders are required in order to set up a trust relationship with another domain. - `com.amazonaws.services.directory.model.CreateConditionalForwarderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConditionalForwarder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateConditionalForwarderResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateConditionalForwarderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConditionalForwarderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateConditionalForwarderRequest request]
    (-> this (.createConditionalForwarderAsync request))))

(defn create-log-subscription-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.CreateLogSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLogSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateLogSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateLogSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLogSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateLogSubscriptionRequest request]
    (-> this (.createLogSubscriptionAsync request))))

(defn restore-from-snapshot-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - An object representing the inputs for the RestoreFromSnapshot operation. - `com.amazonaws.services.directory.model.RestoreFromSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreFromSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RestoreFromSnapshotResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RestoreFromSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreFromSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RestoreFromSnapshotRequest request]
    (-> this (.restoreFromSnapshotAsync request))))

(defn share-directory-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.ShareDirectoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ShareDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ShareDirectoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ShareDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.shareDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ShareDirectoryRequest request]
    (-> this (.shareDirectoryAsync request))))

(defn list-log-subscriptions-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.ListLogSubscriptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLogSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ListLogSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListLogSubscriptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLogSubscriptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListLogSubscriptionsRequest request]
    (-> this (.listLogSubscriptionsAsync request))))

(defn update-radius-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the UpdateRadius operation. - `com.amazonaws.services.directory.model.UpdateRadiusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRadius operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UpdateRadiusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateRadiusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRadiusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateRadiusRequest request]
    (-> this (.updateRadiusAsync request))))

(defn create-snapshot-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the CreateSnapshot operation. - `com.amazonaws.services.directory.model.CreateSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateSnapshotResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateSnapshotRequest request]
    (-> this (.createSnapshotAsync request))))

(defn describe-shared-directories-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSharedDirectories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeSharedDirectoriesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSharedDirectoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest request]
    (-> this (.describeSharedDirectoriesAsync request))))

(defn enable-sso-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the EnableSso operation. - `com.amazonaws.services.directory.model.EnableSsoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableSso operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.EnableSsoResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.EnableSsoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableSsoAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.EnableSsoRequest request]
    (-> this (.enableSsoAsync request))))

(defn create-computer-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the CreateComputer operation. - `com.amazonaws.services.directory.model.CreateComputerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComputer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateComputerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateComputerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createComputerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateComputerRequest request]
    (-> this (.createComputerAsync request))))

(defn add-ip-routes-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.AddIpRoutesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddIpRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.AddIpRoutesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AddIpRoutesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addIpRoutesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AddIpRoutesRequest request]
    (-> this (.addIpRoutesAsync request))))

(defn update-conditional-forwarder-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Updates a conditional forwarder. - `com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConditionalForwarder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UpdateConditionalForwarderResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConditionalForwarderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest request]
    (-> this (.updateConditionalForwarderAsync request))))

(defn unshare-directory-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.UnshareDirectoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnshareDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UnshareDirectoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UnshareDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unshareDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UnshareDirectoryRequest request]
    (-> this (.unshareDirectoryAsync request))))

(defn describe-conditional-forwarders-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Describes a conditional forwarder. - `com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConditionalForwarders operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeConditionalForwardersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConditionalForwardersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest request]
    (-> this (.describeConditionalForwardersAsync request))))

(defn describe-event-topics-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Describes event topics. - `com.amazonaws.services.directory.model.DescribeEventTopicsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventTopics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeEventTopicsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeEventTopicsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventTopicsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeEventTopicsRequest request]
    (-> this (.describeEventTopicsAsync request))))

(defn describe-trusts-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input parameters are are provided, such as directory ID or trust ID, this request describes all the trust relationships. - `com.amazonaws.services.directory.model.DescribeTrustsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrusts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeTrustsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeTrustsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeTrustsRequest request]
    (-> this (.describeTrustsAsync request))))

(defn update-trust-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.UpdateTrustRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrust operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UpdateTrustResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateTrustRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTrustAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateTrustRequest request]
    (-> this (.updateTrustAsync request))))

(defn deregister-event-topic-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Removes the specified directory as a publisher to the specified SNS topic. - `com.amazonaws.services.directory.model.DeregisterEventTopicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterEventTopic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeregisterEventTopicResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeregisterEventTopicRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterEventTopicAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeregisterEventTopicRequest request]
    (-> this (.deregisterEventTopicAsync request))))

(defn create-trust-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. - `com.amazonaws.services.directory.model.CreateTrustRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrust operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateTrustResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateTrustRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrustAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateTrustRequest request]
    (-> this (.createTrustAsync request))))

(defn describe-snapshots-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the DescribeSnapshots operation. - `com.amazonaws.services.directory.model.DescribeSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeSnapshotsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeSnapshotsRequest request]
    (-> this (.describeSnapshotsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this]
    (-> this (.describeSnapshotsAsync))))

(defn get-directory-limits-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the GetDirectoryLimits operation. - `com.amazonaws.services.directory.model.GetDirectoryLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDirectoryLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.GetDirectoryLimitsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.GetDirectoryLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDirectoryLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.GetDirectoryLimitsRequest request]
    (-> this (.getDirectoryLimitsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this]
    (-> this (.getDirectoryLimitsAsync))))

(defn remove-tags-from-resource-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResourceAsync request))))

(defn delete-directory-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the DeleteDirectory operation. - `com.amazonaws.services.directory.model.DeleteDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteDirectoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteDirectoryRequest request]
    (-> this (.deleteDirectoryAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn register-event-topic-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Registers a new event topic. - `com.amazonaws.services.directory.model.RegisterEventTopicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterEventTopic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RegisterEventTopicResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RegisterEventTopicRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerEventTopicAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RegisterEventTopicRequest request]
    (-> this (.registerEventTopicAsync request))))

(defn create-directory-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the CreateDirectory operation. - `com.amazonaws.services.directory.model.CreateDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateDirectoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateDirectoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateDirectoryRequest request]
    (-> this (.createDirectoryAsync request))))

(defn get-snapshot-limits-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the GetSnapshotLimits operation. - `com.amazonaws.services.directory.model.GetSnapshotLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSnapshotLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.GetSnapshotLimitsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.GetSnapshotLimitsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSnapshotLimitsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.GetSnapshotLimitsRequest request]
    (-> this (.getSnapshotLimitsAsync request))))

(defn delete-conditional-forwarder-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Deletes a conditional forwarder. - `com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConditionalForwarder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteConditionalForwarderResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConditionalForwarderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest request]
    (-> this (.deleteConditionalForwarderAsync request))))

(defn reset-user-password-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.ResetUserPasswordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetUserPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ResetUserPasswordResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ResetUserPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetUserPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ResetUserPasswordRequest request]
    (-> this (.resetUserPasswordAsync request))))

(defn delete-log-subscription-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLogSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteLogSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLogSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest request]
    (-> this (.deleteLogSubscriptionAsync request))))

(defn list-schema-extensions-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.ListSchemaExtensionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSchemaExtensions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ListSchemaExtensionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListSchemaExtensionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSchemaExtensionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListSchemaExtensionsRequest request]
    (-> this (.listSchemaExtensionsAsync request))))

(defn disable-sso-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the DisableSso operation. - `com.amazonaws.services.directory.model.DisableSsoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableSso operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DisableSsoResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DisableSsoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableSsoAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DisableSsoRequest request]
    (-> this (.disableSsoAsync request))))

(defn update-number-of-domain-controllers-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNumberOfDomainControllers operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNumberOfDomainControllersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest request]
    (-> this (.updateNumberOfDomainControllersAsync request))))

(defn add-tags-to-resource-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.AddTagsToResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AddTagsToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResourceAsync request))))

(defn list-ip-routes-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.ListIpRoutesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIpRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ListIpRoutesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListIpRoutesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIpRoutesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListIpRoutesRequest request]
    (-> this (.listIpRoutesAsync request))))

(defn delete-snapshot-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - Contains the inputs for the DeleteSnapshot operation. - `com.amazonaws.services.directory.model.DeleteSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteSnapshotResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteSnapshotRequest request]
    (-> this (.deleteSnapshotAsync request))))

(defn remove-ip-routes-async
  "Description copied from interface: AWSDirectoryServiceAsync

  request - `com.amazonaws.services.directory.model.RemoveIpRoutesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveIpRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RemoveIpRoutesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RemoveIpRoutesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeIpRoutesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RemoveIpRoutesRequest request]
    (-> this (.removeIpRoutesAsync request))))

