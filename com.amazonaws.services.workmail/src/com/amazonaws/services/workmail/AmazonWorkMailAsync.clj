(ns com.amazonaws.services.workmail.AmazonWorkMailAsync
  "Interface for accessing Amazon WorkMail asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonWorkMailAsync instead.



  Amazon WorkMail is a secure, managed business email and calendaring service with support for existing desktop and
  mobile email clients. You can access your email, contacts, and calendars using Microsoft Outlook, your browser, or
  other native iOS and Android email applications. You can integrate WorkMail with your existing corporate directory
  and control both the keys that encrypt your data and the location in which your data is stored.


  The WorkMail API is designed for the following scenarios:




  Listing and describing organizations






  Managing users






  Managing groups






  Managing resources




  All WorkMail API operations are Amazon-authenticated and certificate-signed. They not only require the use of the AWS
  SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help facilitate
  access, trust, and permission policies. By creating a role and allowing an IAM user to access the WorkMail site, the
  IAM user gains full administrative visibility into the entire WorkMail organization (or as set in the IAM policy).
  This includes, but is not limited to, the ability to create, update, and delete users, groups, and resources. This
  allows developers to perform the scenarios listed above, as well as give users the ability to grant access on a
  selective basis using the IAM model."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workmail AmazonWorkMailAsync]))

(defn list-aliases-async
  "Creates a paginated call to list the aliases associated with a given entity.

  list-aliases-request - `com.amazonaws.services.workmail.model.ListAliasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListAliasesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListAliasesRequest list-aliases-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAliasesAsync list-aliases-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListAliasesRequest list-aliases-request]
    (-> this (.listAliasesAsync list-aliases-request))))

(defn create-group-async
  "Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.

  create-group-request - `com.amazonaws.services.workmail.model.CreateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateGroupRequest create-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync create-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateGroupRequest create-group-request]
    (-> this (.createGroupAsync create-group-request))))

(defn associate-member-to-group-async
  "Adds a member (user or group) to the group's set.

  associate-member-to-group-request - `com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateMemberToGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.AssociateMemberToGroupResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest associate-member-to-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateMemberToGroupAsync associate-member-to-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest associate-member-to-group-request]
    (-> this (.associateMemberToGroupAsync associate-member-to-group-request))))

(defn create-alias-async
  "Adds an alias to the set of a given member (user or group) of Amazon WorkMail.

  create-alias-request - `com.amazonaws.services.workmail.model.CreateAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.CreateAliasResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateAliasRequest create-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAliasAsync create-alias-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateAliasRequest create-alias-request]
    (-> this (.createAliasAsync create-alias-request))))

(defn deregister-from-work-mail-async
  "Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and
   schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The
   functionality in the console is Disable.

  deregister-from-work-mail-request - `com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterFromWorkMail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest deregister-from-work-mail-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterFromWorkMailAsync deregister-from-work-mail-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest deregister-from-work-mail-request]
    (-> this (.deregisterFromWorkMailAsync deregister-from-work-mail-request))))

(defn delete-user-async
  "Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must
   be DISABLED. Use the DescribeUser action to confirm the user state.


   Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are
   permanently removed.

  delete-user-request - `com.amazonaws.services.workmail.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn list-resource-delegates-async
  "Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on
   behalf of the resource.

  list-resource-delegates-request - `com.amazonaws.services.workmail.model.ListResourceDelegatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceDelegates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListResourceDelegatesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListResourceDelegatesRequest list-resource-delegates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceDelegatesAsync list-resource-delegates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListResourceDelegatesRequest list-resource-delegates-request]
    (-> this (.listResourceDelegatesAsync list-resource-delegates-request))))

(defn describe-group-async
  "Returns the data available for the group.

  describe-group-request - `com.amazonaws.services.workmail.model.DescribeGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DescribeGroupResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeGroupRequest describe-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGroupAsync describe-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeGroupRequest describe-group-request]
    (-> this (.describeGroupAsync describe-group-request))))

(defn reset-password-async
  "Allows the administrator to reset the password for a user.

  reset-password-request - `com.amazonaws.services.workmail.model.ResetPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ResetPasswordResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ResetPasswordRequest reset-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetPasswordAsync reset-password-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ResetPasswordRequest reset-password-request]
    (-> this (.resetPasswordAsync reset-password-request))))

(defn associate-delegate-to-resource-async
  "Adds a member (user or group) to the resource's set of delegates.

  associate-delegate-to-resource-request - `com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDelegateToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest associate-delegate-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDelegateToResourceAsync associate-delegate-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest associate-delegate-to-resource-request]
    (-> this (.associateDelegateToResourceAsync associate-delegate-to-resource-request))))

(defn disassociate-delegate-from-resource-async
  "Removes a member from the resource's set of delegates.

  disassociate-delegate-from-resource-request - `com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDelegateFromResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest disassociate-delegate-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDelegateFromResourceAsync disassociate-delegate-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest disassociate-delegate-from-resource-request]
    (-> this (.disassociateDelegateFromResourceAsync disassociate-delegate-from-resource-request))))

(defn delete-resource-async
  "Deletes the specified resource.

  delete-resource-request - `com.amazonaws.services.workmail.model.DeleteResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteResourceResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteResourceRequest delete-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceAsync delete-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteResourceRequest delete-resource-request]
    (-> this (.deleteResourceAsync delete-resource-request))))

(defn disassociate-member-from-group-async
  "Removes a member from a group.

  disassociate-member-from-group-request - `com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateMemberFromGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest disassociate-member-from-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateMemberFromGroupAsync disassociate-member-from-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest disassociate-member-from-group-request]
    (-> this (.disassociateMemberFromGroupAsync disassociate-member-from-group-request))))

(defn update-mailbox-quota-async
  "Updates a user's current mailbox quota for a specified organization and user.

  update-mailbox-quota-request - `com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMailboxQuota operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.UpdateMailboxQuotaResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest update-mailbox-quota-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMailboxQuotaAsync update-mailbox-quota-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest update-mailbox-quota-request]
    (-> this (.updateMailboxQuotaAsync update-mailbox-quota-request))))

(defn create-user-async
  "Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.

  create-user-request - `com.amazonaws.services.workmail.model.CreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateUserRequest create-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync create-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateUserRequest create-user-request]
    (-> this (.createUserAsync create-user-request))))

(defn register-to-work-mail-async
  "Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and
   calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user,
   group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this
   operation is Enable.


   Users can either be created by calling the CreateUser API operation or they can be synchronized from your
   directory. For more information, see DeregisterFromWorkMail.

  register-to-work-mail-request - `com.amazonaws.services.workmail.model.RegisterToWorkMailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterToWorkMail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.RegisterToWorkMailResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.RegisterToWorkMailRequest register-to-work-mail-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerToWorkMailAsync register-to-work-mail-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.RegisterToWorkMailRequest register-to-work-mail-request]
    (-> this (.registerToWorkMailAsync register-to-work-mail-request))))

(defn list-organizations-async
  "Returns summaries of the customer's non-deleted organizations.

  list-organizations-request - `com.amazonaws.services.workmail.model.ListOrganizationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOrganizations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListOrganizationsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListOrganizationsRequest list-organizations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOrganizationsAsync list-organizations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListOrganizationsRequest list-organizations-request]
    (-> this (.listOrganizationsAsync list-organizations-request))))

(defn list-resources-async
  "Returns summaries of the organization's resources.

  list-resources-request - `com.amazonaws.services.workmail.model.ListResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListResourcesRequest list-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesAsync list-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListResourcesRequest list-resources-request]
    (-> this (.listResourcesAsync list-resources-request))))

(defn delete-alias-async
  "Remove one or more specified aliases from a set of aliases for a given user.

  delete-alias-request - `com.amazonaws.services.workmail.model.DeleteAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteAliasResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteAliasRequest delete-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAliasAsync delete-alias-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteAliasRequest delete-alias-request]
    (-> this (.deleteAliasAsync delete-alias-request))))

(defn get-mailbox-details-async
  "Requests a user's mailbox details for a specified organization and user.

  get-mailbox-details-request - `com.amazonaws.services.workmail.model.GetMailboxDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMailboxDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.GetMailboxDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.GetMailboxDetailsRequest get-mailbox-details-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMailboxDetailsAsync get-mailbox-details-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.GetMailboxDetailsRequest get-mailbox-details-request]
    (-> this (.getMailboxDetailsAsync get-mailbox-details-request))))

(defn put-mailbox-permissions-async
  "Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.

  put-mailbox-permissions-request - `com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMailboxPermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.PutMailboxPermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest put-mailbox-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMailboxPermissionsAsync put-mailbox-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest put-mailbox-permissions-request]
    (-> this (.putMailboxPermissionsAsync put-mailbox-permissions-request))))

(defn update-resource-async
  "Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource
   call. The dataset in the request should be the one expected when performing another DescribeResource
   call.

  update-resource-request - `com.amazonaws.services.workmail.model.UpdateResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.UpdateResourceResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdateResourceRequest update-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceAsync update-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdateResourceRequest update-resource-request]
    (-> this (.updateResourceAsync update-resource-request))))

(defn create-resource-async
  "Creates a new Amazon WorkMail resource.

  create-resource-request - `com.amazonaws.services.workmail.model.CreateResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.CreateResourceResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateResourceRequest create-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceAsync create-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateResourceRequest create-resource-request]
    (-> this (.createResourceAsync create-resource-request))))

(defn describe-resource-async
  "Returns the data available for the resource.

  describe-resource-request - `com.amazonaws.services.workmail.model.DescribeResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DescribeResourceResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeResourceRequest describe-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourceAsync describe-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeResourceRequest describe-resource-request]
    (-> this (.describeResourceAsync describe-resource-request))))

(defn describe-user-async
  "Provides information regarding the user.

  describe-user-request - `com.amazonaws.services.workmail.model.DescribeUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeUserRequest describe-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync describe-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeUserRequest describe-user-request]
    (-> this (.describeUserAsync describe-user-request))))

(defn update-primary-email-address-async
  "Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or
   swapped between an existing alias and the current primary email), and the email provided in the input is promoted
   as the primary.

  update-primary-email-address-request - `com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePrimaryEmailAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest update-primary-email-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePrimaryEmailAddressAsync update-primary-email-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest update-primary-email-address-request]
    (-> this (.updatePrimaryEmailAddressAsync update-primary-email-address-request))))

(defn delete-mailbox-permissions-async
  "Deletes permissions granted to a member (user or group).

  delete-mailbox-permissions-request - `com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMailboxPermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteMailboxPermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest delete-mailbox-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMailboxPermissionsAsync delete-mailbox-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest delete-mailbox-permissions-request]
    (-> this (.deleteMailboxPermissionsAsync delete-mailbox-permissions-request))))

(defn describe-organization-async
  "Provides more information regarding a given organization based on its identifier.

  describe-organization-request - `com.amazonaws.services.workmail.model.DescribeOrganizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DescribeOrganizationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeOrganizationRequest describe-organization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationAsync describe-organization-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeOrganizationRequest describe-organization-request]
    (-> this (.describeOrganizationAsync describe-organization-request))))

(defn list-users-async
  "Returns summaries of the organization's users.

  list-users-request - `com.amazonaws.services.workmail.model.ListUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListUsersRequest list-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync list-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListUsersRequest list-users-request]
    (-> this (.listUsersAsync list-users-request))))

(defn list-groups-async
  "Returns summaries of the organization's groups.

  list-groups-request - `com.amazonaws.services.workmail.model.ListGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListGroupsRequest list-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync list-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListGroupsRequest list-groups-request]
    (-> this (.listGroupsAsync list-groups-request))))

(defn delete-group-async
  "Deletes a group from Amazon WorkMail.

  delete-group-request - `com.amazonaws.services.workmail.model.DeleteGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteGroupRequest delete-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync delete-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroupAsync delete-group-request))))

(defn list-mailbox-permissions-async
  "Lists the mailbox permissions associated with a user, group, or resource mailbox.

  list-mailbox-permissions-request - `com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMailboxPermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListMailboxPermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest list-mailbox-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMailboxPermissionsAsync list-mailbox-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest list-mailbox-permissions-request]
    (-> this (.listMailboxPermissionsAsync list-mailbox-permissions-request))))

(defn list-group-members-async
  "Returns an overview of the members of a group. Users and groups can be members of a group.

  list-group-members-request - `com.amazonaws.services.workmail.model.ListGroupMembersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListGroupMembersResult>`"
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListGroupMembersRequest list-group-members-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupMembersAsync list-group-members-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListGroupMembersRequest list-group-members-request]
    (-> this (.listGroupMembersAsync list-group-members-request))))

