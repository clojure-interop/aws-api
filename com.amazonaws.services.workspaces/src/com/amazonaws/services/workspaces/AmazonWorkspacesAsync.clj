(ns com.amazonaws.services.workspaces.AmazonWorkspacesAsync
  "Interface for accessing Amazon WorkSpaces asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonWorkspacesAsync instead.


  Amazon WorkSpaces Service

  Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows and Amazon Linux desktops for your
  users."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workspaces AmazonWorkspacesAsync]))

(defn delete-ip-group-async
  "Deletes the specified IP access control group.


   You cannot delete an IP access control group that is associated with a directory.

  delete-ip-group-request - `com.amazonaws.services.workspaces.model.DeleteIpGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIpGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DeleteIpGroupResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteIpGroupRequest delete-ip-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIpGroupAsync delete-ip-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteIpGroupRequest delete-ip-group-request]
    (-> this (.deleteIpGroupAsync delete-ip-group-request))))

(defn describe-account-modifications-async
  "Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the
   specified account.

  describe-account-modifications-request - `com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeAccountModificationsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest describe-account-modifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountModificationsAsync describe-account-modifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeAccountModificationsRequest describe-account-modifications-request]
    (-> this (.describeAccountModificationsAsync describe-account-modifications-request))))

(defn describe-workspace-images-async
  "Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise,
   all images in the account are described.

  describe-workspace-images-request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspaceImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest describe-workspace-images-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspaceImagesAsync describe-workspace-images-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceImagesRequest describe-workspace-images-request]
    (-> this (.describeWorkspaceImagesAsync describe-workspace-images-request))))

(defn authorize-ip-rules-async
  "Adds one or more rules to the specified IP access control group.


   This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the
   rules.

  authorize-ip-rules-request - `com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeIpRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.AuthorizeIpRulesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest authorize-ip-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeIpRulesAsync authorize-ip-rules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.AuthorizeIpRulesRequest authorize-ip-rules-request]
    (-> this (.authorizeIpRulesAsync authorize-ip-rules-request))))

(defn delete-tags-async
  "Deletes the specified tags from the specified WorkSpaces resource.

  delete-tags-request - `com.amazonaws.services.workspaces.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteTagsRequest delete-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync delete-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTagsAsync delete-tags-request))))

(defn modify-workspace-state-async
  "Sets the state of the specified WorkSpace.


   To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE.
   WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop
   WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the ADMIN_MAINTENANCE
   state.

  modify-workspace-state-request - `com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyWorkspaceState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ModifyWorkspaceStateResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest modify-workspace-state-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyWorkspaceStateAsync modify-workspace-state-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyWorkspaceStateRequest modify-workspace-state-request]
    (-> this (.modifyWorkspaceStateAsync modify-workspace-state-request))))

(defn describe-workspace-directories-async
  "Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.

  describe-workspace-directories-request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspaceDirectories operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest describe-workspace-directories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspaceDirectoriesAsync describe-workspace-directories-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceDirectoriesRequest describe-workspace-directories-request]
    (-> this (.describeWorkspaceDirectoriesAsync describe-workspace-directories-request)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this]
    (-> this (.describeWorkspaceDirectoriesAsync))))

(defn reboot-workspaces-async
  "Reboots the specified WorkSpaces.


   You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY.


   This operation is asynchronous and returns before the WorkSpaces have rebooted.

  reboot-workspaces-request - `com.amazonaws.services.workspaces.model.RebootWorkspacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.RebootWorkspacesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RebootWorkspacesRequest reboot-workspaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootWorkspacesAsync reboot-workspaces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RebootWorkspacesRequest reboot-workspaces-request]
    (-> this (.rebootWorkspacesAsync reboot-workspaces-request))))

(defn describe-account-async
  "Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.

  describe-account-request - `com.amazonaws.services.workspaces.model.DescribeAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeAccountResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeAccountRequest describe-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAsync describe-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeAccountRequest describe-account-request]
    (-> this (.describeAccountAsync describe-account-request))))

(defn describe-workspace-bundles-async
  "Retrieves a list that describes the available WorkSpace bundles.


   You can filter the results using either bundle ID or owner, but not both.

  describe-workspace-bundles-request - `com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspaceBundles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest describe-workspace-bundles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspaceBundlesAsync describe-workspace-bundles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspaceBundlesRequest describe-workspace-bundles-request]
    (-> this (.describeWorkspaceBundlesAsync describe-workspace-bundles-request)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this]
    (-> this (.describeWorkspaceBundlesAsync))))

(defn create-ip-group-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIpGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.CreateIpGroupResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateIpGroupRequest create-ip-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIpGroupAsync create-ip-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateIpGroupRequest create-ip-group-request]
    (-> this (.createIpGroupAsync create-ip-group-request))))

(defn import-workspace-image-async
  "Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The
   image must be an already licensed EC2 image that is in your AWS account, and you must own the image.

  import-workspace-image-request - `com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportWorkspaceImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ImportWorkspaceImageResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest import-workspace-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importWorkspaceImageAsync import-workspace-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ImportWorkspaceImageRequest import-workspace-image-request]
    (-> this (.importWorkspaceImageAsync import-workspace-image-request))))

(defn modify-workspace-properties-async
  "Modifies the specified WorkSpace properties.

  modify-workspace-properties-request - `com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyWorkspaceProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest modify-workspace-properties-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyWorkspacePropertiesAsync modify-workspace-properties-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyWorkspacePropertiesRequest modify-workspace-properties-request]
    (-> this (.modifyWorkspacePropertiesAsync modify-workspace-properties-request))))

(defn start-workspaces-async
  "Starts the specified WorkSpaces.


   You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of
   STOPPED.

  start-workspaces-request - `com.amazonaws.services.workspaces.model.StartWorkspacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.StartWorkspacesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.StartWorkspacesRequest start-workspaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startWorkspacesAsync start-workspaces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.StartWorkspacesRequest start-workspaces-request]
    (-> this (.startWorkspacesAsync start-workspaces-request))))

(defn delete-workspace-image-async
  "Deletes the specified image from your account. To delete an image, you must first delete any bundles that are
   associated with the image and un-share the image if it is shared with other accounts.

  delete-workspace-image-request - `com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWorkspaceImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DeleteWorkspaceImageResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest delete-workspace-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWorkspaceImageAsync delete-workspace-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DeleteWorkspaceImageRequest delete-workspace-image-request]
    (-> this (.deleteWorkspaceImageAsync delete-workspace-image-request))))

(defn modify-account-async
  "Modifies the configuration of bring your own license (BYOL) for the specified account.

  modify-account-request - `com.amazonaws.services.workspaces.model.ModifyAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ModifyAccountResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyAccountRequest modify-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyAccountAsync modify-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyAccountRequest modify-account-request]
    (-> this (.modifyAccountAsync modify-account-request))))

(defn describe-workspaces-connection-status-async
  "Describes the connection status of the specified WorkSpaces.

  describe-workspaces-connection-status-request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspacesConnectionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest describe-workspaces-connection-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspacesConnectionStatusAsync describe-workspaces-connection-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesConnectionStatusRequest describe-workspaces-connection-status-request]
    (-> this (.describeWorkspacesConnectionStatusAsync describe-workspaces-connection-status-request))))

(defn update-rules-of-ip-group-async
  "Replaces the current rules of the specified IP access control group with the specified rules.

  update-rules-of-ip-group-request - `com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRulesOfIpGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest update-rules-of-ip-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRulesOfIpGroupAsync update-rules-of-ip-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.UpdateRulesOfIpGroupRequest update-rules-of-ip-group-request]
    (-> this (.updateRulesOfIpGroupAsync update-rules-of-ip-group-request))))

(defn modify-client-properties-async
  "Modifies the properties of the specified Amazon WorkSpaces clients.

  modify-client-properties-request - `com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClientProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ModifyClientPropertiesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest modify-client-properties-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClientPropertiesAsync modify-client-properties-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ModifyClientPropertiesRequest modify-client-properties-request]
    (-> this (.modifyClientPropertiesAsync modify-client-properties-request))))

(defn stop-workspaces-async
  "Stops the specified WorkSpaces.


   You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of
   AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.

  stop-workspaces-request - `com.amazonaws.services.workspaces.model.StopWorkspacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.StopWorkspacesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.StopWorkspacesRequest stop-workspaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopWorkspacesAsync stop-workspaces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.StopWorkspacesRequest stop-workspaces-request]
    (-> this (.stopWorkspacesAsync stop-workspaces-request))))

(defn copy-workspace-image-async
  "Copies the specified image from the specified Region to the current Region.

  copy-workspace-image-request - `com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyWorkspaceImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.CopyWorkspaceImageResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest copy-workspace-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyWorkspaceImageAsync copy-workspace-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CopyWorkspaceImageRequest copy-workspace-image-request]
    (-> this (.copyWorkspaceImageAsync copy-workspace-image-request))))

(defn create-tags-async
  "Creates the specified tags for the specified WorkSpaces resource.

  create-tags-request - `com.amazonaws.services.workspaces.model.CreateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateTagsRequest create-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync create-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateTagsRequest create-tags-request]
    (-> this (.createTagsAsync create-tags-request))))

(defn revoke-ip-rules-async
  "Removes one or more rules from the specified IP access control group.

  revoke-ip-rules-request - `com.amazonaws.services.workspaces.model.RevokeIpRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeIpRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.RevokeIpRulesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RevokeIpRulesRequest revoke-ip-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeIpRulesAsync revoke-ip-rules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RevokeIpRulesRequest revoke-ip-rules-request]
    (-> this (.revokeIpRulesAsync revoke-ip-rules-request))))

(defn describe-ip-groups-async
  "Describes one or more of your IP access control groups.

  describe-ip-groups-request - `com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIpGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeIpGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest describe-ip-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIpGroupsAsync describe-ip-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeIpGroupsRequest describe-ip-groups-request]
    (-> this (.describeIpGroupsAsync describe-ip-groups-request))))

(defn describe-workspaces-async
  "Describes the specified WorkSpaces.


   You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify
   only one filter at a time.

  describe-workspaces-request - `com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeWorkspacesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest describe-workspaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkspacesAsync describe-workspaces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeWorkspacesRequest describe-workspaces-request]
    (-> this (.describeWorkspacesAsync describe-workspaces-request)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this]
    (-> this (.describeWorkspacesAsync))))

(defn terminate-workspaces-async
  "Terminates the specified WorkSpaces.


   Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
   archive any user data, contact Amazon Web Services before terminating the WorkSpace.


   You can terminate a WorkSpace that is in any state except SUSPENDED.


   This operation is asynchronous and returns before the WorkSpaces have been completely terminated.

  terminate-workspaces-request - `com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.TerminateWorkspacesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest terminate-workspaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateWorkspacesAsync terminate-workspaces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.TerminateWorkspacesRequest terminate-workspaces-request]
    (-> this (.terminateWorkspacesAsync terminate-workspaces-request))))

(defn disassociate-ip-groups-async
  "Disassociates the specified IP access control group from the specified directory.

  disassociate-ip-groups-request - `com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateIpGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DisassociateIpGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest disassociate-ip-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateIpGroupsAsync disassociate-ip-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DisassociateIpGroupsRequest disassociate-ip-groups-request]
    (-> this (.disassociateIpGroupsAsync disassociate-ip-groups-request))))

(defn associate-ip-groups-async
  "Associates the specified IP access control group with the specified directory.

  associate-ip-groups-request - `com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateIpGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.AssociateIpGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest associate-ip-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateIpGroupsAsync associate-ip-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.AssociateIpGroupsRequest associate-ip-groups-request]
    (-> this (.associateIpGroupsAsync associate-ip-groups-request))))

(defn describe-tags-async
  "Describes the specified tags for the specified WorkSpaces resource.

  describe-tags-request - `com.amazonaws.services.workspaces.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeTagsRequest describe-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync describe-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTagsAsync describe-tags-request))))

(defn describe-client-properties-async
  "Retrieves a list that describes one or more specified Amazon WorkSpaces clients.

  describe-client-properties-request - `com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientProperties operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.DescribeClientPropertiesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest describe-client-properties-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientPropertiesAsync describe-client-properties-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.DescribeClientPropertiesRequest describe-client-properties-request]
    (-> this (.describeClientPropertiesAsync describe-client-properties-request))))

(defn create-workspaces-async
  "Creates one or more WorkSpaces.


   This operation is asynchronous and returns before the WorkSpaces are created.

  create-workspaces-request - `com.amazonaws.services.workspaces.model.CreateWorkspacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.CreateWorkspacesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateWorkspacesRequest create-workspaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWorkspacesAsync create-workspaces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.CreateWorkspacesRequest create-workspaces-request]
    (-> this (.createWorkspacesAsync create-workspaces-request))))

(defn rebuild-workspaces-async
  "Rebuilds the specified WorkSpace.


   You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, or
   UNHEALTHY.


   Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more
   information, see Rebuild
   a WorkSpace.


   This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.

  rebuild-workspaces-request - `com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebuildWorkspaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.RebuildWorkspacesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest rebuild-workspaces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebuildWorkspacesAsync rebuild-workspaces-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.RebuildWorkspacesRequest rebuild-workspaces-request]
    (-> this (.rebuildWorkspacesAsync rebuild-workspaces-request))))

(defn list-available-management-cidr-ranges-async
  "Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management
   interface when you enable bring your own license (BYOL).


   The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
   interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
   manage the WorkSpace.

  list-available-management-cidr-ranges-request - `com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAvailableManagementCidrRanges operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest list-available-management-cidr-ranges-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAvailableManagementCidrRangesAsync list-available-management-cidr-ranges-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkspacesAsync this ^com.amazonaws.services.workspaces.model.ListAvailableManagementCidrRangesRequest list-available-management-cidr-ranges-request]
    (-> this (.listAvailableManagementCidrRangesAsync list-available-management-cidr-ranges-request))))

