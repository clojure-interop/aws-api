(ns com.amazonaws.services.directory.AWSDirectoryService
  "Interface for accessing Directory Service.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSDirectoryService instead.


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
  (:import [com.amazonaws.services.directory AWSDirectoryService]))

(defn list-ip-routes
  "Lists the address blocks that you have added to a directory.

  list-ip-routes-request - `com.amazonaws.services.directory.model.ListIpRoutesRequest`

  returns: Result of the ListIpRoutes operation returned by the service. - `com.amazonaws.services.directory.model.ListIpRoutesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.ListIpRoutesResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.ListIpRoutesRequest list-ip-routes-request]
    (-> this (.listIpRoutes list-ip-routes-request))))

(defn list-tags-for-resource
  "Lists all tags on a directory.

  list-tags-for-resource-request - `com.amazonaws.services.directory.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.directory.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.ListTagsForResourceResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn remove-ip-routes
  "Removes IP address blocks from a directory.

  remove-ip-routes-request - `com.amazonaws.services.directory.model.RemoveIpRoutesRequest`

  returns: Result of the RemoveIpRoutes operation returned by the service. - `com.amazonaws.services.directory.model.RemoveIpRoutesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.RemoveIpRoutesResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.RemoveIpRoutesRequest remove-ip-routes-request]
    (-> this (.removeIpRoutes remove-ip-routes-request))))

(defn connect-directory
  "Creates an AD Connector to connect to an on-premises directory.


   Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the
   ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  connect-directory-request - Contains the inputs for the ConnectDirectory operation. - `com.amazonaws.services.directory.model.ConnectDirectoryRequest`

  returns: Result of the ConnectDirectory operation returned by the service. - `com.amazonaws.services.directory.model.ConnectDirectoryResult`

  throws: com.amazonaws.services.directory.model.DirectoryLimitExceededException - The maximum number of directories in the region has been reached. You can use the GetDirectoryLimits operation to determine your directory limits in the region."
  (^com.amazonaws.services.directory.model.ConnectDirectoryResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.ConnectDirectoryRequest connect-directory-request]
    (-> this (.connectDirectory connect-directory-request))))

(defn update-trust
  "Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active
   Directory.

  update-trust-request - `com.amazonaws.services.directory.model.UpdateTrustRequest`

  returns: Result of the UpdateTrust operation returned by the service. - `com.amazonaws.services.directory.model.UpdateTrustResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.UpdateTrustResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.UpdateTrustRequest update-trust-request]
    (-> this (.updateTrust update-trust-request))))

(defn add-ip-routes
  "If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address
   block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds
   this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges
   from your Microsoft AD on AWS to a peer VPC.


   Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted
   through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS
   Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  add-ip-routes-request - `com.amazonaws.services.directory.model.AddIpRoutesRequest`

  returns: Result of the AddIpRoutes operation returned by the service. - `com.amazonaws.services.directory.model.AddIpRoutesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.AddIpRoutesResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.AddIpRoutesRequest add-ip-routes-request]
    (-> this (.addIpRoutes add-ip-routes-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSDirectoryService this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-number-of-domain-controllers
  "Adds or removes domain controllers to or from the directory. Based on the difference between current value and
   new value (provided through this API call), domain controllers will be added or removed. It may take up to 45
   minutes for any new domain controllers to become fully active once the requested number of domain controllers is
   updated. During this time, you cannot make another update request.

  update-number-of-domain-controllers-request - `com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest`

  returns: Result of the UpdateNumberOfDomainControllers operation returned by the service. - `com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest update-number-of-domain-controllers-request]
    (-> this (.updateNumberOfDomainControllers update-number-of-domain-controllers-request))))

(defn delete-trust
  "Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.

  delete-trust-request - Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory and the external domain. - `com.amazonaws.services.directory.model.DeleteTrustRequest`

  returns: Result of the DeleteTrust operation returned by the service. - `com.amazonaws.services.directory.model.DeleteTrustResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteTrustResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteTrustRequest delete-trust-request]
    (-> this (.deleteTrust delete-trust-request))))

(defn describe-shared-directories
  "Returns the shared directories in your account.

  describe-shared-directories-request - `com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest`

  returns: Result of the DescribeSharedDirectories operation returned by the service. - `com.amazonaws.services.directory.model.DescribeSharedDirectoriesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeSharedDirectoriesResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest describe-shared-directories-request]
    (-> this (.describeSharedDirectories describe-shared-directories-request))))

(defn delete-directory
  "Deletes an AWS Directory Service directory.


   Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the DeleteDirectory
   operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  delete-directory-request - Contains the inputs for the DeleteDirectory operation. - `com.amazonaws.services.directory.model.DeleteDirectoryRequest`

  returns: Result of the DeleteDirectory operation returned by the service. - `com.amazonaws.services.directory.model.DeleteDirectoryResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteDirectoryResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteDirectoryRequest delete-directory-request]
    (-> this (.deleteDirectory delete-directory-request))))

(defn unshare-directory
  "Stops the directory sharing between the directory owner and consumer accounts.

  unshare-directory-request - `com.amazonaws.services.directory.model.UnshareDirectoryRequest`

  returns: Result of the UnshareDirectory operation returned by the service. - `com.amazonaws.services.directory.model.UnshareDirectoryResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.UnshareDirectoryResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.UnshareDirectoryRequest unshare-directory-request]
    (-> this (.unshareDirectory unshare-directory-request))))

(defn start-schema-extension
  "Applies a schema extension to a Microsoft AD directory.

  start-schema-extension-request - `com.amazonaws.services.directory.model.StartSchemaExtensionRequest`

  returns: Result of the StartSchemaExtension operation returned by the service. - `com.amazonaws.services.directory.model.StartSchemaExtensionResult`

  throws: com.amazonaws.services.directory.model.DirectoryUnavailableException - The specified directory is unavailable or could not be found."
  (^com.amazonaws.services.directory.model.StartSchemaExtensionResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.StartSchemaExtensionRequest start-schema-extension-request]
    (-> this (.startSchemaExtension start-schema-extension-request))))

(defn enable-radius
  "Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for
   an AD Connector or Microsoft AD directory.

  enable-radius-request - Contains the inputs for the EnableRadius operation. - `com.amazonaws.services.directory.model.EnableRadiusRequest`

  returns: Result of the EnableRadius operation returned by the service. - `com.amazonaws.services.directory.model.EnableRadiusResult`

  throws: com.amazonaws.services.directory.model.InvalidParameterException - One or more parameters are not valid."
  (^com.amazonaws.services.directory.model.EnableRadiusResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.EnableRadiusRequest enable-radius-request]
    (-> this (.enableRadius enable-radius-request))))

(defn enable-sso
  "Enables single sign-on for a directory.

  enable-sso-request - Contains the inputs for the EnableSso operation. - `com.amazonaws.services.directory.model.EnableSsoRequest`

  returns: Result of the EnableSso operation returned by the service. - `com.amazonaws.services.directory.model.EnableSsoResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.EnableSsoResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.EnableSsoRequest enable-sso-request]
    (-> this (.enableSso enable-sso-request))))

(defn update-conditional-forwarder
  "Updates a conditional forwarder that has been set up for your AWS directory.

  update-conditional-forwarder-request - Updates a conditional forwarder. - `com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest`

  returns: Result of the UpdateConditionalForwarder operation returned by the service. - `com.amazonaws.services.directory.model.UpdateConditionalForwarderResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.UpdateConditionalForwarderResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest update-conditional-forwarder-request]
    (-> this (.updateConditionalForwarder update-conditional-forwarder-request))))

(defn describe-event-topics
  "Obtains information about which SNS topics receive status messages from the specified directory.


   If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the
   associations in the account.

  describe-event-topics-request - Describes event topics. - `com.amazonaws.services.directory.model.DescribeEventTopicsRequest`

  returns: Result of the DescribeEventTopics operation returned by the service. - `com.amazonaws.services.directory.model.DescribeEventTopicsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeEventTopicsResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeEventTopicsRequest describe-event-topics-request]
    (-> this (.describeEventTopics describe-event-topics-request))))

(defn describe-trusts
  "Obtains information about the trust relationships for this account.


   If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust
   relationships belonging to the account.

  describe-trusts-request - Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input parameters are are provided, such as directory ID or trust ID, this request describes all the trust relationships. - `com.amazonaws.services.directory.model.DescribeTrustsRequest`

  returns: Result of the DescribeTrusts operation returned by the service. - `com.amazonaws.services.directory.model.DescribeTrustsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeTrustsResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeTrustsRequest describe-trusts-request]
    (-> this (.describeTrusts describe-trusts-request))))

(defn create-alias
  "Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the
   access URL for the directory, such as http://<alias>.awsapps.com.



   After an alias has been created, it cannot be deleted or reused, so this operation should only be used when
   absolutely necessary.

  create-alias-request - Contains the inputs for the CreateAlias operation. - `com.amazonaws.services.directory.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.directory.model.CreateAliasResult`

  throws: com.amazonaws.services.directory.model.EntityAlreadyExistsException - The specified entity already exists."
  (^com.amazonaws.services.directory.model.CreateAliasResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.CreateAliasRequest create-alias-request]
    (-> this (.createAlias create-alias-request))))

(defn register-event-topic
  "Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS
   topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get
   notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a
   notification when the directory returns to an Active status.

  register-event-topic-request - Registers a new event topic. - `com.amazonaws.services.directory.model.RegisterEventTopicRequest`

  returns: Result of the RegisterEventTopic operation returned by the service. - `com.amazonaws.services.directory.model.RegisterEventTopicResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.RegisterEventTopicResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.RegisterEventTopicRequest register-event-topic-request]
    (-> this (.registerEventTopic register-event-topic-request))))

(defn create-trust
  "AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example,
   you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises
   Microsoft Active Directory. This would allow you to provide users and groups access to resources in either
   domain, with a single set of credentials.


   This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD
   directory and an external domain. You can create either a forest trust or an external trust.

  create-trust-request - AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. - `com.amazonaws.services.directory.model.CreateTrustRequest`

  returns: Result of the CreateTrust operation returned by the service. - `com.amazonaws.services.directory.model.CreateTrustResult`

  throws: com.amazonaws.services.directory.model.EntityAlreadyExistsException - The specified entity already exists."
  (^com.amazonaws.services.directory.model.CreateTrustResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.CreateTrustRequest create-trust-request]
    (-> this (.createTrust create-trust-request))))

(defn reset-user-password
  "Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.

  reset-user-password-request - `com.amazonaws.services.directory.model.ResetUserPasswordRequest`

  returns: Result of the ResetUserPassword operation returned by the service. - `com.amazonaws.services.directory.model.ResetUserPasswordResult`

  throws: com.amazonaws.services.directory.model.DirectoryUnavailableException - The specified directory is unavailable or could not be found."
  (^com.amazonaws.services.directory.model.ResetUserPasswordResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.ResetUserPasswordRequest reset-user-password-request]
    (-> this (.resetUserPassword reset-user-password-request))))

(defn cancel-schema-extension
  "Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started
   replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled
   during any of the following states; Initializing, CreatingSnapshot, and
   UpdatingSchema.

  cancel-schema-extension-request - `com.amazonaws.services.directory.model.CancelSchemaExtensionRequest`

  returns: Result of the CancelSchemaExtension operation returned by the service. - `com.amazonaws.services.directory.model.CancelSchemaExtensionResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.CancelSchemaExtensionResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.CancelSchemaExtensionRequest cancel-schema-extension-request]
    (-> this (.cancelSchemaExtension cancel-schema-extension-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSDirectoryService this]
    (-> this (.shutdown))))

(defn get-snapshot-limits
  "Obtains the manual snapshot limits for a directory.

  get-snapshot-limits-request - Contains the inputs for the GetSnapshotLimits operation. - `com.amazonaws.services.directory.model.GetSnapshotLimitsRequest`

  returns: Result of the GetSnapshotLimits operation returned by the service. - `com.amazonaws.services.directory.model.GetSnapshotLimitsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.GetSnapshotLimitsResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.GetSnapshotLimitsRequest get-snapshot-limits-request]
    (-> this (.getSnapshotLimits get-snapshot-limits-request))))

(defn delete-snapshot
  "Deletes a directory snapshot.

  delete-snapshot-request - Contains the inputs for the DeleteSnapshot operation. - `com.amazonaws.services.directory.model.DeleteSnapshotRequest`

  returns: Result of the DeleteSnapshot operation returned by the service. - `com.amazonaws.services.directory.model.DeleteSnapshotResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteSnapshotResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteSnapshotRequest delete-snapshot-request]
    (-> this (.deleteSnapshot delete-snapshot-request))))

(defn verify-trust
  "AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships.


   This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.

  verify-trust-request - Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory and an external domain. - `com.amazonaws.services.directory.model.VerifyTrustRequest`

  returns: Result of the VerifyTrust operation returned by the service. - `com.amazonaws.services.directory.model.VerifyTrustResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.VerifyTrustResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.VerifyTrustRequest verify-trust-request]
    (-> this (.verifyTrust verify-trust-request))))

(defn get-directory-limits
  "Obtains directory limit information for the current region.

  get-directory-limits-request - Contains the inputs for the GetDirectoryLimits operation. - `com.amazonaws.services.directory.model.GetDirectoryLimitsRequest`

  returns: Result of the GetDirectoryLimits operation returned by the service. - `com.amazonaws.services.directory.model.GetDirectoryLimitsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.GetDirectoryLimitsResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.GetDirectoryLimitsRequest get-directory-limits-request]
    (-> this (.getDirectoryLimits get-directory-limits-request)))
  (^com.amazonaws.services.directory.model.GetDirectoryLimitsResult [^AWSDirectoryService this]
    (-> this (.getDirectoryLimits))))

(defn update-radius
  "Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or
   Microsoft AD directory.

  update-radius-request - Contains the inputs for the UpdateRadius operation. - `com.amazonaws.services.directory.model.UpdateRadiusRequest`

  returns: Result of the UpdateRadius operation returned by the service. - `com.amazonaws.services.directory.model.UpdateRadiusResult`

  throws: com.amazonaws.services.directory.model.InvalidParameterException - One or more parameters are not valid."
  (^com.amazonaws.services.directory.model.UpdateRadiusResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.UpdateRadiusRequest update-radius-request]
    (-> this (.updateRadius update-radius-request))))

(defn create-log-subscription
  "Creates a subscription to forward real time Directory Service domain controller security logs to the specified
   CloudWatch log group in your AWS account.

  create-log-subscription-request - `com.amazonaws.services.directory.model.CreateLogSubscriptionRequest`

  returns: Result of the CreateLogSubscription operation returned by the service. - `com.amazonaws.services.directory.model.CreateLogSubscriptionResult`

  throws: com.amazonaws.services.directory.model.EntityAlreadyExistsException - The specified entity already exists."
  (^com.amazonaws.services.directory.model.CreateLogSubscriptionResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.CreateLogSubscriptionRequest create-log-subscription-request]
    (-> this (.createLogSubscription create-log-subscription-request))))

(defn delete-conditional-forwarder
  "Deletes a conditional forwarder that has been set up for your AWS directory.

  delete-conditional-forwarder-request - Deletes a conditional forwarder. - `com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest`

  returns: Result of the DeleteConditionalForwarder operation returned by the service. - `com.amazonaws.services.directory.model.DeleteConditionalForwarderResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteConditionalForwarderResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest delete-conditional-forwarder-request]
    (-> this (.deleteConditionalForwarder delete-conditional-forwarder-request))))

(defn describe-snapshots
  "Obtains information about the directory snapshots that belong to this account.


   This operation supports pagination with the use of the NextToken request and response parameters. If more
   results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next
   call to DescribeSnapshots to retrieve the next set of items.


   You can also specify a maximum number of return results with the Limit parameter.

  describe-snapshots-request - Contains the inputs for the DescribeSnapshots operation. - `com.amazonaws.services.directory.model.DescribeSnapshotsRequest`

  returns: Result of the DescribeSnapshots operation returned by the service. - `com.amazonaws.services.directory.model.DescribeSnapshotsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeSnapshotsResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeSnapshotsRequest describe-snapshots-request]
    (-> this (.describeSnapshots describe-snapshots-request)))
  (^com.amazonaws.services.directory.model.DescribeSnapshotsResult [^AWSDirectoryService this]
    (-> this (.describeSnapshots))))

(defn create-conditional-forwarder
  "Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order
   to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.

  create-conditional-forwarder-request - Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active Directory. Conditional forwarders are required in order to set up a trust relationship with another domain. - `com.amazonaws.services.directory.model.CreateConditionalForwarderRequest`

  returns: Result of the CreateConditionalForwarder operation returned by the service. - `com.amazonaws.services.directory.model.CreateConditionalForwarderResult`

  throws: com.amazonaws.services.directory.model.EntityAlreadyExistsException - The specified entity already exists."
  (^com.amazonaws.services.directory.model.CreateConditionalForwarderResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.CreateConditionalForwarderRequest create-conditional-forwarder-request]
    (-> this (.createConditionalForwarder create-conditional-forwarder-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"ds.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://ds.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSDirectoryService this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn deregister-event-topic
  "Removes the specified directory as a publisher to the specified SNS topic.

  deregister-event-topic-request - Removes the specified directory as a publisher to the specified SNS topic. - `com.amazonaws.services.directory.model.DeregisterEventTopicRequest`

  returns: Result of the DeregisterEventTopic operation returned by the service. - `com.amazonaws.services.directory.model.DeregisterEventTopicResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeregisterEventTopicResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DeregisterEventTopicRequest deregister-event-topic-request]
    (-> this (.deregisterEventTopic deregister-event-topic-request))))

(defn accept-shared-directory
  "Accepts a directory sharing request that was sent from the directory owner account.

  accept-shared-directory-request - `com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest`

  returns: Result of the AcceptSharedDirectory operation returned by the service. - `com.amazonaws.services.directory.model.AcceptSharedDirectoryResult`

  throws: com.amazonaws.services.directory.model.InvalidParameterException - One or more parameters are not valid."
  (^com.amazonaws.services.directory.model.AcceptSharedDirectoryResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest accept-shared-directory-request]
    (-> this (.acceptSharedDirectory accept-shared-directory-request))))

(defn list-log-subscriptions
  "Lists the active log subscriptions for the AWS account.

  list-log-subscriptions-request - `com.amazonaws.services.directory.model.ListLogSubscriptionsRequest`

  returns: Result of the ListLogSubscriptions operation returned by the service. - `com.amazonaws.services.directory.model.ListLogSubscriptionsResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.ListLogSubscriptionsResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.ListLogSubscriptionsRequest list-log-subscriptions-request]
    (-> this (.listLogSubscriptions list-log-subscriptions-request))))

(defn disable-sso
  "Disables single-sign on for a directory.

  disable-sso-request - Contains the inputs for the DisableSso operation. - `com.amazonaws.services.directory.model.DisableSsoRequest`

  returns: Result of the DisableSso operation returned by the service. - `com.amazonaws.services.directory.model.DisableSsoResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DisableSsoResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DisableSsoRequest disable-sso-request]
    (-> this (.disableSso disable-sso-request))))

(defn describe-conditional-forwarders
  "Obtains information about the conditional forwarders for this account.


   If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for
   the specified directory ID.

  describe-conditional-forwarders-request - Describes a conditional forwarder. - `com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest`

  returns: Result of the DescribeConditionalForwarders operation returned by the service. - `com.amazonaws.services.directory.model.DescribeConditionalForwardersResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeConditionalForwardersResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest describe-conditional-forwarders-request]
    (-> this (.describeConditionalForwarders describe-conditional-forwarders-request))))

(defn remove-tags-from-resource
  "Removes tags from a directory.

  remove-tags-from-resource-request - `com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.directory.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.RemoveTagsFromResourceResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResource remove-tags-from-resource-request))))

(defn reject-shared-directory
  "Rejects a directory sharing request that was sent from the directory owner account.

  reject-shared-directory-request - `com.amazonaws.services.directory.model.RejectSharedDirectoryRequest`

  returns: Result of the RejectSharedDirectory operation returned by the service. - `com.amazonaws.services.directory.model.RejectSharedDirectoryResult`

  throws: com.amazonaws.services.directory.model.InvalidParameterException - One or more parameters are not valid."
  (^com.amazonaws.services.directory.model.RejectSharedDirectoryResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.RejectSharedDirectoryRequest reject-shared-directory-request]
    (-> this (.rejectSharedDirectory reject-shared-directory-request))))

(defn describe-directories
  "Obtains information about the directories that belong to this account.


   You can retrieve information about specific directories by passing the directory identifiers in the
   DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned.


   This operation supports pagination with the use of the NextToken request and response parameters. If
   more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you
   pass in the next call to DescribeDirectories to retrieve the next set of items.


   You can also specify a maximum number of return results with the Limit parameter.

  describe-directories-request - Contains the inputs for the DescribeDirectories operation. - `com.amazonaws.services.directory.model.DescribeDirectoriesRequest`

  returns: Result of the DescribeDirectories operation returned by the service. - `com.amazonaws.services.directory.model.DescribeDirectoriesResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeDirectoriesResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeDirectoriesRequest describe-directories-request]
    (-> this (.describeDirectories describe-directories-request)))
  (^com.amazonaws.services.directory.model.DescribeDirectoriesResult [^AWSDirectoryService this]
    (-> this (.describeDirectories))))

(defn add-tags-to-resource
  "Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags.
   Each tag consists of a key and optional value. Tag keys must be unique to each resource.

  add-tags-to-resource-request - `com.amazonaws.services.directory.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.directory.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.AddTagsToResourceResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResource add-tags-to-resource-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSDirectoryService this ^com.amazonaws.AmazonWebServiceRequest request]
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

  share-directory-request - `com.amazonaws.services.directory.model.ShareDirectoryRequest`

  returns: Result of the ShareDirectory operation returned by the service. - `com.amazonaws.services.directory.model.ShareDirectoryResult`

  throws: com.amazonaws.services.directory.model.AccessDeniedException - You do not have sufficient access to perform this action."
  (^com.amazonaws.services.directory.model.ShareDirectoryResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.ShareDirectoryRequest share-directory-request]
    (-> this (.shareDirectory share-directory-request))))

(defn delete-log-subscription
  "Deletes the specified log subscription.

  delete-log-subscription-request - `com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest`

  returns: Result of the DeleteLogSubscription operation returned by the service. - `com.amazonaws.services.directory.model.DeleteLogSubscriptionResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DeleteLogSubscriptionResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest delete-log-subscription-request]
    (-> this (.deleteLogSubscription delete-log-subscription-request))))

(defn list-schema-extensions
  "Lists all schema extensions applied to a Microsoft AD Directory.

  list-schema-extensions-request - `com.amazonaws.services.directory.model.ListSchemaExtensionsRequest`

  returns: Result of the ListSchemaExtensions operation returned by the service. - `com.amazonaws.services.directory.model.ListSchemaExtensionsResult`

  throws: com.amazonaws.services.directory.model.InvalidNextTokenException - The NextToken value is not valid."
  (^com.amazonaws.services.directory.model.ListSchemaExtensionsResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.ListSchemaExtensionsRequest list-schema-extensions-request]
    (-> this (.listSchemaExtensions list-schema-extensions-request))))

(defn restore-from-snapshot
  "Restores a directory using an existing directory snapshot.


   When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are
   overwritten.


   This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore
   operation by calling the DescribeDirectories operation with the directory identifier. When the
   DirectoryDescription.Stage value changes to Active, the restore operation is complete.

  restore-from-snapshot-request - An object representing the inputs for the RestoreFromSnapshot operation. - `com.amazonaws.services.directory.model.RestoreFromSnapshotRequest`

  returns: Result of the RestoreFromSnapshot operation returned by the service. - `com.amazonaws.services.directory.model.RestoreFromSnapshotResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.RestoreFromSnapshotResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.RestoreFromSnapshotRequest restore-from-snapshot-request]
    (-> this (.restoreFromSnapshot restore-from-snapshot-request))))

(defn create-directory
  "Creates a Simple AD directory.


   Before you call CreateDirectory, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the CreateDirectory
   operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  create-directory-request - Contains the inputs for the CreateDirectory operation. - `com.amazonaws.services.directory.model.CreateDirectoryRequest`

  returns: Result of the CreateDirectory operation returned by the service. - `com.amazonaws.services.directory.model.CreateDirectoryResult`

  throws: com.amazonaws.services.directory.model.DirectoryLimitExceededException - The maximum number of directories in the region has been reached. You can use the GetDirectoryLimits operation to determine your directory limits in the region."
  (^com.amazonaws.services.directory.model.CreateDirectoryResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.CreateDirectoryRequest create-directory-request]
    (-> this (.createDirectory create-directory-request))))

(defn describe-domain-controllers
  "Provides information about any domain controllers in your directory.

  describe-domain-controllers-request - `com.amazonaws.services.directory.model.DescribeDomainControllersRequest`

  returns: Result of the DescribeDomainControllers operation returned by the service. - `com.amazonaws.services.directory.model.DescribeDomainControllersResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DescribeDomainControllersResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeDomainControllersRequest describe-domain-controllers-request]
    (-> this (.describeDomainControllers describe-domain-controllers-request))))

(defn create-computer
  "Creates a computer account in the specified directory, and joins the computer to the directory.

  create-computer-request - Contains the inputs for the CreateComputer operation. - `com.amazonaws.services.directory.model.CreateComputerRequest`

  returns: Result of the CreateComputer operation returned by the service. - `com.amazonaws.services.directory.model.CreateComputerResult`

  throws: com.amazonaws.services.directory.model.AuthenticationFailedException - An authentication error occurred."
  (^com.amazonaws.services.directory.model.CreateComputerResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.CreateComputerRequest create-computer-request]
    (-> this (.createComputer create-computer-request))))

(defn create-snapshot
  "Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.



   You cannot take snapshots of AD Connector directories.

  create-snapshot-request - Contains the inputs for the CreateSnapshot operation. - `com.amazonaws.services.directory.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.directory.model.CreateSnapshotResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.CreateSnapshotResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.CreateSnapshotRequest create-snapshot-request]
    (-> this (.createSnapshot create-snapshot-request))))

(defn disable-radius
  "Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server
   for an AD Connector or Microsoft AD directory.

  disable-radius-request - Contains the inputs for the DisableRadius operation. - `com.amazonaws.services.directory.model.DisableRadiusRequest`

  returns: Result of the DisableRadius operation returned by the service. - `com.amazonaws.services.directory.model.DisableRadiusResult`

  throws: com.amazonaws.services.directory.model.EntityDoesNotExistException - The specified entity could not be found."
  (^com.amazonaws.services.directory.model.DisableRadiusResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.DisableRadiusRequest disable-radius-request]
    (-> this (.disableRadius disable-radius-request))))

(defn create-microsoft-ad
  "Creates an AWS Managed Microsoft AD directory.


   Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly
   granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD
   operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.

  create-microsoft-ad-request - Creates an AWS Managed Microsoft AD directory. - `com.amazonaws.services.directory.model.CreateMicrosoftADRequest`

  returns: Result of the CreateMicrosoftAD operation returned by the service. - `com.amazonaws.services.directory.model.CreateMicrosoftADResult`

  throws: com.amazonaws.services.directory.model.DirectoryLimitExceededException - The maximum number of directories in the region has been reached. You can use the GetDirectoryLimits operation to determine your directory limits in the region."
  (^com.amazonaws.services.directory.model.CreateMicrosoftADResult [^AWSDirectoryService this ^com.amazonaws.services.directory.model.CreateMicrosoftADRequest create-microsoft-ad-request]
    (-> this (.createMicrosoftAD create-microsoft-ad-request))))

