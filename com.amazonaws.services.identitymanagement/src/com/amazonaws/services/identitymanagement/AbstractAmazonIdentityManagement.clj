(ns com.amazonaws.services.identitymanagement.AbstractAmazonIdentityManagement
  "Abstract implementation of AmazonIdentityManagement. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.identitymanagement AbstractAmazonIdentityManagement]))

(defn list-attached-user-policies
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest`

  returns: Result of the ListAttachedUserPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest request]
    (-> this (.listAttachedUserPolicies request))))

(defn delete-group
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteGroupResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteGroupResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn generate-credential-report
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest`

  returns: Result of the GenerateCredentialReport operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult`"
  (^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest request]
    (-> this (.generateCredentialReport request)))
  (^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult [^AbstractAmazonIdentityManagement this]
    (-> this (.generateCredentialReport))))

(defn get-context-keys-for-custom-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest`

  returns: Result of the GetContextKeysForCustomPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest request]
    (-> this (.getContextKeysForCustomPolicy request))))

(defn get-instance-profile
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest`

  returns: Result of the GetInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult`"
  (^com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest request]
    (-> this (.getInstanceProfile request))))

(defn update-group
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateGroupResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateGroupResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn delete-account-alias
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest`

  returns: Result of the DeleteAccountAlias operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest request]
    (-> this (.deleteAccountAlias request))))

(defn create-account-alias
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest`

  returns: Result of the CreateAccountAlias operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest request]
    (-> this (.createAccountAlias request))))

(defn generate-organizations-access-report
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest`

  returns: Result of the GenerateOrganizationsAccessReport operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportResult`"
  (^com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest request]
    (-> this (.generateOrganizationsAccessReport request))))

(defn add-role-to-instance-profile
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest`

  returns: Result of the AddRoleToInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult`"
  (^com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest request]
    (-> this (.addRoleToInstanceProfile request))))

(defn set-region
  "Description copied from interface: AmazonIdentityManagement

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonIdentityManagement this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-role
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateRoleRequest`

  returns: Result of the UpdateRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateRoleResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateRoleResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateRoleRequest request]
    (-> this (.updateRole request))))

(defn attach-role-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest`

  returns: Result of the AttachRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest request]
    (-> this (.attachRolePolicy request))))

(defn get-ssh-public-key
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest`

  returns: Result of the GetSSHPublicKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult`"
  (^com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest request]
    (-> this (.getSSHPublicKey request))))

(defn put-role-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest`

  returns: Result of the PutRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutRolePolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.PutRolePolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest request]
    (-> this (.putRolePolicy request))))

(defn create-group
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateGroupResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateGroupResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn waiters
  "returns: `com.amazonaws.services.identitymanagement.waiters.AmazonIdentityManagementWaiters`"
  (^com.amazonaws.services.identitymanagement.waiters.AmazonIdentityManagementWaiters [^AbstractAmazonIdentityManagement this]
    (-> this (.waiters))))

(defn list-service-specific-credentials
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest`

  returns: Result of the ListServiceSpecificCredentials operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult`"
  (^com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest request]
    (-> this (.listServiceSpecificCredentials request))))

(defn simulate-custom-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest`

  returns: Result of the SimulateCustomPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest request]
    (-> this (.simulateCustomPolicy request))))

(defn create-role
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateRoleRequest`

  returns: Result of the CreateRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateRoleResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateRoleResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateRoleRequest request]
    (-> this (.createRole request))))

(defn list-saml-providers
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest`

  returns: Result of the ListSAMLProviders operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult`"
  (^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest request]
    (-> this (.listSAMLProviders request)))
  (^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listSAMLProviders))))

(defn tag-user
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.TagUserRequest`

  returns: Result of the TagUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.TagUserResult`"
  (^com.amazonaws.services.identitymanagement.model.TagUserResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.TagUserRequest request]
    (-> this (.tagUser request))))

(defn delete-user-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest`

  returns: Result of the DeleteUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest request]
    (-> this (.deleteUserPolicy request))))

(defn update-signing-certificate
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest`

  returns: Result of the UpdateSigningCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest request]
    (-> this (.updateSigningCertificate request))))

(defn get-role
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetRoleRequest`

  returns: Result of the GetRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetRoleResult`"
  (^com.amazonaws.services.identitymanagement.model.GetRoleResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetRoleRequest request]
    (-> this (.getRole request))))

(defn list-signing-certificates
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest`

  returns: Result of the ListSigningCertificates operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest request]
    (-> this (.listSigningCertificates request)))
  (^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listSigningCertificates))))

(defn delete-role-permissions-boundary
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest`

  returns: Result of the DeleteRolePermissionsBoundary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest request]
    (-> this (.deleteRolePermissionsBoundary request))))

(defn update-user
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateUserResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateUserResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn get-login-profile
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest`

  returns: Result of the GetLoginProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetLoginProfileResult`"
  (^com.amazonaws.services.identitymanagement.model.GetLoginProfileResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest request]
    (-> this (.getLoginProfile request))))

(defn get-role-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest`

  returns: Result of the GetRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetRolePolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.GetRolePolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest request]
    (-> this (.getRolePolicy request))))

(defn remove-user-from-group
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest`

  returns: Result of the RemoveUserFromGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult`"
  (^com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest request]
    (-> this (.removeUserFromGroup request))))

(defn list-server-certificates
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest`

  returns: Result of the ListServerCertificates operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest request]
    (-> this (.listServerCertificates request)))
  (^com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listServerCertificates))))

(defn list-policies-granting-service-access
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest`

  returns: Result of the ListPoliciesGrantingServiceAccess operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessResult`"
  (^com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest request]
    (-> this (.listPoliciesGrantingServiceAccess request))))

(defn remove-client-id-from-open-id-connect-provider
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest`

  returns: Result of the RemoveClientIDFromOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult`"
  (^com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest request]
    (-> this (.removeClientIDFromOpenIDConnectProvider request))))

(defn set-default-policy-version
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest`

  returns: Result of the SetDefaultPolicyVersion operation returned by the service. - `com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult`"
  (^com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest request]
    (-> this (.setDefaultPolicyVersion request))))

(defn detach-group-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest`

  returns: Result of the DetachGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest request]
    (-> this (.detachGroupPolicy request))))

(defn list-role-policies
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest`

  returns: Result of the ListRolePolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest request]
    (-> this (.listRolePolicies request))))

(defn delete-service-linked-role
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest`

  returns: Result of the DeleteServiceLinkedRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest request]
    (-> this (.deleteServiceLinkedRole request))))

(defn list-attached-group-policies
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest`

  returns: Result of the ListAttachedGroupPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest request]
    (-> this (.listAttachedGroupPolicies request))))

(defn update-service-specific-credential
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest`

  returns: Result of the UpdateServiceSpecificCredential operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest request]
    (-> this (.updateServiceSpecificCredential request))))

(defn simulate-principal-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest`

  returns: Result of the SimulatePrincipalPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest request]
    (-> this (.simulatePrincipalPolicy request))))

(defn update-server-certificate
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest`

  returns: Result of the UpdateServerCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest request]
    (-> this (.updateServerCertificate request))))

(defn delete-server-certificate
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest`

  returns: Result of the DeleteServerCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest request]
    (-> this (.deleteServerCertificate request))))

(defn delete-group-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest`

  returns: Result of the DeleteGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest request]
    (-> this (.deleteGroupPolicy request))))

(defn create-saml-provider
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest`

  returns: Result of the CreateSAMLProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest request]
    (-> this (.createSAMLProvider request))))

(defn list-instance-profiles
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest`

  returns: Result of the ListInstanceProfiles operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest request]
    (-> this (.listInstanceProfiles request)))
  (^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listInstanceProfiles))))

(defn attach-group-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest`

  returns: Result of the AttachGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest request]
    (-> this (.attachGroupPolicy request))))

(defn tag-role
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.TagRoleRequest`

  returns: Result of the TagRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.TagRoleResult`"
  (^com.amazonaws.services.identitymanagement.model.TagRoleResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.TagRoleRequest request]
    (-> this (.tagRole request))))

(defn list-users
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListUsersResult`"
  (^com.amazonaws.services.identitymanagement.model.ListUsersResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListUsersRequest request]
    (-> this (.listUsers request)))
  (^com.amazonaws.services.identitymanagement.model.ListUsersResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listUsers))))

(defn get-account-password-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest`

  returns: Result of the GetAccountPasswordPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest request]
    (-> this (.getAccountPasswordPolicy request)))
  (^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult [^AbstractAmazonIdentityManagement this]
    (-> this (.getAccountPasswordPolicy))))

(defn detach-role-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest`

  returns: Result of the DetachRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest request]
    (-> this (.detachRolePolicy request))))

(defn create-virtual-mfa-device
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest`

  returns: Result of the CreateVirtualMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest request]
    (-> this (.createVirtualMFADevice request))))

(defn upload-signing-certificate
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest`

  returns: Result of the UploadSigningCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult`"
  (^com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest request]
    (-> this (.uploadSigningCertificate request))))

(defn update-account-password-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest`

  returns: Result of the UpdateAccountPasswordPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest request]
    (-> this (.updateAccountPasswordPolicy request))))

(defn create-login-profile
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest`

  returns: Result of the CreateLoginProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest request]
    (-> this (.createLoginProfile request))))

(defn create-user
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateUserResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateUserResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn create-service-specific-credential
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest`

  returns: Result of the CreateServiceSpecificCredential operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest request]
    (-> this (.createServiceSpecificCredential request))))

(defn delete-user
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteUserResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteUserResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn list-user-policies
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest`

  returns: Result of the ListUserPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest request]
    (-> this (.listUserPolicies request))))

(defn delete-role-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest`

  returns: Result of the DeleteRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest request]
    (-> this (.deleteRolePolicy request))))

(defn generate-service-last-accessed-details
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest`

  returns: Result of the GenerateServiceLastAccessedDetails operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsResult`"
  (^com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest request]
    (-> this (.generateServiceLastAccessedDetails request))))

(defn list-open-id-connect-providers
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest`

  returns: Result of the ListOpenIDConnectProviders operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult`"
  (^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest request]
    (-> this (.listOpenIDConnectProviders request)))
  (^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listOpenIDConnectProviders))))

(defn delete-login-profile
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest`

  returns: Result of the DeleteLoginProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest request]
    (-> this (.deleteLoginProfile request))))

(defn upload-server-certificate
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest`

  returns: Result of the UploadServerCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult`"
  (^com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest request]
    (-> this (.uploadServerCertificate request))))

(defn delete-account-password-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest`

  returns: Result of the DeleteAccountPasswordPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest request]
    (-> this (.deleteAccountPasswordPolicy request)))
  (^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult [^AbstractAmazonIdentityManagement this]
    (-> this (.deleteAccountPasswordPolicy))))

(defn create-open-id-connect-provider
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest`

  returns: Result of the CreateOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest request]
    (-> this (.createOpenIDConnectProvider request))))

(defn create-policy-version
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest`

  returns: Result of the CreatePolicyVersion operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult`"
  (^com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest request]
    (-> this (.createPolicyVersion request))))

(defn deactivate-mfa-device
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest`

  returns: Result of the DeactivateMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult`"
  (^com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest request]
    (-> this (.deactivateMFADevice request))))

(defn resync-mfa-device
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest`

  returns: Result of the ResyncMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult`"
  (^com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest request]
    (-> this (.resyncMFADevice request))))

(defn update-role-description
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest`

  returns: Result of the UpdateRoleDescription operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest request]
    (-> this (.updateRoleDescription request))))

(defn list-groups-for-user
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest`

  returns: Result of the ListGroupsForUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult`"
  (^com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest request]
    (-> this (.listGroupsForUser request))))

(defn set-security-token-service-preferences
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest`

  returns: Result of the SetSecurityTokenServicePreferences operation returned by the service. - `com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesResult`"
  (^com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest request]
    (-> this (.setSecurityTokenServicePreferences request))))

(defn untag-role
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UntagRoleRequest`

  returns: Result of the UntagRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UntagRoleResult`"
  (^com.amazonaws.services.identitymanagement.model.UntagRoleResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UntagRoleRequest request]
    (-> this (.untagRole request))))

(defn list-access-keys
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest`

  returns: Result of the ListAccessKeys operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAccessKeysResult`"
  (^com.amazonaws.services.identitymanagement.model.ListAccessKeysResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest request]
    (-> this (.listAccessKeys request)))
  (^com.amazonaws.services.identitymanagement.model.ListAccessKeysResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listAccessKeys))))

(defn delete-policy-version
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest`

  returns: Result of the DeletePolicyVersion operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult`"
  (^com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest request]
    (-> this (.deletePolicyVersion request))))

(defn delete-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeletePolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.DeletePolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeletePolicyRequest request]
    (-> this (.deletePolicy request))))

(defn change-password
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ChangePasswordRequest`

  returns: Result of the ChangePassword operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ChangePasswordResult`"
  (^com.amazonaws.services.identitymanagement.model.ChangePasswordResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ChangePasswordRequest request]
    (-> this (.changePassword request))))

(defn list-role-tags
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest`

  returns: Result of the ListRoleTags operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListRoleTagsResult`"
  (^com.amazonaws.services.identitymanagement.model.ListRoleTagsResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest request]
    (-> this (.listRoleTags request))))

(defn shutdown
  "Description copied from interface: AmazonIdentityManagement"
  ([^AbstractAmazonIdentityManagement this]
    (-> this (.shutdown))))

(defn get-account-authorization-details
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest`

  returns: Result of the GetAccountAuthorizationDetails operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult`"
  (^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest request]
    (-> this (.getAccountAuthorizationDetails request)))
  (^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult [^AbstractAmazonIdentityManagement this]
    (-> this (.getAccountAuthorizationDetails))))

(defn get-user
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetUserRequest`

  returns: Result of the GetUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetUserResult`"
  (^com.amazonaws.services.identitymanagement.model.GetUserResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetUserRequest request]
    (-> this (.getUser request)))
  (^com.amazonaws.services.identitymanagement.model.GetUserResult [^AbstractAmazonIdentityManagement this]
    (-> this (.getUser))))

(defn delete-service-specific-credential
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest`

  returns: Result of the DeleteServiceSpecificCredential operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest request]
    (-> this (.deleteServiceSpecificCredential request))))

(defn get-service-last-accessed-details
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest`

  returns: Result of the GetServiceLastAccessedDetails operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsResult`"
  (^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest request]
    (-> this (.getServiceLastAccessedDetails request))))

(defn set-endpoint
  "Description copied from interface: AmazonIdentityManagement

  endpoint - The endpoint (ex: \"iam.amazonaws.com\") or a full URL, including the protocol (ex: \"iam.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonIdentityManagement this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn list-virtual-mfa-devices
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest`

  returns: Result of the ListVirtualMFADevices operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest request]
    (-> this (.listVirtualMFADevices request)))
  (^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listVirtualMFADevices))))

(defn delete-user-permissions-boundary
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest`

  returns: Result of the DeleteUserPermissionsBoundary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest request]
    (-> this (.deleteUserPermissionsBoundary request))))

(defn get-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.GetPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetPolicyRequest request]
    (-> this (.getPolicy request))))

(defn remove-role-from-instance-profile
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest`

  returns: Result of the RemoveRoleFromInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult`"
  (^com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest request]
    (-> this (.removeRoleFromInstanceProfile request))))

(defn list-policy-versions
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest`

  returns: Result of the ListPolicyVersions operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult`"
  (^com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest request]
    (-> this (.listPolicyVersions request))))

(defn upload-ssh-public-key
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest`

  returns: Result of the UploadSSHPublicKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult`"
  (^com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest request]
    (-> this (.uploadSSHPublicKey request))))

(defn delete-access-key
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest`

  returns: Result of the DeleteAccessKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest request]
    (-> this (.deleteAccessKey request))))

(defn get-service-linked-role-deletion-status
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest`

  returns: Result of the GetServiceLinkedRoleDeletionStatus operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult`"
  (^com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest request]
    (-> this (.getServiceLinkedRoleDeletionStatus request))))

(defn delete-ssh-public-key
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest`

  returns: Result of the DeleteSSHPublicKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest request]
    (-> this (.deleteSSHPublicKey request))))

(defn list-account-aliases
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest`

  returns: Result of the ListAccountAliases operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest request]
    (-> this (.listAccountAliases request)))
  (^com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listAccountAliases))))

(defn list-entities-for-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest`

  returns: Result of the ListEntitiesForPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest request]
    (-> this (.listEntitiesForPolicy request))))

(defn update-access-key
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest`

  returns: Result of the UpdateAccessKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest request]
    (-> this (.updateAccessKey request))))

(defn put-user-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest`

  returns: Result of the PutUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutUserPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.PutUserPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest request]
    (-> this (.putUserPolicy request))))

(defn update-open-id-connect-provider-thumbprint
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest`

  returns: Result of the UpdateOpenIDConnectProviderThumbprint operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest request]
    (-> this (.updateOpenIDConnectProviderThumbprint request))))

(defn delete-open-id-connect-provider
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest`

  returns: Result of the DeleteOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest request]
    (-> this (.deleteOpenIDConnectProvider request))))

(defn get-context-keys-for-principal-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest`

  returns: Result of the GetContextKeysForPrincipalPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest request]
    (-> this (.getContextKeysForPrincipalPolicy request))))

(defn detach-user-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest`

  returns: Result of the DetachUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest request]
    (-> this (.detachUserPolicy request))))

(defn attach-user-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest`

  returns: Result of the AttachUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest request]
    (-> this (.attachUserPolicy request))))

(defn put-group-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest`

  returns: Result of the PutGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest request]
    (-> this (.putGroupPolicy request))))

(defn list-mfa-devices
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest`

  returns: Result of the ListMFADevices operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListMFADevicesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListMFADevicesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest request]
    (-> this (.listMFADevices request)))
  (^com.amazonaws.services.identitymanagement.model.ListMFADevicesResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listMFADevices))))

(defn get-access-key-last-used
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest`

  returns: Result of the GetAccessKeyLastUsed operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult`"
  (^com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest request]
    (-> this (.getAccessKeyLastUsed request))))

(defn delete-instance-profile
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest`

  returns: Result of the DeleteInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest request]
    (-> this (.deleteInstanceProfile request))))

(defn get-organizations-access-report
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest`

  returns: Result of the GetOrganizationsAccessReport operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportResult`"
  (^com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest request]
    (-> this (.getOrganizationsAccessReport request))))

(defn put-user-permissions-boundary
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest`

  returns: Result of the PutUserPermissionsBoundary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryResult`"
  (^com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest request]
    (-> this (.putUserPermissionsBoundary request))))

(defn list-groups
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListGroupsResult`"
  (^com.amazonaws.services.identitymanagement.model.ListGroupsResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListGroupsRequest request]
    (-> this (.listGroups request)))
  (^com.amazonaws.services.identitymanagement.model.ListGroupsResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listGroups))))

(defn create-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreatePolicyRequest`

  returns: Result of the CreatePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreatePolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.CreatePolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreatePolicyRequest request]
    (-> this (.createPolicy request))))

(defn list-instance-profiles-for-role
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest`

  returns: Result of the ListInstanceProfilesForRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult`"
  (^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest request]
    (-> this (.listInstanceProfilesForRole request))))

(defn enable-mfa-device
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest`

  returns: Result of the EnableMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult`"
  (^com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest request]
    (-> this (.enableMFADevice request))))

(defn create-service-linked-role
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest`

  returns: Result of the CreateServiceLinkedRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest request]
    (-> this (.createServiceLinkedRole request))))

(defn get-credential-report
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest`

  returns: Result of the GetCredentialReport operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetCredentialReportResult`"
  (^com.amazonaws.services.identitymanagement.model.GetCredentialReportResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest request]
    (-> this (.getCredentialReport request)))
  (^com.amazonaws.services.identitymanagement.model.GetCredentialReportResult [^AbstractAmazonIdentityManagement this]
    (-> this (.getCredentialReport))))

(defn reset-service-specific-credential
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest`

  returns: Result of the ResetServiceSpecificCredential operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult`"
  (^com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest request]
    (-> this (.resetServiceSpecificCredential request))))

(defn list-policies
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListPoliciesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListPoliciesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListPoliciesRequest request]
    (-> this (.listPolicies request)))
  (^com.amazonaws.services.identitymanagement.model.ListPoliciesResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listPolicies))))

(defn delete-saml-provider
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest`

  returns: Result of the DeleteSAMLProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest request]
    (-> this (.deleteSAMLProvider request))))

(defn put-role-permissions-boundary
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest`

  returns: Result of the PutRolePermissionsBoundary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryResult`"
  (^com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest request]
    (-> this (.putRolePermissionsBoundary request))))

(defn get-server-certificate
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest`

  returns: Result of the GetServerCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetServerCertificateResult`"
  (^com.amazonaws.services.identitymanagement.model.GetServerCertificateResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest request]
    (-> this (.getServerCertificate request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonIdentityManagement

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonIdentityManagement this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-saml-provider
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest`

  returns: Result of the GetSAMLProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult`"
  (^com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest request]
    (-> this (.getSAMLProvider request))))

(defn get-policy-version
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest`

  returns: Result of the GetPolicyVersion operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult`"
  (^com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest request]
    (-> this (.getPolicyVersion request))))

(defn get-user-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest`

  returns: Result of the GetUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetUserPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.GetUserPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest request]
    (-> this (.getUserPolicy request))))

(defn add-user-to-group
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest`

  returns: Result of the AddUserToGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AddUserToGroupResult`"
  (^com.amazonaws.services.identitymanagement.model.AddUserToGroupResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest request]
    (-> this (.addUserToGroup request))))

(defn untag-user
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UntagUserRequest`

  returns: Result of the UntagUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UntagUserResult`"
  (^com.amazonaws.services.identitymanagement.model.UntagUserResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UntagUserRequest request]
    (-> this (.untagUser request))))

(defn update-login-profile
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest`

  returns: Result of the UpdateLoginProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest request]
    (-> this (.updateLoginProfile request))))

(defn list-attached-role-policies
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest`

  returns: Result of the ListAttachedRolePolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest request]
    (-> this (.listAttachedRolePolicies request))))

(defn update-saml-provider
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest`

  returns: Result of the UpdateSAMLProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest request]
    (-> this (.updateSAMLProvider request))))

(defn list-ssh-public-keys
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest`

  returns: Result of the ListSSHPublicKeys operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult`"
  (^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest request]
    (-> this (.listSSHPublicKeys request)))
  (^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listSSHPublicKeys))))

(defn list-user-tags
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListUserTagsRequest`

  returns: Result of the ListUserTags operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListUserTagsResult`"
  (^com.amazonaws.services.identitymanagement.model.ListUserTagsResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListUserTagsRequest request]
    (-> this (.listUserTags request))))

(defn get-service-last-accessed-details-with-entities
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest`

  returns: Result of the GetServiceLastAccessedDetailsWithEntities operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesResult`"
  (^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest request]
    (-> this (.getServiceLastAccessedDetailsWithEntities request))))

(defn get-account-summary
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest`

  returns: Result of the GetAccountSummary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult`"
  (^com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest request]
    (-> this (.getAccountSummary request)))
  (^com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult [^AbstractAmazonIdentityManagement this]
    (-> this (.getAccountSummary))))

(defn update-assume-role-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest`

  returns: Result of the UpdateAssumeRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest request]
    (-> this (.updateAssumeRolePolicy request))))

(defn add-client-id-to-open-id-connect-provider
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest`

  returns: Result of the AddClientIDToOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult`"
  (^com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest request]
    (-> this (.addClientIDToOpenIDConnectProvider request))))

(defn update-ssh-public-key
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest`

  returns: Result of the UpdateSSHPublicKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult`"
  (^com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest request]
    (-> this (.updateSSHPublicKey request))))

(defn list-group-policies
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest`

  returns: Result of the ListGroupPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest request]
    (-> this (.listGroupPolicies request))))

(defn get-open-id-connect-provider
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest`

  returns: Result of the GetOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult`"
  (^com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest request]
    (-> this (.getOpenIDConnectProvider request))))

(defn create-access-key
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest`

  returns: Result of the CreateAccessKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest request]
    (-> this (.createAccessKey request)))
  (^com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult [^AbstractAmazonIdentityManagement this]
    (-> this (.createAccessKey))))

(defn get-group-policy
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest`

  returns: Result of the GetGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult`"
  (^com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest request]
    (-> this (.getGroupPolicy request))))

(defn create-instance-profile
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest`

  returns: Result of the CreateInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult`"
  (^com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest request]
    (-> this (.createInstanceProfile request))))

(defn delete-signing-certificate
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest`

  returns: Result of the DeleteSigningCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest request]
    (-> this (.deleteSigningCertificate request))))

(defn delete-virtual-mfa-device
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest`

  returns: Result of the DeleteVirtualMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest request]
    (-> this (.deleteVirtualMFADevice request))))

(defn get-group
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetGroupResult`"
  (^com.amazonaws.services.identitymanagement.model.GetGroupResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.GetGroupRequest request]
    (-> this (.getGroup request))))

(defn delete-role
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.DeleteRoleRequest`

  returns: Result of the DeleteRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteRoleResult`"
  (^com.amazonaws.services.identitymanagement.model.DeleteRoleResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.DeleteRoleRequest request]
    (-> this (.deleteRole request))))

(defn list-roles
  "Description copied from interface: AmazonIdentityManagement

  request - `com.amazonaws.services.identitymanagement.model.ListRolesRequest`

  returns: Result of the ListRoles operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListRolesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListRolesResult [^AbstractAmazonIdentityManagement this ^com.amazonaws.services.identitymanagement.model.ListRolesRequest request]
    (-> this (.listRoles request)))
  (^com.amazonaws.services.identitymanagement.model.ListRolesResult [^AbstractAmazonIdentityManagement this]
    (-> this (.listRoles))))

