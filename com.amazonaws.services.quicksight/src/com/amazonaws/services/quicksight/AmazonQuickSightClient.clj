(ns com.amazonaws.services.quicksight.AmazonQuickSightClient
  "Client for accessing Amazon QuickSight. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon QuickSight API Reference

  Amazon QuickSight is a fully managed, serverless, cloud business intelligence service that makes it easy to extend
  data and insights to every user in your organization. This API interface reference contains documentation for a
  programming interface that you can use to manage Amazon QuickSight."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.quicksight AmazonQuickSightClient]))

(defn *builder
  "returns: `com.amazonaws.services.quicksight.AmazonQuickSightClientBuilder`"
  (^com.amazonaws.services.quicksight.AmazonQuickSightClientBuilder []
    (AmazonQuickSightClient/builder )))

(defn delete-group
  "Removes a user group from Amazon QuickSight.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   CLI Sample:


   aws quicksight delete-group -\\-aws-account-id=111122223333 -\\-namespace=default -\\-group-name=Sales-Management

  request - `com.amazonaws.services.quicksight.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.quicksight.model.DeleteGroupResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.DeleteGroupResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn update-group
  "Changes a group description.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   The response is a group object.


   CLI Sample:


   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description=\"Sales BI Dashboards\"

  request - `com.amazonaws.services.quicksight.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.quicksight.model.UpdateGroupResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.UpdateGroupResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn create-group-membership
  "Adds an Amazon QuickSight user to an Amazon QuickSight group.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   The condition resource is the user name.


   The condition key is quicksight:UserName.


   The response is the group member object.


   CLI Sample:


   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat

  request - `com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest`

  returns: Result of the CreateGroupMembership operation returned by the service. - `com.amazonaws.services.quicksight.model.CreateGroupMembershipResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.CreateGroupMembershipResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest request]
    (-> this (.createGroupMembership request))))

(defn create-group
  "Creates an Amazon QuickSight group.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<relevant-aws-account-id>:group/default/<group-name>
   .


   The response is a group object.


   CLI Sample:


   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name=\"Sales-Management\" --description=\"Sales Management - Forecasting\"

  request - `com.amazonaws.services.quicksight.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.quicksight.model.CreateGroupResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.CreateGroupResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn update-user
  "Updates an Amazon QuickSight user.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name> .


   The response is a user object that contains the user's Amazon QuickSight user name, email address, active or
   inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).


   CLI Sample:


   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1

  request - `com.amazonaws.services.quicksight.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.quicksight.model.UpdateUserResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.UpdateUserResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn list-users
  "Returns a list of all of the Amazon QuickSight users belonging to this account.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/* .


   The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and
   Access Management (IAM) role, and email address.


   CLI Sample:


   aws quicksight list-users --aws-account-id=111122223333 --namespace=default

  request - `com.amazonaws.services.quicksight.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.quicksight.model.ListUsersResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.ListUsersResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn list-group-memberships
  "Lists member users in a group.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   The response is a list of group member objects.


   CLI Sample:


   aws quicksight list-group-memberships -\\-aws-account-id=111122223333 -\\-namespace=default

  request - `com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest`

  returns: Result of the ListGroupMemberships operation returned by the service. - `com.amazonaws.services.quicksight.model.ListGroupMembershipsResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.ListGroupMembershipsResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest request]
    (-> this (.listGroupMemberships request))))

(defn describe-group
  "Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).


   The permissions resource is
   arn:aws:quicksight:us-east-1:<relevant-aws-account-id>:group/default/<group-name>
   .


   The response is the group object.


   CLI Sample:


   aws quicksight describe-group -\\-aws-account-id=11112222333 -\\-namespace=default -\\-group-name=Sales

  request - `com.amazonaws.services.quicksight.model.DescribeGroupRequest`

  returns: Result of the DescribeGroup operation returned by the service. - `com.amazonaws.services.quicksight.model.DescribeGroupResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.DescribeGroupResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.DescribeGroupRequest request]
    (-> this (.describeGroup request))))

(defn delete-user
  "Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management
   (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name>  .


   CLI Sample:


   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat

  request - `com.amazonaws.services.quicksight.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.quicksight.model.DeleteUserResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.DeleteUserResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn delete-user-by-principal-id
  "Deletes a user identified by its principal ID.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name>  .


   CLI Sample:


   aws quicksight delete-user-by-principal-id --aws-account-id=111122223333 --namespace=default --principal-id=ABCDEFJA26JLI7EUUOEHS

  request - `com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest`

  returns: Result of the DeleteUserByPrincipalId operation returned by the service. - `com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest request]
    (-> this (.deleteUserByPrincipalId request))))

(defn delete-group-membership
  "Removes a user from a group so that the user is no longer a member of the group.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   The condition resource is the user name.


   The condition key is quicksight:UserName.


   CLI Sample:


   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie

  request - `com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest`

  returns: Result of the DeleteGroupMembership operation returned by the service. - `com.amazonaws.services.quicksight.model.DeleteGroupMembershipResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.DeleteGroupMembershipResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest request]
    (-> this (.deleteGroupMembership request))))

(defn describe-user
  "Returns information about a user, given the user name.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name> .


   The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access
   Management (IAM) role, and email address.


   CLI Sample:


   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat

  request - `com.amazonaws.services.quicksight.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.quicksight.model.DescribeUserResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.DescribeUserResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.DescribeUserRequest request]
    (-> this (.describeUser request))))

(defn list-groups
  "Lists all user groups in Amazon QuickSight.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/*.


   The response is a list of group objects.


   CLI Sample:


   aws quicksight list-groups -\\-aws-account-id=111122223333 -\\-namespace=default

  request - `com.amazonaws.services.quicksight.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.quicksight.model.ListGroupsResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.ListGroupsResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonQuickSightClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-user-groups
  "Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name> .


   The response is a one or more group objects.


   CLI Sample:


   aws quicksight list-user-groups -\\-user-name=Pat -\\-aws-account-id=111122223333 -\\-namespace=default -\\-region=us-east-1

  request - `com.amazonaws.services.quicksight.model.ListUserGroupsRequest`

  returns: Result of the ListUserGroups operation returned by the service. - `com.amazonaws.services.quicksight.model.ListUserGroupsResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.ListUserGroupsResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.ListUserGroupsRequest request]
    (-> this (.listUserGroups request))))

(defn get-dashboard-embed-url
  "Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to
   configure the dashboards and user permissions. For more information, see  Embedding Amazon QuickSight
   Dashboards.


   Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.


   CLI Sample:


   Assume the role with permissions enabled for actions: quickSight:RegisterUser and
   quicksight:GetDashboardEmbedURL. You can use assume-role, assume-role-with-web-identity, or
   assume-role-with-saml.


   aws sts assume-role --role-arn \"arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role\" --role-session-name embeddingsession


   If the user does not exist in QuickSight, register the user:


   aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn \"arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role\" --user-role READER --session-name \"embeddingsession\" --email user123@example.com --region us-east-1


   Get the URL for the embedded dashboard


   aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM

  request - `com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest`

  returns: Result of the GetDashboardEmbedUrl operation returned by the service. - `com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlResult`

  throws: com.amazonaws.services.quicksight.model.SessionLifetimeInMinutesInvalidException - The number of minutes specified for the lifetime of a session is not valid. The session lifetime must be from 15 to 600 minutes."
  (^com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest request]
    (-> this (.getDashboardEmbedUrl request))))

(defn register-user
  "Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM)
   identity or role specified in the request.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name> .


   The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.


   The condition keys are quicksight:IamArn and quicksight:SessionName.


   CLI Sample:


   aws quicksight register-user -\\-aws-account-id=111122223333 -\\-namespace=default -\\-email=pat@example.com -\\-identity-type=IAM -\\-user-role=AUTHOR -\\-iam-arn=arn:aws:iam::111122223333:user/Pat

  request - `com.amazonaws.services.quicksight.model.RegisterUserRequest`

  returns: Result of the RegisterUser operation returned by the service. - `com.amazonaws.services.quicksight.model.RegisterUserResult`

  throws: com.amazonaws.services.quicksight.model.AccessDeniedException - You don't have access to this. The provided credentials couldn't be validated. You might not be authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight service, that your policies have the correct permissions, and that you are using the correct access keys."
  (^com.amazonaws.services.quicksight.model.RegisterUserResult [^AmazonQuickSightClient this ^com.amazonaws.services.quicksight.model.RegisterUserRequest request]
    (-> this (.registerUser request))))

