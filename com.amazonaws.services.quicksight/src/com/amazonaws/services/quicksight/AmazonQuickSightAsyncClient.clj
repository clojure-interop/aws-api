(ns com.amazonaws.services.quicksight.AmazonQuickSightAsyncClient
  "Client for accessing Amazon QuickSight asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon QuickSight API Reference

  Amazon QuickSight is a fully managed, serverless, cloud business intelligence service that makes it easy to extend
  data and insights to every user in your organization. This API interface reference contains documentation for a
  programming interface that you can use to manage Amazon QuickSight."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.quicksight AmazonQuickSightAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.quicksight.AmazonQuickSightAsyncClientBuilder`"
  (^com.amazonaws.services.quicksight.AmazonQuickSightAsyncClientBuilder []
    (AmazonQuickSightAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonQuickSightAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-group-async
  "Description copied from interface: AmazonQuickSightAsync

  request - The request object for this operation. - `com.amazonaws.services.quicksight.model.CreateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.CreateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.CreateGroupRequest request]
    (-> this (.createGroupAsync request))))

(defn delete-user-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.DeleteUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn describe-group-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.DescribeGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DescribeGroupResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DescribeGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DescribeGroupRequest request]
    (-> this (.describeGroupAsync request))))

(defn list-user-groups-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.ListUserGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.ListUserGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.ListUserGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.ListUserGroupsRequest request]
    (-> this (.listUserGroupsAsync request))))

(defn delete-user-by-principal-id-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserByPrincipalId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserByPrincipalIdAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest request]
    (-> this (.deleteUserByPrincipalIdAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonQuickSightAsyncClient this]
    (-> this (.shutdown))))

(defn update-group-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.UpdateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.UpdateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.UpdateGroupRequest request]
    (-> this (.updateGroupAsync request))))

(defn get-dashboard-embed-url-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDashboardEmbedUrl operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDashboardEmbedUrlAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest request]
    (-> this (.getDashboardEmbedUrlAsync request))))

(defn describe-user-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.DescribeUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DescribeUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DescribeUserRequest request]
    (-> this (.describeUserAsync request))))

(defn list-group-memberships-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupMemberships operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.ListGroupMembershipsResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupMembershipsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest request]
    (-> this (.listGroupMembershipsAsync request))))

(defn create-group-membership-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroupMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.CreateGroupMembershipResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupMembershipAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest request]
    (-> this (.createGroupMembershipAsync request))))

(defn register-user-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.RegisterUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.RegisterUserResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.RegisterUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.RegisterUserRequest request]
    (-> this (.registerUserAsync request))))

(defn delete-group-membership-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroupMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DeleteGroupMembershipResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupMembershipAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest request]
    (-> this (.deleteGroupMembershipAsync request))))

(defn list-users-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.ListUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.ListUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.ListUsersRequest request]
    (-> this (.listUsersAsync request))))

(defn list-groups-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.ListGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.ListGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.ListGroupsRequest request]
    (-> this (.listGroupsAsync request))))

(defn delete-group-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.DeleteGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DeleteGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.DeleteGroupRequest request]
    (-> this (.deleteGroupAsync request))))

(defn update-user-async
  "Description copied from interface: AmazonQuickSightAsync

  request - `com.amazonaws.services.quicksight.model.UpdateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.UpdateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsyncClient this ^com.amazonaws.services.quicksight.model.UpdateUserRequest request]
    (-> this (.updateUserAsync request))))

