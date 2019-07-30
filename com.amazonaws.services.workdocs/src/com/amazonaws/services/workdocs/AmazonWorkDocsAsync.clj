(ns com.amazonaws.services.workdocs.AmazonWorkDocsAsync
  "Interface for accessing Amazon WorkDocs asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonWorkDocsAsync instead.



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
  (:import [com.amazonaws.services.workdocs AmazonWorkDocsAsync]))

(defn abort-document-version-upload-async
  "Aborts the upload of the specified document version that was previously initiated by
   InitiateDocumentVersionUpload. The client should make this call only when it no longer intends to upload
   the document version, or fails to do so.

  abort-document-version-upload-request - `com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AbortDocumentVersionUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest abort-document-version-upload-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.abortDocumentVersionUploadAsync abort-document-version-upload-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest abort-document-version-upload-request]
    (-> this (.abortDocumentVersionUploadAsync abort-document-version-upload-request))))

(defn activate-user-async
  "Activates the specified user. Only active users can access Amazon WorkDocs.

  activate-user-request - `com.amazonaws.services.workdocs.model.ActivateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ActivateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.ActivateUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.ActivateUserRequest activate-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.activateUserAsync activate-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.ActivateUserRequest activate-user-request]
    (-> this (.activateUserAsync activate-user-request))))

(defn describe-resource-permissions-async
  "Describes the permissions of a specified resource.

  describe-resource-permissions-request - `com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResourcePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest describe-resource-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourcePermissionsAsync describe-resource-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest describe-resource-permissions-request]
    (-> this (.describeResourcePermissionsAsync describe-resource-permissions-request))))

(defn delete-labels-async
  "Deletes the specified list of labels from a resource.

  delete-labels-request - `com.amazonaws.services.workdocs.model.DeleteLabelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLabels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteLabelsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteLabelsRequest delete-labels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLabelsAsync delete-labels-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteLabelsRequest delete-labels-request]
    (-> this (.deleteLabelsAsync delete-labels-request))))

(defn describe-notification-subscriptions-async
  "Lists the specified notification subscriptions.

  describe-notification-subscriptions-request - `com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotificationSubscriptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest describe-notification-subscriptions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotificationSubscriptionsAsync describe-notification-subscriptions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest describe-notification-subscriptions-request]
    (-> this (.describeNotificationSubscriptionsAsync describe-notification-subscriptions-request))))

(defn get-folder-async
  "Retrieves the metadata of the specified folder.

  get-folder-request - `com.amazonaws.services.workdocs.model.GetFolderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetFolderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetFolderRequest get-folder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFolderAsync get-folder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetFolderRequest get-folder-request]
    (-> this (.getFolderAsync get-folder-request))))

(defn create-notification-subscription-async
  "Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must
   confirm the subscription.


   For more information, see Subscribe to
   Notifications in the Amazon WorkDocs Developer Guide.

  create-notification-subscription-request - `com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNotificationSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest create-notification-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNotificationSubscriptionAsync create-notification-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest create-notification-subscription-request]
    (-> this (.createNotificationSubscriptionAsync create-notification-subscription-request))))

(defn delete-document-async
  "Permanently deletes the specified document and its associated metadata.

  delete-document-request - `com.amazonaws.services.workdocs.model.DeleteDocumentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteDocumentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteDocumentRequest delete-document-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentAsync delete-document-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteDocumentRequest delete-document-request]
    (-> this (.deleteDocumentAsync delete-document-request))))

(defn describe-activities-async
  "Describes the user activities in a specified time period.

  describe-activities-request - `com.amazonaws.services.workdocs.model.DescribeActivitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeActivitiesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeActivitiesRequest describe-activities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActivitiesAsync describe-activities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeActivitiesRequest describe-activities-request]
    (-> this (.describeActivitiesAsync describe-activities-request))))

(defn get-current-user-async
  "Retrieves details of the current user for whom the authentication token was generated. This is not a valid action
   for SigV4 (administrative API) clients.

  get-current-user-request - `com.amazonaws.services.workdocs.model.GetCurrentUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCurrentUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetCurrentUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetCurrentUserRequest get-current-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCurrentUserAsync get-current-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetCurrentUserRequest get-current-user-request]
    (-> this (.getCurrentUserAsync get-current-user-request))))

(defn get-resources-async
  "Retrieves a collection of resources, including folders and documents. The only CollectionType
   supported is SHARED_WITH_ME.

  get-resources-request - `com.amazonaws.services.workdocs.model.GetResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetResourcesRequest get-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcesAsync get-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetResourcesRequest get-resources-request]
    (-> this (.getResourcesAsync get-resources-request))))

(defn delete-notification-subscription-async
  "Deletes the specified subscription from the specified organization.

  delete-notification-subscription-request - `com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotificationSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest delete-notification-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotificationSubscriptionAsync delete-notification-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest delete-notification-subscription-request]
    (-> this (.deleteNotificationSubscriptionAsync delete-notification-subscription-request))))

(defn create-folder-async
  "Creates a folder with the specified name and parent folder.

  create-folder-request - `com.amazonaws.services.workdocs.model.CreateFolderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateFolderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateFolderRequest create-folder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFolderAsync create-folder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateFolderRequest create-folder-request]
    (-> this (.createFolderAsync create-folder-request))))

(defn delete-user-async
  "Deletes the specified user from a Simple AD or Microsoft AD directory.

  delete-user-request - `com.amazonaws.services.workdocs.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn initiate-document-version-upload-async
  "Creates a new document object and version object.


   The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when
   creating a new version of an existing document. This is the first step to upload a document. Next, upload the
   document to the URL returned from the call, and then call UpdateDocumentVersion.


   To cancel the document upload, call AbortDocumentVersionUpload.

  initiate-document-version-upload-request - `com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateDocumentVersionUpload operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest initiate-document-version-upload-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateDocumentVersionUploadAsync initiate-document-version-upload-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest initiate-document-version-upload-request]
    (-> this (.initiateDocumentVersionUploadAsync initiate-document-version-upload-request))))

(defn update-document-async
  "Updates the specified attributes of a document. The user must have access to both the document and its parent
   folder, if applicable.

  update-document-request - `com.amazonaws.services.workdocs.model.UpdateDocumentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.UpdateDocumentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.UpdateDocumentRequest update-document-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentAsync update-document-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.UpdateDocumentRequest update-document-request]
    (-> this (.updateDocumentAsync update-document-request))))

(defn deactivate-user-async
  "Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.

  deactivate-user-request - `com.amazonaws.services.workdocs.model.DeactivateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeactivateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeactivateUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeactivateUserRequest deactivate-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deactivateUserAsync deactivate-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeactivateUserRequest deactivate-user-request]
    (-> this (.deactivateUserAsync deactivate-user-request))))

(defn create-labels-async
  "Adds the specified list of labels to the given resource (a document or folder)

  create-labels-request - `com.amazonaws.services.workdocs.model.CreateLabelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLabels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateLabelsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateLabelsRequest create-labels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLabelsAsync create-labels-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateLabelsRequest create-labels-request]
    (-> this (.createLabelsAsync create-labels-request))))

(defn delete-folder-contents-async
  "Deletes the contents of the specified folder.

  delete-folder-contents-request - `com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFolderContents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteFolderContentsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest delete-folder-contents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFolderContentsAsync delete-folder-contents-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest delete-folder-contents-request]
    (-> this (.deleteFolderContentsAsync delete-folder-contents-request))))

(defn describe-document-versions-async
  "Retrieves the document versions for the specified document.


   By default, only active versions are returned.

  describe-document-versions-request - `com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocumentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest describe-document-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentVersionsAsync describe-document-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest describe-document-versions-request]
    (-> this (.describeDocumentVersionsAsync describe-document-versions-request))))

(defn create-comment-async
  "Adds a new comment to the specified document version.

  create-comment-request - `com.amazonaws.services.workdocs.model.CreateCommentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateCommentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateCommentRequest create-comment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCommentAsync create-comment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateCommentRequest create-comment-request]
    (-> this (.createCommentAsync create-comment-request))))

(defn get-document-path-async
  "Retrieves the path information (the hierarchy from the root folder) for the requested document.


   By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes
   the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
   names of the parent folders.

  get-document-path-request - `com.amazonaws.services.workdocs.model.GetDocumentPathRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentPath operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetDocumentPathResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetDocumentPathRequest get-document-path-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentPathAsync get-document-path-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetDocumentPathRequest get-document-path-request]
    (-> this (.getDocumentPathAsync get-document-path-request))))

(defn delete-custom-metadata-async
  "Deletes custom metadata from the specified resource.

  delete-custom-metadata-request - `com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest delete-custom-metadata-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomMetadataAsync delete-custom-metadata-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest delete-custom-metadata-request]
    (-> this (.deleteCustomMetadataAsync delete-custom-metadata-request))))

(defn describe-root-folders-async
  "Describes the current user's special folders; the RootFolder and the RecycleBin.
   RootFolder is the root of user's files and folders and RecycleBin is the root of
   recycled items. This is not a valid action for SigV4 (administrative API) clients.


   This action requires an authentication token. To get an authentication token, register an application with Amazon
   WorkDocs. For more information, see Authentication and Access
   Control for User Applications in the Amazon WorkDocs Developer Guide.

  describe-root-folders-request - `com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRootFolders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeRootFoldersResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest describe-root-folders-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRootFoldersAsync describe-root-folders-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest describe-root-folders-request]
    (-> this (.describeRootFoldersAsync describe-root-folders-request))))

(defn create-user-async
  "Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is \"ACTIVE\". New
   users can access Amazon WorkDocs.

  create-user-request - `com.amazonaws.services.workdocs.model.CreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateUserRequest create-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync create-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateUserRequest create-user-request]
    (-> this (.createUserAsync create-user-request))))

(defn get-document-version-async
  "Retrieves version metadata for the specified document.

  get-document-version-request - `com.amazonaws.services.workdocs.model.GetDocumentVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetDocumentVersionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetDocumentVersionRequest get-document-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentVersionAsync get-document-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetDocumentVersionRequest get-document-version-request]
    (-> this (.getDocumentVersionAsync get-document-version-request))))

(defn add-resource-permissions-async
  "Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if
   the principals already have different permissions.

  add-resource-permissions-request - `com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddResourcePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.AddResourcePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest add-resource-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addResourcePermissionsAsync add-resource-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest add-resource-permissions-request]
    (-> this (.addResourcePermissionsAsync add-resource-permissions-request))))

(defn describe-groups-async
  "Describes the groups specified by the query. Groups are defined by the underlying Active Directory.

  describe-groups-request - `com.amazonaws.services.workdocs.model.DescribeGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeGroupsRequest describe-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGroupsAsync describe-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeGroupsRequest describe-groups-request]
    (-> this (.describeGroupsAsync describe-groups-request))))

(defn update-folder-async
  "Updates the specified attributes of the specified folder. The user must have access to both the folder and its
   parent folder, if applicable.

  update-folder-request - `com.amazonaws.services.workdocs.model.UpdateFolderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.UpdateFolderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.UpdateFolderRequest update-folder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFolderAsync update-folder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.UpdateFolderRequest update-folder-request]
    (-> this (.updateFolderAsync update-folder-request))))

(defn get-folder-path-async
  "Retrieves the path information (the hierarchy from the root folder) for the specified folder.


   By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes
   the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
   parent folder names.

  get-folder-path-request - `com.amazonaws.services.workdocs.model.GetFolderPathRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFolderPath operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetFolderPathResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetFolderPathRequest get-folder-path-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFolderPathAsync get-folder-path-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetFolderPathRequest get-folder-path-request]
    (-> this (.getFolderPathAsync get-folder-path-request))))

(defn remove-all-resource-permissions-async
  "Removes all the permissions from the specified resource.

  remove-all-resource-permissions-request - `com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAllResourcePermissions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest remove-all-resource-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAllResourcePermissionsAsync remove-all-resource-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest remove-all-resource-permissions-request]
    (-> this (.removeAllResourcePermissionsAsync remove-all-resource-permissions-request))))

(defn update-document-version-async
  "Changes the status of the document version to ACTIVE.


   Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the
   client uploads the document to an S3-presigned URL returned by InitiateDocumentVersionUpload.

  update-document-version-request - `com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocumentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest update-document-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentVersionAsync update-document-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest update-document-version-request]
    (-> this (.updateDocumentVersionAsync update-document-version-request))))

(defn delete-comment-async
  "Deletes the specified comment from the document version.

  delete-comment-request - `com.amazonaws.services.workdocs.model.DeleteCommentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteCommentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteCommentRequest delete-comment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCommentAsync delete-comment-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteCommentRequest delete-comment-request]
    (-> this (.deleteCommentAsync delete-comment-request))))

(defn delete-folder-async
  "Permanently deletes the specified folder and its contents.

  delete-folder-request - `com.amazonaws.services.workdocs.model.DeleteFolderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteFolderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteFolderRequest delete-folder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFolderAsync delete-folder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DeleteFolderRequest delete-folder-request]
    (-> this (.deleteFolderAsync delete-folder-request))))

(defn describe-comments-async
  "List all the comments for the specified document version.

  describe-comments-request - `com.amazonaws.services.workdocs.model.DescribeCommentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeCommentsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeCommentsRequest describe-comments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCommentsAsync describe-comments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeCommentsRequest describe-comments-request]
    (-> this (.describeCommentsAsync describe-comments-request))))

(defn create-custom-metadata-async
  "Adds one or more custom properties to the specified resource (a folder, document, or version).

  create-custom-metadata-request - `com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateCustomMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest create-custom-metadata-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomMetadataAsync create-custom-metadata-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest create-custom-metadata-request]
    (-> this (.createCustomMetadataAsync create-custom-metadata-request))))

(defn update-user-async
  "Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the
   Amazon WorkDocs site.

  update-user-request - `com.amazonaws.services.workdocs.model.UpdateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.UpdateUserRequest update-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync update-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.UpdateUserRequest update-user-request]
    (-> this (.updateUserAsync update-user-request))))

(defn remove-resource-permission-async
  "Removes the permission for the specified principal from the specified resource.

  remove-resource-permission-request - `com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveResourcePermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest remove-resource-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeResourcePermissionAsync remove-resource-permission-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest remove-resource-permission-request]
    (-> this (.removeResourcePermissionAsync remove-resource-permission-request))))

(defn get-document-async
  "Retrieves details of a document.

  get-document-request - `com.amazonaws.services.workdocs.model.GetDocumentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetDocumentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetDocumentRequest get-document-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentAsync get-document-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.GetDocumentRequest get-document-request]
    (-> this (.getDocumentAsync get-document-request))))

(defn describe-users-async
  "Describes the specified users. You can describe all users or filter the results (for example, by status or
   organization).


   By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response
   includes a marker that you can use to request the next set of results.

  describe-users-request - `com.amazonaws.services.workdocs.model.DescribeUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeUsersResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeUsersRequest describe-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUsersAsync describe-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeUsersRequest describe-users-request]
    (-> this (.describeUsersAsync describe-users-request))))

(defn describe-folder-contents-async
  "Describes the contents of the specified folder, including its documents and subfolders.


   By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more
   results, the response includes a marker that you can use to request the next set of results. You can also request
   initialized documents.

  describe-folder-contents-request - `com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFolderContents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeFolderContentsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest describe-folder-contents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFolderContentsAsync describe-folder-contents-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsync this ^com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest describe-folder-contents-request]
    (-> this (.describeFolderContentsAsync describe-folder-contents-request))))

