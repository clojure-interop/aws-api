(ns com.amazonaws.services.workdocs.AmazonWorkDocsClient
  "Client for accessing Amazon WorkDocs. All service calls made using this client are blocking, and will not return
  until the service call completes.


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
  (:import [com.amazonaws.services.workdocs AmazonWorkDocsClient]))

(defn *builder
  "returns: `com.amazonaws.services.workdocs.AmazonWorkDocsClientBuilder`"
  (^com.amazonaws.services.workdocs.AmazonWorkDocsClientBuilder []
    (AmazonWorkDocsClient/builder )))

(defn delete-notification-subscription
  "Deletes the specified subscription from the specified organization.

  request - `com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest`

  returns: Result of the DeleteNotificationSubscription operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedResourceAccessException - The caller does not have access to perform the action on the resource."
  (^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest request]
    (-> this (.deleteNotificationSubscription request))))

(defn get-resources
  "Retrieves a collection of resources, including folders and documents. The only CollectionType
   supported is SHARED_WITH_ME.

  request - `com.amazonaws.services.workdocs.model.GetResourcesRequest`

  returns: Result of the GetResources operation returned by the service. - `com.amazonaws.services.workdocs.model.GetResourcesResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedResourceAccessException - The caller does not have access to perform the action on the resource."
  (^com.amazonaws.services.workdocs.model.GetResourcesResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.GetResourcesRequest request]
    (-> this (.getResources request))))

(defn get-document-path
  "Retrieves the path information (the hierarchy from the root folder) for the requested document.


   By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes
   the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
   names of the parent folders.

  request - `com.amazonaws.services.workdocs.model.GetDocumentPathRequest`

  returns: Result of the GetDocumentPath operation returned by the service. - `com.amazonaws.services.workdocs.model.GetDocumentPathResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetDocumentPathResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.GetDocumentPathRequest request]
    (-> this (.getDocumentPath request))))

(defn get-document
  "Retrieves details of a document.

  request - `com.amazonaws.services.workdocs.model.GetDocumentRequest`

  returns: Result of the GetDocument operation returned by the service. - `com.amazonaws.services.workdocs.model.GetDocumentResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetDocumentResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.GetDocumentRequest request]
    (-> this (.getDocument request))))

(defn create-custom-metadata
  "Adds one or more custom properties to the specified resource (a folder, document, or version).

  request - `com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest`

  returns: Result of the CreateCustomMetadata operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateCustomMetadataResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.CreateCustomMetadataResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest request]
    (-> this (.createCustomMetadata request))))

(defn describe-document-versions
  "Retrieves the document versions for the specified document.


   By default, only active versions are returned.

  request - `com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest`

  returns: Result of the DescribeDocumentVersions operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest request]
    (-> this (.describeDocumentVersions request))))

(defn update-user
  "Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the
   Amazon WorkDocs site.

  request - `com.amazonaws.services.workdocs.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.UpdateUserResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn create-comment
  "Adds a new comment to the specified document version.

  request - `com.amazonaws.services.workdocs.model.CreateCommentRequest`

  returns: Result of the CreateComment operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateCommentResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.CreateCommentResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.CreateCommentRequest request]
    (-> this (.createComment request))))

(defn delete-labels
  "Deletes the specified list of labels from a resource.

  request - `com.amazonaws.services.workdocs.model.DeleteLabelsRequest`

  returns: Result of the DeleteLabels operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteLabelsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteLabelsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DeleteLabelsRequest request]
    (-> this (.deleteLabels request))))

(defn remove-resource-permission
  "Removes the permission for the specified principal from the specified resource.

  request - `com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest`

  returns: Result of the RemoveResourcePermission operation returned by the service. - `com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest request]
    (-> this (.removeResourcePermission request))))

(defn delete-comment
  "Deletes the specified comment from the document version.

  request - `com.amazonaws.services.workdocs.model.DeleteCommentRequest`

  returns: Result of the DeleteComment operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteCommentResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteCommentResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DeleteCommentRequest request]
    (-> this (.deleteComment request))))

(defn describe-root-folders
  "Describes the current user's special folders; the RootFolder and the RecycleBin.
   RootFolder is the root of user's files and folders and RecycleBin is the root of
   recycled items. This is not a valid action for SigV4 (administrative API) clients.


   This action requires an authentication token. To get an authentication token, register an application with Amazon
   WorkDocs. For more information, see Authentication and Access
   Control for User Applications in the Amazon WorkDocs Developer Guide.

  request - `com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest`

  returns: Result of the DescribeRootFolders operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeRootFoldersResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.DescribeRootFoldersResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest request]
    (-> this (.describeRootFolders request))))

(defn deactivate-user
  "Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.

  request - `com.amazonaws.services.workdocs.model.DeactivateUserRequest`

  returns: Result of the DeactivateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.DeactivateUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeactivateUserResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DeactivateUserRequest request]
    (-> this (.deactivateUser request))))

(defn create-user
  "Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is \"ACTIVE\". New
   users can access Amazon WorkDocs.

  request - `com.amazonaws.services.workdocs.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityAlreadyExistsException - The resource already exists."
  (^com.amazonaws.services.workdocs.model.CreateUserResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn delete-user
  "Deletes the specified user from a Simple AD or Microsoft AD directory.

  request - `com.amazonaws.services.workdocs.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteUserResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn update-document
  "Updates the specified attributes of a document. The user must have access to both the document and its parent
   folder, if applicable.

  request - `com.amazonaws.services.workdocs.model.UpdateDocumentRequest`

  returns: Result of the UpdateDocument operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateDocumentResult`

  throws: com.amazonaws.services.workdocs.model.ProhibitedStateException - The specified document version is not in the INITIALIZED state."
  (^com.amazonaws.services.workdocs.model.UpdateDocumentResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.UpdateDocumentRequest request]
    (-> this (.updateDocument request))))

(defn add-resource-permissions
  "Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if
   the principals already have different permissions.

  request - `com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest`

  returns: Result of the AddResourcePermissions operation returned by the service. - `com.amazonaws.services.workdocs.model.AddResourcePermissionsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.AddResourcePermissionsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest request]
    (-> this (.addResourcePermissions request))))

(defn delete-custom-metadata
  "Deletes custom metadata from the specified resource.

  request - `com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest`

  returns: Result of the DeleteCustomMetadata operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest request]
    (-> this (.deleteCustomMetadata request))))

(defn create-folder
  "Creates a folder with the specified name and parent folder.

  request - `com.amazonaws.services.workdocs.model.CreateFolderRequest`

  returns: Result of the CreateFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateFolderResult`

  throws: com.amazonaws.services.workdocs.model.ProhibitedStateException - The specified document version is not in the INITIALIZED state."
  (^com.amazonaws.services.workdocs.model.CreateFolderResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.CreateFolderRequest request]
    (-> this (.createFolder request))))

(defn abort-document-version-upload
  "Aborts the upload of the specified document version that was previously initiated by
   InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload
   the document version, or fails to do so.

  request - `com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest`

  returns: Result of the AbortDocumentVersionUpload operation returned by the service. - `com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest request]
    (-> this (.abortDocumentVersionUpload request))))

(defn delete-folder
  "Permanently deletes the specified folder and its contents.

  request - `com.amazonaws.services.workdocs.model.DeleteFolderRequest`

  returns: Result of the DeleteFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteFolderResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteFolderResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DeleteFolderRequest request]
    (-> this (.deleteFolder request))))

(defn update-folder
  "Updates the specified attributes of the specified folder. The user must have access to both the folder and its
   parent folder, if applicable.

  request - `com.amazonaws.services.workdocs.model.UpdateFolderRequest`

  returns: Result of the UpdateFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateFolderResult`

  throws: com.amazonaws.services.workdocs.model.ProhibitedStateException - The specified document version is not in the INITIALIZED state."
  (^com.amazonaws.services.workdocs.model.UpdateFolderResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.UpdateFolderRequest request]
    (-> this (.updateFolder request))))

(defn create-labels
  "Adds the specified list of labels to the given resource (a document or folder)

  request - `com.amazonaws.services.workdocs.model.CreateLabelsRequest`

  returns: Result of the CreateLabels operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateLabelsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.CreateLabelsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.CreateLabelsRequest request]
    (-> this (.createLabels request))))

(defn get-folder
  "Retrieves the metadata of the specified folder.

  request - `com.amazonaws.services.workdocs.model.GetFolderRequest`

  returns: Result of the GetFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.GetFolderResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetFolderResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.GetFolderRequest request]
    (-> this (.getFolder request))))

(defn describe-activities
  "Describes the user activities in a specified time period.

  request - `com.amazonaws.services.workdocs.model.DescribeActivitiesRequest`

  returns: Result of the DescribeActivities operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeActivitiesResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.DescribeActivitiesResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DescribeActivitiesRequest request]
    (-> this (.describeActivities request))))

(defn describe-comments
  "List all the comments for the specified document version.

  request - `com.amazonaws.services.workdocs.model.DescribeCommentsRequest`

  returns: Result of the DescribeComments operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeCommentsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DescribeCommentsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DescribeCommentsRequest request]
    (-> this (.describeComments request))))

(defn update-document-version
  "Changes the status of the document version to ACTIVE.


   Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the
   client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload.

  request - `com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest`

  returns: Result of the UpdateDocumentVersion operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest request]
    (-> this (.updateDocumentVersion request))))

(defn describe-groups
  "Describes the groups specified by the query. Groups are defined by the underlying Active Directory.

  request - `com.amazonaws.services.workdocs.model.DescribeGroupsRequest`

  returns: Result of the DescribeGroups operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeGroupsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.DescribeGroupsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DescribeGroupsRequest request]
    (-> this (.describeGroups request))))

(defn describe-folder-contents
  "Describes the contents of the specified folder, including its documents and subfolders.


   By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more
   results, the response includes a marker that you can use to request the next set of results. You can also request
   initialized documents.

  request - `com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest`

  returns: Result of the DescribeFolderContents operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeFolderContentsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DescribeFolderContentsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest request]
    (-> this (.describeFolderContents request))))

(defn get-current-user
  "Retrieves details of the current user for whom the authentication token was generated. This is not a valid action
   for SigV4 (administrative API) clients.

  request - `com.amazonaws.services.workdocs.model.GetCurrentUserRequest`

  returns: Result of the GetCurrentUser operation returned by the service. - `com.amazonaws.services.workdocs.model.GetCurrentUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetCurrentUserResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.GetCurrentUserRequest request]
    (-> this (.getCurrentUser request))))

(defn describe-notification-subscriptions
  "Lists the specified notification subscriptions.

  request - `com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest`

  returns: Result of the DescribeNotificationSubscriptions operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedResourceAccessException - The caller does not have access to perform the action on the resource."
  (^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest request]
    (-> this (.describeNotificationSubscriptions request))))

(defn activate-user
  "Activates the specified user. Only active users can access Amazon WorkDocs.

  request - `com.amazonaws.services.workdocs.model.ActivateUserRequest`

  returns: Result of the ActivateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.ActivateUserResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.ActivateUserResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.ActivateUserRequest request]
    (-> this (.activateUser request))))

(defn describe-resource-permissions
  "Describes the permissions of a specified resource.

  request - `com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest`

  returns: Result of the DescribeResourcePermissions operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest request]
    (-> this (.describeResourcePermissions request))))

(defn remove-all-resource-permissions
  "Removes all the permissions from the specified resource.

  request - `com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest`

  returns: Result of the RemoveAllResourcePermissions operation returned by the service. - `com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedOperationException - The operation is not permitted."
  (^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest request]
    (-> this (.removeAllResourcePermissions request))))

(defn get-document-version
  "Retrieves version metadata for the specified document.

  request - `com.amazonaws.services.workdocs.model.GetDocumentVersionRequest`

  returns: Result of the GetDocumentVersion operation returned by the service. - `com.amazonaws.services.workdocs.model.GetDocumentVersionResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetDocumentVersionResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.GetDocumentVersionRequest request]
    (-> this (.getDocumentVersion request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonWorkDocsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-document
  "Permanently deletes the specified document and its associated metadata.

  request - `com.amazonaws.services.workdocs.model.DeleteDocumentRequest`

  returns: Result of the DeleteDocument operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteDocumentResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteDocumentResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DeleteDocumentRequest request]
    (-> this (.deleteDocument request))))

(defn initiate-document-version-upload
  "Creates a new document object and version object.


   The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when
   creating a new version of an existing document. This is the first step to upload a document. Next, upload the
   document to the URL returned from the call, and then call UpdateDocumentVersion.


   To cancel the document upload, call AbortDocumentVersionUpload.

  request - `com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest`

  returns: Result of the InitiateDocumentVersionUpload operation returned by the service. - `com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult`

  throws: com.amazonaws.services.workdocs.model.ResourceAlreadyCheckedOutException - The resource is already checked out."
  (^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest request]
    (-> this (.initiateDocumentVersionUpload request))))

(defn get-folder-path
  "Retrieves the path information (the hierarchy from the root folder) for the specified folder.


   By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes
   the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
   parent folder names.

  request - `com.amazonaws.services.workdocs.model.GetFolderPathRequest`

  returns: Result of the GetFolderPath operation returned by the service. - `com.amazonaws.services.workdocs.model.GetFolderPathResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.GetFolderPathResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.GetFolderPathRequest request]
    (-> this (.getFolderPath request))))

(defn create-notification-subscription
  "Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must
   confirm the subscription.


   For more information, see Subscribe to
   Notifications in the Amazon WorkDocs Developer Guide.

  request - `com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest`

  returns: Result of the CreateNotificationSubscription operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult`

  throws: com.amazonaws.services.workdocs.model.UnauthorizedResourceAccessException - The caller does not have access to perform the action on the resource."
  (^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest request]
    (-> this (.createNotificationSubscription request))))

(defn delete-folder-contents
  "Deletes the contents of the specified folder.

  request - `com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest`

  returns: Result of the DeleteFolderContents operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteFolderContentsResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DeleteFolderContentsResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest request]
    (-> this (.deleteFolderContents request))))

(defn describe-users
  "Describes the specified users. You can describe all users or filter the results (for example, by status or
   organization).


   By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response
   includes a marker that you can use to request the next set of results.

  request - `com.amazonaws.services.workdocs.model.DescribeUsersRequest`

  returns: Result of the DescribeUsers operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeUsersResult`

  throws: com.amazonaws.services.workdocs.model.EntityNotExistsException - The resource does not exist."
  (^com.amazonaws.services.workdocs.model.DescribeUsersResult [^AmazonWorkDocsClient this ^com.amazonaws.services.workdocs.model.DescribeUsersRequest request]
    (-> this (.describeUsers request))))

