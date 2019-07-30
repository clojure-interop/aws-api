(ns com.amazonaws.services.cognitoidp.AbstractAWSCognitoIdentityProvider
  "Abstract implementation of AWSCognitoIdentityProvider. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cognitoidp AbstractAWSCognitoIdentityProvider]))

(defn create-resource-server
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest`

  returns: Result of the CreateResourceServer operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateResourceServerResult`"
  (^com.amazonaws.services.cognitoidp.model.CreateResourceServerResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest request]
    (-> this (.createResourceServer request))))

(defn delete-group
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteGroupResult`"
  (^com.amazonaws.services.cognitoidp.model.DeleteGroupResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn describe-resource-server
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest`

  returns: Result of the DescribeResourceServer operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult`"
  (^com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest request]
    (-> this (.describeResourceServer request))))

(defn delete-user-attributes
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to delete user attributes. - `com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest`

  returns: Result of the DeleteUserAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult`"
  (^com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest request]
    (-> this (.deleteUserAttributes request))))

(defn set-ui-customization
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest`

  returns: Result of the SetUICustomization operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetUICustomizationResult`"
  (^com.amazonaws.services.cognitoidp.model.SetUICustomizationResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest request]
    (-> this (.setUICustomization request))))

(defn admin-list-devices
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to list devices, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest`

  returns: Result of the AdminListDevices operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminListDevicesResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminListDevicesResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest request]
    (-> this (.adminListDevices request))))

(defn update-group
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateGroupResult`"
  (^com.amazonaws.services.cognitoidp.model.UpdateGroupResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn resend-confirmation-code
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to resend the confirmation code. - `com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest`

  returns: Result of the ResendConfirmationCode operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult`"
  (^com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest request]
    (-> this (.resendConfirmationCode request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.cognitoidp.model.ListTagsForResourceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-user-import-job
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to describe the user import job. - `com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest`

  returns: Result of the DescribeUserImportJob operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult`"
  (^com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest request]
    (-> this (.describeUserImportJob request))))

(defn get-signing-certificate
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Request to get a signing certificate from Cognito. - `com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest`

  returns: Result of the GetSigningCertificate operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult`"
  (^com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest request]
    (-> this (.getSigningCertificate request))))

(defn describe-identity-provider
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest`

  returns: Result of the DescribeIdentityProvider operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult`"
  (^com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest request]
    (-> this (.describeIdentityProvider request))))

(defn set-region
  "Description copied from interface: AWSCognitoIdentityProvider

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-user-pool
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to describe the user pool. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest`

  returns: Result of the DescribeUserPool operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult`"
  (^com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest request]
    (-> this (.describeUserPool request))))

(defn create-group
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateGroupResult`"
  (^com.amazonaws.services.cognitoidp.model.CreateGroupResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn get-ui-customization
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest`

  returns: Result of the GetUICustomization operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetUICustomizationResult`"
  (^com.amazonaws.services.cognitoidp.model.GetUICustomizationResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest request]
    (-> this (.getUICustomization request))))

(defn create-user-import-job
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to create the user import job. - `com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest`

  returns: Result of the CreateUserImportJob operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult`"
  (^com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest request]
    (-> this (.createUserImportJob request))))

(defn global-sign-out
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to sign out all devices. - `com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest`

  returns: Result of the GlobalSignOut operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GlobalSignOutResult`"
  (^com.amazonaws.services.cognitoidp.model.GlobalSignOutResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest request]
    (-> this (.globalSignOut request))))

(defn admin-list-user-auth-events
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest`

  returns: Result of the AdminListUserAuthEvents operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest request]
    (-> this (.adminListUserAuthEvents request))))

(defn delete-user-pool
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to delete a user pool. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest`

  returns: Result of the DeleteUserPool operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult`"
  (^com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest request]
    (-> this (.deleteUserPool request))))

(defn admin-delete-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to delete a user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest`

  returns: Result of the AdminDeleteUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest request]
    (-> this (.adminDeleteUser request))))

(defn forget-device
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to forget the device. - `com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest`

  returns: Result of the ForgetDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ForgetDeviceResult`"
  (^com.amazonaws.services.cognitoidp.model.ForgetDeviceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest request]
    (-> this (.forgetDevice request))))

(defn get-identity-provider-by-identifier
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest`

  returns: Result of the GetIdentityProviderByIdentifier operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult`"
  (^com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest request]
    (-> this (.getIdentityProviderByIdentifier request))))

(defn confirm-device
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Confirms the device request. - `com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest`

  returns: Result of the ConfirmDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult`"
  (^com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest request]
    (-> this (.confirmDevice request))))

(defn associate-software-token
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest`

  returns: Result of the AssociateSoftwareToken operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult`"
  (^com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest request]
    (-> this (.associateSoftwareToken request))))

(defn untag-resource
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UntagResourceResult`"
  (^com.amazonaws.services.cognitoidp.model.UntagResourceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn describe-user-pool-client
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to describe a user pool client. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest`

  returns: Result of the DescribeUserPoolClient operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult`"
  (^com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest request]
    (-> this (.describeUserPoolClient request))))

(defn admin-update-auth-event-feedback
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest`

  returns: Result of the AdminUpdateAuthEventFeedback operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest request]
    (-> this (.adminUpdateAuthEventFeedback request))))

(defn describe-user-pool-domain
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest`

  returns: Result of the DescribeUserPoolDomain operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult`"
  (^com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest request]
    (-> this (.describeUserPoolDomain request))))

(defn list-users
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to list users. - `com.amazonaws.services.cognitoidp.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUsersResult`"
  (^com.amazonaws.services.cognitoidp.model.ListUsersResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn respond-to-auth-challenge
  "Description copied from interface: AWSCognitoIdentityProvider

  request - The request to respond to an authentication challenge. - `com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest`

  returns: Result of the RespondToAuthChallenge operation returned by the service. - `com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult`"
  (^com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest request]
    (-> this (.respondToAuthChallenge request))))

(defn admin-disable-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to disable any user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest`

  returns: Result of the AdminDisableUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminDisableUserResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminDisableUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest request]
    (-> this (.adminDisableUser request))))

(defn list-user-import-jobs
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to list the user import jobs. - `com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest`

  returns: Result of the ListUserImportJobs operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult`"
  (^com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest request]
    (-> this (.listUserImportJobs request))))

(defn list-devices
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to list the devices. - `com.amazonaws.services.cognitoidp.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListDevicesResult`"
  (^com.amazonaws.services.cognitoidp.model.ListDevicesResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListDevicesRequest request]
    (-> this (.listDevices request))))

(defn delete-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to delete a user. - `com.amazonaws.services.cognitoidp.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserResult`"
  (^com.amazonaws.services.cognitoidp.model.DeleteUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn update-resource-server
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest`

  returns: Result of the UpdateResourceServer operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult`"
  (^com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest request]
    (-> this (.updateResourceServer request))))

(defn admin-delete-user-attributes
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to delete user attributes as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest`

  returns: Result of the AdminDeleteUserAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest request]
    (-> this (.adminDeleteUserAttributes request))))

(defn admin-set-user-password
  "request - `com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest`

  returns: Result of the AdminSetUserPassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest request]
    (-> this (.adminSetUserPassword request))))

(defn describe-risk-configuration
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest`

  returns: Result of the DescribeRiskConfiguration operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult`"
  (^com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest request]
    (-> this (.describeRiskConfiguration request))))

(defn admin-remove-user-from-group
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest`

  returns: Result of the AdminRemoveUserFromGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest request]
    (-> this (.adminRemoveUserFromGroup request))))

(defn admin-disable-provider-for-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest`

  returns: Result of the AdminDisableProviderForUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest request]
    (-> this (.adminDisableProviderForUser request))))

(defn confirm-forgot-password
  "Description copied from interface: AWSCognitoIdentityProvider

  request - The request representing the confirmation for a password reset. - `com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest`

  returns: Result of the ConfirmForgotPassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult`"
  (^com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest request]
    (-> this (.confirmForgotPassword request))))

(defn change-password
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to change a user password. - `com.amazonaws.services.cognitoidp.model.ChangePasswordRequest`

  returns: Result of the ChangePassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ChangePasswordResult`"
  (^com.amazonaws.services.cognitoidp.model.ChangePasswordResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ChangePasswordRequest request]
    (-> this (.changePassword request))))

(defn update-user-attributes
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to update user attributes. - `com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest`

  returns: Result of the UpdateUserAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult`"
  (^com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest request]
    (-> this (.updateUserAttributes request))))

(defn shutdown
  "Description copied from interface: AWSCognitoIdentityProvider"
  ([^AbstractAWSCognitoIdentityProvider this]
    (-> this (.shutdown))))

(defn admin-get-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to get the specified user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminGetUserRequest`

  returns: Result of the AdminGetUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminGetUserResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminGetUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminGetUserRequest request]
    (-> this (.adminGetUser request))))

(defn sign-up
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to register a user. - `com.amazonaws.services.cognitoidp.model.SignUpRequest`

  returns: Result of the SignUp operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SignUpResult`"
  (^com.amazonaws.services.cognitoidp.model.SignUpResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.SignUpRequest request]
    (-> this (.signUp request))))

(defn update-user-pool
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to update the user pool. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest`

  returns: Result of the UpdateUserPool operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult`"
  (^com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest request]
    (-> this (.updateUserPool request))))

(defn get-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to get information about the user. - `com.amazonaws.services.cognitoidp.model.GetUserRequest`

  returns: Result of the GetUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetUserResult`"
  (^com.amazonaws.services.cognitoidp.model.GetUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GetUserRequest request]
    (-> this (.getUser request))))

(defn start-user-import-job
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to start the user import job. - `com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest`

  returns: Result of the StartUserImportJob operation returned by the service. - `com.amazonaws.services.cognitoidp.model.StartUserImportJobResult`"
  (^com.amazonaws.services.cognitoidp.model.StartUserImportJobResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest request]
    (-> this (.startUserImportJob request))))

(defn set-endpoint
  "Description copied from interface: AWSCognitoIdentityProvider

  endpoint - The endpoint (ex: \"cognito-idp.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://cognito-idp.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSCognitoIdentityProvider this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-user-pool-client
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to update the user pool client. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest`

  returns: Result of the UpdateUserPoolClient operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult`"
  (^com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest request]
    (-> this (.updateUserPoolClient request))))

(defn admin-enable-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request that enables the user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest`

  returns: Result of the AdminEnableUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminEnableUserResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminEnableUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest request]
    (-> this (.adminEnableUser request))))

(defn get-device
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to get the device. - `com.amazonaws.services.cognitoidp.model.GetDeviceRequest`

  returns: Result of the GetDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetDeviceResult`"
  (^com.amazonaws.services.cognitoidp.model.GetDeviceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GetDeviceRequest request]
    (-> this (.getDevice request))))

(defn list-identity-providers
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest`

  returns: Result of the ListIdentityProviders operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult`"
  (^com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest request]
    (-> this (.listIdentityProviders request))))

(defn delete-resource-server
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest`

  returns: Result of the DeleteResourceServer operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult`"
  (^com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest request]
    (-> this (.deleteResourceServer request))))

(defn admin-set-user-mfa-preference
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest`

  returns: Result of the AdminSetUserMFAPreference operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest request]
    (-> this (.adminSetUserMFAPreference request))))

(defn verify-software-token
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest`

  returns: Result of the VerifySoftwareToken operation returned by the service. - `com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult`"
  (^com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest request]
    (-> this (.verifySoftwareToken request))))

(defn set-user-pool-mfa-config
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest`

  returns: Result of the SetUserPoolMfaConfig operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult`"
  (^com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest request]
    (-> this (.setUserPoolMfaConfig request))))

(defn create-user-pool
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to create a user pool. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest`

  returns: Result of the CreateUserPool operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolResult`"
  (^com.amazonaws.services.cognitoidp.model.CreateUserPoolResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest request]
    (-> this (.createUserPool request))))

(defn delete-user-pool-client
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to delete a user pool client. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest`

  returns: Result of the DeleteUserPoolClient operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult`"
  (^com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest request]
    (-> this (.deleteUserPoolClient request))))

(defn admin-reset-user-password
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to reset a user's password as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest`

  returns: Result of the AdminResetUserPassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest request]
    (-> this (.adminResetUserPassword request))))

(defn stop-user-import-job
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to stop the user import job. - `com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest`

  returns: Result of the StopUserImportJob operation returned by the service. - `com.amazonaws.services.cognitoidp.model.StopUserImportJobResult`"
  (^com.amazonaws.services.cognitoidp.model.StopUserImportJobResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest request]
    (-> this (.stopUserImportJob request))))

(defn admin-list-groups-for-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest`

  returns: Result of the AdminListGroupsForUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest request]
    (-> this (.adminListGroupsForUser request))))

(defn admin-link-provider-for-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest`

  returns: Result of the AdminLinkProviderForUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest request]
    (-> this (.adminLinkProviderForUser request))))

(defn get-csv-header
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to get the header information for the .csv file for the user import job. - `com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest`

  returns: Result of the GetCSVHeader operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult`"
  (^com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest request]
    (-> this (.getCSVHeader request))))

(defn delete-user-pool-domain
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest`

  returns: Result of the DeleteUserPoolDomain operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult`"
  (^com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest request]
    (-> this (.deleteUserPoolDomain request))))

(defn delete-identity-provider
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest`

  returns: Result of the DeleteIdentityProvider operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult`"
  (^com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest request]
    (-> this (.deleteIdentityProvider request))))

(defn add-custom-attributes
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to add custom attributes. - `com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest`

  returns: Result of the AddCustomAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult`"
  (^com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest request]
    (-> this (.addCustomAttributes request))))

(defn create-user-pool-client
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to create a user pool client. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest`

  returns: Result of the CreateUserPoolClient operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult`"
  (^com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest request]
    (-> this (.createUserPoolClient request))))

(defn get-user-attribute-verification-code
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to get user attribute verification. - `com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest`

  returns: Result of the GetUserAttributeVerificationCode operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult`"
  (^com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest request]
    (-> this (.getUserAttributeVerificationCode request))))

(defn admin-forget-device
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Sends the forgot device request, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest`

  returns: Result of the AdminForgetDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest request]
    (-> this (.adminForgetDevice request))))

(defn admin-update-user-attributes
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to update the user's attributes as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest`

  returns: Result of the AdminUpdateUserAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest request]
    (-> this (.adminUpdateUserAttributes request))))

(defn list-groups
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListGroupsResult`"
  (^com.amazonaws.services.cognitoidp.model.ListGroupsResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn list-user-pools
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to list user pools. - `com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest`

  returns: Result of the ListUserPools operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUserPoolsResult`"
  (^com.amazonaws.services.cognitoidp.model.ListUserPoolsResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest request]
    (-> this (.listUserPools request))))

(defn admin-get-device
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to get the device, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest`

  returns: Result of the AdminGetDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest request]
    (-> this (.adminGetDevice request))))

(defn confirm-sign-up
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to confirm registration of a user. - `com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest`

  returns: Result of the ConfirmSignUp operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult`"
  (^com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest request]
    (-> this (.confirmSignUp request))))

(defn list-user-pool-clients
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to list the user pool clients. - `com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest`

  returns: Result of the ListUserPoolClients operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult`"
  (^com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest request]
    (-> this (.listUserPoolClients request))))

(defn set-user-mfa-preference
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest`

  returns: Result of the SetUserMFAPreference operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult`"
  (^com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest request]
    (-> this (.setUserMFAPreference request))))

(defn admin-add-user-to-group
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest`

  returns: Result of the AdminAddUserToGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest request]
    (-> this (.adminAddUserToGroup request))))

(defn admin-user-global-sign-out
  "Description copied from interface: AWSCognitoIdentityProvider

  request - The request to sign out of all devices, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest`

  returns: Result of the AdminUserGlobalSignOut operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest request]
    (-> this (.adminUserGlobalSignOut request))))

(defn get-user-pool-mfa-config
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest`

  returns: Result of the GetUserPoolMfaConfig operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult`"
  (^com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest request]
    (-> this (.getUserPoolMfaConfig request))))

(defn admin-set-user-settings
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to set user settings as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest`

  returns: Result of the AdminSetUserSettings operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest request]
    (-> this (.adminSetUserSettings request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCognitoIdentityProvider

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn admin-initiate-auth
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Initiates the authorization request, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest`

  returns: Result of the AdminInitiateAuth operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest request]
    (-> this (.adminInitiateAuth request))))

(defn admin-update-device-status
  "Description copied from interface: AWSCognitoIdentityProvider

  request - The request to update the device status, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest`

  returns: Result of the AdminUpdateDeviceStatus operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest request]
    (-> this (.adminUpdateDeviceStatus request))))

(defn initiate-auth
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Initiates the authentication request. - `com.amazonaws.services.cognitoidp.model.InitiateAuthRequest`

  returns: Result of the InitiateAuth operation returned by the service. - `com.amazonaws.services.cognitoidp.model.InitiateAuthResult`"
  (^com.amazonaws.services.cognitoidp.model.InitiateAuthResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.InitiateAuthRequest request]
    (-> this (.initiateAuth request))))

(defn admin-create-user
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to create a user in the specified user pool. - `com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest`

  returns: Result of the AdminCreateUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminCreateUserResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminCreateUserResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest request]
    (-> this (.adminCreateUser request))))

(defn list-users-in-group
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest`

  returns: Result of the ListUsersInGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult`"
  (^com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest request]
    (-> this (.listUsersInGroup request))))

(defn forgot-password
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to reset a user's password. - `com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest`

  returns: Result of the ForgotPassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ForgotPasswordResult`"
  (^com.amazonaws.services.cognitoidp.model.ForgotPasswordResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest request]
    (-> this (.forgotPassword request))))

(defn tag-resource
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cognitoidp.model.TagResourceResult`"
  (^com.amazonaws.services.cognitoidp.model.TagResourceResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn set-user-settings
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to set user settings. - `com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest`

  returns: Result of the SetUserSettings operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetUserSettingsResult`"
  (^com.amazonaws.services.cognitoidp.model.SetUserSettingsResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest request]
    (-> this (.setUserSettings request))))

(defn update-device-status
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to update the device status. - `com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest`

  returns: Result of the UpdateDeviceStatus operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult`"
  (^com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest request]
    (-> this (.updateDeviceStatus request))))

(defn update-user-pool-domain
  "Description copied from interface: AWSCognitoIdentityProvider

  request - The UpdateUserPoolDomain request input. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest`

  returns: Result of the UpdateUserPoolDomain operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainResult`"
  (^com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest request]
    (-> this (.updateUserPoolDomain request))))

(defn update-identity-provider
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest`

  returns: Result of the UpdateIdentityProvider operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult`"
  (^com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest request]
    (-> this (.updateIdentityProvider request))))

(defn list-resource-servers
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.ListResourceServersRequest`

  returns: Result of the ListResourceServers operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListResourceServersResult`"
  (^com.amazonaws.services.cognitoidp.model.ListResourceServersResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.ListResourceServersRequest request]
    (-> this (.listResourceServers request))))

(defn update-auth-event-feedback
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest`

  returns: Result of the UpdateAuthEventFeedback operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult`"
  (^com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest request]
    (-> this (.updateAuthEventFeedback request))))

(defn create-identity-provider
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest`

  returns: Result of the CreateIdentityProvider operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult`"
  (^com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest request]
    (-> this (.createIdentityProvider request))))

(defn admin-respond-to-auth-challenge
  "Description copied from interface: AWSCognitoIdentityProvider

  request - The request to respond to the authentication challenge, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest`

  returns: Result of the AdminRespondToAuthChallenge operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest request]
    (-> this (.adminRespondToAuthChallenge request))))

(defn verify-user-attribute
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to verify user attributes. - `com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest`

  returns: Result of the VerifyUserAttribute operation returned by the service. - `com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult`"
  (^com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest request]
    (-> this (.verifyUserAttribute request))))

(defn set-risk-configuration
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest`

  returns: Result of the SetRiskConfiguration operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult`"
  (^com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest request]
    (-> this (.setRiskConfiguration request))))

(defn get-group
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetGroupResult`"
  (^com.amazonaws.services.cognitoidp.model.GetGroupResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.GetGroupRequest request]
    (-> this (.getGroup request))))

(defn admin-confirm-sign-up
  "Description copied from interface: AWSCognitoIdentityProvider

  request - Represents the request to confirm user registration. - `com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest`

  returns: Result of the AdminConfirmSignUp operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult`"
  (^com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest request]
    (-> this (.adminConfirmSignUp request))))

(defn create-user-pool-domain
  "Description copied from interface: AWSCognitoIdentityProvider

  request - `com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest`

  returns: Result of the CreateUserPoolDomain operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult`"
  (^com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult [^AbstractAWSCognitoIdentityProvider this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest request]
    (-> this (.createUserPoolDomain request))))

