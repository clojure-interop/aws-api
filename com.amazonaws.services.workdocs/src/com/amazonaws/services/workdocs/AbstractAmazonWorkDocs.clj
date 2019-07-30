(ns com.amazonaws.services.workdocs.AbstractAmazonWorkDocs
  "Abstract implementation of AmazonWorkDocs. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs AbstractAmazonWorkDocs]))

(defn delete-notification-subscription
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest`

  returns: Result of the DeleteNotificationSubscription operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult`"
  (^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest request]
    (-> this (.deleteNotificationSubscription request))))

(defn get-resources
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.GetResourcesRequest`

  returns: Result of the GetResources operation returned by the service. - `com.amazonaws.services.workdocs.model.GetResourcesResult`"
  (^com.amazonaws.services.workdocs.model.GetResourcesResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetResourcesRequest request]
    (-> this (.getResources request))))

(defn get-document-path
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.GetDocumentPathRequest`

  returns: Result of the GetDocumentPath operation returned by the service. - `com.amazonaws.services.workdocs.model.GetDocumentPathResult`"
  (^com.amazonaws.services.workdocs.model.GetDocumentPathResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetDocumentPathRequest request]
    (-> this (.getDocumentPath request))))

(defn get-document
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.GetDocumentRequest`

  returns: Result of the GetDocument operation returned by the service. - `com.amazonaws.services.workdocs.model.GetDocumentResult`"
  (^com.amazonaws.services.workdocs.model.GetDocumentResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetDocumentRequest request]
    (-> this (.getDocument request))))

(defn create-custom-metadata
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest`

  returns: Result of the CreateCustomMetadata operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateCustomMetadataResult`"
  (^com.amazonaws.services.workdocs.model.CreateCustomMetadataResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest request]
    (-> this (.createCustomMetadata request))))

(defn describe-document-versions
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest`

  returns: Result of the DescribeDocumentVersions operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult`"
  (^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest request]
    (-> this (.describeDocumentVersions request))))

(defn update-user
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateUserResult`"
  (^com.amazonaws.services.workdocs.model.UpdateUserResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn create-comment
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.CreateCommentRequest`

  returns: Result of the CreateComment operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateCommentResult`"
  (^com.amazonaws.services.workdocs.model.CreateCommentResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateCommentRequest request]
    (-> this (.createComment request))))

(defn delete-labels
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DeleteLabelsRequest`

  returns: Result of the DeleteLabels operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteLabelsResult`"
  (^com.amazonaws.services.workdocs.model.DeleteLabelsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteLabelsRequest request]
    (-> this (.deleteLabels request))))

(defn remove-resource-permission
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest`

  returns: Result of the RemoveResourcePermission operation returned by the service. - `com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult`"
  (^com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest request]
    (-> this (.removeResourcePermission request))))

(defn delete-comment
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DeleteCommentRequest`

  returns: Result of the DeleteComment operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteCommentResult`"
  (^com.amazonaws.services.workdocs.model.DeleteCommentResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteCommentRequest request]
    (-> this (.deleteComment request))))

(defn describe-root-folders
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest`

  returns: Result of the DescribeRootFolders operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeRootFoldersResult`"
  (^com.amazonaws.services.workdocs.model.DescribeRootFoldersResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest request]
    (-> this (.describeRootFolders request))))

(defn deactivate-user
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DeactivateUserRequest`

  returns: Result of the DeactivateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.DeactivateUserResult`"
  (^com.amazonaws.services.workdocs.model.DeactivateUserResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeactivateUserRequest request]
    (-> this (.deactivateUser request))))

(defn create-user
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateUserResult`"
  (^com.amazonaws.services.workdocs.model.CreateUserResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn delete-user
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteUserResult`"
  (^com.amazonaws.services.workdocs.model.DeleteUserResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn update-document
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.UpdateDocumentRequest`

  returns: Result of the UpdateDocument operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateDocumentResult`"
  (^com.amazonaws.services.workdocs.model.UpdateDocumentResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.UpdateDocumentRequest request]
    (-> this (.updateDocument request))))

(defn add-resource-permissions
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest`

  returns: Result of the AddResourcePermissions operation returned by the service. - `com.amazonaws.services.workdocs.model.AddResourcePermissionsResult`"
  (^com.amazonaws.services.workdocs.model.AddResourcePermissionsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest request]
    (-> this (.addResourcePermissions request))))

(defn delete-custom-metadata
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest`

  returns: Result of the DeleteCustomMetadata operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult`"
  (^com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest request]
    (-> this (.deleteCustomMetadata request))))

(defn create-folder
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.CreateFolderRequest`

  returns: Result of the CreateFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateFolderResult`"
  (^com.amazonaws.services.workdocs.model.CreateFolderResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateFolderRequest request]
    (-> this (.createFolder request))))

(defn abort-document-version-upload
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest`

  returns: Result of the AbortDocumentVersionUpload operation returned by the service. - `com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult`"
  (^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest request]
    (-> this (.abortDocumentVersionUpload request))))

(defn shutdown
  "Description copied from interface: AmazonWorkDocs"
  ([^AbstractAmazonWorkDocs this]
    (-> this (.shutdown))))

(defn delete-folder
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DeleteFolderRequest`

  returns: Result of the DeleteFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteFolderResult`"
  (^com.amazonaws.services.workdocs.model.DeleteFolderResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteFolderRequest request]
    (-> this (.deleteFolder request))))

(defn update-folder
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.UpdateFolderRequest`

  returns: Result of the UpdateFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateFolderResult`"
  (^com.amazonaws.services.workdocs.model.UpdateFolderResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.UpdateFolderRequest request]
    (-> this (.updateFolder request))))

(defn create-labels
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.CreateLabelsRequest`

  returns: Result of the CreateLabels operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateLabelsResult`"
  (^com.amazonaws.services.workdocs.model.CreateLabelsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateLabelsRequest request]
    (-> this (.createLabels request))))

(defn get-folder
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.GetFolderRequest`

  returns: Result of the GetFolder operation returned by the service. - `com.amazonaws.services.workdocs.model.GetFolderResult`"
  (^com.amazonaws.services.workdocs.model.GetFolderResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetFolderRequest request]
    (-> this (.getFolder request))))

(defn describe-activities
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DescribeActivitiesRequest`

  returns: Result of the DescribeActivities operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeActivitiesResult`"
  (^com.amazonaws.services.workdocs.model.DescribeActivitiesResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeActivitiesRequest request]
    (-> this (.describeActivities request))))

(defn describe-comments
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DescribeCommentsRequest`

  returns: Result of the DescribeComments operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeCommentsResult`"
  (^com.amazonaws.services.workdocs.model.DescribeCommentsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeCommentsRequest request]
    (-> this (.describeComments request))))

(defn update-document-version
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest`

  returns: Result of the UpdateDocumentVersion operation returned by the service. - `com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult`"
  (^com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest request]
    (-> this (.updateDocumentVersion request))))

(defn describe-groups
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DescribeGroupsRequest`

  returns: Result of the DescribeGroups operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeGroupsResult`"
  (^com.amazonaws.services.workdocs.model.DescribeGroupsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeGroupsRequest request]
    (-> this (.describeGroups request))))

(defn describe-folder-contents
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest`

  returns: Result of the DescribeFolderContents operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeFolderContentsResult`"
  (^com.amazonaws.services.workdocs.model.DescribeFolderContentsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest request]
    (-> this (.describeFolderContents request))))

(defn get-current-user
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.GetCurrentUserRequest`

  returns: Result of the GetCurrentUser operation returned by the service. - `com.amazonaws.services.workdocs.model.GetCurrentUserResult`"
  (^com.amazonaws.services.workdocs.model.GetCurrentUserResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetCurrentUserRequest request]
    (-> this (.getCurrentUser request))))

(defn describe-notification-subscriptions
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest`

  returns: Result of the DescribeNotificationSubscriptions operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult`"
  (^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest request]
    (-> this (.describeNotificationSubscriptions request))))

(defn activate-user
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.ActivateUserRequest`

  returns: Result of the ActivateUser operation returned by the service. - `com.amazonaws.services.workdocs.model.ActivateUserResult`"
  (^com.amazonaws.services.workdocs.model.ActivateUserResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.ActivateUserRequest request]
    (-> this (.activateUser request))))

(defn describe-resource-permissions
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest`

  returns: Result of the DescribeResourcePermissions operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult`"
  (^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest request]
    (-> this (.describeResourcePermissions request))))

(defn remove-all-resource-permissions
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest`

  returns: Result of the RemoveAllResourcePermissions operation returned by the service. - `com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult`"
  (^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest request]
    (-> this (.removeAllResourcePermissions request))))

(defn get-document-version
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.GetDocumentVersionRequest`

  returns: Result of the GetDocumentVersion operation returned by the service. - `com.amazonaws.services.workdocs.model.GetDocumentVersionResult`"
  (^com.amazonaws.services.workdocs.model.GetDocumentVersionResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetDocumentVersionRequest request]
    (-> this (.getDocumentVersion request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonWorkDocs

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonWorkDocs this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-document
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DeleteDocumentRequest`

  returns: Result of the DeleteDocument operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteDocumentResult`"
  (^com.amazonaws.services.workdocs.model.DeleteDocumentResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteDocumentRequest request]
    (-> this (.deleteDocument request))))

(defn initiate-document-version-upload
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest`

  returns: Result of the InitiateDocumentVersionUpload operation returned by the service. - `com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult`"
  (^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest request]
    (-> this (.initiateDocumentVersionUpload request))))

(defn get-folder-path
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.GetFolderPathRequest`

  returns: Result of the GetFolderPath operation returned by the service. - `com.amazonaws.services.workdocs.model.GetFolderPathResult`"
  (^com.amazonaws.services.workdocs.model.GetFolderPathResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.GetFolderPathRequest request]
    (-> this (.getFolderPath request))))

(defn create-notification-subscription
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest`

  returns: Result of the CreateNotificationSubscription operation returned by the service. - `com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult`"
  (^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest request]
    (-> this (.createNotificationSubscription request))))

(defn delete-folder-contents
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest`

  returns: Result of the DeleteFolderContents operation returned by the service. - `com.amazonaws.services.workdocs.model.DeleteFolderContentsResult`"
  (^com.amazonaws.services.workdocs.model.DeleteFolderContentsResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest request]
    (-> this (.deleteFolderContents request))))

(defn describe-users
  "Description copied from interface: AmazonWorkDocs

  request - `com.amazonaws.services.workdocs.model.DescribeUsersRequest`

  returns: Result of the DescribeUsers operation returned by the service. - `com.amazonaws.services.workdocs.model.DescribeUsersResult`"
  (^com.amazonaws.services.workdocs.model.DescribeUsersResult [^AbstractAmazonWorkDocs this ^com.amazonaws.services.workdocs.model.DescribeUsersRequest request]
    (-> this (.describeUsers request))))

