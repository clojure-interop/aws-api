(ns com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderAsync
  "Interface for accessing Amazon Cognito Identity Provider asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCognitoIdentityProviderAsync instead.



  Using the Amazon Cognito User Pools API, you can create a user pool to manage directories and users. You can
  authenticate a user to obtain tokens related to user identity and access policies.


  This API reference provides information about user pools in Amazon Cognito User Pools.


  For more information, see the Amazon Cognito Documentation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cognitoidp AWSCognitoIdentityProviderAsync]))

(defn admin-update-user-attributes-async
  "Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user.


   For custom attributes, you must prepend the custom: prefix to the attribute name.


   In addition to updating user attributes, this API can also be used to mark phone and email as verified.


   Requires developer credentials.

  admin-update-user-attributes-request - Represents the request to update the user's attributes as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminUpdateUserAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest admin-update-user-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminUpdateUserAttributesAsync admin-update-user-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest admin-update-user-attributes-request]
    (-> this (.adminUpdateUserAttributesAsync admin-update-user-attributes-request))))

(defn untag-resource-async
  "Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second,
   per account

  untag-resource-request - `com.amazonaws.services.cognitoidp.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn admin-get-user-async
  "Gets the specified user by user name in a user pool as an administrator. Works on any user.


   Requires developer credentials.

  admin-get-user-request - Represents the request to get the specified user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminGetUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminGetUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminGetUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminGetUserRequest admin-get-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminGetUserAsync admin-get-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminGetUserRequest admin-get-user-request]
    (-> this (.adminGetUserAsync admin-get-user-request))))

(defn get-device-async
  "Gets the device.

  get-device-request - Represents the request to get the device. - `com.amazonaws.services.cognitoidp.model.GetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetDeviceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetDeviceRequest get-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceAsync get-device-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetDeviceRequest get-device-request]
    (-> this (.getDeviceAsync get-device-request))))

(defn delete-user-pool-async
  "Deletes the specified Amazon Cognito user pool.

  delete-user-pool-request - Represents the request to delete a user pool. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest delete-user-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPoolAsync delete-user-pool-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest delete-user-pool-request]
    (-> this (.deleteUserPoolAsync delete-user-pool-request))))

(defn admin-link-provider-for-user-async
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

  admin-link-provider-for-user-request - `com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminLinkProviderForUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest admin-link-provider-for-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminLinkProviderForUserAsync admin-link-provider-for-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest admin-link-provider-for-user-request]
    (-> this (.adminLinkProviderForUserAsync admin-link-provider-for-user-request))))

(defn admin-confirm-sign-up-async
  "Confirms user registration as an admin without using a confirmation code. Works on any user.


   Requires developer credentials.

  admin-confirm-sign-up-request - Represents the request to confirm user registration. - `com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminConfirmSignUp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest admin-confirm-sign-up-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminConfirmSignUpAsync admin-confirm-sign-up-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest admin-confirm-sign-up-request]
    (-> this (.adminConfirmSignUpAsync admin-confirm-sign-up-request))))

(defn admin-remove-user-from-group-async
  "Removes the specified user from the specified group.


   Requires developer credentials.

  admin-remove-user-from-group-request - `com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminRemoveUserFromGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest admin-remove-user-from-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminRemoveUserFromGroupAsync admin-remove-user-from-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest admin-remove-user-from-group-request]
    (-> this (.adminRemoveUserFromGroupAsync admin-remove-user-from-group-request))))

(defn update-device-status-async
  "Updates the device status.

  update-device-status-request - Represents the request to update the device status. - `com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeviceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest update-device-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceStatusAsync update-device-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest update-device-status-request]
    (-> this (.updateDeviceStatusAsync update-device-status-request))))

(defn admin-update-auth-event-feedback-async
  "Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for
   improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.

  admin-update-auth-event-feedback-request - `com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminUpdateAuthEventFeedback operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest admin-update-auth-event-feedback-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminUpdateAuthEventFeedbackAsync admin-update-auth-event-feedback-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest admin-update-auth-event-feedback-request]
    (-> this (.adminUpdateAuthEventFeedbackAsync admin-update-auth-event-feedback-request))))

(defn create-group-async
  "Creates a new group in the specified user pool.


   Requires developer credentials.

  create-group-request - `com.amazonaws.services.cognitoidp.model.CreateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateGroupRequest create-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync create-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateGroupRequest create-group-request]
    (-> this (.createGroupAsync create-group-request))))

(defn admin-initiate-auth-async
  "Initiates the authentication flow, as an administrator.


   Requires developer credentials.

  admin-initiate-auth-request - Initiates the authorization request, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminInitiateAuth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest admin-initiate-auth-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminInitiateAuthAsync admin-initiate-auth-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest admin-initiate-auth-request]
    (-> this (.adminInitiateAuthAsync admin-initiate-auth-request))))

(defn describe-identity-provider-async
  "Gets information about a specific identity provider.

  describe-identity-provider-request - `com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest describe-identity-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityProviderAsync describe-identity-provider-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest describe-identity-provider-request]
    (-> this (.describeIdentityProviderAsync describe-identity-provider-request))))

(defn create-user-import-job-async
  "Creates the user import job.

  create-user-import-job-request - Represents the request to create the user import job. - `com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest create-user-import-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserImportJobAsync create-user-import-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest create-user-import-job-request]
    (-> this (.createUserImportJobAsync create-user-import-job-request))))

(defn verify-software-token-async
  "Use this API to register a user's entered TOTP code and mark the user's software token MFA status as \"verified\"
   if successful. The request takes an access token or a session string, but not both.

  verify-software-token-request - `com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifySoftwareToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest verify-software-token-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifySoftwareTokenAsync verify-software-token-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest verify-software-token-request]
    (-> this (.verifySoftwareTokenAsync verify-software-token-request))))

(defn confirm-sign-up-async
  "Confirms registration of a user and handles the existing alias from a previous user.

  confirm-sign-up-request - Represents the request to confirm registration of a user. - `com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmSignUp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest confirm-sign-up-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmSignUpAsync confirm-sign-up-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest confirm-sign-up-request]
    (-> this (.confirmSignUpAsync confirm-sign-up-request))))

(defn delete-user-pool-client-async
  "Allows the developer to delete the user pool client.

  delete-user-pool-client-request - Represents the request to delete a user pool client. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPoolClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest delete-user-pool-client-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPoolClientAsync delete-user-pool-client-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest delete-user-pool-client-request]
    (-> this (.deleteUserPoolClientAsync delete-user-pool-client-request))))

(defn list-users-in-group-async
  "Lists the users in the specified group.


   Requires developer credentials.

  list-users-in-group-request - `com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsersInGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest list-users-in-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersInGroupAsync list-users-in-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest list-users-in-group-request]
    (-> this (.listUsersInGroupAsync list-users-in-group-request))))

(defn admin-respond-to-auth-challenge-async
  "Responds to an authentication challenge, as an administrator.


   Requires developer credentials.

  admin-respond-to-auth-challenge-request - The request to respond to the authentication challenge, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminRespondToAuthChallenge operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest admin-respond-to-auth-challenge-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminRespondToAuthChallengeAsync admin-respond-to-auth-challenge-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest admin-respond-to-auth-challenge-request]
    (-> this (.adminRespondToAuthChallengeAsync admin-respond-to-auth-challenge-request))))

(defn get-csv-header-async
  "Gets the header information for the .csv file to be used as input for the user import job.

  get-csv-header-request - Represents the request to get the header information for the .csv file for the user import job. - `com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCSVHeader operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest get-csv-header-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCSVHeaderAsync get-csv-header-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest get-csv-header-request]
    (-> this (.getCSVHeaderAsync get-csv-header-request))))

(defn admin-disable-user-async
  "Disables the specified user as an administrator. Works on any user.


   Requires developer credentials.

  admin-disable-user-request - Represents the request to disable any user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminDisableUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminDisableUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest admin-disable-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminDisableUserAsync admin-disable-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest admin-disable-user-request]
    (-> this (.adminDisableUserAsync admin-disable-user-request))))

(defn update-auth-event-feedback-async
  "Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used
   for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.

  update-auth-event-feedback-request - `com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuthEventFeedback operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest update-auth-event-feedback-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuthEventFeedbackAsync update-auth-event-feedback-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest update-auth-event-feedback-request]
    (-> this (.updateAuthEventFeedbackAsync update-auth-event-feedback-request))))

(defn create-user-pool-domain-async
  "Creates a new domain for a user pool.

  create-user-pool-domain-request - `com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserPoolDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest create-user-pool-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserPoolDomainAsync create-user-pool-domain-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest create-user-pool-domain-request]
    (-> this (.createUserPoolDomainAsync create-user-pool-domain-request))))

(defn admin-enable-user-async
  "Enables the specified user as an administrator. Works on any user.


   Requires developer credentials.

  admin-enable-user-request - Represents the request that enables the user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminEnableUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminEnableUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest admin-enable-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminEnableUserAsync admin-enable-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest admin-enable-user-request]
    (-> this (.adminEnableUserAsync admin-enable-user-request))))

(defn delete-user-async
  "Allows a user to delete himself or herself.

  delete-user-request - Represents the request to delete a user. - `com.amazonaws.services.cognitoidp.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn forget-device-async
  "Forgets the specified device.

  forget-device-request - Represents the request to forget the device. - `com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ForgetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ForgetDeviceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest forget-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.forgetDeviceAsync forget-device-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest forget-device-request]
    (-> this (.forgetDeviceAsync forget-device-request))))

(defn admin-delete-user-attributes-async
  "Deletes the user attributes in a user pool as an administrator. Works on any user.


   Requires developer credentials.

  admin-delete-user-attributes-request - Represents the request to delete user attributes as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminDeleteUserAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest admin-delete-user-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminDeleteUserAttributesAsync admin-delete-user-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest admin-delete-user-attributes-request]
    (-> this (.adminDeleteUserAttributesAsync admin-delete-user-attributes-request))))

(defn describe-user-import-job-async
  "Describes the user import job.

  describe-user-import-job-request - Represents the request to describe the user import job. - `com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest describe-user-import-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserImportJobAsync describe-user-import-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest describe-user-import-job-request]
    (-> this (.describeUserImportJobAsync describe-user-import-job-request))))

(defn set-user-mfa-preference-async
  "Set the user's multi-factor authentication (MFA) method preference.

  set-user-mfa-preference-request - `com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetUserMFAPreference operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest set-user-mfa-preference-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setUserMFAPreferenceAsync set-user-mfa-preference-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest set-user-mfa-preference-request]
    (-> this (.setUserMFAPreferenceAsync set-user-mfa-preference-request))))

(defn admin-delete-user-async
  "Deletes a user as an administrator. Works on any user.


   Requires developer credentials.

  admin-delete-user-request - Represents the request to delete a user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminDeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest admin-delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminDeleteUserAsync admin-delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest admin-delete-user-request]
    (-> this (.adminDeleteUserAsync admin-delete-user-request))))

(defn delete-resource-server-async
  "Deletes a resource server.

  delete-resource-server-request - `com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourceServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest delete-resource-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceServerAsync delete-resource-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest delete-resource-server-request]
    (-> this (.deleteResourceServerAsync delete-resource-server-request))))

(defn update-identity-provider-async
  "Updates identity provider information for a user pool.

  update-identity-provider-request - `com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest update-identity-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIdentityProviderAsync update-identity-provider-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest update-identity-provider-request]
    (-> this (.updateIdentityProviderAsync update-identity-provider-request))))

(defn update-resource-server-async
  "Updates the name and scopes of resource server. All other fields are read-only.

  update-resource-server-request - `com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResourceServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest update-resource-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceServerAsync update-resource-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest update-resource-server-request]
    (-> this (.updateResourceServerAsync update-resource-server-request))))

(defn global-sign-out-async
  "Signs out users from all devices.

  global-sign-out-request - Represents the request to sign out all devices. - `com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GlobalSignOut operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GlobalSignOutResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest global-sign-out-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.globalSignOutAsync global-sign-out-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest global-sign-out-request]
    (-> this (.globalSignOutAsync global-sign-out-request))))

(defn admin-create-user-async
  "Creates a new user in the specified user pool.


   If MessageAction is not set, the default is to send a welcome message via email or phone (SMS).



   This message is based on a template that you configured in your call to or . This template includes your custom
   sign-up instructions and placeholders for user name and temporary password.



   Alternatively, you can call AdminCreateUser with “SUPPRESS” for the MessageAction parameter, and
   Amazon Cognito will not send any email.


   In either case, the user will be in the FORCE_CHANGE_PASSWORD state until they sign in and change
   their password.


   AdminCreateUser requires developer credentials.

  admin-create-user-request - Represents the request to create a user in the specified user pool. - `com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminCreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminCreateUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest admin-create-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminCreateUserAsync admin-create-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest admin-create-user-request]
    (-> this (.adminCreateUserAsync admin-create-user-request))))

(defn resend-confirmation-code-async
  "Resends the confirmation (for confirmation of registration) to a specific user in the user pool.

  resend-confirmation-code-request - Represents the request to resend the confirmation code. - `com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResendConfirmationCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest resend-confirmation-code-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resendConfirmationCodeAsync resend-confirmation-code-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest resend-confirmation-code-request]
    (-> this (.resendConfirmationCodeAsync resend-confirmation-code-request))))

(defn set-user-settings-async
  "Sets the user settings like multi-factor authentication (MFA). If MFA is to be removed for a particular attribute
   pass the attribute with code delivery as null. If null list is passed, all MFA options are removed.

  set-user-settings-request - Represents the request to set user settings. - `com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetUserSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetUserSettingsResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest set-user-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setUserSettingsAsync set-user-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest set-user-settings-request]
    (-> this (.setUserSettingsAsync set-user-settings-request))))

(defn create-identity-provider-async
  "Creates an identity provider for a user pool.

  create-identity-provider-request - `com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest create-identity-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIdentityProviderAsync create-identity-provider-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest create-identity-provider-request]
    (-> this (.createIdentityProviderAsync create-identity-provider-request))))

(defn get-user-pool-mfa-config-async
  "Gets the user pool multi-factor authentication (MFA) configuration.

  get-user-pool-mfa-config-request - `com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserPoolMfaConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest get-user-pool-mfa-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserPoolMfaConfigAsync get-user-pool-mfa-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest get-user-pool-mfa-config-request]
    (-> this (.getUserPoolMfaConfigAsync get-user-pool-mfa-config-request))))

(defn list-identity-providers-async
  "Lists information about all identity providers for a user pool.

  list-identity-providers-request - `com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentityProviders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest list-identity-providers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentityProvidersAsync list-identity-providers-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest list-identity-providers-request]
    (-> this (.listIdentityProvidersAsync list-identity-providers-request))))

(defn list-resource-servers-async
  "Lists the resource servers for a user pool.

  list-resource-servers-request - `com.amazonaws.services.cognitoidp.model.ListResourceServersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceServers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListResourceServersResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListResourceServersRequest list-resource-servers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceServersAsync list-resource-servers-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListResourceServersRequest list-resource-servers-request]
    (-> this (.listResourceServersAsync list-resource-servers-request))))

(defn stop-user-import-job-async
  "Stops the user import job.

  stop-user-import-job-request - Represents the request to stop the user import job. - `com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopUserImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.StopUserImportJobResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest stop-user-import-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopUserImportJobAsync stop-user-import-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest stop-user-import-job-request]
    (-> this (.stopUserImportJobAsync stop-user-import-job-request))))

(defn initiate-auth-async
  "Initiates the authentication flow.

  initiate-auth-request - Initiates the authentication request. - `com.amazonaws.services.cognitoidp.model.InitiateAuthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateAuth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.InitiateAuthResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.InitiateAuthRequest initiate-auth-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateAuthAsync initiate-auth-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.InitiateAuthRequest initiate-auth-request]
    (-> this (.initiateAuthAsync initiate-auth-request))))

(defn set-risk-configuration-async
  "Configures actions on detected risks. To delete the risk configuration for UserPoolId or
   ClientId, pass null values for all four configuration types.


   To enable Amazon Cognito advanced security features, update the user pool to include the
   UserPoolAddOns keyAdvancedSecurityMode.


   See .

  set-risk-configuration-request - `com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetRiskConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest set-risk-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setRiskConfigurationAsync set-risk-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest set-risk-configuration-request]
    (-> this (.setRiskConfigurationAsync set-risk-configuration-request))))

(defn confirm-device-async
  "Confirms tracking of the device. This API call is the call that begins device tracking.

  confirm-device-request - Confirms the device request. - `com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest confirm-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmDeviceAsync confirm-device-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest confirm-device-request]
    (-> this (.confirmDeviceAsync confirm-device-request))))

(defn delete-user-attributes-async
  "Deletes the attributes for a user.

  delete-user-attributes-request - Represents the request to delete user attributes. - `com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest delete-user-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAttributesAsync delete-user-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest delete-user-attributes-request]
    (-> this (.deleteUserAttributesAsync delete-user-attributes-request))))

(defn set-ui-customization-async
  "Sets the UI customization information for a user pool's built-in app UI.


   You can specify app UI customization settings for a single client (with a specific clientId) or for
   all clients (by setting the clientId to ALL). If you specify ALL, the
   default configuration will be used for every client that has no UI customization set previously. If you specify
   UI customization settings for a particular client, it will no longer fall back to the ALL
   configuration.



   To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the
   app's pages, and the service will throw an error.

  set-ui-customization-request - `com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetUICustomization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetUICustomizationResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest set-ui-customization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setUICustomizationAsync set-ui-customization-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest set-ui-customization-request]
    (-> this (.setUICustomizationAsync set-ui-customization-request))))

(defn list-user-pools-async
  "Lists the user pools associated with an AWS account.

  list-user-pools-request - Represents the request to list user pools. - `com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserPools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUserPoolsResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest list-user-pools-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserPoolsAsync list-user-pools-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest list-user-pools-request]
    (-> this (.listUserPoolsAsync list-user-pools-request))))

(defn get-identity-provider-by-identifier-async
  "Gets the specified identity provider.

  get-identity-provider-by-identifier-request - `com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityProviderByIdentifier operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest get-identity-provider-by-identifier-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityProviderByIdentifierAsync get-identity-provider-by-identifier-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest get-identity-provider-by-identifier-request]
    (-> this (.getIdentityProviderByIdentifierAsync get-identity-provider-by-identifier-request))))

(defn update-group-async
  "Updates the specified group with the specified attributes.


   Requires developer credentials.

  update-group-request - `com.amazonaws.services.cognitoidp.model.UpdateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateGroupRequest update-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync update-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateGroupRequest update-group-request]
    (-> this (.updateGroupAsync update-group-request))))

(defn admin-disable-provider-for-user-async
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

  admin-disable-provider-for-user-request - `com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminDisableProviderForUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest admin-disable-provider-for-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminDisableProviderForUserAsync admin-disable-provider-for-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest admin-disable-provider-for-user-request]
    (-> this (.adminDisableProviderForUserAsync admin-disable-provider-for-user-request))))

(defn admin-list-user-auth-events-async
  "Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.

  admin-list-user-auth-events-request - `com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminListUserAuthEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest admin-list-user-auth-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminListUserAuthEventsAsync admin-list-user-auth-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest admin-list-user-auth-events-request]
    (-> this (.adminListUserAuthEventsAsync admin-list-user-auth-events-request))))

(defn admin-add-user-to-group-async
  "Adds the specified user to the specified group.


   Requires developer credentials.

  admin-add-user-to-group-request - `com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminAddUserToGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest admin-add-user-to-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminAddUserToGroupAsync admin-add-user-to-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest admin-add-user-to-group-request]
    (-> this (.adminAddUserToGroupAsync admin-add-user-to-group-request))))

(defn get-user-async
  "Gets the user attributes and metadata for a user.

  get-user-request - Represents the request to get information about the user. - `com.amazonaws.services.cognitoidp.model.GetUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserRequest get-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserAsync get-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserRequest get-user-request]
    (-> this (.getUserAsync get-user-request))))

(defn create-user-pool-async
  "Creates a new Amazon Cognito user pool and sets the password policy for the pool.

  create-user-pool-request - Represents the request to create a user pool. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateUserPoolResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest create-user-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserPoolAsync create-user-pool-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest create-user-pool-request]
    (-> this (.createUserPoolAsync create-user-pool-request))))

(defn list-user-import-jobs-async
  "Lists the user import jobs.

  list-user-import-jobs-request - Represents the request to list the user import jobs. - `com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserImportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest list-user-import-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserImportJobsAsync list-user-import-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest list-user-import-jobs-request]
    (-> this (.listUserImportJobsAsync list-user-import-jobs-request))))

(defn describe-risk-configuration-async
  "Describes the risk configuration.

  describe-risk-configuration-request - `com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRiskConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest describe-risk-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRiskConfigurationAsync describe-risk-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest describe-risk-configuration-request]
    (-> this (.describeRiskConfigurationAsync describe-risk-configuration-request))))

(defn forgot-password-async
  "Calling this API causes a message to be sent to the end user with a confirmation code that is required to change
   the user's password. For the Username parameter, you can use the username or user alias. If a
   verified phone number exists for the user, the confirmation code is sent to the phone number. Otherwise, if a
   verified email exists, the confirmation code is sent to the email. If neither a verified phone number nor a
   verified email exists, InvalidParameterException is thrown. To use the confirmation code for
   resetting the password, call .

  forgot-password-request - Represents the request to reset a user's password. - `com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ForgotPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ForgotPasswordResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest forgot-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.forgotPasswordAsync forgot-password-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest forgot-password-request]
    (-> this (.forgotPasswordAsync forgot-password-request))))

(defn confirm-forgot-password-async
  "Allows a user to enter a confirmation code to reset a forgotten password.

  confirm-forgot-password-request - The request representing the confirmation for a password reset. - `com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmForgotPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest confirm-forgot-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmForgotPasswordAsync confirm-forgot-password-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest confirm-forgot-password-request]
    (-> this (.confirmForgotPasswordAsync confirm-forgot-password-request))))

(defn update-user-pool-async
  "Updates the specified user pool with the specified attributes. If you don't provide a value for an attribute, it
   will be set to the default value. You can get a list of the current user pool settings with .

  update-user-pool-request - Represents the request to update the user pool. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest update-user-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserPoolAsync update-user-pool-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest update-user-pool-request]
    (-> this (.updateUserPoolAsync update-user-pool-request))))

(defn describe-resource-server-async
  "Describes a resource server.

  describe-resource-server-request - `com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResourceServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest describe-resource-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourceServerAsync describe-resource-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest describe-resource-server-request]
    (-> this (.describeResourceServerAsync describe-resource-server-request))))

(defn admin-set-user-mfa-preference-async
  "Sets the user's multi-factor authentication (MFA) preference.

  admin-set-user-mfa-preference-request - `com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminSetUserMFAPreference operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest admin-set-user-mfa-preference-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminSetUserMFAPreferenceAsync admin-set-user-mfa-preference-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest admin-set-user-mfa-preference-request]
    (-> this (.adminSetUserMFAPreferenceAsync admin-set-user-mfa-preference-request))))

(defn admin-reset-user-password-async
  "Resets the specified user's password in a user pool as an administrator. Works on any user.


   When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to
   sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should
   direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition,
   if the user pool has phone verification selected and a verified phone number exists for the user, or if email
   verification is selected and a verified email exists for the user, calling this API will also result in sending a
   message to the end user with the code to change their password.


   Requires developer credentials.

  admin-reset-user-password-request - Represents the request to reset a user's password as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminResetUserPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest admin-reset-user-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminResetUserPasswordAsync admin-reset-user-password-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest admin-reset-user-password-request]
    (-> this (.adminResetUserPasswordAsync admin-reset-user-password-request))))

(defn associate-software-token-async
  "Returns a unique generated shared secret key code for the user account. The request takes an access token or a
   session string, but not both.

  associate-software-token-request - `com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSoftwareToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest associate-software-token-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSoftwareTokenAsync associate-software-token-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest associate-software-token-request]
    (-> this (.associateSoftwareTokenAsync associate-software-token-request))))

(defn create-resource-server-async
  "Creates a new OAuth2.0 resource server and defines custom scopes in it.

  create-resource-server-request - `com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateResourceServerResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest create-resource-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceServerAsync create-resource-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest create-resource-server-request]
    (-> this (.createResourceServerAsync create-resource-server-request))))

(defn describe-user-pool-async
  "Returns the configuration information and metadata of the specified user pool.

  describe-user-pool-request - Represents the request to describe the user pool. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest describe-user-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserPoolAsync describe-user-pool-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest describe-user-pool-request]
    (-> this (.describeUserPoolAsync describe-user-pool-request))))

(defn admin-forget-device-async
  "Forgets the device, as an administrator.


   Requires developer credentials.

  admin-forget-device-request - Sends the forgot device request, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminForgetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest admin-forget-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminForgetDeviceAsync admin-forget-device-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest admin-forget-device-request]
    (-> this (.adminForgetDeviceAsync admin-forget-device-request))))

(defn admin-list-devices-async
  "Lists devices, as an administrator.


   Requires developer credentials.

  admin-list-devices-request - Represents the request to list devices, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminListDevicesResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest admin-list-devices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminListDevicesAsync admin-list-devices-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest admin-list-devices-request]
    (-> this (.adminListDevicesAsync admin-list-devices-request))))

(defn list-devices-async
  "Lists the devices.

  list-devices-request - Represents the request to list the devices. - `com.amazonaws.services.cognitoidp.model.ListDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListDevicesResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListDevicesRequest list-devices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicesAsync list-devices-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListDevicesRequest list-devices-request]
    (-> this (.listDevicesAsync list-devices-request))))

(defn create-user-pool-client-async
  "Creates the user pool client.

  create-user-pool-client-request - Represents the request to create a user pool client. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserPoolClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest create-user-pool-client-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserPoolClientAsync create-user-pool-client-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest create-user-pool-client-request]
    (-> this (.createUserPoolClientAsync create-user-pool-client-request))))

(defn get-group-async
  "Gets a group.


   Requires developer credentials.

  get-group-request - `com.amazonaws.services.cognitoidp.model.GetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetGroupRequest get-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync get-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetGroupRequest get-group-request]
    (-> this (.getGroupAsync get-group-request))))

(defn list-tags-for-resource-async
  "Lists the tags that are assigned to an Amazon Cognito user pool.


   A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by
   purpose, owner, environment, or other criteria.


   You can use this action up to 10 times per second, per account.

  list-tags-for-resource-request - `com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn respond-to-auth-challenge-async
  "Responds to the authentication challenge.

  respond-to-auth-challenge-request - The request to respond to an authentication challenge. - `com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RespondToAuthChallenge operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest respond-to-auth-challenge-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.respondToAuthChallengeAsync respond-to-auth-challenge-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest respond-to-auth-challenge-request]
    (-> this (.respondToAuthChallengeAsync respond-to-auth-challenge-request))))

(defn verify-user-attribute-async
  "Verifies the specified user attributes in the user pool.

  verify-user-attribute-request - Represents the request to verify user attributes. - `com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyUserAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest verify-user-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyUserAttributeAsync verify-user-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest verify-user-attribute-request]
    (-> this (.verifyUserAttributeAsync verify-user-attribute-request))))

(defn admin-list-groups-for-user-async
  "Lists the groups that the user belongs to.


   Requires developer credentials.

  admin-list-groups-for-user-request - `com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminListGroupsForUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest admin-list-groups-for-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminListGroupsForUserAsync admin-list-groups-for-user-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest admin-list-groups-for-user-request]
    (-> this (.adminListGroupsForUserAsync admin-list-groups-for-user-request))))

(defn start-user-import-job-async
  "Starts the user import.

  start-user-import-job-request - Represents the request to start the user import job. - `com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartUserImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.StartUserImportJobResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest start-user-import-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startUserImportJobAsync start-user-import-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest start-user-import-job-request]
    (-> this (.startUserImportJobAsync start-user-import-job-request))))

(defn admin-get-device-async
  "Gets the device, as an administrator.


   Requires developer credentials.

  admin-get-device-request - Represents the request to get the device, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminGetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest admin-get-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminGetDeviceAsync admin-get-device-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest admin-get-device-request]
    (-> this (.adminGetDeviceAsync admin-get-device-request))))

(defn update-user-attributes-async
  "Allows a user to update a specific attribute (one at a time).

  update-user-attributes-request - Represents the request to update user attributes. - `com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest update-user-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAttributesAsync update-user-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest update-user-attributes-request]
    (-> this (.updateUserAttributesAsync update-user-attributes-request))))

(defn sign-up-async
  "Registers the user in the specified user pool and creates a user name, password, and user attributes.

  sign-up-request - Represents the request to register a user. - `com.amazonaws.services.cognitoidp.model.SignUpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SignUp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SignUpResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SignUpRequest sign-up-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.signUpAsync sign-up-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SignUpRequest sign-up-request]
    (-> this (.signUpAsync sign-up-request))))

(defn admin-update-device-status-async
  "Updates the device status as an administrator.


   Requires developer credentials.

  admin-update-device-status-request - The request to update the device status, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminUpdateDeviceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest admin-update-device-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminUpdateDeviceStatusAsync admin-update-device-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest admin-update-device-status-request]
    (-> this (.adminUpdateDeviceStatusAsync admin-update-device-status-request))))

(defn describe-user-pool-domain-async
  "Gets information about a domain.

  describe-user-pool-domain-request - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserPoolDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest describe-user-pool-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserPoolDomainAsync describe-user-pool-domain-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest describe-user-pool-domain-request]
    (-> this (.describeUserPoolDomainAsync describe-user-pool-domain-request))))

(defn list-user-pool-clients-async
  "Lists the clients that have been created for the specified user pool.

  list-user-pool-clients-request - Represents the request to list the user pool clients. - `com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserPoolClients operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest list-user-pool-clients-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserPoolClientsAsync list-user-pool-clients-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest list-user-pool-clients-request]
    (-> this (.listUserPoolClientsAsync list-user-pool-clients-request))))

(defn describe-user-pool-client-async
  "Client method for returning the configuration information and metadata of the specified user pool app client.

  describe-user-pool-client-request - Represents the request to describe a user pool client. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserPoolClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest describe-user-pool-client-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserPoolClientAsync describe-user-pool-client-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest describe-user-pool-client-request]
    (-> this (.describeUserPoolClientAsync describe-user-pool-client-request))))

(defn get-user-attribute-verification-code-async
  "Gets the user attribute verification code for the specified attribute name.

  get-user-attribute-verification-code-request - Represents the request to get user attribute verification. - `com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserAttributeVerificationCode operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest get-user-attribute-verification-code-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserAttributeVerificationCodeAsync get-user-attribute-verification-code-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest get-user-attribute-verification-code-request]
    (-> this (.getUserAttributeVerificationCodeAsync get-user-attribute-verification-code-request))))

(defn update-user-pool-domain-async
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

  update-user-pool-domain-request - The UpdateUserPoolDomain request input. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserPoolDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest update-user-pool-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserPoolDomainAsync update-user-pool-domain-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest update-user-pool-domain-request]
    (-> this (.updateUserPoolDomainAsync update-user-pool-domain-request))))

(defn admin-set-user-password-async
  "admin-set-user-password-request - `com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminSetUserPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest admin-set-user-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminSetUserPasswordAsync admin-set-user-password-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest admin-set-user-password-request]
    (-> this (.adminSetUserPasswordAsync admin-set-user-password-request))))

(defn get-signing-certificate-async
  "This method takes a user pool ID, and returns the signing certificate.

  get-signing-certificate-request - Request to get a signing certificate from Cognito. - `com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSigningCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest get-signing-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSigningCertificateAsync get-signing-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest get-signing-certificate-request]
    (-> this (.getSigningCertificateAsync get-signing-certificate-request))))

(defn change-password-async
  "Changes the password for a specified user in a user pool.

  change-password-request - Represents the request to change a user password. - `com.amazonaws.services.cognitoidp.model.ChangePasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ChangePassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ChangePasswordResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ChangePasswordRequest change-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changePasswordAsync change-password-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ChangePasswordRequest change-password-request]
    (-> this (.changePasswordAsync change-password-request))))

(defn update-user-pool-client-async
  "Updates the specified user pool app client with the specified attributes. If you don't provide a value for an
   attribute, it will be set to the default value. You can get a list of the current user pool app client settings
   with .

  update-user-pool-client-request - Represents the request to update the user pool client. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserPoolClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest update-user-pool-client-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserPoolClientAsync update-user-pool-client-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest update-user-pool-client-request]
    (-> this (.updateUserPoolClientAsync update-user-pool-client-request))))

(defn get-ui-customization-async
  "Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing
   is set for the particular client, but there is an existing pool level customization (app clientId
   will be ALL), then that is returned. If nothing is present, then an empty shape is returned.

  get-ui-customization-request - `com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUICustomization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetUICustomizationResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest get-ui-customization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUICustomizationAsync get-ui-customization-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest get-ui-customization-request]
    (-> this (.getUICustomizationAsync get-ui-customization-request))))

(defn delete-user-pool-domain-async
  "Deletes a domain for a user pool.

  delete-user-pool-domain-request - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPoolDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest delete-user-pool-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPoolDomainAsync delete-user-pool-domain-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest delete-user-pool-domain-request]
    (-> this (.deleteUserPoolDomainAsync delete-user-pool-domain-request))))

(defn list-users-async
  "Lists the users in the Amazon Cognito user pool.

  list-users-request - Represents the request to list users. - `com.amazonaws.services.cognitoidp.model.ListUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUsersRequest list-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync list-users-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUsersRequest list-users-request]
    (-> this (.listUsersAsync list-users-request))))

(defn list-groups-async
  "Lists the groups associated with a user pool.


   Requires developer credentials.

  list-groups-request - `com.amazonaws.services.cognitoidp.model.ListGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListGroupsRequest list-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync list-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListGroupsRequest list-groups-request]
    (-> this (.listGroupsAsync list-groups-request))))

(defn set-user-pool-mfa-config-async
  "Set the user pool MFA configuration.

  set-user-pool-mfa-config-request - `com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetUserPoolMfaConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest set-user-pool-mfa-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setUserPoolMfaConfigAsync set-user-pool-mfa-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest set-user-pool-mfa-config-request]
    (-> this (.setUserPoolMfaConfigAsync set-user-pool-mfa-config-request))))

(defn delete-group-async
  "Deletes a group. Currently only groups with no members can be deleted.


   Requires developer credentials.

  delete-group-request - `com.amazonaws.services.cognitoidp.model.DeleteGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteGroupRequest delete-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync delete-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroupAsync delete-group-request))))

(defn add-custom-attributes-async
  "Adds additional user attributes to the user pool schema.

  add-custom-attributes-request - Represents the request to add custom attributes. - `com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddCustomAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest add-custom-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addCustomAttributesAsync add-custom-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest add-custom-attributes-request]
    (-> this (.addCustomAttributesAsync add-custom-attributes-request))))

(defn admin-user-global-sign-out-async
  "Signs out users from all devices, as an administrator.


   Requires developer credentials.

  admin-user-global-sign-out-request - The request to sign out of all devices, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminUserGlobalSignOut operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest admin-user-global-sign-out-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminUserGlobalSignOutAsync admin-user-global-sign-out-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest admin-user-global-sign-out-request]
    (-> this (.adminUserGlobalSignOutAsync admin-user-global-sign-out-request))))

(defn tag-resource-async
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

  tag-resource-request - `com.amazonaws.services.cognitoidp.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn delete-identity-provider-async
  "Deletes an identity provider for a user pool.

  delete-identity-provider-request - `com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest delete-identity-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentityProviderAsync delete-identity-provider-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest delete-identity-provider-request]
    (-> this (.deleteIdentityProviderAsync delete-identity-provider-request))))

(defn admin-set-user-settings-async
  "Sets all the user settings for a specified user name. Works on any user.


   Requires developer credentials.

  admin-set-user-settings-request - Represents the request to set user settings as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminSetUserSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult>`"
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest admin-set-user-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminSetUserSettingsAsync admin-set-user-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest admin-set-user-settings-request]
    (-> this (.adminSetUserSettingsAsync admin-set-user-settings-request))))

