(ns com.amazonaws.services.workspaces.AmazonWorkspaces
  "Interface for accessing Amazon WorkSpaces.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonWorkspaces instead.


  Amazon WorkSpaces Service

  Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows and Amazon Linux desktops for your
  users."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workspaces AmazonWorkspaces]))

(defn authorize-ip-rules
  "Adds one or more rules to the specified IP access control group.


   This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the
   rules.

  authorize-ip-rules-request - `com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest`

  returns: Result of the AuthorizeIpRules operation returned by the service. - `com.amazonaws.services.workspaces.model.AuthorizeIpRulesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.AuthorizeIpRulesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest authorize-ip-rules-request]
    (-> this (.authorizeIpRules authorize-ip-rules-request))))

(defn rebuild-workspaces
  "Rebuilds the specified WorkSpace.


   You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, or
   UNHEALTHY.


   Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more
   information, see Rebuild
   a WorkSpace.


   This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.

  rebuild-workspaces-request - `com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest`

  returns: Result of the RebuildWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.RebuildWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.RebuildWorkspacesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest rebuild-workspaces-request]
    (-> this (.rebuildWorkspaces rebuild-workspaces-request))))

(defn delete-tags
  "Deletes the specified tags from the specified WorkSpaces resource.

  delete-tags-request - `com.amazonaws.services.workspaces.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.workspaces.model.DeleteTagsResult`

  throws: com.amazonaws.services.workspaces.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.workspaces.model.DeleteTagsResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTags delete-tags-request))))

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

  create-ip-group-request - `com.amazonaws.services.workspaces.model.CreateIpGroupRequest`

  returns: Result of the CreateIpGroup operation returned by the service. - `com.amazonaws.services.workspaces.model.CreateIpGroupResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.CreateIpGroupResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.CreateIpGroupRequest create-ip-group-request]
    (-> this (.createIpGroup create-ip-group-request))))

(defn describe-tags
  "Describes the specified tags for the specified WorkSpaces resource.

  describe-tags-request - `com.amazonaws.services.workspaces.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeTagsResult`

  throws: com.amazonaws.services.workspaces.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.workspaces.model.DescribeTagsResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTags describe-tags-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonWorkspaces this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn start-workspaces
  "Starts the specified WorkSpaces.


   You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of
   STOPPED.

  start-workspaces-request - `com.amazonaws.services.workspaces.model.StartWorkspacesRequest`

  returns: Result of the StartWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.StartWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.StartWorkspacesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.StartWorkspacesRequest start-workspaces-request]
    (-> this (.startWorkspaces start-workspaces-request))))

(defn describe-workspaces-connection-status
  "Describes the connection status of the specified WorkSpaces.

  describe-workspaces-connection-status-request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest`

  returns: Result of the DescribeWorkspacesConnectionStatus operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest describe-workspaces-connection-status-request]
    (-> this (.describeWorkspacesConnectionStatus describe-workspaces-connection-status-request))))

(defn create-workspaces
  "Creates one or more WorkSpaces.


   This operation is asynchronous and returns before the WorkSpaces are created.

  create-workspaces-request - `com.amazonaws.services.workspaces.model.CreateWorkspacesRequest`

  returns: Result of the CreateWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.CreateWorkspacesResult`

  throws: com.amazonaws.services.workspaces.model.ResourceLimitExceededException - Your resource limits have been exceeded."
  (^com.amazonaws.services.workspaces.model.CreateWorkspacesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.CreateWorkspacesRequest create-workspaces-request]
    (-> this (.createWorkspaces create-workspaces-request))))

(defn delete-ip-group
  "Deletes the specified IP access control group.


   You cannot delete an IP access control group that is associated with a directory.

  delete-ip-group-request - `com.amazonaws.services.workspaces.model.DeleteIpGroupRequest`

  returns: Result of the DeleteIpGroup operation returned by the service. - `com.amazonaws.services.workspaces.model.DeleteIpGroupResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DeleteIpGroupResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DeleteIpGroupRequest delete-ip-group-request]
    (-> this (.deleteIpGroup delete-ip-group-request))))

(defn terminate-workspaces
  "Terminates the specified WorkSpaces.


   Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
   archive any user data, contact Amazon Web Services before terminating the WorkSpace.


   You can terminate a WorkSpace that is in any state except SUSPENDED.


   This operation is asynchronous and returns before the WorkSpaces have been completely terminated.

  terminate-workspaces-request - `com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest`

  returns: Result of the TerminateWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.TerminateWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.TerminateWorkspacesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest terminate-workspaces-request]
    (-> this (.terminateWorkspaces terminate-workspaces-request))))

(defn import-workspace-image
  "Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The
   image must be an already licensed EC2 image that is in your AWS account, and you must own the image.

  import-workspace-image-request - `com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest`

  returns: Result of the ImportWorkspaceImage operation returned by the service. - `com.amazonaws.services.workspaces.model.ImportWorkspaceImageResult`

  throws: com.amazonaws.services.workspaces.model.ResourceLimitExceededException - Your resource limits have been exceeded."
  (^com.amazonaws.services.workspaces.model.ImportWorkspaceImageResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest import-workspace-image-request]
    (-> this (.importWorkspaceImage import-workspace-image-request))))

(defn stop-workspaces
  "Stops the specified WorkSpaces.


   You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of
   AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.

  stop-workspaces-request - `com.amazonaws.services.workspaces.model.StopWorkspacesRequest`

  returns: Result of the StopWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.StopWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.StopWorkspacesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.StopWorkspacesRequest stop-workspaces-request]
    (-> this (.stopWorkspaces stop-workspaces-request))))

(defn create-tags
  "Creates the specified tags for the specified WorkSpaces resource.

  create-tags-request - `com.amazonaws.services.workspaces.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.workspaces.model.CreateTagsResult`

  throws: com.amazonaws.services.workspaces.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.workspaces.model.CreateTagsResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.CreateTagsRequest create-tags-request]
    (-> this (.createTags create-tags-request))))

(defn describe-workspace-directories
  "Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.

  describe-workspace-directories-request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest`

  returns: Result of the DescribeWorkspaceDirectories operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest describe-workspace-directories-request]
    (-> this (.describeWorkspaceDirectories describe-workspace-directories-request)))
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult [^AmazonWorkspaces this]
    (-> this (.describeWorkspaceDirectories))))

(defn describe-account-modifications
  "Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the
   specified account.

  describe-account-modifications-request - `com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest`

  returns: Result of the DescribeAccountModifications operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeAccountModificationsResult`

  throws: com.amazonaws.services.workspaces.model.AccessDeniedException - The user is not authorized to access a resource."
  (^com.amazonaws.services.workspaces.model.DescribeAccountModificationsResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest describe-account-modifications-request]
    (-> this (.describeAccountModifications describe-account-modifications-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonWorkspaces this]
    (-> this (.shutdown))))

(defn reboot-workspaces
  "Reboots the specified WorkSpaces.


   You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY.


   This operation is asynchronous and returns before the WorkSpaces have rebooted.

  reboot-workspaces-request - `com.amazonaws.services.workspaces.model.RebootWorkspacesRequest`

  returns: Result of the RebootWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.RebootWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.RebootWorkspacesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.RebootWorkspacesRequest reboot-workspaces-request]
    (-> this (.rebootWorkspaces reboot-workspaces-request))))

(defn modify-workspace-properties
  "Modifies the specified WorkSpace properties.

  modify-workspace-properties-request - `com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest`

  returns: Result of the ModifyWorkspaceProperties operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest modify-workspace-properties-request]
    (-> this (.modifyWorkspaceProperties modify-workspace-properties-request))))

(defn disassociate-ip-groups
  "Disassociates the specified IP access control group from the specified directory.

  disassociate-ip-groups-request - `com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest`

  returns: Result of the DisassociateIpGroups operation returned by the service. - `com.amazonaws.services.workspaces.model.DisassociateIpGroupsResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DisassociateIpGroupsResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest disassociate-ip-groups-request]
    (-> this (.disassociateIpGroups disassociate-ip-groups-request))))

(defn associate-ip-groups
  "Associates the specified IP access control group with the specified directory.

  associate-ip-groups-request - `com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest`

  returns: Result of the AssociateIpGroups operation returned by the service. - `com.amazonaws.services.workspaces.model.AssociateIpGroupsResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.AssociateIpGroupsResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest associate-ip-groups-request]
    (-> this (.associateIpGroups associate-ip-groups-request))))

(defn describe-workspace-images
  "Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise,
   all images in the account are described.

  describe-workspace-images-request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest`

  returns: Result of the DescribeWorkspaceImages operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesResult`

  throws: com.amazonaws.services.workspaces.model.AccessDeniedException - The user is not authorized to access a resource."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest describe-workspace-images-request]
    (-> this (.describeWorkspaceImages describe-workspace-images-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"workspaces.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://workspaces.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonWorkspaces this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn modify-client-properties
  "Modifies the properties of the specified Amazon WorkSpaces clients.

  modify-client-properties-request - `com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest`

  returns: Result of the ModifyClientProperties operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyClientPropertiesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ModifyClientPropertiesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest modify-client-properties-request]
    (-> this (.modifyClientProperties modify-client-properties-request))))

(defn describe-account
  "Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.

  describe-account-request - `com.amazonaws.services.workspaces.model.DescribeAccountRequest`

  returns: Result of the DescribeAccount operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeAccountResult`

  throws: com.amazonaws.services.workspaces.model.AccessDeniedException - The user is not authorized to access a resource."
  (^com.amazonaws.services.workspaces.model.DescribeAccountResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeAccountRequest describe-account-request]
    (-> this (.describeAccount describe-account-request))))

(defn describe-client-properties
  "Retrieves a list that describes one or more specified Amazon WorkSpaces clients.

  describe-client-properties-request - `com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest`

  returns: Result of the DescribeClientProperties operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeClientPropertiesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeClientPropertiesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest describe-client-properties-request]
    (-> this (.describeClientProperties describe-client-properties-request))))

(defn modify-workspace-state
  "Sets the state of the specified WorkSpace.


   To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE.
   WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop
   WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the ADMIN_MAINTENANCE
   state.

  modify-workspace-state-request - `com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest`

  returns: Result of the ModifyWorkspaceState operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyWorkspaceStateResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest modify-workspace-state-request]
    (-> this (.modifyWorkspaceState modify-workspace-state-request))))

(defn describe-ip-groups
  "Describes one or more of your IP access control groups.

  describe-ip-groups-request - `com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest`

  returns: Result of the DescribeIpGroups operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeIpGroupsResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeIpGroupsResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest describe-ip-groups-request]
    (-> this (.describeIpGroups describe-ip-groups-request))))

(defn update-rules-of-ip-group
  "Replaces the current rules of the specified IP access control group with the specified rules.

  update-rules-of-ip-group-request - `com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest`

  returns: Result of the UpdateRulesOfIpGroup operation returned by the service. - `com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest update-rules-of-ip-group-request]
    (-> this (.updateRulesOfIpGroup update-rules-of-ip-group-request))))

(defn delete-workspace-image
  "Deletes the specified image from your account. To delete an image, you must first delete any bundles that are
   associated with the image and un-share the image if it is shared with other accounts.

  delete-workspace-image-request - `com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest`

  returns: Result of the DeleteWorkspaceImage operation returned by the service. - `com.amazonaws.services.workspaces.model.DeleteWorkspaceImageResult`

  throws: com.amazonaws.services.workspaces.model.ResourceAssociatedException - The resource is associated with a directory."
  (^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest delete-workspace-image-request]
    (-> this (.deleteWorkspaceImage delete-workspace-image-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonWorkspaces this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn copy-workspace-image
  "Copies the specified image from the specified Region to the current Region.

  copy-workspace-image-request - `com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest`

  returns: Result of the CopyWorkspaceImage operation returned by the service. - `com.amazonaws.services.workspaces.model.CopyWorkspaceImageResult`

  throws: com.amazonaws.services.workspaces.model.ResourceLimitExceededException - Your resource limits have been exceeded."
  (^com.amazonaws.services.workspaces.model.CopyWorkspaceImageResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest copy-workspace-image-request]
    (-> this (.copyWorkspaceImage copy-workspace-image-request))))

(defn describe-workspaces
  "Describes the specified WorkSpaces.


   You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify
   only one filter at a time.

  describe-workspaces-request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest`

  returns: Result of the DescribeWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspacesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspacesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest describe-workspaces-request]
    (-> this (.describeWorkspaces describe-workspaces-request)))
  (^com.amazonaws.services.workspaces.model.DescribeWorkspacesResult [^AmazonWorkspaces this]
    (-> this (.describeWorkspaces))))

(defn modify-account
  "Modifies the configuration of bring your own license (BYOL) for the specified account.

  modify-account-request - `com.amazonaws.services.workspaces.model.ModifyAccountRequest`

  returns: Result of the ModifyAccount operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyAccountResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ModifyAccountResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ModifyAccountRequest modify-account-request]
    (-> this (.modifyAccount modify-account-request))))

(defn describe-workspace-bundles
  "Retrieves a list that describes the available WorkSpace bundles.


   You can filter the results using either bundle ID or owner, but not both.

  describe-workspace-bundles-request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest`

  returns: Result of the DescribeWorkspaceBundles operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest describe-workspace-bundles-request]
    (-> this (.describeWorkspaceBundles describe-workspace-bundles-request)))
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult [^AmazonWorkspaces this]
    (-> this (.describeWorkspaceBundles))))

(defn list-available-management-cidr-ranges
  "Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management
   interface when you enable bring your own license (BYOL).


   The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
   interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
   manage the WorkSpace.

  list-available-management-cidr-ranges-request - `com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest`

  returns: Result of the ListAvailableManagementCidrRanges operation returned by the service. - `com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest list-available-management-cidr-ranges-request]
    (-> this (.listAvailableManagementCidrRanges list-available-management-cidr-ranges-request))))

(defn revoke-ip-rules
  "Removes one or more rules from the specified IP access control group.

  revoke-ip-rules-request - `com.amazonaws.services.workspaces.model.RevokeIpRulesRequest`

  returns: Result of the RevokeIpRules operation returned by the service. - `com.amazonaws.services.workspaces.model.RevokeIpRulesResult`

  throws: com.amazonaws.services.workspaces.model.InvalidParameterValuesException - One or more parameter values are not valid."
  (^com.amazonaws.services.workspaces.model.RevokeIpRulesResult [^AmazonWorkspaces this ^com.amazonaws.services.workspaces.model.RevokeIpRulesRequest revoke-ip-rules-request]
    (-> this (.revokeIpRules revoke-ip-rules-request))))

