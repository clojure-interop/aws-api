(ns com.amazonaws.services.quicksight.AbstractAmazonQuickSight
  "Abstract implementation of AmazonQuickSight. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.quicksight AbstractAmazonQuickSight]))

(defn delete-group
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.quicksight.model.DeleteGroupResult`"
  (^com.amazonaws.services.quicksight.model.DeleteGroupResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn update-group
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.quicksight.model.UpdateGroupResult`"
  (^com.amazonaws.services.quicksight.model.UpdateGroupResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn create-group-membership
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest`

  returns: Result of the CreateGroupMembership operation returned by the service. - `com.amazonaws.services.quicksight.model.CreateGroupMembershipResult`"
  (^com.amazonaws.services.quicksight.model.CreateGroupMembershipResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest request]
    (-> this (.createGroupMembership request))))

(defn create-group
  "Description copied from interface: AmazonQuickSight

  request - The request object for this operation. - `com.amazonaws.services.quicksight.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.quicksight.model.CreateGroupResult`"
  (^com.amazonaws.services.quicksight.model.CreateGroupResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn update-user
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.quicksight.model.UpdateUserResult`"
  (^com.amazonaws.services.quicksight.model.UpdateUserResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn list-users
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.quicksight.model.ListUsersResult`"
  (^com.amazonaws.services.quicksight.model.ListUsersResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn list-group-memberships
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest`

  returns: Result of the ListGroupMemberships operation returned by the service. - `com.amazonaws.services.quicksight.model.ListGroupMembershipsResult`"
  (^com.amazonaws.services.quicksight.model.ListGroupMembershipsResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest request]
    (-> this (.listGroupMemberships request))))

(defn describe-group
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.DescribeGroupRequest`

  returns: Result of the DescribeGroup operation returned by the service. - `com.amazonaws.services.quicksight.model.DescribeGroupResult`"
  (^com.amazonaws.services.quicksight.model.DescribeGroupResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.DescribeGroupRequest request]
    (-> this (.describeGroup request))))

(defn delete-user
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.quicksight.model.DeleteUserResult`"
  (^com.amazonaws.services.quicksight.model.DeleteUserResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn shutdown
  "Description copied from interface: AmazonQuickSight"
  ([^AbstractAmazonQuickSight this]
    (-> this (.shutdown))))

(defn delete-user-by-principal-id
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest`

  returns: Result of the DeleteUserByPrincipalId operation returned by the service. - `com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdResult`"
  (^com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest request]
    (-> this (.deleteUserByPrincipalId request))))

(defn delete-group-membership
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest`

  returns: Result of the DeleteGroupMembership operation returned by the service. - `com.amazonaws.services.quicksight.model.DeleteGroupMembershipResult`"
  (^com.amazonaws.services.quicksight.model.DeleteGroupMembershipResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest request]
    (-> this (.deleteGroupMembership request))))

(defn describe-user
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.quicksight.model.DescribeUserResult`"
  (^com.amazonaws.services.quicksight.model.DescribeUserResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.DescribeUserRequest request]
    (-> this (.describeUser request))))

(defn list-groups
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.quicksight.model.ListGroupsResult`"
  (^com.amazonaws.services.quicksight.model.ListGroupsResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonQuickSight

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonQuickSight this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-user-groups
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.ListUserGroupsRequest`

  returns: Result of the ListUserGroups operation returned by the service. - `com.amazonaws.services.quicksight.model.ListUserGroupsResult`"
  (^com.amazonaws.services.quicksight.model.ListUserGroupsResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.ListUserGroupsRequest request]
    (-> this (.listUserGroups request))))

(defn get-dashboard-embed-url
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest`

  returns: Result of the GetDashboardEmbedUrl operation returned by the service. - `com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlResult`"
  (^com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest request]
    (-> this (.getDashboardEmbedUrl request))))

(defn register-user
  "Description copied from interface: AmazonQuickSight

  request - `com.amazonaws.services.quicksight.model.RegisterUserRequest`

  returns: Result of the RegisterUser operation returned by the service. - `com.amazonaws.services.quicksight.model.RegisterUserResult`"
  (^com.amazonaws.services.quicksight.model.RegisterUserResult [^AbstractAmazonQuickSight this ^com.amazonaws.services.quicksight.model.RegisterUserRequest request]
    (-> this (.registerUser request))))

