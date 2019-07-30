(ns com.amazonaws.services.workdocs.AmazonWorkDocs
  "Interface for accessing Amazon WorkDocs.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonWorkDocs instead.



  The WorkDocs API is designed for the following use cases:




  File Migration: File migration applications are supported for users who want to migrate their files from an
  on-premises or off-premises file system or service. Users can insert files into a user directory structure, as well
  as allow for basic metadata changes, such as modifications to the permissions of files.




  Security: Support security applications are supported for users who have additional security needs, such as antivirus
  or data loss prevention. The API actions, along with AWS CloudTrail, allow these applications to detect when changes
  occur in Amazon WorkDocs. Then, the application can take the necessary actions and replace the target file. If the
  target file violates the policy, the application can also choose to email the user.




  eDiscovery/Analytics: General administrative applications are supported, such as eDiscovery and analytics. These
  applications can choose to mimic or record the actions in an Amazon WorkDocs site, along with AWS CloudTrail, to
  replicate data for eDiscovery, backup, or analytical applications.




  All Amazon WorkDocs API actions are Amazon authenticated and certificate-signed. They not only require the use of the
  AWS SDK, but also allow for the exclusive use of IAM users and roles to help facilitate access, trust, and permission
  policies. By creating a role and allowing an IAM user to access the Amazon WorkDocs site, the IAM user gains full
  administrative visibility into the entire Amazon WorkDocs site (or as set in the IAM policy). This includes, but is
  not limited to, the ability to modify file permissions and upload any file to any user. This allows developers to
  perform the three use cases above, as well as give users the ability to grant access on a selective basis using the
  IAM model."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs AmazonWorkDocs]))

(defn delete-notification-subscription
  "Deletes the specified subscription from the specified organization.

  delete-notification-subscription-request - `com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest`

  returns: Result of the DeleteNotificationSubscription operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedResourceAccessException - The caller does not have access to perform the action on the resource."
  (^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest delete-notification-subscription-request]
    (-> this (.deleteNotificationSubscription delete-notification-subscription-request))))

(defn get-resources
  "Retrieves a collection of resources, including folders and documents. The only CollectionType
   supported is SHARED_WITH_ME.

  get-resources-request - `com.amazonaws.services.workdocs.model.GetResourcesRequest`

  returns: Result of the GetResources operation returned by the service. - `com.amazonaws.services.workdocs.model.GetResourcesResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedResourceAccessException - The caller does not have access to perform the action on the resource."
  (^com.amazonaws.services.workdocs.model.GetResourcesResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetResourcesRequest get-resources-request]
    (-> this (.getResources get-resources-request))))

(defn get-document-path
  "Retrieves the path information (the hierarchy from the root folder) for the requested document.


   By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes
   the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
   names of the parent folders.

  get-document-path-request - `com.amazonaws.services.workdocs.model.GetDocumentPathRequest`

  returns: Result of the GetDocumentPath operation returned by the service. - `com.amazonaws.services.workdocs.model.GetDocumentPathResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetDocumentPathResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetDocumentPathRequest get-document-path-request]
    (-> this (.getDocumentPath get-document-path-request))))

(defn get-document
  "Retrieves details of a document.

  get-document-request - `com.amazonaws.services.workdocs.model.GetDocumentRequest`

  returns: Result of the GetDocument operation returned by the service. - `com.amazonaws.services.workdocs.model.GetDocumentResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetDocumentResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetDocumentRequest get-document-request]
    (-> this (.getDocument get-document-request))))

(defn create-custom-metadata
  "Adds one or more custom properties to the specified resource (a folder, document, or version).

  create-custom-metadata-request - `com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest`

  returns: Result of the CreateCustomMetadata operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateCustomMetadataResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.CreateCustomMetadataResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest create-custom-metadata-request]
    (-> this (.createCustomMetadata create-custom-metadata-request))))

(defn describe-document-versions
  "Retrieves the document versions for the specified document.


   By default, only active versions are returned.

  describe-document-versions-request - `com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest`

  returns: Result of the DescribeDocumentVersions operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest describe-document-versions-request]
    (-> this (.describeDocumentVersions describe-document-versions-request))))

(defn update-user
  "Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the
   Amazon WorkDocs site.

  update-user-request - `com.amazonaws.services.workdocs.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.UpdateUserResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.UpdateUserRequest update-user-request]
    (-> this (.updateUser update-user-request))))

(defn create-comment
  "Adds a new comment to the specified document version.

  create-comment-request - `com.amazonaws.services.workdocs.model.CreateCommentRequest`

  returns: Result of the CreateComment operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateCommentResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.CreateCommentResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateCommentRequest create-comment-request]
    (-> this (.createComment create-comment-request))))

(defn delete-labels
  "Deletes the specified list of labels from a resource.

  delete-labels-request - `com.amazonaws.services.workdocs.model.DeleteLabelsRequest`

  returns: Result of the DeleteLabels operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteLabelsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteLabelsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteLabelsRequest delete-labels-request]
    (-> this (.deleteLabels delete-labels-request))))

(defn remove-resource-permission
  "Removes the permission for the specified principal from the specified resource.

  remove-resource-permission-request - `com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest`

  returns: Result of the RemoveResourcePermission operation returned by the service. - `com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest remove-resource-permission-request]
    (-> this (.removeResourcePermission remove-resource-permission-request))))

(defn delete-comment
  "Deletes the specified comment from the document version.

  delete-comment-request - `com.amazonaws.services.workdocs.model.DeleteCommentRequest`

  returns: Result of the DeleteComment operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteCommentResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteCommentResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteCommentRequest delete-comment-request]
    (-> this (.deleteComment delete-comment-request))))

(defn describe-root-folders
  "Describes the current user's special folders; the RootFolder and the RecycleBin.
   RootFolder is the root of user's files and folders and RecycleBin is the root of
   recycled items. This is not a valid action for SigV4 (administrative API) clients.


   This action requires an authentication token. To get an authentication token, register an application with Amazon
   WorkDocs. For more information, see Authentication and Access
   Control for User Applications in the Amazon WorkDocs Developer Guide.

  describe-root-folders-request - `com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest`

  returns: Result of the DescribeRootFolders operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeRootFoldersResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.DescribeRootFoldersResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest describe-root-folders-request]
    (-> this (.describeRootFolders describe-root-folders-request))))

(defn deactivate-user
  "Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.

  deactivate-user-request - `com.amazonaws.services.workdocs.model.DeactivateUserRequest`

  returns: Result of the DeactivateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.DeactivateUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeactivateUserResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeactivateUserRequest deactivate-user-request]
    (-> this (.deactivateUser deactivate-user-request))))

(defn create-user
  "Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is \"ACTIVE\". New
   users can access Amazon WorkDocs.

  create-user-request - `com.amazonaws.services.workdocs.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityAlreadyExistsException - The resource already exists."
  (^com.amazonaws.services.workdocs.model.CreateUserResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateUserRequest create-user-request]
    (-> this (.createUser create-user-request))))

(defn delete-user
  "Deletes the specified user from a Simple AD or Microsoft AD directory.

  delete-user-request - `com.amazonaws.services.workdocs.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteUserResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUser delete-user-request))))

(defn update-document
  "Updates the specified attributes of a document. The user must have access to both the document and its parent
   folder, if applicable.

  update-document-request - `com.amazonaws.services.workdocs.model.UpdateDocumentRequest`

  returns: Result of the UpdateDocument operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateDocumentResult`

  throws: com.amazonaws.services.workdocs.model.ProhibitedStateException - The specified document version is not in the INITIALIZED state."
  (^com.amazonaws.services.workdocs.model.UpdateDocumentResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.UpdateDocumentRequest update-document-request]
    (-> this (.updateDocument update-document-request))))

(defn add-resource-permissions
  "Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if
   the principals already have different permissions.

  add-resource-permissions-request - `com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest`

  returns: Result of the AddResourcePermissions operation returned by the service. - `com.amazonaws.services.workdocs.model.AddResourcePermissionsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.AddResourcePermissionsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest add-resource-permissions-request]
    (-> this (.addResourcePermissions add-resource-permissions-request))))

(defn delete-custom-metadata
  "Deletes custom metadata from the specified resource.

  delete-custom-metadata-request - `com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest`

  returns: Result of the DeleteCustomMetadata operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest delete-custom-metadata-request]
    (-> this (.deleteCustomMetadata delete-custom-metadata-request))))

(defn create-folder
  "Creates a folder with the specified name and parent folder.

  create-folder-request - `com.amazonaws.services.workdocs.model.CreateFolderRequest`

  returns: Result of the CreateFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateFolderResult`

  throws: com.amazonaws.services.workdocs.model.ProhibitedStateException - The specified document version is not in the INITIALIZED state."
  (^com.amazonaws.services.workdocs.model.CreateFolderResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateFolderRequest create-folder-request]
    (-> this (.createFolder create-folder-request))))

(defn abort-document-version-upload
  "Aborts the upload of the specified document version that was previously initiated by
   InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload
   the document version, or fails to do so.

  abort-document-version-upload-request - `com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest`

  returns: Result of the AbortDocumentVersionUpload operation returned by the service. - `com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest abort-document-version-upload-request]
    (-> this (.abortDocumentVersionUpload abort-document-version-upload-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonWorkDocs this]
    (-> this (.shutdown))))

(defn delete-folder
  "Permanently deletes the specified folder and its contents.

  delete-folder-request - `com.amazonaws.services.workdocs.model.DeleteFolderRequest`

  returns: Result of the DeleteFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteFolderResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteFolderResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteFolderRequest delete-folder-request]
    (-> this (.deleteFolder delete-folder-request))))

(defn update-folder
  "Updates the specified attributes of the specified folder. The user must have access to both the folder and its
   parent folder, if applicable.

  update-folder-request - `com.amazonaws.services.workdocs.model.UpdateFolderRequest`

  returns: Result of the UpdateFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateFolderResult`

  throws: com.amazonaws.services.workdocs.model.ProhibitedStateException - The specified document version is not in the INITIALIZED state."
  (^com.amazonaws.services.workdocs.model.UpdateFolderResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.UpdateFolderRequest update-folder-request]
    (-> this (.updateFolder update-folder-request))))

(defn create-labels
  "Adds the specified list of labels to the given resource (a document or folder)

  create-labels-request - `com.amazonaws.services.workdocs.model.CreateLabelsRequest`

  returns: Result of the CreateLabels operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateLabelsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.CreateLabelsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateLabelsRequest create-labels-request]
    (-> this (.createLabels create-labels-request))))

(defn get-folder
  "Retrieves the metadata of the specified folder.

  get-folder-request - `com.amazonaws.services.workdocs.model.GetFolderRequest`

  returns: Result of the GetFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.GetFolderResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetFolderResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetFolderRequest get-folder-request]
    (-> this (.getFolder get-folder-request))))

(defn describe-activities
  "Describes the user activities in a specified time period.

  describe-activities-request - `com.amazonaws.services.workdocs.model.DescribeActivitiesRequest`

  returns: Result of the DescribeActivities operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeActivitiesResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.DescribeActivitiesResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeActivitiesRequest describe-activities-request]
    (-> this (.describeActivities describe-activities-request))))

(defn describe-comments
  "List all the comments for the specified document version.

  describe-comments-request - `com.amazonaws.services.workdocs.model.DescribeCommentsRequest`

  returns: Result of the DescribeComments operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeCommentsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DescribeCommentsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeCommentsRequest describe-comments-request]
    (-> this (.describeComments describe-comments-request))))

(defn update-document-version
  "Changes the status of the document version to ACTIVE.


   Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the
   client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload.

  update-document-version-request - `com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest`

  returns: Result of the UpdateDocumentVersion operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest update-document-version-request]
    (-> this (.updateDocumentVersion update-document-version-request))))

(defn describe-groups
  "Describes the groups specified by the query. Groups are defined by the underlying Active Directory.

  describe-groups-request - `com.amazonaws.services.workdocs.model.DescribeGroupsRequest`

  returns: Result of the DescribeGroups operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeGroupsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.DescribeGroupsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeGroupsRequest describe-groups-request]
    (-> this (.describeGroups describe-groups-request))))

(defn describe-folder-contents
  "Describes the contents of the specified folder, including its documents and subfolders.


   By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more
   results, the response includes a marker that you can use to request the next set of results. You can also request
   initialized documents.

  describe-folder-contents-request - `com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest`

  returns: Result of the DescribeFolderContents operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeFolderContentsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DescribeFolderContentsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest describe-folder-contents-request]
    (-> this (.describeFolderContents describe-folder-contents-request))))

(defn get-current-user
  "Retrieves details of the current user for whom the authentication token was generated. This is not a valid action
   for SigV4 (administrative API) clients.

  get-current-user-request - `com.amazonaws.services.workdocs.model.GetCurrentUserRequest`

  returns: Result of the GetCurrentUser operation returned by the service. - `com.amazonaws.services.workdocs.model.GetCurrentUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetCurrentUserResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetCurrentUserRequest get-current-user-request]
    (-> this (.getCurrentUser get-current-user-request))))

(defn describe-notification-subscriptions
  "Lists the specified notification subscriptions.

  describe-notification-subscriptions-request - `com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest`

  returns: Result of the DescribeNotificationSubscriptions operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedResourceAccessException - The caller does not have access to perform the action on the resource."
  (^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest describe-notification-subscriptions-request]
    (-> this (.describeNotificationSubscriptions describe-notification-subscriptions-request))))

(defn activate-user
  "Activates the specified user. Only active users can access Amazon WorkDocs.

  activate-user-request - `com.amazonaws.services.workdocs.model.ActivateUserRequest`

  returns: Result of the ActivateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.ActivateUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.ActivateUserResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.ActivateUserRequest activate-user-request]
    (-> this (.activateUser activate-user-request))))

(defn describe-resource-permissions
  "Describes the permissions of a specified resource.

  describe-resource-permissions-request - `com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest`

  returns: Result of the DescribeResourcePermissions operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest describe-resource-permissions-request]
    (-> this (.describeResourcePermissions describe-resource-permissions-request))))

(defn remove-all-resource-permissions
  "Removes all the permissions from the specified resource.

  remove-all-resource-permissions-request - `com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest`

  returns: Result of the RemoveAllResourcePermissions operation returned by the service. - `com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest remove-all-resource-permissions-request]
    (-> this (.removeAllResourcePermissions remove-all-resource-permissions-request))))

(defn get-document-version
  "Retrieves version metadata for the specified document.

  get-document-version-request - `com.amazonaws.services.workdocs.model.GetDocumentVersionRequest`

  returns: Result of the GetDocumentVersion operation returned by the service. - `com.amazonaws.services.workdocs.model.GetDocumentVersionResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetDocumentVersionResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetDocumentVersionRequest get-document-version-request]
    (-> this (.getDocumentVersion get-document-version-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonWorkDocs this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-document
  "Permanently deletes the specified document and its associated metadata.

  delete-document-request - `com.amazonaws.services.workdocs.model.DeleteDocumentRequest`

  returns: Result of the DeleteDocument operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteDocumentResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteDocumentResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteDocumentRequest delete-document-request]
    (-> this (.deleteDocument delete-document-request))))

(defn initiate-document-version-upload
  "Creates a new document object and version object.


   The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when
   creating a new version of an existing document. This is the first step to upload a document. Next, upload the
   document to the URL returned from the call, and then call UpdateDocumentVersion.


   To cancel the document upload, call AbortDocumentVersionUpload.

  initiate-document-version-upload-request - `com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest`

  returns: Result of the InitiateDocumentVersionUpload operation returned by the service. - `com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult`

  throws: com.amazonaws.services.workdocs.model.ResourceAlreadyCheckedOutException - The resource is already checked out."
  (^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest initiate-document-version-upload-request]
    (-> this (.initiateDocumentVersionUpload initiate-document-version-upload-request))))

(defn get-folder-path
  "Retrieves the path information (the hierarchy from the root folder) for the specified folder.


   By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes
   the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
   parent folder names.

  get-folder-path-request - `com.amazonaws.services.workdocs.model.GetFolderPathRequest`

  returns: Result of the GetFolderPath operation returned by the service. - `com.amazonaws.services.workdocs.model.GetFolderPathResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetFolderPathResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetFolderPathRequest get-folder-path-request]
    (-> this (.getFolderPath get-folder-path-request))))

(defn create-notification-subscription
  "Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must
   confirm the subscription.


   For more information, see Subscribe to
   Notifications in the Amazon WorkDocs Developer Guide.

  create-notification-subscription-request - `com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest`

  returns: Result of the CreateNotificationSubscription operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedResourceAccessException - The caller does not have access to perform the action on the resource."
  (^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest create-notification-subscription-request]
    (-> this (.createNotificationSubscription create-notification-subscription-request))))

(defn delete-folder-contents
  "Deletes the contents of the specified folder.

  delete-folder-contents-request - `com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest`

  returns: Result of the DeleteFolderContents operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteFolderContentsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteFolderContentsResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest delete-folder-contents-request]
    (-> this (.deleteFolderContents delete-folder-contents-request))))

(defn describe-users
  "Describes the specified users. You can describe all users or filter the results (for example, by status or
   organization).


   By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response
   includes a marker that you can use to request the next set of results.

  describe-users-request - `com.amazonaws.services.workdocs.model.DescribeUsersRequest`

  returns: Result of the DescribeUsers operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeUsersResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DescribeUsersResult [^AmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeUsersRequest describe-users-request]
    (-> this (.describeUsers describe-users-request))))

