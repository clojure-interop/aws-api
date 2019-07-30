(ns com.amazonaws.services.workspaces.AmazonWorkspacesClient
  "Client for accessing Amazon WorkSpaces. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon WorkSpaces Service

  Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows and Amazon Linux desktops for your
  users."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workspaces AmazonWorkspacesClient]))

(defn ->amazon-workspaces-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonWorkspacesClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonWorkspacesClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonWorkspacesClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonWorkspacesClient aws-credentials client-configuration))
  (^AmazonWorkspacesClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonWorkspacesClient client-configuration))
  (^AmazonWorkspacesClient []
    (new AmazonWorkspacesClient )))

(defn *builder
  "returns: `com.amazonaws.services.workspaces.AmazonWorkspacesClientBuilder`"
  (^com.amazonaws.services.workspaces.AmazonWorkspacesClientBuilder []
    (AmazonWorkspacesClient/builder )))

(defn authorize-ip-rules
  "Adds one or more rules to the specified IP access control group.


   This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the
   rules.

  request - `com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest`

  returns: Result of the AuthorizeIpRules operation returned by the service. - `com.amazonaws.services.workspaces.model.AuthorizeIpRulesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.AuthorizeIpRulesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest request]
    (-> this (.authorizeIpRules request))))

(defn rebuild-workspaces
  "Rebuilds the specified WorkSpace.


   You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, or
   UNHEALTHY.


   Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more
   information, see Rebuild
   a WorkSpace.


   This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.

  request - `com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest`

  returns: Result of the RebuildWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.RebuildWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.RebuildWorkspacesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest request]
    (-> this (.rebuildWorkspaces request))))

(defn delete-tags
  "Deletes the specified tags from the specified WorkSpaces resource.

  request - `com.amazonaws.services.workspaces.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.workspaces.model.DeleteTagsResult`

  throws: com.amazonaws.services.workspaces.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.workspaces.model.DeleteTagsResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn create-ip-group
  "Creates an IP access control group.


   An IP access control group provides you with the ability to control the IP addresses from which users are allowed
   to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and
   then associate the group with your directory. You can add rules when you create the group or at any time using
   AuthorizeIpRules.


   There is a default IP access control group associated with your directory. If you don't associate an IP access
   control group with your directory, the default group is used. The default group includes a default rule that
   allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for
   your directory.

  request - `com.amazonaws.services.workspaces.model.CreateIpGroupRequest`

  returns: Result of the CreateIpGroup operation returned by the service. - `com.amazonaws.services.workspaces.model.CreateIpGroupResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.CreateIpGroupResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.CreateIpGroupRequest request]
    (-> this (.createIpGroup request))))

(defn describe-tags
  "Describes the specified tags for the specified WorkSpaces resource.

  request - `com.amazonaws.services.workspaces.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeTagsResult`

  throws: com.amazonaws.services.workspaces.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.workspaces.model.DescribeTagsResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn start-workspaces
  "Starts the specified WorkSpaces.


   You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of
   STOPPED.

  request - `com.amazonaws.services.workspaces.model.StartWorkspacesRequest`

  returns: Result of the StartWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.StartWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.StartWorkspacesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.StartWorkspacesRequest request]
    (-> this (.startWorkspaces request))))

(defn describe-workspaces-connection-status
  "Describes the connection status of the specified WorkSpaces.

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest`

  returns: Result of the DescribeWorkspacesConnectionStatus operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest request]
    (-> this (.describeWorkspacesConnectionStatus request))))

(defn create-workspaces
  "Creates one or more WorkSpaces.


   This operation is asynchronous and returns before the WorkSpaces are created.

  request - `com.amazonaws.services.workspaces.model.CreateWorkspacesRequest`

  returns: Result of the CreateWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.CreateWorkspacesResult`

  throws: com.amazonaws.services.workspaces.model.ResourceLimitExceededException - Your resource limits have been exceeded."
  (^com.amazonaws.services.workspaces.model.CreateWorkspacesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.CreateWorkspacesRequest request]
    (-> this (.createWorkspaces request))))

(defn delete-ip-group
  "Deletes the specified IP access control group.


   You cannot delete an IP access control group that is associated with a directory.

  request - `com.amazonaws.services.workspaces.model.DeleteIpGroupRequest`

  returns: Result of the DeleteIpGroup operation returned by the service. - `com.amazonaws.services.workspaces.model.DeleteIpGroupResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DeleteIpGroupResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DeleteIpGroupRequest request]
    (-> this (.deleteIpGroup request))))

(defn terminate-workspaces
  "Terminates the specified WorkSpaces.


   Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
   archive any user data, contact Amazon Web Services before terminating the WorkSpace.


   You can terminate a WorkSpace that is in any state except SUSPENDED.


   This operation is asynchronous and returns before the WorkSpaces have been completely terminated.

  request - `com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest`

  returns: Result of the TerminateWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.TerminateWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.TerminateWorkspacesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest request]
    (-> this (.terminateWorkspaces request))))

(defn import-workspace-image
  "Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The
   image must be an already licensed EC2 image that is in your AWS account, and you must own the image.

  request - `com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest`

  returns: Result of the ImportWorkspaceImage operation returned by the service. - `com.amazonaws.services.workspaces.model.ImportWorkspaceImageResult`

  throws: com.amazonaws.services.workspaces.model.ResourceLimitExceededException - Your resource limits have been exceeded."
  (^com.amazonaws.services.workspaces.model.ImportWorkspaceImageResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest request]
    (-> this (.importWorkspaceImage request))))

(defn stop-workspaces
  "Stops the specified WorkSpaces.


   You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of
   AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.

  request - `com.amazonaws.services.workspaces.model.StopWorkspacesRequest`

  returns: Result of the StopWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.StopWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.StopWorkspacesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.StopWorkspacesRequest request]
    (-> this (.stopWorkspaces request))))

(defn create-tags
  "Creates the specified tags for the specified WorkSpaces resource.

  request - `com.amazonaws.services.workspaces.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.workspaces.model.CreateTagsResult`

  throws: com.amazonaws.services.workspaces.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.workspaces.model.CreateTagsResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn describe-workspace-directories
  "Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest`

  returns: Result of the DescribeWorkspaceDirectories operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest request]
    (-> this (.describeWorkspaceDirectories request)))
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult [^AmazonWorkspacesClient this]
    (-> this (.describeWorkspaceDirectories))))

(defn describe-account-modifications
  "Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the
   specified account.

  request - `com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest`

  returns: Result of the DescribeAccountModifications operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeAccountModificationsResult`

  throws: com.amazonaws.services.workspaces.model.AccessDeniedException - The user is not authorized to access a resource."
  (^com.amazonaws.services.workspaces.model.DescribeAccountModificationsResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest request]
    (-> this (.describeAccountModifications request))))

(defn reboot-workspaces
  "Reboots the specified WorkSpaces.


   You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY.


   This operation is asynchronous and returns before the WorkSpaces have rebooted.

  request - `com.amazonaws.services.workspaces.model.RebootWorkspacesRequest`

  returns: Result of the RebootWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.RebootWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.RebootWorkspacesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.RebootWorkspacesRequest request]
    (-> this (.rebootWorkspaces request))))

(defn modify-workspace-properties
  "Modifies the specified WorkSpace properties.

  request - `com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest`

  returns: Result of the ModifyWorkspaceProperties operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest request]
    (-> this (.modifyWorkspaceProperties request))))

(defn disassociate-ip-groups
  "Disassociates the specified IP access control group from the specified directory.

  request - `com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest`

  returns: Result of the DisassociateIpGroups operation returned by the service. - `com.amazonaws.services.workspaces.model.DisassociateIpGroupsResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DisassociateIpGroupsResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest request]
    (-> this (.disassociateIpGroups request))))

(defn associate-ip-groups
  "Associates the specified IP access control group with the specified directory.

  request - `com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest`

  returns: Result of the AssociateIpGroups operation returned by the service. - `com.amazonaws.services.workspaces.model.AssociateIpGroupsResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.AssociateIpGroupsResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest request]
    (-> this (.associateIpGroups request))))

(defn describe-workspace-images
  "Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise,
   all images in the account are described.

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest`

  returns: Result of the DescribeWorkspaceImages operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesResult`

  throws: com.amazonaws.services.workspaces.model.AccessDeniedException - The user is not authorized to access a resource."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest request]
    (-> this (.describeWorkspaceImages request))))

(defn modify-client-properties
  "Modifies the properties of the specified Amazon WorkSpaces clients.

  request - `com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest`

  returns: Result of the ModifyClientProperties operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyClientPropertiesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ModifyClientPropertiesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest request]
    (-> this (.modifyClientProperties request))))

(defn describe-account
  "Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.

  request - `com.amazonaws.services.workspaces.model.DescribeAccountRequest`

  returns: Result of the DescribeAccount operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeAccountResult`

  throws: com.amazonaws.services.workspaces.model.AccessDeniedException - The user is not authorized to access a resource."
  (^com.amazonaws.services.workspaces.model.DescribeAccountResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeAccountRequest request]
    (-> this (.describeAccount request))))

(defn describe-client-properties
  "Retrieves a list that describes one or more specified Amazon WorkSpaces clients.

  request - `com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest`

  returns: Result of the DescribeClientProperties operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeClientPropertiesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeClientPropertiesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest request]
    (-> this (.describeClientProperties request))))

(defn modify-workspace-state
  "Sets the state of the specified WorkSpace.


   To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE.
   WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop
   WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the ADMIN_MAINTENANCE
   state.

  request - `com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest`

  returns: Result of the ModifyWorkspaceState operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyWorkspaceStateResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest request]
    (-> this (.modifyWorkspaceState request))))

(defn describe-ip-groups
  "Describes one or more of your IP access control groups.

  request - `com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest`

  returns: Result of the DescribeIpGroups operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeIpGroupsResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeIpGroupsResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest request]
    (-> this (.describeIpGroups request))))

(defn update-rules-of-ip-group
  "Replaces the current rules of the specified IP access control group with the specified rules.

  request - `com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest`

  returns: Result of the UpdateRulesOfIpGroup operation returned by the service. - `com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest request]
    (-> this (.updateRulesOfIpGroup request))))

(defn delete-workspace-image
  "Deletes the specified image from your account. To delete an image, you must first delete any bundles that are
   associated with the image and un-share the image if it is shared with other accounts.

  request - `com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest`

  returns: Result of the DeleteWorkspaceImage operation returned by the service. - `com.amazonaws.services.workspaces.model.DeleteWorkspaceImageResult`

  throws: com.amazonaws.services.workspaces.model.ResourceAssociatedException - The resource is associated with a directory."
  (^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest request]
    (-> this (.deleteWorkspaceImage request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonWorkspacesClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn copy-workspace-image
  "Copies the specified image from the specified Region to the current Region.

  request - `com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest`

  returns: Result of the CopyWorkspaceImage operation returned by the service. - `com.amazonaws.services.workspaces.model.CopyWorkspaceImageResult`

  throws: com.amazonaws.services.workspaces.model.ResourceLimitExceededException - Your resource limits have been exceeded."
  (^com.amazonaws.services.workspaces.model.CopyWorkspaceImageResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest request]
    (-> this (.copyWorkspaceImage request))))

(defn describe-workspaces
  "Describes the specified WorkSpaces.


   You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify
   only one filter at a time.

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest`

  returns: Result of the DescribeWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspacesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspacesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest request]
    (-> this (.describeWorkspaces request)))
  (^com.amazonaws.services.workspaces.model.DescribeWorkspacesResult [^AmazonWorkspacesClient this]
    (-> this (.describeWorkspaces))))

(defn modify-account
  "Modifies the configuration of bring your own license (BYOL) for the specified account.

  request - `com.amazonaws.services.workspaces.model.ModifyAccountRequest`

  returns: Result of the ModifyAccount operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyAccountResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ModifyAccountResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.ModifyAccountRequest request]
    (-> this (.modifyAccount request))))

(defn describe-workspace-bundles
  "Retrieves a list that describes the available WorkSpace bundles.


   You can filter the results using either bundle ID or owner, but not both.

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest`

  returns: Result of the DescribeWorkspaceBundles operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest request]
    (-> this (.describeWorkspaceBundles request)))
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult [^AmazonWorkspacesClient this]
    (-> this (.describeWorkspaceBundles))))

(defn list-available-management-cidr-ranges
  "Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management
   interface when you enable bring your own license (BYOL).


   The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
   interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
   manage the WorkSpace.

  request - `com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest`

  returns: Result of the ListAvailableManagementCidrRanges operation returned by the service. - `com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest request]
    (-> this (.listAvailableManagementCidrRanges request))))

(defn revoke-ip-rules
  "Removes one or more rules from the specified IP access control group.

  request - `com.amazonaws.services.workspaces.model.RevokeIpRulesRequest`

  returns: Result of the RevokeIpRules operation returned by the service. - `com.amazonaws.services.workspaces.model.RevokeIpRulesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.RevokeIpRulesResult [^AmazonWorkspacesClient this ^com.amazonaws.services.workspaces.model.RevokeIpRulesRequest request]
    (-> this (.revokeIpRules request))))

