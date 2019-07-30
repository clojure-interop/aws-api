(ns com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClient
  "Client for accessing Amazon Cognito Identity Provider. All service calls made using this client are blocking, and
  will not return until the service call completes.


  Using the Amazon Cognito User Pools API, you can create a user pool to manage directories and users. You can
  authenticate a user to obtain tokens related to user identity and access policies.


  This API reference provides information about user pools in Amazon Cognito User Pools.


  For more information, see the Amazon Cognito Documentation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cognitoidp AWSCognitoIdentityProviderClient]))

(defn ->aws-cognito-identity-provider-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Cognito Identity Provider (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSCognitoIdentityProviderClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSCognitoIdentityProviderClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSCognitoIdentityProviderClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCognitoIdentityProviderClient aws-credentials client-configuration))
  (^AWSCognitoIdentityProviderClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCognitoIdentityProviderClient client-configuration))
  (^AWSCognitoIdentityProviderClient []
    (new AWSCognitoIdentityProviderClient )))

(defn *builder
  "returns: `com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder`"
  (^com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder []
    (AWSCognitoIdentityProviderClient/builder )))

(defn create-resource-server
  "Creates a new OAuth2.0 resource server and defines custom scopes in it.

  request - `com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest`

  returns: Result of the CreateResourceServer operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateResourceServerResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.CreateResourceServerResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest request]
    (-> this (.createResourceServer request))))

(defn delete-group
  "Deletes a group. Currently only groups with no members can be deleted.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteGroupResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.DeleteGroupResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn describe-resource-server
  "Describes a resource server.

  request - `com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest`

  returns: Result of the DescribeResourceServer operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest request]
    (-> this (.describeResourceServer request))))

(defn delete-user-attributes
  "Deletes the attributes for a user.

  request - `com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest`

  returns: Result of the DeleteUserAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest request]
    (-> this (.deleteUserAttributes request))))

(defn set-ui-customization
  "Sets the UI customization information for a user pool's built-in app UI.


   You can specify app UI customization settings for a single client (with a specific clientId) or for
   all clients (by setting the clientId to ALL). If you specify ALL, the
   default configuration will be used for every client that has no UI customization set previously. If you specify
   UI customization settings for a particular client, it will no longer fall back to the ALL
   configuration.



   To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the
   app's pages, and the service will throw an error.

  request - `com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest`

  returns: Result of the SetUICustomization operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetUICustomizationResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.SetUICustomizationResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest request]
    (-> this (.setUICustomization request))))

(defn admin-list-devices
  "Lists devices, as an administrator.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest`

  returns: Result of the AdminListDevices operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminListDevicesResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.AdminListDevicesResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest request]
    (-> this (.adminListDevices request))))

(defn update-group
  "Updates the specified group with the specified attributes.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateGroupResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.UpdateGroupResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn resend-confirmation-code
  "Resends the confirmation (for confirmation of registration) to a specific user in the user pool.

  request - `com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest`

  returns: Result of the ResendConfirmationCode operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest request]
    (-> this (.resendConfirmationCode request))))

(defn list-tags-for-resource
  "Lists the tags that are assigned to an Amazon Cognito user pool.


   A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by
   purpose, owner, environment, or other criteria.


   You can use this action up to 10 times per second, per account.

  request - `com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.ListTagsForResourceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-user-import-job
  "Describes the user import job.

  request - `com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest`

  returns: Result of the DescribeUserImportJob operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest request]
    (-> this (.describeUserImportJob request))))

(defn get-signing-certificate
  "This method takes a user pool ID, and returns the signing certificate.

  request - `com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest`

  returns: Result of the GetSigningCertificate operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult`

  throws: com.amazonaws.services.cognitoidp.model.InternalErrorException - This exception is thrown when Amazon Cognito encounters an internal error."
  (^com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest request]
    (-> this (.getSigningCertificate request))))

(defn describe-identity-provider
  "Gets information about a specific identity provider.

  request - `com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest`

  returns: Result of the DescribeIdentityProvider operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest request]
    (-> this (.describeIdentityProvider request))))

(defn describe-user-pool
  "Returns the configuration information and metadata of the specified user pool.

  request - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest`

  returns: Result of the DescribeUserPool operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest request]
    (-> this (.describeUserPool request))))

(defn create-group
  "Creates a new group in the specified user pool.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateGroupResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.CreateGroupResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn get-ui-customization
  "Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing
   is set for the particular client, but there is an existing pool level customization (app clientId
   will be ALL), then that is returned. If nothing is present, then an empty shape is returned.

  request - `com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest`

  returns: Result of the GetUICustomization operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetUICustomizationResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.GetUICustomizationResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest request]
    (-> this (.getUICustomization request))))

(defn create-user-import-job
  "Creates the user import job.

  request - `com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest`

  returns: Result of the CreateUserImportJob operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest request]
    (-> this (.createUserImportJob request))))

(defn global-sign-out
  "Signs out users from all devices.

  request - `com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest`

  returns: Result of the GlobalSignOut operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GlobalSignOutResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.GlobalSignOutResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest request]
    (-> this (.globalSignOut request))))

(defn admin-list-user-auth-events
  "Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.

  request - `com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest`

  returns: Result of the AdminListUserAuthEvents operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest request]
    (-> this (.adminListUserAuthEvents request))))

(defn delete-user-pool
  "Deletes the specified Amazon Cognito user pool.

  request - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest`

  returns: Result of the DeleteUserPool operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest request]
    (-> this (.deleteUserPool request))))

(defn admin-delete-user
  "Deletes a user as an administrator. Works on any user.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest`

  returns: Result of the AdminDeleteUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest request]
    (-> this (.adminDeleteUser request))))

(defn forget-device
  "Forgets the specified device.

  request - `com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest`

  returns: Result of the ForgetDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ForgetDeviceResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.ForgetDeviceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest request]
    (-> this (.forgetDevice request))))

(defn get-identity-provider-by-identifier
  "Gets the specified identity provider.

  request - `com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest`

  returns: Result of the GetIdentityProviderByIdentifier operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest request]
    (-> this (.getIdentityProviderByIdentifier request))))

(defn confirm-device
  "Confirms tracking of the device. This API call is the call that begins device tracking.

  request - `com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest`

  returns: Result of the ConfirmDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest request]
    (-> this (.confirmDevice request))))

(defn associate-software-token
  "Returns a unique generated shared secret key code for the user account. The request takes an access token or a
   session string, but not both.

  request - `com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest`

  returns: Result of the AssociateSoftwareToken operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest request]
    (-> this (.associateSoftwareToken request))))

(defn untag-resource
  "Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second,
   per account

  request - `com.amazonaws.services.cognitoidp.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UntagResourceResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.UntagResourceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn describe-user-pool-client
  "Client method for returning the configuration information and metadata of the specified user pool app client.

  request - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest`

  returns: Result of the DescribeUserPoolClient operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest request]
    (-> this (.describeUserPoolClient request))))

(defn admin-update-auth-event-feedback
  "Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for
   improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.

  request - `com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest`

  returns: Result of the AdminUpdateAuthEventFeedback operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest request]
    (-> this (.adminUpdateAuthEventFeedback request))))

(defn describe-user-pool-domain
  "Gets information about a domain.

  request - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest`

  returns: Result of the DescribeUserPoolDomain operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest request]
    (-> this (.describeUserPoolDomain request))))

(defn list-users
  "Lists the users in the Amazon Cognito user pool.

  request - `com.amazonaws.services.cognitoidp.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUsersResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.ListUsersResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn respond-to-auth-challenge
  "Responds to the authentication challenge.

  request - `com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest`

  returns: Result of the RespondToAuthChallenge operation returned by the service. - `com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest request]
    (-> this (.respondToAuthChallenge request))))

(defn admin-disable-user
  "Disables the specified user as an administrator. Works on any user.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest`

  returns: Result of the AdminDisableUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminDisableUserResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminDisableUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest request]
    (-> this (.adminDisableUser request))))

(defn list-user-import-jobs
  "Lists the user import jobs.

  request - `com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest`

  returns: Result of the ListUserImportJobs operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest request]
    (-> this (.listUserImportJobs request))))

(defn list-devices
  "Lists the devices.

  request - `com.amazonaws.services.cognitoidp.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListDevicesResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.ListDevicesResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListDevicesRequest request]
    (-> this (.listDevices request))))

(defn delete-user
  "Allows a user to delete himself or herself.

  request - `com.amazonaws.services.cognitoidp.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.DeleteUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn update-resource-server
  "Updates the name and scopes of resource server. All other fields are read-only.

  request - `com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest`

  returns: Result of the UpdateResourceServer operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest request]
    (-> this (.updateResourceServer request))))

(defn admin-delete-user-attributes
  "Deletes the user attributes in a user pool as an administrator. Works on any user.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest`

  returns: Result of the AdminDeleteUserAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest request]
    (-> this (.adminDeleteUserAttributes request))))

(defn admin-set-user-password
  "request - `com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest`

  returns: Result of the AdminSetUserPassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest request]
    (-> this (.adminSetUserPassword request))))

(defn describe-risk-configuration
  "Describes the risk configuration.

  request - `com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest`

  returns: Result of the DescribeRiskConfiguration operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest request]
    (-> this (.describeRiskConfiguration request))))

(defn admin-remove-user-from-group
  "Removes the specified user from the specified group.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest`

  returns: Result of the AdminRemoveUserFromGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest request]
    (-> this (.adminRemoveUserFromGroup request))))

(defn admin-disable-provider-for-user
  "Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to
   disable is a Cognito User Pools native username  password user, they are not permitted to use their password to
   sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is
   removed. The next time the external user (no longer attached to the previously linked
   DestinationUser) signs in, they must create a new user account. See .


   This action is enabled only for admin access and requires developer credentials.


   The ProviderName must match the value specified when creating an IdP for the pool.


   To disable a native username  password user, the ProviderName value must be Cognito
   and the ProviderAttributeName must be Cognito_Subject, with the
   ProviderAttributeValue being the name that is used in the user pool for the user.


   The ProviderAttributeName must always be Cognito_Subject for social identity providers.
   The ProviderAttributeValue must always be the exact subject that was used when the user was
   originally linked as a source user.


   For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in,
   the ProviderAttributeName and ProviderAttributeValue must be the same values that were
   used for the SourceUser when the identities were originally linked in the call. (If the linking was
   done with ProviderAttributeName set to Cognito_Subject, the same applies here).
   However, if the user has already signed in, the ProviderAttributeName must be
   Cognito_Subject and ProviderAttributeValue must be the subject of the SAML assertion.

  request - `com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest`

  returns: Result of the AdminDisableProviderForUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest request]
    (-> this (.adminDisableProviderForUser request))))

(defn confirm-forgot-password
  "Allows a user to enter a confirmation code to reset a forgotten password.

  request - `com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest`

  returns: Result of the ConfirmForgotPassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest request]
    (-> this (.confirmForgotPassword request))))

(defn change-password
  "Changes the password for a specified user in a user pool.

  request - `com.amazonaws.services.cognitoidp.model.ChangePasswordRequest`

  returns: Result of the ChangePassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ChangePasswordResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.ChangePasswordResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ChangePasswordRequest request]
    (-> this (.changePassword request))))

(defn update-user-attributes
  "Allows a user to update a specific attribute (one at a time).

  request - `com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest`

  returns: Result of the UpdateUserAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest request]
    (-> this (.updateUserAttributes request))))

(defn admin-get-user
  "Gets the specified user by user name in a user pool as an administrator. Works on any user.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminGetUserRequest`

  returns: Result of the AdminGetUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminGetUserResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminGetUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminGetUserRequest request]
    (-> this (.adminGetUser request))))

(defn sign-up
  "Registers the user in the specified user pool and creates a user name, password, and user attributes.

  request - `com.amazonaws.services.cognitoidp.model.SignUpRequest`

  returns: Result of the SignUp operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SignUpResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.SignUpResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.SignUpRequest request]
    (-> this (.signUp request))))

(defn update-user-pool
  "Updates the specified user pool with the specified attributes. If you don't provide a value for an attribute, it
   will be set to the default value. You can get a list of the current user pool settings with .

  request - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest`

  returns: Result of the UpdateUserPool operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest request]
    (-> this (.updateUserPool request))))

(defn get-user
  "Gets the user attributes and metadata for a user.

  request - `com.amazonaws.services.cognitoidp.model.GetUserRequest`

  returns: Result of the GetUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetUserResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.GetUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GetUserRequest request]
    (-> this (.getUser request))))

(defn start-user-import-job
  "Starts the user import.

  request - `com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest`

  returns: Result of the StartUserImportJob operation returned by the service. - `com.amazonaws.services.cognitoidp.model.StartUserImportJobResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.StartUserImportJobResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest request]
    (-> this (.startUserImportJob request))))

(defn update-user-pool-client
  "Updates the specified user pool app client with the specified attributes. If you don't provide a value for an
   attribute, it will be set to the default value. You can get a list of the current user pool app client settings
   with .

  request - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest`

  returns: Result of the UpdateUserPoolClient operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest request]
    (-> this (.updateUserPoolClient request))))

(defn admin-enable-user
  "Enables the specified user as an administrator. Works on any user.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest`

  returns: Result of the AdminEnableUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminEnableUserResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminEnableUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest request]
    (-> this (.adminEnableUser request))))

(defn get-device
  "Gets the device.

  request - `com.amazonaws.services.cognitoidp.model.GetDeviceRequest`

  returns: Result of the GetDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetDeviceResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.GetDeviceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GetDeviceRequest request]
    (-> this (.getDevice request))))

(defn list-identity-providers
  "Lists information about all identity providers for a user pool.

  request - `com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest`

  returns: Result of the ListIdentityProviders operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest request]
    (-> this (.listIdentityProviders request))))

(defn delete-resource-server
  "Deletes a resource server.

  request - `com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest`

  returns: Result of the DeleteResourceServer operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest request]
    (-> this (.deleteResourceServer request))))

(defn admin-set-user-mfa-preference
  "Sets the user's multi-factor authentication (MFA) preference.

  request - `com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest`

  returns: Result of the AdminSetUserMFAPreference operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest request]
    (-> this (.adminSetUserMFAPreference request))))

(defn verify-software-token
  "Use this API to register a user's entered TOTP code and mark the user's software token MFA status as \"verified\"
   if successful. The request takes an access token or a session string, but not both.

  request - `com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest`

  returns: Result of the VerifySoftwareToken operation returned by the service. - `com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest request]
    (-> this (.verifySoftwareToken request))))

(defn set-user-pool-mfa-config
  "Set the user pool MFA configuration.

  request - `com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest`

  returns: Result of the SetUserPoolMfaConfig operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest request]
    (-> this (.setUserPoolMfaConfig request))))

(defn create-user-pool
  "Creates a new Amazon Cognito user pool and sets the password policy for the pool.

  request - `com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest`

  returns: Result of the CreateUserPool operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.CreateUserPoolResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest request]
    (-> this (.createUserPool request))))

(defn delete-user-pool-client
  "Allows the developer to delete the user pool client.

  request - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest`

  returns: Result of the DeleteUserPoolClient operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest request]
    (-> this (.deleteUserPoolClient request))))

(defn admin-reset-user-password
  "Resets the specified user's password in a user pool as an administrator. Works on any user.


   When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to
   sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should
   direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition,
   if the user pool has phone verification selected and a verified phone number exists for the user, or if email
   verification is selected and a verified email exists for the user, calling this API will also result in sending a
   message to the end user with the code to change their password.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest`

  returns: Result of the AdminResetUserPassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest request]
    (-> this (.adminResetUserPassword request))))

(defn stop-user-import-job
  "Stops the user import job.

  request - `com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest`

  returns: Result of the StopUserImportJob operation returned by the service. - `com.amazonaws.services.cognitoidp.model.StopUserImportJobResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.StopUserImportJobResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest request]
    (-> this (.stopUserImportJob request))))

(defn admin-list-groups-for-user
  "Lists the groups that the user belongs to.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest`

  returns: Result of the AdminListGroupsForUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest request]
    (-> this (.adminListGroupsForUser request))))

(defn admin-link-provider-for-user
  "Links an existing user account in a user pool (DestinationUser) to an identity from an external
   identity provider (SourceUser) based on a specified attribute name and value from the external
   identity provider. This allows you to create a link from the existing user account to an external federated user
   identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the
   existing user account.


   For example, if there is an existing user with a username and password, this API links that user to a federated
   user identity, so that when the federated user identity is used, the user signs in as the existing user account.



   Because this API allows a user with an external federated identity to sign in as an existing user in the user
   pool, it is critical that it only be used with external identity providers and provider attributes that have been
   trusted by the application owner.



   See also .


   This action is enabled only for admin access and requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest`

  returns: Result of the AdminLinkProviderForUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest request]
    (-> this (.adminLinkProviderForUser request))))

(defn get-csv-header
  "Gets the header information for the .csv file to be used as input for the user import job.

  request - `com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest`

  returns: Result of the GetCSVHeader operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest request]
    (-> this (.getCSVHeader request))))

(defn delete-user-pool-domain
  "Deletes a domain for a user pool.

  request - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest`

  returns: Result of the DeleteUserPoolDomain operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest request]
    (-> this (.deleteUserPoolDomain request))))

(defn delete-identity-provider
  "Deletes an identity provider for a user pool.

  request - `com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest`

  returns: Result of the DeleteIdentityProvider operation returned by the service. - `com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest request]
    (-> this (.deleteIdentityProvider request))))

(defn add-custom-attributes
  "Adds additional user attributes to the user pool schema.

  request - `com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest`

  returns: Result of the AddCustomAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest request]
    (-> this (.addCustomAttributes request))))

(defn create-user-pool-client
  "Creates the user pool client.

  request - `com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest`

  returns: Result of the CreateUserPoolClient operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest request]
    (-> this (.createUserPoolClient request))))

(defn get-user-attribute-verification-code
  "Gets the user attribute verification code for the specified attribute name.

  request - `com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest`

  returns: Result of the GetUserAttributeVerificationCode operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest request]
    (-> this (.getUserAttributeVerificationCode request))))

(defn admin-forget-device
  "Forgets the device, as an administrator.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest`

  returns: Result of the AdminForgetDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest request]
    (-> this (.adminForgetDevice request))))

(defn admin-update-user-attributes
  "Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user.


   For custom attributes, you must prepend the custom: prefix to the attribute name.


   In addition to updating user attributes, this API can also be used to mark phone and email as verified.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest`

  returns: Result of the AdminUpdateUserAttributes operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest request]
    (-> this (.adminUpdateUserAttributes request))))

(defn list-groups
  "Lists the groups associated with a user pool.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListGroupsResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.ListGroupsResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn list-user-pools
  "Lists the user pools associated with an AWS account.

  request - `com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest`

  returns: Result of the ListUserPools operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUserPoolsResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.ListUserPoolsResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest request]
    (-> this (.listUserPools request))))

(defn admin-get-device
  "Gets the device, as an administrator.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest`

  returns: Result of the AdminGetDevice operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest request]
    (-> this (.adminGetDevice request))))

(defn confirm-sign-up
  "Confirms registration of a user and handles the existing alias from a previous user.

  request - `com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest`

  returns: Result of the ConfirmSignUp operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest request]
    (-> this (.confirmSignUp request))))

(defn list-user-pool-clients
  "Lists the clients that have been created for the specified user pool.

  request - `com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest`

  returns: Result of the ListUserPoolClients operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest request]
    (-> this (.listUserPoolClients request))))

(defn set-user-mfa-preference
  "Set the user's multi-factor authentication (MFA) method preference.

  request - `com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest`

  returns: Result of the SetUserMFAPreference operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest request]
    (-> this (.setUserMFAPreference request))))

(defn admin-add-user-to-group
  "Adds the specified user to the specified group.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest`

  returns: Result of the AdminAddUserToGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest request]
    (-> this (.adminAddUserToGroup request))))

(defn admin-user-global-sign-out
  "Signs out users from all devices, as an administrator.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest`

  returns: Result of the AdminUserGlobalSignOut operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest request]
    (-> this (.adminUserGlobalSignOut request))))

(defn get-user-pool-mfa-config
  "Gets the user pool multi-factor authentication (MFA) configuration.

  request - `com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest`

  returns: Result of the GetUserPoolMfaConfig operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest request]
    (-> this (.getUserPoolMfaConfig request))))

(defn admin-set-user-settings
  "Sets all the user settings for a specified user name. Works on any user.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest`

  returns: Result of the AdminSetUserSettings operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest request]
    (-> this (.adminSetUserSettings request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCognitoIdentityProviderClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn admin-initiate-auth
  "Initiates the authentication flow, as an administrator.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest`

  returns: Result of the AdminInitiateAuth operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest request]
    (-> this (.adminInitiateAuth request))))

(defn admin-update-device-status
  "Updates the device status as an administrator.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest`

  returns: Result of the AdminUpdateDeviceStatus operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest request]
    (-> this (.adminUpdateDeviceStatus request))))

(defn initiate-auth
  "Initiates the authentication flow.

  request - `com.amazonaws.services.cognitoidp.model.InitiateAuthRequest`

  returns: Result of the InitiateAuth operation returned by the service. - `com.amazonaws.services.cognitoidp.model.InitiateAuthResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.InitiateAuthResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.InitiateAuthRequest request]
    (-> this (.initiateAuth request))))

(defn admin-create-user
  "Creates a new user in the specified user pool.


   If MessageAction is not set, the default is to send a welcome message via email or phone (SMS).



   This message is based on a template that you configured in your call to or . This template includes your custom
   sign-up instructions and placeholders for user name and temporary password.



   Alternatively, you can call AdminCreateUser with “SUPPRESS” for the MessageAction parameter, and
   Amazon Cognito will not send any email.


   In either case, the user will be in the FORCE_CHANGE_PASSWORD state until they sign in and change
   their password.


   AdminCreateUser requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest`

  returns: Result of the AdminCreateUser operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminCreateUserResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.AdminCreateUserResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest request]
    (-> this (.adminCreateUser request))))

(defn list-users-in-group
  "Lists the users in the specified group.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest`

  returns: Result of the ListUsersInGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest request]
    (-> this (.listUsersInGroup request))))

(defn forgot-password
  "Calling this API causes a message to be sent to the end user with a confirmation code that is required to change
   the user's password. For the Username parameter, you can use the username or user alias. If a
   verified phone number exists for the user, the confirmation code is sent to the phone number. Otherwise, if a
   verified email exists, the confirmation code is sent to the email. If neither a verified phone number nor a
   verified email exists, InvalidParameterException is thrown. To use the confirmation code for
   resetting the password, call .

  request - `com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest`

  returns: Result of the ForgotPassword operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ForgotPasswordResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.ForgotPasswordResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest request]
    (-> this (.forgotPassword request))))

(defn tag-resource
  "Assigns a set of tags to an Amazon Cognito user pool. A tag is a label that you can use to categorize and manage
   user pools in different ways, such as by purpose, owner, environment, or other criteria.


   Each tag consists of a key and value, both of which you define. A key is a general category for more specific
   values. For example, if you have two versions of a user pool, one for testing and another for production, you
   might assign an Environment tag key to both user pools. The value of this key might be
   Test for one user pool and Production for the other.


   Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the
   Billing and Cost Management console, where you can track the costs associated with your user pools. In an IAM
   policy, you can constrain permissions for user pools based on specific tags or tag values.


   You can use this action up to 5 times per second, per account. A user pool can have as many as 50 tags.

  request - `com.amazonaws.services.cognitoidp.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cognitoidp.model.TagResourceResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.TagResourceResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn set-user-settings
  "Sets the user settings like multi-factor authentication (MFA). If MFA is to be removed for a particular attribute
   pass the attribute with code delivery as null. If null list is passed, all MFA options are removed.

  request - `com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest`

  returns: Result of the SetUserSettings operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetUserSettingsResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.SetUserSettingsResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest request]
    (-> this (.setUserSettings request))))

(defn update-device-status
  "Updates the device status.

  request - `com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest`

  returns: Result of the UpdateDeviceStatus operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest request]
    (-> this (.updateDeviceStatus request))))

(defn update-user-pool-domain
  "Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool.


   You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You
   cannot use it to change the domain for a user pool.


   A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your
   application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate
   Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your
   custom domain.


   Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing
   certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new
   certificate automatically.


   However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To
   apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito.


   When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region.


   After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your
   custom domain.


   For more information about adding a custom domain to your user pool, see Using
   Your Own Domain for the Hosted UI.

  request - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest`

  returns: Result of the UpdateUserPoolDomain operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest request]
    (-> this (.updateUserPoolDomain request))))

(defn update-identity-provider
  "Updates identity provider information for a user pool.

  request - `com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest`

  returns: Result of the UpdateIdentityProvider operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest request]
    (-> this (.updateIdentityProvider request))))

(defn list-resource-servers
  "Lists the resource servers for a user pool.

  request - `com.amazonaws.services.cognitoidp.model.ListResourceServersRequest`

  returns: Result of the ListResourceServers operation returned by the service. - `com.amazonaws.services.cognitoidp.model.ListResourceServersResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.ListResourceServersResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.ListResourceServersRequest request]
    (-> this (.listResourceServers request))))

(defn update-auth-event-feedback
  "Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used
   for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.

  request - `com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest`

  returns: Result of the UpdateAuthEventFeedback operation returned by the service. - `com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest request]
    (-> this (.updateAuthEventFeedback request))))

(defn create-identity-provider
  "Creates an identity provider for a user pool.

  request - `com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest`

  returns: Result of the CreateIdentityProvider operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest request]
    (-> this (.createIdentityProvider request))))

(defn admin-respond-to-auth-challenge
  "Responds to an authentication challenge, as an administrator.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest`

  returns: Result of the AdminRespondToAuthChallenge operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest request]
    (-> this (.adminRespondToAuthChallenge request))))

(defn verify-user-attribute
  "Verifies the specified user attributes in the user pool.

  request - `com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest`

  returns: Result of the VerifyUserAttribute operation returned by the service. - `com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult`

  throws: com.amazonaws.services.cognitoidp.model.NotAuthorizedException - This exception is thrown when a user is not authorized."
  (^com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest request]
    (-> this (.verifyUserAttribute request))))

(defn set-risk-configuration
  "Configures actions on detected risks. To delete the risk configuration for UserPoolId or
   ClientId, pass null values for all four configuration types.


   To enable Amazon Cognito advanced security features, update the user pool to include the
   UserPoolAddOns keyAdvancedSecurityMode.


   See .

  request - `com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest`

  returns: Result of the SetRiskConfiguration operation returned by the service. - `com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest request]
    (-> this (.setRiskConfiguration request))))

(defn get-group
  "Gets a group.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.cognitoidp.model.GetGroupResult`

  throws: com.amazonaws.services.cognitoidp.model.ResourceNotFoundException - This exception is thrown when the Amazon Cognito service cannot find the requested resource."
  (^com.amazonaws.services.cognitoidp.model.GetGroupResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.GetGroupRequest request]
    (-> this (.getGroup request))))

(defn admin-confirm-sign-up
  "Confirms user registration as an admin without using a confirmation code. Works on any user.


   Requires developer credentials.

  request - `com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest`

  returns: Result of the AdminConfirmSignUp operation returned by the service. - `com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult`

  throws: com.amazonaws.services.cognitoidp.model.UnexpectedLambdaException - This exception is thrown when the Amazon Cognito service encounters an unexpected exception with the AWS Lambda service."
  (^com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest request]
    (-> this (.adminConfirmSignUp request))))

(defn create-user-pool-domain
  "Creates a new domain for a user pool.

  request - `com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest`

  returns: Result of the CreateUserPoolDomain operation returned by the service. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult`

  throws: com.amazonaws.services.cognitoidp.model.InvalidParameterException - This exception is thrown when the Amazon Cognito service encounters an invalid parameter."
  (^com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult [^AWSCognitoIdentityProviderClient this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest request]
    (-> this (.createUserPoolDomain request))))

