(ns com.amazonaws.services.workmail.AmazonWorkMail
  "Interface for accessing Amazon WorkMail.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonWorkMail instead.



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
  (:import [com.amazonaws.services.workmail AmazonWorkMail]))

(defn delete-group
  "Deletes a group from Amazon WorkMail.

  delete-group-request - `com.amazonaws.services.workmail.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteGroupResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.DeleteGroupResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroup delete-group-request))))

(defn delete-mailbox-permissions
  "Deletes permissions granted to a member (user or group).

  delete-mailbox-permissions-request - `com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest`

  returns: Result of the DeleteMailboxPermissions operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteMailboxPermissionsResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest delete-mailbox-permissions-request]
    (-> this (.deleteMailboxPermissions delete-mailbox-permissions-request))))

(defn describe-resource
  "Returns the data available for the resource.

  describe-resource-request - `com.amazonaws.services.workmail.model.DescribeResourceRequest`

  returns: Result of the DescribeResource operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeResourceResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DescribeResourceResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DescribeResourceRequest describe-resource-request]
    (-> this (.describeResource describe-resource-request))))

(defn reset-password
  "Allows the administrator to reset the password for a user.

  reset-password-request - `com.amazonaws.services.workmail.model.ResetPasswordRequest`

  returns: Result of the ResetPassword operation returned by the service. - `com.amazonaws.services.workmail.model.ResetPasswordResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.ResetPasswordResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.ResetPasswordRequest reset-password-request]
    (-> this (.resetPassword reset-password-request))))

(defn create-group
  "Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.

  create-group-request - `com.amazonaws.services.workmail.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.workmail.model.CreateGroupResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.CreateGroupResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.CreateGroupRequest create-group-request]
    (-> this (.createGroup create-group-request))))

(defn update-primary-email-address
  "Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or
   swapped between an existing alias and the current primary email), and the email provided in the input is promoted
   as the primary.

  update-primary-email-address-request - `com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest`

  returns: Result of the UpdatePrimaryEmailAddress operation returned by the service. - `com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest update-primary-email-address-request]
    (-> this (.updatePrimaryEmailAddress update-primary-email-address-request))))

(defn disassociate-delegate-from-resource
  "Removes a member from the resource's set of delegates.

  disassociate-delegate-from-resource-request - `com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest`

  returns: Result of the DisassociateDelegateFromResource operation returned by the service. - `com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest disassociate-delegate-from-resource-request]
    (-> this (.disassociateDelegateFromResource disassociate-delegate-from-resource-request))))

(defn list-group-members
  "Returns an overview of the members of a group. Users and groups can be members of a group.

  list-group-members-request - `com.amazonaws.services.workmail.model.ListGroupMembersRequest`

  returns: Result of the ListGroupMembers operation returned by the service. - `com.amazonaws.services.workmail.model.ListGroupMembersResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListGroupMembersResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.ListGroupMembersRequest list-group-members-request]
    (-> this (.listGroupMembers list-group-members-request))))

(defn register-to-work-mail
  "Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and
   calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user,
   group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this
   operation is Enable.


   Users can either be created by calling the CreateUser API operation or they can be synchronized from your
   directory. For more information, see DeregisterFromWorkMail.

  register-to-work-mail-request - `com.amazonaws.services.workmail.model.RegisterToWorkMailRequest`

  returns: Result of the RegisterToWorkMail operation returned by the service. - `com.amazonaws.services.workmail.model.RegisterToWorkMailResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.RegisterToWorkMailResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.RegisterToWorkMailRequest register-to-work-mail-request]
    (-> this (.registerToWorkMail register-to-work-mail-request))))

(defn update-resource
  "Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource
   call. The dataset in the request should be the one expected when performing another DescribeResource
   call.

  update-resource-request - `com.amazonaws.services.workmail.model.UpdateResourceRequest`

  returns: Result of the UpdateResource operation returned by the service. - `com.amazonaws.services.workmail.model.UpdateResourceResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.UpdateResourceResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.UpdateResourceRequest update-resource-request]
    (-> this (.updateResource update-resource-request))))

(defn create-alias
  "Adds an alias to the set of a given member (user or group) of Amazon WorkMail.

  create-alias-request - `com.amazonaws.services.workmail.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.workmail.model.CreateAliasResult`

  throws: com.amazonaws.services.workmail.model.EmailAddressInUseException - The email address that you're trying to assign is already created for a different user, group, or resource."
  (^com.amazonaws.services.workmail.model.CreateAliasResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.CreateAliasRequest create-alias-request]
    (-> this (.createAlias create-alias-request))))

(defn list-resources
  "Returns summaries of the organization's resources.

  list-resources-request - `com.amazonaws.services.workmail.model.ListResourcesRequest`

  returns: Result of the ListResources operation returned by the service. - `com.amazonaws.services.workmail.model.ListResourcesResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.ListResourcesResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.ListResourcesRequest list-resources-request]
    (-> this (.listResources list-resources-request))))

(defn list-users
  "Returns summaries of the organization's users.

  list-users-request - `com.amazonaws.services.workmail.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.workmail.model.ListUsersResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.ListUsersResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.ListUsersRequest list-users-request]
    (-> this (.listUsers list-users-request))))

(defn delete-alias
  "Remove one or more specified aliases from a set of aliases for a given user.

  delete-alias-request - `com.amazonaws.services.workmail.model.DeleteAliasRequest`

  returns: Result of the DeleteAlias operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteAliasResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DeleteAliasResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteAliasRequest delete-alias-request]
    (-> this (.deleteAlias delete-alias-request))))

(defn associate-member-to-group
  "Adds a member (user or group) to the group's set.

  associate-member-to-group-request - `com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest`

  returns: Result of the AssociateMemberToGroup operation returned by the service. - `com.amazonaws.services.workmail.model.AssociateMemberToGroupResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.AssociateMemberToGroupResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest associate-member-to-group-request]
    (-> this (.associateMemberToGroup associate-member-to-group-request))))

(defn describe-group
  "Returns the data available for the group.

  describe-group-request - `com.amazonaws.services.workmail.model.DescribeGroupRequest`

  returns: Result of the DescribeGroup operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeGroupResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DescribeGroupResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DescribeGroupRequest describe-group-request]
    (-> this (.describeGroup describe-group-request))))

(defn create-user
  "Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.

  create-user-request - `com.amazonaws.services.workmail.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.workmail.model.CreateUserResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.CreateUserResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.CreateUserRequest create-user-request]
    (-> this (.createUser create-user-request))))

(defn disassociate-member-from-group
  "Removes a member from a group.

  disassociate-member-from-group-request - `com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest`

  returns: Result of the DisassociateMemberFromGroup operation returned by the service. - `com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest disassociate-member-from-group-request]
    (-> this (.disassociateMemberFromGroup disassociate-member-from-group-request))))

(defn delete-user
  "Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must
   be DISABLED. Use the DescribeUser action to confirm the user state.


   Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are
   permanently removed.

  delete-user-request - `com.amazonaws.services.workmail.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteUserResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.DeleteUserResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUser delete-user-request))))

(defn associate-delegate-to-resource
  "Adds a member (user or group) to the resource's set of delegates.

  associate-delegate-to-resource-request - `com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest`

  returns: Result of the AssociateDelegateToResource operation returned by the service. - `com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest associate-delegate-to-resource-request]
    (-> this (.associateDelegateToResource associate-delegate-to-resource-request))))

(defn deregister-from-work-mail
  "Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and
   schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The
   functionality in the console is Disable.

  deregister-from-work-mail-request - `com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest`

  returns: Result of the DeregisterFromWorkMail operation returned by the service. - `com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest deregister-from-work-mail-request]
    (-> this (.deregisterFromWorkMail deregister-from-work-mail-request))))

(defn create-resource
  "Creates a new Amazon WorkMail resource.

  create-resource-request - `com.amazonaws.services.workmail.model.CreateResourceRequest`

  returns: Result of the CreateResource operation returned by the service. - `com.amazonaws.services.workmail.model.CreateResourceResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.CreateResourceResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.CreateResourceRequest create-resource-request]
    (-> this (.createResource create-resource-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonWorkMail this]
    (-> this (.shutdown))))

(defn get-mailbox-details
  "Requests a user's mailbox details for a specified organization and user.

  get-mailbox-details-request - `com.amazonaws.services.workmail.model.GetMailboxDetailsRequest`

  returns: Result of the GetMailboxDetails operation returned by the service. - `com.amazonaws.services.workmail.model.GetMailboxDetailsResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.GetMailboxDetailsResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.GetMailboxDetailsRequest get-mailbox-details-request]
    (-> this (.getMailboxDetails get-mailbox-details-request))))

(defn list-resource-delegates
  "Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on
   behalf of the resource.

  list-resource-delegates-request - `com.amazonaws.services.workmail.model.ListResourceDelegatesRequest`

  returns: Result of the ListResourceDelegates operation returned by the service. - `com.amazonaws.services.workmail.model.ListResourceDelegatesResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListResourceDelegatesResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.ListResourceDelegatesRequest list-resource-delegates-request]
    (-> this (.listResourceDelegates list-resource-delegates-request))))

(defn describe-organization
  "Provides more information regarding a given organization based on its identifier.

  describe-organization-request - `com.amazonaws.services.workmail.model.DescribeOrganizationRequest`

  returns: Result of the DescribeOrganization operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeOrganizationResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.DescribeOrganizationResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DescribeOrganizationRequest describe-organization-request]
    (-> this (.describeOrganization describe-organization-request))))

(defn delete-resource
  "Deletes the specified resource.

  delete-resource-request - `com.amazonaws.services.workmail.model.DeleteResourceRequest`

  returns: Result of the DeleteResource operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteResourceResult`

  throws: com.amazonaws.services.workmail.model.EntityStateException - You are performing an operation on a user, group, or resource that isn't in the expected state, such as trying to delete an active user."
  (^com.amazonaws.services.workmail.model.DeleteResourceResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DeleteResourceRequest delete-resource-request]
    (-> this (.deleteResource delete-resource-request))))

(defn describe-user
  "Provides information regarding the user.

  describe-user-request - `com.amazonaws.services.workmail.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeUserResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DescribeUserResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.DescribeUserRequest describe-user-request]
    (-> this (.describeUser describe-user-request))))

(defn list-organizations
  "Returns summaries of the customer's non-deleted organizations.

  list-organizations-request - `com.amazonaws.services.workmail.model.ListOrganizationsRequest`

  returns: Result of the ListOrganizations operation returned by the service. - `com.amazonaws.services.workmail.model.ListOrganizationsResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.ListOrganizationsResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.ListOrganizationsRequest list-organizations-request]
    (-> this (.listOrganizations list-organizations-request))))

(defn list-mailbox-permissions
  "Lists the mailbox permissions associated with a user, group, or resource mailbox.

  list-mailbox-permissions-request - `com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest`

  returns: Result of the ListMailboxPermissions operation returned by the service. - `com.amazonaws.services.workmail.model.ListMailboxPermissionsResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListMailboxPermissionsResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest list-mailbox-permissions-request]
    (-> this (.listMailboxPermissions list-mailbox-permissions-request))))

(defn list-groups
  "Returns summaries of the organization's groups.

  list-groups-request - `com.amazonaws.services.workmail.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.workmail.model.ListGroupsResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListGroupsResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.ListGroupsRequest list-groups-request]
    (-> this (.listGroups list-groups-request))))

(defn put-mailbox-permissions
  "Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.

  put-mailbox-permissions-request - `com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest`

  returns: Result of the PutMailboxPermissions operation returned by the service. - `com.amazonaws.services.workmail.model.PutMailboxPermissionsResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.PutMailboxPermissionsResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest put-mailbox-permissions-request]
    (-> this (.putMailboxPermissions put-mailbox-permissions-request))))

(defn list-aliases
  "Creates a paginated call to list the aliases associated with a given entity.

  list-aliases-request - `com.amazonaws.services.workmail.model.ListAliasesRequest`

  returns: Result of the ListAliases operation returned by the service. - `com.amazonaws.services.workmail.model.ListAliasesResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListAliasesResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.ListAliasesRequest list-aliases-request]
    (-> this (.listAliases list-aliases-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonWorkMail this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-mailbox-quota
  "Updates a user's current mailbox quota for a specified organization and user.

  update-mailbox-quota-request - `com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest`

  returns: Result of the UpdateMailboxQuota operation returned by the service. - `com.amazonaws.services.workmail.model.UpdateMailboxQuotaResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.UpdateMailboxQuotaResult [^AmazonWorkMail this ^com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest update-mailbox-quota-request]
    (-> this (.updateMailboxQuota update-mailbox-quota-request))))

