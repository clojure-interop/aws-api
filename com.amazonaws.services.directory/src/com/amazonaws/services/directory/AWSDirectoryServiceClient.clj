(ns com.amazonaws.services.directory.AWSDirectoryServiceClient
  "Client for accessing Directory Service. All service calls made using this client are blocking, and will not return
  until the service call completes.

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
  (:import [com.amazonaws.services.directory AWSDirectoryServiceClient]))

(defn ->aws-directory-service-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Directory Service (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSDirectoryServiceClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSDirectoryServiceClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSDirectoryServiceClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSDirectoryServiceClient aws-credentials client-configuration))
  (^AWSDirectoryServiceClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSDirectoryServiceClient client-configuration))
  (^AWSDirectoryServiceClient []
    (new AWSDirectoryServiceClient )))

(defn *builder
  "returns: `com.amazonaws.services.directory.AWSDirectoryServiceClientBuilder`"
  (^com.amazonaws.services.directory.AWSDirectoryServiceClientBuilder []
    (AWSDirectoryServiceClient/builder )))

(defn list-ip-routes
  "Lists the address blocks that you have added to a directory.

  request - `com.amazonaws.services.directory.model.ListIpRoutesRequest`

  returns: Result of the ListIpRoutes operation returned by the service. - `com.amazonaws.services.directory.model.ListIpRoutesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.ListIpRoutesResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.ListIpRoutesRequest request]
    (-> this (.listIpRoutes request))))

(defn list-tags-for-resource
  "Lists all tags on a directory.

  request - `com.amazonaws.services.directory.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.directory.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.ListTagsForResourceResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn remove-ip-routes
  "Removes IP address blocks from a directory.

  request - `com.amazonaws.services.directory.model.RemoveIpRoutesRequest`

  returns: Result of the RemoveIpRoutes operation returned by the service. - `com.amazonaws.services.directory.model.RemoveIpRoutesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.RemoveIpRoutesResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.RemoveIpRoutesRequest request]
    (-> this (.removeIpRoutes request))))

(defn connect-directory
  "Creates an AD Connector to connect to an on-premises directory.


   Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the
   ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  request - `com.amazonaws.services.directory.model.ConnectDirectoryRequest`

  returns: Result of the ConnectDirectory operation returned by the service. - `com.amazonaws.services.directory.model.ConnectDirectoryResult`

  throws: com.amazonaws.services.directory.model.DirectoryLimitExceededException - The maximum number of directories in the region has been reached. You can use the GetDirectoryLimits operation to determine your directory limits in the region."
  (^com.amazonaws.services.directory.model.ConnectDirectoryResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.ConnectDirectoryRequest request]
    (-> this (.connectDirectory request))))

(defn update-trust
  "Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active
   Directory.

  request - `com.amazonaws.services.directory.model.UpdateTrustRequest`

  returns: Result of the UpdateTrust operation returned by the service. - `com.amazonaws.services.directory.model.UpdateTrustResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.UpdateTrustResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.UpdateTrustRequest request]
    (-> this (.updateTrust request))))

(defn add-ip-routes
  "If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address
   block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds
   this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges
   from your Microsoft AD on AWS to a peer VPC.


   Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted
   through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS
   Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  request - `com.amazonaws.services.directory.model.AddIpRoutesRequest`

  returns: Result of the AddIpRoutes operation returned by the service. - `com.amazonaws.services.directory.model.AddIpRoutesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.AddIpRoutesResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.AddIpRoutesRequest request]
    (-> this (.addIpRoutes request))))

(defn update-number-of-domain-controllers
  "Adds or removes domain controllers to or from the directory. Based on the difference between current value and
   new value (provided through this API call), domain controllers will be added or removed. It may take up to 45
   minutes for any new domain controllers to become fully active once the requested number of domain controllers is
   updated. During this time, you cannot make another update request.

  request - `com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest`

  returns: Result of the UpdateNumberOfDomainControllers operation returned by the service. - `com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest request]
    (-> this (.updateNumberOfDomainControllers request))))

(defn delete-trust
  "Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.

  request - `com.amazonaws.services.directory.model.DeleteTrustRequest`

  returns: Result of the DeleteTrust operation returned by the service. - `com.amazonaws.services.directory.model.DeleteTrustResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteTrustResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DeleteTrustRequest request]
    (-> this (.deleteTrust request))))

(defn describe-shared-directories
  "Returns the shared directories in your account.

  request - `com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest`

  returns: Result of the DescribeSharedDirectories operation returned by the service. - `com.amazonaws.services.directory.model.DescribeSharedDirectoriesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeSharedDirectoriesResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest request]
    (-> this (.describeSharedDirectories request))))

(defn delete-directory
  "Deletes an AWS Directory Service directory.


   Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the DeleteDirectory
   operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  request - `com.amazonaws.services.directory.model.DeleteDirectoryRequest`

  returns: Result of the DeleteDirectory operation returned by the service. - `com.amazonaws.services.directory.model.DeleteDirectoryResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteDirectoryResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DeleteDirectoryRequest request]
    (-> this (.deleteDirectory request))))

(defn unshare-directory
  "Stops the directory sharing between the directory owner and consumer accounts.

  request - `com.amazonaws.services.directory.model.UnshareDirectoryRequest`

  returns: Result of the UnshareDirectory operation returned by the service. - `com.amazonaws.services.directory.model.UnshareDirectoryResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.UnshareDirectoryResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.UnshareDirectoryRequest request]
    (-> this (.unshareDirectory request))))

(defn start-schema-extension
  "Applies a schema extension to a Microsoft AD directory.

  request - `com.amazonaws.services.directory.model.StartSchemaExtensionRequest`

  returns: Result of the StartSchemaExtension operation returned by the service. - `com.amazonaws.services.directory.model.StartSchemaExtensionResult`

  throws: com.amazonaws.services.directory.model.DirectoryUnavailableException - The specified directory is unavailable or could not be found."
  (^com.amazonaws.services.directory.model.StartSchemaExtensionResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.StartSchemaExtensionRequest request]
    (-> this (.startSchemaExtension request))))

(defn enable-radius
  "Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for
   an AD Connector or Microsoft AD directory.

  request - `com.amazonaws.services.directory.model.EnableRadiusRequest`

  returns: Result of the EnableRadius operation returned by the service. - `com.amazonaws.services.directory.model.EnableRadiusResult`

  throws: com.amazonaws.services.directory.model.InvalidParameterException - One or more parameters are not valid."
  (^com.amazonaws.services.directory.model.EnableRadiusResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.EnableRadiusRequest request]
    (-> this (.enableRadius request))))

(defn enable-sso
  "Enables single sign-on for a directory.

  request - `com.amazonaws.services.directory.model.EnableSsoRequest`

  returns: Result of the EnableSso operation returned by the service. - `com.amazonaws.services.directory.model.EnableSsoResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.EnableSsoResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.EnableSsoRequest request]
    (-> this (.enableSso request))))

(defn update-conditional-forwarder
  "Updates a conditional forwarder that has been set up for your AWS directory.

  request - `com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest`

  returns: Result of the UpdateConditionalForwarder operation returned by the service. - `com.amazonaws.services.directory.model.UpdateConditionalForwarderResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.UpdateConditionalForwarderResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest request]
    (-> this (.updateConditionalForwarder request))))

(defn describe-event-topics
  "Obtains information about which SNS topics receive status messages from the specified directory.


   If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the
   associations in the account.

  request - `com.amazonaws.services.directory.model.DescribeEventTopicsRequest`

  returns: Result of the DescribeEventTopics operation returned by the service. - `com.amazonaws.services.directory.model.DescribeEventTopicsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeEventTopicsResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DescribeEventTopicsRequest request]
    (-> this (.describeEventTopics request))))

(defn describe-trusts
  "Obtains information about the trust relationships for this account.


   If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust
   relationships belonging to the account.

  request - `com.amazonaws.services.directory.model.DescribeTrustsRequest`

  returns: Result of the DescribeTrusts operation returned by the service. - `com.amazonaws.services.directory.model.DescribeTrustsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeTrustsResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DescribeTrustsRequest request]
    (-> this (.describeTrusts request))))

(defn create-alias
  "Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the
   access URL for the directory, such as http://<alias>.awsapps.com.



   After an alias has been created, it cannot be deleted or reused, so this operation should only be used when
   absolutely necessary.

  request - `com.amazonaws.services.directory.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.directory.model.CreateAliasResult`

  throws: com.amazonaws.services.directory.model.EntityAlreadyExistsException - The specified entity already exists."
  (^com.amazonaws.services.directory.model.CreateAliasResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.CreateAliasRequest request]
    (-> this (.createAlias request))))

(defn register-event-topic
  "Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS
   topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get
   notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a
   notification when the directory returns to an Active status.

  request - `com.amazonaws.services.directory.model.RegisterEventTopicRequest`

  returns: Result of the RegisterEventTopic operation returned by the service. - `com.amazonaws.services.directory.model.RegisterEventTopicResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.RegisterEventTopicResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.RegisterEventTopicRequest request]
    (-> this (.registerEventTopic request))))

(defn create-trust
  "AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example,
   you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises
   Microsoft Active Directory. This would allow you to provide users and groups access to resources in either
   domain, with a single set of credentials.


   This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD
   directory and an external domain. You can create either a forest trust or an external trust.

  request - `com.amazonaws.services.directory.model.CreateTrustRequest`

  returns: Result of the CreateTrust operation returned by the service. - `com.amazonaws.services.directory.model.CreateTrustResult`

  throws: com.amazonaws.services.directory.model.EntityAlreadyExistsException - The specified entity already exists."
  (^com.amazonaws.services.directory.model.CreateTrustResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.CreateTrustRequest request]
    (-> this (.createTrust request))))

(defn reset-user-password
  "Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.

  request - `com.amazonaws.services.directory.model.ResetUserPasswordRequest`

  returns: Result of the ResetUserPassword operation returned by the service. - `com.amazonaws.services.directory.model.ResetUserPasswordResult`

  throws: com.amazonaws.services.directory.model.DirectoryUnavailableException - The specified directory is unavailable or could not be found."
  (^com.amazonaws.services.directory.model.ResetUserPasswordResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.ResetUserPasswordRequest request]
    (-> this (.resetUserPassword request))))

(defn cancel-schema-extension
  "Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started
   replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled
   during any of the following states; Initializing, CreatingSnapshot, and
   UpdatingSchema.

  request - `com.amazonaws.services.directory.model.CancelSchemaExtensionRequest`

  returns: Result of the CancelSchemaExtension operation returned by the service. - `com.amazonaws.services.directory.model.CancelSchemaExtensionResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.CancelSchemaExtensionResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.CancelSchemaExtensionRequest request]
    (-> this (.cancelSchemaExtension request))))

(defn get-snapshot-limits
  "Obtains the manual snapshot limits for a directory.

  request - `com.amazonaws.services.directory.model.GetSnapshotLimitsRequest`

  returns: Result of the GetSnapshotLimits operation returned by the service. - `com.amazonaws.services.directory.model.GetSnapshotLimitsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.GetSnapshotLimitsResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.GetSnapshotLimitsRequest request]
    (-> this (.getSnapshotLimits request))))

(defn delete-snapshot
  "Deletes a directory snapshot.

  request - `com.amazonaws.services.directory.model.DeleteSnapshotRequest`

  returns: Result of the DeleteSnapshot operation returned by the service. - `com.amazonaws.services.directory.model.DeleteSnapshotResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteSnapshotResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DeleteSnapshotRequest request]
    (-> this (.deleteSnapshot request))))

(defn verify-trust
  "AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships.


   This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.

  request - `com.amazonaws.services.directory.model.VerifyTrustRequest`

  returns: Result of the VerifyTrust operation returned by the service. - `com.amazonaws.services.directory.model.VerifyTrustResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.VerifyTrustResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.VerifyTrustRequest request]
    (-> this (.verifyTrust request))))

(defn get-directory-limits
  "Obtains directory limit information for the current region.

  request - `com.amazonaws.services.directory.model.GetDirectoryLimitsRequest`

  returns: Result of the GetDirectoryLimits operation returned by the service. - `com.amazonaws.services.directory.model.GetDirectoryLimitsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.GetDirectoryLimitsResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.GetDirectoryLimitsRequest request]
    (-> this (.getDirectoryLimits request)))
  (^com.amazonaws.services.directory.model.GetDirectoryLimitsResult [^AWSDirectoryServiceClient this]
    (-> this (.getDirectoryLimits))))

(defn update-radius
  "Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or
   Microsoft AD directory.

  request - `com.amazonaws.services.directory.model.UpdateRadiusRequest`

  returns: Result of the UpdateRadius operation returned by the service. - `com.amazonaws.services.directory.model.UpdateRadiusResult`

  throws: com.amazonaws.services.directory.model.InvalidParameterException - One or more parameters are not valid."
  (^com.amazonaws.services.directory.model.UpdateRadiusResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.UpdateRadiusRequest request]
    (-> this (.updateRadius request))))

(defn create-log-subscription
  "Creates a subscription to forward real time Directory Service domain controller security logs to the specified
   CloudWatch log group in your AWS account.

  request - `com.amazonaws.services.directory.model.CreateLogSubscriptionRequest`

  returns: Result of the CreateLogSubscription operation returned by the service. - `com.amazonaws.services.directory.model.CreateLogSubscriptionResult`

  throws: com.amazonaws.services.directory.model.EntityAlreadyExistsException - The specified entity already exists."
  (^com.amazonaws.services.directory.model.CreateLogSubscriptionResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.CreateLogSubscriptionRequest request]
    (-> this (.createLogSubscription request))))

(defn delete-conditional-forwarder
  "Deletes a conditional forwarder that has been set up for your AWS directory.

  request - `com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest`

  returns: Result of the DeleteConditionalForwarder operation returned by the service. - `com.amazonaws.services.directory.model.DeleteConditionalForwarderResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteConditionalForwarderResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest request]
    (-> this (.deleteConditionalForwarder request))))

(defn describe-snapshots
  "Obtains information about the directory snapshots that belong to this account.


   This operation supports pagination with the use of the NextToken request and response parameters. If more
   results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next
   call to DescribeSnapshots to retrieve the next set of items.


   You can also specify a maximum number of return results with the Limit parameter.

  request - `com.amazonaws.services.directory.model.DescribeSnapshotsRequest`

  returns: Result of the DescribeSnapshots operation returned by the service. - `com.amazonaws.services.directory.model.DescribeSnapshotsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeSnapshotsResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DescribeSnapshotsRequest request]
    (-> this (.describeSnapshots request)))
  (^com.amazonaws.services.directory.model.DescribeSnapshotsResult [^AWSDirectoryServiceClient this]
    (-> this (.describeSnapshots))))

(defn create-conditional-forwarder
  "Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order
   to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.

  request - `com.amazonaws.services.directory.model.CreateConditionalForwarderRequest`

  returns: Result of the CreateConditionalForwarder operation returned by the service. - `com.amazonaws.services.directory.model.CreateConditionalForwarderResult`

  throws: com.amazonaws.services.directory.model.EntityAlreadyExistsException - The specified entity already exists."
  (^com.amazonaws.services.directory.model.CreateConditionalForwarderResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.CreateConditionalForwarderRequest request]
    (-> this (.createConditionalForwarder request))))

(defn deregister-event-topic
  "Removes the specified directory as a publisher to the specified SNS topic.

  request - `com.amazonaws.services.directory.model.DeregisterEventTopicRequest`

  returns: Result of the DeregisterEventTopic operation returned by the service. - `com.amazonaws.services.directory.model.DeregisterEventTopicResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeregisterEventTopicResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DeregisterEventTopicRequest request]
    (-> this (.deregisterEventTopic request))))

(defn accept-shared-directory
  "Accepts a directory sharing request that was sent from the directory owner account.

  request - `com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest`

  returns: Result of the AcceptSharedDirectory operation returned by the service. - `com.amazonaws.services.directory.model.AcceptSharedDirectoryResult`

  throws: com.amazonaws.services.directory.model.InvalidParameterException - One or more parameters are not valid."
  (^com.amazonaws.services.directory.model.AcceptSharedDirectoryResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest request]
    (-> this (.acceptSharedDirectory request))))

(defn list-log-subscriptions
  "Lists the active log subscriptions for the AWS account.

  request - `com.amazonaws.services.directory.model.ListLogSubscriptionsRequest`

  returns: Result of the ListLogSubscriptions operation returned by the service. - `com.amazonaws.services.directory.model.ListLogSubscriptionsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.ListLogSubscriptionsResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.ListLogSubscriptionsRequest request]
    (-> this (.listLogSubscriptions request))))

(defn disable-sso
  "Disables single-sign on for a directory.

  request - `com.amazonaws.services.directory.model.DisableSsoRequest`

  returns: Result of the DisableSso operation returned by the service. - `com.amazonaws.services.directory.model.DisableSsoResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DisableSsoResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DisableSsoRequest request]
    (-> this (.disableSso request))))

(defn describe-conditional-forwarders
  "Obtains information about the conditional forwarders for this account.


   If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for
   the specified directory ID.

  request - `com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest`

  returns: Result of the DescribeConditionalForwarders operation returned by the service. - `com.amazonaws.services.directory.model.DescribeConditionalForwardersResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeConditionalForwardersResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest request]
    (-> this (.describeConditionalForwarders request))))

(defn remove-tags-from-resource
  "Removes tags from a directory.

  request - `com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.directory.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.RemoveTagsFromResourceResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn reject-shared-directory
  "Rejects a directory sharing request that was sent from the directory owner account.

  request - `com.amazonaws.services.directory.model.RejectSharedDirectoryRequest`

  returns: Result of the RejectSharedDirectory operation returned by the service. - `com.amazonaws.services.directory.model.RejectSharedDirectoryResult`

  throws: com.amazonaws.services.directory.model.InvalidParameterException - One or more parameters are not valid."
  (^com.amazonaws.services.directory.model.RejectSharedDirectoryResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.RejectSharedDirectoryRequest request]
    (-> this (.rejectSharedDirectory request))))

(defn describe-directories
  "Obtains information about the directories that belong to this account.


   You can retrieve information about specific directories by passing the directory identifiers in the
   DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned.


   This operation supports pagination with the use of the NextToken request and response parameters. If
   more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you
   pass in the next call to DescribeDirectories to retrieve the next set of items.


   You can also specify a maximum number of return results with the Limit parameter.

  request - `com.amazonaws.services.directory.model.DescribeDirectoriesRequest`

  returns: Result of the DescribeDirectories operation returned by the service. - `com.amazonaws.services.directory.model.DescribeDirectoriesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeDirectoriesResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DescribeDirectoriesRequest request]
    (-> this (.describeDirectories request)))
  (^com.amazonaws.services.directory.model.DescribeDirectoriesResult [^AWSDirectoryServiceClient this]
    (-> this (.describeDirectories))))

(defn add-tags-to-resource
  "Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags.
   Each tag consists of a key and optional value. Tag keys must be unique to each resource.

  request - `com.amazonaws.services.directory.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.directory.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.AddTagsToResourceResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSDirectoryServiceClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn share-directory
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

  request - `com.amazonaws.services.directory.model.ShareDirectoryRequest`

  returns: Result of the ShareDirectory operation returned by the service. - `com.amazonaws.services.directory.model.ShareDirectoryResult`

  throws: com.amazonaws.services.directory.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.directory.model.ShareDirectoryResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.ShareDirectoryRequest request]
    (-> this (.shareDirectory request))))

(defn delete-log-subscription
  "Deletes the specified log subscription.

  request - `com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest`

  returns: Result of the DeleteLogSubscription operation returned by the service. - `com.amazonaws.services.directory.model.DeleteLogSubscriptionResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteLogSubscriptionResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest request]
    (-> this (.deleteLogSubscription request))))

(defn list-schema-extensions
  "Lists all schema extensions applied to a Microsoft AD Directory.

  request - `com.amazonaws.services.directory.model.ListSchemaExtensionsRequest`

  returns: Result of the ListSchemaExtensions operation returned by the service. - `com.amazonaws.services.directory.model.ListSchemaExtensionsResult`

  throws: com.amazonaws.services.directory.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.directory.model.ListSchemaExtensionsResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.ListSchemaExtensionsRequest request]
    (-> this (.listSchemaExtensions request))))

(defn restore-from-snapshot
  "Restores a directory using an existing directory snapshot.


   When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are
   overwritten.


   This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore
   operation by calling the DescribeDirectories operation with the directory identifier. When the
   DirectoryDescription.Stage value changes to Active, the restore operation is complete.

  request - `com.amazonaws.services.directory.model.RestoreFromSnapshotRequest`

  returns: Result of the RestoreFromSnapshot operation returned by the service. - `com.amazonaws.services.directory.model.RestoreFromSnapshotResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.RestoreFromSnapshotResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.RestoreFromSnapshotRequest request]
    (-> this (.restoreFromSnapshot request))))

(defn create-directory
  "Creates a Simple AD directory.


   Before you call CreateDirectory, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the CreateDirectory
   operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  request - `com.amazonaws.services.directory.model.CreateDirectoryRequest`

  returns: Result of the CreateDirectory operation returned by the service. - `com.amazonaws.services.directory.model.CreateDirectoryResult`

  throws: com.amazonaws.services.directory.model.DirectoryLimitExceededException - The maximum number of directories in the region has been reached. You can use the GetDirectoryLimits operation to determine your directory limits in the region."
  (^com.amazonaws.services.directory.model.CreateDirectoryResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.CreateDirectoryRequest request]
    (-> this (.createDirectory request))))

(defn describe-domain-controllers
  "Provides information about any domain controllers in your directory.

  request - `com.amazonaws.services.directory.model.DescribeDomainControllersRequest`

  returns: Result of the DescribeDomainControllers operation returned by the service. - `com.amazonaws.services.directory.model.DescribeDomainControllersResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeDomainControllersResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DescribeDomainControllersRequest request]
    (-> this (.describeDomainControllers request))))

(defn create-computer
  "Creates a computer account in the specified directory, and joins the computer to the directory.

  request - `com.amazonaws.services.directory.model.CreateComputerRequest`

  returns: Result of the CreateComputer operation returned by the service. - `com.amazonaws.services.directory.model.CreateComputerResult`

  throws: com.amazonaws.services.directory.model.AuthenticationFailedException - An authentication error occurred."
  (^com.amazonaws.services.directory.model.CreateComputerResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.CreateComputerRequest request]
    (-> this (.createComputer request))))

(defn create-snapshot
  "Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.



   You cannot take snapshots of AD Connector directories.

  request - `com.amazonaws.services.directory.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.directory.model.CreateSnapshotResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.CreateSnapshotResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.CreateSnapshotRequest request]
    (-> this (.createSnapshot request))))

(defn disable-radius
  "Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server
   for an AD Connector or Microsoft AD directory.

  request - `com.amazonaws.services.directory.model.DisableRadiusRequest`

  returns: Result of the DisableRadius operation returned by the service. - `com.amazonaws.services.directory.model.DisableRadiusResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DisableRadiusResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.DisableRadiusRequest request]
    (-> this (.disableRadius request))))

(defn create-microsoft-ad
  "Creates an AWS Managed Microsoft AD directory.


   Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD
   operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  request - `com.amazonaws.services.directory.model.CreateMicrosoftADRequest`

  returns: Result of the CreateMicrosoftAD operation returned by the service. - `com.amazonaws.services.directory.model.CreateMicrosoftADResult`

  throws: com.amazonaws.services.directory.model.DirectoryLimitExceededException - The maximum number of directories in the region has been reached. You can use the GetDirectoryLimits operation to determine your directory limits in the region."
  (^com.amazonaws.services.directory.model.CreateMicrosoftADResult [^AWSDirectoryServiceClient this ^com.amazonaws.services.directory.model.CreateMicrosoftADRequest request]
    (-> this (.createMicrosoftAD request))))

