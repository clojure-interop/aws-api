(ns com.amazonaws.services.workspaces.AbstractAmazonWorkspacesAsync
  "Abstract implementation of AmazonWorkspacesAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workspaces AbstractAmazonWorkspacesAsync]))

(defn delete-ip-group-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DeleteIpGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIpGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DeleteIpGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteIpGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIpGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteIpGroupRequest request]
    (-> this (.deleteIpGroupAsync request))))

(defn describe-account-modifications-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeAccountModificationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountModificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest request]
    (-> this (.describeAccountModificationsAsync request))))

(defn describe-workspace-images-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspaceImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspaceImagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest request]
    (-> this (.describeWorkspaceImagesAsync request))))

(defn authorize-ip-rules-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeIpRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.AuthorizeIpRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeIpRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest request]
    (-> this (.authorizeIpRulesAsync request))))

(defn delete-tags-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DeleteTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn modify-workspace-state-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyWorkspaceState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ModifyWorkspaceStateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyWorkspaceStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest request]
    (-> this (.modifyWorkspaceStateAsync request))))

(defn describe-workspace-directories-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspaceDirectories operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspaceDirectoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest request]
    (-> this (.describeWorkspaceDirectoriesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this]
    (-> this (.describeWorkspaceDirectoriesAsync))))

(defn reboot-workspaces-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.RebootWorkspacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.RebootWorkspacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RebootWorkspacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootWorkspacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RebootWorkspacesRequest request]
    (-> this (.rebootWorkspacesAsync request))))

(defn describe-account-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeAccountRequest request]
    (-> this (.describeAccountAsync request))))

(defn describe-workspace-bundles-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspaceBundles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspaceBundlesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest request]
    (-> this (.describeWorkspaceBundlesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this]
    (-> this (.describeWorkspaceBundlesAsync))))

(defn create-ip-group-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.CreateIpGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIpGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.CreateIpGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateIpGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIpGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateIpGroupRequest request]
    (-> this (.createIpGroupAsync request))))

(defn import-workspace-image-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportWorkspaceImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ImportWorkspaceImageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importWorkspaceImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest request]
    (-> this (.importWorkspaceImageAsync request))))

(defn modify-workspace-properties-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyWorkspaceProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyWorkspacePropertiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest request]
    (-> this (.modifyWorkspacePropertiesAsync request))))

(defn start-workspaces-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.StartWorkspacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.StartWorkspacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.StartWorkspacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startWorkspacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.StartWorkspacesRequest request]
    (-> this (.startWorkspacesAsync request))))

(defn delete-workspace-image-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWorkspaceImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DeleteWorkspaceImageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWorkspaceImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest request]
    (-> this (.deleteWorkspaceImageAsync request))))

(defn modify-account-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.ModifyAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ModifyAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyAccountRequest request]
    (-> this (.modifyAccountAsync request))))

(defn describe-workspaces-connection-status-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspacesConnectionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspacesConnectionStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest request]
    (-> this (.describeWorkspacesConnectionStatusAsync request))))

(defn update-rules-of-ip-group-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRulesOfIpGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRulesOfIpGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest request]
    (-> this (.updateRulesOfIpGroupAsync request))))

(defn modify-client-properties-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClientProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ModifyClientPropertiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClientPropertiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest request]
    (-> this (.modifyClientPropertiesAsync request))))

(defn stop-workspaces-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.StopWorkspacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.StopWorkspacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.StopWorkspacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopWorkspacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.StopWorkspacesRequest request]
    (-> this (.stopWorkspacesAsync request))))

(defn copy-workspace-image-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyWorkspaceImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.CopyWorkspaceImageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyWorkspaceImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest request]
    (-> this (.copyWorkspaceImageAsync request))))

(defn create-tags-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.CreateTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateTagsRequest request]
    (-> this (.createTagsAsync request))))

(defn revoke-ip-rules-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.RevokeIpRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeIpRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.RevokeIpRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RevokeIpRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeIpRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RevokeIpRulesRequest request]
    (-> this (.revokeIpRulesAsync request))))

(defn describe-ip-groups-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIpGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeIpGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIpGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest request]
    (-> this (.describeIpGroupsAsync request))))

(defn describe-workspaces-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest request]
    (-> this (.describeWorkspacesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this]
    (-> this (.describeWorkspacesAsync))))

(defn terminate-workspaces-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.TerminateWorkspacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateWorkspacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest request]
    (-> this (.terminateWorkspacesAsync request))))

(defn disassociate-ip-groups-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateIpGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DisassociateIpGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateIpGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest request]
    (-> this (.disassociateIpGroupsAsync request))))

(defn associate-ip-groups-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateIpGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.AssociateIpGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateIpGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest request]
    (-> this (.associateIpGroupsAsync request))))

(defn describe-tags-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request))))

(defn describe-client-properties-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeClientPropertiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientPropertiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest request]
    (-> this (.describeClientPropertiesAsync request))))

(defn create-workspaces-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.CreateWorkspacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.CreateWorkspacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateWorkspacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWorkspacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateWorkspacesRequest request]
    (-> this (.createWorkspacesAsync request))))

(defn rebuild-workspaces-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebuildWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.RebuildWorkspacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebuildWorkspacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest request]
    (-> this (.rebuildWorkspacesAsync request))))

(defn list-available-management-cidr-ranges-async
  "Description copied from interface: AmazonWorkspacesAsync

  request - `com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAvailableManagementCidrRanges operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAvailableManagementCidrRangesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest request]
    (-> this (.listAvailableManagementCidrRangesAsync request))))

