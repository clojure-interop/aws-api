(ns com.amazonaws.services.workmail.AmazonWorkMailClient
  "Client for accessing Amazon WorkMail. All service calls made using this client are blocking, and will not return
  until the service call completes.


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
  (:import [com.amazonaws.services.workmail AmazonWorkMailClient]))

(defn *builder
  "returns: `com.amazonaws.services.workmail.AmazonWorkMailClientBuilder`"
  (^com.amazonaws.services.workmail.AmazonWorkMailClientBuilder []
    (AmazonWorkMailClient/builder )))

(defn delete-group
  "Deletes a group from Amazon WorkMail.

  request - `com.amazonaws.services.workmail.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteGroupResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.DeleteGroupResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn delete-mailbox-permissions
  "Deletes permissions granted to a member (user or group).

  request - `com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest`

  returns: Result of the DeleteMailboxPermissions operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteMailboxPermissionsResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DeleteMailboxPermissionsRequest request]
    (-> this (.deleteMailboxPermissions request))))

(defn describe-resource
  "Returns the data available for the resource.

  request - `com.amazonaws.services.workmail.model.DescribeResourceRequest`

  returns: Result of the DescribeResource operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeResourceResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DescribeResourceResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DescribeResourceRequest request]
    (-> this (.describeResource request))))

(defn reset-password
  "Allows the administrator to reset the password for a user.

  request - `com.amazonaws.services.workmail.model.ResetPasswordRequest`

  returns: Result of the ResetPassword operation returned by the service. - `com.amazonaws.services.workmail.model.ResetPasswordResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.ResetPasswordResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.ResetPasswordRequest request]
    (-> this (.resetPassword request))))

(defn create-group
  "Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.

  request - `com.amazonaws.services.workmail.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.workmail.model.CreateGroupResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.CreateGroupResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn update-primary-email-address
  "Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or
   swapped between an existing alias and the current primary email), and the email provided in the input is promoted
   as the primary.

  request - `com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest`

  returns: Result of the UpdatePrimaryEmailAddress operation returned by the service. - `com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.UpdatePrimaryEmailAddressRequest request]
    (-> this (.updatePrimaryEmailAddress request))))

(defn disassociate-delegate-from-resource
  "Removes a member from the resource's set of delegates.

  request - `com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest`

  returns: Result of the DisassociateDelegateFromResource operation returned by the service. - `com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DisassociateDelegateFromResourceRequest request]
    (-> this (.disassociateDelegateFromResource request))))

(defn list-group-members
  "Returns an overview of the members of a group. Users and groups can be members of a group.

  request - `com.amazonaws.services.workmail.model.ListGroupMembersRequest`

  returns: Result of the ListGroupMembers operation returned by the service. - `com.amazonaws.services.workmail.model.ListGroupMembersResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListGroupMembersResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.ListGroupMembersRequest request]
    (-> this (.listGroupMembers request))))

(defn register-to-work-mail
  "Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and
   calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user,
   group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this
   operation is Enable.


   Users can either be created by calling the CreateUser API operation or they can be synchronized from your
   directory. For more information, see DeregisterFromWorkMail.

  request - `com.amazonaws.services.workmail.model.RegisterToWorkMailRequest`

  returns: Result of the RegisterToWorkMail operation returned by the service. - `com.amazonaws.services.workmail.model.RegisterToWorkMailResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.RegisterToWorkMailResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.RegisterToWorkMailRequest request]
    (-> this (.registerToWorkMail request))))

(defn update-resource
  "Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource
   call. The dataset in the request should be the one expected when performing another DescribeResource
   call.

  request - `com.amazonaws.services.workmail.model.UpdateResourceRequest`

  returns: Result of the UpdateResource operation returned by the service. - `com.amazonaws.services.workmail.model.UpdateResourceResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.UpdateResourceResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.UpdateResourceRequest request]
    (-> this (.updateResource request))))

(defn create-alias
  "Adds an alias to the set of a given member (user or group) of Amazon WorkMail.

  request - `com.amazonaws.services.workmail.model.CreateAliasRequest`

  returns: Result of the CreateAlias operation returned by the service. - `com.amazonaws.services.workmail.model.CreateAliasResult`

  throws: com.amazonaws.services.workmail.model.EmailAddressInUseException - The email address that you're trying to assign is already created for a different user, group, or resource."
  (^com.amazonaws.services.workmail.model.CreateAliasResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.CreateAliasRequest request]
    (-> this (.createAlias request))))

(defn list-resources
  "Returns summaries of the organization's resources.

  request - `com.amazonaws.services.workmail.model.ListResourcesRequest`

  returns: Result of the ListResources operation returned by the service. - `com.amazonaws.services.workmail.model.ListResourcesResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.ListResourcesResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.ListResourcesRequest request]
    (-> this (.listResources request))))

(defn list-users
  "Returns summaries of the organization's users.

  request - `com.amazonaws.services.workmail.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.workmail.model.ListUsersResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.ListUsersResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn delete-alias
  "Remove one or more specified aliases from a set of aliases for a given user.

  request - `com.amazonaws.services.workmail.model.DeleteAliasRequest`

  returns: Result of the DeleteAlias operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteAliasResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DeleteAliasResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DeleteAliasRequest request]
    (-> this (.deleteAlias request))))

(defn associate-member-to-group
  "Adds a member (user or group) to the group's set.

  request - `com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest`

  returns: Result of the AssociateMemberToGroup operation returned by the service. - `com.amazonaws.services.workmail.model.AssociateMemberToGroupResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.AssociateMemberToGroupResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.AssociateMemberToGroupRequest request]
    (-> this (.associateMemberToGroup request))))

(defn describe-group
  "Returns the data available for the group.

  request - `com.amazonaws.services.workmail.model.DescribeGroupRequest`

  returns: Result of the DescribeGroup operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeGroupResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DescribeGroupResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DescribeGroupRequest request]
    (-> this (.describeGroup request))))

(defn create-user
  "Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.

  request - `com.amazonaws.services.workmail.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.workmail.model.CreateUserResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.CreateUserResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn disassociate-member-from-group
  "Removes a member from a group.

  request - `com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest`

  returns: Result of the DisassociateMemberFromGroup operation returned by the service. - `com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DisassociateMemberFromGroupRequest request]
    (-> this (.disassociateMemberFromGroup request))))

(defn delete-user
  "Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must
   be DISABLED. Use the DescribeUser action to confirm the user state.


   Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are
   permanently removed.

  request - `com.amazonaws.services.workmail.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteUserResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.DeleteUserResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn associate-delegate-to-resource
  "Adds a member (user or group) to the resource's set of delegates.

  request - `com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest`

  returns: Result of the AssociateDelegateToResource operation returned by the service. - `com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.AssociateDelegateToResourceResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.AssociateDelegateToResourceRequest request]
    (-> this (.associateDelegateToResource request))))

(defn deregister-from-work-mail
  "Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and
   schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The
   functionality in the console is Disable.

  request - `com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest`

  returns: Result of the DeregisterFromWorkMail operation returned by the service. - `com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DeregisterFromWorkMailResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DeregisterFromWorkMailRequest request]
    (-> this (.deregisterFromWorkMail request))))

(defn create-resource
  "Creates a new Amazon WorkMail resource.

  request - `com.amazonaws.services.workmail.model.CreateResourceRequest`

  returns: Result of the CreateResource operation returned by the service. - `com.amazonaws.services.workmail.model.CreateResourceResult`

  throws: com.amazonaws.services.workmail.model.DirectoryServiceAuthenticationFailedException - The directory service doesn't recognize the credentials supplied by WorkMail."
  (^com.amazonaws.services.workmail.model.CreateResourceResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.CreateResourceRequest request]
    (-> this (.createResource request))))

(defn get-mailbox-details
  "Requests a user's mailbox details for a specified organization and user.

  request - `com.amazonaws.services.workmail.model.GetMailboxDetailsRequest`

  returns: Result of the GetMailboxDetails operation returned by the service. - `com.amazonaws.services.workmail.model.GetMailboxDetailsResult`

  throws: com.amazonaws.services.workmail.model.OrganizationNotFoundException - An operation received a valid organization identifier that either doesn't belong or exist in the system."
  (^com.amazonaws.services.workmail.model.GetMailboxDetailsResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.GetMailboxDetailsRequest request]
    (-> this (.getMailboxDetails request))))

(defn list-resource-delegates
  "Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on
   behalf of the resource.

  request - `com.amazonaws.services.workmail.model.ListResourceDelegatesRequest`

  returns: Result of the ListResourceDelegates operation returned by the service. - `com.amazonaws.services.workmail.model.ListResourceDelegatesResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListResourceDelegatesResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.ListResourceDelegatesRequest request]
    (-> this (.listResourceDelegates request))))

(defn describe-organization
  "Provides more information regarding a given organization based on its identifier.

  request - `com.amazonaws.services.workmail.model.DescribeOrganizationRequest`

  returns: Result of the DescribeOrganization operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeOrganizationResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.DescribeOrganizationResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DescribeOrganizationRequest request]
    (-> this (.describeOrganization request))))

(defn delete-resource
  "Deletes the specified resource.

  request - `com.amazonaws.services.workmail.model.DeleteResourceRequest`

  returns: Result of the DeleteResource operation returned by the service. - `com.amazonaws.services.workmail.model.DeleteResourceResult`

  throws: com.amazonaws.services.workmail.model.EntityStateException - You are performing an operation on a user, group, or resource that isn't in the expected state, such as trying to delete an active user."
  (^com.amazonaws.services.workmail.model.DeleteResourceResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DeleteResourceRequest request]
    (-> this (.deleteResource request))))

(defn describe-user
  "Provides information regarding the user.

  request - `com.amazonaws.services.workmail.model.DescribeUserRequest`

  returns: Result of the DescribeUser operation returned by the service. - `com.amazonaws.services.workmail.model.DescribeUserResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.DescribeUserResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.DescribeUserRequest request]
    (-> this (.describeUser request))))

(defn list-organizations
  "Returns summaries of the customer's non-deleted organizations.

  request - `com.amazonaws.services.workmail.model.ListOrganizationsRequest`

  returns: Result of the ListOrganizations operation returned by the service. - `com.amazonaws.services.workmail.model.ListOrganizationsResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.ListOrganizationsResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.ListOrganizationsRequest request]
    (-> this (.listOrganizations request))))

(defn list-mailbox-permissions
  "Lists the mailbox permissions associated with a user, group, or resource mailbox.

  request - `com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest`

  returns: Result of the ListMailboxPermissions operation returned by the service. - `com.amazonaws.services.workmail.model.ListMailboxPermissionsResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListMailboxPermissionsResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.ListMailboxPermissionsRequest request]
    (-> this (.listMailboxPermissions request))))

(defn list-groups
  "Returns summaries of the organization's groups.

  request - `com.amazonaws.services.workmail.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.workmail.model.ListGroupsResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListGroupsResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn put-mailbox-permissions
  "Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.

  request - `com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest`

  returns: Result of the PutMailboxPermissions operation returned by the service. - `com.amazonaws.services.workmail.model.PutMailboxPermissionsResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.PutMailboxPermissionsResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.PutMailboxPermissionsRequest request]
    (-> this (.putMailboxPermissions request))))

(defn list-aliases
  "Creates a paginated call to list the aliases associated with a given entity.

  request - `com.amazonaws.services.workmail.model.ListAliasesRequest`

  returns: Result of the ListAliases operation returned by the service. - `com.amazonaws.services.workmail.model.ListAliasesResult`

  throws: com.amazonaws.services.workmail.model.EntityNotFoundException - The identifier supplied for the user, group, or resource does not exist in your organization."
  (^com.amazonaws.services.workmail.model.ListAliasesResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.ListAliasesRequest request]
    (-> this (.listAliases request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonWorkMailClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-mailbox-quota
  "Updates a user's current mailbox quota for a specified organization and user.

  request - `com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest`

  returns: Result of the UpdateMailboxQuota operation returned by the service. - `com.amazonaws.services.workmail.model.UpdateMailboxQuotaResult`

  throws: com.amazonaws.services.workmail.model.InvalidParameterException - One or more of the input parameters don't match the service's restrictions."
  (^com.amazonaws.services.workmail.model.UpdateMailboxQuotaResult [^AmazonWorkMailClient this ^com.amazonaws.services.workmail.model.UpdateMailboxQuotaRequest request]
    (-> this (.updateMailboxQuota request))))

