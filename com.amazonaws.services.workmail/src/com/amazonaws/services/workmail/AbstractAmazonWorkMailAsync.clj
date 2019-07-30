(ns com.amazonaws.services.workmail.AbstractAmazonWorkMailAsync
  "Abstract implementation of AmazonWorkMailAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workmail AbstractAmazonWorkMailAsync]))

(defn list-aliases-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.ListAliasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListAliasesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListAliasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAliasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListAliasesRequest request]
    (-> this (.listAliasesAsync request))))

(defn create-group-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.CreateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateGroupRequest request]
    (-> this (.createGroupAsync request))))

(defn associate-member-to-group-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateMemberToGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.AssociateMemberToGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateMemberToGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest request]
    (-> this (.associateMemberToGroupAsync request))))

(defn create-alias-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.CreateAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.CreateAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateAliasRequest request]
    (-> this (.createAliasAsync request))))

(defn deregister-from-work-mail-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterFromWorkMail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterFromWorkMailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest request]
    (-> this (.deregisterFromWorkMailAsync request))))

(defn delete-user-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DeleteUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn list-resource-delegates-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.ListResourceDelegatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceDelegates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListResourceDelegatesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListResourceDelegatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceDelegatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListResourceDelegatesRequest request]
    (-> this (.listResourceDelegatesAsync request))))

(defn describe-group-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DescribeGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DescribeGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeGroupRequest request]
    (-> this (.describeGroupAsync request))))

(defn reset-password-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.ResetPasswordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ResetPasswordResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ResetPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ResetPasswordRequest request]
    (-> this (.resetPasswordAsync request))))

(defn associate-delegate-to-resource-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDelegateToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDelegateToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest request]
    (-> this (.associateDelegateToResourceAsync request))))

(defn disassociate-delegate-from-resource-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDelegateFromResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDelegateFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest request]
    (-> this (.disassociateDelegateFromResourceAsync request))))

(defn delete-resource-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DeleteResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteResourceRequest request]
    (-> this (.deleteResourceAsync request))))

(defn disassociate-member-from-group-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateMemberFromGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateMemberFromGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest request]
    (-> this (.disassociateMemberFromGroupAsync request))))

(defn update-mailbox-quota-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMailboxQuota operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.UpdateMailboxQuotaResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMailboxQuotaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest request]
    (-> this (.updateMailboxQuotaAsync request))))

(defn create-user-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.CreateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateUserRequest request]
    (-> this (.createUserAsync request))))

(defn register-to-work-mail-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.RegisterToWorkMailRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterToWorkMail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.RegisterToWorkMailResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.RegisterToWorkMailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerToWorkMailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.RegisterToWorkMailRequest request]
    (-> this (.registerToWorkMailAsync request))))

(defn list-organizations-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.ListOrganizationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOrganizations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListOrganizationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListOrganizationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOrganizationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListOrganizationsRequest request]
    (-> this (.listOrganizationsAsync request))))

(defn list-resources-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.ListResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListResourcesRequest request]
    (-> this (.listResourcesAsync request))))

(defn delete-alias-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DeleteAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteAliasRequest request]
    (-> this (.deleteAliasAsync request))))

(defn get-mailbox-details-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.GetMailboxDetailsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMailboxDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.GetMailboxDetailsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.GetMailboxDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMailboxDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.GetMailboxDetailsRequest request]
    (-> this (.getMailboxDetailsAsync request))))

(defn put-mailbox-permissions-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMailboxPermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.PutMailboxPermissionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMailboxPermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest request]
    (-> this (.putMailboxPermissionsAsync request))))

(defn update-resource-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.UpdateResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.UpdateResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdateResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdateResourceRequest request]
    (-> this (.updateResourceAsync request))))

(defn create-resource-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.CreateResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.CreateResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.CreateResourceRequest request]
    (-> this (.createResourceAsync request))))

(defn describe-resource-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DescribeResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DescribeResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeResourceRequest request]
    (-> this (.describeResourceAsync request))))

(defn describe-user-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DescribeUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DescribeUserResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeUserRequest request]
    (-> this (.describeUserAsync request))))

(defn update-primary-email-address-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePrimaryEmailAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePrimaryEmailAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest request]
    (-> this (.updatePrimaryEmailAddressAsync request))))

(defn delete-mailbox-permissions-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMailboxPermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteMailboxPermissionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMailboxPermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest request]
    (-> this (.deleteMailboxPermissionsAsync request))))

(defn describe-organization-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DescribeOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DescribeOrganizationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DescribeOrganizationRequest request]
    (-> this (.describeOrganizationAsync request))))

(defn list-users-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.ListUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListUsersRequest request]
    (-> this (.listUsersAsync request))))

(defn list-groups-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.ListGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListGroupsRequest request]
    (-> this (.listGroupsAsync request))))

(defn delete-group-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.DeleteGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.DeleteGroupRequest request]
    (-> this (.deleteGroupAsync request))))

(defn list-mailbox-permissions-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMailboxPermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListMailboxPermissionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMailboxPermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest request]
    (-> this (.listMailboxPermissionsAsync request))))

(defn list-group-members-async
  "Description copied from interface: AmazonWorkMailAsync

  request - `com.amazonaws.services.workmail.model.ListGroupMembersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupMembers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.workmail.model.ListGroupMembersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListGroupMembersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupMembersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonWorkMailAsync this ^com.amazonaws.services.workmail.model.ListGroupMembersRequest request]
    (-> this (.listGroupMembersAsync request))))

