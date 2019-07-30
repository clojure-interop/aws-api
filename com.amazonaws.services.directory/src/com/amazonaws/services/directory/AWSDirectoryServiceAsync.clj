(ns com.amazonaws.services.directory.AWSDirectoryServiceAsync
  "Interface for accessing Directory Service asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSDirectoryServiceAsync instead.


  AWS Directory Service

  AWS Directory Service is a web service that makes it easy for you to setup and run directories in the AWS cloud, or
  connect your AWS resources with an existing on-premises Microsoft Active Directory. This guide provides detailed
  information about AWS Directory Service operations, data types, parameters, and errors. For information about AWS
  Directory Services features, see AWS Directory Service and the
  AWS Directory Service
  Administration Guide.



  AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
  Ruby, .Net, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS Directory
  Service and other AWS services. For more information about the AWS SDKs, including how to download and install them,
  see Tools for Amazon Web Services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.directory AWSDirectoryServiceAsync]))

(defn disable-radius-async
  "Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server
   for an AD Connector or Microsoft AD directory.

  disable-radius-request - Contains the inputs for the DisableRadius operation. - `com.amazonaws.services.directory.model.DisableRadiusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableRadius operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DisableRadiusResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DisableRadiusRequest disable-radius-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableRadiusAsync disable-radius-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DisableRadiusRequest disable-radius-request]
    (-> this (.disableRadiusAsync disable-radius-request))))

(defn delete-trust-async
  "Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.

  delete-trust-request - Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory and the external domain. - `com.amazonaws.services.directory.model.DeleteTrustRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrust operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteTrustResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteTrustRequest delete-trust-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrustAsync delete-trust-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteTrustRequest delete-trust-request]
    (-> this (.deleteTrustAsync delete-trust-request))))

(defn describe-directories-async
  "Obtains information about the directories that belong to this account.


   You can retrieve information about specific directories by passing the directory identifiers in the
   DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned.


   This operation supports pagination with the use of the NextToken request and response parameters. If
   more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you
   pass in the next call to DescribeDirectories to retrieve the next set of items.


   You can also specify a maximum number of return results with the Limit parameter.

  describe-directories-request - Contains the inputs for the DescribeDirectories operation. - `com.amazonaws.services.directory.model.DescribeDirectoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeDirectoriesResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeDirectoriesRequest describe-directories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectoriesAsync describe-directories-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeDirectoriesRequest describe-directories-request]
    (-> this (.describeDirectoriesAsync describe-directories-request)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this]
    (-> this (.describeDirectoriesAsync))))

(defn verify-trust-async
  "AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships.


   This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.

  verify-trust-request - Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory and an external domain. - `com.amazonaws.services.directory.model.VerifyTrustRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyTrust operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.VerifyTrustResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.VerifyTrustRequest verify-trust-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyTrustAsync verify-trust-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.VerifyTrustRequest verify-trust-request]
    (-> this (.verifyTrustAsync verify-trust-request))))

(defn start-schema-extension-async
  "Applies a schema extension to a Microsoft AD directory.

  start-schema-extension-request - `com.amazonaws.services.directory.model.StartSchemaExtensionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSchemaExtension operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.StartSchemaExtensionResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.StartSchemaExtensionRequest start-schema-extension-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSchemaExtensionAsync start-schema-extension-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.StartSchemaExtensionRequest start-schema-extension-request]
    (-> this (.startSchemaExtensionAsync start-schema-extension-request))))

(defn create-microsoft-ad-async
  "Creates an AWS Managed Microsoft AD directory.


   Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD
   operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  create-microsoft-ad-request - Creates an AWS Managed Microsoft AD directory. - `com.amazonaws.services.directory.model.CreateMicrosoftADRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMicrosoftAD operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateMicrosoftADResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateMicrosoftADRequest create-microsoft-ad-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMicrosoftADAsync create-microsoft-ad-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateMicrosoftADRequest create-microsoft-ad-request]
    (-> this (.createMicrosoftADAsync create-microsoft-ad-request))))

(defn describe-domain-controllers-async
  "Provides information about any domain controllers in your directory.

  describe-domain-controllers-request - `com.amazonaws.services.directory.model.DescribeDomainControllersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDomainControllers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeDomainControllersResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeDomainControllersRequest describe-domain-controllers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDomainControllersAsync describe-domain-controllers-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeDomainControllersRequest describe-domain-controllers-request]
    (-> this (.describeDomainControllersAsync describe-domain-controllers-request))))

(defn connect-directory-async
  "Creates an AD Connector to connect to an on-premises directory.


   Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the
   ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  connect-directory-request - Contains the inputs for the ConnectDirectory operation. - `com.amazonaws.services.directory.model.ConnectDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConnectDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ConnectDirectoryResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ConnectDirectoryRequest connect-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.connectDirectoryAsync connect-directory-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ConnectDirectoryRequest connect-directory-request]
    (-> this (.connectDirectoryAsync connect-directory-request))))

(defn reject-shared-directory-async
  "Rejects a directory sharing request that was sent from the directory owner account.

  reject-shared-directory-request - `com.amazonaws.services.directory.model.RejectSharedDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectSharedDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RejectSharedDirectoryResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RejectSharedDirectoryRequest reject-shared-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectSharedDirectoryAsync reject-shared-directory-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RejectSharedDirectoryRequest reject-shared-directory-request]
    (-> this (.rejectSharedDirectoryAsync reject-shared-directory-request))))

(defn enable-radius-async
  "Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for
   an AD Connector or Microsoft AD directory.

  enable-radius-request - Contains the inputs for the EnableRadius operation. - `com.amazonaws.services.directory.model.EnableRadiusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableRadius operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.EnableRadiusResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.EnableRadiusRequest enable-radius-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableRadiusAsync enable-radius-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.EnableRadiusRequest enable-radius-request]
    (-> this (.enableRadiusAsync enable-radius-request))))

(defn create-alias-async
  "Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the
   access URL for the directory, such as http://<alias>.awsapps.com.



   After an alias has been created, it cannot be deleted or reused, so this operation should only be used when
   absolutely necessary.

  create-alias-request - Contains the inputs for the CreateAlias operation. - `com.amazonaws.services.directory.model.CreateAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateAliasResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateAliasRequest create-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAliasAsync create-alias-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateAliasRequest create-alias-request]
    (-> this (.createAliasAsync create-alias-request))))

(defn accept-shared-directory-async
  "Accepts a directory sharing request that was sent from the directory owner account.

  accept-shared-directory-request - `com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptSharedDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.AcceptSharedDirectoryResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest accept-shared-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptSharedDirectoryAsync accept-shared-directory-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest accept-shared-directory-request]
    (-> this (.acceptSharedDirectoryAsync accept-shared-directory-request))))

(defn cancel-schema-extension-async
  "Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started
   replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled
   during any of the following states; Initializing, CreatingSnapshot, and
   UpdatingSchema.

  cancel-schema-extension-request - `com.amazonaws.services.directory.model.CancelSchemaExtensionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSchemaExtension operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CancelSchemaExtensionResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CancelSchemaExtensionRequest cancel-schema-extension-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSchemaExtensionAsync cancel-schema-extension-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CancelSchemaExtensionRequest cancel-schema-extension-request]
    (-> this (.cancelSchemaExtensionAsync cancel-schema-extension-request))))

(defn create-conditional-forwarder-async
  "Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order
   to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.

  create-conditional-forwarder-request - Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active Directory. Conditional forwarders are required in order to set up a trust relationship with another domain. - `com.amazonaws.services.directory.model.CreateConditionalForwarderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConditionalForwarder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateConditionalForwarderResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateConditionalForwarderRequest create-conditional-forwarder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConditionalForwarderAsync create-conditional-forwarder-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateConditionalForwarderRequest create-conditional-forwarder-request]
    (-> this (.createConditionalForwarderAsync create-conditional-forwarder-request))))

(defn create-log-subscription-async
  "Creates a subscription to forward real time Directory Service domain controller security logs to the specified
   CloudWatch log group in your AWS account.

  create-log-subscription-request - `com.amazonaws.services.directory.model.CreateLogSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLogSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateLogSubscriptionResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateLogSubscriptionRequest create-log-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLogSubscriptionAsync create-log-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateLogSubscriptionRequest create-log-subscription-request]
    (-> this (.createLogSubscriptionAsync create-log-subscription-request))))

(defn restore-from-snapshot-async
  "Restores a directory using an existing directory snapshot.


   When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are
   overwritten.


   This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore
   operation by calling the DescribeDirectories operation with the directory identifier. When the
   DirectoryDescription.Stage value changes to Active, the restore operation is complete.

  restore-from-snapshot-request - An object representing the inputs for the RestoreFromSnapshot operation. - `com.amazonaws.services.directory.model.RestoreFromSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreFromSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RestoreFromSnapshotResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RestoreFromSnapshotRequest restore-from-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreFromSnapshotAsync restore-from-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RestoreFromSnapshotRequest restore-from-snapshot-request]
    (-> this (.restoreFromSnapshotAsync restore-from-snapshot-request))))

(defn share-directory-async
  "Shares a specified directory (DirectoryId) in your AWS account (directory owner) with another AWS
   account (directory consumer). With this operation you can use your directory from any AWS account and from any
   Amazon VPC within an AWS Region.


   When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the
   directory consumer account. This shared directory contains the metadata to provide access to the directory within
   the directory owner account. The shared directory is visible in all VPCs in the directory consumer account.


   The ShareMethod parameter determines whether the specified directory can be shared between AWS
   accounts inside the same AWS organization (ORGANIZATIONS). It also determines whether you can share
   the directory with any other AWS account either inside or outside of the organization (HANDSHAKE).


   The ShareNotes parameter is only used when HANDSHAKE is called, which sends a directory
   sharing request to the directory consumer.

  share-directory-request - `com.amazonaws.services.directory.model.ShareDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ShareDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ShareDirectoryResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ShareDirectoryRequest share-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.shareDirectoryAsync share-directory-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ShareDirectoryRequest share-directory-request]
    (-> this (.shareDirectoryAsync share-directory-request))))

(defn list-log-subscriptions-async
  "Lists the active log subscriptions for the AWS account.

  list-log-subscriptions-request - `com.amazonaws.services.directory.model.ListLogSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLogSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ListLogSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListLogSubscriptionsRequest list-log-subscriptions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLogSubscriptionsAsync list-log-subscriptions-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListLogSubscriptionsRequest list-log-subscriptions-request]
    (-> this (.listLogSubscriptionsAsync list-log-subscriptions-request))))

(defn update-radius-async
  "Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or
   Microsoft AD directory.

  update-radius-request - Contains the inputs for the UpdateRadius operation. - `com.amazonaws.services.directory.model.UpdateRadiusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRadius operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UpdateRadiusResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateRadiusRequest update-radius-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRadiusAsync update-radius-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateRadiusRequest update-radius-request]
    (-> this (.updateRadiusAsync update-radius-request))))

(defn create-snapshot-async
  "Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.



   You cannot take snapshots of AD Connector directories.

  create-snapshot-request - Contains the inputs for the CreateSnapshot operation. - `com.amazonaws.services.directory.model.CreateSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateSnapshotResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateSnapshotRequest create-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotAsync create-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateSnapshotRequest create-snapshot-request]
    (-> this (.createSnapshotAsync create-snapshot-request))))

(defn describe-shared-directories-async
  "Returns the shared directories in your account.

  describe-shared-directories-request - `com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSharedDirectories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeSharedDirectoriesResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest describe-shared-directories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSharedDirectoriesAsync describe-shared-directories-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest describe-shared-directories-request]
    (-> this (.describeSharedDirectoriesAsync describe-shared-directories-request))))

(defn enable-sso-async
  "Enables single sign-on for a directory.

  enable-sso-request - Contains the inputs for the EnableSso operation. - `com.amazonaws.services.directory.model.EnableSsoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableSso operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.EnableSsoResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.EnableSsoRequest enable-sso-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableSsoAsync enable-sso-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.EnableSsoRequest enable-sso-request]
    (-> this (.enableSsoAsync enable-sso-request))))

(defn create-computer-async
  "Creates a computer account in the specified directory, and joins the computer to the directory.

  create-computer-request - Contains the inputs for the CreateComputer operation. - `com.amazonaws.services.directory.model.CreateComputerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComputer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateComputerResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateComputerRequest create-computer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createComputerAsync create-computer-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateComputerRequest create-computer-request]
    (-> this (.createComputerAsync create-computer-request))))

(defn add-ip-routes-async
  "If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address
   block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds
   this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges
   from your Microsoft AD on AWS to a peer VPC.


   Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted
   through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS
   Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  add-ip-routes-request - `com.amazonaws.services.directory.model.AddIpRoutesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddIpRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.AddIpRoutesResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AddIpRoutesRequest add-ip-routes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addIpRoutesAsync add-ip-routes-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AddIpRoutesRequest add-ip-routes-request]
    (-> this (.addIpRoutesAsync add-ip-routes-request))))

(defn update-conditional-forwarder-async
  "Updates a conditional forwarder that has been set up for your AWS directory.

  update-conditional-forwarder-request - Updates a conditional forwarder. - `com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConditionalForwarder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UpdateConditionalForwarderResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest update-conditional-forwarder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConditionalForwarderAsync update-conditional-forwarder-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest update-conditional-forwarder-request]
    (-> this (.updateConditionalForwarderAsync update-conditional-forwarder-request))))

(defn unshare-directory-async
  "Stops the directory sharing between the directory owner and consumer accounts.

  unshare-directory-request - `com.amazonaws.services.directory.model.UnshareDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnshareDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UnshareDirectoryResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UnshareDirectoryRequest unshare-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unshareDirectoryAsync unshare-directory-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UnshareDirectoryRequest unshare-directory-request]
    (-> this (.unshareDirectoryAsync unshare-directory-request))))

(defn describe-conditional-forwarders-async
  "Obtains information about the conditional forwarders for this account.


   If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for
   the specified directory ID.

  describe-conditional-forwarders-request - Describes a conditional forwarder. - `com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConditionalForwarders operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeConditionalForwardersResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest describe-conditional-forwarders-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConditionalForwardersAsync describe-conditional-forwarders-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest describe-conditional-forwarders-request]
    (-> this (.describeConditionalForwardersAsync describe-conditional-forwarders-request))))

(defn describe-event-topics-async
  "Obtains information about which SNS topics receive status messages from the specified directory.


   If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the
   associations in the account.

  describe-event-topics-request - Describes event topics. - `com.amazonaws.services.directory.model.DescribeEventTopicsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventTopics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeEventTopicsResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeEventTopicsRequest describe-event-topics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventTopicsAsync describe-event-topics-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeEventTopicsRequest describe-event-topics-request]
    (-> this (.describeEventTopicsAsync describe-event-topics-request))))

(defn describe-trusts-async
  "Obtains information about the trust relationships for this account.


   If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust
   relationships belonging to the account.

  describe-trusts-request - Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input parameters are are provided, such as directory ID or trust ID, this request describes all the trust relationships. - `com.amazonaws.services.directory.model.DescribeTrustsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrusts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeTrustsResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeTrustsRequest describe-trusts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustsAsync describe-trusts-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeTrustsRequest describe-trusts-request]
    (-> this (.describeTrustsAsync describe-trusts-request))))

(defn update-trust-async
  "Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active
   Directory.

  update-trust-request - `com.amazonaws.services.directory.model.UpdateTrustRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrust operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UpdateTrustResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateTrustRequest update-trust-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTrustAsync update-trust-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateTrustRequest update-trust-request]
    (-> this (.updateTrustAsync update-trust-request))))

(defn deregister-event-topic-async
  "Removes the specified directory as a publisher to the specified SNS topic.

  deregister-event-topic-request - Removes the specified directory as a publisher to the specified SNS topic. - `com.amazonaws.services.directory.model.DeregisterEventTopicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterEventTopic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeregisterEventTopicResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeregisterEventTopicRequest deregister-event-topic-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterEventTopicAsync deregister-event-topic-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeregisterEventTopicRequest deregister-event-topic-request]
    (-> this (.deregisterEventTopicAsync deregister-event-topic-request))))

(defn create-trust-async
  "AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example,
   you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises
   Microsoft Active Directory. This would allow you to provide users and groups access to resources in either
   domain, with a single set of credentials.


   This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD
   directory and an external domain. You can create either a forest trust or an external trust.

  create-trust-request - AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. - `com.amazonaws.services.directory.model.CreateTrustRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrust operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateTrustResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateTrustRequest create-trust-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrustAsync create-trust-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateTrustRequest create-trust-request]
    (-> this (.createTrustAsync create-trust-request))))

(defn describe-snapshots-async
  "Obtains information about the directory snapshots that belong to this account.


   This operation supports pagination with the use of the NextToken request and response parameters. If more
   results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next
   call to DescribeSnapshots to retrieve the next set of items.


   You can also specify a maximum number of return results with the Limit parameter.

  describe-snapshots-request - Contains the inputs for the DescribeSnapshots operation. - `com.amazonaws.services.directory.model.DescribeSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DescribeSnapshotsResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeSnapshotsRequest describe-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotsAsync describe-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DescribeSnapshotsRequest describe-snapshots-request]
    (-> this (.describeSnapshotsAsync describe-snapshots-request)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this]
    (-> this (.describeSnapshotsAsync))))

(defn get-directory-limits-async
  "Obtains directory limit information for the current region.

  get-directory-limits-request - Contains the inputs for the GetDirectoryLimits operation. - `com.amazonaws.services.directory.model.GetDirectoryLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDirectoryLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.GetDirectoryLimitsResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.GetDirectoryLimitsRequest get-directory-limits-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDirectoryLimitsAsync get-directory-limits-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.GetDirectoryLimitsRequest get-directory-limits-request]
    (-> this (.getDirectoryLimitsAsync get-directory-limits-request)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this]
    (-> this (.getDirectoryLimitsAsync))))

(defn remove-tags-from-resource-async
  "Removes tags from a directory.

  remove-tags-from-resource-request - `com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request))))

(defn delete-directory-async
  "Deletes an AWS Directory Service directory.


   Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the DeleteDirectory
   operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  delete-directory-request - Contains the inputs for the DeleteDirectory operation. - `com.amazonaws.services.directory.model.DeleteDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteDirectoryResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteDirectoryRequest delete-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectoryAsync delete-directory-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteDirectoryRequest delete-directory-request]
    (-> this (.deleteDirectoryAsync delete-directory-request))))

(defn list-tags-for-resource-async
  "Lists all tags on a directory.

  list-tags-for-resource-request - `com.amazonaws.services.directory.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn register-event-topic-async
  "Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS
   topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get
   notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a
   notification when the directory returns to an Active status.

  register-event-topic-request - Registers a new event topic. - `com.amazonaws.services.directory.model.RegisterEventTopicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterEventTopic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RegisterEventTopicResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RegisterEventTopicRequest register-event-topic-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerEventTopicAsync register-event-topic-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RegisterEventTopicRequest register-event-topic-request]
    (-> this (.registerEventTopicAsync register-event-topic-request))))

(defn create-directory-async
  "Creates a Simple AD directory.


   Before you call CreateDirectory, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the CreateDirectory
   operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  create-directory-request - Contains the inputs for the CreateDirectory operation. - `com.amazonaws.services.directory.model.CreateDirectoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.CreateDirectoryResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateDirectoryRequest create-directory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectoryAsync create-directory-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.CreateDirectoryRequest create-directory-request]
    (-> this (.createDirectoryAsync create-directory-request))))

(defn get-snapshot-limits-async
  "Obtains the manual snapshot limits for a directory.

  get-snapshot-limits-request - Contains the inputs for the GetSnapshotLimits operation. - `com.amazonaws.services.directory.model.GetSnapshotLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSnapshotLimits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.GetSnapshotLimitsResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.GetSnapshotLimitsRequest get-snapshot-limits-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSnapshotLimitsAsync get-snapshot-limits-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.GetSnapshotLimitsRequest get-snapshot-limits-request]
    (-> this (.getSnapshotLimitsAsync get-snapshot-limits-request))))

(defn delete-conditional-forwarder-async
  "Deletes a conditional forwarder that has been set up for your AWS directory.

  delete-conditional-forwarder-request - Deletes a conditional forwarder. - `com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConditionalForwarder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteConditionalForwarderResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest delete-conditional-forwarder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConditionalForwarderAsync delete-conditional-forwarder-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest delete-conditional-forwarder-request]
    (-> this (.deleteConditionalForwarderAsync delete-conditional-forwarder-request))))

(defn reset-user-password-async
  "Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.

  reset-user-password-request - `com.amazonaws.services.directory.model.ResetUserPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetUserPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ResetUserPasswordResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ResetUserPasswordRequest reset-user-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetUserPasswordAsync reset-user-password-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ResetUserPasswordRequest reset-user-password-request]
    (-> this (.resetUserPasswordAsync reset-user-password-request))))

(defn delete-log-subscription-async
  "Deletes the specified log subscription.

  delete-log-subscription-request - `com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLogSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteLogSubscriptionResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest delete-log-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLogSubscriptionAsync delete-log-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest delete-log-subscription-request]
    (-> this (.deleteLogSubscriptionAsync delete-log-subscription-request))))

(defn list-schema-extensions-async
  "Lists all schema extensions applied to a Microsoft AD Directory.

  list-schema-extensions-request - `com.amazonaws.services.directory.model.ListSchemaExtensionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSchemaExtensions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ListSchemaExtensionsResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListSchemaExtensionsRequest list-schema-extensions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSchemaExtensionsAsync list-schema-extensions-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListSchemaExtensionsRequest list-schema-extensions-request]
    (-> this (.listSchemaExtensionsAsync list-schema-extensions-request))))

(defn disable-sso-async
  "Disables single-sign on for a directory.

  disable-sso-request - Contains the inputs for the DisableSso operation. - `com.amazonaws.services.directory.model.DisableSsoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableSso operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DisableSsoResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DisableSsoRequest disable-sso-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableSsoAsync disable-sso-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DisableSsoRequest disable-sso-request]
    (-> this (.disableSsoAsync disable-sso-request))))

(defn update-number-of-domain-controllers-async
  "Adds or removes domain controllers to or from the directory. Based on the difference between current value and
   new value (provided through this API call), domain controllers will be added or removed. It may take up to 45
   minutes for any new domain controllers to become fully active once the requested number of domain controllers is
   updated. During this time, you cannot make another update request.

  update-number-of-domain-controllers-request - `com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNumberOfDomainControllers operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest update-number-of-domain-controllers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNumberOfDomainControllersAsync update-number-of-domain-controllers-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest update-number-of-domain-controllers-request]
    (-> this (.updateNumberOfDomainControllersAsync update-number-of-domain-controllers-request))))

(defn add-tags-to-resource-async
  "Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags.
   Each tag consists of a key and optional value. Tag keys must be unique to each resource.

  add-tags-to-resource-request - `com.amazonaws.services.directory.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AddTagsToResourceRequest add-tags-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request))))

(defn list-ip-routes-async
  "Lists the address blocks that you have added to a directory.

  list-ip-routes-request - `com.amazonaws.services.directory.model.ListIpRoutesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIpRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.ListIpRoutesResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListIpRoutesRequest list-ip-routes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIpRoutesAsync list-ip-routes-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.ListIpRoutesRequest list-ip-routes-request]
    (-> this (.listIpRoutesAsync list-ip-routes-request))))

(defn delete-snapshot-async
  "Deletes a directory snapshot.

  delete-snapshot-request - Contains the inputs for the DeleteSnapshot operation. - `com.amazonaws.services.directory.model.DeleteSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.DeleteSnapshotResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteSnapshotRequest delete-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotAsync delete-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.DeleteSnapshotRequest delete-snapshot-request]
    (-> this (.deleteSnapshotAsync delete-snapshot-request))))

(defn remove-ip-routes-async
  "Removes IP address blocks from a directory.

  remove-ip-routes-request - `com.amazonaws.services.directory.model.RemoveIpRoutesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveIpRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.directory.model.RemoveIpRoutesResult>`"
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RemoveIpRoutesRequest remove-ip-routes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeIpRoutesAsync remove-ip-routes-request async-handler)))
  (^java.util.concurrent.Future [^AWSDirectoryServiceAsync this ^com.amazonaws.services.directory.model.RemoveIpRoutesRequest remove-ip-routes-request]
    (-> this (.removeIpRoutesAsync remove-ip-routes-request))))

