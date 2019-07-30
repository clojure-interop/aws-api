(ns com.amazonaws.services.workdocs.AmazonWorkDocsAsyncClient
  "Client for accessing Amazon WorkDocs asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


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
  (:import [com.amazonaws.services.workdocs AmazonWorkDocsAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.workdocs.AmazonWorkDocsAsyncClientBuilder`"
  (^com.amazonaws.services.workdocs.AmazonWorkDocsAsyncClientBuilder []
    (AmazonWorkDocsAsyncClient/asyncBuilder )))

(defn abort-document-version-upload-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AbortDocumentVersionUpload operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.abortDocumentVersionUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.AbortDocumentVersionUploadRequest request]
    (-> this (.abortDocumentVersionUploadAsync request))))

(defn activate-user-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.ActivateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ActivateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.ActivateUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.ActivateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.activateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.ActivateUserRequest request]
    (-> this (.activateUserAsync request))))

(defn describe-resource-permissions-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResourcePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeResourcePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourcePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeResourcePermissionsRequest request]
    (-> this (.describeResourcePermissionsAsync request))))

(defn delete-labels-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DeleteLabelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLabels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteLabelsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteLabelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLabelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteLabelsRequest request]
    (-> this (.deleteLabelsAsync request))))

(defn describe-notification-subscriptions-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotificationSubscriptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotificationSubscriptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeNotificationSubscriptionsRequest request]
    (-> this (.describeNotificationSubscriptionsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonWorkDocsAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-folder-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.GetFolderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetFolderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetFolderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFolderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetFolderRequest request]
    (-> this (.getFolderAsync request))))

(defn create-notification-subscription-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNotificationSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNotificationSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateNotificationSubscriptionRequest request]
    (-> this (.createNotificationSubscriptionAsync request))))

(defn delete-document-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DeleteDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteDocumentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteDocumentRequest request]
    (-> this (.deleteDocumentAsync request))))

(defn describe-activities-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DescribeActivitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActivities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeActivitiesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeActivitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActivitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeActivitiesRequest request]
    (-> this (.describeActivitiesAsync request))))

(defn get-current-user-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.GetCurrentUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCurrentUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetCurrentUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetCurrentUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCurrentUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetCurrentUserRequest request]
    (-> this (.getCurrentUserAsync request))))

(defn get-resources-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.GetResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetResourcesRequest request]
    (-> this (.getResourcesAsync request))))

(defn delete-notification-subscription-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotificationSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotificationSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteNotificationSubscriptionRequest request]
    (-> this (.deleteNotificationSubscriptionAsync request))))

(defn create-folder-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.CreateFolderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateFolderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateFolderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFolderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateFolderRequest request]
    (-> this (.createFolderAsync request))))

(defn delete-user-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DeleteUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn initiate-document-version-upload-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateDocumentVersionUpload operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateDocumentVersionUploadAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest request]
    (-> this (.initiateDocumentVersionUploadAsync request))))

(defn update-document-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.UpdateDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.UpdateDocumentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.UpdateDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.UpdateDocumentRequest request]
    (-> this (.updateDocumentAsync request))))

(defn deactivate-user-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DeactivateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeactivateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeactivateUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeactivateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deactivateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeactivateUserRequest request]
    (-> this (.deactivateUserAsync request))))

(defn create-labels-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.CreateLabelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLabels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateLabelsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateLabelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLabelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateLabelsRequest request]
    (-> this (.createLabelsAsync request))))

(defn delete-folder-contents-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFolderContents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteFolderContentsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFolderContentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteFolderContentsRequest request]
    (-> this (.deleteFolderContentsAsync request))))

(defn describe-document-versions-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDocumentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeDocumentVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDocumentVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeDocumentVersionsRequest request]
    (-> this (.describeDocumentVersionsAsync request))))

(defn create-comment-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.CreateCommentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateCommentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateCommentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCommentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateCommentRequest request]
    (-> this (.createCommentAsync request))))

(defn get-document-path-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.GetDocumentPathRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentPath operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetDocumentPathResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetDocumentPathRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentPathAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetDocumentPathRequest request]
    (-> this (.getDocumentPathAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonWorkDocsAsyncClient this]
    (-> this (.shutdown))))

(defn delete-custom-metadata-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteCustomMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomMetadataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteCustomMetadataRequest request]
    (-> this (.deleteCustomMetadataAsync request))))

(defn describe-root-folders-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRootFolders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeRootFoldersResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRootFoldersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeRootFoldersRequest request]
    (-> this (.describeRootFoldersAsync request))))

(defn create-user-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.CreateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateUserRequest request]
    (-> this (.createUserAsync request))))

(defn get-document-version-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.GetDocumentVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocumentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetDocumentVersionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetDocumentVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetDocumentVersionRequest request]
    (-> this (.getDocumentVersionAsync request))))

(defn add-resource-permissions-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddResourcePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.AddResourcePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addResourcePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.AddResourcePermissionsRequest request]
    (-> this (.addResourcePermissionsAsync request))))

(defn describe-groups-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DescribeGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeGroupsRequest request]
    (-> this (.describeGroupsAsync request))))

(defn update-folder-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.UpdateFolderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.UpdateFolderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.UpdateFolderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFolderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.UpdateFolderRequest request]
    (-> this (.updateFolderAsync request))))

(defn get-folder-path-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.GetFolderPathRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFolderPath operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetFolderPathResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetFolderPathRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFolderPathAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetFolderPathRequest request]
    (-> this (.getFolderPathAsync request))))

(defn remove-all-resource-permissions-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAllResourcePermissions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAllResourcePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.RemoveAllResourcePermissionsRequest request]
    (-> this (.removeAllResourcePermissionsAsync request))))

(defn update-document-version-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDocumentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDocumentVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest request]
    (-> this (.updateDocumentVersionAsync request))))

(defn delete-comment-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DeleteCommentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteComment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteCommentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteCommentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCommentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteCommentRequest request]
    (-> this (.deleteCommentAsync request))))

(defn delete-folder-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DeleteFolderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFolder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DeleteFolderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteFolderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFolderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DeleteFolderRequest request]
    (-> this (.deleteFolderAsync request))))

(defn describe-comments-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DescribeCommentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeCommentsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeCommentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCommentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeCommentsRequest request]
    (-> this (.describeCommentsAsync request))))

(defn create-custom-metadata-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.CreateCustomMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomMetadataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.CreateCustomMetadataRequest request]
    (-> this (.createCustomMetadataAsync request))))

(defn update-user-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.UpdateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.UpdateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.UpdateUserRequest request]
    (-> this (.updateUserAsync request))))

(defn remove-resource-permission-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveResourcePermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.RemoveResourcePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeResourcePermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.RemoveResourcePermissionRequest request]
    (-> this (.removeResourcePermissionAsync request))))

(defn get-document-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.GetDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.GetDocumentResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.GetDocumentRequest request]
    (-> this (.getDocumentAsync request))))

(defn describe-users-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DescribeUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeUsersResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeUsersRequest request]
    (-> this (.describeUsersAsync request))))

(defn describe-folder-contents-async
  "Description copied from interface: AmazonWorkDocsAsync

  request - `com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFolderContents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workdocs.model.DescribeFolderContentsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFolderContentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkDocsAsyncClient this ^com.amazonaws.services.workdocs.model.DescribeFolderContentsRequest request]
    (-> this (.describeFolderContentsAsync request))))

