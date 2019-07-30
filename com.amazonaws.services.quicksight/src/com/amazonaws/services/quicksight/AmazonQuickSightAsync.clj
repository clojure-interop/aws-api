(ns com.amazonaws.services.quicksight.AmazonQuickSightAsync
  "Interface for accessing Amazon QuickSight asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonQuickSightAsync instead.


  Amazon QuickSight API Reference

  Amazon QuickSight is a fully managed, serverless, cloud business intelligence service that makes it easy to extend
  data and insights to every user in your organization. This API interface reference contains documentation for a
  programming interface that you can use to manage Amazon QuickSight."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.quicksight AmazonQuickSightAsync]))

(defn create-group-async
  "Creates an Amazon QuickSight group.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<relevant-aws-account-id>:group/default/<group-name>
   .


   The response is a group object.


   CLI Sample:


   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name=\"Sales-Management\" --description=\"Sales Management - Forecasting\"

  create-group-request - The request object for this operation. - `com.amazonaws.services.quicksight.model.CreateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.CreateGroupRequest create-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync create-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.CreateGroupRequest create-group-request]
    (-> this (.createGroupAsync create-group-request))))

(defn delete-user-async
  "Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management
   (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name>  .


   CLI Sample:


   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat

  delete-user-request - `com.amazonaws.services.quicksight.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn describe-group-async
  "Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).


   The permissions resource is
   arn:aws:quicksight:us-east-1:<relevant-aws-account-id>:group/default/<group-name>
   .


   The response is the group object.


   CLI Sample:


   aws quicksight describe-group -\\-aws-account-id=11112222333 -\\-namespace=default -\\-group-name=Sales

  describe-group-request - `com.amazonaws.services.quicksight.model.DescribeGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DescribeGroupResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DescribeGroupRequest describe-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGroupAsync describe-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DescribeGroupRequest describe-group-request]
    (-> this (.describeGroupAsync describe-group-request))))

(defn list-user-groups-async
  "Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name> .


   The response is a one or more group objects.


   CLI Sample:


   aws quicksight list-user-groups -\\-user-name=Pat -\\-aws-account-id=111122223333 -\\-namespace=default -\\-region=us-east-1

  list-user-groups-request - `com.amazonaws.services.quicksight.model.ListUserGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.ListUserGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.ListUserGroupsRequest list-user-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserGroupsAsync list-user-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.ListUserGroupsRequest list-user-groups-request]
    (-> this (.listUserGroupsAsync list-user-groups-request))))

(defn delete-user-by-principal-id-async
  "Deletes a user identified by its principal ID.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name>  .


   CLI Sample:


   aws quicksight delete-user-by-principal-id --aws-account-id=111122223333 --namespace=default --principal-id=ABCDEFJA26JLI7EUUOEHS

  delete-user-by-principal-id-request - `com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserByPrincipalId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest delete-user-by-principal-id-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserByPrincipalIdAsync delete-user-by-principal-id-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DeleteUserByPrincipalIdRequest delete-user-by-principal-id-request]
    (-> this (.deleteUserByPrincipalIdAsync delete-user-by-principal-id-request))))

(defn update-group-async
  "Changes a group description.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   The response is a group object.


   CLI Sample:


   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description=\"Sales BI Dashboards\"

  update-group-request - `com.amazonaws.services.quicksight.model.UpdateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.UpdateGroupRequest update-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync update-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.UpdateGroupRequest update-group-request]
    (-> this (.updateGroupAsync update-group-request))))

(defn get-dashboard-embed-url-async
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

  get-dashboard-embed-url-request - `com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDashboardEmbedUrl operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest get-dashboard-embed-url-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDashboardEmbedUrlAsync get-dashboard-embed-url-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.GetDashboardEmbedUrlRequest get-dashboard-embed-url-request]
    (-> this (.getDashboardEmbedUrlAsync get-dashboard-embed-url-request))))

(defn describe-user-async
  "Returns information about a user, given the user name.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name> .


   The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access
   Management (IAM) role, and email address.


   CLI Sample:


   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat

  describe-user-request - `com.amazonaws.services.quicksight.model.DescribeUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DescribeUserRequest describe-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync describe-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DescribeUserRequest describe-user-request]
    (-> this (.describeUserAsync describe-user-request))))

(defn list-group-memberships-async
  "Lists member users in a group.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   The response is a list of group member objects.


   CLI Sample:


   aws quicksight list-group-memberships -\\-aws-account-id=111122223333 -\\-namespace=default

  list-group-memberships-request - `com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupMemberships operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.ListGroupMembershipsResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest list-group-memberships-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupMembershipsAsync list-group-memberships-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.ListGroupMembershipsRequest list-group-memberships-request]
    (-> this (.listGroupMembershipsAsync list-group-memberships-request))))

(defn create-group-membership-async
  "Adds an Amazon QuickSight user to an Amazon QuickSight group.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   The condition resource is the user name.


   The condition key is quicksight:UserName.


   The response is the group member object.


   CLI Sample:


   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat

  create-group-membership-request - `com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroupMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.CreateGroupMembershipResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest create-group-membership-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupMembershipAsync create-group-membership-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.CreateGroupMembershipRequest create-group-membership-request]
    (-> this (.createGroupMembershipAsync create-group-membership-request))))

(defn register-user-async
  "Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM)
   identity or role specified in the request.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name> .


   The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.


   The condition keys are quicksight:IamArn and quicksight:SessionName.


   CLI Sample:


   aws quicksight register-user -\\-aws-account-id=111122223333 -\\-namespace=default -\\-email=pat@example.com -\\-identity-type=IAM -\\-user-role=AUTHOR -\\-iam-arn=arn:aws:iam::111122223333:user/Pat

  register-user-request - `com.amazonaws.services.quicksight.model.RegisterUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.RegisterUserResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.RegisterUserRequest register-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerUserAsync register-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.RegisterUserRequest register-user-request]
    (-> this (.registerUserAsync register-user-request))))

(defn delete-group-membership-async
  "Removes a user from a group so that the user is no longer a member of the group.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   The condition resource is the user name.


   The condition key is quicksight:UserName.


   CLI Sample:


   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie

  delete-group-membership-request - `com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroupMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DeleteGroupMembershipResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest delete-group-membership-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupMembershipAsync delete-group-membership-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DeleteGroupMembershipRequest delete-group-membership-request]
    (-> this (.deleteGroupMembershipAsync delete-group-membership-request))))

(defn list-users-async
  "Returns a list of all of the Amazon QuickSight users belonging to this account.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/* .


   The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and
   Access Management (IAM) role, and email address.


   CLI Sample:


   aws quicksight list-users --aws-account-id=111122223333 --namespace=default

  list-users-request - `com.amazonaws.services.quicksight.model.ListUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.ListUsersRequest list-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync list-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.ListUsersRequest list-users-request]
    (-> this (.listUsersAsync list-users-request))))

(defn list-groups-async
  "Lists all user groups in Amazon QuickSight.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/*.


   The response is a list of group objects.


   CLI Sample:


   aws quicksight list-groups -\\-aws-account-id=111122223333 -\\-namespace=default

  list-groups-request - `com.amazonaws.services.quicksight.model.ListGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.ListGroupsRequest list-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync list-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.ListGroupsRequest list-groups-request]
    (-> this (.listGroupsAsync list-groups-request))))

(defn delete-group-async
  "Removes a user group from Amazon QuickSight.


   The permissions resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:group/default/<group-name> .


   CLI Sample:


   aws quicksight delete-group -\\-aws-account-id=111122223333 -\\-namespace=default -\\-group-name=Sales-Management

  delete-group-request - `com.amazonaws.services.quicksight.model.DeleteGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DeleteGroupRequest delete-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync delete-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroupAsync delete-group-request))))

(defn update-user-async
  "Updates an Amazon QuickSight user.


   The permission resource is
   arn:aws:quicksight:us-east-1:<aws-account-id>:user/default/<user-name> .


   The response is a user object that contains the user's Amazon QuickSight user name, email address, active or
   inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).


   CLI Sample:


   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1

  update-user-request - `com.amazonaws.services.quicksight.model.UpdateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.quicksight.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.UpdateUserRequest update-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync update-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonQuickSightAsync this ^com.amazonaws.services.quicksight.model.UpdateUserRequest update-user-request]
    (-> this (.updateUserAsync update-user-request))))

