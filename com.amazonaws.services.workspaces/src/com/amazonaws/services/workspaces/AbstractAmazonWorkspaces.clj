(ns com.amazonaws.services.workspaces.AbstractAmazonWorkspaces
  "Abstract implementation of AmazonWorkspaces. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workspaces AbstractAmazonWorkspaces]))

(defn authorize-ip-rules
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest`

  returns: Result of the AuthorizeIpRules operation returned by the service. - `com.amazonaws.services.workspaces.model.AuthorizeIpRulesResult`"
  (^com.amazonaws.services.workspaces.model.AuthorizeIpRulesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest request]
    (-> this (.authorizeIpRules request))))

(defn rebuild-workspaces
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest`

  returns: Result of the RebuildWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.RebuildWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.RebuildWorkspacesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest request]
    (-> this (.rebuildWorkspaces request))))

(defn delete-tags
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.workspaces.model.DeleteTagsResult`"
  (^com.amazonaws.services.workspaces.model.DeleteTagsResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn create-ip-group
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.CreateIpGroupRequest`

  returns: Result of the CreateIpGroup operation returned by the service. - `com.amazonaws.services.workspaces.model.CreateIpGroupResult`"
  (^com.amazonaws.services.workspaces.model.CreateIpGroupResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.CreateIpGroupRequest request]
    (-> this (.createIpGroup request))))

(defn describe-tags
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeTagsResult`"
  (^com.amazonaws.services.workspaces.model.DescribeTagsResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn set-region
  "Description copied from interface: AmazonWorkspaces

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonWorkspaces this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn start-workspaces
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.StartWorkspacesRequest`

  returns: Result of the StartWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.StartWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.StartWorkspacesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.StartWorkspacesRequest request]
    (-> this (.startWorkspaces request))))

(defn describe-workspaces-connection-status
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest`

  returns: Result of the DescribeWorkspacesConnectionStatus operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult`"
  (^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest request]
    (-> this (.describeWorkspacesConnectionStatus request))))

(defn create-workspaces
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.CreateWorkspacesRequest`

  returns: Result of the CreateWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.CreateWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.CreateWorkspacesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.CreateWorkspacesRequest request]
    (-> this (.createWorkspaces request))))

(defn delete-ip-group
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DeleteIpGroupRequest`

  returns: Result of the DeleteIpGroup operation returned by the service. - `com.amazonaws.services.workspaces.model.DeleteIpGroupResult`"
  (^com.amazonaws.services.workspaces.model.DeleteIpGroupResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DeleteIpGroupRequest request]
    (-> this (.deleteIpGroup request))))

(defn terminate-workspaces
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest`

  returns: Result of the TerminateWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.TerminateWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.TerminateWorkspacesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest request]
    (-> this (.terminateWorkspaces request))))

(defn import-workspace-image
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest`

  returns: Result of the ImportWorkspaceImage operation returned by the service. - `com.amazonaws.services.workspaces.model.ImportWorkspaceImageResult`"
  (^com.amazonaws.services.workspaces.model.ImportWorkspaceImageResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest request]
    (-> this (.importWorkspaceImage request))))

(defn stop-workspaces
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.StopWorkspacesRequest`

  returns: Result of the StopWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.StopWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.StopWorkspacesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.StopWorkspacesRequest request]
    (-> this (.stopWorkspaces request))))

(defn create-tags
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.workspaces.model.CreateTagsResult`"
  (^com.amazonaws.services.workspaces.model.CreateTagsResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn describe-workspace-directories
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest`

  returns: Result of the DescribeWorkspaceDirectories operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult`"
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest request]
    (-> this (.describeWorkspaceDirectories request)))
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult [^AbstractAmazonWorkspaces this]
    (-> this (.describeWorkspaceDirectories))))

(defn describe-account-modifications
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest`

  returns: Result of the DescribeAccountModifications operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeAccountModificationsResult`"
  (^com.amazonaws.services.workspaces.model.DescribeAccountModificationsResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest request]
    (-> this (.describeAccountModifications request))))

(defn shutdown
  "Description copied from interface: AmazonWorkspaces"
  ([^AbstractAmazonWorkspaces this]
    (-> this (.shutdown))))

(defn reboot-workspaces
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.RebootWorkspacesRequest`

  returns: Result of the RebootWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.RebootWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.RebootWorkspacesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.RebootWorkspacesRequest request]
    (-> this (.rebootWorkspaces request))))

(defn modify-workspace-properties
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest`

  returns: Result of the ModifyWorkspaceProperties operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult`"
  (^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest request]
    (-> this (.modifyWorkspaceProperties request))))

(defn disassociate-ip-groups
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest`

  returns: Result of the DisassociateIpGroups operation returned by the service. - `com.amazonaws.services.workspaces.model.DisassociateIpGroupsResult`"
  (^com.amazonaws.services.workspaces.model.DisassociateIpGroupsResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest request]
    (-> this (.disassociateIpGroups request))))

(defn associate-ip-groups
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest`

  returns: Result of the AssociateIpGroups operation returned by the service. - `com.amazonaws.services.workspaces.model.AssociateIpGroupsResult`"
  (^com.amazonaws.services.workspaces.model.AssociateIpGroupsResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest request]
    (-> this (.associateIpGroups request))))

(defn describe-workspace-images
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest`

  returns: Result of the DescribeWorkspaceImages operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesResult`"
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest request]
    (-> this (.describeWorkspaceImages request))))

(defn set-endpoint
  "Description copied from interface: AmazonWorkspaces

  endpoint - The endpoint (ex: \"workspaces.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://workspaces.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonWorkspaces this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn modify-client-properties
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest`

  returns: Result of the ModifyClientProperties operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyClientPropertiesResult`"
  (^com.amazonaws.services.workspaces.model.ModifyClientPropertiesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest request]
    (-> this (.modifyClientProperties request))))

(defn describe-account
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeAccountRequest`

  returns: Result of the DescribeAccount operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeAccountResult`"
  (^com.amazonaws.services.workspaces.model.DescribeAccountResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeAccountRequest request]
    (-> this (.describeAccount request))))

(defn describe-client-properties
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest`

  returns: Result of the DescribeClientProperties operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeClientPropertiesResult`"
  (^com.amazonaws.services.workspaces.model.DescribeClientPropertiesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest request]
    (-> this (.describeClientProperties request))))

(defn modify-workspace-state
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest`

  returns: Result of the ModifyWorkspaceState operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyWorkspaceStateResult`"
  (^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest request]
    (-> this (.modifyWorkspaceState request))))

(defn describe-ip-groups
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest`

  returns: Result of the DescribeIpGroups operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeIpGroupsResult`"
  (^com.amazonaws.services.workspaces.model.DescribeIpGroupsResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest request]
    (-> this (.describeIpGroups request))))

(defn update-rules-of-ip-group
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest`

  returns: Result of the UpdateRulesOfIpGroup operation returned by the service. - `com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupResult`"
  (^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest request]
    (-> this (.updateRulesOfIpGroup request))))

(defn delete-workspace-image
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest`

  returns: Result of the DeleteWorkspaceImage operation returned by the service. - `com.amazonaws.services.workspaces.model.DeleteWorkspaceImageResult`"
  (^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest request]
    (-> this (.deleteWorkspaceImage request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonWorkspaces

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonWorkspaces this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn copy-workspace-image
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest`

  returns: Result of the CopyWorkspaceImage operation returned by the service. - `com.amazonaws.services.workspaces.model.CopyWorkspaceImageResult`"
  (^com.amazonaws.services.workspaces.model.CopyWorkspaceImageResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest request]
    (-> this (.copyWorkspaceImage request))))

(defn describe-workspaces
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest`

  returns: Result of the DescribeWorkspaces operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspacesResult`"
  (^com.amazonaws.services.workspaces.model.DescribeWorkspacesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest request]
    (-> this (.describeWorkspaces request)))
  (^com.amazonaws.services.workspaces.model.DescribeWorkspacesResult [^AbstractAmazonWorkspaces this]
    (-> this (.describeWorkspaces))))

(defn modify-account
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.ModifyAccountRequest`

  returns: Result of the ModifyAccount operation returned by the service. - `com.amazonaws.services.workspaces.model.ModifyAccountResult`"
  (^com.amazonaws.services.workspaces.model.ModifyAccountResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ModifyAccountRequest request]
    (-> this (.modifyAccount request))))

(defn describe-workspace-bundles
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest`

  returns: Result of the DescribeWorkspaceBundles operation returned by the service. - `com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult`"
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest request]
    (-> this (.describeWorkspaceBundles request)))
  (^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult [^AbstractAmazonWorkspaces this]
    (-> this (.describeWorkspaceBundles))))

(defn list-available-management-cidr-ranges
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest`

  returns: Result of the ListAvailableManagementCidrRanges operation returned by the service. - `com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesResult`"
  (^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest request]
    (-> this (.listAvailableManagementCidrRanges request))))

(defn revoke-ip-rules
  "Description copied from interface: AmazonWorkspaces

  request - `com.amazonaws.services.workspaces.model.RevokeIpRulesRequest`

  returns: Result of the RevokeIpRules operation returned by the service. - `com.amazonaws.services.workspaces.model.RevokeIpRulesResult`"
  (^com.amazonaws.services.workspaces.model.RevokeIpRulesResult [^AbstractAmazonWorkspaces this ^com.amazonaws.services.workspaces.model.RevokeIpRulesRequest request]
    (-> this (.revokeIpRules request))))

