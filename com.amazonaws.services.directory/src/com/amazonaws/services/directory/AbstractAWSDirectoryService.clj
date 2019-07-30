(ns com.amazonaws.services.directory.AbstractAWSDirectoryService
  "Abstract implementation of AWSDirectoryService. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.directory AbstractAWSDirectoryService]))

(defn list-ip-routes
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.ListIpRoutesRequest`

  returns: Result of the ListIpRoutes operation returned by the service. - `com.amazonaws.services.directory.model.ListIpRoutesResult`"
  (^com.amazonaws.services.directory.model.ListIpRoutesResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.ListIpRoutesRequest request]
    (-> this (.listIpRoutes request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.directory.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.directory.model.ListTagsForResourceResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn remove-ip-routes
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.RemoveIpRoutesRequest`

  returns: Result of the RemoveIpRoutes operation returned by the service. - `com.amazonaws.services.directory.model.RemoveIpRoutesResult`"
  (^com.amazonaws.services.directory.model.RemoveIpRoutesResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.RemoveIpRoutesRequest request]
    (-> this (.removeIpRoutes request))))

(defn connect-directory
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the ConnectDirectory operation. - `com.amazonaws.services.directory.model.ConnectDirectoryRequest`

  returns: Result of the ConnectDirectory operation returned by the service. - `com.amazonaws.services.directory.model.ConnectDirectoryResult`"
  (^com.amazonaws.services.directory.model.ConnectDirectoryResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.ConnectDirectoryRequest request]
    (-> this (.connectDirectory request))))

(defn update-trust
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.UpdateTrustRequest`

  returns: Result of the UpdateTrust operation returned by the service. - `com.amazonaws.services.directory.model.UpdateTrustResult`"
  (^com.amazonaws.services.directory.model.UpdateTrustResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.UpdateTrustRequest request]
    (-> this (.updateTrust request))))

(defn add-ip-routes
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.AddIpRoutesRequest`

  returns: Result of the AddIpRoutes operation returned by the service. - `com.amazonaws.services.directory.model.AddIpRoutesResult`"
  (^com.amazonaws.services.directory.model.AddIpRoutesResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.AddIpRoutesRequest request]
    (-> this (.addIpRoutes request))))

(defn set-region
  "Description copied from interface: AWSDirectoryService

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSDirectoryService this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-number-of-domain-controllers
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest`

  returns: Result of the UpdateNumberOfDomainControllers operation returned by the service. - `com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult`"
  (^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.UpdateNumberOfDomainControllersRequest request]
    (-> this (.updateNumberOfDomainControllers request))))

(defn delete-trust
  "Description copied from interface: AWSDirectoryService

  request - Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory and the external domain. - `com.amazonaws.services.directory.model.DeleteTrustRequest`

  returns: Result of the DeleteTrust operation returned by the service. - `com.amazonaws.services.directory.model.DeleteTrustResult`"
  (^com.amazonaws.services.directory.model.DeleteTrustResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteTrustRequest request]
    (-> this (.deleteTrust request))))

(defn describe-shared-directories
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest`

  returns: Result of the DescribeSharedDirectories operation returned by the service. - `com.amazonaws.services.directory.model.DescribeSharedDirectoriesResult`"
  (^com.amazonaws.services.directory.model.DescribeSharedDirectoriesResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeSharedDirectoriesRequest request]
    (-> this (.describeSharedDirectories request))))

(defn delete-directory
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the DeleteDirectory operation. - `com.amazonaws.services.directory.model.DeleteDirectoryRequest`

  returns: Result of the DeleteDirectory operation returned by the service. - `com.amazonaws.services.directory.model.DeleteDirectoryResult`"
  (^com.amazonaws.services.directory.model.DeleteDirectoryResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteDirectoryRequest request]
    (-> this (.deleteDirectory request))))

(defn unshare-directory
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.UnshareDirectoryRequest`

  returns: Result of the UnshareDirectory operation returned by the service. - `com.amazonaws.services.directory.model.UnshareDirectoryResult`"
  (^com.amazonaws.services.directory.model.UnshareDirectoryResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.UnshareDirectoryRequest request]
    (-> this (.unshareDirectory request))))

(defn start-schema-extension
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.StartSchemaExtensionRequest`

  returns: Result of the StartSchemaExtension operation returned by the service. - `com.amazonaws.services.directory.model.StartSchemaExtensionResult`"
  (^com.amazonaws.services.directory.model.StartSchemaExtensionResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.StartSchemaExtensionRequest request]
    (-> this (.startSchemaExtension request))))

(defn enable-radius
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the EnableRadius operation. - `com.amazonaws.services.directory.model.EnableRadiusRequest`

  returns: Result of the EnableRadius operation returned by the service. - `com.amazonaws.services.directory.model.EnableRadiusResult`"
  (^com.amazonaws.services.directory.model.EnableRadiusResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.EnableRadiusRequest request]
    (-> this (.enableRadius request))))

(defn enable-sso
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the EnableSso operation. - `com.amazonaws.services.directory.model.EnableSsoRequest`

  returns: Result of the EnableSso operation returned by the service. - `com.amazonaws.services.directory.model.EnableSsoResult`"
  (^com.amazonaws.services.directory.model.EnableSsoResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.EnableSsoRequest request]
    (-> this (.enableSso request))))

(defn update-conditional-forwarder
  "Description copied from interface: AWSDirectoryService

  request - Updates a conditional forwarder. - `com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest`

  returns: Result of the UpdateConditionalForwarder operation returned by the service. - `com.amazonaws.services.directory.model.UpdateConditionalForwarderResult`"
  (^com.amazonaws.services.directory.model.UpdateConditionalForwarderResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.UpdateConditionalForwarderRequest request]
    (-> this (.updateConditionalForwarder request))))

(defn describe-event-topics
  "Description copied from interface: AWSDirectoryService

  request - Describes event topics. - `com.amazonaws.services.directory.model.DescribeEventTopicsRequest`

  returns: Result of the DescribeEventTopics operation returned by the service. - `com.amazonaws.services.directory.model.DescribeEventTopicsResult`"
  (^com.amazonaws.services.directory.model.DescribeEventTopicsResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeEventTopicsRequest request]
    (-> this (.describeEventTopics request))))

(defn describe-trusts
  "Description copied from interface: AWSDirectoryService

  request - Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input parameters are are provided, such as directory ID or trust ID, this request describes all the trust relationships. - `com.amazonaws.services.directory.model.DescribeTrustsRequest`

  returns: Result of the DescribeTrusts operation returned by the service. - `com.amazonaws.services.directory.model.DescribeTrustsResult`"
  (^com.amazonaws.services.directory.model.DescribeTrustsResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeTrustsRequest request]
    (-> this (.describeTrusts request))))

(defn create-alias
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the CreateAlias operation. - `com.amazonaws.services.directory.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.directory.model.CreateAliasResult`"
  (^com.amazonaws.services.directory.model.CreateAliasResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.CreateAliasRequest request]
    (-> this (.createAlias request))))

(defn register-event-topic
  "Description copied from interface: AWSDirectoryService

  request - Registers a new event topic. - `com.amazonaws.services.directory.model.RegisterEventTopicRequest`

  returns: Result of the RegisterEventTopic operation returned by the service. - `com.amazonaws.services.directory.model.RegisterEventTopicResult`"
  (^com.amazonaws.services.directory.model.RegisterEventTopicResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.RegisterEventTopicRequest request]
    (-> this (.registerEventTopic request))))

(defn create-trust
  "Description copied from interface: AWSDirectoryService

  request - AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. - `com.amazonaws.services.directory.model.CreateTrustRequest`

  returns: Result of the CreateTrust operation returned by the service. - `com.amazonaws.services.directory.model.CreateTrustResult`"
  (^com.amazonaws.services.directory.model.CreateTrustResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.CreateTrustRequest request]
    (-> this (.createTrust request))))

(defn reset-user-password
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.ResetUserPasswordRequest`

  returns: Result of the ResetUserPassword operation returned by the service. - `com.amazonaws.services.directory.model.ResetUserPasswordResult`"
  (^com.amazonaws.services.directory.model.ResetUserPasswordResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.ResetUserPasswordRequest request]
    (-> this (.resetUserPassword request))))

(defn cancel-schema-extension
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.CancelSchemaExtensionRequest`

  returns: Result of the CancelSchemaExtension operation returned by the service. - `com.amazonaws.services.directory.model.CancelSchemaExtensionResult`"
  (^com.amazonaws.services.directory.model.CancelSchemaExtensionResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.CancelSchemaExtensionRequest request]
    (-> this (.cancelSchemaExtension request))))

(defn shutdown
  "Description copied from interface: AWSDirectoryService"
  ([^AbstractAWSDirectoryService this]
    (-> this (.shutdown))))

(defn get-snapshot-limits
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the GetSnapshotLimits operation. - `com.amazonaws.services.directory.model.GetSnapshotLimitsRequest`

  returns: Result of the GetSnapshotLimits operation returned by the service. - `com.amazonaws.services.directory.model.GetSnapshotLimitsResult`"
  (^com.amazonaws.services.directory.model.GetSnapshotLimitsResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.GetSnapshotLimitsRequest request]
    (-> this (.getSnapshotLimits request))))

(defn delete-snapshot
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the DeleteSnapshot operation. - `com.amazonaws.services.directory.model.DeleteSnapshotRequest`

  returns: Result of the DeleteSnapshot operation returned by the service. - `com.amazonaws.services.directory.model.DeleteSnapshotResult`"
  (^com.amazonaws.services.directory.model.DeleteSnapshotResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteSnapshotRequest request]
    (-> this (.deleteSnapshot request))))

(defn verify-trust
  "Description copied from interface: AWSDirectoryService

  request - Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory and an external domain. - `com.amazonaws.services.directory.model.VerifyTrustRequest`

  returns: Result of the VerifyTrust operation returned by the service. - `com.amazonaws.services.directory.model.VerifyTrustResult`"
  (^com.amazonaws.services.directory.model.VerifyTrustResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.VerifyTrustRequest request]
    (-> this (.verifyTrust request))))

(defn get-directory-limits
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the GetDirectoryLimits operation. - `com.amazonaws.services.directory.model.GetDirectoryLimitsRequest`

  returns: Result of the GetDirectoryLimits operation returned by the service. - `com.amazonaws.services.directory.model.GetDirectoryLimitsResult`"
  (^com.amazonaws.services.directory.model.GetDirectoryLimitsResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.GetDirectoryLimitsRequest request]
    (-> this (.getDirectoryLimits request)))
  (^com.amazonaws.services.directory.model.GetDirectoryLimitsResult [^AbstractAWSDirectoryService this]
    (-> this (.getDirectoryLimits))))

(defn update-radius
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the UpdateRadius operation. - `com.amazonaws.services.directory.model.UpdateRadiusRequest`

  returns: Result of the UpdateRadius operation returned by the service. - `com.amazonaws.services.directory.model.UpdateRadiusResult`"
  (^com.amazonaws.services.directory.model.UpdateRadiusResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.UpdateRadiusRequest request]
    (-> this (.updateRadius request))))

(defn create-log-subscription
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.CreateLogSubscriptionRequest`

  returns: Result of the CreateLogSubscription operation returned by the service. - `com.amazonaws.services.directory.model.CreateLogSubscriptionResult`"
  (^com.amazonaws.services.directory.model.CreateLogSubscriptionResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.CreateLogSubscriptionRequest request]
    (-> this (.createLogSubscription request))))

(defn delete-conditional-forwarder
  "Description copied from interface: AWSDirectoryService

  request - Deletes a conditional forwarder. - `com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest`

  returns: Result of the DeleteConditionalForwarder operation returned by the service. - `com.amazonaws.services.directory.model.DeleteConditionalForwarderResult`"
  (^com.amazonaws.services.directory.model.DeleteConditionalForwarderResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteConditionalForwarderRequest request]
    (-> this (.deleteConditionalForwarder request))))

(defn describe-snapshots
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the DescribeSnapshots operation. - `com.amazonaws.services.directory.model.DescribeSnapshotsRequest`

  returns: Result of the DescribeSnapshots operation returned by the service. - `com.amazonaws.services.directory.model.DescribeSnapshotsResult`"
  (^com.amazonaws.services.directory.model.DescribeSnapshotsResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeSnapshotsRequest request]
    (-> this (.describeSnapshots request)))
  (^com.amazonaws.services.directory.model.DescribeSnapshotsResult [^AbstractAWSDirectoryService this]
    (-> this (.describeSnapshots))))

(defn create-conditional-forwarder
  "Description copied from interface: AWSDirectoryService

  request - Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active Directory. Conditional forwarders are required in order to set up a trust relationship with another domain. - `com.amazonaws.services.directory.model.CreateConditionalForwarderRequest`

  returns: Result of the CreateConditionalForwarder operation returned by the service. - `com.amazonaws.services.directory.model.CreateConditionalForwarderResult`"
  (^com.amazonaws.services.directory.model.CreateConditionalForwarderResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.CreateConditionalForwarderRequest request]
    (-> this (.createConditionalForwarder request))))

(defn set-endpoint
  "Description copied from interface: AWSDirectoryService

  endpoint - The endpoint (ex: \"ds.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://ds.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSDirectoryService this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn deregister-event-topic
  "Description copied from interface: AWSDirectoryService

  request - Removes the specified directory as a publisher to the specified SNS topic. - `com.amazonaws.services.directory.model.DeregisterEventTopicRequest`

  returns: Result of the DeregisterEventTopic operation returned by the service. - `com.amazonaws.services.directory.model.DeregisterEventTopicResult`"
  (^com.amazonaws.services.directory.model.DeregisterEventTopicResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DeregisterEventTopicRequest request]
    (-> this (.deregisterEventTopic request))))

(defn accept-shared-directory
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest`

  returns: Result of the AcceptSharedDirectory operation returned by the service. - `com.amazonaws.services.directory.model.AcceptSharedDirectoryResult`"
  (^com.amazonaws.services.directory.model.AcceptSharedDirectoryResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.AcceptSharedDirectoryRequest request]
    (-> this (.acceptSharedDirectory request))))

(defn list-log-subscriptions
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.ListLogSubscriptionsRequest`

  returns: Result of the ListLogSubscriptions operation returned by the service. - `com.amazonaws.services.directory.model.ListLogSubscriptionsResult`"
  (^com.amazonaws.services.directory.model.ListLogSubscriptionsResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.ListLogSubscriptionsRequest request]
    (-> this (.listLogSubscriptions request))))

(defn disable-sso
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the DisableSso operation. - `com.amazonaws.services.directory.model.DisableSsoRequest`

  returns: Result of the DisableSso operation returned by the service. - `com.amazonaws.services.directory.model.DisableSsoResult`"
  (^com.amazonaws.services.directory.model.DisableSsoResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DisableSsoRequest request]
    (-> this (.disableSso request))))

(defn describe-conditional-forwarders
  "Description copied from interface: AWSDirectoryService

  request - Describes a conditional forwarder. - `com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest`

  returns: Result of the DescribeConditionalForwarders operation returned by the service. - `com.amazonaws.services.directory.model.DescribeConditionalForwardersResult`"
  (^com.amazonaws.services.directory.model.DescribeConditionalForwardersResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeConditionalForwardersRequest request]
    (-> this (.describeConditionalForwarders request))))

(defn remove-tags-from-resource
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.directory.model.RemoveTagsFromResourceResult`"
  (^com.amazonaws.services.directory.model.RemoveTagsFromResourceResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn reject-shared-directory
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.RejectSharedDirectoryRequest`

  returns: Result of the RejectSharedDirectory operation returned by the service. - `com.amazonaws.services.directory.model.RejectSharedDirectoryResult`"
  (^com.amazonaws.services.directory.model.RejectSharedDirectoryResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.RejectSharedDirectoryRequest request]
    (-> this (.rejectSharedDirectory request))))

(defn describe-directories
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the DescribeDirectories operation. - `com.amazonaws.services.directory.model.DescribeDirectoriesRequest`

  returns: Result of the DescribeDirectories operation returned by the service. - `com.amazonaws.services.directory.model.DescribeDirectoriesResult`"
  (^com.amazonaws.services.directory.model.DescribeDirectoriesResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeDirectoriesRequest request]
    (-> this (.describeDirectories request)))
  (^com.amazonaws.services.directory.model.DescribeDirectoriesResult [^AbstractAWSDirectoryService this]
    (-> this (.describeDirectories))))

(defn add-tags-to-resource
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.directory.model.AddTagsToResourceResult`"
  (^com.amazonaws.services.directory.model.AddTagsToResourceResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSDirectoryService

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSDirectoryService this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn share-directory
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.ShareDirectoryRequest`

  returns: Result of the ShareDirectory operation returned by the service. - `com.amazonaws.services.directory.model.ShareDirectoryResult`"
  (^com.amazonaws.services.directory.model.ShareDirectoryResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.ShareDirectoryRequest request]
    (-> this (.shareDirectory request))))

(defn delete-log-subscription
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest`

  returns: Result of the DeleteLogSubscription operation returned by the service. - `com.amazonaws.services.directory.model.DeleteLogSubscriptionResult`"
  (^com.amazonaws.services.directory.model.DeleteLogSubscriptionResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DeleteLogSubscriptionRequest request]
    (-> this (.deleteLogSubscription request))))

(defn list-schema-extensions
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.ListSchemaExtensionsRequest`

  returns: Result of the ListSchemaExtensions operation returned by the service. - `com.amazonaws.services.directory.model.ListSchemaExtensionsResult`"
  (^com.amazonaws.services.directory.model.ListSchemaExtensionsResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.ListSchemaExtensionsRequest request]
    (-> this (.listSchemaExtensions request))))

(defn restore-from-snapshot
  "Description copied from interface: AWSDirectoryService

  request - An object representing the inputs for the RestoreFromSnapshot operation. - `com.amazonaws.services.directory.model.RestoreFromSnapshotRequest`

  returns: Result of the RestoreFromSnapshot operation returned by the service. - `com.amazonaws.services.directory.model.RestoreFromSnapshotResult`"
  (^com.amazonaws.services.directory.model.RestoreFromSnapshotResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.RestoreFromSnapshotRequest request]
    (-> this (.restoreFromSnapshot request))))

(defn create-directory
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the CreateDirectory operation. - `com.amazonaws.services.directory.model.CreateDirectoryRequest`

  returns: Result of the CreateDirectory operation returned by the service. - `com.amazonaws.services.directory.model.CreateDirectoryResult`"
  (^com.amazonaws.services.directory.model.CreateDirectoryResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.CreateDirectoryRequest request]
    (-> this (.createDirectory request))))

(defn describe-domain-controllers
  "Description copied from interface: AWSDirectoryService

  request - `com.amazonaws.services.directory.model.DescribeDomainControllersRequest`

  returns: Result of the DescribeDomainControllers operation returned by the service. - `com.amazonaws.services.directory.model.DescribeDomainControllersResult`"
  (^com.amazonaws.services.directory.model.DescribeDomainControllersResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DescribeDomainControllersRequest request]
    (-> this (.describeDomainControllers request))))

(defn create-computer
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the CreateComputer operation. - `com.amazonaws.services.directory.model.CreateComputerRequest`

  returns: Result of the CreateComputer operation returned by the service. - `com.amazonaws.services.directory.model.CreateComputerResult`"
  (^com.amazonaws.services.directory.model.CreateComputerResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.CreateComputerRequest request]
    (-> this (.createComputer request))))

(defn create-snapshot
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the CreateSnapshot operation. - `com.amazonaws.services.directory.model.CreateSnapshotRequest`

  returns: Result of the CreateSnapshot operation returned by the service. - `com.amazonaws.services.directory.model.CreateSnapshotResult`"
  (^com.amazonaws.services.directory.model.CreateSnapshotResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.CreateSnapshotRequest request]
    (-> this (.createSnapshot request))))

(defn disable-radius
  "Description copied from interface: AWSDirectoryService

  request - Contains the inputs for the DisableRadius operation. - `com.amazonaws.services.directory.model.DisableRadiusRequest`

  returns: Result of the DisableRadius operation returned by the service. - `com.amazonaws.services.directory.model.DisableRadiusResult`"
  (^com.amazonaws.services.directory.model.DisableRadiusResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.DisableRadiusRequest request]
    (-> this (.disableRadius request))))

(defn create-microsoft-ad
  "Description copied from interface: AWSDirectoryService

  request - Creates an AWS Managed Microsoft AD directory. - `com.amazonaws.services.directory.model.CreateMicrosoftADRequest`

  returns: Result of the CreateMicrosoftAD operation returned by the service. - `com.amazonaws.services.directory.model.CreateMicrosoftADResult`"
  (^com.amazonaws.services.directory.model.CreateMicrosoftADResult [^AbstractAWSDirectoryService this ^com.amazonaws.services.directory.model.CreateMicrosoftADRequest request]
    (-> this (.createMicrosoftAD request))))

