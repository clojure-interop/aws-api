(ns com.amazonaws.services.workmail.AbstractAmazonWorkMail
  "Abstract implementation of AmazonWorkMail. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workmail AbstractAmazonWorkMail]))

(defn delete-group
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteGroupResult`"
  (^com.amazonaws.services.workmail.model.DeleteGroupResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn delete-mailbox-permissions
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest`

  returns: Result of the DeleteMailboxPermissions operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteMailboxPermissionsResult`"
  (^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest request]
    (-> this (.deleteMailboxPermissions request))))

(defn describe-resource
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DescribeResourceRequest`

  returns: Result of the DescribeResource operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeResourceResult`"
  (^com.amazonaws.services.workmail.model.DescribeResourceResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DescribeResourceRequest request]
    (-> this (.describeResource request))))

(defn reset-password
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.ResetPasswordRequest`

  returns: Result of the ResetPassword operation returned by the service. - `com.amazonaws.services.workmail.model.ResetPasswordResult`"
  (^com.amazonaws.services.workmail.model.ResetPasswordResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.ResetPasswordRequest request]
    (-> this (.resetPassword request))))

(defn create-group
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.workmail.model.CreateGroupResult`"
  (^com.amazonaws.services.workmail.model.CreateGroupResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn update-primary-email-address
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest`

  returns: Result of the UpdatePrimaryEmailAddress operation returned by the service. - `com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult`"
  (^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest request]
    (-> this (.updatePrimaryEmailAddress request))))

(defn disassociate-delegate-from-resource
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest`

  returns: Result of the DisassociateDelegateFromResource operation returned by the service. - `com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult`"
  (^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest request]
    (-> this (.disassociateDelegateFromResource request))))

(defn list-group-members
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.ListGroupMembersRequest`

  returns: Result of the ListGroupMembers operation returned by the service. - `com.amazonaws.services.workmail.model.ListGroupMembersResult`"
  (^com.amazonaws.services.workmail.model.ListGroupMembersResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.ListGroupMembersRequest request]
    (-> this (.listGroupMembers request))))

(defn register-to-work-mail
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.RegisterToWorkMailRequest`

  returns: Result of the RegisterToWorkMail operation returned by the service. - `com.amazonaws.services.workmail.model.RegisterToWorkMailResult`"
  (^com.amazonaws.services.workmail.model.RegisterToWorkMailResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.RegisterToWorkMailRequest request]
    (-> this (.registerToWorkMail request))))

(defn update-resource
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.UpdateResourceRequest`

  returns: Result of the UpdateResource operation returned by the service. - `com.amazonaws.services.workmail.model.UpdateResourceResult`"
  (^com.amazonaws.services.workmail.model.UpdateResourceResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.UpdateResourceRequest request]
    (-> this (.updateResource request))))

(defn create-alias
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.workmail.model.CreateAliasResult`"
  (^com.amazonaws.services.workmail.model.CreateAliasResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.CreateAliasRequest request]
    (-> this (.createAlias request))))

(defn list-resources
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.ListResourcesRequest`

  returns: Result of the ListResources operation returned by the service. - `com.amazonaws.services.workmail.model.ListResourcesResult`"
  (^com.amazonaws.services.workmail.model.ListResourcesResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.ListResourcesRequest request]
    (-> this (.listResources request))))

(defn list-users
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.workmail.model.ListUsersResult`"
  (^com.amazonaws.services.workmail.model.ListUsersResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn delete-alias
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DeleteAliasRequest`

  returns: Result of the DeleteAlias operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteAliasResult`"
  (^com.amazonaws.services.workmail.model.DeleteAliasResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteAliasRequest request]
    (-> this (.deleteAlias request))))

(defn associate-member-to-group
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest`

  returns: Result of the AssociateMemberToGroup operation returned by the service. - `com.amazonaws.services.workmail.model.AssociateMemberToGroupResult`"
  (^com.amazonaws.services.workmail.model.AssociateMemberToGroupResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest request]
    (-> this (.associateMemberToGroup request))))

(defn describe-group
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DescribeGroupRequest`

  returns: Result of the DescribeGroup operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeGroupResult`"
  (^com.amazonaws.services.workmail.model.DescribeGroupResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DescribeGroupRequest request]
    (-> this (.describeGroup request))))

(defn create-user
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.workmail.model.CreateUserResult`"
  (^com.amazonaws.services.workmail.model.CreateUserResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn disassociate-member-from-group
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest`

  returns: Result of the DisassociateMemberFromGroup operation returned by the service. - `com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult`"
  (^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest request]
    (-> this (.disassociateMemberFromGroup request))))

(defn delete-user
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteUserResult`"
  (^com.amazonaws.services.workmail.model.DeleteUserResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn associate-delegate-to-resource
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest`

  returns: Result of the AssociateDelegateToResource operation returned by the service. - `com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult`"
  (^com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest request]
    (-> this (.associateDelegateToResource request))))

(defn deregister-from-work-mail
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest`

  returns: Result of the DeregisterFromWorkMail operation returned by the service. - `com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult`"
  (^com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest request]
    (-> this (.deregisterFromWorkMail request))))

(defn create-resource
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.CreateResourceRequest`

  returns: Result of the CreateResource operation returned by the service. - `com.amazonaws.services.workmail.model.CreateResourceResult`"
  (^com.amazonaws.services.workmail.model.CreateResourceResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.CreateResourceRequest request]
    (-> this (.createResource request))))

(defn shutdown
  "Description copied from interface: AmazonWorkMail"
  ([^AbstractAmazonWorkMail this]
    (-> this (.shutdown))))

(defn get-mailbox-details
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.GetMailboxDetailsRequest`

  returns: Result of the GetMailboxDetails operation returned by the service. - `com.amazonaws.services.workmail.model.GetMailboxDetailsResult`"
  (^com.amazonaws.services.workmail.model.GetMailboxDetailsResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.GetMailboxDetailsRequest request]
    (-> this (.getMailboxDetails request))))

(defn list-resource-delegates
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.ListResourceDelegatesRequest`

  returns: Result of the ListResourceDelegates operation returned by the service. - `com.amazonaws.services.workmail.model.ListResourceDelegatesResult`"
  (^com.amazonaws.services.workmail.model.ListResourceDelegatesResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.ListResourceDelegatesRequest request]
    (-> this (.listResourceDelegates request))))

(defn describe-organization
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DescribeOrganizationRequest`

  returns: Result of the DescribeOrganization operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeOrganizationResult`"
  (^com.amazonaws.services.workmail.model.DescribeOrganizationResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DescribeOrganizationRequest request]
    (-> this (.describeOrganization request))))

(defn delete-resource
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DeleteResourceRequest`

  returns: Result of the DeleteResource operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteResourceResult`"
  (^com.amazonaws.services.workmail.model.DeleteResourceResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteResourceRequest request]
    (-> this (.deleteResource request))))

(defn describe-user
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeUserResult`"
  (^com.amazonaws.services.workmail.model.DescribeUserResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.DescribeUserRequest request]
    (-> this (.describeUser request))))

(defn list-organizations
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.ListOrganizationsRequest`

  returns: Result of the ListOrganizations operation returned by the service. - `com.amazonaws.services.workmail.model.ListOrganizationsResult`"
  (^com.amazonaws.services.workmail.model.ListOrganizationsResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.ListOrganizationsRequest request]
    (-> this (.listOrganizations request))))

(defn list-mailbox-permissions
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest`

  returns: Result of the ListMailboxPermissions operation returned by the service. - `com.amazonaws.services.workmail.model.ListMailboxPermissionsResult`"
  (^com.amazonaws.services.workmail.model.ListMailboxPermissionsResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest request]
    (-> this (.listMailboxPermissions request))))

(defn list-groups
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.workmail.model.ListGroupsResult`"
  (^com.amazonaws.services.workmail.model.ListGroupsResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn put-mailbox-permissions
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest`

  returns: Result of the PutMailboxPermissions operation returned by the service. - `com.amazonaws.services.workmail.model.PutMailboxPermissionsResult`"
  (^com.amazonaws.services.workmail.model.PutMailboxPermissionsResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest request]
    (-> this (.putMailboxPermissions request))))

(defn list-aliases
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.ListAliasesRequest`

  returns: Result of the ListAliases operation returned by the service. - `com.amazonaws.services.workmail.model.ListAliasesResult`"
  (^com.amazonaws.services.workmail.model.ListAliasesResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.ListAliasesRequest request]
    (-> this (.listAliases request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonWorkMail

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonWorkMail this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-mailbox-quota
  "Description copied from interface: AmazonWorkMail

  request - `com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest`

  returns: Result of the UpdateMailboxQuota operation returned by the service. - `com.amazonaws.services.workmail.model.UpdateMailboxQuotaResult`"
  (^com.amazonaws.services.workmail.model.UpdateMailboxQuotaResult [^AbstractAmazonWorkMail this ^com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest request]
    (-> this (.updateMailboxQuota request))))

